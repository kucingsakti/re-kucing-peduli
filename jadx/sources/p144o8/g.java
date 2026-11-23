package p144o8;

import p123m8.d;
import p210v8.f;
import p210v8.i;
import p210v8.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends c implements f {
    private final int arity;

    public g(int i10, d dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // p210v8.f
    public int getArity() {
        return this.arity;
    }

    @Override // p144o8.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = u.a.h(this);
        i.e(strH, "renderLambdaToString(...)");
        return strH;
    }
}
