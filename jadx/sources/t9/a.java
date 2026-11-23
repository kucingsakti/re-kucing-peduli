package t9;

import L8.InterfaceC0273g;
import L8.InterfaceC0274h;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p086i8.u;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n[] f15226c;

    public a(String str, n[] nVarArr) {
        this.f15225b = str;
        this.f15226c = nVarArr;
    }

    @Override // t9.p
    public final InterfaceC0273g a(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        InterfaceC0273g interfaceC0273g = null;
        for (n nVar : this.f15226c) {
            InterfaceC0273g interfaceC0273gA = nVar.a(fVar, bVar);
            if (interfaceC0273gA != null) {
                if (!(interfaceC0273gA instanceof InterfaceC0274h) || !((InterfaceC0274h) interfaceC0273gA).i0()) {
                    return interfaceC0273gA;
                }
                if (interfaceC0273g == null) {
                    interfaceC0273g = interfaceC0273gA;
                }
            }
        }
        return interfaceC0273g;
    }

    @Override // t9.n
    public final Collection b(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        n[] nVarArr = this.f15226c;
        int length = nVarArr.length;
        if (length == 0) {
            return p086i8.s.f12328s;
        }
        if (length == 1) {
            return nVarArr[0].b(fVar, bVar);
        }
        Collection collectionD = null;
        for (n nVar : nVarArr) {
            collectionD = com.bumptech.glide.e.d(collectionD, nVar.b(fVar, bVar));
        }
        return collectionD == null ? u.f12330s : collectionD;
    }

    @Override // t9.n
    public final Collection c(p096j9.f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        n[] nVarArr = this.f15226c;
        int length = nVarArr.length;
        if (length == 0) {
            return p086i8.s.f12328s;
        }
        if (length == 1) {
            return nVarArr[0].c(fVar, bVar);
        }
        Collection collectionD = null;
        for (n nVar : nVarArr) {
            collectionD = com.bumptech.glide.e.d(collectionD, nVar.c(fVar, bVar));
        }
        return collectionD == null ? u.f12330s : collectionD;
    }

    @Override // t9.n
    public final Set d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f15226c) {
            p086i8.q.J(linkedHashSet, nVar.d());
        }
        return linkedHashSet;
    }

    @Override // t9.n
    public final Set e() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f15226c) {
            p086i8.q.J(linkedHashSet, nVar.e());
        }
        return linkedHashSet;
    }

    @Override // t9.p
    public final Collection f(f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        n[] nVarArr = this.f15226c;
        int length = nVarArr.length;
        if (length == 0) {
            return p086i8.s.f12328s;
        }
        if (length == 1) {
            return nVarArr[0].f(fVar, bVar);
        }
        Collection collectionD = null;
        for (n nVar : nVarArr) {
            collectionD = com.bumptech.glide.e.d(collectionD, nVar.f(fVar, bVar));
        }
        return collectionD == null ? u.f12330s : collectionD;
    }

    @Override // t9.n
    public final Set g() {
        n[] nVarArr = this.f15226c;
        p210v8.i.f(nVarArr, "<this>");
        return o1.f.f(nVarArr.length == 0 ? p086i8.s.f12328s : new K9.r(nVarArr, 1));
    }

    public final String toString() {
        return this.f15225b;
    }
}
