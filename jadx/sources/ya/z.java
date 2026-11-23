package ya;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0880a f16250c;

    public z(String str) {
        C0880a c0880a = C0880a.f16201t;
        Objects.requireNonNull(str, "name == null");
        this.f16249b = str;
        this.f16250c = c0880a;
    }

    @Override // ya.T
    public final void a(I i10, Object obj) {
        if (obj == null) {
            return;
        }
        this.f16250c.getClass();
        String string = obj.toString();
        if (string == null) {
            return;
        }
        i10.b(this.f16249b, string);
    }
}
