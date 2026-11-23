package com.google.android.gms.tasks;

import P2.f;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class TaskCompletionSource<TResult> {
    public final f a = new f();

    public final void a(Exception exc) {
        this.a.o(exc);
    }

    public final void b(Object obj) {
        this.a.p(obj);
    }

    public final boolean c(Exception exc) {
        f fVar = this.a;
        fVar.getClass();
        Preconditions.j(exc, "Exception must not be null");
        synchronized (fVar.a) {
            try {
                if (fVar.f3855c) {
                    return false;
                }
                fVar.f3855c = true;
                fVar.f3858f = exc;
                fVar.f3854b.i(fVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        f fVar = this.a;
        synchronized (fVar.a) {
            try {
                if (fVar.f3855c) {
                    return;
                }
                fVar.f3855c = true;
                fVar.f3857e = obj;
                fVar.f3854b.i(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
