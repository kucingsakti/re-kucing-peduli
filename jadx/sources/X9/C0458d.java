package X9;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: X9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0458d extends O {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Z9.e f5569t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f5570u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f5571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ma.r f5572w;

    public C0458d(Z9.e eVar, String str, String str2) {
        this.f5569t = eVar;
        this.f5570u = str;
        this.f5571v = str2;
        this.f5572w = p068ga.d.d(new C0457c((ma.w) eVar.f5936u.get(1), this));
    }

    @Override // X9.O
    public final long a() {
        String str = this.f5571v;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = Y9.c.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // X9.O
    public final A b() {
        String str = this.f5570u;
        if (str == null) {
            return null;
        }
        Pattern pattern = A.f5431d;
        return p068ga.d.x(str);
    }

    @Override // X9.O
    public final ma.h c() {
        return this.f5572w;
    }
}
