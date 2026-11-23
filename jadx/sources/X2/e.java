package X2;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f5391s;

    public e(h hVar) {
        this.f5391s = hVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        h hVar = this.f5391s;
        if (hVar.f5398B && hVar.isShowing()) {
            if (!hVar.f5400D) {
                TypedArray typedArrayObtainStyledAttributes = hVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                hVar.f5399C = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                hVar.f5400D = true;
            }
            if (hVar.f5399C) {
                hVar.cancel();
            }
        }
    }
}
