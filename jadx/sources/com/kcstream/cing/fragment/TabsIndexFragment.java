package com.kcstream.cing.fragment;

import Fa.e;
import J4.l;
import J4.m;
import J4.n;
import K4.g;
import N9.AbstractC0342z;
import X2.h;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.MainActivity;
import com.kcstream.cing.model.GetList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import oa.b;
import p.b1;
import p206v3.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/fragment/TabsIndexFragment;", "LK4/g;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TabsIndexFragment extends g {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f10254A0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public e f10255v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public GetList f10256w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ArrayList f10257x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f10258y0 = "hentai";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f10259z0 = "0-9";

    @Override // K4.g, androidx.fragment.app.b
    public final void C(Bundle bundle) {
        super.C(bundle);
        c0(true);
    }

    @Override // androidx.fragment.app.b
    public final void D(Menu menu, MenuInflater menuInflater) {
        i.f(menu, "menu");
        i.f(menuInflater, "inflater");
        menuInflater.inflate(R.menu.menu_activity_main_fragment_index, menu);
    }

    @Override // androidx.fragment.app.b
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.f(layoutInflater, "inflater");
        ((MainActivity) W()).z();
        ((MainActivity) W()).A();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_activity_main_index, viewGroup, false);
        int i10 = R.id.iv_info;
        ImageView imageView = (ImageView) b.c(viewInflate, R.id.iv_info);
        if (imageView != null) {
            i10 = R.id.pb_progress;
            ProgressBar progressBar = (ProgressBar) b.c(viewInflate, R.id.pb_progress);
            if (progressBar != null) {
                i10 = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) b.c(viewInflate, R.id.recyclerView);
                if (recyclerView != null) {
                    i10 = R.id.rl_info;
                    RelativeLayout relativeLayout = (RelativeLayout) b.c(viewInflate, R.id.rl_info);
                    if (relativeLayout != null) {
                        i10 = R.id.tabLayout;
                        TabLayout tabLayout = (TabLayout) b.c(viewInflate, R.id.tabLayout);
                        if (tabLayout != null) {
                            RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                            this.f10255v0 = new e(relativeLayout2, imageView, progressBar, recyclerView, relativeLayout, tabLayout, 6);
                            i.e(relativeLayout2, "getRoot(...)");
                            return relativeLayout2;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.b
    public final void F() {
        this.f10255v0 = null;
        this.f6634a0 = true;
    }

    @Override // androidx.fragment.app.b
    public final boolean K(MenuItem menuItem) {
        i.f(menuItem, "item");
        if (menuItem.getItemId() != R.id.action_genre) {
            return true;
        }
        View viewInflate = n().inflate(R.layout.dialog_bottom_fragment_index, (ViewGroup) null, false);
        int i10 = R.id.rl_info;
        if (((RelativeLayout) b.c(viewInflate, R.id.rl_info)) != null) {
            i10 = R.id.tx_m_2da;
            MaterialTextView materialTextView = (MaterialTextView) b.c(viewInflate, R.id.tx_m_2da);
            if (materialTextView != null) {
                i10 = R.id.tx_m_3dh;
                MaterialTextView materialTextView2 = (MaterialTextView) b.c(viewInflate, R.id.tx_m_3dh);
                if (materialTextView2 != null) {
                    i10 = R.id.tx_m_hentai;
                    MaterialTextView materialTextView3 = (MaterialTextView) b.c(viewInflate, R.id.tx_m_hentai);
                    if (materialTextView3 != null) {
                        i10 = R.id.tx_m_jav;
                        MaterialTextView materialTextView4 = (MaterialTextView) b.c(viewInflate, R.id.tx_m_jav);
                        if (materialTextView4 != null) {
                            i10 = R.id.tx_m_jav_cos;
                            MaterialTextView materialTextView5 = (MaterialTextView) b.c(viewInflate, R.id.tx_m_jav_cos);
                            if (materialTextView5 != null) {
                                h hVar = new h(X());
                                hVar.setContentView((RelativeLayout) viewInflate);
                                hVar.show();
                                D3.b.e(materialTextView3, new n(this, hVar, 0));
                                D3.b.e(materialTextView4, new n(this, hVar, 1));
                                D3.b.e(materialTextView5, new n(this, hVar, 2));
                                D3.b.e(materialTextView2, new n(this, hVar, 3));
                                D3.b.e(materialTextView, new n(this, hVar, 4));
                                return true;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.b
    public final void R(View view, Bundle bundle) {
        TabLayout tabLayout;
        i.f(view, "view");
        b1.c(n());
        W();
        e eVar = this.f10255v0;
        i.c(eVar);
        D3.b.t((ImageView) eVar.f1659t, Integer.valueOf(R.drawable.neko_sticker1));
        this.f10257x0 = new ArrayList(new p086i8.g(new String[]{"0-9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}, true));
        e eVar2 = this.f10255v0;
        i.c(eVar2);
        ((RecyclerView) eVar2.f1661v).setVisibility(8);
        e eVar3 = this.f10255v0;
        i.c(eVar3);
        ArrayList arrayList = this.f10257x0;
        if (arrayList == null) {
            i.n("listOrder");
            throw null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            tabLayout = (TabLayout) eVar3.f1663x;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            f fVarH = tabLayout.h();
            fVarH.a(str);
            tabLayout.b(fVarH, tabLayout.f9846t.isEmpty());
        }
        f fVarG = tabLayout.g(this.f10254A0);
        if (fVarG != null) {
            TabLayout tabLayout2 = fVarG.f15431d;
            if (tabLayout2 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout2.j(fVarG, true);
        }
        tabLayout.a(new m(this, 0));
        g0();
    }

    public final void g0() {
        e eVar = this.f10255v0;
        i.c(eVar);
        ((RelativeLayout) eVar.f1662w).setVisibility(8);
        e eVar2 = this.f10255v0;
        i.c(eVar2);
        ((ProgressBar) eVar2.f1660u).setVisibility(0);
        e eVar3 = this.f10255v0;
        i.c(eVar3);
        ((RecyclerView) eVar3.f1661v).setVisibility(8);
        AbstractC0342z.n(this, null, new l(this, null), 3);
    }
}
