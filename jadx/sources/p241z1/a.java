package p241z1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f16298c = {"_data"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f16299d = {"_data"};
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f16300b;

    public /* synthetic */ a(ContentResolver contentResolver, int i10) {
        this.a = i10;
        this.f16300b = contentResolver;
    }

    @Override // p241z1.b
    public final Cursor a(Uri uri) {
        switch (this.a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f16300b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f16298c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f16300b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f16299d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
