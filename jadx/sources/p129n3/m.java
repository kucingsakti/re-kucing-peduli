package p129n3;

import B4.L;
import B6.b;
import V0.C0447b;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import p178s0.a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0447b f13370A = new C0447b(Float.class, "animationFraction", 8);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObjectAnimator f13371u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f13372v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p f13373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13375y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f13376z;

    public m(p pVar) {
        super(3);
        this.f13374x = 1;
        this.f13373w = pVar;
        this.f13372v = new a(1);
    }

    @Override // B6.b
    public final void c() {
        ObjectAnimator objectAnimator = this.f13371u;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // B6.b
    public final void m() {
        v();
    }

    @Override // B6.b
    public final void t() {
        if (this.f13371u == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f13370A, 0.0f, 1.0f);
            this.f13371u = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f13371u.setInterpolator(null);
            this.f13371u.setRepeatCount(-1);
            this.f13371u.addListener(new L(this, 9));
        }
        v();
        this.f13371u.start();
    }

    public final void v() {
        this.f13375y = true;
        this.f13374x = 1;
        for (i iVar : (ArrayList) this.f726t) {
            p pVar = this.f13373w;
            iVar.f13361c = pVar.f13390c[0];
            iVar.f13362d = pVar.f13394g / 2;
        }
    }

    @Override // B6.b
    public final void r() {
    }

    @Override // B6.b
    public final void u() {
    }

    @Override // B6.b
    public final void o(c cVar) {
    }
}
