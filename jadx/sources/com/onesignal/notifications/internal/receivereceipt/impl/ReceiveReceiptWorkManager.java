package com.onesignal.notifications.internal.receivereceipt.impl;

import U5.h;
import X4.f;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.common.AndroidUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p026c6.b;
import p050f1.g;
import p050f1.o;
import p050f1.r;
import p050f1.w;
import p061g1.j;
import p086i8.k;
import p086i8.u;
import p123m8.d;
import p144o8.c;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class ReceiveReceiptWorkManager implements b {
    public static final a Companion = new a(null);
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p208v6.b _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/onesignal/notifications/internal/receivereceipt/impl/ReceiveReceiptWorkManager$ReceiveReceiptWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lf1/o;", "doWork", "(Lm8/d;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ReceiveReceiptWorker extends CoroutineWorker {

        public static final class a extends c {
            int label;
            /* synthetic */ Object result;

            public a(d<? super a> dVar) {
                super(dVar);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return ReceiveReceiptWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            i.f(context, "context");
            i.f(workerParameters, "workerParams");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.work.CoroutineWorker
        public Object doWork(d<? super o> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.result;
            p134n8.a aVar2 = p134n8.a.f13404s;
            int i11 = aVar.label;
            if (i11 == 0) {
                J7.a.v(obj);
                Context applicationContext = getApplicationContext();
                i.e(applicationContext, "applicationContext");
                if (!P4.d.b(applicationContext)) {
                    return o.a();
                }
                String strB = getInputData().b(ReceiveReceiptWorkManager.OS_NOTIFICATION_ID);
                i.c(strB);
                String strB2 = getInputData().b(ReceiveReceiptWorkManager.OS_APP_ID);
                i.c(strB2);
                String strB3 = getInputData().b(ReceiveReceiptWorkManager.OS_SUBSCRIPTION_ID);
                i.c(strB3);
                p026c6.a aVar3 = (p026c6.a) P4.d.a().getService(p026c6.a.class);
                aVar.label = 1;
                if (aVar3.sendReceiveReceipt(strB2, strB3, strB, aVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return o.a();
        }
    }

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public ReceiveReceiptWorkManager(f fVar, com.onesignal.core.internal.config.b bVar, p208v6.b bVar2) {
        i.f(fVar, "_applicationService");
        i.f(bVar, "_configModelStore");
        i.f(bVar2, "_subscriptionManager");
        this._applicationService = fVar;
        this._configModelStore = bVar;
        this._subscriptionManager = bVar2;
        this.maxDelay = 25;
    }

    private final p050f1.d buildConstraints() {
        return new p050f1.d(2, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? k.w0(new LinkedHashSet()) : u.f12330s);
    }

    @Override // p026c6.b
    public void enqueueReceiveReceipt(String str) throws Throwable {
        i.f(str, "notificationId");
        if (!((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getReceiveReceiptEnabled()) {
            com.onesignal.debug.internal.logging.b.debug$default("sendReceiveReceipt disabled", null, 2, null);
            return;
        }
        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        if (id.length() == 0 || appId.length() == 0) {
            com.onesignal.debug.internal.logging.b.debug$default("ReceiveReceiptWorkManager: No push subscription or appId!", null, 2, null);
        }
        int randomDelay = AndroidUtils.INSTANCE.getRandomDelay(this.minDelay, this.maxDelay);
        HashMap map = new HashMap();
        map.put(OS_NOTIFICATION_ID, str);
        map.put(OS_APP_ID, appId);
        map.put(OS_SUBSCRIPTION_ID, id);
        g gVar = new g(map);
        g.c(gVar);
        p050f1.d dVarBuildConstraints = buildConstraints();
        Y1.c cVar = new Y1.c(ReceiveReceiptWorker.class);
        i.f(dVarBuildConstraints, "constraints");
        ((o1.o) cVar.f5671u).j = dVarBuildConstraints;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        cVar.N(randomDelay);
        ((o1.o) cVar.f5671u).f13649e = gVar;
        r rVarK = cVar.k();
        com.onesignal.debug.internal.logging.b.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + str + " and delay: " + randomDelay + " seconds", null, 2, null);
        w hVar = h.INSTANCE.getInstance(this._applicationService.getAppContext());
        String strConcat = str.concat("_receive_receipt");
        hVar.getClass();
        new j((p061g1.o) hVar, strConcat, Collections.singletonList(rVarK)).s();
    }
}
