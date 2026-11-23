package p182s4;

/* JADX INFO: renamed from: s4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0773j {
    public final EnumC0772i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0772i f14695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f14696c;

    public C0773j(EnumC0772i enumC0772i, EnumC0772i enumC0772i2, double d3) {
        this.a = enumC0772i;
        this.f14695b = enumC0772i2;
        this.f14696c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0773j)) {
            return false;
        }
        C0773j c0773j = (C0773j) obj;
        return this.a == c0773j.a && this.f14695b == c0773j.f14695b && Double.compare(this.f14696c, c0773j.f14696c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f14695b.hashCode() + (this.a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f14696c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.f14695b + ", sessionSamplingRate=" + this.f14696c + ')';
    }
}
