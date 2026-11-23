package p037d9;

import B1.a;
import V.h;
import p029c9.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10560t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f10561u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(k kVar, int i10) {
        super(5);
        this.f10560t = i10;
        this.f10561u = kVar;
    }

    @Override // B1.a
    public final void T0(String[] strArr) {
        switch (this.f10560t) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((c) this.f10561u).f10563t.f10569d = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((c) this.f10561u).f10563t.f10570e = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((e) ((h) this.f10561u).f5078t).f10573h = strArr;
                return;
        }
    }
}
