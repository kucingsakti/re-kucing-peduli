package p085i7;

import K0.d;
import P0.j;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.tonyodev.fetch2.database.DownloadDatabase_Impl;
import com.tonyodev.fetch2.database.DownloadInfo;
import h7.b;
import h7.f;
import p140o4.r;
import p210v8.i;
import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f12289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, DownloadDatabase_Impl downloadDatabase_Impl) {
        super(downloadDatabase_Impl);
        this.f12289e = rVar;
    }

    @Override // K0.q
    public final String c() {
        return "UPDATE OR REPLACE `requests` SET `_id` = ?,`_namespace` = ?,`_url` = ?,`_file` = ?,`_group` = ?,`_priority` = ?,`_headers` = ?,`_written_bytes` = ?,`_total_bytes` = ?,`_status` = ?,`_error` = ?,`_network_type` = ?,`_created` = ?,`_tag` = ?,`_enqueue_action` = ?,`_identifier` = ?,`_download_on_enqueue` = ?,`_extras` = ?,`_auto_retry_max_attempts` = ?,`_auto_retry_attempts` = ? WHERE `_id` = ?";
    }

    @Override // K0.d
    public final void f(j jVar, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        jVar.I(1, downloadInfo.f10360s);
        String str = downloadInfo.f10361t;
        if (str == null) {
            jVar.v(2);
        } else {
            jVar.m(2, str);
        }
        String str2 = downloadInfo.f10362u;
        if (str2 == null) {
            jVar.v(3);
        } else {
            jVar.m(3, str2);
        }
        String str3 = downloadInfo.f10363v;
        if (str3 == null) {
            jVar.v(4);
        } else {
            jVar.m(4, str3);
        }
        jVar.I(5, downloadInfo.f10364w);
        Object obj2 = this.f12289e.f13783u;
        int i10 = downloadInfo.f10365x;
        AbstractC0487g.v(i10, "priority");
        jVar.I(6, AbstractC0487g.d(i10));
        jVar.m(7, K3.d.w(downloadInfo.f10366y));
        jVar.I(8, downloadInfo.f10367z);
        jVar.I(9, downloadInfo.f10346A);
        f fVar = downloadInfo.f10347B;
        i.g(fVar, "status");
        jVar.I(10, fVar.f11780s);
        b bVar = downloadInfo.f10348C;
        i.g(bVar, "error");
        jVar.I(11, bVar.f11758s);
        int i11 = downloadInfo.f10349D;
        AbstractC0487g.v(i11, "networkType");
        jVar.I(12, AbstractC0487g.c(i11));
        jVar.I(13, downloadInfo.f10350E);
        String str4 = downloadInfo.f10351F;
        if (str4 == null) {
            jVar.v(14);
        } else {
            jVar.m(14, str4);
        }
        int i12 = downloadInfo.f10352G;
        AbstractC0487g.v(i12, "enqueueAction");
        jVar.I(15, e.d(i12));
        jVar.I(16, downloadInfo.f10353H);
        jVar.I(17, downloadInfo.f10354I ? 1L : 0L);
        jVar.m(18, K3.d.p(downloadInfo.f10355J));
        jVar.I(19, downloadInfo.f10356K);
        jVar.I(20, downloadInfo.f10357L);
        jVar.I(21, downloadInfo.f10360s);
    }
}
