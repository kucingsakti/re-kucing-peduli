package M2;

import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzhn;
import com.google.android.gms.measurement.internal.zznc;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Callable, N7.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2912s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f2913t;

    public /* synthetic */ J(Object obj, int i10) {
        this.f2912s = i10;
        this.f2913t = obj;
    }

    @Override // N7.c
    public Object apply(Object obj) {
        return (Throwable) this.f2913t;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2912s) {
            case 0:
                zzhn zzhnVar = (zzhn) this.f2913t;
                zzhnVar.f9150b.b0();
                Y y6 = zzhnVar.f9150b.f9311z;
                zznc.n(y6);
                y6.W0();
                ((zzhj) y6.f577s).getClass();
                throw new IllegalStateException("Unexpected call on client side");
            case 1:
                return (Throwable) this.f2913t;
            case 2:
                p040e1.h hVar = new p040e1.h();
                hVar.a = (JsReplyProxyBoundaryInterface) this.f2913t;
                return hVar;
            default:
                synchronized (((p214w1.c) this.f2913t)) {
                    try {
                        p214w1.c cVar = (p214w1.c) this.f2913t;
                        if (cVar.f15521A == null) {
                            return null;
                        }
                        cVar.B();
                        if (((p214w1.c) this.f2913t).j()) {
                            ((p214w1.c) this.f2913t).t();
                            ((p214w1.c) this.f2913t).f15523C = 0;
                        }
                        return null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    public J(zzhn zzhnVar, zzbd zzbdVar, String str) {
        this.f2912s = 0;
        this.f2913t = zzhnVar;
    }
}
