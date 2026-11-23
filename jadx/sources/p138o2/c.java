package p138o2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.rollbar.notifier.sender.SyncSender;
import i2.i;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import p148p2.d;
import p148p2.g;
import p180s2.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f13680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f13681c;

    public c(Context context, d dVar, a aVar) {
        this.a = context;
        this.f13680b = dVar;
        this.f13681c = aVar;
    }

    public final void a(i iVar, int i10, boolean z6) {
        char c10;
        int i11;
        char c11 = 4;
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(SyncSender.UTF_8)));
        adler32.update(iVar.a.getBytes(Charset.forName(SyncSender.UTF_8)));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        p051f2.d dVar = iVar.f12182c;
        adler32.update(byteBufferAllocate.putInt(a.a(dVar)).array());
        byte[] bArr = iVar.f12181b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z6) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    c10 = c11;
                    i11 = 3;
                    break;
                }
                JobInfo next = it.next();
                c10 = c11;
                int i12 = next.getExtras().getInt("attemptNumber");
                i11 = 3;
                if (next.getId() == value) {
                    if (i12 < i10) {
                        break;
                    }
                    com.bumptech.glide.d.i("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                    return;
                }
                c11 = c10;
            }
        } else {
            c10 = c11;
            i11 = 3;
            break;
        }
        SQLiteDatabase sQLiteDatabaseA = ((g) this.f13680b).a();
        String strValueOf = String.valueOf(a.a(dVar));
        String str = iVar.a;
        Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            a aVar = this.f13681c;
            Long l4 = lValueOf;
            builder.setMinimumLatency(aVar.a(dVar, jLongValue, i10));
            Set set = ((b) aVar.f13677b.get(dVar)).f13679c;
            if (set.contains(d.f13682s)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(d.f13684u)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(d.f13683t)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Integer numValueOf = Integer.valueOf(value);
            Long lValueOf2 = Long.valueOf(aVar.a(dVar, jLongValue, i10));
            Integer numValueOf2 = Integer.valueOf(i10);
            Object[] objArr = new Object[5];
            objArr[0] = iVar;
            objArr[1] = numValueOf;
            objArr[2] = lValueOf2;
            objArr[i11] = l4;
            objArr[c10] = numValueOf2;
            if (Log.isLoggable(com.bumptech.glide.d.q("JobInfoScheduler"), i11)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
