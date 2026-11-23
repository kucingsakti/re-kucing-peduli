package androidx.core.graphics.drawable;

import X0.a;
import X0.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i10 = iconCompat.a;
        if (aVar.e(1)) {
            i10 = ((b) aVar).f5374e.readInt();
        }
        iconCompat.a = i10;
        byte[] bArr = iconCompat.f6343c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f5374e;
            int i11 = parcel.readInt();
            if (i11 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i11];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f6343c = bArr;
        iconCompat.f6344d = aVar.f(iconCompat.f6344d, 3);
        int i12 = iconCompat.f6345e;
        if (aVar.e(4)) {
            i12 = ((b) aVar).f5374e.readInt();
        }
        iconCompat.f6345e = i12;
        int i13 = iconCompat.f6346f;
        if (aVar.e(5)) {
            i13 = ((b) aVar).f5374e.readInt();
        }
        iconCompat.f6346f = i13;
        iconCompat.f6347g = (ColorStateList) aVar.f(iconCompat.f6347g, 6);
        String string = iconCompat.f6349i;
        if (aVar.e(7)) {
            string = ((b) aVar).f5374e.readString();
        }
        iconCompat.f6349i = string;
        String string2 = iconCompat.j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f5374e.readString();
        }
        iconCompat.j = string2;
        iconCompat.f6348h = PorterDuff.Mode.valueOf(iconCompat.f6349i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.f6344d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f6342b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f6344d;
                if (parcelable2 != null) {
                    iconCompat.f6342b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f6343c;
                iconCompat.f6342b = bArr3;
                iconCompat.a = 3;
                iconCompat.f6345e = 0;
                iconCompat.f6346f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f6343c, Charset.forName("UTF-16"));
                iconCompat.f6342b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f6342b = iconCompat.f6343c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f6349i = iconCompat.f6348h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.f6344d = (Parcelable) iconCompat.f6342b;
                break;
            case 1:
            case 5:
                iconCompat.f6344d = (Parcelable) iconCompat.f6342b;
                break;
            case 2:
                iconCompat.f6343c = ((String) iconCompat.f6342b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f6343c = (byte[]) iconCompat.f6342b;
                break;
            case 4:
            case 6:
                iconCompat.f6343c = iconCompat.f6342b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.a;
        if (-1 != i10) {
            aVar.h(1);
            ((b) aVar).f5374e.writeInt(i10);
        }
        byte[] bArr = iconCompat.f6343c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f5374e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f6344d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f5374e.writeParcelable(parcelable, 0);
        }
        int i11 = iconCompat.f6345e;
        if (i11 != 0) {
            aVar.h(4);
            ((b) aVar).f5374e.writeInt(i11);
        }
        int i12 = iconCompat.f6346f;
        if (i12 != 0) {
            aVar.h(5);
            ((b) aVar).f5374e.writeInt(i12);
        }
        ColorStateList colorStateList = iconCompat.f6347g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f5374e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f6349i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f5374e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f5374e.writeString(str2);
        }
    }
}
