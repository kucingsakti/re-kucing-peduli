package O8;

import L8.InterfaceC0290y;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class O extends t9.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0290y f3679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p096j9.c f3680c;

    public O(InterfaceC0290y interfaceC0290y, p096j9.c cVar) {
        p210v8.i.f(interfaceC0290y, "moduleDescriptor");
        p210v8.i.f(cVar, "fqName");
        this.f3679b = interfaceC0290y;
        this.f3680c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r9.a.contains(t9.c.a) != false) goto L9;
     */
    @Override // t9.o, t9.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection f(t9.f r9, p200u8.b r10) {
        /*
            r8 = this;
            java.lang.String r0 = "kindFilter"
            p210v8.i.f(r9, r0)
            int r0 = t9.f.f15234h
            boolean r0 = r9.a(r0)
            i8.s r1 = p086i8.s.f12328s
            if (r0 != 0) goto L10
            goto L22
        L10:
            j9.c r0 = r8.f3680c
            boolean r2 = r0.d()
            if (r2 == 0) goto L23
            t9.c r2 = t9.c.a
            java.util.List r9 = r9.a
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L23
        L22:
            return r1
        L23:
            L8.y r9 = r8.f3679b
            java.util.Collection r1 = r9.k(r0, r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L36:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r1.next()
            j9.c r3 = (p096j9.c) r3
            j9.f r3 = r3.f()
            java.lang.String r4 = "subFqName.shortName()"
            p210v8.i.e(r3, r4)
            java.lang.Object r4 = r10.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L36
            boolean r4 = r3.f12552t
            r5 = 0
            if (r4 == 0) goto L5d
            goto L7c
        L5d:
            j9.c r3 = r0.c(r3)
            L8.H r3 = r9.K(r3)
            O8.z r3 = (O8.z) r3
            z9.i r4 = r3.f3798x
            C8.u[] r6 = O8.z.f3794z
            r7 = 1
            r6 = r6[r7]
            java.lang.Object r4 = J7.j.o(r4, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L7b
            goto L7c
        L7b:
            r5 = r3
        L7c:
            J9.l.b(r2, r5)
            goto L36
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O8.O.f(t9.f, u8.b):java.util.Collection");
    }

    @Override // t9.o, t9.n
    public final Set g() {
        return p086i8.u.f12330s;
    }

    public final String toString() {
        return "subpackages of " + this.f3680c + " from " + this.f3679b;
    }
}
