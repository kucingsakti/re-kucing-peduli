package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class x extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecyclerView.a f7135s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f7136t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7137u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7138v;

    public x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7136t = new Rect();
        this.f7137u = true;
        this.f7138v = false;
    }

    public x(int i10, int i11) {
        super(i10, i11);
        this.f7136t = new Rect();
        this.f7137u = true;
        this.f7138v = false;
    }

    public x(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7136t = new Rect();
        this.f7137u = true;
        this.f7138v = false;
    }

    public x(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7136t = new Rect();
        this.f7137u = true;
        this.f7138v = false;
    }

    public x(x xVar) {
        super((ViewGroup.LayoutParams) xVar);
        this.f7136t = new Rect();
        this.f7137u = true;
        this.f7138v = false;
    }
}
