package p196u2;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f15298b = new TaskCompletionSource();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f15300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15301e;

    public c(int i10, int i11, Bundle bundle, int i12) {
        this.f15301e = i12;
        this.a = i10;
        this.f15299c = i11;
        this.f15300d = bundle;
    }

    public final boolean a() {
        switch (this.f15301e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            zztVar.toString();
        }
        this.f15298b.a(zztVar);
    }

    public final String toString() {
        return "Request { what=" + this.f15299c + " id=" + this.a + " oneWay=" + a() + "}";
    }
}
