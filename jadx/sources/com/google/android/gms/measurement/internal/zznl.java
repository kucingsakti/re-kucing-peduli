package com.google.android.gms.measurement.internal;

import J.f;
import M2.C0309s;
import M2.EnumC0297f;
import M2.m0;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzgz;
import com.google.android.gms.internal.measurement.zzji;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzjs;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpn;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zznl extends m0 {
    public static void B1(StringBuilder sb, int i10, String str, com.google.android.gms.internal.measurement.zzff.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        y1(sb, i10);
        sb.append(str);
        sb.append(" {\n");
        if (zzdVar.G()) {
            C1(sb, i10, "comparison_type", zzdVar.z().name());
        }
        if (zzdVar.I()) {
            C1(sb, i10, "match_as_float", Boolean.valueOf(zzdVar.F()));
        }
        if (zzdVar.H()) {
            C1(sb, i10, "comparison_value", zzdVar.C());
        }
        if (zzdVar.K()) {
            C1(sb, i10, "min_comparison_value", zzdVar.E());
        }
        if (zzdVar.J()) {
            C1(sb, i10, "max_comparison_value", zzdVar.D());
        }
        y1(sb, i10);
        sb.append("}\n");
    }

    public static void C1(StringBuilder sb, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        y1(sb, i10 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static void D1(StringBuilder sb, String str, com.google.android.gms.internal.measurement.zzfn.zzm zzmVar) {
        if (zzmVar == null) {
            return;
        }
        y1(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzmVar.C() != 0) {
            y1(sb, 4);
            sb.append("results: ");
            int i10 = 0;
            for (Long l4 : zzmVar.P()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l4);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (zzmVar.I() != 0) {
            y1(sb, 4);
            sb.append("status: ");
            int i12 = 0;
            for (Long l10 : zzmVar.R()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i12 = i13;
            }
            sb.append('\n');
        }
        if (zzmVar.z() != 0) {
            y1(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.zzfn.zze zzeVar : zzmVar.O()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(zzeVar.G() ? Integer.valueOf(zzeVar.z()) : null);
                sb.append(":");
                sb.append(zzeVar.F() ? Long.valueOf(zzeVar.C()) : null);
                i14 = i15;
            }
            sb.append("}\n");
        }
        if (zzmVar.F() != 0) {
            y1(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (com.google.android.gms.internal.measurement.zzfn.zzn zznVar : zzmVar.Q()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb.append(", ");
                }
                sb.append(zznVar.H() ? Integer.valueOf(zznVar.D()) : null);
                sb.append(": [");
                Iterator it = zznVar.G().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i18 = i19;
                }
                sb.append("]");
                i16 = i17;
            }
            sb.append("}\n");
        }
        y1(sb, 3);
        sb.append("}\n");
    }

    public static boolean F1(zzjq zzjqVar, int i10) {
        if (i10 < (zzjqVar.size() << 6)) {
            return ((1 << (i10 % 64)) & zzjqVar.get(i10 / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable G1(com.google.android.gms.internal.measurement.zzfn.zzf zzfVar, String str) {
        com.google.android.gms.internal.measurement.zzfn.zzh zzhVarJ1 = j1(zzfVar, str);
        if (zzhVarJ1 == null) {
            return null;
        }
        if (zzhVarJ1.W()) {
            return zzhVarJ1.Q();
        }
        if (zzhVarJ1.U()) {
            return Long.valueOf(zzhVarJ1.L());
        }
        if (zzhVarJ1.S()) {
            return Double.valueOf(zzhVarJ1.z());
        }
        if (zzhVarJ1.J() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.zzfn.zzh> listR = zzhVarJ1.R();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.zzfn.zzh zzhVar : listR) {
            if (zzhVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzfn.zzh zzhVar2 : zzhVar.R()) {
                    if (zzhVar2.W()) {
                        bundle.putString(zzhVar2.P(), zzhVar2.Q());
                    } else if (zzhVar2.U()) {
                        bundle.putLong(zzhVar2.P(), zzhVar2.L());
                    } else if (zzhVar2.S()) {
                        bundle.putDouble(zzhVar2.P(), zzhVar2.z());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static boolean H1(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static int d1(com.google.android.gms.internal.measurement.zzfn.zzk.zza zzaVar, String str) {
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).B1(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).n0(i10).N())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle f1(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfn.zzh zzhVar = (com.google.android.gms.internal.measurement.zzfn.zzh) it.next();
            String strP = zzhVar.P();
            if (zzhVar.S()) {
                bundle.putDouble(strP, zzhVar.z());
            } else if (zzhVar.T()) {
                bundle.putFloat(strP, zzhVar.G());
            } else if (zzhVar.W()) {
                bundle.putString(strP, zzhVar.Q());
            } else if (zzhVar.U()) {
                bundle.putLong(strP, zzhVar.L());
            }
        }
        return bundle;
    }

    public static Bundle g1(Map map, boolean z6) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z6) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(g1((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static com.google.android.gms.internal.measurement.zzfn.zzh j1(com.google.android.gms.internal.measurement.zzfn.zzf zzfVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfn.zzh zzhVar : zzfVar.P()) {
            if (zzhVar.P().equals(str)) {
                return zzhVar;
            }
        }
        return null;
    }

    public static com.google.android.gms.internal.measurement.zzks k1(zzjk.zzb zzbVar, byte[] bArr) throws zzjs {
        com.google.android.gms.internal.measurement.zzix zzixVarA;
        com.google.android.gms.internal.measurement.zzix zzixVar = com.google.android.gms.internal.measurement.zzix.f8673b;
        if (zzixVar == null) {
            synchronized (com.google.android.gms.internal.measurement.zzix.class) {
                try {
                    zzixVarA = com.google.android.gms.internal.measurement.zzix.f8673b;
                    if (zzixVarA == null) {
                        zzixVarA = zzji.a();
                        com.google.android.gms.internal.measurement.zzix.f8673b = zzixVarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzixVar = zzixVarA;
        }
        if (zzixVar != null) {
            zzbVar.getClass();
            zzbVar.q(bArr, bArr.length, zzixVar);
            return zzbVar;
        }
        zzbVar.getClass();
        int length = bArr.length;
        zzbVar.getClass();
        zzbVar.q(bArr, length, com.google.android.gms.internal.measurement.zzix.f8674c);
        return zzbVar;
    }

    public static zzbd l1(com.google.android.gms.internal.measurement.zzad zzadVar) {
        Object obj;
        Bundle bundleG1 = g1(zzadVar.f8455c, true);
        String string = (!bundleG1.containsKey("_o") || (obj = bundleG1.get("_o")) == null) ? "app" : obj.toString();
        String strA = zzkq.a(zzadVar.a, zziq.a, zziq.f9180c);
        if (strA == null) {
            strA = zzadVar.a;
        }
        return new zzbd(strA, new zzbc(bundleG1), string, zzadVar.f8454b);
    }

    public static String o1(boolean z6, boolean z10, boolean z11) {
        StringBuilder sb = new StringBuilder();
        if (z6) {
            sb.append("Dynamic ");
        }
        if (z10) {
            sb.append("Sequence ");
        }
        if (z11) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static ArrayList p1(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static HashMap q1(Bundle bundle, boolean z6) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z10 = obj instanceof Parcelable[];
            if (z10 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z6) {
                    ArrayList arrayList = new ArrayList();
                    if (z10) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(q1((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(q1((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(q1((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static void s1(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static void t1(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                s1(builder, str3, string, set);
            }
        }
    }

    public static void u1(com.google.android.gms.internal.measurement.zzfn.zzf.zza zzaVar, String str, Long l4) {
        List listY = zzaVar.y();
        int i10 = 0;
        while (true) {
            if (i10 >= listY.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfn.zzh) listY.get(i10)).P())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.zzfn.zzh.zza zzaVarN = com.google.android.gms.internal.measurement.zzfn.zzh.N();
        zzaVarN.s(str);
        if (l4 instanceof Long) {
            zzaVarN.r(l4.longValue());
        }
        if (i10 < 0) {
            zzaVar.r(zzaVarN);
        } else {
            zzaVar.m();
            com.google.android.gms.internal.measurement.zzfn.zzf.E((com.google.android.gms.internal.measurement.zzfn.zzf) zzaVar.f8681t, i10, (com.google.android.gms.internal.measurement.zzfn.zzh) zzaVarN.o());
        }
    }

    public static void y1(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
    }

    public final void A1(StringBuilder sb, int i10, zzjt zzjtVar) {
        if (zzjtVar == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator<E> it = zzjtVar.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfn.zzh zzhVar = (com.google.android.gms.internal.measurement.zzfn.zzh) it.next();
            if (zzhVar != null) {
                y1(sb, i11);
                sb.append("param {\n");
                C1(sb, i11, MediationMetaData.KEY_NAME, zzhVar.V() ? ((zzhj) this.f577s).f9119E.f(zzhVar.P()) : null);
                C1(sb, i11, "string_value", zzhVar.W() ? zzhVar.Q() : null);
                C1(sb, i11, "int_value", zzhVar.U() ? Long.valueOf(zzhVar.L()) : null);
                C1(sb, i11, "double_value", zzhVar.S() ? Double.valueOf(zzhVar.z()) : null);
                if (zzhVar.J() > 0) {
                    A1(sb, i11, (zzjt) zzhVar.R());
                }
                y1(sb, i11);
                sb.append("}\n");
            }
        }
    }

    public final boolean E1(long j, long j10) {
        if (j == 0 || j10 <= 0) {
            return true;
        }
        ((zzhj) this.f577s).f9120F.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j10;
    }

    public final byte[] I1(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            i().f9056x.a(e10, "Failed to gzip content");
            throw e10;
        }
    }

    public final boolean J1(String str) {
        boolean zBooleanValue;
        zznq.f8801t.get();
        zzhj zzhjVar = (zzhj) this.f577s;
        if (!zzhjVar.f9146y.h1(null, zzbf.f8956O0)) {
            Preconditions.i(str);
            C0309s c0309sO1 = Y0().O1(str);
            if (c0309sO1 != null) {
                zzax zzaxVarN = zzhjVar.n();
                zzaxVarN.W0();
                zzhj zzhjVar2 = (zzhj) zzaxVarN.f577s;
                zzhjVar2.f9120F.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - zzaxVarN.f8913y > 86400000) {
                    zzaxVarN.f8912x = null;
                }
                Boolean bool = zzaxVarN.f8912x;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    Context context = zzhjVar2.f9140s;
                    if (f.a(context, "android.permission.GET_ACCOUNTS") != 0) {
                        zzaxVarN.i().f9048B.b("Permission error checking for dasher/unicorn accounts");
                        zzaxVarN.f8913y = jCurrentTimeMillis;
                        zzaxVarN.f8912x = Boolean.FALSE;
                    } else {
                        if (zzaxVarN.f8911w == null) {
                            zzaxVarN.f8911w = AccountManager.get(context);
                        }
                        try {
                            Account[] result = zzaxVarN.f8911w.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                            if (result == null || result.length <= 0) {
                                Account[] result2 = zzaxVarN.f8911w.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                                if (result2 != null && result2.length > 0) {
                                    zzaxVarN.f8912x = Boolean.TRUE;
                                    zzaxVarN.f8913y = jCurrentTimeMillis;
                                }
                                zzaxVarN.f8913y = jCurrentTimeMillis;
                                zzaxVarN.f8912x = Boolean.FALSE;
                            } else {
                                zzaxVarN.f8912x = Boolean.TRUE;
                                zzaxVarN.f8913y = jCurrentTimeMillis;
                            }
                            zBooleanValue = true;
                        } catch (AuthenticatorException e10) {
                            e = e10;
                            zzaxVarN.i().f9057y.a(e, "Exception checking account types");
                        } catch (OperationCanceledException e11) {
                            e = e11;
                            zzaxVarN.i().f9057y.a(e, "Exception checking account types");
                        } catch (IOException e12) {
                            e = e12;
                            zzaxVarN.i().f9057y.a(e, "Exception checking account types");
                        }
                    }
                    zBooleanValue = false;
                }
                if (zBooleanValue && c0309sO1.n()) {
                    zzgt zzgtVarZ0 = Z0();
                    zzgtVarZ0.W0();
                    com.google.android.gms.internal.measurement.zzfi.zzd zzdVarO1 = zzgtVarZ0.o1(str);
                    if (zzdVarO1 == null ? false : zzdVarO1.Q()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final byte[] K1(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i10 = gZIPInputStream.read(bArr2);
                if (i10 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i10);
            }
        } catch (IOException e10) {
            i().f9056x.a(e10, "Failed to ungzip content");
            throw e10;
        }
    }

    public final ArrayList L1() {
        Context context = this.f3055t.f9283D.f9140s;
        List list = zzbf.a;
        com.google.android.gms.internal.measurement.zzgk zzgkVarA = com.google.android.gms.internal.measurement.zzgk.a(context.getContentResolver(), com.google.android.gms.internal.measurement.zzgw.a("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // java.lang.Runnable
            public final void run() {
                zzgz.f8653h.incrementAndGet();
            }
        });
        Map mapB = zzgkVarA == null ? Collections.EMPTY_MAP : zzgkVarA.b();
        if (mapB != null && !mapB.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int iIntValue = ((Integer) zzbf.f8958Q.a(null)).intValue();
            for (Map.Entry entry : mapB.entrySet()) {
                if (((String) entry.getKey()).startsWith("measurement.id.")) {
                    try {
                        int i10 = Integer.parseInt((String) entry.getValue());
                        if (i10 != 0) {
                            arrayList.add(Integer.valueOf(i10));
                            if (arrayList.size() >= iIntValue) {
                                i().f9047A.a(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                break;
                            }
                            continue;
                        } else {
                            continue;
                        }
                    } catch (NumberFormatException e10) {
                        i().f9047A.a(e10, "Experiment ID NumberFormatException");
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    @Override // M2.m0
    public final boolean c1() {
        return false;
    }

    public final long e1(byte[] bArr) {
        Preconditions.i(bArr);
        V0().W0();
        MessageDigest messageDigestK2 = zznp.k2();
        if (messageDigestK2 != null) {
            return zznp.e1(messageDigestK2.digest(bArr));
        }
        i().f9056x.b("Failed to get MD5");
        return 0L;
    }

    public final Parcelable h1(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            i().f9056x.b("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final com.google.android.gms.internal.measurement.zzfn.zzf i1(zzba zzbaVar) {
        com.google.android.gms.internal.measurement.zzfn.zzf.zza zzaVarM = com.google.android.gms.internal.measurement.zzfn.zzf.M();
        zzaVarM.m();
        com.google.android.gms.internal.measurement.zzfn.zzf.J(zzbaVar.f8920e, (com.google.android.gms.internal.measurement.zzfn.zzf) zzaVarM.f8681t);
        zzbc zzbcVar = zzbaVar.f8921f;
        zzbcVar.getClass();
        Bundle bundle = zzbcVar.f8922s;
        for (String str : bundle.keySet()) {
            com.google.android.gms.internal.measurement.zzfn.zzh.zza zzaVarN = com.google.android.gms.internal.measurement.zzfn.zzh.N();
            zzaVarN.s(str);
            Object obj = bundle.get(str);
            Preconditions.i(obj);
            v1(zzaVarN, obj);
            zzaVarM.r(zzaVarN);
        }
        return (com.google.android.gms.internal.measurement.zzfn.zzf) zzaVarM.o();
    }

    public final zzmu m1(String str, com.google.android.gms.internal.measurement.zzfn.zzk.zza zzaVar, com.google.android.gms.internal.measurement.zzfn.zzf.zza zzaVar2, String str2) {
        int iIndexOf;
        zzpg.a();
        zzhj zzhjVar = (zzhj) this.f577s;
        if (!zzhjVar.f9146y.h1(str, zzbf.f9022z0)) {
            return null;
        }
        zzhjVar.f9120F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfj zzfjVar = zzbf.f0;
        zzag zzagVar = zzhjVar.f9146y;
        String[] strArrSplit = zzagVar.e1(str, zzfjVar).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        zzna zznaVar = this.f3055t.f9281B;
        zzgt zzgtVarZ0 = zznaVar.Z0();
        zzgtVarZ0.W0();
        zzgtVarZ0.u1(str);
        String str4 = (String) zzgtVarZ0.f9088D.get(str);
        Uri.Builder builder = new Uri.Builder();
        zzhj zzhjVar2 = (zzhj) zznaVar.f577s;
        builder.scheme(zzhjVar2.f9146y.e1(str, zzbf.f8973Y));
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        zzag zzagVar2 = zzhjVar2.f9146y;
        if (zIsEmpty) {
            builder.authority(zzagVar2.e1(str, zzbf.f8974Z));
        } else {
            builder.authority(str4 + "." + zzagVar2.e1(str, zzbf.f8974Z));
        }
        builder.path(zzagVar2.e1(str, zzbf.f8975a0));
        s1(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).V(), setUnmodifiableSet);
        s1(builder, "gmp_version", "97001", setUnmodifiableSet);
        String strM = ((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).M();
        zzfj zzfjVar2 = zzbf.f8932C0;
        if (zzagVar.h1(str, zzfjVar2) && Z0().s1(str)) {
            strM = "";
        }
        s1(builder, "app_instance_id", strM, setUnmodifiableSet);
        s1(builder, "rdid", ((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).Z(), setUnmodifiableSet);
        s1(builder, "bundle_id", zzaVar.j0(), setUnmodifiableSet);
        String strX = zzaVar2.x();
        String strA = zzkq.a(strX, zziq.f9180c, zziq.a);
        if (!TextUtils.isEmpty(strA)) {
            strX = strA;
        }
        s1(builder, "app_event_name", strX, setUnmodifiableSet);
        s1(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).m0()), setUnmodifiableSet);
        String strX2 = ((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).X();
        if (zzagVar.h1(str, zzfjVar2) && Z0().t1(str) && !TextUtils.isEmpty(strX2) && (iIndexOf = strX2.indexOf(".")) != -1) {
            strX2 = strX2.substring(0, iIndexOf);
        }
        s1(builder, "os_version", strX2, setUnmodifiableSet);
        s1(builder, "timestamp", String.valueOf(zzaVar2.w()), setUnmodifiableSet);
        if (((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).h0()) {
            s1(builder, "lat", "1", setUnmodifiableSet);
        }
        s1(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).z()), setUnmodifiableSet);
        s1(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        s1(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        s1(builder, "request_uuid", str2, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.zzfn.zzh> listY = zzaVar2.y();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.zzfn.zzh zzhVar : listY) {
            String strP = zzhVar.P();
            if (zzhVar.S()) {
                bundle.putString(strP, String.valueOf(zzhVar.z()));
            } else if (zzhVar.T()) {
                bundle.putString(strP, String.valueOf(zzhVar.G()));
            } else if (zzhVar.W()) {
                bundle.putString(strP, zzhVar.Q());
            } else if (zzhVar.U()) {
                bundle.putString(strP, String.valueOf(zzhVar.L()));
            }
        }
        t1(builder, zzagVar.e1(str, zzbf.f8982e0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.zzfn.zzo> listUnmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).e0());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.zzfn.zzo zzoVar : listUnmodifiableList) {
            String strN = zzoVar.N();
            if (zzoVar.P()) {
                bundle2.putString(strN, String.valueOf(zzoVar.z()));
            } else if (zzoVar.Q()) {
                bundle2.putString(strN, String.valueOf(zzoVar.E()));
            } else if (zzoVar.T()) {
                bundle2.putString(strN, zzoVar.O());
            } else if (zzoVar.R()) {
                bundle2.putString(strN, String.valueOf(zzoVar.I()));
            }
        }
        t1(builder, zzagVar.e1(str, zzbf.f8980d0).split("\\|"), bundle2, setUnmodifiableSet);
        s1(builder, "dma", ((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).g0() ? "1" : "0", setUnmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).R().isEmpty()) {
            s1(builder, "dma_cps", ((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).R(), setUnmodifiableSet);
        }
        if (zzagVar.h1(null, zzbf.f8936E0) && ((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).j0()) {
            com.google.android.gms.internal.measurement.zzfn.zza zzaVarH2 = ((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).h2();
            if (!zzaVarH2.U().isEmpty()) {
                s1(builder, "dl_gclid", zzaVarH2.U(), setUnmodifiableSet);
            }
            if (!zzaVarH2.T().isEmpty()) {
                s1(builder, "dl_gbraid", zzaVarH2.T(), setUnmodifiableSet);
            }
            if (!zzaVarH2.Q().isEmpty()) {
                s1(builder, "dl_gs", zzaVarH2.Q(), setUnmodifiableSet);
            }
            if (zzaVarH2.z() > 0) {
                s1(builder, "dl_ss_ts", String.valueOf(zzaVarH2.z()), setUnmodifiableSet);
            }
            if (!zzaVarH2.X().isEmpty()) {
                s1(builder, "mr_gclid", zzaVarH2.X(), setUnmodifiableSet);
            }
            if (!zzaVarH2.W().isEmpty()) {
                s1(builder, "mr_gbraid", zzaVarH2.W(), setUnmodifiableSet);
            }
            if (!zzaVarH2.V().isEmpty()) {
                s1(builder, "mr_gs", zzaVarH2.V(), setUnmodifiableSet);
            }
            if (zzaVarH2.D() > 0) {
                s1(builder, "mr_click_ts", String.valueOf(zzaVarH2.D()), setUnmodifiableSet);
            }
        }
        return new zzmu(1, jCurrentTimeMillis, builder.build().toString());
    }

    public final String n1(com.google.android.gms.internal.measurement.zzfn.zzj zzjVar) {
        com.google.android.gms.internal.measurement.zzfn.zzc zzcVarI2;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        zzpn.a();
        zzhj zzhjVar = (zzhj) this.f577s;
        if (zzhjVar.f9146y.h1(null, zzbf.f9008s0) && zzjVar.z() > 0) {
            V0();
            if (zznp.a2(zzjVar.A().m2()) && zzjVar.H()) {
                C1(sb, 0, "UploadSubdomain", zzjVar.F());
            }
        }
        for (com.google.android.gms.internal.measurement.zzfn.zzk zzkVar : zzjVar.G()) {
            if (zzkVar != null) {
                y1(sb, 1);
                sb.append("bundle {\n");
                if (zzkVar.I0()) {
                    C1(sb, 1, "protocol_version", Integer.valueOf(zzkVar.m1()));
                }
                zzph.f8844t.get();
                if (zzhjVar.f9146y.h1(zzkVar.m2(), zzbf.f9006r0) && zzkVar.L0()) {
                    C1(sb, 1, "session_stitching_token", zzkVar.a0());
                }
                C1(sb, 1, "platform", zzkVar.Y());
                if (zzkVar.D0()) {
                    C1(sb, 1, "gmp_version", Long.valueOf(zzkVar.U1()));
                }
                if (zzkVar.Q0()) {
                    C1(sb, 1, "uploading_gmp_version", Long.valueOf(zzkVar.g2()));
                }
                if (zzkVar.B0()) {
                    C1(sb, 1, "dynamite_version", Long.valueOf(zzkVar.O1()));
                }
                if (zzkVar.v0()) {
                    C1(sb, 1, "config_version", Long.valueOf(zzkVar.G1()));
                }
                C1(sb, 1, "gmp_app_id", zzkVar.V());
                C1(sb, 1, "admob_app_id", zzkVar.l2());
                C1(sb, 1, "app_id", zzkVar.m2());
                C1(sb, 1, "app_version", zzkVar.O());
                if (zzkVar.k0()) {
                    C1(sb, 1, "app_version_major", Integer.valueOf(zzkVar.m0()));
                }
                C1(sb, 1, "firebase_instance_id", zzkVar.U());
                if (zzkVar.A0()) {
                    C1(sb, 1, "dev_cert_hash", Long.valueOf(zzkVar.K1()));
                }
                C1(sb, 1, "app_store", zzkVar.N());
                if (zzkVar.P0()) {
                    C1(sb, 1, "upload_timestamp_millis", Long.valueOf(zzkVar.e2()));
                }
                if (zzkVar.M0()) {
                    C1(sb, 1, "start_timestamp_millis", Long.valueOf(zzkVar.a2()));
                }
                if (zzkVar.C0()) {
                    C1(sb, 1, "end_timestamp_millis", Long.valueOf(zzkVar.S1()));
                }
                if (zzkVar.H0()) {
                    C1(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzkVar.Y1()));
                }
                if (zzkVar.G0()) {
                    C1(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzkVar.W1()));
                }
                C1(sb, 1, "app_instance_id", zzkVar.M());
                C1(sb, 1, "resettable_device_id", zzkVar.Z());
                C1(sb, 1, "ds_id", zzkVar.T());
                if (zzkVar.F0()) {
                    C1(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzkVar.h0()));
                }
                C1(sb, 1, "os_version", zzkVar.X());
                C1(sb, 1, "device_model", zzkVar.S());
                C1(sb, 1, "user_default_language", zzkVar.b0());
                if (zzkVar.O0()) {
                    C1(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzkVar.w1()));
                }
                if (zzkVar.u0()) {
                    C1(sb, 1, "bundle_sequential_index", Integer.valueOf(zzkVar.R0()));
                }
                zzpn.a();
                V0();
                if (zznp.a2(zzkVar.m2()) && zzhjVar.f9146y.h1(null, zzbf.f9008s0) && zzkVar.z0()) {
                    C1(sb, 1, "delivery_index", Integer.valueOf(zzkVar.Y0()));
                }
                if (zzkVar.K0()) {
                    C1(sb, 1, "service_upload", Boolean.valueOf(zzkVar.i0()));
                }
                C1(sb, 1, "health_monitor", zzkVar.W());
                if (zzkVar.J0()) {
                    C1(sb, 1, "retry_counter", Integer.valueOf(zzkVar.r1()));
                }
                if (zzkVar.x0()) {
                    C1(sb, 1, "consent_signals", zzkVar.Q());
                }
                if (zzkVar.E0()) {
                    C1(sb, 1, "is_dma_region", Boolean.valueOf(zzkVar.g0()));
                }
                if (zzkVar.y0()) {
                    C1(sb, 1, "core_platform_services", zzkVar.R());
                }
                if (zzkVar.w0()) {
                    C1(sb, 1, "consent_diagnostics", zzkVar.P());
                }
                if (zzkVar.N0()) {
                    C1(sb, 1, "target_os_version", Long.valueOf(zzkVar.c2()));
                }
                zzpg.a();
                if (zzhjVar.f9146y.h1(zzkVar.m2(), zzbf.f9022z0)) {
                    C1(sb, 1, "ad_services_version", Integer.valueOf(zzkVar.z()));
                    if (zzkVar.l0() && (zzcVarI2 = zzkVar.i2()) != null) {
                        y1(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        C1(sb, 2, "eligible", Boolean.valueOf(zzcVarI2.K()));
                        C1(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzcVarI2.N()));
                        C1(sb, 2, "pre_r", Boolean.valueOf(zzcVarI2.O()));
                        C1(sb, 2, "r_extensions_too_old", Boolean.valueOf(zzcVarI2.P()));
                        C1(sb, 2, "adservices_extension_too_old", Boolean.valueOf(zzcVarI2.I()));
                        C1(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(zzcVarI2.G()));
                        C1(sb, 2, "measurement_manager_disabled", Boolean.valueOf(zzcVarI2.M()));
                        y1(sb, 2);
                        sb.append("}\n");
                    }
                }
                zzoj.a();
                if (zzhjVar.f9146y.h1(null, zzbf.f8952M0) && zzkVar.j0()) {
                    C1(sb, 1, "ad_campaign_info", zzkVar.h2());
                }
                zzjt<com.google.android.gms.internal.measurement.zzfn.zzo> zzjtVarE0 = zzkVar.e0();
                if (zzjtVarE0 != null) {
                    for (com.google.android.gms.internal.measurement.zzfn.zzo zzoVar : zzjtVarE0) {
                        if (zzoVar != null) {
                            y1(sb, 2);
                            sb.append("user_property {\n");
                            C1(sb, 2, "set_timestamp_millis", zzoVar.S() ? Long.valueOf(zzoVar.K()) : null);
                            C1(sb, 2, MediationMetaData.KEY_NAME, zzhjVar.f9119E.g(zzoVar.N()));
                            C1(sb, 2, "string_value", zzoVar.O());
                            C1(sb, 2, "int_value", zzoVar.R() ? Long.valueOf(zzoVar.I()) : null);
                            C1(sb, 2, "double_value", zzoVar.P() ? Double.valueOf(zzoVar.z()) : null);
                            y1(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zzjt<com.google.android.gms.internal.measurement.zzfn.zzd> zzjtVarC0 = zzkVar.c0();
                if (zzjtVarC0 != null) {
                    for (com.google.android.gms.internal.measurement.zzfn.zzd zzdVar : zzjtVarC0) {
                        if (zzdVar != null) {
                            y1(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzdVar.J()) {
                                C1(sb, 2, "audience_id", Integer.valueOf(zzdVar.z()));
                            }
                            if (zzdVar.K()) {
                                C1(sb, 2, "new_audience", Boolean.valueOf(zzdVar.I()));
                            }
                            D1(sb, "current_data", zzdVar.G());
                            if (zzdVar.L()) {
                                D1(sb, "previous_data", zzdVar.H());
                            }
                            y1(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zzjt<com.google.android.gms.internal.measurement.zzfn.zzf> zzjtVarD0 = zzkVar.d0();
                if (zzjtVarD0 != null) {
                    for (com.google.android.gms.internal.measurement.zzfn.zzf zzfVar : zzjtVarD0) {
                        if (zzfVar != null) {
                            y1(sb, 2);
                            sb.append("event {\n");
                            C1(sb, 2, MediationMetaData.KEY_NAME, zzhjVar.f9119E.c(zzfVar.O()));
                            if (zzfVar.S()) {
                                C1(sb, 2, "timestamp_millis", Long.valueOf(zzfVar.L()));
                            }
                            if (zzfVar.R()) {
                                C1(sb, 2, "previous_timestamp_millis", Long.valueOf(zzfVar.K()));
                            }
                            if (zzfVar.Q()) {
                                C1(sb, 2, NewHtcHomeBadger.COUNT, Integer.valueOf(zzfVar.z()));
                            }
                            if (zzfVar.I() != 0) {
                                A1(sb, 2, zzfVar.P());
                            }
                            y1(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                y1(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public final List r1(zzjq zzjqVar, List list) {
        int i10;
        ArrayList arrayList = new ArrayList(zzjqVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                i().f9047A.a(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    i().f9047A.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public final void v1(com.google.android.gms.internal.measurement.zzfn.zzh.zza zzaVar, Object obj) {
        zzaVar.m();
        com.google.android.gms.internal.measurement.zzfn.zzh.F((com.google.android.gms.internal.measurement.zzfn.zzh) zzaVar.f8681t);
        zzaVar.m();
        com.google.android.gms.internal.measurement.zzfn.zzh.H((com.google.android.gms.internal.measurement.zzfn.zzh) zzaVar.f8681t);
        zzaVar.m();
        com.google.android.gms.internal.measurement.zzfn.zzh.K((com.google.android.gms.internal.measurement.zzfn.zzh) zzaVar.f8681t);
        zzaVar.m();
        com.google.android.gms.internal.measurement.zzfn.zzh.M((com.google.android.gms.internal.measurement.zzfn.zzh) zzaVar.f8681t);
        if (obj instanceof String) {
            zzaVar.t((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.r(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            zzaVar.m();
            com.google.android.gms.internal.measurement.zzfn.zzh.A((com.google.android.gms.internal.measurement.zzfn.zzh) zzaVar.f8681t, dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            i().f9056x.a(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzfn.zzh.zza zzaVarN = com.google.android.gms.internal.measurement.zzfn.zzh.N();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzfn.zzh.zza zzaVarN2 = com.google.android.gms.internal.measurement.zzfn.zzh.N();
                    zzaVarN2.s(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzaVarN2.r(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzaVarN2.t((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        zzaVarN2.m();
                        com.google.android.gms.internal.measurement.zzfn.zzh.A((com.google.android.gms.internal.measurement.zzfn.zzh) zzaVarN2.f8681t, dDoubleValue2);
                    }
                    zzaVarN.m();
                    com.google.android.gms.internal.measurement.zzfn.zzh.C((com.google.android.gms.internal.measurement.zzfn.zzh) zzaVarN.f8681t, (com.google.android.gms.internal.measurement.zzfn.zzh) zzaVarN2.o());
                }
                if (((com.google.android.gms.internal.measurement.zzfn.zzh) zzaVarN.f8681t).J() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzfn.zzh) zzaVarN.o());
                }
            }
        }
        zzaVar.m();
        com.google.android.gms.internal.measurement.zzfn.zzh.E((com.google.android.gms.internal.measurement.zzfn.zzh) zzaVar.f8681t, arrayList);
    }

    public final void w1(com.google.android.gms.internal.measurement.zzfn.zzk.zza zzaVar) {
        i().f9052F.b("Checking account type status for ad personalization signals");
        if (J1(zzaVar.j0())) {
            i().f9051E.b("Turning off ad personalization due to account type");
            com.google.android.gms.internal.measurement.zzfn.zzo.zza zzaVarL = com.google.android.gms.internal.measurement.zzfn.zzo.L();
            zzaVarL.m();
            com.google.android.gms.internal.measurement.zzfn.zzo.C((com.google.android.gms.internal.measurement.zzfn.zzo) zzaVarL.f8681t, "_npa");
            zzax zzaxVarN = ((zzhj) this.f577s).n();
            zzaxVarN.W0();
            long j = zzaxVarN.f8913y;
            zzaVarL.m();
            com.google.android.gms.internal.measurement.zzfn.zzo.B((com.google.android.gms.internal.measurement.zzfn.zzo) zzaVarL.f8681t, j);
            zzaVarL.m();
            com.google.android.gms.internal.measurement.zzfn.zzo.G((com.google.android.gms.internal.measurement.zzfn.zzo) zzaVarL.f8681t, 1L);
            com.google.android.gms.internal.measurement.zzfn.zzo zzoVar = (com.google.android.gms.internal.measurement.zzfn.zzo) zzaVarL.o();
            for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).B1(); i10++) {
                if ("_npa".equals(((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).n0(i10).N())) {
                    zzaVar.m();
                    com.google.android.gms.internal.measurement.zzfn.zzk.D((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t, i10, zzoVar);
                    a aVarA = a.a(((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).P());
                    aVarA.c(zzin.zza.AD_PERSONALIZATION, EnumC0297f.CHILD_ACCOUNT);
                    String string = aVarA.toString();
                    zzaVar.m();
                    com.google.android.gms.internal.measurement.zzfn.zzk.q1((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t, string);
                }
            }
            zzaVar.m();
            com.google.android.gms.internal.measurement.zzfn.zzk.I((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t, zzoVar);
            a aVarA2 = a.a(((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t).P());
            aVarA2.c(zzin.zza.AD_PERSONALIZATION, EnumC0297f.CHILD_ACCOUNT);
            String string2 = aVarA2.toString();
            zzaVar.m();
            com.google.android.gms.internal.measurement.zzfn.zzk.q1((com.google.android.gms.internal.measurement.zzfn.zzk) zzaVar.f8681t, string2);
        }
    }

    public final void x1(com.google.android.gms.internal.measurement.zzfn.zzo.zza zzaVar, Object obj) {
        Preconditions.i(obj);
        zzaVar.m();
        com.google.android.gms.internal.measurement.zzfn.zzo.D((com.google.android.gms.internal.measurement.zzfn.zzo) zzaVar.f8681t);
        zzaVar.m();
        com.google.android.gms.internal.measurement.zzfn.zzo.F((com.google.android.gms.internal.measurement.zzfn.zzo) zzaVar.f8681t);
        zzaVar.m();
        com.google.android.gms.internal.measurement.zzfn.zzo.J((com.google.android.gms.internal.measurement.zzfn.zzo) zzaVar.f8681t);
        if (obj instanceof String) {
            zzaVar.m();
            com.google.android.gms.internal.measurement.zzfn.zzo.H((com.google.android.gms.internal.measurement.zzfn.zzo) zzaVar.f8681t, (String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            zzaVar.m();
            com.google.android.gms.internal.measurement.zzfn.zzo.G((com.google.android.gms.internal.measurement.zzfn.zzo) zzaVar.f8681t, jLongValue);
        } else {
            if (!(obj instanceof Double)) {
                i().f9056x.a(obj, "Ignoring invalid (type) user attribute value");
                return;
            }
            double dDoubleValue = ((Double) obj).doubleValue();
            zzaVar.m();
            com.google.android.gms.internal.measurement.zzfn.zzo.A((com.google.android.gms.internal.measurement.zzfn.zzo) zzaVar.f8681t, dDoubleValue);
        }
    }

    public final void z1(StringBuilder sb, int i10, com.google.android.gms.internal.measurement.zzff.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        y1(sb, i10);
        sb.append("filter {\n");
        if (zzcVar.G()) {
            C1(sb, i10, "complement", Boolean.valueOf(zzcVar.F()));
        }
        if (zzcVar.I()) {
            C1(sb, i10, "param_name", ((zzhj) this.f577s).f9119E.f(zzcVar.E()));
        }
        if (zzcVar.J()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.zzff.zzf zzfVarD = zzcVar.D();
            if (zzfVarD != null) {
                y1(sb, i11);
                sb.append("string_filter");
                sb.append(" {\n");
                if (zzfVarD.I()) {
                    C1(sb, i11, "match_type", zzfVarD.A().name());
                }
                if (zzfVarD.H()) {
                    C1(sb, i11, "expression", zzfVarD.D());
                }
                if (zzfVarD.G()) {
                    C1(sb, i11, "case_sensitive", Boolean.valueOf(zzfVarD.F()));
                }
                if (zzfVarD.z() > 0) {
                    y1(sb, i10 + 2);
                    sb.append("expression_list {\n");
                    for (String str : zzfVarD.E()) {
                        y1(sb, i10 + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                y1(sb, i11);
                sb.append("}\n");
            }
        }
        if (zzcVar.H()) {
            B1(sb, i10 + 1, "number_filter", zzcVar.C());
        }
        y1(sb, i10);
        sb.append("}\n");
    }
}
