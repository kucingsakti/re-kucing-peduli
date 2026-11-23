package Q9;

import N9.C0324g;

/* JADX INFO: loaded from: classes.dex */
public final class r extends R9.c {
    public long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0324g f4401b;

    @Override // R9.c
    public final boolean a(R9.a aVar) {
        p pVar = (p) aVar;
        if (this.a >= 0) {
            return false;
        }
        long j = pVar.f4397y;
        if (j < pVar.f4398z) {
            pVar.f4398z = j;
        }
        this.a = j;
        return true;
    }

    @Override // R9.c
    public final p123m8.d[] b(R9.a aVar) {
        long j = this.a;
        this.a = -1L;
        this.f4401b = null;
        return ((p) aVar).s(j);
    }
}
