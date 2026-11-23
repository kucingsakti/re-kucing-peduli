package Q3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J extends N0 {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f4089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final K f4091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0387k0 f4092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0385j0 f4093i;
    public final N j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f4094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4095l;

    public J(String str, String str2, String str3, long j, Long l4, boolean z6, K k3, C0387k0 c0387k0, C0385j0 c0385j0, N n10, List list, int i10) {
        this.a = str;
        this.f4086b = str2;
        this.f4087c = str3;
        this.f4088d = j;
        this.f4089e = l4;
        this.f4090f = z6;
        this.f4091g = k3;
        this.f4092h = c0387k0;
        this.f4093i = c0385j0;
        this.j = n10;
        this.f4094k = list;
        this.f4095l = i10;
    }

    public final I a() {
        I i10 = new I();
        i10.a = this.a;
        i10.f4075b = this.f4086b;
        i10.f4076c = this.f4087c;
        i10.f4077d = this.f4088d;
        i10.f4078e = this.f4089e;
        i10.f4079f = this.f4090f;
        i10.f4080g = this.f4091g;
        i10.f4081h = this.f4092h;
        i10.f4082i = this.f4093i;
        i10.j = this.j;
        i10.f4083k = this.f4094k;
        i10.f4084l = this.f4095l;
        i10.f4085m = (byte) 7;
        return i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        J j = (J) ((N0) obj);
        if (!this.a.equals(j.a)) {
            return false;
        }
        if (!this.f4086b.equals(j.f4086b)) {
            return false;
        }
        String str = j.f4087c;
        String str2 = this.f4087c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f4088d != j.f4088d) {
            return false;
        }
        Long l4 = j.f4089e;
        Long l10 = this.f4089e;
        if (l10 == null) {
            if (l4 != null) {
                return false;
            }
        } else if (!l10.equals(l4)) {
            return false;
        }
        if (this.f4090f != j.f4090f || !this.f4091g.equals(j.f4091g)) {
            return false;
        }
        C0387k0 c0387k0 = j.f4092h;
        C0387k0 c0387k1 = this.f4092h;
        if (c0387k1 == null) {
            if (c0387k0 != null) {
                return false;
            }
        } else if (!c0387k1.equals(c0387k0)) {
            return false;
        }
        C0385j0 c0385j0 = j.f4093i;
        C0385j0 c0385j1 = this.f4093i;
        if (c0385j1 == null) {
            if (c0385j0 != null) {
                return false;
            }
        } else if (!c0385j1.equals(c0385j0)) {
            return false;
        }
        N n10 = j.j;
        N n11 = this.j;
        if (n11 == null) {
            if (n10 != null) {
                return false;
            }
        } else if (!n11.equals(n10)) {
            return false;
        }
        List list = j.f4094k;
        List list2 = this.f4094k;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        return this.f4095l == j.f4095l;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4086b.hashCode()) * 1000003;
        String str = this.f4087c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.f4088d;
        int i10 = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l4 = this.f4089e;
        int iHashCode3 = (((((i10 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003) ^ (this.f4090f ? 1231 : 1237)) * 1000003) ^ this.f4091g.hashCode()) * 1000003;
        C0387k0 c0387k0 = this.f4092h;
        int iHashCode4 = (iHashCode3 ^ (c0387k0 == null ? 0 : c0387k0.hashCode())) * 1000003;
        C0385j0 c0385j0 = this.f4093i;
        int iHashCode5 = (iHashCode4 ^ (c0385j0 == null ? 0 : c0385j0.hashCode())) * 1000003;
        N n10 = this.j;
        int iHashCode6 = (iHashCode5 ^ (n10 == null ? 0 : n10.hashCode())) * 1000003;
        List list = this.f4094k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f4095l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.f4086b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f4087c);
        sb.append(", startedAt=");
        sb.append(this.f4088d);
        sb.append(", endedAt=");
        sb.append(this.f4089e);
        sb.append(", crashed=");
        sb.append(this.f4090f);
        sb.append(", app=");
        sb.append(this.f4091g);
        sb.append(", user=");
        sb.append(this.f4092h);
        sb.append(", os=");
        sb.append(this.f4093i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.f4094k);
        sb.append(", generatorType=");
        return E0.a.j(sb, this.f4095l, "}");
    }
}
