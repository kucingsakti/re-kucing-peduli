package p210v8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements f, Serializable {
    private final int arity;

    public k(int i10) {
        this.arity = i10;
    }

    @Override // p210v8.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strI = u.a.i(this);
        i.e(strI, "renderLambdaToString(...)");
        return strI;
    }
}
