package H1;

import A1.F;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class r implements p232y1.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p232y1.l f1891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1892c;

    public r(p232y1.l lVar, boolean z6) {
        this.f1891b = lVar;
        this.f1892c = z6;
    }

    @Override // p232y1.l
    public final F a(Context context, F f10, int i10, int i11) {
        B1.b bVar = com.bumptech.glide.b.b(context).f7587s;
        Drawable drawable = (Drawable) f10.get();
        C0235d c0235dA = q.a(bVar, drawable, i10, i11);
        if (c0235dA != null) {
            F fA = this.f1891b.a(context, c0235dA, i10, i11);
            if (!fA.equals(c0235dA)) {
                return new C0235d(context.getResources(), fA);
            }
            fA.c();
            return f10;
        }
        if (!this.f1892c) {
            return f10;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        this.f1891b.b(messageDigest);
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f1891b.equals(((r) obj).f1891b);
        }
        return false;
    }

    @Override // p232y1.e
    public final int hashCode() {
        return this.f1891b.hashCode();
    }
}
