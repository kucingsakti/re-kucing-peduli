package O8;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: O8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0351g implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3705t;

    public /* synthetic */ C0351g(Object obj, int i10) {
        this.f3704s = i10;
        this.f3705t = obj;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f3704s) {
            case 0:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                C0352h c0352h = (C0352h) this.f3705t;
                sb.append(((p096j9.f) c0352h.f3707t).g());
                return qa.b.g(sb.toString(), ((AbstractC0354j) c0352h.f3708u).getUpperBounds());
            case 1:
                C0362s c0362s = (C0362s) this.f3705t;
                c0362s.getClass();
                HashSet hashSet = new HashSet();
                for (p096j9.f fVar : (Set) c0362s.f3737e.f3738A.invoke()) {
                    if (fVar == null) {
                        C0362s.h(5);
                        throw null;
                    }
                    hashSet.addAll((Collection) c0362s.f3734b.invoke(fVar));
                    hashSet.addAll((Collection) c0362s.f3735c.invoke(fVar));
                }
                return hashSet;
            default:
                return (List) this.f3705t;
        }
    }
}
