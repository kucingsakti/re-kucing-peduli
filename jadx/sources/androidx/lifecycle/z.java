package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B f6774s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6775t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6776u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ A f6777v;

    public z(A a, B b3) {
        this.f6777v = a;
        this.f6774s = b3;
    }

    public final void a(boolean z6) {
        if (z6 == this.f6775t) {
            return;
        }
        this.f6775t = z6;
        int i10 = z6 ? 1 : -1;
        A a = this.f6777v;
        int i11 = a.f6707c;
        a.f6707c = i10 + i11;
        if (!a.f6708d) {
            a.f6708d = true;
            while (true) {
                try {
                    int i12 = a.f6707c;
                    if (i11 == i12) {
                        break;
                    } else {
                        i11 = i12;
                    }
                } catch (Throwable th) {
                    a.f6708d = false;
                    throw th;
                }
            }
            a.f6708d = false;
        }
        if (this.f6775t) {
            a.c(this);
        }
    }

    public void b() {
    }

    public boolean c(InterfaceC0523s interfaceC0523s) {
        return false;
    }

    public abstract boolean d();
}
