package com.google.firebase.sessions;

import D3.g;
import H3.a;
import H3.b;
import I3.c;
import I3.p;
import N9.AbstractC0337u;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import p051f2.f;
import p082i4.d;
import p086i8.l;
import p182s4.C0776m;
import p182s4.C0778o;
import p182s4.D;
import p182s4.H;
import p182s4.InterfaceC0783u;
import p182s4.K;
import p182s4.M;
import p182s4.U;
import p182s4.V;
import p197u4.j;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LI3/b;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "s4/o", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final C0778o Companion = new C0778o();
    private static final p firebaseApp = p.a(g.class);
    private static final p firebaseInstallationsApi = p.a(d.class);
    private static final p backgroundDispatcher = new p(a.class, AbstractC0337u.class);
    private static final p blockingDispatcher = new p(b.class, AbstractC0337u.class);
    private static final p transportFactory = p.a(f.class);
    private static final p sessionsSettings = p.a(j.class);
    private static final p sessionLifecycleServiceBinder = p.a(U.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0776m getComponents$lambda$0(c cVar) {
        Object objB = cVar.b(firebaseApp);
        i.e(objB, "container[firebaseApp]");
        Object objB2 = cVar.b(sessionsSettings);
        i.e(objB2, "container[sessionsSettings]");
        Object objB3 = cVar.b(backgroundDispatcher);
        i.e(objB3, "container[backgroundDispatcher]");
        Object objB4 = cVar.b(sessionLifecycleServiceBinder);
        i.e(objB4, "container[sessionLifecycleServiceBinder]");
        return new C0776m((g) objB, (j) objB2, (p123m8.i) objB3, (U) objB4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M getComponents$lambda$1(c cVar) {
        return new M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H getComponents$lambda$2(c cVar) {
        Object objB = cVar.b(firebaseApp);
        i.e(objB, "container[firebaseApp]");
        Object objB2 = cVar.b(firebaseInstallationsApi);
        i.e(objB2, "container[firebaseInstallationsApi]");
        Object objB3 = cVar.b(sessionsSettings);
        i.e(objB3, "container[sessionsSettings]");
        p073h4.b bVarF = cVar.f(transportFactory);
        i.e(bVarF, "container.getProvider(transportFactory)");
        p081i3.b bVar = new p081i3.b(bVarF, 18);
        Object objB4 = cVar.b(backgroundDispatcher);
        i.e(objB4, "container[backgroundDispatcher]");
        return new K((g) objB, (d) objB2, (j) objB3, bVar, (p123m8.i) objB4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j getComponents$lambda$3(c cVar) {
        Object objB = cVar.b(firebaseApp);
        i.e(objB, "container[firebaseApp]");
        Object objB2 = cVar.b(blockingDispatcher);
        i.e(objB2, "container[blockingDispatcher]");
        Object objB3 = cVar.b(backgroundDispatcher);
        i.e(objB3, "container[backgroundDispatcher]");
        Object objB4 = cVar.b(firebaseInstallationsApi);
        i.e(objB4, "container[firebaseInstallationsApi]");
        return new j((g) objB, (p123m8.i) objB2, (p123m8.i) objB3, (d) objB4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0783u getComponents$lambda$4(c cVar) {
        g gVar = (g) cVar.b(firebaseApp);
        gVar.a();
        Context context = gVar.a;
        i.e(context, "container[firebaseApp].applicationContext");
        Object objB = cVar.b(backgroundDispatcher);
        i.e(objB, "container[backgroundDispatcher]");
        return new D(context, (p123m8.i) objB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U getComponents$lambda$5(c cVar) {
        Object objB = cVar.b(firebaseApp);
        i.e(objB, "container[firebaseApp]");
        return new V((g) objB);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<I3.b> getComponents() {
        I3.a aVarB = I3.b.b(C0776m.class);
        aVarB.a = LIBRARY_NAME;
        p pVar = firebaseApp;
        aVarB.a(I3.j.a(pVar));
        p pVar2 = sessionsSettings;
        aVarB.a(I3.j.a(pVar2));
        p pVar3 = backgroundDispatcher;
        aVarB.a(I3.j.a(pVar3));
        aVarB.a(I3.j.a(sessionLifecycleServiceBinder));
        aVarB.f2016f = new Y9.a(12);
        aVarB.c(2);
        I3.b bVarB = aVarB.b();
        I3.a aVarB2 = I3.b.b(M.class);
        aVarB2.a = "session-generator";
        aVarB2.f2016f = new Y9.a(13);
        I3.b bVarB2 = aVarB2.b();
        I3.a aVarB3 = I3.b.b(H.class);
        aVarB3.a = "session-publisher";
        aVarB3.a(new I3.j(pVar, 1, 0));
        p pVar4 = firebaseInstallationsApi;
        aVarB3.a(I3.j.a(pVar4));
        aVarB3.a(new I3.j(pVar2, 1, 0));
        aVarB3.a(new I3.j(transportFactory, 1, 1));
        aVarB3.a(new I3.j(pVar3, 1, 0));
        aVarB3.f2016f = new Y9.a(14);
        I3.b bVarB3 = aVarB3.b();
        I3.a aVarB4 = I3.b.b(j.class);
        aVarB4.a = "sessions-settings";
        aVarB4.a(new I3.j(pVar, 1, 0));
        aVarB4.a(I3.j.a(blockingDispatcher));
        aVarB4.a(new I3.j(pVar3, 1, 0));
        aVarB4.a(new I3.j(pVar4, 1, 0));
        aVarB4.f2016f = new Y9.a(15);
        I3.b bVarB4 = aVarB4.b();
        I3.a aVarB5 = I3.b.b(InterfaceC0783u.class);
        aVarB5.a = "sessions-datastore";
        aVarB5.a(new I3.j(pVar, 1, 0));
        aVarB5.a(new I3.j(pVar3, 1, 0));
        aVarB5.f2016f = new Y9.a(16);
        I3.b bVarB5 = aVarB5.b();
        I3.a aVarB6 = I3.b.b(U.class);
        aVarB6.a = "sessions-service-binder";
        aVarB6.a(new I3.j(pVar, 1, 0));
        aVarB6.f2016f = new Y9.a(17);
        return l.C(bVarB, bVarB2, bVarB3, bVarB4, bVarB5, aVarB6.b(), xa.d.g(LIBRARY_NAME, "2.0.3"));
    }
}
