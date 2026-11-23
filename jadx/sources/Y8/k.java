package Y8;

import A9.AbstractC0151y;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import O8.N;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f5772t = new k(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f5773u = new k(1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k f5774v = new k(1, 2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k f5775w = new k(1, 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k f5776x = new k(1, 4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5777s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f5777s = i11;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f5777s) {
            case 0:
                R8.v vVar = (R8.v) obj;
                p210v8.i.f(vVar, "it");
                return Boolean.valueOf(!Modifier.isStatic(vVar.b().getModifiers()));
            case 1:
                N n10 = (N) obj;
                p210v8.i.f(n10, "$this$selectMostSpecificInEachOverridableGroup");
                return n10;
            case 2:
                R8.v vVar2 = (R8.v) obj;
                p210v8.i.f(vVar2, "it");
                return Boolean.valueOf(Modifier.isStatic(vVar2.b().getModifiers()));
            case 3:
                t9.n nVar = (t9.n) obj;
                p210v8.i.f(nVar, "it");
                return nVar.e();
            default:
                InterfaceC0273g interfaceC0273gW = ((AbstractC0151y) obj).D().w();
                if (interfaceC0273gW instanceof InterfaceC0271e) {
                    return (InterfaceC0271e) interfaceC0273gW;
                }
                return null;
        }
    }
}
