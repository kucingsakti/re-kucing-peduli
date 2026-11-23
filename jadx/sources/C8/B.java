package C8;

import F8.n0;
import F8.p0;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B implements TypeVariable, Type {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v f952s;

    public B(v vVar) {
        p210v8.i.f(vVar, "typeParameter");
        this.f952s = vVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !getName().equals(((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        n0 n0Var = (n0) this.f952s;
        n0Var.getClass();
        u uVar = n0.f1613v[0];
        Object objInvoke = n0Var.f1615t.invoke();
        p210v8.i.e(objInvoke, "<get-upperBounds>(...)");
        List list = (List) objInvoke;
        ArrayList arrayList = new ArrayList(p086i8.m.H(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(E.g((p210v8.j) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new p0(E0.a.h("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f952s), 2);
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((n0) this.f952s).a();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
