package com.onesignal.inAppMessages.internal.repositories.impl;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import android.content.ContentValues;
import com.onesignal.common.f;
import com.onesignal.inAppMessages.internal.h;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import p076h8.m;
import p144o8.g;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p236y5.a {
    public static final C0046a Companion = new C0046a(null);
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final p005a5.d _databaseProvider;
    private final p207v5.a _prefs;
    private final p110l5.a _time;

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$a, reason: collision with other inner class name */
    public static final class C0046a {
        public /* synthetic */ C0046a(p210v8.e eVar) {
            this();
        }

        private C0046a() {
        }
    }

    public static final class b extends g implements p200u8.c {
        int label;

        /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0047a extends k implements p200u8.b {
            final /* synthetic */ Set<String> $oldClickedClickIds;
            final /* synthetic */ Set<String> $oldMessageIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0047a(Set<String> set, Set<String> set2) {
                super(1);
                this.$oldMessageIds = set;
                this.$oldClickedClickIds = set2;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return m.a;
            }

            public final void invoke(p005a5.a aVar) {
                i.f(aVar, "it");
                if (aVar.getCount() == 0) {
                    com.onesignal.debug.internal.logging.b.debug$default("Attempted to clean 6 month old IAM data, but none exists!", null, 2, null);
                    return;
                }
                if (aVar.moveToFirst()) {
                    do {
                        String string = aVar.getString("message_id");
                        String string2 = aVar.getString("click_ids");
                        this.$oldMessageIds.add(string);
                        this.$oldClickedClickIds.addAll(f.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)));
                    } while (aVar.moveToNext());
                }
            }
        }

        public b(p123m8.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((b) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            String[] strArr = {"message_id", "click_ids"};
            String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - a.IAM_CACHE_DATA_LIFETIME)};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            try {
                p005a5.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", strArr, "last_display < ?", strArr2, null, null, null, null, new C0047a(linkedHashSet, linkedHashSet2), 240, null);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            a.this._databaseProvider.getOs().delete("in_app_message", "last_display < ?", strArr2);
            a.this._prefs.cleanInAppMessageIds(linkedHashSet);
            a.this._prefs.cleanInAppMessageClickedClickIds(linkedHashSet2);
            return m.a;
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
            return a.this.listInAppMessages(this);
        }
    }

    public static final class d extends g implements p200u8.c {
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
        int label;

        /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$d$a, reason: collision with other inner class name */
        public static final class C0048a extends k implements p200u8.b {
            final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0048a(a aVar, List<com.onesignal.inAppMessages.internal.a> list) {
                super(1);
                this.this$0 = aVar;
                this.$inAppMessages = list;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return m.a;
            }

            public final void invoke(p005a5.a aVar) {
                i.f(aVar, "it");
                if (aVar.moveToFirst()) {
                    do {
                        this.$inAppMessages.add(new com.onesignal.inAppMessages.internal.a(aVar.getString("message_id"), f.INSTANCE.newStringSetFromJSONArray(new JSONArray(aVar.getString("click_ids"))), aVar.getInt("displayed_in_session") == 1, new h(aVar.getInt("display_quantity"), aVar.getLong("last_display"), this.this$0._time), this.this$0._time));
                    } while (aVar.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.inAppMessages.internal.a> list, p123m8.d<? super d> dVar) {
            super(2, dVar);
            this.$inAppMessages = list;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return a.this.new d(this.$inAppMessages, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((d) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            try {
                p005a5.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", null, null, null, null, null, null, null, new C0048a(a.this, this.$inAppMessages), 254, null);
            } catch (JSONException e10) {
                com.onesignal.debug.internal.logging.b.error("Generating JSONArray from iam click ids:JSON Failed.", e10);
            }
            return m.a;
        }
    }

    public static final class e extends g implements p200u8.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $inAppMessage;
        final /* synthetic */ ContentValues $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContentValues contentValues, com.onesignal.inAppMessages.internal.a aVar, p123m8.d<? super e> dVar) {
            super(2, dVar);
            this.$values = contentValues;
            this.$inAppMessage = aVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return a.this.new e(this.$values, this.$inAppMessage, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((e) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            if (a.this._databaseProvider.getOs().update("in_app_message", this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
                a.this._databaseProvider.getOs().insert("in_app_message", null, this.$values);
            }
            return m.a;
        }
    }

    public a(p005a5.d dVar, p110l5.a aVar, p207v5.a aVar2) {
        i.f(dVar, "_databaseProvider");
        i.f(aVar, "_time");
        i.f(aVar2, "_prefs");
        this._databaseProvider = dVar;
        this._time = aVar;
        this._prefs = aVar2;
    }

    @Override // p236y5.a
    public Object cleanCachedInAppMessages(p123m8.d<? super m> dVar) throws Throwable {
        Object objW = AbstractC0342z.w(I.f3415c, new b(null), dVar);
        return objW == p134n8.a.f13404s ? objW : m.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p236y5.a
    public Object listInAppMessages(p123m8.d<? super List<com.onesignal.inAppMessages.internal.a>> dVar) {
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

    @Override // p236y5.a
    public Object saveInAppMessage(com.onesignal.inAppMessages.internal.a aVar, p123m8.d<? super m> dVar) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", aVar.getMessageId());
        contentValues.put("display_quantity", new Integer(aVar.getRedisplayStats().getDisplayQuantity()));
        contentValues.put("last_display", new Long(aVar.getRedisplayStats().getLastDisplayTime()));
        contentValues.put("click_ids", aVar.getClickedClickIds().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(aVar.isDisplayedInSession()));
        Object objW = AbstractC0342z.w(I.f3415c, new e(contentValues, aVar, null), dVar);
        return objW == p134n8.a.f13404s ? objW : m.a;
    }
}
