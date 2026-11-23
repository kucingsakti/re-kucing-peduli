package E4;

import A1.C0099h;
import B4.C0159g;
import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import android.os.Build;
import android.text.Html;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.activity.ItemActivity;
import com.kcstream.cing.model.Posts;
import com.kcstream.cing.model.PostsDownload;
import com.kcstream.cing.model.PostsSeries;
import com.kcstream.cing.model.PostsStream;
import java.util.Locale;
import retrofit2.HttpException;

/* JADX INFO: renamed from: E4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0203q extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ItemActivity f1432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1433t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ItemActivity f1434u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1435v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203q(ItemActivity itemActivity, int i10, p123m8.d dVar) {
        super(2, dVar);
        this.f1434u = itemActivity;
        this.f1435v = i10;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new C0203q(this.f1434u, this.f1435v, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((C0203q) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ItemActivity itemActivity;
        int i10 = 0;
        int i11 = 1;
        p134n8.a aVar = p134n8.a.f13404s;
        int i12 = this.f1433t;
        ItemActivity itemActivity2 = this.f1434u;
        try {
            if (i12 == 0) {
                J7.a.v(obj);
                U9.c cVar = N9.I.f3415c;
                C0202p c0202p = new C0202p(itemActivity2, this.f1435v, null);
                this.f1432s = itemActivity2;
                this.f1433t = 1;
                obj = AbstractC0342z.w(cVar, c0202p, this);
                if (obj == aVar) {
                    return aVar;
                }
                itemActivity = itemActivity2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                itemActivity = this.f1432s;
                J7.a.v(obj);
            }
            itemActivity.c0 = (Posts) obj;
            Posts posts = itemActivity2.c0;
            if (posts != null) {
                new C0099h(16).l(itemActivity2, (RelativeLayout) itemActivity2.C().f2048c, itemActivity2.f2592R);
                new C0099h(16).m(itemActivity2, (RelativeLayout) itemActivity2.C().f2049d, itemActivity2.f2593S);
                Integer id = posts.getId();
                p210v8.i.c(id);
                itemActivity2.f10186g0 = id.intValue();
                String image = posts.getImage();
                p210v8.i.c(image);
                itemActivity2.f10188i0 = image;
                itemActivity2.f10187h0 = posts.getTitle();
                MenuItem menuItem = itemActivity2.f10184d0;
                if (menuItem != null) {
                    menuItem.setEnabled(true);
                }
                ((MaterialTextView) itemActivity2.C().f2063s).setText(posts.getTitle());
                int i13 = ItemActivity.f10182n0;
                ((MaterialTextView) itemActivity2.C().f2058n).setText(C8.E.l(posts.getDate(), "yyyy-MM-dd HH:mm:ss", new Locale("id", "ID")));
                String streamNote = posts.getStreamNote();
                if (streamNote != null) {
                    if (streamNote.length() <= 0) {
                        streamNote = null;
                    }
                    if (streamNote != null) {
                        ((MaterialTextView) itemActivity2.C().f2064t).setVisibility(0);
                        ((MaterialTextView) itemActivity2.C().f2064t).setText(streamNote);
                    }
                }
                if (posts.getSeries() != null) {
                    ((MaterialCardView) itemActivity2.C().f2056l).setVisibility(0);
                    MaterialTextView materialTextView = (MaterialTextView) itemActivity2.C().f2059o;
                    PostsSeries series = posts.getSeries();
                    p210v8.i.c(series);
                    String content = series.getContent();
                    materialTextView.setText(content != null ? o1.f.l(content).P() : null);
                    MaterialTextView materialTextView2 = (MaterialTextView) itemActivity2.C().f2060p;
                    String note = posts.getNote();
                    p210v8.i.c(note);
                    if (note.length() > 0) {
                        ((MaterialCardView) itemActivity2.C().f2055k).setVisibility(0);
                        materialTextView2.setText(posts.getNote());
                    }
                    MaterialTextView materialTextView3 = (MaterialTextView) itemActivity2.C().f2062r;
                    PostsSeries series2 = posts.getSeries();
                    p210v8.i.c(series2);
                    materialTextView3.setText(series2.getTitle());
                    MaterialTextView materialTextView4 = (MaterialTextView) itemActivity2.C().f2061q;
                    PostsSeries series3 = posts.getSeries();
                    p210v8.i.c(series3);
                    materialTextView4.setText(series3.getGenre());
                    ((ImageView) itemActivity2.C().f2065u).setClipToOutline(true);
                    ImageView imageView = (ImageView) itemActivity2.C().f2065u;
                    PostsSeries series4 = posts.getSeries();
                    p210v8.i.c(series4);
                    D3.b.t(imageView, series4.getImage());
                    D3.b.e((LinearLayout) itemActivity2.C().f2054i, new A9.A(itemActivity2, 3, posts));
                } else {
                    MaterialTextView materialTextView5 = (MaterialTextView) itemActivity2.C().f2059o;
                    String content2 = posts.getContent();
                    p210v8.i.c(content2);
                    materialTextView5.setText(Build.VERSION.SDK_INT >= 24 ? S.c.a(content2, 0) : Html.fromHtml(content2));
                    ((LinearLayout) itemActivity2.C().f2053h).setVisibility(8);
                }
                if (posts.getStream().isEmpty()) {
                    ((RelativeLayout) itemActivity2.C().f2050e).setVisibility(8);
                } else {
                    String link = ((PostsStream) posts.getStream().get(0)).getLink();
                    p210v8.i.c(link);
                    itemActivity2.f0 = link;
                    C0159g c0159g = itemActivity2.f10189j0;
                    if (c0159g == null) {
                        p210v8.i.n("agentWeb");
                        throw null;
                    }
                    c0159g.f682k.s(link);
                    int i14 = 0;
                    for (Object obj2 : posts.getStream()) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            p086i8.l.G();
                            throw null;
                        }
                        PostsStream postsStream = (PostsStream) obj2;
                        if (!p210v8.i.a(postsStream.getLink(), "") || postsStream.getLink() != null) {
                            Chip chip = new Chip(itemActivity2, null);
                            chip.setText("Stream " + i15);
                            chip.setOnClickListener(new ViewOnClickListenerC0201o(i10, itemActivity2, postsStream));
                            ((ChipGroup) itemActivity2.C().f2052g).addView(chip);
                        }
                        i14 = i15;
                    }
                }
                if (posts.getDownload().isEmpty()) {
                    ((MaterialCardView) itemActivity2.C().j).setVisibility(8);
                } else {
                    for (PostsDownload postsDownload : posts.getDownload()) {
                        Chip chip2 = new Chip(itemActivity2, null);
                        chip2.setText(postsDownload.getType());
                        chip2.setOnClickListener(new ViewOnClickListenerC0201o(i11, itemActivity2, postsDownload));
                        ((ChipGroup) itemActivity2.C().f2051f).addView(chip2);
                    }
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) itemActivity2.C().f2057m;
                floatingActionButton.setVisibility(0);
                floatingActionButton.setOnClickListener(new ViewOnClickListenerC0201o(2, itemActivity2, posts));
                ((ProgressBar) itemActivity2.C().f2066v).setVisibility(8);
                ((LinearLayout) itemActivity2.C().f2053h).setVisibility(0);
                J7.j jVarL = itemActivity2.l();
                if (jVarL != null) {
                    jVarL.R(itemActivity2.f10187h0);
                }
            }
        } catch (HttpException unused) {
        }
        return p076h8.m.a;
    }
}
