package t9;

import L8.InterfaceC0268b;
import L8.K;
import O8.N;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f15254t = new k(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f15255u = new k(1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k f15256v = new k(1, 2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k f15257w = new k(1, 3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15258s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f15258s = i11;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f15258s) {
            case 0:
                p210v8.i.f((p096j9.f) obj, "it");
                return Boolean.TRUE;
            case 1:
                InterfaceC0268b interfaceC0268b = (InterfaceC0268b) obj;
                p210v8.i.f(interfaceC0268b, "$this$selectMostSpecificInEachOverridableGroup");
                return interfaceC0268b;
            case 2:
                N n10 = (N) obj;
                p210v8.i.f(n10, "$this$selectMostSpecificInEachOverridableGroup");
                return n10;
            default:
                K k3 = (K) obj;
                p210v8.i.f(k3, "$this$selectMostSpecificInEachOverridableGroup");
                return k3;
        }
    }
}
