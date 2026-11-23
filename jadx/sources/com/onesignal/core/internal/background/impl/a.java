package com.onesignal.core.internal.background.impl;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import N9.c0;
import N9.k0;
import S9.r;
import X4.e;
import X4.f;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.onesignal.core.services.SyncJobService;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.JobCancellationException;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e, Z4.a, p100k5.b {
    public static final C0022a Companion = new C0022a(null);
    private static final int SYNC_TASK_ID = 2071862118;
    private final f _applicationService;
    private final List<Z4.b> _backgroundServices;
    private final p110l5.a _time;
    private c0 backgroundSyncJob;
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass;

    /* JADX INFO: renamed from: com.onesignal.core.internal.background.impl.a$a, reason: collision with other inner class name */
    public static final class C0022a {
        public /* synthetic */ C0022a(p210v8.e eVar) {
            this();
        }

        private C0022a() {
        }
    }

    public static final class b extends g implements c {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.onesignal.core.internal.background.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0023a extends g implements c {
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0023a(a aVar, d<? super C0023a> dVar) {
                super(2, dVar);
                this.this$0 = aVar;
            }

            @Override // p144o8.a
            public final d<m> create(Object obj, d<?> dVar) {
                return new C0023a(this.this$0, dVar);
            }

            @Override // p200u8.c
            public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super m> dVar) {
                return ((C0023a) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                p134n8.a aVar = p134n8.a.f13404s;
                int i10 = this.label;
                if (i10 == 0) {
                    J7.a.v(obj);
                    Object obj2 = this.this$0.lock;
                    a aVar2 = this.this$0;
                    synchronized (obj2) {
                        aVar2.nextScheduledSyncTimeMs = 0L;
                    }
                    it = this.this$0._backgroundServices.iterator();
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$0;
                    J7.a.v(obj);
                }
                while (it.hasNext()) {
                    Z4.b bVar = (Z4.b) it.next();
                    this.L$0 = it;
                    this.label = 1;
                    if (bVar.backgroundRun(this) == aVar) {
                        return aVar;
                    }
                }
                this.this$0.scheduleBackground();
                return m.a;
            }
        }

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final d<m> create(Object obj, d<?> dVar) {
            b bVar = a.this.new b(dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super m> dVar) {
            return ((b) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            InterfaceC0341y interfaceC0341y = (InterfaceC0341y) this.L$0;
            com.onesignal.debug.internal.logging.b.debug$default("OSBackground sync, calling initWithContext", null, 2, null);
            a aVar = a.this;
            aVar.backgroundSyncJob = AbstractC0342z.n(interfaceC0341y, I.f3414b, new C0023a(aVar, null), 2);
            return m.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f fVar, p110l5.a aVar, List<? extends Z4.b> list) {
        i.f(fVar, "_applicationService");
        i.f(aVar, "_time");
        i.f(list, "_backgroundServices");
        this._applicationService = fVar;
        this._time = aVar;
        this._backgroundServices = list;
        this.lock = new Object();
        this.syncServiceJobClass = SyncJobService.class;
    }

    private final void cancelBackgroundSyncTask() {
        com.onesignal.debug.internal.logging.b.debug$default(a.class.getSimpleName().concat(" cancel background sync"), null, 2, null);
        synchronized (this.lock) {
            Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
            i.d(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(SYNC_TASK_ID);
        }
    }

    private final void cancelSyncTask() {
        synchronized (this.lock) {
            this.nextScheduledSyncTimeMs = 0L;
            cancelBackgroundSyncTask();
        }
    }

    private final boolean hasBootPermission() {
        return J.f.a(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        c0 c0Var;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        i.d(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (c0Var = this.backgroundSyncJob) != null) {
                i.c(c0Var);
                if (c0Var.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<Z4.b> it = this._backgroundServices.iterator();
        Long l4 = null;
        while (it.hasNext()) {
            Long scheduleBackgroundRunIn = it.next().getScheduleBackgroundRunIn();
            if (scheduleBackgroundRunIn != null && (l4 == null || scheduleBackgroundRunIn.longValue() < l4.longValue())) {
                l4 = scheduleBackgroundRunIn;
            }
        }
        if (l4 != null) {
            scheduleSyncTask(l4.longValue());
        }
    }

    private final void scheduleBackgroundSyncTask(long j) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(j);
        }
    }

    private final void scheduleSyncServiceAsJob(long j) {
        com.onesignal.debug.internal.logging.b.debug$default("OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j, null, 2, null);
        if (isJobIdRunning()) {
            com.onesignal.debug.internal.logging.b.verbose$default("OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null, 2, null);
            setNeedsJobReschedule(true);
            return;
        }
        Context appContext = this._applicationService.getAppContext();
        i.c(appContext);
        Class<?> cls = this.syncServiceJobClass;
        i.c(cls);
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(j).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        i.c(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        i.d(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            com.onesignal.debug.internal.logging.b.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e10) {
            com.onesignal.debug.internal.logging.b.error("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e10);
        }
    }

    private final void scheduleSyncTask(long j) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs != 0 && this._time.getCurrentTimeMillis() + j > this.nextScheduledSyncTimeMs) {
                com.onesignal.debug.internal.logging.b.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, null, 2, null);
            } else {
                if (j < 5000) {
                    j = 5000;
                }
                scheduleBackgroundSyncTask(j);
                this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + j;
            }
        }
    }

    @Override // Z4.a
    public boolean cancelRunBackgroundServices() {
        c0 c0Var = this.backgroundSyncJob;
        if (c0Var == null || !c0Var.a()) {
            return false;
        }
        c0 c0Var2 = this.backgroundSyncJob;
        i.c(c0Var2);
        k0 k0Var = (k0) c0Var2;
        k0Var.k(new JobCancellationException(k0Var.n(), null, k0Var));
        return true;
    }

    @Override // Z4.a
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // X4.e
    public void onFocus(boolean z6) {
        cancelSyncTask();
    }

    @Override // X4.e
    public void onUnfocused() {
        scheduleBackground();
    }

    @Override // Z4.a
    public Object runBackgroundServices(d<? super m> dVar) throws Throwable {
        b bVar = new b(null);
        r rVar = new r(dVar, dVar.getContext());
        Object objN = C3.b.N(rVar, rVar, bVar);
        return objN == p134n8.a.f13404s ? objN : m.a;
    }

    @Override // Z4.a
    public void setNeedsJobReschedule(boolean z6) {
        this.needsJobReschedule = z6;
    }

    @Override // p100k5.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }
}
