package com.onesignal.notifications.bridges;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.common.f;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p200u8.b;
import p210v8.i;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final a INSTANCE = new a();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    /* JADX INFO: renamed from: com.onesignal.notifications.bridges.a$a, reason: collision with other inner class name */
    public static final class C0060a extends g implements b {
        final /* synthetic */ t $registerer;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0060a(t tVar, String str, d<? super C0060a> dVar) {
            super(1, dVar);
            this.$registerer = tVar;
            this.$token = str;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return new C0060a(this.$registerer, this.$token, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                com.onesignal.notifications.internal.registration.impl.b bVar = (com.onesignal.notifications.internal.registration.impl.b) this.$registerer.f15466s;
                String str = this.$token;
                this.label = 1;
                if (bVar.fireCallback(str, this) == aVar) {
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

        @Override // p200u8.b
        public final Object invoke(d<? super m> dVar) {
            return ((C0060a) create(dVar)).invokeSuspend(m.a);
        }
    }

    private a() {
    }

    public final void onMessageReceived(Context context, RemoteMessage remoteMessage) {
        Bundle bundleJsonStringToBundle;
        i.f(context, "context");
        i.f(remoteMessage, "message");
        if (P4.d.b(context)) {
            p110l5.a aVar = (p110l5.a) P4.d.a().getService(p110l5.a.class);
            Q5.b bVar = (Q5.b) P4.d.a().getService(Q5.b.class);
            String data = remoteMessage.getData();
            try {
                JSONObject jSONObject = new JSONObject(remoteMessage.getData());
                if (remoteMessage.getTtl() == 0) {
                    jSONObject.put(HMS_TTL_KEY, 259200);
                } else {
                    jSONObject.put(HMS_TTL_KEY, remoteMessage.getTtl());
                }
                if (remoteMessage.getSentTime() == 0) {
                    jSONObject.put(HMS_SENT_TIME_KEY, aVar.getCurrentTimeMillis());
                } else {
                    jSONObject.put(HMS_SENT_TIME_KEY, remoteMessage.getSentTime());
                }
                data = jSONObject.toString();
            } catch (JSONException unused) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", null, 2, null);
            }
            if (data == null || (bundleJsonStringToBundle = f.INSTANCE.jsonStringToBundle(data)) == null) {
                return;
            }
            bVar.processBundleFromReceiver(context, bundleJsonStringToBundle);
        }
    }

    public final void onNewToken(Context context, String str, Bundle bundle) {
        i.f(context, "context");
        i.f(str, "token");
        if (!firstToken.compareAndSet(true, false)) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + str + " Bundle: " + bundle, null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + str + " Bundle: " + bundle, null, 2, null);
        t tVar = new t();
        tVar.f15466s = P4.d.a().getService(com.onesignal.notifications.internal.registration.impl.b.class);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new C0060a(tVar, str, null), 1, null);
    }

    public final void onNewToken(Context context, String str) {
        i.f(context, "context");
        i.f(str, "token");
        onNewToken(context, str, null);
    }
}
