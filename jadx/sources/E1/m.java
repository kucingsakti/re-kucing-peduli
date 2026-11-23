package E1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f1319v = {"_data"};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f1321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f1322u;

    public /* synthetic */ m(Object obj, int i10, Object obj2) {
        this.f1320s = i10;
        this.f1321t = obj;
        this.f1322u = obj2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f1320s) {
            case 0:
                return File.class;
            default:
                return ((B) this.f1322u).c();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        int i10 = this.f1320s;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f1320s) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f1320s;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        Object objWrap;
        switch (this.f1320s) {
            case 0:
                Cursor cursorQuery = ((Context) this.f1321t).getContentResolver().query((Uri) this.f1322u, f1319v, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    dVar.g(new File(string));
                    return;
                }
                dVar.f(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f1322u)));
                return;
            default:
                B b3 = (B) this.f1322u;
                byte[] bArr = (byte[]) this.f1321t;
                switch (b3.f1292s) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                dVar.g(objWrap);
                return;
        }
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
