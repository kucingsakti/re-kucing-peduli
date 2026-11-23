package p123m8;

import p200u8.c;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f13158t = new b(2, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f13159u = new b(2, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13160s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f13160s = i11;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.f13160s) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                i.f(str, "acc");
                i.f(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                i.f(iVar, "acc");
                i.f(gVar2, "element");
                i iVarMinusKey = iVar.minusKey(gVar2.getKey());
                j jVar = j.f13164s;
                if (iVarMinusKey == jVar) {
                    return gVar2;
                }
                e eVar = e.f13163s;
                f fVar = (f) iVarMinusKey.get(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, iVarMinusKey);
                } else {
                    i iVarMinusKey2 = iVarMinusKey.minusKey(eVar);
                    if (iVarMinusKey2 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, iVarMinusKey2));
                }
                return cVar;
        }
    }
}
