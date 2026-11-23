package p188t1;

import E4.B;
import T3.c;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.internal.measurement.S;
import com.kcstream.cing.MainApp;
import p086i8.C;
import p204v1.d;
import p204v1.e;
import p204v1.f;
import p204v1.j;

/* JADX INFO: loaded from: classes.dex */
public final class L extends C {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f14986i;

    static {
        AbstractC0487g.r("036DB9870BEBC1B5897E0B468D487A30CAC7A9", "036DB98702F0C4B0837E41098B5D7935D1C2ABF4");
    }

    public L(f fVar, S s9, j jVar, c cVar) {
        super(fVar, s9, jVar);
        this.f14986i = cVar;
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
        F fB = d.b(new B(this, 18, mainApp));
        j jVar = this.f14972h;
        d.f(jVar.f15407c, 32);
        e eVar = jVar.f15406b;
        eVar.b();
        e(C.a(C.c("156CBBCF0CECC6AE877B3C1C945F71")), fB);
        if (fB.b()) {
            h(eVar.b(), C.a(C.c("156CBBCF0CECC6AE877B3C1C945F71")));
        }
        if (fB.a()) {
            jVar.a(eVar.b(), C.a(C.c("156CA0DB1FF6D1A2825E011B8F4C7838C2DDA7EF5DE53D0848E1A0")));
        }
    }
}
