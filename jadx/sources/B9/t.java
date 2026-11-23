package B9;

import A9.AbstractC0151y;
import C8.InterfaceC0177e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t extends p210v8.g implements p200u8.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f802A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i10, int i11, Object obj) {
        super(i10, obj);
        this.f802A = i11;
    }

    @Override // p210v8.b
    public final InterfaceC0177e d() {
        switch (this.f802A) {
            case 0:
                return p210v8.u.a.b(u.class);
            default:
                return p210v8.u.a.b(m.class);
        }
    }

    @Override // p210v8.b
    public final String g() {
        switch (this.f802A) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    @Override // p210v8.b, C8.InterfaceC0174b
    public final String getName() {
        switch (this.f802A) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f802A) {
            case 0:
                AbstractC0151y abstractC0151y = (AbstractC0151y) obj;
                AbstractC0151y abstractC0151y2 = (AbstractC0151y) obj2;
                p210v8.i.f(abstractC0151y, "p0");
                p210v8.i.f(abstractC0151y2, "p1");
                ((u) this.f15450t).getClass();
                l.f793b.getClass();
                m mVar = k.f792b;
                return Boolean.valueOf(mVar.b(abstractC0151y, abstractC0151y2) && !mVar.b(abstractC0151y2, abstractC0151y));
            default:
                AbstractC0151y abstractC0151y3 = (AbstractC0151y) obj;
                AbstractC0151y abstractC0151y4 = (AbstractC0151y) obj2;
                p210v8.i.f(abstractC0151y3, "p0");
                p210v8.i.f(abstractC0151y4, "p1");
                return Boolean.valueOf(((m) this.f15450t).a(abstractC0151y3, abstractC0151y4));
        }
    }
}
