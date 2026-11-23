package com.kcstream.cing.fragment;

import A0.r;
import Ca.c;
import F8.C0212f;
import Fa.e;
import K4.h;
import M4.a;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.b;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.MainActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import p.b1;
import p086i8.C;
import p086i8.k;
import p086i8.m;
import p086i8.p;
import p188t1.G;
import p210v8.i;
import p210v8.u;
import p210v8.v;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/fragment/TabsBookmarkFragment;", "Landroidx/fragment/app/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TabsBookmarkFragment extends b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public e f10244t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public h f10245u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public c f10246v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ArrayList f10247w0 = new ArrayList();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f10248x0 = "all";

    @Override // androidx.fragment.app.b
    public final void C(Bundle bundle) {
        super.C(bundle);
        c0(true);
    }

    @Override // androidx.fragment.app.b
    public final void D(Menu menu, MenuInflater menuInflater) {
        i.f(menu, "menu");
        i.f(menuInflater, "inflater");
        menuInflater.inflate(R.menu.menu_activity_main, menu);
    }

    @Override // androidx.fragment.app.b
    public final View E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.f(layoutInflater, "inflater");
        ((MainActivity) W()).z();
        ((MainActivity) W()).A();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_activity_main_bookmark, viewGroup, false);
        int i10 = R.id.chip_type;
        Chip chip = (Chip) oa.b.c(viewInflate, R.id.chip_type);
        if (chip != null) {
            i10 = R.id.iv_info;
            ImageView imageView = (ImageView) oa.b.c(viewInflate, R.id.iv_info);
            if (imageView != null) {
                i10 = R.id.rl_info;
                RelativeLayout relativeLayout = (RelativeLayout) oa.b.c(viewInflate, R.id.rl_info);
                if (relativeLayout != null) {
                    i10 = R.id.rv_bookmark;
                    RecyclerView recyclerView = (RecyclerView) oa.b.c(viewInflate, R.id.rv_bookmark);
                    if (recyclerView != null) {
                        i10 = R.id.tabs;
                        if (((RelativeLayout) oa.b.c(viewInflate, R.id.tabs)) != null) {
                            this.f10244t0 = new e((RelativeLayout) viewInflate, chip, imageView, relativeLayout, recyclerView, 4);
                            b1.c(layoutInflater);
                            this.f10245u0 = new h(X(), "nekopoi_localdb", null, 1);
                            RelativeLayout relativeLayout2 = (RelativeLayout) g0().f1659t;
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
    public final void N() throws Throwable {
        this.f6634a0 = true;
        h0();
        c cVar = this.f10246v0;
        if (cVar != null) {
            cVar.q();
        } else {
            i.n("adapters");
            throw null;
        }
    }

    @Override // androidx.fragment.app.b
    public final void R(View view, Bundle bundle) throws Throwable {
        i.f(view, "view");
        ImageView imageView = (ImageView) g0().f1661v;
        i.e(imageView, "ivInfo");
        D3.b.t(imageView, Integer.valueOf(R.drawable.neko_sticker1));
        h0();
    }

    public final e g0() {
        e eVar = this.f10244t0;
        if (eVar != null) {
            return eVar;
        }
        i.n("binding");
        throw null;
    }

    public final void h0() throws Throwable {
        Throwable th;
        ArrayList arrayList;
        Y();
        ArrayList arrayListT0 = this.f10247w0;
        arrayListT0.clear();
        h hVar = this.f10245u0;
        Throwable th2 = null;
        if (hVar == null) {
            i.n("dbHelper");
            throw null;
        }
        Cursor cursorRawQuery = hVar.getReadableDatabase().rawQuery("SELECT * FROM bookmark", null);
        if (cursorRawQuery != null) {
            B8.c cVar = new B8.c(1, cursorRawQuery.getCount(), 1);
            arrayList = new ArrayList(m.H(cVar, 10));
            B8.b it = cVar.iterator();
            while (it.f774u) {
                it.a();
                cursorRawQuery.moveToNext();
                int i10 = cursorRawQuery.getInt(0);
                String string = cursorRawQuery.getString(1);
                int i11 = cursorRawQuery.getInt(2);
                int i12 = cursorRawQuery.getInt(3);
                String string2 = cursorRawQuery.getString(4);
                String string3 = cursorRawQuery.getString(5);
                long j = cursorRawQuery.getLong(6);
                Throwable th3 = th2;
                i.c(string);
                i.c(string2);
                i.c(string3);
                a aVar = new a();
                aVar.a = i10;
                aVar.f3171b = i12;
                aVar.f3172c = string;
                aVar.f3173d = i11;
                aVar.f3174e = string2;
                aVar.f3175f = string3;
                aVar.f3176g = j;
                arrayList.add(aVar);
                th2 = th3;
            }
            th = th2;
        } else {
            th = null;
            arrayList = null;
        }
        if (arrayList != null) {
            arrayListT0.addAll(arrayList);
        }
        String str = this.f10248x0;
        if (i.a(str, "series")) {
            if (arrayListT0.size() > 1) {
                p.I(arrayListT0, new C0212f(7));
            }
            ((Chip) g0().f1660u).setText("Series");
        } else if (i.a(str, "episodes")) {
            ((Chip) g0().f1660u).setText("Episode");
            if (arrayListT0.size() > 1) {
                p.I(arrayListT0, new C0212f(8));
            }
        }
        if (!C.q(arrayListT0)) {
            arrayListT0 = k.t0(arrayListT0);
        }
        G g8 = new G(new c(x.b(arrayListT0)));
        v vVar = u.a;
        g8.x(vVar.b(a.class), vVar.b(G4.b.class));
        this.f10246v0 = g8.r((RecyclerView) g0().f1663x);
        D3.b.e((Chip) g0().f1660u, new r(this, 13));
        c cVar2 = this.f10246v0;
        if (cVar2 == null) {
            i.n("adapters");
            throw th;
        }
        if (cVar2.a() == 0) {
            ((RelativeLayout) g0().f1662w).setVisibility(0);
            ((RecyclerView) g0().f1663x).setVisibility(8);
        } else {
            ((RelativeLayout) g0().f1662w).setVisibility(8);
            ((RecyclerView) g0().f1663x).setVisibility(0);
        }
    }
}
