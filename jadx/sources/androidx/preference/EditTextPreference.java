package androidx.preference;

import C0.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f6791l0;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iB = K.b.b(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iB);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f915d, iB, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (p170r3.e.f14467t == null) {
                p170r3.e.f14467t = new p170r3.e(2);
            }
            this.f6830d0 = p170r3.e.f14467t;
            m();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final boolean A() {
        return TextUtils.isEmpty(this.f6791l0) || super.A();
    }

    public final void C(String str) {
        boolean zA = A();
        this.f6791l0 = str;
        y(str);
        boolean zA2 = A();
        if (zA2 != zA) {
            n(zA2);
        }
        m();
    }

    @Override // androidx.preference.Preference
    public final Object t(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    @Override // androidx.preference.Preference
    public final void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.u(savedState.getSuperState());
        C(savedState.f6792s);
    }

    @Override // androidx.preference.Preference
    public final Parcelable v() {
        super.v();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f6812J) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.f6792s = this.f6791l0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void w(Object obj) {
        C(j((String) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f6792s;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6792s = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f6792s);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
