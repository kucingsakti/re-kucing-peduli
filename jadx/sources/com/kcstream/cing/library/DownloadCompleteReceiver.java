package com.kcstream.cing.library;

import Ha.a;
import N9.AbstractC0317a;
import N9.AbstractC0342z;
import N9.I;
import N9.p0;
import S9.n;
import U9.d;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import kotlin.Metadata;
import p123m8.e;
import p123m8.j;
import p210v8.i;
import za.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/library/DownloadCompleteReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DownloadCompleteReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (i.a(intent != null ? intent.getAction() : null, "android.intent.action.DOWNLOAD_COMPLETE")) {
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            if (longExtra != -1) {
                Object systemService = context != null ? context.getSystemService("download") : null;
                i.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                Cursor cursorQuery = ((DownloadManager) systemService).query(new DownloadManager.Query().setFilterById(longExtra));
                if (cursorQuery.moveToFirst() && cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("status")) == 8) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("local_uri"));
                    File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    i.c(string);
                    String path = Uri.parse(string).getPath();
                    if (path == null) {
                        path = "";
                    }
                    File file = new File(externalStoragePublicDirectory, new File(path).getName());
                    String path2 = Uri.parse(string).getPath();
                    File file2 = new File(path2 != null ? path2 : "");
                    c cVar = a.a;
                    file.getAbsolutePath();
                    cVar.getClass();
                    c.h(new Object[0]);
                    file2.getAbsolutePath();
                    c.h(new Object[0]);
                    try {
                        d dVar = I.a;
                        p123m8.i iVar = n.a;
                        K4.i iVar2 = new K4.i(file, null);
                        int i10 = 2 & 1;
                        j jVar = j.f13164s;
                        if (i10 != 0) {
                            iVar = jVar;
                        }
                        p123m8.i iVarG = AbstractC0342z.g(jVar, iVar, true);
                        d dVar2 = I.a;
                        if (iVarG != dVar2 && iVarG.get(e.f13163s) == null) {
                            iVarG = iVarG.plus(dVar2);
                        }
                        AbstractC0317a p0Var = new p0(iVarG, true);
                        p0Var.Q(1, p0Var, iVar2);
                    } catch (Exception e10) {
                        c cVar2 = a.a;
                        e10.getMessage();
                        cVar2.getClass();
                        c.k(new Object[0]);
                    }
                }
                cursorQuery.close();
            }
        }
    }
}
