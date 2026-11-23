package p247z9;

import A1.J;
import J9.k;
import J9.l;
import p200u8.a;

/* JADX INFO: loaded from: classes.dex */
public class h implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f16324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f16325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile Object f16326u;

    public h(l lVar, a aVar) {
        if (lVar == null) {
            a(0);
            throw null;
        }
        this.f16326u = k.f16330s;
        this.f16324s = lVar;
        this.f16325t = aVar;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "computable";
        } else if (i10 == 2 || i10 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i10 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i10 != 2 && i10 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public J d(boolean z6) {
        J jD = this.f16324s.d(null, "in a lazy value");
        if (jD != null) {
            return jD;
        }
        a(2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003a A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006d, B:34:0x006e, B:35:0x0074, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006d, B:34:0x006e, B:35:0x0074, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0066, B:33:0x006d, B:34:0x006e, B:35:0x0074, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
    @Override // p200u8.a
    public Object invoke() throws Throwable {
        J jD;
        Object obj = this.f16326u;
        if (!(obj instanceof k)) {
            l.l(obj);
            return obj;
        }
        this.f16324s.a.lock();
        try {
            Object objInvoke = this.f16326u;
            if (objInvoke instanceof k) {
                k kVar = k.f16331t;
                k kVar2 = k.f16332u;
                if (objInvoke == kVar) {
                    this.f16326u = kVar2;
                    J jD2 = d(true);
                    if (!jD2.f75t) {
                        objInvoke = jD2.f76u;
                    } else if (objInvoke == kVar2) {
                        jD = d(false);
                        if (jD.f75t) {
                            this.f16326u = kVar;
                            try {
                                objInvoke = this.f16325t.invoke();
                                c(objInvoke);
                                this.f16326u = objInvoke;
                            } catch (Throwable th) {
                                if (l.j(th)) {
                                    this.f16326u = k.f16330s;
                                    throw th;
                                }
                                if (this.f16326u == kVar) {
                                    this.f16326u = new k(th);
                                }
                                this.f16324s.f16336b.getClass();
                                throw th;
                            }
                        } else {
                            objInvoke = jD.f76u;
                        }
                    } else {
                        this.f16326u = kVar;
                        objInvoke = this.f16325t.invoke();
                        c(objInvoke);
                        this.f16326u = objInvoke;
                    }
                } else if (objInvoke == kVar2) {
                    jD = d(false);
                    if (jD.f75t) {
                        objInvoke = jD.f76u;
                    } else {
                        this.f16326u = kVar;
                        objInvoke = this.f16325t.invoke();
                        c(objInvoke);
                        this.f16326u = objInvoke;
                    }
                } else {
                    this.f16326u = kVar;
                    objInvoke = this.f16325t.invoke();
                    c(objInvoke);
                    this.f16326u = objInvoke;
                }
            } else {
                l.l(objInvoke);
            }
            this.f16324s.a.unlock();
            return objInvoke;
        } catch (Throwable th2) {
            this.f16324s.a.unlock();
            throw th2;
        }
    }

    public void c(Object obj) {
    }
}
