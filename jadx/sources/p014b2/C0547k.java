package p014b2;

import c2.i;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: b2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0547k extends AbstractC0556u {
    public final List a;

    public C0547k(List list) {
        this.a = list;
    }

    @Override // p014b2.AbstractC0556u
    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (i iVar : this.a) {
            sb.append(iVar.a);
            Iterator it = iVar.f7449b.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
        }
        String string = sb.toString();
        p210v8.i.e(string, "sb.toString()");
        return string;
    }
}
