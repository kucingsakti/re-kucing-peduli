package Q6;

import A1.C0099h;
import B4.K;
import S6.c;
import S6.e;
import S6.f;
import S6.h;
import T6.d;
import T6.g;
import T6.i;
import T6.k;
import T6.l;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0099h f4326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T6.a f4327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public W6.a f4328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f4329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4330f;

    public final void a() {
        W6.a aVar = this.f4328d;
        int iOrdinal = aVar.a().ordinal();
        b bVar = this.a;
        boolean z6 = false;
        switch (iOrdinal) {
            case 0:
                this.f4326b.p(null);
                break;
            case 1:
                int i10 = aVar.j;
                int i11 = aVar.f5334i;
                long j = aVar.f5338n;
                if (((T6.b) bVar.a) == null) {
                    bVar.a = new T6.b((C0099h) bVar.j);
                }
                T6.b bVar2 = (T6.b) bVar.a;
                if (bVar2.f4664c != null && (bVar2.f4666e != i11 || bVar2.f4667f != i10)) {
                    bVar2.f4666e = i11;
                    bVar2.f4667f = i10;
                    ((ValueAnimator) bVar2.f4664c).setValues(bVar2.e(false), bVar2.e(true));
                }
                bVar2.b(j);
                if (this.f4330f) {
                    bVar2.f(this.f4329e);
                } else {
                    bVar2.c();
                }
                this.f4327c = bVar2;
                break;
            case 2:
                int i12 = aVar.j;
                int i13 = aVar.f5334i;
                int i14 = aVar.a;
                float f10 = aVar.f5333h;
                long j10 = aVar.f5338n;
                if (((g) bVar.f4331b) == null) {
                    bVar.f4331b = new g((C0099h) bVar.j);
                }
                g gVar = (g) bVar.f4331b;
                gVar.h(i13, i12, i14, f10);
                gVar.b(j10);
                if (this.f4330f) {
                    gVar.f(this.f4329e);
                } else {
                    gVar.c();
                }
                this.f4327c = gVar;
                break;
            case 3:
                boolean z10 = aVar.f5335k;
                int i15 = z10 ? aVar.f5340p : aVar.f5342r;
                int i16 = z10 ? aVar.f5341q : aVar.f5340p;
                int iQ = C3.b.q(aVar, i15);
                int iQ2 = C3.b.q(aVar, i16);
                boolean z11 = i16 > i15;
                int i17 = aVar.a;
                long j11 = aVar.f5338n;
                if (((l) bVar.f4332c) == null) {
                    bVar.f4332c = new l((C0099h) bVar.j);
                }
                l lVar = (l) bVar.f4332c;
                if (lVar.f4697d != iQ || lVar.f4698e != iQ2 || lVar.f4699f != i17 || lVar.f4700g != z11) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                    lVar.f4664c = animatorSet;
                    lVar.f4697d = iQ;
                    lVar.f4698e = iQ2;
                    lVar.f4699f = i17;
                    lVar.f4700g = z11;
                    int i18 = iQ - i17;
                    int i19 = iQ + i17;
                    h hVar = lVar.f4701h;
                    hVar.a = i18;
                    hVar.f4541b = i19;
                    k kVarD = lVar.d(z11);
                    long j12 = lVar.a / 2;
                    ((AnimatorSet) lVar.f4664c).playSequentially(lVar.e(kVarD.a, kVarD.f4694b, j12, false, hVar), lVar.e(kVarD.f4695c, kVarD.f4696d, j12, true, hVar));
                }
                lVar.b(j11);
                if (this.f4330f) {
                    lVar.f(this.f4329e);
                } else {
                    lVar.c();
                }
                this.f4327c = lVar;
                break;
            case 4:
                boolean z12 = aVar.f5335k;
                int i20 = z12 ? aVar.f5340p : aVar.f5342r;
                int i21 = z12 ? aVar.f5341q : aVar.f5340p;
                int iQ3 = C3.b.q(aVar, i20);
                int iQ4 = C3.b.q(aVar, i21);
                long j13 = aVar.f5338n;
                if (((T6.b) bVar.f4333d) == null) {
                    T6.b bVar3 = new T6.b((C0099h) bVar.j, 1);
                    bVar3.f4666e = -1;
                    bVar3.f4667f = -1;
                    bVar3.f4668g = new e();
                    bVar.f4333d = bVar3;
                }
                T6.b bVar4 = (T6.b) bVar.f4333d;
                if (bVar4.f4664c != null && (bVar4.f4666e != iQ3 || bVar4.f4667f != iQ4)) {
                    bVar4.f4666e = iQ3;
                    bVar4.f4667f = iQ4;
                    PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", iQ3, iQ4);
                    propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
                    ((ValueAnimator) bVar4.f4664c).setValues(propertyValuesHolderOfInt);
                }
                bVar4.b(j13);
                if (this.f4330f) {
                    float f11 = this.f4329e;
                    Animator animator = bVar4.f4664c;
                    if (animator != null) {
                        long j14 = (long) (f11 * bVar4.a);
                        if (((ValueAnimator) animator).getValues() != null && ((ValueAnimator) bVar4.f4664c).getValues().length > 0) {
                            ((ValueAnimator) bVar4.f4664c).setCurrentPlayTime(j14);
                        }
                    }
                } else {
                    bVar4.c();
                }
                this.f4327c = bVar4;
                break;
            case 5:
                int i22 = aVar.j;
                int i23 = aVar.f5334i;
                int i24 = aVar.a;
                int i25 = aVar.f5332g;
                long j15 = aVar.f5338n;
                if (((T6.e) bVar.f4334e) == null) {
                    T6.e eVar = new T6.e((C0099h) bVar.j);
                    eVar.f4676h = new c();
                    bVar.f4334e = eVar;
                }
                T6.e eVar2 = (T6.e) bVar.f4334e;
                if (eVar2.f4664c != null && (eVar2.f4666e != i23 || eVar2.f4667f != i22 || eVar2.f4677i != i24 || eVar2.j != i25)) {
                    eVar2.f4666e = i23;
                    eVar2.f4667f = i22;
                    eVar2.f4677i = i24;
                    eVar2.j = i25;
                    ((ValueAnimator) eVar2.f4664c).setValues(eVar2.e(false), eVar2.e(true), eVar2.g(false), eVar2.g(true), eVar2.h(false), eVar2.h(true));
                }
                eVar2.b(j15);
                if (this.f4330f) {
                    eVar2.f(this.f4329e);
                } else {
                    eVar2.c();
                }
                this.f4327c = eVar2;
                break;
            case 6:
                boolean z13 = aVar.f5335k;
                int i26 = z13 ? aVar.f5340p : aVar.f5342r;
                int i27 = z13 ? aVar.f5341q : aVar.f5340p;
                int iQ5 = C3.b.q(aVar, i26);
                int iQ6 = C3.b.q(aVar, i27);
                boolean z14 = i27 > i26;
                int i28 = aVar.a;
                long j16 = aVar.f5338n;
                if (((i) bVar.f4335f) == null) {
                    i iVar = new i((C0099h) bVar.j);
                    iVar.f4691i = new S6.g();
                    bVar.f4335f = iVar;
                }
                i iVar2 = (i) bVar.f4335f;
                if (iVar2.f4697d != iQ5 || iVar2.f4698e != iQ6 || iVar2.f4699f != i28 || iVar2.f4700g != z14) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                    iVar2.f4664c = animatorSet2;
                    iVar2.f4697d = iQ5;
                    iVar2.f4698e = iQ6;
                    iVar2.f4699f = i28;
                    iVar2.f4700g = z14;
                    int i29 = i28 * 2;
                    S6.g gVar2 = iVar2.f4691i;
                    gVar2.a = iQ5 - i28;
                    gVar2.f4541b = iQ5 + i28;
                    gVar2.f4540c = i29;
                    k kVarD2 = iVar2.d(z14);
                    double d3 = iVar2.a;
                    long j17 = (long) (d3 * 0.8d);
                    long j18 = (long) (d3 * 0.2d);
                    long j19 = (long) (d3 * 0.5d);
                    ValueAnimator valueAnimatorE = iVar2.e(kVarD2.a, kVarD2.f4694b, j17, false, iVar2.f4691i);
                    ValueAnimator valueAnimatorE2 = iVar2.e(kVarD2.f4695c, kVarD2.f4696d, j17, true, iVar2.f4691i);
                    valueAnimatorE2.setStartDelay(j18);
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i29, i28);
                    valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimatorOfInt.setDuration(j19);
                    valueAnimatorOfInt.addUpdateListener(new K(iVar2, 8));
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i28, i29);
                    valueAnimatorOfInt2.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimatorOfInt2.setDuration(j19);
                    valueAnimatorOfInt2.addUpdateListener(new K(iVar2, 8));
                    valueAnimatorOfInt2.setStartDelay(j19);
                    ((AnimatorSet) iVar2.f4664c).playTogether(valueAnimatorE, valueAnimatorE2, valueAnimatorOfInt, valueAnimatorOfInt2);
                }
                iVar2.b(j16);
                if (this.f4330f) {
                    iVar2.g(this.f4329e);
                } else {
                    iVar2.c();
                }
                this.f4327c = iVar2;
                break;
            case 7:
                boolean z15 = aVar.f5335k;
                int i30 = z15 ? aVar.f5340p : aVar.f5342r;
                int i31 = z15 ? aVar.f5341q : aVar.f5340p;
                int iQ7 = C3.b.q(aVar, i30);
                int iQ8 = C3.b.q(aVar, i31);
                int i32 = aVar.f5329d;
                int i33 = aVar.f5328c;
                if (aVar.b() != W6.b.f5347s) {
                    i32 = i33;
                }
                int i34 = aVar.a;
                int i35 = (3 * i34) + i32;
                int i36 = i32 + i34;
                long j20 = aVar.f5338n;
                if (((d) bVar.f4336g) == null) {
                    d dVar = new d((C0099h) bVar.j);
                    dVar.f4675i = new S6.b();
                    bVar.f4336g = dVar;
                }
                d dVar2 = (d) bVar.f4336g;
                dVar2.b(j20);
                if (dVar2.f4670d != iQ7 || dVar2.f4671e != iQ8 || dVar2.f4672f != i35 || dVar2.f4673g != i36 || dVar2.f4674h != i34) {
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.setInterpolator(new AccelerateDecelerateInterpolator());
                    dVar2.f4664c = animatorSet3;
                    dVar2.f4670d = iQ7;
                    dVar2.f4671e = iQ8;
                    dVar2.f4672f = i35;
                    dVar2.f4673g = i36;
                    dVar2.f4674h = i34;
                    int i37 = (int) (((double) i34) / 1.5d);
                    long j21 = dVar2.a;
                    long j22 = j21 / 2;
                    ((AnimatorSet) dVar2.f4664c).play(dVar2.d(i35, i36, j22, 2)).with(dVar2.d(i34, i37, j22, 3)).with(dVar2.d(iQ7, iQ8, j21, 1)).before(dVar2.d(i36, i35, j22, 2)).before(dVar2.d(i37, i34, j22, 3));
                }
                if (this.f4330f) {
                    float f12 = this.f4329e;
                    Animator animator2 = dVar2.f4664c;
                    if (animator2 != null) {
                        long j23 = (long) (f12 * dVar2.a);
                        Iterator<Animator> it = ((AnimatorSet) animator2).getChildAnimations().iterator();
                        while (it.hasNext()) {
                            ValueAnimator valueAnimator = (ValueAnimator) it.next();
                            long duration = valueAnimator.getDuration();
                            long j24 = z6 ? j23 - duration : j23;
                            if (j24 >= 0) {
                                if (j24 >= duration) {
                                    j24 = duration;
                                }
                                if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                                    valueAnimator.setCurrentPlayTime(j24);
                                }
                                if (!z6 && duration >= dVar2.a) {
                                    z6 = true;
                                }
                            }
                        }
                    }
                } else {
                    dVar2.c();
                }
                this.f4327c = dVar2;
                break;
            case 8:
                boolean z16 = aVar.f5335k;
                int i38 = z16 ? aVar.f5340p : aVar.f5342r;
                int i39 = z16 ? aVar.f5341q : aVar.f5340p;
                int iQ9 = C3.b.q(aVar, i38);
                int iQ10 = C3.b.q(aVar, i39);
                long j25 = aVar.f5338n;
                if (((T6.b) bVar.f4337h) == null) {
                    T6.b bVar5 = new T6.b((C0099h) bVar.j, 2);
                    bVar5.f4666e = -1;
                    bVar5.f4667f = -1;
                    bVar5.f4668g = new f();
                    bVar.f4337h = bVar5;
                }
                T6.b bVar6 = (T6.b) bVar.f4337h;
                if (bVar6.f4664c != null && (bVar6.f4666e != iQ9 || bVar6.f4667f != iQ10)) {
                    bVar6.f4666e = iQ9;
                    bVar6.f4667f = iQ10;
                    PropertyValuesHolder propertyValuesHolderOfInt2 = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", iQ9, iQ10);
                    propertyValuesHolderOfInt2.setEvaluator(new IntEvaluator());
                    PropertyValuesHolder propertyValuesHolderOfInt3 = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE_REVERSE", iQ10, iQ9);
                    propertyValuesHolderOfInt3.setEvaluator(new IntEvaluator());
                    ((ValueAnimator) bVar6.f4664c).setValues(propertyValuesHolderOfInt2, propertyValuesHolderOfInt3);
                }
                bVar6.b(j25);
                if (this.f4330f) {
                    float f13 = this.f4329e;
                    Animator animator3 = bVar6.f4664c;
                    if (animator3 != null) {
                        long j26 = (long) (f13 * bVar6.a);
                        if (((ValueAnimator) animator3).getValues() != null && ((ValueAnimator) bVar6.f4664c).getValues().length > 0) {
                            ((ValueAnimator) bVar6.f4664c).setCurrentPlayTime(j26);
                        }
                    }
                } else {
                    bVar6.c();
                }
                this.f4327c = bVar6;
                break;
            case 9:
                int i40 = aVar.j;
                int i41 = aVar.f5334i;
                int i42 = aVar.a;
                float f14 = aVar.f5333h;
                long j27 = aVar.f5338n;
                if (((T6.h) bVar.f4338i) == null) {
                    bVar.f4338i = new T6.h((C0099h) bVar.j);
                }
                T6.h hVar2 = (T6.h) bVar.f4338i;
                hVar2.h(i41, i40, i42, f14);
                hVar2.b(j27);
                if (this.f4330f) {
                    hVar2.f(this.f4329e);
                } else {
                    hVar2.c();
                }
                this.f4327c = hVar2;
                break;
        }
    }
}
