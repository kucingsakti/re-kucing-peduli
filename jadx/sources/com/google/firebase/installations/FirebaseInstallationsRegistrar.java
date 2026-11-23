package com.google.firebase.installations;

import D3.g;
import E4.C0187a;
import H3.a;
import H3.b;
import I3.c;
import I3.p;
import J3.j;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p053f4.e;
import p053f4.f;
import p082i4.d;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new p082i4.c((g) cVar.a(g.class), cVar.d(f.class), (ExecutorService) cVar.b(new p(a.class, ExecutorService.class)), new j((Executor) cVar.b(new p(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<I3.b> getComponents() {
        I3.a aVarB = I3.b.b(d.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(I3.j.b(g.class));
        aVarB.a(new I3.j(0, 1, f.class));
        aVarB.a(new I3.j(new p(a.class, ExecutorService.class), 1, 0));
        aVarB.a(new I3.j(new p(b.class, Executor.class), 1, 0));
        aVarB.f2016f = new Y9.a(4);
        I3.b bVarB = aVarB.b();
        e eVar = new e(0);
        I3.a aVarB2 = I3.b.b(e.class);
        aVarB2.f2015e = 1;
        aVarB2.f2016f = new C0187a(eVar, 5);
        return Arrays.asList(bVarB, aVarB2.b(), xa.d.g(LIBRARY_NAME, "18.0.0"));
    }
}
