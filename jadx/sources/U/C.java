package U;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class C extends E {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4772w;

    public C(int i10, Class cls, int i11, int i12, int i13) {
        this.f4772w = i13;
        this.f4775s = i10;
        this.f4778v = cls;
        this.f4777u = i11;
        this.f4776t = i12;
    }

    @Override // U.E
    public final Object c(View view) {
        switch (this.f4772w) {
            case 0:
                return Boolean.valueOf(M.d(view));
            case 1:
                return M.b(view);
            case 2:
                return O.b(view);
            default:
                return Boolean.valueOf(M.c(view));
        }
    }

    @Override // U.E
    public final void e(View view, Object obj) {
        switch (this.f4772w) {
            case 0:
                M.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                M.h(view, (CharSequence) obj);
                break;
            case 2:
                O.e(view, (CharSequence) obj);
                break;
            default:
                M.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // U.E
    public final boolean h(Object obj, Object obj2) {
        switch (this.f4772w) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
