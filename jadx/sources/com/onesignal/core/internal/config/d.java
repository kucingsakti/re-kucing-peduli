package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i {
    public static final a Companion = new a(null);
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends k implements p200u8.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // p200u8.a
        public final Integer invoke() {
            return 10;
        }
    }

    public static final class c extends k implements p200u8.a {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // p200u8.a
        public final Integer invoke() {
            return Integer.valueOf(d.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.core.internal.config.d$d, reason: collision with other inner class name */
    public static final class C0026d extends k implements p200u8.a {
        public static final C0026d INSTANCE = new C0026d();

        public C0026d() {
            super(0);
        }

        @Override // p200u8.a
        public final Integer invoke() {
            return Integer.valueOf(d.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    public static final class e extends k implements p200u8.a {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // p200u8.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class f extends k implements p200u8.a {
        public static final f INSTANCE = new f();

        public f() {
            super(0);
        }

        @Override // p200u8.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class g extends k implements p200u8.a {
        public static final g INSTANCE = new g();

        public g() {
            super(0);
        }

        @Override // p200u8.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class h extends k implements p200u8.a {
        public static final h INSTANCE = new h();

        public h() {
            super(0);
        }

        @Override // p200u8.a
        public final Integer invoke() {
            return 10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, String str) {
        super(iVar, str);
        p210v8.i.f(iVar, "parentModel");
        p210v8.i.f(str, "parentProperty");
    }

    public final int getIamLimit() {
        return getIntProperty("iamLimit", b.INSTANCE);
    }

    public final int getIndirectIAMAttributionWindow() {
        return getIntProperty("indirectIAMAttributionWindow", c.INSTANCE);
    }

    public final int getIndirectNotificationAttributionWindow() {
        return getIntProperty("indirectNotificationAttributionWindow", C0026d.INSTANCE);
    }

    public final int getNotificationLimit() {
        return getIntProperty("notificationLimit", h.INSTANCE);
    }

    public final boolean isDirectEnabled() {
        return getBooleanProperty("isDirectEnabled", e.INSTANCE);
    }

    public final boolean isIndirectEnabled() {
        return getBooleanProperty("isIndirectEnabled", f.INSTANCE);
    }

    public final boolean isUnattributedEnabled() {
        return getBooleanProperty("isUnattributedEnabled", g.INSTANCE);
    }

    public final void setDirectEnabled(boolean z6) {
        i.setBooleanProperty$default(this, "isDirectEnabled", z6, null, false, 12, null);
    }

    public final void setIamLimit(int i10) {
        i.setIntProperty$default(this, "iamLimit", i10, null, false, 12, null);
    }

    public final void setIndirectEnabled(boolean z6) {
        i.setBooleanProperty$default(this, "isIndirectEnabled", z6, null, false, 12, null);
    }

    public final void setIndirectIAMAttributionWindow(int i10) {
        i.setIntProperty$default(this, "indirectIAMAttributionWindow", i10, null, false, 12, null);
    }

    public final void setIndirectNotificationAttributionWindow(int i10) {
        i.setIntProperty$default(this, "indirectNotificationAttributionWindow", i10, null, false, 12, null);
    }

    public final void setNotificationLimit(int i10) {
        i.setIntProperty$default(this, "notificationLimit", i10, null, false, 12, null);
    }

    public final void setUnattributedEnabled(boolean z6) {
        i.setBooleanProperty$default(this, "isUnattributedEnabled", z6, null, false, 12, null);
    }
}
