package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.S;
import java.util.Arrays;
import java.util.HashMap;
import o1.i;
import p050f1.q;
import p061g1.c;
import p061g1.o;
import p089j1.d;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f7226v = q.c("SystemJobService");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o f7227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f7228t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final S f7229u = new S(14);

    public static i a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new i(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p061g1.c
    public final void f(i iVar, boolean z6) {
        JobParameters jobParameters;
        q.a().getClass();
        synchronized (this.f7228t) {
            jobParameters = (JobParameters) this.f7228t.remove(iVar);
        }
        this.f7229u.v(iVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z6);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            o oVarB = o.b(getApplicationContext());
            this.f7227s = oVarB;
            oVarB.f11502f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            q.a().d(f7226v, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        o oVar = this.f7227s;
        if (oVar != null) {
            oVar.f11502f.g(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Y1.c cVar;
        if (this.f7227s == null) {
            q.a().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        i iVarA = a(jobParameters);
        if (iVarA == null) {
            q.a().getClass();
            return false;
        }
        synchronized (this.f7228t) {
            try {
                if (this.f7228t.containsKey(iVarA)) {
                    q qVarA = q.a();
                    iVarA.toString();
                    qVarA.getClass();
                    return false;
                }
                q qVarA2 = q.a();
                iVarA.toString();
                qVarA2.getClass();
                this.f7228t.put(iVarA, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    cVar = new Y1.c(8);
                    if (p089j1.c.b(jobParameters) != null) {
                        cVar.f5671u = Arrays.asList(p089j1.c.b(jobParameters));
                    }
                    if (p089j1.c.a(jobParameters) != null) {
                        cVar.f5670t = Arrays.asList(p089j1.c.a(jobParameters));
                    }
                    if (i10 >= 28) {
                        cVar.f5672v = d.a(jobParameters);
                    }
                } else {
                    cVar = null;
                }
                this.f7227s.f(this.f7229u.x(iVarA), cVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (this.f7227s == null) {
            q.a().getClass();
            return true;
        }
        i iVarA = a(jobParameters);
        if (iVarA == null) {
            q.a().getClass();
            return false;
        }
        q qVarA = q.a();
        iVarA.toString();
        qVarA.getClass();
        synchronized (this.f7228t) {
            this.f7228t.remove(iVarA);
        }
        p061g1.i iVarV = this.f7229u.v(iVarA);
        if (iVarV != null) {
            this.f7227s.g(iVarV);
        }
        return !this.f7227s.f11502f.d(iVarA.a);
    }
}
