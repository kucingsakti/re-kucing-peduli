package p048ea;

import java.io.IOException;
import p010aa.a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f11301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f11303g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i10, long j) {
        super(str, true);
        this.f11301e = oVar;
        this.f11302f = i10;
        this.f11303g = j;
    }

    @Override // p010aa.a
    public final long a() {
        o oVar = this.f11301e;
        try {
            oVar.f11319O.n(this.f11302f, this.f11303g);
            return -1L;
        } catch (IOException e10) {
            oVar.b(e10);
            return -1L;
        }
    }
}
