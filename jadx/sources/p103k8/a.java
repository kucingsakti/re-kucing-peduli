package p103k8;

import java.util.Comparator;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12762b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12763c = new a(1);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                i.f(comparable, R5.a.PUSH_ADDITIONAL_DATA_KEY);
                i.f(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                i.f(comparable3, R5.a.PUSH_ADDITIONAL_DATA_KEY);
                i.f(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.a) {
            case 0:
                return f12763c;
            default:
                return f12762b;
        }
    }
}
