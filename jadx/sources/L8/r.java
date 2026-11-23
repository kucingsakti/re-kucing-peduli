package L8;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f2833t = new r(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final r f2834u = new r(1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final r f2835v = new r(1, 2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r f2836w = new r(1, 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final r f2837x = new r(1, 4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2838s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11) {
        super(i10);
        this.f2838s = i11;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f2838s) {
            case 0:
                p210v8.i.f((p096j9.b) obj, "it");
                return 0;
            case 1:
                D d3 = (D) obj;
                p210v8.i.f(d3, "it");
                return ((O8.E) d3).f3634w;
            case 2:
                InterfaceC0276j interfaceC0276j = (InterfaceC0276j) obj;
                p210v8.i.f(interfaceC0276j, "it");
                return Boolean.valueOf(interfaceC0276j instanceof InterfaceC0268b);
            case 3:
                InterfaceC0276j interfaceC0276j2 = (InterfaceC0276j) obj;
                p210v8.i.f(interfaceC0276j2, "it");
                return Boolean.valueOf(!(interfaceC0276j2 instanceof InterfaceC0275i));
            default:
                InterfaceC0276j interfaceC0276j3 = (InterfaceC0276j) obj;
                p210v8.i.f(interfaceC0276j3, "it");
                List listZ = ((InterfaceC0268b) interfaceC0276j3).z();
                p210v8.i.e(listZ, "it as CallableDescriptor).typeParameters");
                return p086i8.k.N(listZ);
        }
    }
}
