package p122m7;

import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import p085i7.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final g a;

    public /* synthetic */ a(g gVar) {
        this.a = gVar;
    }

    public ArrayList a(int i10, Download download) {
        i.g(download, "download");
        ArrayList arrayList = (ArrayList) this.a.b(i10);
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (((DownloadInfo) ((Download) it.next())).f10360s == ((DownloadInfo) download).f10360s) {
                break;
            }
            i11++;
        }
        if (i11 != -1) {
            arrayList.set(i11, download);
        }
        return arrayList;
    }

    public void b(DownloadInfo downloadInfo) {
        i.g(downloadInfo, "downloadInfo");
        g gVar = this.a;
        gVar.getClass();
        i.g(downloadInfo, "downloadInfo");
        synchronized (gVar.f12301s) {
            gVar.f12302t.l(downloadInfo);
        }
    }
}
