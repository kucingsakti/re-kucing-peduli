package U8;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* JADX INFO: loaded from: classes.dex */
public final class C {
    public final p096j9.f a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4930b;

    public C(p096j9.f fVar, String str) {
        p210v8.i.f(str, InAppPurchaseMetaData.KEY_SIGNATURE);
        this.a = fVar;
        this.f4930b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return p210v8.i.a(this.a, c10.a) && p210v8.i.a(this.f4930b, c10.f4930b);
    }

    public final int hashCode() {
        return this.f4930b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(name=");
        sb.append(this.a);
        sb.append(", signature=");
        return AbstractC0487g.j(sb, this.f4930b, ')');
    }
}
