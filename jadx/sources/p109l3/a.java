package p109l3;

import J7.j;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import com.kcstream.cing.R;
import p031d.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final TimeInterpolator a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f12914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f12918f;

    public a(View view) {
        this.f12914b = view;
        Context context = view.getContext();
        this.a = j.D(context, R.attr.motionEasingStandardDecelerateInterpolator, W.a.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.f12915c = j.C(context, R.attr.motionDurationMedium2, 300);
        this.f12916d = j.C(context, R.attr.motionDurationShort3, 150);
        this.f12917e = j.C(context, R.attr.motionDurationShort2, 100);
    }
}
