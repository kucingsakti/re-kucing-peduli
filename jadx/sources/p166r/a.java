package p166r;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashMap f14443w = new HashMap();

    @Override // p166r.f
    public final c d(Object obj) {
        return (c) this.f14443w.get(obj);
    }

    @Override // p166r.f
    public final Object e(Object obj) {
        Object objE = super.e(obj);
        this.f14443w.remove(obj);
        return objE;
    }
}
