package p014b2;

import java.util.List;
import p076h8.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0556u {
    public final List a;

    public L(List list) {
        i.f(list, "value");
        this.a = list;
    }

    @Override // p014b2.AbstractC0556u
    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (f fVar : this.a) {
            sb.append((String) fVar.f11789s);
            sb.append((String) fVar.f11790t);
        }
        String string = sb.toString();
        i.e(string, "sb.toString()");
        return string;
    }
}
