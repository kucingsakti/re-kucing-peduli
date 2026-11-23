package V0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class E extends qa.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f5081d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f5082e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f5083f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f5084g = true;

    @Override // qa.b
    public void B(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.B(view, i10);
        } else if (f5084g) {
            try {
                D.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f5084g = false;
            }
        }
    }

    public void G(View view, int i10, int i11, int i12, int i13) {
        if (f5083f) {
            try {
                C.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f5083f = false;
            }
        }
    }

    public void H(View view, Matrix matrix) {
        if (f5081d) {
            try {
                B.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f5081d = false;
            }
        }
    }

    public void I(View view, Matrix matrix) {
        if (f5082e) {
            try {
                B.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f5082e = false;
            }
        }
    }
}
