package i9;

import com.unity3d.ads.metadata.MediationMetaData;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p068ga.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        super(9);
        i.f(str, MediationMetaData.KEY_NAME);
        i.f(str2, "desc");
        this.f12333b = str;
        this.f12334c = str2;
    }

    @Override // p068ga.d
    public final String b() {
        return this.f12333b + ':' + this.f12334c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.f12333b, dVar.f12333b) && i.a(this.f12334c, dVar.f12334c);
    }

    public final int hashCode() {
        return this.f12334c.hashCode() + (this.f12333b.hashCode() * 31);
    }
}
