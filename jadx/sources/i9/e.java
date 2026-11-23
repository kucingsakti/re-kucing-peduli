package i9;

import com.unity3d.ads.metadata.MediationMetaData;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p068ga.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2) {
        super(9);
        i.f(str, MediationMetaData.KEY_NAME);
        i.f(str2, "desc");
        this.f12335b = str;
        this.f12336c = str2;
    }

    @Override // p068ga.d
    public final String b() {
        return this.f12335b + this.f12336c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return i.a(this.f12335b, eVar.f12335b) && i.a(this.f12336c, eVar.f12336c);
    }

    public final int hashCode() {
        return this.f12336c.hashCode() + (this.f12335b.hashCode() * 31);
    }
}
