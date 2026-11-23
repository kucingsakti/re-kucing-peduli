package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final SparseIntArray j;
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1256i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1281f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (j.get(index)) {
                case 1:
                    this.f1252e = typedArrayObtainStyledAttributes.getFloat(index, this.f1252e);
                    break;
                case 2:
                    this.f1250c = typedArrayObtainStyledAttributes.getInt(index, this.f1250c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = A.a.a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.a = o.f(typedArrayObtainStyledAttributes, index, this.a);
                    break;
                case 6:
                    this.f1249b = typedArrayObtainStyledAttributes.getInteger(index, this.f1249b);
                    break;
                case 7:
                    this.f1251d = typedArrayObtainStyledAttributes.getFloat(index, this.f1251d);
                    break;
                case 8:
                    this.f1254g = typedArrayObtainStyledAttributes.getInteger(index, this.f1254g);
                    break;
                case 9:
                    this.f1253f = typedArrayObtainStyledAttributes.getFloat(index, this.f1253f);
                    break;
                case 10:
                    int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        this.f1256i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i11 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f1255h = string;
                        if (string.indexOf("/") > 0) {
                            this.f1256i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f1256i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
