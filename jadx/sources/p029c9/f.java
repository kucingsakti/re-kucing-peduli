package p029c9;

import B4.C0157e;
import R8.AbstractC0408c;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import h9.k;
import i9.g;
import p037d9.a;
import p047e9.C;
import p096j9.c;
import p104k9.m;
import p176r9.b;
import p210v8.i;
import p238y9.h;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f7549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f7550t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Q8.b f7551u;

    public f(Q8.b bVar, C c10, g gVar, int i10) {
        i.f(bVar, "kotlinClass");
        i.f(c10, "packageProto");
        i.f(gVar, "nameResolver");
        AbstractC0487g.p(i10, "abiStability");
        b bVarB = b.b(AbstractC0408c.a(bVar.a));
        C0157e c0157e = bVar.f4340b;
        b bVarD = null;
        String str = ((a) c0157e.f665b) == a.MULTIFILE_CLASS_PART ? (String) c0157e.f671h : null;
        if (str != null && str.length() > 0) {
            bVarD = b.d(str);
        }
        this.f7549s = bVarB;
        this.f7550t = bVarD;
        this.f7551u = bVar;
        m mVar = k.f11888m;
        i.e(mVar, "packageModuleName");
        Integer num = (Integer) d.m(c10, mVar);
        if (num != null) {
            gVar.getString(num.intValue());
        }
    }

    public final p096j9.b a() {
        c cVar;
        b bVar = this.f7549s;
        String str = bVar.a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = c.f12543c;
            if (cVar == null) {
                b.a(7);
                throw null;
            }
        } else {
            cVar = new c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strE = bVar.e();
        i.e(strE, "className.internalName");
        return new p096j9.b(cVar, p096j9.f.j(L9.f.f0(strE, '/', strE)));
    }

    public final String toString() {
        return f.class.getSimpleName() + ": " + this.f7549s;
    }
}
