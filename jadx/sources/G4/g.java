package G4;

import A9.A;
import J0.C0264n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.RecentItem;
import com.kcstream.cing.model.RecentPost;
import java.util.List;
import p086i8.C;
import p188t1.G;
import p210v8.u;
import p210v8.v;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Ga.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public g(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_activity_main_fragment_home_recent, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        RecentPost recentPost = (RecentPost) obj;
        p210v8.i.f(recentPost, "item");
        View view = this.f7003s;
        int i10 = R.id.card;
        if (((MaterialCardView) oa.b.c(view, R.id.card)) != null) {
            i10 = R.id.recycler_view_home_recent_posts;
            RecyclerView recyclerView = (RecyclerView) oa.b.c(view, R.id.recycler_view_home_recent_posts);
            if (recyclerView != null) {
                i10 = R.id.tx_category;
                MaterialTextView materialTextView = (MaterialTextView) oa.b.c(view, R.id.tx_category);
                if (materialTextView != null) {
                    i10 = R.id.tx_viewall;
                    Button button = (Button) oa.b.c(view, R.id.tx_viewall);
                    if (button != null) {
                        materialTextView.setText(recentPost.getCategory());
                        D3.b.e(button, new A(view, 9, recentPost));
                        if (recyclerView.getOnFlingListener() == null) {
                            new C0264n(0).a(recyclerView);
                        }
                        List data = recentPost.getData();
                        p210v8.i.g(data, "items");
                        if (!C.q(data)) {
                            data = p086i8.k.t0(data);
                        }
                        G g8 = new G(new Ca.c(x.b(data)));
                        v vVar = u.a;
                        g8.x(vVar.b(RecentItem.class), vVar.b(f.class));
                        recyclerView.getContext();
                        g8.f14978s = new LinearLayoutManager(0);
                        g8.r(recyclerView);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
