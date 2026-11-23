package H1;

import A1.C0099h;
import A1.F;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.measurement.S;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: H1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0232a implements p232y1.j {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1860c;

    public /* synthetic */ C0232a(Object obj, int i10, Object obj2) {
        this.a = i10;
        this.f1859b = obj;
        this.f1860c = obj2;
    }

    @Override // p232y1.j
    public final F a(Object obj, int i10, int i11, p232y1.h hVar) {
        boolean z6;
        w wVar;
        U1.e eVar;
        switch (this.a) {
            case 0:
                F fA = ((p232y1.j) this.f1859b).a(obj, i10, i11, hVar);
                if (fA == null) {
                    return null;
                }
                return new C0235d((Resources) this.f1860c, fA);
            case 1:
                F fC = ((J1.d) this.f1859b).c((Uri) obj, hVar);
                if (fC == null) {
                    return null;
                }
                return q.a((B1.b) this.f1860c, (Drawable) ((J1.c) fC).get(), i10, i11);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof w) {
                    wVar = (w) inputStream;
                    z6 = false;
                } else {
                    z6 = true;
                    wVar = new w(inputStream, (B1.g) this.f1860c);
                }
                ArrayDeque arrayDeque = U1.e.f4870u;
                synchronized (arrayDeque) {
                    eVar = (U1.e) arrayDeque.poll();
                    break;
                }
                if (eVar == null) {
                    eVar = new U1.e();
                }
                U1.e eVar2 = eVar;
                eVar2.f4871s = wVar;
                U1.k kVar = new U1.k(eVar2);
                S s9 = new S(wVar, eVar2, 4, false);
                try {
                    o oVar = (o) this.f1859b;
                    return oVar.a(new C0099h(kVar, oVar.f1889d, oVar.f1888c), i10, i11, hVar, s9);
                } finally {
                    eVar2.a();
                    if (z6) {
                        wVar.b();
                    }
                }
        }
    }

    @Override // p232y1.j
    public final boolean b(Object obj, p232y1.h hVar) {
        switch (this.a) {
            case 0:
                return ((p232y1.j) this.f1859b).b(obj, hVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((o) this.f1859b).getClass();
                return true;
        }
    }

    public C0232a(Resources resources, p232y1.j jVar) {
        this.a = 0;
        this.f1860c = resources;
        this.f1859b = jVar;
    }
}
