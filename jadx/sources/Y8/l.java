package Y8;

import C8.InterfaceC0177e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l extends p210v8.g implements p200u8.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f5778A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11, Object obj) {
        super(i10, obj);
        this.f5778A = i11;
    }

    @Override // p210v8.b
    public final InterfaceC0177e d() {
        switch (this.f5778A) {
            case 0:
                return p210v8.u.a.b(p.class);
            case 1:
                return p210v8.u.a.b(p.class);
            default:
                return p210v8.u.a.b(p238y9.e.class);
        }
    }

    @Override // p210v8.b
    public final String g() {
        switch (this.f5778A) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            case 1:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            default:
                return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    @Override // p210v8.b, C8.InterfaceC0174b
    public final String getName() {
        switch (this.f5778A) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic";
            case 1:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
            default:
                return "<init>";
        }
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        switch (this.f5778A) {
            case 0:
                p096j9.f fVar = (p096j9.f) obj;
                p210v8.i.f(fVar, "p0");
                return p.v((p) this.f15450t, fVar);
            case 1:
                p096j9.f fVar2 = (p096j9.f) obj;
                p210v8.i.f(fVar2, "p0");
                return p.w((p) this.f15450t, fVar2);
            default:
                B9.f fVar3 = (B9.f) obj;
                p210v8.i.f(fVar3, "p0");
                return new p238y9.e((p238y9.g) this.f15450t, fVar3);
        }
    }
}
