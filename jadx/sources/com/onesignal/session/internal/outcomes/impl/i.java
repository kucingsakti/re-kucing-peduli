package com.onesignal.session.internal.outcomes.impl;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.onesignal.common.exceptions.BackendException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j6.b, p100k5.b, p111l6.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p025c5.c _deviceService;
    private final p162q6.b _identityModelStore;
    private final p075h6.a _influenceManager;
    private final com.onesignal.session.internal.outcomes.impl.b _outcomeEventsBackend;
    private final com.onesignal.session.internal.outcomes.impl.d _outcomeEventsCache;
    private final com.onesignal.session.internal.outcomes.impl.c _outcomeEventsPreferences;
    private final p111l6.b _session;
    private final p208v6.b _subscriptionManager;
    private final p110l5.a _time;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    public static final class a extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public a(p123m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.getUniqueIds(null, null, this);
        }
    }

    public static final class b extends p144o8.g implements p200u8.b {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, p123m8.d<? super b> dVar) {
            super(1, dVar);
            this.$eventParams = fVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return i.this.new b(this.$eventParams, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                com.onesignal.session.internal.outcomes.impl.d dVar = i.this._outcomeEventsCache;
                com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
                this.label = 1;
                if (dVar.saveUniqueOutcomeEventParams(fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return p076h8.m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((b) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public static final class c extends p144o8.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(p123m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendAndCreateOutcomeEvent(null, 0.0f, 0L, null, this);
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
            return i.this.sendSavedOutcomeEvent(null, this);
        }
    }

    public static final class e extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public e(p123m8.d<? super e> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomes(this);
        }
    }

    public static final class f extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public f(p123m8.d<? super f> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendUniqueOutcomeEvent(null, null, this);
        }
    }

    public static final class g extends p144o8.g implements p200u8.b {
        int label;

        public g(p123m8.d<? super g> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return i.this.new g(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r5.cleanCachedUniqueOutcomeEventNotifications(r4) == r0) goto L15;
         */
        @Override // p144o8.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                n8.a r0 = p134n8.a.f13404s
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                J7.a.v(r5)
                goto L39
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                J7.a.v(r5)
                goto L2a
            L1c:
                J7.a.v(r5)
                com.onesignal.session.internal.outcomes.impl.i r5 = com.onesignal.session.internal.outcomes.impl.i.this
                r4.label = r3
                java.lang.Object r5 = com.onesignal.session.internal.outcomes.impl.i.access$sendSavedOutcomes(r5, r4)
                if (r5 != r0) goto L2a
                goto L38
            L2a:
                com.onesignal.session.internal.outcomes.impl.i r5 = com.onesignal.session.internal.outcomes.impl.i.this
                com.onesignal.session.internal.outcomes.impl.d r5 = com.onesignal.session.internal.outcomes.impl.i.access$get_outcomeEventsCache$p(r5)
                r4.label = r2
                java.lang.Object r5 = r5.cleanCachedUniqueOutcomeEventNotifications(r4)
                if (r5 != r0) goto L39
            L38:
                return r0
            L39:
                h8.m r5 = p076h8.m.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.i.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((g) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public i(p111l6.b bVar, p075h6.a aVar, com.onesignal.session.internal.outcomes.impl.d dVar, com.onesignal.session.internal.outcomes.impl.c cVar, com.onesignal.session.internal.outcomes.impl.b bVar2, com.onesignal.core.internal.config.b bVar3, p162q6.b bVar4, p208v6.b bVar5, p025c5.c cVar2, p110l5.a aVar2) {
        p210v8.i.f(bVar, "_session");
        p210v8.i.f(aVar, "_influenceManager");
        p210v8.i.f(dVar, "_outcomeEventsCache");
        p210v8.i.f(cVar, "_outcomeEventsPreferences");
        p210v8.i.f(bVar2, "_outcomeEventsBackend");
        p210v8.i.f(bVar3, "_configModelStore");
        p210v8.i.f(bVar4, "_identityModelStore");
        p210v8.i.f(bVar5, "_subscriptionManager");
        p210v8.i.f(cVar2, "_deviceService");
        p210v8.i.f(aVar2, "_time");
        this._session = bVar;
        this._influenceManager = aVar;
        this._outcomeEventsCache = dVar;
        this._outcomeEventsPreferences = cVar;
        this._outcomeEventsBackend = bVar2;
        this._configModelStore = bVar3;
        this._identityModelStore = bVar4;
        this._subscriptionManager = bVar5;
        this._deviceService = cVar2;
        this._time = aVar2;
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        Set<String> unattributedUniqueOutcomeEventsSentByChannel = cVar.getUnattributedUniqueOutcomeEventsSentByChannel();
        this.unattributedUniqueOutcomeEventsSentOnSession = unattributedUniqueOutcomeEventsSentByChannel != null ? p086i8.k.v0(unattributedUniqueOutcomeEventsSentByChannel) : new LinkedHashSet<>();
        bVar.subscribe(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getUniqueIds(String str, List<p075h6.b> list, p123m8.d<? super List<p075h6.b>> dVar) {
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
        Object notCachedUniqueInfluencesForOutcome = aVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = aVar.label;
        if (i11 == 0) {
            J7.a.v(notCachedUniqueInfluencesForOutcome);
            com.onesignal.session.internal.outcomes.impl.d dVar2 = this._outcomeEventsCache;
            aVar.label = 1;
            notCachedUniqueInfluencesForOutcome = dVar2.getNotCachedUniqueInfluencesForOutcome(str, list, aVar);
            if (notCachedUniqueInfluencesForOutcome == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(notCachedUniqueInfluencesForOutcome);
        }
        List list2 = (List) notCachedUniqueInfluencesForOutcome;
        if (list2.isEmpty()) {
            return null;
        }
        return list2;
    }

    private final List<p075h6.b> removeDisabledInfluences(List<p075h6.b> list) {
        ArrayList arrayListT0 = p086i8.k.t0(list);
        for (p075h6.b bVar : list) {
            if (bVar.getInfluenceType().isDisabled()) {
                com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + bVar.getInfluenceChannel(), null, 2, null);
                arrayListT0.remove(bVar);
            }
        }
        return arrayListT0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestMeasureOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, p123m8.d<? super p076h8.m> dVar) throws BackendException {
        Boolean bool;
        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        String value = p132n6.j.Companion.fromDeviceType(this._deviceService.getDeviceType()).getValue();
        if (id.length() == 0 || value.length() == 0) {
            throw new BackendException(0, null, null, 6, null);
        }
        com.onesignal.session.internal.outcomes.impl.e eVarFromOutcomeEventParamstoOutcomeEvent = com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
        int i10 = h.$EnumSwitchMapping$0[eVarFromOutcomeEventParamstoOutcomeEvent.getSession().ordinal()];
        if (i10 != 1) {
            bool = i10 != 2 ? null : Boolean.FALSE;
        } else {
            bool = Boolean.TRUE;
        }
        Object objSendOutcomeEvent = this._outcomeEventsBackend.sendOutcomeEvent(appId, ((p162q6.a) this._identityModelStore.getModel()).getOnesignalId(), id, value, bool, eVarFromOutcomeEventParamstoOutcomeEvent, dVar);
        return objSendOutcomeEvent == p134n8.a.f13404s ? objSendOutcomeEvent : p076h8.m.a;
    }

    private final void saveAttributedUniqueOutcomeNotifications(com.onesignal.session.internal.outcomes.impl.f fVar) {
        com.onesignal.common.threading.a.suspendifyOnThread(10, new b(fVar, null));
    }

    private final void saveUnattributedUniqueOutcomeEvents() {
        this._outcomeEventsPreferences.setUnattributedUniqueOutcomeEventsSentByChannel(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private final void saveUniqueOutcome(com.onesignal.session.internal.outcomes.impl.f fVar) {
        if (fVar.isUnattributed()) {
            saveUnattributedUniqueOutcomeEvents();
        } else {
            saveAttributedUniqueOutcomeNotifications(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x0139 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object sendAndCreateOutcomeEvent(String str, float f10, long j, List<p075h6.b> list, p123m8.d<? super com.onesignal.session.internal.outcomes.impl.e> dVar) {
        c cVar;
        String str2;
        long j10;
        com.onesignal.session.internal.outcomes.impl.f fVar;
        i iVar;
        String str3;
        com.onesignal.session.internal.outcomes.impl.d dVar2;
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
        Object obj = cVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = cVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            long currentTimeMillis = this._time.getCurrentTimeMillis() / ((long) 1000);
            boolean z6 = false;
            n sourceChannelIds = null;
            n sourceChannelIds2 = null;
            for (p075h6.b bVar : list) {
                int i12 = h.$EnumSwitchMapping$0[bVar.getInfluenceType().ordinal()];
                if (i12 == 1) {
                    if (sourceChannelIds == null) {
                        sourceChannelIds = new n(null, null, 3, null);
                    }
                    sourceChannelIds = setSourceChannelIds(bVar, sourceChannelIds);
                } else if (i12 == 2) {
                    if (sourceChannelIds2 == null) {
                        sourceChannelIds2 = new n(null, null, 3, null);
                    }
                    sourceChannelIds2 = setSourceChannelIds(bVar, sourceChannelIds2);
                } else if (i12 == 3) {
                    z6 = true;
                } else if (i12 == 4) {
                    com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: " + bVar.getInfluenceChannel(), null, 2, null);
                }
            }
            if (sourceChannelIds == null && sourceChannelIds2 == null && !z6) {
                com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels", null, 2, null);
                return null;
            }
            com.onesignal.session.internal.outcomes.impl.f fVar2 = new com.onesignal.session.internal.outcomes.impl.f(str, new m(sourceChannelIds, sourceChannelIds2), f10, j, 0L);
            try {
                cVar.L$0 = this;
                str2 = str;
                try {
                    cVar.L$1 = str2;
                    cVar.L$2 = fVar2;
                    cVar.J$0 = currentTimeMillis;
                    cVar.label = 1;
                    if (requestMeasureOutcomeEvent(fVar2, cVar) != aVar) {
                        j10 = currentTimeMillis;
                        fVar = fVar2;
                        str3 = str2;
                        iVar = this;
                    }
                } catch (BackendException e10) {
                    e = e10;
                    j10 = currentTimeMillis;
                    fVar = fVar2;
                    iVar = this;
                    StringBuilder sbM = AbstractC0487g.m("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: ", str2, " failed with status code: ");
                    sbM.append(e.getStatusCode());
                    sbM.append(" and response: ");
                    sbM.append(e.getResponse());
                    sbM.append("\nOutcome event was cached and will be reattempted on app cold start");
                    com.onesignal.debug.internal.logging.b.warn$default(sbM.toString(), null, 2, null);
                    fVar.setTimestamp(j10);
                    dVar2 = iVar._outcomeEventsCache;
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 2;
                    if (dVar2.saveOutcomeEvent(fVar, cVar) != aVar) {
                        return null;
                    }
                }
            } catch (BackendException e11) {
                e = e11;
                str2 = str;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return null;
        }
        j10 = cVar.J$0;
        fVar = (com.onesignal.session.internal.outcomes.impl.f) cVar.L$2;
        str3 = (String) cVar.L$1;
        iVar = (i) cVar.L$0;
        try {
            J7.a.v(obj);
        } catch (BackendException e12) {
            e = e12;
            str2 = str3;
            StringBuilder sbM2 = AbstractC0487g.m("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: ", str2, " failed with status code: ");
            sbM2.append(e.getStatusCode());
            sbM2.append(" and response: ");
            sbM2.append(e.getResponse());
            sbM2.append("\nOutcome event was cached and will be reattempted on app cold start");
            com.onesignal.debug.internal.logging.b.warn$default(sbM2.toString(), null, 2, null);
            fVar.setTimestamp(j10);
            dVar2 = iVar._outcomeEventsCache;
            cVar.L$0 = null;
            cVar.L$1 = null;
            cVar.L$2 = null;
            cVar.label = 2;
            if (dVar2.saveOutcomeEvent(fVar, cVar) != aVar) {
                return aVar;
            }
            return null;
        }
        iVar.saveUniqueOutcome(fVar);
        return com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r8.deleteOldOutcomeEvent(r7, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSavedOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f r7, p123m8.d<? super p076h8.m> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.session.internal.outcomes.impl.i.d
            if (r0 == 0) goto L13
            r0 = r8
            com.onesignal.session.internal.outcomes.impl.i$d r0 = (com.onesignal.session.internal.outcomes.impl.i.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onesignal.session.internal.outcomes.impl.i$d r0 = new com.onesignal.session.internal.outcomes.impl.i$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L45
            if (r2 == r3) goto L39
            if (r2 != r5) goto L31
            java.lang.Object r7 = r0.L$0
            com.onesignal.session.internal.outcomes.impl.f r7 = (com.onesignal.session.internal.outcomes.impl.f) r7
            J7.a.v(r8)     // Catch: com.onesignal.common.exceptions.BackendException -> L2f
            goto L97
        L2f:
            r8 = move-exception
            goto L65
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.L$1
            com.onesignal.session.internal.outcomes.impl.f r7 = (com.onesignal.session.internal.outcomes.impl.f) r7
            java.lang.Object r2 = r0.L$0
            com.onesignal.session.internal.outcomes.impl.i r2 = (com.onesignal.session.internal.outcomes.impl.i) r2
            J7.a.v(r8)     // Catch: com.onesignal.common.exceptions.BackendException -> L2f
            goto L56
        L45:
            J7.a.v(r8)
            r0.L$0 = r6     // Catch: com.onesignal.common.exceptions.BackendException -> L2f
            r0.L$1 = r7     // Catch: com.onesignal.common.exceptions.BackendException -> L2f
            r0.label = r3     // Catch: com.onesignal.common.exceptions.BackendException -> L2f
            java.lang.Object r8 = r6.requestMeasureOutcomeEvent(r7, r0)     // Catch: com.onesignal.common.exceptions.BackendException -> L2f
            if (r8 != r1) goto L55
            goto L64
        L55:
            r2 = r6
        L56:
            com.onesignal.session.internal.outcomes.impl.d r8 = r2._outcomeEventsCache     // Catch: com.onesignal.common.exceptions.BackendException -> L2f
            r0.L$0 = r7     // Catch: com.onesignal.common.exceptions.BackendException -> L2f
            r0.L$1 = r4     // Catch: com.onesignal.common.exceptions.BackendException -> L2f
            r0.label = r5     // Catch: com.onesignal.common.exceptions.BackendException -> L2f
            java.lang.Object r7 = r8.deleteOldOutcomeEvent(r7, r0)     // Catch: com.onesignal.common.exceptions.BackendException -> L2f
            if (r7 != r1) goto L97
        L64:
            return r1
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OutcomeEventsController.sendSavedOutcomeEvent: Sending outcome with name: "
            r0.<init>(r1)
            java.lang.String r7 = r7.getOutcomeId()
            r0.append(r7)
            java.lang.String r7 = " failed with status code: "
            r0.append(r7)
            int r7 = r8.getStatusCode()
            r0.append(r7)
            java.lang.String r7 = " and response: "
            r0.append(r7)
            java.lang.String r7 = r8.getResponse()
            r0.append(r7)
            java.lang.String r7 = "\nOutcome event was cached and will be reattempted on app cold start"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.onesignal.debug.internal.logging.b.warn$default(r7, r4, r5, r4)
        L97:
            h8.m r7 = p076h8.m.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.i.sendSavedOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f, m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:21:0x005b->B:31:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendSavedOutcomes(p123m8.d<? super p076h8.m> dVar) {
        e eVar;
        i iVar;
        i iVar2;
        Iterator it;
        com.onesignal.session.internal.outcomes.impl.f fVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object allEventsToSend = eVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = eVar.label;
        if (i11 == 0) {
            J7.a.v(allEventsToSend);
            com.onesignal.session.internal.outcomes.impl.d dVar2 = this._outcomeEventsCache;
            eVar.L$0 = this;
            eVar.label = 1;
            allEventsToSend = dVar2.getAllEventsToSend(eVar);
            if (allEventsToSend != aVar) {
                iVar = this;
            }
            return aVar;
        }
        if (i11 == 1) {
            iVar = (i) eVar.L$0;
            J7.a.v(allEventsToSend);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) eVar.L$1;
            iVar2 = (i) eVar.L$0;
            J7.a.v(allEventsToSend);
        }
        while (it.hasNext()) {
            fVar = (com.onesignal.session.internal.outcomes.impl.f) it.next();
            eVar.L$0 = iVar2;
            eVar.L$1 = it;
            eVar.label = 2;
            if (iVar2.sendSavedOutcomeEvent(fVar, eVar) == aVar) {
                return aVar;
            }
        }
        return p076h8.m.a;
        iVar2 = iVar;
        it = ((List) allEventsToSend).iterator();
        while (it.hasNext()) {
            fVar = (com.onesignal.session.internal.outcomes.impl.f) it.next();
            eVar.L$0 = iVar2;
            eVar.L$1 = it;
            eVar.label = 2;
            if (iVar2.sendSavedOutcomeEvent(fVar, eVar) == aVar) {
                return aVar;
            }
        }
        return p076h8.m.a;
    }

    private final n setSourceChannelIds(p075h6.b bVar, n nVar) {
        int i10 = h.$EnumSwitchMapping$1[bVar.getInfluenceChannel().ordinal()];
        if (i10 == 1) {
            nVar.setInAppMessagesIds(bVar.getIds());
            return nVar;
        }
        if (i10 != 2) {
            return nVar;
        }
        nVar.setNotificationIds(bVar.getIds());
        return nVar;
    }

    @Override // p111l6.a
    public void onSessionActive() {
    }

    @Override // p111l6.a
    public void onSessionEnded(long j) {
    }

    @Override // p111l6.a
    public void onSessionStarted() {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", null, 2, null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    @Override // j6.b
    public Object sendOutcomeEvent(String str, p123m8.d<? super com.onesignal.session.internal.outcomes.impl.e> dVar) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0L, this._influenceManager.getInfluences(), dVar);
    }

    @Override // j6.b
    public Object sendOutcomeEventWithValue(String str, float f10, p123m8.d<? super com.onesignal.session.internal.outcomes.impl.e> dVar) {
        return sendAndCreateOutcomeEvent(str, f10, 0L, this._influenceManager.getInfluences(), dVar);
    }

    @Override // j6.b
    public Object sendSessionEndOutcomeEvent(long j, p123m8.d<? super com.onesignal.session.internal.outcomes.impl.e> dVar) {
        List<p075h6.b> influences = this._influenceManager.getInfluences();
        Iterator<p075h6.b> it = influences.iterator();
        while (it.hasNext()) {
            if (it.next().getIds() != null) {
                return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j, influences, dVar);
            }
        }
        return null;
    }

    @Override // j6.b
    public Object sendUniqueOutcomeEvent(String str, p123m8.d<? super com.onesignal.session.internal.outcomes.impl.e> dVar) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), dVar);
    }

    @Override // p100k5.b
    public void start() {
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new g(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object sendUniqueOutcomeEvent(String str, List<p075h6.b> list, p123m8.d<? super com.onesignal.session.internal.outcomes.impl.e> dVar) {
        f fVar;
        List<p075h6.b> listRemoveDisabledInfluences;
        i iVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.label = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        f fVar2 = fVar;
        Object uniqueIds = fVar2.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = fVar2.label;
        if (i11 == 0) {
            J7.a.v(uniqueIds);
            listRemoveDisabledInfluences = removeDisabledInfluences(list);
            if (listRemoveDisabledInfluences.isEmpty()) {
                com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session", null, 2, null);
                return null;
            }
            Iterator<p075h6.b> it = listRemoveDisabledInfluences.iterator();
            do {
                if (!it.hasNext()) {
                    if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(str)) {
                        com.onesignal.debug.internal.logging.b.debug$default(L9.g.x("\n                    Measure endpoint will not send because unique outcome already sent for: \n                    Session: " + p075h6.d.UNATTRIBUTED + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                        return null;
                    }
                    this.unattributedUniqueOutcomeEventsSentOnSession.add(str);
                    fVar2.label = 3;
                    Object objSendAndCreateOutcomeEvent = sendAndCreateOutcomeEvent(str, 0.0f, 0L, listRemoveDisabledInfluences, fVar2);
                    if (objSendAndCreateOutcomeEvent != aVar) {
                        return objSendAndCreateOutcomeEvent;
                    }
                }
            } while (!it.next().getInfluenceType().isAttributed());
            fVar2.L$0 = this;
            fVar2.L$1 = str;
            fVar2.L$2 = listRemoveDisabledInfluences;
            fVar2.label = 1;
            uniqueIds = getUniqueIds(str, listRemoveDisabledInfluences, fVar2);
            if (uniqueIds != aVar) {
                iVar = this;
            }
        }
        if (i11 != 1) {
            if (i11 == 2) {
                J7.a.v(uniqueIds);
                return uniqueIds;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(uniqueIds);
            return uniqueIds;
        }
        List<p075h6.b> list2 = (List) fVar2.L$2;
        String str2 = (String) fVar2.L$1;
        iVar = (i) fVar2.L$0;
        J7.a.v(uniqueIds);
        listRemoveDisabledInfluences = list2;
        str = str2;
        List<p075h6.b> list3 = (List) uniqueIds;
        if (list3 == null) {
            com.onesignal.debug.internal.logging.b.debug$default(L9.g.x("\n                    Measure endpoint will not send because unique outcome already sent for: \n                    SessionInfluences: " + listRemoveDisabledInfluences + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
            return null;
        }
        fVar2.L$0 = null;
        fVar2.L$1 = null;
        fVar2.L$2 = null;
        fVar2.label = 2;
        Object objSendAndCreateOutcomeEvent2 = iVar.sendAndCreateOutcomeEvent(str, 0.0f, 0L, list3, fVar2);
        return objSendAndCreateOutcomeEvent2 == aVar ? aVar : objSendAndCreateOutcomeEvent2;
    }
}
