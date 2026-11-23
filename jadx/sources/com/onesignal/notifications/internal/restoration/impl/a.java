package com.onesignal.notifications.internal.restoration.impl;

import N9.AbstractC0342z;
import V5.d;
import X4.f;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p076h8.m;
import p144o8.c;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p044e6.b {
    public static final C0075a Companion = new C0075a(null);
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final f _applicationService;
    private final N5.a _badgeCountUpdater;
    private final d _dataController;
    private final X5.b _workManager;

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.restoration.impl.a$a, reason: collision with other inner class name */
    public static final class C0075a {
        public /* synthetic */ C0075a(e eVar) {
            this();
        }

        private C0075a() {
        }
    }

    public static final class b extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.process(this);
        }
    }

    public a(f fVar, X5.b bVar, d dVar, N5.a aVar) {
        i.f(fVar, "_applicationService");
        i.f(bVar, "_workManager");
        i.f(dVar, "_dataController");
        i.f(aVar, "_badgeCountUpdater");
        this._applicationService = fVar;
        this._workManager = bVar;
        this._dataController = dVar;
        this._badgeCountUpdater = aVar;
    }

    private final List<Integer> getVisibleNotifications() {
        StatusBarNotification[] activeNotifications = U5.e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
        if (activeNotifications.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:28:0x0067, B:30:0x006d, B:33:0x0082, B:20:0x0040, B:27:0x005f, B:23:0x004d), top: B:38:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:28:0x0067->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p044e6.b
    public Object process(p123m8.d<? super m> dVar) {
        b bVar;
        a aVar;
        a aVar2;
        Iterator it;
        V5.c cVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objListNotificationsForOutstanding = bVar.result;
        p134n8.a aVar3 = p134n8.a.f13404s;
        int i11 = bVar.label;
        try {
            if (i11 == 0) {
                J7.a.v(objListNotificationsForOutstanding);
                com.onesignal.debug.internal.logging.b.info$default("Restoring notifications", null, 2, null);
                List<Integer> visibleNotifications = getVisibleNotifications();
                d dVar2 = this._dataController;
                bVar.L$0 = this;
                bVar.label = 1;
                objListNotificationsForOutstanding = dVar2.listNotificationsForOutstanding(visibleNotifications, bVar);
                if (objListNotificationsForOutstanding != aVar3) {
                    aVar = this;
                }
                return aVar3;
            }
            if (i11 == 1) {
                aVar = (a) bVar.L$0;
                J7.a.v(objListNotificationsForOutstanding);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.L$1;
                aVar2 = (a) bVar.L$0;
                J7.a.v(objListNotificationsForOutstanding);
            }
            while (it.hasNext()) {
                cVar = (V5.c) it.next();
                bVar.L$0 = aVar2;
                bVar.L$1 = it;
                bVar.label = 2;
                if (aVar2.processNotification(cVar, DELAY_BETWEEN_NOTIFICATION_RESTORES_MS, bVar) == aVar3) {
                    return aVar3;
                }
            }
            aVar2._badgeCountUpdater.update();
            return m.a;
            aVar2 = aVar;
            it = ((List) objListNotificationsForOutstanding).iterator();
            while (it.hasNext()) {
                cVar = (V5.c) it.next();
                bVar.L$0 = aVar2;
                bVar.L$1 = it;
                bVar.label = 2;
                if (aVar2.processNotification(cVar, DELAY_BETWEEN_NOTIFICATION_RESTORES_MS, bVar) == aVar3) {
                    return aVar3;
                }
            }
            aVar2._badgeCountUpdater.update();
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.error("Error restoring notification records! ", th);
        }
        return m.a;
    }

    @Override // p044e6.b
    public Object processNotification(V5.c cVar, int i10, p123m8.d<? super m> dVar) {
        Object objE;
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), cVar.getId(), cVar.getAndroidId(), new JSONObject(cVar.getFullData()), cVar.getCreatedAt(), true, false);
        return (i10 <= 0 || (objE = AbstractC0342z.e((long) i10, dVar)) != p134n8.a.f13404s) ? m.a : objE;
    }
}
