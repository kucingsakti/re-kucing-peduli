package O3;

import Q3.C0369b0;
import Q3.C0371c0;
import Q3.T;
import Q3.U;
import Q3.V;
import Q3.X;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f3574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f3575g;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f3576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0343a f3577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o1.r f3578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V3.b f3579e;

    static {
        HashMap map = new HashMap();
        f3574f = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f3575g = "Crashlytics Android SDK/19.0.3";
    }

    public s(Context context, x xVar, C0343a c0343a, o1.r rVar, V3.b bVar) {
        this.a = context;
        this.f3576b = xVar;
        this.f3577c = c0343a;
        this.f3578d = rVar;
        this.f3579e = bVar;
    }

    public static U c(o1.h hVar, int i10) {
        String str = (String) hVar.f13633t;
        int i11 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) hVar.f13634u;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        o1.h hVar2 = (o1.h) hVar.f13635v;
        if (i10 >= 8) {
            for (o1.h hVar3 = hVar2; hVar3 != null; hVar3 = (o1.h) hVar3.f13635v) {
                i11++;
            }
        }
        int i12 = i11;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b3 = (byte) (0 | 1);
        U uC = null;
        if (hVar2 != null && i12 == 0) {
            uC = c(hVar2, i10 + 1);
        }
        if (b3 == 1) {
            return new U(str, (String) hVar.f13632s, listD, uC, i12);
        }
        StringBuilder sb = new StringBuilder();
        if ((b3 & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            X x8 = new X();
            x8.f4152e = i10;
            x8.f4153f = (byte) (x8.f4153f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            x8.a = jMax;
            byte b3 = (byte) (x8.f4153f | 1);
            x8.f4153f = b3;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            x8.f4149b = str;
            x8.f4150c = fileName;
            x8.f4151d = lineNumber;
            x8.f4153f = (byte) (b3 | 2);
            arrayList.add(x8.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static V e() {
        byte b3 = (byte) 1;
        if (b3 == 1) {
            return new V("0", "0", 0L);
        }
        StringBuilder sb = new StringBuilder();
        if (b3 == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }

    public final List a() {
        byte b3 = (byte) (((byte) (0 | 1)) | 2);
        C0343a c0343a = this.f3577c;
        String str = (String) c0343a.f3512d;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        if (b3 == 3) {
            return Collections.singletonList(new T(0L, 0L, str, (String) c0343a.f3510b));
        }
        StringBuilder sb = new StringBuilder();
        if ((b3 & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b3 & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
    }

    public final C0371c0 b(int i10) {
        boolean z6;
        Float fValueOf;
        int i11;
        Context context = this.a;
        boolean z10 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z6 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    fValueOf = (intExtra2 == -1 || intExtra3 == -1) ? null : Float.valueOf(intExtra2 / intExtra3);
                } catch (IllegalStateException unused) {
                }
            } else {
                fValueOf = null;
                z6 = false;
            }
        } catch (IllegalStateException unused2) {
            z6 = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        if (!z6 || fValueOf == null) {
            i11 = 1;
        } else {
            i11 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
        }
        if (!g.g() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z10 = true;
        }
        long jB = g.b(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jB - memoryInfo.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        C0369b0 c0369b0 = new C0369b0();
        c0369b0.a = dValueOf;
        c0369b0.f4176b = i11;
        byte b3 = (byte) (c0369b0.f4181g | 1);
        c0369b0.f4177c = z10;
        c0369b0.f4178d = i10;
        c0369b0.f4179e = j;
        c0369b0.f4180f = blockCount;
        c0369b0.f4181g = (byte) (((byte) (((byte) (((byte) (b3 | 2)) | 4)) | 8)) | 16);
        return c0369b0.a();
    }
}
