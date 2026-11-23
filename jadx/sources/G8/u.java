package G8;

import A1.C0099h;
import A9.AbstractC0151y;
import F8.p0;
import F8.y0;
import L8.InterfaceC0271e;
import L8.InterfaceC0275i;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import O8.U;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u implements e {
    public final e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0099h f1744c;

    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    public u(e eVar, InterfaceC0285t interfaceC0285t, boolean z6) {
        Method declaredMethod;
        C0099h c0099h;
        Class clsG;
        int i10 = 0;
        p210v8.i.f(interfaceC0285t, "descriptor");
        this.a = eVar;
        this.f1743b = z6;
        AbstractC0151y abstractC0151yW = interfaceC0285t.w();
        p210v8.i.c(abstractC0151yW);
        Class clsG2 = C4.a.G(abstractC0151yW);
        if (clsG2 != null) {
            try {
                declaredMethod = clsG2.getDeclaredMethod("box-impl", C4.a.z(clsG2, interfaceC0285t).getReturnType());
                p210v8.i.e(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            } catch (NoSuchMethodException unused) {
                throw new p0("No box method found in inline class: " + clsG2 + " (calling " + interfaceC0285t + ')', 0);
            }
        } else {
            declaredMethod = null;
        }
        if (p124m9.g.a(interfaceC0285t)) {
            c0099h = new C0099h(B8.c.f776v, new Method[0], declaredMethod);
        } else {
            int i11 = -1;
            if (!(eVar instanceof r)) {
                if (interfaceC0285t instanceof InterfaceC0275i) {
                    if (!(eVar instanceof d)) {
                        i11 = 0;
                    }
                } else if (interfaceC0285t.G() == null || (eVar instanceof d)) {
                    i11 = 0;
                } else {
                    InterfaceC0276j interfaceC0276jV = interfaceC0285t.v();
                    p210v8.i.e(interfaceC0276jV, "descriptor.containingDeclaration");
                    if (p124m9.g.b(interfaceC0276jV)) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            O8.x xVarR = interfaceC0285t.R();
            AbstractC0151y type = xVarR != null ? xVarR.getType() : null;
            if (type != null) {
                arrayList.add(type);
            } else if (interfaceC0285t instanceof InterfaceC0275i) {
                InterfaceC0271e interfaceC0271eQ = ((InterfaceC0275i) interfaceC0285t).Q();
                p210v8.i.e(interfaceC0271eQ, "descriptor.constructedClass");
                if (interfaceC0271eQ.r()) {
                    InterfaceC0276j interfaceC0276jV2 = interfaceC0271eQ.v();
                    p210v8.i.d(interfaceC0276jV2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList.add(((InterfaceC0271e) interfaceC0276jV2).p());
                }
            } else {
                InterfaceC0276j interfaceC0276jV3 = interfaceC0285t.v();
                p210v8.i.e(interfaceC0276jV3, "descriptor.containingDeclaration");
                if ((interfaceC0276jV3 instanceof InterfaceC0271e) && p124m9.g.b(interfaceC0276jV3)) {
                    arrayList.add(((InterfaceC0271e) interfaceC0276jV3).p());
                }
            }
            List listH0 = interfaceC0285t.H0();
            p210v8.i.e(listH0, "descriptor.valueParameters");
            Iterator it = listH0.iterator();
            while (it.hasNext()) {
                arrayList.add(((U) it.next()).getType());
            }
            int size = arrayList.size() + i11 + (interfaceC0285t.t() ? 1 : 0) + (this.f1743b ? ((arrayList.size() + 31) / 32) + 1 : 0);
            if (C3.b.o(this) != size) {
                throw new p0("Inconsistent number of parameters in the descriptor and Java reflection object: " + C3.b.o(this) + " != " + size + "\nCalling: " + interfaceC0285t + "\nParameter types: " + this.a.x() + ")\nDefault: " + this.f1743b, 0);
            }
            B8.c cVarW = p181s3.a.w(Math.max(i11, 0), arrayList.size() + i11);
            Method[] methodArr = new Method[size];
            while (i10 < size) {
                methodArr[i10] = (i10 > cVarW.f770t || cVarW.f769s > i10 || (clsG = C4.a.G((AbstractC0151y) arrayList.get(i10 - i11))) == null) ? null : C4.a.z(clsG, interfaceC0285t);
                i10++;
            }
            c0099h = new C0099h(cVarW, methodArr, declaredMethod);
        }
        this.f1744c = c0099h;
    }

    @Override // G8.e
    public final Object v(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        p210v8.i.f(objArr, "args");
        C0099h c0099h = this.f1744c;
        B8.c cVar = (B8.c) c0099h.f103t;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        p210v8.i.e(objArrCopyOf, "copyOf(this, size)");
        int i10 = cVar.f769s;
        int i11 = cVar.f770t;
        if (i10 <= i11) {
            while (true) {
                Method method = ((Method[]) c0099h.f104u)[i10];
                Object objE = objArr[i10];
                if (method != null) {
                    if (objE != null) {
                        objE = method.invoke(objE, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        p210v8.i.e(returnType, "method.returnType");
                        objE = y0.e(returnType);
                    }
                }
                objArrCopyOf[i10] = objE;
                if (i10 == i11) {
                    break;
                }
                i10++;
            }
        }
        Object objV = this.a.v(objArrCopyOf);
        Method method2 = (Method) c0099h.f105v;
        return (method2 == null || (objInvoke = method2.invoke(null, objV)) == null) ? objV : objInvoke;
    }

    @Override // G8.e
    public final Type w() {
        return this.a.w();
    }

    @Override // G8.e
    public final List x() {
        return this.a.x();
    }

    @Override // G8.e
    public final Member y() {
        return this.a.y();
    }
}
