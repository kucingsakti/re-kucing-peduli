package p082i4;

import A1.q;
import B4.C0157e;
import D3.g;
import I3.d;
import I3.l;
import J3.j;
import P2.f;
import android.net.TrafficStats;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import o1.k;
import o1.r;
import org.json.JSONException;
import org.json.JSONObject;
import p073h4.b;
import p092j4.a;
import p170r3.e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f12268m = new Object();
    public final g a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p099k4.c f12269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f12270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f12271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f12272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f12273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f12275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f12276i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f12277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f12278l;

    static {
        new AtomicInteger(1);
    }

    public c(g gVar, b bVar, ExecutorService executorService, j jVar) {
        gVar.a();
        p099k4.c cVar = new p099k4.c(gVar.a, bVar);
        k kVar = new k();
        kVar.f13639t = gVar;
        if (e.f14468u == null) {
            e.f14468u = new e(23);
        }
        e eVar = e.f14468u;
        if (i.f12283d == null) {
            i.f12283d = new i(eVar);
        }
        i iVar = i.f12283d;
        l lVar = new l(new d(gVar, 2));
        g gVar2 = new g();
        this.f12274g = new Object();
        this.f12277k = new HashSet();
        this.f12278l = new ArrayList();
        this.a = gVar;
        this.f12269b = cVar;
        this.f12270c = kVar;
        this.f12271d = iVar;
        this.f12272e = lVar;
        this.f12273f = gVar2;
        this.f12275h = executorService;
        this.f12276i = jVar;
    }

    public final void a(h hVar) {
        synchronized (this.f12274g) {
            this.f12278l.add(hVar);
        }
    }

    public final void b() {
        a aVarT;
        synchronized (f12268m) {
            try {
                g gVar = this.a;
                gVar.a();
                r rVarC = r.c(gVar.a);
                try {
                    aVarT = this.f12270c.t();
                    int i10 = aVarT.f12498b;
                    boolean z6 = true;
                    if (i10 != 2 && i10 != 1) {
                        z6 = false;
                    }
                    if (z6) {
                        String strH = h(aVarT);
                        k kVar = this.f12270c;
                        C0157e c0157eA = aVarT.a();
                        c0157eA.f665b = strH;
                        c0157eA.f666c = 3;
                        aVarT = c0157eA.i();
                        kVar.n(aVarT);
                    }
                    if (rVarC != null) {
                        rVarC.u();
                    }
                } catch (Throwable th) {
                    if (rVarC != null) {
                        rVarC.u();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k(aVarT);
        this.f12276i.execute(new b(this, 2));
    }

    public final a c(a aVar) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnectionC;
        p099k4.b bVarF;
        g gVar = this.a;
        gVar.a();
        String str = gVar.f1050c.a;
        gVar.a();
        String str2 = gVar.f1050c.f1068g;
        String str3 = aVar.f12500d;
        p099k4.c cVar = this.f12269b;
        p099k4.d dVar = cVar.f12696c;
        if (!dVar.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = p099k4.c.a("projects/" + str2 + "/installations/" + aVar.a + "/authTokens:generate");
        int i10 = 0;
        while (true) {
            if (i10 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str3);
                    httpURLConnectionC.setDoOutput(true);
                    p099k4.c.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bVarF = p099k4.c.f(httpURLConnectionC);
                        break;
                    }
                    p099k4.c.b(httpURLConnectionC, null, str, str2);
                    if (responseCode == 401 || responseCode == 404) {
                        q qVarA = p099k4.b.a();
                        qVarA.f163b = 3;
                        bVarF = qVarA.b();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        q qVarA2 = p099k4.b.a();
                        qVarA2.f163b = 2;
                        bVarF = qVarA2.b();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iD = p239z.e.d(bVarF.f12692c);
        if (iD == 0) {
            i iVar = this.f12271d;
            iVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            iVar.a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            C0157e c0157eA = aVar.a();
            c0157eA.f667d = bVarF.a;
            c0157eA.f669f = Long.valueOf(bVarF.f12691b);
            c0157eA.f670g = Long.valueOf(seconds);
            return c0157eA.i();
        }
        if (iD == 1) {
            C0157e c0157eA2 = aVar.a();
            c0157eA2.f671h = "BAD CONFIG";
            c0157eA2.f666c = 5;
            return c0157eA2.i();
        }
        if (iD != 2) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        l(null);
        C0157e c0157eA3 = aVar.a();
        c0157eA3.f666c = 2;
        return c0157eA3.i();
    }

    public final f d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.e(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new f(taskCompletionSource));
        f fVar = taskCompletionSource.a;
        this.f12275h.execute(new b(this, 0));
        return fVar;
    }

    public final f e() {
        g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new e(this.f12271d, taskCompletionSource));
        this.f12275h.execute(new b(this, 1));
        return taskCompletionSource.a;
    }

    public final void f(a aVar) {
        synchronized (f12268m) {
            try {
                g gVar = this.a;
                gVar.a();
                r rVarC = r.c(gVar.a);
                try {
                    this.f12270c.n(aVar);
                    if (rVarC != null) {
                        rVarC.u();
                    }
                } catch (Throwable th) {
                    if (rVarC != null) {
                        rVarC.u();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        g gVar = this.a;
        gVar.a();
        Preconditions.f(gVar.f1050c.f1063b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.f(gVar.f1050c.f1068g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.f(gVar.f1050c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f1050c.f1063b;
        Pattern pattern = i.f12282c;
        Preconditions.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        Preconditions.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", i.f12282c.matcher(gVar.f1050c.a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[Catch: all -> 0x0036, DONT_GENERATE, TryCatch #0 {all -> 0x0036, blocks: (B:10:0x002e, B:12:0x0034, B:16:0x0038, B:17:0x003c), top: B:27:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:10:0x002e, B:12:0x0034, B:16:0x0038, B:17:0x003c), top: B:27:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String h(a aVar) {
        p092j4.b bVar;
        String strA;
        g gVar = this.a;
        gVar.a();
        if (!gVar.f1049b.equals("CHIME_ANDROID_SDK")) {
            g gVar2 = this.a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f1049b)) {
                if (aVar.f12498b == 1) {
                    bVar = (p092j4.b) this.f12272e.get();
                    synchronized (bVar.a) {
                        try {
                            strA = bVar.a();
                            if (strA != null) {
                                strA = bVar.b();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(strA)) {
                        return strA;
                    }
                    this.f12273f.getClass();
                    return g.a();
                }
            }
        } else if (aVar.f12498b == 1) {
            bVar = (p092j4.b) this.f12272e.get();
            synchronized (bVar.a) {
                strA = bVar.a();
                if (strA != null) {
                    strA = bVar.b();
                }
                if (TextUtils.isEmpty(strA)) {
                    return strA;
                }
                this.f12273f.getClass();
                return g.a();
            }
        }
        this.f12273f.getClass();
        return g.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [k4.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [k4.a] */
    public final a i(a aVar) throws FirebaseInstallationsException {
        String str = aVar.a;
        String string = null;
        if (str != null && str.length() == 11) {
            p092j4.b bVar = (p092j4.b) this.f12272e.get();
            synchronized (bVar.a) {
                try {
                    String[] strArr = p092j4.b.f12504c;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            break;
                        }
                        String str2 = strArr[i10];
                        String string2 = bVar.a.getString("|T|" + bVar.f12505b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i10++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        p099k4.c cVar = this.f12269b;
        g gVar = this.a;
        gVar.a();
        String str3 = gVar.f1050c.a;
        String str4 = aVar.a;
        g gVar2 = this.a;
        gVar2.a();
        String str5 = gVar2.f1050c.f1068g;
        g gVar3 = this.a;
        gVar3.a();
        String str6 = gVar3.f1050c.f1063b;
        p099k4.d dVar = cVar.f12696c;
        if (!dVar.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = p099k4.c.a("projects/" + str5 + "/installations");
        int i11 = 0;
        p099k4.a aVar2 = cVar;
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar2.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    p099k4.c.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        p099k4.a aVarE = p099k4.c.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar2 = aVarE;
                    } else {
                        try {
                            p099k4.c.b(httpURLConnectionC, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                p099k4.a aVar3 = new p099k4.a(null, null, null, null, 2);
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar2 = aVar3;
                            } else {
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i11++;
                                aVar2 = aVar2;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar2 = aVar2;
                    }
                    int iD = p239z.e.d(aVar2.f12690e);
                    if (iD != 0) {
                        if (iD != 1) {
                            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        C0157e c0157eA = aVar.a();
                        c0157eA.f671h = "BAD CONFIG";
                        c0157eA.f666c = 5;
                        return c0157eA.i();
                    }
                    String str7 = aVar2.f12687b;
                    String str8 = aVar2.f12688c;
                    i iVar = this.f12271d;
                    iVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    iVar.a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    p099k4.b bVar2 = aVar2.f12689d;
                    String str9 = bVar2.a;
                    long j = bVar2.f12691b;
                    C0157e c0157eA2 = aVar.a();
                    c0157eA2.f665b = str7;
                    c0157eA2.f666c = 4;
                    c0157eA2.f667d = str9;
                    c0157eA2.f668e = str8;
                    c0157eA2.f669f = Long.valueOf(j);
                    c0157eA2.f670g = Long.valueOf(seconds);
                    return c0157eA2.i();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f12274g) {
            try {
                Iterator it = this.f12278l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(a aVar) {
        synchronized (this.f12274g) {
            try {
                Iterator it = this.f12278l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(a aVar, a aVar2) {
        try {
            if (this.f12277k.size() != 0 && !TextUtils.equals(aVar.a, aVar2.a)) {
                Iterator it = this.f12277k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
