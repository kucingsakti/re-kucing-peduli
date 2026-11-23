package N9;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends S9.r {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ThreadLocal f3494w;

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(p123m8.d dVar, p123m8.i iVar) {
        y0 y0Var = y0.f3495s;
        super(dVar, iVar.get(y0Var) == null ? iVar.plus(y0Var) : iVar);
        this.f3494w = new ThreadLocal();
        if (dVar.getContext().get(p123m8.e.f13163s) instanceof AbstractC0337u) {
            return;
        }
        Object objK = S9.a.k(iVar, null);
        S9.a.f(iVar, objK);
        S(iVar, objK);
    }

    public final boolean R() {
        boolean z6 = this.threadLocalIsSet && this.f3494w.get() == null;
        this.f3494w.remove();
        return !z6;
    }

    public final void S(p123m8.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f3494w.set(new p076h8.f(iVar, obj));
    }

    @Override // S9.r, N9.k0
    public final void e(Object obj) {
        if (this.threadLocalIsSet) {
            p076h8.f fVar = (p076h8.f) this.f3494w.get();
            if (fVar != null) {
                S9.a.f((p123m8.i) fVar.f11789s, fVar.f11790t);
            }
            this.f3494w.remove();
        }
        Object objO = AbstractC0342z.o(obj);
        p123m8.d dVar = this.f4575v;
        p123m8.i context = dVar.getContext();
        Object objK = S9.a.k(context, null);
        x0 x0VarV = objK != S9.a.f4551f ? AbstractC0342z.v(dVar, context, objK) : null;
        try {
            this.f4575v.resumeWith(objO);
        } finally {
            if (x0VarV == null || x0VarV.R()) {
                S9.a.f(context, objK);
            }
        }
    }
}
