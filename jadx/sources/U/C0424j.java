package U;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: U.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0424j {
    public final DisplayCutout a;

    public C0424j(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0424j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((C0424j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
