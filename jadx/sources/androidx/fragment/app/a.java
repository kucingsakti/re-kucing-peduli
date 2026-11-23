package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.f6583s = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.f6584t = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 3:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f6589w = null;
                fragmentManagerState.f6590x = new ArrayList();
                fragmentManagerState.f6591y = new ArrayList();
                fragmentManagerState.f6585s = parcel.createStringArrayList();
                fragmentManagerState.f6586t = parcel.createStringArrayList();
                fragmentManagerState.f6587u = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                fragmentManagerState.f6588v = parcel.readInt();
                fragmentManagerState.f6589w = parcel.readString();
                fragmentManagerState.f6590x = parcel.createStringArrayList();
                fragmentManagerState.f6591y = parcel.createTypedArrayList(BackStackState.CREATOR);
                fragmentManagerState.f6592z = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            default:
                return new FragmentState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new BackStackRecordState[i10];
            case 1:
                return new BackStackState[i10];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i10];
            case 3:
                return new FragmentManagerState[i10];
            default:
                return new FragmentState[i10];
        }
    }
}
