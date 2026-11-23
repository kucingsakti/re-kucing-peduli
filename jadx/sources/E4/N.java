package E4;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.activity.SeriesActivity;
import com.kcstream.cing.model.Series;
import com.kcstream.cing.model.SeriesEpisode;
import com.kcstream.cing.model.SeriesInfoMetaGenre;
import java.util.List;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class N extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SeriesActivity f1383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1384t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SeriesActivity f1385u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(SeriesActivity seriesActivity, p123m8.d dVar) {
        super(2, dVar);
        this.f1385u = seriesActivity;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new N(this.f1385u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        SeriesActivity seriesActivity;
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f1384t;
        SeriesActivity seriesActivity2 = this.f1385u;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                U9.c cVar = N9.I.f3415c;
                M m2 = new M(seriesActivity2, null);
                this.f1383s = seriesActivity2;
                this.f1384t = 1;
                obj = AbstractC0342z.w(cVar, m2, this);
                if (obj == aVar) {
                    return aVar;
                }
                seriesActivity = seriesActivity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                seriesActivity = this.f1383s;
                J7.a.v(obj);
            }
            seriesActivity.f10225W = (Series) obj;
            Series series = seriesActivity2.f10225W;
            if (series != null) {
                Integer id = series.getId();
                p210v8.i.c(id);
                seriesActivity2.f10228Z = id.intValue();
                String title = series.getTitle();
                p210v8.i.c(title);
                seriesActivity2.f10230b0 = title;
                String image = series.getImage();
                p210v8.i.c(image);
                seriesActivity2.f10229a0 = image;
                D3.b.t((ImageView) seriesActivity2.z().f2087k, series.getImage());
                com.bumptech.glide.l lVarG = com.bumptech.glide.b.b(seriesActivity2).f7591w.g(seriesActivity2);
                String image2 = series.getImage();
                lVarG.getClass();
                com.bumptech.glide.j jVar = (com.bumptech.glide.j) new com.bumptech.glide.j(lVarG.f7632s, lVarG, Drawable.class, lVarG.f7633t).A(image2).e(A1.p.f159b);
                J1.b bVar = new J1.b();
                bVar.f7670s = new P0.d(5, false);
                jVar.B(bVar).a((Q1.e) new Q1.e().r(new p056f8.a(), true)).y((ImageView) seriesActivity2.z().j);
                ((MaterialTextView) seriesActivity2.z().f2094r).setText(series.getTitle());
                ((MaterialTextView) seriesActivity2.z().f2088l).setText(series.getDescription());
                ((RelativeLayout) seriesActivity2.z().f2081d).setOnClickListener(new L(seriesActivity2, 0));
                ((MaterialTextView) seriesActivity2.z().f2090n).setText(series.getInfo_meta().getEpisode());
                ((MaterialTextView) seriesActivity2.z().f2093q).setText(series.getInfo_meta().getStatus());
                ((MaterialTextView) seriesActivity2.z().f2091o).setText(series.getInfo_meta().getProduser());
                ((MaterialTextView) seriesActivity2.z().f2089m).setText(series.getInfo_meta().getDurasi());
                ((MaterialTextView) seriesActivity2.z().f2092p).setText(series.getInfo_meta().getSkor());
                List genre = series.getInfo_meta().getGenre();
                if (genre != null && !genre.isEmpty()) {
                    for (SeriesInfoMetaGenre seriesInfoMetaGenre : series.getInfo_meta().getGenre()) {
                        Chip chip = new Chip(seriesActivity2, null);
                        chip.setText(seriesInfoMetaGenre.getName());
                        D3.b.e(chip, new A0.j(seriesActivity2, chip, seriesInfoMetaGenre, 2));
                        ((ChipGroup) seriesActivity2.z().f2083f).addView(chip);
                    }
                }
                List listEpisode = series.getListEpisode();
                if (listEpisode != null && !listEpisode.isEmpty()) {
                    List listEpisode2 = series.getListEpisode();
                    p210v8.i.g(listEpisode2, "items");
                    if (!p086i8.C.q(listEpisode2)) {
                        listEpisode2 = p086i8.k.t0(listEpisode2);
                    }
                    p188t1.G g8 = new p188t1.G(new Ca.c(p210v8.x.b(listEpisode2)));
                    p210v8.v vVar = p210v8.u.a;
                    g8.x(vVar.b(SeriesEpisode.class), vVar.b(G4.o.class));
                    g8.f14978s = new LinearLayoutManager(0);
                    g8.r((RecyclerView) seriesActivity2.z().f2095s);
                }
                ((ProgressBar) seriesActivity2.z().f2086i).setVisibility(8);
                ((LinearLayout) seriesActivity2.z().f2084g).setVisibility(0);
            }
        } catch (HttpException unused) {
        }
        return p076h8.m.a;
    }
}
