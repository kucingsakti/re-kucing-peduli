package C9;

import A9.AbstractC0151y;
import A9.D;
import A9.K;
import A9.O;
import A9.d0;
import java.util.Arrays;
import java.util.List;
import t9.n;

/* JADX INFO: loaded from: classes.dex */
public final class f extends D {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final O f975t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e f976u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f977v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f979x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String[] f980y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f981z;

    public f(O o10, e eVar, h hVar, List list, boolean z6, String... strArr) {
        p210v8.i.f(hVar, "kind");
        p210v8.i.f(list, "arguments");
        p210v8.i.f(strArr, "formatParams");
        this.f975t = o10;
        this.f976u = eVar;
        this.f977v = hVar;
        this.f978w = list;
        this.f979x = z6;
        this.f980y = strArr;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f981z = String.format(hVar.f1013s, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // A9.AbstractC0151y
    public final O D() {
        return this.f975t;
    }

    @Override // A9.AbstractC0151y
    public final n E0() {
        return this.f976u;
    }

    @Override // A9.AbstractC0151y
    public final boolean H() {
        return this.f979x;
    }

    @Override // A9.d0
    public final d0 K0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // A9.D, A9.d0
    public final d0 N0(K k3) {
        p210v8.i.f(k3, "newAttributes");
        return this;
    }

    @Override // A9.D
    /* JADX INFO: renamed from: O0 */
    public final D G0(boolean z6) {
        String[] strArr = this.f980y;
        return new f(this.f975t, this.f976u, this.f977v, this.f978w, z6, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // A9.D
    /* JADX INFO: renamed from: P0 */
    public final D N0(K k3) {
        p210v8.i.f(k3, "newAttributes");
        return this;
    }

    @Override // A9.AbstractC0151y
    public final List l() {
        return this.f978w;
    }

    @Override // A9.AbstractC0151y
    public final AbstractC0151y l0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // A9.AbstractC0151y
    public final K o() {
        K.f338t.getClass();
        return K.f339u;
    }
}
