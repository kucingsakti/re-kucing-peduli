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
import androidx.appcompat.widget.SwitchCompat;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final C0171a f6864k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final String f6865l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final String f6866m0;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.f6864k0 = new C0171a(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f923m, R.attr.switchPreferenceCompatStyle, 0);
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
        this.f6865l0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        m();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f6866m0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        m();
        this.f6870j0 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(View view) {
        boolean z6 = view instanceof SwitchCompat;
        if (z6) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f0);
        }
        if (z6) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f6865l0);
            switchCompat.setTextOff(this.f6866m0);
            switchCompat.setOnCheckedChangeListener(this.f6864k0);
        }
    }

    @Override // androidx.preference.Preference
    public final void q(y yVar) {
        super.q(yVar);
        E(yVar.s(R.id.switchWidget));
        D(yVar.s(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void x(View view) {
        super.x(view);
        if (((AccessibilityManager) this.f6832s.getSystemService("accessibility")).isEnabled()) {
            E(view.findViewById(R.id.switchWidget));
            D(view.findViewById(android.R.id.summary));
        }
    }
}
