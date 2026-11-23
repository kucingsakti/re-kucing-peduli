package p133n7;

import P2.g;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import h7.f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p112l7.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final LinkedHashSet a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile List f13403b;

    public final void a(List list, Download download, int i10) {
        i.g(list, "downloads");
        AbstractC0487g.v(i10, "reason");
        this.f13403b = list;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((DownloadInfo) ((Download) obj)).f10347B == f.QUEUED) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((DownloadInfo) ((Download) obj2)).f10347B == f.ADDED) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (((DownloadInfo) ((Download) obj3)).f10347B == f.PAUSED) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list2) {
            if (((DownloadInfo) ((Download) obj4)).f10347B == f.DOWNLOADING) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list2) {
            if (((DownloadInfo) ((Download) obj5)).f10347B == f.COMPLETED) {
                arrayList5.add(obj5);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list2) {
            if (((DownloadInfo) ((Download) obj6)).f10347B == f.CANCELLED) {
                arrayList6.add(obj6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : list2) {
            if (((DownloadInfo) ((Download) obj7)).f10347B == f.FAILED) {
                arrayList7.add(obj7);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj8 : list2) {
            if (((DownloadInfo) ((Download) obj8)).f10347B == f.DELETED) {
                arrayList8.add(obj8);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj9 : list2) {
            if (((DownloadInfo) ((Download) obj9)).f10347B == f.REMOVED) {
                arrayList9.add(obj9);
            }
        }
        if (i10 != 14) {
            e.f12951c.post(new g(this, list, i10, download));
        }
    }
}
