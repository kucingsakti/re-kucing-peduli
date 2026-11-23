package p091j3;

import U.U;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.google.android.material.internal.NavigationMenuItemView;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p136o.D;
import p136o.n;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12441d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f12442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f12444g;

    public k(t tVar) {
        this.f12444g = tVar;
        m();
    }

    @Override // androidx.recyclerview.widget.s
    public final int a() {
        return this.f12441d.size();
    }

    @Override // androidx.recyclerview.widget.s
    public final long b(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(int i10) {
        m mVar = (m) this.f12441d.get(i10);
        if (mVar instanceof n) {
            return 2;
        }
        if (mVar instanceof l) {
            return 3;
        }
        if (mVar instanceof o) {
            return ((o) mVar).a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // androidx.recyclerview.widget.s
    public final void e(RecyclerView.a aVar, int i10) {
        int iC = c(i10);
        ArrayList arrayList = this.f12441d;
        t tVar = this.f12444g;
        View view = ((s) aVar).f7003s;
        if (iC != 0) {
            if (iC != 1) {
                if (iC != 2) {
                    return;
                }
                n nVar = (n) arrayList.get(i10);
                view.setPadding(tVar.f12458K, nVar.a, tVar.f12459L, nVar.f12445b);
                return;
            }
            TextView textView = (TextView) view;
            textView.setText(((o) arrayList.get(i10)).a.f13542w);
            textView.setTextAppearance(tVar.f12474y);
            textView.setPadding(tVar.f12460M, textView.getPaddingTop(), tVar.f12461N, textView.getPaddingBottom());
            ColorStateList colorStateList = tVar.f12475z;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            U.n(textView, new j(this, i10, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        navigationMenuItemView.setIconTintList(tVar.f12451D);
        navigationMenuItemView.setTextAppearance(tVar.f12448A);
        ColorStateList colorStateList2 = tVar.f12450C;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = tVar.f12452E;
        Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        WeakHashMap weakHashMap = U.a;
        navigationMenuItemView.setBackground(drawableNewDrawable);
        RippleDrawable rippleDrawable = tVar.f12453F;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        o oVar = (o) arrayList.get(i10);
        navigationMenuItemView.setNeedsEmptyIcon(oVar.f12446b);
        int i11 = tVar.f12454G;
        int i12 = tVar.f12455H;
        navigationMenuItemView.setPadding(i11, i12, i11, i12);
        navigationMenuItemView.setIconPadding(tVar.f12456I);
        if (tVar.f12462O) {
            navigationMenuItemView.setIconSize(tVar.f12457J);
        }
        navigationMenuItemView.setMaxLines(tVar.f12463Q);
        navigationMenuItemView.f9741Q = tVar.f12449B;
        navigationMenuItemView.a(oVar.a);
        U.n(navigationMenuItemView, new j(this, i10, false));
    }

    @Override // androidx.recyclerview.widget.s
    public final RecyclerView.a f(ViewGroup viewGroup, int i10) {
        t tVar = this.f12444g;
        if (i10 == 0) {
            LayoutInflater layoutInflater = tVar.f12473x;
            h hVar = tVar.f12467U;
            q qVar = new q(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            qVar.f7003s.setOnClickListener(hVar);
            return qVar;
        }
        if (i10 == 1) {
            return new r(tVar.f12473x.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i10 == 2) {
            return new r(tVar.f12473x.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i10 != 3) {
            return null;
        }
        return new i(tVar.f12469t);
    }

    @Override // androidx.recyclerview.widget.s
    public final void k(RecyclerView.a aVar) {
        s sVar = (s) aVar;
        if (sVar instanceof q) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) sVar.f7003s;
            FrameLayout frameLayout = navigationMenuItemView.f9743S;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f9742R.setCompoundDrawables(null, null, null, null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        boolean z6;
        if (this.f12443f) {
            return;
        }
        this.f12443f = true;
        ArrayList arrayList = this.f12441d;
        arrayList.clear();
        arrayList.add(new l());
        t tVar = this.f12444g;
        int size = tVar.f12470u.l().size();
        boolean z10 = false;
        int i10 = -1;
        int i11 = 0;
        boolean z11 = false;
        int size2 = 0;
        while (i11 < size) {
            n nVar = (n) tVar.f12470u.l().get(i11);
            if (nVar.isChecked()) {
                n(nVar);
            }
            if (nVar.isCheckable()) {
                nVar.f(z10);
            }
            if (nVar.hasSubMenu()) {
                D d3 = nVar.f13524G;
                if (d3.hasVisibleItems()) {
                    if (i11 != 0) {
                        arrayList.add(new n(tVar.f12465S, z10 ? 1 : 0));
                    }
                    arrayList.add(new o(nVar));
                    int size3 = d3.f13512x.size();
                    int i12 = z10 ? 1 : 0;
                    int i13 = i12;
                    while (i12 < size3) {
                        n nVar2 = (n) d3.getItem(i12);
                        if (nVar2.isVisible()) {
                            if (i13 == 0 && nVar2.getIcon() != null) {
                                i13 = 1;
                            }
                            if (nVar2.isCheckable()) {
                                nVar2.f(z10);
                            }
                            if (nVar.isChecked()) {
                                n(nVar);
                            }
                            arrayList.add(new o(nVar2));
                        }
                        i12++;
                        z10 = false;
                    }
                    if (i13 != 0) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((o) arrayList.get(size5)).f12446b = true;
                        }
                    }
                }
                z6 = true;
            } else {
                int i14 = nVar.f13539t;
                if (i14 != i10) {
                    size2 = arrayList.size();
                    z11 = nVar.getIcon() != null;
                    if (i11 != 0) {
                        size2++;
                        int i15 = tVar.f12465S;
                        arrayList.add(new n(i15, i15));
                    }
                } else {
                    if (!z11 && nVar.getIcon() != null) {
                        int size6 = arrayList.size();
                        for (int i16 = size2; i16 < size6; i16++) {
                            ((o) arrayList.get(i16)).f12446b = true;
                        }
                        z6 = true;
                        z11 = true;
                    }
                    o oVar = new o(nVar);
                    oVar.f12446b = z11;
                    arrayList.add(oVar);
                    i10 = i14;
                }
                z6 = true;
                o oVar2 = new o(nVar);
                oVar2.f12446b = z11;
                arrayList.add(oVar2);
                i10 = i14;
            }
            i11++;
            z10 = false;
        }
        this.f12443f = z10 ? 1 : 0;
    }

    public final void n(n nVar) {
        if (this.f12442e == nVar || !nVar.isCheckable()) {
            return;
        }
        n nVar2 = this.f12442e;
        if (nVar2 != null) {
            nVar2.setChecked(false);
        }
        this.f12442e = nVar;
        nVar.setChecked(true);
    }
}
