package i2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final p051f2.c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f12190b;

    public l(p051f2.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = cVar;
        this.f12190b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a.equals(lVar.a)) {
            return Arrays.equals(this.f12190b, lVar.f12190b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12190b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
