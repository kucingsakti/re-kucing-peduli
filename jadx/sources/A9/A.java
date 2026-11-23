package A9;

import B4.C0159g;
import F8.C0208b;
import F8.l0;
import F8.m0;
import F8.p0;
import F8.w0;
import I.AbstractC0241e;
import L8.AbstractC0287v;
import L8.InterfaceC0271e;
import L8.InterfaceC0272f;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import N9.AbstractC0342z;
import O8.C0355k;
import O8.C0357m;
import U8.C0442c;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.recyclerview.widget.RecyclerView;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.ItemActivity;
import com.kcstream.cing.activity.RecentCategoryActivity;
import com.kcstream.cing.activity.SearchActivity;
import com.kcstream.cing.activity.SearchByGenreActivity;
import com.kcstream.cing.activity.SeriesActivity;
import com.kcstream.cing.model.GetListResult;
import com.kcstream.cing.model.Posts;
import com.kcstream.cing.model.PostsSeries;
import com.kcstream.cing.model.RecentItem;
import com.kcstream.cing.model.RecentPost;
import com.kcstream.cing.model.SearchByGenreResult;
import com.kcstream.cing.model.SearchListGenresData;
import com.kcstream.cing.model.SearchResult;
import com.kcstream.cing.model.SeriesEpisode;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.UrlRequest;
import p.b1;
import p078i.C0650g;
import p156q0.C0763w;

/* JADX INFO: loaded from: classes.dex */
public final class A extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f322u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B9.j jVar, B9.f fVar) {
        super(0);
        this.f320s = 2;
        this.f322u = jVar;
        this.f321t = fVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r1v15, types: [h8.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [u8.a, v8.k] */
    /* JADX WARN: Type inference failed for: r2v96, types: [h8.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v88, types: [h8.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v44, types: [h8.d, java.lang.Object] */
    @Override // p200u8.a
    public final Object invoke() {
        C8.x xVar;
        switch (this.f320s) {
            case 0:
                D9.c cVar = (D9.c) ((B) this.f322u).f324u.invoke();
                ((B9.f) this.f321t).getClass();
                p210v8.i.f(cVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
                return (AbstractC0151y) cVar;
            case 1:
                Map map = (Map) this.f322u;
                p210v8.i.e(map, "grantResults");
                B6.h hVar = (B6.h) this.f321t;
                if (hVar.g0()) {
                    B6.i iVar = hVar.f743u0;
                    if (iVar == null) {
                        p210v8.i.n("pb");
                        throw null;
                    }
                    iVar.f753f.clear();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            String str = (String) entry.getKey();
                            if (((Boolean) entry.getValue()).booleanValue()) {
                                B6.i iVar2 = hVar.f743u0;
                                if (iVar2 == null) {
                                    p210v8.i.n("pb");
                                    throw null;
                                }
                                iVar2.f753f.add(str);
                                B6.i iVar3 = hVar.f743u0;
                                if (iVar3 == null) {
                                    p210v8.i.n("pb");
                                    throw null;
                                }
                                iVar3.f754g.remove(str);
                                B6.i iVar4 = hVar.f743u0;
                                if (iVar4 == null) {
                                    p210v8.i.n("pb");
                                    throw null;
                                }
                                iVar4.f755h.remove(str);
                            } else {
                                C0763w c0763w = hVar.f6623O;
                                if (c0763w != null ? AbstractC0241e.g(c0763w.f14372w, str) : false) {
                                    arrayList.add(str);
                                    B6.i iVar5 = hVar.f743u0;
                                    if (iVar5 == null) {
                                        p210v8.i.n("pb");
                                        throw null;
                                    }
                                    iVar5.f754g.add(str);
                                } else {
                                    arrayList2.add(str);
                                    B6.i iVar6 = hVar.f743u0;
                                    if (iVar6 == null) {
                                        p210v8.i.n("pb");
                                        throw null;
                                    }
                                    iVar6.f755h.add(str);
                                    B6.i iVar7 = hVar.f743u0;
                                    if (iVar7 == null) {
                                        p210v8.i.n("pb");
                                        throw null;
                                    }
                                    iVar7.f754g.remove(str);
                                }
                            }
                        } else {
                            ArrayList<String> arrayList3 = new ArrayList();
                            B6.i iVar8 = hVar.f743u0;
                            if (iVar8 == null) {
                                p210v8.i.n("pb");
                                throw null;
                            }
                            arrayList3.addAll(iVar8.f754g);
                            B6.i iVar9 = hVar.f743u0;
                            if (iVar9 == null) {
                                p210v8.i.n("pb");
                                throw null;
                            }
                            arrayList3.addAll(iVar9.f755h);
                            for (String str2 : arrayList3) {
                                if (J.f.a(hVar.X(), str2) == 0) {
                                    B6.i iVar10 = hVar.f743u0;
                                    if (iVar10 == null) {
                                        p210v8.i.n("pb");
                                        throw null;
                                    }
                                    iVar10.f754g.remove(str2);
                                    B6.i iVar11 = hVar.f743u0;
                                    if (iVar11 == null) {
                                        p210v8.i.n("pb");
                                        throw null;
                                    }
                                    iVar11.f753f.add(str2);
                                }
                            }
                            B6.i iVar12 = hVar.f743u0;
                            if (iVar12 == null) {
                                p210v8.i.n("pb");
                                throw null;
                            }
                            int size = iVar12.f753f.size();
                            B6.i iVar13 = hVar.f743u0;
                            if (iVar13 == null) {
                                p210v8.i.n("pb");
                                throw null;
                            }
                            if (size == iVar13.f750c.size()) {
                                B6.b bVar = hVar.f744v0;
                                if (bVar == null) {
                                    p210v8.i.n("task");
                                    throw null;
                                }
                                bVar.f();
                            } else {
                                if (hVar.f743u0 == null) {
                                    p210v8.i.n("pb");
                                    throw null;
                                }
                                B6.b bVar2 = hVar.f744v0;
                                if (bVar2 == null) {
                                    p210v8.i.n("task");
                                    throw null;
                                }
                                bVar2.f();
                                if (hVar.f743u0 == null) {
                                    p210v8.i.n("pb");
                                    throw null;
                                }
                            }
                        }
                    }
                }
                return p076h8.m.a;
            case 2:
                Iterable iterable = (List) ((B9.j) this.f322u).f791e.getValue();
                if (iterable == null) {
                    iterable = p086i8.s.f12328s;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList4 = new ArrayList(p086i8.m.H(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((d0) it2.next()).K0((B9.f) this.f321t));
                }
                return arrayList4;
            case 3:
                ItemActivity itemActivity = (ItemActivity) this.f321t;
                Intent intent = new Intent(itemActivity, (Class<?>) SeriesActivity.class);
                Posts posts = (Posts) this.f322u;
                PostsSeries series = posts.getSeries();
                p210v8.i.c(series);
                intent.putExtra("id", series.getId());
                PostsSeries series2 = posts.getSeries();
                p210v8.i.c(series2);
                intent.putExtra("title", series2.getTitle());
                itemActivity.startActivity(intent);
                return p076h8.m.a;
            case 4:
                ((SimpleSearchView) ((SearchActivity) this.f321t).A().f2077k).getSearchEditText().setText((String) this.f322u);
                return p076h8.m.a;
            case 5:
                ((X2.h) this.f321t).dismiss();
                SearchByGenreActivity searchByGenreActivity = (SearchByGenreActivity) this.f322u;
                ((ChipGroup) searchByGenreActivity.z().f14979t).removeAllViews();
                ((ProgressBar) searchByGenreActivity.z().f14980u).setVisibility(0);
                ((RelativeLayout) searchByGenreActivity.z().f14981v).setVisibility(8);
                ((RecyclerView) searchByGenreActivity.z().f14982w).setVisibility(8);
                AbstractC0342z.n(searchByGenreActivity, null, new E4.K(searchByGenreActivity, null), 3);
                ArrayList arrayList5 = searchByGenreActivity.f10221Y;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj : arrayList5) {
                    if (p210v8.i.a(((SearchListGenresData) obj).getActive(), Boolean.TRUE)) {
                        arrayList6.add(obj);
                    }
                }
                for (SearchListGenresData searchListGenresData : p086i8.k.p0(arrayList6, 5)) {
                    View viewInflate = searchByGenreActivity.getLayoutInflater().inflate(R.layout.widget_chip, (ViewGroup) null);
                    p210v8.i.d(viewInflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
                    Chip chip = (Chip) viewInflate;
                    chip.setText(searchListGenresData.getName());
                    ((ChipGroup) searchByGenreActivity.z().f14979t).addView(chip);
                }
                return p076h8.m.a;
            case 6:
                F8.F f10 = (F8.F) this.f321t;
                F8.D d3 = f10.f1515t;
                d3.getClass();
                String str3 = (String) this.f322u;
                String str4 = f10.f1516u;
                p210v8.i.f(str4, InAppPurchaseMetaData.KEY_SIGNATURE);
                Collection collectionS0 = str3.equals("<init>") ? p086i8.k.s0(d3.d()) : d3.e(p096j9.f.j(str3));
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : collectionS0) {
                    if (p210v8.i.a(w0.c((InterfaceC0285t) obj2).d(), str4)) {
                        arrayList7.add(obj2);
                    }
                }
                if (arrayList7.size() == 1) {
                    return (InterfaceC0285t) p086i8.k.k0(arrayList7);
                }
                String strZ = p086i8.k.Z(collectionS0, "\n", null, null, C0208b.f1562x, 30);
                StringBuilder sb = new StringBuilder("Function '");
                sb.append(str3);
                sb.append("' (JVM signature: ");
                sb.append(str4);
                sb.append(") not resolved in ");
                sb.append(d3);
                sb.append(':');
                sb.append(strZ.length() == 0 ? " no members found" : "\n".concat(strZ));
                throw new p0(sb.toString(), 0);
            case 7:
                m0 m0Var = (m0) this.f321t;
                List listL = m0Var.a.l();
                if (listL.isEmpty()) {
                    return p086i8.s.f12328s;
                }
                p076h8.d dVarR = D3.b.r(p076h8.e.f11786s, new l0(m0Var, 0));
                List list = listL;
                ArrayList arrayList8 = new ArrayList(p086i8.m.H(list, 10));
                int i10 = 0;
                for (Object obj3 : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        p086i8.l.G();
                        throw null;
                    }
                    S s9 = (S) obj3;
                    if (s9.c()) {
                        xVar = C8.x.f962c;
                    } else {
                        AbstractC0151y abstractC0151yB = s9.b();
                        p210v8.i.e(abstractC0151yB, "typeProjection.type");
                        m0 m0Var2 = new m0(abstractC0151yB, ((p210v8.k) this.f322u) != null ? new p220w9.m(m0Var, i10, dVarR) : null);
                        int iD = p239z.e.d(s9.a());
                        if (iD == 0) {
                            xVar = new C8.x(C8.y.f964s, m0Var2);
                        } else if (iD == 1) {
                            xVar = new C8.x(C8.y.f965t, m0Var2);
                        } else {
                            if (iD != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            xVar = new C8.x(C8.y.f966u, m0Var2);
                        }
                    }
                    arrayList8.add(xVar);
                    i10 = i11;
                }
                return arrayList8;
            case 8:
                View view = (View) this.f321t;
                Intent intent2 = new Intent(view.getContext(), (Class<?>) ItemActivity.class);
                RecentItem recentItem = (RecentItem) this.f322u;
                intent2.putExtra("id", recentItem.getId());
                intent2.putExtra("title", recentItem.getTitle());
                intent2.putExtra("image", recentItem.getImage());
                view.getContext().startActivity(intent2);
                return p076h8.m.a;
            case 9:
                View view2 = (View) this.f321t;
                Context context = view2.getContext();
                Intent intent3 = new Intent(view2.getContext(), (Class<?>) RecentCategoryActivity.class);
                String category = ((RecentPost) this.f322u).getCategory();
                switch (category.hashCode()) {
                    case -2137001205:
                        if (category.equals("Hentai")) {
                            intent3.putExtra("id", 2);
                            intent3.putExtra(MediationMetaData.KEY_NAME, "Hentai");
                        }
                        break;
                    case 73215:
                        if (category.equals("JAV")) {
                            intent3.putExtra("id", 4);
                            intent3.putExtra(MediationMetaData.KEY_NAME, "JAV");
                        }
                        break;
                    case 1054434202:
                        if (category.equals("3D Hentai")) {
                            intent3.putExtra("id", 81);
                            intent3.putExtra(MediationMetaData.KEY_NAME, "3D Hentai");
                        }
                        break;
                    case 1354573590:
                        if (category.equals("2D Animation")) {
                            intent3.putExtra("id", 682);
                            intent3.putExtra(MediationMetaData.KEY_NAME, "2D Animation");
                        }
                        break;
                    case 2014893050:
                        if (category.equals("JAV Cosplay")) {
                            intent3.putExtra("id", 1);
                            intent3.putExtra(MediationMetaData.KEY_NAME, "JAV Cosplay");
                        }
                        break;
                }
                context.startActivity(intent3);
                return p076h8.m.a;
            case 10:
                GetListResult getListResult = (GetListResult) this.f321t;
                boolean zA = p210v8.i.a(getListResult.getType(), "hentai");
                View view3 = (View) this.f322u;
                if (zA) {
                    Context context2 = view3.getContext();
                    Intent intent4 = new Intent(view3.getContext(), (Class<?>) SeriesActivity.class);
                    intent4.putExtra("id", getListResult.getId());
                    intent4.putExtra("title", getListResult.getTitle());
                    intent4.putExtra("image", getListResult.getImage());
                    context2.startActivity(intent4);
                } else {
                    Context context3 = view3.getContext();
                    Intent intent5 = new Intent(view3.getContext(), (Class<?>) ItemActivity.class);
                    intent5.putExtra("id", getListResult.getId());
                    intent5.putExtra("title", getListResult.getTitle());
                    intent5.putExtra("image", getListResult.getImage());
                    context3.startActivity(intent5);
                }
                return p076h8.m.a;
            case 11:
                View view4 = (View) this.f321t;
                Intent intent6 = new Intent(view4.getContext(), (Class<?>) SearchByGenreActivity.class);
                SearchListGenresData searchListGenresData2 = (SearchListGenresData) this.f322u;
                intent6.putExtra("termSingleId", searchListGenresData2.getId());
                intent6.putExtra("termSingleName", searchListGenresData2.getName());
                view4.getContext().startActivity(intent6);
                return p076h8.m.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                SearchResult searchResult = (SearchResult) this.f321t;
                String type = searchResult.getType();
                boolean zA2 = p210v8.i.a(type, "hentai");
                View view5 = (View) this.f322u;
                if (zA2) {
                    Intent intent7 = new Intent(view5.getContext(), (Class<?>) SeriesActivity.class);
                    intent7.putExtra("id", searchResult.getId());
                    intent7.putExtra("title", searchResult.getTitle());
                    intent7.putExtra("image", searchResult.getImage());
                    view5.getContext().startActivity(intent7);
                } else if (p210v8.i.a(type, "post")) {
                    Intent intent8 = new Intent(view5.getContext(), (Class<?>) ItemActivity.class);
                    intent8.putExtra("id", searchResult.getId());
                    intent8.putExtra("title", searchResult.getTitle());
                    intent8.putExtra("image", searchResult.getImage());
                    intent8.putExtra("slug", searchResult.getSlug());
                    view5.getContext().startActivity(intent8);
                }
                return p076h8.m.a;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                SearchByGenreResult searchByGenreResult = (SearchByGenreResult) this.f321t;
                boolean zA3 = p210v8.i.a(searchByGenreResult.getType(), "hentai");
                View view6 = (View) this.f322u;
                if (zA3) {
                    Intent intent9 = new Intent(view6.getContext(), (Class<?>) SeriesActivity.class);
                    intent9.putExtra("id", searchByGenreResult.getId());
                    intent9.putExtra("title", searchByGenreResult.getTitle());
                    view6.getContext().startActivity(intent9);
                } else {
                    Intent intent10 = new Intent(view6.getContext(), (Class<?>) ItemActivity.class);
                    intent10.putExtra("id", searchByGenreResult.getId());
                    intent10.putExtra("title", searchByGenreResult.getTitle());
                    intent10.putExtra("slug", searchByGenreResult.getSlug());
                    intent10.putExtra("image", searchByGenreResult.getImage());
                    view6.getContext().startActivity(intent10);
                }
                return p076h8.m.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                View view7 = (View) this.f321t;
                Intent intent11 = new Intent(view7.getContext(), (Class<?>) ItemActivity.class);
                SeriesEpisode seriesEpisode = (SeriesEpisode) this.f322u;
                intent11.putExtra("id", seriesEpisode.getId());
                intent11.putExtra("title", seriesEpisode.getTitle());
                intent11.putExtra("slug", seriesEpisode.getSlug());
                intent11.putExtra("image", seriesEpisode.getImage());
                view7.getContext().startActivity(intent11);
                return p076h8.m.a;
            case 15:
                StringBuilder sb2 = new StringBuilder();
                sb2.append('@');
                sb2.append(((Class) this.f321t).getCanonicalName());
                p086i8.k.Y(((Map) this.f322u).entrySet(), sb2, ", ", "(", ")", G8.c.f1727s, 48);
                String string = sb2.toString();
                p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            case 16:
                View view8 = (View) this.f321t;
                p041e3.b bVar3 = new p041e3.b(view8.getContext());
                J4.e eVar = (J4.e) this.f322u;
                String strConcat = eVar.a.concat("\n");
                C0650g c0650g = (C0650g) bVar3.f123t;
                c0650g.f12044f = strConcat;
                bVar3.h("Buka", new J4.f(eVar, 0));
                J4.g gVar = new J4.g(0, view8, eVar);
                c0650g.f12048k = "Hapus";
                c0650g.f12049l = gVar;
                bVar3.i("Tutup", new F4.c(5));
                bVar3.g();
                return p076h8.m.a;
            case 17:
                ((C0159g) this.f321t).f683l.I();
                ((Dialog) this.f322u).dismiss();
                return p076h8.m.a;
            case 18:
                K8.g gVar2 = (K8.g) this.f321t;
                p200u8.b bVar4 = gVar2.f2645b;
                O8.C c10 = gVar2.a;
                InterfaceC0276j interfaceC0276j = (InterfaceC0276j) bVar4.invoke(c10);
                p096j9.f fVar = K8.g.f2643g;
                List listU = com.bumptech.glide.d.u(c10.f3622v.e());
                p247z9.l lVar = (p247z9.l) this.f322u;
                C0357m c0357m = new C0357m(interfaceC0276j, fVar, 4, 2, listU, lVar);
                c0357m.l(new K8.a(lVar, c0357m), p086i8.u.f12330s, null);
                return c0357m;
            case 19:
                K8.i iVar14 = (K8.i) this.f321t;
                O8.C cK = iVar14.k();
                p210v8.i.e(cK, "builtInsModule");
                return new K8.n(cK, (p247z9.l) this.f322u, new A0.r(iVar14, 16));
            case 20:
                K8.n nVar = (K8.n) this.f321t;
                O8.C c11 = nVar.g().a;
                K8.g.f2640d.getClass();
                return AbstractC0287v.f(c11, K8.g.f2644h, new p140o4.r((p247z9.l) this.f322u, nVar.g().a)).p();
            case MobileAdsBridge.CODE_21 /* 21 */:
                Y8.j jVar = (Y8.j) this.f321t;
                Fa.e eVar2 = jVar.f5757B;
                I4.a aVar = (I4.a) eVar2.f1659t;
                Fa.e eVar3 = new Fa.e(new I4.a((p247z9.l) aVar.a, (P0.d) aVar.f2047b, (p040e1.j) aVar.f2048c, (p029c9.d) aVar.f2049d, (V8.h) aVar.f2050e, (Q8.d) aVar.f2051f, (V8.h) aVar.f2053h, (p170r3.e) aVar.f2054i, (Q8.d) aVar.j, (V.h) aVar.f2055k, (p029c9.e) aVar.f2056l, (L8.N) aVar.f2057m, (T8.a) aVar.f2058n, (O8.C) aVar.f2059o, (I8.m) aVar.f2060p, (C0442c) aVar.f2061q, (p019b9.d) aVar.f2062r, (U8.m) aVar.f2063s, (X8.a) aVar.f2064t, (B9.m) aVar.f2065u, (U8.t) aVar.f2066v, (p029c9.e) aVar.f2067w), (X8.d) eVar2.f1660u, eVar2.f1661v);
                InterfaceC0276j interfaceC0276jV = jVar.v();
                p210v8.i.e(interfaceC0276jV, "containingDeclaration");
                return new Y8.j(eVar3, interfaceC0276jV, jVar.f5771z, (InterfaceC0271e) this.f322u);
            case 22:
                O8.Q q10 = (O8.Q) this.f321t;
                p247z9.l lVar2 = q10.f3682V;
                C0355k c0355k = (C0355k) this.f322u;
                M8.h hVarQ = c0355k.q();
                C0355k c0355k2 = (C0355k) this.f322u;
                int iV = c0355k2.V();
                AbstractC0487g.u(iV, "underlyingConstructorDescriptor.kind");
                p238y9.q qVar = q10.f3683W;
                L8.M mG = qVar.g();
                p210v8.i.e(mG, "typeAliasDescriptor.source");
                O8.Q q11 = new O8.Q(lVar2, q10.f3683W, c0355k, q10, hVarQ, iV, mG);
                O8.Q.f3681Y.getClass();
                Z zD = qVar.Z0() == null ? null : Z.d(qVar.a1());
                if (zD == null) {
                    return null;
                }
                O8.x xVar2 = c0355k2.f3766B;
                O8.x xVarJ = xVar2 != null ? xVar2.j(zD) : null;
                List listB0 = c0355k2.b0();
                p210v8.i.e(listB0, "underlyingConstructorDes…contextReceiverParameters");
                List list2 = listB0;
                ArrayList arrayList9 = new ArrayList(p086i8.m.H(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList9.add(((O8.x) it3.next()).j(zD));
                }
                List listY = qVar.y();
                List listH0 = q10.H0();
                AbstractC0151y abstractC0151y = q10.f3787y;
                p210v8.i.c(abstractC0151y);
                q11.e1(null, xVarJ, arrayList9, listY, listH0, abstractC0151y, 1, qVar.f16124w);
                return q11;
            case 23:
                D dP = ((O8.C) ((I4.a) ((Fa.e) this.f321t).f1659t).f2059o).f3622v.i(((V8.b) this.f322u).a).p();
                p210v8.i.e(dP, "c.module.builtIns.getBui…qName(fqName).defaultType");
                return dP;
            case 24:
                M8.h hVarQ2 = ((InterfaceC0272f) this.f322u).q();
                Fa.e eVar4 = (Fa.e) this.f321t;
                p210v8.i.f(eVar4, "<this>");
                p210v8.i.f(hVarQ2, "additionalAnnotations");
                return ((C0442c) ((I4.a) eVar4.f1659t).f2061q).b((U8.u) eVar4.f1662w.getValue(), hVarQ2);
            case 25:
                Fa.e eVar5 = (Fa.e) this.f321t;
                p210v8.i.f(eVar5, "<this>");
                M8.h hVar2 = (M8.h) this.f322u;
                p210v8.i.f(hVar2, "additionalAnnotations");
                return ((C0442c) ((I4.a) eVar5.f1659t).f2061q).b((U8.u) eVar5.f1662w.getValue(), hVar2);
            case 26:
                return new Y8.r(((X8.c) this.f321t).a, (R8.x) this.f322u);
            case 27:
                P0.d dVar = (P0.d) ((I4.a) ((Fa.e) this.f321t).f1659t).f2047b;
                p096j9.c cVar2 = ((Y8.w) this.f322u).f5808o.f3634w;
                dVar.getClass();
                p210v8.i.f(cVar2, "packageFqName");
                return null;
            case 28:
                Context context4 = (Context) this.f321t;
                p210v8.i.e(context4, "applicationContext");
                String str5 = ((p060g0.b) this.f322u).a;
                p210v8.i.f(str5, MediationMetaData.KEY_NAME);
                String strK = p210v8.i.k(".preferences_pb", str5);
                p210v8.i.f(strK, "fileName");
                return new File(context4.getApplicationContext().getFilesDir(), p210v8.i.k(strK, "datastore/"));
            default:
                V3.b bVar5 = (V3.b) ((b1) this.f321t).f14037t;
                return ((p220w9.a) ((I4.c) bVar5.a).f2082e).k0((p047e9.Q) this.f322u, (p067g9.f) bVar5.f5172b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A(m0 m0Var, p200u8.a aVar) {
        super(0);
        this.f320s = 7;
        this.f321t = m0Var;
        this.f322u = (p210v8.k) aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(Object obj, int i10, Object obj2) {
        super(0);
        this.f320s = i10;
        this.f321t = obj;
        this.f322u = obj2;
    }
}
