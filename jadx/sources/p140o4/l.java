package p140o4;

import Q3.u0;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import p081i3.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements OnSuccessListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13769t;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, int i10) {
        this.f13768s = i10;
        this.f13769t = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void c(Object obj) {
        boolean z6;
        switch (this.f13768s) {
            case 0:
                x xVar = (x) obj;
                if (!this.f13769t.f9990e.i() || xVar.f13811h.a() == null) {
                    return;
                }
                synchronized (xVar) {
                    z6 = xVar.f13810g;
                }
                if (z6) {
                    return;
                }
                xVar.h(0L);
                return;
            default:
                CloudMessage cloudMessage = (CloudMessage) obj;
                b bVar = FirebaseMessaging.f9984k;
                FirebaseMessaging firebaseMessaging = this.f13769t;
                firebaseMessaging.getClass();
                if (cloudMessage != null) {
                    u0.h(cloudMessage.f7772s);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
