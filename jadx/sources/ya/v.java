package ya;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f16237c;

    public /* synthetic */ v(T t7, int i10) {
        this.f16236b = i10;
        this.f16237c = t7;
    }

    @Override // ya.T
    public final void a(I i10, Object obj) {
        switch (this.f16236b) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f16237c.a(i10, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i11 = 0; i11 < length; i11++) {
                        this.f16237c.a(i10, Array.get(obj, i11));
                    }
                    break;
                }
                break;
        }
    }
}
