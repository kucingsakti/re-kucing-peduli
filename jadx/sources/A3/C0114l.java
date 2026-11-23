package A3;

import java.io.Serializable;

/* JADX INFO: renamed from: A3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0114l extends AbstractC0104b implements Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f271t;

    public C0114l(Object obj, Object obj2) {
        this.f270s = obj;
        this.f271t = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f270s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f271t;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
