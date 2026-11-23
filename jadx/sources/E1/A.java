package E1;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class A implements r {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f1290b;

    public /* synthetic */ A(r rVar, int i10) {
        this.a = i10;
        this.f1290b = rVar;
    }

    @Override // E1.r
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // E1.r
    public final q b(Object obj, int i10, int i11, p232y1.h hVar) {
        Uri uriFromFile;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                r rVar = this.f1290b;
                if (rVar.a(uriFromFile)) {
                    return rVar.b(uriFromFile, i10, i11, hVar);
                }
                return null;
            default:
                return this.f1290b.b(new C0185g((URL) obj), i10, i11, hVar);
        }
    }
}
