package com.bumptech.glide.load.engine;

import A1.A;
import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p232y1.e;

/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final StackTraceElement[] f7664x = new StackTraceElement[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f7665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e f7666t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7667u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Class f7668v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f7669w;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof GlideException)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((GlideException) th).f7665s.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, A a) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            a.append("Cause (");
            int i11 = i10 + 1;
            a.append(String.valueOf(i11));
            a.append(" of ");
            a.append(String.valueOf(size));
            a.append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof GlideException) {
                ((GlideException) th).e(a);
            } else {
                c(th, a);
            }
            i10 = i11;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i11 = i10 + 1;
            sb.append(i11);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f7665s, new A(appendable));
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strConcat;
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f7669w);
        sb.append(this.f7668v != null ? ", " + this.f7668v : "");
        int i10 = this.f7667u;
        if (i10 != 0) {
            if (i10 == 1) {
                str = "LOCAL";
            } else if (i10 == 2) {
                str = "REMOTE";
            } else if (i10 == 3) {
                str = "DATA_DISK_CACHE";
            } else if (i10 != 4) {
                str = i10 != 5 ? "null" : "MEMORY_CACHE";
            } else {
                str = "RESOURCE_DISK_CACHE";
            }
            strConcat = ", ".concat(str);
        } else {
            strConcat = "";
        }
        sb.append(strConcat);
        sb.append(this.f7666t != null ? ", " + this.f7666t : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public GlideException(String str, List list) {
        this.f7669w = str;
        setStackTrace(f7664x);
        this.f7665s = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }
}
