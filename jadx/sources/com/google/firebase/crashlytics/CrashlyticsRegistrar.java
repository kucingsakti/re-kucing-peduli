package com.google.firebase.crashlytics;

import D3.g;
import E4.C0187a;
import I3.b;
import I3.j;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p191t4.a;
import p191t4.c;
import p191t4.d;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int a = 0;

    static {
        d dVar = d.f15222s;
        Map map = c.f15221b;
        if (map.containsKey(dVar)) {
            dVar.toString();
        } else {
            map.put(dVar, new a(new V9.d(true)));
            dVar.toString();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        I3.a aVarB = b.b(K3.d.class);
        aVarB.a = "fire-cls";
        aVarB.a(j.b(g.class));
        aVarB.a(j.b(p082i4.d.class));
        aVarB.a(new j(0, 2, L3.b.class));
        aVarB.a(new j(0, 2, F3.a.class));
        aVarB.a(new j(0, 2, p171r4.a.class));
        aVarB.f2016f = new C0187a(this, 10);
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), xa.d.g("fire-cls", "19.0.3"));
    }
}
