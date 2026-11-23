package N6;

import A1.p;
import E4.ViewOnClickListenerC0201o;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import com.kcstream.cing.model.RecentItem;
import com.kcstream.cing.utils.TopCropImageView;
import com.smarteist.autoimageslider.SliderView;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends Z0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SliderView f3401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedList f3402d;

    @Override // Z0.a
    public final void a(l lVar, int i10, Object obj) {
        n nVar = (n) obj;
        lVar.removeView(nVar.a);
        this.f3402d.add(nVar);
    }

    @Override // Z0.a
    public final n g(l lVar, int i10) {
        n hVar = (n) this.f3402d.poll();
        if (hVar == null) {
            View viewInflate = LayoutInflater.from(lVar.getContext()).inflate(R.layout.recycler_activity_main_fragment_home_carousel, (ViewGroup) lVar, false);
            p210v8.i.e(viewInflate, "inflate(...)");
            hVar = new G4.h(viewInflate);
        }
        lVar.addView(hVar.a);
        G4.h hVar2 = (G4.h) hVar;
        List list = ((G4.j) this).f1698e;
        if (list == null) {
            p210v8.i.n(JsonStorageKeyNames.DATA_KEY);
            throw null;
        }
        RecentItem recentItem = (RecentItem) list.get(i10);
        View view = hVar2.a;
        int i11 = R.id.iv_auto_image_slider;
        TopCropImageView topCropImageView = (TopCropImageView) oa.b.c(view, R.id.iv_auto_image_slider);
        if (topCropImageView != null) {
            i11 = R.id.tv_auto_image_slider;
            MaterialTextView materialTextView = (MaterialTextView) oa.b.c(view, R.id.tv_auto_image_slider);
            if (materialTextView != null) {
                i11 = R.id.tv_description;
                MaterialTextView materialTextView2 = (MaterialTextView) oa.b.c(view, R.id.tv_description);
                if (materialTextView2 != null) {
                    materialTextView.setText(recentItem.getTitle());
                    String description = recentItem.getDescription();
                    p210v8.i.c(description);
                    materialTextView2.setText(Build.VERSION.SDK_INT >= 24 ? S.c.a(description, 0) : Html.fromHtml(description));
                    try {
                        com.bumptech.glide.l lVarF = com.bumptech.glide.b.f(view);
                        lVarF.getClass();
                        ((com.bumptech.glide.j) new com.bumptech.glide.j(lVarF.f7632s, lVarF, Bitmap.class, lVarF.f7633t).a(com.bumptech.glide.l.f7629C).A(recentItem.getImage()).e(p.f162e)).z(new G4.i()).y(topCropImageView);
                    } catch (Exception unused) {
                    }
                    view.setOnClickListener(new ViewOnClickListenerC0201o(3, view, recentItem));
                    return hVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // Z0.a
    public final boolean h(View view, Object obj) {
        return ((n) obj).a == view;
    }

    @Override // Z0.a
    public final void i() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f5828b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.notifyChanged();
        SliderView sliderView = this.f3401c;
        if (sliderView == null || !sliderView.f10319B) {
            return;
        }
        sliderView.f10318A.i();
        sliderView.f10329z.t(0, false);
    }

    @Override // Z0.a
    public final void d() {
    }
}
