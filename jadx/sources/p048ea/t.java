package p048ea;

import Y9.c;
import java.io.IOException;
import ma.f;
import ma.v;
import ma.y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class t implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11346s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f11347t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11348u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v f11349v;

    public t(v vVar, boolean z6) {
        i.f(vVar, "this$0");
        this.f11349v = vVar;
        this.f11346s = z6;
        this.f11347t = new f();
    }

    @Override // ma.v
    public final void C(f fVar, long j) throws IOException {
        i.f(fVar, "source");
        byte[] bArr = c.a;
        f fVar2 = this.f11347t;
        fVar2.C(fVar, j);
        while (fVar2.f13190t >= 16384) {
            a(false);
        }
    }

    public final void a(boolean z6) throws IOException {
        long jMin;
        boolean z10;
        v vVar = this.f11349v;
        synchronized (vVar) {
            vVar.f11365l.h();
            while (vVar.f11359e >= vVar.f11360f && !this.f11346s && !this.f11348u && vVar.f() == null) {
                try {
                    vVar.l();
                } catch (Throwable th) {
                    vVar.f11365l.k();
                    throw th;
                }
            }
            vVar.f11365l.k();
            vVar.b();
            jMin = Math.min(vVar.f11360f - vVar.f11359e, this.f11347t.f13190t);
            vVar.f11359e += jMin;
            z10 = z6 && jMin == this.f11347t.f13190t;
        }
        this.f11349v.f11365l.h();
        try {
            v vVar2 = this.f11349v;
            vVar2.f11356b.l(vVar2.a, z10, this.f11347t, jMin);
        } finally {
            this.f11349v.f11365l.k();
        }
    }

    @Override // ma.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        v vVar = this.f11349v;
        byte[] bArr = c.a;
        synchronized (vVar) {
            if (this.f11348u) {
                return;
            }
            boolean z6 = vVar.f() == null;
            v vVar2 = this.f11349v;
            if (!vVar2.j.f11346s) {
                if (this.f11347t.f13190t > 0) {
                    while (this.f11347t.f13190t > 0) {
                        a(true);
                    }
                } else if (z6) {
                    vVar2.f11356b.l(vVar2.a, true, null, 0L);
                }
            }
            synchronized (this.f11349v) {
                this.f11348u = true;
            }
            this.f11349v.f11356b.flush();
            this.f11349v.a();
        }
    }

    @Override // ma.v
    public final y e() {
        return this.f11349v.f11365l;
    }

    @Override // ma.v, java.io.Flushable
    public final void flush() throws IOException {
        v vVar = this.f11349v;
        byte[] bArr = c.a;
        synchronized (vVar) {
            vVar.b();
        }
        while (this.f11347t.f13190t > 0) {
            a(false);
            this.f11349v.f11356b.flush();
        }
    }
}
