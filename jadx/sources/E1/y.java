package E1;

import H1.C0235d;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class y implements s, M1.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Resources f1343t;

    public /* synthetic */ y(Resources resources, int i10) {
        this.f1342s = i10;
        this.f1343t = resources;
    }

    @Override // E1.s
    public r D(x xVar) {
        switch (this.f1342s) {
            case 0:
                return new C0180b(this.f1343t, xVar.b(Uri.class, AssetFileDescriptor.class));
            default:
                return new C0180b(this.f1343t, xVar.b(Uri.class, InputStream.class));
        }
    }

    @Override // M1.a
    public A1.F a(A1.F f10, p232y1.h hVar) {
        if (f10 == null) {
            return null;
        }
        return new C0235d(this.f1343t, f10);
    }
}
