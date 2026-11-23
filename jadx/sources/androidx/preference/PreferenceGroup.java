package androidx.preference;

import C0.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import java.util.ArrayList;
import p212w.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final i f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final ArrayList f6840g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f6841h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f6842i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f6843j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f6844k0;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f0 = new i(0);
        new Handler(Looper.getMainLooper());
        this.f6841h0 = true;
        this.f6842i0 = 0;
        this.f6843j0 = false;
        this.f6844k0 = Integer.MAX_VALUE;
        this.f6840g0 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f920i, i10, 0);
        this.f6841h0 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i11 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i11 != Integer.MAX_VALUE) {
                TextUtils.isEmpty(this.f6806D);
            }
            this.f6844k0 = i11;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Preference C(String str) {
        Preference preferenceC;
        if (str == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f6806D, str)) {
            return this;
        }
        int size = this.f6840g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preferenceD = D(i10);
            if (TextUtils.equals(preferenceD.f6806D, str)) {
                return preferenceD;
            }
            if ((preferenceD instanceof PreferenceGroup) && (preferenceC = ((PreferenceGroup) preferenceD).C(str)) != null) {
                return preferenceC;
            }
        }
        return null;
    }

    public final Preference D(int i10) {
        return (Preference) this.f6840g0.get(i10);
    }

    @Override // androidx.preference.Preference
    public final void g(Bundle bundle) {
        super.g(bundle);
        int size = this.f6840g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            D(i10).g(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void h(Bundle bundle) {
        super.h(bundle);
        int size = this.f6840g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            D(i10).h(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void n(boolean z6) {
        super.n(z6);
        int size = this.f6840g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preferenceD = D(i10);
            if (preferenceD.f6816N == z6) {
                preferenceD.f6816N = !z6;
                preferenceD.n(preferenceD.A());
                preferenceD.m();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void o() {
        super.o();
        this.f6843j0 = true;
        int size = this.f6840g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            D(i10).o();
        }
    }

    @Override // androidx.preference.Preference
    public final void s() {
        super.s();
        this.f6843j0 = false;
        int size = this.f6840g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            D(i10).s();
        }
    }

    @Override // androidx.preference.Preference
    public final void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f6844k0 = savedState.f6845s;
        super.u(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable v() {
        super.v();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new SavedState(this.f6844k0);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f6845s;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6845s = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6845s);
        }

        public SavedState(int i10) {
            super(AbsSavedState.EMPTY_STATE);
            this.f6845s = i10;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
