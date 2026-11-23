package p029c9;

import B4.C0157e;
import I4.c;
import L8.D;
import Q8.b;
import R8.AbstractC0408c;
import i9.f;
import i9.g;
import i9.h;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p037d9.a;
import p047e9.C0618j;
import p086i8.C;
import p086i8.i;
import p220w9.l;
import p238y9.n;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f7542b = C.w(a.CLASS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f7543c = i.K(new a[]{a.FILE_FACADE, a.MULTIFILE_CLASS_PART});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f7544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f7545e;
    public c a;

    static {
        new f(new int[]{1, 1, 2}, false);
        f7544d = new f(new int[]{1, 1, 11}, false);
        f7545e = new f(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    public final n a(D d3, b bVar) {
        p076h8.f fVarH;
        p210v8.i.f(d3, "descriptor");
        p210v8.i.f(bVar, "kotlinClass");
        C0157e c0157e = bVar.f4340b;
        String[] strArr = (String[]) c0157e.f668e;
        if (strArr == null) {
            strArr = (String[]) c0157e.f669f;
        }
        if (strArr != null) {
            if (!f7543c.contains((a) c0157e.f665b)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            f fVar = (f) c0157e.f667d;
            String[] strArr2 = (String[]) c0157e.f670g;
            if (strArr2 != null) {
                try {
                    try {
                        fVarH = h.h(strArr, strArr2);
                    } catch (InvalidProtocolBufferException e10) {
                        throw new IllegalStateException("Could not read data from " + bVar.a(), e10);
                    }
                } catch (Throwable th) {
                    ((p220w9.i) c().f2080c).getClass();
                    p210v8.i.f((p220w9.i) c().f2080c, "<this>");
                    if (fVar.b(f.f12337g)) {
                        throw th;
                    }
                    fVarH = null;
                }
                if (fVarH != null) {
                    g gVar = (g) fVarH.f11789s;
                    p047e9.C c10 = (p047e9.C) fVarH.f11790t;
                    d(bVar);
                    e(bVar);
                    f fVar2 = new f(bVar, c10, gVar, b(bVar));
                    return new n(d3, c10, gVar, fVar, fVar2, c(), "scope for " + fVar2 + " in " + d3, c.f7541s);
                }
            }
        }
        return null;
    }

    public final int b(b bVar) {
        ((p220w9.i) c().f2080c).getClass();
        int i10 = bVar.f4340b.f666c;
        if (((i10 & 64) != 0) && (i10 & 32) == 0) {
            return 2;
        }
        return ((i10 & 16) == 0 || (i10 & 32) != 0) ? 1 : 3;
    }

    public final c c() {
        c cVar = this.a;
        if (cVar != null) {
            return cVar;
        }
        p210v8.i.n("components");
        throw null;
    }

    public final l d(b bVar) {
        ((p220w9.i) c().f2080c).getClass();
        f fVar = (f) bVar.f4340b.f667d;
        p210v8.i.f((p220w9.i) c().f2080c, "<this>");
        f fVar2 = f.f12337g;
        if (fVar.b(fVar2)) {
            return null;
        }
        f fVar3 = (f) bVar.f4340b.f667d;
        p210v8.i.f((p220w9.i) c().f2080c, "<this>");
        p210v8.i.f((p220w9.i) c().f2080c, "<this>");
        fVar2.getClass();
        f fVar4 = fVar3.f12339f ? fVar2 : f.f12338h;
        fVar4.getClass();
        int i10 = fVar2.f11543b;
        int i11 = fVar4.f11543b;
        return new l(fVar3, fVar2, fVar2, (i11 <= i10 && (i11 < i10 || fVar4.f11544c <= fVar2.f11544c)) ? fVar2 : fVar4, bVar.a(), AbstractC0408c.a(bVar.a));
    }

    public final boolean e(b bVar) {
        ((p220w9.i) c().f2080c).getClass();
        ((p220w9.i) c().f2080c).getClass();
        C0157e c0157e = bVar.f4340b;
        return ((c0157e.f666c & 2) != 0) && ((f) c0157e.f667d).equals(f7544d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public final p220w9.d f(b bVar) {
        p076h8.f fVarF;
        C0157e c0157e = bVar.f4340b;
        String[] strArr = (String[]) c0157e.f668e;
        if (strArr == null) {
            strArr = (String[]) c0157e.f669f;
        }
        if (strArr != null) {
            if (!f7542b.contains((a) c0157e.f665b)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            f fVar = (f) c0157e.f667d;
            String[] strArr2 = (String[]) c0157e.f670g;
            try {
                if (strArr2 != null) {
                    try {
                        fVarF = h.f(strArr, strArr2);
                        if (fVarF != null) {
                            g gVar = (g) fVarF.f11789s;
                            C0618j c0618j = (C0618j) fVarF.f11790t;
                            d(bVar);
                            e(bVar);
                            return new p220w9.d(gVar, c0618j, fVar, new m(bVar, b(bVar)));
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw new IllegalStateException("Could not read data from " + bVar.a(), e10);
                    }
                }
            } catch (Throwable th) {
                ((p220w9.i) c().f2080c).getClass();
                p210v8.i.f((p220w9.i) c().f2080c, "<this>");
                if (fVar.b(f.f12337g)) {
                    throw th;
                }
                fVarF = null;
            }
        }
        return null;
    }
}
