package com.onesignal.notifications.internal.generation.impl;

import N9.AbstractC0317a;
import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import N9.p0;
import com.onesignal.common.AndroidUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p076h8.m;
import p123m8.i;
import p123m8.j;
import p210v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements X5.a {
    private final X4.f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final V5.d _dataController;
    private final Y5.c _lifecycleService;
    private final W5.b _notificationDisplayer;
    private final p055f6.a _notificationSummaryManager;
    private final p110l5.a _time;

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.generation.impl.a$a, reason: collision with other inner class name */
    public static final class C0064a extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0064a(p123m8.d<? super C0064a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.markNotificationAsDismissed(null, this);
        }
    }

    public static final class b extends p144o8.c {
        Object L$0;
        Object L$1;
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
            return a.this.postProcessNotification(null, false, false, this);
        }
    }

    public static final class c extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(p123m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processCollapseKey(null, this);
        }
    }

    public static final class d extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(p123m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processHandlerResponse(null, false, false, this);
        }
    }

    public static final class e extends p144o8.c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public e(p123m8.d<? super e> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.processNotificationData(null, 0, null, false, 0L, this);
        }
    }

    public static final class f extends p144o8.g implements p200u8.c {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
        final /* synthetic */ q $wantsToDisplay;
        int label;

        /* JADX INFO: renamed from: com.onesignal.notifications.internal.generation.impl.a$f$a, reason: collision with other inner class name */
        public static final class C0065a extends p144o8.g implements p200u8.c {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.f $notificationReceivedEvent;
            final /* synthetic */ q $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0065a(a aVar, com.onesignal.notifications.internal.f fVar, q qVar, com.onesignal.notifications.internal.c cVar, p123m8.d<? super C0065a> dVar) {
                super(2, dVar);
                this.this$0 = aVar;
                this.$notificationReceivedEvent = fVar;
                this.$wantsToDisplay = qVar;
                this.$notification = cVar;
            }

            @Override // p144o8.a
            public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
                return new C0065a(this.this$0, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, dVar);
            }

            @Override // p200u8.c
            public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
                return ((C0065a) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                q qVar;
                p134n8.a aVar = p134n8.a.f13404s;
                int i10 = this.label;
                if (i10 == 0) {
                    J7.a.v(obj);
                    this.this$0._lifecycleService.externalRemoteNotificationReceived(this.$notificationReceivedEvent);
                    if (this.$notificationReceivedEvent.getDiscard()) {
                        this.$wantsToDisplay.f15463s = false;
                    } else if (this.$notificationReceivedEvent.isPreventDefault()) {
                        q qVar2 = this.$wantsToDisplay;
                        qVar2.f15463s = false;
                        com.onesignal.common.threading.c displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = qVar2;
                        this.label = 1;
                        Object objWaitForWake = displayWaiter.waitForWake(this);
                        if (objWaitForWake == aVar) {
                            return aVar;
                        }
                        qVar = qVar2;
                        obj = objWaitForWake;
                    }
                    return m.a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.L$0;
                J7.a.v(obj);
                qVar.f15463s = ((Boolean) obj).booleanValue();
                return m.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.notifications.internal.f fVar, q qVar, com.onesignal.notifications.internal.c cVar, p123m8.d<? super f> dVar) {
            super(2, dVar);
            this.$notificationReceivedEvent = fVar;
            this.$wantsToDisplay = qVar;
            this.$notification = cVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return a.this.new f(this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((f) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                i iVar = I.f3415c;
                C0065a c0065a = new C0065a(a.this, this.$notificationReceivedEvent, this.$wantsToDisplay, this.$notification, null);
                int i11 = 2 & 1;
                j jVar = j.f13164s;
                if (i11 != 0) {
                    iVar = jVar;
                }
                i iVarG = AbstractC0342z.g(jVar, iVar, true);
                U9.d dVar = I.a;
                if (iVarG != dVar && iVarG.get(p123m8.e.f13163s) == null) {
                    iVarG = iVarG.plus(dVar);
                }
                AbstractC0317a p0Var = new p0(iVarG, true);
                p0Var.Q(1, p0Var, c0065a);
                this.label = 1;
                if (p0Var.E(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return m.a;
        }
    }

    public static final class g extends p144o8.g implements p200u8.c {
        final /* synthetic */ com.onesignal.notifications.internal.c $notification;
        final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
        final /* synthetic */ q $wantsToDisplay;
        int label;

        /* JADX INFO: renamed from: com.onesignal.notifications.internal.generation.impl.a$g$a, reason: collision with other inner class name */
        public static final class C0066a extends p144o8.g implements p200u8.c {
            final /* synthetic */ com.onesignal.notifications.internal.c $notification;
            final /* synthetic */ com.onesignal.notifications.internal.g $notificationWillDisplayEvent;
            final /* synthetic */ q $wantsToDisplay;
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0066a(a aVar, com.onesignal.notifications.internal.g gVar, q qVar, com.onesignal.notifications.internal.c cVar, p123m8.d<? super C0066a> dVar) {
                super(2, dVar);
                this.this$0 = aVar;
                this.$notificationWillDisplayEvent = gVar;
                this.$wantsToDisplay = qVar;
                this.$notification = cVar;
            }

            @Override // p144o8.a
            public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
                return new C0066a(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, dVar);
            }

            @Override // p200u8.c
            public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
                return ((C0066a) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                q qVar;
                p134n8.a aVar = p134n8.a.f13404s;
                int i10 = this.label;
                if (i10 == 0) {
                    J7.a.v(obj);
                    this.this$0._lifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                    if (this.$notificationWillDisplayEvent.getDiscard()) {
                        this.$wantsToDisplay.f15463s = false;
                    } else if (this.$notificationWillDisplayEvent.isPreventDefault()) {
                        q qVar2 = this.$wantsToDisplay;
                        qVar2.f15463s = false;
                        com.onesignal.common.threading.c displayWaiter = this.$notification.getDisplayWaiter();
                        this.L$0 = qVar2;
                        this.label = 1;
                        Object objWaitForWake = displayWaiter.waitForWake(this);
                        if (objWaitForWake == aVar) {
                            return aVar;
                        }
                        qVar = qVar2;
                        obj = objWaitForWake;
                    }
                    return m.a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.L$0;
                J7.a.v(obj);
                qVar.f15463s = ((Boolean) obj).booleanValue();
                return m.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.notifications.internal.g gVar, q qVar, com.onesignal.notifications.internal.c cVar, p123m8.d<? super g> dVar) {
            super(2, dVar);
            this.$notificationWillDisplayEvent = gVar;
            this.$wantsToDisplay = qVar;
            this.$notification = cVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return a.this.new g(this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((g) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                i iVar = I.f3415c;
                C0066a c0066a = new C0066a(a.this, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, null);
                int i11 = 2 & 1;
                j jVar = j.f13164s;
                if (i11 != 0) {
                    iVar = jVar;
                }
                i iVarG = AbstractC0342z.g(jVar, iVar, true);
                U9.d dVar = I.a;
                if (iVarG != dVar && iVarG.get(p123m8.e.f13163s) == null) {
                    iVarG = iVarG.plus(dVar);
                }
                AbstractC0317a p0Var = new p0(iVarG, true);
                p0Var.Q(1, p0Var, c0066a);
                this.label = 1;
                if (p0Var.E(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return m.a;
        }
    }

    public static final class h extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public h(p123m8.d<? super h> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.saveNotification(null, false, this);
        }
    }

    public a(X4.f fVar, W5.b bVar, com.onesignal.core.internal.config.b bVar2, V5.d dVar, p055f6.a aVar, Y5.c cVar, p110l5.a aVar2) {
        p210v8.i.f(fVar, "_applicationService");
        p210v8.i.f(bVar, "_notificationDisplayer");
        p210v8.i.f(bVar2, "_configModelStore");
        p210v8.i.f(dVar, "_dataController");
        p210v8.i.f(aVar, "_notificationSummaryManager");
        p210v8.i.f(cVar, "_lifecycleService");
        p210v8.i.f(aVar2, "_time");
        this._applicationService = fVar;
        this._notificationDisplayer = bVar;
        this._configModelStore = bVar2;
        this._dataController = dVar;
        this._notificationSummaryManager = aVar;
        this._lifecycleService = cVar;
        this._time = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isDuplicateNotification(com.onesignal.notifications.internal.c cVar, p123m8.d<? super Boolean> dVar) {
        return this._dataController.doesNotificationExist(cVar.getNotificationId(), dVar);
    }

    private final boolean isNotificationWithinTTL(com.onesignal.notifications.internal.c cVar) {
        if (((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            return cVar.getSentTime() + ((long) cVar.getTtl()) > this._time.getCurrentTimeMillis() / ((long) 1000);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object markNotificationAsDismissed(U5.d dVar, p123m8.d<? super m> dVar2) {
        C0064a c0064a;
        a aVar;
        if (dVar2 instanceof C0064a) {
            c0064a = (C0064a) dVar2;
            int i10 = c0064a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0064a.label = i10 - Integer.MIN_VALUE;
            } else {
                c0064a = new C0064a(dVar2);
            }
        } else {
            c0064a = new C0064a(dVar2);
        }
        Object objMarkAsDismissed = c0064a.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = c0064a.label;
        m mVar = m.a;
        if (i11 != 0) {
            if (i11 == 1) {
                dVar = (U5.d) c0064a.L$1;
                aVar = (a) c0064a.L$0;
                J7.a.v(objMarkAsDismissed);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(objMarkAsDismissed);
            }
            return mVar;
        }
        J7.a.v(objMarkAsDismissed);
        if (!dVar.isNotificationToDisplay()) {
            return mVar;
        }
        com.onesignal.debug.internal.logging.b.debug$default("Marking restored or disabled notifications as dismissed: " + dVar, null, 2, null);
        V5.d dVar3 = this._dataController;
        int androidId = dVar.getAndroidId();
        c0064a.L$0 = this;
        c0064a.L$1 = dVar;
        c0064a.label = 1;
        objMarkAsDismissed = dVar3.markAsDismissed(androidId, c0064a);
        if (objMarkAsDismissed != aVar2) {
            aVar = this;
        }
        return aVar2;
        if (((Boolean) objMarkAsDismissed).booleanValue()) {
            p055f6.a aVar3 = aVar._notificationSummaryManager;
            int androidId2 = dVar.getAndroidId();
            c0064a.L$0 = null;
            c0064a.L$1 = null;
            c0064a.label = 2;
            if (aVar3.updatePossibleDependentSummaryOnDismiss(androidId2, c0064a) == aVar2) {
                return aVar2;
            }
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object postProcessNotification(U5.d dVar, boolean z6, boolean z10, p123m8.d<? super m> dVar2) {
        b bVar;
        a aVar;
        if (dVar2 instanceof b) {
            bVar = (b) dVar2;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar2);
            }
        } else {
            bVar = new b(dVar2);
        }
        Object obj = bVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = bVar.label;
        m mVar = m.a;
        if (i11 == 0) {
            J7.a.v(obj);
            bVar.L$0 = this;
            bVar.L$1 = dVar;
            bVar.Z$0 = z10;
            bVar.label = 1;
            if (saveNotification(dVar, z6, bVar) != aVar2) {
                aVar = this;
            }
            return aVar2;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                J7.a.v(obj);
                return mVar;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return mVar;
        }
        z10 = bVar.Z$0;
        dVar = (U5.d) bVar.L$1;
        aVar = (a) bVar.L$0;
        J7.a.v(obj);
        if (z10) {
            Y5.c cVar = aVar._lifecycleService;
            bVar.L$0 = null;
            bVar.L$1 = null;
            bVar.label = 3;
            if (cVar.notificationReceived(dVar, bVar) != aVar2) {
                return mVar;
            }
        } else {
            bVar.L$0 = null;
            bVar.L$1 = null;
            bVar.label = 2;
            if (aVar.markNotificationAsDismissed(dVar, bVar) != aVar2) {
                return mVar;
            }
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object processCollapseKey(U5.d dVar, p123m8.d<? super m> dVar2) {
        c cVar;
        if (dVar2 instanceof c) {
            cVar = (c) dVar2;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar2);
            }
        } else {
            cVar = new c(dVar2);
        }
        Object androidIdFromCollapseKey = cVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = cVar.label;
        m mVar = m.a;
        if (i11 == 0) {
            J7.a.v(androidIdFromCollapseKey);
            if (!dVar.isRestoring() && dVar.getJsonPayload().has("collapse_key") && !"do_not_collapse".equals(dVar.getJsonPayload().optString("collapse_key"))) {
                String strOptString = dVar.getJsonPayload().optString("collapse_key");
                V5.d dVar3 = this._dataController;
                p210v8.i.e(strOptString, "collapseId");
                cVar.L$0 = dVar;
                cVar.label = 1;
                androidIdFromCollapseKey = dVar3.getAndroidIdFromCollapseKey(strOptString, cVar);
                if (androidIdFromCollapseKey == aVar) {
                    return aVar;
                }
            }
            return mVar;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (U5.d) cVar.L$0;
        J7.a.v(androidIdFromCollapseKey);
        Integer num = (Integer) androidIdFromCollapseKey;
        if (num != null) {
            dVar.getNotification().setAndroidNotificationId(num.intValue());
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object processHandlerResponse(U5.d dVar, boolean z6, boolean z10, p123m8.d<? super Boolean> dVar2) {
        d dVar3;
        a aVar;
        if (dVar2 instanceof d) {
            dVar3 = (d) dVar2;
            int i10 = dVar3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar3.label = i10 - Integer.MIN_VALUE;
            } else {
                dVar3 = new d(dVar2);
            }
        } else {
            dVar3 = new d(dVar2);
        }
        Object obj = dVar3.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = dVar3.label;
        if (i11 == 0) {
            J7.a.v(obj);
            if (z6) {
                boolean zIsStringNotEmpty = AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getNotification().getBody());
                boolean zIsNotificationWithinTTL = isNotificationWithinTTL(dVar.getNotification());
                if (zIsStringNotEmpty && zIsNotificationWithinTTL) {
                    dVar3.L$0 = this;
                    dVar3.L$1 = dVar;
                    dVar3.label = 1;
                    if (processCollapseKey(dVar, dVar3) != aVar2) {
                        aVar = this;
                    }
                } else if (z10) {
                    dVar3.label = 2;
                    if (markNotificationAsDismissed(dVar, dVar3) == aVar2) {
                        return null;
                    }
                } else {
                    dVar.setNotificationToDisplay(false);
                    dVar3.label = 3;
                    if (postProcessNotification(dVar, true, false, dVar3) == aVar2) {
                        return null;
                    }
                }
            } else if (z10) {
                dVar3.label = 2;
                if (markNotificationAsDismissed(dVar, dVar3) == aVar2) {
                    return null;
                }
            } else {
                dVar.setNotificationToDisplay(false);
                dVar3.label = 3;
                if (postProcessNotification(dVar, true, false, dVar3) == aVar2) {
                    return null;
                }
            }
            return aVar2;
        }
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return null;
        }
        dVar = (U5.d) dVar3.L$1;
        aVar = (a) dVar3.L$0;
        J7.a.v(obj);
        if (!aVar.shouldDisplayNotification(dVar)) {
            return Boolean.FALSE;
        }
        dVar.setNotificationToDisplay(true);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object saveNotification(U5.d dVar, boolean z6, p123m8.d<? super m> dVar2) {
        h hVar;
        if (dVar2 instanceof h) {
            hVar = (h) dVar2;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar2);
            }
        } else {
            hVar = new h(dVar2);
        }
        Object obj = hVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = hVar.label;
        try {
            if (i11 == 0) {
                J7.a.v(obj);
                com.onesignal.debug.internal.logging.b.debug$default("Saving Notification job: " + dVar, null, 2, null);
                JSONObject jsonPayload = dVar.getJsonPayload();
                JSONObject customJSONObject = getCustomJSONObject(jsonPayload);
                String strOptString = (!jsonPayload.has("collapse_key") || "do_not_collapse".equals(jsonPayload.optString("collapse_key"))) ? null : jsonPayload.optString("collapse_key");
                long jOptLong = (jsonPayload.optLong("google.sent_time", this._time.getCurrentTimeMillis()) / 1000) + ((long) jsonPayload.optInt("google.ttl", 259200));
                V5.d dVar3 = this._dataController;
                String strOptString2 = customJSONObject.optString("i");
                p210v8.i.e(strOptString2, "customJSON.optString(\"i\")");
                String strSafeString = com.onesignal.common.e.safeString(jsonPayload, "grp");
                boolean zIsNotificationToDisplay = dVar.isNotificationToDisplay();
                int androidId = dVar.getAndroidId();
                String strValueOf = dVar.getTitle() != null ? String.valueOf(dVar.getTitle()) : null;
                String strValueOf2 = dVar.getBody() != null ? String.valueOf(dVar.getBody()) : null;
                String string = jsonPayload.toString();
                p210v8.i.e(string, "jsonPayload.toString()");
                hVar.label = 1;
                if (dVar3.createNotification(strOptString2, strSafeString, strOptString, zIsNotificationToDisplay, z6, androidId, strValueOf, strValueOf2, jOptLong, string, hVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return m.a;
    }

    private final boolean shouldDisplayNotification(U5.d dVar) {
        return dVar.hasExtender() || AndroidUtils.INSTANCE.isStringNotEmpty(dVar.getJsonPayload().optString("alert"));
    }

    private final boolean shouldFireForegroundHandlers(U5.d dVar) {
        if (!this._applicationService.isInForeground()) {
            com.onesignal.debug.internal.logging.b.info$default("App is in background, show notification", null, 2, null);
            return false;
        }
        if (!dVar.isRestoring()) {
            return true;
        }
        com.onesignal.debug.internal.logging.b.info$default("Not firing notificationWillShowInForegroundHandler for restored notifications", null, 2, null);
        return false;
    }

    public final JSONObject getCustomJSONObject(JSONObject jSONObject) throws JSONException {
        p210v8.i.f(jSONObject, "jsonObject");
        return new JSONObject(jSONObject.optString(U5.c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:128:0x030a  */
    /* JADX WARN: Code duplicated, block: B:129:0x030e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0315 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0317  */
    /* JADX WARN: Code duplicated, block: B:135:0x031a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x0335  */
    /* JADX WARN: Code duplicated, block: B:143:0x0349 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0133  */
    /* JADX WARN: Code duplicated, block: B:44:0x013c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0153  */
    /* JADX WARN: Code duplicated, block: B:51:0x015f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x0224  */
    /* JADX WARN: Code duplicated, block: B:87:0x022e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0234  */
    /* JADX WARN: Code duplicated, block: B:91:0x023a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0273  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02d0, code lost:
    
        if (r9 == r4) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object processNotificationData(android.content.Context r24, int r25, org.json.JSONObject r26, boolean r27, long r28, p123m8.d<? super p076h8.m> r30) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.generation.impl.a.processNotificationData(android.content.Context, int, org.json.JSONObject, boolean, long, m8.d):java.lang.Object");
    }
}
