package B1;

import A9.AbstractC0151y;
import B4.C0159g;
import E1.B;
import E1.C0181c;
import E1.r;
import E1.s;
import E1.x;
import M2.C0313w;
import M2.M;
import U1.n;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zznp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p156q0.U;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements s, M, M8.a, p029c9.l, p201u9.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f577s;

    public a(int i10) {
        switch (i10) {
            case 5:
                this.f577s = new ArrayList();
                break;
            case 6:
            default:
                char[] cArr = n.a;
                this.f577s = new ArrayDeque(20);
                break;
            case 7:
                this.f577s = new LinkedHashMap();
                break;
        }
    }

    public static /* synthetic */ void N0(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public static /* synthetic */ void O0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // E1.s
    public r D(x xVar) {
        return new C0181c((B) this.f577s, 2);
    }

    @Override // p029c9.l
    public p029c9.k D0(p096j9.b bVar) {
        return null;
    }

    @Override // p029c9.l
    public void G0(Object obj) {
        if (obj instanceof String) {
            ((ArrayList) this.f577s).add((String) obj);
        }
    }

    public abstract void P0(C0159g c0159g);

    public boolean Q0() {
        int i10;
        U u3 = (U) this.f577s;
        View view = u3.f14285c.c0;
        if (view != null) {
            i10 = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i10 = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(AbstractC0487g.g(visibility, "Unknown visibility "));
                    }
                    i10 = 3;
                }
            }
        } else {
            i10 = 0;
        }
        int i11 = u3.a;
        if (i10 != i11) {
            return (i10 == 2 || i11 == 2) ? false : true;
        }
        return true;
    }

    public void R0(j jVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f577s;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(jVar);
        }
    }

    public abstract a S0(WebView webView);

    public abstract void T0(String[] strArr);

    public C0313w U0() {
        C0313w c0313w = ((zzhj) this.f577s).f9147z;
        zzhj.e(c0313w);
        return c0313w;
    }

    public zznp V0() {
        zznp zznpVar = ((zzhj) this.f577s).f9118D;
        zzhj.e(zznpVar);
        return zznpVar;
    }

    public void W0() {
        zzhc zzhcVar = ((zzhj) this.f577s).f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
    }

    @Override // M2.M
    public Clock a() {
        return ((zzhj) this.f577s).f9120F;
    }

    @Override // M2.M
    public Context b() {
        return ((zzhj) this.f577s).f9140s;
    }

    @Override // M2.M
    public zzab d() {
        return ((zzhj) this.f577s).f9145x;
    }

    @Override // p201u9.d
    public AbstractC0151y getType() {
        AbstractC0151y abstractC0151y = (AbstractC0151y) this.f577s;
        if (abstractC0151y != null) {
            return abstractC0151y;
        }
        O0(1);
        throw null;
    }

    @Override // M2.M
    public zzfw i() {
        zzfw zzfwVar = ((zzhj) this.f577s).f9115A;
        zzhj.g(zzfwVar);
        return zzfwVar;
    }

    @Override // M2.M
    public zzhc l() {
        zzhc zzhcVar = ((zzhj) this.f577s).f9116B;
        zzhj.g(zzhcVar);
        return zzhcVar;
    }

    @Override // p029c9.l
    public void o() {
        T0((String[]) ((ArrayList) this.f577s).toArray(new String[0]));
    }

    @Override // M8.a
    public M8.h q() {
        M8.h hVar = (M8.h) this.f577s;
        if (hVar != null) {
            return hVar;
        }
        N0(1);
        throw null;
    }

    public a(zzhj zzhjVar) {
        Preconditions.i(zzhjVar);
        this.f577s = zzhjVar;
    }

    public a(M8.h hVar) {
        if (hVar != null) {
            this.f577s = hVar;
        } else {
            N0(0);
            throw null;
        }
    }

    public a(AbstractC0151y abstractC0151y) {
        if (abstractC0151y != null) {
            this.f577s = abstractC0151y;
        } else {
            O0(0);
            throw null;
        }
    }

    public a(B b3) {
        this.f577s = b3;
    }

    public a(U u3) {
        p210v8.i.f(u3, "operation");
        this.f577s = u3;
    }

    @Override // p029c9.l
    public void K0(p145o9.f fVar) {
    }

    @Override // p029c9.l
    public void l0(p096j9.b bVar, p096j9.f fVar) {
    }
}
