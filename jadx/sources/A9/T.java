package A9;

/* JADX INFO: loaded from: classes.dex */
public final class T extends S {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0151y f352b;

    public T(int i10, AbstractC0151y abstractC0151y) {
        if (i10 == 0) {
            e(0);
            throw null;
        }
        if (abstractC0151y == null) {
            e(1);
            throw null;
        }
        this.a = i10;
        this.f352b = abstractC0151y;
    }

    public static /* synthetic */ void e(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY;
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // A9.S
    public final int a() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        e(4);
        throw null;
    }

    @Override // A9.S
    public final AbstractC0151y b() {
        AbstractC0151y abstractC0151y = this.f352b;
        if (abstractC0151y != null) {
            return abstractC0151y;
        }
        e(5);
        throw null;
    }

    @Override // A9.S
    public final boolean c() {
        return false;
    }

    @Override // A9.S
    public final S d(B9.f fVar) {
        if (fVar == null) {
            e(6);
            throw null;
        }
        AbstractC0151y abstractC0151y = this.f352b;
        p210v8.i.f(abstractC0151y, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return new T(this.a, abstractC0151y);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public T(AbstractC0151y abstractC0151y) {
        this(1, abstractC0151y);
        if (abstractC0151y != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
