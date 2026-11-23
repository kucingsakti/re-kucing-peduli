package C0;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* JADX INFO: renamed from: C0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0171a implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TwoStatePreference f849b;

    public /* synthetic */ C0171a(TwoStatePreference twoStatePreference, int i10) {
        this.a = i10;
        this.f849b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
        switch (this.a) {
            case 0:
                Boolean boolValueOf = Boolean.valueOf(z6);
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f849b;
                checkBoxPreference.f(boolValueOf);
                checkBoxPreference.C(z6);
                break;
            case 1:
                Boolean boolValueOf2 = Boolean.valueOf(z6);
                SwitchPreference switchPreference = (SwitchPreference) this.f849b;
                switchPreference.f(boolValueOf2);
                switchPreference.C(z6);
                break;
            default:
                Boolean boolValueOf3 = Boolean.valueOf(z6);
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.f849b;
                switchPreferenceCompat.f(boolValueOf3);
                switchPreferenceCompat.C(z6);
                break;
        }
    }
}
