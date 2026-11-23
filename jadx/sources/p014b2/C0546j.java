package p014b2;

import c2.b;
import java.util.List;
import p210v8.i;

/* JADX INFO: renamed from: b2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0546j extends AbstractC0556u {
    public final List a;

    public C0546j(List list) {
        i.f(list, "value");
        this.a = list;
    }

    @Override // p014b2.AbstractC0556u
    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (b bVar : this.a) {
            sb.append(bVar.a);
            sb.append(bVar.f7434b);
            sb.append(bVar.f7435c);
        }
        String string = sb.toString();
        i.e(string, "sb.toString()");
        return string;
    }
}
