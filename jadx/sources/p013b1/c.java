package p013b1;

import J0.u;
import androidx.preference.Preference;
import p204v1.f;

/* JADX INFO: loaded from: classes.dex */
public final class c extends u {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7245b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.f7245b = obj;
    }

    @Override // J0.u
    public final void a() {
        switch (this.a) {
            case 0:
                ((d) this.f7245b).b(true);
                break;
            default:
                ((f) this.f7245b).b();
                break;
        }
    }

    @Override // J0.u
    public final void b(int i10, int i11, Preference preference) {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                ((f) this.f7245b).b();
                break;
        }
    }

    @Override // J0.u
    public final void c(int i10, int i11) {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                ((f) this.f7245b).b();
                break;
        }
    }

    @Override // J0.u
    public final void d(int i10, int i11) {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                ((f) this.f7245b).b();
                break;
        }
    }
}
