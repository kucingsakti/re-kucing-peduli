package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p224x2.u;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@KeepName
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    public static final F2.c j = new F2.c(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f7893b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Result f7897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7899h;

    @KeepName
    private u resultGuardian;
    public final Object a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f7894c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7895d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f7896e = new AtomicReference();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7900i = false;

    public static class CallbackHandler<R extends Result> extends com.google.android.gms.internal.base.zau {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    Log.wtf("BasePendingResult", AbstractC0487g.g(i10, "Don't know how to handle message: "), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).c(Status.f7878y);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.a(result);
            } catch (RuntimeException e10) {
                BasePendingResult.i(result);
                throw e10;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        new CallbackHandler(Looper.getMainLooper());
        this.f7893b = new WeakReference(null);
    }

    public static void i(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).g();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(result)), e10);
            }
        }
    }

    public void a() {
        synchronized (this.a) {
            try {
                if (this.f7898g) {
                    return;
                }
                i(this.f7897f);
                this.f7898g = true;
                g(b(Status.f7879z));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Result b(Status status);

    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!e()) {
                    f(b(status));
                    this.f7899h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z6;
        synchronized (this.a) {
            z6 = this.f7898g;
        }
        return z6;
    }

    public final boolean e() {
        return this.f7894c.getCount() == 0;
    }

    public final void f(Result result) {
        synchronized (this.a) {
            try {
                if (this.f7899h || this.f7898g) {
                    i(result);
                    return;
                }
                e();
                Preconditions.k("Results have already been set", !e());
                Preconditions.k("Result has already been consumed", !false);
                g(result);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Result result) {
        this.f7897f = result;
        result.n();
        this.f7894c.countDown();
        if (!this.f7898g && (this.f7897f instanceof Releasable)) {
            this.resultGuardian = new u(this);
        }
        ArrayList arrayList = this.f7895d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((PendingResult.StatusListener) arrayList.get(i10)).a();
        }
        this.f7895d.clear();
    }

    public final void h() {
        boolean z6 = true;
        if (!this.f7900i && !((Boolean) j.get()).booleanValue()) {
            z6 = false;
        }
        this.f7900i = z6;
    }
}
