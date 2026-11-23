package Z9;

import A0.m;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import ma.o;
import ma.q;
import ma.r;
import ma.y;
import p068ga.n;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable, Flushable {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final L9.e f5940J = new L9.e("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f5941K = "CLEAN";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f5942L = "DIRTY";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f5943M = "REMOVE";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f5944N = "READ";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f5945A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f5946B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f5947C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5948D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5949E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f5950F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f5951G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p010aa.b f5952H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final f f5953I;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final File f5954s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final File f5955t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final File f5956u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final File f5957v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f5958w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q f5959x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f5960y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5961z;

    public g(File file, p010aa.c cVar) {
        i.f(cVar, "taskRunner");
        this.f5954s = file;
        this.f5960y = new LinkedHashMap(0, 0.75f, true);
        this.f5952H = cVar.e();
        this.f5953I = new f(this, i.k(" Cache", Y9.c.f5826g), 0);
        this.f5955t = new File(file, "journal");
        this.f5956u = new File(file, "journal.tmp");
        this.f5957v = new File(file, "journal.bkp");
    }

    public static void B(String str) {
        if (f5940J.a(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final void A() {
        while (this.f5958w > 10485760) {
            for (d dVar : this.f5960y.values()) {
                if (!dVar.f5930f) {
                    t(dVar);
                }
            }
            return;
        }
        this.f5949E = false;
    }

    public final synchronized void a() {
        if (this.f5948D) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void b(K0.g gVar, boolean z6) {
        i.f(gVar, "editor");
        d dVar = (d) gVar.f2526c;
        if (!i.a(dVar.f5931g, gVar)) {
            throw new IllegalStateException("Check failed.");
        }
        int i10 = 0;
        if (z6 && !dVar.f5929e) {
            int i11 = 0;
            while (i11 < 2) {
                int i12 = i11 + 1;
                boolean[] zArr = (boolean[]) gVar.f2527d;
                i.c(zArr);
                if (!zArr[i11]) {
                    gVar.c();
                    throw new IllegalStateException(i.k(Integer.valueOf(i11), "Newly created entry didn't create value for index "));
                }
                File file = (File) dVar.f5928d.get(i11);
                i.f(file, "file");
                if (!file.exists()) {
                    gVar.c();
                    return;
                }
                i11 = i12;
            }
        }
        int i13 = 0;
        while (i13 < 2) {
            int i14 = i13 + 1;
            File file2 = (File) dVar.f5928d.get(i13);
            if (!z6 || dVar.f5930f) {
                i.f(file2, "file");
                if (!file2.delete() && file2.exists()) {
                    throw new IOException(i.k(file2, "failed to delete "));
                }
            } else {
                p058fa.a aVar = p058fa.a.a;
                if (aVar.c(file2)) {
                    File file3 = (File) dVar.f5927c.get(i13);
                    aVar.d(file2, file3);
                    long j = dVar.f5926b[i13];
                    long length = file3.length();
                    dVar.f5926b[i13] = length;
                    this.f5958w = (this.f5958w - j) + length;
                }
            }
            i13 = i14;
        }
        dVar.f5931g = null;
        if (dVar.f5930f) {
            t(dVar);
            return;
        }
        this.f5961z++;
        q qVar = this.f5959x;
        i.c(qVar);
        if (dVar.f5929e || z6) {
            dVar.f5929e = true;
            qVar.Q(f5941K);
            qVar.z(32);
            qVar.Q(dVar.a);
            long[] jArr = dVar.f5926b;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                i10++;
                qVar.z(32);
                qVar.R(j10);
            }
            qVar.z(10);
            if (z6) {
                long j11 = this.f5951G;
                this.f5951G = 1 + j11;
                dVar.f5933i = j11;
            }
        } else {
            this.f5960y.remove(dVar.a);
            qVar.Q(f5943M);
            qVar.z(32);
            qVar.Q(dVar.a);
            qVar.z(10);
        }
        qVar.flush();
        if (this.f5958w > 10485760 || i()) {
            this.f5952H.c(this.f5953I, 0L);
        }
    }

    public final synchronized K0.g c(String str, long j) {
        try {
            i.f(str, "key");
            h();
            a();
            B(str);
            d dVar = (d) this.f5960y.get(str);
            if (j != -1 && (dVar == null || dVar.f5933i != j)) {
                return null;
            }
            if ((dVar == null ? null : dVar.f5931g) != null) {
                return null;
            }
            if (dVar != null && dVar.f5932h != 0) {
                return null;
            }
            if (!this.f5949E && !this.f5950F) {
                q qVar = this.f5959x;
                i.c(qVar);
                qVar.Q(f5942L);
                qVar.z(32);
                qVar.Q(str);
                qVar.z(10);
                qVar.flush();
                if (this.f5945A) {
                    return null;
                }
                if (dVar == null) {
                    dVar = new d(this, str);
                    this.f5960y.put(str, dVar);
                }
                K0.g gVar = new K0.g(this, dVar);
                dVar.f5931g = gVar;
                return gVar;
            }
            this.f5952H.c(this.f5953I, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f5947C && !this.f5948D) {
                Collection collectionValues = this.f5960y.values();
                i.e(collectionValues, "lruEntries.values");
                int i10 = 0;
                Object[] array = collectionValues.toArray(new d[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                d[] dVarArr = (d[]) array;
                int length = dVarArr.length;
                while (i10 < length) {
                    d dVar = dVarArr[i10];
                    i10++;
                    K0.g gVar = dVar.f5931g;
                    if (gVar != null) {
                        gVar.e();
                    }
                }
                A();
                q qVar = this.f5959x;
                i.c(qVar);
                qVar.close();
                this.f5959x = null;
                this.f5948D = true;
                return;
            }
            this.f5948D = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f5947C) {
            a();
            A();
            q qVar = this.f5959x;
            i.c(qVar);
            qVar.flush();
        }
    }

    public final synchronized e g(String str) {
        i.f(str, "key");
        h();
        a();
        B(str);
        d dVar = (d) this.f5960y.get(str);
        if (dVar == null) {
            return null;
        }
        e eVarA = dVar.a();
        if (eVarA == null) {
            return null;
        }
        this.f5961z++;
        q qVar = this.f5959x;
        i.c(qVar);
        qVar.Q(f5944N);
        qVar.z(32);
        qVar.Q(str);
        qVar.z(10);
        if (i()) {
            this.f5952H.c(this.f5953I, 0L);
        }
        return eVarA;
    }

    public final synchronized void h() {
        ma.a aVarC;
        boolean z6;
        try {
            byte[] bArr = Y9.c.a;
            if (this.f5947C) {
                return;
            }
            p058fa.a aVar = p058fa.a.a;
            if (aVar.c(this.f5957v)) {
                if (aVar.c(this.f5955t)) {
                    aVar.a(this.f5957v);
                } else {
                    aVar.d(this.f5957v, this.f5955t);
                }
            }
            File file = this.f5957v;
            i.f(file, "file");
            aVar.getClass();
            i.f(file, "file");
            try {
                aVarC = p068ga.d.C(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                aVarC = p068ga.d.C(file);
            }
            try {
                try {
                    aVar.a(file);
                    aVarC.close();
                    z6 = true;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.bumptech.glide.c.c(aVarC, th);
                        throw th2;
                    }
                }
            } catch (IOException unused2) {
                aVarC.close();
                aVar.a(file);
                z6 = false;
            }
            this.f5946B = z6;
            File file2 = this.f5955t;
            i.f(file2, "file");
            if (file2.exists()) {
                try {
                    n();
                    l();
                    this.f5947C = true;
                    return;
                } catch (IOException e10) {
                    n nVar = n.a;
                    n nVar2 = n.a;
                    String str = "DiskLruCache " + this.f5954s + " is corrupt: " + ((Object) e10.getMessage()) + ", removing";
                    nVar2.getClass();
                    n.i(str, 5, e10);
                    try {
                        close();
                        p058fa.a.a.b(this.f5954s);
                        this.f5948D = false;
                        p();
                        this.f5947C = true;
                    } catch (Throwable th3) {
                        this.f5948D = false;
                        throw th3;
                    }
                }
            }
            p();
            this.f5947C = true;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final boolean i() {
        int i10 = this.f5961z;
        return i10 >= 2000 && i10 >= this.f5960y.size();
    }

    public final q j() {
        ma.a aVar;
        int i10 = 1;
        File file = this.f5955t;
        i.f(file, "file");
        try {
            Logger logger = o.a;
            aVar = new ma.a(new FileOutputStream(file, true), i10, new y());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = o.a;
            aVar = new ma.a(new FileOutputStream(file, true), i10, new y());
        }
        return p068ga.d.c(new h(aVar, new m(this, 25)));
    }

    public final void l() throws IOException {
        File file = this.f5956u;
        p058fa.a aVar = p058fa.a.a;
        aVar.a(file);
        Iterator it = this.f5960y.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i.e(next, "i.next()");
            d dVar = (d) next;
            int i10 = 0;
            if (dVar.f5931g == null) {
                while (i10 < 2) {
                    this.f5958w += dVar.f5926b[i10];
                    i10++;
                }
            } else {
                dVar.f5931g = null;
                while (i10 < 2) {
                    aVar.a((File) dVar.f5927c.get(i10));
                    aVar.a((File) dVar.f5928d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void n() {
        File file = this.f5955t;
        i.f(file, "file");
        r rVarD = p068ga.d.d(p068ga.d.D(file));
        try {
            String strO = rVarD.o(Long.MAX_VALUE);
            String strO2 = rVarD.o(Long.MAX_VALUE);
            String strO3 = rVarD.o(Long.MAX_VALUE);
            String strO4 = rVarD.o(Long.MAX_VALUE);
            String strO5 = rVarD.o(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strO) || !"1".equals(strO2) || !i.a(String.valueOf(201105), strO3) || !i.a(String.valueOf(2), strO4) || strO5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strO + ", " + strO2 + ", " + strO4 + ", " + strO5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    o(rVarD.o(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.f5961z = i10 - this.f5960y.size();
                    if (rVarD.a()) {
                        this.f5959x = j();
                    } else {
                        p();
                    }
                    rVarD.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.bumptech.glide.c.c(rVarD, th);
                throw th2;
            }
        }
    }

    public final void o(String str) throws IOException {
        String strSubstring;
        int i10 = 0;
        int iO = L9.f.O(str, ' ', 0, 6);
        if (iO == -1) {
            throw new IOException(i.k(str, "unexpected journal line: "));
        }
        int i11 = iO + 1;
        int iO2 = L9.f.O(str, ' ', i11, 4);
        LinkedHashMap linkedHashMap = this.f5960y;
        if (iO2 == -1) {
            strSubstring = str.substring(i11);
            i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f5943M;
            if (iO == str2.length() && L9.n.I(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i11, iO2);
            i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        d dVar = (d) linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(this, strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iO2 != -1) {
            String str3 = f5941K;
            if (iO == str3.length() && L9.n.I(str, str3, false)) {
                String strSubstring2 = str.substring(iO2 + 1);
                i.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listB0 = L9.f.b0(strSubstring2, new char[]{' '});
                dVar.f5929e = true;
                dVar.f5931g = null;
                int size = listB0.size();
                dVar.j.getClass();
                if (size != 2) {
                    throw new IOException(i.k(listB0, "unexpected journal line: "));
                }
                try {
                    int size2 = listB0.size();
                    while (i10 < size2) {
                        int i12 = i10 + 1;
                        dVar.f5926b[i10] = Long.parseLong((String) listB0.get(i10));
                        i10 = i12;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException(i.k(listB0, "unexpected journal line: "));
                }
            }
        }
        if (iO2 == -1) {
            String str4 = f5942L;
            if (iO == str4.length() && L9.n.I(str, str4, false)) {
                dVar.f5931g = new K0.g(this, dVar);
                return;
            }
        }
        if (iO2 == -1) {
            String str5 = f5944N;
            if (iO == str5.length() && L9.n.I(str, str5, false)) {
                return;
            }
        }
        throw new IOException(i.k(str, "unexpected journal line: "));
    }

    public final synchronized void p() {
        ma.a aVarC;
        try {
            q qVar = this.f5959x;
            if (qVar != null) {
                qVar.close();
            }
            File file = this.f5956u;
            i.f(file, "file");
            try {
                aVarC = p068ga.d.C(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                aVarC = p068ga.d.C(file);
            }
            q qVarC = p068ga.d.c(aVarC);
            try {
                qVarC.Q("libcore.io.DiskLruCache");
                qVarC.z(10);
                qVarC.Q("1");
                qVarC.z(10);
                qVarC.R(201105);
                qVarC.z(10);
                qVarC.R(2);
                qVarC.z(10);
                qVarC.z(10);
                Iterator it = this.f5960y.values().iterator();
                while (true) {
                    int i10 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (dVar.f5931g != null) {
                        qVarC.Q(f5942L);
                        qVarC.z(32);
                        qVarC.Q(dVar.a);
                        qVarC.z(10);
                    } else {
                        qVarC.Q(f5941K);
                        qVarC.z(32);
                        qVarC.Q(dVar.a);
                        long[] jArr = dVar.f5926b;
                        int length = jArr.length;
                        while (i10 < length) {
                            long j = jArr[i10];
                            i10++;
                            qVarC.z(32);
                            qVarC.R(j);
                        }
                        qVarC.z(10);
                    }
                }
                qVarC.close();
                p058fa.a aVar = p058fa.a.a;
                if (aVar.c(this.f5955t)) {
                    aVar.d(this.f5955t, this.f5957v);
                }
                aVar.d(this.f5956u, this.f5955t);
                aVar.a(this.f5957v);
                this.f5959x = j();
                this.f5945A = false;
                this.f5950F = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.bumptech.glide.c.c(qVarC, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void t(d dVar) {
        q qVar;
        i.f(dVar, "entry");
        boolean z6 = this.f5946B;
        String str = dVar.a;
        if (!z6) {
            if (dVar.f5932h > 0 && (qVar = this.f5959x) != null) {
                qVar.Q(f5942L);
                qVar.z(32);
                qVar.Q(str);
                qVar.z(10);
                qVar.flush();
            }
            if (dVar.f5932h > 0 || dVar.f5931g != null) {
                dVar.f5930f = true;
                return;
            }
        }
        K0.g gVar = dVar.f5931g;
        if (gVar != null) {
            gVar.e();
        }
        int i10 = 0;
        while (i10 < 2) {
            int i11 = i10 + 1;
            File file = (File) dVar.f5927c.get(i10);
            i.f(file, "file");
            if (!file.delete() && file.exists()) {
                throw new IOException(i.k(file, "failed to delete "));
            }
            long j = this.f5958w;
            long[] jArr = dVar.f5926b;
            this.f5958w = j - jArr[i10];
            jArr[i10] = 0;
            i10 = i11;
        }
        this.f5961z++;
        q qVar2 = this.f5959x;
        if (qVar2 != null) {
            qVar2.Q(f5943M);
            qVar2.z(32);
            qVar2.Q(str);
            qVar2.z(10);
        }
        this.f5960y.remove(str);
        if (i()) {
            this.f5952H.c(this.f5953I, 0L);
        }
    }
}
