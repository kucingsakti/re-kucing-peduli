package T3;

import G9.p;
import O3.h;
import O3.i;
import O3.k;
import Q3.K0;
import android.util.Log;
import com.rollbar.notifier.sender.SyncSender;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f4649e = Charset.forName(SyncSender.UTF_8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f4650f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final R3.a f4651g = new R3.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f4652h = new i(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f4653i = new h(2);
    public final AtomicInteger a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f4654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V3.b f4655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f4656d;

    public a(c cVar, V3.b bVar, k kVar) {
        this.f4654b = cVar;
        this.f4655c = bVar;
        this.f4656d = kVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f4649e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f4649e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.f4654b;
        arrayList.addAll(c.e(((File) cVar.f4661f).listFiles()));
        arrayList.addAll(c.e(((File) cVar.f4662g).listFiles()));
        i iVar = f4652h;
        Collections.sort(arrayList, iVar);
        List listE = c.e(((File) cVar.f4660e).listFiles());
        Collections.sort(listE, iVar);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.e(((File) this.f4654b.f4659d).list())).descendingSet();
    }

    public final void d(K0 k3, String str, boolean z6) {
        c cVar = this.f4654b;
        p pVar = this.f4655c.g().a;
        f4651g.getClass();
        try {
            f(cVar.b(str, E0.a.i("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z6 ? "_" : "")), R3.a.a.s(k3));
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        h hVar = new h(3);
        cVar.getClass();
        File file = new File((File) cVar.f4659d, str);
        file.mkdirs();
        List<File> listE = c.e(file.listFiles(hVar));
        Collections.sort(listE, new i(4));
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= pVar.a) {
                return;
            }
            c.d(file2);
            size--;
        }
    }
}
