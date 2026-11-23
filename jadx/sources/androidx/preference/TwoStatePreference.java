package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f6867g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f6868h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f6869i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f6870j0;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        boolean z6;
        if (this.f6870j0) {
            z6 = this.f0;
        } else {
            z6 = !this.f0;
        }
        return z6 || super.A();
    }

    public final void C(boolean z6) {
        boolean z10 = this.f0 != z6;
        if (z10 || !this.f6869i0) {
            this.f0 = z6;
            this.f6869i0 = true;
            if (B()) {
                boolean z11 = !z6;
                if (B()) {
                    z11 = this.f6833t.d().getBoolean(this.f6806D, z11);
                }
                if (z6 != z11) {
                    SharedPreferences.Editor editorB = this.f6833t.b();
                    editorB.putBoolean(this.f6806D, z6);
                    if (!this.f6833t.f899e) {
                        editorB.apply();
                    }
                }
            }
            if (z10) {
                n(A());
                m();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final void D(View view) {
        boolean z6;
        int i10;
        CharSequence charSequenceK;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.f0 || TextUtils.isEmpty(this.f6867g0)) {
                if (this.f0 || TextUtils.isEmpty(this.f6868h0)) {
                    z6 = true;
                } else {
                    textView.setText(this.f6868h0);
                }
                if (z6) {
                    charSequenceK = k();
                    if (!TextUtils.isEmpty(charSequenceK)) {
                        textView.setText(charSequenceK);
                        z6 = false;
                    }
                }
                i10 = z6 ? 8 : 0;
                if (i10 != textView.getVisibility()) {
                    textView.setVisibility(i10);
                }
            }
            textView.setText(this.f6867g0);
            z6 = false;
            if (z6) {
                charSequenceK = k();
                if (!TextUtils.isEmpty(charSequenceK)) {
                    textView.setText(charSequenceK);
                    z6 = false;
                }
            }
            if (z6) {
            }
            if (i10 != textView.getVisibility()) {
                textView.setVisibility(i10);
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void r() {
        boolean z6 = !this.f0;
        f(Boolean.valueOf(z6));
        C(z6);
    }

    @Override // androidx.preference.Preference
    public final Object t(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    @Override // androidx.preference.Preference
    public final void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.u(savedState.getSuperState());
        C(savedState.f6871s);
    }

    @Override // androidx.preference.Preference
    public final Parcelable v() {
        super.v();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f6812J) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.f6871s = this.f0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void w(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (B()) {
            zBooleanValue = this.f6833t.d().getBoolean(this.f6806D, zBooleanValue);
        }
        C(zBooleanValue);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new g();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f6871s;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6871s = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6871s ? 1 : 0);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
