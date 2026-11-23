package p188t1;

import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.B;
import A9.C0133f;
import A9.C0147u;
import A9.D;
import A9.K;
import A9.O;
import A9.S;
import A9.T;
import A9.V;
import A9.W;
import A9.Z;
import A9.b0;
import B1.g;
import F9.a;
import F9.d;
import H1.w;
import L8.InterfaceC0271e;
import L8.P;
import L9.n;
import O8.C0355k;
import O8.E;
import O8.U;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.BaseObj;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.onesignal.inAppMessages.internal.display.impl.k;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.UrlRequest;
import org.jsoup.nodes.p;
import p029c9.j;
import p076h8.f;
import p086i8.m;
import p135n9.b;
import p157q1.h;
import p176r9.c;
import p210v8.i;
import p239z.e;
import p247z9.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    public static volatile String a;

    public static W A(W w2) {
        if (!(w2 instanceof C0147u)) {
            return new V(w2, 1);
        }
        C0147u c0147u = (C0147u) w2;
        S[] sArr = c0147u.f388c;
        i.f(sArr, "<this>");
        P[] pArr = c0147u.f387b;
        i.f(pArr, "other");
        int iMin = Math.min(sArr.length, pArr.length);
        ArrayList<f> arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new f(sArr[i10], pArr[i10]));
        }
        ArrayList arrayList2 = new ArrayList(m.H(arrayList, 10));
        for (f fVar : arrayList) {
            arrayList2.add(j((S) fVar.f11789s, (P) fVar.f11790t));
        }
        return new C0147u(pArr, (S[]) arrayList2.toArray(new S[0]), true);
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 19:
            default:
                objArr[0] = MediationMetaData.KEY_NAME;
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static String b() {
        if (a == null) {
            synchronized (Y.class) {
                try {
                    if (a == null) {
                        a = UUID.randomUUID().toString();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    public static final a c(AbstractC0151y abstractC0151y) {
        d dVar;
        d dVar2;
        i.f(abstractC0151y, k.EVENT_TYPE_KEY);
        if (AbstractC0130c.k(abstractC0151y)) {
            a aVarC = c(AbstractC0130c.l(abstractC0151y));
            a aVarC2 = c(AbstractC0130c.z(abstractC0151y));
            return new a(AbstractC0130c.h(C0133f.j(AbstractC0130c.l((AbstractC0151y) aVarC.a), AbstractC0130c.z((AbstractC0151y) aVarC2.a)), abstractC0151y), AbstractC0130c.h(C0133f.j(AbstractC0130c.l((AbstractC0151y) aVarC.f1652b), AbstractC0130c.z((AbstractC0151y) aVarC2.f1652b)), abstractC0151y));
        }
        O oD = abstractC0151y.D();
        boolean z6 = true;
        if (abstractC0151y.D() instanceof b) {
            i.d(oD, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            S sA = ((b) oD).a();
            AbstractC0151y abstractC0151yB = sA.b();
            i.e(abstractC0151yB, "typeProjection.type");
            AbstractC0151y abstractC0151yH = b0.h(abstractC0151yB, abstractC0151y.H());
            int iD = e.d(sA.a());
            if (iD == 1) {
                D dO = qa.b.l(abstractC0151y).o();
                i.e(dO, "type.builtIns.nullableAnyType");
                return new a(abstractC0151yH, dO);
            }
            if (iD == 2) {
                return new a(b0.h(qa.b.l(abstractC0151y).n(), abstractC0151y.H()), abstractC0151yH);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + sA);
        }
        if (abstractC0151y.l().isEmpty() || abstractC0151y.l().size() != oD.u().size()) {
            return new a(abstractC0151y, abstractC0151y);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listL = abstractC0151y.l();
        List listU = oD.u();
        i.e(listU, "typeConstructor.parameters");
        for (f fVar : p086i8.k.z0(listL, listU)) {
            S s9 = (S) fVar.f11789s;
            P p10 = (P) fVar.f11790t;
            i.e(p10, "typeParameter");
            int iJ0 = p10.j0();
            if (iJ0 == 0) {
                Z.a(35);
                throw null;
            }
            if (s9 == null) {
                Z.a(36);
                throw null;
            }
            Z z10 = Z.f355b;
            int iD2 = e.d(s9.c() ? 3 : Z.b(iJ0, s9.a()));
            if (iD2 == 0) {
                AbstractC0151y abstractC0151yB2 = s9.b();
                i.e(abstractC0151yB2, k.EVENT_TYPE_KEY);
                AbstractC0151y abstractC0151yB3 = s9.b();
                i.e(abstractC0151yB3, k.EVENT_TYPE_KEY);
                dVar2 = new d(p10, abstractC0151yB2, abstractC0151yB3);
            } else if (iD2 == 1) {
                AbstractC0151y abstractC0151yB4 = s9.b();
                i.e(abstractC0151yB4, k.EVENT_TYPE_KEY);
                D dO2 = p165q9.d.e(p10).o();
                i.e(dO2, "typeParameter.builtIns.nullableAnyType");
                dVar2 = new d(p10, abstractC0151yB4, dO2);
            } else {
                if (iD2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                D dN = p165q9.d.e(p10).n();
                AbstractC0151y abstractC0151yB5 = s9.b();
                i.e(abstractC0151yB5, k.EVENT_TYPE_KEY);
                dVar2 = new d(p10, dN, abstractC0151yB5);
            }
            if (s9.c()) {
                arrayList.add(dVar2);
                arrayList2.add(dVar2);
            } else {
                a aVarC3 = c(dVar2.f1654b);
                AbstractC0151y abstractC0151y2 = (AbstractC0151y) aVarC3.a;
                AbstractC0151y abstractC0151y3 = (AbstractC0151y) aVarC3.f1652b;
                a aVarC4 = c(dVar2.f1655c);
                AbstractC0151y abstractC0151y4 = (AbstractC0151y) aVarC4.a;
                AbstractC0151y abstractC0151y5 = (AbstractC0151y) aVarC4.f1652b;
                P p11 = dVar2.a;
                d dVar3 = new d(p11, abstractC0151y3, abstractC0151y4);
                d dVar4 = new d(p11, abstractC0151y2, abstractC0151y5);
                arrayList.add(dVar3);
                arrayList2.add(dVar4);
            }
        }
        if (arrayList.isEmpty()) {
            z6 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z6 = false;
                break;
            }
            dVar = (d) it.next();
            dVar.getClass();
        } while (B9.d.a.b(dVar.f1654b, dVar.f1655c));
        return new a(z6 ? qa.b.l(abstractC0151y).n() : u(abstractC0151y, arrayList), u(abstractC0151y, arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    public static void d(Context context, Bitmap bitmap) throws Throwable {
        BaseObj baseObj;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateTyped;
        RenderScript renderScript = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            RenderScript renderScriptCreate = RenderScript.create(context);
            try {
                renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    try {
                        scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.setRadius(25);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                        allocationCreateTyped.copyTo(bitmap);
                        RenderScript.releaseAllContexts();
                        allocationCreateFromBitmap.destroy();
                        allocationCreateTyped.destroy();
                        scriptIntrinsicBlurCreate.destroy();
                    } catch (Throwable th) {
                        th = th;
                        BaseObj baseObj2 = scriptIntrinsicBlurCreate;
                        renderScript = renderScriptCreate;
                        baseObj = baseObj2;
                        if (renderScript != null) {
                            RenderScript.releaseAllContexts();
                        }
                        if (allocationCreateFromBitmap != null) {
                            allocationCreateFromBitmap.destroy();
                        }
                        if (allocationCreateTyped != null) {
                            allocationCreateTyped.destroy();
                        }
                        if (baseObj != null) {
                            baseObj.destroy();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    allocationCreateTyped = null;
                    renderScript = renderScriptCreate;
                    baseObj = allocationCreateTyped;
                    if (renderScript != null) {
                        RenderScript.releaseAllContexts();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocationCreateTyped != null) {
                        allocationCreateTyped.destroy();
                    }
                    if (baseObj != null) {
                        baseObj.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                allocationCreateFromBitmap = null;
                allocationCreateTyped = null;
            }
        } catch (Throwable th4) {
            th = th4;
            baseObj = null;
            allocationCreateFromBitmap = null;
            allocationCreateTyped = null;
        }
    }

    public static final Object e(Object obj, boolean z6) {
        c cVar;
        i.f(obj, "possiblyPrimitiveType");
        if (!z6) {
            return obj;
        }
        j jVar = (j) obj;
        if (!(jVar instanceof p029c9.i) || (cVar = ((p029c9.i) jVar).f7554i) == null) {
            return jVar;
        }
        String strE = p176r9.b.c(cVar.j()).e();
        i.e(strE, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return p029c9.e.d(strE);
    }

    public static final long i(long j, M9.c cVar, M9.c cVar2) {
        i.f(cVar, "sourceUnit");
        i.f(cVar2, "targetUnit");
        return cVar2.f3258s.convert(j, cVar.f3258s);
    }

    public static final S j(S s9, P p10) {
        if (p10 == null || s9.a() == 1) {
            return s9;
        }
        if (p10.j0() != s9.a()) {
            p135n9.c cVar = new p135n9.c(s9);
            K.f338t.getClass();
            return new T(1, new p135n9.a(s9, cVar, false, K.f339u));
        }
        if (!s9.c()) {
            return new T(s9.b());
        }
        p247z9.b bVar = l.f16335e;
        i.e(bVar, "NO_LOCKS");
        return new T(1, new B(bVar, new c2.a(s9, 14)));
    }

    public static final K0.l k(Context context, Class cls, String str) {
        i.f(context, "context");
        if (str == null || n.D(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new K0.l(context, cls, str);
    }

    public static U l(p096j9.f fVar, InterfaceC0271e interfaceC0271e) {
        if (fVar == null) {
            a(19);
            throw null;
        }
        if (interfaceC0271e == null) {
            a(20);
            throw null;
        }
        Collection collectionN = interfaceC0271e.n();
        if (collectionN.size() != 1) {
            return null;
        }
        for (U u3 : ((C0355k) collectionN.iterator().next()).H0()) {
            if (u3.getName().equals(fVar)) {
                return u3;
            }
        }
        return null;
    }

    public static int m(ArrayList arrayList, InputStream inputStream, g gVar) throws IOException {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new w(inputStream, gVar);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    int iC = ((p232y1.d) arrayList.get(i10)).c(inputStream, gVar);
                    inputStream.reset();
                    if (iC != -1) {
                        return iC;
                    }
                } catch (Throwable th) {
                    inputStream.reset();
                    throw th;
                }
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType n(ArrayList arrayList, InputStream inputStream, g gVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, gVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = ((p232y1.d) arrayList.get(i10)).d(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeD;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType o(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((p232y1.d) arrayList.get(i10)).a(byteBuffer);
                AtomicReference atomicReference = U1.b.a;
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = U1.b.a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static final boolean q(L8.K k3) {
        i.f(k3, "<this>");
        return k3.e() == null;
    }

    public static final void t(T8.a aVar, T8.b bVar, L8.D d3, p096j9.f fVar) {
        i.f(aVar, "<this>");
        i.f(bVar, "from");
        i.f(d3, "scopeOwner");
        i.f(fVar, MediationMetaData.KEY_NAME);
        ((E) d3).f3634w.b();
        i.e(fVar.g(), "name.asString()");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    public static final AbstractC0151y u(AbstractC0151y abstractC0151y, ArrayList arrayList) {
        T t7;
        abstractC0151y.l().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(m.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.getClass();
            B9.m mVar = B9.d.a;
            AbstractC0151y abstractC0151y2 = dVar.f1654b;
            AbstractC0151y abstractC0151y3 = dVar.f1655c;
            mVar.b(abstractC0151y2, abstractC0151y3);
            if (i.a(abstractC0151y2, abstractC0151y3)) {
                t7 = new T(abstractC0151y2);
            } else {
                P p10 = dVar.a;
                if (p10.j0() == 2) {
                    t7 = new T(abstractC0151y2);
                } else {
                    if (I8.i.E(abstractC0151y2) && p10.j0() != 2) {
                        t7 = new T(3 != p10.j0() ? 3 : 1, abstractC0151y3);
                    } else {
                        if (abstractC0151y3 == null) {
                            I8.i.a(140);
                            throw null;
                        }
                        if (I8.i.x(abstractC0151y3) && abstractC0151y3.H()) {
                            t7 = new T(2 == p10.j0() ? 1 : 2, abstractC0151y2);
                        } else {
                            t7 = new T(3 != p10.j0() ? 3 : 1, abstractC0151y3);
                        }
                    }
                }
            }
            arrayList2.add(t7);
        }
        return AbstractC0130c.p(abstractC0151y, arrayList2, null, 6);
    }

    public static LinkedHashSet v(p096j9.f fVar, Collection collection, Collection collection2, InterfaceC0271e interfaceC0271e, p220w9.j jVar, p124m9.l lVar, boolean z6) {
        if (fVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (interfaceC0271e == null) {
            a(15);
            throw null;
        }
        if (jVar == null) {
            a(16);
            throw null;
        }
        if (lVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        lVar.h(fVar, collection, collection2, interfaceC0271e, new V8.a(jVar, linkedHashSet, z6));
        return linkedHashSet;
    }

    public static LinkedHashSet w(p096j9.f fVar, AbstractCollection abstractCollection, Collection collection, InterfaceC0271e interfaceC0271e, p220w9.j jVar, p124m9.l lVar) {
        if (fVar == null) {
            a(0);
            throw null;
        }
        if (interfaceC0271e == null) {
            a(3);
            throw null;
        }
        if (jVar == null) {
            a(4);
            throw null;
        }
        if (lVar != null) {
            return v(fVar, abstractCollection, collection, interfaceC0271e, jVar, lVar, false);
        }
        a(5);
        throw null;
    }

    public static LinkedHashSet x(p096j9.f fVar, Collection collection, AbstractCollection abstractCollection, Y8.j jVar, Q8.d dVar, p124m9.l lVar) {
        if (fVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (jVar == null) {
            a(9);
            throw null;
        }
        if (dVar == null) {
            a(10);
            throw null;
        }
        if (lVar != null) {
            return v(fVar, collection, abstractCollection, jVar, dVar, lVar, true);
        }
        a(11);
        throw null;
    }

    public static void z(ta.n nVar, p pVar) {
        qa.b.w(pVar);
        p pVarR = pVar;
        int i10 = 0;
        while (pVarR != null) {
            p pVar2 = pVarR.f13896s;
            int iH = pVar2 != null ? pVar2.h() : 0;
            p pVarR2 = pVarR.r();
            nVar.e(pVarR, i10);
            if (pVar2 != null && pVarR.f13896s == null) {
                if (iH == pVar2.h()) {
                    pVarR = (p) pVar2.l().get(pVarR.f13897t);
                } else if (pVarR2 == null) {
                    i10--;
                    pVarR = pVar2;
                } else {
                    pVarR = pVarR2;
                }
            }
            if (pVarR.h() > 0) {
                pVarR = (p) pVarR.l().get(0);
                i10++;
            } else {
                while (pVarR.r() == null && i10 > 0) {
                    nVar.i(pVarR, i10);
                    pVarR = pVarR.f13896s;
                    i10--;
                }
                nVar.i(pVarR, i10);
                if (pVarR == pVar) {
                    return;
                } else {
                    pVarR = pVarR.r();
                }
            }
        }
    }

    public abstract boolean f(p157q1.i iVar, p157q1.d dVar, p157q1.d dVar2);

    public abstract boolean g(p157q1.i iVar, Object obj, Object obj2);

    public abstract boolean h(p157q1.i iVar, h hVar, h hVar2);

    public abstract float p(p129n3.f fVar);

    public abstract void r(h hVar, h hVar2);

    public abstract void s(h hVar, Thread thread);

    public abstract void y(p129n3.f fVar, float f10);
}
