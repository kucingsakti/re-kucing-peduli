package U8;

import L8.InterfaceC0269c;
import L8.InterfaceC0285t;
import O8.N;
import O8.U;

/* JADX INFO: renamed from: U8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0444e extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0444e f4963t = new C0444e(1, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0444e f4964u = new C0444e(1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0444e f4965v = new C0444e(1, 2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0444e f4966w = new C0444e(1, 3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0444e f4967x = new C0444e(1, 4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0444e f4968y = new C0444e(1, 5);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0444e f4969z = new C0444e(1, 6);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4970s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0444e(int i10, int i11) {
        super(i10);
        this.f4970s = i11;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        InterfaceC0269c interfaceC0269cB;
        String strD;
        boolean z6 = false;
        switch (this.f4970s) {
            case 0:
                InterfaceC0269c interfaceC0269c = (InterfaceC0269c) obj;
                p210v8.i.f(interfaceC0269c, "it");
                int i10 = C0445f.f4971l;
                return Boolean.valueOf(p086i8.k.O(F.f4941f, qa.b.d(interfaceC0269c)));
            case 1:
                InterfaceC0269c interfaceC0269c2 = (InterfaceC0269c) obj;
                p210v8.i.f(interfaceC0269c2, "it");
                if (interfaceC0269c2 instanceof InterfaceC0285t) {
                    int i11 = C0445f.f4971l;
                    if (p086i8.k.O(F.f4941f, qa.b.d(interfaceC0269c2))) {
                        z6 = true;
                    }
                }
                return Boolean.valueOf(z6);
            case 2:
                InterfaceC0269c interfaceC0269c3 = (InterfaceC0269c) obj;
                p210v8.i.f(interfaceC0269c3, "it");
                return Boolean.valueOf(p181s3.a.m(interfaceC0269c3));
            case 3:
                return ((U) obj).getType();
            case 4:
                InterfaceC0269c interfaceC0269c4 = (InterfaceC0269c) obj;
                p210v8.i.f(interfaceC0269c4, "it");
                return Boolean.valueOf(p181s3.a.m(p165q9.d.k(interfaceC0269c4)));
            case 5:
                InterfaceC0269c interfaceC0269c5 = (InterfaceC0269c) obj;
                p210v8.i.f(interfaceC0269c5, "it");
                int i12 = AbstractC0443d.f4962l;
                N n10 = (N) interfaceC0269c5;
                if (I8.i.z(n10) && p165q9.d.b(n10, new A0.m(n10, 17)) != null) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            default:
                InterfaceC0269c interfaceC0269c6 = (InterfaceC0269c) obj;
                p210v8.i.f(interfaceC0269c6, "it");
                if (I8.i.z(interfaceC0269c6)) {
                    int i13 = C0445f.f4971l;
                    if (F.f4940e.contains(interfaceC0269c6.getName()) && (interfaceC0269cB = p165q9.d.b(interfaceC0269c6, f4964u)) != null && (strD = qa.b.d(interfaceC0269cB)) != null) {
                        if (!F.f4937b.contains(strD)) {
                        }
                        z6 = true;
                    }
                }
                return Boolean.valueOf(z6);
        }
    }
}
