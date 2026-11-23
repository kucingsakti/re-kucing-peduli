package p163q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        i.g(parcel, "source");
        DownloadBlockInfo downloadBlockInfo = new DownloadBlockInfo();
        downloadBlockInfo.f10368s = parcel.readInt();
        downloadBlockInfo.f10369t = parcel.readInt();
        downloadBlockInfo.f10370u = parcel.readLong();
        downloadBlockInfo.f10371v = parcel.readLong();
        downloadBlockInfo.f10372w = parcel.readLong();
        return downloadBlockInfo;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new DownloadBlockInfo[i10];
    }
}
