package com.google.android.gms.measurement.internal;

import F0.d;
import G0.c;
import M2.L;
import M2.t0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzou;
import com.google.android.gms.internal.measurement.zzpn;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class zznp extends L {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String[] f9319A = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f9320B = {"_err"};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SecureRandom f9321u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicLong f9322v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9323w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f9324x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f9325y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer f9326z;

    public zznp(zzhj zzhjVar) {
        super(zzhjVar);
        this.f9326z = null;
        this.f9322v = new AtomicLong(0L);
    }

    public static boolean C1(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean D1(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean E1(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean J1(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.i(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static boolean K1(String str, String[] strArr) {
        Preconditions.i(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] M1(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static boolean O1(Context context) {
        Preconditions.i(context);
        return Build.VERSION.SDK_INT >= 24 ? W1(context, "com.google.android.gms.measurement.AppMeasurementJobService") : W1(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static ArrayList R1(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzae zzaeVar = (zzae) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzaeVar.f8886s);
            bundle.putString("origin", zzaeVar.f8887t);
            bundle.putLong("creation_timestamp", zzaeVar.f8889v);
            bundle.putString(MediationMetaData.KEY_NAME, zzaeVar.f8888u.f9313t);
            Object objB = zzaeVar.f8888u.b();
            Preconditions.i(objB);
            zzik.b(bundle, objB);
            bundle.putBoolean("active", zzaeVar.f8890w);
            String str = zzaeVar.f8891x;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbd zzbdVar = zzaeVar.f8892y;
            if (zzbdVar != null) {
                bundle.putString("timed_out_event_name", zzbdVar.f8923s);
                zzbc zzbcVar = zzbdVar.f8924t;
                if (zzbcVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbcVar.T());
                }
            }
            bundle.putLong("trigger_timeout", zzaeVar.f8893z);
            zzbd zzbdVar2 = zzaeVar.f8883A;
            if (zzbdVar2 != null) {
                bundle.putString("triggered_event_name", zzbdVar2.f8923s);
                zzbc zzbcVar2 = zzbdVar2.f8924t;
                if (zzbcVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbcVar2.T());
                }
            }
            bundle.putLong("triggered_timestamp", zzaeVar.f8888u.f9314u);
            bundle.putLong("time_to_live", zzaeVar.f8884B);
            zzbd zzbdVar3 = zzaeVar.f8885C;
            if (zzbdVar3 != null) {
                bundle.putString("expired_event_name", zzbdVar3.f8923s);
                zzbc zzbcVar3 = zzbdVar3.f8924t;
                if (zzbcVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbcVar3.T());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean S1(int i10, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean W1(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean a2(String str) {
        String str2 = (String) zzbf.f9012u0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean c2(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static long d1(zzbc zzbcVar) {
        long length = 0;
        if (zzbcVar == null) {
            return 0L;
        }
        Bundle bundle = zzbcVar.f8922s;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) obj).length;
            }
        }
        return length;
    }

    public static long e1(byte[] bArr) {
        Preconditions.i(bArr);
        int i10 = 0;
        Preconditions.l(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (((long) bArr[length]) & 255) << i10;
            i10 += 8;
        }
        return j;
    }

    public static boolean e2(String str) {
        Preconditions.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static int g2(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    public static Bundle h1(List list) {
        Bundle bundle = new Bundle();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzno zznoVar = (zzno) it.next();
                String str = zznoVar.f9316w;
                String str2 = zznoVar.f9313t;
                if (str != null) {
                    bundle.putString(str2, str);
                } else {
                    Long l4 = zznoVar.f9315v;
                    if (l4 != null) {
                        bundle.putLong(str2, l4.longValue());
                    } else {
                        Double d3 = zznoVar.f9318y;
                        if (d3 != null) {
                            bundle.putDouble(str2, d3.doubleValue());
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static MessageDigest k2() {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static String l1(String str, boolean z6, int i10) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i10) {
                return str;
            }
            if (z6) {
                return p231y.a.c(str.substring(0, str.offsetByCodePoints(0, i10)), "...");
            }
        }
        return null;
    }

    public static void m1(t0 t0Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        S1(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        t0Var.a(str, "_err", bundle);
    }

    public static void n1(Bundle bundle, int i10, String str, Object obj) {
        if (S1(i10, bundle)) {
            bundle.putString("_ev", l1(str, true, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static void y1(zzkp zzkpVar, Bundle bundle, boolean z6) {
        if (bundle == null || zzkpVar == null || (bundle.containsKey("_sc") && !z6)) {
            if (bundle != null && zzkpVar == null && z6) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = zzkpVar.a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = zzkpVar.f9226b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", zzkpVar.f9227c);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    public final void A1(String str, String str2, Bundle bundle, List list, boolean z6) {
        int i10;
        int i11;
        int iC1;
        if (bundle == null) {
            return;
        }
        zzhj zzhjVar = (zzhj) this.f577s;
        zzag zzagVar = zzhjVar.f9146y;
        zzagVar.getClass();
        zzou.f8828t.get();
        int i12 = (((zzhj) zzagVar.f577s).f9146y.h1(null, zzbf.f9018x0) && zzagVar.V0().N1(231100000)) ? 35 : 0;
        int i13 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str3)) {
                i10 = 14;
                if (z6) {
                    i11 = 0;
                } else if (!X1("event param", str3)) {
                    i11 = 3;
                } else if (!L1("event param", null, null, str3)) {
                    i11 = 14;
                } else if (G1("event param", 40, str3)) {
                    i11 = 0;
                } else {
                    i11 = 3;
                }
                if (i11 != 0) {
                    i10 = i11;
                } else if (!U1("event param", str3)) {
                    i10 = 3;
                } else if (L1("event param", null, null, str3)) {
                    if (G1("event param", 40, str3)) {
                        i10 = 0;
                    } else {
                        i10 = 3;
                    }
                }
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                n1(bundle, i10, str3, i10 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (E1(bundle.get(str3))) {
                    i().f9049C.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iC1 = 22;
                } else {
                    iC1 = c1(str, str3, bundle.get(str3), bundle, list, z6, false);
                }
                if (iC1 != 0 && !"_ev".equals(str3)) {
                    n1(bundle, iC1, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (e2(str3) && !K1(str3, zzip.f9178d)) {
                    i13++;
                    boolean zN1 = N1(231100000);
                    zzfr zzfrVar = zzhjVar.f9119E;
                    if (!zN1) {
                        i().f9058z.c("Item array not supported on client's version of Google Play Services (Android Only)", zzfrVar.c(str), zzfrVar.a(bundle));
                        S1(23, bundle);
                        bundle.remove(str3);
                    } else if (i13 > i12) {
                        zzou.f8828t.get();
                        if (zzhjVar.f9146y.h1(null, zzbf.f9018x0)) {
                            i().f9058z.c(E0.a.g("Item can't contain more than ", i12, " item-scoped custom params"), zzfrVar.c(str), zzfrVar.a(bundle));
                            S1(28, bundle);
                            bundle.remove(str3);
                        } else {
                            i().f9058z.c("Item cannot contain custom parameters", zzfrVar.c(str), zzfrVar.a(bundle));
                            S1(23, bundle);
                            bundle.remove(str3);
                        }
                    }
                }
            }
        }
    }

    public final void B1(Parcelable[] parcelableArr, int i10, boolean z6) {
        Preconditions.i(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (e2(str) && !K1(str, zzip.f9178d) && (i11 = i11 + 1) > i10) {
                    zzhj zzhjVar = (zzhj) this.f577s;
                    if (z6) {
                        i().f9058z.c(E0.a.g("Param can't contain more than ", i10, " item-scoped custom parameters"), zzhjVar.f9119E.f(str), zzhjVar.f9119E.a(bundle));
                        S1(28, bundle);
                    } else {
                        i().f9058z.c("Param cannot contain item-scoped custom parameters", zzhjVar.f9119E.f(str), zzhjVar.f9119E.a(bundle));
                        S1(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean F1(String str, double d3) {
        try {
            SharedPreferences.Editor editorEdit = ((zzhj) this.f577s).f9140s.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d3));
            return editorEdit.commit();
        } catch (RuntimeException e10) {
            i().f9056x.a(e10, "Failed to persist Deferred Deep Link. exception");
            return false;
        }
    }

    public final boolean G1(String str, int i10, String str2) {
        if (str2 == null) {
            i().f9058z.a(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        zzfw zzfwVarI = i();
        zzfwVarI.f9058z.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final boolean H1(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzhj zzhjVar = (zzhj) this.f577s;
        if (!zIsEmpty) {
            Preconditions.i(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(zzhjVar.f9141t)) {
                zzfw zzfwVarI = i();
                zzfwVarI.f9058z.a(zzfw.a1(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                return false;
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                Preconditions.i(str2);
                if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                    return true;
                }
                zzfw zzfwVarI2 = i();
                zzfwVarI2.f9058z.a(zzfw.a1(str2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
            if (TextUtils.isEmpty(zzhjVar.f9141t)) {
                i().f9058z.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
        }
        return false;
    }

    public final boolean I1(String str, String str2, int i10, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        if (strValueOf.codePointCount(0, strValueOf.length()) > i10) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9049C.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
            return false;
        }
        return true;
    }

    public final boolean L1(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            i().f9058z.a(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f9319A;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                i().f9058z.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !K1(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && K1(str2, strArr2)) {
            return true;
        }
        i().f9058z.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean N1(int i10) {
        Boolean bool = ((zzhj) this.f577s).r().f9244w;
        if (b2() < i10 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int P1(String str) {
        if (!U1("user property", str)) {
            return 6;
        }
        if (L1("user property", zzis.a, null, str)) {
            return !G1("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    public final Object Q1(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        zzhj zzhjVar = (zzhj) this.f577s;
        if (zEquals) {
            return k1(Math.max(zzhjVar.f9146y.Y0(null, false), 256), obj, true, true);
        }
        return k1(c2(str) ? Math.max(zzhjVar.f9146y.Y0(null, false), 256) : zzhjVar.f9146y.Y0(null, false), obj, false, true);
    }

    public final boolean T1(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = Wrappers.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            i().f9056x.a(e10, "Package name not found");
            return true;
        } catch (CertificateException e11) {
            i().f9056x.a(e11, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean U1(String str, String str2) {
        if (str2 == null) {
            i().f9058z.a(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            i().f9058z.a(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            i().f9058z.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                i().f9058z.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final Object V1(Object obj, String str) {
        return "_ldl".equals(str) ? k1(g2(str), obj, true, false) : k1(g2(str), obj, false, false);
    }

    public final boolean X1(String str, String str2) {
        if (str2 == null) {
            i().f9058z.a(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            i().f9058z.a(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            i().f9058z.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                i().f9058z.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean Y1(String str, String str2) {
        zzpn.a();
        zzhj zzhjVar = (zzhj) this.f577s;
        if (zzhjVar.f9146y.h1(null, zzbf.f9010t0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return zzhjVar.f9146y.Z0("debug.firebase.analytics.app").equals(str);
    }

    @Override // M2.L
    public final boolean Z0() {
        return true;
    }

    public final boolean Z1(String str) {
        W0();
        if (Wrappers.a(((zzhj) this.f577s).f9140s).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        i().f9051E.a(str, "Permission not granted");
        return false;
    }

    public final int a1(Object obj, String str) {
        return "_ldl".equals(str) ? I1("user property referrer", str, g2(str), obj) : I1("user property", str, g2(str), obj) ? 0 : 7;
    }

    public final int b1(String str) {
        if (!U1("event", str)) {
            return 2;
        }
        if (L1("event", zziq.a, zziq.f9179b, str)) {
            return !G1("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    public final int b2() {
        if (this.f9326z == null) {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f7833b;
            Context context = ((zzhj) this.f577s).f9140s;
            googleApiAvailabilityLight.getClass();
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
            int i10 = 0;
            try {
                i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f9326z = Integer.valueOf(i10 / 1000);
        }
        return this.f9326z.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    public final int c1(String str, String str2, Object obj, Bundle bundle, List list, boolean z6, boolean z10) {
        int i10;
        int size;
        W0();
        boolean zE1 = E1(obj);
        zzhj zzhjVar = (zzhj) this.f577s;
        int i11 = 0;
        if (!zE1) {
            i10 = 0;
        } else {
            if (!z10) {
                return 21;
            }
            if (!K1(str2, zzip.f9177c)) {
                return 20;
            }
            zzkx zzkxVarR = zzhjVar.r();
            zzkxVarR.W0();
            zzkxVarR.a1();
            if (zzkxVarR.m1() && zzkxVarR.V0().b2() < 200900) {
                return 25;
            }
            boolean z11 = obj instanceof Parcelable[];
            if (z11) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i10 = 0;
            }
            if (size > 200) {
                i().f9049C.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                if (z11) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i10 = 17;
            } else {
                i10 = 0;
            }
        }
        if (!I1("param", str2, (c2(str) || c2(str2)) ? Math.max(zzhjVar.f9146y.Y0(null, false), 256) : zzhjVar.f9146y.Y0(null, false), obj)) {
            if (!z10) {
                return 4;
            }
            if (obj instanceof Bundle) {
                A1(str, str2, (Bundle) obj, list, z6);
                return i10;
            }
            if (obj instanceof Parcelable[]) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        i().f9049C.c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return 4;
                    }
                    A1(str, str2, (Bundle) parcelable, list, z6);
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    int i12 = i11 + 1;
                    if (!(obj2 instanceof Bundle)) {
                        i().f9049C.c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                        return 4;
                    }
                    A1(str, str2, (Bundle) obj2, list, z6);
                    i11 = i12;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a8  */
    public final long d2() {
        long j;
        Integer num;
        Object e10;
        W0();
        String strD1 = ((zzhj) this.f577s).o().d1();
        String str = (String) zzbf.c0.a(null);
        boolean z6 = true;
        boolean zBooleanValue = false;
        if (!(str.equals("*") || Arrays.asList(str.split(",")).contains(strD1))) {
            return 0L;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = ((i10 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? 0 : SdkExtensions.getExtensionVersion(1000000)) < ((Integer) zzbf.f8969W.a(null)).intValue() ? 16L : 0L;
        }
        if (!Z1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.f9325y != null) {
                zBooleanValue = this.f9325y.booleanValue();
            } else {
                d dVarI2 = i2();
                if (dVarI2 != null) {
                    try {
                        num = (Integer) dVarI2.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() != 1) {
                                    z6 = false;
                                }
                                this.f9325y = Boolean.valueOf(z6);
                            } catch (InterruptedException e11) {
                                e10 = e11;
                                i().f9047A.a(e10, "Measurement manager api exception");
                                this.f9325y = Boolean.FALSE;
                            } catch (CancellationException e12) {
                                e10 = e12;
                                i().f9047A.a(e10, "Measurement manager api exception");
                                this.f9325y = Boolean.FALSE;
                            } catch (ExecutionException e13) {
                                e10 = e13;
                                i().f9047A.a(e10, "Measurement manager api exception");
                                this.f9325y = Boolean.FALSE;
                            } catch (TimeoutException e14) {
                                e10 = e14;
                                i().f9047A.a(e10, "Measurement manager api exception");
                                this.f9325y = Boolean.FALSE;
                            }
                            i().f9052F.a(num, "Measurement manager api status result");
                            zBooleanValue = this.f9325y.booleanValue();
                        } else {
                            z6 = false;
                            this.f9325y = Boolean.valueOf(z6);
                            i().f9052F.a(num, "Measurement manager api status result");
                            zBooleanValue = this.f9325y.booleanValue();
                        }
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e15) {
                        num = null;
                        e10 = e15;
                    }
                }
            }
            if (!zBooleanValue) {
                j |= 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final Bundle f1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objQ1 = Q1(bundle.get(str), str);
                if (objQ1 == null) {
                    zzfw zzfwVarI = i();
                    zzfwVarI.f9049C.a(((zzhj) this.f577s).f9119E.f(str), "Param value can't be null");
                } else {
                    q1(bundle2, str, objQ1);
                }
            }
        }
        return bundle2;
    }

    public final boolean f2(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = ((zzhj) this.f577s).f9140s.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    public final Bundle g1(String str, Bundle bundle, List list, boolean z6) {
        int i10;
        int i11;
        zznp zznpVar = this;
        boolean zK1 = K1(str, zziq.f9181d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        zzhj zzhjVar = (zzhj) zznpVar.f577s;
        int i12 = zzhjVar.f9146y.V0().N1(201500000) ? 100 : 25;
        int i13 = 0;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                int i14 = 14;
                if (z6) {
                    i10 = 0;
                } else if (!zznpVar.X1("event param", str2)) {
                    i10 = 3;
                } else if (!zznpVar.L1("event param", null, null, str2)) {
                    i10 = 14;
                } else if (zznpVar.G1("event param", 40, str2)) {
                    i10 = 0;
                } else {
                    i10 = 3;
                }
                if (i10 == 0) {
                    if (!zznpVar.U1("event param", str2)) {
                        i14 = 3;
                    } else if (zznpVar.L1("event param", null, null, str2)) {
                        if (zznpVar.G1("event param", 40, str2)) {
                            i14 = 0;
                        } else {
                            i14 = 3;
                        }
                    }
                    i11 = i14;
                } else {
                    i11 = i10;
                }
            } else {
                i11 = 0;
            }
            if (i11 != 0) {
                n1(bundle2, i11, str2, i11 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iC1 = zznpVar.c1(str, str2, bundle.get(str2), bundle2, list, z6, zK1);
                if (iC1 == 17) {
                    n1(bundle2, iC1, str2, Boolean.FALSE);
                } else if (iC1 != 0 && !"_ev".equals(str2)) {
                    n1(bundle2, iC1, iC1 == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (e2(str2) && (i13 = i13 + 1) > i12) {
                    String strG = E0.a.g("Event can't contain more than ", i12, " params");
                    zzfw zzfwVarI = i();
                    zzfr zzfrVar = zzhjVar.f9119E;
                    zzfwVarI.f9058z.c(strG, zzfrVar.c(str), zzfrVar.a(bundle));
                    S1(5, bundle2);
                    bundle2.remove(str2);
                }
            }
            zznpVar = this;
        }
        return bundle2;
    }

    public final long h2() {
        long andIncrement;
        long j;
        if (this.f9322v.get() != 0) {
            synchronized (this.f9322v) {
                this.f9322v.compareAndSet(-1L, 1L);
                andIncrement = this.f9322v.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f9322v) {
            long jNanoTime = System.nanoTime();
            ((zzhj) this.f577s).f9120F.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.f9323w + 1;
            this.f9323w = i10;
            j = jNextLong + ((long) i10);
        }
        return j;
    }

    public final Bundle i1(boolean z6, Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z6 ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z6 || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z6 && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (z6 && !TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            i().f9047A.a(e10, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final d i2() {
        if (this.f9324x == null) {
            Context context = ((zzhj) this.f577s).f9140s;
            i.f(context, "context");
            int i10 = Build.VERSION.SDK_INT;
            D0.a aVar = D0.a.a;
            if (i10 >= 30) {
                aVar.a();
            }
            c cVar = (i10 >= 30 ? aVar.a() : 0) >= 5 ? new c(context) : null;
            this.f9324x = cVar != null ? new d(cVar) : null;
        }
        return this.f9324x;
    }

    public final zzbd j1(String str, Bundle bundle, String str2, long j, boolean z6) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (b1(str) != 0) {
            i().f9056x.a(((zzhj) this.f577s).f9119E.g(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleG1 = g1(str, bundle2, Collections.singletonList("_o"), true);
        if (z6) {
            bundleG1 = f1(bundleG1);
        }
        Preconditions.i(bundleG1);
        return new zzbd(str, new zzbc(bundleG1), str2, j);
    }

    public final String j2() {
        byte[] bArr = new byte[16];
        l2().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object k1(int i10, Object obj, boolean z6, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return l1(String.valueOf(obj), z6, i10);
        }
        if (!z10) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleF1 = f1((Bundle) parcelable);
                if (!bundleF1.isEmpty()) {
                    arrayList.add(bundleF1);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final SecureRandom l2() {
        W0();
        if (this.f9321u == null) {
            this.f9321u = new SecureRandom();
        }
        return this.f9321u;
    }

    public final void o1(Bundle bundle, long j) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9047A.a(Long.valueOf(j10), "Params already contained engagement");
        }
        bundle.putLong("_et", j + j10);
    }

    public final void p1(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                V0().q1(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void q1(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            i().f9049C.c("Not putting event parameter. Invalid value type. name, type", ((zzhj) this.f577s).f9119E.f(str), simpleName);
        }
    }

    public final void r1(com.google.android.gms.internal.measurement.zzdg zzdgVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzdgVar.l(bundle);
        } catch (RemoteException e10) {
            zzfw zzfwVar = ((zzhj) this.f577s).f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.a(e10, "Error returning int value to wrapper");
        }
    }

    public final void s1(com.google.android.gms.internal.measurement.zzdg zzdgVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzdgVar.l(bundle);
        } catch (RemoteException e10) {
            zzfw zzfwVar = ((zzhj) this.f577s).f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.a(e10, "Error returning long value to wrapper");
        }
    }

    public final void t1(com.google.android.gms.internal.measurement.zzdg zzdgVar, Bundle bundle) {
        try {
            zzdgVar.l(bundle);
        } catch (RemoteException e10) {
            zzfw zzfwVar = ((zzhj) this.f577s).f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.a(e10, "Error returning bundle value to wrapper");
        }
    }

    public final void u1(com.google.android.gms.internal.measurement.zzdg zzdgVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzdgVar.l(bundle);
        } catch (RemoteException e10) {
            zzfw zzfwVar = ((zzhj) this.f577s).f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.a(e10, "Error returning bundle list to wrapper");
        }
    }

    public final void v1(com.google.android.gms.internal.measurement.zzdg zzdgVar, boolean z6) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z6);
        try {
            zzdgVar.l(bundle);
        } catch (RemoteException e10) {
            zzfw zzfwVar = ((zzhj) this.f577s).f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.a(e10, "Error returning boolean value to wrapper");
        }
    }

    public final void w1(com.google.android.gms.internal.measurement.zzdg zzdgVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzdgVar.l(bundle);
        } catch (RemoteException e10) {
            zzfw zzfwVar = ((zzhj) this.f577s).f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.a(e10, "Error returning byte array to wrapper");
        }
    }

    public final void x1(zzga zzgaVar, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(zzgaVar.f9064d.keySet())) {
            if (e2(str) && (i11 = i11 + 1) > i10) {
                String strG = E0.a.g("Event can't contain more than ", i10, " params");
                zzfw zzfwVarI = i();
                zzhj zzhjVar = (zzhj) this.f577s;
                String strC = zzhjVar.f9119E.c(zzgaVar.a);
                Bundle bundle = zzgaVar.f9064d;
                zzfwVarI.f9058z.c(strG, strC, zzhjVar.f9119E.a(bundle));
                S1(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void z1(String str, com.google.android.gms.internal.measurement.zzdg zzdgVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzdgVar.l(bundle);
        } catch (RemoteException e10) {
            zzfw zzfwVar = ((zzhj) this.f577s).f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.a(e10, "Error returning string value to wrapper");
        }
    }
}
