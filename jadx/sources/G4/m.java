package G4;

import A9.A;
import C8.E;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.SearchResult;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Ga.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public m(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_activity_search, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        SearchResult searchResult = (SearchResult) obj;
        p210v8.i.f(searchResult, "item");
        View view = this.f7003s;
        int i10 = R.id.search_item_date;
        MaterialTextView materialTextView = (MaterialTextView) oa.b.c(view, R.id.search_item_date);
        if (materialTextView != null) {
            i10 = R.id.search_item_image;
            ImageView imageView = (ImageView) oa.b.c(view, R.id.search_item_image);
            if (imageView != null) {
                i10 = R.id.search_item_title;
                MaterialTextView materialTextView2 = (MaterialTextView) oa.b.c(view, R.id.search_item_title);
                if (materialTextView2 != null) {
                    materialTextView2.setText(searchResult.getTitle());
                    String date = searchResult.getDate();
                    p210v8.i.c(date);
                    Locale locale = Locale.ENGLISH;
                    p210v8.i.e(locale, "ENGLISH");
                    materialTextView.setText(E.l(date, "MMMM dd, yyyy", locale));
                    D3.b.t(imageView, searchResult.getImage());
                    imageView.setClipToOutline(true);
                    D3.b.e(view, new A(searchResult, 12, view));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
