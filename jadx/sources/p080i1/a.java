package p080i1;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i10, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i10, j, pendingIntent);
    }
}
