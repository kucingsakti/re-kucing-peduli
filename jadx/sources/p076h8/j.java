package p076h8;

import java.io.Serializable;
import p200u8.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class j implements d, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f11796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile Object f11797t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f11798u;

    public j(a aVar) {
        i.f(aVar, "initializer");
        this.f11796s = aVar;
        this.f11797t = l.a;
        this.f11798u = this;
    }

    @Override // p076h8.d
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f11797t;
        l lVar = l.a;
        if (obj != lVar) {
            return obj;
        }
        synchronized (this.f11798u) {
            objInvoke = this.f11797t;
            if (objInvoke == lVar) {
                a aVar = this.f11796s;
                i.c(aVar);
                objInvoke = aVar.invoke();
                this.f11797t = objInvoke;
                this.f11796s = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f11797t != l.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
