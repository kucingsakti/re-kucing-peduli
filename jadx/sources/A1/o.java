package A1;

import android.util.Log;
import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final Class a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M1.a f156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0099h f157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f158e;

    public o(Class cls, Class cls2, Class cls3, List list, M1.a aVar, C0099h c0099h) {
        this.a = cls;
        this.f155b = list;
        this.f156c = aVar;
        this.f157d = c0099h;
        this.f158e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final F a(int i10, int i11, l lVar, com.bumptech.glide.load.data.g gVar, p232y1.h hVar) {
        F fA;
        p232y1.l lVar2;
        int iR;
        boolean z6;
        boolean z10;
        boolean z11;
        Object c0098g;
        String str;
        C0099h c0099h = this.f157d;
        List list = (List) c0099h.b();
        try {
            F fB = b(gVar, i10, i11, hVar, list);
            c0099h.q(list);
            n nVar = (n) lVar.f123t;
            nVar.getClass();
            Class<?> cls = fB.get().getClass();
            int i12 = lVar.f122s;
            C0102k c0102k = nVar.f147s;
            p232y1.k kVarG = null;
            if (i12 != 4) {
                p232y1.l lVarE = c0102k.e(cls);
                lVar2 = lVarE;
                fA = lVarE.a(nVar.f154z, fB, nVar.f129D, nVar.f130E);
            } else {
                fA = fB;
                lVar2 = null;
            }
            if (!fB.equals(fA)) {
                fB.c();
            }
            if (c0102k.f107c.a().f7610d.g(fA.b()) != null) {
                com.bumptech.glide.h hVarA = c0102k.f107c.a();
                hVarA.getClass();
                kVarG = hVarA.f7610d.g(fA.b());
                if (kVarG == null) {
                    final Class clsB = fA.b();
                    throw new Registry$MissingComponentException(clsB) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + clsB + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                iR = kVarG.r(nVar.f132G);
            } else {
                iR = 3;
            }
            p232y1.k kVar = kVarG;
            p232y1.e eVar = nVar.f137L;
            ArrayList arrayListB = c0102k.b();
            int size = arrayListB.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z6 = false;
                    break;
                }
                if (((E1.q) arrayListB.get(i13)).a.equals(eVar)) {
                    z6 = true;
                    break;
                }
                i13++;
            }
            switch (nVar.f131F.a) {
                case 0:
                    z10 = (i12 == 4 || i12 == 5) ? false : true;
                    break;
                default:
                    z10 = true;
                    if (((z6 || i12 != 3) && i12 != 1) || iR != 2) {
                    }
                case 1:
                case 2:
                    z10 = false;
                    break;
            }
            if (z10) {
                if (kVar == null) {
                    final Class<?> cls2 = fA.get().getClass();
                    throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + cls2 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                int iD = p239z.e.d(iR);
                if (iD == 0) {
                    z11 = true;
                    c0098g = new C0098g(nVar.f137L, nVar.f126A);
                } else {
                    if (iD != 1) {
                        if (iR == 1) {
                            str = "SOURCE";
                        } else if (iR != 2) {
                            str = iR != 3 ? "null" : "NONE";
                        } else {
                            str = "TRANSFORMED";
                        }
                        throw new IllegalArgumentException("Unknown strategy: ".concat(str));
                    }
                    z11 = true;
                    c0098g = new H(c0102k.f107c.a, nVar.f137L, nVar.f126A, nVar.f129D, nVar.f130E, lVar2, cls, nVar.f132G);
                }
                E e10 = (E) E.f50w.b();
                e10.f54v = false;
                e10.f53u = z11;
                e10.f52t = fA;
                C0099h c0099h2 = nVar.f152x;
                c0099h2.f103t = c0098g;
                c0099h2.f104u = kVar;
                c0099h2.f105v = e10;
                fA = e10;
            }
            return this.f156c.a(fA, hVar);
        } catch (Throwable th) {
            c0099h.q(list);
            throw th;
        }
    }

    public final F b(com.bumptech.glide.load.data.g gVar, int i10, int i11, p232y1.h hVar, List list) throws GlideException {
        List list2 = this.f155b;
        int size = list2.size();
        F fA = null;
        for (int i12 = 0; i12 < size; i12++) {
            p232y1.j jVar = (p232y1.j) list2.get(i12);
            try {
                if (jVar.b(gVar.a(), hVar)) {
                    fA = jVar.a(gVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(jVar);
                }
                list.add(e10);
            }
            if (fA != null) {
                break;
            }
        }
        if (fA != null) {
            return fA;
        }
        throw new GlideException(this.f158e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.f155b + ", transcoder=" + this.f156c + '}';
    }
}
