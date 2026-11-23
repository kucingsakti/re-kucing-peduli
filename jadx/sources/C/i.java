package C;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o {
    @Override // C.d
    public final void a(d dVar) {
        f fVar = this.f846h;
        if (fVar.f821c && !fVar.j) {
            fVar.d((int) ((((f) fVar.f829l.get(0)).f825g * ((B.h) this.f840b).f564q0) + 0.5f));
        }
    }

    @Override // C.o
    public final void d() {
        B.d dVar = this.f840b;
        B.h hVar = (B.h) dVar;
        int i10 = hVar.f565r0;
        int i11 = hVar.f566s0;
        int i12 = hVar.f568u0;
        f fVar = this.f846h;
        if (i12 == 1) {
            if (i10 != -1) {
                fVar.f829l.add(dVar.f447T.f458d.f846h);
                this.f840b.f447T.f458d.f846h.f828k.add(fVar);
                fVar.f824f = i10;
            } else if (i11 != -1) {
                fVar.f829l.add(dVar.f447T.f458d.f847i);
                this.f840b.f447T.f458d.f847i.f828k.add(fVar);
                fVar.f824f = -i11;
            } else {
                fVar.f820b = true;
                fVar.f829l.add(dVar.f447T.f458d.f847i);
                this.f840b.f447T.f458d.f847i.f828k.add(fVar);
            }
            m(this.f840b.f458d.f846h);
            m(this.f840b.f458d.f847i);
            return;
        }
        if (i10 != -1) {
            fVar.f829l.add(dVar.f447T.f460e.f846h);
            this.f840b.f447T.f460e.f846h.f828k.add(fVar);
            fVar.f824f = i10;
        } else if (i11 != -1) {
            fVar.f829l.add(dVar.f447T.f460e.f847i);
            this.f840b.f447T.f460e.f847i.f828k.add(fVar);
            fVar.f824f = -i11;
        } else {
            fVar.f820b = true;
            fVar.f829l.add(dVar.f447T.f460e.f847i);
            this.f840b.f447T.f460e.f847i.f828k.add(fVar);
        }
        m(this.f840b.f460e.f846h);
        m(this.f840b.f460e.f847i);
    }

    @Override // C.o
    public final void e() {
        B.d dVar = this.f840b;
        int i10 = ((B.h) dVar).f568u0;
        f fVar = this.f846h;
        if (i10 == 1) {
            dVar.f452Y = fVar.f825g;
        } else {
            dVar.f453Z = fVar.f825g;
        }
    }

    @Override // C.o
    public final void f() {
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
