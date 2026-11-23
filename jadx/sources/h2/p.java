package h2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p extends B {
    public final byte[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11708b;

    public p(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.f11708b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B) {
            B b3 = (B) obj;
            boolean z6 = b3 instanceof p;
            if (Arrays.equals(this.a, z6 ? ((p) b3).a : ((p) b3).a)) {
                if (Arrays.equals(this.f11708b, z6 ? ((p) b3).f11708b : ((p) b3).f11708b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11708b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.f11708b) + "}";
    }
}
