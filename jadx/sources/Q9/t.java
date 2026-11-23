package Q9;

import N9.C0324g;
import O3.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class t extends R9.a implements m, b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4410w = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4411v;

    public t(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ec A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0092, B:36:0x0095, B:46:0x00b6, B:49:0x00c9, B:50:0x00e1, B:56:0x00f5, B:53:0x00ec, B:55:0x00f2, B:38:0x009b, B:42:0x00a2, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00e1->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c8 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Q9.b
    public final java.lang.Object A(Q9.c r17, p144o8.c r18) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q9.t.A(Q9.c, o8.c):java.lang.Object");
    }

    @Override // Q9.c
    public final Object a(Object obj, p123m8.d dVar) {
        g(obj);
        return p076h8.m.a;
    }

    @Override // R9.a
    public final R9.c c() {
        return new u();
    }

    @Override // R9.a
    public final R9.c[] d() {
        return new u[2];
    }

    public final Object f() {
        y yVar = R9.b.f4481b;
        Object obj = f4410w.get(this);
        if (obj == yVar) {
            return null;
        }
        return obj;
    }

    public final void g(Object obj) {
        if (obj == null) {
            obj = R9.b.f4481b;
        }
        h(null, obj);
    }

    public final boolean h(Object obj, Object obj2) {
        int i10;
        R9.c[] cVarArr;
        y yVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4410w;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !p210v8.i.a(obj3, obj)) {
                return false;
            }
            if (p210v8.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f4411v;
            if ((i11 & 1) != 0) {
                this.f4411v = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f4411v = i12;
            R9.c[] cVarArr2 = this.f4478s;
            while (true) {
                u[] uVarArr = (u[]) cVarArr2;
                if (uVarArr != null) {
                    for (u uVar : uVarArr) {
                        if (uVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u.a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(uVar);
                                if (obj4 == null || obj4 == (yVar = q.f4400c)) {
                                    break;
                                }
                                y yVar2 = q.f4399b;
                                if (obj4 != yVar2) {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(uVar, obj4, yVar2)) {
                                            ((C0324g) obj4).resumeWith(p076h8.m.a);
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(uVar) == obj4);
                                } else {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(uVar, obj4, yVar)) {
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(uVar) == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f4411v;
                    if (i10 == i12) {
                        this.f4411v = i12 + 1;
                        return true;
                    }
                    cVarArr = this.f4478s;
                }
                cVarArr2 = cVarArr;
                i12 = i10;
            }
        }
    }
}
