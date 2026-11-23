package B8;

import java.util.NoSuchElementException;
import p086i8.w;

/* JADX INFO: loaded from: classes.dex */
public final class b extends w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f772s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f773t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f774u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f775v;

    public b(int i10, int i11, int i12) {
        this.f772s = i12;
        this.f773t = i11;
        boolean z6 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z6 = true;
        }
        this.f774u = z6;
        this.f775v = z6 ? i10 : i11;
    }

    @Override // p086i8.w
    public final int a() {
        int i10 = this.f775v;
        if (i10 != this.f773t) {
            this.f775v = this.f772s + i10;
            return i10;
        }
        if (!this.f774u) {
            throw new NoSuchElementException();
        }
        this.f774u = false;
        return i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f774u;
    }
}
