package p068ga;

import C8.InterfaceC0174b;
import C8.InterfaceC0178f;
import C8.u;
import F8.AbstractC0224s;
import F8.y0;
import G8.e;
import J9.g;
import K.o;
import P0.d;
import Q8.b;
import V.h;
import X9.F;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import ma.f;
import ma.i;
import p.I0;
import p040e1.j;
import p078i.AbstractActivityC0655l;
import t9.a;
import t9.m;
import t9.n;
import y0.C0864b;
import y0.x;
import y0.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static volatile boolean a = true;

    public static void a(long j, f fVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        i iVar;
        int i13;
        int i14;
        int i15;
        long j10;
        int i16;
        ArrayList arrayList3;
        int i17 = i10;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        int i18 = 0;
        int i19 = 1;
        if (!(i11 < i12)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < i12) {
            int i20 = i11;
            while (true) {
                int i21 = i20 + 1;
                if (((i) arrayList4.get(i20)).h() < i17) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (i21 >= i12) {
                    break;
                } else {
                    i20 = i21;
                }
            }
        }
        i iVar2 = (i) arrayList.get(i11);
        i iVar3 = (i) arrayList4.get(i12 - 1);
        if (i17 == iVar2.h()) {
            int iIntValue = ((Number) arrayList5.get(i11)).intValue();
            int i22 = i11 + 1;
            iVar = (i) arrayList4.get(i22);
            i13 = i22;
            i14 = iIntValue;
        } else {
            iVar = iVar2;
            i13 = i11;
            i14 = -1;
        }
        if (iVar.k(i17) == iVar3.k(i17)) {
            int iMin = Math.min(iVar.h(), iVar3.h());
            if (i17 < iMin) {
                int i23 = i17;
                while (true) {
                    int i24 = i23 + 1;
                    if (iVar.k(i23) != iVar3.k(i23)) {
                        break;
                    }
                    i18++;
                    if (i24 >= iMin) {
                        break;
                    } else {
                        i23 = i24;
                    }
                }
            }
            long j11 = 4;
            long j12 = (fVar.f13190t / j11) + j + ((long) 2) + ((long) i18) + 1;
            fVar.g0(-i18);
            fVar.g0(i14);
            int i25 = i17 + i18;
            if (i17 < i25) {
                while (true) {
                    int i26 = i17 + 1;
                    fVar.g0(iVar.k(i17) & 255);
                    if (i26 >= i25) {
                        break;
                    } else {
                        i17 = i26;
                    }
                }
            }
            if (i13 + 1 == i12) {
                if (i25 != ((i) arrayList4.get(i13)).h()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.g0(((Number) arrayList5.get(i13)).intValue());
                return;
            } else {
                f fVar2 = new f();
                fVar.g0(((int) ((fVar2.f13190t / j11) + j12)) * (-1));
                a(j12, fVar2, i25, arrayList4, i13, i12, arrayList5);
                fVar.c0(fVar2);
                return;
            }
        }
        int i27 = i13 + 1;
        if (i27 < i12) {
            while (true) {
                int i28 = i27 + 1;
                if (((i) arrayList4.get(i27 - 1)).k(i17) != ((i) arrayList4.get(i27)).k(i17)) {
                    i19++;
                }
                if (i28 >= i12) {
                    break;
                } else {
                    i27 = i28;
                }
            }
        }
        long j13 = 4;
        long j14 = (fVar.f13190t / j13) + j + ((long) 2) + ((long) (i19 * 2));
        fVar.g0(i19);
        fVar.g0(i14);
        if (i13 < i12) {
            int i29 = i13;
            while (true) {
                int i30 = i29 + 1;
                int iK = ((i) arrayList4.get(i29)).k(i17);
                if (i29 == i13 || iK != ((i) arrayList4.get(i29 - 1)).k(i17)) {
                    fVar.g0(iK & 255);
                }
                if (i30 >= i12) {
                    break;
                } else {
                    i29 = i30;
                }
            }
        }
        f fVar3 = new f();
        int i31 = i13;
        while (i31 < i12) {
            byte bK = ((i) arrayList4.get(i31)).k(i17);
            int i32 = i31 + 1;
            if (i32 >= i12) {
                i15 = i12;
                break;
            }
            i15 = i32;
            while (true) {
                int i33 = i15 + 1;
                if (bK != ((i) arrayList4.get(i15)).k(i17)) {
                    break;
                }
                if (i33 >= i12) {
                    i15 = i12;
                    break;
                }
                i15 = i33;
            }
            if (i32 == i15 && i17 + 1 == ((i) arrayList4.get(i31)).h()) {
                fVar.g0(((Number) arrayList5.get(i31)).intValue());
                arrayList3 = arrayList5;
                i16 = i15;
                j10 = j14;
            } else {
                fVar.g0(((int) ((fVar3.f13190t / j13) + j14)) * (-1));
                ArrayList arrayList6 = arrayList5;
                j10 = j14;
                i16 = i15;
                a(j10, fVar3, i17 + 1, arrayList, i31, i16, arrayList6);
                arrayList4 = arrayList;
                arrayList3 = arrayList6;
            }
            j14 = j10;
            i31 = i16;
            arrayList5 = arrayList3;
            fVar3 = fVar3;
        }
        fVar.c0(fVar3);
    }

    public static n b(String str, Iterable iterable) {
        m mVar;
        p210v8.i.f(str, "debugName");
        g gVar = new g();
        Iterator it = iterable.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mVar = m.f15259b;
            if (!zHasNext) {
                break;
            }
            n nVar = (n) it.next();
            if (nVar != mVar) {
                if (nVar instanceof a) {
                    n[] nVarArr = ((a) nVar).f15226c;
                    p210v8.i.f(nVarArr, "elements");
                    gVar.addAll(p086i8.i.l(nVarArr));
                } else {
                    gVar.add(nVar);
                }
            }
        }
        int i10 = gVar.f2470s;
        if (i10 != 0) {
            return i10 != 1 ? new a(str, (n[]) gVar.toArray(new n[0])) : (n) gVar.get(0);
        }
        return mVar;
    }

    public static final b d(j jVar, p096j9.b bVar, i9.f fVar) {
        p210v8.i.f(jVar, "<this>");
        p210v8.i.f(bVar, "classId");
        p210v8.i.f(fVar, "jvmMetadataVersion");
        h hVarI = jVar.I(bVar, fVar);
        if (hVarI != null) {
            return (b) hVarI.f5078t;
        }
        return null;
    }

    public static x e(z zVar) {
        p210v8.i.f(zVar, "<this>");
        return (x) K9.n.y(K9.n.x(zVar, C0864b.f15901B));
    }

    public static F f(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return F.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return F.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return F.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return F.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return F.SPDY_3;
        }
        if (str.equals("quic")) {
            return F.QUIC;
        }
        throw new IOException(p210v8.i.k(str, "Unexpected protocol: "));
    }

    public static Drawable g(Context context, int i10) {
        return I0.d().f(context, i10);
    }

    public static Drawable h(Context context, Context context2, int i10, Resources.Theme theme) {
        Context context3;
        try {
            if (a) {
                if (theme != null) {
                    p125n.b bVar = new p125n.b(context2);
                    bVar.f13229b = theme;
                    context3 = bVar;
                } else {
                    context3 = context2;
                }
                return g(context3, i10);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return J.a.b(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = o.a;
        return K.i.a(resources, i10, theme);
    }

    public static final int i(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i19 + i11;
            }
        }
        return i11;
    }

    public static final boolean k(InterfaceC0174b interfaceC0174b) {
        e eVarC;
        e eVarF;
        p210v8.i.f(interfaceC0174b, "<this>");
        if (interfaceC0174b instanceof C8.j) {
            u uVar = (u) interfaceC0174b;
            Field fieldF = oa.b.f(uVar);
            if (!(fieldF != null ? fieldF.isAccessible() : true)) {
                return false;
            }
            Method methodG = oa.b.g(uVar.e());
            if (!(methodG != null ? methodG.isAccessible() : true)) {
                return false;
            }
            Method methodG2 = oa.b.g(((C8.j) interfaceC0174b).h());
            if (!(methodG2 != null ? methodG2.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC0174b instanceof u) {
            u uVar2 = (u) interfaceC0174b;
            Field fieldF2 = oa.b.f(uVar2);
            if (!(fieldF2 != null ? fieldF2.isAccessible() : true)) {
                return false;
            }
            Method methodG3 = oa.b.g(uVar2.e());
            if (!(methodG3 != null ? methodG3.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC0174b instanceof C8.n) {
            Field fieldF3 = oa.b.f(((C8.n) interfaceC0174b).a());
            if (!(fieldF3 != null ? fieldF3.isAccessible() : true)) {
                return false;
            }
            Method methodG4 = oa.b.g((InterfaceC0178f) interfaceC0174b);
            if (!(methodG4 != null ? methodG4.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC0174b instanceof C8.g) {
            Field fieldF4 = oa.b.f(((C8.g) interfaceC0174b).a());
            if (!(fieldF4 != null ? fieldF4.isAccessible() : true)) {
                return false;
            }
            Method methodG5 = oa.b.g((InterfaceC0178f) interfaceC0174b);
            if (!(methodG5 != null ? methodG5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(interfaceC0174b instanceof InterfaceC0178f)) {
                throw new UnsupportedOperationException("Unknown callable: " + interfaceC0174b + " (" + interfaceC0174b.getClass() + ')');
            }
            InterfaceC0178f interfaceC0178f = (InterfaceC0178f) interfaceC0174b;
            Method methodG6 = oa.b.g(interfaceC0178f);
            if (!(methodG6 != null ? methodG6.isAccessible() : true)) {
                return false;
            }
            AbstractC0224s abstractC0224sA = y0.a(interfaceC0174b);
            Object objY = (abstractC0224sA == null || (eVarF = abstractC0224sA.f()) == null) ? null : eVarF.y();
            AccessibleObject accessibleObject = objY instanceof AccessibleObject ? (AccessibleObject) objY : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            AbstractC0224s abstractC0224sA2 = y0.a(interfaceC0178f);
            Member memberY = (abstractC0224sA2 == null || (eVarC = abstractC0224sA2.c()) == null) ? null : eVarC.y();
            Constructor constructor = memberY instanceof Constructor ? (Constructor) memberY : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static void m(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static void n(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public abstract Intent c(AbstractActivityC0655l abstractActivityC0655l, Object obj);

    public d j(AbstractActivityC0655l abstractActivityC0655l, Object obj) {
        return null;
    }

    public abstract Object l(int i10, Intent intent);
}
