package F1;

import E1.C0185g;
import E1.o;
import E1.p;
import E1.q;
import E1.r;
import com.bumptech.glide.load.data.k;
import java.util.ArrayDeque;
import p232y1.g;
import p232y1.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f1469b = g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final A1.r a;

    public a(A1.r rVar) {
        this.a = rVar;
    }

    @Override // E1.r
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // E1.r
    public final q b(Object obj, int i10, int i11, h hVar) {
        C0185g c0185g = (C0185g) obj;
        A1.r rVar = this.a;
        if (rVar != null) {
            p pVarA = p.a(c0185g);
            o oVar = (o) rVar.f167t;
            Object objA = oVar.a(pVarA);
            ArrayDeque arrayDeque = p.f1324b;
            synchronized (arrayDeque) {
                arrayDeque.offer(pVarA);
            }
            C0185g c0185g2 = (C0185g) objA;
            if (c0185g2 == null) {
                oVar.d(p.a(c0185g), c0185g);
            } else {
                c0185g = c0185g2;
            }
        }
        return new q(c0185g, new k(c0185g, ((Integer) hVar.c(f1469b)).intValue()));
    }
}
