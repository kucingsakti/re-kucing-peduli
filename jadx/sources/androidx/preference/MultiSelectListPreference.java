package androidx.preference;

import C0.z;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.kcstream.cing.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final CharSequence[] f6799l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final CharSequence[] f6800m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final HashSet f6801n0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iB = K.b.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iB);
        this.f6801n0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f917f, iB, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f6799l0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f6800m0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void C(Set set) {
        HashSet hashSet = this.f6801n0;
        hashSet.clear();
        hashSet.addAll(set);
        if (B()) {
            if (!set.equals(B() ? this.f6833t.d().getStringSet(this.f6806D, null) : null)) {
                SharedPreferences.Editor editorB = this.f6833t.b();
                editorB.putStringSet(this.f6806D, set);
                if (!this.f6833t.f899e) {
                    editorB.apply();
                }
            }
        }
        m();
    }

    @Override // androidx.preference.Preference
    public final Object t(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.u(savedState.getSuperState());
        C(savedState.f6802s);
    }

    @Override // androidx.preference.Preference
    public final Parcelable v() {
        super.v();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f6812J) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.f6802s = this.f6801n0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void w(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (B()) {
            stringSet = this.f6833t.d().getStringSet(this.f6806D, stringSet);
        }
        C(stringSet);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new c();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public HashSet f6802s;

        public SavedState(Parcel parcel) {
            super(parcel);
            int i10 = parcel.readInt();
            this.f6802s = new HashSet();
            String[] strArr = new String[i10];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f6802s, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6802s.size());
            HashSet hashSet = this.f6802s;
            parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
