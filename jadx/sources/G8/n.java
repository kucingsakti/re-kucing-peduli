package G8;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1734g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Field field, boolean z6, boolean z10, int i10) {
        super(field, z6, z10);
        this.f1734g = i10;
    }

    @Override // G8.o, G8.t
    public void a(Object[] objArr) {
        switch (this.f1734g) {
            case 1:
                p210v8.i.f(objArr, "args");
                super.a(objArr);
                b(p086i8.i.w(objArr));
                break;
            default:
                super.a(objArr);
                break;
        }
    }
}
