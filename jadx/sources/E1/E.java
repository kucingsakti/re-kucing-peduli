package E1;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class E implements s, F {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ContentResolver f1296s;

    public /* synthetic */ E(ContentResolver contentResolver) {
        this.f1296s = contentResolver;
    }

    @Override // E1.s
    public r D(x xVar) {
        return new G(this);
    }

    @Override // E1.F
    public com.bumptech.glide.load.data.e a(Uri uri) {
        return new com.bumptech.glide.load.data.a(this.f1296s, uri, 1);
    }
}
