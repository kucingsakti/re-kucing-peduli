package o1;

import A1.C0099h;
import A1.F;
import H1.C0233b;
import H1.C0235d;
import X9.InterfaceC0464j;
import X9.InterfaceC0465k;
import X9.L;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.lifecycle.A;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.InterfaceC0578k;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzir;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;
import org.jsoup.SerializationException;
import p050f1.s;
import p050f1.u;
import p050f1.v;
import sa.C0787a;
import ya.C0898t;
import ya.InterfaceC0885f;
import ya.T;

/* JADX INFO: loaded from: classes.dex */
public final class r implements p232y1.k, zzir, SuccessContinuation, W3.a, InterfaceC0578k, v, ta.n, InterfaceC0465k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f13675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f13676u;

    public /* synthetic */ r(Object obj, int i10, Object obj2) {
        this.f13674s = i10;
        this.f13675t = obj;
        this.f13676u = obj2;
    }

    public static r c(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new r(channel, 14, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    @Override // p232y1.b
    public boolean a(Object obj, File file, p232y1.h hVar) {
        return ((C0233b) this.f13676u).a(new C0235d((B1.b) this.f13675t, ((BitmapDrawable) ((F) obj).get()).getBitmap()), file, hVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzir
    public void b(long j, Bundle bundle, String str, String str2) {
        try {
            ((zzdh) this.f13675t).N(j, bundle, str, str2);
        } catch (RemoteException e10) {
            zzhj zzhjVar = ((AppMeasurementDynamiteService) this.f13676u).f8881b;
            if (zzhjVar != null) {
                zzfw zzfwVar = zzhjVar.f9115A;
                zzhj.g(zzfwVar);
                zzfwVar.f9047A.a(e10, "Event interceptor threw exception");
            }
        }
    }

    @Override // W3.a
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        W3.a[] aVarArr = (W3.a[]) this.f13675t;
        StackTraceElement[] stackTraceElementArrD = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            W3.a aVar = aVarArr[i10];
            if (stackTraceElementArrD.length <= 1024) {
                break;
            }
            stackTraceElementArrD = aVar.d(stackTraceElementArr);
        }
        return stackTraceElementArrD.length > 1024 ? ((za.c) this.f13676u).d(stackTraceElementArrD) : stackTraceElementArrD;
    }

    @Override // ta.n
    public void e(org.jsoup.nodes.p pVar, int i10) {
        try {
            pVar.u((StringBuilder) this.f13675t, i10, (org.jsoup.nodes.g) this.f13676u);
        } catch (IOException e10) {
            throw new SerializationException(e10);
        }
    }

    public void f(int i10, p102k7.b bVar) {
        synchronized (this.f13675t) {
            ((LinkedHashMap) this.f13676u).put(Integer.valueOf(i10), bVar);
        }
    }

    public String g(p232y1.e eVar) {
        String str;
        C1.i iVar = (C1.i) ((C0099h) this.f13676u).b();
        try {
            eVar.b(iVar.f938s);
            byte[] bArrDigest = iVar.f938s.digest();
            char[] cArr = U1.n.f4881b;
            synchronized (cArr) {
                for (int i10 = 0; i10 < bArrDigest.length; i10++) {
                    byte b3 = bArrDigest[i10];
                    int i11 = i10 * 2;
                    char[] cArr2 = U1.n.a;
                    cArr[i11] = cArr2[(b3 & 255) >>> 4];
                    cArr[i11 + 1] = cArr2[b3 & 15];
                }
                str = new String(cArr);
            }
            ((C0099h) this.f13676u).q(iVar);
            return str;
        } catch (Throwable th) {
            ((C0099h) this.f13676u).q(iVar);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0578k
    public zzh h(zzaq zzaqVar) {
        zzh zzhVarD = ((zzh) this.f13675t).d();
        String str = (String) this.f13676u;
        zzhVarD.e(str, zzaqVar);
        zzhVarD.f8660d.put(str, Boolean.TRUE);
        return zzhVarD;
    }

    @Override // ta.n
    public void i(org.jsoup.nodes.p pVar, int i10) {
        if (pVar.s().equals("#text")) {
            return;
        }
        try {
            pVar.v((StringBuilder) this.f13675t, i10, (org.jsoup.nodes.g) this.f13676u);
        } catch (IOException e10) {
            throw new SerializationException(e10);
        }
    }

    public void j() {
        synchronized (this.f13675t) {
            ((LinkedHashMap) this.f13676u).clear();
        }
    }

    public boolean k(int i10) {
        boolean zContainsKey;
        synchronized (this.f13675t) {
            zContainsKey = ((LinkedHashMap) this.f13676u).containsKey(Integer.valueOf(i10));
        }
        return zContainsKey;
    }

    public void l(String str, p200u8.b bVar) {
        LinkedHashMap linkedHashMap = ((p019b9.o) this.f13676u).a;
        p019b9.n nVar = new p019b9.n(this, str);
        bVar.invoke(nVar);
        ArrayList arrayList = nVar.f7350b;
        ArrayList arrayList2 = new ArrayList(p086i8.m.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((p076h8.f) it.next()).f11789s);
        }
        String str2 = (String) nVar.f7351c.f11789s;
        String str3 = nVar.a;
        p210v8.i.f(str2, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append('(');
        sb.append(p086i8.k.Z(arrayList2, "", null, null, p029c9.o.f7563s, 30));
        sb.append(')');
        if (str2.length() > 1) {
            str2 = "L" + str2 + ';';
        }
        sb.append(str2);
        String string = sb.toString();
        String str4 = (String) this.f13675t;
        p210v8.i.f(str4, "internalName");
        p210v8.i.f(string, "jvmDescriptor");
        String str5 = str4 + '.' + string;
        p019b9.p pVar = (p019b9.p) nVar.f7351c.f11790t;
        ArrayList arrayList3 = new ArrayList(p086i8.m.H(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((p019b9.p) ((p076h8.f) it2.next()).f11790t);
        }
        linkedHashMap.put(str5, new p019b9.l(pVar, arrayList3));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task m(Object obj) {
        if (((V3.a) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.e(null);
        }
        O3.o oVar = ((O3.l) this.f13676u).f3536w;
        return Tasks.f(Arrays.asList(O3.o.b(oVar), oVar.f3553m.A(null, (ExecutorService) this.f13675t)));
    }

    public Object n(B1.j jVar) {
        HashMap map = (HashMap) this.f13676u;
        B1.d dVar = (B1.d) map.get(jVar);
        if (dVar == null) {
            dVar = new B1.d(jVar);
            map.put(jVar, dVar);
        } else {
            jVar.a();
        }
        B1.d dVar2 = dVar.f580d;
        dVar2.f579c = dVar.f579c;
        dVar.f579c.f580d = dVar2;
        B1.d dVar3 = (B1.d) this.f13675t;
        dVar.f580d = dVar3;
        B1.d dVar4 = dVar3.f579c;
        dVar.f579c = dVar4;
        dVar4.f580d = dVar;
        dVar.f580d.f579c = dVar;
        ArrayList arrayList = dVar.f578b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return dVar.f578b.remove(size - 1);
        }
        return null;
    }

    public String o(p232y1.e eVar) {
        String strG;
        synchronized (((U1.j) this.f13675t)) {
            strG = (String) ((U1.j) this.f13675t).a(eVar);
        }
        if (strG == null) {
            strG = g(eVar);
        }
        synchronized (((U1.j) this.f13675t)) {
            ((U1.j) this.f13675t).d(eVar, strG);
        }
        return strG;
    }

    @Override // X9.InterfaceC0465k
    public void onFailure(InterfaceC0464j interfaceC0464j, IOException iOException) {
        try {
            ((InterfaceC0885f) this.f13675t).g((C0898t) this.f13676u, iOException);
        } catch (Throwable th) {
            T.o(th);
            th.printStackTrace();
        }
    }

    @Override // X9.InterfaceC0465k
    public void onResponse(InterfaceC0464j interfaceC0464j, L l4) {
        InterfaceC0885f interfaceC0885f = (InterfaceC0885f) this.f13675t;
        C0898t c0898t = (C0898t) this.f13676u;
        try {
            try {
                interfaceC0885f.m(c0898t, c0898t.e(l4));
            } catch (Throwable th) {
                T.o(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            T.o(th2);
            try {
                interfaceC0885f.g(c0898t, th2);
            } catch (Throwable th3) {
                T.o(th3);
                th3.printStackTrace();
            }
        }
    }

    public ArrayList p(String str) {
        K0.o oVarC = K0.o.c(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            oVarC.v(1);
        } else {
            oVarC.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f13675t;
        workDatabase_Impl.b();
        Cursor cursorM = workDatabase_Impl.m(oVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                arrayList.add(cursorM.isNull(0) ? null : cursorM.getString(0));
            }
            return arrayList;
        } finally {
            cursorM.close();
            oVarC.g();
        }
    }

    public void q(com.bumptech.glide.d dVar) {
        boolean z6;
        A a = (A) this.f13675t;
        synchronized (a.a) {
            z6 = a.f6710f == A.f6705k;
            a.f6710f = dVar;
        }
        if (z6) {
            p155q.a.r().s(a.j);
        }
        boolean z10 = dVar instanceof u;
        p157q1.k kVar = (p157q1.k) this.f13676u;
        if (z10) {
            kVar.j((u) dVar);
        } else if (dVar instanceof s) {
            kVar.k(((s) dVar).a);
        }
    }

    @Override // p232y1.k
    public int r(p232y1.h hVar) {
        return 2;
    }

    public void s(B1.j jVar, Object obj) {
        HashMap map = (HashMap) this.f13676u;
        B1.d dVar = (B1.d) map.get(jVar);
        if (dVar == null) {
            dVar = new B1.d(jVar);
            dVar.f580d = dVar;
            B1.d dVar2 = (B1.d) this.f13675t;
            dVar.f580d = dVar2.f580d;
            dVar.f579c = dVar2;
            dVar2.f580d = dVar;
            dVar.f580d.f579c = dVar;
            map.put(jVar, dVar);
        } else {
            jVar.a();
        }
        if (dVar.f578b == null) {
            dVar.f578b = new ArrayList();
        }
        dVar.f578b.add(obj);
    }

    public void t(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((p212w.e) this.f13676u)) {
            ((p212w.e) this.f13676u).put(new U1.l(cls, cls2, cls3), list);
        }
    }

    public String toString() {
        switch (this.f13674s) {
            case 1:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                B1.d dVar = (B1.d) this.f13675t;
                B1.d dVar2 = dVar.f579c;
                boolean z6 = false;
                while (!dVar2.equals(dVar)) {
                    sb.append('{');
                    sb.append(dVar2.a);
                    sb.append(':');
                    ArrayList arrayList = dVar2.f578b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    dVar2 = dVar2.f579c;
                    z6 = true;
                }
                if (z6) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case 17:
                return "<" + ((String) this.f13675t) + ">: " + ((String) this.f13676u);
            default:
                return super.toString();
        }
    }

    public void u() {
        try {
            ((FileLock) this.f13676u).release();
            ((FileChannel) this.f13675t).close();
        } catch (IOException unused) {
        }
    }

    public void v(int i10) {
        synchronized (this.f13675t) {
        }
    }

    public Object w() {
        B1.d dVar = (B1.d) this.f13675t;
        B1.d dVar2 = dVar.f580d;
        while (true) {
            if (dVar2.equals(dVar)) {
                return null;
            }
            ArrayList arrayList = dVar2.f578b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? dVar2.f578b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            B1.d dVar3 = dVar2.f580d;
            dVar3.f579c = dVar2.f579c;
            dVar2.f579c.f580d = dVar3;
            HashMap map = (HashMap) this.f13676u;
            B1.j jVar = dVar2.a;
            map.remove(jVar);
            jVar.a();
            dVar2 = dVar2.f580d;
        }
    }

    public void x(int i10, int i11, int i12, int i13) {
        p202v.a aVar = (p202v.a) this.f13676u;
        aVar.f15367v.set(i10, i11, i12, i13);
        Rect rect = aVar.f15366u;
        super/*android.widget.FrameLayout*/.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
    }

    public /* synthetic */ r(Object obj, Object obj2, int i10, boolean z6) {
        this.f13674s = i10;
        this.f13676u = obj;
        this.f13675t = obj2;
    }

    public r(C0787a c0787a, String str, Object[] objArr) {
        this.f13674s = 17;
        c0787a.getClass();
        this.f13675t = c0787a.m();
        this.f13676u = String.format(str, objArr);
    }

    public r(int i10) {
        this.f13674s = i10;
        switch (i10) {
            case 2:
                this.f13675t = new U1.j(1000L);
                this.f13676u = V1.d.a(10, new za.c(2));
                break;
            case 4:
                this.f13675t = new ArrayList();
                this.f13676u = new Ia.a(this, 0);
                break;
            case 8:
                this.f13675t = new AtomicReference();
                this.f13676u = new p212w.e(0);
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                this.f13675t = new A();
                this.f13676u = new p157q1.k();
                q(v.f11421r);
                break;
            case 15:
                this.f13675t = new Object();
                this.f13676u = new LinkedHashMap();
                break;
            case 17:
                break;
            default:
                this.f13675t = new B1.d(null);
                this.f13676u = new HashMap();
                break;
        }
    }

    public r(WorkDatabase_Impl workDatabase_Impl) {
        this.f13674s = 0;
        this.f13675t = workDatabase_Impl;
        this.f13676u = new b(workDatabase_Impl, 6);
        new p085i7.d(workDatabase_Impl, 16);
    }

    public r(W3.a[] aVarArr) {
        this.f13674s = 10;
        this.f13675t = aVarArr;
        this.f13676u = new za.c(12);
    }

    public r(p019b9.o oVar, String str) {
        this.f13674s = 11;
        p210v8.i.f(str, "className");
        this.f13676u = oVar;
        this.f13675t = str;
    }

    public r(O3.l lVar, ExecutorService executorService, String str) {
        this.f13674s = 7;
        this.f13676u = lVar;
        this.f13675t = executorService;
    }

    public r(p202v.a aVar) {
        this.f13674s = 18;
        this.f13676u = aVar;
    }

    public r(StringBuilder sb, org.jsoup.nodes.g gVar) {
        this.f13674s = 16;
        this.f13675t = sb;
        this.f13676u = gVar;
        gVar.c();
    }
}
