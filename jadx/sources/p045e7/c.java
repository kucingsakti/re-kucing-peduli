package p045e7;

import X2.h;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import p181s3.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final float f10714J;

    public c(Context context, int i10) {
        super(context, i10);
        this.f10714J = 440.0f;
    }

    @Override // X2.h, p078i.F, p031d.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        Context context = getContext();
        i.e(context, "context");
        Resources resources = context.getResources();
        i.e(resources, "context.resources");
        if (resources.getConfiguration().orientation != 2 || (window = getWindow()) == null) {
            return;
        }
        Context context2 = getContext();
        i.e(context2, "context");
        Resources resources2 = context2.getResources();
        i.e(resources2, "context.resources");
        window.setLayout(a.t((resources2.getDisplayMetrics().densityDpi / 160) * this.f10714J), -2);
    }
}
