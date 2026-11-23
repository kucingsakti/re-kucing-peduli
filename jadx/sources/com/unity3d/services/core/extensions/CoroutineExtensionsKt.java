package com.unity3d.services.core.extensions;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p076h8.g;
import p076h8.h;
import p200u8.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"R", "Lkotlin/Function0;", "block", "Lh8/h;", "runSuspendCatching", "(Lu8/a;)Ljava/lang/Object;", "runReturnSuspendCatching", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CoroutineExtensionsKt {
    public static final <R> Object runReturnSuspendCatching(a aVar) {
        Object objD;
        Throwable thA;
        i.f(aVar, "block");
        try {
            objD = aVar.invoke();
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            objD = J7.a.d(th);
        }
        return ((objD instanceof g) && (thA = h.a(objD)) != null) ? J7.a.d(thA) : objD;
    }

    public static final <R> Object runSuspendCatching(a aVar) {
        i.f(aVar, "block");
        try {
            return aVar.invoke();
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            return J7.a.d(th);
        }
    }
}
