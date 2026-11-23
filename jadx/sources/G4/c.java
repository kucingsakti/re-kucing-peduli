package G4;

import C8.E;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.NewReleaseItem;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Ga.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public c(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parentView");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_activity_newrelease, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        NewReleaseItem newReleaseItem = (NewReleaseItem) obj;
        p210v8.i.f(newReleaseItem, "item");
        View view = this.f7003s;
        int i10 = R.id.iv_cover;
        ImageView imageView = (ImageView) oa.b.c(view, R.id.iv_cover);
        if (imageView != null) {
            i10 = R.id.tv_episode;
            MaterialTextView materialTextView = (MaterialTextView) oa.b.c(view, R.id.tv_episode);
            if (materialTextView != null) {
                i10 = R.id.tv_releasedate;
                MaterialTextView materialTextView2 = (MaterialTextView) oa.b.c(view, R.id.tv_releasedate);
                if (materialTextView2 != null) {
                    i10 = R.id.tv_title;
                    MaterialTextView materialTextView3 = (MaterialTextView) oa.b.c(view, R.id.tv_title);
                    if (materialTextView3 != null) {
                        materialTextView3.setText(newReleaseItem.getTitle());
                        imageView.setClipToOutline(true);
                        String release_date = newReleaseItem.getRelease_date();
                        p210v8.i.c(release_date);
                        materialTextView2.setText(E.l(release_date, "dd MMMM yyyy", new Locale("id", "ID")));
                        materialTextView.setText(newReleaseItem.getEpisode());
                        D3.b.t(imageView, newReleaseItem.getImage());
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
