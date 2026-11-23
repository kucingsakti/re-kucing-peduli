package p060g0;

import A9.A;
import C8.u;
import N9.InterfaceC0341y;
import V.h;
import android.content.Context;
import c2.a;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import p039e0.C;
import p039e0.C0605b;
import p070h0.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f11456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p200u8.b f11457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0341y f11458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile d f11460f;

    public b(String str, h hVar, p200u8.b bVar, InterfaceC0341y interfaceC0341y) {
        i.f(str, MediationMetaData.KEY_NAME);
        this.a = str;
        this.f11456b = hVar;
        this.f11457c = bVar;
        this.f11458d = interfaceC0341y;
        this.f11459e = new Object();
    }

    public final Object a(u uVar, Object obj) {
        d dVar;
        Context context = (Context) obj;
        i.f(context, "thisRef");
        i.f(uVar, "property");
        d dVar2 = this.f11460f;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f11459e) {
            try {
                if (this.f11460f == null) {
                    Context applicationContext = context.getApplicationContext();
                    h hVar = this.f11456b;
                    p200u8.b bVar = this.f11457c;
                    i.e(applicationContext, "applicationContext");
                    List list = (List) bVar.invoke(applicationContext);
                    InterfaceC0341y interfaceC0341y = this.f11458d;
                    A a = new A(applicationContext, 28, this);
                    i.f(list, "migrations");
                    this.f11460f = new d(new C(new a(a, 7), com.bumptech.glide.d.u(new C0605b(list, null)), hVar, interfaceC0341y));
                }
                dVar = this.f11460f;
                i.c(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
