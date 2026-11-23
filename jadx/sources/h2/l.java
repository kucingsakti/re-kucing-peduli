package h2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0634a {
    public final Integer a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f11705i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f11706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f11707l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.f11698b = str;
        this.f11699c = str2;
        this.f11700d = str3;
        this.f11701e = str4;
        this.f11702f = str5;
        this.f11703g = str6;
        this.f11704h = str7;
        this.f11705i = str8;
        this.j = str9;
        this.f11706k = str10;
        this.f11707l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0634a) {
            AbstractC0634a abstractC0634a = (AbstractC0634a) obj;
            Integer num = this.a;
            if (num != null ? num.equals(((l) abstractC0634a).a) : ((l) abstractC0634a).a == null) {
                String str = this.f11698b;
                if (str != null ? str.equals(((l) abstractC0634a).f11698b) : ((l) abstractC0634a).f11698b == null) {
                    String str2 = this.f11699c;
                    if (str2 != null ? str2.equals(((l) abstractC0634a).f11699c) : ((l) abstractC0634a).f11699c == null) {
                        String str3 = this.f11700d;
                        if (str3 != null ? str3.equals(((l) abstractC0634a).f11700d) : ((l) abstractC0634a).f11700d == null) {
                            String str4 = this.f11701e;
                            if (str4 != null ? str4.equals(((l) abstractC0634a).f11701e) : ((l) abstractC0634a).f11701e == null) {
                                String str5 = this.f11702f;
                                if (str5 != null ? str5.equals(((l) abstractC0634a).f11702f) : ((l) abstractC0634a).f11702f == null) {
                                    String str6 = this.f11703g;
                                    if (str6 != null ? str6.equals(((l) abstractC0634a).f11703g) : ((l) abstractC0634a).f11703g == null) {
                                        String str7 = this.f11704h;
                                        if (str7 != null ? str7.equals(((l) abstractC0634a).f11704h) : ((l) abstractC0634a).f11704h == null) {
                                            String str8 = this.f11705i;
                                            if (str8 != null ? str8.equals(((l) abstractC0634a).f11705i) : ((l) abstractC0634a).f11705i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((l) abstractC0634a).j) : ((l) abstractC0634a).j == null) {
                                                    String str10 = this.f11706k;
                                                    if (str10 != null ? str10.equals(((l) abstractC0634a).f11706k) : ((l) abstractC0634a).f11706k == null) {
                                                        String str11 = this.f11707l;
                                                        if (str11 != null ? str11.equals(((l) abstractC0634a).f11707l) : ((l) abstractC0634a).f11707l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f11698b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f11699c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11700d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f11701e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f11702f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f11703g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f11704h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f11705i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f11706k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f11707l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.f11698b);
        sb.append(", hardware=");
        sb.append(this.f11699c);
        sb.append(", device=");
        sb.append(this.f11700d);
        sb.append(", product=");
        sb.append(this.f11701e);
        sb.append(", osBuild=");
        sb.append(this.f11702f);
        sb.append(", manufacturer=");
        sb.append(this.f11703g);
        sb.append(", fingerprint=");
        sb.append(this.f11704h);
        sb.append(", locale=");
        sb.append(this.f11705i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.f11706k);
        sb.append(", applicationBuild=");
        return E0.a.l(sb, this.f11707l, "}");
    }
}
