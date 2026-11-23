package F4;

import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.onesignal.inAppMessages.internal.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import ma.q;
import ma.r;
import p078i.C0650g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1495v;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.f1492s = i10;
        this.f1493t = obj;
        this.f1494u = obj2;
        this.f1495v = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
        p041e3.b bVar;
        C0650g c0650g;
        switch (this.f1492s) {
            case 0:
                f fVar = (f) this.f1493t;
                i.f(fVar, "this$0");
                File file = (File) this.f1494u;
                File file2 = (File) this.f1495v;
                dialogInterface.dismiss();
                K4.h hVar = new K4.h(fVar.X(), "nekopoi_localdb", null, 1);
                SQLiteDatabase readableDatabase = hVar.getReadableDatabase();
                if (readableDatabase == null || !readableDatabase.isOpen()) {
                    readableDatabase = hVar.getReadableDatabase();
                }
                if (!readableDatabase.isReadOnly()) {
                    readableDatabase.close();
                    readableDatabase = hVar.getReadableDatabase();
                }
                Cursor cursorRawQuery = readableDatabase.rawQuery("select DISTINCT tbl_name from sqlite_master where tbl_name = 'bookmark'", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0) {
                            cursorRawQuery.close();
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            try {
                                try {
                                    try {
                                        r rVarD = p068ga.d.d(p068ga.d.D(file));
                                        q qVarC = p068ga.d.c(p068ga.d.C(file2));
                                        while (rVarD.u(qVarC.f13210t, 8192L) != -1) {
                                            qVarC.a();
                                        }
                                        qVarC.close();
                                        rVarD.close();
                                        bVar = new p041e3.b(fVar.X());
                                        c0650g = (C0650g) bVar.f123t;
                                        c0650g.f12042d = "Restore berhasil";
                                    } catch (FileNotFoundException e10) {
                                        p041e3.b bVar2 = new p041e3.b(fVar.X());
                                        C0650g c0650g2 = (C0650g) bVar2.f123t;
                                        c0650g2.f12042d = "Restore gagal";
                                        c0650g2.f12044f = e10.getMessage();
                                        bVar2.h("Tutup", null);
                                        bVar2.g();
                                        bVar = new p041e3.b(fVar.X());
                                        c0650g = (C0650g) bVar.f123t;
                                        c0650g.f12042d = "Restore berhasil";
                                    }
                                } catch (Exception e11) {
                                    p041e3.b bVar3 = new p041e3.b(fVar.X());
                                    C0650g c0650g3 = (C0650g) bVar3.f123t;
                                    c0650g3.f12042d = "Restore gagal";
                                    c0650g3.f12044f = e11.getMessage();
                                    bVar3.h("Tutup", null);
                                    bVar3.g();
                                    bVar = new p041e3.b(fVar.X());
                                    c0650g = (C0650g) bVar.f123t;
                                    c0650g.f12042d = "Restore berhasil";
                                }
                                c0650g.f12044f = "Data cadangan berhasil dikembalikan";
                                bVar.h("Tutup", null);
                                bVar.g();
                                return;
                            } catch (Throwable th) {
                                p041e3.b bVar4 = new p041e3.b(fVar.X());
                                C0650g c0650g4 = (C0650g) bVar4.f123t;
                                c0650g4.f12042d = "Restore berhasil";
                                c0650g4.f12044f = "Data cadangan berhasil dikembalikan";
                                bVar4.h("Tutup", null);
                                bVar4.g();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            com.bumptech.glide.c.c(cursorRawQuery, th2);
                            throw th3;
                        }
                    }
                }
                com.bumptech.glide.c.c(cursorRawQuery, null);
                p041e3.b bVar5 = new p041e3.b(fVar.X());
                C0650g c0650g5 = (C0650g) bVar5.f123t;
                c0650g5.f12042d = "Corrupt";
                c0650g5.f12044f = "Database corrupt";
                bVar5.h("Tutup", null);
                bVar5.g();
                return;
            default:
                j.m15showAlertDialogMessage$lambda7((j) this.f1493t, (com.onesignal.inAppMessages.internal.a) this.f1494u, (List) this.f1495v, dialogInterface, i10);
                return;
        }
    }
}
