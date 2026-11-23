package y0;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: renamed from: y0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0867e {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D f15914b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f15915c = null;

    public C0867e(int i10) {
        this.a = i10;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0867e)) {
            C0867e c0867e = (C0867e) obj;
            if (this.a == c0867e.a && p210v8.i.a(this.f15914b, c0867e.f15914b)) {
                if (!p210v8.i.a(this.f15915c, c0867e.f15915c)) {
                    Bundle bundle = this.f15915c;
                    if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                        if (!setKeySet.isEmpty()) {
                            for (String str : setKeySet) {
                                Bundle bundle2 = this.f15915c;
                                Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = c0867e.f15915c;
                                if (!p210v8.i.a(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int i10 = this.a * 31;
        D d3 = this.f15914b;
        int iHashCode = i10 + (d3 != null ? d3.hashCode() : 0);
        Bundle bundle = this.f15915c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i11 = iHashCode * 31;
                Bundle bundle2 = this.f15915c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode = i11 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0867e.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.f15914b != null) {
            sb.append(" navOptions=");
            sb.append(this.f15914b);
        }
        String string = sb.toString();
        p210v8.i.e(string, "sb.toString()");
        return string;
    }
}
