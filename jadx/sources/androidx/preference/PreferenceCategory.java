package androidx.preference;

import C0.y;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, K.b.b(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        return !super.l();
    }

    @Override // androidx.preference.Preference
    public final boolean l() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void q(y yVar) {
        super.q(yVar);
        if (Build.VERSION.SDK_INT >= 28) {
            yVar.f7003s.setAccessibilityHeading(true);
        }
    }
}
