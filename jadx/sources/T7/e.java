package T7;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    @Override // J7.d
    public final void d(Object obj) {
        long j;
        if (this.f4704t.a()) {
            return;
        }
        this.f4703s.d(obj);
        do {
            j = get();
            if (j == 0) {
                return;
            }
        } while (!compareAndSet(j, j - 1));
    }
}
