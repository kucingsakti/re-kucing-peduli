package p205v2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.zze;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile zzag f15417e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f15419g;
    public static final b a = new b(0, c.h0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f15414b = new b(1, c.h0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f15415c = new b(2, c.h0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f15416d = new b(3, c.h0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f15418f = new Object();

    public static synchronized void a(Context context) {
        if (f15419g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f15419g = context.getApplicationContext();
        }
    }

    public static h b(String str, d dVar, boolean z6, boolean z10) {
        try {
            c();
            Preconditions.i(f15419g);
            try {
                return f15417e.E(new zzs(str, dVar, z6, z10), new ObjectWrapper(f15419g.getPackageManager())) ? h.f15421c : new g(new zze(z6, str, dVar));
            } catch (RemoteException e10) {
                return new h("module call", false, e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            return new h("module init: ".concat(String.valueOf(e11.getMessage())), false, e11);
        }
    }

    public static void c() {
        zzag zzaeVar;
        if (f15417e != null) {
            return;
        }
        Preconditions.i(f15419g);
        synchronized (f15418f) {
            try {
                if (f15417e == null) {
                    IBinder iBinderB = DynamiteModule.c(f15419g, DynamiteModule.f8293d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = zzaf.f8165b;
                    if (iBinderB == null) {
                        zzaeVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        zzaeVar = iInterfaceQueryLocalInterface instanceof zzag ? (zzag) iInterfaceQueryLocalInterface : new zzae(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    f15417e = zzaeVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
