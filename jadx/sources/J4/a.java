package J4;

import com.tonyodev.fetch2.Download;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Download f2405b;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof a) && ((a) obj).a == this.a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        Download download = this.f2405b;
        return download == null ? "" : String.valueOf(download);
    }
}
