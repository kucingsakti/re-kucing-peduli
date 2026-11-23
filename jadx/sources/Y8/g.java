package Y8;

import L8.AbstractC0287v;
import L8.P;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f5752t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i10) {
        super(0);
        this.f5751s = i10;
        this.f5752t = jVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f5751s) {
            case 0:
                return AbstractC0287v.c(this.f5752t);
            case 1:
                j jVar = this.f5752t;
                ArrayList<R8.B> arrayListZ = jVar.f5771z.z();
                ArrayList arrayList = new ArrayList(p086i8.m.H(arrayListZ, 10));
                for (R8.B b3 : arrayListZ) {
                    P pA = ((X8.d) jVar.f5757B.f1660u).a(b3);
                    if (pA == null) {
                        throw new AssertionError("Parameter " + b3 + " surely belongs to class " + jVar.f5771z + ", so it must be resolved");
                    }
                    arrayList.add(pA);
                }
                return arrayList;
            default:
                j jVar2 = this.f5752t;
                if (p165q9.d.f(jVar2) == null) {
                    return null;
                }
                ((p029c9.e) ((I4.a) jVar2.f5770y.f1659t).f2067w).getClass();
                return null;
        }
    }
}
