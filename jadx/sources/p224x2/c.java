package p224x2;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f15755b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zabf zabfVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabfVar);
        this.f15755b = connectionProgressReportCallbacks;
    }

    @Override // p224x2.j
    public final void a() {
        this.f15755b.a(new ConnectionResult(16, null));
    }
}
