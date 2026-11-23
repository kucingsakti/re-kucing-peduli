package W1;

import android.view.ViewTreeObserver;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TabLayout f5321s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SimpleSearchView f5322t;

    public g(SimpleSearchView simpleSearchView, TabLayout tabLayout) {
        this.f5322t = simpleSearchView;
        this.f5321s = tabLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        TabLayout tabLayout = this.f5321s;
        this.f5322t.f7681J = tabLayout.getHeight();
        tabLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
