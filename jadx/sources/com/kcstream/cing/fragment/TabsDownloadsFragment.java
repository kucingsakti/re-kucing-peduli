package com.kcstream.cing.fragment;

import A0.r;
import A1.C0099h;
import Ca.c;
import Fa.e;
import Ha.a;
import J.f;
import J4.h;
import J4.j;
import L9.n;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
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
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.MainActivity;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import p.b1;
import p078i.AbstractActivityC0655l;
import p086i8.C;
import p086i8.k;
import p188t1.G;
import p210v8.i;
import p210v8.u;
import p210v8.v;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kcstream/cing/fragment/TabsDownloadsFragment;", "Landroidx/fragment/app/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TabsDownloadsFragment extends b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public C0099h f10249t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public c f10250u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final ArrayList f10251v0 = new ArrayList();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public j f10252w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public File f10253x0;

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
        View viewInflate = layoutInflater.inflate(R.layout.fragment_activity_main_downloads, viewGroup, false);
        int i10 = R.id.chip_option;
        Chip chip = (Chip) oa.b.c(viewInflate, R.id.chip_option);
        if (chip != null) {
            i10 = R.id.ll;
            if (((RelativeLayout) oa.b.c(viewInflate, R.id.ll)) != null) {
                i10 = R.id.rv;
                RecyclerView recyclerView = (RecyclerView) oa.b.c(viewInflate, R.id.rv);
                if (recyclerView != null) {
                    this.f10249t0 = new C0099h((RelativeLayout) viewInflate, chip, recyclerView, 15);
                    e.i(layoutInflater.inflate(R.layout.recycler_activity_main_fragment_download, (ViewGroup) null, false));
                    b1.c(layoutInflater);
                    View viewInflate2 = layoutInflater.inflate(R.layout.dialog_bottom_fragment_download, (ViewGroup) null, false);
                    int i11 = R.id.it_delete;
                    if (((RelativeLayout) oa.b.c(viewInflate2, R.id.it_delete)) != null) {
                        i11 = R.id.it_open;
                        if (((RelativeLayout) oa.b.c(viewInflate2, R.id.it_open)) != null) {
                            i11 = R.id.iv_delete;
                            if (((ImageView) oa.b.c(viewInflate2, R.id.iv_delete)) != null) {
                                i11 = R.id.iv_image;
                                if (((ImageView) oa.b.c(viewInflate2, R.id.iv_image)) != null) {
                                    i11 = R.id.iv_open;
                                    if (((ImageView) oa.b.c(viewInflate2, R.id.iv_open)) != null) {
                                        i11 = R.id.rl_info;
                                        if (((RelativeLayout) oa.b.c(viewInflate2, R.id.rl_info)) != null) {
                                            i11 = R.id.tv_size;
                                            if (((MaterialTextView) oa.b.c(viewInflate2, R.id.tv_size)) != null) {
                                                i11 = R.id.tv_time;
                                                if (((MaterialTextView) oa.b.c(viewInflate2, R.id.tv_time)) != null) {
                                                    i11 = R.id.tv_title;
                                                    if (((MaterialTextView) oa.b.c(viewInflate2, R.id.tv_title)) != null) {
                                                        i11 = R.id.tx_delete;
                                                        if (((MaterialTextView) oa.b.c(viewInflate2, R.id.tx_delete)) != null) {
                                                            i11 = R.id.tx_open;
                                                            if (((MaterialTextView) oa.b.c(viewInflate2, R.id.tx_open)) != null) {
                                                                C0099h c0099h = this.f10249t0;
                                                                if (c0099h == null) {
                                                                    i.n("binding");
                                                                    throw null;
                                                                }
                                                                RelativeLayout relativeLayout = (RelativeLayout) c0099h.f103t;
                                                                i.e(relativeLayout, "getRoot(...)");
                                                                return relativeLayout;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i11)));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.b
    public final void F() {
        this.f6634a0 = true;
        try {
            AbstractActivityC0655l abstractActivityC0655lF = f();
            if (abstractActivityC0655lF != null) {
                abstractActivityC0655lF.unregisterReceiver(this.f10252w0);
            }
            a.a.getClass();
            za.c.h(new Object[0]);
        } catch (Exception unused) {
            a.a.getClass();
            za.c.h(new Object[0]);
        }
    }

    @Override // androidx.fragment.app.b
    public final void L() {
        this.f6634a0 = true;
        try {
            AbstractActivityC0655l abstractActivityC0655lF = f();
            if (abstractActivityC0655lF != null) {
                abstractActivityC0655lF.unregisterReceiver(this.f10252w0);
            }
            a.a.getClass();
            za.c.h(new Object[0]);
        } catch (Exception unused) {
            a.a.getClass();
            za.c.h(new Object[0]);
        }
    }

    @Override // androidx.fragment.app.b
    public final void N() {
        this.f6634a0 = true;
        try {
            IntentFilter intentFilter = new IntentFilter("com.kcstream.cing.broadcast.download.FINISHED");
            if (Build.VERSION.SDK_INT >= 33) {
                AbstractActivityC0655l abstractActivityC0655lF = f();
                if (abstractActivityC0655lF != null) {
                    abstractActivityC0655lF.registerReceiver(this.f10252w0, intentFilter, 2);
                }
            } else {
                Context contextM = m();
                if (contextM != null) {
                    f.e(contextM, this.f10252w0, intentFilter, 4);
                }
            }
            a.a.getClass();
            za.c.h(new Object[0]);
        } catch (Exception unused) {
            a.a.getClass();
            za.c.h(new Object[0]);
        }
    }

    @Override // androidx.fragment.app.b
    public final void P() {
        this.f6634a0 = true;
        try {
            IntentFilter intentFilter = new IntentFilter("com.kcstream.cing.broadcast.download.FINISHED");
            if (Build.VERSION.SDK_INT >= 33) {
                AbstractActivityC0655l abstractActivityC0655lF = f();
                if (abstractActivityC0655lF != null) {
                    abstractActivityC0655lF.registerReceiver(this.f10252w0, intentFilter, 2);
                }
            } else {
                Context contextM = m();
                if (contextM != null) {
                    f.e(contextM, this.f10252w0, intentFilter, 4);
                }
            }
            a.a.getClass();
            za.c.h(new Object[0]);
        } catch (Exception unused) {
            a.a.getClass();
            za.c.h(new Object[0]);
        }
    }

    @Override // androidx.fragment.app.b
    public final void R(View view, Bundle bundle) {
        i.f(view, "view");
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "NekoPoi");
        File file2 = new File(file.getAbsolutePath() + File.separatorChar + ".nomedia");
        try {
            if (file2.exists()) {
                file2.delete();
            }
        } catch (Exception unused) {
        }
        this.f10253x0 = file;
        ArrayList arrayListT0 = this.f10251v0;
        if (arrayListT0 == null || arrayListT0.isEmpty()) {
            File file3 = this.f10253x0;
            if (file3 == null) {
                i.n("path");
                throw null;
            }
            File[] fileArrListFiles = file3.listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList(fileArrListFiles.length);
                for (File file4 : fileArrListFiles) {
                    String name = file4.getName();
                    i.e(name, "getName(...)");
                    String path = file4.getPath();
                    i.e(path, "getPath(...)");
                    arrayList.add(new J4.e(file4.lastModified(), file4.length(), name, path));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (n.B(((J4.e) obj).a, ".mp4")) {
                        arrayList2.add(obj);
                    }
                }
                c cVar = this.f10250u0;
                if (cVar != null) {
                    cVar.m(arrayList2);
                }
            }
            c cVar2 = this.f10250u0;
            if (cVar2 != null) {
                cVar2.q();
            }
        } else {
            arrayListT0.clear();
        }
        C0099h c0099h = this.f10249t0;
        if (c0099h == null) {
            i.n("binding");
            throw null;
        }
        D3.b.e((Chip) c0099h.f104u, new r(this, 14));
        i.g(arrayListT0, "items");
        if (!C.q(arrayListT0)) {
            arrayListT0 = k.t0(arrayListT0);
        }
        G g8 = new G(new c(x.b(arrayListT0)));
        v vVar = u.a;
        g8.x(vVar.b(J4.e.class), vVar.b(h.class));
        C0099h c0099h2 = this.f10249t0;
        if (c0099h2 == null) {
            i.n("binding");
            throw null;
        }
        this.f10250u0 = g8.r((RecyclerView) c0099h2.f105v);
        File file5 = this.f10253x0;
        if (file5 == null) {
            i.n("path");
            throw null;
        }
        File[] fileArrListFiles2 = file5.listFiles();
        if (fileArrListFiles2 != null) {
            ArrayList arrayList3 = new ArrayList(fileArrListFiles2.length);
            for (File file6 : fileArrListFiles2) {
                String name2 = file6.getName();
                i.e(name2, "getName(...)");
                String path2 = file6.getPath();
                i.e(path2, "getPath(...)");
                arrayList3.add(new J4.e(file6.lastModified(), file6.length(), name2, path2));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (n.B(((J4.e) obj2).a, ".mp4")) {
                    arrayList4.add(obj2);
                }
            }
            c cVar3 = this.f10250u0;
            if (cVar3 != null) {
                cVar3.m(arrayList4);
            }
        }
        this.f10252w0 = new j(this, 0);
        IntentFilter intentFilter = new IntentFilter("com.kcstream.cing.broadcast.download.FINISHED");
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractActivityC0655l abstractActivityC0655lF = f();
            if (abstractActivityC0655lF != null) {
                abstractActivityC0655lF.registerReceiver(this.f10252w0, intentFilter, 2);
                return;
            }
            return;
        }
        AbstractActivityC0655l abstractActivityC0655lF2 = f();
        if (abstractActivityC0655lF2 != null) {
            abstractActivityC0655lF2.registerReceiver(this.f10252w0, intentFilter);
        }
    }
}
