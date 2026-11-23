package p247z9;

import A1.J;
import J9.k;
import J9.l;
import java.util.concurrent.ConcurrentHashMap;
import p200u8.b;

/* JADX INFO: loaded from: classes.dex */
public class j implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f16327s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConcurrentHashMap f16328t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f16329u;

    public j(l lVar, ConcurrentHashMap concurrentHashMap, b bVar) {
        if (lVar == null) {
            a(0);
            throw null;
        }
        this.f16327s = lVar;
        this.f16328t = concurrentHashMap;
        this.f16329u = bVar;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "map";
        } else if (i10 == 2) {
            objArr[0] = "compute";
        } else if (i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i10 != 3 && i10 != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final AssertionError c(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f16327s);
        l.e(assertionError);
        return assertionError;
    }

    @Override // p200u8.b
    public Object invoke(Object obj) throws Throwable {
        ConcurrentHashMap concurrentHashMap = this.f16328t;
        Object obj2 = concurrentHashMap.get(obj);
        k kVar = k.f16331t;
        Object obj3 = l.a;
        AssertionError assertionErrorC = null;
        if (obj2 != null && obj2 != kVar) {
            l.l(obj2);
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        l lVar = this.f16327s;
        n nVar = lVar.a;
        n nVar2 = lVar.a;
        nVar.lock();
        try {
            Object obj4 = concurrentHashMap.get(obj);
            k kVar2 = k.f16332u;
            if (obj4 == kVar) {
                J jD = lVar.d(obj, "");
                if (jD == null) {
                    a(3);
                    throw null;
                }
                if (!jD.f75t) {
                    Object obj5 = jD.f76u;
                    nVar2.unlock();
                    return obj5;
                }
                obj4 = kVar2;
            }
            if (obj4 == kVar2) {
                J jD2 = lVar.d(obj, "");
                if (jD2 == null) {
                    a(3);
                    throw null;
                }
                if (!jD2.f75t) {
                    Object obj6 = jD2.f76u;
                    nVar2.unlock();
                    return obj6;
                }
            }
            if (obj4 != null) {
                l.l(obj4);
                assertionErrorC = obj4 != obj3 ? obj4 : null;
                nVar2.unlock();
                return assertionErrorC;
            }
            try {
                concurrentHashMap.put(obj, kVar);
                Object objInvoke = this.f16329u.invoke(obj);
                if (objInvoke != null) {
                    obj3 = objInvoke;
                }
                Object objPut = concurrentHashMap.put(obj, obj3);
                if (objPut == kVar) {
                    nVar2.unlock();
                    return objInvoke;
                }
                assertionErrorC = c(obj, objPut);
                throw assertionErrorC;
            } catch (Throwable th) {
                if (l.j(th)) {
                    concurrentHashMap.remove(obj);
                    throw th;
                }
                a aVar = lVar.f16336b;
                if (th == assertionErrorC) {
                    aVar.getClass();
                    throw th;
                }
                Object objPut2 = concurrentHashMap.put(obj, new k(th));
                if (objPut2 != kVar) {
                    throw c(obj, objPut2);
                }
                aVar.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            nVar2.unlock();
            throw th2;
        }
    }
}
