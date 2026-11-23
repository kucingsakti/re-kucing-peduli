package p238y9;

import C8.u;
import J7.j;
import M8.b;
import M8.h;
import java.util.Iterator;
import java.util.List;
import o1.f;
import p096j9.c;
import p210v8.n;
import p210v8.v;
import p247z9.i;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public class a implements h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ u[] f16050t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f16051s;

    static {
        v vVar = p210v8.u.a;
        f16050t = new u[]{vVar.f(new n(vVar.b(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public a(l lVar, p200u8.a aVar) {
        p210v8.i.f(lVar, "storageManager");
        this.f16051s = new i(lVar, aVar);
    }

    @Override // M8.h
    public final boolean E(c cVar) {
        return f.k(this, cVar);
    }

    @Override // M8.h
    public final b H(c cVar) {
        return f.e(this, cVar);
    }

    @Override // M8.h
    public boolean isEmpty() {
        return ((List) j.o(this.f16051s, f16050t[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) j.o(this.f16051s, f16050t[0])).iterator();
    }
}
