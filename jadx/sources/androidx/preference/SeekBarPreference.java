package androidx.preference;

import C0.A;
import C0.B;
import C0.y;
import C0.z;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f6847g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f6848h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f6849i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f6850j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public SeekBar f6851k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public TextView f6852l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final boolean f6853m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final boolean f6854n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final boolean f6855o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final A f6856p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final B f6857q0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.f6856p0 = new A(this);
        this.f6857q0 = new B(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f921k, R.attr.seekBarPreferenceStyle, 0);
        this.f6847g0 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i10 = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i11 = this.f6847g0;
        i10 = i10 < i11 ? i11 : i10;
        if (i10 != this.f6848h0) {
            this.f6848h0 = i10;
            m();
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i12 != this.f6849i0) {
            this.f6849i0 = Math.min(this.f6848h0 - this.f6847g0, Math.abs(i12));
            m();
        }
        this.f6853m0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f6854n0 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f6855o0 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void C(int i10, boolean z6) {
        int i11 = this.f6847g0;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.f6848h0;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.f0) {
            this.f0 = i10;
            TextView textView = this.f6852l0;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
            }
            if (B()) {
                int i13 = ~i10;
                if (B()) {
                    i13 = this.f6833t.d().getInt(this.f6806D, i13);
                }
                if (i10 != i13) {
                    SharedPreferences.Editor editorB = this.f6833t.b();
                    editorB.putInt(this.f6806D, i10);
                    if (!this.f6833t.f899e) {
                        editorB.apply();
                    }
                }
            }
            if (z6) {
                m();
            }
        }
    }

    public final void D(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f6847g0;
        if (progress != this.f0) {
            f(Integer.valueOf(progress));
            C(progress, false);
        }
    }

    @Override // androidx.preference.Preference
    public final void q(y yVar) {
        super.q(yVar);
        yVar.f7003s.setOnKeyListener(this.f6857q0);
        this.f6851k0 = (SeekBar) yVar.s(R.id.seekbar);
        TextView textView = (TextView) yVar.s(R.id.seekbar_value);
        this.f6852l0 = textView;
        if (this.f6854n0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f6852l0 = null;
        }
        SeekBar seekBar = this.f6851k0;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f6856p0);
        this.f6851k0.setMax(this.f6848h0 - this.f6847g0);
        int i10 = this.f6849i0;
        if (i10 != 0) {
            this.f6851k0.setKeyProgressIncrement(i10);
        } else {
            this.f6849i0 = this.f6851k0.getKeyProgressIncrement();
        }
        this.f6851k0.setProgress(this.f0 - this.f6847g0);
        int i11 = this.f0;
        TextView textView2 = this.f6852l0;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i11));
        }
        this.f6851k0.setEnabled(l());
    }

    @Override // androidx.preference.Preference
    public final Object t(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    @Override // androidx.preference.Preference
    public final void u(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.u(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.u(savedState.getSuperState());
        this.f0 = savedState.f6858s;
        this.f6847g0 = savedState.f6859t;
        this.f6848h0 = savedState.f6860u;
        m();
    }

    @Override // androidx.preference.Preference
    public final Parcelable v() {
        super.v();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f6812J) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.f6858s = this.f0;
        savedState.f6859t = this.f6847g0;
        savedState.f6860u = this.f6848h0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void w(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (B()) {
            iIntValue = this.f6833t.d().getInt(this.f6806D, iIntValue);
        }
        C(iIntValue, true);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new f();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f6858s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f6859t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f6860u;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6858s = parcel.readInt();
            this.f6859t = parcel.readInt();
            this.f6860u = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6858s);
            parcel.writeInt(this.f6859t);
            parcel.writeInt(this.f6860u);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
