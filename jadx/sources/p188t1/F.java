package p188t1;

import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public final class F {
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f14976d = null;

    public F(boolean z6, boolean z10, boolean z11) {
        this.a = z6;
        this.f14974b = z10;
        this.f14975c = z11;
    }

    public final boolean a() {
        boolean zContains = C.a(C.c("0263A7C009")).contains(C.a(C.c("0677B8C5")));
        boolean z6 = this.a;
        if (zContains) {
            return (z6 && this.f14974b) ? false : true;
        }
        return !z6;
    }

    public final boolean b() {
        return (this.a && this.f14974b && this.f14975c) ? false : true;
    }
}
