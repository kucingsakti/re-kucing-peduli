package Q4;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final Long rywDelay;
    private final String rywToken;

    public b(String str, Long l4) {
        i.f(str, "rywToken");
        this.rywToken = str;
        this.rywDelay = l4;
    }

    public static /* synthetic */ b copy$default(b bVar, String str, Long l4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.rywToken;
        }
        if ((i10 & 2) != 0) {
            l4 = bVar.rywDelay;
        }
        return bVar.copy(str, l4);
    }

    public final String component1() {
        return this.rywToken;
    }

    public final Long component2() {
        return this.rywDelay;
    }

    public final b copy(String str, Long l4) {
        i.f(str, "rywToken");
        return new b(str, l4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.rywToken, bVar.rywToken) && i.a(this.rywDelay, bVar.rywDelay);
    }

    public final Long getRywDelay() {
        return this.rywDelay;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public int hashCode() {
        int iHashCode = this.rywToken.hashCode() * 31;
        Long l4 = this.rywDelay;
        return iHashCode + (l4 == null ? 0 : l4.hashCode());
    }

    public String toString() {
        return "RywData(rywToken=" + this.rywToken + ", rywDelay=" + this.rywDelay + ')';
    }
}
