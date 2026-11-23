package P2;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements OnSuccessListener, OnFailureListener, OnCanceledListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f3838s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f3839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f f3840u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3841v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Exception f3844y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3845z;

    public a(int i10, f fVar) {
        this.f3839t = i10;
        this.f3840u = fVar;
    }

    public final void a() {
        int i10 = this.f3841v + this.f3842w + this.f3843x;
        int i11 = this.f3839t;
        if (i10 == i11) {
            Exception exc = this.f3844y;
            f fVar = this.f3840u;
            if (exc == null) {
                if (this.f3845z) {
                    fVar.q();
                    return;
                } else {
                    fVar.p(null);
                    return;
                }
            }
            fVar.o(new ExecutionException(this.f3842w + " out of " + i11 + " underlying tasks failed", this.f3844y));
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void c(Object obj) {
        synchronized (this.f3838s) {
            this.f3841v++;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void h() {
        synchronized (this.f3838s) {
            this.f3843x++;
            this.f3845z = true;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.f3838s) {
            this.f3842w++;
            this.f3844y = exc;
            a();
        }
    }
}
