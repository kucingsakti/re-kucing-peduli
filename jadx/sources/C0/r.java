package C0;

import A1.RunnableC0094c;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends androidx.fragment.app.b {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public v f877u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public RecyclerView f878v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f879w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f880x0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final q f876t0 = new q(this);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f881y0 = R.layout.preference_list_fragment;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final p f882z0 = new p(this, Looper.getMainLooper(), 0);

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final RunnableC0094c f875A0 = new RunnableC0094c(this, 2);

    @Override // androidx.fragment.app.b
    public final void C(Bundle bundle) {
        super.C(bundle);
        TypedValue typedValue = new TypedValue();
        X().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i10 = typedValue.resourceId;
        if (i10 == 0) {
            i10 = R.style.PreferenceThemeOverlay;
        }
        X().getTheme().applyStyle(i10, false);
        v vVar = new v(X());
        this.f877u0 = vVar;
        vVar.j = this;
        Bundle bundle2 = this.f6656y;
        h0(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.b
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = X().obtainStyledAttributes(null, z.f919h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f881y0 = typedArrayObtainStyledAttributes.getResourceId(0, this.f881y0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(X());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f881y0, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!X().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            X();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setAccessibilityDelegateCompat(new x(recyclerView));
        }
        this.f878v0 = recyclerView;
        q qVar = this.f876t0;
        recyclerView.i(qVar);
        if (drawable != null) {
            qVar.getClass();
            qVar.f872b = drawable.getIntrinsicHeight();
        } else {
            qVar.f872b = 0;
        }
        qVar.a = drawable;
        r rVar = qVar.f874d;
        RecyclerView recyclerView2 = rVar.f878v0;
        if (recyclerView2.f6932H.size() != 0) {
            androidx.recyclerview.widget.w wVar = recyclerView2.f6928F;
            if (wVar != null) {
                wVar.c("Cannot invalidate item decorations during a scroll or layout");
            }
            recyclerView2.R();
            recyclerView2.requestLayout();
        }
        if (dimensionPixelSize != -1) {
            qVar.f872b = dimensionPixelSize;
            RecyclerView recyclerView3 = rVar.f878v0;
            if (recyclerView3.f6932H.size() != 0) {
                androidx.recyclerview.widget.w wVar2 = recyclerView3.f6928F;
                if (wVar2 != null) {
                    wVar2.c("Cannot invalidate item decorations during a scroll or layout");
                }
                recyclerView3.R();
                recyclerView3.requestLayout();
            }
        }
        qVar.f873c = z6;
        if (this.f878v0.getParent() == null) {
            viewGroup2.addView(this.f878v0);
        }
        this.f882z0.post(this.f875A0);
        return viewInflate;
    }

    @Override // androidx.fragment.app.b
    public final void G() {
        p pVar = this.f882z0;
        pVar.removeCallbacks(this.f875A0);
        pVar.removeMessages(1);
        if (this.f879w0) {
            this.f878v0.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f877u0.f901g;
            if (preferenceScreen != null) {
                preferenceScreen.s();
            }
        }
        this.f878v0 = null;
        this.f6634a0 = true;
    }

    @Override // androidx.fragment.app.b
    public final void O(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.f877u0.f901g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.h(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.b
    public final void P() {
        this.f6634a0 = true;
        v vVar = this.f877u0;
        vVar.f902h = this;
        vVar.f903i = this;
    }

    @Override // androidx.fragment.app.b
    public final void Q() {
        this.f6634a0 = true;
        v vVar = this.f877u0;
        vVar.f902h = null;
        vVar.f903i = null;
    }

    @Override // androidx.fragment.app.b
    public final void R(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f877u0.f901g) != null) {
            preferenceScreen2.g(bundle2);
        }
        if (this.f879w0 && (preferenceScreen = this.f877u0.f901g) != null) {
            this.f878v0.setAdapter(new t(preferenceScreen));
            preferenceScreen.o();
        }
        this.f880x0 = true;
    }

    public final Preference g0(String str) {
        PreferenceScreen preferenceScreen;
        v vVar = this.f877u0;
        if (vVar == null || (preferenceScreen = vVar.f901g) == null) {
            return null;
        }
        return preferenceScreen.C(str);
    }

    public abstract void h0(String str);
}
