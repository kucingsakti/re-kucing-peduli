package p220w9;

import F8.m0;
import F8.p0;
import F8.r0;
import I4.c;
import K0.q;
import L8.InterfaceC0276j;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import p076h8.d;
import p086i8.s;
import p104k9.AbstractC0682k;
import p200u8.a;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class m extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f15669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f15670v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(m0 m0Var, int i10, d dVar) {
        super(0);
        this.f15667s = 2;
        this.f15668t = m0Var;
        this.f15670v = i10;
        this.f15669u = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [h8.d, java.lang.Object] */
    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f15667s) {
            case 0:
                q qVar = (q) this.f15668t;
                q qVarA = qVar.a((InterfaceC0276j) qVar.a.f5173c);
                List listS0 = qVarA != null ? p086i8.k.s0(((a) ((c) qVar.a.a).f2082e).F(qVarA, (AbstractC0682k) this.f15669u, this.f15670v)) : null;
                return listS0 == null ? s.f12328s : listS0;
            case 1:
                q qVar2 = (q) this.f15668t;
                q qVarA2 = qVar2.a((InterfaceC0276j) qVar2.a.f5173c);
                List listT0 = qVarA2 != null ? ((a) ((c) qVar2.a.a).f2082e).t0(qVarA2, (AbstractC0682k) this.f15669u, this.f15670v) : null;
                return listT0 == null ? s.f12328s : listT0;
            default:
                m0 m0Var = (m0) this.f15668t;
                r0 r0Var = m0Var.f1604b;
                Type type = r0Var != null ? (Type) r0Var.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    i.e(componentType, "{\n                      …                        }");
                    return componentType;
                }
                boolean z6 = type instanceof GenericArrayType;
                int i10 = this.f15670v;
                if (z6) {
                    if (i10 == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        i.e(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new p0("Array type has been queried for a non-0th argument: " + m0Var, 0);
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new p0("Non-generic type has been queried for arguments: " + m0Var, 0);
                }
                Type type2 = (Type) ((List) this.f15669u.getValue()).get(i10);
                if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    i.e(lowerBounds, "argument.lowerBounds");
                    Type type3 = (Type) p086i8.i.w(lowerBounds);
                    if (type3 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        i.e(upperBounds, "argument.upperBounds");
                        type2 = (Type) p086i8.i.v(upperBounds);
                    } else {
                        type2 = type3;
                    }
                }
                i.e(type2, "{\n                      …                        }");
                return type2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, AbstractC0682k abstractC0682k, int i10, int i11) {
        super(0);
        this.f15667s = i11;
        this.f15668t = qVar;
        this.f15669u = abstractC0682k;
        this.f15670v = i10;
    }
}
