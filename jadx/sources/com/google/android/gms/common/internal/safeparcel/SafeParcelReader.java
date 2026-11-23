package com.google.android.gms.common.internal.safeparcel;

import E0.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private SafeParcelReader() {
    }

    public static BigDecimal a(Parcel parcel, int i10) {
        int iP = p(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i11 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iP);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i11);
    }

    public static Bundle b(Parcel parcel, int i10) {
        int iP = p(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iP);
        return bundle;
    }

    public static byte[] c(Parcel parcel, int i10) {
        int iP = p(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iP);
        return bArrCreateByteArray;
    }

    public static int[] d(Parcel parcel, int i10) {
        int iP = p(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iP);
        return iArrCreateIntArray;
    }

    public static Parcelable e(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iP = p(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iP);
        return parcelable;
    }

    public static String f(Parcel parcel, int i10) {
        int iP = p(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iP);
        return string;
    }

    public static ArrayList g(Parcel parcel, int i10) {
        int iP = p(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iP);
        return arrayListCreateStringArrayList;
    }

    public static Object[] h(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iP = p(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iP);
        return objArrCreateTypedArray;
    }

    public static ArrayList i(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iP = p(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iP);
        return arrayListCreateTypedArrayList;
    }

    public static void j(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new ParseException(AbstractC0487g.g(i10, "Overread allowed size end="), parcel);
        }
    }

    public static boolean k(Parcel parcel, int i10) {
        t(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder l(Parcel parcel, int i10) {
        int iP = p(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iP);
        return strongBinder;
    }

    public static int m(Parcel parcel, int i10) {
        t(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long n(Parcel parcel, int i10) {
        t(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long o(Parcel parcel, int i10) {
        int iP = p(parcel, i10);
        if (iP == 0) {
            return null;
        }
        s(parcel, iP, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int p(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void q(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + p(parcel, i10));
    }

    public static int r(Parcel parcel) {
        int i10 = parcel.readInt();
        int iP = p(parcel, i10);
        char c10 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iP + iDataPosition;
        if (i11 < iDataPosition || i11 > parcel.dataSize()) {
            throw new ParseException(AbstractC0487g.h("Size read is invalid start=", iDataPosition, " end=", i11), parcel);
        }
        return i11;
    }

    public static void s(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(i10);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i11);
        sb.append(" got ");
        sb.append(i10);
        sb.append(" (0x");
        throw new ParseException(a.l(sb, hexString, ")"), parcel);
    }

    public static void t(Parcel parcel, int i10, int i11) {
        int iP = p(parcel, i10);
        if (iP == i11) {
            return;
        }
        String hexString = Integer.toHexString(iP);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i11);
        sb.append(" got ");
        sb.append(iP);
        sb.append(" (0x");
        throw new ParseException(a.l(sb, hexString, ")"), parcel);
    }
}
