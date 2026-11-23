package A9;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends AbstractC0142o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f358t;

    public a0(String str) {
        this.f358t = str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    public static /* synthetic */ void T0(int i10) {
        String str = (i10 == 1 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else if (i10 == 2) {
            objArr[0] = "delegate";
        } else if (i10 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 != 4) {
            objArr[0] = "newAttributes";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        }
        if (i10 == 1) {
            objArr[1] = "toString";
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else {
            objArr[1] = "refine";
        }
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[2] = "replaceDelegate";
            } else if (i10 == 3) {
                objArr[2] = "refine";
            } else if (i10 != 4) {
                objArr[2] = "replaceAttributes";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // A9.D, A9.d0
    public final /* bridge */ /* synthetic */ d0 G0(boolean z6) {
        G0(z6);
        throw null;
    }

    @Override // A9.AbstractC0142o, A9.d0
    /* JADX INFO: renamed from: K0 */
    public final d0 l0(B9.f fVar) {
        if (fVar != null) {
            return this;
        }
        T0(3);
        throw null;
    }

    @Override // A9.D, A9.d0
    public final /* bridge */ /* synthetic */ d0 N0(K k3) {
        N0(k3);
        throw null;
    }

    @Override // A9.D
    /* JADX INFO: renamed from: O0 */
    public final D G0(boolean z6) {
        throw new IllegalStateException(this.f358t);
    }

    @Override // A9.D
    /* JADX INFO: renamed from: P0 */
    public final D N0(K k3) {
        if (k3 != null) {
            throw new IllegalStateException(this.f358t);
        }
        T0(0);
        throw null;
    }

    @Override // A9.AbstractC0142o
    public final D Q0() {
        throw new IllegalStateException(this.f358t);
    }

    @Override // A9.AbstractC0142o
    /* JADX INFO: renamed from: R0 */
    public final D K0(B9.f fVar) {
        if (fVar != null) {
            return this;
        }
        T0(3);
        throw null;
    }

    @Override // A9.AbstractC0142o
    public final AbstractC0142o S0(D d3) {
        throw new IllegalStateException(this.f358t);
    }

    @Override // A9.AbstractC0142o, A9.AbstractC0151y
    public final AbstractC0151y l0(B9.f fVar) {
        if (fVar != null) {
            return this;
        }
        T0(3);
        throw null;
    }

    @Override // A9.D
    public final String toString() {
        String str = this.f358t;
        if (str != null) {
            return str;
        }
        T0(1);
        throw null;
    }
}
