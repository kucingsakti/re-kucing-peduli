package androidx.fragment.app;

import U.B0;
import U.U;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import p078i.AbstractActivityC0655l;
import p156q0.C0742a;
import p156q0.F;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lh8/m;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/b;", "F", "getFragment", "()Landroidx/fragment/app/b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f6579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f6580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f6581u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6582v;

    public FragmentContainerView(Context context) {
        super(context);
        this.f6579s = new ArrayList();
        this.f6580t = new ArrayList();
        this.f6582v = true;
    }

    public final void a(View view) {
        if (this.f6580t.contains(view)) {
            this.f6579s.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        i.f(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof b ? (b) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        B0 b0I;
        i.f(windowInsets, "insets");
        B0 b0H = B0.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f6581u;
        if (onApplyWindowInsetsListener != null) {
            i.c(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            i.e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            b0I = B0.h(null, windowInsetsOnApplyWindowInsets);
        } else {
            b0I = U.i(this, b0H);
        }
        i.e(b0I, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!b0I.a.m()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                U.b(getChildAt(i10), b0I);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i.f(canvas, "canvas");
        if (this.f6582v) {
            Iterator it = this.f6579s.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        i.f(canvas, "canvas");
        i.f(view, "child");
        if (this.f6582v) {
            ArrayList arrayList = this.f6579s;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        i.f(view, "view");
        this.f6580t.remove(view);
        if (this.f6579s.remove(view)) {
            this.f6582v = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends b> F getFragment() {
        AbstractActivityC0655l abstractActivityC0655l;
        b bVar;
        e eVarM;
        View view = this;
        while (true) {
            abstractActivityC0655l = null;
            if (view == null) {
                bVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            bVar = tag instanceof b ? (b) tag : null;
            if (bVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (bVar == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof AbstractActivityC0655l) {
                    abstractActivityC0655l = (AbstractActivityC0655l) context;
                    break;
                }
            }
            if (abstractActivityC0655l == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            eVarM = abstractActivityC0655l.m();
        } else {
            if (!bVar.v()) {
                throw new IllegalStateException("The Fragment " + bVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            eVarM = bVar.l();
        }
        return (F) eVarM.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        i.f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                i.e(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        i.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        i.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        i.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            i.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            i.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f6582v = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        this.f6581u = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        i.f(view, "view");
        if (view.getParent() == this) {
            this.f6580t.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        i.f(context, "context");
        this.f6579s = new ArrayList();
        this.f6580t = new ArrayList();
        this.f6582v = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p146p0.a.f14165b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, e eVar) {
        View view;
        super(context, attributeSet);
        i.f(context, "context");
        i.f(attributeSet, "attrs");
        i.f(eVar, "fm");
        this.f6579s = new ArrayList();
        this.f6580t = new ArrayList();
        this.f6582v = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p146p0.a.f14165b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        b bVarD = eVar.D(id);
        if (classAttribute != null && bVarD == null) {
            if (id == -1) {
                throw new IllegalStateException(E0.a.i("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            F fI = eVar.I();
            context.getClassLoader();
            b bVarA = fI.a(classAttribute);
            i.e(bVarA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            bVarA.f6625R = id;
            bVarA.f6626S = id;
            bVarA.f6627T = string;
            bVarA.f6622N = eVar;
            bVarA.f6623O = eVar.f6696w;
            bVarA.J(context, attributeSet, null);
            C0742a c0742a = new C0742a(eVar);
            c0742a.f14307p = true;
            bVarA.f6635b0 = this;
            bVarA.f6618J = true;
            c0742a.j(getId(), bVarA, string, 1);
            if (!c0742a.f14299g) {
                c0742a.f14300h = false;
                c0742a.f14309r.A(c0742a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        for (f fVar : eVar.f6677c.j()) {
            b bVar = fVar.f6701c;
            if (bVar.f6626S == getId() && (view = bVar.c0) != null && view.getParent() == null) {
                bVar.f6635b0 = this;
                fVar.b();
                fVar.k();
            }
        }
    }
}
