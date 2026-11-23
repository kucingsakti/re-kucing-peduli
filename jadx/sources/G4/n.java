package G4;

import A9.A;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.SearchByGenreResult;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Ga.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public n(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_activity_searchbygenre, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        SearchByGenreResult searchByGenreResult = (SearchByGenreResult) obj;
        p210v8.i.f(searchByGenreResult, "item");
        View view = this.f7003s;
        o1.e eVarD0 = o1.e.D0(view);
        ((MaterialTextView) eVarD0.f13628u).setText(searchByGenreResult.getTitle());
        ImageView imageView = (ImageView) eVarD0.f13627t;
        D3.b.t(imageView, searchByGenreResult.getImage());
        imageView.setClipToOutline(true);
        D3.b.e(view, new A(searchByGenreResult, 13, view));
    }
}
