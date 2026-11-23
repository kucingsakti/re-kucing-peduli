package V2;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5166b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.f5166b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        T2.a aVar;
        switch (this.a) {
            case 0:
                throw null;
            default:
                W2.a aVar2 = (W2.a) this.f5166b;
                ImageView imageView = aVar2.f13078F;
                if (imageView.getVisibility() != 0 || (aVar = aVar2.f13095a0) == null) {
                    return;
                }
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.i(imageView, null);
                return;
        }
    }
}
