package p014b2;

import c2.h;
import java.util.List;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0556u {
    public final List a;

    public A(List list) {
        i.f(list, "value");
        this.a = list;
    }

    @Override // p014b2.AbstractC0556u
    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (h hVar : this.a) {
            sb.append(hVar.a);
            sb.append(hVar.f7448b);
        }
        String string = sb.toString();
        i.e(string, "sb.toString()");
        return string;
    }
}
