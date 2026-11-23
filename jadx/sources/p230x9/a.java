package p230x9;

import L9.n;
import p057f9.b;
import p096j9.c;
import p104k9.C0678g;
import p104k9.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p211v9.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f15787m;

    static {
        C0678g c0678g = new C0678g();
        b.a(c0678g);
        m mVar = b.a;
        i.e(mVar, "packageFqName");
        m mVar2 = b.f11445c;
        i.e(mVar2, "constructorAnnotation");
        m mVar3 = b.f11444b;
        i.e(mVar3, "classAnnotation");
        m mVar4 = b.f11446d;
        i.e(mVar4, "functionAnnotation");
        m mVar5 = b.f11447e;
        i.e(mVar5, "propertyAnnotation");
        m mVar6 = b.f11448f;
        i.e(mVar6, "propertyGetterAnnotation");
        m mVar7 = b.f11449g;
        i.e(mVar7, "propertySetterAnnotation");
        m mVar8 = b.f11451i;
        i.e(mVar8, "enumEntryAnnotation");
        m mVar9 = b.f11450h;
        i.e(mVar9, "compileTimeValue");
        m mVar10 = b.j;
        i.e(mVar10, "parameterAnnotation");
        m mVar11 = b.f11452k;
        i.e(mVar11, "typeAnnotation");
        m mVar12 = b.f11453l;
        i.e(mVar12, "typeParameterAnnotation");
        f15787m = new a(c0678g, mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12);
    }

    public static String a(c cVar) {
        String strG;
        i.f(cVar, "fqName");
        StringBuilder sb = new StringBuilder();
        sb.append(n.F(cVar.b(), '.', '/'));
        sb.append('/');
        if (cVar.d()) {
            strG = "default-package";
        } else {
            strG = cVar.f().g();
            i.e(strG, "fqName.shortName().asString()");
        }
        sb.append(strG.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
