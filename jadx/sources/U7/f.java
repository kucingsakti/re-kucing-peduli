package U7;

import J7.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends J7.a {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4916b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.f4916b = obj;
    }

    @Override // J7.a
    public final void u(J7.b bVar) {
        switch (this.a) {
            case 0:
                ((J7.g) this.f4916b).a(new e(bVar, 0));
                break;
            default:
                ((j) this.f4916b).U(new e(bVar, 1));
                break;
        }
    }
}
