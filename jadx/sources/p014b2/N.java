package p014b2;

import F8.C0212f;
import java.util.Iterator;
import java.util.List;
import p086i8.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC0556u {
    public final List a;

    public N(List list) {
        i.f(list, "value");
        this.a = list;
    }

    @Override // p014b2.AbstractC0556u
    public final String a() {
        StringBuilder sb = new StringBuilder();
        Iterator it = k.o0(this.a, new C0212f(16)).iterator();
        while (it.hasNext()) {
            sb.append(((c2.k) it.next()).a);
        }
        String string = sb.toString();
        i.e(string, "sb.toString()");
        return string;
    }
}
