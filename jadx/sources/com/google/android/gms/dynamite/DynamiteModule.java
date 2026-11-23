package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zzc;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class DynamiteModule {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f8294e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f8295f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f8296g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f8297h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Boolean f8298i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static zzq f8301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static zzr f8302n;
    public final Context a;
    public static final ThreadLocal j = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final F2.c f8299k = new F2.c(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f8300l = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f8291b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f8292c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f8293d = new d();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
    }

    public interface VersionPolicy {

        @KeepForSdk
        public interface IVersions {
            int a(Context context, String str);

            int b(Context context, String str, boolean z6);
        }

        @KeepForSdk
        public static class SelectionResult {
            public int a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f8303b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f8304c = 0;
        }

        SelectionResult a(Context context, String str, IVersions iVersions);
    }

    public DynamiteModule(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage()));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0258  */
    /* JADX WARN: Code duplicated, block: B:117:0x025e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0267  */
    /* JADX WARN: Code duplicated, block: B:125:0x0278 A[Catch: all -> 0x0085, TryCatch #2 {all -> 0x0085, blocks: (B:7:0x004b, B:11:0x007f, B:18:0x008b, B:21:0x0091, B:24:0x00a5, B:102:0x0206, B:103:0x020d, B:106:0x0210, B:107:0x0211, B:108:0x0218, B:125:0x0278, B:126:0x0289, B:109:0x0219, B:111:0x0237, B:113:0x0244, B:123:0x0270, B:124:0x0277, B:127:0x028a, B:128:0x02b6), top: B:143:0x004b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0091 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #2 {all -> 0x0085, blocks: (B:7:0x004b, B:11:0x007f, B:18:0x008b, B:21:0x0091, B:24:0x00a5, B:102:0x0206, B:103:0x020d, B:106:0x0210, B:107:0x0211, B:108:0x0218, B:125:0x0278, B:126:0x0289, B:109:0x0219, B:111:0x0237, B:113:0x0244, B:123:0x0270, B:124:0x0277, B:127:0x028a, B:128:0x02b6), top: B:143:0x004b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[Catch: all -> 0x01fa, TryCatch #7 {, blocks: (B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x01fc, B:99:0x0203), top: B:150:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5 A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TRY_ENTER, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TRY_ENTER, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0152 A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015d A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x017c A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x018f A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0197 A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8 A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2 A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c3 A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d9 A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01e2 A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ea A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f2 A[Catch: all -> 0x0136, LoadingException -> 0x0139, RemoteException -> 0x013c, TryCatch #8 {RemoteException -> 0x013c, LoadingException -> 0x0139, all -> 0x0136, blocks: (B:26:0x00a9, B:32:0x00b5, B:34:0x00bc, B:35:0x00d7, B:39:0x00dd, B:41:0x00e5, B:43:0x00e9, B:44:0x00f7, B:51:0x0102, B:53:0x0126, B:55:0x012e, B:63:0x013f, B:64:0x0146, B:52:0x0111, B:67:0x0149, B:68:0x014a, B:69:0x0151, B:70:0x0152, B:71:0x0159, B:74:0x015c, B:75:0x015d, B:77:0x017c, B:79:0x018f, B:81:0x0197, B:87:0x01d3, B:89:0x01d9, B:90:0x01e2, B:91:0x01e9, B:82:0x01a8, B:83:0x01af, B:85:0x01b2, B:86:0x01c3, B:92:0x01ea, B:93:0x01f1, B:94:0x01f2, B:95:0x01f9, B:101:0x0205), top: B:151:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01fc A[Catch: all -> 0x01fa, TRY_ENTER, TryCatch #7 {, blocks: (B:27:0x00aa, B:29:0x00b0, B:30:0x00b2, B:98:0x01fc, B:99:0x0203), top: B:150:0x00aa }] */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x0278, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00bc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x015d, please report this as an issue */
    public static DynamiteModule c(Context context, VersionPolicy versionPolicy, String str) throws Throwable {
        long j10;
        DynamiteModule dynamiteModule;
        int i10;
        Boolean bool;
        zzq zzqVarH;
        int i11;
        IObjectWrapper iObjectWrapperI0;
        Object objI0;
        DynamiteModule dynamiteModule2;
        F2.d dVar;
        zzr zzrVar;
        F2.d dVar2;
        boolean z6;
        IObjectWrapper iObjectWrapperI1;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context");
        }
        ThreadLocal threadLocal = j;
        F2.d dVar3 = (F2.d) threadLocal.get();
        F2.d dVar4 = new F2.d();
        threadLocal.set(dVar4);
        F2.c cVar = f8299k;
        Long l4 = (Long) cVar.get();
        long jLongValue = l4.longValue();
        try {
            cVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectionResultA = versionPolicy.a(context, str, f8300l);
            j10 = jLongValue;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + selectionResultA.a + " and remote module " + str + ":" + selectionResultA.f8303b);
                int i12 = selectionResultA.f8304c;
                if (i12 != 0) {
                    if (i12 != -1) {
                        if (i12 == 1 || selectionResultA.f8303b != 0) {
                            if (i12 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                dynamiteModule = new DynamiteModule(applicationContext);
                            } else {
                                if (i12 == 1) {
                                    throw new LoadingException("VersionPolicy returned invalid code:" + i12);
                                }
                                try {
                                    i10 = selectionResultA.f8303b;
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (g(context)) {
                                                throw new LoadingException("Remote loading disabled");
                                            }
                                            bool = f8294e;
                                        }
                                        if (bool != null) {
                                            throw new LoadingException("Failed to determine which loading route to use.");
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            synchronized (DynamiteModule.class) {
                                                zzrVar = f8302n;
                                            }
                                            if (zzrVar != null) {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                            }
                                            dVar2 = (F2.d) threadLocal.get();
                                            if (dVar2 != null || dVar2.a == null) {
                                                throw new LoadingException("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = dVar2.a;
                                            new ObjectWrapper(null);
                                            synchronized (DynamiteModule.class) {
                                                z6 = f8297h >= 2;
                                            }
                                            if (z6) {
                                                iObjectWrapperI1 = zzrVar.j0(new ObjectWrapper(applicationContext2), str, i10, new ObjectWrapper(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                iObjectWrapperI1 = zzrVar.i0(new ObjectWrapper(applicationContext2), str, i10, new ObjectWrapper(cursor2));
                                            }
                                            Context context2 = (Context) ObjectWrapper.i0(iObjectWrapperI1);
                                            if (context2 == null) {
                                                throw new LoadingException("Failed to get module context");
                                            }
                                            dynamiteModule2 = new DynamiteModule(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                            zzqVarH = h(context);
                                            if (zzqVarH != null) {
                                                throw new LoadingException("Failed to create IDynamiteLoader.");
                                            }
                                            Parcel parcelG0 = zzqVarH.g0(zzqVarH.h0(), 6);
                                            i11 = parcelG0.readInt();
                                            parcelG0.recycle();
                                            if (i11 >= 3) {
                                                dVar = (F2.d) threadLocal.get();
                                                if (dVar != null) {
                                                    throw new LoadingException("No cached result cursor holder");
                                                }
                                                iObjectWrapperI0 = zzqVarH.j0(new ObjectWrapper(context), str, i10, new ObjectWrapper(dVar.a));
                                            } else if (i11 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                iObjectWrapperI0 = zzqVarH.k0(new ObjectWrapper(context), str, i10);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                iObjectWrapperI0 = zzqVarH.i0(new ObjectWrapper(context), str, i10);
                                            }
                                            objI0 = ObjectWrapper.i0(iObjectWrapperI0);
                                            if (objI0 != null) {
                                                throw new LoadingException("Failed to load remote module.");
                                            }
                                            dynamiteModule2 = new DynamiteModule((Context) objI0);
                                        }
                                        dynamiteModule = dynamiteModule2;
                                    } catch (RemoteException e10) {
                                        throw new LoadingException("Failed to load remote module.", e10);
                                    } catch (LoadingException e11) {
                                        throw e11;
                                    } catch (Throwable th) {
                                        throw new LoadingException("Failed to load remote module.", th);
                                    }
                                } catch (LoadingException e12) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                                    int i13 = selectionResultA.a;
                                    if (i13 == 0 || versionPolicy.a(context, str, new e(i13)).f8304c != -1) {
                                        throw new LoadingException("Remote load failed. No local fallback found.", e12);
                                    }
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    dynamiteModule = new DynamiteModule(applicationContext);
                                }
                            }
                            if (j10 == 0) {
                                f8299k.remove();
                            } else {
                                f8299k.set(l4);
                            }
                            cursor = dVar4.a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            j.set(dVar3);
                            return dynamiteModule;
                        }
                    } else if (selectionResultA.a != 0) {
                        i12 = -1;
                        if (i12 == 1) {
                        }
                        if (i12 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            dynamiteModule = new DynamiteModule(applicationContext);
                        } else {
                            if (i12 == 1) {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i12);
                            }
                            i10 = selectionResultA.f8303b;
                            synchronized (DynamiteModule.class) {
                                if (g(context)) {
                                    throw new LoadingException("Remote loading disabled");
                                }
                                bool = f8294e;
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                    synchronized (DynamiteModule.class) {
                                        zzrVar = f8302n;
                                        if (zzrVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                        }
                                        dVar2 = (F2.d) threadLocal.get();
                                        if (dVar2 != null) {
                                        }
                                        throw new LoadingException("No result cursor");
                                    }
                                }
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i10);
                                zzqVarH = h(context);
                                if (zzqVarH != null) {
                                    throw new LoadingException("Failed to create IDynamiteLoader.");
                                }
                                Parcel parcelG1 = zzqVarH.g0(zzqVarH.h0(), 6);
                                i11 = parcelG1.readInt();
                                parcelG1.recycle();
                                if (i11 >= 3) {
                                    dVar = (F2.d) threadLocal.get();
                                    if (dVar != null) {
                                        throw new LoadingException("No cached result cursor holder");
                                    }
                                    iObjectWrapperI0 = zzqVarH.j0(new ObjectWrapper(context), str, i10, new ObjectWrapper(dVar.a));
                                } else if (i11 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    iObjectWrapperI0 = zzqVarH.k0(new ObjectWrapper(context), str, i10);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    iObjectWrapperI0 = zzqVarH.i0(new ObjectWrapper(context), str, i10);
                                }
                                objI0 = ObjectWrapper.i0(iObjectWrapperI0);
                                if (objI0 != null) {
                                    throw new LoadingException("Failed to load remote module.");
                                }
                                dynamiteModule2 = new DynamiteModule((Context) objI0);
                                dynamiteModule = dynamiteModule2;
                            }
                        }
                        if (j10 == 0) {
                            f8299k.remove();
                        } else {
                            f8299k.set(l4);
                        }
                        cursor = dVar4.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        j.set(dVar3);
                        return dynamiteModule;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultA.a + " and remote version is " + selectionResultA.f8303b + ".");
            } catch (Throwable th2) {
                th = th2;
                if (j10 == 0) {
                    f8299k.remove();
                } else {
                    f8299k.set(l4);
                }
                Cursor cursor3 = dVar4.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                j.set(dVar3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j10 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0 A[Catch: all -> 0x0037, TryCatch #11 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b9, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x0050, B:27:0x0054, B:30:0x005d, B:32:0x0065, B:35:0x006c, B:42:0x0098, B:43:0x00a0, B:38:0x0073, B:40:0x0079, B:41:0x008a, B:46:0x00a3, B:49:0x00a6, B:50:0x00b0, B:17:0x003f), top: B:145:0x0027, inners: #12 }] */
    public static int d(Context context, String str, boolean z6) {
        Throwable th;
        RemoteException remoteException;
        int i10;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f8294e;
                boolean z10 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (f8296g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iE = e(context, str, z6, true);
                                                String str2 = f8295f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderA = zzb.a();
                                                    if (classLoaderA == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            F2.a.c();
                                                            String str3 = f8295f;
                                                            Preconditions.i(str3);
                                                            classLoaderA = F2.a.b(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f8295f;
                                                            Preconditions.i(str4);
                                                            classLoaderA = new F2.b(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    f(classLoaderA);
                                                    declaredField.set(null, classLoaderA);
                                                    f8294e = bool2;
                                                    return iE;
                                                }
                                                return iE;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f8294e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e10.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z6, false);
                    } catch (LoadingException e11) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e11.getMessage());
                        return 0;
                    }
                }
                zzq zzqVarH = h(context);
                try {
                    if (zzqVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelG0 = zzqVarH.g0(zzqVarH.h0(), 6);
                        int i11 = parcelG0.readInt();
                        parcelG0.recycle();
                        if (i11 >= 3) {
                            ThreadLocal threadLocal = j;
                            F2.d dVar = (F2.d) threadLocal.get();
                            if (dVar != null && (cursor = dVar.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) ObjectWrapper.i0(zzqVarH.l0(new ObjectWrapper(context), str, z6, ((Long) f8299k.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i10 = cursor3.getInt(0);
                                        if (i10 > 0) {
                                            F2.d dVar2 = (F2.d) threadLocal.get();
                                            if (dVar2 == null || dVar2.a != null) {
                                                z10 = false;
                                            } else {
                                                dVar2.a = cursor3;
                                            }
                                            cursor2 = z10 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e12) {
                                    remoteException = e12;
                                    cursor2 = cursor3;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i11 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            ObjectWrapper objectWrapper = new ObjectWrapper(context);
                            Parcel parcelH0 = zzqVarH.h0();
                            zzc.c(parcelH0, objectWrapper);
                            parcelH0.writeString(str);
                            parcelH0.writeInt(z6 ? 1 : 0);
                            Parcel parcelG1 = zzqVarH.g0(parcelH0, 5);
                            i10 = parcelG1.readInt();
                            parcelG1.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
                            Parcel parcelH1 = zzqVarH.h0();
                            zzc.c(parcelH1, objectWrapper2);
                            parcelH1.writeString(str);
                            parcelH1.writeInt(z6 ? 1 : 0);
                            Parcel parcelG2 = zzqVarH.g0(parcelH1, 3);
                            i10 = parcelG2.readInt();
                            parcelG2.recycle();
                        }
                        return i10;
                    } catch (RemoteException e13) {
                        remoteException = e13;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                Preconditions.i(context);
                throw th5;
            } catch (Exception unused3) {
                throw th5;
            }
        }
    }

    public static int e(Context context, String str, boolean z6, boolean z10) throws Throwable {
        Throwable th;
        Exception exc;
        boolean z11;
        Cursor cursor = null;
        try {
            try {
                boolean z12 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z6 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f8299k.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z13 = false;
                            int i10 = cursorQuery.getInt(0);
                            if (i10 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f8295f = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f8297h = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z11 = cursorQuery.getInt(columnIndex2) != 0;
                                            f8296g = z11;
                                        } else {
                                            z11 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                F2.d dVar = (F2.d) j.get();
                                if (dVar == null || dVar.a != null) {
                                    z12 = false;
                                } else {
                                    dVar.a = cursorQuery;
                                }
                                cursor = z12 ? null : cursorQuery;
                                z13 = z11;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z10 && z13) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i10;
                            if (exc instanceof LoadingException) {
                                throw exc;
                            }
                            throw new LoadingException("V2 version check failed: " + exc.getMessage(), exc);
                        }
                    } catch (Exception e10) {
                        exc = e10;
                    } catch (Throwable th3) {
                        cursor = cursorQuery;
                        th = th3;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e11) {
                exc = e11;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void f(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (iInterfaceQueryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) iInterfaceQueryLocalInterface;
                } else {
                    try {
                        zzrVar = new zzr(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        throw new LoadingException("Failed to instantiate dynamite loader", e);
                    } catch (InstantiationException e11) {
                        e = e11;
                        throw new LoadingException("Failed to instantiate dynamite loader", e);
                    } catch (NoSuchMethodException e12) {
                        e = e12;
                        throw new LoadingException("Failed to instantiate dynamite loader", e);
                    } catch (InvocationTargetException e13) {
                        e = e13;
                        throw new LoadingException("Failed to instantiate dynamite loader", e);
                    }
                }
            }
            f8302n = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e14) {
            e = e14;
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f8298i)) {
            return true;
        }
        boolean z6 = false;
        if (f8298i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.f7833b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z6 = true;
            }
            f8298i = Boolean.valueOf(z6);
            if (z6 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f8296g = true;
            }
        }
        return z6;
    }

    public static zzq h(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = f8301m;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (zzqVar != null) {
                    f8301m = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e10) {
                e10.getMessage();
            }
            return null;
        }
    }

    public final IBinder b(String str) throws LoadingException {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
