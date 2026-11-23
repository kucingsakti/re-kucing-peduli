package F1;

import E1.q;
import E1.r;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import p232y1.h;

/* JADX INFO: loaded from: classes.dex */
public final class d implements r {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f1481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f1482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f1483d;

    public d(Context context, r rVar, r rVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.f1481b = rVar;
        this.f1482c = rVar2;
        this.f1483d = cls;
    }

    @Override // E1.r
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && C3.a.i((Uri) obj);
    }

    @Override // E1.r
    public final q b(Object obj, int i10, int i11, h hVar) {
        Uri uri = (Uri) obj;
        return new q(new T1.b(uri), new c(this.a, this.f1481b, this.f1482c, uri, i10, i11, hVar, this.f1483d));
    }
}
