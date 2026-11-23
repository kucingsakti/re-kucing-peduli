package p014b2;

import c2.m;
import java.util.List;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0556u {
    public final List a;

    public M(List list) {
        i.f(list, "value");
        this.a = list;
    }

    @Override // p014b2.AbstractC0556u
    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (m mVar : this.a) {
            sb.append(mVar.a);
            sb.append(mVar.f7454b);
        }
        String string = sb.toString();
        i.e(string, "sb.toString()");
        return string;
    }
}
