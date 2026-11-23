package androidx.core.app;

import X0.a;
import X0.b;
import X0.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.a;
        boolean z6 = true;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f6330b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f5374e);
        }
        remoteActionCompat.f6330b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f6331c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f5374e);
        }
        remoteActionCompat.f6331c = charSequence2;
        remoteActionCompat.f6332d = (PendingIntent) aVar.f(remoteActionCompat.f6332d, 4);
        boolean z10 = remoteActionCompat.f6333e;
        if (aVar.e(5)) {
            z10 = ((b) aVar).f5374e.readInt() != 0;
        }
        remoteActionCompat.f6333e = z10;
        boolean z11 = remoteActionCompat.f6334f;
        if (!aVar.e(6)) {
            z6 = z11;
        } else if (((b) aVar).f5374e.readInt() == 0) {
            z6 = false;
        }
        remoteActionCompat.f6334f = z6;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f6330b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f5374e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f6331c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f6332d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z6 = remoteActionCompat.f6333e;
        aVar.h(5);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z10 = remoteActionCompat.f6334f;
        aVar.h(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
