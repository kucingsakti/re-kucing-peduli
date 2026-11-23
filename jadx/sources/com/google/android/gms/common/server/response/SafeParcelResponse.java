package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Parcel f8225t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8226u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final zan f8227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f8228w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8229x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8230y;

    public SafeParcelResponse(int i10, Parcel parcel, zan zanVar) {
        this.f8224s = i10;
        Preconditions.i(parcel);
        this.f8225t = parcel;
        this.f8226u = 2;
        this.f8227v = zanVar;
        this.f8228w = zanVar == null ? null : zanVar.f8239u;
        this.f8229x = 2;
    }

    public static void i(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel parcelObtain;
        BigInteger[] bigIntegerArr;
        long[] jArrCreateLongArray;
        float[] fArrCreateFloatArray;
        double[] dArrCreateDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] zArrCreateBooleanArray;
        String[] strArrCreateStringArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).f8222y, entry);
        }
        sb.append('{');
        int iR = SafeParcelReader.r(parcel);
        boolean z6 = false;
        while (parcel.dataPosition() < iR) {
            int i10 = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i10);
            if (entry2 != null) {
                if (z6) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                StringToIntConverter stringToIntConverter = field.f8215C;
                int i11 = field.f8219v;
                if (stringToIntConverter != null) {
                    switch (i11) {
                        case 0:
                            k(sb, field, FastJsonResponse.f(field, Integer.valueOf(SafeParcelReader.m(parcel, i10))));
                            break;
                        case 1:
                            int iP = SafeParcelReader.p(parcel, i10);
                            int iDataPosition = parcel.dataPosition();
                            if (iP == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iP);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            k(sb, field, FastJsonResponse.f(field, bigInteger2));
                            break;
                        case 2:
                            k(sb, field, FastJsonResponse.f(field, Long.valueOf(SafeParcelReader.n(parcel, i10))));
                            break;
                        case 3:
                            SafeParcelReader.t(parcel, i10, 4);
                            k(sb, field, FastJsonResponse.f(field, Float.valueOf(parcel.readFloat())));
                            break;
                        case 4:
                            SafeParcelReader.t(parcel, i10, 8);
                            k(sb, field, FastJsonResponse.f(field, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            k(sb, field, FastJsonResponse.f(field, SafeParcelReader.a(parcel, i10)));
                            break;
                        case 6:
                            k(sb, field, FastJsonResponse.f(field, Boolean.valueOf(SafeParcelReader.k(parcel, i10))));
                            break;
                        case 7:
                            k(sb, field, FastJsonResponse.f(field, SafeParcelReader.f(parcel, i10)));
                            break;
                        case 8:
                        case 9:
                            k(sb, field, FastJsonResponse.f(field, SafeParcelReader.c(parcel, i10)));
                            break;
                        case 10:
                            Bundle bundleB = SafeParcelReader.b(parcel, i10);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleB.keySet()) {
                                String string = bundleB.getString(str2);
                                Preconditions.i(string);
                                map2.put(str2, string);
                            }
                            k(sb, field, FastJsonResponse.f(field, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(AbstractC0487g.g(i11, "Unknown field out type = "));
                    }
                } else {
                    boolean z10 = field.f8220w;
                    String str3 = field.f8213A;
                    if (z10) {
                        sb.append("[");
                        switch (i11) {
                            case 0:
                                int[] iArrD = SafeParcelReader.d(parcel, i10);
                                int length = iArrD.length;
                                for (int i12 = 0; i12 < length; i12++) {
                                    if (i12 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(iArrD[i12]);
                                }
                                break;
                            case 1:
                                int iP2 = SafeParcelReader.p(parcel, i10);
                                int iDataPosition2 = parcel.dataPosition();
                                if (iP2 == 0) {
                                    bigIntegerArr = null;
                                } else {
                                    int i13 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[i13];
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        bigIntegerArr[i14] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(iDataPosition2 + iP2);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i15 = 0; i15 < length2; i15++) {
                                    if (i15 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigIntegerArr[i15]);
                                }
                                break;
                            case 2:
                                int iP3 = SafeParcelReader.p(parcel, i10);
                                int iDataPosition3 = parcel.dataPosition();
                                if (iP3 == 0) {
                                    jArrCreateLongArray = null;
                                } else {
                                    jArrCreateLongArray = parcel.createLongArray();
                                    parcel.setDataPosition(iDataPosition3 + iP3);
                                }
                                int length3 = jArrCreateLongArray.length;
                                for (int i16 = 0; i16 < length3; i16++) {
                                    if (i16 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(jArrCreateLongArray[i16]);
                                }
                                break;
                            case 3:
                                int iP4 = SafeParcelReader.p(parcel, i10);
                                int iDataPosition4 = parcel.dataPosition();
                                if (iP4 == 0) {
                                    fArrCreateFloatArray = null;
                                } else {
                                    fArrCreateFloatArray = parcel.createFloatArray();
                                    parcel.setDataPosition(iDataPosition4 + iP4);
                                }
                                int length4 = fArrCreateFloatArray.length;
                                for (int i17 = 0; i17 < length4; i17++) {
                                    if (i17 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(fArrCreateFloatArray[i17]);
                                }
                                break;
                            case 4:
                                int iP5 = SafeParcelReader.p(parcel, i10);
                                int iDataPosition5 = parcel.dataPosition();
                                if (iP5 == 0) {
                                    dArrCreateDoubleArray = null;
                                } else {
                                    dArrCreateDoubleArray = parcel.createDoubleArray();
                                    parcel.setDataPosition(iDataPosition5 + iP5);
                                }
                                int length5 = dArrCreateDoubleArray.length;
                                for (int i18 = 0; i18 < length5; i18++) {
                                    if (i18 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(dArrCreateDoubleArray[i18]);
                                }
                                break;
                            case 5:
                                int iP6 = SafeParcelReader.p(parcel, i10);
                                int iDataPosition6 = parcel.dataPosition();
                                if (iP6 == 0) {
                                    bigDecimalArr = null;
                                } else {
                                    int i19 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[i19];
                                    for (int i20 = 0; i20 < i19; i20++) {
                                        bigDecimalArr[i20] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                    }
                                    parcel.setDataPosition(iDataPosition6 + iP6);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i21 = 0; i21 < length6; i21++) {
                                    if (i21 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigDecimalArr[i21]);
                                }
                                break;
                            case 6:
                                int iP7 = SafeParcelReader.p(parcel, i10);
                                int iDataPosition7 = parcel.dataPosition();
                                if (iP7 == 0) {
                                    zArrCreateBooleanArray = null;
                                } else {
                                    zArrCreateBooleanArray = parcel.createBooleanArray();
                                    parcel.setDataPosition(iDataPosition7 + iP7);
                                }
                                int length7 = zArrCreateBooleanArray.length;
                                for (int i22 = 0; i22 < length7; i22++) {
                                    if (i22 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(zArrCreateBooleanArray[i22]);
                                }
                                break;
                            case 7:
                                int iP8 = SafeParcelReader.p(parcel, i10);
                                int iDataPosition8 = parcel.dataPosition();
                                if (iP8 == 0) {
                                    strArrCreateStringArray = null;
                                } else {
                                    strArrCreateStringArray = parcel.createStringArray();
                                    parcel.setDataPosition(iDataPosition8 + iP8);
                                }
                                int length8 = strArrCreateStringArray.length;
                                for (int i23 = 0; i23 < length8; i23++) {
                                    if (i23 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(strArrCreateStringArray[i23]);
                                    sb.append("\"");
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                int iP9 = SafeParcelReader.p(parcel, i10);
                                int iDataPosition9 = parcel.dataPosition();
                                if (iP9 == 0) {
                                    parcelArr = null;
                                } else {
                                    int i24 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[i24];
                                    for (int i25 = 0; i25 < i24; i25++) {
                                        int i26 = parcel.readInt();
                                        if (i26 != 0) {
                                            int iDataPosition10 = parcel.dataPosition();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            parcelObtain2.appendFrom(parcel, iDataPosition10, i26);
                                            parcelArr2[i25] = parcelObtain2;
                                            parcel.setDataPosition(iDataPosition10 + i26);
                                        } else {
                                            parcelArr2[i25] = null;
                                        }
                                    }
                                    parcel.setDataPosition(iDataPosition9 + iP9);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i27 = 0; i27 < length9; i27++) {
                                    if (i27 > 0) {
                                        sb.append(",");
                                    }
                                    parcelArr[i27].setDataPosition(0);
                                    Preconditions.i(str3);
                                    Preconditions.i(field.f8214B);
                                    Map map3 = (Map) field.f8214B.f8238t.get(str3);
                                    Preconditions.i(map3);
                                    i(sb, map3, parcelArr[i27]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb.append("]");
                    } else {
                        switch (i11) {
                            case 0:
                                sb.append(SafeParcelReader.m(parcel, i10));
                                break;
                            case 1:
                                int iP10 = SafeParcelReader.p(parcel, i10);
                                int iDataPosition11 = parcel.dataPosition();
                                if (iP10 == 0) {
                                    bigInteger = null;
                                } else {
                                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                    parcel.setDataPosition(iDataPosition11 + iP10);
                                    bigInteger = new BigInteger(bArrCreateByteArray2);
                                }
                                sb.append(bigInteger);
                                break;
                            case 2:
                                sb.append(SafeParcelReader.n(parcel, i10));
                                break;
                            case 3:
                                SafeParcelReader.t(parcel, i10, 4);
                                sb.append(parcel.readFloat());
                                break;
                            case 4:
                                SafeParcelReader.t(parcel, i10, 8);
                                sb.append(parcel.readDouble());
                                break;
                            case 5:
                                sb.append(SafeParcelReader.a(parcel, i10));
                                break;
                            case 6:
                                sb.append(SafeParcelReader.k(parcel, i10));
                                break;
                            case 7:
                                String strF = SafeParcelReader.f(parcel, i10);
                                sb.append("\"");
                                sb.append(JsonUtils.a(strF));
                                sb.append("\"");
                                break;
                            case 8:
                                byte[] bArrC = SafeParcelReader.c(parcel, i10);
                                sb.append("\"");
                                sb.append(bArrC == null ? null : Base64.encodeToString(bArrC, 0));
                                sb.append("\"");
                                break;
                            case 9:
                                byte[] bArrC2 = SafeParcelReader.c(parcel, i10);
                                sb.append("\"");
                                sb.append(bArrC2 == null ? null : Base64.encodeToString(bArrC2, 10));
                                sb.append("\"");
                                break;
                            case 10:
                                Bundle bundleB2 = SafeParcelReader.b(parcel, i10);
                                Set<String> setKeySet = bundleB2.keySet();
                                sb.append("{");
                                boolean z11 = true;
                                for (String str4 : setKeySet) {
                                    if (!z11) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(str4);
                                    sb.append("\":\"");
                                    sb.append(JsonUtils.a(bundleB2.getString(str4)));
                                    sb.append("\"");
                                    z11 = false;
                                }
                                sb.append("}");
                                break;
                            case 11:
                                int iP11 = SafeParcelReader.p(parcel, i10);
                                int iDataPosition12 = parcel.dataPosition();
                                if (iP11 == 0) {
                                    parcelObtain = null;
                                } else {
                                    parcelObtain = Parcel.obtain();
                                    parcelObtain.appendFrom(parcel, iDataPosition12, iP11);
                                    parcel.setDataPosition(iDataPosition12 + iP11);
                                }
                                parcelObtain.setDataPosition(0);
                                Preconditions.i(str3);
                                Preconditions.i(field.f8214B);
                                Map map4 = (Map) field.f8214B.f8238t.get(str3);
                                Preconditions.i(map4);
                                i(sb, map4, parcelObtain);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z6 = true;
            }
        }
        if (parcel.dataPosition() != iR) {
            throw new SafeParcelReader.ParseException(AbstractC0487g.g(iR, "Overread allowed size end="), parcel);
        }
        sb.append('}');
    }

    public static final void j(StringBuilder sb, Object obj, int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                Preconditions.i(obj);
                sb.append(JsonUtils.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb.append("\"");
                return;
            case 10:
                Preconditions.i(obj);
                MapUtils.a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(AbstractC0487g.g(i10, "Unknown type = "));
        }
    }

    public static final void k(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        boolean z6 = field.f8218u;
        int i10 = field.f8217t;
        if (!z6) {
            j(sb, obj, i10);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 != 0) {
                sb.append(",");
            }
            j(sb, arrayList.get(i11), i10);
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map a() {
        zan zanVar = this.f8227v;
        if (zanVar == null) {
            return null;
        }
        String str = this.f8228w;
        Preconditions.i(str);
        return (Map) zanVar.f8238t.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object c() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean e() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel h() {
        int i10 = this.f8229x;
        Parcel parcel = this.f8225t;
        if (i10 != 0) {
            if (i10 != 1) {
                return parcel;
            }
            SafeParcelWriter.j(parcel, this.f8230y);
            this.f8229x = 2;
            return parcel;
        }
        int i11 = SafeParcelWriter.i(parcel, 20293);
        this.f8230y = i11;
        SafeParcelWriter.j(parcel, i11);
        this.f8229x = 2;
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        zan zanVar = this.f8227v;
        Preconditions.j(zanVar, "Cannot convert to JSON on client side.");
        Parcel parcelH = h();
        parcelH.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.f8228w;
        Preconditions.i(str);
        Map map = (Map) zanVar.f8238t.get(str);
        Preconditions.i(map);
        i(sb, map, parcelH);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = SafeParcelWriter.i(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, 4);
        parcel.writeInt(this.f8224s);
        Parcel parcelH = h();
        if (parcelH != null) {
            int i12 = SafeParcelWriter.i(parcel, 2);
            parcel.appendFrom(parcelH, 0, parcelH.dataSize());
            SafeParcelWriter.j(parcel, i12);
        }
        SafeParcelWriter.d(parcel, 3, this.f8226u != 0 ? this.f8227v : null, i10);
        SafeParcelWriter.j(parcel, i11);
    }
}
