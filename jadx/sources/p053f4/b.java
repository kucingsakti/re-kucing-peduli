package p053f4;

import D3.g;
import I3.e;
import I3.p;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f11430t;

    public /* synthetic */ b(p pVar, int i10) {
        this.f11429s = i10;
        this.f11430t = pVar;
    }

    @Override // I3.e
    public final Object h(Fa.e eVar) {
        switch (this.f11429s) {
            case 0:
                return new d((Context) eVar.a(Context.class), ((g) eVar.a(g.class)).d(), eVar.z(e.class), eVar.d(p160q4.b.class), (Executor) eVar.b(this.f11430t));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f11430t, eVar);
        }
    }
}
