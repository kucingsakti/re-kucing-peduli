package com.google.firebase;

import D3.i;
import I3.a;
import I3.b;
import I3.j;
import I3.p;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p053f4.d;
import p053f4.e;
import p053f4.f;
import p053f4.g;
import p076h8.c;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        int i10 = 0;
        ArrayList arrayList = new ArrayList();
        a aVarB = b.b(p160q4.b.class);
        aVarB.a(new j(2, 0, p160q4.a.class));
        aVarB.f2016f = new Y9.a(10);
        arrayList.add(aVarB.b());
        p pVar = new p(H3.a.class, Executor.class);
        a aVar = new a(d.class, new Class[]{f.class, g.class});
        aVar.a(j.b(Context.class));
        aVar.a(j.b(D3.g.class));
        aVar.a(new j(2, 0, e.class));
        aVar.a(new j(1, 1, p160q4.b.class));
        aVar.a(new j(pVar, 1, 0));
        aVar.f2016f = new p053f4.b(pVar, i10);
        arrayList.add(aVar.b());
        arrayList.add(xa.d.g("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(xa.d.g("fire-core", "21.0.0"));
        arrayList.add(xa.d.g("device-name", a(Build.PRODUCT)));
        arrayList.add(xa.d.g("device-model", a(Build.DEVICE)));
        arrayList.add(xa.d.g("device-brand", a(Build.BRAND)));
        arrayList.add(xa.d.j("android-target-sdk", new i(i10)));
        arrayList.add(xa.d.j("android-min-sdk", new i(1)));
        arrayList.add(xa.d.j("android-platform", new i(2)));
        arrayList.add(xa.d.j("android-installer", new i(3)));
        try {
            string = c.f11781w.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(xa.d.g("kotlin", string));
        }
        return arrayList;
    }
}
