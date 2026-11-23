package F4;

import C0.i;
import C0.j;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Environment;
import androidx.preference.Preference;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.drawer.AboutActivity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import ma.q;
import ma.r;
import p078i.C0650g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements j, i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1487s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f1488t;

    public /* synthetic */ a(f fVar, int i10) {
        this.f1487s = i10;
        this.f1488t = fVar;
    }

    @Override // C0.i
    public void a(Preference preference, Serializable serializable) {
        switch (this.f1487s) {
            case 1:
                f fVar = this.f1488t;
                p210v8.i.f(fVar, "this$0");
                p210v8.i.f(preference, "<anonymous parameter 0>");
                p210v8.i.d(serializable, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) serializable).booleanValue()) {
                    SharedPreferences sharedPreferences = fVar.f1500B0;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putBoolean("is_biometric", true).apply();
                        return;
                    } else {
                        p210v8.i.n("sharedPref");
                        throw null;
                    }
                }
                SharedPreferences sharedPreferences2 = fVar.f1500B0;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().remove("is_biometric").apply();
                    return;
                } else {
                    p210v8.i.n("sharedPref");
                    throw null;
                }
            default:
                f fVar2 = this.f1488t;
                p210v8.i.f(fVar2, "this$0");
                p210v8.i.f(preference, "<anonymous parameter 0>");
                p210v8.i.d(serializable, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) serializable).booleanValue()) {
                    fVar2.X().getApplicationContext().getPackageManager().setComponentEnabledSetting(new ComponentName("com.kcstream.cing", "com.kcstream.cing.activity.SplashActivityDisguiseMode"), 1, 1);
                    fVar2.X().getApplicationContext().getPackageManager().setComponentEnabledSetting(new ComponentName("com.kcstream.cing", "com.kcstream.cing.activity.SplashActivity"), 2, 1);
                    return;
                } else {
                    fVar2.X().getApplicationContext().getPackageManager().setComponentEnabledSetting(new ComponentName("com.kcstream.cing", "com.kcstream.cing.activity.SplashActivityDisguiseMode"), 2, 1);
                    fVar2.X().getApplicationContext().getPackageManager().setComponentEnabledSetting(new ComponentName("com.kcstream.cing", "com.kcstream.cing.activity.SplashActivity"), 1, 1);
                    return;
                }
        }
    }

    @Override // C0.j
    public void x(Preference preference) {
        switch (this.f1487s) {
            case 0:
                f fVar = this.f1488t;
                p210v8.i.f(fVar, "this$0");
                fVar.f0(new Intent(fVar.m(), (Class<?>) AboutActivity.class));
                break;
            case 1:
            case 2:
            default:
                final f fVar2 = this.f1488t;
                p210v8.i.f(fVar2, "this$0");
                new K4.h(fVar2.X(), "nekopoi_localdb", null, 1);
                final File file = new File(fVar2.X().getDatabasePath("nekopoi_localdb").getAbsolutePath());
                final File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Nekopoi");
                final File file3 = new File(file2, "nekopoi.db");
                if (!fVar2.W().isFinishing()) {
                    p041e3.b bVar = new p041e3.b(fVar2.X());
                    C0650g c0650g = (C0650g) bVar.f123t;
                    c0650g.f12042d = "Cadangkan bookmark";
                    c0650g.f12044f = "Cadangkan bookmark agar jika suatu saat ada masalah, data bisa dipulihkan";
                    bVar.h("Batal", new c(1));
                    bVar.i("Buat", new DialogInterface.OnClickListener() { // from class: F4.e
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) throws IOException {
                            p041e3.b bVar2;
                            C0650g c0650g2;
                            String str;
                            File file4 = file2;
                            File file5 = file3;
                            File file6 = file;
                            f fVar3 = fVar2;
                            p210v8.i.f(fVar3, "this$0");
                            if (!file4.exists() && file4.mkdirs()) {
                                file5.createNewFile();
                            }
                            try {
                                try {
                                    try {
                                        r rVarD = p068ga.d.d(p068ga.d.D(file6));
                                        q qVarC = p068ga.d.c(p068ga.d.C(file5));
                                        while (rVarD.u(qVarC.f13210t, 8192L) != -1) {
                                            qVarC.a();
                                        }
                                        qVarC.close();
                                        rVarD.close();
                                        p041e3.b bVar3 = new p041e3.b(fVar3.X());
                                        C0650g c0650g3 = (C0650g) bVar3.f123t;
                                        c0650g3.f12042d = "Pencadangan dibuat";
                                        c0650g3.f12044f = "Data tersimpan pada " + file5.getAbsolutePath() + " \nSilahkan simpan ke direktori lain, agar tidak mudah terhapus";
                                        bVar3.h("Tutup", null);
                                        bVar3.g();
                                    } catch (Exception e10) {
                                        p041e3.b bVar4 = new p041e3.b(fVar3.X());
                                        C0650g c0650g4 = (C0650g) bVar4.f123t;
                                        c0650g4.f12042d = "Pencadangan gagal";
                                        c0650g4.f12044f = e10.getMessage();
                                        bVar4.h("Tutup", null);
                                        bVar4.g();
                                        bVar2 = new p041e3.b(fVar3.X());
                                        c0650g2 = (C0650g) bVar2.f123t;
                                        c0650g2.f12042d = "Pencadangan dibuat";
                                        str = "Data tersimpan pada " + file5.getAbsolutePath() + " \nSilahkan simpan ke direktori lain, agar tidak mudah terhapus";
                                        c0650g2.f12044f = str;
                                        bVar2.h("Tutup", null);
                                        bVar2.g();
                                    }
                                } catch (FileNotFoundException e11) {
                                    p041e3.b bVar5 = new p041e3.b(fVar3.X());
                                    C0650g c0650g5 = (C0650g) bVar5.f123t;
                                    c0650g5.f12042d = "Pencadangan gagal";
                                    c0650g5.f12044f = e11.getMessage();
                                    bVar5.h("Tutup", null);
                                    bVar5.g();
                                    bVar2 = new p041e3.b(fVar3.X());
                                    c0650g2 = (C0650g) bVar2.f123t;
                                    c0650g2.f12042d = "Pencadangan dibuat";
                                    str = "Data tersimpan pada " + file5.getAbsolutePath() + " \nSilahkan simpan ke direktori lain, agar tidak mudah terhapus";
                                    c0650g2.f12044f = str;
                                    bVar2.h("Tutup", null);
                                    bVar2.g();
                                }
                            } catch (Throwable th) {
                                p041e3.b bVar6 = new p041e3.b(fVar3.X());
                                C0650g c0650g6 = (C0650g) bVar6.f123t;
                                c0650g6.f12042d = "Pencadangan dibuat";
                                c0650g6.f12044f = "Data tersimpan pada " + file5.getAbsolutePath() + " \nSilahkan simpan ke direktori lain, agar tidak mudah terhapus";
                                bVar6.h("Tutup", null);
                                bVar6.g();
                                throw th;
                            }
                        }
                    });
                    bVar.g();
                }
                break;
            case 3:
                f fVar3 = this.f1488t;
                p210v8.i.f(fVar3, "this$0");
                if (!fVar3.W().isFinishing()) {
                    p041e3.b bVar2 = new p041e3.b(fVar3.X());
                    C0650g c0650g2 = (C0650g) bVar2.f123t;
                    c0650g2.f12056s = null;
                    c0650g2.f12055r = R.layout.dialog_activity_settings_disguise;
                    bVar2.g();
                }
                break;
            case 4:
                final f fVar4 = this.f1488t;
                p210v8.i.f(fVar4, "this$0");
                if (!fVar4.W().isFinishing()) {
                    p041e3.b bVar3 = new p041e3.b(fVar4.X());
                    C0650g c0650g3 = (C0650g) bVar3.f123t;
                    c0650g3.f12042d = "Hapus cache?";
                    c0650g3.f12044f = "Semua cache mulai dari gambar, iklan, data http akan dihapus";
                    final int i10 = 1;
                    bVar3.i("Ya", new DialogInterface.OnClickListener() { // from class: F4.b
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            switch (i10) {
                                case 0:
                                    f fVar5 = fVar4;
                                    p210v8.i.f(fVar5, "this$0");
                                    dialogInterface.dismiss();
                                    if (fVar5.X().getDatabasePath("nekopoi_localdb").exists()) {
                                        fVar5.X().deleteDatabase("nekopoi_localdb");
                                    }
                                    File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
                                    if (!file4.exists() ? file4.mkdirs() : true) {
                                        File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
                                        File file6 = new File(file5.getAbsolutePath() + File.separatorChar + ".nomedia");
                                        try {
                                            if (file6.exists()) {
                                                file6.delete();
                                            }
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        s8.h.B(file5);
                                    }
                                    File[] externalFilesDirs = fVar5.X().getExternalFilesDirs(null);
                                    p210v8.i.e(externalFilesDirs, "getExternalFilesDirs(...)");
                                    boolean zMkdirs = false;
                                    try {
                                        try {
                                            if (externalFilesDirs.length >= 2) {
                                                zMkdirs = !externalFilesDirs[1].exists() ? externalFilesDirs[1].mkdirs() : true;
                                            }
                                        } catch (NullPointerException unused2) {
                                            String strA = Q.d.a(externalFilesDirs[1]);
                                            p210v8.i.e(strA, "getStorageState(...)");
                                            if (strA.length() > 0) {
                                                if (!strA.equals("mounted")) {
                                                    strA.equals("mounted_ro");
                                                } else if (externalFilesDirs.length >= 2) {
                                                    if (!externalFilesDirs[1].exists()) {
                                                        zMkdirs = externalFilesDirs[1].mkdirs();
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    } catch (ArrayIndexOutOfBoundsException | Exception unused3) {
                                    }
                                    if (zMkdirs) {
                                        File[] externalFilesDirs2 = fVar5.X().getExternalFilesDirs(null);
                                        p210v8.i.e(externalFilesDirs2, "getExternalFilesDirs(...)");
                                        File file7 = new File(externalFilesDirs2[1].getAbsolutePath() + File.separatorChar + ".nomedia");
                                        try {
                                            if (file7.exists()) {
                                                file7.delete();
                                            }
                                            break;
                                        } catch (Exception unused4) {
                                        }
                                        s8.h.B(new File(externalFilesDirs2[1].getAbsolutePath()));
                                    }
                                    p041e3.b bVar4 = new p041e3.b(fVar5.X());
                                    ((C0650g) bVar4.f123t).f12042d = "Semua telah dihapus";
                                    bVar4.i("OK", new c(4));
                                    bVar4.g();
                                    break;
                                default:
                                    f fVar6 = fVar4;
                                    p210v8.i.f(fVar6, "this$0");
                                    dialogInterface.dismiss();
                                    File cacheDir = fVar6.X().getCacheDir();
                                    if (cacheDir != null) {
                                        cacheDir.delete();
                                    }
                                    File externalCacheDir = fVar6.X().getExternalCacheDir();
                                    if (externalCacheDir != null) {
                                        externalCacheDir.delete();
                                    }
                                    p041e3.b bVar5 = new p041e3.b(fVar6.X());
                                    ((C0650g) bVar5.f123t).f12042d = "Cache dihapus";
                                    bVar5.i("OK", new c(3));
                                    bVar5.g();
                                    break;
                            }
                        }
                    });
                    bVar3.h("Tidak", new c(2));
                    bVar3.g();
                }
                break;
            case 5:
                final f fVar5 = this.f1488t;
                p210v8.i.f(fVar5, "this$0");
                if (!fVar5.W().isFinishing()) {
                    p041e3.b bVar4 = new p041e3.b(fVar5.X());
                    C0650g c0650g4 = (C0650g) bVar4.f123t;
                    c0650g4.f12042d = "Hapus semua file dan database?";
                    c0650g4.f12044f = "Semua file dan database bookmark akan dihapus. Pastikan sudah membackup data";
                    final int i11 = 0;
                    bVar4.i("Ya", new DialogInterface.OnClickListener() { // from class: F4.b
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i12) {
                            switch (i11) {
                                case 0:
                                    f fVar6 = fVar5;
                                    p210v8.i.f(fVar6, "this$0");
                                    dialogInterface.dismiss();
                                    if (fVar6.X().getDatabasePath("nekopoi_localdb").exists()) {
                                        fVar6.X().deleteDatabase("nekopoi_localdb");
                                    }
                                    File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
                                    if (!file4.exists() ? file4.mkdirs() : true) {
                                        File file5 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
                                        File file6 = new File(file5.getAbsolutePath() + File.separatorChar + ".nomedia");
                                        try {
                                            if (file6.exists()) {
                                                file6.delete();
                                            }
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        s8.h.B(file5);
                                    }
                                    File[] externalFilesDirs = fVar6.X().getExternalFilesDirs(null);
                                    p210v8.i.e(externalFilesDirs, "getExternalFilesDirs(...)");
                                    boolean zMkdirs = false;
                                    try {
                                        try {
                                            if (externalFilesDirs.length >= 2) {
                                                zMkdirs = !externalFilesDirs[1].exists() ? externalFilesDirs[1].mkdirs() : true;
                                            }
                                        } catch (NullPointerException unused2) {
                                            String strA = Q.d.a(externalFilesDirs[1]);
                                            p210v8.i.e(strA, "getStorageState(...)");
                                            if (strA.length() > 0) {
                                                if (!strA.equals("mounted")) {
                                                    strA.equals("mounted_ro");
                                                } else if (externalFilesDirs.length >= 2) {
                                                    if (!externalFilesDirs[1].exists()) {
                                                        zMkdirs = externalFilesDirs[1].mkdirs();
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    } catch (ArrayIndexOutOfBoundsException | Exception unused3) {
                                    }
                                    if (zMkdirs) {
                                        File[] externalFilesDirs2 = fVar6.X().getExternalFilesDirs(null);
                                        p210v8.i.e(externalFilesDirs2, "getExternalFilesDirs(...)");
                                        File file7 = new File(externalFilesDirs2[1].getAbsolutePath() + File.separatorChar + ".nomedia");
                                        try {
                                            if (file7.exists()) {
                                                file7.delete();
                                            }
                                            break;
                                        } catch (Exception unused4) {
                                        }
                                        s8.h.B(new File(externalFilesDirs2[1].getAbsolutePath()));
                                    }
                                    p041e3.b bVar5 = new p041e3.b(fVar6.X());
                                    ((C0650g) bVar5.f123t).f12042d = "Semua telah dihapus";
                                    bVar5.i("OK", new c(4));
                                    bVar5.g();
                                    break;
                                default:
                                    f fVar7 = fVar5;
                                    p210v8.i.f(fVar7, "this$0");
                                    dialogInterface.dismiss();
                                    File cacheDir = fVar7.X().getCacheDir();
                                    if (cacheDir != null) {
                                        cacheDir.delete();
                                    }
                                    File externalCacheDir = fVar7.X().getExternalCacheDir();
                                    if (externalCacheDir != null) {
                                        externalCacheDir.delete();
                                    }
                                    p041e3.b bVar6 = new p041e3.b(fVar7.X());
                                    ((C0650g) bVar6.f123t).f12042d = "Cache dihapus";
                                    bVar6.i("OK", new c(3));
                                    bVar6.g();
                                    break;
                            }
                        }
                    });
                    bVar4.h("Tidak", new c(0));
                    bVar4.g();
                }
                break;
            case 6:
                f fVar6 = this.f1488t;
                p210v8.i.f(fVar6, "this$0");
                File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Nekopoi" + File.separatorChar + "nekopoi.db");
                File file5 = new File(fVar6.X().getDatabasePath("nekopoi_localdb").getAbsolutePath());
                if (!fVar6.W().isFinishing()) {
                    p041e3.b bVar5 = new p041e3.b(fVar6.X());
                    C0650g c0650g5 = (C0650g) bVar5.f123t;
                    c0650g5.f12042d = "Restore bookmark";
                    c0650g5.f12044f = file4.exists() ? "Database dimasukkan, tekan Restore untuk mengembalikan" : "Silahkan masukkan database ke " + file4.getAbsolutePath();
                    if (file4.exists()) {
                        bVar5.i("Restore", new d(fVar6, file4, file5, 0));
                        bVar5.h("Batal", null);
                    } else {
                        bVar5.h("Batal", null);
                    }
                    bVar5.g();
                }
                break;
        }
    }
}
