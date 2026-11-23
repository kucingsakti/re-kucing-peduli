package p104k9;

import com.rollbar.notifier.sender.SyncSender;
import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractList implements RandomAccess, r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final E f12819t = new E(new q());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f12820s;

    public q() {
        this.f12820s = new ArrayList();
    }

    @Override // p104k9.r
    public final AbstractC0675d A(int i10) {
        AbstractC0675d sVar;
        ArrayList arrayList = this.f12820s;
        Object obj = arrayList.get(i10);
        if (obj instanceof AbstractC0675d) {
            sVar = (AbstractC0675d) obj;
        } else if (obj instanceof String) {
            try {
                sVar = new s(((String) obj).getBytes(SyncSender.UTF_8));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            sVar = new s(bArr2);
        }
        if (sVar != obj) {
            arrayList.set(i10, sVar);
        }
        return sVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f12820s.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f12820s.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f12820s.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        ArrayList arrayList = this.f12820s;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0675d) {
            AbstractC0675d abstractC0675d = (AbstractC0675d) obj;
            String strV = abstractC0675d.v();
            if (abstractC0675d.n()) {
                arrayList.set(i10, strV);
            }
            return strV;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = p.a;
        try {
            String str = new String(bArr, SyncSender.UTF_8);
            if (B.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
            return str;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // p104k9.r
    public final E i() {
        return new E(this);
    }

    @Override // p104k9.r
    public final List l() {
        return Collections.unmodifiableList(this.f12820s);
    }

    @Override // p104k9.r
    public final void p(s sVar) {
        this.f12820s.add(sVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        Object objRemove = this.f12820s.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC0675d) {
            return ((AbstractC0675d) objRemove).v();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = p.a;
        try {
            return new String(bArr, SyncSender.UTF_8);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Object obj2 = this.f12820s.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC0675d) {
            return ((AbstractC0675d) obj2).v();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = p.a;
        try {
            return new String(bArr, SyncSender.UTF_8);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12820s.size();
    }

    public q(r rVar) {
        this.f12820s = new ArrayList(rVar.size());
        addAll(rVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection instanceof r) {
            collection = ((r) collection).l();
        }
        boolean zAddAll = this.f12820s.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
