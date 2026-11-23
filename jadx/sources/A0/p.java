package A0;

import androidx.lifecycle.B;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements B {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p210v8.k f36b;

    public /* synthetic */ p(p210v8.k kVar, int i10) {
        this.a = i10;
        this.f36b = kVar;
    }

    @Override // androidx.lifecycle.B
    public final /* synthetic */ void a(Object obj) {
        switch (this.a) {
            case 0:
                ((k) this.f36b).invoke(obj);
                break;
            default:
                ((m) this.f36b).invoke(obj);
                break;
        }
    }

    public final p076h8.a b() {
        switch (this.a) {
            case 0:
                return (k) this.f36b;
            default:
                return (m) this.f36b;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof B) && (obj instanceof p)) {
                    return ((k) this.f36b).equals(((p) obj).b());
                }
                return false;
            default:
                if (!(obj instanceof B) || !(obj instanceof p)) {
                    return false;
                }
                return ((m) this.f36b).equals(((p) obj).b());
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return ((k) this.f36b).hashCode();
            default:
                return ((m) this.f36b).hashCode();
        }
    }
}
