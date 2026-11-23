package p048ea;

import java.io.IOException;
import java.util.List;
import p010aa.a;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f11296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f11298h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, o oVar, int i10, Object obj, int i11) {
        super(str, true);
        this.f11295e = i11;
        this.f11296f = oVar;
        this.f11297g = i10;
        this.f11298h = obj;
    }

    private final long b() {
        this.f11296f.f11307C.getClass();
        try {
            this.f11296f.f11319O.j(this.f11297g, a.CANCEL);
            synchronized (this.f11296f) {
                this.f11296f.f11320Q.remove(Integer.valueOf(this.f11297g));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }

    @Override // p010aa.a
    public final long a() {
        switch (this.f11295e) {
            case 0:
                this.f11296f.f11307C.getClass();
                try {
                    this.f11296f.f11319O.j(this.f11297g, a.CANCEL);
                    synchronized (this.f11296f) {
                        this.f11296f.f11320Q.remove(Integer.valueOf(this.f11297g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            case 1:
                return b();
            default:
                o oVar = this.f11296f;
                try {
                    oVar.f11319O.j(this.f11297g, (a) this.f11298h);
                    return -1L;
                } catch (IOException e10) {
                    oVar.b(e10);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, o oVar, int i10, List list, boolean z6) {
        super(str, true);
        this.f11295e = 0;
        this.f11296f = oVar;
        this.f11297g = i10;
        this.f11298h = list;
    }
}
