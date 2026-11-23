package p029c9;

import p200u8.c;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f7538t = new b(2, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f7539u = new b(2, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7540s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f7540s = i11;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7540s) {
            case 0:
                a aVar = (a) obj;
                n nVar = (n) obj2;
                i.f(aVar, "$this$loadConstantFromProperty");
                i.f(nVar, "it");
                return aVar.f7537c.get(nVar);
            default:
                a aVar2 = (a) obj;
                n nVar2 = (n) obj2;
                i.f(aVar2, "$this$loadConstantFromProperty");
                i.f(nVar2, "it");
                return aVar2.f7536b.get(nVar2);
        }
    }
}
