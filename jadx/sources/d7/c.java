package d7;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f10550b;

    public c(int i10, CharSequence charSequence) {
        this.a = i10;
        this.f10550b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && i.a(this.f10550b, cVar.f10550b);
    }

    public final int hashCode() {
        int i10 = this.a * 31;
        CharSequence charSequence = this.f10550b;
        return i10 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "Help(messageId=" + this.a + ", message=" + this.f10550b + ")";
    }
}
