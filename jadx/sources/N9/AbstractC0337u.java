package N9;

/* JADX INFO: renamed from: N9.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0337u extends p123m8.a implements p123m8.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0336t f3485s = new C0336t(p123m8.e.f13163s, C0335s.f3480s);

    public AbstractC0337u() {
        super(p123m8.e.f13163s);
    }

    public abstract void g(p123m8.i iVar, Runnable runnable);

    /* JADX WARN: Type inference failed for: r3v3, types: [u8.b, v8.k] */
    @Override // p123m8.a, p123m8.i
    public final p123m8.g get(p123m8.h hVar) {
        p210v8.i.f(hVar, "key");
        if (!(hVar instanceof C0336t)) {
            if (p123m8.e.f13163s == hVar) {
                return this;
            }
            return null;
        }
        C0336t c0336t = (C0336t) hVar;
        p123m8.h key = getKey();
        p210v8.i.f(key, "key");
        if (key != c0336t && c0336t.f3482t != key) {
            return null;
        }
        p123m8.g gVar = (p123m8.g) c0336t.f3481s.invoke(this);
        if (gVar instanceof p123m8.g) {
            return gVar;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x002c A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [u8.b, v8.k] */
    @Override // p123m8.a, p123m8.i
    public final p123m8.i minusKey(p123m8.h hVar) {
        p210v8.i.f(hVar, "key");
        boolean z6 = hVar instanceof C0336t;
        p123m8.j jVar = p123m8.j.f13164s;
        if (!z6) {
            if (p123m8.e.f13163s == hVar) {
                return jVar;
            }
            return this;
        }
        C0336t c0336t = (C0336t) hVar;
        p123m8.h key = getKey();
        p210v8.i.f(key, "key");
        if ((key == c0336t || c0336t.f3482t == key) && ((p123m8.g) c0336t.f3481s.invoke(this)) != null) {
            return jVar;
        }
        return this;
    }

    public void n(p123m8.i iVar, Runnable runnable) {
        g(iVar, runnable);
    }

    public boolean o() {
        return !(this instanceof w0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0342z.j(this);
    }
}
