package E1;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class z implements s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Resources f1345t;

    public /* synthetic */ z(Resources resources, int i10) {
        this.f1344s = i10;
        this.f1345t = resources;
    }

    @Override // E1.s
    public final r D(x xVar) {
        switch (this.f1344s) {
            case 0:
                return new C0180b(this.f1345t, xVar.b(Uri.class, ParcelFileDescriptor.class));
            default:
                return new C0180b(this.f1345t, C.f1293b);
        }
    }
}
