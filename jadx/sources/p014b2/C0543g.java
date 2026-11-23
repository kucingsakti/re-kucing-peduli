package p014b2;

import java.util.Iterator;
import java.util.List;
import p210v8.i;

/* JADX INFO: renamed from: b2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0543g extends AbstractC0556u {
    public final List a;

    public C0543g(List list) {
        this.a = list;
    }

    @Override // p014b2.AbstractC0556u
    public final String a() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String string = sb.toString();
        i.e(string, "sb.toString()");
        return string;
    }
}
