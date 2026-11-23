package I4;

import C8.E;
import p170r3.e;
import p170r3.i;
import p170r3.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public Object a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2069b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2070c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2071d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2072e = new p170r3.a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2073f = new p170r3.a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2074g = new p170r3.a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f2075h = new p170r3.a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f2076i = new e(0);
    public Object j = new e(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f2077k = new e(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f2078l = new e(0);

    public static void b(E e10) {
        if (e10 instanceof i) {
            ((i) e10).getClass();
        } else if (e10 instanceof p170r3.d) {
            ((p170r3.d) e10).getClass();
        }
    }

    public j a() {
        j jVar = new j();
        jVar.a = (E) this.a;
        jVar.f14510b = (E) this.f2069b;
        jVar.f14511c = (E) this.f2070c;
        jVar.f14512d = (E) this.f2071d;
        jVar.f14513e = (p170r3.c) this.f2072e;
        jVar.f14514f = (p170r3.c) this.f2073f;
        jVar.f14515g = (p170r3.c) this.f2074g;
        jVar.f14516h = (p170r3.c) this.f2075h;
        jVar.f14517i = (e) this.f2076i;
        jVar.j = (e) this.j;
        jVar.f14518k = (e) this.f2077k;
        jVar.f14519l = (e) this.f2078l;
        return jVar;
    }

    public void c(float f10) {
        this.f2072e = new p170r3.a(f10);
        this.f2073f = new p170r3.a(f10);
        this.f2074g = new p170r3.a(f10);
        this.f2075h = new p170r3.a(f10);
    }
}
