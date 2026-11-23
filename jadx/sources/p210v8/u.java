package p210v8;

import F8.u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final v a;

    static {
        v vVar = null;
        try {
            vVar = (v) u0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (vVar == null) {
            vVar = new v();
        }
        a = vVar;
    }
}
