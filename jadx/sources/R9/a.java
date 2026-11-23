package R9;

import java.util.Arrays;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c[] f4478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4479t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4480u;

    public final c b() {
        c cVarC;
        synchronized (this) {
            try {
                c[] cVarArrD = this.f4478s;
                if (cVarArrD == null) {
                    cVarArrD = d();
                    this.f4478s = cVarArrD;
                } else if (this.f4479t >= cVarArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(cVarArrD, cVarArrD.length * 2);
                    p210v8.i.e(objArrCopyOf, "copyOf(this, newSize)");
                    this.f4478s = (c[]) objArrCopyOf;
                    cVarArrD = (c[]) objArrCopyOf;
                }
                int i10 = this.f4480u;
                do {
                    cVarC = cVarArrD[i10];
                    if (cVarC == null) {
                        cVarC = c();
                        cVarArrD[i10] = cVarC;
                    }
                    i10++;
                    if (i10 >= cVarArrD.length) {
                        i10 = 0;
                    }
                } while (!cVarC.a(this));
                this.f4480u = i10;
                this.f4479t++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarC;
    }

    public abstract c c();

    public abstract c[] d();

    public final void e(c cVar) {
        int i10;
        p123m8.d[] dVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f4479t - 1;
                this.f4479t = i11;
                if (i11 == 0) {
                    this.f4480u = 0;
                }
                p210v8.i.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                dVarArrB = cVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p123m8.d dVar : dVarArrB) {
            if (dVar != null) {
                dVar.resumeWith(m.a);
            }
        }
    }
}
