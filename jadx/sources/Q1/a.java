package Q1;

import A1.p;
import H1.AbstractC0236e;
import H1.m;
import H1.r;
import U1.n;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p232y1.h;
import p232y1.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f3943D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f3944E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f3946G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3947s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3954z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p f3948t = p.f162e;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.bumptech.glide.g f3949u = com.bumptech.glide.g.f7605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3950v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3951w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3952x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p232y1.e f3953y = T1.a.f4625b;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public h f3940A = new h();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public U1.c f3941B = new U1.c(0);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Class f3942C = Object.class;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f3945F = true;

    public static boolean f(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public a a(a aVar) {
        if (this.f3944E) {
            return clone().a(aVar);
        }
        int i10 = aVar.f3947s;
        if (f(aVar.f3947s, 1048576)) {
            this.f3946G = aVar.f3946G;
        }
        if (f(aVar.f3947s, 4)) {
            this.f3948t = aVar.f3948t;
        }
        if (f(aVar.f3947s, 8)) {
            this.f3949u = aVar.f3949u;
        }
        if (f(aVar.f3947s, 16)) {
            this.f3947s &= -33;
        }
        if (f(aVar.f3947s, 32)) {
            this.f3947s &= -17;
        }
        if (f(aVar.f3947s, 64)) {
            this.f3947s &= -129;
        }
        if (f(aVar.f3947s, 128)) {
            this.f3947s &= -65;
        }
        if (f(aVar.f3947s, 256)) {
            this.f3950v = aVar.f3950v;
        }
        if (f(aVar.f3947s, 512)) {
            this.f3952x = aVar.f3952x;
            this.f3951w = aVar.f3951w;
        }
        if (f(aVar.f3947s, 1024)) {
            this.f3953y = aVar.f3953y;
        }
        if (f(aVar.f3947s, 4096)) {
            this.f3942C = aVar.f3942C;
        }
        if (f(aVar.f3947s, 8192)) {
            this.f3947s &= -16385;
        }
        if (f(aVar.f3947s, 16384)) {
            this.f3947s &= -8193;
        }
        if (f(aVar.f3947s, 131072)) {
            this.f3954z = aVar.f3954z;
        }
        if (f(aVar.f3947s, 2048)) {
            this.f3941B.putAll(aVar.f3941B);
            this.f3945F = aVar.f3945F;
        }
        this.f3947s |= aVar.f3947s;
        this.f3940A.f16018b.h(aVar.f3940A.f16018b);
        k();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            h hVar = new h();
            aVar.f3940A = hVar;
            hVar.f16018b.h(this.f3940A.f16018b);
            U1.c cVar = new U1.c(0);
            aVar.f3941B = cVar;
            cVar.putAll(this.f3941B);
            aVar.f3943D = false;
            aVar.f3944E = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final a d(Class cls) {
        if (this.f3944E) {
            return clone().d(cls);
        }
        this.f3942C = cls;
        this.f3947s |= 4096;
        k();
        return this;
    }

    public final a e(p pVar) {
        if (this.f3944E) {
            return clone().e(pVar);
        }
        this.f3948t = pVar;
        this.f3947s |= 4;
        k();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = n.a;
        return this.f3950v == aVar.f3950v && this.f3951w == aVar.f3951w && this.f3952x == aVar.f3952x && this.f3954z == aVar.f3954z && this.f3948t.equals(aVar.f3948t) && this.f3949u == aVar.f3949u && this.f3940A.equals(aVar.f3940A) && this.f3941B.equals(aVar.f3941B) && this.f3942C.equals(aVar.f3942C) && this.f3953y.equals(aVar.f3953y);
    }

    public final a h(m mVar, AbstractC0236e abstractC0236e) {
        if (this.f3944E) {
            return clone().h(mVar, abstractC0236e);
        }
        l(m.f1879g, mVar);
        return r(abstractC0236e, false);
    }

    public int hashCode() {
        char[] cArr = n.a;
        return n.h(n.h(n.h(n.h(n.h(n.h(n.h(n.g(0, n.g(0, n.g(1, n.g(this.f3954z ? 1 : 0, n.g(this.f3952x, n.g(this.f3951w, n.g(this.f3950v ? 1 : 0, n.h(n.g(0, n.h(n.g(0, n.h(n.g(0, n.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f3948t), this.f3949u), this.f3940A), this.f3941B), this.f3942C), this.f3953y), null);
    }

    public final a i(int i10, int i11) {
        if (this.f3944E) {
            return clone().i(i10, i11);
        }
        this.f3952x = i10;
        this.f3951w = i11;
        this.f3947s |= 512;
        k();
        return this;
    }

    public final a j() {
        com.bumptech.glide.g gVar = com.bumptech.glide.g.f7606v;
        if (this.f3944E) {
            return clone().j();
        }
        this.f3949u = gVar;
        this.f3947s |= 8;
        k();
        return this;
    }

    public final void k() {
        if (this.f3943D) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a l(p232y1.g gVar, m mVar) {
        if (this.f3944E) {
            return clone().l(gVar, mVar);
        }
        U1.f.b(gVar);
        this.f3940A.f16018b.put(gVar, mVar);
        k();
        return this;
    }

    public final a m(T1.b bVar) {
        if (this.f3944E) {
            return clone().m(bVar);
        }
        this.f3953y = bVar;
        this.f3947s |= 1024;
        k();
        return this;
    }

    public final a p() {
        if (this.f3944E) {
            return clone().p();
        }
        this.f3950v = false;
        this.f3947s |= 256;
        k();
        return this;
    }

    public final a q(Class cls, l lVar, boolean z6) {
        if (this.f3944E) {
            return clone().q(cls, lVar, z6);
        }
        U1.f.b(lVar);
        this.f3941B.put(cls, lVar);
        int i10 = this.f3947s;
        this.f3947s = 67584 | i10;
        this.f3945F = false;
        if (z6) {
            this.f3947s = i10 | 198656;
            this.f3954z = true;
        }
        k();
        return this;
    }

    public final a r(l lVar, boolean z6) {
        if (this.f3944E) {
            return clone().r(lVar, z6);
        }
        r rVar = new r(lVar, z6);
        q(Bitmap.class, lVar, z6);
        q(Drawable.class, rVar, z6);
        q(BitmapDrawable.class, rVar, z6);
        q(L1.c.class, new L1.d(lVar), z6);
        k();
        return this;
    }

    public final a s() {
        if (this.f3944E) {
            return clone().s();
        }
        this.f3946G = true;
        this.f3947s |= 1048576;
        k();
        return this;
    }
}
