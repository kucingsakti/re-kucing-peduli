package p174r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.tonyodev.fetch2core.server.FileResponse;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        i.g(parcel, "source");
        int i10 = parcel.readInt();
        int i11 = parcel.readInt();
        int i12 = parcel.readInt();
        long j = parcel.readLong();
        long j10 = parcel.readLong();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        return new FileResponse(i10, i11, i12, j, j10, string, string2 != null ? string2 : "");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new FileResponse[i10];
    }
}
