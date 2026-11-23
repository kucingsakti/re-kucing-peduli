package G4;

import A9.A;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.SearchListGenresData;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Ga.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public l(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_activity_search_genre, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        SearchListGenresData searchListGenresData = (SearchListGenresData) obj;
        p210v8.i.f(searchListGenresData, "item");
        View view = this.f7003s;
        MaterialTextView materialTextView = (MaterialTextView) oa.b.c(view, R.id.tv_name);
        if (materialTextView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_name)));
        }
        materialTextView.setText(searchListGenresData.getName());
        D3.b.e(view, new A(view, 11, searchListGenresData));
    }
}
