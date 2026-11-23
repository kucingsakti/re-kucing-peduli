package p208v6;

import com.onesignal.common.modeling.i;
import com.unity3d.services.core.di.ServiceProvider;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    public static final class a extends k implements p200u8.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // p200u8.a
        public final String invoke() {
            return "";
        }
    }

    public static final class b extends k implements p200u8.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // p200u8.a
        public final String invoke() {
            return "";
        }
    }

    public static final class c extends k implements p200u8.a {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // p200u8.a
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: v6.d$d, reason: collision with other inner class name */
    public static final class C0091d extends k implements p200u8.a {
        public static final C0091d INSTANCE = new C0091d();

        public C0091d() {
            super(0);
        }

        @Override // p200u8.a
        public final String invoke() {
            return "";
        }
    }

    public d() {
        super(null, null, 3, null);
    }

    public final String getAddress() {
        return i.getStringProperty$default(this, "address", null, 2, null);
    }

    public final String getAppVersion() {
        return getStringProperty("appVersion", a.INSTANCE);
    }

    public final String getCarrier() {
        return getStringProperty("carrier", b.INSTANCE);
    }

    public final String getDeviceOS() {
        return getStringProperty("deviceOS", c.INSTANCE);
    }

    public final boolean getOptedIn() {
        return i.getBooleanProperty$default(this, "optedIn", null, 2, null);
    }

    public final String getSdk() {
        return getStringProperty(ServiceProvider.NAMED_SDK, C0091d.INSTANCE);
    }

    public final f getStatus() {
        Enum enumValueOf = null;
        if (!hasProperty("status")) {
            f fVar = f.SUBSCRIBED;
            setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
        }
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, "status", null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof f) {
                enumValueOf = (Enum) optAnyProperty$default;
            } else {
                enumValueOf = optAnyProperty$default instanceof String ? f.valueOf((String) optAnyProperty$default) : (f) optAnyProperty$default;
            }
        }
        if (enumValueOf != null) {
            return (f) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final g getType() {
        Enum enumValueOf = null;
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY, null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof g) {
                enumValueOf = (Enum) optAnyProperty$default;
            } else {
                enumValueOf = optAnyProperty$default instanceof String ? g.valueOf((String) optAnyProperty$default) : (g) optAnyProperty$default;
            }
        }
        if (enumValueOf != null) {
            return (g) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    public final void setAddress(String str) {
        p210v8.i.f(str, "value");
        i.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    public final void setAppVersion(String str) {
        p210v8.i.f(str, "value");
        i.setStringProperty$default(this, "appVersion", str, null, false, 12, null);
    }

    public final void setCarrier(String str) {
        p210v8.i.f(str, "value");
        i.setStringProperty$default(this, "carrier", str, null, false, 12, null);
    }

    public final void setDeviceOS(String str) {
        p210v8.i.f(str, "value");
        i.setStringProperty$default(this, "deviceOS", str, null, false, 12, null);
    }

    public final void setOptedIn(boolean z6) {
        i.setBooleanProperty$default(this, "optedIn", z6, null, false, 12, null);
    }

    public final void setSdk(String str) {
        p210v8.i.f(str, "value");
        i.setStringProperty$default(this, ServiceProvider.NAMED_SDK, str, null, false, 12, null);
    }

    public final void setStatus(f fVar) {
        p210v8.i.f(fVar, "value");
        setOptAnyProperty("status", fVar.toString(), "NORMAL", false);
    }

    public final void setType(g gVar) {
        p210v8.i.f(gVar, "value");
        setOptAnyProperty(com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY, gVar.toString(), "NORMAL", false);
    }
}
