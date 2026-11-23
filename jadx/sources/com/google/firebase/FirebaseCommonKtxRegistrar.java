package com.google.firebase;

import D3.h;
import H3.c;
import H3.d;
import I3.a;
import I3.b;
import I3.j;
import I3.p;
import N9.AbstractC0337u;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import p086i8.l;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LI3/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a aVarA = b.a(new p(H3.a.class, AbstractC0337u.class));
        aVarA.a(new j(new p(H3.a.class, Executor.class), 1, 0));
        aVarA.f2016f = h.f1057t;
        b bVarB = aVarA.b();
        a aVarA2 = b.a(new p(c.class, AbstractC0337u.class));
        aVarA2.a(new j(new p(c.class, Executor.class), 1, 0));
        aVarA2.f2016f = h.f1058u;
        b bVarB2 = aVarA2.b();
        a aVarA3 = b.a(new p(H3.b.class, AbstractC0337u.class));
        aVarA3.a(new j(new p(H3.b.class, Executor.class), 1, 0));
        aVarA3.f2016f = h.f1059v;
        b bVarB3 = aVarA3.b();
        a aVarA4 = b.a(new p(d.class, AbstractC0337u.class));
        aVarA4.a(new j(new p(d.class, Executor.class), 1, 0));
        aVarA4.f2016f = h.f1060w;
        return l.C(bVarB, bVarB2, bVarB3, aVarA4.b());
    }
}
