package G4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.DisqusCommentsResult;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Ga.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public d(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_activity_comments, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        DisqusCommentsResult disqusCommentsResult = (DisqusCommentsResult) obj;
        p210v8.i.f(disqusCommentsResult, "item");
        View view = this.f7003s;
        int i10 = R.id.avatar;
        ImageView imageView = (ImageView) oa.b.c(view, R.id.avatar);
        if (imageView != null) {
            i10 = R.id.iv_dislike;
            if (((ImageView) oa.b.c(view, R.id.iv_dislike)) != null) {
                i10 = R.id.iv_like;
                if (((ImageView) oa.b.c(view, R.id.iv_like)) != null) {
                    i10 = R.id.message;
                    MaterialTextView materialTextView = (MaterialTextView) oa.b.c(view, R.id.message);
                    if (materialTextView != null) {
                        i10 = R.id.name;
                        MaterialTextView materialTextView2 = (MaterialTextView) oa.b.c(view, R.id.name);
                        if (materialTextView2 != null) {
                            i10 = R.id.tv_dislike;
                            MaterialTextView materialTextView3 = (MaterialTextView) oa.b.c(view, R.id.tv_dislike);
                            if (materialTextView3 != null) {
                                i10 = R.id.tv_like;
                                MaterialTextView materialTextView4 = (MaterialTextView) oa.b.c(view, R.id.tv_like);
                                if (materialTextView4 != null) {
                                    imageView.setClipToOutline(true);
                                    String avatar = disqusCommentsResult.getAuthor().getAvatar();
                                    p210v8.i.c(avatar);
                                    D3.b.t(imageView, avatar);
                                    materialTextView2.setText(disqusCommentsResult.getAuthor().getName());
                                    materialTextView.setText(disqusCommentsResult.getMessage().getRaw());
                                    materialTextView4.setText(String.valueOf(disqusCommentsResult.getLike().getLikes()));
                                    materialTextView3.setText(String.valueOf(disqusCommentsResult.getLike().getDislikes()));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
