package O8;

import A9.C0133f;
import A9.Z;
import L8.InterfaceC0285t;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: O8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0352h implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f3707t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3708u;

    public /* synthetic */ C0352h(AbstractC0360p abstractC0360p, Object obj, int i10) {
        this.f3706s = i10;
        this.f3708u = abstractC0360p;
        this.f3707t = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [ea.o] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ea.a] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // p200u8.a
    public final Object invoke() throws Throwable {
        p048ea.a aVar;
        switch (this.f3706s) {
            case 0:
                A9.K.f338t.getClass();
                A9.K k3 = A9.K.f339u;
                A9.O oI = ((AbstractC0354j) this.f3708u).I();
                List list = Collections.EMPTY_LIST;
                C0351g c0351g = new C0351g(this, 0);
                p247z9.b bVar = p247z9.l.f16335e;
                p210v8.i.e(bVar, "NO_LOCKS");
                return C0133f.s(k3, oI, list, new t9.j(bVar, c0351g), false);
            case 1:
                J9.g gVar = new J9.g();
                Iterator it = ((w) this.f3708u).x().iterator();
                while (it.hasNext()) {
                    gVar.add(((InterfaceC0285t) it.next()).j((Z) this.f3707t));
                }
                return gVar;
            default:
                ?? r10 = (p048ea.o) this.f3708u;
                p048ea.s sVar = (p048ea.s) this.f3707t;
                p048ea.a aVar2 = p048ea.a.INTERNAL_ERROR;
                ?? r11 = 1;
                IOException e10 = null;
                try {
                    try {
                        try {
                            if (!sVar.a(true, this)) {
                                throw new IOException("Required SETTINGS preface not received");
                            }
                            do {
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } while (sVar.a(false, this));
                            aVar = p048ea.a.NO_ERROR;
                            try {
                                aVar2 = p048ea.a.CANCEL;
                                r10.a(aVar, aVar2, null);
                                r11 = aVar;
                            } catch (IOException e11) {
                                e10 = e11;
                                aVar2 = p048ea.a.PROTOCOL_ERROR;
                                r10.a(aVar2, aVar2, e10);
                                r11 = aVar;
                            }
                            Y9.c.d(sVar);
                            return p076h8.m.a;
                        } catch (IOException e12) {
                            e10 = e12;
                            aVar = aVar2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    r11 = aVar2;
                } catch (Throwable th3) {
                    th = th3;
                }
                r10.a(r11, aVar2, e10);
                Y9.c.d(sVar);
                throw th;
        }
    }

    public C0352h(p048ea.o oVar, p048ea.s sVar) {
        this.f3706s = 2;
        p210v8.i.f(oVar, "this$0");
        this.f3708u = oVar;
        this.f3707t = sVar;
    }
}
