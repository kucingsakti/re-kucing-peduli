package i9;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import h9.j;
import h9.k;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p047e9.C;
import p047e9.C0609a;
import p047e9.C0618j;
import p047e9.C0620l;
import p047e9.C0632y;
import p047e9.G;
import p047e9.Q;
import p047e9.Z;
import p086i8.l;
import p104k9.AbstractC0672a;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final C0678g a;

    static {
        C0678g c0678g = new C0678g();
        c0678g.a(k.a);
        c0678g.a(k.f11878b);
        c0678g.a(k.f11879c);
        c0678g.a(k.f11880d);
        c0678g.a(k.f11881e);
        c0678g.a(k.f11882f);
        c0678g.a(k.f11883g);
        c0678g.a(k.f11884h);
        c0678g.a(k.f11885i);
        c0678g.a(k.j);
        c0678g.a(k.f11886k);
        c0678g.a(k.f11887l);
        c0678g.a(k.f11888m);
        c0678g.a(k.f11889n);
        a = c0678g;
    }

    public static e a(C0620l c0620l, p067g9.f fVar, p067g9.g gVar) {
        String strZ;
        i.f(c0620l, "proto");
        i.f(fVar, "nameResolver");
        i.f(gVar, "typeTable");
        m mVar = k.a;
        i.e(mVar, "constructorSignature");
        h9.c cVar = (h9.c) xa.d.m(c0620l, mVar);
        String string = (cVar == null || (cVar.f11819t & 1) != 1) ? "<init>" : fVar.getString(cVar.f11820u);
        if (cVar == null || (cVar.f11819t & 2) != 2) {
            List list = c0620l.f11141w;
            i.e(list, "proto.valueParameterList");
            List<Z> list2 = list;
            ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
            for (Z z6 : list2) {
                i.e(z6, "it");
                String strE = e(C3.a.r(z6, gVar), fVar);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strZ = p086i8.k.Z(arrayList, "", "(", ")V", null, 56);
        } else {
            strZ = fVar.getString(cVar.f11821v);
        }
        return new e(string, strZ);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN] (LINE:83)
          (r4v2 java.lang.String) from 0x0055: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static i9.d b(p047e9.G r4, p067g9.f r5, p067g9.g r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            p210v8.i.f(r4, r0)
            java.lang.String r0 = "nameResolver"
            p210v8.i.f(r5, r0)
            java.lang.String r0 = "typeTable"
            p210v8.i.f(r6, r0)
            k9.m r0 = h9.k.f11880d
            java.lang.String r1 = "propertySignature"
            p210v8.i.e(r0, r1)
            java.lang.Object r0 = xa.d.m(r4, r0)
            h9.e r0 = (h9.e) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.f11834t
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            h9.b r0 = r0.f11835u
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.f11811t
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.f11812u
            goto L3b
        L39:
            int r7 = r4.f10802x
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.f11811t
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.f11813v
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            e9.Q r4 = C3.a.o(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            i9.d r6 = new i9.d
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.h.b(e9.G, g9.f, g9.g, boolean):i9.d");
    }

    public static e c(C0632y c0632y, p067g9.f fVar, p067g9.g gVar) {
        String strConcat;
        i.f(c0632y, "proto");
        i.f(fVar, "nameResolver");
        i.f(gVar, "typeTable");
        m mVar = k.f11878b;
        i.e(mVar, "methodSignature");
        h9.c cVar = (h9.c) xa.d.m(c0632y, mVar);
        int i10 = (cVar == null || (cVar.f11819t & 1) != 1) ? c0632y.f11247x : cVar.f11820u;
        if (cVar == null || (cVar.f11819t & 2) != 2) {
            List listD = l.D(C3.a.m(c0632y, gVar));
            List list = c0632y.f11237G;
            i.e(list, "proto.valueParameterList");
            List<Z> list2 = list;
            ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
            for (Z z6 : list2) {
                i.e(z6, "it");
                arrayList.add(C3.a.r(z6, gVar));
            }
            ArrayList arrayListG0 = p086i8.k.g0(listD, arrayList);
            ArrayList arrayList2 = new ArrayList(p086i8.m.H(arrayListG0, 10));
            Iterator it = arrayListG0.iterator();
            while (it.hasNext()) {
                String strE = e((Q) it.next(), fVar);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(C3.a.n(c0632y, gVar), fVar);
            if (strE2 == null) {
                return null;
            }
            strConcat = p086i8.k.Z(arrayList2, "", "(", ")", null, 56).concat(strE2);
        } else {
            strConcat = fVar.getString(cVar.f11821v);
        }
        return new e(fVar.getString(i10), strConcat);
    }

    public static final boolean d(G g8) {
        i.f(g8, "proto");
        p067g9.b bVar = c.a;
        Object objJ = g8.j(k.f11881e);
        i.e(objJ, "proto.getExtension(JvmProtoBuf.flags)");
        return bVar.c(((Number) objJ).intValue()).booleanValue();
    }

    public static String e(Q q10, p067g9.f fVar) {
        if (q10.o()) {
            return b.b(fVar.n(q10.f10871A));
        }
        return null;
    }

    public static final p076h8.f f(String[] strArr, String[] strArr2) throws InvalidProtocolBufferException {
        i.f(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        g gVarG = g(byteArrayInputStream, strArr2);
        C0609a c0609a = C0618j.c0;
        c0609a.getClass();
        C0676e c0676e = new C0676e(byteArrayInputStream);
        AbstractC0672a abstractC0672a = (AbstractC0672a) c0609a.a(c0676e, a);
        try {
            c0676e.a(0);
            if (abstractC0672a.isInitialized()) {
                return new p076h8.f(gVarG, (C0618j) abstractC0672a);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.f12841s = abstractC0672a;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e10) {
            e10.f12841s = abstractC0672a;
            throw e10;
        }
    }

    public static g g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        j jVar = (j) j.f11871z.b(byteArrayInputStream, a);
        i.e(jVar, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new g(jVar, strArr);
    }

    public static final p076h8.f h(String[] strArr, String[] strArr2) throws InvalidProtocolBufferException {
        i.f(strArr, JsonStorageKeyNames.DATA_KEY);
        i.f(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        g gVarG = g(byteArrayInputStream, strArr2);
        C0609a c0609a = C.f10744D;
        c0609a.getClass();
        C0676e c0676e = new C0676e(byteArrayInputStream);
        AbstractC0672a abstractC0672a = (AbstractC0672a) c0609a.a(c0676e, a);
        try {
            c0676e.a(0);
            if (abstractC0672a.isInitialized()) {
                return new p076h8.f(gVarG, (C) abstractC0672a);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.f12841s = abstractC0672a;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e10) {
            e10.f12841s = abstractC0672a;
            throw e10;
        }
    }
}
