package com.kcstream.cing;

import C0.v;
import D4.b;
import E.g;
import J7.j;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import com.rollbar.notifier.sender.BufferedSender;
import com.rollbar.notifier.sender.SyncSender;
import com.rollbar.notifier.sender.json.JsonSerializerImpl;
import com.rollbar.notifier.sender.queue.DiskQueue;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p086i8.C;
import p195u1.c;
import p210v8.i;
import p222x0.a;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/kcstream/cing/MainApp;", "Landroid/app/Application;", "", "<init>", "()V", "", "getPush", "()Ljava/lang/String;", "D4/b", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MainApp extends Application {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f10163s = 0;

    public MainApp() {
        System.loadLibrary("native-lib");
    }

    private final native String getPush();

    public final SharedPreferences a() {
        SharedPreferences sharedPreferences = getSharedPreferences(v.a(this), 0);
        i.e(sharedPreferences, "getDefaultSharedPreferences(...)");
        return sharedPreferences;
    }

    @Override // android.app.Application
    public final void onCreate() {
        String string;
        PackageInfo packageInfo;
        super.onCreate();
        registerActivityLifecycleCallbacks(new b(this));
        p195u1.b bVar = new p195u1.b(new p081i3.b(new String[]{"08qT0ir+aJuH1aV9yy2EOYc4Vkn5xgDff5XCL/SXCK0="}, 20));
        c cVar = new c(this);
        p222x0.b bVarA = p222x0.b.a(this);
        IntentFilter intentFilter = new IntentFilter(C.a(C.c("344398FA2FC6FA8EA85120")));
        synchronized (bVarA.f15707b) {
            try {
                a aVar = new a(intentFilter, cVar);
                ArrayList arrayList = (ArrayList) bVarA.f15707b.get(cVar);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    bVarA.f15707b.put(cVar, arrayList);
                }
                arrayList.add(aVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList arrayList2 = (ArrayList) bVarA.f15708c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        bVarA.f15708c.put(action, arrayList2);
                    }
                    arrayList2.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d.v(this, bVar);
        if (C6.a.f946t != null) {
            Log.w("Rollbar", "Rollbar.init() called when it was already initialized.");
            C6.a.f946t.getClass();
        } else {
            C6.a aVar2 = new C6.a();
            try {
                Context applicationContext = getApplicationContext();
                string = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData.getString("com.rollbar.android.ACCESS_TOKEN");
            } catch (PackageManager.NameNotFoundException unused) {
                string = null;
            }
            try {
                packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                packageInfo = null;
            }
            int i11 = packageInfo != null ? packageInfo.versionCode : 0;
            String str = packageInfo != null ? packageInfo.versionName : "unknown";
            g gVar = new g();
            gVar.f1165t = 100;
            gVar.f1164s = i11;
            gVar.f1166u = str;
            E6.a aVar3 = new E6.a(gVar);
            BufferedSender.Builder builderSender = new BufferedSender.Builder().queue(new DiskQueue.Builder().queueFolder(new File(getCacheDir(), "rollbar-items")).build()).sender(new SyncSender.Builder().accessToken(string).build());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            BufferedSender bufferedSenderBuild = builderSender.initialFlushDelay(timeUnit.toMillis(1L)).flushFreq(timeUnit.toMillis(15L)).build();
            H6.b bVar2 = new H6.b(string);
            bVar2.f1928g = aVar3;
            bVar2.f1925d = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
            bVar2.f1927f = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
            bVar2.f1929h = new E6.b(this);
            bVar2.f1924c = "production";
            bVar2.j = bufferedSenderBuild;
            bVar2.f1932l = false;
            if (bVar2.f1926e == null) {
                bVar2.f1926e = "java";
            }
            if (bVar2.f1923b == null) {
                bVar2.f1923b = SyncSender.DEFAULT_API_ENDPOINT;
            }
            if (bufferedSenderBuild == null) {
                SyncSender.Builder builderProxy = new SyncSender.Builder(bVar2.f1923b).accessToken(bVar2.a).proxy(null);
                JsonSerializerImpl jsonSerializerImpl = bVar2.f1931k;
                if (jsonSerializerImpl != null) {
                    builderProxy.jsonSerializer(jsonSerializerImpl);
                }
                bVar2.j = new BufferedSender.Builder().sender(builderProxy.build()).build();
            }
            if (bVar2.f1930i == null) {
                bVar2.f1930i = new za.c(6);
            }
            H6.a aVar4 = new H6.a(bVar2);
            if (aVar4.f1919i != bufferedSenderBuild) {
                L6.b.a(bufferedSenderBuild);
            }
            G6.a aVar5 = new G6.a(aVar4, new L6.a());
            if (aVar4.f1920k) {
                Thread threadCurrentThread = Thread.currentThread();
                L6.b.b(threadCurrentThread, "thread");
                G6.a.f1699e.d(threadCurrentThread, "Handling uncaught errors for thread: {}.");
                threadCurrentThread.setUncaughtExceptionHandler(new K6.a(aVar5, Thread.getDefaultUncaughtExceptionHandler()));
            }
            Iterator it = aVar4.j.iterator();
            while (it.hasNext()) {
                F6.b.a.add((String) it.next());
            }
            aVar2.f947s = aVar5;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.currentThread();
            Thread.setDefaultUncaughtExceptionHandler(new K6.a(aVar2.f947s, defaultUncaughtExceptionHandler));
            C6.a.f946t = aVar2;
        }
        j.a = new D3.i(4);
        byte[] bArrDecode = Base64.decode(getPush(), 0);
        i.e(bArrDecode, "decode(...)");
        String str2 = new String(bArrDecode, L9.a.a);
        p076h8.j jVar = P4.d.a;
        ((P4.a) jVar.getValue()).initWithContext(this, str2);
        ((P4.a) jVar.getValue()).getDebug().setLogLevel(p131n5.b.DEBUG);
    }
}
