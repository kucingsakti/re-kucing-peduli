package A1;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class H implements p232y1.e {
    public static final U1.j j = new U1.j(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B1.g f65b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p232y1.e f66c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p232y1.e f67d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f68e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f69f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f70g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p232y1.h f71h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p232y1.l f72i;

    public H(B1.g gVar, p232y1.e eVar, p232y1.e eVar2, int i10, int i11, p232y1.l lVar, Class cls, p232y1.h hVar) {
        this.f65b = gVar;
        this.f66c = eVar;
        this.f67d = eVar2;
        this.f68e = i10;
        this.f69f = i11;
        this.f72i = lVar;
        this.f70g = cls;
        this.f71h = hVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        Object objF;
        B1.g gVar = this.f65b;
        synchronized (gVar) {
            B1.f fVar = gVar.f584b;
            B1.j jVarX0 = (B1.j) ((ArrayDeque) fVar.f577s).poll();
            if (jVarX0 == null) {
                jVarX0 = fVar.X0();
            }
            B1.e eVar = (B1.e) jVarX0;
            eVar.f581b = 8;
            eVar.f582c = byte[].class;
            objF = gVar.f(eVar, byte[].class);
        }
        byte[] bArr = (byte[]) objF;
        ByteBuffer.wrap(bArr).putInt(this.f68e).putInt(this.f69f).array();
        this.f67d.b(messageDigest);
        this.f66c.b(messageDigest);
        messageDigest.update(bArr);
        p232y1.l lVar = this.f72i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f71h.b(messageDigest);
        U1.j jVar = j;
        Class cls = this.f70g;
        byte[] bytes = (byte[]) jVar.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(p232y1.e.a);
            jVar.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f65b.h(bArr);
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        if (obj instanceof H) {
            H h10 = (H) obj;
            if (this.f69f == h10.f69f && this.f68e == h10.f68e && U1.n.b(this.f72i, h10.f72i) && this.f70g.equals(h10.f70g) && this.f66c.equals(h10.f66c) && this.f67d.equals(h10.f67d) && this.f71h.equals(h10.f71h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p232y1.e
    public final int hashCode() {
        int iHashCode = ((((this.f67d.hashCode() + (this.f66c.hashCode() * 31)) * 31) + this.f68e) * 31) + this.f69f;
        p232y1.l lVar = this.f72i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return this.f71h.f16018b.hashCode() + ((this.f70g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f66c + ", signature=" + this.f67d + ", width=" + this.f68e + ", height=" + this.f69f + ", decodedResourceClass=" + this.f70g + ", transformation='" + this.f72i + "', options=" + this.f71h + '}';
    }
}
