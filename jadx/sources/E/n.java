package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f1260n;
    public float a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1268i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f1271m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1260n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1284i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            switch (f1260n.get(index)) {
                case 1:
                    this.a = typedArrayObtainStyledAttributes.getFloat(index, this.a);
                    break;
                case 2:
                    this.f1261b = typedArrayObtainStyledAttributes.getFloat(index, this.f1261b);
                    break;
                case 3:
                    this.f1262c = typedArrayObtainStyledAttributes.getFloat(index, this.f1262c);
                    break;
                case 4:
                    this.f1263d = typedArrayObtainStyledAttributes.getFloat(index, this.f1263d);
                    break;
                case 5:
                    this.f1264e = typedArrayObtainStyledAttributes.getFloat(index, this.f1264e);
                    break;
                case 6:
                    this.f1265f = typedArrayObtainStyledAttributes.getDimension(index, this.f1265f);
                    break;
                case 7:
                    this.f1266g = typedArrayObtainStyledAttributes.getDimension(index, this.f1266g);
                    break;
                case 8:
                    this.f1268i = typedArrayObtainStyledAttributes.getDimension(index, this.f1268i);
                    break;
                case 9:
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.f1269k = typedArrayObtainStyledAttributes.getDimension(index, this.f1269k);
                    break;
                case 11:
                    this.f1270l = true;
                    this.f1271m = typedArrayObtainStyledAttributes.getDimension(index, this.f1271m);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    this.f1267h = o.f(typedArrayObtainStyledAttributes, index, this.f1267h);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
