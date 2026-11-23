package A3;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: A3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0116n implements IntFunction {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0113k f274b;

    public /* synthetic */ C0116n(AbstractC0113k abstractC0113k, int i10) {
        this.a = i10;
        this.f274b = abstractC0113k;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i10) {
        switch (this.a) {
            case 0:
                return ((AbstractC0119q) this.f274b).get(i10);
            default:
                return ((I) this.f274b).get(i10);
        }
    }
}
