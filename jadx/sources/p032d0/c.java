package p032d0;

import V.j;
import android.graphics.Rect;
import java.util.Comparator;
import p230x9.d;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparator {
    public final Rect a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f10510b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f10512d;

    public c(boolean z6, d dVar) {
        this.f10511c = z6;
        this.f10512d = dVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f10512d.getClass();
        Rect rect = this.a;
        ((j) obj).f(rect);
        Rect rect2 = this.f10510b;
        ((j) obj2).f(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z6 = this.f10511c;
        if (i12 < i13) {
            return z6 ? 1 : -1;
        }
        if (i12 > i13) {
            return z6 ? -1 : 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            return z6 ? 1 : -1;
        }
        if (i16 > i17) {
            return z6 ? -1 : 1;
        }
        return 0;
    }
}
