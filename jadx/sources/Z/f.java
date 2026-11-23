package Z;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InputContentInfo f5827s;

    public f(Object obj) {
        this.f5827s = (InputContentInfo) obj;
    }

    @Override // Z.g
    public final Object a() {
        return this.f5827s;
    }

    @Override // Z.g
    public final Uri b() {
        return this.f5827s.getContentUri();
    }

    @Override // Z.g
    public final void d() {
        this.f5827s.requestPermission();
    }

    @Override // Z.g
    public final Uri f() {
        return this.f5827s.getLinkUri();
    }

    @Override // Z.g
    public final ClipDescription getDescription() {
        return this.f5827s.getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f5827s = new InputContentInfo(uri, clipDescription, uri2);
    }
}
