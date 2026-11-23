package p125n;

import C8.E;
import p.X0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13280e;

    public h(i iVar) {
        this.f13277b = 0;
        this.f13280e = iVar;
        this.f13278c = false;
        this.f13279d = 0;
    }

    @Override // U.InterfaceC0419e0
    public final void a() {
        switch (this.f13277b) {
            case 0:
                int i10 = this.f13279d + 1;
                this.f13279d = i10;
                i iVar = (i) this.f13280e;
                if (i10 == iVar.a.size()) {
                    E e10 = iVar.f13283d;
                    if (e10 != null) {
                        e10.a();
                    }
                    this.f13279d = 0;
                    this.f13278c = false;
                    iVar.f13284e = false;
                }
                break;
            default:
                if (!this.f13278c) {
                    ((X0) this.f13280e).a.setVisibility(this.f13279d);
                }
                break;
        }
    }

    @Override // C8.E, U.InterfaceC0419e0
    public void b() {
        switch (this.f13277b) {
            case 1:
                this.f13278c = true;
                break;
        }
    }

    @Override // C8.E, U.InterfaceC0419e0
    public final void c() {
        switch (this.f13277b) {
            case 0:
                if (!this.f13278c) {
                    this.f13278c = true;
                    E e10 = ((i) this.f13280e).f13283d;
                    if (e10 != null) {
                        e10.c();
                    }
                    break;
                }
                break;
            default:
                ((X0) this.f13280e).a.setVisibility(0);
                break;
        }
    }

    public h(X0 x8, int i10) {
        this.f13277b = 1;
        this.f13280e = x8;
        this.f13279d = i10;
        this.f13278c = false;
    }
}
