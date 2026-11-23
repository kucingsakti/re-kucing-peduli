package p188t1;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.Arrays;
import p086i8.C;
import p210v8.i;

/* JADX INFO: renamed from: t1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0851n {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f15069b;

    public C0851n(String str, String[] strArr) {
        C.a(C.c("0E63B9CC"));
        this.a = str;
        this.f15069b = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0851n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i.d(obj, C.a(C.c("0E77B8C54AE6C4A988781B4899483437C2DABAA047D9721355ECE83A2AE9351C147BA4CC4AE6CAAAC876070D9A497D20C6CAE0F452DA211859DDB6313CF02B55147BFADA0FE6D0B58F6316469E406138C2DDA1F21DE620124AE7B72026")));
        C0851n c0851n = (C0851n) obj;
        if (!i.a(this.a, c0851n.a)) {
            return false;
        }
        String[] strArr = c0851n.f15069b;
        String[] strArr2 = this.f15069b;
        if (strArr2 != null) {
            if (strArr == null || !Arrays.equals(strArr2, strArr)) {
                return false;
            }
        } else if (strArr != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String[] strArr = this.f15069b;
        return iHashCode + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C.a(C.c("3070BBD90FF7D1BECE790E059E10")));
        sb.append(this.a);
        sb.append(C.a(C.c("4C22A2C806F0C0FA")));
        return AbstractC0487g.j(sb, Arrays.toString(this.f15069b), ')');
    }
}
