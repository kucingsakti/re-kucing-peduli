package i2;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f12181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p051f2.d f12182c;

    public i(String str, byte[] bArr, p051f2.d dVar) {
        this.a = str;
        this.f12181b = bArr;
        this.f12182c = dVar;
    }

    public static Y1.c a() {
        Y1.c cVar = new Y1.c(11);
        cVar.f5672v = p051f2.d.f11424s;
        return cVar;
    }

    public final i b(p051f2.d dVar) {
        Y1.c cVarA = a();
        cVarA.M(this.a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        cVarA.f5672v = dVar;
        cVarA.f5671u = this.f12181b;
        return cVarA.l();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.a.equals(iVar.a) && Arrays.equals(this.f12181b, iVar.f12181b) && this.f12182c.equals(iVar.f12182c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12181b)) * 1000003) ^ this.f12182c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f12181b;
        return "TransportContext(" + this.a + ", " + this.f12182c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
