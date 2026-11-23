package U;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class v0 extends u0 {
    public v0(B0 b3, WindowInsets windowInsets) {
        super(b3, windowInsets);
    }

    @Override // U.y0
    public B0 a() {
        return B0.h(null, this.f4851c.consumeDisplayCutout());
    }

    @Override // U.y0
    public C0424j e() {
        DisplayCutout displayCutout = this.f4851c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0424j(displayCutout);
    }

    @Override // U.t0, U.y0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Objects.equals(this.f4851c, v0Var.f4851c) && Objects.equals(this.f4855g, v0Var.f4855g);
    }

    @Override // U.y0
    public int hashCode() {
        return this.f4851c.hashCode();
    }
}
