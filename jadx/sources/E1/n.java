package E1;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.core.device.MimeTypes;

/* JADX INFO: loaded from: classes.dex */
public final class n implements r {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1323b;

    public n(Context context, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.f1323b = context.getApplicationContext();
                break;
            case 2:
                this.f1323b = context.getApplicationContext();
                break;
            default:
                this.f1323b = context;
                break;
        }
    }

    @Override // E1.r
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return C3.a.i((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return C3.a.i(uri) && !uri.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO);
            default:
                Uri uri2 = (Uri) obj;
                return C3.a.i(uri2) && uri2.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO);
        }
    }

    @Override // E1.r
    public final q b(Object obj, int i10, int i11, p232y1.h hVar) {
        Long l4;
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return new q(new T1.b(uri), new m(this.f1323b, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
                    return null;
                }
                T1.b bVar = new T1.b(uri2);
                Context context = this.f1323b;
                return new q(bVar, C0183e.e(context, uri2, new p241z1.a(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384 || (l4 = (Long) hVar.c(H1.E.f1853d)) == null || l4.longValue() != -1) {
                    return null;
                }
                T1.b bVar2 = new T1.b(uri3);
                Context context2 = this.f1323b;
                return new q(bVar2, C0183e.e(context2, uri3, new p241z1.a(context2.getContentResolver(), 1)));
        }
    }
}
