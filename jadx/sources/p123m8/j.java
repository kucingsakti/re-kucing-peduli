package p123m8;

import java.io.Serializable;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f13164s = new j();

    @Override // p123m8.i
    public final g get(h hVar) {
        i.f(hVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p123m8.i
    public final i minusKey(h hVar) {
        i.f(hVar, "key");
        return this;
    }

    @Override // p123m8.i
    public final i plus(i iVar) {
        i.f(iVar, "context");
        return iVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p123m8.i
    public final Object fold(Object obj, c cVar) {
        return obj;
    }
}
