package G4;

import A9.A;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.GetListResult;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Ga.c {
    /* JADX WARN: Illegal instructions before constructor call */
    public k(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_activity_searchbygenre, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        GetListResult getListResult = (GetListResult) obj;
        p210v8.i.f(getListResult, "item");
        View view = this.f7003s;
        o1.e eVarD0 = o1.e.D0(view);
        ((MaterialTextView) eVarD0.f13628u).setText(getListResult.getTitle());
        ImageView imageView = (ImageView) eVarD0.f13627t;
        imageView.setClipToOutline(true);
        D3.b.t(imageView, getListResult.getImage());
        D3.b.e(view, new A(getListResult, 10, view));
    }
}
