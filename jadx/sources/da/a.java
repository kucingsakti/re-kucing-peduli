package da;

import B4.C0157e;
import java.io.IOException;
import ma.l;
import ma.r;
import ma.w;
import ma.y;
import p020ba.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f10574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10575t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0157e f10576u;

    public a(C0157e c0157e) {
        i.f(c0157e, "this$0");
        this.f10576u = c0157e;
        this.f10574s = new l(((r) c0157e.f668e).f13212s.e());
    }

    public final void a() {
        C0157e c0157e = this.f10576u;
        int i10 = c0157e.f666c;
        if (i10 == 6) {
            return;
        }
        if (i10 != 5) {
            throw new IllegalStateException(i.k(Integer.valueOf(c0157e.f666c), "state: "));
        }
        l lVar = this.f10574s;
        y yVar = lVar.f13197e;
        lVar.f13197e = y.f13225d;
        yVar.a();
        yVar.b();
        c0157e.f666c = 6;
    }

    @Override // ma.w
    public final y e() {
        return this.f10574s;
    }

    @Override // ma.w
    public long u(ma.f fVar, long j) throws IOException {
        C0157e c0157e = this.f10576u;
        i.f(fVar, "sink");
        try {
            return ((r) c0157e.f668e).u(fVar, j);
        } catch (IOException e10) {
            ((k) c0157e.f667d).l();
            a();
            throw e10;
        }
    }
}
