package G4;

import A9.A;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.RecentItem;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Ga.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public f(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_post_list_horizontal, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        RecentItem recentItem = (RecentItem) obj;
        p210v8.i.f(recentItem, "item");
        View view = this.f7003s;
        o1.k kVarE = o1.k.e(view);
        ((MaterialTextView) kVarE.f13639t).setText(recentItem.getTitle());
        ImageView imageView = (ImageView) kVarE.f13638s;
        imageView.setClipToOutline(true);
        D3.b.t(imageView, recentItem.getImage());
        D3.b.e(view, new A(view, 8, recentItem));
    }
}
