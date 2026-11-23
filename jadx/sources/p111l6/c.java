package p111l6;

import com.onesignal.common.modeling.i;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    public static final class a extends k implements p200u8.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // p200u8.a
        public final Long invoke() {
            return 0L;
        }
    }

    public static final class b extends k implements p200u8.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // p200u8.a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: l6.c$c, reason: collision with other inner class name */
    public static final class C0089c extends k implements p200u8.a {
        public static final C0089c INSTANCE = new C0089c();

        public C0089c() {
            super(0);
        }

        @Override // p200u8.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class d extends k implements p200u8.a {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // p200u8.a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public c() {
        super(null, null, 3, null);
    }

    public final long getActiveDuration() {
        return getLongProperty("activeDuration", a.INSTANCE);
    }

    public final long getFocusTime() {
        return getLongProperty("focusTime", b.INSTANCE);
    }

    public final String getSessionId() {
        return i.getStringProperty$default(this, JsonStorageKeyNames.SESSION_ID_KEY, null, 2, null);
    }

    public final long getStartTime() {
        return getLongProperty("startTime", d.INSTANCE);
    }

    public final boolean isValid() {
        return getBooleanProperty("isValid", C0089c.INSTANCE);
    }

    public final void setActiveDuration(long j) {
        i.setLongProperty$default(this, "activeDuration", j, null, false, 12, null);
    }

    public final void setFocusTime(long j) {
        i.setLongProperty$default(this, "focusTime", j, null, false, 12, null);
    }

    public final void setSessionId(String str) {
        p210v8.i.f(str, "value");
        i.setStringProperty$default(this, JsonStorageKeyNames.SESSION_ID_KEY, str, null, false, 12, null);
    }

    public final void setStartTime(long j) {
        i.setLongProperty$default(this, "startTime", j, null, false, 12, null);
    }

    public final void setValid(boolean z6) {
        i.setBooleanProperty$default(this, "isValid", z6, null, false, 12, null);
    }
}
