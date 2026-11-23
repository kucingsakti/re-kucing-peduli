package com.google.firebase.datatransport;

import D3.i;
import I3.b;
import I3.c;
import I3.j;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g2.a;
import i2.p;
import java.util.Arrays;
import java.util.List;
import p051f2.f;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        p.b((Context) cVar.a(Context.class));
        return p.a().c(a.f11528f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(c cVar) {
        p.b((Context) cVar.a(Context.class));
        return p.a().c(a.f11528f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(c cVar) {
        p.b((Context) cVar.a(Context.class));
        return p.a().c(a.f11527e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        I3.a aVarB = b.b(f.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(j.b(Context.class));
        aVarB.f2016f = new i(27);
        b bVarB = aVarB.b();
        I3.a aVarA = b.a(new I3.p(Y3.a.class, f.class));
        aVarA.a(j.b(Context.class));
        aVarA.f2016f = new i(28);
        b bVarB2 = aVarA.b();
        I3.a aVarA2 = b.a(new I3.p(Y3.b.class, f.class));
        aVarA2.a(j.b(Context.class));
        aVarA2.f2016f = new i(29);
        return Arrays.asList(bVarB, bVarB2, aVarA2.b(), d.g(LIBRARY_NAME, "19.0.0"));
    }
}
