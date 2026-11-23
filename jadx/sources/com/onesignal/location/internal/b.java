package com.onesignal.location.internal;

import p123m8.d;
import p210v8.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements B5.a {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Location in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // B5.a
    public boolean isShared() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // B5.a
    public Object requestPermission(d<?> dVar) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // B5.a
    public void setShared(boolean z6) throws Exception {
        throw Companion.getEXCEPTION();
    }
}
