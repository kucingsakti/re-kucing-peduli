package i2;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f12173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f12174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f12177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f12178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f12180i;
    public final byte[] j;

    public h(String str, Integer num, l lVar, long j, long j10, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.f12173b = num;
        this.f12174c = lVar;
        this.f12175d = j;
        this.f12176e = j10;
        this.f12177f = map;
        this.f12178g = num2;
        this.f12179h = str2;
        this.f12180i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f12177f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f12177f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final Q6.b c() {
        Q6.b bVar = new Q6.b();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        bVar.a = str;
        bVar.f4331b = this.f12173b;
        bVar.f4336g = this.f12178g;
        bVar.f4337h = this.f12179h;
        bVar.f4338i = this.f12180i;
        bVar.j = this.j;
        l lVar = this.f12174c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        bVar.f4332c = lVar;
        bVar.f4333d = Long.valueOf(this.f12175d);
        bVar.f4334e = Long.valueOf(this.f12176e);
        bVar.f4335f = new HashMap(this.f12177f);
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.a.equals(hVar.a)) {
            return false;
        }
        Integer num = hVar.f12173b;
        Integer num2 = this.f12173b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.f12174c.equals(hVar.f12174c) || this.f12175d != hVar.f12175d || this.f12176e != hVar.f12176e || !this.f12177f.equals(hVar.f12177f)) {
            return false;
        }
        Integer num3 = hVar.f12178g;
        Integer num4 = this.f12178g;
        if (num4 == null) {
            if (num3 != null) {
                return false;
            }
        } else if (!num4.equals(num3)) {
            return false;
        }
        String str = hVar.f12179h;
        String str2 = this.f12179h;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return Arrays.equals(this.f12180i, hVar.f12180i) && Arrays.equals(this.j, hVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f12173b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f12174c.hashCode()) * 1000003;
        long j = this.f12175d;
        int i10 = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f12176e;
        int iHashCode3 = (((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f12177f.hashCode()) * 1000003;
        Integer num2 = this.f12178g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f12179h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f12180i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.f12173b + ", encodedPayload=" + this.f12174c + ", eventMillis=" + this.f12175d + ", uptimeMillis=" + this.f12176e + ", autoMetadata=" + this.f12177f + ", productId=" + this.f12178g + ", pseudonymousId=" + this.f12179h + ", experimentIdsClear=" + Arrays.toString(this.f12180i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
