package p102k7;

import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import p086i8.C;
import p200u8.a;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f12742t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i10) {
        super(0);
        this.f12741s = i10;
        this.f12742t = fVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f12741s) {
            case 0:
                DownloadBlockInfo downloadBlockInfo = new DownloadBlockInfo();
                downloadBlockInfo.f10369t = 1;
                downloadBlockInfo.f10368s = ((DownloadInfo) this.f12742t.f12749F).f10360s;
                return downloadBlockInfo;
            default:
                f fVar = this.f12742t;
                Download download = fVar.f12749F;
                if (fVar.f12756u == null) {
                    i.l();
                    throw null;
                }
                DownloadInfo downloadInfo = new DownloadInfo();
                C.z(download, downloadInfo);
                return downloadInfo;
        }
    }
}
