package K0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class o implements O0.e, O0.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final TreeMap f2564A = new TreeMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile String f2566t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long[] f2567u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final double[] f2568v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String[] f2569w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final byte[][] f2570x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f2571y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2572z;

    public o(int i10) {
        this.f2565s = i10;
        int i11 = i10 + 1;
        this.f2571y = new int[i11];
        this.f2567u = new long[i11];
        this.f2568v = new double[i11];
        this.f2569w = new String[i11];
        this.f2570x = new byte[i11][];
    }

    public static final o c(int i10, String str) {
        p210v8.i.f(str, "query");
        TreeMap treeMap = f2564A;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (entryCeilingEntry == null) {
                o oVar = new o(i10);
                oVar.f2566t = str;
                oVar.f2572z = i10;
                return oVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            o oVar2 = (o) entryCeilingEntry.getValue();
            oVar2.getClass();
            oVar2.f2566t = str;
            oVar2.f2572z = i10;
            return oVar2;
        }
    }

    @Override // O0.d
    public final void I(int i10, long j) {
        this.f2571y[i10] = 2;
        this.f2567u[i10] = j;
    }

    @Override // O0.d
    public final void M(int i10, byte[] bArr) {
        this.f2571y[i10] = 5;
        this.f2570x[i10] = bArr;
    }

    @Override // O0.e
    public final String a() {
        String str = this.f2566t;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // O0.e
    public final void b(O0.d dVar) {
        int i10 = this.f2572z;
        if (1 > i10) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.f2571y[i11];
            if (i12 == 1) {
                dVar.v(i11);
            } else if (i12 == 2) {
                dVar.I(i11, this.f2567u[i11]);
            } else if (i12 == 3) {
                dVar.w(i11, this.f2568v[i11]);
            } else if (i12 == 4) {
                String str = this.f2569w[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.m(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.f2570x[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.M(i11, bArr);
            }
            if (i11 == i10) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void g() {
        TreeMap treeMap = f2564A;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f2565s), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                p210v8.i.e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // O0.d
    public final void m(int i10, String str) {
        p210v8.i.f(str, "value");
        this.f2571y[i10] = 4;
        this.f2569w[i10] = str;
    }

    @Override // O0.d
    public final void v(int i10) {
        this.f2571y[i10] = 1;
    }

    @Override // O0.d
    public final void w(int i10, double d3) {
        this.f2571y[i10] = 3;
        this.f2568v[i10] = d3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
