package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class zzcn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f8552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f8553c;
    public final JobScheduler a;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                Log.isLoggable("JobSchedulerCompat", 6);
                declaredMethod = null;
            }
        } else {
            declaredMethod = null;
        }
        f8552b = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                Log.isLoggable("JobSchedulerCompat", 6);
            }
        }
        f8553c = declaredMethod2;
    }

    public zzcn(JobScheduler jobScheduler) {
        this.a = jobScheduler;
    }
}
