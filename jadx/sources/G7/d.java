package G7;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class d extends X2.c {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1709b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.f1709b = obj;
    }

    @Override // X2.c
    public final void b(View view) {
        int i10 = this.a;
    }

    @Override // X2.c
    public final void c(View view, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 4) {
                    ((e) this.f1709b).f1710s.g0();
                }
                break;
            default:
                if (i10 == 5) {
                    ((X2.h) this.f1709b).cancel();
                }
                break;
        }
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
