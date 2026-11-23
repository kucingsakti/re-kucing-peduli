package h7;

import android.os.Parcel;
import android.os.Parcelable;
import com.tonyodev.fetch2.DownloadNotification;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        i.g(parcel, "source");
        int i10 = parcel.readInt();
        f fVar = f.NONE;
        switch (i10) {
            case 1:
                fVar = f.QUEUED;
                break;
            case 2:
                fVar = f.DOWNLOADING;
                break;
            case 3:
                fVar = f.PAUSED;
                break;
            case 4:
                fVar = f.COMPLETED;
                break;
            case 5:
                fVar = f.CANCELLED;
                break;
            case 6:
                fVar = f.FAILED;
                break;
            case 7:
                fVar = f.REMOVED;
                break;
            case 8:
                fVar = f.DELETED;
                break;
            case 9:
                fVar = f.ADDED;
                break;
        }
        int i11 = parcel.readInt();
        int i12 = parcel.readInt();
        int i13 = parcel.readInt();
        long j = parcel.readLong();
        long j10 = parcel.readLong();
        long j11 = parcel.readLong();
        long j12 = parcel.readLong();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        String str = string2 != null ? string2 : "";
        DownloadNotification downloadNotification = new DownloadNotification();
        downloadNotification.f10337s = fVar;
        downloadNotification.f10338t = i11;
        downloadNotification.f10339u = i12;
        downloadNotification.f10340v = i13;
        downloadNotification.f10341w = j;
        downloadNotification.f10342x = j10;
        downloadNotification.f10343y = j11;
        downloadNotification.f10344z = j12;
        downloadNotification.f10335A = string;
        downloadNotification.f10336B = str;
        return downloadNotification;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new DownloadNotification[i10];
    }
}
