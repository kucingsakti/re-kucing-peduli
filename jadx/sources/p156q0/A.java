package p156q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.b;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import p146p0.a;
import p167r0.c;

/* JADX INFO: loaded from: classes.dex */
public final class A implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f14251s;

    public A(e eVar) {
        this.f14251s = eVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        f fVarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        e eVar = this.f14251s;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, eVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = b.class.isAssignableFrom(F.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    b bVarD = resourceId != -1 ? eVar.D(resourceId) : null;
                    if (bVarD == null && string != null) {
                        bVarD = eVar.E(string);
                    }
                    if (bVarD == null && id != -1) {
                        bVarD = eVar.D(id);
                    }
                    if (bVarD == null) {
                        F fI = eVar.I();
                        context.getClassLoader();
                        bVarD = fI.a(attributeValue);
                        bVarD.f6616H = true;
                        bVarD.f6625R = resourceId != 0 ? resourceId : id;
                        bVarD.f6626S = id;
                        bVarD.f6627T = string;
                        bVarD.f6617I = true;
                        bVarD.f6622N = eVar;
                        C0763w c0763w = eVar.f6696w;
                        bVarD.f6623O = c0763w;
                        bVarD.J(c0763w.f14369t, attributeSet, bVarD.f6651t);
                        fVarG = eVar.a(bVarD);
                        if (e.K(2)) {
                            bVarD.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (bVarD.f6617I) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        bVarD.f6617I = true;
                        bVarD.f6622N = eVar;
                        C0763w c0763w2 = eVar.f6696w;
                        bVarD.f6623O = c0763w2;
                        bVarD.J(c0763w2.f14369t, attributeSet, bVarD.f6651t);
                        fVarG = eVar.g(bVarD);
                        if (e.K(2)) {
                            bVarD.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    p167r0.b bVar = c.a;
                    c.b(new FragmentTagUsageViolation(bVarD, "Attempting to use <fragment> tag to add fragment " + bVarD + " to container " + viewGroup));
                    c.a(bVarD).getClass();
                    bVarD.f6635b0 = viewGroup;
                    fVarG.k();
                    fVarG.j();
                    View view2 = bVarD.c0;
                    if (view2 == null) {
                        throw new IllegalStateException(E0.a.i("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (bVarD.c0.getTag() == null) {
                        bVarD.c0.setTag(string);
                    }
                    bVarD.c0.addOnAttachStateChangeListener(new z(this, fVarG));
                    return bVarD.c0;
                }
            }
        }
        return null;
    }
}
