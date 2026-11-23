package p182s4;

import L9.n;
import java.util.Locale;
import java.util.UUID;
import p200u8.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class M {
    public final X a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f14635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public E f14638e;

    public M() {
        X x8 = X.a;
        L l4 = L.f14634A;
        this.a = x8;
        this.f14635b = l4;
        this.f14636c = a();
        this.f14637d = -1;
    }

    public final String a() {
        String string = ((UUID) this.f14635b.invoke()).toString();
        i.e(string, "uuidGenerator().toString()");
        String lowerCase = n.G(string, "-", "").toLowerCase(Locale.ROOT);
        i.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final E b() {
        E e10 = this.f14638e;
        if (e10 != null) {
            return e10;
        }
        i.n("currentSession");
        throw null;
    }
}
