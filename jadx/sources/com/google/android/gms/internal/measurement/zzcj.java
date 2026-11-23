package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcj {
    public static final /* synthetic */ int a = 0;

    static {
        C0584n c0584n = new C0584n();
        c0584n.a = "";
        byte b3 = (byte) (((byte) (c0584n.f8395c | 1)) | 2);
        c0584n.f8395c = b3;
        c0584n.f8394b = zzcl.f8550s;
        if (b3 == 3) {
            new C0586o();
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (c0584n.a == null) {
            sb.append(" fileOwner");
        }
        if ((c0584n.f8395c & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((c0584n.f8395c & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (c0584n.f8394b == null) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }

    public abstract zzcl a();

    public abstract String b();

    public abstract boolean c();

    public abstract boolean d();
}
