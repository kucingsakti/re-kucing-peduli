package V0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f5163b;
    public final HashMap a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5164c = new ArrayList();

    public x(View view) {
        this.f5163b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f5163b == xVar.f5163b && this.a.equals(xVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.f5163b.hashCode() * 31);
    }

    public final String toString() {
        String strC = p231y.a.c(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f5163b + "\n", "    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strC = strC + "    " + str + ": " + map.get(str) + "\n";
        }
        return strC;
    }
}
