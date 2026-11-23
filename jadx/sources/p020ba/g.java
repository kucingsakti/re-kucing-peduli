package p020ba;

import java.lang.ref.WeakReference;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends WeakReference {
    public final Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Object obj) {
        super(iVar);
        i.f(iVar, "referent");
        this.a = obj;
    }
}
