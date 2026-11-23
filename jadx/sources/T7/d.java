package T7;

import io.reactivex.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4710u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(J7.f fVar, int i10) {
        super(fVar);
        this.f4710u = i10;
    }

    @Override // J7.d
    public final void d(Object obj) {
        if (this.f4704t.a()) {
        }
        if (get() != 0) {
            this.f4703s.d(obj);
            com.bumptech.glide.e.n(this, 1L);
        } else {
            switch (this.f4710u) {
                case 0:
                    break;
                default:
                    c(new MissingBackpressureException("create: could not emit value due to lack of requests"));
                    break;
            }
        }
    }

    private final void j() {
    }
}
