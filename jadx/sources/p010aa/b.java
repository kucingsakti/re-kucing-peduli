package p010aa;

import P0.d;
import Y9.c;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p181s3.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f6020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6022f;

    public b(c cVar, String str) {
        i.f(cVar, "taskRunner");
        i.f(str, MediationMetaData.KEY_NAME);
        this.a = cVar;
        this.f6018b = str;
        this.f6021e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = c.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f6020d;
        if (aVar != null && aVar.f6015b) {
            this.f6022f = true;
        }
        ArrayList arrayList = this.f6021e;
        int size = arrayList.size() - 1;
        boolean z6 = false;
        if (size < 0) {
            return false;
        }
        while (true) {
            int i10 = size - 1;
            if (((a) arrayList.get(size)).f6015b) {
                a aVar2 = (a) arrayList.get(size);
                if (c.f6024i.isLoggable(Level.FINE)) {
                    a.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z6 = true;
            }
            if (i10 < 0) {
                return z6;
            }
            size = i10;
        }
    }

    public final void c(a aVar, long j) {
        i.f(aVar, "task");
        synchronized (this.a) {
            if (!this.f6019c) {
                if (e(aVar, j, false)) {
                    this.a.d(this);
                }
            } else if (aVar.f6015b) {
                if (c.f6024i.isLoggable(Level.FINE)) {
                    a.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (c.f6024i.isLoggable(Level.FINE)) {
                    a.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[LOOP:0: B:23:0x0068->B:28:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0080 A[EDGE_INSN: B:40:0x0080->B:30:0x0080 BREAK  A[LOOP:0: B:23:0x0068->B:28:0x007c], SYNTHETIC] */
    public final boolean e(a aVar, long j, boolean z6) {
        Iterator it;
        int size;
        String strK;
        i.f(aVar, "task");
        b bVar = aVar.f6016c;
        if (bVar != this) {
            if (bVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f6016c = this;
        }
        d dVar = this.a.a;
        long jNanoTime = System.nanoTime();
        long j10 = jNanoTime + j;
        ArrayList arrayList = this.f6021e;
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf == -1) {
            aVar.f6017d = j10;
            if (c.f6024i.isLoggable(Level.FINE)) {
                if (z6) {
                    strK = i.k(a.h(j10 - jNanoTime), "run again after ");
                } else {
                    strK = i.k(a.h(j10 - jNanoTime), "scheduled after ");
                }
                a.a(aVar, this, strK);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).f6017d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, aVar);
            if (size == 0) {
                return true;
            }
        } else if (aVar.f6017d > j10) {
            arrayList.remove(iIndexOf);
            aVar.f6017d = j10;
            if (c.f6024i.isLoggable(Level.FINE)) {
                if (z6) {
                    strK = i.k(a.h(j10 - jNanoTime), "run again after ");
                } else {
                    strK = i.k(a.h(j10 - jNanoTime), "scheduled after ");
                }
                a.a(aVar, this, strK);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).f6017d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, aVar);
            if (size == 0) {
                return true;
            }
        } else if (c.f6024i.isLoggable(Level.FINE)) {
            a.a(aVar, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void f() {
        byte[] bArr = c.a;
        synchronized (this.a) {
            this.f6019c = true;
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f6018b;
    }
}
