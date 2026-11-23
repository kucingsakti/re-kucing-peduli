package T;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4586c;

    public d(int i10) {
        super(i10);
        this.f4586c = new Object();
    }

    @Override // T.c
    public final Object a() {
        Object objA;
        synchronized (this.f4586c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // T.c
    public final boolean c(Object obj) {
        boolean zC;
        i.f(obj, "instance");
        synchronized (this.f4586c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
