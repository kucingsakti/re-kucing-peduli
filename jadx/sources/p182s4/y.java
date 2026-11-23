package p182s4;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p070h0.e;
import p086i8.k;
import p086i8.m;
import p086i8.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final e a = new e("session_id");

    public static ArrayList a(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            i.e(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new C0781s(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, i.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }
}
