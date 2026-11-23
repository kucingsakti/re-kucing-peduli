package p224x2;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectionResult f15773b;

    public s(ConnectionResult connectionResult, int i10) {
        Preconditions.i(connectionResult);
        this.f15773b = connectionResult;
        this.a = i10;
    }
}
