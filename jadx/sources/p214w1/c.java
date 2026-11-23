package p214w1;

import K0.g;
import M2.J;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p102k7.e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public BufferedWriter f15521A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15523C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final File f15527s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final File f15528t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final File f15529u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final File f15530v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f15532x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f15534z = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final LinkedHashMap f15522B = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f15524D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ThreadPoolExecutor f15525E = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final J f15526F = new J(this, 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f15531w = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f15533y = 1;

    public c(File file, long j) {
        this.f15527s = file;
        this.f15528t = new File(file, "journal");
        this.f15529u = new File(file, "journal.tmp");
        this.f15530v = new File(file, "journal.bkp");
        this.f15532x = j;
    }

    public static void A(File file, File file2, boolean z6) throws IOException {
        if (z6) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(c cVar, g gVar, boolean z6) {
        synchronized (cVar) {
            b bVar = (b) gVar.f2526c;
            if (bVar.f15519f != gVar) {
                throw new IllegalStateException();
            }
            if (z6 && !bVar.f15518e) {
                for (int i10 = 0; i10 < cVar.f15533y; i10++) {
                    if (!((boolean[]) gVar.f2527d)[i10]) {
                        gVar.c();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                    if (!bVar.f15517d[i10].exists()) {
                        gVar.c();
                        return;
                    }
                }
            }
            for (int i11 = 0; i11 < cVar.f15533y; i11++) {
                File file = bVar.f15517d[i11];
                if (!z6) {
                    c(file);
                } else if (file.exists()) {
                    File file2 = bVar.f15516c[i11];
                    file.renameTo(file2);
                    long j = bVar.f15515b[i11];
                    long length = file2.length();
                    bVar.f15515b[i11] = length;
                    cVar.f15534z = (cVar.f15534z - j) + length;
                }
            }
            cVar.f15523C++;
            bVar.f15519f = null;
            if (bVar.f15518e || z6) {
                bVar.f15518e = true;
                cVar.f15521A.append((CharSequence) "CLEAN");
                cVar.f15521A.append(' ');
                cVar.f15521A.append((CharSequence) bVar.a);
                cVar.f15521A.append((CharSequence) bVar.a());
                cVar.f15521A.append('\n');
                if (z6) {
                    cVar.f15524D++;
                }
            } else {
                cVar.f15522B.remove(bVar.a);
                cVar.f15521A.append((CharSequence) "REMOVE");
                cVar.f15521A.append(' ');
                cVar.f15521A.append((CharSequence) bVar.a);
                cVar.f15521A.append('\n');
            }
            h(cVar.f15521A);
            if (cVar.f15534z > cVar.f15532x || cVar.j()) {
                cVar.f15525E.submit(cVar.f15526F);
            }
        }
    }

    public static void b(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void h(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static c l(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                A(file2, file3, false);
            }
        }
        c cVar = new c(file, j);
        if (cVar.f15528t.exists()) {
            try {
                cVar.o();
                cVar.n();
                return cVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                cVar.close();
                f.a(cVar.f15527s);
            }
        }
        file.mkdirs();
        c cVar2 = new c(file, j);
        cVar2.t();
        return cVar2;
    }

    public final void B() {
        while (this.f15534z > this.f15532x) {
            String str = (String) ((Map.Entry) this.f15522B.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f15521A == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    b bVar = (b) this.f15522B.get(str);
                    if (bVar != null && bVar.f15519f == null) {
                        for (int i10 = 0; i10 < this.f15533y; i10++) {
                            File file = bVar.f15516c[i10];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f15534z;
                            long[] jArr = bVar.f15515b;
                            this.f15534z = j - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.f15523C++;
                        this.f15521A.append((CharSequence) "REMOVE");
                        this.f15521A.append(' ');
                        this.f15521A.append((CharSequence) str);
                        this.f15521A.append('\n');
                        this.f15522B.remove(str);
                        if (j()) {
                            this.f15525E.submit(this.f15526F);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f15521A == null) {
                return;
            }
            Iterator it = new ArrayList(this.f15522B.values()).iterator();
            while (it.hasNext()) {
                g gVar = ((b) it.next()).f15519f;
                if (gVar != null) {
                    gVar.c();
                }
            }
            B();
            b(this.f15521A);
            this.f15521A = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final g g(String str) {
        synchronized (this) {
            try {
                if (this.f15521A == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.f15522B.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f15522B.put(str, bVar);
                } else if (bVar.f15519f != null) {
                    return null;
                }
                g gVar = new g(this, bVar);
                bVar.f15519f = gVar;
                this.f15521A.append((CharSequence) "DIRTY");
                this.f15521A.append(' ');
                this.f15521A.append((CharSequence) str);
                this.f15521A.append('\n');
                h(this.f15521A);
                return gVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized e i(String str) {
        if (this.f15521A == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.f15522B.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f15518e) {
            return null;
        }
        for (File file : bVar.f15516c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f15523C++;
        this.f15521A.append((CharSequence) "READ");
        this.f15521A.append(' ');
        this.f15521A.append((CharSequence) str);
        this.f15521A.append('\n');
        if (j()) {
            this.f15525E.submit(this.f15526F);
        }
        return new e(bVar.f15516c);
    }

    public final boolean j() {
        int i10 = this.f15523C;
        return i10 >= 2000 && i10 >= this.f15522B.size();
    }

    public final void n() throws IOException {
        c(this.f15529u);
        Iterator it = this.f15522B.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            g gVar = bVar.f15519f;
            int i10 = this.f15533y;
            int i11 = 0;
            if (gVar == null) {
                while (i11 < i10) {
                    this.f15534z += bVar.f15515b[i11];
                    i11++;
                }
            } else {
                bVar.f15519f = null;
                while (i11 < i10) {
                    c(bVar.f15516c[i11]);
                    c(bVar.f15517d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void o() {
        File file = this.f15528t;
        e eVar = new e(new FileInputStream(file), f.a);
        try {
            String strA = eVar.a();
            String strA2 = eVar.a();
            String strA3 = eVar.a();
            String strA4 = eVar.a();
            String strA5 = eVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f15531w).equals(strA3) || !Integer.toString(this.f15533y).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    p(eVar.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f15523C = i10 - this.f15522B.size();
                    if (eVar.f15540w == -1) {
                        t();
                    } else {
                        this.f15521A = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), f.a));
                    }
                    try {
                        eVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                eVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void p(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        LinkedHashMap linkedHashMap = this.f15522B;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        b bVar = (b) linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f15519f = new g(this, bVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        bVar.f15518e = true;
        bVar.f15519f = null;
        if (strArrSplit.length != bVar.f15520g.f15533y) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                bVar.f15515b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void t() {
        try {
            BufferedWriter bufferedWriter = this.f15521A;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f15529u), f.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f15531w));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f15533y));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.f15522B.values()) {
                    if (bVar.f15519f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.a + bVar.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f15528t.exists()) {
                    A(this.f15528t, this.f15530v, true);
                }
                A(this.f15529u, this.f15528t, false);
                this.f15530v.delete();
                this.f15521A = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f15528t, true), f.a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
