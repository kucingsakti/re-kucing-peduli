package p224x2;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f15763s;

    public k(l lVar) {
        this.f15763s = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client = this.f15763s.a.f7992c;
        client.f(client.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
