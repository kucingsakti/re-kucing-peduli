package L3;

import Q3.C0367a0;
import Q3.D0;
import Q3.Z;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p086i8.k;
import p086i8.m;
import p086i8.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    public static C0367a0 a(d dVar, String str, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        dVar.getClass();
        i.f(str, "processName");
        Z z6 = new Z();
        z6.a = str;
        z6.f4158b = i10;
        byte b3 = (byte) (z6.f4161e | 1);
        z6.f4159c = i11;
        z6.f4160d = false;
        z6.f4161e = (byte) (((byte) (b3 | 2)) | 4);
        return z6.a();
    }

    public static ArrayList b(Context context) {
        i.f(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = s.f12328s;
        }
        ArrayList arrayListR = k.R(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.H(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            Z z6 = new Z();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            z6.a = str2;
            z6.f4158b = runningAppProcessInfo.pid;
            byte b3 = (byte) (z6.f4161e | 1);
            z6.f4159c = runningAppProcessInfo.importance;
            z6.f4161e = (byte) (b3 | 2);
            z6.f4160d = i.a(str2, str);
            z6.f4161e = (byte) (z6.f4161e | 4);
            arrayList2.add(z6.a());
        }
        return arrayList2;
    }

    public D0 c(Context context) {
        Object next;
        String processName;
        i.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = b(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C0367a0) ((D0) next)).f4165b != iMyPid);
        D0 d3 = (D0) next;
        if (d3 != null) {
            return d3;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            processName = Process.myProcessName();
            i.e(processName, "{\n      Process.myProcessName()\n    }");
        } else if (i10 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        return a(this, processName, iMyPid, 0, 12);
    }
}
