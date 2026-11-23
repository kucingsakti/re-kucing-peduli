package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    public static final class a extends k implements p200u8.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // p200u8.a
        public final String invoke() {
            return null;
        }
    }

    public static final class b extends k implements p200u8.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // p200u8.a
        public final String invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.onesignal.core.internal.config.c$c, reason: collision with other inner class name */
    public static final class C0025c extends k implements p200u8.a {
        public static final C0025c INSTANCE = new C0025c();

        public C0025c() {
            super(0);
        }

        @Override // p200u8.a
        public final String invoke() {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, String str) {
        super(iVar, str);
        p210v8.i.f(iVar, "parentModel");
        p210v8.i.f(str, "parentProperty");
    }

    public final String getApiKey() {
        return getOptStringProperty("apiKey", a.INSTANCE);
    }

    public final String getAppId() {
        return getOptStringProperty("appId", b.INSTANCE);
    }

    public final String getProjectId() {
        return getOptStringProperty("projectId", C0025c.INSTANCE);
    }

    public final void setApiKey(String str) {
        i.setOptStringProperty$default(this, "apiKey", str, null, false, 12, null);
    }

    public final void setAppId(String str) {
        i.setOptStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    public final void setProjectId(String str) {
        i.setOptStringProperty$default(this, "projectId", str, null, false, 12, null);
    }
}
