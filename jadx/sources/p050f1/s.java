package p050f1;

import com.bumptech.glide.d;

/* JADX INFO: loaded from: classes.dex */
public final class s extends d {
    public final Throwable a;

    public s(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return "FAILURE (" + this.a.getMessage() + ")";
    }
}
