package Z8;

import A9.D;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.Set;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f5908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D f5909f;

    public a(int i10, int i11, boolean z6, boolean z10, Set set, D d3) {
        AbstractC0487g.p(i10, "howThisTypeIsUsed");
        AbstractC0487g.p(i11, "flexibility");
        this.a = i10;
        this.f5905b = i11;
        this.f5906c = z6;
        this.f5907d = z10;
        this.f5908e = set;
        this.f5909f = d3;
    }

    public static a a(a aVar, int i10, boolean z6, Set set, D d3, int i11) {
        int i12 = aVar.a;
        if ((i11 & 2) != 0) {
            i10 = aVar.f5905b;
        }
        int i13 = i10;
        if ((i11 & 4) != 0) {
            z6 = aVar.f5906c;
        }
        boolean z10 = z6;
        boolean z11 = aVar.f5907d;
        if ((i11 & 16) != 0) {
            set = aVar.f5908e;
        }
        Set set2 = set;
        if ((i11 & 32) != 0) {
            d3 = aVar.f5909f;
        }
        aVar.getClass();
        AbstractC0487g.p(i12, "howThisTypeIsUsed");
        AbstractC0487g.p(i13, "flexibility");
        return new a(i12, i13, z10, z11, set2, d3);
    }

    public final a b(int i10) {
        AbstractC0487g.p(i10, "flexibility");
        return a(this, i10, false, null, null, 61);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (i.a(aVar.f5909f, this.f5909f)) {
            return aVar.a == this.a && aVar.f5905b == this.f5905b && aVar.f5906c == this.f5906c && aVar.f5907d == this.f5907d;
        }
        return false;
    }

    public final int hashCode() {
        D d3 = this.f5909f;
        int iHashCode = d3 != null ? d3.hashCode() : 0;
        int iD = p239z.e.d(this.a) + (iHashCode * 31) + iHashCode;
        int iD2 = p239z.e.d(this.f5905b) + (iD * 31) + iD;
        int i10 = (iD2 * 31) + (this.f5906c ? 1 : 0) + iD2;
        return (i10 * 31) + (this.f5907d ? 1 : 0) + i10;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        int i10 = this.a;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "COMMON";
        } else {
            str = "SUPERTYPE";
        }
        sb.append(str);
        sb.append(", flexibility=");
        int i11 = this.f5905b;
        if (i11 == 1) {
            str2 = "INFLEXIBLE";
        } else if (i11 != 2) {
            str2 = i11 != 3 ? "null" : "FLEXIBLE_LOWER_BOUND";
        } else {
            str2 = "FLEXIBLE_UPPER_BOUND";
        }
        sb.append(str2);
        sb.append(", isRaw=");
        sb.append(this.f5906c);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.f5907d);
        sb.append(", visitedTypeParameters=");
        sb.append(this.f5908e);
        sb.append(", defaultType=");
        sb.append(this.f5909f);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ a(int i10, boolean z6, boolean z10, Set set, int i11) {
        this(i10, 1, (i11 & 4) != 0 ? false : z6, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? null : set, null);
    }
}
