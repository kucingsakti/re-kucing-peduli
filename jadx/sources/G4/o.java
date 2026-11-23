package G4;

import A9.A;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.SeriesEpisode;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Ga.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public o(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_post_list_horizontal, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        SeriesEpisode seriesEpisode = (SeriesEpisode) obj;
        p210v8.i.f(seriesEpisode, "item");
        View view = this.f7003s;
        o1.k kVarE = o1.k.e(view);
        ((MaterialTextView) kVarE.f13639t).setText(seriesEpisode.getTitle());
        ImageView imageView = (ImageView) kVarE.f13638s;
        D3.b.t(imageView, seriesEpisode.getImage());
        imageView.setClipToOutline(true);
        D3.b.e(view, new A(view, 14, seriesEpisode));
    }
}
