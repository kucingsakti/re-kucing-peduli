package com.onesignal.core.services;

import android.app.job.JobParameters;
import android.app.job.JobService;
import kotlin.Metadata;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p200u8.b;
import p210v8.i;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/onesignal/core/services/SyncJobService;", "Landroid/app/job/JobService;", "()V", "onStartJob", "", "jobParameters", "Landroid/app/job/JobParameters;", "onStopJob", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SyncJobService extends JobService {

    public static final class a extends g implements b {
        final /* synthetic */ t $backgroundService;
        final /* synthetic */ JobParameters $jobParameters;
        int label;
        final /* synthetic */ SyncJobService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, SyncJobService syncJobService, JobParameters jobParameters, d<? super a> dVar) {
            super(1, dVar);
            this.$backgroundService = tVar;
            this.this$0 = syncJobService;
            this.$jobParameters = jobParameters;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return new a(this.$backgroundService, this.this$0, this.$jobParameters, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                Z4.a aVar2 = (Z4.a) this.$backgroundService.f15466s;
                this.label = 1;
                if (aVar2.runBackgroundServices(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            com.onesignal.debug.internal.logging.b.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + ((Z4.a) this.$backgroundService.f15466s).getNeedsJobReschedule(), null, 2, null);
            boolean needsJobReschedule = ((Z4.a) this.$backgroundService.f15466s).getNeedsJobReschedule();
            ((Z4.a) this.$backgroundService.f15466s).setNeedsJobReschedule(false);
            this.this$0.jobFinished(this.$jobParameters, needsJobReschedule);
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(d<? super m> dVar) {
            return ((a) create(dVar)).invokeSuspend(m.a);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        i.f(jobParameters, "jobParameters");
        if (!P4.d.b(this)) {
            return false;
        }
        t tVar = new t();
        tVar.f15466s = P4.d.a().getService(Z4.a.class);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(tVar, this, jobParameters, null), 1, null);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        i.f(jobParameters, "jobParameters");
        boolean zCancelRunBackgroundServices = ((Z4.a) P4.d.a().getService(Z4.a.class)).cancelRunBackgroundServices();
        com.onesignal.debug.internal.logging.b.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + zCancelRunBackgroundServices, null, 2, null);
        return zCancelRunBackgroundServices;
    }
}
