package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final boolean f6846l0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, K.b.b(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.f6846l0 = true;
    }

    @Override // androidx.preference.Preference
    public final void r() {
        androidx.fragment.app.b bVar;
        if (this.f6807E != null || this.f6808F != null || this.f6840g0.size() == 0 || (bVar = this.f6833t.j) == null) {
            return;
        }
        for (bVar = this.f6833t.j; bVar != null; bVar = bVar.f6624Q) {
        }
    }
}
