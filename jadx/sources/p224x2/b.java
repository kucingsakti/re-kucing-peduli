package p224x2;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15752b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zaaw zaawVar, zaaw zaawVar2, zak zakVar) {
        super(zaawVar);
        this.f15753c = zaawVar2;
        this.f15754d = zakVar;
    }

    @Override // p224x2.j
    public final void a() {
        IAccountAccessor zzwVar;
        Object obj = this.f15754d;
        Object obj2 = this.f15753c;
        switch (this.f15752b) {
            case 0:
                ((d) obj).f15757v.k((ConnectionResult) obj2);
                break;
            default:
                zaaw zaawVar = (zaaw) obj2;
                if (zaawVar.n(0)) {
                    zak zakVar = (zak) obj;
                    ConnectionResult connectionResult = zakVar.f9378t;
                    if (connectionResult.T()) {
                        zav zavVar = zakVar.f9379u;
                        Preconditions.i(zavVar);
                        ConnectionResult connectionResult2 = zavVar.f8157u;
                        if (!connectionResult2.T()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                            zaawVar.k(connectionResult2);
                        } else {
                            zaawVar.f7948n = true;
                            IBinder iBinder = zavVar.f8156t;
                            if (iBinder == null) {
                                zzwVar = null;
                            } else {
                                int i10 = IAccountAccessor.Stub.f8112b;
                                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                zzwVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzw(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                            }
                            Preconditions.i(zzwVar);
                            zaawVar.f7949o = zzwVar;
                            zaawVar.f7950p = zavVar.f8158v;
                            zaawVar.f7951q = zavVar.f8159w;
                            zaawVar.m();
                        }
                    } else if (zaawVar.f7946l && !connectionResult.K()) {
                        zaawVar.h();
                        zaawVar.m();
                    } else {
                        zaawVar.k(connectionResult);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, zabf zabfVar, ConnectionResult connectionResult) {
        super(zabfVar);
        this.f15754d = dVar;
        this.f15753c = connectionResult;
    }
}
