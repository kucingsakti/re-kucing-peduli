package C9;

import A9.O;
import L8.InterfaceC0276j;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import p086i8.C;
import p086i8.s;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f1015b = c.f969s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1016c = new a(p096j9.f.l(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f1017d = c(h.CYCLIC_SUPERTYPES, new String[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f1018e = c(h.ERROR_PROPERTY_TYPE, new String[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f1019f = C.w(new d());

    public static final e a(int i10, boolean z6, String... strArr) {
        AbstractC0487g.p(i10, "kind");
        p210v8.i.f(strArr, "formatParams");
        if (!z6) {
            return new e((String[]) Arrays.copyOf(strArr, strArr.length), i10);
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        p210v8.i.f(strArr2, "formatParams");
        return new j((String[]) Arrays.copyOf(strArr2, strArr2.length), i10);
    }

    public static final e b(String[] strArr, int i10) {
        AbstractC0487g.p(i10, "kind");
        return a(i10, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final f c(h hVar, String... strArr) {
        p210v8.i.f(hVar, "kind");
        s sVar = s.f12328s;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        p210v8.i.f(strArr2, "formatParams");
        return e(hVar, sVar, d(hVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static g d(h hVar, String... strArr) {
        p210v8.i.f(hVar, "kind");
        p210v8.i.f(strArr, "formatParams");
        return new g(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static f e(h hVar, List list, O o10, String... strArr) {
        p210v8.i.f(hVar, "kind");
        p210v8.i.f(strArr, "formatParams");
        return new f(o10, b(new String[]{o10.toString()}, 7), hVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(InterfaceC0276j interfaceC0276j) {
        if (interfaceC0276j != null) {
            return (interfaceC0276j instanceof a) || (interfaceC0276j.v() instanceof a) || interfaceC0276j == f1015b;
        }
        return false;
    }
}
