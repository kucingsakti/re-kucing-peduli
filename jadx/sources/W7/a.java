package W7;

import J7.i;
import J7.j;
import J7.k;
import J7.p;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements k, L7.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public L7.b f5355t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f5356u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5357v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f5358w;

    public /* synthetic */ a(Object obj, int i10) {
        this.f5354s = i10;
        this.f5358w = obj;
    }

    @Override // J7.k
    public final void a() {
        switch (this.f5354s) {
            case 0:
                if (!this.f5357v) {
                    this.f5357v = true;
                    Object obj = this.f5356u;
                    this.f5356u = null;
                    i iVar = (i) this.f5358w;
                    if (obj != null) {
                        iVar.c(obj);
                    } else {
                        iVar.a();
                    }
                    break;
                }
                break;
            default:
                if (!this.f5357v) {
                    this.f5357v = true;
                    Object obj2 = this.f5356u;
                    this.f5356u = null;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    p pVar = (p) this.f5358w;
                    if (obj2 == null) {
                        pVar.onError(new NoSuchElementException());
                    } else {
                        pVar.c(obj2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // J7.k
    public final void b(L7.b bVar) {
        switch (this.f5354s) {
            case 0:
                if (O7.b.k(this.f5355t, bVar)) {
                    this.f5355t = bVar;
                    ((i) this.f5358w).b(this);
                }
                break;
            default:
                if (O7.b.k(this.f5355t, bVar)) {
                    this.f5355t = bVar;
                    ((p) this.f5358w).b(this);
                }
                break;
        }
    }

    @Override // J7.k
    public final void d(Object obj) {
        switch (this.f5354s) {
            case 0:
                if (!this.f5357v) {
                    if (this.f5356u == null) {
                        this.f5356u = obj;
                    } else {
                        this.f5357v = true;
                        this.f5355t.f();
                        ((i) this.f5358w).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
            default:
                if (!this.f5357v) {
                    if (this.f5356u == null) {
                        this.f5356u = obj;
                    } else {
                        this.f5357v = true;
                        this.f5355t.f();
                        ((p) this.f5358w).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
        }
    }

    @Override // L7.b
    public final void f() {
        switch (this.f5354s) {
            case 0:
                this.f5355t.f();
                break;
            default:
                this.f5355t.f();
                break;
        }
    }

    @Override // J7.k
    public final void onError(Throwable th) {
        switch (this.f5354s) {
            case 0:
                if (!this.f5357v) {
                    this.f5357v = true;
                    ((i) this.f5358w).onError(th);
                } else {
                    j.y(th);
                }
                break;
            default:
                if (!this.f5357v) {
                    this.f5357v = true;
                    ((p) this.f5358w).onError(th);
                } else {
                    j.y(th);
                }
                break;
        }
    }
}
