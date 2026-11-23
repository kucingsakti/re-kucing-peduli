package p048ea;

import com.unity3d.ads.metadata.MediationMetaData;
import ma.i;
import p230x9.d;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f11260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f11261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f11262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f11263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f11264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f11265i;
    public final i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f11266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11267c;

    static {
        i iVar = i.f13191v;
        f11260d = d.r(":");
        f11261e = d.r(":status");
        f11262f = d.r(":method");
        f11263g = d.r(":path");
        f11264h = d.r(":scheme");
        f11265i = d.r(":authority");
    }

    public b(i iVar, i iVar2) {
        p210v8.i.f(iVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(iVar2, "value");
        this.a = iVar;
        this.f11266b = iVar2;
        this.f11267c = iVar2.h() + iVar.h() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p210v8.i.a(this.a, bVar.a) && p210v8.i.a(this.f11266b, bVar.f11266b);
    }

    public final int hashCode() {
        return this.f11266b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.o() + ": " + this.f11266b.o();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(d.r(str), d.r(str2));
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, "value");
        i iVar = i.f13191v;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(i iVar, String str) {
        this(iVar, d.r(str));
        p210v8.i.f(iVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(str, "value");
        i iVar2 = i.f13191v;
    }
}
