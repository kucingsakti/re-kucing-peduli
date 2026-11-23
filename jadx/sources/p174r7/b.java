package p174r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.tonyodev.fetch2core.Extras;
import com.tonyodev.fetch2core.server.FileRequest;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.TypeCastException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        i.g(parcel, "source");
        int i10 = parcel.readInt();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        long j = parcel.readLong();
        long j10 = parcel.readLong();
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        Serializable serializable = parcel.readSerializable();
        if (serializable != null) {
            return new FileRequest(i10, string, j, j10, string2, string3, new Extras((HashMap) serializable), parcel.readInt(), parcel.readInt(), parcel.readInt() == 1);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new FileRequest[i10];
    }
}
