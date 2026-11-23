package p247z9;

import A0.m;
import A0.r;
import A1.J;
import A9.C0134g;
import C9.i;
import o1.e;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile e f16320v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f16321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, r rVar, m mVar) {
        super(lVar, rVar);
        this.f16321w = mVar;
        if (lVar == null) {
            f(0);
            throw null;
        }
        this.f16320v = null;
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i10 != 2 ? 2 : 3];
        if (i10 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i10 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i10 == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void f(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "computable";
        } else if (i10 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p247z9.h
    public final void c(Object obj) {
        this.f16320v = new e(obj);
        try {
            if (obj == null) {
                a(2);
                throw null;
            }
            this.f16321w.invoke(obj);
            this.f16320v = null;
        } catch (Throwable th) {
            this.f16320v = null;
            throw th;
        }
    }

    @Override // p247z9.h
    public final J d(boolean z6) {
        return new J(new C0134g(com.bumptech.glide.d.u(i.f1017d)), false, 9);
    }

    @Override // p247z9.h, p200u8.a
    public final Object invoke() throws Throwable {
        Object objInvoke;
        e eVar = this.f16320v;
        if (eVar == null || ((Thread) eVar.f13628u) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else {
            if (((Thread) eVar.f13628u) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objInvoke = eVar.f13627t;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        f(2);
        throw null;
    }
}
