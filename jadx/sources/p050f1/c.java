package p050f1;

import android.net.Uri;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Uri a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11395b;

    public c(boolean z6, Uri uri) {
        this.a = uri;
        this.f11395b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        c cVar = (c) obj;
        return i.a(this.a, cVar.a) && this.f11395b == cVar.f11395b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.f11395b ? 1231 : 1237);
    }
}
