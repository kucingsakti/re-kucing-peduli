package Q3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.messaging.FirebaseMessaging;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p039e0.C0606c;
import p039e0.C0608e;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {
    public static long a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f4306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f4307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f4308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Class f4309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f4310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f4311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f4312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Field f4313i;
    public static boolean j;

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0067->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    public static final Object a(List list, p039e0.u uVar, p144o8.c cVar) throws Throwable {
        C0606c c0606c;
        List list2;
        p210v8.t tVar;
        Iterator it;
        Throwable th;
        p200u8.b bVar;
        if (cVar instanceof C0606c) {
            c0606c = (C0606c) cVar;
            int i10 = c0606c.f10615v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0606c.f10615v = i10 - Integer.MIN_VALUE;
            } else {
                c0606c = new C0606c(cVar);
            }
        } else {
            c0606c = new C0606c(cVar);
        }
        Object obj = c0606c.f10614u;
        Object obj2 = p134n8.a.f13404s;
        int i11 = c0606c.f10615v;
        if (i11 != 0) {
            if (i11 == 1) {
                list2 = (List) c0606c.f10612s;
                J7.a.v(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c0606c.f10613t;
                tVar = (p210v8.t) c0606c.f10612s;
                try {
                    J7.a.v(obj);
                } catch (Throwable th2) {
                    Object obj3 = tVar.f15466s;
                    if (obj3 == null) {
                        tVar.f15466s = th2;
                    } else {
                        C8.E.e((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                bVar = (p200u8.b) it.next();
                c0606c.f10612s = tVar;
                c0606c.f10613t = it;
                c0606c.f10615v = 2;
                if (bVar.invoke(c0606c) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) tVar.f15466s;
            if (th == null) {
                return p076h8.m.a;
            }
            throw th;
        }
        J7.a.v(obj);
        ArrayList arrayList = new ArrayList();
        C0608e c0608e = new C0608e(list, arrayList, null);
        c0606c.f10612s = arrayList;
        c0606c.f10615v = 1;
        if (uVar.a(c0608e, c0606c) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        tVar = new p210v8.t();
        it = list2.iterator();
        while (it.hasNext()) {
            bVar = (p200u8.b) it.next();
            c0606c.f10612s = tVar;
            c0606c.f10613t = it;
            c0606c.f10615v = 2;
            if (bVar.invoke(c0606c) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) tVar.f15466s;
        if (th == null) {
            return p076h8.m.a;
        }
        throw th;
    }

    public static boolean b() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            D3.g.c();
            D3.g gVarC = D3.g.c();
            gVarC.a();
            Context context = gVarC.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static void c(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (I3.h hVar : (Set) it2.next()) {
                        for (I3.j jVar : hVar.a.f2019c) {
                            if (jVar.f2037c == 0) {
                                Set<I3.h> set = (Set) map.get(new I3.i(jVar.a, jVar.f2036b == 2));
                                if (set != null) {
                                    for (I3.h hVar2 : set) {
                                        hVar.f2033b.add(hVar2);
                                        hVar2.f2034c.add(hVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<I3.h> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (I3.h hVar3 : hashSet) {
                    if (hVar3.f2034c.isEmpty()) {
                        hashSet2.add(hVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    I3.h hVar4 = (I3.h) hashSet2.iterator().next();
                    hashSet2.remove(hVar4);
                    i10++;
                    for (I3.h hVar5 : hVar4.f2033b) {
                        hVar5.f2034c.remove(hVar4);
                        if (hVar5.f2034c.isEmpty()) {
                            hashSet2.add(hVar5);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (I3.h hVar6 : hashSet) {
                    if (!hVar6.f2034c.isEmpty() && !hVar6.f2033b.isEmpty()) {
                        arrayList2.add(hVar6.a);
                    }
                }
                throw new DependencyCycleException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            I3.b bVar = (I3.b) it.next();
            I3.h hVar7 = new I3.h(bVar);
            for (I3.p pVar : bVar.f2018b) {
                boolean z6 = bVar.f2021e == 0;
                I3.i iVar = new I3.i(pVar, !z6);
                if (!map.containsKey(iVar)) {
                    map.put(iVar, new HashSet());
                }
                Set set2 = (Set) map.get(iVar);
                if (!set2.isEmpty() && z6) {
                    throw new IllegalArgumentException("Multiple components provide " + pVar + ".");
                }
                set2.add(hVar7);
            }
        }
    }

    public static void d(Object obj) {
        LongSparseArray longSparseArray;
        if (!f4310f) {
            try {
                f4309e = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f4310f = true;
        }
        Class cls = f4309e;
        if (cls == null) {
            return;
        }
        if (!f4312h) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f4311g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            f4312h = true;
        }
        Field field = f4311g;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static final int e(Cursor cursor, String str) {
        String strA;
        p210v8.i.f(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    p210v8.i.e(columnNames, "columnNames");
                    String strConcat = ".".concat(str);
                    String str2 = "." + str + '`';
                    int length = columnNames.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            String str3 = columnNames[i11];
                            int i12 = i10 + 1;
                            if (str3.length() < str.length() + 2 || !(L9.n.B(str3, strConcat) || (str3.charAt(0) == '`' && L9.n.B(str3, str2)))) {
                                i11++;
                                i10 = i12;
                            } else {
                                columnIndex = i10;
                            }
                        } else {
                            columnIndex = -1;
                        }
                    }
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            p210v8.i.e(columnNames2, "c.columnNames");
            strA = p086i8.i.A(columnNames2, null, null, null, 63);
        } catch (Exception unused) {
            strA = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strA);
    }

    public static boolean g() {
        try {
            if (f4306b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f4306b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f4306b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f4306b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0138  */
    /* JADX WARN: Code duplicated, block: B:88:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x015b  */
    /* JADX WARN: Code duplicated, block: B:91:0x015d  */
    public static void h(Intent intent) {
        p051f2.f fVar;
        long j10;
        D3.g gVarC;
        D3.j jVar;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        if (l(intent)) {
            i("_nr", intent.getExtras());
        }
        int iIntValue = 0;
        if (!((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : b()) || (fVar = (p051f2.f) FirebaseMessaging.f9985l.get()) == null) {
            return;
        }
        p150p4.d dVar = null;
        str = null;
        String str4 = null;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            Object obj = extras.get("google.ttl");
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else if (obj instanceof String) {
                try {
                    iIntValue = Integer.parseInt((String) obj);
                } catch (NumberFormatException unused) {
                    Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                }
            }
            int i10 = iIntValue;
            String string = extras.getString("google.to");
            if (TextUtils.isEmpty(string)) {
                try {
                    D3.g gVarC2 = D3.g.c();
                    try {
                        Object obj2 = p082i4.c.f12268m;
                        string = (String) Tasks.a(((p082i4.c) gVarC2.b(p082i4.d.class)).d());
                    } catch (InterruptedException e10) {
                        e = e10;
                        throw new RuntimeException(e);
                    }
                } catch (InterruptedException | ExecutionException e11) {
                    e = e11;
                }
            }
            String str5 = string;
            D3.g gVarC3 = D3.g.c();
            gVarC3.a();
            String packageName = gVarC3.a.getPackageName();
            p150p4.b bVar = p140o4.n.g(extras) ? p150p4.b.DISPLAY_NOTIFICATION : p150p4.b.DATA_MESSAGE;
            String string2 = extras.getString("google.message_id");
            if (string2 == null) {
                string2 = extras.getString("message_id");
            }
            String str6 = string2 != null ? string2 : "";
            String string3 = extras.getString("from");
            if (string3 != null && string3.startsWith("/topics/")) {
                str4 = string3;
            }
            String str7 = str4 != null ? str4 : "";
            String string4 = extras.getString("collapse_key");
            String str8 = string4 != null ? string4 : "";
            String string5 = extras.getString("google.c.a.m_l");
            String str9 = string5 != null ? string5 : "";
            String string6 = extras.getString("google.c.a.c_l");
            String str10 = string6 != null ? string6 : "";
            if (extras.containsKey("google.c.sender.id")) {
                try {
                    j10 = Long.parseLong(extras.getString("google.c.sender.id"));
                } catch (NumberFormatException e12) {
                    Log.w("FirebaseMessaging", "error parsing project number", e12);
                    gVarC = D3.g.c();
                    gVarC.a();
                    jVar = gVarC.f1050c;
                    str = jVar.f1066e;
                    if (str != null) {
                        try {
                            j10 = Long.parseLong(str);
                        } catch (NumberFormatException e13) {
                            Log.w("FirebaseMessaging", "error parsing sender ID", e13);
                            gVarC.a();
                            str2 = jVar.f1063b;
                            if (str2.startsWith("1:")) {
                                strArrSplit = str2.split(":");
                                if (strArrSplit.length < 2) {
                                    j10 = 0;
                                } else {
                                    str3 = strArrSplit[1];
                                    if (str3.isEmpty()) {
                                        j10 = 0;
                                    } else {
                                        try {
                                            j10 = Long.parseLong(str3);
                                        } catch (NumberFormatException e14) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e14);
                                            j10 = 0;
                                        }
                                    }
                                }
                            } else {
                                try {
                                    j10 = Long.parseLong(str2);
                                } catch (NumberFormatException e15) {
                                    Log.w("FirebaseMessaging", "error parsing app ID", e15);
                                    j10 = 0;
                                }
                            }
                        }
                    } else {
                        gVarC.a();
                        str2 = jVar.f1063b;
                        if (str2.startsWith("1:")) {
                            j10 = Long.parseLong(str2);
                        } else {
                            strArrSplit = str2.split(":");
                            if (strArrSplit.length < 2) {
                                j10 = 0;
                            } else {
                                str3 = strArrSplit[1];
                                if (str3.isEmpty()) {
                                    j10 = 0;
                                } else {
                                    j10 = Long.parseLong(str3);
                                }
                            }
                        }
                    }
                }
            } else {
                gVarC = D3.g.c();
                gVarC.a();
                jVar = gVarC.f1050c;
                str = jVar.f1066e;
                if (str != null) {
                    j10 = Long.parseLong(str);
                } else {
                    gVarC.a();
                    str2 = jVar.f1063b;
                    if (str2.startsWith("1:")) {
                        j10 = Long.parseLong(str2);
                    } else {
                        strArrSplit = str2.split(":");
                        if (strArrSplit.length < 2) {
                            j10 = 0;
                        } else {
                            str3 = strArrSplit[1];
                            if (str3.isEmpty()) {
                                j10 = 0;
                            } else {
                                j10 = Long.parseLong(str3);
                            }
                        }
                    }
                }
            }
            if (j10 <= 0) {
                j10 = 0;
            }
            dVar = new p150p4.d(j10, str6, str5, bVar, packageName, str8, i10, str7, str9, str10);
        }
        if (dVar == null) {
            return;
        }
        try {
            ((i2.o) fVar).a("FCM_CLIENT_EVENT_LOGGING", new p051f2.c("proto"), new Y9.a(8)).y(new p051f2.a(new p150p4.e(dVar), p051f2.d.f11424s, new p051f2.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new Y9.a(3));
        } catch (RuntimeException e16) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e16);
        }
    }

    public static void i(String str, Bundle bundle) {
        try {
            D3.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String str2 = p140o4.n.g(bundle) ? "display" : JsonStorageKeyNames.DATA_KEY;
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            F3.a aVar = (F3.a) D3.g.c().b(F3.a.class);
            if (aVar != null) {
                ((F3.b) aVar).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static void j(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (IllegalAccessException e10) {
                n(cls, e10);
                throw null;
            } catch (InstantiationException e11) {
                n(cls, e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                n(cls, e12);
                throw null;
            } catch (InvocationTargetException e13) {
                n(cls, e13);
                throw null;
            }
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    public static final X8.b k(Fa.e eVar, p009a9.b bVar) {
        p210v8.i.f(eVar, "<this>");
        p210v8.i.f(bVar, "annotationsOwner");
        return new X8.b(eVar, bVar, false);
    }

    public static boolean l(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void m(String str, int i10, p200u8.a aVar, int i11) {
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        p113l8.a aVar2 = new p113l8.a(aVar);
        if (i10 > 0) {
            aVar2.setPriority(i10);
        }
        if (str != null) {
            aVar2.setName(str);
        }
        aVar2.start();
    }

    public static void n(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public abstract String f();
}
