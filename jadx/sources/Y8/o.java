package Y8;

import R8.C0407b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f5785t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i10) {
        super(0);
        this.f5784s = i10;
        this.f5785t = pVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f5784s) {
            case 0:
                Collection collectionB = this.f5785t.f5787o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionB) {
                    if (((R8.t) obj).a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iS = p086i8.z.s(p086i8.m.H(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((R8.t) obj2).c(), obj2);
                }
                return linkedHashMap;
            case 1:
                Class<?>[] declaredClasses = this.f5785t.f5787o.a.getDeclaredClasses();
                p210v8.i.e(declaredClasses, "klass.declaredClasses");
                return p086i8.k.w0(K9.n.B(K9.n.A(new K9.g(p086i8.i.m(declaredClasses), false, C0407b.f4459v), C0407b.f4460w)));
            default:
                p pVar = this.f5785t;
                return p086i8.C.u(pVar.d(), pVar.e());
        }
    }
}
