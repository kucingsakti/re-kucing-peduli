package androidx.preference;

import C0.l;
import C0.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final CharSequence[] f6793l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final CharSequence[] f6794m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f6795n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final String f6796o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f6797p0;

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f916e, i10, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f6793l0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f6794m0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (p204v1.g.f15399v == null) {
                p204v1.g.f15399v = new p204v1.g(2);
            }
            this.f6830d0 = p204v1.g.f15399v;
            m();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z.f918g, i10, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f6796o0 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final int C(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f6794m0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final void D(String str) {
        boolean zEquals = TextUtils.equals(this.f6795n0, str);
        if (zEquals && this.f6797p0) {
            return;
        }
        this.f6795n0 = str;
        this.f6797p0 = true;
        y(str);
        if (zEquals) {
            return;
        }
        m();
    }

    @Override // androidx.preference.Preference
    public final CharSequence k() {
        CharSequence[] charSequenceArr;
        l lVar = this.f6830d0;
        if (lVar != null) {
            return lVar.b(this);
        }
        int iC = C(this.f6795n0);
        CharSequence charSequence = (iC < 0 || (charSequenceArr = this.f6793l0) == null) ? null : charSequenceArr[iC];
        CharSequence charSequenceK = super.k();
        String str = this.f6796o0;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String str2 = String.format(str, charSequence);
            if (!TextUtils.equals(str2, charSequenceK)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceK;
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
        D(savedState.f6798s);
    }

    @Override // androidx.preference.Preference
    public final Parcelable v() {
        super.v();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f6812J) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.f6798s = this.f6795n0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void w(Object obj) {
        D(j((String) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f6798s;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6798s = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f6798s);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, K.b.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
