package K4;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.widget.Toast;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2601s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X2.h f2602t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f2603u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f2604v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(X2.h hVar, m mVar, String str) {
        super(0);
        this.f2602t = hVar;
        this.f2603u = mVar;
        this.f2604v = str;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f2601s) {
            case 0:
                this.f2602t.dismiss();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(this.f2604v));
                this.f2603u.f2607b.startActivity(intent);
                break;
            default:
                this.f2602t.dismiss();
                m mVar = this.f2603u;
                String str = mVar.f2611f;
                String str2 = mVar.j;
                p210v8.i.c(str2);
                Context context = mVar.a;
                Object systemService = context.getSystemService("download");
                p210v8.i.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                DownloadManager downloadManager = (DownloadManager) systemService;
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
                if (!file.exists()) {
                    file.mkdirs();
                }
                downloadManager.enqueue(new DownloadManager.Request(Uri.parse(this.f2604v)).setMimeType(mVar.f2613h).addRequestHeader("User-Agent", str).addRequestHeader("Content-Disposition", mVar.f2609d).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "NekoPoi/".concat(str2)).setNotificationVisibility(1).setAllowedOverMetered(true).setAllowedOverRoaming(true));
                Toast.makeText(context, "Unduhan akan dimulai dalam beberapa saat", 0).show();
                break;
        }
        return p076h8.m.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(X2.h hVar, String str, m mVar) {
        super(0);
        this.f2602t = hVar;
        this.f2604v = str;
        this.f2603u = mVar;
    }
}
