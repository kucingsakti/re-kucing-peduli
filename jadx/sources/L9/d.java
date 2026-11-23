package L9;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import p086i8.A;
import p086i8.AbstractC0665d;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0665d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f2854t;

    public /* synthetic */ d(Object obj, int i10) {
        this.f2853s = i10;
        this.f2854t = obj;
    }

    @Override // p086i8.AbstractC0665d, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f2853s) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // p086i8.AbstractC0665d
    public final int e() {
        switch (this.f2853s) {
            case 0:
                return ((Matcher) ((o1.k) this.f2854t).f13638s).groupCount() + 1;
            default:
                return ((List) this.f2854t).size();
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.f2853s) {
            case 0:
                String strGroup = ((Matcher) ((o1.k) this.f2854t).f13638s).group(i10);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) this.f2854t).get(p086i8.k.L(this, i10));
        }
    }

    @Override // p086i8.AbstractC0665d, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f2853s) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p086i8.AbstractC0665d, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        switch (this.f2853s) {
            case 1:
                return new A(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // p086i8.AbstractC0665d, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f2853s) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p086i8.AbstractC0665d, java.util.List
    public ListIterator listIterator() {
        switch (this.f2853s) {
            case 1:
                return new A(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // p086i8.AbstractC0665d, java.util.List
    public ListIterator listIterator(int i10) {
        switch (this.f2853s) {
            case 1:
                return new A(this, i10);
            default:
                return super.listIterator(i10);
        }
    }
}
