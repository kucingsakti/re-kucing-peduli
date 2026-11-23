package p197u4;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final Boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f15321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f15322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f15323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f15324e;

    public f(Boolean bool, Double d3, Integer num, Integer num2, Long l4) {
        this.a = bool;
        this.f15321b = d3;
        this.f15322c = num;
        this.f15323d = num2;
        this.f15324e = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.a, fVar.a) && i.a(this.f15321b, fVar.f15321b) && i.a(this.f15322c, fVar.f15322c) && i.a(this.f15323d, fVar.f15323d) && i.a(this.f15324e, fVar.f15324e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d3 = this.f15321b;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f15322c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f15323d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l4 = this.f15324e;
        return iHashCode4 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.a + ", sessionSamplingRate=" + this.f15321b + ", sessionRestartTimeout=" + this.f15322c + ", cacheDuration=" + this.f15323d + ", cacheUpdatedTime=" + this.f15324e + ')';
    }
}
