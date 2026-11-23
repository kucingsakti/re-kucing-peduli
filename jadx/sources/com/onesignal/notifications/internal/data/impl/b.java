package com.onesignal.notifications.internal.data.impl;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements V5.d {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final X4.f _applicationService;
    private final N5.a _badgeCountUpdater;
    private final p005a5.d _databaseProvider;
    private final V5.a _queryHelper;
    private final p110l5.a _time;
    public static final a Companion = new a(null);
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {"title", "message", p084i6.e.NOTIFICATION_ID_TAG, "android_notification_id", "full_data", "created_time"};

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        public final String[] getCOLUMNS_FOR_LIST_NOTIFICATIONS() {
            return b.COLUMNS_FOR_LIST_NOTIFICATIONS;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.data.impl.b$b, reason: collision with other inner class name */
    public static final class C0063b extends p144o8.g implements p200u8.c {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: renamed from: com.onesignal.notifications.internal.data.impl.b$b$a */
        public static final class a extends p210v8.k implements p200u8.b {
            final /* synthetic */ int $maxNumberOfNotificationsInt;
            final /* synthetic */ int $notificationsToMakeRoomFor;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, int i11, b bVar) {
                super(1);
                this.$maxNumberOfNotificationsInt = i10;
                this.$notificationsToMakeRoomFor = i11;
                this.this$0 = bVar;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return p076h8.m.a;
            }

            public final void invoke(p005a5.a aVar) {
                p210v8.i.f(aVar, "it");
                int count = (aVar.getCount() - this.$maxNumberOfNotificationsInt) + this.$notificationsToMakeRoomFor;
                if (count < 1) {
                    return;
                }
                while (aVar.moveToNext()) {
                    this.this$0.internalMarkAsDismissed(aVar.getInt("android_notification_id"));
                    count--;
                    if (count <= 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0063b(int i10, b bVar, int i11, p123m8.d<? super C0063b> dVar) {
            super(2, dVar);
            this.$maxNumberOfNotificationsInt = i10;
            this.this$0 = bVar;
            this.$notificationsToMakeRoomFor = i11;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return new C0063b(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((C0063b) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            String strValueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
            try {
                p005a5.b.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", strValueOf + this.$notificationsToMakeRoomFor, new a(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Error clearing oldest notifications over limit! ", th);
            }
            return p076h8.m.a;
        }
    }

    public static final class c extends p144o8.g implements p200u8.c {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $body;
        final /* synthetic */ String $collapseKey;
        final /* synthetic */ long $expireTime;
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $id;
        final /* synthetic */ boolean $isOpened;
        final /* synthetic */ String $jsonPayload;
        final /* synthetic */ boolean $shouldDismissIdenticals;
        final /* synthetic */ String $title;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z6, int i10, b bVar, String str2, String str3, boolean z10, String str4, String str5, long j, String str6, p123m8.d<? super c> dVar) {
            super(2, dVar);
            this.$id = str;
            this.$shouldDismissIdenticals = z6;
            this.$androidId = i10;
            this.this$0 = bVar;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z10;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j;
            this.$jsonPayload = str6;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return new c(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((c) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            com.onesignal.debug.internal.logging.b.debug$default("Saving Notification id=" + this.$id, null, 2, null);
            try {
                if (this.$shouldDismissIdenticals) {
                    String str = "android_notification_id = " + this.$androidId;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dismissed", new Integer(1));
                    this.this$0._databaseProvider.getOs().update("notification", contentValues, str, null);
                    this.this$0._badgeCountUpdater.update();
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(p084i6.e.NOTIFICATION_ID_TAG, this.$id);
                String str2 = this.$groupId;
                if (str2 != null) {
                    contentValues2.put("group_id", str2);
                }
                String str3 = this.$collapseKey;
                if (str3 != null) {
                    contentValues2.put("collapse_id", str3);
                }
                contentValues2.put("opened", new Integer(this.$isOpened ? 1 : 0));
                if (!this.$isOpened) {
                    contentValues2.put("android_notification_id", new Integer(this.$androidId));
                }
                String str4 = this.$title;
                if (str4 != null) {
                    contentValues2.put("title", str4);
                }
                String str5 = this.$body;
                if (str5 != null) {
                    contentValues2.put("message", str5);
                }
                contentValues2.put("expire_time", new Long(this.$expireTime));
                contentValues2.put("full_data", this.$jsonPayload);
                this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues2);
                com.onesignal.debug.internal.logging.b.debug$default("Notification saved values: " + contentValues2, null, 2, null);
                if (!this.$isOpened) {
                    this.this$0._badgeCountUpdater.update();
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return p076h8.m.a;
        }
    }

    public static final class d extends p144o8.g implements p200u8.c {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, String str, b bVar, p123m8.d<? super d> dVar) {
            super(2, dVar);
            this.$androidId = i10;
            this.$groupId = str;
            this.this$0 = bVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return new d(this.$androidId, this.$groupId, this.this$0, dVar);
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
            ContentValues contentValues = new ContentValues();
            contentValues.put("android_notification_id", new Integer(this.$androidId));
            contentValues.put("group_id", this.$groupId);
            contentValues.put("is_summary", new Integer(1));
            this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues);
            return p076h8.m.a;
        }
    }

    public static final class e extends p144o8.g implements p200u8.c {
        int label;

        public e(p123m8.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new e(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((e) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            String strValueOf = String.valueOf((b.this._time.getCurrentTimeMillis() / 1000) - b.NOTIFICATION_CACHE_DATA_LIFETIME);
            p210v8.i.e(strValueOf, "valueOf(\n               …FETIME,\n                )");
            b.this._databaseProvider.getOs().delete("notification", "created_time < ?", new String[]{strValueOf});
            return p076h8.m.a;
        }
    }

    public static final class f extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(p123m8.d<? super f> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.doesNotificationExist(null, this);
        }
    }

    public static final class g extends p144o8.g implements p200u8.c {
        final /* synthetic */ String $id;
        final /* synthetic */ p210v8.q $result;
        int label;
        final /* synthetic */ b this$0;

        public static final class a extends p210v8.k implements p200u8.b {
            final /* synthetic */ String $id;
            final /* synthetic */ p210v8.q $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, p210v8.q qVar) {
                super(1);
                this.$id = str;
                this.$result = qVar;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return p076h8.m.a;
            }

            public final void invoke(p005a5.a aVar) {
                p210v8.i.f(aVar, "it");
                if (aVar.moveToFirst()) {
                    com.onesignal.debug.internal.logging.b.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, null, 2, null);
                    this.$result.f15463s = true;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, b bVar, p210v8.q qVar, p123m8.d<? super g> dVar) {
            super(2, dVar);
            this.$id = str;
            this.this$0 = bVar;
            this.$result = qVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return new g(this.$id, this.this$0, this.$result, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((g) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            String[] strArr = {p084i6.e.NOTIFICATION_ID_TAG};
            String str = this.$id;
            p210v8.i.c(str);
            p005a5.b.query$default(this.this$0._databaseProvider.getOs(), "notification", strArr, "notification_id = ?", new String[]{str}, null, null, null, null, new a(this.$id, this.$result), 240, null);
            return p076h8.m.a;
        }
    }

    public static final class h extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(p123m8.d<? super h> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdForGroup(null, false, this);
        }
    }

    public static final class i extends p144o8.g implements p200u8.c {
        final /* synthetic */ p210v8.t $recentId;
        final /* synthetic */ String[] $whereArgs;
        final /* synthetic */ p210v8.t $whereStr;
        int label;

        public static final class a extends p210v8.k implements p200u8.b {
            final /* synthetic */ p210v8.t $recentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p210v8.t tVar) {
                super(1);
                this.$recentId = tVar;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return p076h8.m.a;
            }

            public final void invoke(p005a5.a aVar) {
                p210v8.i.f(aVar, "it");
                boolean zMoveToFirst = aVar.moveToFirst();
                this.$recentId.f15466s = !zMoveToFirst ? null : Integer.valueOf(aVar.getInt("android_notification_id"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(p210v8.t tVar, String[] strArr, p210v8.t tVar2, p123m8.d<? super i> dVar) {
            super(2, dVar);
            this.$whereStr = tVar;
            this.$whereArgs = strArr;
            this.$recentId = tVar2;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new i(this.$whereStr, this.$whereArgs, this.$recentId, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((i) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            p005a5.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, (String) this.$whereStr.f15466s, this.$whereArgs, null, null, "created_time DESC", "1", new a(this.$recentId), 48, null);
            return p076h8.m.a;
        }
    }

    public static final class j extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(p123m8.d<? super j> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdFromCollapseKey(null, this);
        }
    }

    public static final class k extends p144o8.g implements p200u8.c {
        final /* synthetic */ p210v8.t $androidId;
        final /* synthetic */ String $collapseKey;
        int label;

        public static final class a extends p210v8.k implements p200u8.b {
            final /* synthetic */ p210v8.t $androidId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p210v8.t tVar) {
                super(1);
                this.$androidId = tVar;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return p076h8.m.a;
            }

            public final void invoke(p005a5.a aVar) {
                p210v8.i.f(aVar, "it");
                if (aVar.moveToFirst()) {
                    this.$androidId.f15466s = Integer.valueOf(aVar.getInt("android_notification_id"));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, p210v8.t tVar, p123m8.d<? super k> dVar) {
            super(2, dVar);
            this.$collapseKey = str;
            this.$androidId = tVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new k(this.$collapseKey, this.$androidId, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((k) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            p005a5.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new a(this.$androidId), 240, null);
            return p076h8.m.a;
        }
    }

    public static final class l extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public l(p123m8.d<? super l> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getGroupId(0, this);
        }
    }

    public static final class m extends p144o8.g implements p200u8.c {
        final /* synthetic */ int $androidId;
        final /* synthetic */ p210v8.t $groupId;
        int label;

        public static final class a extends p210v8.k implements p200u8.b {
            final /* synthetic */ p210v8.t $groupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p210v8.t tVar) {
                super(1);
                this.$groupId = tVar;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return p076h8.m.a;
            }

            public final void invoke(p005a5.a aVar) {
                p210v8.i.f(aVar, "it");
                if (aVar.moveToFirst()) {
                    this.$groupId.f15466s = aVar.getOptString("group_id");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i10, p210v8.t tVar, p123m8.d<? super m> dVar) {
            super(2, dVar);
            this.$androidId = i10;
            this.$groupId = tVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new m(this.$androidId, this.$groupId, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((m) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            p005a5.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"group_id"}, "android_notification_id = " + this.$androidId, null, null, null, null, null, new a(this.$groupId), 248, null);
            return p076h8.m.a;
        }
    }

    public static final class n extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public n(p123m8.d<? super n> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForGroup(null, this);
        }
    }

    public static final class o extends p144o8.g implements p200u8.c {
        final /* synthetic */ List<V5.c> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ b this$0;

        public static final class a extends p210v8.k implements p200u8.b {
            final /* synthetic */ List<V5.c> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<V5.c> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return p076h8.m.a;
            }

            public final void invoke(p005a5.a aVar) {
                p210v8.i.f(aVar, "it");
                if (aVar.moveToFirst()) {
                    do {
                        try {
                            String optString = aVar.getOptString("title");
                            String optString2 = aVar.getOptString("message");
                            this.$listOfNotifications.add(new V5.c(aVar.getInt("android_notification_id"), aVar.getString(p084i6.e.NOTIFICATION_ID_TAG), aVar.getString("full_data"), aVar.getLong("created_time"), optString, optString2));
                        } catch (JSONException unused) {
                            com.onesignal.debug.internal.logging.b.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                        }
                    } while (aVar.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, b bVar, List<V5.c> list, p123m8.d<? super o> dVar) {
            super(2, dVar);
            this.$summaryGroup = str;
            this.this$0 = bVar;
            this.$listOfNotifications = list;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return new o(this.$summaryGroup, this.this$0, this.$listOfNotifications, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((o) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            p005a5.b.query$default(this.this$0._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, null, null, "_id DESC", null, new a(this.$listOfNotifications, this.$summaryGroup), 176, null);
            return p076h8.m.a;
        }
    }

    public static final class p extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public p(p123m8.d<? super p> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForOutstanding(null, this);
        }
    }

    public static final class q extends p144o8.g implements p200u8.c {
        final /* synthetic */ List<Integer> $excludeAndroidIds;
        final /* synthetic */ List<V5.c> $listOfNotifications;
        int label;

        public static final class a extends p210v8.k implements p200u8.b {
            final /* synthetic */ List<V5.c> $listOfNotifications;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<V5.c> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return p076h8.m.a;
            }

            public final void invoke(p005a5.a aVar) {
                p210v8.i.f(aVar, "it");
                while (aVar.moveToNext()) {
                    String optString = aVar.getOptString("title");
                    String optString2 = aVar.getOptString("message");
                    String string = aVar.getString(p084i6.e.NOTIFICATION_ID_TAG);
                    this.$listOfNotifications.add(new V5.c(aVar.getInt("android_notification_id"), string, aVar.getString("full_data"), aVar.getLong("created_time"), optString, optString2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<Integer> list, List<V5.c> list2, p123m8.d<? super q> dVar) {
            super(2, dVar);
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new q(this.$excludeAndroidIds, this.$listOfNotifications, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((q) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            StringBuilder sbRecentUninteractedWithNotificationsWhere = b.this._queryHelper.recentUninteractedWithNotificationsWhere();
            if (this.$excludeAndroidIds != null) {
                sbRecentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                sbRecentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                sbRecentUninteractedWithNotificationsWhere.append(")");
            }
            p005a5.b.query$default(b.this._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), sbRecentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(Z5.a.INSTANCE.getMaxNumberOfNotifications()), new a(this.$listOfNotifications), 56, null);
            return p076h8.m.a;
        }
    }

    public static final class r extends p144o8.g implements p200u8.c {
        final /* synthetic */ int $androidId;
        final /* synthetic */ boolean $clearGroupOnSummaryClick;
        final /* synthetic */ boolean $dismissed;
        final /* synthetic */ String $summaryGroup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, boolean z6, boolean z10, b bVar, int i10, p123m8.d<? super r> dVar) {
            super(2, dVar);
            this.$summaryGroup = str;
            this.$dismissed = z6;
            this.$clearGroupOnSummaryClick = z10;
            this.this$0 = bVar;
            this.$androidId = i10;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return new r(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((r) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x008e  */
        /* JADX WARN: Code duplicated, block: B:32:0x0099  */
        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            String strC;
            String str;
            boolean z6;
            ContentValues contentValues;
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                String str2 = this.$summaryGroup;
                String[] strArr2 = null;
                if (str2 != null) {
                    boolean zA = p210v8.i.a(str2, U5.e.GROUPLESS_SUMMARY_KEY);
                    if (zA) {
                        str = "group_id IS NULL";
                    } else {
                        strArr2 = new String[]{this.$summaryGroup};
                        str = "group_id = ?";
                    }
                    String str3 = str;
                    String[] strArr3 = strArr2;
                    strC = str3;
                    if (this.$dismissed || this.$clearGroupOnSummaryClick) {
                        strArr = strArr3;
                    } else {
                        b bVar = this.this$0;
                        String str4 = this.$summaryGroup;
                        this.L$0 = strC;
                        this.Z$0 = zA;
                        this.label = 1;
                        Object androidIdForGroup = bVar.getAndroidIdForGroup(str4, false, this);
                        if (androidIdForGroup == aVar) {
                            return aVar;
                        }
                        z6 = zA;
                        obj = androidIdForGroup;
                    }
                } else {
                    strArr = null;
                    strC = "android_notification_id = " + this.$androidId;
                }
                contentValues = new ContentValues();
                if (this.$dismissed) {
                    contentValues.put("dismissed", new Integer(1));
                } else {
                    contentValues.put("opened", new Integer(1));
                }
                this.this$0._databaseProvider.getOs().update("notification", contentValues, strC, strArr);
                this.this$0._badgeCountUpdater.update();
                return p076h8.m.a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z6 = this.Z$0;
            strC = (String) this.L$0;
            J7.a.v(obj);
            String strValueOf = String.valueOf(obj);
            strC = p231y.a.c(strC, " AND android_notification_id = ?");
            strArr = z6 ? new String[]{strValueOf} : new String[]{this.$summaryGroup, strValueOf};
            contentValues = new ContentValues();
            if (this.$dismissed) {
                contentValues.put("dismissed", new Integer(1));
            } else {
                contentValues.put("opened", new Integer(1));
            }
            this.this$0._databaseProvider.getOs().update("notification", contentValues, strC, strArr);
            this.this$0._badgeCountUpdater.update();
            return p076h8.m.a;
        }
    }

    public static final class s extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public s(p123m8.d<? super s> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markAsDismissed(0, this);
        }
    }

    public static final class t extends p144o8.g implements p200u8.c {
        final /* synthetic */ int $androidId;
        final /* synthetic */ p210v8.q $didDismiss;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(p210v8.q qVar, b bVar, int i10, p123m8.d<? super t> dVar) {
            super(2, dVar);
            this.$didDismiss = qVar;
            this.this$0 = bVar;
            this.$androidId = i10;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return new t(this.$didDismiss, this.this$0, this.$androidId, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((t) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            this.$didDismiss.f15463s = this.this$0.internalMarkAsDismissed(this.$androidId);
            return p076h8.m.a;
        }
    }

    public static final class u extends p144o8.g implements p200u8.c {
        final /* synthetic */ String $group;
        int label;

        public static final class a extends p210v8.k implements p200u8.b {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return p076h8.m.a;
            }

            public final void invoke(p005a5.a aVar) {
                p210v8.i.f(aVar, "it");
                while (aVar.moveToNext()) {
                    int i10 = aVar.getInt("android_notification_id");
                    if (i10 != -1) {
                        this.$notificationManager.cancel(i10);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, p123m8.d<? super u> dVar) {
            super(2, dVar);
            this.$group = str;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new u(this.$group, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((u) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            NotificationManager notificationManager = U5.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            String[] strArr = {this.$group};
            p005a5.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", strArr, null, null, null, null, new a(notificationManager), 240, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr);
            b.this._badgeCountUpdater.update();
            return p076h8.m.a;
        }
    }

    public static final class v extends p144o8.g implements p200u8.c {
        int label;

        public static final class a extends p210v8.k implements p200u8.b {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p005a5.a) obj);
                return p076h8.m.a;
            }

            public final void invoke(p005a5.a aVar) {
                p210v8.i.f(aVar, "it");
                if (aVar.moveToFirst()) {
                    do {
                        this.$notificationManager.cancel(aVar.getInt("android_notification_id"));
                    } while (aVar.moveToNext());
                }
            }
        }

        public v(p123m8.d<? super v> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new v(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((v) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            NotificationManager notificationManager = U5.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            p005a5.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", null, null, null, null, null, new a(notificationManager), 248, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "opened = 0", null);
            b.this._badgeCountUpdater.updateCount(0);
            return p076h8.m.a;
        }
    }

    public b(X4.f fVar, V5.a aVar, p005a5.d dVar, p110l5.a aVar2, N5.a aVar3) {
        p210v8.i.f(fVar, "_applicationService");
        p210v8.i.f(aVar, "_queryHelper");
        p210v8.i.f(dVar, "_databaseProvider");
        p210v8.i.f(aVar2, "_time");
        p210v8.i.f(aVar3, "_badgeCountUpdater");
        this._applicationService = fVar;
        this._queryHelper = aVar;
        this._databaseProvider = dVar;
        this._time = aVar2;
        this._badgeCountUpdater = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int i10) {
        Context appContext = this._applicationService.getAppContext();
        String strG = E0.a.g("android_notification_id = ", i10, " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        boolean z6 = this._databaseProvider.getOs().update("notification", contentValues, strG, null) > 0;
        this._badgeCountUpdater.update();
        U5.e.INSTANCE.getNotificationManager(appContext).cancel(i10);
        return z6;
    }

    @Override // V5.d
    public Object clearOldestOverLimitFallback(int i10, int i11, p123m8.d<? super p076h8.m> dVar) throws Throwable {
        Object objW = AbstractC0342z.w(I.f3415c, new C0063b(i11, this, i10, null), dVar);
        return objW == p134n8.a.f13404s ? objW : p076h8.m.a;
    }

    @Override // V5.d
    public Object createNotification(String str, String str2, String str3, boolean z6, boolean z10, int i10, String str4, String str5, long j10, String str6, p123m8.d<? super p076h8.m> dVar) throws Throwable {
        Object objW = AbstractC0342z.w(I.f3415c, new c(str, z6, i10, this, str2, str3, z10, str4, str5, j10, str6, null), dVar);
        return objW == p134n8.a.f13404s ? objW : p076h8.m.a;
    }

    @Override // V5.d
    public Object createSummaryNotification(int i10, String str, p123m8.d<? super p076h8.m> dVar) throws Throwable {
        Object objW = AbstractC0342z.w(I.f3415c, new d(i10, str, this, null), dVar);
        return objW == p134n8.a.f13404s ? objW : p076h8.m.a;
    }

    @Override // V5.d
    public Object deleteExpiredNotifications(p123m8.d<? super p076h8.m> dVar) throws Throwable {
        Object objW = AbstractC0342z.w(I.f3415c, new e(null), dVar);
        return objW == p134n8.a.f13404s ? objW : p076h8.m.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // V5.d
    public Object doesNotificationExist(String str, p123m8.d<? super Boolean> dVar) {
        f fVar;
        p210v8.q qVar;
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
        Object obj = fVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = fVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            if (str == null || "".equals(str)) {
                return Boolean.FALSE;
            }
            p210v8.q qVar2 = new p210v8.q();
            U9.c cVar = I.f3415c;
            g gVar = new g(str, this, qVar2, null);
            fVar.L$0 = qVar2;
            fVar.label = 1;
            if (AbstractC0342z.w(cVar, gVar, fVar) == aVar) {
                return aVar;
            }
            qVar = qVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (p210v8.q) fVar.L$0;
            J7.a.v(obj);
        }
        return Boolean.valueOf(qVar.f15463s);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // V5.d
    public Object getAndroidIdForGroup(String str, boolean z6, p123m8.d<? super Integer> dVar) {
        h hVar;
        p210v8.t tVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object obj = hVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = hVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            p210v8.t tVar2 = new p210v8.t();
            boolean zA = p210v8.i.a(str, U5.e.GROUPLESS_SUMMARY_KEY);
            p210v8.t tVar3 = new p210v8.t();
            tVar3.f15466s = zA ? "group_id IS NULL" : "group_id = ?";
            tVar3.f15466s = E0.a.l(new StringBuilder(), (String) tVar3.f15466s, " AND dismissed = 0 AND opened = 0 AND ");
            StringBuilder sb = new StringBuilder();
            sb.append((String) tVar3.f15466s);
            sb.append(z6 ? "is_summary = 1" : "is_summary = 0");
            tVar3.f15466s = sb.toString();
            String[] strArr = zA ? null : new String[]{str};
            U9.c cVar = I.f3415c;
            i iVar = new i(tVar3, strArr, tVar2, null);
            hVar.L$0 = tVar2;
            hVar.label = 1;
            if (AbstractC0342z.w(cVar, iVar, hVar) == aVar) {
                return aVar;
            }
            tVar = tVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (p210v8.t) hVar.L$0;
            J7.a.v(obj);
        }
        return tVar.f15466s;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // V5.d
    public Object getAndroidIdFromCollapseKey(String str, p123m8.d<? super Integer> dVar) {
        j jVar;
        p210v8.t tVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.label = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object obj = jVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = jVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            p210v8.t tVar2 = new p210v8.t();
            U9.c cVar = I.f3415c;
            k kVar = new k(str, tVar2, null);
            jVar.L$0 = tVar2;
            jVar.label = 1;
            if (AbstractC0342z.w(cVar, kVar, jVar) == aVar) {
                return aVar;
            }
            tVar = tVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (p210v8.t) jVar.L$0;
            J7.a.v(obj);
        }
        return tVar.f15466s;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // V5.d
    public Object getGroupId(int i10, p123m8.d<? super String> dVar) {
        l lVar;
        p210v8.t tVar;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i11 = lVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.label = i11 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        Object obj = lVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i12 = lVar.label;
        if (i12 == 0) {
            J7.a.v(obj);
            p210v8.t tVar2 = new p210v8.t();
            U9.c cVar = I.f3415c;
            m mVar = new m(i10, tVar2, null);
            lVar.L$0 = tVar2;
            lVar.label = 1;
            if (AbstractC0342z.w(cVar, mVar, lVar) == aVar) {
                return aVar;
            }
            tVar = tVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (p210v8.t) lVar.L$0;
            J7.a.v(obj);
        }
        return tVar.f15466s;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // V5.d
    public Object listNotificationsForGroup(String str, p123m8.d<? super List<V5.c>> dVar) {
        n nVar;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i10 = nVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.label = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(dVar);
            }
        } else {
            nVar = new n(dVar);
        }
        Object obj = nVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = nVar.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) nVar.L$0;
            J7.a.v(obj);
            return list;
        }
        J7.a.v(obj);
        ArrayList arrayList = new ArrayList();
        U9.c cVar = I.f3415c;
        o oVar = new o(str, this, arrayList, null);
        nVar.L$0 = arrayList;
        nVar.label = 1;
        return AbstractC0342z.w(cVar, oVar, nVar) == aVar ? aVar : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // V5.d
    public Object listNotificationsForOutstanding(List<Integer> list, p123m8.d<? super List<V5.c>> dVar) {
        p pVar;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i10 = pVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.label = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(dVar);
            }
        } else {
            pVar = new p(dVar);
        }
        Object obj = pVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = pVar.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) pVar.L$0;
            J7.a.v(obj);
            return list2;
        }
        J7.a.v(obj);
        ArrayList arrayList = new ArrayList();
        U9.c cVar = I.f3415c;
        q qVar = new q(list, arrayList, null);
        pVar.L$0 = arrayList;
        pVar.label = 1;
        return AbstractC0342z.w(cVar, qVar, pVar) == aVar ? aVar : arrayList;
    }

    @Override // V5.d
    public Object markAsConsumed(int i10, boolean z6, String str, boolean z10, p123m8.d<? super p076h8.m> dVar) throws Throwable {
        Object objW = AbstractC0342z.w(I.f3415c, new r(str, z6, z10, this, i10, null), dVar);
        return objW == p134n8.a.f13404s ? objW : p076h8.m.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // V5.d
    public Object markAsDismissed(int i10, p123m8.d<? super Boolean> dVar) {
        s sVar;
        p210v8.q qVar;
        if (dVar instanceof s) {
            sVar = (s) dVar;
            int i11 = sVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.label = i11 - Integer.MIN_VALUE;
            } else {
                sVar = new s(dVar);
            }
        } else {
            sVar = new s(dVar);
        }
        Object obj = sVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i12 = sVar.label;
        if (i12 == 0) {
            J7.a.v(obj);
            p210v8.q qVar2 = new p210v8.q();
            U9.c cVar = I.f3415c;
            t tVar = new t(qVar2, this, i10, null);
            sVar.L$0 = qVar2;
            sVar.label = 1;
            if (AbstractC0342z.w(cVar, tVar, sVar) == aVar) {
                return aVar;
            }
            qVar = qVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (p210v8.q) sVar.L$0;
            J7.a.v(obj);
        }
        return Boolean.valueOf(qVar.f15463s);
    }

    @Override // V5.d
    public Object markAsDismissedForGroup(String str, p123m8.d<? super p076h8.m> dVar) throws Throwable {
        Object objW = AbstractC0342z.w(I.f3415c, new u(str, null), dVar);
        return objW == p134n8.a.f13404s ? objW : p076h8.m.a;
    }

    @Override // V5.d
    public Object markAsDismissedForOutstanding(p123m8.d<? super p076h8.m> dVar) throws Throwable {
        Object objW = AbstractC0342z.w(I.f3415c, new v(null), dVar);
        return objW == p134n8.a.f13404s ? objW : p076h8.m.a;
    }
}
