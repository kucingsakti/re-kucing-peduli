package U8;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final m a = new m();

    public static final C a(String str, String str2, String str3, String str4) {
        ArrayList arrayList = F.a;
        p096j9.f fVarJ = p096j9.f.j(str2);
        String str5 = str2 + '(' + str3 + ')' + str4;
        p210v8.i.f(str, "internalName");
        p210v8.i.f(str5, "jvmDescriptor");
        return new C(fVarJ, str + '.' + str5);
    }
}
