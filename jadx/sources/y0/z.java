package y0;

import U.Z;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class z extends x implements Iterable, p219w8.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f16006F = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p212w.j f16007C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f16008D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f16009E;

    public z(A a) {
        super(a);
        this.f16007C = new p212w.j(0);
    }

    @Override // y0.x
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z) || !super.equals(obj)) {
            return false;
        }
        p212w.j jVar = this.f16007C;
        int iH = jVar.h();
        z zVar = (z) obj;
        p212w.j jVar2 = zVar.f16007C;
        if (iH != jVar2.h() || this.f16008D != zVar.f16008D) {
            return false;
        }
        for (x xVar : (K9.a) K9.n.s(new Z(jVar, 3))) {
            if (!xVar.equals(jVar2.d(xVar.f16002z))) {
                return false;
            }
        }
        return true;
    }

    @Override // y0.x
    public final int hashCode() {
        int iE = this.f16008D;
        p212w.j jVar = this.f16007C;
        int iH = jVar.h();
        for (int i10 = 0; i10 < iH; i10++) {
            iE = (((iE * 31) + jVar.e(i10)) * 31) + ((x) jVar.i(i10)).hashCode();
        }
        return iE;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y(this);
    }

    @Override // y0.x
    public final v k(wa.a aVar) {
        return q(aVar, false, this);
    }

    @Override // y0.x
    public final void m(Context context, AttributeSet attributeSet) {
        String strValueOf;
        super.m(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, p240z0.a.f16296d);
        p210v8.i.e(typedArrayObtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        if (resourceId == this.f16002z) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        this.f16008D = resourceId;
        this.f16009E = null;
        if (resourceId <= 16777215) {
            strValueOf = String.valueOf(resourceId);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(resourceId);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(resourceId);
            }
            p210v8.i.e(strValueOf, "try {\n                  …tring()\n                }");
        }
        this.f16009E = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    public final void n(x xVar) {
        p210v8.i.f(xVar, "node");
        int i10 = xVar.f16002z;
        String str = xVar.f15994A;
        if (i10 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.f15994A;
        if (str2 != null && p210v8.i.a(str, str2)) {
            throw new IllegalArgumentException(("Destination " + xVar + " cannot have the same route as graph " + this).toString());
        }
        if (i10 == this.f16002z) {
            throw new IllegalArgumentException(("Destination " + xVar + " cannot have the same id as graph " + this).toString());
        }
        p212w.j jVar = this.f16007C;
        x xVar2 = (x) jVar.d(i10);
        if (xVar2 == xVar) {
            return;
        }
        if (xVar.f15996t != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (xVar2 != null) {
            xVar2.f15996t = null;
        }
        xVar.f15996t = this;
        jVar.f(xVar.f16002z, xVar);
    }

    public final x o(int i10, x xVar, x xVar2, boolean z6) {
        p212w.j jVar = this.f16007C;
        x xVarO = (x) jVar.d(i10);
        if (xVar2 != null) {
            if (p210v8.i.a(xVarO, xVar2) && p210v8.i.a(xVarO.f15996t, xVar2.f15996t)) {
                return xVarO;
            }
            xVarO = null;
        } else if (xVarO != null) {
            return xVarO;
        }
        if (z6) {
            Iterator it = ((K9.a) K9.n.s(new Z(jVar, 3))).iterator();
            do {
                if (!it.hasNext()) {
                    xVarO = null;
                    break;
                }
                x xVar3 = (x) it.next();
                xVarO = (!(xVar3 instanceof z) || p210v8.i.a(xVar3, xVar)) ? null : ((z) xVar3).o(i10, this, xVar2, true);
            } while (xVarO == null);
        }
        if (xVarO != null) {
            return xVarO;
        }
        z zVar = this.f15996t;
        if (zVar == null || zVar.equals(xVar)) {
            return null;
        }
        z zVar2 = this.f15996t;
        p210v8.i.c(zVar2);
        return zVar2.o(i10, this, xVar2, z6);
    }

    public final v q(wa.a aVar, boolean z6, z zVar) {
        v vVarQ;
        v vVarK = super.k(aVar);
        ArrayList arrayList = new ArrayList();
        y yVar = new y(this);
        while (true) {
            vVarQ = null;
            if (!yVar.hasNext()) {
                break;
            }
            x xVar = (x) yVar.next();
            vVarQ = p210v8.i.a(xVar, zVar) ? null : xVar.k(aVar);
            if (vVarQ != null) {
                arrayList.add(vVarQ);
            }
        }
        v vVar = (v) p086i8.k.d0(arrayList);
        z zVar2 = this.f15996t;
        if (zVar2 != null && z6 && !zVar2.equals(zVar)) {
            vVarQ = zVar2.q(aVar, true, this);
        }
        return (v) p086i8.k.d0(p086i8.i.u(new v[]{vVarK, vVar, vVarQ}));
    }

    @Override // y0.x
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        x xVarO = o(this.f16008D, this, null, false);
        sb.append(" startDestination=");
        if (xVarO == null) {
            String str = this.f16009E;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(this.f16008D));
            }
        } else {
            sb.append("{");
            sb.append(xVarO.toString());
            sb.append("}");
        }
        String string = sb.toString();
        p210v8.i.e(string, "sb.toString()");
        return string;
    }
}
