package L7;

import J0.C0256f;
import Z7.m;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p028c8.c;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f2786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f2787u;

    public /* synthetic */ a(int i10) {
        this.f2785s = i10;
    }

    private final boolean b(b bVar) {
        if (!this.f2786t) {
            synchronized (this) {
                try {
                    if (!this.f2786t) {
                        C0256f c0256f = (C0256f) this.f2787u;
                        if (c0256f == null) {
                            c0256f = new C0256f();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            c0256f.a = iNumberOfLeadingZeros - 1;
                            c0256f.f2304c = (int) (0.75f * iNumberOfLeadingZeros);
                            c0256f.f2305d = new Object[iNumberOfLeadingZeros];
                            this.f2787u = c0256f;
                        }
                        c0256f.a(bVar);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        bVar.f();
        return false;
    }

    private final boolean d(b bVar) {
        Object obj;
        if (this.f2786t) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f2786t) {
                    return false;
                }
                C0256f c0256f = (C0256f) this.f2787u;
                if (c0256f != null) {
                    Object[] objArr = (Object[]) c0256f.f2305d;
                    int i10 = c0256f.a;
                    int iHashCode = bVar.hashCode() * (-1640531527);
                    int i11 = (iHashCode ^ (iHashCode >>> 16)) & i10;
                    Object obj2 = objArr[i11];
                    if (obj2 != null) {
                        if (obj2.equals(bVar)) {
                            c0256f.e(i11, i10, objArr);
                        } else {
                            do {
                                i11 = (i11 + 1) & i10;
                                obj = objArr[i11];
                                if (obj == null) {
                                }
                            } while (!obj.equals(bVar));
                            c0256f.e(i11, i10, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(C0256f c0256f) {
        if (c0256f == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : (Object[]) c0256f.f2305d) {
            if (obj instanceof b) {
                try {
                    ((b) obj).f();
                } catch (Throwable th) {
                    l.n(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw c.a((Throwable) arrayList.get(0));
        }
    }

    private final void g() {
        if (this.f2786t) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f2786t) {
                    return;
                }
                this.f2786t = true;
                C0256f c0256f = (C0256f) this.f2787u;
                this.f2787u = null;
                e(c0256f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a(b bVar) {
        switch (this.f2785s) {
            case 0:
                return b(bVar);
            default:
                if (!this.f2786t) {
                    synchronized (this) {
                        try {
                            if (!this.f2786t) {
                                LinkedList linkedList = (LinkedList) this.f2787u;
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    this.f2787u = linkedList;
                                }
                                linkedList.add(bVar);
                                return true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                bVar.f();
                return false;
        }
    }

    public final boolean c(b bVar) {
        switch (this.f2785s) {
            case 0:
                return d(bVar);
            default:
                boolean z6 = false;
                if (!this.f2786t) {
                    synchronized (this) {
                        try {
                            if (!this.f2786t) {
                                LinkedList linkedList = (LinkedList) this.f2787u;
                                if (linkedList != null && linkedList.remove(bVar)) {
                                    z6 = true;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    break;
                }
                return z6;
        }
    }

    @Override // L7.b
    public final void f() {
        switch (this.f2785s) {
            case 0:
                g();
                return;
            default:
                if (this.f2786t) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (!this.f2786t) {
                            this.f2786t = true;
                            LinkedList linkedList = (LinkedList) this.f2787u;
                            ArrayList arrayList = null;
                            this.f2787u = null;
                            if (linkedList != null) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((b) it.next()).f();
                                    } catch (Throwable th) {
                                        l.n(th);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(th);
                                    }
                                }
                                if (arrayList != null) {
                                    if (arrayList.size() != 1) {
                                        throw new CompositeException(arrayList);
                                    }
                                    throw c.a((Throwable) arrayList.get(0));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public final boolean h(b bVar) {
        switch (this.f2785s) {
            case 0:
                if (!c(bVar)) {
                    return false;
                }
                bVar.f();
                return true;
            default:
                if (!c(bVar)) {
                    return false;
                }
                ((m) bVar).f();
                return true;
        }
    }
}
