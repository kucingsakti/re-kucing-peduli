package G4;

import C8.E;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.AllListResult;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Ga.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public e(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_post_list, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        AllListResult allListResult = (AllListResult) obj;
        p210v8.i.f(allListResult, "item");
        View view = this.f7003s;
        int i10 = R.id.itemDate;
        MaterialTextView materialTextView = (MaterialTextView) oa.b.c(view, R.id.itemDate);
        if (materialTextView != null) {
            i10 = R.id.itemImage;
            ImageView imageView = (ImageView) oa.b.c(view, R.id.itemImage);
            if (imageView != null) {
                i10 = R.id.itemTitle;
                MaterialTextView materialTextView2 = (MaterialTextView) oa.b.c(view, R.id.itemTitle);
                if (materialTextView2 != null) {
                    materialTextView2.setMaxLines(2);
                    materialTextView2.setText(allListResult.getTitle());
                    String date = allListResult.getDate();
                    p210v8.i.c(date);
                    materialTextView.setText(E.l(date, "yyyy-MM-dd HH:mm:ss", new Locale("id", "ID")));
                    imageView.setClipToOutline(true);
                    D3.b.t(imageView, allListResult.getImage());
                    D3.b.e(view, new A0.j(this, allListResult, view, 4));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
