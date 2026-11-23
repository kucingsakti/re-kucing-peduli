package A9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class D extends d0 implements D9.d, D9.e {
    @Override // A9.d0
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public abstract D G0(boolean z6);

    @Override // A9.d0
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public abstract D N0(K k3);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = q().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", p114l9.g.f12984e.x((M8.b) it.next(), null), "] "};
            for (int i10 = 0; i10 < 3; i10++) {
                sb.append(strArr[i10]);
            }
        }
        sb.append(D());
        if (!l().isEmpty()) {
            p086i8.k.Y(l(), sb, ", ", "<", ">", null, 112);
        }
        if (H()) {
            sb.append("?");
        }
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
