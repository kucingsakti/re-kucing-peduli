package com.onesignal.session.internal.outcomes.impl;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import android.content.ContentValues;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class l implements com.onesignal.session.internal.outcomes.impl.d {
    private final p005a5.d _databaseProvider;

    public static final class a extends p144o8.g implements p200u8.c {
        final /* synthetic */ String $notificationIdColumnName;
        final /* synthetic */ String $notificationTableName;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, l lVar, p123m8.d<? super a> dVar) {
            super(2, dVar);
            this.$notificationTableName = str;
            this.$notificationIdColumnName = str2;
            this.this$0 = lVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return new a(this.$notificationTableName, this.$notificationIdColumnName, this.this$0, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((a) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            StringBuilder sb = new StringBuilder("NOT EXISTS(SELECT NULL FROM ");
            sb.append(this.$notificationTableName);
            sb.append(" n WHERE n.");
            sb.append(this.$notificationIdColumnName);
            sb.append(" = channel_influence_id AND channel_type = \"");
            String string = p075h6.c.NOTIFICATION.toString();
            Locale locale = Locale.ROOT;
            p210v8.i.e(locale, "ROOT");
            String lowerCase = string.toLowerCase(locale);
            p210v8.i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.this$0._databaseProvider.getOs().delete("cached_unique_outcome", E0.a.l(sb, lowerCase, "\")"), null);
            return p076h8.m.a;
        }
    }

    public static final class b extends p144o8.g implements p200u8.c {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, p123m8.d<? super b> dVar) {
            super(2, dVar);
            this.$event = fVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return l.this.new b(this.$event, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((b) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            l.this._databaseProvider.getOs().delete("outcome", "timestamp = ?", new String[]{String.valueOf(this.$event.getTimestamp())});
            return p076h8.m.a;
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
            return l.this.getAllEventsToSend(this);
        }
    }

    public static final class d extends p144o8.g implements p200u8.c {
        final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
        int label;

        public static final class a extends p210v8.k implements p200u8.b {
            final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
            final /* synthetic */ l this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, List<com.onesignal.session.internal.outcomes.impl.f> list) {
                super(1);
                this.this$0 = lVar;
                this.$events = list;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return p076h8.m.a;
            }

            public final void invoke(p005a5.a aVar) {
                p210v8.i.f(aVar, "cursor");
                if (aVar.moveToFirst()) {
                    do {
                        String string = aVar.getString("notification_influence_type");
                        h6.d.a aVar2 = p075h6.d.Companion;
                        p075h6.d dVarFromString = aVar2.fromString(string);
                        p075h6.d dVarFromString2 = aVar2.fromString(aVar.getString("iam_influence_type"));
                        String optString = aVar.getOptString(p084i6.e.NOTIFICATIONS_IDS);
                        if (optString == null) {
                            optString = "[]";
                        }
                        String optString2 = aVar.getOptString("iam_ids");
                        String str = optString2 == null ? "[]" : optString2;
                        String string2 = aVar.getString(MediationMetaData.KEY_NAME);
                        float f10 = aVar.getFloat("weight");
                        long j = aVar.getLong("timestamp");
                        long j10 = aVar.getLong("session_time");
                        try {
                            n nVar = new n(null, null, 3, null);
                            n nVar2 = new n(null, null, 3, null);
                            m notificationInfluenceSource = this.this$0.getNotificationInfluenceSource(dVarFromString, nVar, nVar2, optString);
                            this.this$0.getIAMInfluenceSource(dVarFromString2, nVar, nVar2, str, notificationInfluenceSource);
                            if (notificationInfluenceSource == null) {
                                notificationInfluenceSource = new m(null, null);
                            }
                            this.$events.add(new com.onesignal.session.internal.outcomes.impl.f(string2, notificationInfluenceSource, f10, j10, j));
                        } catch (JSONException e10) {
                            com.onesignal.debug.internal.logging.b.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e10);
                        }
                    } while (aVar.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.session.internal.outcomes.impl.f> list, p123m8.d<? super d> dVar) {
            super(2, dVar);
            this.$events = list;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return l.this.new d(this.$events, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((d) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            p101k6.a.INSTANCE.run(l.this._databaseProvider);
            p005a5.b.query$default(l.this._databaseProvider.getOs(), "outcome", null, null, null, null, null, null, null, new a(l.this, this.$events), 254, null);
            return p076h8.m.a;
        }
    }

    public static final class e extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(p123m8.d<? super e> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getNotCachedUniqueInfluencesForOutcome(null, null, this);
        }
    }

    public static final class f extends p144o8.g implements p200u8.c {
        final /* synthetic */ List<p075h6.b> $influences;
        final /* synthetic */ String $name;
        final /* synthetic */ List<p075h6.b> $uniqueInfluences;
        int label;
        final /* synthetic */ l this$0;

        public static final class a extends p210v8.k implements p200u8.b {
            final /* synthetic */ JSONArray $availableInfluenceIds;
            final /* synthetic */ String $channelInfluenceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(JSONArray jSONArray, String str) {
                super(1);
                this.$availableInfluenceIds = jSONArray;
                this.$channelInfluenceId = str;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return p076h8.m.a;
            }

            public final void invoke(p005a5.a aVar) {
                p210v8.i.f(aVar, "it");
                if (aVar.getCount() == 0) {
                    this.$availableInfluenceIds.put(this.$channelInfluenceId);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<p075h6.b> list, String str, l lVar, List<p075h6.b> list2, p123m8.d<? super f> dVar) {
            super(2, dVar);
            this.$influences = list;
            this.$name = str;
            this.this$0 = lVar;
            this.$uniqueInfluences = list2;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return new f(this.$influences, this.$name, this.this$0, this.$uniqueInfluences, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((f) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            try {
                for (p075h6.b bVar : this.$influences) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray ids = bVar.getIds();
                    if (ids != null) {
                        int length = ids.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            String string = ids.getString(i10);
                            p005a5.b.query$default(this.this$0._databaseProvider.getOs(), "cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{string, bVar.getInfluenceChannel().toString(), this.$name}, null, null, null, "1", new a(jSONArray, string), 112, null);
                        }
                        if (jSONArray.length() > 0) {
                            p075h6.b bVarCopy = bVar.copy();
                            bVarCopy.setIds(jSONArray);
                            this.$uniqueInfluences.add(bVarCopy);
                        }
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return p076h8.m.a;
        }
    }

    public static final class g extends p144o8.g implements p200u8.c {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, p123m8.d<? super g> dVar) {
            super(2, dVar);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return new g(this.$eventParams, this.this$0, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super ContentValues> dVar) {
            return ((g) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p075h6.d dVar;
            n indirectBody;
            n directBody;
            p075h6.d dVar2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            p075h6.d dVar3 = p075h6.d.UNATTRIBUTED;
            m outcomeSource = this.$eventParams.getOutcomeSource();
            if (outcomeSource == null || (directBody = outcomeSource.getDirectBody()) == null) {
                dVar = dVar3;
            } else {
                JSONArray notificationIds = directBody.getNotificationIds();
                if (notificationIds == null || notificationIds.length() <= 0) {
                    dVar2 = dVar3;
                } else {
                    dVar2 = p075h6.d.DIRECT;
                    jSONArray = notificationIds;
                }
                JSONArray inAppMessagesIds = directBody.getInAppMessagesIds();
                if (inAppMessagesIds != null && inAppMessagesIds.length() > 0) {
                    dVar3 = p075h6.d.DIRECT;
                    jSONArray2 = inAppMessagesIds;
                }
                dVar = dVar3;
                dVar3 = dVar2;
            }
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            if (outcomeSource2 != null && (indirectBody = outcomeSource2.getIndirectBody()) != null) {
                JSONArray notificationIds2 = indirectBody.getNotificationIds();
                if (notificationIds2 != null && notificationIds2.length() > 0) {
                    dVar3 = p075h6.d.INDIRECT;
                    jSONArray = notificationIds2;
                }
                JSONArray inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
                if (inAppMessagesIds2 != null && inAppMessagesIds2.length() > 0) {
                    dVar = p075h6.d.INDIRECT;
                    jSONArray2 = inAppMessagesIds2;
                }
            }
            ContentValues contentValues = new ContentValues();
            com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
            contentValues.put(p084i6.e.NOTIFICATIONS_IDS, jSONArray.toString());
            contentValues.put("iam_ids", jSONArray2.toString());
            String string = dVar3.toString();
            Locale locale = Locale.ROOT;
            p210v8.i.e(locale, "ROOT");
            String lowerCase = string.toLowerCase(locale);
            p210v8.i.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            contentValues.put("notification_influence_type", lowerCase);
            String string2 = dVar.toString();
            p210v8.i.e(locale, "ROOT");
            String lowerCase2 = string2.toLowerCase(locale);
            p210v8.i.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            contentValues.put("iam_influence_type", lowerCase2);
            contentValues.put(MediationMetaData.KEY_NAME, fVar.getOutcomeId());
            contentValues.put("weight", new Float(fVar.getWeight()));
            contentValues.put("timestamp", new Long(fVar.getTimestamp()));
            contentValues.put("session_time", new Long(fVar.getSessionTime()));
            this.this$0._databaseProvider.getOs().insert("outcome", null, contentValues);
            return contentValues;
        }
    }

    public static final class h extends p144o8.g implements p200u8.c {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, p123m8.d<? super h> dVar) {
            super(2, dVar);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return new h(this.$eventParams, this.this$0, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((h) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            String outcomeId = this.$eventParams.getOutcomeId();
            ArrayList<com.onesignal.session.internal.outcomes.impl.a> arrayList = new ArrayList();
            m outcomeSource = this.$eventParams.getOutcomeSource();
            n directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            n indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
            this.this$0.addIdsToListFromSource(arrayList, directBody);
            this.this$0.addIdsToListFromSource(arrayList, indirectBody);
            for (com.onesignal.session.internal.outcomes.impl.a aVar : arrayList) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", aVar.getInfluenceId());
                contentValues.put("channel_type", aVar.getChannel().toString());
                contentValues.put(MediationMetaData.KEY_NAME, outcomeId);
                this.this$0._databaseProvider.getOs().insert("cached_unique_outcome", null, contentValues);
            }
            return p076h8.m.a;
        }
    }

    public l(p005a5.d dVar) {
        p210v8.i.f(dVar, "_databaseProvider");
        this._databaseProvider = dVar;
    }

    private final void addIdToListFromChannel(List<com.onesignal.session.internal.outcomes.impl.a> list, JSONArray jSONArray, p075h6.c cVar) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    String string = jSONArray.getString(i10);
                    p210v8.i.e(string, "influenceId");
                    list.add(new com.onesignal.session.internal.outcomes.impl.a(string, cVar));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIdsToListFromSource(List<com.onesignal.session.internal.outcomes.impl.a> list, n nVar) {
        if (nVar != null) {
            JSONArray inAppMessagesIds = nVar.getInAppMessagesIds();
            JSONArray notificationIds = nVar.getNotificationIds();
            addIdToListFromChannel(list, inAppMessagesIds, p075h6.c.IAM);
            addIdToListFromChannel(list, notificationIds, p075h6.c.NOTIFICATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getIAMInfluenceSource(p075h6.d dVar, n nVar, n nVar2, String str, m mVar) {
        m directBody;
        m indirectBody;
        int i10 = k.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i10 == 1) {
            nVar.setInAppMessagesIds(new JSONArray(str));
            return (mVar == null || (directBody = mVar.setDirectBody(nVar)) == null) ? new m(nVar, null) : directBody;
        }
        if (i10 != 2) {
            return mVar;
        }
        nVar2.setInAppMessagesIds(new JSONArray(str));
        return (mVar == null || (indirectBody = mVar.setIndirectBody(nVar2)) == null) ? new m(null, nVar2) : indirectBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getNotificationInfluenceSource(p075h6.d dVar, n nVar, n nVar2, String str) {
        int i10 = k.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i10 == 1) {
            nVar.setNotificationIds(new JSONArray(str));
            return new m(nVar, null);
        }
        if (i10 != 2) {
            return null;
        }
        nVar2.setNotificationIds(new JSONArray(str));
        return new m(null, nVar2);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object cleanCachedUniqueOutcomeEventNotifications(p123m8.d<? super p076h8.m> dVar) throws Throwable {
        Object objW = AbstractC0342z.w(I.f3415c, new a("notification", p084i6.e.NOTIFICATION_ID_TAG, this, null), dVar);
        return objW == p134n8.a.f13404s ? objW : p076h8.m.a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object deleteOldOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, p123m8.d<? super p076h8.m> dVar) throws Throwable {
        Object objW = AbstractC0342z.w(I.f3415c, new b(fVar, null), dVar);
        return objW == p134n8.a.f13404s ? objW : p076h8.m.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object getAllEventsToSend(p123m8.d<? super List<com.onesignal.session.internal.outcomes.impl.f>> dVar) {
        c cVar;
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
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) cVar.L$0;
            J7.a.v(obj);
            return list;
        }
        J7.a.v(obj);
        ArrayList arrayList = new ArrayList();
        U9.c cVar2 = I.f3415c;
        d dVar2 = new d(arrayList, null);
        cVar.L$0 = arrayList;
        cVar.label = 1;
        return AbstractC0342z.w(cVar2, dVar2, cVar) == aVar ? aVar : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object getNotCachedUniqueInfluencesForOutcome(String str, List<p075h6.b> list, p123m8.d<? super List<p075h6.b>> dVar) {
        e eVar;
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
        Object obj = eVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = eVar.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) eVar.L$0;
            J7.a.v(obj);
            return list2;
        }
        J7.a.v(obj);
        ArrayList arrayList = new ArrayList();
        U9.c cVar = I.f3415c;
        f fVar = new f(list, str, this, arrayList, null);
        eVar.L$0 = arrayList;
        eVar.label = 1;
        return AbstractC0342z.w(cVar, fVar, eVar) == aVar ? aVar : arrayList;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, p123m8.d<? super p076h8.m> dVar) throws Throwable {
        Object objW = AbstractC0342z.w(I.f3415c, new g(fVar, this, null), dVar);
        return objW == p134n8.a.f13404s ? objW : p076h8.m.a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveUniqueOutcomeEventParams(com.onesignal.session.internal.outcomes.impl.f fVar, p123m8.d<? super p076h8.m> dVar) throws Throwable {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + fVar + ')', null, 2, null);
        Object objW = AbstractC0342z.w(I.f3415c, new h(fVar, this, null), dVar);
        return objW == p134n8.a.f13404s ? objW : p076h8.m.a;
    }
}
