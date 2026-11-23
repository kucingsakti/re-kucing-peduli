package ma;

import java.util.RandomAccess;
import p086i8.AbstractC0665d;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0665d implements RandomAccess {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i[] f13207s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f13208t;

    public p(i[] iVarArr, int[] iArr) {
        this.f13207s = iVarArr;
        this.f13208t = iArr;
    }

    @Override // p086i8.AbstractC0665d, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // p086i8.AbstractC0665d
    public final int e() {
        return this.f13207s.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f13207s[i10];
    }

    @Override // p086i8.AbstractC0665d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // p086i8.AbstractC0665d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
