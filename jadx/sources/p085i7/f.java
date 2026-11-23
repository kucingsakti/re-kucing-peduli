package p085i7;

import K0.l;
import K0.o;
import K3.d;
import P0.c;
import Q3.u0;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.tonyodev.fetch2.database.DownloadDatabase;
import com.tonyodev.fetch2.database.DownloadDatabase_Impl;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.exception.FetchException;
import h7.b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o1.k;
import p094j7.a;
import p102k7.e;
import p112l7.j;
import p140o4.r;
import p188t1.Y;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final j f12291A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final k f12292B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f12293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e f12294t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DownloadDatabase f12295u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f12296v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f12297w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f12298x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f12299y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p163q7.f f12300z;

    public f(Context context, p163q7.f fVar, a[] aVarArr, j jVar, k kVar) {
        i.g(context, "context");
        i.g(fVar, "logger");
        this.f12300z = fVar;
        this.f12291A = jVar;
        this.f12292B = kVar;
        l lVarK = Y.k(context, DownloadDatabase.class, "LibGlobalFetchLib.db");
        lVarK.a((L0.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        DownloadDatabase downloadDatabase = (DownloadDatabase) lVarK.b();
        this.f12295u = downloadDatabase;
        c cVarS = downloadDatabase.g().S();
        i.b(cVarS, "requestDatabase.openHelper.writableDatabase");
        this.f12296v = cVarS;
        this.f12297w = "SELECT _id FROM requests WHERE _status = '1' OR _status = '2'";
        this.f12298x = "SELECT _id FROM requests WHERE _status = '1' OR _status = '2' OR _status = '9'";
        this.f12299y = new ArrayList();
    }

    public final List a(List list) throws Throwable {
        o oVar;
        i.g(list, "ids");
        j();
        r rVarQ = this.f12295u.q();
        Object obj = rVarQ.f13783u;
        StringBuilder sbC = p239z.e.c("SELECT * FROM requests WHERE _id IN (");
        int size = list.size();
        com.bumptech.glide.c.a(sbC, size);
        sbC.append(")");
        o oVarC = o.c(size, sbC.toString());
        Iterator it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num == null) {
                oVarC.v(i10);
            } else {
                oVarC.I(i10, num.intValue());
            }
            i10++;
        }
        DownloadDatabase_Impl downloadDatabase_Impl = (DownloadDatabase_Impl) rVarQ.f13782t;
        downloadDatabase_Impl.b();
        Cursor cursorM = downloadDatabase_Impl.m(oVarC);
        try {
            int iE = u0.e(cursorM, "_id");
            int iE2 = u0.e(cursorM, "_namespace");
            int iE3 = u0.e(cursorM, "_url");
            int iE4 = u0.e(cursorM, "_file");
            int iE5 = u0.e(cursorM, "_group");
            int iE6 = u0.e(cursorM, "_priority");
            int iE7 = u0.e(cursorM, "_headers");
            int iE8 = u0.e(cursorM, "_written_bytes");
            int iE9 = u0.e(cursorM, "_total_bytes");
            int iE10 = u0.e(cursorM, "_status");
            int iE11 = u0.e(cursorM, "_error");
            int iE12 = u0.e(cursorM, "_network_type");
            int iE13 = u0.e(cursorM, "_created");
            oVar = oVarC;
            try {
                int iE14 = u0.e(cursorM, "_tag");
                try {
                    int iE15 = u0.e(cursorM, "_enqueue_action");
                    int iE16 = u0.e(cursorM, "_identifier");
                    int iE17 = u0.e(cursorM, "_download_on_enqueue");
                    int iE18 = u0.e(cursorM, "_extras");
                    int iE19 = u0.e(cursorM, "_auto_retry_max_attempts");
                    int iE20 = u0.e(cursorM, "_auto_retry_attempts");
                    int i11 = iE14;
                    ArrayList arrayList = new ArrayList(cursorM.getCount());
                    while (cursorM.moveToNext()) {
                        DownloadInfo downloadInfo = new DownloadInfo();
                        ArrayList arrayList2 = arrayList;
                        downloadInfo.f10360s = cursorM.getInt(iE);
                        downloadInfo.g(cursorM.getString(iE2));
                        downloadInfo.i(cursorM.getString(iE3));
                        downloadInfo.f(cursorM.getString(iE4));
                        downloadInfo.f10364w = cursorM.getInt(iE5);
                        downloadInfo.f10365x = d.s(cursorM.getInt(iE6));
                        downloadInfo.f10366y = d.q(cursorM.getString(iE7));
                        int i12 = iE;
                        downloadInfo.f10367z = cursorM.getLong(iE8);
                        downloadInfo.f10346A = cursorM.getLong(iE9);
                        downloadInfo.f10347B = d.t(cursorM.getInt(iE10));
                        downloadInfo.f10348C = d.m(cursorM.getInt(iE11));
                        downloadInfo.f10349D = d.r(cursorM.getInt(iE12));
                        downloadInfo.f10350E = cursorM.getLong(iE13);
                        int i13 = i11;
                        downloadInfo.f10351F = cursorM.getString(i13);
                        int i14 = iE15;
                        i11 = i13;
                        downloadInfo.f10352G = d.f(cursorM.getInt(i14));
                        int i15 = iE2;
                        int i16 = iE16;
                        int i17 = iE13;
                        downloadInfo.f10353H = cursorM.getLong(i16);
                        int i18 = iE17;
                        downloadInfo.f10354I = cursorM.getInt(i18) != 0;
                        int i19 = iE18;
                        downloadInfo.f10355J = d.o(cursorM.getString(i19));
                        int i20 = iE19;
                        downloadInfo.f10356K = cursorM.getInt(i20);
                        iE19 = i20;
                        int i21 = iE20;
                        downloadInfo.f10357L = cursorM.getInt(i21);
                        arrayList2.add(downloadInfo);
                        iE17 = i18;
                        iE13 = i17;
                        iE16 = i16;
                        iE18 = i19;
                        iE2 = i15;
                        iE15 = i14;
                        iE20 = i21;
                        arrayList = arrayList2;
                        iE = i12;
                    }
                    ArrayList arrayList3 = arrayList;
                    cursorM.close();
                    oVar.g();
                    h(arrayList3, false);
                    return arrayList3;
                } catch (Throwable th) {
                    th = th;
                    cursorM.close();
                    oVar.g();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            oVar = oVarC;
        }
    }

    public final List b(int i10) throws Throwable {
        o oVar;
        j();
        r rVarQ = this.f12295u.q();
        Object obj = rVarQ.f13783u;
        o oVarC = o.c(1, "SELECT * FROM requests WHERE _group = ?");
        oVarC.I(1, i10);
        DownloadDatabase_Impl downloadDatabase_Impl = (DownloadDatabase_Impl) rVarQ.f13782t;
        downloadDatabase_Impl.b();
        Cursor cursorM = downloadDatabase_Impl.m(oVarC);
        try {
            int iE = u0.e(cursorM, "_id");
            int iE2 = u0.e(cursorM, "_namespace");
            int iE3 = u0.e(cursorM, "_url");
            int iE4 = u0.e(cursorM, "_file");
            int iE5 = u0.e(cursorM, "_group");
            int iE6 = u0.e(cursorM, "_priority");
            int iE7 = u0.e(cursorM, "_headers");
            int iE8 = u0.e(cursorM, "_written_bytes");
            int iE9 = u0.e(cursorM, "_total_bytes");
            int iE10 = u0.e(cursorM, "_status");
            int iE11 = u0.e(cursorM, "_error");
            int iE12 = u0.e(cursorM, "_network_type");
            int iE13 = u0.e(cursorM, "_created");
            oVar = oVarC;
            try {
                int iE14 = u0.e(cursorM, "_tag");
                try {
                    int iE15 = u0.e(cursorM, "_enqueue_action");
                    int iE16 = u0.e(cursorM, "_identifier");
                    int iE17 = u0.e(cursorM, "_download_on_enqueue");
                    int iE18 = u0.e(cursorM, "_extras");
                    int iE19 = u0.e(cursorM, "_auto_retry_max_attempts");
                    int iE20 = u0.e(cursorM, "_auto_retry_attempts");
                    int i11 = iE14;
                    ArrayList arrayList = new ArrayList(cursorM.getCount());
                    while (cursorM.moveToNext()) {
                        DownloadInfo downloadInfo = new DownloadInfo();
                        ArrayList arrayList2 = arrayList;
                        downloadInfo.f10360s = cursorM.getInt(iE);
                        downloadInfo.g(cursorM.getString(iE2));
                        downloadInfo.i(cursorM.getString(iE3));
                        downloadInfo.f(cursorM.getString(iE4));
                        downloadInfo.f10364w = cursorM.getInt(iE5);
                        downloadInfo.f10365x = d.s(cursorM.getInt(iE6));
                        downloadInfo.f10366y = d.q(cursorM.getString(iE7));
                        int i12 = iE;
                        downloadInfo.f10367z = cursorM.getLong(iE8);
                        downloadInfo.f10346A = cursorM.getLong(iE9);
                        downloadInfo.f10347B = d.t(cursorM.getInt(iE10));
                        downloadInfo.f10348C = d.m(cursorM.getInt(iE11));
                        downloadInfo.f10349D = d.r(cursorM.getInt(iE12));
                        downloadInfo.f10350E = cursorM.getLong(iE13);
                        int i13 = i11;
                        downloadInfo.f10351F = cursorM.getString(i13);
                        int i14 = iE15;
                        downloadInfo.f10352G = d.f(cursorM.getInt(i14));
                        int i15 = iE3;
                        int i16 = iE16;
                        int i17 = iE2;
                        downloadInfo.f10353H = cursorM.getLong(i16);
                        int i18 = iE17;
                        downloadInfo.f10354I = cursorM.getInt(i18) != 0;
                        int i19 = iE18;
                        downloadInfo.f10355J = d.o(cursorM.getString(i19));
                        int i20 = iE19;
                        downloadInfo.f10356K = cursorM.getInt(i20);
                        iE19 = i20;
                        int i21 = iE20;
                        downloadInfo.f10357L = cursorM.getInt(i21);
                        arrayList2.add(downloadInfo);
                        i11 = i13;
                        iE15 = i14;
                        iE17 = i18;
                        iE2 = i17;
                        iE16 = i16;
                        iE18 = i19;
                        iE3 = i15;
                        iE20 = i21;
                        arrayList = arrayList2;
                        iE = i12;
                    }
                    ArrayList arrayList3 = arrayList;
                    cursorM.close();
                    oVar.g();
                    h(arrayList3, false);
                    return arrayList3;
                } catch (Throwable th) {
                    th = th;
                    cursorM.close();
                    oVar.g();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            oVar = oVarC;
        }
    }

    public final List c(List list) throws Throwable {
        o oVar;
        j();
        r rVarQ = this.f12295u.q();
        rVarQ.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM requests WHERE _status IN (");
        int size = list.size();
        com.bumptech.glide.c.a(sb, size);
        sb.append(")");
        o oVarC = o.c(size, sb.toString());
        Iterator it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            h7.f fVar = (h7.f) it.next();
            i.g(fVar, "status");
            oVarC.I(i10, fVar.f11780s);
            i10++;
        }
        DownloadDatabase_Impl downloadDatabase_Impl = (DownloadDatabase_Impl) rVarQ.f13782t;
        downloadDatabase_Impl.b();
        Cursor cursorM = downloadDatabase_Impl.m(oVarC);
        try {
            int iE = u0.e(cursorM, "_id");
            int iE2 = u0.e(cursorM, "_namespace");
            int iE3 = u0.e(cursorM, "_url");
            int iE4 = u0.e(cursorM, "_file");
            int iE5 = u0.e(cursorM, "_group");
            int iE6 = u0.e(cursorM, "_priority");
            int iE7 = u0.e(cursorM, "_headers");
            int iE8 = u0.e(cursorM, "_written_bytes");
            int iE9 = u0.e(cursorM, "_total_bytes");
            int iE10 = u0.e(cursorM, "_status");
            int iE11 = u0.e(cursorM, "_error");
            int iE12 = u0.e(cursorM, "_network_type");
            int iE13 = u0.e(cursorM, "_created");
            oVar = oVarC;
            try {
                int iE14 = u0.e(cursorM, "_tag");
                try {
                    int iE15 = u0.e(cursorM, "_enqueue_action");
                    int iE16 = u0.e(cursorM, "_identifier");
                    int iE17 = u0.e(cursorM, "_download_on_enqueue");
                    int iE18 = u0.e(cursorM, "_extras");
                    int iE19 = u0.e(cursorM, "_auto_retry_max_attempts");
                    int iE20 = u0.e(cursorM, "_auto_retry_attempts");
                    int i11 = iE14;
                    ArrayList arrayList = new ArrayList(cursorM.getCount());
                    while (cursorM.moveToNext()) {
                        DownloadInfo downloadInfo = new DownloadInfo();
                        ArrayList arrayList2 = arrayList;
                        downloadInfo.f10360s = cursorM.getInt(iE);
                        downloadInfo.g(cursorM.getString(iE2));
                        downloadInfo.i(cursorM.getString(iE3));
                        downloadInfo.f(cursorM.getString(iE4));
                        downloadInfo.f10364w = cursorM.getInt(iE5);
                        downloadInfo.f10365x = d.s(cursorM.getInt(iE6));
                        downloadInfo.f10366y = d.q(cursorM.getString(iE7));
                        int i12 = iE;
                        downloadInfo.f10367z = cursorM.getLong(iE8);
                        downloadInfo.f10346A = cursorM.getLong(iE9);
                        downloadInfo.f10347B = d.t(cursorM.getInt(iE10));
                        downloadInfo.f10348C = d.m(cursorM.getInt(iE11));
                        downloadInfo.f10349D = d.r(cursorM.getInt(iE12));
                        downloadInfo.f10350E = cursorM.getLong(iE13);
                        int i13 = i11;
                        downloadInfo.f10351F = cursorM.getString(i13);
                        int i14 = iE15;
                        i11 = i13;
                        downloadInfo.f10352G = d.f(cursorM.getInt(i14));
                        int i15 = iE2;
                        int i16 = iE16;
                        int i17 = iE13;
                        downloadInfo.f10353H = cursorM.getLong(i16);
                        int i18 = iE17;
                        downloadInfo.f10354I = cursorM.getInt(i18) != 0;
                        int i19 = iE18;
                        downloadInfo.f10355J = d.o(cursorM.getString(i19));
                        int i20 = iE19;
                        downloadInfo.f10356K = cursorM.getInt(i20);
                        iE19 = i20;
                        int i21 = iE20;
                        downloadInfo.f10357L = cursorM.getInt(i21);
                        arrayList2.add(downloadInfo);
                        iE17 = i18;
                        iE13 = i17;
                        iE16 = i16;
                        iE18 = i19;
                        iE2 = i15;
                        iE15 = i14;
                        iE20 = i21;
                        arrayList = arrayList2;
                        iE = i12;
                    }
                    ArrayList arrayList3 = arrayList;
                    cursorM.close();
                    oVar.g();
                    if (!h(arrayList3, false)) {
                        return arrayList3;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : arrayList3) {
                        if (list.contains(((DownloadInfo) obj).f10347B)) {
                            arrayList4.add(obj);
                        }
                    }
                    return arrayList4;
                } catch (Throwable th) {
                    th = th;
                    cursorM.close();
                    oVar.g();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            oVar = oVarC;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12293s) {
            return;
        }
        this.f12293s = true;
        try {
            this.f12296v.close();
        } catch (Exception unused) {
        }
        try {
            DownloadDatabase downloadDatabase = this.f12295u;
            if (downloadDatabase.l()) {
                ReentrantReadWriteLock.WriteLock writeLock = downloadDatabase.f2562h.writeLock();
                i.e(writeLock, "readWriteLock.writeLock()");
                writeLock.lock();
                try {
                    downloadDatabase.f2558d.getClass();
                    downloadDatabase.g().close();
                    writeLock.unlock();
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
        } catch (Exception unused2) {
        }
        this.f12300z.getClass();
    }

    public final List g() throws Throwable {
        o oVar;
        AbstractC0487g.v(1, "prioritySort");
        j();
        h7.f fVar = h7.f.QUEUED;
        r rVarQ = this.f12295u.q();
        rVarQ.getClass();
        o oVarC = o.c(1, "SELECT * FROM requests WHERE _status = ? ORDER BY _priority DESC, _created ASC");
        oVarC.I(1, 1);
        DownloadDatabase_Impl downloadDatabase_Impl = (DownloadDatabase_Impl) rVarQ.f13782t;
        downloadDatabase_Impl.b();
        Cursor cursorM = downloadDatabase_Impl.m(oVarC);
        try {
            int iE = u0.e(cursorM, "_id");
            int iE2 = u0.e(cursorM, "_namespace");
            int iE3 = u0.e(cursorM, "_url");
            int iE4 = u0.e(cursorM, "_file");
            int iE5 = u0.e(cursorM, "_group");
            int iE6 = u0.e(cursorM, "_priority");
            int iE7 = u0.e(cursorM, "_headers");
            int iE8 = u0.e(cursorM, "_written_bytes");
            int iE9 = u0.e(cursorM, "_total_bytes");
            int iE10 = u0.e(cursorM, "_status");
            int iE11 = u0.e(cursorM, "_error");
            int iE12 = u0.e(cursorM, "_network_type");
            int iE13 = u0.e(cursorM, "_created");
            int iE14 = u0.e(cursorM, "_tag");
            oVar = oVarC;
            try {
                int iE15 = u0.e(cursorM, "_enqueue_action");
                int iE16 = u0.e(cursorM, "_identifier");
                int iE17 = u0.e(cursorM, "_download_on_enqueue");
                int iE18 = u0.e(cursorM, "_extras");
                int iE19 = u0.e(cursorM, "_auto_retry_max_attempts");
                int iE20 = u0.e(cursorM, "_auto_retry_attempts");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    DownloadInfo downloadInfo = new DownloadInfo();
                    ArrayList arrayList2 = arrayList;
                    downloadInfo.f10360s = cursorM.getInt(iE);
                    downloadInfo.g(cursorM.getString(iE2));
                    downloadInfo.i(cursorM.getString(iE3));
                    downloadInfo.f(cursorM.getString(iE4));
                    downloadInfo.f10364w = cursorM.getInt(iE5);
                    downloadInfo.f10365x = d.s(cursorM.getInt(iE6));
                    downloadInfo.f10366y = d.q(cursorM.getString(iE7));
                    int i11 = iE2;
                    downloadInfo.f10367z = cursorM.getLong(iE8);
                    downloadInfo.f10346A = cursorM.getLong(iE9);
                    downloadInfo.f10347B = d.t(cursorM.getInt(iE10));
                    downloadInfo.f10348C = d.m(cursorM.getInt(iE11));
                    downloadInfo.f10349D = d.r(cursorM.getInt(iE12));
                    downloadInfo.f10350E = cursorM.getLong(iE13);
                    int i12 = i10;
                    downloadInfo.f10351F = cursorM.getString(i12);
                    int i13 = iE15;
                    i10 = i12;
                    downloadInfo.f10352G = d.f(cursorM.getInt(i13));
                    iE15 = i13;
                    int i14 = iE16;
                    int i15 = iE3;
                    downloadInfo.f10353H = cursorM.getLong(i14);
                    int i16 = iE17;
                    downloadInfo.f10354I = cursorM.getInt(i16) != 0;
                    int i17 = iE18;
                    downloadInfo.f10355J = d.o(cursorM.getString(i17));
                    iE17 = i16;
                    int i18 = iE19;
                    downloadInfo.f10356K = cursorM.getInt(i18);
                    iE19 = i18;
                    int i19 = iE20;
                    downloadInfo.f10357L = cursorM.getInt(i19);
                    arrayList2.add(downloadInfo);
                    iE18 = i17;
                    iE3 = i15;
                    iE16 = i14;
                    iE20 = i19;
                    arrayList = arrayList2;
                    iE2 = i11;
                }
                ArrayList arrayList3 = arrayList;
                cursorM.close();
                oVar.g();
                if (!h(arrayList3, false)) {
                    return arrayList3;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    h7.f fVar2 = fVar;
                    if (((DownloadInfo) obj).f10347B == fVar2) {
                        arrayList4.add(obj);
                    }
                    fVar = fVar2;
                }
                return arrayList4;
            } catch (Throwable th) {
                th = th;
                cursorM.close();
                oVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = oVarC;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009f A[SYNTHETIC] */
    public final boolean h(ArrayList arrayList, boolean z6) {
        e eVar;
        h7.f fVar;
        ArrayList arrayList2 = this.f12299y;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            DownloadInfo downloadInfo = (DownloadInfo) arrayList.get(i10);
            int iOrdinal = downloadInfo.f10347B.ordinal();
            b bVar = b.NONE;
            if (iOrdinal == 1) {
                if (downloadInfo.f10367z > 0) {
                    if (!this.f12292B.k(downloadInfo.f10363v)) {
                        downloadInfo.f10367z = 0L;
                        downloadInfo.f10346A = -1L;
                        h7.d dVar = p152p7.a.a;
                        downloadInfo.f10348C = bVar;
                        arrayList2.add(downloadInfo);
                        eVar = this.f12294t;
                        if (eVar != null) {
                            k kVar = ((h7.c) ((T3.c) eVar.f12743s).f4658c).f11762e;
                            p068ga.d.t(downloadInfo);
                            p068ga.d.j(downloadInfo.f10360s, (String) kVar.f13639t);
                        }
                    }
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 4 && downloadInfo.f10346A < 1) {
                        long j = downloadInfo.f10367z;
                        if (j > 0) {
                            downloadInfo.f10346A = j;
                            h7.d dVar2 = p152p7.a.a;
                            downloadInfo.f10348C = bVar;
                            arrayList2.add(downloadInfo);
                        }
                    }
                } else if (downloadInfo.f10367z > 0) {
                    if (!this.f12292B.k(downloadInfo.f10363v)) {
                        downloadInfo.f10367z = 0L;
                        downloadInfo.f10346A = -1L;
                        h7.d dVar3 = p152p7.a.a;
                        downloadInfo.f10348C = bVar;
                        arrayList2.add(downloadInfo);
                        eVar = this.f12294t;
                        if (eVar != null) {
                            k kVar2 = ((h7.c) ((T3.c) eVar.f12743s).f4658c).f11762e;
                            p068ga.d.t(downloadInfo);
                            p068ga.d.j(downloadInfo.f10360s, (String) kVar2.f13639t);
                        }
                    }
                }
            } else if (z6) {
                long j10 = downloadInfo.f10367z;
                if (j10 > 0) {
                    long j11 = downloadInfo.f10346A;
                    if (j11 <= 0 || j10 < j11) {
                        fVar = h7.f.QUEUED;
                    } else {
                        fVar = h7.f.COMPLETED;
                    }
                } else {
                    fVar = h7.f.QUEUED;
                }
                downloadInfo.f10347B = fVar;
                h7.d dVar4 = p152p7.a.a;
                downloadInfo.f10348C = bVar;
                arrayList2.add(downloadInfo);
            }
        }
        int size2 = arrayList2.size();
        if (size2 > 0) {
            try {
                n(arrayList2);
            } catch (Exception unused) {
                this.f12300z.getClass();
            }
        }
        arrayList2.clear();
        return size2 > 0;
    }

    public final void i() {
        j();
        j jVar = this.f12291A;
        e2.b bVar = new e2.b(this, 3);
        synchronized (jVar.a) {
            bVar.invoke(jVar);
        }
    }

    public final void j() {
        if (this.f12293s) {
            throw new FetchException("LibGlobalFetchLib database is closed");
        }
    }

    public final void l(DownloadInfo downloadInfo) {
        i.g(downloadInfo, "downloadInfo");
        j();
        r rVarQ = this.f12295u.q();
        DownloadDatabase_Impl downloadDatabase_Impl = (DownloadDatabase_Impl) rVarQ.f13782t;
        downloadDatabase_Impl.b();
        downloadDatabase_Impl.c();
        try {
            c cVar = (c) rVarQ.f13785w;
            P0.j jVarA = cVar.a();
            try {
                cVar.f(jVarA, downloadInfo);
                jVarA.a();
                cVar.e(jVarA);
                downloadDatabase_Impl.o();
                downloadDatabase_Impl.j();
            } catch (Throwable th) {
                cVar.e(jVarA);
                throw th;
            }
        } catch (Throwable th2) {
            downloadDatabase_Impl.j();
            throw th2;
        }
    }

    public final void n(ArrayList arrayList) {
        i.g(arrayList, "downloadInfoList");
        j();
        r rVarQ = this.f12295u.q();
        DownloadDatabase_Impl downloadDatabase_Impl = (DownloadDatabase_Impl) rVarQ.f13782t;
        downloadDatabase_Impl.b();
        downloadDatabase_Impl.c();
        try {
            ((c) rVarQ.f13785w).g(arrayList);
            downloadDatabase_Impl.o();
        } finally {
            downloadDatabase_Impl.j();
        }
    }

    public final void o(DownloadInfo downloadInfo) {
        p163q7.f fVar = this.f12300z;
        c cVar = this.f12296v;
        i.g(downloadInfo, "downloadInfo");
        j();
        try {
            cVar.a();
            cVar.f3808s.execSQL("UPDATE requests SET _written_bytes = ?, _total_bytes = ?, _status = ? WHERE _id = ?", new Object[]{Long.valueOf(downloadInfo.f10367z), Long.valueOf(downloadInfo.f10346A), Integer.valueOf(downloadInfo.f10347B.f11780s), Integer.valueOf(downloadInfo.f10360s)});
            cVar.o();
        } catch (SQLiteException unused) {
            fVar.getClass();
        }
        try {
            cVar.g();
        } catch (SQLiteException unused2) {
            fVar.getClass();
        }
    }
}
