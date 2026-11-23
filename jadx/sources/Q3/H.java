package Q3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class H extends s0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f4074b;

    public H(String str, byte[] bArr) {
        this.a = str;
        this.f4074b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.a.equals(((H) s0Var).a)) {
                if (Arrays.equals(this.f4074b, (s0Var instanceof H ? (H) s0Var : (H) s0Var).f4074b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4074b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.f4074b) + "}";
    }
}
