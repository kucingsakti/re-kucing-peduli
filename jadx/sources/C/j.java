package C;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j extends o {
    @Override // C.d
    public final void a(d dVar) {
        B.a aVar = (B.a) this.f840b;
        int i10 = aVar.f402s0;
        f fVar = this.f846h;
        Iterator it = fVar.f829l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((f) it.next()).f825g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            fVar.d(i12 + aVar.f404u0);
        } else {
            fVar.d(i11 + aVar.f404u0);
        }
    }

    @Override // C.o
    public final void d() {
        B.d dVar = this.f840b;
        if (dVar instanceof B.a) {
            f fVar = this.f846h;
            fVar.f820b = true;
            B.a aVar = (B.a) dVar;
            int i10 = aVar.f402s0;
            boolean z6 = aVar.f403t0;
            int i11 = 0;
            if (i10 == 0) {
                fVar.f823e = 4;
                while (i11 < aVar.f571r0) {
                    B.d dVar2 = aVar.f570q0[i11];
                    if (z6 || dVar2.f464g0 != 8) {
                        f fVar2 = dVar2.f458d.f846h;
                        fVar2.f828k.add(fVar);
                        fVar.f829l.add(fVar2);
                    }
                    i11++;
                }
                m(this.f840b.f458d.f846h);
                m(this.f840b.f458d.f847i);
                return;
            }
            if (i10 == 1) {
                fVar.f823e = 5;
                while (i11 < aVar.f571r0) {
                    B.d dVar3 = aVar.f570q0[i11];
                    if (z6 || dVar3.f464g0 != 8) {
                        f fVar3 = dVar3.f458d.f847i;
                        fVar3.f828k.add(fVar);
                        fVar.f829l.add(fVar3);
                    }
                    i11++;
                }
                m(this.f840b.f458d.f846h);
                m(this.f840b.f458d.f847i);
                return;
            }
            if (i10 == 2) {
                fVar.f823e = 6;
                while (i11 < aVar.f571r0) {
                    B.d dVar4 = aVar.f570q0[i11];
                    if (z6 || dVar4.f464g0 != 8) {
                        f fVar4 = dVar4.f460e.f846h;
                        fVar4.f828k.add(fVar);
                        fVar.f829l.add(fVar4);
                    }
                    i11++;
                }
                m(this.f840b.f460e.f846h);
                m(this.f840b.f460e.f847i);
                return;
            }
            if (i10 != 3) {
                return;
            }
            fVar.f823e = 7;
            while (i11 < aVar.f571r0) {
                B.d dVar5 = aVar.f570q0[i11];
                if (z6 || dVar5.f464g0 != 8) {
                    f fVar5 = dVar5.f460e.f847i;
                    fVar5.f828k.add(fVar);
                    fVar.f829l.add(fVar5);
                }
                i11++;
            }
            m(this.f840b.f460e.f846h);
            m(this.f840b.f460e.f847i);
        }
    }

    @Override // C.o
    public final void e() {
        B.d dVar = this.f840b;
        if (dVar instanceof B.a) {
            int i10 = ((B.a) dVar).f402s0;
            f fVar = this.f846h;
            if (i10 == 0 || i10 == 1) {
                dVar.f452Y = fVar.f825g;
            } else {
                dVar.f453Z = fVar.f825g;
            }
        }
    }

    @Override // C.o
    public final void f() {
        this.f841c = null;
        this.f846h.c();
    }

    @Override // C.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f846h;
        fVar2.f828k.add(fVar);
        fVar.f829l.add(fVar2);
    }
}
