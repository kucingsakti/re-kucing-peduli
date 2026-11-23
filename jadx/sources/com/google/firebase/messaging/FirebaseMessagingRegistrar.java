package com.google.firebase.messaging;

import D3.g;
import I3.c;
import I3.j;
import I3.p;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p051f2.f;
import p063g4.a;
import p082i4.d;
import p160q4.b;

/* JADX INFO: loaded from: classes.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(p pVar, c cVar) {
        g gVar = (g) cVar.a(g.class);
        if (cVar.a(a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.d(b.class), cVar.d(p053f4.g.class), (d) cVar.a(d.class), cVar.f(pVar), (p042e4.c) cVar.a(p042e4.c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<I3.b> getComponents() {
        p pVar = new p(Y3.b.class, f.class);
        I3.a aVarB = I3.b.b(FirebaseMessaging.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(j.b(g.class));
        aVarB.a(new j(0, 0, a.class));
        aVarB.a(new j(0, 1, b.class));
        aVarB.a(new j(0, 1, p053f4.g.class));
        aVarB.a(j.b(d.class));
        aVarB.a(new j(pVar, 0, 1));
        aVarB.a(j.b(p042e4.c.class));
        aVarB.f2016f = new p053f4.b(pVar, 1);
        aVarB.c(1);
        return Arrays.asList(aVarB.b(), xa.d.g(LIBRARY_NAME, "24.0.0"));
    }
}
