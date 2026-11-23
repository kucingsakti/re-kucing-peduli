package A9;

import L8.InterfaceC0273g;
import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class V extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W f354c;

    public /* synthetic */ V(W w2, int i10) {
        this.f353b = i10;
        this.f354c = w2;
    }

    @Override // A9.W
    public boolean a() {
        switch (this.f353b) {
            case 1:
                return this.f354c.a();
            default:
                return super.a();
        }
    }

    @Override // A9.W
    public boolean b() {
        switch (this.f353b) {
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override // A9.W
    public final M8.h c(M8.h hVar) {
        switch (this.f353b) {
            case 0:
                p210v8.i.f(hVar, "annotations");
                break;
            default:
                p210v8.i.f(hVar, "annotations");
                break;
        }
        return this.f354c.c(hVar);
    }

    @Override // A9.W
    public final S d(AbstractC0151y abstractC0151y) {
        switch (this.f353b) {
            case 0:
                return this.f354c.d(abstractC0151y);
            default:
                S sD = this.f354c.d(abstractC0151y);
                if (sD == null) {
                    return null;
                }
                InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
                return p188t1.Y.j(sD, interfaceC0273gW instanceof L8.P ? (L8.P) interfaceC0273gW : null);
        }
    }

    @Override // A9.W
    public final boolean e() {
        switch (this.f353b) {
            case 0:
                break;
        }
        return this.f354c.e();
    }

    @Override // A9.W
    public final AbstractC0151y f(int i10, AbstractC0151y abstractC0151y) {
        switch (this.f353b) {
            case 0:
                p210v8.i.f(abstractC0151y, "topLevelType");
                AbstractC0487g.p(i10, "position");
                break;
            default:
                p210v8.i.f(abstractC0151y, "topLevelType");
                AbstractC0487g.p(i10, "position");
                break;
        }
        return this.f354c.f(i10, abstractC0151y);
    }
}
