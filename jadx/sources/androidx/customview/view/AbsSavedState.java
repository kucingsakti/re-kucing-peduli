package androidx.customview.view;

import N6.k;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class AbsSavedState implements Parcelable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Parcelable f6382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AbsSavedState f6381t = new AnonymousClass1();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new k(1);

    /* JADX INFO: renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    public class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState() {
        this.f6382s = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f6382s, i10);
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f6382s = parcelable == f6381t ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f6382s = parcelable == null ? f6381t : parcelable;
    }
}
