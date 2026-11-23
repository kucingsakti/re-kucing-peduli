package E4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Debug;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.Trace;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.aheaditec.talsec.security.l0;
import com.aheaditec.talsec_security.security.Natives;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.kcstream.cing.MainApp;
import com.kcstream.cing.activity.PasscodeActivity;
import com.unity3d.ads.metadata.MediationMetaData;
import dalvik.system.DexClassLoader;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.chromium.net.UrlRequest;
import org.json.JSONException;
import org.json.JSONObject;
import p188t1.AbstractC0838a;
import p188t1.C0841d;
import p188t1.C0842e;
import p188t1.C0845h;
import p188t1.C0847j;
import p188t1.C0851n;
import p188t1.C0852o;
import p188t1.C0859w;
import p188t1.C0861y;
import p188t1.EnumC0840c;
import p188t1.V;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements O4.b, C0.i, p073h4.a, T0.j, W2.c, p158q2.a, OnCompleteListener, Continuation, p148p2.e, I3.e, p204v1.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1350t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1351u;

    public /* synthetic */ B(Object obj, int i10, Object obj2) {
        this.f1349s = i10;
        this.f1350t = obj;
        this.f1351u = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:190:0x090b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0914  */
    /* JADX WARN: Code duplicated, block: B:195:0x0926  */
    /* JADX WARN: Code duplicated, block: B:197:0x092e A[PHI: r3
      0x092e: PHI (r3v15 int) = (r3v12 int), (r3v13 int), (r3v16 int) binds: [B:196:0x092c, B:191:0x0911, B:186:0x08f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:198:0x0930  */
    /* JADX WARN: Code duplicated, block: B:217:0x09a1 A[Catch: JSONException -> 0x0a12, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0a12, blocks: (B:214:0x0990, B:217:0x09a1, B:220:0x09b2, B:223:0x09c3, B:226:0x09d4, B:229:0x09e5, B:232:0x09f6, B:235:0x0a05), top: B:334:0x0990 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x09b2 A[Catch: JSONException -> 0x0a12, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0a12, blocks: (B:214:0x0990, B:217:0x09a1, B:220:0x09b2, B:223:0x09c3, B:226:0x09d4, B:229:0x09e5, B:232:0x09f6, B:235:0x0a05), top: B:334:0x0990 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x09c3 A[Catch: JSONException -> 0x0a12, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0a12, blocks: (B:214:0x0990, B:217:0x09a1, B:220:0x09b2, B:223:0x09c3, B:226:0x09d4, B:229:0x09e5, B:232:0x09f6, B:235:0x0a05), top: B:334:0x0990 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x09d4 A[Catch: JSONException -> 0x0a12, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0a12, blocks: (B:214:0x0990, B:217:0x09a1, B:220:0x09b2, B:223:0x09c3, B:226:0x09d4, B:229:0x09e5, B:232:0x09f6, B:235:0x0a05), top: B:334:0x0990 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x09e5 A[Catch: JSONException -> 0x0a12, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0a12, blocks: (B:214:0x0990, B:217:0x09a1, B:220:0x09b2, B:223:0x09c3, B:226:0x09d4, B:229:0x09e5, B:232:0x09f6, B:235:0x0a05), top: B:334:0x0990 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x09f6 A[Catch: JSONException -> 0x0a12, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0a12, blocks: (B:214:0x0990, B:217:0x09a1, B:220:0x09b2, B:223:0x09c3, B:226:0x09d4, B:229:0x09e5, B:232:0x09f6, B:235:0x0a05), top: B:334:0x0990 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x0a05 A[Catch: JSONException -> 0x0a12, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0a12, blocks: (B:214:0x0990, B:217:0x09a1, B:220:0x09b2, B:223:0x09c3, B:226:0x09d4, B:229:0x09e5, B:232:0x09f6, B:235:0x0a05), top: B:334:0x0990 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x0a7d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v64, types: [int] */
    /* JADX WARN: Type inference failed for: r9v87 */
    /* JADX WARN: Type inference failed for: r9v88 */
    private final p188t1.F e() {
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        char c10;
        int i10;
        int i11;
        int i12;
        String strB;
        ?? r15;
        boolean z20;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean zJ;
        boolean zJ2;
        boolean zJ3;
        boolean zN;
        boolean zEquals;
        boolean zEquals2;
        boolean zA;
        String str8;
        String str9;
        String str10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 6;
        String str11 = "0E6DAC";
        boolean z21 = false;
        int i18 = 1;
        C0842e c0842e = (C0842e) this.f1350t;
        c0842e.getClass();
        String[] strArr = AbstractC0838a.a;
        int length = strArr.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length) {
                z6 = false;
                break;
            }
            String str12 = strArr[i19];
            String str13 = Build.PRODUCT;
            if (str13 != null && str13.contains(str12)) {
                c0842e.j(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07897D663BC7DCADF4")), str12);
                z6 = true;
                break;
            }
            i19++;
        }
        String[] strArr2 = AbstractC0838a.f14994b;
        int length2 = strArr2.length;
        int i20 = 0;
        while (true) {
            if (i20 >= length2) {
                z10 = false;
                break;
            }
            String str14 = strArr2[i20];
            if (Build.MANUFACTURER.contains(str14)) {
                c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B078960753AD6CFAFE347C3201848")), str14);
                z10 = true;
                break;
            }
            i20++;
        }
        boolean z22 = z6 | z10;
        String[] strArr3 = AbstractC0838a.f14995c;
        int length3 = strArr3.length;
        int i21 = 0;
        while (true) {
            if (i21 >= length3) {
                z11 = false;
                break;
            }
            String str15 = strArr3[i21];
            if (Build.BRAND.contains(str15)) {
                c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07896F6635CDCD")), str15);
                z11 = true;
                break;
            }
            i21++;
        }
        boolean z23 = z22 | z11;
        String[] strArr4 = AbstractC0838a.f15000h;
        int length4 = strArr4.length;
        int i22 = 0;
        while (true) {
            if (i22 >= length4) {
                z12 = false;
                break;
            }
            String str16 = strArr4[i22];
            if (Build.DEVICE.contains(str16)) {
                c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B0789697122CACAAB")), str16);
                z12 = true;
                break;
            }
            i22++;
        }
        boolean z24 = z23 | z12;
        String[] strArr5 = AbstractC0838a.f15001i;
        int length5 = strArr5.length;
        int i23 = 0;
        while (true) {
            if (i23 >= length5) {
                z13 = false;
                break;
            }
            String str17 = strArr5[i23];
            if (Build.MODEL.contains(str17)) {
                c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B0789607B30C6C5")), str17);
                z13 = true;
                break;
            }
            i23++;
        }
        boolean z25 = z24 | z13;
        String[] strArr6 = AbstractC0838a.j;
        int length6 = strArr6.length;
        int i24 = 0;
        while (true) {
            if (i24 >= length6) {
                z14 = false;
                break;
            }
            String str18 = strArr6[i24];
            if (Build.HARDWARE.contains(str18)) {
                c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B0789657526C7DEAFF256")), str18);
                z14 = true;
                break;
            }
            i24++;
        }
        boolean z26 = z25 | z14;
        String[] strArr7 = AbstractC0838a.f15002k;
        int length7 = strArr7.length;
        int i25 = 0;
        while (true) {
            if (i25 >= length7) {
                z15 = false;
                break;
            }
            String str19 = strArr7[i25];
            if (Build.FINGERPRINT.contains(str19)) {
                c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07896B7D3AC4CCBCF041DF3C09")), str19);
                z15 = true;
                break;
            }
            i25++;
        }
        boolean z27 = z26 | z15;
        String[] strArr8 = AbstractC0838a.f15004m;
        int length8 = strArr8.length;
        int i26 = 0;
        while (true) {
            if (i26 >= length8) {
                z16 = false;
                break;
            }
            File file = new File(strArr8[i26]);
            try {
                if (file.exists() && file.isDirectory()) {
                    c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07897D663BC7DCADF4")), p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")));
                    z16 = true;
                    break;
                }
            } catch (SecurityException unused) {
            }
            i26++;
        }
        boolean z28 = z27 | z16;
        List listC = p086i8.l.C(new C0847j(null, null, null, null, p086i8.C.a(p086i8.C.c("056FA1C50BF1CAB5")), null, null, null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 239), new C0847j(p086i8.C.a(p086i8.C.c("076DBBCE06E085978F6F0A04DB1F")), null, null, null, null, null, p086i8.C.a(p086i8.C.c("572CE58758")), null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 190), new C0847j(null, null, null, null, p086i8.C.a(p086i8.C.c("1376B5DB58E9D1A2")), null, p086i8.C.a(p086i8.C.c("572CE58758")), null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 175), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("334FF9EE53B39089")), null, null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 215), new C0847j(p086i8.C.a(p086i8.C.c("2C4599843CB695F7AD")), null, null, null, null, null, p086i8.C.a(p086i8.C.c("572CE58758")), null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 190), new C0847j(p086i8.C.a(p086i8.C.c("37558BE05AB59483")), null, null, null, null, null, p086i8.C.a(p086i8.C.c("572CE58758")), null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 190), new C0847j(null, null, null, null, null, p086i8.C.a(p086i8.C.c("334FF9EE53BD94F7")), p086i8.C.a(p086i8.C.c("572CE58758")), null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 159), new C0847j(null, null, null, null, null, p086i8.C.a(p086i8.C.c("334FF9EE53B29689")), p086i8.C.a(p086i8.C.c("572CE58758")), null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 159), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("334FF9EE53B09089")), null, null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("334FF9EE53B29389")), null, null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("334FF9EE53B29289")), null, null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("334FF9EE53BD9D89")), null, null, p086i8.C.a(p086i8.C.c("2E6DAC893AE9C4BE8365")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("334FF9E852B59089")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("334DF9995BCF")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("334FF9EE53B09081")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("334FF9EE53BC9D85")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("3341939958")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("334FF9EE53B29285")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("334FF9EE53B29681")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("2B40E6995AB4")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("2F4C91F926D0F6E7A7225F58CB")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("2F4C91F926D0F6E7A7245F59CB")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("2C45F9E153B695")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("304B8CEC26A597E7BE5B")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, null, null, p086i8.C.a(p086i8.C.c("183AE2")), null, p086i8.C.a(p086i8.C.c("215181FA35DF95F6B753")), null, null, p086i8.C.a(p086i8.C.c("226EA1CC39F1C4A48D64")), 215), new C0847j(null, p086i8.C.a(p086i8.C.c("1161BBC4")), null, null, null, null, null, p086i8.C.a(p086i8.C.c("2767BADC03EBC08E88630A04")), p086i8.C.a(p086i8.C.c("156CB0CC0CECCBA282")), 125), new C0847j(null, p086i8.C.a(p086i8.C.c("1161BBC4")), null, null, null, null, null, p086i8.C.a(p086i8.C.c("2177A0C10FEBD1AE8556222C")), p086i8.C.a(p086i8.C.c("156CB0CC0CECCBA282")), 125), new C0847j(null, p086i8.C.a(p086i8.C.c("057AADC705F6")), null, null, null, null, null, p086i8.C.a(p086i8.C.c("2767BADC03EBC08E88630A04")), p086i8.C.a(p086i8.C.c("156CB0CC0CECCBA282")), 125), new C0847j(null, p086i8.C.a(p086i8.C.c("057AADC705F6")), null, null, null, null, null, p086i8.C.a(p086i8.C.c("2177A0C10FEBD1AE8556222C")), p086i8.C.a(p086i8.C.c("156CB0CC0CECCBA282")), 125), new C0847j(null, null, p086i8.C.a(p086i8.C.c("057AADC705F6")), null, null, null, null, p086i8.C.a(p086i8.C.c("2767BADC03EBC08E88630A04")), p086i8.C.a(p086i8.C.c("156CB0CC0CECCBA282")), 123), new C0847j(null, null, p086i8.C.a(p086i8.C.c("057AADC705F6")), null, null, null, null, p086i8.C.a(p086i8.C.c("2177A0C10FEBD1AE8556222C")), p086i8.C.a(p086i8.C.c("156CB0CC0CECCBA282")), 123));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            C0847j c0847j = (C0847j) obj;
            String str20 = c0847j.a;
            if (str20 != null) {
                try {
                    String str21 = Build.PRODUCT;
                    zJ = str21 != null ? L9.f.J(str21, str20, z21) : z21;
                } catch (NoSuchFieldError unused2) {
                    AbstractC0487g.r("2E6D87DC09EDE3AE837B0B2D895F7B26", "2570A6C618A5D2AF8F7B0A489A4E7731D0DAA7EE5496100853EEA17A0FD71678354180890CECC0AB82");
                }
                if (zJ) {
                    c0847j.f15052k += i18;
                }
            }
            String str22 = c0847j.f15044b;
            if (str22 != null) {
                try {
                    String str23 = Build.HARDWARE;
                    zJ2 = str23 != null ? L9.f.J(str23, str22, z21) : z21;
                } catch (NoSuchFieldError unused3) {
                    AbstractC0487g.r("2E6D87DC09EDE3AE837B0B2D895F7B26", "2570A6C618A5D2AF8F7B0A489A4E7731D0DAA7EE5496100853EEA17A17C40B78374386EC4AE3CCA28A73");
                }
                if (zJ2) {
                    c0847j.f15052k += i18;
                }
            }
            String str24 = c0847j.f15045c;
            if (str24 != null) {
                try {
                    String str25 = Build.BOARD;
                    zJ3 = str25 != null ? L9.f.J(str25, str24, z21) : z21;
                } catch (NoSuchFieldError unused4) {
                    AbstractC0487g.r("2E6D87DC09EDE3AE837B0B2D895F7B26", "2570A6C618A5D2AF8F7B0A489A4E7731D0DAA7EE5496100853EEA17A1DCA186E2422B2C00FE9C1");
                }
                if (zJ3) {
                    c0847j.f15052k += i18;
                }
            }
            String str26 = c0847j.f15046d;
            if (str26 != null) {
                try {
                    String[] strArr9 = Build.SUPPORTED_ABIS;
                    zN = strArr9 != null ? p086i8.i.n(str26, strArr9) : z21;
                } catch (NoSuchFieldError unused5) {
                    AbstractC0487g.r("2E6D87DC09EDE3AE837B0B2D895F7B26", "2570A6C618A5D2AF8F7B0A489A4E7731D0DAA7EE5496100853EEA17A0CD0096C2F5080EC2EDAE485AF444F0E92487830");
                }
                if (zN) {
                    c0847j.f15052k += i18;
                }
            }
            String str27 = c0847j.f15047e;
            if (str27 != null) {
                try {
                    zEquals = str27.equals(Build.DEVICE);
                } catch (NoSuchFieldError unused6) {
                    AbstractC0487g.r("2E6D87DC09EDE3AE837B0B2D895F7B26", "2570A6C618A5D2AF8F7B0A489A4E7731D0DAA7EE5496100853EEA17A1BC00F752347F4CF03E0C9A3");
                    zEquals = z21;
                }
                if (zEquals) {
                    c0847j.f15052k += i18;
                }
            }
            String str28 = c0847j.f15048f;
            if (str28 != null) {
                try {
                    zEquals2 = str28.equals(Build.MODEL);
                } catch (NoSuchFieldError unused7) {
                    AbstractC0487g.r("2E6D87DC09EDE3AE837B0B2D895F7B26", "2570A6C618A5D2AF8F7B0A489A4E7731D0DAA7EE5496100853EEA17A12CA1D792C22B2C00FE9C1");
                    zEquals2 = z21;
                }
                if (zEquals2) {
                    c0847j.f15052k += i18;
                }
            }
            String str29 = c0847j.f15049g;
            if (str29 != null) {
                try {
                    zA = p210v8.i.a(Build.VERSION.RELEASE, str29);
                } catch (NoSuchFieldError unused8) {
                    AbstractC0487g.r("2E6D87DC09EDE3AE837B0B2D895F7B26", "2570A6C618A5D2AF8F7B0A489A4E7731D0DAA7EE5496100853EEA17A09C00B6F294D9A8738C0E982A7442A489D447138C7");
                    zA = z21;
                }
                if (zA) {
                    c0847j.f15052k += i18;
                }
            }
            String str30 = c0847j.f15050h;
            if (str30 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    Scanner scanner = new Scanner(new File(p086i8.C.a(p086i8.C.c("4F72A6C609AAC6B7937E010E94"))));
                    while (scanner.hasNextLine()) {
                        String strNextLine = scanner.nextLine();
                        p210v8.i.e(strNextLine, p086i8.C.a(p086i8.C.c("132CBACC12F1E9AE88724741")));
                        List listA0 = L9.f.a0(strNextLine, new String[]{p086i8.C.a(p086i8.C.c("5A22"))}, i17);
                        if (listA0.size() > i18) {
                            String str31 = (String) listA0.get(0);
                            str8 = str11;
                            int length9 = str31.length() - 1;
                            int i27 = 0;
                            int i28 = i18;
                            int i29 = 0;
                            while (true) {
                                if (i29 > length9) {
                                    i15 = length9;
                                    break;
                                }
                                try {
                                    i15 = length9;
                                    int i30 = p210v8.i.h(str31.charAt(i27 == 0 ? i29 : length9), 32) <= 0 ? i28 : 0;
                                    if (i27 == 0) {
                                        if (i30 == 0) {
                                            i27 = i28;
                                        } else {
                                            i29++;
                                        }
                                        length9 = i15;
                                    } else {
                                        if (i30 == 0) {
                                            break;
                                        }
                                        length9 = i15 - 1;
                                    }
                                } catch (Exception unused9) {
                                }
                            }
                            String string = str31.subSequence(i29, i15 + 1).toString();
                            String str32 = (String) listA0.get(i28);
                            int length10 = str32.length() - i28;
                            int i31 = 0;
                            boolean z29 = false;
                            while (true) {
                                i16 = length10;
                                if (i31 > length10) {
                                    break;
                                }
                                if (!z29) {
                                    length10 = i31;
                                }
                                try {
                                    boolean z30 = z29;
                                    boolean z31 = p210v8.i.h(str32.charAt(length10), 32) <= 0;
                                    if (z30) {
                                        if (!z31) {
                                            break;
                                        }
                                        length10 = i16 - 1;
                                    } else if (z31) {
                                        i31++;
                                        length10 = i16;
                                    } else {
                                        length10 = i16;
                                        z29 = true;
                                    }
                                    z29 = z30;
                                } catch (Exception unused10) {
                                }
                            }
                            linkedHashMap.put(string, str32.subSequence(i31, i16 + 1).toString());
                            str11 = str8;
                            i17 = 6;
                            i18 = 1;
                        }
                    }
                } catch (Exception unused11) {
                }
                str8 = str11;
                String str33 = (String) linkedHashMap.get(p086i8.C.a(p086i8.C.c("2863A6CD1DE4D7A2")));
                if (str33 != null) {
                    i13 = 1;
                    if (!L9.f.J(str33, str30, false)) {
                        str9 = (String) linkedHashMap.get(p086i8.C.a(p086i8.C.c("0D6DB0CC06A5CBA68B72")));
                        if (str9 != null) {
                            i13 = 1;
                            if (L9.f.J(str9, str30, false)) {
                                str10 = (String) linkedHashMap.get(p086i8.C.a(p086i8.C.c("1667BACD05F7FAAE82")));
                                if (str10 != null) {
                                    i13 = 1;
                                    i14 = L9.f.J(str10, str30, false) ? i13 : 0;
                                } else {
                                    i13 = 1;
                                }
                            }
                        } else {
                            str10 = (String) linkedHashMap.get(p086i8.C.a(p086i8.C.c("1667BACD05F7FAAE82")));
                            if (str10 != null) {
                                i13 = 1;
                                if (L9.f.J(str10, str30, false)) {
                                }
                            } else {
                                i13 = 1;
                            }
                        }
                    }
                } else {
                    str9 = (String) linkedHashMap.get(p086i8.C.a(p086i8.C.c("0D6DB0CC06A5CBA68B72")));
                    if (str9 != null) {
                        i13 = 1;
                        if (L9.f.J(str9, str30, false)) {
                            str10 = (String) linkedHashMap.get(p086i8.C.a(p086i8.C.c("1667BACD05F7FAAE82")));
                            if (str10 != null) {
                                i13 = 1;
                                if (L9.f.J(str10, str30, false)) {
                                }
                            } else {
                                i13 = 1;
                            }
                        }
                    } else {
                        str10 = (String) linkedHashMap.get(p086i8.C.a(p086i8.C.c("1667BACD05F7FAAE82")));
                        if (str10 != null) {
                            i13 = 1;
                            if (L9.f.J(str10, str30, false)) {
                            }
                        } else {
                            i13 = 1;
                        }
                    }
                }
                if (i14 != 0) {
                    c0847j.f15052k += i13;
                }
            } else {
                str8 = str11;
            }
            if (c0847j.f15052k == c0847j.j) {
                arrayList.add(obj);
            }
            str11 = str8;
            i17 = 6;
            z21 = false;
            i18 = 1;
        }
        String str34 = str11;
        if (arrayList.isEmpty()) {
            z17 = false;
            z18 = false;
        } else {
            String strA = p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07896F6635CDCD"));
            z17 = false;
            C0847j c0847j2 = (C0847j) arrayList.get(0);
            c0847j2.getClass();
            c0842e.l(strA, c0847j2.f15051i);
            String strA2 = p086i8.C.a(p086i8.C.c("0663BFCC2EE0D3AE85723F1A944B7D38C6"));
            C0847j c0847j3 = (C0847j) arrayList.get(0);
            c0847j3.getClass();
            JSONObject jSONObject = new JSONObject();
            String str35 = c0847j3.a;
            if (str35 != null) {
                try {
                    jSONObject.put(p086i8.C.a(p086i8.C.c("1070BBCD1FE6D1")), str35);
                    str = c0847j3.f15044b;
                    if (str != null) {
                        jSONObject.put(p086i8.C.a(p086i8.C.c("0863A6CD1DE4D7A2")), str);
                    }
                    str2 = c0847j3.f15045c;
                    if (str2 != null) {
                        jSONObject.put(p086i8.C.a(p086i8.C.c("026DB5DB0E")), str2);
                    }
                    str3 = c0847j3.f15046d;
                    if (str3 != null) {
                        jSONObject.put(p086i8.C.a(p086i8.C.c("0372A1E808EC")), str3);
                    }
                    str4 = c0847j3.f15047e;
                    if (str4 != null) {
                        jSONObject.put(p086i8.C.a(p086i8.C.c("0467A2C009E0")), str4);
                    }
                    str5 = c0847j3.f15048f;
                    if (str5 != null) {
                        jSONObject.put(p086i8.C.a(p086i8.C.c("0D6DB0CC06")), str5);
                    }
                    str6 = c0847j3.f15049g;
                    if (str6 != null) {
                        jSONObject.put(p086i8.C.a(p086i8.C.c("1267B8CC0BF6C0")), str6);
                    }
                    str7 = c0847j3.f15050h;
                    if (str7 != null) {
                        jSONObject.put(p086i8.C.a(p086i8.C.c("0372A1FF0FEBC1A894")), str7);
                    }
                } catch (JSONException unused12) {
                }
            } else {
                str = c0847j3.f15044b;
                if (str != null) {
                    jSONObject.put(p086i8.C.a(p086i8.C.c("0863A6CD1DE4D7A2")), str);
                }
                str2 = c0847j3.f15045c;
                if (str2 != null) {
                    jSONObject.put(p086i8.C.a(p086i8.C.c("026DB5DB0E")), str2);
                }
                str3 = c0847j3.f15046d;
                if (str3 != null) {
                    jSONObject.put(p086i8.C.a(p086i8.C.c("0372A1E808EC")), str3);
                }
                str4 = c0847j3.f15047e;
                if (str4 != null) {
                    jSONObject.put(p086i8.C.a(p086i8.C.c("0467A2C009E0")), str4);
                }
                str5 = c0847j3.f15048f;
                if (str5 != null) {
                    jSONObject.put(p086i8.C.a(p086i8.C.c("0D6DB0CC06")), str5);
                }
                str6 = c0847j3.f15049g;
                if (str6 != null) {
                    jSONObject.put(p086i8.C.a(p086i8.C.c("1267B8CC0BF6C0")), str6);
                }
                str7 = c0847j3.f15050h;
                if (str7 != null) {
                    jSONObject.put(p086i8.C.a(p086i8.C.c("0372A1FF0FEBC1A894")), str7);
                }
            }
            if (AbstractC0487g.s("0467B6DC0D", p086i8.C.a(p086i8.C.c("1267B8CC0BF6C0")))) {
                p086i8.C.a(p086i8.C.c("296CB7C00EE0CBB3AA7808"));
                p086i8.C.a(p086i8.C.c("236AB1CA01CBC4AA832D4F"));
                p086i8.C.a(p086i8.C.c("4C22BDC70CEA9FE7"));
                jSONObject.toString();
            }
            c0842e.a.add(new p188t1.S(strA2, jSONObject));
            z18 = true;
        }
        boolean z32 = z18 | z28;
        int i32 = Build.VERSION.SDK_INT;
        MainApp mainApp = (MainApp) this.f1351u;
        TelephonyManager telephonyManager = (i32 >= 29 || mainApp.checkSelfPermission(p086i8.C.a(p086i8.C.c("016CB0DB05ECC1E996721D05925E673DCCC7E0D276F716226ACA8A1A1ADA0A68215691"))) != 0) ? null : (TelephonyManager) mainApp.getSystemService(p086i8.C.a(p086i8.C.c("106ABBC70F")));
        if (telephonyManager == null) {
            z19 = z17;
        } else {
            String line1Number = telephonyManager.getLine1Number();
            if (line1Number == null ? z17 : line1Number.contains(p086i8.C.a(p086i8.C.c("5137E19C5FB794F2D3")))) {
                c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01C9CCA98326211D964F7126")), telephonyManager.getLine1Number());
            } else {
                String subscriberId = telephonyManager.getSubscriberId();
                if (subscriberId == null ? z17 : subscriberId.contains(p086i8.C.a(p086i8.C.c("5333E49B5CB595F7D6275F58CB1D24")))) {
                    c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01D6D0A59565060A9E5F5D30")), telephonyManager.getSubscriberId());
                } else {
                    String simSerialNumber = telephonyManager.getSimSerialNumber();
                    if (simSerialNumber == null ? z17 : simSerialNumber.contains(p086i8.C.a(p086i8.C.c("583BE4985EB495F4D4265E59CA152165939EFCB0")))) {
                        c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01D6CCAAB5721D019A41")), telephonyManager.getSimSerialNumber());
                    } else {
                        String voiceMailNumber = telephonyManager.getVoiceMailNumber();
                        if (voiceMailNumber == null ? z17 : voiceMailNumber.contains(p086i8.C.a(p086i8.C.c("5137E19C58B492F2D62356")))) {
                            c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01D3CAAE8572220992415A21CECBABF2")), telephonyManager.getVoiceMailNumber());
                        } else {
                            z19 = z17;
                        }
                    }
                }
            }
            z19 = true;
        }
        C0851n[] c0851nArr = AbstractC0838a.f15003l;
        int length11 = c0851nArr.length;
        boolean z33 = z17;
        boolean z34 = z33;
        ?? r10 = z33;
        while (r10 < length11) {
            C0851n c0851n = c0851nArr[r10];
            StringBuilder sb = new StringBuilder();
            sb.append(p086i8.C.a(p086i8.C.c("0767A0D918EAD5E7")));
            c0851n.getClass();
            String str36 = c0851n.a;
            sb.append(str36);
            try {
                strB = com.bumptech.glide.e.b(sb.toString());
            } catch (Exception unused13) {
                strB = null;
            }
            if (strB != null) {
                String[] strArr10 = c0851n.f15069b;
                if (strArr10 == null) {
                    if (strB.isEmpty()) {
                        z20 = z17;
                    } else {
                        c0842e.l(p086i8.C.a(p086i8.C.c("036AB1CA01D5D7A896721D1C827A7C3DC0C187F37CD83E0475EC80392AE938480F70")), str36);
                        z20 = true;
                    }
                    z34 = (z34 ? 1 : 0) | z20;
                } else {
                    int length12 = strArr10.length;
                    boolean z35 = z17;
                    boolean z36 = z35;
                    while (r15 < length12) {
                        if (strB.equals(strArr10[r15])) {
                            r15 = z35;
                            String strA3 = p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07897D663BD3CCBCF44AE033114FE7B6"));
                            StringBuilder sbC = p239z.e.c(str36);
                            sbC.append(p086i8.C.a(p086i8.C.c("4038F4")));
                            sbC.append(strB);
                            c0842e.l(strA3, sbC.toString());
                            z36 = true;
                        } else {
                            r15 = z35;
                        }
                        r15++;
                        z36 = z36;
                    }
                    r15 = z35;
                    z34 = (z34 ? 1 : 0) | (z36 ? 1 : 0);
                }
            }
            z17 = false;
            r10++;
            z34 = z34;
        }
        boolean z37 = z34;
        if (AbstractC0487g.s("0263A7C009", p086i8.C.a(p086i8.C.c("0263A7C009")))) {
            String str37 = Build.BOARD;
            if (str37 == null || !str37.toLowerCase().contains(p086i8.C.a(p086i8.C.c(str34)))) {
                c10 = 0;
            } else {
                c0842e.j(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07896F7B35D1CD")), p086i8.C.a(p086i8.C.c(str34)));
                c10 = 1;
            }
            int i33 = (z34 ? 1 : 0) | c10;
            c0842e.getClass();
            String str38 = Build.BOOTLOADER;
            if (str38 == null || !str38.toLowerCase().contains(p086i8.C.a(p086i8.C.c(str34)))) {
                i10 = 0;
            } else {
                c0842e.j(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07896F7B3BD7C5A1E157D320")), p086i8.C.a(p086i8.C.c(str34)));
                i10 = 1;
            }
            int i34 = i33 | i10;
            String str39 = Build.SERIAL;
            if (str39 == null || !str39.toLowerCase().contains(p086i8.C.a(p086i8.C.c(str34)))) {
                i11 = 0;
            } else {
                c0842e.j(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07897E7126CAC8A2")), p086i8.C.a(p086i8.C.c(str34)));
                i11 = 1;
            }
            int i35 = i34 | i11;
            if (Build.getRadioVersion() == null || !Build.getRadioVersion().equalsIgnoreCase(p086i8.C.a(p086i8.C.c("512CE4875AAB95")))) {
                i12 = 0;
            } else {
                c0842e.j(p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07897F7530CAC6")), p086i8.C.a(p086i8.C.c("512CE4875AAB95")));
                i12 = 1;
            }
            z37 = (((((((((((((((i35 | i12) | (c0842e.q(p086i8.C.a(p086i8.C.c("126DFAD918EAC1B28563410B8B583A35C1C0A2E940C2")), p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07896C763D")), AbstractC0838a.f14998f) ? 1 : 0)) == true ? 1 : 0) | (c0842e.x() ? 1 : 0)) | (c0842e.y() ? 1 : 0) ? 1 : 0) | (c0842e.B() ? 1 : 0)) | (c0842e.q(p086i8.C.a(p086i8.C.c("126DFACB1FECC9A3C87103098D4266")), p086i8.C.a(p086i8.C.c("036AB1CA01C0C8B28A761B07896B7835D5C6BC")), AbstractC0838a.f14996d) ? 1 : 0) ? 1 : 0) | (c0842e.A() ? 1 : 0)) | (c0842e.z() ? 1 : 0) ? 1 : 0) | (c0842e.u() ? 1 : 0)) | (c0842e.o() ? 1 : 0) ? 1 : 0) | (c0842e.v() ? 1 : 0)) | (c0842e.n() ? 1 : 0) ? 1 : 0) | (c0842e.w() ? 1 : 0)) | (c0842e.t(mainApp) ? 1 : 0) ? 1 : 0) | (c0842e.s(mainApp) ? 1 : 0) | (c0842e.r(mainApp) ? 1 : 0);
        }
        return new p188t1.F(!z32, !z19, !z37);
    }

    private final p188t1.F f() {
        boolean z6;
        boolean z10;
        p188t1.K k3 = (p188t1.K) this.f1350t;
        k3.getClass();
        boolean z11 = false;
        if (Debug.isDebuggerConnected()) {
            k3.l(p086i8.C.a(p086i8.C.c("097190CC08F0C2A083652C0795437137D7CCAA")), p086i8.C.a(p086i8.C.c("1470A1CC")));
            z6 = true;
        } else {
            z6 = false;
        }
        if ((((MainApp) this.f1351u).getApplicationInfo().flags & 2) != 0) {
            k3.l(p086i8.C.a(p086i8.C.c("097195D91AE9CCA487630607956B7835C4ECA0E151DA3719")), p086i8.C.a(p086i8.C.c("1470A1CC")));
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z6 | z10;
        String strA = p086i8.C.a(p086i8.C.c("3470B5CA0FF7F5AE82"));
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(p086i8.C.a(p086i8.C.c("4F72A6C609AAD6A28A71401B8F4C6021D0")))), 1000);
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    if (line.length() > strA.length() && line.substring(0, strA.length()).equalsIgnoreCase(strA)) {
                        if (Integer.decode(line.substring(strA.length() + 1).trim()).intValue() <= 0) {
                            break;
                        }
                        k3.l(p086i8.C.a(p086i8.C.c("0863A7FD18E4C6A29447060C")), p086i8.C.a(p086i8.C.c("1470A1CC")));
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        } catch (Exception unused) {
        }
        return new p188t1.F(!z12, !z11, true);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object C(Task task) {
        p140o4.j jVar = (p140o4.j) this.f1350t;
        String str = (String) this.f1351u;
        synchronized (jVar) {
            ((p212w.e) jVar.f13765b).remove(str);
        }
        return task;
    }

    @Override // C0.i
    public void a(Preference preference, Serializable serializable) {
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.f1350t;
        F4.f fVar = (F4.f) this.f1351u;
        p210v8.i.f(fVar, "this$0");
        p210v8.i.f(preference, "<anonymous parameter 0>");
        p210v8.i.d(serializable, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) serializable).booleanValue()) {
            Intent intent = new Intent(switchPreferenceCompat.f6832s, (Class<?>) PasscodeActivity.class);
            intent.putExtra("is_setup_passcode", true);
            fVar.b(1, intent);
        } else {
            SharedPreferences sharedPreferences = fVar.f1500B0;
            if (sharedPreferences != null) {
                sharedPreferences.edit().remove("key_passcode").apply();
            } else {
                p210v8.i.n("sharedPref");
                throw null;
            }
        }
    }

    @Override // p148p2.e
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        p148p2.g gVar = (p148p2.g) this.f1350t;
        p148p2.a aVar = gVar.f14213v;
        int i10 = aVar.f14202b;
        i2.i iVar = (i2.i) this.f1351u;
        ArrayList arrayListG = gVar.g(sQLiteDatabase, iVar, i10);
        for (p051f2.d dVar : p051f2.d.values()) {
            if (dVar != iVar.f12182c) {
                int size = aVar.f14202b - arrayListG.size();
                if (size <= 0) {
                    break;
                }
                arrayListG.addAll(gVar.g(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i11 = 0; i11 < arrayListG.size(); i11++) {
            sb.append(((p148p2.b) arrayListG.get(i11)).a);
            if (i11 < arrayListG.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", MediationMetaData.KEY_NAME, "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new p148p2.f(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListG.listIterator();
        while (listIterator.hasNext()) {
            p148p2.b bVar = (p148p2.b) listIterator.next();
            if (map.containsKey(Long.valueOf(bVar.a))) {
                Q6.b bVarC = bVar.f14207c.c();
                long j10 = bVar.a;
                for (p148p2.f fVar : (Set) map.get(Long.valueOf(j10))) {
                    bVarC.a(fVar.a, fVar.f14208b);
                }
                listIterator.set(new p148p2.b(j10, bVar.f14206b, bVarC.b()));
            }
        }
        return arrayListG;
    }

    @Override // p158q2.a
    public Object b() {
        switch (this.f1349s) {
            case 5:
                p148p2.g gVar = (p148p2.g) ((p138o2.h) this.f1350t).f13697c;
                gVar.getClass();
                Iterable iterable = (Iterable) this.f1351u;
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + p148p2.g.j(iterable)).execute();
                    break;
                }
                break;
            default:
                p138o2.h hVar = (p138o2.h) this.f1350t;
                hVar.getClass();
                for (Map.Entry entry : ((HashMap) this.f1351u).entrySet()) {
                    ((p148p2.g) hVar.f13703i).h(((Integer) entry.getValue()).intValue(), p108l2.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // p073h4.a
    public void c(p073h4.b bVar) {
        ((p073h4.a) this.f1350t).c(bVar);
        ((p073h4.a) this.f1351u).c(bVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void d(Task task) {
        ((p140o4.g) this.f1351u).a((Intent) this.f1350t);
    }

    @Override // I3.e
    public Object h(Fa.e eVar) {
        String strValueOf;
        switch (this.f1349s) {
            case 10:
                Context context = (Context) eVar.a(Context.class);
                switch (((D3.i) this.f1351u).f1062s) {
                    case 0:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        strValueOf = applicationInfo == null ? "" : String.valueOf(applicationInfo.targetSdkVersion);
                        break;
                    case 1:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        strValueOf = (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) ? String.valueOf(applicationInfo2.minSdkVersion) : "";
                        break;
                    case 2:
                        int i10 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "embedded" : "";
                        } else {
                            strValueOf = "auto";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        strValueOf = installerPackageName == null ? "" : FirebaseCommonRegistrar.a(installerPackageName);
                        break;
                }
                return new p160q4.a((String) this.f1350t, strValueOf);
            default:
                String str = (String) this.f1350t;
                I3.b bVar = (I3.b) this.f1351u;
                try {
                    Trace.beginSection(str);
                    return bVar.f2022f.h(eVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:239:0x064f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0659 A[LOOP:5: B:238:0x064d->B:242:0x0659, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x0680  */
    /* JADX WARN: Code duplicated, block: B:247:0x068f  */
    /* JADX WARN: Code duplicated, block: B:250:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:252:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:254:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:257:0x06da  */
    /* JADX WARN: Code duplicated, block: B:263:0x0710 A[Catch: all -> 0x0767, TryCatch #4 {all -> 0x0767, blocks: (B:260:0x0703, B:261:0x070a, B:263:0x0710, B:265:0x0722, B:267:0x074c), top: B:329:0x0703, outer: #25 }] */
    /* JADX WARN: Code duplicated, block: B:267:0x074c A[Catch: all -> 0x0767, TRY_LEAVE, TryCatch #4 {all -> 0x0767, blocks: (B:260:0x0703, B:261:0x070a, B:263:0x0710, B:265:0x0722, B:267:0x074c), top: B:329:0x0703, outer: #25 }] */
    /* JADX WARN: Code duplicated, block: B:276:0x0762 A[LOOP:7: B:266:0x074a->B:276:0x0762, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:297:0x07b6 A[Catch: NameNotFoundException -> 0x07bf, TryCatch #21 {NameNotFoundException -> 0x07bf, blocks: (B:295:0x07b0, B:297:0x07b6, B:300:0x07c1), top: B:354:0x07b0 }] */
    /* JADX WARN: Code duplicated, block: B:300:0x07c1 A[Catch: NameNotFoundException -> 0x07bf, TRY_LEAVE, TryCatch #21 {NameNotFoundException -> 0x07bf, blocks: (B:295:0x07b0, B:297:0x07b6, B:300:0x07c1), top: B:354:0x07b0 }] */
    /* JADX WARN: Code duplicated, block: B:304:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:351:0x0795 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0657 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x065e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x076a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0722 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0754 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x070a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x070a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:? A[Catch: Exception -> 0x075d, SYNTHETIC, TRY_LEAVE, TryCatch #5 {Exception -> 0x075d, blocks: (B:258:0x06dc, B:270:0x0757, B:280:0x076d, B:293:0x079d, B:292:0x079a, B:289:0x0795, B:259:0x06f5, B:269:0x0754, B:279:0x076a, B:287:0x0792, B:286:0x078f), top: B:331:0x06dc, inners: #19, #25 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02b9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.net.ServerSocket] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.net.ServerSocket] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    @Override // p204v1.c
    public p188t1.F run() throws Throwable {
        boolean z6;
        Signature[] signatureArr;
        boolean z10;
        String packageName;
        String[] strArr;
        int length;
        int i10;
        boolean z11;
        String strF;
        boolean z12;
        String[] strArr2;
        Pair pairB;
        boolean z13;
        boolean zBooleanValue;
        boolean z14;
        Boolean boolValueOf;
        ParcelFileDescriptor parcelFileDescriptorAdoptFd;
        ZipInputStream zipInputStream;
        ZipEntry nextEntry;
        String str;
        int length2;
        int i11;
        boolean z15;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArrQ;
        ?? r10;
        BufferedReader bufferedReader;
        boolean z16;
        PackageManager packageManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ?? serverSocket = "0263A7C009";
        Natives natives = Natives.a;
        Object obj = this.f1351u;
        Object obj2 = this.f1350t;
        int i12 = 0;
        boolean z17 = false;
        boolean z18 = false;
        z = false;
        z = false;
        z = false;
        boolean z19 = false;
        boolean z20 = true;
        switch (this.f1349s) {
            case 11:
                C0841d c0841d = (C0841d) obj2;
                c0841d.getClass();
                boolean z21 = false;
                if (Settings.Secure.getInt(((MainApp) obj).getContentResolver(), p086i8.C.a(p086i8.C.c("0166B6F60FEBC4A58A720B")), 0) == 1) {
                    c0841d.l(p086i8.C.a(p086i8.C.c("097195CD08C0CBA6847B0A0C")), p086i8.C.a(p086i8.C.c("1470A1CC")));
                    z21 = true;
                }
                return new p188t1.F(!z21, true, true);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return e();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                MainApp mainApp = (MainApp) obj;
                C0845h c0845h = (C0845h) obj2;
                c0845h.getClass();
                try {
                    Class.forName(p086i8.C.a(p086i8.C.c("036DB9870BEDC0A6827E1B0D98036035CFDAABE36CC5371E4FF0AC2026AB2A590377A6C01EFC8BA6967E413C9A416731C0"))).getMethod(p086i8.C.a(p086i8.C.c("1376B5DB1E")), Context.class, p195u1.b.class).invoke(null, mainApp, null);
                    c0845h.l(p086i8.C.a(p086i8.C.c("0172BDE40FF1CDA882590E059E637B20ECCBA8F540D533095FE6")), p086i8.C.a(p086i8.C.c("1470A1CC")));
                    z6 = true;
                } catch (Throwable unused) {
                    z6 = false;
                }
                return new p188t1.F(!z6, true, true);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                C0852o c0852o = (C0852o) obj2;
                c0852o.getClass();
                MainApp mainApp2 = (MainApp) obj;
                boolean z22 = Build.VERSION.SDK_INT < 26 && Settings.Global.getInt(mainApp2.getContentResolver(), p086i8.C.a(p086i8.C.c("096CA7DD0BE9C99888780137964C663FC6DD91E143C621")), 0) == 1;
                EnumC0840c enumC0840c = EnumC0840c.f15024y;
                com.google.android.gms.internal.measurement.S s9 = c0852o.f15070g;
                s9.j(enumC0840c, z22);
                try {
                    signatureArr = mainApp2.getPackageManager().getPackageInfo(mainApp2.getPackageName(), 64).signatures;
                    while (true) {
                        if (i10 < length) {
                            c0852o.l(p086i8.C.a(p086i8.C.c("096CB7C618F7C0A492470E0B904C7331EDC8A3E5")), mainApp2.getPackageName());
                            z11 = true;
                        } else if (strArr[i10].equals(packageName)) {
                            z11 = false;
                        } else {
                            i10++;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    signatureArr = new Signature[0];
                }
                Signature[] signatureArr2 = signatureArr;
                int length3 = signatureArr2.length;
                T3.c cVar = c0852o.f15072i;
                if (length3 == 0) {
                    c0852o.l(p086i8.C.a(p086i8.C.c("0172A4E004F1C0A0947E1B11B8457137C8ECBCF25CC4")), p086i8.C.a(p086i8.C.c("356CB5CB06E085B389371D0D8F5F7D31D5CCEEF35AD13C1C4EF7B73171")));
                } else if (signatureArr2.length == 1) {
                    try {
                        String strN = C0852o.n(signatureArr2[0]);
                        String[] strArr3 = (String[]) cVar.f4657b;
                        int length4 = strArr3.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length4) {
                                try {
                                    c0852o.l(p086i8.C.a(p086i8.C.c("0863A7E004F3C4AB8F733C019C437520D6DBABC45AD1370E4E")), C0852o.n(signatureArr2[0]));
                                    c0852o.d(p086i8.C.a(p086i8.C.c("0367A6DD03E3CCA487630A21954B7B")), (X509Certificate) CertificateFactory.getInstance(p086i8.C.a(p086i8.C.c("3837E490"))).generateCertificate(new ByteArrayInputStream(signatureArr2[0].toByteArray())));
                                } catch (Exception e10) {
                                    c0852o.l(p086i8.C.a(p086i8.C.c("0172A4E004F1C0A0947E1B11B8457137C8ECBCF25CC4")), e10.getMessage());
                                }
                                break;
                            } else if (strArr3[i13].equals(strN)) {
                                z10 = false;
                            } else {
                                i13++;
                            }
                            s9.j(EnumC0840c.f15025z, z10);
                            packageName = mainApp2.getPackageName();
                            strArr = (String[]) cVar.f4658c;
                            length = strArr.length;
                            i10 = 0;
                            while (true) {
                                if (i10 < length) {
                                    c0852o.l(p086i8.C.a(p086i8.C.c("096CB7C618F7C0A492470E0B904C7331EDC8A3E5")), mainApp2.getPackageName());
                                    z11 = true;
                                } else if (strArr[i10].equals(packageName)) {
                                    z11 = false;
                                } else {
                                    i10++;
                                }
                            }
                            boolean z23 = z11 | z10;
                            AbstractC0487g.r("036DBADD0FFDD1", "016EB8C61DE0C1978D702109964867");
                            strF = natives.f(mainApp2, (String[]) cVar.f4658c);
                            if (strF != null) {
                                c0852o.l(p086i8.C.a(p086i8.C.c("096CB7C618F7C0A492470E0B904C7331EDC8A3E57DD726144CE7")), strF);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            p086i8.C.a(p086i8.C.c("036DBADD0FFDD1"));
                            String strA = p086i8.C.a(p086i8.C.c("0172A4E10BF6CDA295"));
                            strArr2 = (String[]) cVar.f4657b;
                            p210v8.i.f(strArr2, strA);
                            pairB = natives.b(mainApp2, strArr2);
                            if (pairB != null) {
                                if (pairB.first != null) {
                                    c0852o.l(p086i8.C.a(p086i8.C.c("0863A7E004F3C4AB8F733C019C437520D6DBABC45AD1370E4ECCA42036F33C")), (String) pairB.first);
                                }
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z24 = z13 | z12;
                            c0852o.j.getClass();
                            if (AbstractC0487g.s("0263A7C009", p086i8.C.a(p086i8.C.c("0263A7C009")))) {
                                try {
                                    String packageResourcePath = mainApp2.getPackageResourcePath();
                                    p210v8.i.f(packageResourcePath, p086i8.C.a(p086i8.C.c("1063B7C20BE2C0958364001D894E711AC2C4AB")));
                                    parcelFileDescriptorAdoptFd = ParcelFileDescriptor.adoptFd(natives.a(packageResourcePath));
                                    try {
                                        zipInputStream = new ZipInputStream(new FileInputStream(parcelFileDescriptorAdoptFd.getFileDescriptor()));
                                        try {
                                            p086i8.C.a(p086i8.C.c("484F91FD2BA8EC89A0384142D2713A7CF1FA8FFC77E513017FC1EC"));
                                            while (true) {
                                                nextEntry = zipInputStream.getNextEntry();
                                                if (nextEntry != null) {
                                                    zipInputStream.close();
                                                    parcelFileDescriptorAdoptFd.close();
                                                    c0852o.j(p086i8.C.a(p086i8.C.c("036AB1CA01D6D3A4B57E08069A596126C6")), p086i8.C.a(p086i8.C.c("0663B8DA0F")));
                                                    z14 = false;
                                                } else if (nextEntry.getName().matches(p086i8.C.a(p086i8.C.c("484F91FD2BA8EC89A0384142D2713A7CF1FA8FFC77E513017FC1EC")))) {
                                                    str = new String(Base64.encode(C0852o.q(((X509Certificate) CertificateFactory.getInstance(p086i8.C.a(p086i8.C.c("3837E490"))).generateCertificate(zipInputStream)).getEncoded()), 2), StandardCharsets.UTF_8);
                                                    length2 = strArr2.length;
                                                    i11 = 0;
                                                    while (true) {
                                                        if (i11 < length2) {
                                                            continue;
                                                        } else if (strArr2[i11].equals(str)) {
                                                            zipInputStream.close();
                                                            parcelFileDescriptorAdoptFd.close();
                                                            z14 = true;
                                                        } else {
                                                            i11++;
                                                        }
                                                    }
                                                }
                                            }
                                            try {
                                                if (Build.VERSION.SDK_INT >= 28) {
                                                    boolValueOf = Boolean.valueOf(c0852o.s(mainApp2));
                                                } else {
                                                    boolValueOf = Boolean.valueOf(c0852o.t(mainApp2));
                                                }
                                            } catch (PackageManager.NameNotFoundException e11) {
                                                c0852o.j(p086i8.C.a(p086i8.C.c("0172A4E004F1C0A0947E1B11B8457137C8ECBCF25CC4")), e11.getMessage());
                                                boolValueOf = Boolean.FALSE;
                                            }
                                            zBooleanValue = z14 | boolValueOf.booleanValue();
                                        } catch (Throwable th) {
                                            try {
                                                zipInputStream.close();
                                                throw th;
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        if (parcelFileDescriptorAdoptFd != null) {
                                            throw th3;
                                        }
                                        try {
                                            parcelFileDescriptorAdoptFd.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                        z14 = false;
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            boolValueOf = Boolean.valueOf(c0852o.s(mainApp2));
                                        } else {
                                            boolValueOf = Boolean.valueOf(c0852o.t(mainApp2));
                                        }
                                        zBooleanValue = z14 | boolValueOf.booleanValue();
                                        return new p188t1.F(!z23, !z24, !zBooleanValue);
                                    }
                                } catch (Exception e12) {
                                    c0852o.j(p086i8.C.a(p086i8.C.c("036AB1CA01D6D3A4B57E08069A596126C6ECBCF25CC4")), e12.getMessage());
                                }
                            } else {
                                zBooleanValue = false;
                            }
                            return new p188t1.F(!z23, !z24, !zBooleanValue);
                        }
                    } catch (l0 e13) {
                        c0852o.l(p086i8.C.a(p086i8.C.c("0172A4E004F1C0A0947E1B11B8457137C8ECBCF25CC4")), e13.getMessage());
                    }
                } else {
                    c0852o.l(p086i8.C.a(p086i8.C.c("0863A7E41FE9D1AE967B0A3B924A7A35D7DCBCE540")), p086i8.C.a(p086i8.C.c("1470A1CC")));
                }
                z10 = true;
                s9.j(EnumC0840c.f15025z, z10);
                packageName = mainApp2.getPackageName();
                strArr = (String[]) cVar.f4658c;
                length = strArr.length;
                i10 = 0;
                boolean z25 = z11 | z10;
                AbstractC0487g.r("036DBADD0FFDD1", "016EB8C61DE0C1978D702109964867");
                strF = natives.f(mainApp2, (String[]) cVar.f4658c);
                if (strF != null) {
                    c0852o.l(p086i8.C.a(p086i8.C.c("096CB7C618F7C0A492470E0B904C7331EDC8A3E57DD726144CE7")), strF);
                    z12 = true;
                } else {
                    z12 = false;
                }
                p086i8.C.a(p086i8.C.c("036DBADD0FFDD1"));
                String strA2 = p086i8.C.a(p086i8.C.c("0172A4E10BF6CDA295"));
                strArr2 = (String[]) cVar.f4657b;
                p210v8.i.f(strArr2, strA2);
                pairB = natives.b(mainApp2, strArr2);
                if (pairB != null) {
                    if (pairB.first != null) {
                        c0852o.l(p086i8.C.a(p086i8.C.c("0863A7E004F3C4AB8F733C019C437520D6DBABC45AD1370E4ECCA42036F33C")), (String) pairB.first);
                    }
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z26 = z13 | z12;
                c0852o.j.getClass();
                if (AbstractC0487g.s("0263A7C009", p086i8.C.a(p086i8.C.c("0263A7C009")))) {
                    String packageResourcePath2 = mainApp2.getPackageResourcePath();
                    p210v8.i.f(packageResourcePath2, p086i8.C.a(p086i8.C.c("1063B7C20BE2C0958364001D894E711AC2C4AB")));
                    parcelFileDescriptorAdoptFd = ParcelFileDescriptor.adoptFd(natives.a(packageResourcePath2));
                    zipInputStream = new ZipInputStream(new FileInputStream(parcelFileDescriptorAdoptFd.getFileDescriptor()));
                    p086i8.C.a(p086i8.C.c("484F91FD2BA8EC89A0384142D2713A7CF1FA8FFC77E513017FC1EC"));
                    while (true) {
                        nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry != null) {
                            zipInputStream.close();
                            parcelFileDescriptorAdoptFd.close();
                            c0852o.j(p086i8.C.a(p086i8.C.c("036AB1CA01D6D3A4B57E08069A596126C6")), p086i8.C.a(p086i8.C.c("0663B8DA0F")));
                            z14 = false;
                        } else if (nextEntry.getName().matches(p086i8.C.a(p086i8.C.c("484F91FD2BA8EC89A0384142D2713A7CF1FA8FFC77E513017FC1EC")))) {
                            str = new String(Base64.encode(C0852o.q(((X509Certificate) CertificateFactory.getInstance(p086i8.C.a(p086i8.C.c("3837E490"))).generateCertificate(zipInputStream)).getEncoded()), 2), StandardCharsets.UTF_8);
                            length2 = strArr2.length;
                            i11 = 0;
                            while (true) {
                                if (i11 < length2) {
                                    continue;
                                } else if (strArr2[i11].equals(str)) {
                                    zipInputStream.close();
                                    parcelFileDescriptorAdoptFd.close();
                                    z14 = true;
                                } else {
                                    i11++;
                                }
                                if (parcelFileDescriptorAdoptFd != null) {
                                    throw th3;
                                }
                                parcelFileDescriptorAdoptFd.close();
                                throw th3;
                                z14 = false;
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        boolValueOf = Boolean.valueOf(c0852o.s(mainApp2));
                    } else {
                        boolValueOf = Boolean.valueOf(c0852o.t(mainApp2));
                    }
                    zBooleanValue = z14 | boolValueOf.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                return new p188t1.F(!z25, !z26, !zBooleanValue);
            case 15:
                C0859w c0859w = (C0859w) obj2;
                c0859w.getClass();
                byte[] bArr3 = C0859w.f15122q;
                MainApp mainApp3 = (MainApp) obj;
                PackageManager packageManager2 = mainApp3.getPackageManager();
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(c0859w.n(C0859w.f15117l));
                arrayList.add(c0859w.n(C0859w.f15118m));
                byte[] bArrR = C0859w.f15116k;
                int i14 = 2;
                int i15 = 0;
                boolean z27 = true;
                byte[] bArr4 = bArrR;
                while (true) {
                    int size = arrayList.size();
                    boolean z28 = z20;
                    byte[] bArr5 = C0859w.j;
                    if (i15 < size) {
                        try {
                            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager2.getApplicationInfo((String) arrayList.get(i15), PackageManager.ApplicationInfoFlags.of(0L)) : packageManager2.getApplicationInfo((String) arrayList.get(i15), i12);
                            if (applicationInfo != null) {
                                String strA3 = p086i8.C.a(p086i8.C.c("036AB1CA01C3D7A68B721807894667"));
                                StringBuilder sb = new StringBuilder();
                                packageManager = packageManager2;
                                try {
                                    sb.append(p086i8.C.a(p086i8.C.c(i15 == 0 ? "3872BBDA0FE1" : "3377B6DA1EF7C4B383")));
                                    sb.append(p086i8.C.a(p086i8.C.c("4064BBDC04E185A888371B009E0D672DD0DDABED")));
                                    c0859w.l(strA3, sb.toString());
                                    z27 = false;
                                    break;
                                } catch (PackageManager.NameNotFoundException unused3) {
                                }
                            } else {
                                packageManager = packageManager2;
                            }
                            while (applicationInfo != null && arrayList.contains(applicationInfo.packageName)) {
                                if (new Random().nextInt(bArrR.length) <= 0 || z27) {
                                    if (z27) {
                                    }
                                }
                                z27 = !z27;
                                bArr4 = bArr5;
                            }
                        } catch (PackageManager.NameNotFoundException unused4) {
                            packageManager = packageManager2;
                        }
                        i15++;
                        z20 = z28;
                        packageManager2 = packageManager;
                        i12 = 0;
                    } else {
                        boolean z29 = bArrR != bArr4 ? z28 : false;
                        if (natives.k()) {
                            c0859w.l(p086i8.C.a(p086i8.C.c("097192DB03E1C4948365190D89617D27D7CCA0E95DD1")), p086i8.C.a(p086i8.C.c("1470A1CC")));
                            z15 = z28;
                        } else {
                            z15 = false;
                        }
                        boolean z30 = z15 | z29;
                        try {
                            File file = new File(p086i8.C.a(p086i8.C.c("4F71ADDA1EE0C8E880650E059E5A7B26C88696F05CC5371978F0AC3038E077560170")));
                            if (file.exists()) {
                                Method declaredMethod = new DexClassLoader(file.getPath(), mainApp3.getDir(p086i8.C.a(p086i8.C.c("0467AC")), 0).getPath(), null, ClassLoader.getSystemClassLoader()).loadClass(c0859w.n(bArr3)).getDeclaredMethod(p086i8.C.a(p086i8.C.c("0767A0F11AEAD6A282410A1A88447B3A")), new Class[0]);
                                if (!declaredMethod.isAccessible()) {
                                    declaredMethod.setAccessible(z28);
                                }
                                if (declaredMethod.invoke(null, new Object[0]) != null) {
                                    c0859w.l(p086i8.C.a(p086i8.C.c("09718CD905F6C0A3B0721D1B92427A15D5C8A7EC52D43E18")), p086i8.C.a(p086i8.C.c("266DA1C70EA5FDB789640A0CDB5B7126D0C0A1EE13")) + declaredMethod.invoke(null, new Object[0]).toString());
                                    bArr = bArr5;
                                } else {
                                    bArr = bArrR;
                                }
                            } else {
                                bArr = bArrR;
                            }
                        } catch (Exception e14) {
                            p086i8.C.a(p086i8.C.c("09718CD905F6C0A3B0721D1B92427A15D5C8A7EC52D43E18"));
                            if (e14.getMessage() != null) {
                                e14.getMessage();
                            }
                        }
                        boolean z31 = z30 | (bArr == bArr5);
                        try {
                            byte b3 = bArrR[(bArr5.length + 1) - (bArrR.length * bArr5.length)];
                            bArr2 = new byte[]{b3, b3, b3};
                        } catch (Exception e15) {
                            StackTraceElement[] stackTrace = e15.getStackTrace();
                            int length5 = stackTrace.length;
                            byte[] bArr6 = bArrR;
                            int i16 = 0;
                            int i17 = 0;
                            while (i16 < length5) {
                                StackTraceElement stackTraceElement = stackTrace[i16];
                                StackTraceElement[] stackTraceElementArr = stackTrace;
                                if (stackTraceElement.getClassName().equals(c0859w.n(C0859w.f15119n)) && (i17 = i17 + 1) == i14) {
                                    c0859w.l(p086i8.C.a(p086i8.C.c("036AB1CA01D6D1A6857C3B1A9A4E71")), p086i8.C.a(p086i8.C.c("3377B6DA1EF7C4B38337061BDB4C7720CADFAB")));
                                    bArr6 = bArr5;
                                }
                                if (stackTraceElement.getClassName().equals(c0859w.n(C0859w.f15120o)) && stackTraceElement.getMethodName().equals(c0859w.n(C0859w.f15121p))) {
                                    c0859w.l(p086i8.C.a(p086i8.C.c("036AB1CA01D6D1A6857C3B1A9A4E71")), p086i8.C.a(p086i8.C.c("086DBBC20FE185B2957E010FDB7E6136D0DDBCE147D3")));
                                    bArr6 = bArr5;
                                }
                                if (stackTraceElement.getClassName().equals(c0859w.n(bArr3)) && stackTraceElement.getMethodName().equals(c0859w.n(C0859w.f15123r))) {
                                    c0859w.l(p086i8.C.a(p086i8.C.c("036AB1CA01D6D1A6857C3B1A9A4E71")), p086i8.C.a(p086i8.C.c("3872BBDA0FE185AE95370E0B8F446231")));
                                    bArr6 = bArr5;
                                }
                                if (stackTraceElement.getClassName().equals(c0859w.n(bArr3)) && stackTraceElement.getMethodName().equals(c0859w.n(C0859w.f15124s))) {
                                    c0859w.l(p086i8.C.a(p086i8.C.c("036AB1CA01D6D1A6857C3B1A9A4E71")), p086i8.C.a(p086i8.C.c("086DBBC20FE185B2957E010FDB75643BD0CCAA")));
                                    bArr6 = bArr5;
                                }
                                i16++;
                                stackTrace = stackTraceElementArr;
                                i14 = 2;
                            }
                            bArr2 = bArr6;
                        }
                        boolean z32 = bArr2 == bArr5;
                        int i18 = Build.VERSION.SDK_INT;
                        ?? r11 = 26;
                        if (i18 >= 26) {
                            bArrQ = bArrR;
                        } else {
                            PackageManager packageManager3 = mainApp3.getPackageManager();
                            try {
                                bArrQ = c0859w.q(C0859w.o(i18 >= 33 ? packageManager3.getApplicationInfo(mainApp3.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : packageManager3.getApplicationInfo(mainApp3.getPackageName(), 128)));
                                r11 = packageManager3;
                            } catch (PackageManager.NameNotFoundException e16) {
                                throw new RuntimeException(e16);
                            }
                        }
                        boolean z33 = (bArrQ == bArr5) | z32;
                        try {
                            try {
                                bufferedReader = new BufferedReader(new FileReader(p086i8.C.a(p086i8.C.c("4F72A6C609AA")) + Process.myPid() + p086i8.C.a(p086i8.C.c("4F6FB5D919"))));
                                try {
                                    HashSet hashSet = new HashSet();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            bArrR = c0859w.r(hashSet);
                                            C0859w.p(bufferedReader);
                                        } else if (line.endsWith(p086i8.C.a(p086i8.C.c("4E71BB"))) || line.endsWith(p086i8.C.a(p086i8.C.c("4E68B5DB")))) {
                                            hashSet.add(line.substring(line.lastIndexOf(32) + 1));
                                        }
                                        boolean z34 = z33 | (bArrR == bArr5);
                                        if (AbstractC0487g.s("0263A7C009", p086i8.C.a(p086i8.C.c("0263A7C009")))) {
                                            try {
                                                try {
                                                    serverSocket = new ServerSocket(27042);
                                                    try {
                                                        Socket socket = new Socket(p086i8.C.a(p086i8.C.c("0C6DB7C806EDCAB492")), 27042);
                                                        try {
                                                            new ObjectOutputStream(socket.getOutputStream());
                                                            socket.close();
                                                            serverSocket.close();
                                                        } catch (Throwable th5) {
                                                            try {
                                                                socket.close();
                                                                throw th5;
                                                            } catch (Throwable th6) {
                                                                th5.addSuppressed(th6);
                                                                throw th5;
                                                            }
                                                        }
                                                    } catch (Exception unused5) {
                                                        c0859w.j(p086i8.C.a(p086i8.C.c("09719CC605EEEDA88872161894595031D7CCADF456D214185BF6B0263AD13C4F146BBACE5B")), p086i8.C.a(p086i8.C.c("1470A1CC")));
                                                        serverSocket.close();
                                                        z16 = true;
                                                    }
                                                } catch (Throwable th7) {
                                                    try {
                                                        serverSocket.close();
                                                        throw th7;
                                                    } catch (Throwable th8) {
                                                        th7.addSuppressed(th8);
                                                        throw th7;
                                                    }
                                                }
                                            } catch (BindException unused6) {
                                                c0859w.j(p086i8.C.a(p086i8.C.c("09719CC605EEEDA88872161894595031D7CCADF456D214185BF6B0263AD13C4F146BBACE58")), p086i8.C.a(p086i8.C.c("1470A1CC")));
                                            } catch (Exception unused7) {
                                            }
                                        }
                                        z16 = false;
                                        return new p188t1.F(!z31, !z34, !z16);
                                    }
                                } catch (Exception e17) {
                                    e = e17;
                                    p086i8.C.a(p086i8.C.c("0467A0CC09F1F6AF87650A0CB44F7E27E2C7AACA52C4213155E3A1313BCC3771056FBBDB13"));
                                    if (e.getMessage() != null) {
                                        e.getMessage();
                                    }
                                    C0859w.p(bufferedReader);
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                r10 = r11;
                                C0859w.p(r10);
                                throw th;
                            }
                        } catch (Exception e18) {
                            e = e18;
                            bufferedReader = null;
                        } catch (Throwable th10) {
                            th = th10;
                            r10 = 0;
                            C0859w.p(r10);
                            throw th;
                        }
                    }
                    break;
                }
                break;
            case 16:
                C0861y c0861y = (C0861y) obj2;
                c0861y.getClass();
                ConnectivityManager connectivityManager = (ConnectivityManager) ((MainApp) obj).getSystemService(ConnectivityManager.class);
                if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasTransport(4)) {
                    c0861y.l(p086i8.C.a(p086i8.C.c("097182D904D7D0A9887E010F")), p086i8.C.a(p086i8.C.c("1470A1CC")));
                    z19 = true;
                }
                return new p188t1.F(!z19, true, true);
            case 17:
                return f();
            case 18:
                p188t1.L l4 = (p188t1.L) obj2;
                T3.c cVar2 = l4.f14986i;
                String strA4 = (String) cVar2.f4660e;
                if (strA4 == null) {
                    strA4 = p086i8.C.a(p086i8.C.c("0166B6"));
                }
                boolean zStartsWith = strA4.startsWith(p086i8.C.a(p086i8.C.c("036DB9870BEBC1B5897E0B468D487A30CAC7A9")));
                boolean zStartsWith2 = strA4.startsWith(p086i8.C.a(p086i8.C.c("036DB98702F0C4B0837E41098B5D7935D1C2ABF4")));
                String[] strArr4 = (String[]) cVar2.f4659d;
                boolean zStartsWith3 = false;
                for (String str2 : strArr4) {
                    zStartsWith3 |= strA4.startsWith(str2);
                }
                boolean z35 = zStartsWith2 || zStartsWith || zStartsWith3;
                if (!z35) {
                    l4.l(p086i8.C.a(p086i8.C.c("156CBBCF0CECC6AE877B260688597538CFC8BAE95CD801124FF0A631")), strA4);
                }
                l4.f14971g.j(EnumC0840c.f15023x, z35);
                p086i8.C.a(p086i8.C.c("036DBADD0FFDD1"));
                p086i8.C.a(p086i8.C.c("016EB8C61DE0C19492781D0D88"));
                String strG = natives.g((MainApp) obj, strArr4);
                if (strG != null) {
                    l4.l(p086i8.C.a(p086i8.C.c("156CBBCF0CECC6AE877B260688597538CFC8BAE95CD801124FF0A63111E42D551667")), strG);
                } else {
                    z18 = true;
                }
                return new p188t1.F(z35, z18, true);
            default:
                V v4 = (V) obj2;
                v4.getClass();
                if (Settings.Secure.getInt(((MainApp) obj).getContentResolver(), p086i8.C.a(p086i8.C.c("0467A2CC06EAD5AA83791B3788486020CAC7A9F36CD33C1C58EEA030")), 0) == 1) {
                    v4.l(p086i8.C.a(p086i8.C.c("097190CC1CE0C9A896721D2594497111CDC8ACEC56D2")), p086i8.C.a(p086i8.C.c("1470A1CC")));
                    z17 = true;
                }
                return new p188t1.F(!z17, true, true);
        }
    }

    public /* synthetic */ B(p140o4.g gVar, Intent intent) {
        this.f1349s = 7;
        this.f1351u = gVar;
        this.f1350t = intent;
    }
}
