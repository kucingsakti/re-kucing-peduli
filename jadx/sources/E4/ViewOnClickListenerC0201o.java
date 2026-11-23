package E4;

import A1.C0099h;
import B4.C0159g;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.activity.CommentsActivity;
import com.kcstream.cing.activity.ItemActivity;
import com.kcstream.cing.activity.SeriesActivity;
import com.kcstream.cing.model.Posts;
import com.kcstream.cing.model.PostsDownload;
import com.kcstream.cing.model.PostsDownloadLinks;
import com.kcstream.cing.model.PostsStream;
import com.kcstream.cing.model.RecentItem;

/* JADX INFO: renamed from: E4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0201o implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f1427t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1428u;

    public /* synthetic */ ViewOnClickListenerC0201o(int i10, KeyEvent.Callback callback, Object obj) {
        this.f1426s = i10;
        this.f1427t = callback;
        this.f1428u = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1426s) {
            case 0:
                String link = ((PostsStream) this.f1428u).getLink();
                ItemActivity itemActivity = (ItemActivity) this.f1427t;
                itemActivity.f0 = link;
                C0159g c0159g = itemActivity.f10189j0;
                if (c0159g != null) {
                    c0159g.f682k.s(link);
                    return;
                } else {
                    p210v8.i.n("agentWeb");
                    throw null;
                }
            case 1:
                ItemActivity itemActivity2 = (ItemActivity) this.f1427t;
                if (itemActivity2.isFinishing()) {
                    return;
                }
                C0099h c0099hJ = C0099h.j(itemActivity2.getLayoutInflater());
                PostsDownload postsDownload = (PostsDownload) this.f1428u;
                ((MaterialTextView) c0099hJ.f105v).setText(postsDownload.getType());
                for (PostsDownloadLinks postsDownloadLinks : postsDownload.getLinks()) {
                    Chip chip = new Chip(itemActivity2, null);
                    chip.setText(postsDownloadLinks.getName());
                    D3.b.e(chip, new A0.j(itemActivity2, postsDownload, postsDownloadLinks, 1));
                    ((ChipGroup) c0099hJ.f104u).addView(chip);
                }
                X2.h hVar = new X2.h(itemActivity2);
                hVar.setContentView((ScrollView) c0099hJ.f103t);
                hVar.show();
                return;
            case 2:
                ItemActivity itemActivity3 = (ItemActivity) this.f1427t;
                Intent intent = new Intent(itemActivity3, (Class<?>) CommentsActivity.class);
                intent.putExtra("slug", ((Posts) this.f1428u).getSlug());
                itemActivity3.startActivity(intent);
                return;
            default:
                RecentItem recentItem = (RecentItem) this.f1428u;
                p210v8.i.f(recentItem, "$result");
                View view2 = (View) this.f1427t;
                Intent intent2 = new Intent(view2.getContext(), (Class<?>) SeriesActivity.class);
                intent2.putExtra("id", recentItem.getId());
                intent2.putExtra("image", recentItem.getImage());
                intent2.putExtra("title", recentItem.getTitle());
                view2.getContext().startActivity(intent2);
                return;
        }
    }
}
