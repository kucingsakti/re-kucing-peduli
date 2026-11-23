package E4;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.kcstream.cing.activity.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1443s;

    public /* synthetic */ w(int i10) {
        this.f1443s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1443s) {
            case 0:
                int i10 = MainActivity.c0;
                break;
            default:
                int i11 = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
        }
    }
}
