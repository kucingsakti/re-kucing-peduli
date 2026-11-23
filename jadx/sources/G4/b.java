package G4;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.ItemActivity;
import com.kcstream.cing.activity.SeriesActivity;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Ga.c {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f1697M = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parentView");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_fragment_bookmark, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
    }

    @Override // Ga.a
    public final void a(Object obj) {
        String str;
        final M4.a aVar = (M4.a) obj;
        p210v8.i.f(aVar, "item");
        final View view = this.f7003s;
        int i10 = R.id.itemDate;
        MaterialTextView materialTextView = (MaterialTextView) oa.b.c(view, R.id.itemDate);
        if (materialTextView != null) {
            i10 = R.id.iv_image;
            ImageView imageView = (ImageView) oa.b.c(view, R.id.iv_image);
            if (imageView != null) {
                i10 = R.id.iv_label;
                ImageView imageView2 = (ImageView) oa.b.c(view, R.id.iv_label);
                if (imageView2 != null) {
                    i10 = R.id.ll_info;
                    if (((LinearLayout) oa.b.c(view, R.id.ll_info)) != null) {
                        i10 = R.id.tv_title;
                        MaterialTextView materialTextView2 = (MaterialTextView) oa.b.c(view, R.id.tv_title);
                        if (materialTextView2 != null) {
                            materialTextView2.setText(aVar.f3174e);
                            imageView.setClipToOutline(true);
                            D3.b.t(imageView, aVar.f3175f);
                            int i11 = aVar.f3171b;
                            if (i11 == 1) {
                                str = "#81C784";
                            } else if (i11 != 2) {
                                str = i11 != 3 ? "#00000000" : "#64B5F6";
                            } else {
                                str = "#FFF176";
                            }
                            imageView2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str)));
                            materialTextView.setText(new SimpleDateFormat("EEEE, dd-MMM-yy", new Locale("id", "ID")).format(Long.valueOf(aVar.f3176g)));
                            String str2 = aVar.f3172c;
                            if (str2.equals("episodes")) {
                                final int i12 = 0;
                                view.setOnClickListener(new View.OnClickListener() { // from class: G4.a
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        M4.a aVar2 = aVar;
                                        View view3 = view;
                                        switch (i12) {
                                            case 0:
                                                int i13 = b.f1697M;
                                                p210v8.i.f(view3, "$this_apply");
                                                p210v8.i.f(aVar2, "$item");
                                                Intent intent = new Intent(view3.getContext(), (Class<?>) ItemActivity.class);
                                                intent.putExtra("id", aVar2.f3173d);
                                                intent.putExtra("title", aVar2.f3174e);
                                                intent.putExtra("image", aVar2.f3175f);
                                                view3.getContext().startActivity(intent);
                                                break;
                                            default:
                                                int i14 = b.f1697M;
                                                p210v8.i.f(view3, "$this_apply");
                                                p210v8.i.f(aVar2, "$item");
                                                Intent intent2 = new Intent(view3.getContext(), (Class<?>) SeriesActivity.class);
                                                intent2.putExtra("id", aVar2.f3173d);
                                                intent2.putExtra("title", aVar2.f3174e);
                                                intent2.putExtra("image", aVar2.f3175f);
                                                view3.getContext().startActivity(intent2);
                                                break;
                                        }
                                    }
                                });
                                return;
                            } else {
                                if (str2.equals("series")) {
                                    final int i13 = 1;
                                    view.setOnClickListener(new View.OnClickListener() { // from class: G4.a
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            M4.a aVar2 = aVar;
                                            View view3 = view;
                                            switch (i13) {
                                                case 0:
                                                    int i14 = b.f1697M;
                                                    p210v8.i.f(view3, "$this_apply");
                                                    p210v8.i.f(aVar2, "$item");
                                                    Intent intent = new Intent(view3.getContext(), (Class<?>) ItemActivity.class);
                                                    intent.putExtra("id", aVar2.f3173d);
                                                    intent.putExtra("title", aVar2.f3174e);
                                                    intent.putExtra("image", aVar2.f3175f);
                                                    view3.getContext().startActivity(intent);
                                                    break;
                                                default:
                                                    int i15 = b.f1697M;
                                                    p210v8.i.f(view3, "$this_apply");
                                                    p210v8.i.f(aVar2, "$item");
                                                    Intent intent2 = new Intent(view3.getContext(), (Class<?>) SeriesActivity.class);
                                                    intent2.putExtra("id", aVar2.f3173d);
                                                    intent2.putExtra("title", aVar2.f3174e);
                                                    intent2.putExtra("image", aVar2.f3175f);
                                                    view3.getContext().startActivity(intent2);
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
