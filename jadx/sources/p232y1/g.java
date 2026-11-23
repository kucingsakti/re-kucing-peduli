package p232y1;

import E0.a;
import android.text.TextUtils;
import za.c;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f16014e = new c(28);
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f16015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f16017d;

    public g(String str, Object obj, f fVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f16016c = str;
        this.a = obj;
        this.f16015b = fVar;
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f16014e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f16016c.equals(((g) obj).f16016c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16016c.hashCode();
    }

    public final String toString() {
        return a.l(new StringBuilder("Option{key='"), this.f16016c, "'}");
    }
}
