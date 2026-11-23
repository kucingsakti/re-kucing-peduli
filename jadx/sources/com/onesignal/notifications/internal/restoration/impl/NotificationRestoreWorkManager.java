package com.onesignal.notifications.internal.restoration.impl;

import U5.e;
import U5.h;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p044e6.b;
import p044e6.c;
import p050f1.l;
import p050f1.o;
import p050f1.r;
import p050f1.w;
import p061g1.j;
import p123m8.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationRestoreWorkManager implements c {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private boolean restored;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/onesignal/notifications/internal/restoration/impl/NotificationRestoreWorkManager$NotificationRestoreWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lf1/o;", "doWork", "(Lm8/d;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NotificationRestoreWorker extends CoroutineWorker {

        public static final class a extends p144o8.c {
            int label;
            /* synthetic */ Object result;

            public a(d<? super a> dVar) {
                super(dVar);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationRestoreWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
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
                if (!e.areNotificationsEnabled$default(e.INSTANCE, applicationContext, null, 2, null)) {
                    return new l();
                }
                b bVar = (b) P4.d.a().getService(b.class);
                aVar.label = 1;
                if (bVar.process(aVar) == aVar2) {
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
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    @Override // p044e6.c
    public void beginEnqueueingWork(Context context, boolean z6) {
        i.f(context, "context");
        synchronized (Boolean.valueOf(this.restored)) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            int i10 = z6 ? 15 : 0;
            Y1.c cVar = new Y1.c(NotificationRestoreWorker.class);
            long j = i10;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.N(j);
            r rVarK = cVar.k();
            w hVar = h.INSTANCE.getInstance(context);
            String str = NOTIFICATION_RESTORE_WORKER_IDENTIFIER;
            hVar.getClass();
            new j((p061g1.o) hVar, str, Collections.singletonList(rVarK)).s();
        }
    }
}
