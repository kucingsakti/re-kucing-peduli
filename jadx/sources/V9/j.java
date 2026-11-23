package V9;

import S9.s;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicReferenceArray f5239w;

    public j(long j, j jVar, int i10) {
        super(j, jVar, i10);
        this.f5239w = new AtomicReferenceArray(i.f5238f);
    }

    @Override // S9.s
    public final int f() {
        return i.f5238f;
    }

    @Override // S9.s
    public final void g(int i10, p123m8.i iVar) {
        this.f5239w.set(i10, i.f5237e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f4577u + ", hashCode=" + hashCode() + ']';
    }
}
