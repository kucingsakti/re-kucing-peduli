package p123m8;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.Serializable;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f13161s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f13162t;

    public c(g gVar, i iVar) {
        i.f(iVar, "left");
        i.f(gVar, "element");
        this.f13161s = iVar;
        this.f13162t = gVar;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            int i10 = 2;
            c cVar2 = cVar;
            int i11 = 2;
            while (true) {
                i iVar = cVar2.f13161s;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i11++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f13161s;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 == i10) {
                c cVar4 = this;
                while (true) {
                    g gVar = cVar4.f13162t;
                    if (!i.a(cVar.get(gVar.getKey()), gVar)) {
                        zA = false;
                        break;
                    }
                    i iVar3 = cVar4.f13161s;
                    if (!(iVar3 instanceof c)) {
                        i.d(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar3;
                        zA = i.a(cVar.get(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (c) iVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p123m8.i
    public final Object fold(Object obj, p200u8.c cVar) {
        return cVar.invoke(this.f13161s.fold(obj, cVar), this.f13162t);
    }

    @Override // p123m8.i
    public final g get(h hVar) {
        i.f(hVar, "key");
        c cVar = this;
        while (true) {
            g gVar = cVar.f13162t.get(hVar);
            if (gVar != null) {
                return gVar;
            }
            i iVar = cVar.f13161s;
            if (!(iVar instanceof c)) {
                return iVar.get(hVar);
            }
            cVar = (c) iVar;
        }
    }

    public final int hashCode() {
        return this.f13162t.hashCode() + this.f13161s.hashCode();
    }

    @Override // p123m8.i
    public final i minusKey(h hVar) {
        i.f(hVar, "key");
        g gVar = this.f13162t;
        g gVar2 = gVar.get(hVar);
        i iVar = this.f13161s;
        if (gVar2 != null) {
            return iVar;
        }
        i iVarMinusKey = iVar.minusKey(hVar);
        if (iVarMinusKey == iVar) {
            return this;
        }
        return iVarMinusKey == j.f13164s ? gVar : new c(gVar, iVarMinusKey);
    }

    @Override // p123m8.i
    public final i plus(i iVar) {
        i.f(iVar, "context");
        return iVar == j.f13164s ? this : (i) iVar.fold(this, b.f13159u);
    }

    public final String toString() {
        return AbstractC0487g.j(new StringBuilder("["), (String) fold("", b.f13158t), ']');
    }
}
