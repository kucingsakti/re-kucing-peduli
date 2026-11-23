package K;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final Resources a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f2497b;

    public l(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.f2497b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.a.equals(lVar.a) && Objects.equals(this.f2497b, lVar.f2497b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.f2497b);
    }
}
