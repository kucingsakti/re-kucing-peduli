package I8;

import java.util.Set;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
public enum k {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p096j9.f f2128s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p096j9.f f2129t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f2130u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f2131v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Set f2124w = C.x(CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE);

    k(String str) {
        this.f2128s = p096j9.f.j(str);
        this.f2129t = p096j9.f.j(str.concat("Array"));
        p076h8.e eVar = p076h8.e.f11786s;
        this.f2130u = D3.b.r(eVar, new j(this, 1));
        this.f2131v = D3.b.r(eVar, new j(this, 0));
    }
}
