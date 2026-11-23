package d7;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f10549b;

    public a(int i10, CharSequence charSequence) {
        i.f(charSequence, "message");
        this.a = i10;
        this.f10549b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && i.a(this.f10549b, aVar.f10549b);
    }

    public final int hashCode() {
        int i10 = this.a * 31;
        CharSequence charSequence = this.f10549b;
        return i10 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "Error(messageId=" + this.a + ", message=" + this.f10549b + ")";
    }
}
