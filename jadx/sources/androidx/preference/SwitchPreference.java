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
import android.widget.Switch;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final C0171a f6861k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final String f6862l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final String f6863m0;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iB = K.b.b(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iB);
        this.f6861k0 = new C0171a(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f922l, iB, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.f6867g0 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f0) {
            m();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.f6868h0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f0) {
            m();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f6862l0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        m();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f6863m0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        m();
        this.f6870j0 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(View view) {
        boolean z6 = view instanceof Switch;
        if (z6) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f0);
        }
        if (z6) {
            Switch r10 = (Switch) view;
            r10.setTextOn(this.f6862l0);
            r10.setTextOff(this.f6863m0);
            r10.setOnCheckedChangeListener(this.f6861k0);
        }
    }

    @Override // androidx.preference.Preference
    public final void q(y yVar) {
        super.q(yVar);
        E(yVar.s(android.R.id.switch_widget));
        D(yVar.s(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void x(View view) {
        super.x(view);
        if (((AccessibilityManager) this.f6832s.getSystemService("accessibility")).isEnabled()) {
            E(view.findViewById(android.R.id.switch_widget));
            D(view.findViewById(android.R.id.summary));
        }
    }
}
