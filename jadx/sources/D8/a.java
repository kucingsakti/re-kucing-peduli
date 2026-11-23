package D8;

import A9.AbstractC0151y;
import A9.Z;
import C8.InterfaceC0175c;
import C8.InterfaceC0176d;
import F8.m0;
import F8.p0;
import java.util.ArrayList;
import java.util.List;
import p086i8.m;
import p210v8.i;
import p210v8.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements J9.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f1076s = new a();

    @Override // J9.b
    public final Iterable h(Object obj) {
        m0 m0Var = (m0) ((j) obj);
        InterfaceC0176d interfaceC0176dC = m0Var.c();
        InterfaceC0175c interfaceC0175c = interfaceC0176dC instanceof InterfaceC0175c ? (InterfaceC0175c) interfaceC0176dC : null;
        if (interfaceC0175c == null) {
            throw new p0("Supertype not a class: " + m0Var, 0);
        }
        List listT = interfaceC0175c.t();
        if (m0Var.b().isEmpty()) {
            return listT;
        }
        Z zD = Z.d(m0Var.a);
        List<j> list = listT;
        ArrayList arrayList = new ArrayList(m.H(list, 10));
        for (j jVar : list) {
            i.d(jVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            AbstractC0151y abstractC0151yI = zD.i(1, ((m0) jVar).a);
            if (abstractC0151yI == null) {
                throw new p0("Type substitution failed: " + jVar + " (" + m0Var + ')', 0);
            }
            arrayList.add(new m0(abstractC0151yI, null));
        }
        return arrayList;
    }
}
