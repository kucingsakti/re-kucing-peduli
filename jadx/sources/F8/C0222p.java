package F8;

import A9.AbstractC0151y;
import L8.InterfaceC0269c;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: F8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0222p extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC0224s f1620t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0222p(AbstractC0224s abstractC0224s, int i10) {
        super(0);
        this.f1619s = i10;
        this.f1620t = abstractC0224s;
    }

    @Override // p200u8.a
    public final Object invoke() {
        int i10;
        Type[] lowerBounds;
        Type type = null;
        int i11 = 0;
        AbstractC0224s abstractC0224s = this.f1620t;
        switch (this.f1619s) {
            case 0:
                int size = (abstractC0224s.t() ? 1 : 0) + abstractC0224s.u().size();
                int size2 = (abstractC0224s.u().size() + 31) / 32;
                Object[] objArr = new Object[size + size2 + 1];
                Iterator it = abstractC0224s.u().iterator();
                while (it.hasNext()) {
                    U u3 = (U) ((C8.l) it.next());
                    L8.I iA = u3.a();
                    O8.U u10 = iA instanceof O8.U ? (O8.U) iA : null;
                    boolean zA = u10 != null ? p165q9.d.a(u10) : false;
                    int i12 = u3.f1545b;
                    if (zA) {
                        m0 m0VarC = u3.c();
                        p096j9.c cVar = y0.a;
                        AbstractC0151y abstractC0151y = m0VarC.a;
                        if (abstractC0151y == null || !p124m9.g.c(abstractC0151y)) {
                            m0 m0VarC2 = u3.c();
                            r0 r0Var = m0VarC2.f1604b;
                            Type typeG = r0Var != null ? (Type) r0Var.invoke() : null;
                            if (typeG == null) {
                                typeG = r0Var != null ? (Type) r0Var.invoke() : null;
                                if (typeG == null) {
                                    typeG = C8.E.g(m0VarC2, false);
                                }
                            }
                            objArr[i12] = y0.e(typeG);
                        }
                    }
                    L8.I iA2 = u3.a();
                    if ((iA2 instanceof O8.U) && ((O8.U) iA2).f3689B != null) {
                        Class clsO = p068ga.d.o(o1.f.j(u3.c()));
                        if (!clsO.isArray()) {
                            throw new p0("Cannot instantiate the default empty array of type " + clsO.getSimpleName() + ", because it is not an array type", 0);
                        }
                        Object objNewInstance = Array.newInstance(clsO.getComponentType(), 0);
                        p210v8.i.e(objNewInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
                        objArr[i12] = objNewInstance;
                    }
                }
                for (int i13 = 0; i13 < size2; i13++) {
                    objArr[size + i13] = 0;
                }
                return objArr;
            case 1:
                return y0.d(abstractC0224s.g());
            case 2:
                InterfaceC0269c interfaceC0269cG = abstractC0224s.g();
                ArrayList arrayList = new ArrayList();
                if (abstractC0224s.j()) {
                    i10 = 0;
                } else {
                    O8.x xVarG = y0.g(interfaceC0269cG);
                    if (xVarG != null) {
                        arrayList.add(new U(abstractC0224s, 0, C8.k.f958s, new C0223q(xVarG, 0)));
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    O8.x xVarR = interfaceC0269cG.R();
                    if (xVarR != null) {
                        arrayList.add(new U(abstractC0224s, i10, C8.k.f959t, new C0223q(xVarR, 1)));
                        i10++;
                    }
                }
                int size3 = interfaceC0269cG.H0().size();
                while (i11 < size3) {
                    arrayList.add(new U(abstractC0224s, i10, C8.k.f960u, new r(interfaceC0269cG, i11)));
                    i11++;
                    i10++;
                }
                if (abstractC0224s.i() && (interfaceC0269cG instanceof W8.a) && arrayList.size() > 1) {
                    p086i8.p.I(arrayList, new C0212f(1));
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                if (abstractC0224s.t()) {
                    Object objC0 = p086i8.k.c0(abstractC0224s.c().x());
                    ParameterizedType parameterizedType = objC0 instanceof ParameterizedType ? (ParameterizedType) objC0 : null;
                    if (p210v8.i.a(parameterizedType != null ? parameterizedType.getRawType() : null, p123m8.d.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        p210v8.i.e(actualTypeArguments, "continuationType.actualTypeArguments");
                        Object objC = p086i8.i.C(actualTypeArguments);
                        WildcardType wildcardType = objC instanceof WildcardType ? (WildcardType) objC : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) p086i8.i.v(lowerBounds);
                        }
                    }
                }
                return type == null ? abstractC0224s.c().w() : type;
            case 4:
                AbstractC0151y abstractC0151yW = abstractC0224s.g().w();
                p210v8.i.c(abstractC0151yW);
                return new m0(abstractC0151yW, new C0222p(abstractC0224s, 3));
            default:
                List listZ = abstractC0224s.g().z();
                p210v8.i.e(listZ, "descriptor.typeParameters");
                List<L8.P> list = listZ;
                ArrayList arrayList2 = new ArrayList(p086i8.m.H(list, 10));
                for (L8.P p10 : list) {
                    p210v8.i.e(p10, "descriptor");
                    arrayList2.add(new n0(abstractC0224s, p10));
                }
                return arrayList2;
        }
    }
}
