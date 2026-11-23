package p136o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p125n.a;

/* JADX INFO: loaded from: classes.dex */
public final class p extends FrameLayout implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CollapsibleActionView f13548s;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f13548s = (CollapsibleActionView) view;
        addView(view);
    }
}
