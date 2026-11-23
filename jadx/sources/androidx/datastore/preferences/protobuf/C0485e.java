package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0485e implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6459s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6460t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f6461u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Iterable f6462v;

    public C0485e(C0488h c0488h) {
        this.f6462v = c0488h;
        this.f6461u = c0488h.size();
    }

    public byte a() {
        try {
            byte[] bArr = ((p104k9.s) this.f6462v).f12821t;
            int i10 = this.f6460t;
            this.f6460t = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6459s) {
            case 0:
                return this.f6460t < this.f6461u;
            default:
                return this.f6460t < this.f6461u;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6459s) {
            case 0:
                int i10 = this.f6460t;
                if (i10 >= this.f6461u) {
                    throw new NoSuchElementException();
                }
                this.f6460t = i10 + 1;
                return Byte.valueOf(((C0488h) this.f6462v).f6469t[i10]);
            default:
                return Byte.valueOf(a());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6459s) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0485e(p104k9.s sVar) {
        this.f6462v = sVar;
        this.f6461u = sVar.f12821t.length;
    }
}
