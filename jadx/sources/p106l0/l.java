package p106l0;

import java.nio.ByteBuffer;
import p116m0.a;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public int a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f12864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f12865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12867f;

    public l(o oVar) {
        this.f12863b = oVar;
        this.f12864c = oVar;
    }

    public final void a() {
        this.a = 1;
        this.f12864c = this.f12863b;
        this.f12867f = 0;
    }

    public final boolean b() {
        a aVarB = this.f12864c.f12877b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f4778v).get(iA + aVarB.f4775s) == 0) || this.f12866e == 65039;
    }
}
