package com.google.android.material.internal;

import C0.w;
import U.U;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f9733y = {R.attr.state_checked};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9736x;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f9737u;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9737u = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9737u ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kcstream.cing.R.attr.imageButtonStyle);
        this.f9735w = true;
        this.f9736x = true;
        U.n(this, new w(this, 5));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f9734v;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        return this.f9734v ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f9733y) : super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6382s);
        setChecked(savedState.f9737u);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9737u = this.f9734v;
        return savedState;
    }

    public void setCheckable(boolean z6) {
        if (this.f9735w != z6) {
            this.f9735w = z6;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (!this.f9735w || this.f9734v == z6) {
            return;
        }
        this.f9734v = z6;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z6) {
        this.f9736x = z6;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        if (this.f9736x) {
            super.setPressed(z6);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f9734v);
    }
}
