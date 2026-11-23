package y0;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f15879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G f15880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f15881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F f15882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final G f15883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final F f15884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final F f15885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final G f15886i;
    public static final F j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final F f15887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final G f15888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final F f15889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final F f15890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final G f15891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final F f15892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final F f15893q;
    public final boolean a;

    static {
        boolean z6 = false;
        f15879b = new G(2, z6);
        f15880c = new G(4, z6);
        boolean z10 = true;
        f15881d = new F(4, z10);
        f15882e = new F(5, z10);
        f15883f = new G(3, z6);
        f15884g = new F(6, z10);
        f15885h = new F(7, z10);
        f15886i = new G(1, z6);
        j = new F(2, z10);
        f15887k = new F(3, z10);
        f15888l = new G(0, z6);
        f15889m = new F(0, z10);
        f15890n = new F(1, z10);
        f15891o = new G(5, z10);
        f15892p = new F(8, z10);
        f15893q = new F(9, z10);
    }

    public M(boolean z6) {
        this.a = z6;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
