package p048ea;

import java.io.IOException;
import ma.f;
import p010aa.a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f11291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f11293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11294h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, o oVar, int i10, f fVar, int i11, boolean z6) {
        super(str, true);
        this.f11291e = oVar;
        this.f11292f = i10;
        this.f11293g = fVar;
        this.f11294h = i11;
    }

    @Override // p010aa.a
    public final long a() {
        try {
            y yVar = this.f11291e.f11307C;
            f fVar = this.f11293g;
            int i10 = this.f11294h;
            yVar.getClass();
            fVar.X(i10);
            this.f11291e.f11319O.j(this.f11292f, a.CANCEL);
            synchronized (this.f11291e) {
                this.f11291e.f11320Q.remove(Integer.valueOf(this.f11292f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
