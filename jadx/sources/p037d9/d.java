package p037d9;

import B1.a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10564t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f10565u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(c cVar, int i10) {
        super(5);
        this.f10564t = i10;
        this.f10565u = cVar;
    }

    @Override // B1.a
    public final void T0(String[] strArr) {
        switch (this.f10564t) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                this.f10565u.f10563t.f10569d = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                this.f10565u.f10563t.f10570e = strArr;
                return;
        }
    }
}
