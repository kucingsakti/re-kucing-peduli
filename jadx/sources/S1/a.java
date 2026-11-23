package S1;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c, d {
    @Override // S1.c
    public boolean a(Object obj, R1.a aVar) {
        Drawable drawable = (Drawable) obj;
        ImageView imageView = aVar.f4434s;
        Drawable drawable2 = imageView.getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(300);
        imageView.setImageDrawable(transitionDrawable);
        return true;
    }

    @Override // S1.d
    public c e(int i10) {
        return b.f4506s;
    }
}
