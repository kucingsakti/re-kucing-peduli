package O3;

import Q3.C;
import Q3.C0367a0;
import Q3.C0383i0;
import Q3.C0387k0;
import Q3.C0389l0;
import Q3.C0391m0;
import Q3.C0393n0;
import Q3.C0395o0;
import Q3.D;
import Q3.E;
import Q3.I;
import Q3.J;
import Q3.K;
import Q3.M;
import Q3.O;
import Q3.O0;
import Q3.P;
import Q3.Q;
import Q3.V;
import U.z0;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import p188t1.G;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f3542r = new h(1);
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fa.e f3543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1.e f3544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T3.c f3545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o1.h f3546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f3547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T3.c f3548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0343a f3549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final P3.e f3550i;
    public final L3.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final K3.a f3551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f3552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final G f3553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t f3554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TaskCompletionSource f3555o = new TaskCompletionSource();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f3556p = new TaskCompletionSource();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f3557q = new TaskCompletionSource();

    public o(Context context, o1.h hVar, x xVar, Fa.e eVar, T3.c cVar, o1.e eVar2, C0343a c0343a, T3.c cVar2, P3.e eVar3, G g8, L3.b bVar, K3.a aVar, k kVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.f3546e = hVar;
        this.f3547f = xVar;
        this.f3543b = eVar;
        this.f3548g = cVar;
        this.f3544c = eVar2;
        this.f3549h = c0343a;
        this.f3545d = cVar2;
        this.f3550i = eVar3;
        this.j = bVar;
        this.f3551k = aVar;
        this.f3552l = kVar;
        this.f3553m = g8;
    }

    public static void a(o oVar, String str, Boolean bool) {
        char c10;
        int i10;
        Integer num;
        oVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Log.isLoggable("FirebaseCrashlytics", 3);
        Locale locale = Locale.US;
        x xVar = oVar.f3547f;
        C0343a c0343a = oVar.f3549h;
        String str2 = xVar.f3592c;
        String str3 = (String) c0343a.f3513e;
        String str4 = xVar.c().a;
        if (((String) c0343a.f3511c) != null) {
            i10 = 4;
            c10 = 4;
        } else {
            c10 = 4;
            i10 = 1;
        }
        C0391m0 c0391m0 = new C0391m0(str2, str3, (String) c0343a.f3514f, str4, E0.a.b(i10), (o1.c) c0343a.f3516h);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        C0395o0 c0395o0 = new C0395o0(g.h());
        Context context = oVar.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        f fVar = f.f3524s;
        String str7 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str7);
        f fVar2 = f.f3524s;
        if (zIsEmpty) {
            Log.isLoggable("FirebaseCrashlytics", 2);
        } else {
            f fVar3 = (f) f.f3525t.get(str7.toLowerCase(locale));
            if (fVar3 != null) {
                fVar2 = fVar3;
            }
        }
        int iOrdinal = fVar2.ordinal();
        String str8 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = g.b(context);
        boolean zG = g.g();
        int iD = g.d();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        C0393n0 c0393n0 = new C0393n0(iOrdinal, iAvailableProcessors, jB, blockCount, zG, iD);
        L3.b bVar = oVar.j;
        C0389l0 c0389l0 = new C0389l0(c0391m0, c0395o0, c0393n0);
        bVar.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        bVar.a.a(new L3.a(str, jCurrentTimeMillis, c0389l0));
        if (!bool.booleanValue() || str == null) {
            str10 = str10;
        } else {
            T3.c cVar = oVar.f3545d;
            synchronized (((String) cVar.a)) {
                try {
                    cVar.a = str;
                    Map mapA = ((P3.d) ((AtomicMarkableReference) ((K0.g) cVar.f4659d).f2526c).getReference()).a();
                    List listA = ((P3.n) cVar.f4661f).a();
                    if (((String) ((AtomicMarkableReference) cVar.f4662g).getReference()) != null) {
                        ((P3.g) cVar.f4657b).i(str, (String) ((AtomicMarkableReference) cVar.f4662g).getReference());
                    }
                    if (!mapA.isEmpty()) {
                        ((P3.g) cVar.f4657b).g(str, mapA, false);
                    }
                    if (!listA.isEmpty()) {
                        ((P3.g) cVar.f4657b).h(str, listA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        P3.e eVar = oVar.f3550i;
        ((P3.c) eVar.f3876t).a();
        eVar.f3876t = P3.e.f3874u;
        if (str != null) {
            eVar.f3876t = new P3.l(((T3.c) eVar.f3875s).b(str, "userlog"));
        }
        oVar.f3552l.b(str);
        G g8 = oVar.f3553m;
        s sVar = (s) g8.f14978s;
        Charset charset = O0.a;
        Q3.A a = new Q3.A();
        a.a = "19.0.3";
        C0343a c0343a2 = sVar.f3577c;
        String str11 = (String) c0343a2.a;
        if (str11 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        a.f4032b = str11;
        x xVar2 = sVar.f3576b;
        String str12 = xVar2.c().a;
        if (str12 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        a.f4034d = str12;
        a.f4035e = xVar2.c().f3519b;
        a.f4036f = xVar2.c().f3520c;
        String str13 = (String) c0343a2.f3513e;
        if (str13 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        a.f4038h = str13;
        String str14 = (String) c0343a2.f3514f;
        if (str14 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        a.f4039i = str14;
        a.f4033c = 4;
        a.f4042m = (byte) (a.f4042m | 1);
        I i11 = new I();
        i11.f4079f = false;
        byte b3 = (byte) (i11.f4085m | 2);
        i11.f4077d = jCurrentTimeMillis;
        i11.f4085m = (byte) (b3 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        i11.f4075b = str;
        String str15 = s.f3575g;
        if (str15 == null) {
            throw new NullPointerException("Null generator");
        }
        i11.a = str15;
        String str16 = xVar2.f3592c;
        if (str16 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str17 = xVar2.c().a;
        o1.c cVar2 = (o1.c) c0343a2.f3516h;
        if (((S) cVar2.f13624u) == null) {
            cVar2.f13624u = new S(cVar2);
        }
        S s9 = (S) cVar2.f13624u;
        String str18 = (String) s9.f8359t;
        if (s9 == null) {
            cVar2.f13624u = new S(cVar2);
        }
        i11.f4080g = new K(str16, str13, str14, str17, str18, (String) ((S) cVar2.f13624u).f8360u);
        C0383i0 c0383i0 = new C0383i0();
        c0383i0.a = 3;
        c0383i0.f4230e = (byte) (c0383i0.f4230e | 1);
        if (str5 == null) {
            throw new NullPointerException("Null version");
        }
        c0383i0.f4227b = str5;
        if (str6 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c0383i0.f4228c = str6;
        c0383i0.f4229d = g.h();
        c0383i0.f4230e = (byte) (c0383i0.f4230e | 2);
        i11.f4082i = c0383i0.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) s.f3574f.get(str7.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jB2 = g.b(sVar.a);
        long blockSize = ((long) statFs2.getBlockSize()) * ((long) statFs2.getBlockCount());
        boolean zG2 = g.g();
        int iD2 = g.d();
        M m2 = new M();
        m2.a = iIntValue;
        byte b7 = (byte) (m2.j | 1);
        m2.j = b7;
        if (str8 == null) {
            throw new NullPointerException("Null model");
        }
        m2.f4101b = str8;
        m2.f4102c = iAvailableProcessors2;
        m2.f4103d = jB2;
        m2.f4104e = blockSize;
        m2.f4105f = zG2;
        m2.f4106g = iD2;
        m2.j = (byte) (((byte) (((byte) (((byte) (((byte) (b7 | 2)) | 4)) | 8)) | 16)) | 32);
        if (str9 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        m2.f4107h = str9;
        if (str10 == null) {
            throw new NullPointerException("Null modelClass");
        }
        m2.f4108i = str10;
        i11.j = m2.a();
        i11.f4084l = 3;
        i11.f4085m = (byte) (i11.f4085m | 4);
        a.j = i11.a();
        Q3.B bA = a.a();
        T3.c cVar3 = ((T3.a) g8.f14979t).f4654b;
        J j = bA.f4051k;
        if (j == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return;
        }
        String str19 = j.f4086b;
        try {
            T3.a.f4651g.getClass();
            T3.a.f(cVar3.b(str19, "report"), R3.a.a.s(bA));
            File fileB = cVar3.b(str19, "start-time");
            long j10 = j.f4088d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), T3.a.f4649e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(j10 * 1000);
                outputStreamWriter.close();
            } catch (Throwable th2) {
                try {
                    outputStreamWriter.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    public static P2.f b(o oVar) {
        P2.f fVarC;
        oVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : T3.c.e(((File) oVar.f3548g.f4658c).listFiles(f3542r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    fVarC = Tasks.e(null);
                } catch (ClassNotFoundException unused) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    fVarC = Tasks.c(new ScheduledThreadPoolExecutor(1), new n(oVar, j));
                }
                arrayList.add(fVarC);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.f(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:14:0x0038 A[LOOP:0: B:12:0x0030->B:14:0x0038, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x003c A[SYNTHETIC] */
    public static String e() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i10;
        ClassLoader classLoader = o.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
            if (resourceAsStream == null) {
                Log.i("FirebaseCrashlytics", "No version control information found", null);
            }
            if (resourceAsStream == null) {
                return null;
            }
            Log.isLoggable("FirebaseCrashlytics", 3);
            byteArrayOutputStream = new ByteArrayOutputStream();
            bArr = new byte[1024];
            while (true) {
                i10 = resourceAsStream.read(bArr);
                if (i10 != -1) {
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        }
        resourceAsStream = null;
        if (resourceAsStream == null) {
            return null;
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        byteArrayOutputStream = new ByteArrayOutputStream();
        bArr = new byte[1024];
        while (true) {
            i10 = resourceAsStream.read(bArr);
            if (i10 != -1) {
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:181:0x0558  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r31v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.app.ApplicationExitInfo] */
    /* JADX WARN: Type inference failed for: r9v18, types: [android.app.ApplicationExitInfo] */
    /* JADX WARN: Type inference failed for: r9v19 */
    public final void c(boolean z6, V3.b bVar) {
        ArrayList arrayList;
        int i10;
        int i11;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        String[] list;
        boolean z12;
        List listB;
        ?? E2;
        int i12;
        String string;
        int i13;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        ArrayList arrayList2 = new ArrayList(((T3.a) this.f3553m.f14979t).c());
        int i14 = 2;
        if (arrayList2.size() <= z6) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        String str3 = (String) arrayList2.get(z6 == true ? 1 : 0);
        FileInputStream fileInputStream2 = null;
        if (!bVar.g().f5167b.f124b || Build.VERSION.SDK_INT < 30) {
            arrayList = arrayList2;
            i10 = 2;
            i11 = 4;
            Log.isLoggable("FirebaseCrashlytics", 2);
        } else {
            List historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                T3.c cVar = this.f3548g;
                P3.e eVar = new P3.e(cVar);
                eVar.f3876t = P3.e.f3874u;
                if (str3 != null) {
                    eVar.f3876t = new P3.l(cVar.b(str3, "userlog"));
                }
                T3.c cVar2 = this.f3548g;
                o1.h hVar = this.f3546e;
                P3.g gVar = new P3.g(cVar2);
                i11 = 4;
                T3.c cVar3 = new T3.c(str3, cVar2, hVar);
                ((P3.d) ((AtomicMarkableReference) ((K0.g) cVar3.f4659d).f2526c).getReference()).c(gVar.c(str3, false));
                ((P3.d) ((AtomicMarkableReference) ((K0.g) cVar3.f4660e).f2526c).getReference()).c(gVar.c(str3, true));
                ((AtomicMarkableReference) cVar3.f4662g).set(gVar.d(str3), false);
                P3.n nVar = (P3.n) cVar3.f4661f;
                File fileB = cVar2.b(str3, "rollouts-state");
                if (!fileB.exists() || fileB.length() == 0) {
                    z12 = true;
                    P3.g.f(fileB);
                    listB = Collections.EMPTY_LIST;
                } else {
                    z12 = true;
                    try {
                        fileInputStream = new FileInputStream(fileB);
                        try {
                            try {
                                listB = P3.g.b(g.j(fileInputStream));
                                listB.toString();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                g.c(fileInputStream);
                            } catch (Exception e10) {
                                e = e10;
                                Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                P3.g.f(fileB);
                                g.c(fileInputStream);
                                listB = Collections.EMPTY_LIST;
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = fileInputStream;
                            g.c(fileInputStream2);
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        g.c(fileInputStream2);
                        throw th;
                    }
                }
                synchronized (nVar) {
                    nVar.a.clear();
                    if (listB.size() > nVar.f3893b) {
                        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + nVar.f3893b, null);
                        nVar.a.addAll(listB.subList(0, nVar.f3893b));
                    } else {
                        nVar.a.addAll(listB);
                    }
                }
                G g8 = this.f3553m;
                T3.a aVar = (T3.a) g8.f14979t;
                long jLastModified = aVar.f4654b.b(str3, "start-time").lastModified();
                Iterator it = historicalProcessExitReasons.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        E2 = 0;
                        break;
                    }
                    E2 = z0.e(it.next());
                    if (E2.getTimestamp() < jLastModified) {
                        E2 = fileInputStream2;
                        break;
                    } else if (E2.getReason() == 6) {
                        break;
                    } else {
                        fileInputStream2 = null;
                    }
                }
                if (E2 == 0) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    arrayList = arrayList2;
                    i12 = 2;
                } else {
                    try {
                        InputStream traceInputStream = E2.getTraceInputStream();
                        if (traceInputStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i15 = traceInputStream.read(bArr);
                                i12 = i14;
                                if (i15 == -1) {
                                    break;
                                }
                                try {
                                    byteArrayOutputStream.write(bArr, 0, i15);
                                    i14 = i12;
                                } catch (IOException e12) {
                                    e = e12;
                                }
                                e = e12;
                                Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + E2.toString() + " Error: " + e, null);
                                string = null;
                            }
                            string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        } else {
                            i12 = 2;
                            string = null;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        i12 = i14;
                    }
                    C c10 = new C();
                    c10.f4056d = E2.getImportance();
                    c10.j = (byte) (c10.j | 4);
                    String processName = E2.getProcessName();
                    if (processName == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c10.f4054b = processName;
                    c10.f4055c = E2.getReason();
                    c10.j = (byte) (c10.j | 2);
                    c10.f4059g = E2.getTimestamp();
                    c10.j = (byte) (c10.j | 32);
                    c10.a = E2.getPid();
                    c10.j = (byte) (c10.j | 1);
                    c10.f4057e = E2.getPss();
                    c10.j = (byte) (c10.j | 8);
                    c10.f4058f = E2.getRss();
                    c10.j = (byte) (c10.j | 16);
                    c10.f4060h = string;
                    D dA = c10.a();
                    s sVar = (s) g8.f14978s;
                    int i16 = sVar.a.getResources().getConfiguration().orientation;
                    O o10 = new O();
                    o10.f4117b = "anr";
                    long j = dA.f4067g;
                    o10.a = j;
                    o10.f4122g = (byte) (o10.f4122g | 1);
                    if (sVar.f3579e.g().f5167b.f125c) {
                        C0343a c0343a = sVar.f3577c;
                        if (((ArrayList) c0343a.f3515g).size() > 0) {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = ((ArrayList) c0343a.f3515g).iterator();
                            while (it2.hasNext()) {
                                d dVar = (d) it2.next();
                                int i17 = i16;
                                String str4 = dVar.a;
                                if (str4 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                Iterator it3 = it2;
                                String str5 = dVar.f3521b;
                                if (str5 == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                String str6 = dVar.f3522c;
                                if (str6 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                arrayList3.add(new E(str5, str4, str6));
                                it2 = it3;
                                i16 = i17;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            i13 = i16;
                            listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                        } else {
                            arrayList = arrayList2;
                            i13 = i16;
                            listUnmodifiableList = null;
                        }
                    } else {
                        arrayList = arrayList2;
                        i13 = i16;
                        listUnmodifiableList = null;
                    }
                    C c11 = new C();
                    c11.f4056d = dA.f4064d;
                    byte b3 = (byte) (c11.j | 4);
                    c11.j = b3;
                    String str7 = dA.f4062b;
                    if (str7 == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c11.f4054b = str7;
                    c11.f4055c = dA.f4063c;
                    c11.f4059g = j;
                    c11.a = dA.a;
                    c11.f4057e = dA.f4065e;
                    c11.f4058f = dA.f4066f;
                    c11.j = (byte) (((byte) (((byte) (((byte) (((byte) (b3 | 2)) | 32)) | 1)) | 8)) | 16);
                    c11.f4060h = dA.f4068h;
                    c11.f4061i = listUnmodifiableList;
                    D dA2 = c11.a();
                    Boolean boolValueOf = Boolean.valueOf(dA2.f4064d != 100 ? z12 : false);
                    L3.d dVar2 = L3.d.a;
                    String str8 = dA2.f4062b;
                    p210v8.i.f(str8, "processName");
                    C0367a0 c0367a0A = L3.d.a(dVar2, str8, dA2.a, dA2.f4064d, 8);
                    byte b7 = z12 ? (byte) 1 : (byte) 0;
                    V vE = s.e();
                    List listA = sVar.a();
                    if (listA == null) {
                        throw new NullPointerException("Null binaries");
                    }
                    Q3.S s9 = new Q3.S(null, null, dA2, vE, listA);
                    if (b7 != 1) {
                        StringBuilder sb = new StringBuilder();
                        if (b7 == 0) {
                            sb.append(" uiOrientation");
                        }
                        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
                    }
                    o10.f4118c = new Q(s9, null, null, boolValueOf, c0367a0A, null, i13);
                    o10.f4119d = sVar.b(i13);
                    P pA = o10.a();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    aVar.d(G.d(G.c(pA, eVar, cVar3), cVar3), str3, true);
                }
                i10 = i12;
            } else {
                arrayList = arrayList2;
                i11 = 4;
                i10 = 2;
                Log.isLoggable("FirebaseCrashlytics", 2);
            }
        }
        if (this.j.c(str3)) {
            Log.isLoggable("FirebaseCrashlytics", i10);
            this.j.a(str3).getClass();
            str = null;
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str3, null);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str3, null);
            Log.w("FirebaseCrashlytics", "No native core present", null);
        } else {
            str = null;
        }
        if (z6 != 0) {
            z10 = false;
            str2 = (String) arrayList.get(0);
        } else {
            z10 = false;
            this.f3552l.b(str);
            str2 = null;
        }
        G g10 = this.f3553m;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        T3.a aVar2 = (T3.a) g10.f14979t;
        T3.c cVar4 = aVar2.f4654b;
        cVar4.a(".com.google.firebase.crashlytics");
        cVar4.a(".com.google.firebase.crashlytics-ndk");
        if (!((String) cVar4.a).isEmpty()) {
            cVar4.a(".com.google.firebase.crashlytics.files.v1");
            final String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = (File) cVar4.f4657b;
            if (file.exists() && (list = file.list(new FilenameFilter() { // from class: T3.b
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str10) {
                    return str10.startsWith(str9);
                }
            })) != null) {
                int length = list.length;
                for (?? r10 = z10; r10 < length; r10++) {
                    cVar4.a(list[r10]);
                }
            }
        }
        NavigableSet<String> navigableSetC = aVar2.c();
        if (str2 != null) {
            navigableSetC.remove(str2);
        }
        if (navigableSetC.size() > 8) {
            while (navigableSetC.size() > 8) {
                String str10 = (String) navigableSetC.last();
                Log.isLoggable("FirebaseCrashlytics", 3);
                T3.c.d(new File((File) cVar4.f4659d, str10));
                navigableSetC.remove(str10);
            }
        }
        for (String str11 : navigableSetC) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            h hVar2 = T3.a.f4653i;
            File file2 = new File((File) cVar4.f4659d, str11);
            file2.mkdirs();
            List listE = T3.c.e(file2.listFiles(hVar2));
            if (listE.isEmpty()) {
                Log.isLoggable("FirebaseCrashlytics", 2);
            } else {
                Collections.sort(listE);
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = listE.iterator();
                boolean z13 = z10;
                while (true) {
                    boolean zHasNext = it4.hasNext();
                    R3.a aVar3 = T3.a.f4651g;
                    if (!zHasNext) {
                        if (!arrayList4.isEmpty()) {
                            String strD = new P3.g(cVar4).d(str11);
                            String strA = aVar2.f4656d.a(str11);
                            File fileB2 = cVar4.b(str11, "report");
                            try {
                                String strE = T3.a.e(fileB2);
                                aVar3.getClass();
                                Q3.B bI = R3.a.i(strE);
                                Q3.A a = bI.a();
                                J j10 = bI.f4051k;
                                if (j10 != null) {
                                    try {
                                        I iA = j10.a();
                                        iA.f4078e = Long.valueOf(jCurrentTimeMillis);
                                        iA.f4079f = z13;
                                        try {
                                            iA.f4085m = (byte) (iA.f4085m | 2);
                                            if (strD != null) {
                                                iA.f4081h = new C0387k0(strD);
                                            }
                                            a.j = iA.a();
                                        } catch (IOException e14) {
                                            e = e14;
                                        }
                                    } catch (IOException e15) {
                                        e = e15;
                                    }
                                }
                                Q3.B bA = a.a();
                                Q3.A a10 = bA.a();
                                a10.f4037g = strA;
                                J j11 = bA.f4051k;
                                if (j11 != null) {
                                    I iA2 = j11.a();
                                    iA2.f4076c = strA;
                                    a10.j = iA2.a();
                                }
                                Q3.B bA2 = a10.a();
                                J j12 = bA2.f4051k;
                                if (j12 == null) {
                                    throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                }
                                Q3.A a11 = bA2.a();
                                I iA3 = j12.a();
                                iA3.f4083k = arrayList4;
                                a11.j = iA3.a();
                                Q3.B bA3 = a11.a();
                                J j13 = bA3.f4051k;
                                if (j13 != null) {
                                    try {
                                        Log.isLoggable("FirebaseCrashlytics", 3);
                                        T3.a.f(z13 ? new File((File) cVar4.f4661f, j13.f4086b) : new File((File) cVar4.f4660e, j13.f4086b), R3.a.a.s(bA3));
                                        break;
                                    } catch (IOException e16) {
                                        e = e16;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                                        break;
                                    }
                                }
                                break;
                                e = e16;
                            } catch (IOException e17) {
                                e = e17;
                            }
                            Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                            break;
                            break;
                        }
                        Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                    } else {
                        File file3 = (File) it4.next();
                        try {
                            String strE2 = T3.a.e(file3);
                            aVar3.getClass();
                            try {
                                JsonReader jsonReader = new JsonReader(new StringReader(strE2));
                                try {
                                    P pE = R3.a.e(jsonReader);
                                    jsonReader.close();
                                    arrayList4.add(pE);
                                    if (z13) {
                                        z11 = true;
                                    } else {
                                        String name = file3.getName();
                                        if (name.startsWith("event") && name.endsWith("_")) {
                                            z11 = true;
                                        } else {
                                            z11 = z10;
                                        }
                                    }
                                    z13 = z11;
                                } catch (Throwable th3) {
                                    try {
                                        jsonReader.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (IllegalStateException e18) {
                                throw new IOException(e18);
                            }
                        } catch (IOException e19) {
                            Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e19);
                        }
                    }
                }
                T3.c.d(new File((File) cVar4.f4659d, str11));
                z10 = false;
            }
            T3.c.d(new File((File) cVar4.f4659d, str11));
            z10 = false;
        }
        G9.p pVar = aVar2.f4655c.g().a;
        ArrayList arrayListB = aVar2.b();
        int size = arrayListB.size();
        int i18 = i11;
        if (size <= i18) {
            return;
        }
        Iterator it5 = arrayListB.subList(i18, size).iterator();
        while (it5.hasNext()) {
            ((File) it5.next()).delete();
        }
    }

    public final boolean d(V3.b bVar) {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.f3546e.f13635v).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        t tVar = this.f3554n;
        if (tVar != null && tVar.f3583e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            c(true, bVar);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void f() {
        try {
            String strE = e();
            if (strE != null) {
                try {
                    this.f3545d.f(strE);
                } catch (IllegalArgumentException e10) {
                    Context context = this.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e10;
                    }
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e11);
        }
    }

    public final Task g(P2.f fVar) {
        P2.f fVar2;
        P2.f fVarE;
        T3.c cVar = ((T3.a) this.f3553m.f14979t).f4654b;
        boolean zIsEmpty = T3.c.e(((File) cVar.f4660e).listFiles()).isEmpty();
        TaskCompletionSource taskCompletionSource = this.f3555o;
        if (zIsEmpty && T3.c.e(((File) cVar.f4661f).listFiles()).isEmpty() && T3.c.e(((File) cVar.f4662g).listFiles()).isEmpty()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            taskCompletionSource.d(Boolean.FALSE);
            return Tasks.e(null);
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        Fa.e eVar = this.f3543b;
        if (eVar.u()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            taskCompletionSource.d(Boolean.FALSE);
            fVarE = Tasks.e(Boolean.TRUE);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 3);
            Log.isLoggable("FirebaseCrashlytics", 2);
            taskCompletionSource.d(Boolean.TRUE);
            synchronized (eVar.f1660u) {
                fVar2 = ((TaskCompletionSource) eVar.f1661v).a;
            }
            p230x9.d dVar = new p230x9.d(9);
            fVar2.getClass();
            M2.O o10 = TaskExecutors.a;
            P2.f fVar3 = new P2.f();
            fVar2.f3854b.h(new P2.d(o10, dVar, fVar3));
            fVar2.s();
            Log.isLoggable("FirebaseCrashlytics", 3);
            P2.f fVar4 = this.f3556p.a;
            ExecutorService executorService = B.a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            A a = new A(taskCompletionSource2, 1);
            fVar3.n(a);
            fVar4.n(a);
            fVarE = taskCompletionSource2.a;
        }
        o1.c cVar2 = new o1.c(this, fVar);
        fVarE.getClass();
        M2.O o11 = TaskExecutors.a;
        P2.f fVar5 = new P2.f();
        fVarE.f3854b.h(new P2.d(o11, cVar2, fVar5));
        fVarE.s();
        return fVar5;
    }
}
