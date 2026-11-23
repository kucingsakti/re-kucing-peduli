package androidx.preference;

import C0.C0171a;
import C0.y;
import C0.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final C0171a f6782k0;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iB = K.b.b(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iB);
        this.f6782k0 = new C0171a(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f913b, iB, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.f6867g0 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f0) {
            m();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.f6868h0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f0) {
            m();
        }
        this.f6870j0 = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(View view) {
        boolean z6 = view instanceof CompoundButton;
        if (z6) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f0);
        }
        if (z6) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f6782k0);
        }
    }

    @Override // androidx.preference.Preference
    public final void q(y yVar) {
        super.q(yVar);
        E(yVar.s(android.R.id.checkbox));
        D(yVar.s(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void x(View view) {
        super.x(view);
        if (((AccessibilityManager) this.f6832s.getSystemService("accessibility")).isEnabled()) {
            E(view.findViewById(android.R.id.checkbox));
            D(view.findViewById(android.R.id.summary));
        }
    }
}
