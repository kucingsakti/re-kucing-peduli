package p030ca;

import X9.G;
import X9.L;
import X9.z;
import java.util.ArrayList;
import p020ba.e;
import p020ba.i;
import p140o4.r;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f7578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G f7579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7583i;

    public f(i iVar, ArrayList arrayList, int i10, r rVar, G g8, int i11, int i12, int i13) {
        p210v8.i.f(iVar, "call");
        p210v8.i.f(g8, "request");
        this.a = iVar;
        this.f7576b = arrayList;
        this.f7577c = i10;
        this.f7578d = rVar;
        this.f7579e = g8;
        this.f7580f = i11;
        this.f7581g = i12;
        this.f7582h = i13;
    }

    public static f a(f fVar, int i10, r rVar, G g8, int i11) {
        if ((i11 & 1) != 0) {
            i10 = fVar.f7577c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            rVar = fVar.f7578d;
        }
        r rVar2 = rVar;
        if ((i11 & 4) != 0) {
            g8 = fVar.f7579e;
        }
        G g10 = g8;
        p210v8.i.f(g10, "request");
        return new f(fVar.a, fVar.f7576b, i12, rVar2, g10, fVar.f7580f, fVar.f7581g, fVar.f7582h);
    }

    public final L b(G g8) {
        p210v8.i.f(g8, "request");
        ArrayList arrayList = this.f7576b;
        int size = arrayList.size();
        int i10 = this.f7577c;
        if (i10 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f7583i++;
        r rVar = this.f7578d;
        if (rVar != null) {
            if (!((e) rVar.f13783u).b(g8.a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f7583i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        f fVarA = a(this, i11, null, g8, 58);
        z zVar = (z) arrayList.get(i10);
        L lA = zVar.a(fVarA);
        if (lA == null) {
            throw new NullPointerException("interceptor " + zVar + " returned null");
        }
        if (rVar != null && i11 < arrayList.size() && fVarA.f7583i != 1) {
            throw new IllegalStateException(("network interceptor " + zVar + " must call proceed() exactly once").toString());
        }
        if (lA.f5537y != null) {
            return lA;
        }
        throw new IllegalStateException(("interceptor " + zVar + " returned a response with no body").toString());
    }
}
