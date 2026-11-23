package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0480b implements C, RandomAccess {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f6395t;

    static {
        new B(10).f6447s = false;
    }

    public B(int i10) {
        this(new ArrayList(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final void B(C0488h c0488h) {
        d();
        this.f6395t.add(c0488h);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final Object J(int i10) {
        return this.f6395t.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        d();
        this.f6395t.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0480b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f6395t.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0480b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.f6395t.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f6395t;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C0488h)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC0505z.a);
            P p10 = w0.a;
            if (w0.a.i(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str2);
            }
            return str2;
        }
        C0488h c0488h = (C0488h) obj;
        c0488h.getClass();
        Charset charset = AbstractC0505z.a;
        if (c0488h.size() == 0) {
            str = "";
        } else {
            str = new String(c0488h.f6469t, c0488h.e(), c0488h.size(), charset);
        }
        int iE = c0488h.e();
        if (w0.a.i(c0488h.f6469t, iE, c0488h.size() + iE) == 0) {
            arrayList.set(i10, str);
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final C i() {
        return this.f6447s ? new o0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.C
    public final List l() {
        return Collections.unmodifiableList(this.f6395t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        Object objRemove = this.f6395t.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C0488h)) {
            return new String((byte[]) objRemove, AbstractC0505z.a);
        }
        C0488h c0488h = (C0488h) objRemove;
        c0488h.getClass();
        Charset charset = AbstractC0505z.a;
        if (c0488h.size() == 0) {
            return "";
        }
        return new String(c0488h.f6469t, c0488h.e(), c0488h.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        d();
        Object obj2 = this.f6395t.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0488h)) {
            return new String((byte[]) obj2, AbstractC0505z.a);
        }
        C0488h c0488h = (C0488h) obj2;
        c0488h.getClass();
        Charset charset = AbstractC0505z.a;
        if (c0488h.size() == 0) {
            return "";
        }
        return new String(c0488h.f6469t, c0488h.e(), c0488h.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6395t.size();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0504y
    public final InterfaceC0504y t(int i10) {
        ArrayList arrayList = this.f6395t;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new B(arrayList2);
    }

    public B(ArrayList arrayList) {
        this.f6395t = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0480b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        d();
        if (collection instanceof C) {
            collection = ((C) collection).l();
        }
        boolean zAddAll = this.f6395t.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
