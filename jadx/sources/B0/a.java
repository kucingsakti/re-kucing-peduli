package B0;

import J7.j;
import K9.n;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p032d0.d;
import p068ga.l;
import p078i.AbstractActivityC0655l;
import p078i.D;
import p097k.f;
import p160q4.c;
import p210v8.i;
import y0.B;
import y0.C0864b;
import y0.C0868f;
import y0.G;
import y0.InterfaceC0866d;
import y0.M;
import y0.x;
import y0.z;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObjectAnimator f575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractActivityC0655l f576f;

    public a(AbstractActivityC0655l abstractActivityC0655l, c cVar) {
        D d3 = (D) abstractActivityC0655l.k();
        d3.getClass();
        Context contextY = d3.y();
        i.e(contextY, "checkNotNull(activity.dr…  .actionBarThemedContext");
        this.a = contextY;
        this.f572b = cVar;
        this.f573c = null;
        this.f576f = abstractActivityC0655l;
    }

    public final void a(B b3, x xVar, Bundle bundle) {
        String string;
        C0868f c0868f;
        boolean z6;
        p076h8.f fVar;
        i.f(b3, "controller");
        i.f(xVar, "destination");
        if (xVar instanceof InterfaceC0866d) {
            return;
        }
        WeakReference weakReference = this.f573c;
        d dVar = weakReference != null ? (d) weakReference.get() : null;
        if (weakReference != null && dVar == null) {
            b3.f15847p.remove(this);
            return;
        }
        Context context = this.a;
        i.f(context, "context");
        CharSequence charSequence = xVar.f15998v;
        if (charSequence == null) {
            string = null;
        } else {
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (bundle == null || !bundle.containsKey(strGroup)) {
                    throw new IllegalArgumentException("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"');
                }
                matcher.appendReplacement(stringBuffer, "");
                M m2 = (strGroup == null || (c0868f = (C0868f) xVar.f16001y.get(strGroup)) == null) ? null : c0868f.a;
                G g8 = M.f15880c;
                if (i.a(m2, g8)) {
                    i.e(strGroup, "argName");
                    String string2 = context.getString(((Integer) g8.a(strGroup, bundle)).intValue());
                    i.e(string2, "context.getString(\n     …                        )");
                    stringBuffer.append(string2);
                } else {
                    i.c(m2);
                    i.e(strGroup, "argName");
                    stringBuffer.append(String.valueOf(m2.a(strGroup, bundle)));
                }
            }
            matcher.appendTail(stringBuffer);
            string = stringBuffer.toString();
        }
        if (string != null) {
            AbstractActivityC0655l abstractActivityC0655l = this.f576f;
            j jVarL = abstractActivityC0655l.l();
            if (jVarL == null) {
                throw new IllegalStateException(("Activity " + abstractActivityC0655l + " does not have an ActionBar set via setSupportActionBar()").toString());
            }
            jVarL.R(string);
        }
        c cVar = this.f572b;
        cVar.getClass();
        int i10 = x.f15993B;
        Iterator it = n.x(xVar, C0864b.f15900A).iterator();
        while (true) {
            if (!it.hasNext()) {
                z6 = false;
                break;
            }
            x xVar2 = (x) it.next();
            if (cVar.a.contains(Integer.valueOf(xVar2.f16002z))) {
                if (xVar2 instanceof z) {
                    int i11 = xVar.f16002z;
                    int i12 = z.f16006F;
                    if (i11 == l.e((z) xVar2).f16002z) {
                    }
                }
                z6 = true;
                break;
            }
        }
        if (dVar == null && z6) {
            b(null, 0);
            return;
        }
        boolean z10 = dVar != null && z6;
        f fVar2 = this.f574d;
        if (fVar2 != null) {
            fVar = new p076h8.f(fVar2, Boolean.TRUE);
        } else {
            f fVar3 = new f(context);
            this.f574d = fVar3;
            fVar = new p076h8.f(fVar3, Boolean.FALSE);
        }
        f fVar4 = (f) fVar.f11789s;
        boolean zBooleanValue = ((Boolean) fVar.f11790t).booleanValue();
        b(fVar4, z10 ? R.string.nav_app_bar_open_drawer_description : R.string.nav_app_bar_navigate_up_description);
        float f10 = z10 ? 0.0f : 1.0f;
        if (!zBooleanValue) {
            fVar4.setProgress(f10);
            return;
        }
        float f11 = fVar4.j;
        ObjectAnimator objectAnimator = this.f575e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(fVar4, "progress", f11, f10);
        this.f575e = objectAnimatorOfFloat;
        i.d(objectAnimatorOfFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        objectAnimatorOfFloat.start();
    }

    public final void b(f fVar, int i10) {
        AbstractActivityC0655l abstractActivityC0655l = this.f576f;
        j jVarL = abstractActivityC0655l.l();
        if (jVarL == null) {
            throw new IllegalStateException(("Activity " + abstractActivityC0655l + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        jVarL.H(fVar != null);
        D d3 = (D) abstractActivityC0655l.k();
        d3.getClass();
        d3.C();
        j jVar = d3.f11926G;
        if (jVar != null) {
            jVar.L(fVar);
            jVar.J(i10);
        }
    }
}
