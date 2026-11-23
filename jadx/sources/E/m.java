package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1259d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1282g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f1258c = typedArrayObtainStyledAttributes.getFloat(index, this.f1258c);
            } else if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.a);
                this.a = i11;
                this.a = o.f1272d[i11];
            } else if (index == 4) {
                this.f1257b = typedArrayObtainStyledAttributes.getInt(index, this.f1257b);
            } else if (index == 3) {
                this.f1259d = typedArrayObtainStyledAttributes.getFloat(index, this.f1259d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
