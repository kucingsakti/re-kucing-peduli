package J4;

import B4.I;
import M2.RunnableC0315y;
import android.os.Handler;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.DownloadBlock;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2406b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.f2406b = obj;
    }

    public final void a(Download download) {
        switch (this.a) {
            case 0:
                p210v8.i.f(download, "download");
                d.o0((d) this.f2406b, download);
                return;
            default:
                p210v8.i.g(download, "download");
                synchronized (((V3.b) this.f2406b).a) {
                    try {
                        ((Handler) ((V3.b) this.f2406b).f5175e).post(new p112l7.f(this, download, 0));
                        Iterator it = ((LinkedHashMap) ((V3.b) this.f2406b).f5172b).values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                c cVar = (c) ((WeakReference) it2.next()).get();
                                if (cVar == null) {
                                    it2.remove();
                                } else {
                                    ((Handler) ((V3.b) this.f2406b).f5179i).post(new p112l7.g(cVar, download, 0));
                                }
                            }
                        }
                        if (((LinkedHashMap) ((V3.b) this.f2406b).f5173c).isEmpty()) {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).H(((DownloadInfo) download).f10364w, download, 11);
                        } else {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).z(((DownloadInfo) download).f10364w, download, 11);
                            Iterator it3 = ((LinkedHashMap) ((V3.b) this.f2406b).f5173c).values().iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = ((Set) it3.next()).iterator();
                                while (it4.hasNext()) {
                                    if (((WeakReference) it4.next()).get() != null) {
                                        throw new ClassCastException();
                                    }
                                    it4.remove();
                                }
                            }
                        }
                        List list = (List) ((LinkedHashMap) ((V3.b) this.f2406b).f5176f).get(Integer.valueOf(((DownloadInfo) download).f10360s));
                        if (list != null) {
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                if (((WeakReference) it5.next()).get() != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void b(Download download) {
        switch (this.a) {
            case 0:
                p210v8.i.f(download, "download");
                d.o0((d) this.f2406b, download);
                return;
            default:
                p210v8.i.g(download, "download");
                synchronized (((V3.b) this.f2406b).a) {
                    try {
                        ((Handler) ((V3.b) this.f2406b).f5175e).post(new p112l7.f(this, download, 1));
                        Iterator it = ((LinkedHashMap) ((V3.b) this.f2406b).f5172b).values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                c cVar = (c) ((WeakReference) it2.next()).get();
                                if (cVar == null) {
                                    it2.remove();
                                } else {
                                    ((Handler) ((V3.b) this.f2406b).f5179i).post(new p112l7.g(cVar, download, 1));
                                }
                            }
                        }
                        if (((LinkedHashMap) ((V3.b) this.f2406b).f5173c).isEmpty()) {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).H(((DownloadInfo) download).f10364w, download, 7);
                        } else {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).z(((DownloadInfo) download).f10364w, download, 7);
                            Iterator it3 = ((LinkedHashMap) ((V3.b) this.f2406b).f5173c).values().iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = ((Set) it3.next()).iterator();
                                while (it4.hasNext()) {
                                    if (((WeakReference) it4.next()).get() != null) {
                                        throw new ClassCastException();
                                    }
                                    it4.remove();
                                }
                            }
                        }
                        List list = (List) ((LinkedHashMap) ((V3.b) this.f2406b).f5176f).get(Integer.valueOf(((DownloadInfo) download).f10360s));
                        if (list != null) {
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                if (((WeakReference) it5.next()).get() != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void c(Download download) {
        switch (this.a) {
            case 0:
                p210v8.i.f(download, "download");
                d.o0((d) this.f2406b, download);
                return;
            default:
                p210v8.i.g(download, "download");
                synchronized (((V3.b) this.f2406b).a) {
                    try {
                        ((Handler) ((V3.b) this.f2406b).f5175e).post(new p112l7.f(this, download, 2));
                        Iterator it = ((LinkedHashMap) ((V3.b) this.f2406b).f5172b).values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                c cVar = (c) ((WeakReference) it2.next()).get();
                                if (cVar == null) {
                                    it2.remove();
                                } else {
                                    ((Handler) ((V3.b) this.f2406b).f5179i).post(new p112l7.g(cVar, download, 2));
                                }
                            }
                        }
                        if (((LinkedHashMap) ((V3.b) this.f2406b).f5173c).isEmpty()) {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).H(((DownloadInfo) download).f10364w, download, 13);
                        } else {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).z(((DownloadInfo) download).f10364w, download, 13);
                            Iterator it3 = ((LinkedHashMap) ((V3.b) this.f2406b).f5173c).values().iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = ((Set) it3.next()).iterator();
                                while (it4.hasNext()) {
                                    if (((WeakReference) it4.next()).get() != null) {
                                        throw new ClassCastException();
                                    }
                                    it4.remove();
                                }
                            }
                        }
                        List list = (List) ((LinkedHashMap) ((V3.b) this.f2406b).f5176f).get(Integer.valueOf(((DownloadInfo) download).f10360s));
                        if (list != null) {
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                if (((WeakReference) it5.next()).get() != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void d(DownloadInfo downloadInfo, DownloadBlock downloadBlock, int i10) {
        switch (this.a) {
            case 0:
                p210v8.i.f(downloadInfo, "download");
                p210v8.i.f(downloadBlock, "downloadBlock");
                return;
            default:
                p210v8.i.g(downloadInfo, "download");
                p210v8.i.g(downloadBlock, "downloadBlock");
                synchronized (((V3.b) this.f2406b).a) {
                    try {
                        Iterator it = ((LinkedHashMap) ((V3.b) this.f2406b).f5172b).values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                c cVar = (c) ((WeakReference) it2.next()).get();
                                if (cVar == null) {
                                    it2.remove();
                                } else {
                                    cVar.d(downloadInfo, downloadBlock, i10);
                                }
                            }
                        }
                        if (!((LinkedHashMap) ((V3.b) this.f2406b).f5173c).isEmpty()) {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).z(downloadInfo.f10364w, downloadInfo, 14);
                            Iterator it3 = ((LinkedHashMap) ((V3.b) this.f2406b).f5173c).values().iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = ((Set) it3.next()).iterator();
                                while (it4.hasNext()) {
                                    if (((WeakReference) it4.next()).get() != null) {
                                        throw new ClassCastException();
                                    }
                                    it4.remove();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void e(Download download, h7.b bVar, Exception exc) {
        switch (this.a) {
            case 0:
                p210v8.i.f(download, "download");
                p210v8.i.f(bVar, "error");
                d.o0((d) this.f2406b, download);
                return;
            default:
                p210v8.i.g(download, "download");
                p210v8.i.g(bVar, "error");
                synchronized (((V3.b) this.f2406b).a) {
                    try {
                        ((Handler) ((V3.b) this.f2406b).f5175e).post(new p112l7.f(this, download, 3));
                        Iterator it = ((LinkedHashMap) ((V3.b) this.f2406b).f5172b).values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                c cVar = (c) ((WeakReference) it2.next()).get();
                                if (cVar == null) {
                                    it2.remove();
                                } else {
                                    ((Handler) ((V3.b) this.f2406b).f5179i).post(new RunnableC0315y(cVar, download, bVar, exc));
                                }
                            }
                        }
                        if (((LinkedHashMap) ((V3.b) this.f2406b).f5173c).isEmpty()) {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).H(((DownloadInfo) download).f10364w, download, 8);
                        } else {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).z(((DownloadInfo) download).f10364w, download, 8);
                            Iterator it3 = ((LinkedHashMap) ((V3.b) this.f2406b).f5173c).values().iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = ((Set) it3.next()).iterator();
                                while (it4.hasNext()) {
                                    if (((WeakReference) it4.next()).get() != null) {
                                        throw new ClassCastException();
                                    }
                                    it4.remove();
                                }
                            }
                        }
                        List list = (List) ((LinkedHashMap) ((V3.b) this.f2406b).f5176f).get(Integer.valueOf(((DownloadInfo) download).f10360s));
                        if (list != null) {
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                if (((WeakReference) it5.next()).get() != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void f(Download download) {
        switch (this.a) {
            case 0:
                p210v8.i.f(download, "download");
                d.o0((d) this.f2406b, download);
                return;
            default:
                p210v8.i.g(download, "download");
                synchronized (((V3.b) this.f2406b).a) {
                    try {
                        ((Handler) ((V3.b) this.f2406b).f5175e).post(new p112l7.f(this, download, 4));
                        Iterator it = ((LinkedHashMap) ((V3.b) this.f2406b).f5172b).values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                c cVar = (c) ((WeakReference) it2.next()).get();
                                if (cVar == null) {
                                    it2.remove();
                                } else {
                                    ((Handler) ((V3.b) this.f2406b).f5179i).post(new p112l7.g(cVar, download, 3));
                                }
                            }
                        }
                        if (((LinkedHashMap) ((V3.b) this.f2406b).f5173c).isEmpty()) {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).H(((DownloadInfo) download).f10364w, download, 9);
                        } else {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).z(((DownloadInfo) download).f10364w, download, 9);
                            Iterator it3 = ((LinkedHashMap) ((V3.b) this.f2406b).f5173c).values().iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = ((Set) it3.next()).iterator();
                                while (it4.hasNext()) {
                                    if (((WeakReference) it4.next()).get() != null) {
                                        throw new ClassCastException();
                                    }
                                    it4.remove();
                                }
                            }
                        }
                        List list = (List) ((LinkedHashMap) ((V3.b) this.f2406b).f5176f).get(Integer.valueOf(((DownloadInfo) download).f10360s));
                        if (list != null) {
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                if (((WeakReference) it5.next()).get() != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void g(DownloadInfo downloadInfo, long j, long j10) {
        switch (this.a) {
            case 0:
                p210v8.i.f(downloadInfo, "download");
                d.o0((d) this.f2406b, downloadInfo);
                return;
            default:
                p210v8.i.g(downloadInfo, "download");
                synchronized (((V3.b) this.f2406b).a) {
                    try {
                        ((Handler) ((V3.b) this.f2406b).f5175e).post(new P2.g(this, 19, downloadInfo));
                        Iterator it = ((LinkedHashMap) ((V3.b) this.f2406b).f5172b).values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                c cVar = (c) ((WeakReference) it2.next()).get();
                                if (cVar == null) {
                                    it2.remove();
                                } else {
                                    ((Handler) ((V3.b) this.f2406b).f5179i).post(new p112l7.h(cVar, downloadInfo, j, j10));
                                }
                            }
                        }
                        if (((LinkedHashMap) ((V3.b) this.f2406b).f5173c).isEmpty()) {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).H(downloadInfo.f10364w, downloadInfo, 6);
                        } else {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).z(downloadInfo.f10364w, downloadInfo, 6);
                            Iterator it3 = ((LinkedHashMap) ((V3.b) this.f2406b).f5173c).values().iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = ((Set) it3.next()).iterator();
                                while (it4.hasNext()) {
                                    if (((WeakReference) it4.next()).get() != null) {
                                        throw new ClassCastException();
                                    }
                                    it4.remove();
                                }
                            }
                        }
                        List list = (List) ((LinkedHashMap) ((V3.b) this.f2406b).f5176f).get(Integer.valueOf(downloadInfo.f10360s));
                        if (list != null) {
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                if (((WeakReference) it5.next()).get() != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void h(Download download, boolean z6) {
        switch (this.a) {
            case 0:
                p210v8.i.f(download, "download");
                d.o0((d) this.f2406b, download);
                return;
            default:
                p210v8.i.g(download, "download");
                synchronized (((V3.b) this.f2406b).a) {
                    try {
                        Iterator it = ((LinkedHashMap) ((V3.b) this.f2406b).f5172b).values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                c cVar = (c) ((WeakReference) it2.next()).get();
                                if (cVar == null) {
                                    it2.remove();
                                } else {
                                    ((Handler) ((V3.b) this.f2406b).f5179i).post(new U2.b(cVar, download, z6));
                                }
                            }
                        }
                        if (((LinkedHashMap) ((V3.b) this.f2406b).f5173c).isEmpty()) {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).H(((DownloadInfo) download).f10364w, download, 3);
                        } else {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).z(((DownloadInfo) download).f10364w, download, 3);
                            Iterator it3 = ((LinkedHashMap) ((V3.b) this.f2406b).f5173c).values().iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = ((Set) it3.next()).iterator();
                                while (it4.hasNext()) {
                                    if (((WeakReference) it4.next()).get() != null) {
                                        throw new ClassCastException();
                                    }
                                    it4.remove();
                                }
                            }
                        }
                        List list = (List) ((LinkedHashMap) ((V3.b) this.f2406b).f5176f).get(Integer.valueOf(((DownloadInfo) download).f10360s));
                        if (list != null) {
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                if (((WeakReference) it5.next()).get() != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void i(Download download) {
        switch (this.a) {
            case 0:
                p210v8.i.f(download, "download");
                d.o0((d) this.f2406b, download);
                return;
            default:
                p210v8.i.g(download, "download");
                synchronized (((V3.b) this.f2406b).a) {
                    try {
                        ((Handler) ((V3.b) this.f2406b).f5175e).post(new p112l7.f(this, download, 5));
                        Iterator it = ((LinkedHashMap) ((V3.b) this.f2406b).f5172b).values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                c cVar = (c) ((WeakReference) it2.next()).get();
                                if (cVar == null) {
                                    it2.remove();
                                } else {
                                    ((Handler) ((V3.b) this.f2406b).f5179i).post(new p112l7.g(cVar, download, 4));
                                }
                            }
                        }
                        if (((LinkedHashMap) ((V3.b) this.f2406b).f5173c).isEmpty()) {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).H(((DownloadInfo) download).f10364w, download, 10);
                        } else {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).z(((DownloadInfo) download).f10364w, download, 10);
                            Iterator it3 = ((LinkedHashMap) ((V3.b) this.f2406b).f5173c).values().iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = ((Set) it3.next()).iterator();
                                while (it4.hasNext()) {
                                    if (((WeakReference) it4.next()).get() != null) {
                                        throw new ClassCastException();
                                    }
                                    it4.remove();
                                }
                            }
                        }
                        List list = (List) ((LinkedHashMap) ((V3.b) this.f2406b).f5176f).get(Integer.valueOf(((DownloadInfo) download).f10360s));
                        if (list != null) {
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                if (((WeakReference) it5.next()).get() != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void j(DownloadInfo downloadInfo, List list, int i10) throws Throwable {
        switch (this.a) {
            case 0:
                p210v8.i.f(downloadInfo, "download");
                return;
            default:
                p210v8.i.g(downloadInfo, "download");
                synchronized (((V3.b) this.f2406b).a) {
                    try {
                        try {
                            ((Handler) ((V3.b) this.f2406b).f5175e).post(new I(this, downloadInfo, list, 15, false));
                            Iterator it = ((LinkedHashMap) ((V3.b) this.f2406b).f5172b).values().iterator();
                            while (it.hasNext()) {
                                Iterator it2 = ((Set) it.next()).iterator();
                                while (it2.hasNext()) {
                                    c cVar = (c) ((WeakReference) it2.next()).get();
                                    if (cVar == null) {
                                        it2.remove();
                                    } else {
                                        ((Handler) ((V3.b) this.f2406b).f5179i).post(new p112l7.i(cVar, downloadInfo, list, i10));
                                    }
                                }
                            }
                            if (((LinkedHashMap) ((V3.b) this.f2406b).f5173c).isEmpty()) {
                                ((Y1.c) ((V3.b) this.f2406b).f5178h).H(downloadInfo.f10364w, downloadInfo, 4);
                            } else {
                                ((Y1.c) ((V3.b) this.f2406b).f5178h).z(downloadInfo.f10364w, downloadInfo, 4);
                                Iterator it3 = ((LinkedHashMap) ((V3.b) this.f2406b).f5173c).values().iterator();
                                while (it3.hasNext()) {
                                    Iterator it4 = ((Set) it3.next()).iterator();
                                    while (it4.hasNext()) {
                                        if (((WeakReference) it4.next()).get() != null) {
                                            throw new ClassCastException();
                                        }
                                        it4.remove();
                                    }
                                }
                            }
                            List list2 = (List) ((LinkedHashMap) ((V3.b) this.f2406b).f5176f).get(Integer.valueOf(downloadInfo.f10360s));
                            if (list2 != null) {
                                Iterator it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    if (((WeakReference) it5.next()).get() != null) {
                                        throw new ClassCastException();
                                    }
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                break;
        }
    }

    public final void k(Download download) {
        switch (this.a) {
            case 0:
                return;
            default:
                synchronized (((V3.b) this.f2406b).a) {
                    try {
                        Iterator it = ((LinkedHashMap) ((V3.b) this.f2406b).f5172b).values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                c cVar = (c) ((WeakReference) it2.next()).get();
                                if (cVar == null) {
                                    it2.remove();
                                } else {
                                    ((Handler) ((V3.b) this.f2406b).f5179i).post(new p112l7.g(cVar, download, 5));
                                }
                            }
                        }
                        if (((LinkedHashMap) ((V3.b) this.f2406b).f5173c).isEmpty()) {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).H(((DownloadInfo) download).f10364w, download, 5);
                        } else {
                            ((Y1.c) ((V3.b) this.f2406b).f5178h).z(((DownloadInfo) download).f10364w, download, 5);
                            Iterator it3 = ((LinkedHashMap) ((V3.b) this.f2406b).f5173c).values().iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = ((Set) it3.next()).iterator();
                                while (it4.hasNext()) {
                                    if (((WeakReference) it4.next()).get() != null) {
                                        throw new ClassCastException();
                                    }
                                    it4.remove();
                                }
                            }
                        }
                        List list = (List) ((LinkedHashMap) ((V3.b) this.f2406b).f5176f).get(Integer.valueOf(((DownloadInfo) download).f10360s));
                        if (list != null) {
                            Iterator it5 = list.iterator();
                            while (it5.hasNext()) {
                                if (((WeakReference) it5.next()).get() != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    private final void l(Download download) {
    }
}
