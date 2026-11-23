package X9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0469o {
    public boolean a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f5620d;

    public C0470p a() {
        return new C0470p(this.a, this.f5618b, (String[]) this.f5619c, (String[]) this.f5620d);
    }

    public void b(C0468n... c0468nArr) {
        p210v8.i.f(c0468nArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(c0468nArr.length);
        for (C0468n c0468n : c0468nArr) {
            arrayList.add(c0468n.a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        p210v8.i.f(strArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f5619c = (String[]) strArr.clone();
    }

    public void d(Q... qArr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(qArr.length);
        for (Q q10 : qArr) {
            arrayList.add(q10.f5556s);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        p210v8.i.f(strArr, "tlsVersions");
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f5620d = (String[]) strArr.clone();
    }
}
