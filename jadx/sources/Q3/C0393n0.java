package Q3;

import android.os.Build;

/* JADX INFO: renamed from: Q3.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0393n0 {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4277f;

    public C0393n0(int i10, int i11, long j, long j10, boolean z6, int i12) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f4273b = i11;
        this.f4274c = j;
        this.f4275d = j10;
        this.f4276e = z6;
        this.f4277f = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0393n0)) {
            return false;
        }
        C0393n0 c0393n0 = (C0393n0) obj;
        if (this.a != c0393n0.a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f4273b != c0393n0.f4273b || this.f4274c != c0393n0.f4274c || this.f4275d != c0393n0.f4275d || this.f4276e != c0393n0.f4276e || this.f4277f != c0393n0.f4277f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f4273b) * 1000003;
        long j = this.f4274c;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f4275d;
        return Build.PRODUCT.hashCode() ^ ((((((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f4276e ? 1231 : 1237)) * 1000003) ^ this.f4277f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.f4273b);
        sb.append(", totalRam=");
        sb.append(this.f4274c);
        sb.append(", diskSpace=");
        sb.append(this.f4275d);
        sb.append(", isEmulator=");
        sb.append(this.f4276e);
        sb.append(", state=");
        sb.append(this.f4277f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return E0.a.l(sb, Build.PRODUCT, "}");
    }
}
