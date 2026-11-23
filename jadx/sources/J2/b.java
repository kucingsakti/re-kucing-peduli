package J2;

import com.google.android.gms.internal.common.zzag;
import com.google.android.gms.internal.common.zzs;

/* JADX INFO: loaded from: classes.dex */
public final class b extends zzag {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient int f2363u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f2364v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zzag f2365w;

    public b(zzag zzagVar, int i10, int i11) {
        this.f2365w = zzagVar;
        this.f2363u = i10;
        this.f2364v = i11;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int e() {
        return this.f2365w.f() + this.f2363u + this.f2364v;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int f() {
        return this.f2365w.f() + this.f2363u;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzs.a(i10, this.f2364v);
        return this.f2365w.get(i10 + this.f2363u);
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean m() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] n() {
        return this.f2365w.n();
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final zzag subList(int i10, int i11) {
        zzs.b(i10, i11, this.f2364v);
        int i12 = this.f2363u;
        return this.f2365w.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2364v;
    }
}
