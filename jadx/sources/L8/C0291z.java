package L8;

import java.util.ArrayList;

/* JADX INFO: renamed from: L8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0291z extends Q {
    public final ArrayList a;

    public C0291z(ArrayList arrayList) {
        this.a = arrayList;
        if (p086i8.y.z(arrayList).size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}
