package ya;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0880a f16243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16244e;

    public x(String str, boolean z6, int i10) {
        this.f16241b = i10;
        switch (i10) {
            case 1:
                C0880a c0880a = C0880a.f16201t;
                Objects.requireNonNull(str, "name == null");
                this.f16242c = str;
                this.f16243d = c0880a;
                this.f16244e = z6;
                break;
            default:
                C0880a c0880a2 = C0880a.f16201t;
                Objects.requireNonNull(str, "name == null");
                this.f16242c = str;
                this.f16243d = c0880a2;
                this.f16244e = z6;
                break;
        }
    }

    @Override // ya.T
    public final void a(I i10, Object obj) {
        switch (this.f16241b) {
            case 0:
                if (obj != null) {
                    this.f16243d.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        i10.a(this.f16242c, string, this.f16244e);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f16243d.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        i10.d(this.f16242c, string2, this.f16244e);
                        break;
                    }
                }
                break;
        }
    }
}
