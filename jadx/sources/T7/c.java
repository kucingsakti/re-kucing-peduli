package T7;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4705u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Throwable f4706v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f4707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicInteger f4708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f4709y;

    public c(J7.f fVar, int i10) {
        super(fVar);
        this.f4709y = new Y7.b(i10);
        this.f4708x = new AtomicInteger();
    }

    @Override // J7.d
    public final void d(Object obj) {
        switch (this.f4705u) {
            case 0:
                if (!this.f4707w && !this.f4704t.a()) {
                    ((Y7.b) this.f4709y).offer(obj);
                    j();
                    break;
                }
                break;
            default:
                if (!this.f4707w && !this.f4704t.a()) {
                    ((AtomicReference) this.f4709y).set(obj);
                    j();
                    break;
                }
                break;
        }
    }

    @Override // T7.b
    public final void e() {
        switch (this.f4705u) {
            case 0:
                j();
                break;
            default:
                j();
                break;
        }
    }

    @Override // T7.b
    public final void g() {
        switch (this.f4705u) {
            case 0:
                if (this.f4708x.getAndIncrement() == 0) {
                    ((Y7.b) this.f4709y).clear();
                }
                break;
            default:
                if (this.f4708x.getAndIncrement() == 0) {
                    ((AtomicReference) this.f4709y).lazySet(null);
                }
                break;
        }
    }

    @Override // T7.b
    public final boolean i(Throwable th) {
        switch (this.f4705u) {
            case 0:
                if (this.f4707w || this.f4704t.a()) {
                    return false;
                }
                this.f4706v = th;
                this.f4707w = true;
                j();
                return true;
            default:
                if (this.f4707w || this.f4704t.a()) {
                    return false;
                }
                this.f4706v = th;
                this.f4707w = true;
                j();
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:82:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x00ea A[SYNTHETIC] */
    public final void j() {
        boolean z6;
        Throwable th;
        switch (this.f4705u) {
            case 0:
                if (this.f4708x.getAndIncrement() == 0) {
                    J7.f fVar = this.f4703s;
                    Y7.b bVar = (Y7.b) this.f4709y;
                    int iAddAndGet = 1;
                    do {
                        long j = get();
                        for (long j10 = 0; j10 != j; j10++) {
                            if (this.f4704t.a()) {
                                bVar.clear();
                            } else {
                                boolean z10 = this.f4707w;
                                Object objPoll = bVar.poll();
                                boolean z11 = objPoll == null;
                                if (z10 && z11) {
                                    Throwable th2 = this.f4706v;
                                    if (th2 != null) {
                                        b(th2);
                                    } else {
                                        a();
                                    }
                                } else if (z11) {
                                    if (j10 == j) {
                                        if (this.f4704t.a()) {
                                            bVar.clear();
                                        } else {
                                            z6 = this.f4707w;
                                            boolean zIsEmpty = bVar.isEmpty();
                                            if (z6 && zIsEmpty) {
                                                th = this.f4706v;
                                                if (th != null) {
                                                    b(th);
                                                } else {
                                                    a();
                                                }
                                            }
                                        }
                                    }
                                    if (j10 != 0) {
                                        com.bumptech.glide.e.n(this, j10);
                                    }
                                    iAddAndGet = this.f4708x.addAndGet(-iAddAndGet);
                                } else {
                                    fVar.d(objPoll);
                                }
                            }
                            break;
                        }
                        if (j10 == j) {
                            if (this.f4704t.a()) {
                                bVar.clear();
                            } else {
                                z6 = this.f4707w;
                                boolean zIsEmpty2 = bVar.isEmpty();
                                if (z6) {
                                    th = this.f4706v;
                                    if (th != null) {
                                        b(th);
                                    } else {
                                        a();
                                    }
                                }
                            }
                        }
                        if (j10 != 0) {
                            com.bumptech.glide.e.n(this, j10);
                        }
                        iAddAndGet = this.f4708x.addAndGet(-iAddAndGet);
                        break;
                    } while (iAddAndGet != 0);
                }
                break;
            default:
                if (this.f4708x.getAndIncrement() == 0) {
                    J7.f fVar2 = this.f4703s;
                    AtomicReference atomicReference = (AtomicReference) this.f4709y;
                    int iAddAndGet2 = 1;
                    do {
                        long j11 = get();
                        long j12 = 0;
                        while (true) {
                            if (j12 != j11) {
                                if (this.f4704t.a()) {
                                    atomicReference.lazySet(null);
                                    break;
                                } else {
                                    boolean z12 = this.f4707w;
                                    Object andSet = atomicReference.getAndSet(null);
                                    boolean z13 = andSet == null;
                                    if (z12 && z13) {
                                        Throwable th3 = this.f4706v;
                                        if (th3 != null) {
                                            b(th3);
                                        } else {
                                            a();
                                        }
                                        break;
                                    } else if (!z13) {
                                        fVar2.d(andSet);
                                        j12++;
                                    }
                                }
                            }
                        }
                        if (j12 == j11) {
                            if (this.f4704t.a()) {
                                atomicReference.lazySet(null);
                            } else {
                                boolean z14 = this.f4707w;
                                boolean z15 = atomicReference.get() == null;
                                if (z14 && z15) {
                                    Throwable th4 = this.f4706v;
                                    if (th4 != null) {
                                        b(th4);
                                    } else {
                                        a();
                                    }
                                }
                            }
                        }
                        if (j12 != 0) {
                            com.bumptech.glide.e.n(this, j12);
                        }
                        iAddAndGet2 = this.f4708x.addAndGet(-iAddAndGet2);
                        break;
                    } while (iAddAndGet2 != 0);
                }
                break;
        }
    }

    public c(J7.f fVar) {
        super(fVar);
        this.f4709y = new AtomicReference();
        this.f4708x = new AtomicInteger();
    }
}
