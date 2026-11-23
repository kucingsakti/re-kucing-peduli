package Y8;

import A1.J;
import A9.AbstractC0151y;
import L8.C0280n;
import L8.InterfaceC0271e;
import L8.P;
import O8.C0355k;
import O8.U;
import Q3.u0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5781s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Fa.e f5782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f5783u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Fa.e eVar, p pVar) {
        super(0);
        this.f5782t = eVar;
        this.f5783u = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y8.A, Y8.p] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [W8.b] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [Y8.F] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [O8.k, O8.w, W8.b] */
    /* JADX WARN: Type inference failed for: r8v13, types: [h8.d, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p200u8.a
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        M8.f fVar;
        int i10;
        ?? r10;
        Fa.e eVar;
        List listD;
        ?? r11;
        ?? arrayList;
        p076h8.f fVar2;
        ?? r12;
        List listD2;
        switch (this.f5781s) {
            case 0:
                ?? r13 = this.f5783u;
                Constructor<?>[] declaredConstructors = r13.f5787o.a.getDeclaredConstructors();
                p210v8.i.e(declaredConstructors, "klass.declaredConstructors");
                List listB = K9.n.B(K9.n.z(new K9.g(p086i8.i.m(declaredConstructors), false, R8.i.f4469A), R8.j.f4470A));
                ArrayList arrayList2 = new ArrayList(listB.size());
                Iterator it = listB.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Fa.e eVar2 = r13.f5713b;
                    InterfaceC0271e interfaceC0271e = r13.f5786n;
                    if (!zHasNext) {
                        R8.n nVar = r13.f5787o;
                        boolean zF = nVar.f();
                        M8.f fVar3 = M8.g.a;
                        String str = "PROTECTED_AND_PACKAGE";
                        String str2 = "classDescriptor.visibility";
                        int i11 = 2;
                        Object obj = null;
                        Fa.e eVar3 = this.f5782t;
                        if (zF) {
                            W8.b bVarQ1 = W8.b.q1(interfaceC0271e, fVar3, true, ((Q8.d) ((I4.a) eVar2.f1659t).j).a(nVar));
                            ArrayList<R8.z> arrayListE = nVar.e();
                            ArrayList arrayList3 = new ArrayList(arrayListE.size());
                            Z8.a aVarA = C8.E.A(2, false, null, 6);
                            int i12 = 0;
                            for (R8.z zVar : arrayListE) {
                                M8.f fVar4 = fVar3;
                                W8.b bVar = bVarQ1;
                                arrayList3.add(new U(bVar, null, i12, fVar4, zVar.c(), ((Y1.c) eVar2.f1663x).P(zVar.f(), aVarA), false, false, false, null, ((Q8.d) ((I4.a) eVar2.f1659t).j).a(zVar)));
                                obj = null;
                                bVarQ1 = bVar;
                                i11 = 2;
                                fVar3 = fVar4;
                                eVar3 = eVar3;
                                i12++;
                            }
                            Object obj2 = obj;
                            C0355k c0355k = bVarQ1;
                            r10 = obj2;
                            int i13 = i11;
                            fVar = fVar3;
                            i10 = i13;
                            eVar = eVar3;
                            c0355k.i1(false);
                            C0280n c0280nF = interfaceC0271e.f();
                            p210v8.i.e(c0280nF, "classDescriptor.visibility");
                            if (c0280nF.equals(U8.o.f4978b)) {
                                c0280nF = U8.o.f4979c;
                                p210v8.i.e(c0280nF, "PROTECTED_AND_PACKAGE");
                            }
                            c0355k.n1(arrayList3, c0280nF);
                            c0355k.h1(false);
                            c0355k.j1(interfaceC0271e.p());
                            String strC = qa.b.c(c0355k, i10);
                            if (arrayList2.isEmpty()) {
                                arrayList2.add(c0355k);
                                ((V8.h) ((I4.a) eVar.f1659t).f2052g).getClass();
                            } else {
                                Iterator it2 = arrayList2.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        arrayList2.add(c0355k);
                                        ((V8.h) ((I4.a) eVar.f1659t).f2052g).getClass();
                                    }
                                } while (!qa.b.c((C0355k) it2.next(), i10).equals(strC));
                            }
                        } else {
                            fVar = fVar3;
                            i10 = 2;
                            r10 = 0;
                            eVar = eVar3;
                        }
                        ((p176r9.a) ((p176r9.e) ((I4.a) eVar.f1659t).f2068x)).a(eVar, interfaceC0271e, arrayList2);
                        I4.a aVar = (I4.a) eVar.f1659t;
                        if (arrayList2.isEmpty()) {
                            Class cls = nVar.a;
                            boolean zIsAnnotation = cls.isAnnotation();
                            cls.isInterface();
                            if (zIsAnnotation) {
                                W8.b bVarQ2 = W8.b.q1(interfaceC0271e, fVar, true, ((Q8.d) ((I4.a) eVar2.f1659t).j).a(nVar));
                                if (zIsAnnotation) {
                                    Collection collectionD = nVar.d();
                                    arrayList = new ArrayList(collectionD.size());
                                    Z8.a aVarA2 = C8.E.A(i10, true, r10, 6);
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList<R8.w> arrayList5 = new ArrayList();
                                    for (Object obj3 : collectionD) {
                                        if (p210v8.i.a(((R8.w) obj3).c(), U8.x.f4994b)) {
                                            arrayList4.add(obj3);
                                        } else {
                                            arrayList5.add(obj3);
                                        }
                                    }
                                    arrayList4.size();
                                    R8.w wVar = (R8.w) p086i8.k.V(arrayList4);
                                    Y1.c cVar = (Y1.c) eVar2.f1663x;
                                    if (wVar != null) {
                                        R8.A aF = wVar.f();
                                        if (aF instanceof R8.h) {
                                            R8.h hVar = (R8.h) aF;
                                            fVar2 = new p076h8.f(cVar.O(hVar, aVarA2, true), cVar.P(hVar.f4467b, aVarA2));
                                        } else {
                                            fVar2 = new p076h8.f(cVar.P(aF, aVarA2), null);
                                        }
                                        W8.b bVar2 = bVarQ2;
                                        r13.x(arrayList, bVar2, 0, wVar, (AbstractC0151y) fVar2.f11789s, (AbstractC0151y) fVar2.f11790t);
                                        r11 = bVar2;
                                    } else {
                                        wVar = wVar;
                                        r11 = bVarQ2;
                                    }
                                    int i14 = wVar != null ? 1 : 0;
                                    int i15 = 0;
                                    for (R8.w wVar2 : arrayList5) {
                                        r13.x(arrayList, r11, i15 + i14, wVar2, cVar.P(wVar2.f(), aVarA2), null);
                                        i15++;
                                    }
                                } else {
                                    r11 = bVarQ2;
                                    str = "PROTECTED_AND_PACKAGE";
                                    str2 = "classDescriptor.visibility";
                                    eVar = eVar;
                                    arrayList = Collections.EMPTY_LIST;
                                }
                                r11.i1(false);
                                C0280n c0280nF2 = interfaceC0271e.f();
                                p210v8.i.e(c0280nF2, str2);
                                if (c0280nF2.equals(U8.o.f4978b)) {
                                    c0280nF2 = U8.o.f4979c;
                                    p210v8.i.e(c0280nF2, str);
                                }
                                r11.n1(arrayList, c0280nF2);
                                r11.h1(true);
                                r11.j1(interfaceC0271e.p());
                                ((V8.h) ((I4.a) eVar2.f1659t).f2052g).getClass();
                                r12 = r11;
                            } else {
                                eVar = eVar;
                                r12 = r10;
                            }
                            listD = p086i8.l.D(r12);
                        } else {
                            eVar = eVar;
                            listD = arrayList2;
                        }
                        return p086i8.k.s0(((p019b9.d) aVar.f2062r).e(eVar, listD));
                    }
                    R8.q qVar = (R8.q) it.next();
                    X8.b bVarK = u0.k(eVar2, qVar);
                    I4.a aVar2 = (I4.a) eVar2.f1659t;
                    W8.b bVarQ3 = W8.b.q1(interfaceC0271e, bVarK, false, ((Q8.d) aVar2.j).a(qVar));
                    Fa.e eVar4 = new Fa.e(aVar2, new I.D(eVar2, bVarQ3, qVar, interfaceC0271e.y().size()), eVar2.f1661v);
                    Constructor constructor = qVar.a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    p210v8.i.e(genericParameterTypes, "types");
                    if (genericParameterTypes.length == 0) {
                        listD2 = p086i8.s.f12328s;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) p086i8.i.s(1, genericParameterTypes.length, genericParameterTypes);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) p086i8.i.s(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
                        }
                        listD2 = qVar.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    J jU = A.u(eVar4, bVarQ3, listD2);
                    List listY = interfaceC0271e.y();
                    p210v8.i.e(listY, "classDescriptor.declaredTypeParameters");
                    List list = listY;
                    ArrayList arrayListZ = qVar.z();
                    ArrayList arrayList6 = new ArrayList(p086i8.m.H(arrayListZ, 10));
                    Iterator it3 = arrayListZ.iterator();
                    while (it3.hasNext()) {
                        P pA = ((X8.d) eVar4.f1660u).a((R8.B) it3.next());
                        p210v8.i.c(pA);
                        arrayList6.add(pA);
                    }
                    bVarQ3.o1((List) jU.f76u, p068ga.d.F(qVar.e()), p086i8.k.g0(list, arrayList6));
                    bVarQ3.h1(false);
                    bVarQ3.i1(jU.f75t);
                    bVarQ3.j1(interfaceC0271e.p());
                    ((V8.h) ((I4.a) eVar4.f1659t).f2052g).getClass();
                    arrayList2.add(bVarQ3);
                }
                break;
            default:
                Fa.e eVar5 = this.f5782t;
                return p086i8.k.w0(((p176r9.a) ((p176r9.e) ((I4.a) eVar5.f1659t).f2068x)).f(eVar5, this.f5783u.f5786n));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Fa.e eVar) {
        super(0);
        this.f5783u = pVar;
        this.f5782t = eVar;
    }
}
