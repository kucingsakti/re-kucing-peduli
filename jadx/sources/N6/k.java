package N6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.Fragment$SavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;
import com.smarteist.autoimageslider.SliderPager$SavedState;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new SliderPager$SavedState(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.f6381t;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new ParcelableSparseArray(parcel, classLoader);
            case 3:
                return new Fragment$SavedState(parcel, classLoader);
            default:
                return new ExtendableSavedState(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new SliderPager$SavedState[i10];
            case 1:
                return new AbsSavedState[i10];
            case 2:
                return new ParcelableSparseArray[i10];
            case 3:
                return new Fragment$SavedState[i10];
            default:
                return new ExtendableSavedState[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new SliderPager$SavedState(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.f6381t;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new ParcelableSparseArray(parcel, null);
            case 3:
                return new Fragment$SavedState(parcel, null);
            default:
                return new ExtendableSavedState(parcel, null);
        }
    }
}
