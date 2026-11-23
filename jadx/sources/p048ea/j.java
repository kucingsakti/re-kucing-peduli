package p048ea;

import java.io.IOException;
import p010aa.a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f11288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11290g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, o oVar, int i10, int i11) {
        super(str, true);
        this.f11288e = oVar;
        this.f11289f = i10;
        this.f11290g = i11;
    }

    @Override // p010aa.a
    public final long a() {
        int i10 = this.f11289f;
        int i11 = this.f11290g;
        o oVar = this.f11288e;
        oVar.getClass();
        try {
            oVar.f11319O.i(i10, i11, true);
            return -1L;
        } catch (IOException e10) {
            oVar.b(e10);
            return -1L;
        }
    }
}
