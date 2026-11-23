package p112l7;

import O3.C0343a;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.tonyodev.fetch2.database.DownloadDatabase_Impl;
import com.tonyodev.fetch2.database.DownloadInfo;
import h7.b;
import h7.d;
import h7.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import p085i7.g;
import p102k7.e;
import p140o4.r;
import p200u8.a;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0343a f12941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f12942u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(C0343a c0343a, List list, int i10) {
        super(0);
        this.f12940s = i10;
        this.f12941t = c0343a;
        this.f12942u = list;
    }

    @Override // p200u8.a
    public final Object invoke() throws FileNotFoundException {
        switch (this.f12940s) {
            case 0:
                a aVar = (a) this.f12941t.f3514f;
                aVar.getClass();
                List list = this.f12942u;
                g gVar = aVar.f12932v;
                ArrayList<DownloadInfo> arrayListR = p086i8.k.R(gVar.a(list));
                aVar.a(arrayListR);
                ArrayList arrayList = new ArrayList();
                for (DownloadInfo downloadInfo : arrayListR) {
                    i.g(downloadInfo, "download");
                    int iOrdinal = downloadInfo.f10347B.ordinal();
                    if (iOrdinal != 0 && iOrdinal != 4 && iOrdinal != 6) {
                        downloadInfo.f10347B = f.CANCELLED;
                        d dVar = p152p7.a.a;
                        downloadInfo.f10348C = b.NONE;
                        arrayList.add(downloadInfo);
                    }
                }
                gVar.i(arrayList);
                return arrayList;
            default:
                a aVar2 = (a) this.f12941t.f3514f;
                aVar2.getClass();
                List list2 = this.f12942u;
                g gVar2 = aVar2.f12932v;
                ArrayList<DownloadInfo> arrayListR2 = p086i8.k.R(gVar2.a(list2));
                aVar2.a(arrayListR2);
                synchronized (gVar2.f12301s) {
                    p085i7.f fVar = gVar2.f12302t;
                    fVar.j();
                    r rVarQ = fVar.f12295u.q();
                    DownloadDatabase_Impl downloadDatabase_Impl = (DownloadDatabase_Impl) rVarQ.f13782t;
                    downloadDatabase_Impl.b();
                    downloadDatabase_Impl.c();
                    try {
                        ((p085i7.b) rVarQ.f13784v).g(arrayListR2);
                        downloadDatabase_Impl.o();
                        downloadDatabase_Impl.j();
                    } catch (Throwable th) {
                        downloadDatabase_Impl.j();
                        throw th;
                    }
                }
                for (DownloadInfo downloadInfo2 : arrayListR2) {
                    f fVar2 = f.DELETED;
                    downloadInfo2.getClass();
                    downloadInfo2.f10347B = fVar2;
                    String str = downloadInfo2.f10363v;
                    o1.k kVar = aVar2.f12927A;
                    i.g(str, "file");
                    Context context = (Context) kVar.f13638s;
                    i.g(context, "context");
                    if (C3.b.J(str)) {
                        Uri uri = Uri.parse(str);
                        i.b(uri, "uri");
                        if (i.a(uri.getScheme(), "file")) {
                            File file = new File(uri.getPath());
                            if (file.canWrite() && file.exists() && file.exists() && file.canWrite()) {
                                file.delete();
                            }
                        } else if (i.a(uri.getScheme(), "content")) {
                            if (DocumentsContract.isDocumentUri(context, uri)) {
                                DocumentsContract.deleteDocument(context.getContentResolver(), uri);
                            } else {
                                context.getContentResolver().delete(uri, null, null);
                            }
                        }
                    } else {
                        File file2 = new File(str);
                        if (file2.exists() && file2.canWrite()) {
                            file2.delete();
                        }
                    }
                    e eVarC = gVar2.c();
                    if (eVarC != null) {
                        o1.k kVar2 = ((h7.c) ((T3.c) eVarC.f12743s).f4658c).f11762e;
                        p068ga.d.t(downloadInfo2);
                        p068ga.d.j(downloadInfo2.f10360s, (String) kVar2.f13639t);
                    }
                }
                return arrayListR2;
        }
    }
}
