package p086i8;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.List;
import java.util.RandomAccess;
import p181s3.a;

/* JADX INFO: renamed from: i8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0664c extends AbstractC0665d implements RandomAccess {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12316s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f12319v;

    public C0664c(AbstractC0665d abstractC0665d, int i10, int i11) {
        this.f12319v = abstractC0665d;
        this.f12317t = i10;
        a.c(i10, i11, abstractC0665d.e());
        this.f12318u = i11 - i10;
    }

    @Override // p086i8.AbstractC0665d
    public final int e() {
        switch (this.f12316s) {
            case 0:
                break;
        }
        return this.f12318u;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.f12316s) {
            case 0:
                int i11 = this.f12318u;
                if (i10 < 0 || i10 >= i11) {
                    throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", i11));
                }
                return ((AbstractC0665d) this.f12319v).get(this.f12317t + i10);
            default:
                int i12 = this.f12318u;
                if (i10 < 0 || i10 >= i12) {
                    throw new IndexOutOfBoundsException(AbstractC0487g.h("index: ", i10, ", size: ", i12));
                }
                return this.f12319v.get(this.f12317t + i10);
        }
    }

    public C0664c(List list) {
        this.f12319v = list;
    }
}
