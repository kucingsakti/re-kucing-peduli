package p067g9;

import p104k9.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o[] f11547c;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i10, o[] oVarArr) {
        if (oVarArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i11 = 1;
        int length = oVarArr.length - 1;
        if (length != 0) {
            for (int i12 = 31; i12 >= 0; i12--) {
                if (((1 << i12) & length) != 0) {
                    i11 = 1 + i12;
                }
            }
            throw new IllegalStateException("Empty enum: " + oVarArr.getClass());
        }
        super(i10, i11);
        this.f11547c = oVarArr;
    }

    public final Object c(int i10) {
        int i11 = (1 << this.f11548b) - 1;
        int i12 = this.a;
        int i13 = (i10 & (i11 << i12)) >> i12;
        for (o oVar : this.f11547c) {
            if (oVar.getNumber() == i13) {
                return oVar;
            }
        }
        return null;
    }
}
