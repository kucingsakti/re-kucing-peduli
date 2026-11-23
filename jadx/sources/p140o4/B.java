package p140o4;

import E4.C0187a;
import O3.z;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import p081i3.b;

/* JADX INFO: loaded from: classes.dex */
public final class B extends Binder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f13728b;

    public B(b bVar) {
        this.f13728b = bVar;
    }

    public final void a(C c10) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        Intent intent = c10.a;
        g gVar = (g) this.f13728b.f12212t;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.f13753s.execute(new z(gVar, intent, taskCompletionSource, 8));
        taskCompletionSource.a.m(new G0.b(0), new C0187a(c10, 23));
    }
}
