package G8;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1732e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Field field, boolean z6, int i10) {
        super(field, z6);
        this.f1732e = i10;
    }

    @Override // G8.t
    public void a(Object[] objArr) {
        switch (this.f1732e) {
            case 1:
                p210v8.i.f(objArr, "args");
                C3.a.b(this, objArr);
                b(p086i8.i.w(objArr));
                break;
            default:
                super.a(objArr);
                break;
        }
    }
}
