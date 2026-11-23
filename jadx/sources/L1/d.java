package L1;

import A1.F;
import H1.C0235d;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import p232y1.l;

/* JADX INFO: loaded from: classes.dex */
public final class d implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2750b;

    public d(l lVar) {
        U1.f.c(lVar, "Argument must not be null");
        this.f2750b = lVar;
    }

    @Override // p232y1.l
    public final F a(Context context, F f10, int i10, int i11) {
        c cVar = (c) f10.get();
        F c0235d = new C0235d(com.bumptech.glide.b.b(context).f7587s, ((g) cVar.f2742s.f2739b).f2767l);
        l lVar = this.f2750b;
        F fA = lVar.a(context, c0235d, i10, i11);
        if (!c0235d.equals(fA)) {
            c0235d.c();
        }
        ((g) cVar.f2742s.f2739b).c(lVar, (Bitmap) fA.get());
        return f10;
    }

    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        this.f2750b.b(messageDigest);
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f2750b.equals(((d) obj).f2750b);
        }
        return false;
    }

    @Override // p232y1.e
    public final int hashCode() {
        return this.f2750b.hashCode();
    }
}
