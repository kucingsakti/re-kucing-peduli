package O3;

import Q3.C0367a0;
import Q3.D0;
import Q3.O;
import Q3.P;
import Q3.Q;
import Q3.S;
import Q3.U;
import Q3.V;
import Q3.W;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p188t1.G;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f3532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Throwable f3533t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Thread f3534u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ V3.b f3535v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f3536w;

    public l(o oVar, long j, Throwable th, Thread thread, V3.b bVar) {
        this.f3536w = oVar;
        this.f3532s = j;
        this.f3533t = th;
        this.f3534u = thread;
        this.f3535v = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        s sVar;
        int i10;
        Stack stack;
        o1.h hVar;
        Boolean bool;
        o1.r rVar;
        long j = this.f3532s;
        long j10 = j / 1000;
        o oVar = this.f3536w;
        NavigableSet navigableSetC = ((T3.a) oVar.f3553m.f14979t).c();
        Boolean bool2 = null;
        String str2 = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
        if (str2 == null) {
            return Tasks.e(null);
        }
        o1.e eVar = oVar.f3544c;
        eVar.getClass();
        try {
            String str3 = (String) eVar.f13627t;
            T3.c cVar = (T3.c) eVar.f13628u;
            cVar.getClass();
            new File((File) cVar.f4658c, str3).createNewFile();
            while (true) {
                boolean zIsEmpty = stack.isEmpty();
                bool = bool2;
                rVar = sVar.f3578d;
                if (zIsEmpty) {
                    break;
                }
                Throwable th = (Throwable) stack.pop();
                hVar = new o1.h(th.getLocalizedMessage(), th.getClass().getName(), rVar.d(th.getStackTrace()), hVar);
                stack = stack;
                i10 = i10;
                bool2 = bool;
                str = str;
            }
        } catch (IOException unused) {
        }
        G g8 = oVar.f3553m;
        g8.getClass();
        str = "FirebaseCrashlytics";
        Log.isLoggable("FirebaseCrashlytics", 2);
        sVar = (s) g8.f14978s;
        Context context = sVar.a;
        i10 = context.getResources().getConfiguration().orientation;
        stack = new Stack();
        for (Throwable cause = this.f3533t; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        hVar = null;
        String str4 = str;
        int i11 = i10;
        O o10 = new O();
        o10.f4117b = "crash";
        o10.a = j10;
        o10.f4122g = (byte) (o10.f4122g | 1);
        D0 d0C = L3.d.a.c(context);
        int i12 = ((C0367a0) d0C).f4166c;
        Boolean boolValueOf = i12 > 0 ? Boolean.valueOf(i12 != 100) : bool;
        ArrayList arrayListB = L3.d.b(context);
        byte b3 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) hVar.f13634u;
        Thread thread = this.f3534u;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b7 = (byte) 1;
        List listD = s.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        String str5 = str2;
        if (b7 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b7 == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(E0.a.k(sb, "Missing required properties:"));
        }
        arrayList.add(new W(name, 4, listD));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (!key.equals(thread)) {
                StackTraceElement[] stackTraceElementArrD = rVar.d(entry.getValue());
                String name2 = key.getName();
                if (name2 == null) {
                    throw new NullPointerException("Null name");
                }
                List listD2 = s.d(stackTraceElementArrD, 0);
                if (listD2 == null) {
                    throw new NullPointerException("Null frames");
                }
                if (b7 != 1) {
                    byte b10 = b7;
                    StringBuilder sb2 = new StringBuilder();
                    if (b10 == 0) {
                        sb2.append(" importance");
                    }
                    throw new IllegalStateException(E0.a.k(sb2, "Missing required properties:"));
                }
                arrayList.add(new W(name2, 0, listD2));
            }
            b7 = b7;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        U uC = s.c(hVar, 0);
        V vE = s.e();
        List listA = sVar.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        S s9 = new S(listUnmodifiableList, uC, null, vE, listA);
        if (b3 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b3 == 0) {
                sb3.append(" uiOrientation");
            }
            throw new IllegalStateException(E0.a.k(sb3, "Missing required properties:"));
        }
        o10.f4118c = new Q(s9, null, null, boolValueOf, d0C, arrayListB, i11);
        o10.f4119d = sVar.b(i11);
        P pA = o10.a();
        P3.e eVar2 = (P3.e) g8.f14981v;
        T3.c cVar2 = (T3.c) g8.f14982w;
        ((T3.a) g8.f14979t).d(G.d(G.c(pA, eVar2, cVar2), cVar2), str5, true);
        try {
            T3.c cVar3 = oVar.f3548g;
            String str6 = ".ae" + j;
            cVar3.getClass();
            if (!new File((File) cVar3.f4658c, str6).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            Log.w(str4, "Could not create app exception marker file.", e10);
        }
        V3.b bVar = this.f3535v;
        oVar.c(false, bVar);
        new e(oVar.f3547f);
        o.a(oVar, e.f3523b, Boolean.FALSE);
        if (!oVar.f3543b.u()) {
            return Tasks.e(bool);
        }
        ExecutorService executorService = (ExecutorService) oVar.f3546e.f13632s;
        return ((TaskCompletionSource) ((AtomicReference) bVar.f5179i).get()).a.l(executorService, new o1.r(this, executorService, str5));
    }
}
