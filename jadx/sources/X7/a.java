package X7;

import J7.o;
import J7.p;
import N7.c;
import T7.k;
import V.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f5423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f5424c;

    public /* synthetic */ a(o oVar, c cVar, int i10) {
        this.a = i10;
        this.f5423b = oVar;
        this.f5424c = cVar;
    }

    @Override // J7.o
    public final void c(p pVar) {
        switch (this.a) {
            case 0:
                ((k) this.f5423b).b(new o1.c(pVar, 11, (h) this.f5424c));
                break;
            default:
                this.f5423b.b(new R7.a(pVar, 3, this.f5424c));
                break;
        }
    }
}
