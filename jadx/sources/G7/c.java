package G7;

import A0.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.kcstream.cing.R;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f1706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f1707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f1708f;

    public c(g gVar, int[] iArr, m mVar) {
        this.f1706d = gVar;
        this.f1707e = iArr;
        this.f1708f = mVar;
    }

    @Override // androidx.recyclerview.widget.s
    public final int a() {
        return this.f1707e.length;
    }

    @Override // androidx.recyclerview.widget.s
    public final void e(RecyclerView.a aVar, int i10) {
        b bVar = (b) aVar;
        c cVar = bVar.f1705M;
        cVar.getClass();
        int i11 = cVar.f1707e[bVar.c()];
        View view = bVar.f7003s;
        ImageView imageView = (ImageView) view.findViewById(R.id.colorSelected);
        i.b(imageView, "itemView.colorSelected");
        bVar.f1705M.getClass();
        imageView.setVisibility(8);
        ((ImageView) view.findViewById(R.id.colorSelected)).setImageResource(R.drawable.ic_check);
        if (J7.a.l(i11)) {
            ImageView imageView2 = (ImageView) view.findViewById(R.id.colorSelected);
            i.b(imageView2, "itemView.colorSelected");
            Context context = view.getContext();
            i.b(context, "itemView.context");
            imageView2.setImageTintList(ColorStateList.valueOf(J.b.a(context, android.R.color.white)));
        } else {
            ImageView imageView3 = (ImageView) view.findViewById(R.id.colorSelected);
            i.b(imageView3, "itemView.colorSelected");
            Context context2 = view.getContext();
            i.b(context2, "itemView.context");
            imageView3.setImageTintList(ColorStateList.valueOf(J.b.a(context2, android.R.color.black)));
        }
        ImageView imageView4 = (ImageView) view.findViewById(R.id.colorSelectedCircle);
        i.b(imageView4, "itemView.colorSelectedCircle");
        imageView4.setImageTintList(ColorStateList.valueOf(i11));
    }

    @Override // androidx.recyclerview.widget.s
    public final RecyclerView.a f(ViewGroup viewGroup, int i10) {
        i.g(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.color_item, viewGroup, false);
        i.b(viewInflate, "color");
        return new b(this, viewInflate);
    }
}
