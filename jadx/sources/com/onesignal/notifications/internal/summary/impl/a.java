package com.onesignal.notifications.internal.summary.impl;

import U5.e;
import X4.f;
import android.app.NotificationManager;
import java.util.Iterator;
import java.util.List;
import p076h8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p055f6.a {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final V5.d _dataController;
    private final p044e6.b _notificationRestoreProcessor;
    private final W5.c _summaryNotificationDisplayer;
    private final p110l5.a _time;

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.summary.impl.a$a, reason: collision with other inner class name */
    public static final class C0076a extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0076a(p123m8.d<? super C0076a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.clearNotificationOnSummaryClick(null, this);
        }
    }

    public static final class b extends p144o8.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.internalUpdateSummaryNotificationAfterChildRemoved(null, false, this);
        }
    }

    public static final class c extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public c(p123m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.restoreSummary(null, this);
        }
    }

    public static final class d extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(p123m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updatePossibleDependentSummaryOnDismiss(0, this);
        }
    }

    public a(f fVar, V5.d dVar, W5.c cVar, com.onesignal.core.internal.config.b bVar, p044e6.b bVar2, p110l5.a aVar) {
        i.f(fVar, "_applicationService");
        i.f(dVar, "_dataController");
        i.f(cVar, "_summaryNotificationDisplayer");
        i.f(bVar, "_configModelStore");
        i.f(bVar2, "_notificationRestoreProcessor");
        i.f(aVar, "_time");
        this._applicationService = fVar;
        this._dataController = dVar;
        this._summaryNotificationDisplayer = cVar;
        this._configModelStore = bVar;
        this._notificationRestoreProcessor = bVar2;
        this._time = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0 A[Catch: JSONException -> 0x0038, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0038, blocks: (B:16:0x0033, B:47:0x00f0), top: B:53:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
    
        if (r13.updateSummaryNotification(r15, r6) == r0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object internalUpdateSummaryNotificationAfterChildRemoved(java.lang.String r13, boolean r14, p123m8.d<? super p076h8.m> r15) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.summary.impl.a.internalUpdateSummaryNotificationAfterChildRemoved(java.lang.String, boolean, m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:22:0x005c->B:31:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object restoreSummary(String str, p123m8.d<? super m> dVar) {
        c cVar;
        a aVar;
        a aVar2;
        Iterator it;
        c cVar2;
        V5.c cVar3;
        p044e6.b bVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objListNotificationsForGroup = cVar.result;
        p134n8.a aVar3 = p134n8.a.f13404s;
        int i11 = cVar.label;
        if (i11 == 0) {
            J7.a.v(objListNotificationsForGroup);
            V5.d dVar2 = this._dataController;
            cVar.L$0 = this;
            cVar.label = 1;
            objListNotificationsForGroup = dVar2.listNotificationsForGroup(str, cVar);
            if (objListNotificationsForGroup != aVar3) {
                aVar = this;
            }
            return aVar3;
        }
        if (i11 == 1) {
            aVar = (a) cVar.L$0;
            J7.a.v(objListNotificationsForGroup);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) cVar.L$1;
            aVar2 = (a) cVar.L$0;
            J7.a.v(objListNotificationsForGroup);
        }
        cVar2 = cVar;
        while (it.hasNext()) {
            cVar3 = (V5.c) it.next();
            bVar = aVar2._notificationRestoreProcessor;
            cVar2.L$0 = aVar2;
            cVar2.L$1 = it;
            cVar2.label = 2;
            if (p044e6.a.processNotification$default(bVar, cVar3, 0, cVar2, 2, null) == aVar3) {
                return aVar3;
            }
        }
        return m.a;
        aVar2 = aVar;
        it = ((List) objListNotificationsForGroup).iterator();
        cVar2 = cVar;
        while (it.hasNext()) {
            cVar3 = (V5.c) it.next();
            bVar = aVar2._notificationRestoreProcessor;
            cVar2.L$0 = aVar2;
            cVar2.L$1 = it;
            cVar2.label = 2;
            if (p044e6.a.processNotification$default(bVar, cVar3, 0, cVar2, 2, null) == aVar3) {
                return aVar3;
            }
        }
        return m.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p055f6.a
    public Object clearNotificationOnSummaryClick(String str, p123m8.d<? super m> dVar) {
        C0076a c0076a;
        NotificationManager notificationManager;
        Object androidIdForGroup;
        a aVar;
        NotificationManager notificationManager2;
        Integer num;
        if (dVar instanceof C0076a) {
            c0076a = (C0076a) dVar;
            int i10 = c0076a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0076a.label = i10 - Integer.MIN_VALUE;
            } else {
                c0076a = new C0076a(dVar);
            }
        } else {
            c0076a = new C0076a(dVar);
        }
        Object obj = c0076a.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = c0076a.label;
        m mVar = m.a;
        if (i11 == 0) {
            J7.a.v(obj);
            notificationManager = e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
            V5.d dVar2 = this._dataController;
            c0076a.L$0 = this;
            c0076a.L$1 = str;
            c0076a.L$2 = notificationManager;
            c0076a.label = 1;
            androidIdForGroup = dVar2.getAndroidIdForGroup(str, false, c0076a);
            if (androidIdForGroup != aVar2) {
                aVar = this;
            }
            return aVar2;
        }
        if (i11 == 1) {
            NotificationManager notificationManager3 = (NotificationManager) c0076a.L$2;
            String str2 = (String) c0076a.L$1;
            aVar = (a) c0076a.L$0;
            J7.a.v(obj);
            notificationManager = notificationManager3;
            str = str2;
            androidIdForGroup = obj;
        } else if (i11 == 2) {
            notificationManager2 = (NotificationManager) c0076a.L$0;
            J7.a.v(obj);
            Integer num2 = (Integer) obj;
            notificationManager = notificationManager2;
            num = num2;
            if (num != null) {
                notificationManager.cancel(num.intValue());
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
        }
        return mVar;
        Integer num3 = (Integer) androidIdForGroup;
        if (num3 != null) {
            if (((com.onesignal.core.internal.config.a) aVar._configModelStore.getModel()).getClearGroupOnSummaryClick()) {
                if (i.a(str, e.GROUPLESS_SUMMARY_KEY)) {
                    num = new Integer(e.GROUPLESS_SUMMARY_ID);
                } else {
                    V5.d dVar3 = aVar._dataController;
                    c0076a.L$0 = notificationManager;
                    c0076a.L$1 = null;
                    c0076a.L$2 = null;
                    c0076a.label = 2;
                    Object androidIdForGroup2 = dVar3.getAndroidIdForGroup(str, true, c0076a);
                    if (androidIdForGroup2 != aVar2) {
                        NotificationManager notificationManager4 = notificationManager;
                        obj = androidIdForGroup2;
                        notificationManager2 = notificationManager4;
                        Integer num4 = (Integer) obj;
                        notificationManager = notificationManager2;
                        num = num4;
                    }
                }
                if (num != null) {
                    notificationManager.cancel(num.intValue());
                }
            } else {
                V5.d dVar4 = aVar._dataController;
                int iIntValue = num3.intValue();
                c0076a.L$0 = null;
                c0076a.L$1 = null;
                c0076a.L$2 = null;
                c0076a.label = 3;
                if (dVar4.markAsDismissed(iIntValue, c0076a) == aVar2) {
                }
            }
            return aVar2;
        }
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p055f6.a
    public Object updatePossibleDependentSummaryOnDismiss(int i10, p123m8.d<? super m> dVar) {
        d dVar2;
        a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i11 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object groupId = dVar2.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i12 = dVar2.label;
        m mVar = m.a;
        if (i12 != 0) {
            if (i12 == 1) {
                aVar = (a) dVar2.L$0;
                J7.a.v(groupId);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(groupId);
            }
            return mVar;
        }
        J7.a.v(groupId);
        V5.d dVar3 = this._dataController;
        dVar2.L$0 = this;
        dVar2.label = 1;
        groupId = dVar3.getGroupId(i10, dVar2);
        if (groupId != aVar2) {
            aVar = this;
        }
        return aVar2;
        String str = (String) groupId;
        if (str != null) {
            dVar2.L$0 = null;
            dVar2.label = 2;
            if (aVar.internalUpdateSummaryNotificationAfterChildRemoved(str, true, dVar2) == aVar2) {
                return aVar2;
            }
        }
        return mVar;
    }

    @Override // p055f6.a
    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z6, p123m8.d<? super m> dVar) {
        Object objInternalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z6, dVar);
        return objInternalUpdateSummaryNotificationAfterChildRemoved == p134n8.a.f13404s ? objInternalUpdateSummaryNotificationAfterChildRemoved : m.a;
    }
}
