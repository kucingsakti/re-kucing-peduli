package F1;

import E1.q;
import E1.r;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.e;
import java.io.File;
import java.io.FileNotFoundException;
import p232y1.h;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String[] f1470C = {"_data"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile boolean f1471A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile e f1472B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f1473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f1474t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r f1475u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Uri f1476v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1478x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h f1479y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Class f1480z;

    public c(Context context, r rVar, r rVar2, Uri uri, int i10, int i11, h hVar, Class cls) {
        this.f1473s = context.getApplicationContext();
        this.f1474t = rVar;
        this.f1475u = rVar2;
        this.f1476v = uri;
        this.f1477w = i10;
        this.f1478x = i11;
        this.f1479y = hVar;
        this.f1480z = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f1480z;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        e eVar = this.f1472B;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f1471A = true;
        e eVar = this.f1472B;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(g gVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        try {
            e eVarE = e();
            if (eVarE == null) {
                dVar.f(new IllegalArgumentException("Failed to build fetcher for: " + this.f1476v));
            } else {
                this.f1472B = eVarE;
                if (this.f1471A) {
                    cancel();
                } else {
                    eVarE.d(gVar, dVar);
                }
            }
        } catch (FileNotFoundException e10) {
            dVar.f(e10);
        }
    }

    public final e e() throws Throwable {
        q qVarB;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        h hVar = this.f1479y;
        int i10 = this.f1478x;
        int i11 = this.f1477w;
        Context context = this.f1473s;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f1476v;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f1470C, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            qVarB = this.f1474t.b(file, i11, i10, hVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
            Uri requireOriginal = this.f1476v;
            if (iCheckSelfPermission == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            qVarB = this.f1475u.b(requireOriginal, i11, i10, hVar);
        }
        if (qVarB != null) {
            return qVarB.f1326c;
        }
        return null;
    }
}
