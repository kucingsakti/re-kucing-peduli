package F8;

import A9.AbstractC0151y;
import L8.InterfaceC0271e;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: F8.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0227v extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0229x f1636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ A f1637u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0227v(C0229x c0229x, A a, int i10) {
        super(0);
        this.f1635s = i10;
        this.f1636t = c0229x;
        this.f1637u = a;
    }

    @Override // p200u8.a
    public final Object invoke() {
        A a = this.f1637u;
        C0229x c0229x = this.f1636t;
        switch (this.f1635s) {
            case 0:
                if (a.f1508t.isAnonymousClass()) {
                    return null;
                }
                p096j9.b bVarP = a.p();
                if (!bVarP.f12542c) {
                    String strG = bVarP.i().g();
                    p210v8.i.e(strG, "classId.shortClassName.asString()");
                    return strG;
                }
                c0229x.getClass();
                Class cls = a.f1508t;
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return L9.f.d0(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return L9.f.e0(simpleName);
                }
                return L9.f.d0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            case 1:
                Collection<AbstractC0151y> collectionT = c0229x.a().I().t();
                p210v8.i.e(collectionT, "descriptor.typeConstructor.supertypes");
                ArrayList arrayList = new ArrayList(collectionT.size());
                for (AbstractC0151y abstractC0151y : collectionT) {
                    p210v8.i.e(abstractC0151y, "kotlinType");
                    arrayList.add(new m0(abstractC0151y, new A0.j(abstractC0151y, c0229x, a, 3)));
                }
                InterfaceC0271e interfaceC0271eA = c0229x.a();
                p096j9.f fVar = I8.i.f2112e;
                if (!I8.i.b(interfaceC0271eA, I8.n.a) && !I8.i.b(interfaceC0271eA, I8.n.f2164b)) {
                    if (arrayList.isEmpty()) {
                        arrayList.add(new m0(p165q9.d.e(c0229x.a()).e(), C0228w.f1638s));
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int iM = p124m9.e.c(((m0) it.next()).a).M();
                            AbstractC0487g.u(iM, "getClassDescriptorForType(it.type).kind");
                            if (iM == 2 || iM == 5) {
                            }
                        }
                        arrayList.add(new m0(p165q9.d.e(c0229x.a()).e(), C0228w.f1638s));
                    }
                }
                return J9.l.e(arrayList);
            default:
                List listY = c0229x.a().y();
                p210v8.i.e(listY, "descriptor.declaredTypeParameters");
                List<L8.P> list = listY;
                ArrayList arrayList2 = new ArrayList(p086i8.m.H(list, 10));
                for (L8.P p10 : list) {
                    p210v8.i.e(p10, "descriptor");
                    arrayList2.add(new n0(a, p10));
                }
                return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0227v(A a, C0229x c0229x) {
        super(0);
        this.f1635s = 0;
        this.f1637u = a;
        this.f1636t = c0229x;
    }
}
