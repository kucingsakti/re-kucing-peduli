package p224x2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zac;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends zac {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f15772b;

    public q(TaskCompletionSource taskCompletionSource) {
        super(4);
        this.f15772b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        this.f15772b.c(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(RuntimeException runtimeException) {
        this.f15772b.c(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zabq zabqVar) throws DeadObjectException {
        try {
            h(zabqVar);
        } catch (DeadObjectException e10) {
            a(zai.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(zai.e(e11));
        } catch (RuntimeException e12) {
            this.f15772b.c(e12);
        }
    }

    public abstract void h(zabq zabqVar);
}
