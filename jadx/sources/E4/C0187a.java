package E4;

import O3.C0343a;
import O3.C0344b;
import U.C0418e;
import U.InterfaceC0416d;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.widget.NestedScrollView;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.encoders.EncodingException;
import com.kcstream.cing.MainApp;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.MainActivity;
import com.kcstream.cing.activity.PasscodeActivity;
import com.kcstream.cing.activity.SeriesActivity;
import com.kcstream.cing.fragment.TabsRecentFragment;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.chromium.net.UrlRequest;
import p.C0728t;
import p.b1;
import p078i.AbstractActivityC0655l;
import p188t1.C0857u;
import p188t1.Z;
import p188t1.a0;
import p188t1.d0;
import p188t1.u0;

/* JADX INFO: renamed from: E4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0187a implements p118m3.l, N7.a, N7.b, p000a0.j, I3.e, p073h4.a, Continuation, O0.b, p158q2.a, OnCompleteListener, ta.n, p051f2.e, p204v1.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1398t;

    public /* synthetic */ C0187a(Object obj, int i10) {
        this.f1397s = i10;
        this.f1398t = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object C(Task task) throws IOException {
        boolean z6;
        switch (this.f1397s) {
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((p188t1.G) this.f1398t).getClass();
                if (task.k()) {
                    C0344b c0344b = (C0344b) task.g();
                    String str = c0344b.f3517b;
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    File file = c0344b.f3518c;
                    if (file.delete()) {
                        file.getPath();
                        Log.isLoggable("FirebaseCrashlytics", 3);
                    } else {
                        Log.w("FirebaseCrashlytics", "Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z6 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.f());
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((CountDownLatch) this.f1398t).countDown();
                return null;
            default:
                ((p188t1.G) this.f1398t).getClass();
                Bundle bundle = (Bundle) task.h();
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override // O0.b
    public O0.c a(O0.a aVar) {
        Context context = (Context) this.f1398t;
        I.D d3 = (I.D) aVar.f3507e;
        p210v8.i.f(d3, "callback");
        String str = (String) aVar.f3506d;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new P0.h(context, str, d3, true, true);
    }

    @Override // N7.b
    public void accept(Object obj) {
        int i10 = PasscodeActivity.f10200W;
        ((A0.m) this.f1398t).invoke(obj);
    }

    @Override // p051f2.e
    public Object apply(Object obj) {
        ((p081i3.b) this.f1398t).getClass();
        String strS = p182s4.G.f14614b.s((p182s4.F) obj);
        p210v8.i.e(strS, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        byte[] bytes = strS.getBytes(L9.a.a);
        p210v8.i.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // p158q2.a
    public Object b() {
        Object obj = this.f1398t;
        switch (this.f1397s) {
            case 17:
                p148p2.g gVar = (p148p2.g) ((p148p2.c) obj);
                gVar.getClass();
                int i10 = p108l2.a.f12896e;
                o1.m mVar = new o1.m();
                mVar.f13641s = null;
                mVar.f13642t = new ArrayList();
                mVar.f13643u = null;
                mVar.f13644v = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseA = gVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    p108l2.a aVar = (p108l2.a) p148p2.g.l(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new p128n2.b(gVar, map, mVar, 4));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            case 18:
                p148p2.g gVar2 = (p148p2.g) ((p148p2.d) obj);
                long jK = gVar2.f14211t.k() - gVar2.f14213v.f14204d;
                SQLiteDatabase sQLiteDatabaseA2 = gVar2.a();
                sQLiteDatabaseA2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jK)};
                    Cursor cursorRawQuery = sQLiteDatabaseA2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            gVar2.h(cursorRawQuery.getInt(0), p108l2.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseA2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseA2.setTransactionSuccessful();
                    sQLiteDatabaseA2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseA2.endTransaction();
                    throw th2;
                }
            case 19:
                p148p2.g gVar3 = (p148p2.g) ((p138o2.h) obj).f13703i;
                SQLiteDatabase sQLiteDatabaseA3 = gVar3.a();
                sQLiteDatabaseA3.beginTransaction();
                try {
                    sQLiteDatabaseA3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f14211t.k()).execute();
                    sQLiteDatabaseA3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseA3.endTransaction();
                }
            default:
                p138o2.i iVar = (p138o2.i) obj;
                Iterator it = ((Iterable) ((p148p2.g) iVar.f13704b).c(new Y9.a(9))).iterator();
                while (it.hasNext()) {
                    iVar.f13705c.a((i2.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // p073h4.a
    public void c(p073h4.b bVar) {
        L3.b bVar2 = (L3.b) this.f1398t;
        bVar2.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        bVar2.f2780b.set((L3.b) bVar.get());
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void d(Task task) {
        switch (this.f1397s) {
            case 22:
                p140o4.A.b((Intent) this.f1398t);
                break;
            case 23:
                ((p140o4.C) this.f1398t).f13729b.d(null);
                break;
            default:
                ((ScheduledFuture) this.f1398t).cancel(false);
                break;
        }
    }

    @Override // ta.n
    public void e(org.jsoup.nodes.p pVar, int i10) {
        org.jsoup.nodes.k.D(pVar, (StringBuilder) this.f1398t);
    }

    @Override // p000a0.j
    public void f(NestedScrollView nestedScrollView, int i10) {
        Object obj = this.f1398t;
        switch (this.f1397s) {
            case 4:
                int i11 = SeriesActivity.c0;
                SeriesActivity seriesActivity = (SeriesActivity) obj;
                int iM = D3.b.m(seriesActivity, R.attr.colorSurface);
                if (i10 < 256) {
                    iM &= 16777215 | (i10 << 24);
                }
                ((MaterialToolbar) seriesActivity.z().f2096t).setBackgroundColor(iM);
                seriesActivity.getWindow().setStatusBarColor(iM);
                return;
            default:
                C8.u[] uVarArr = TabsRecentFragment.f10260y0;
                TabsRecentFragment tabsRecentFragment = (TabsRecentFragment) obj;
                p210v8.i.f(tabsRecentFragment, "this$0");
                AbstractActivityC0655l abstractActivityC0655lF = tabsRecentFragment.f();
                p210v8.i.d(abstractActivityC0655lF, "null cannot be cast to non-null type com.kcstream.cing.activity.MainActivity");
                MainActivity mainActivity = (MainActivity) abstractActivityC0655lF;
                int iM2 = D3.b.m(mainActivity, R.attr.colorSurface);
                mainActivity.f10198a0 = iM2;
                if (i10 < 256) {
                    mainActivity.f10198a0 = (16777215 | (i10 << 24)) & iM2;
                }
                b1 b1Var = mainActivity.f10193V;
                if (b1Var == null) {
                    p210v8.i.n("binding");
                    throw null;
                }
                ((MaterialToolbar) b1Var.f14043z).setBackgroundColor(mainActivity.f10198a0);
                mainActivity.getWindow().setStatusBarColor(mainActivity.f10198a0);
                return;
        }
    }

    public g2.b g(Y1.c cVar) throws IOException {
        g2.c cVar2 = (g2.c) this.f1398t;
        String strQ = com.bumptech.glide.d.q("CctTransportBackend");
        boolean zIsLoggable = Log.isLoggable(strQ, 4);
        URL url = (URL) cVar.f5670t;
        if (zIsLoggable) {
            Log.i(strQ, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar2.f11537g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) cVar.f5672v;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    P0.d dVar = cVar2.a;
                    h2.m mVar = (h2.m) cVar.f5671u;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    p024c4.d dVar2 = (p024c4.d) dVar.f3811t;
                    p024c4.e eVar = new p024c4.e(bufferedWriter, dVar2.a, dVar2.f7525b, dVar2.f7526c, dVar2.f7527d);
                    eVar.h(mVar);
                    eVar.j();
                    eVar.f7528b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strQ2 = com.bumptech.glide.d.q("CctTransportBackend");
                    if (Log.isLoggable(strQ2, 4)) {
                        Log.i(strQ2, String.format("Status Code: %d", numValueOf));
                    }
                    com.bumptech.glide.d.i("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    com.bumptech.glide.d.i("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new g2.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new g2.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            g2.b bVar = new g2.b(responseCode, null, h2.u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (EncodingException | IOException unused) {
            Log.isLoggable(com.bumptech.glide.d.q("CctTransportBackend"), 6);
            return new g2.b(400, null, 0L);
        } catch (ConnectException | UnknownHostException unused2) {
            Log.isLoggable(com.bumptech.glide.d.q("CctTransportBackend"), 6);
            return new g2.b(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, null, 0L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x03e1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // I3.e
    public Object h(Fa.e eVar) {
        String str;
        String str2;
        int i10;
        P2.f fVar;
        Task taskL;
        boolean z6;
        C0343a c0343a;
        V3.b bVar;
        boolean z10;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        V3.a aVarF;
        switch (this.f1397s) {
            case 5:
                return this.f1398t;
            default:
                int i11 = CrashlyticsRegistrar.a;
                ((CrashlyticsRegistrar) this.f1398t).getClass();
                D3.g gVar = (D3.g) eVar.a(D3.g.class);
                I3.n nVarM = eVar.m(L3.b.class);
                I3.n nVarM2 = eVar.m(F3.a.class);
                p082i4.d dVar = (p082i4.d) eVar.a(p082i4.d.class);
                I3.n nVarM3 = eVar.m(p171r4.a.class);
                gVar.a();
                Context context = gVar.a;
                String packageName = context.getPackageName();
                String str3 = null;
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 19.0.3 for " + packageName, null);
                T3.c cVar = new T3.c(context);
                Fa.e eVar2 = new Fa.e(gVar);
                O3.x xVar = new O3.x(context, packageName, dVar, eVar2);
                L3.b bVar2 = new L3.b(nVarM);
                K3.b bVar3 = new K3.b(nVarM2);
                ExecutorService executorServiceA = O3.g.a("Crashlytics Exception Handler");
                O3.k kVar = new O3.k(eVar2, cVar);
                p191t4.c cVar2 = p191t4.c.a;
                p191t4.d dVar2 = p191t4.d.f15222s;
                p191t4.c cVar3 = p191t4.c.a;
                p191t4.a aVarA = p191t4.c.a(dVar2);
                if (aVarA.f15211b != null) {
                    dVar2.toString();
                } else {
                    aVarA.f15211b = kVar;
                    dVar2.toString();
                    aVarA.a.e(null);
                }
                O3.r rVar = new O3.r(gVar, xVar, bVar2, eVar2, new K3.a(bVar3), new K3.a(bVar3), cVar, executorServiceA, kVar, new A1.r(nVarM3, 20));
                gVar.a();
                String str4 = gVar.f1050c.f1063b;
                int iE = O3.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (iE == 0) {
                    iE = O3.g.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = iE != 0 ? context.getResources().getString(iE) : null;
                ArrayList arrayList = new ArrayList();
                int iE2 = O3.g.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int iE3 = O3.g.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int iE4 = O3.g.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (iE2 == 0 || iE3 == 0 || iE4 == 0) {
                    str = str4;
                    str2 = null;
                    i10 = 3;
                    String.format("Could not find resources: %d %d %d", Integer.valueOf(iE2), Integer.valueOf(iE3), Integer.valueOf(iE4));
                    Log.isLoggable("FirebaseCrashlytics", 3);
                } else {
                    String[] stringArray = context.getResources().getStringArray(iE2);
                    String[] stringArray2 = context.getResources().getStringArray(iE3);
                    String[] stringArray3 = context.getResources().getStringArray(iE4);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i12 = 0;
                        while (i12 < stringArray3.length) {
                            arrayList.add(new O3.d(stringArray[i12], stringArray2[i12], stringArray3[i12]));
                            i12++;
                            str3 = str3;
                            str4 = str4;
                        }
                        str = str4;
                        str2 = str3;
                        i10 = 3;
                    } else {
                        str = str4;
                        str2 = null;
                        i10 = 3;
                        String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        Log.isLoggable("FirebaseCrashlytics", 3);
                    }
                }
                Log.isLoggable("FirebaseCrashlytics", i10);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str5 = ((O3.d) it.next()).a;
                    Log.isLoggable("FirebaseCrashlytics", i10);
                    i10 = 3;
                }
                o1.c cVar4 = new o1.c(context, 6);
                try {
                    String packageName2 = context.getPackageName();
                    String strD = xVar.d();
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
                    String string2 = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
                    String str6 = packageInfo.versionName;
                    if (str6 == null) {
                        str6 = "0.0";
                    }
                    String str7 = str6;
                    C0343a c0343a2 = new C0343a(str, string, arrayList, strD, packageName2, string2, str7, cVar4);
                    String str8 = str;
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    ExecutorService executorServiceA2 = O3.g.a("com.google.firebase.crashlytics.startup");
                    K3.d dVar3 = new K3.d(11);
                    String strD2 = xVar.d();
                    int i13 = 9;
                    za.c cVar5 = new za.c(i13);
                    P0.d dVar4 = new P0.d(cVar5, i13);
                    V.h hVar = new V.h(cVar);
                    Locale locale = Locale.US;
                    O3.y yVar = new O3.y(E0.a.i("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str8, "/settings"), dVar3);
                    String str9 = Build.MANUFACTURER;
                    String str10 = O3.x.f3590h;
                    String str11 = str9.replaceAll(str10, "") + "/" + Build.MODEL.replaceAll(str10, "");
                    String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str10, "");
                    String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str10, "");
                    int iE5 = O3.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (iE5 == 0) {
                        iE5 = O3.g.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {iE5 != 0 ? context.getResources().getString(iE5) : str2, str8, str7, string2};
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        String[] strArr2 = strArr;
                        if (i14 >= 4) {
                            String str12 = str8;
                            Collections.sort(arrayList2);
                            StringBuilder sb = new StringBuilder();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                sb.append((String) it2.next());
                            }
                            String string3 = sb.toString();
                            V3.d dVar5 = new V3.d(str12, str11, strReplaceAll, strReplaceAll2, xVar, string3.length() > 0 ? O3.g.i(string3) : str2, str7, string2, E0.a.b(strD2 != null ? 4 : 1));
                            V3.b bVar4 = new V3.b();
                            AtomicReference atomicReference = new AtomicReference();
                            bVar4.f5178h = atomicReference;
                            bVar4.f5179i = new AtomicReference(new TaskCompletionSource());
                            bVar4.a = context;
                            bVar4.f5172b = dVar5;
                            bVar4.f5174d = cVar5;
                            bVar4.f5173c = dVar4;
                            bVar4.f5175e = hVar;
                            bVar4.f5176f = yVar;
                            bVar4.f5177g = eVar2;
                            atomicReference.set(p053f4.e.p(cVar5));
                            boolean zEquals = ((Context) bVar4.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((V3.d) bVar4.f5172b).f5184f);
                            AtomicReference atomicReference2 = (AtomicReference) bVar4.f5179i;
                            AtomicReference atomicReference3 = (AtomicReference) bVar4.f5178h;
                            if (!zEquals || (aVarF = bVar4.f(1)) == null) {
                                V3.a aVarF2 = bVar4.f(3);
                                if (aVarF2 != null) {
                                    atomicReference3.set(aVarF2);
                                    ((TaskCompletionSource) atomicReference2.get()).d(aVarF2);
                                }
                                Fa.e eVar3 = (Fa.e) bVar4.f5177g;
                                P2.f fVar2 = ((TaskCompletionSource) eVar3.f1663x).a;
                                synchronized (eVar3.f1660u) {
                                    fVar = ((TaskCompletionSource) eVar3.f1661v).a;
                                    break;
                                }
                                ExecutorService executorService = O3.B.a;
                                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                                O3.A a = new O3.A(taskCompletionSource, 0);
                                fVar2.d(executorServiceA2, a);
                                fVar.d(executorServiceA2, a);
                                taskL = taskCompletionSource.a.l(executorServiceA2, new V.h(bVar4, 2));
                            } else {
                                atomicReference3.set(aVarF);
                                ((TaskCompletionSource) atomicReference2.get()).d(aVarF);
                                taskL = Tasks.e(str2);
                            }
                            taskL.d(executorServiceA2, new p170r3.e(7));
                            o1.h hVar2 = rVar.f3570m;
                            T3.c cVar6 = rVar.f3567i;
                            Context context2 = rVar.a;
                            if (context2 == null || (resources = context2.getResources()) == null) {
                                z6 = true;
                            } else {
                                int iE6 = O3.g.e(context2, "com.crashlytics.RequireBuildId", "bool");
                                if (iE6 > 0) {
                                    z6 = resources.getBoolean(iE6);
                                } else {
                                    int iE7 = O3.g.e(context2, "com.crashlytics.RequireBuildId", "string");
                                    if (iE7 > 0) {
                                        z6 = Boolean.parseBoolean(context2.getString(iE7));
                                    } else {
                                        z6 = true;
                                    }
                                }
                            }
                            if (z6) {
                                c0343a = c0343a2;
                                if (TextUtils.isEmpty((String) c0343a.f3510b)) {
                                    throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                }
                            } else {
                                Log.isLoggable("FirebaseCrashlytics", 2);
                                c0343a = c0343a2;
                            }
                            new O3.e(rVar.f3566h);
                            String str13 = O3.e.f3523b;
                            try {
                                int i15 = 8;
                                rVar.f3564f = new o1.e("crash_marker", i15, cVar6);
                                rVar.f3563e = new o1.e("initialization_marker", i15, cVar6);
                                T3.c cVar7 = new T3.c(str13, cVar6, hVar2);
                                P3.e eVar4 = new P3.e(cVar6);
                                o1.r rVar2 = new o1.r(new W3.a[]{new K3.d(13)});
                                A1.r rVar3 = rVar.f3573p;
                                rVar3.getClass();
                                ((I3.n) rVar3.f167t).a(new D3.i(12));
                                C0343a c0343a3 = c0343a;
                                try {
                                    p188t1.G gH = p188t1.G.h(rVar.a, rVar.f3566h, rVar.f3567i, c0343a3, eVar4, cVar7, rVar2, bVar4, rVar.f3561c, rVar.f3571n);
                                    bVar = bVar4;
                                    try {
                                        rVar.f3565g = new O3.o(rVar.a, rVar.f3570m, rVar.f3566h, rVar.f3560b, rVar.f3567i, rVar.f3564f, c0343a3, cVar7, eVar4, gH, rVar.f3572o, rVar.f3568k, rVar.f3571n);
                                        o1.e eVar5 = rVar.f3563e;
                                        String str14 = (String) eVar5.f13627t;
                                        T3.c cVar8 = (T3.c) eVar5.f13628u;
                                        cVar8.getClass();
                                        boolean zExists = new File((File) cVar8.f4658c, str14).exists();
                                        try {
                                            Boolean.TRUE.equals((Boolean) O3.B.a(hVar2.t(new O3.q(rVar, 1))));
                                        } catch (Exception unused) {
                                        }
                                        O3.o oVar = rVar.f3565g;
                                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                        oVar.getClass();
                                        oVar.f3546e.t(new M2.I(oVar, 4, str13));
                                        O3.t tVar = new O3.t(new p040e1.j(oVar, 21), bVar, defaultUncaughtExceptionHandler, oVar.j);
                                        oVar.f3554n = tVar;
                                        Thread.setDefaultUncaughtExceptionHandler(tVar);
                                        if (!zExists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                                            Log.isLoggable("FirebaseCrashlytics", 3);
                                            z10 = true;
                                        } else {
                                            Log.isLoggable("FirebaseCrashlytics", 3);
                                            Future<?> futureSubmit = rVar.f3569l.submit(new C3.c(rVar, bVar, 22, false));
                                            Log.isLoggable("FirebaseCrashlytics", 3);
                                            try {
                                                futureSubmit.get(3L, TimeUnit.SECONDS);
                                                break;
                                            } catch (InterruptedException | ExecutionException | TimeoutException unused2) {
                                            }
                                            z10 = false;
                                        }
                                    } catch (Exception unused3) {
                                        rVar.f3565g = str2;
                                    }
                                } catch (Exception unused4) {
                                    bVar = bVar4;
                                }
                            } catch (Exception unused5) {
                                bVar = bVar4;
                            }
                            Tasks.c(executorServiceA2, new K3.c(z10, rVar, bVar));
                            return new K3.d(0);
                        }
                        String str15 = strArr2[i14];
                        String str16 = str8;
                        if (str15 != null) {
                            arrayList2.add(str15.replace("-", "").toLowerCase(Locale.US));
                        }
                        i14++;
                        strArr = strArr2;
                        str8 = str16;
                    }
                } catch (PackageManager.NameNotFoundException unused6) {
                    return str2;
                }
                break;
        }
    }

    @Override // ta.n
    public /* synthetic */ void i(org.jsoup.nodes.p pVar, int i10) {
    }

    public boolean j(P0.d dVar, int i10, Bundle bundle) {
        InterfaceC0416d jVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                ((Z.g) dVar.f3811t).d();
                Parcelable parcelable = (Parcelable) ((Z.g) dVar.f3811t).a();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipDescription description = ((Z.g) dVar.f3811t).getDescription();
        Z.g gVar = (Z.g) dVar.f3811t;
        ClipData clipData = new ClipData(description, new ClipData.Item(gVar.b()));
        if (i11 >= 31) {
            jVar = new p040e1.j(clipData, 2);
        } else {
            C0418e c0418e = new C0418e();
            c0418e.f4802t = clipData;
            c0418e.f4803u = 2;
            jVar = c0418e;
        }
        jVar.t(gVar.f());
        jVar.setExtras(bundle);
        return U.U.j((C0728t) this.f1398t, jVar.mo66build()) == null;
    }

    @Override // N7.a
    /* JADX INFO: renamed from: run, reason: collision with other method in class */
    public void mo0run() {
        int i10 = PasscodeActivity.f10200W;
        PasscodeActivity passcodeActivity = (PasscodeActivity) this.f1398t;
        Ha.a.a.getClass();
        za.c.k(new Object[0]);
        SharedPreferences.Editor editorEdit = passcodeActivity.y().edit();
        editorEdit.putBoolean("unlocked", true);
        editorEdit.remove("app_locked");
        editorEdit.apply();
        Intent intent = new Intent("com.kcstream.cing.broadcast.guard");
        intent.putExtra("unlocked", true);
        passcodeActivity.sendBroadcast(intent);
        if (!passcodeActivity.y().contains("is_splash")) {
            passcodeActivity.finish();
        } else {
            D3.b.H(passcodeActivity, MainActivity.class);
            passcodeActivity.finish();
        }
    }

    public /* synthetic */ C0187a(a0 a0Var, MainApp mainApp) {
        this.f1397s = 27;
        this.f1398t = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x015c A[Catch: Exception -> 0x0165, TRY_LEAVE, TryCatch #1 {Exception -> 0x0165, blocks: (B:27:0x00d3, B:29:0x00ea, B:32:0x00fa, B:39:0x012d, B:41:0x013b, B:42:0x0156, B:43:0x015c), top: B:52:0x00d3 }] */
    @Override // p204v1.c
    public p188t1.F run() {
        boolean z6;
        Z z10;
        boolean z11;
        switch (this.f1397s) {
            case 27:
                a0 a0Var = (a0) this.f1398t;
                String strA = a0Var.f15006i.a();
                KeyStore.PrivateKeyEntry privateKeyEntry = null;
                d0 d0Var = a0Var.f15005h;
                if (strA == null) {
                    z6 = false;
                } else {
                    boolean zG = d0Var.a.g(p086i8.C.a(p086i8.C.c("026BBACD03EBC29887790B1A9444700BCACD")));
                    C0857u c0857u = d0Var.a;
                    if (zG) {
                        String strE = !c0857u.g(p086i8.C.a(p086i8.C.c("026BBACD03EBC29887790B1A9444700BCACD"))) ? null : c0857u.e(p086i8.C.a(p086i8.C.c("026BBACD03EBC29887790B1A9444700BCACD")));
                        if (!strA.equals(strE)) {
                            a0Var.l(p086i8.C.a(p086i8.C.c("046BB0E804E1D7A88F73260CB845753AC4CC")), p086i8.C.a(p086i8.C.c("2F6EB0934A")) + strE + p086i8.C.a(p086i8.C.c("4C22BACC1DBF85")) + strA);
                            z6 = true;
                        }
                    } else {
                        c0857u.f(p086i8.C.a(p086i8.C.c("026BBACD03EBC29887790B1A9444700BCACD")), strA);
                    }
                    z6 = false;
                }
                boolean z12 = !z6;
                try {
                    KeyStore keyStore = KeyStore.getInstance(p086i8.C.a(p086i8.C.c("216CB0DB05ECC18C836E3C1C945F71")));
                    keyStore.load(null);
                    PublicKey publicKeyA = d0Var.a();
                    if (publicKeyA != null) {
                        if (!keyStore.containsAlias(p086i8.C.a(p086i8.C.c("3463B8DA0FE6E7AE887306069C")))) {
                            a0Var.l(p086i8.C.a(p086i8.C.c("046BB0E20FFCF6B389650A2B934C7A33C6")), p086i8.C.a(p086i8.C.c("016EBDC819A5CBA8923709078E4370")));
                            a0Var.n(keyStore);
                            z10 = new Z(false, true);
                        } else {
                            try {
                                KeyStore.Entry entry = keyStore.getEntry(p086i8.C.a(p086i8.C.c("3463B8DA0FE6E7AE887306069C")), null);
                                if (entry instanceof KeyStore.PrivateKeyEntry) {
                                    privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
                                }
                            } catch (Exception unused) {
                            }
                            if (privateKeyEntry != null) {
                                if (!a0.o(publicKeyA, privateKeyEntry, UUID.randomUUID().toString())) {
                                    a0Var.l(p086i8.C.a(p086i8.C.c("046BB0E20FFCF6B389650A2B934C7A33C6")), p086i8.C.a(p086i8.C.c("0B67ADD90BECD7E78B7E1C059A59773C")));
                                    z10 = new Z(true, false);
                                } else {
                                    z10 = new Z(false, false);
                                }
                            } else {
                                a0Var.n(keyStore);
                                z10 = new Z(false, false);
                            }
                        }
                    } else {
                        a0Var.n(keyStore);
                        z10 = new Z(false, false);
                    }
                    break;
                } catch (Exception unused2) {
                    z10 = new Z(false, false);
                }
                return new p188t1.F(z12, !z10.a, !z10.f14993b);
            default:
                u0 u0Var = (u0) this.f1398t;
                long j = u0Var.f15096g;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j > jCurrentTimeMillis) {
                    AbstractC0487g.r("2840", "346BB9CC39FCCBA4C67E1C1B8E483A7A8D");
                } else {
                    if (jCurrentTimeMillis - j > 10000) {
                        u0Var.l(p086i8.C.a(p086i8.C.c("036DB9D905EBC0A9925F0A0989597631C2DD")), p086i8.C.a(p086i8.C.c("28408BE725D1FA81A942212C")));
                        z11 = false;
                    }
                    return new p188t1.F(z11, true, true);
                }
                z11 = true;
                return new p188t1.F(z11, true, true);
        }
    }
}
