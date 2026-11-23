package p163q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.tonyodev.fetch2core.Extras;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.TypeCastException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        i.g(parcel, "source");
        Serializable serializable = parcel.readSerializable();
        if (serializable != null) {
            return new Extras((HashMap) serializable);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new Extras[i10];
    }
}
