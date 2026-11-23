package R9;

import L9.o;
import N9.AbstractC0342z;
import p076h8.m;
import p123m8.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p144o8.c implements Q9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Q9.c f4486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p123m8.i f4487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f4488u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p123m8.i f4489v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p123m8.d f4490w;

    public g(Q9.c cVar, p123m8.i iVar) {
        super(e.f4484s, j.f13164s);
        this.f4486s = cVar;
        this.f4487t = iVar;
        this.f4488u = ((Number) iVar.fold(0, f.f4485s)).intValue();
    }

    @Override // Q9.c
    public final Object a(Object obj, p123m8.d dVar) {
        try {
            Object objC = c(dVar, obj);
            return objC == p134n8.a.f13404s ? objC : m.a;
        } catch (Throwable th) {
            this.f4489v = new d(dVar.getContext(), th);
            throw th;
        }
    }

    public final Object c(p123m8.d dVar, Object obj) {
        p123m8.i context = dVar.getContext();
        AbstractC0342z.f(context);
        p123m8.i iVar = this.f4489v;
        if (iVar != context) {
            if (iVar instanceof d) {
                throw new IllegalStateException(L9.g.x("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((d) iVar).f4482s + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new o(this, 2))).intValue() != this.f4488u) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f4487t + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f4489v = context;
        }
        this.f4490w = dVar;
        h hVar = i.a;
        Q9.c cVar = this.f4486s;
        p210v8.i.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        hVar.getClass();
        Object objA = cVar.a(obj, this);
        if (!p210v8.i.a(objA, p134n8.a.f13404s)) {
            this.f4490w = null;
        }
        return objA;
    }

    @Override // p144o8.a, p144o8.d
    public final p144o8.d getCallerFrame() {
        p123m8.d dVar = this.f4490w;
        if (dVar instanceof p144o8.d) {
            return (p144o8.d) dVar;
        }
        return null;
    }

    @Override // p144o8.c, p123m8.d
    public final p123m8.i getContext() {
        p123m8.i iVar = this.f4489v;
        return iVar == null ? j.f13164s : iVar;
    }

    @Override // p144o8.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = p076h8.h.a(obj);
        if (thA != null) {
            this.f4489v = new d(getContext(), thA);
        }
        p123m8.d dVar = this.f4490w;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return p134n8.a.f13404s;
    }
}
