package N9;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static final E a;

    static {
        String property;
        O9.d dVar;
        E e10;
        int i10 = S9.u.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            U9.d dVar2 = I.a;
            dVar = S9.n.a;
            O9.d dVar3 = dVar.f3804v;
            if (!(dVar instanceof E)) {
                e10 = dVar;
                e10 = A.f3407A;
            }
        } else {
            e10 = A.f3407A;
        }
        e10 = dVar;
        a = e10;
    }
}
