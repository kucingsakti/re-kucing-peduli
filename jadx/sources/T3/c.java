package T3;

import A1.t;
import K0.g;
import P3.d;
import P3.n;
import P3.o;
import Q3.C0367a0;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import o1.h;
import o1.k;
import o1.r;
import p163q7.i;
import p204v1.e;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4662g;

    public c(String str, e eVar, String str2, String str3) {
        this.a = str;
        p195u1.b bVar = (p195u1.b) eVar.a.f15393b;
        this.f4657b = (String[]) bVar.f15291v;
        this.f4660e = str2;
        String[] strArr = {(String) bVar.f15290u};
        this.f4658c = strArr;
        this.f4659d = new String[0];
        this.f4661f = str3;
        this.f4662g = strArr[0];
    }

    public static synchronized void c(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                file.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                file.delete();
            }
            if (!file.mkdirs()) {
                file.toString();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void a(String str) {
        File file = new File((File) this.f4657b, str);
        if (file.exists() && d(file)) {
            file.getPath();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.f4659d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void f(String str) {
        g gVar = (g) this.f4660e;
        synchronized (gVar) {
            try {
                if (((d) ((AtomicMarkableReference) gVar.f2526c).getReference()).b(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) gVar.f2526c;
                    atomicMarkableReference.set((d) atomicMarkableReference.getReference(), true);
                    o oVar = new o(gVar, 0);
                    AtomicReference atomicReference = (AtomicReference) gVar.f2527d;
                    while (!atomicReference.compareAndSet(null, oVar)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((h) ((c) gVar.f2528e).f4658c).t(oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c(Context context) {
        String string;
        String strReplaceAll;
        String str = ((C0367a0) L3.d.a.c(context)).a;
        this.a = str;
        File filesDir = context.getFilesDir();
        this.f4657b = filesDir;
        if (!str.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str.length() > 40) {
                strReplaceAll = O3.g.i(str);
            } else {
                strReplaceAll = str.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(strReplaceAll);
            string = sb.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, string);
        c(file);
        this.f4658c = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f4659d = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f4660e = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f4661f = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f4662g = file5;
    }

    public c(String str, c cVar, h hVar) {
        this.f4659d = new g(this, false);
        this.f4660e = new g(this, true);
        this.f4661f = new n();
        this.f4662g = new AtomicMarkableReference(null, false);
        this.a = str;
        this.f4657b = new P3.g(cVar);
        this.f4658c = hVar;
    }

    public c(h7.c cVar, i iVar, p085i7.g gVar, p122m7.a aVar, Y1.c cVar2, Handler handler, r rVar, V3.b bVar) {
        p210v8.i.g(handler, "uiHandler");
        this.f4658c = cVar;
        this.f4659d = iVar;
        this.f4660e = gVar;
        this.f4661f = handler;
        this.f4662g = bVar;
        p122m7.a aVar2 = new p122m7.a(gVar);
        p143o7.a aVar3 = new p143o7.a(cVar.a);
        this.a = aVar3;
        p185s7.a aVar4 = cVar.f11759b;
        k kVar = cVar.f11762e;
        p102k7.a aVar5 = new p102k7.a(aVar4, cVar.f11760c, aVar3, aVar2, rVar, bVar, cVar.f11761d, kVar, cVar.a, cVar2);
        p122m7.e eVar = new p122m7.e(iVar, aVar, aVar5, aVar3, cVar.f11760c, bVar, cVar.a);
        AbstractC0487g.v(1, "<set-?>");
        this.f4657b = new p112l7.a(gVar, aVar5, eVar, cVar.f11760c, aVar4, cVar.f11761d, bVar, handler, kVar, cVar.f11763f, cVar2);
        p102k7.e eVar2 = new p102k7.e(this);
        synchronized (gVar.f12301s) {
            gVar.f12302t.f12294t = eVar2;
        }
    }

    public c(D1.e eVar, D1.e eVar2, D1.e eVar3, D1.e eVar4, t tVar, t tVar2) {
        this.f4662g = V1.d.a(150, new A1.r(this, 0));
        this.a = eVar;
        this.f4657b = eVar2;
        this.f4658c = eVar3;
        this.f4659d = eVar4;
        this.f4660e = tVar;
        this.f4661f = tVar2;
    }
}
