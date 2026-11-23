package F8;

import J0.C0257g;
import L8.AbstractC0281o;
import L8.C0280n;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.WeakHashMap;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: F8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0212f implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0212f(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return C3.a.d(((Method) obj).getName(), ((Method) obj2).getName());
            case 1:
                return C3.a.d(((U) ((C8.l) obj)).b(), ((U) ((C8.l) obj2)).b());
            case 2:
                Integer numB = AbstractC0281o.b((C0280n) obj, (C0280n) obj2);
                if (numB == null) {
                    return 0;
                }
                return numB.intValue();
            case 3:
                WeakHashMap weakHashMap = U.U.a;
                float fM = U.H.m((View) obj);
                float fM2 = U.H.m((View) obj2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            case 4:
                C0257g c0257g = (C0257g) obj;
                C0257g c0257g2 = (C0257g) obj2;
                RecyclerView recyclerView = c0257g.f2308d;
                if ((recyclerView == null) == (c0257g2.f2308d == null)) {
                    boolean z6 = c0257g.a;
                    if (z6 == c0257g2.a) {
                        int i10 = c0257g2.f2306b - c0257g.f2306b;
                        if (i10 != 0) {
                            return i10;
                        }
                        int i11 = c0257g.f2307c - c0257g2.f2307c;
                        if (i11 != 0) {
                            return i11;
                        }
                        return 0;
                    }
                    if (z6) {
                        return -1;
                    }
                } else if (recyclerView != null) {
                    return -1;
                }
                return 1;
            case 5:
                return C3.a.d(Boolean.valueOf(p210v8.i.a(((M4.a) obj2).f3172c, "series")), Boolean.valueOf(p210v8.i.a(((M4.a) obj).f3172c, "series")));
            case 6:
                return C3.a.d(Boolean.valueOf(p210v8.i.a(((M4.a) obj2).f3172c, "episodes")), Boolean.valueOf(p210v8.i.a(((M4.a) obj).f3172c, "episodes")));
            case 7:
                return C3.a.d(Boolean.valueOf(p210v8.i.a(((M4.a) obj2).f3172c, "episodes")), Boolean.valueOf(p210v8.i.a(((M4.a) obj).f3172c, "episodes")));
            case 8:
                return C3.a.d(Boolean.valueOf(p210v8.i.a(((M4.a) obj2).f3172c, "series")), Boolean.valueOf(p210v8.i.a(((M4.a) obj).f3172c, "series")));
            case 9:
                return C3.a.d(((J4.e) obj).a, ((J4.e) obj2).a);
            case 10:
                return C3.a.d(Long.valueOf(((J4.e) obj2).f2412d), Long.valueOf(((J4.e) obj).f2412d));
            case 11:
                return C3.a.d(Long.valueOf(((J4.e) obj2).f2411c), Long.valueOf(((J4.e) obj).f2411c));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((N6.d) obj).f3340b - ((N6.d) obj2).f3340b;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                N6.e eVar = (N6.e) ((View) obj).getLayoutParams();
                N6.e eVar2 = (N6.e) ((View) obj2).getLayoutParams();
                boolean z10 = eVar.a;
                if (z10 != eVar2.a) {
                    return z10 ? 1 : -1;
                }
                return eVar.f3347e - eVar2.f3347e;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return C3.a.d(((c2.k) obj).a, ((c2.k) obj2).a);
            case 15:
                return C3.a.d((String) obj, (String) obj2);
            case 16:
                return C3.a.d(((c2.k) obj).a, ((c2.k) obj2).a);
            case 17:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 18:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 19:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            default:
                return ((p239z.f) obj).f16287t - ((p239z.f) obj2).f16287t;
        }
    }
}
