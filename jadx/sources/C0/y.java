package C0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class y extends RecyclerView.a {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Drawable f909M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ColorStateList f910N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final SparseArray f911O;
    public boolean P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f912Q;

    public y(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f911O = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.kcstream.cing.R.id.icon_frame, view.findViewById(com.kcstream.cing.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f909M = view.getBackground();
        if (textView != null) {
            this.f910N = textView.getTextColors();
        }
    }

    public final View s(int i10) {
        SparseArray sparseArray = this.f911O;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.f7003s.findViewById(i10);
        if (viewFindViewById != null) {
            sparseArray.put(i10, viewFindViewById);
        }
        return viewFindViewById;
    }
}
