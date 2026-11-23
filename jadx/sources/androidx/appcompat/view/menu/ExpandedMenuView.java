package androidx.appcompat.view.menu;

import Y1.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p136o.k;
import p136o.l;
import p136o.n;
import p136o.z;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f6050t = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l f6051s;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c cVarE = c.E(context, attributeSet, f6050t, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) cVarE.f5671u;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(cVarE.v(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(cVarE.v(1));
        }
        cVarE.J();
    }

    @Override // p136o.z
    public final void b(l lVar) {
        this.f6051s = lVar;
    }

    @Override // p136o.k
    public final boolean c(n nVar) {
        return this.f6051s.q(nVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        c((n) getAdapter().getItem(i10));
    }
}
