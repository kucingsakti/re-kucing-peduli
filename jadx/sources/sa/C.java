package sa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class C extends ArrayList {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14799s;

    public /* synthetic */ C() {
        this.f14799s = 1;
    }

    @Override // java.util.ArrayList
    public Object clone() {
        switch (this.f14799s) {
            case 1:
                C c10 = new C(size(), 1);
                Iterator<E> it = iterator();
                while (it.hasNext()) {
                    c10.add(((org.jsoup.nodes.k) it.next()).clone());
                }
                return c10;
            default:
                return super.clone();
        }
    }

    public boolean d() {
        return size() < 0;
    }

    public String e() {
        StringBuilder sbB = ra.a.b();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) it.next();
            if (sbB.length() != 0) {
                sbB.append(" ");
            }
            sbB.append(kVar.P());
        }
        return ra.a.g(sbB);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.f14799s) {
            case 1:
                StringBuilder sbB = ra.a.b();
                Iterator<E> it = iterator();
                while (it.hasNext()) {
                    org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) it.next();
                    if (sbB.length() != 0) {
                        sbB.append("\n");
                    }
                    sbB.append(kVar.t());
                }
                return ra.a.g(sbB);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(int i10, int i11) {
        super(i10);
        this.f14799s = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(Collection collection) {
        super(collection);
        this.f14799s = 1;
    }
}
