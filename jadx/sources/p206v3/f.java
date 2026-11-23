package p206v3;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public CharSequence a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f15430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TabLayout f15431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f15432e;

    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequence)) {
            this.f15432e.setContentDescription(charSequence);
        }
        this.a = charSequence;
        h hVar = this.f15432e;
        if (hVar != null) {
            hVar.d();
        }
    }
}
