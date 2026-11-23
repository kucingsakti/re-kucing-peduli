package Y8;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5814s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A f5815t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(A a, int i10) {
        super(0);
        this.f5814s = i10;
        this.f5815t = a;
    }

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
    public final Object invoke() {
        switch (this.f5814s) {
            case 0:
                t9.f fVar = t9.f.f15238m;
                t9.n.a.getClass();
                t9.k kVar = t9.k.f15254t;
                A a = this.f5815t;
                a.getClass();
                p210v8.i.f(fVar, "kindFilter");
                T8.b bVar = T8.b.f4762v;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (fVar.a(t9.f.f15237l)) {
                    for (p096j9.f fVar2 : a.h(fVar, kVar)) {
                        kVar.invoke(fVar2);
                        J9.l.b(linkedHashSet, a.a(fVar2, bVar));
                    }
                }
                boolean zA = fVar.a(t9.f.f15235i);
                List list = fVar.a;
                if (zA && !list.contains(t9.b.a)) {
                    for (p096j9.f fVar3 : a.i(fVar, kVar)) {
                        kVar.invoke(fVar3);
                        linkedHashSet.addAll(a.c(fVar3, bVar));
                    }
                }
                if (fVar.a(t9.f.j) && !list.contains(t9.b.a)) {
                    for (p096j9.f fVar4 : a.o(fVar)) {
                        kVar.invoke(fVar4);
                        linkedHashSet.addAll(a.b(fVar4, bVar));
                    }
                }
                return p086i8.k.s0(linkedHashSet);
            case 1:
                return this.f5815t.h(t9.f.f15240o, null);
            case 2:
                return this.f5815t.k();
            case 3:
                return this.f5815t.i(t9.f.f15241p, null);
            case 4:
                return this.f5815t.o(t9.f.f15242q);
            default:
                ((V8.h) ((I4.a) this.f5815t.f5713b.f1659t).f2053h).getClass();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a, R8.t tVar, W8.g gVar) {
        super(0);
        this.f5814s = 5;
        this.f5815t = a;
    }
}
