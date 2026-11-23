package E1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: E1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0185g implements p232y1.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f1308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f1309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public URL f1312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile byte[] f1313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1314h;

    public C0185g(URL url) {
        k kVar = InterfaceC0186h.a;
        U1.f.c(url, "Argument must not be null");
        this.f1309c = url;
        this.f1310d = null;
        U1.f.c(kVar, "Argument must not be null");
        this.f1308b = kVar;
    }

    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        if (this.f1313g == null) {
            this.f1313g = c().getBytes(p232y1.e.a);
        }
        messageDigest.update(this.f1313g);
    }

    public final String c() {
        String str = this.f1310d;
        if (str != null) {
            return str;
        }
        URL url = this.f1309c;
        U1.f.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f1312f == null) {
            if (TextUtils.isEmpty(this.f1311e)) {
                String string = this.f1310d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f1309c;
                    U1.f.c(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f1311e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f1312f = new URL(this.f1311e);
        }
        return this.f1312f;
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0185g)) {
            return false;
        }
        C0185g c0185g = (C0185g) obj;
        return c().equals(c0185g.c()) && this.f1308b.equals(c0185g.f1308b);
    }

    @Override // p232y1.e
    public final int hashCode() {
        if (this.f1314h == 0) {
            int iHashCode = c().hashCode();
            this.f1314h = iHashCode;
            this.f1314h = this.f1308b.f1315b.hashCode() + (iHashCode * 31);
        }
        return this.f1314h;
    }

    public final String toString() {
        return c();
    }

    public C0185g(String str) {
        k kVar = InterfaceC0186h.a;
        this.f1309c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f1310d = str;
            U1.f.c(kVar, "Argument must not be null");
            this.f1308b = kVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
