package p188t1;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.internal.measurement.S;
import p204v1.d;
import p204v1.f;
import p204v1.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class C extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S f14971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f14972h;

    static {
        AbstractC0487g.r("156CA0DB1FF6D1A2825E011B8F4C7838C2DDA7EF5DE53D0848E1A0", "156CBBCF0CECC6AE877B3C1C945F71");
    }

    public C(f fVar, S s9, j jVar) {
        super(fVar);
        this.f14971g = s9;
        this.f14972h = jVar;
    }

    @Override // p188t1.Q
    public final boolean c() {
        return d.g(this.f14972h.f15406b.b());
    }
}
