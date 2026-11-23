package p062g3;

import android.content.Context;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11538f = (int) Math.round(5.1000000000000005d);
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11542e;

    public a(Context context) {
        boolean zC = C4.a.C(context, R.attr.elevationOverlayEnabled, false);
        int iF = J7.a.f(context, R.attr.elevationOverlayColor, 0);
        int iF2 = J7.a.f(context, R.attr.elevationOverlayAccentColor, 0);
        int iF3 = J7.a.f(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.a = zC;
        this.f11539b = iF;
        this.f11540c = iF2;
        this.f11541d = iF3;
        this.f11542e = f10;
    }
}
