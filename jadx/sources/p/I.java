package p;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class I implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13947t;

    public /* synthetic */ I(Object obj, int i10) {
        this.f13946s = i10;
        this.f13947t = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        Object item;
        switch (this.f13946s) {
            case 0:
                K k3 = (K) this.f13947t;
                k3.f13962Z.setSelection(i10);
                androidx.appcompat.widget.c cVar = k3.f13962Z;
                if (cVar.getOnItemClickListener() != null) {
                    cVar.performItemClick(view, i10, k3.f13959W.getItemId(i10));
                }
                k3.dismiss();
                break;
            default:
                p215w3.r rVar = (p215w3.r) this.f13947t;
                if (i10 < 0) {
                    A0 a10 = rVar.f15631w;
                    item = !a10.f13918R.isShowing() ? null : a10.f13921u.getSelectedItem();
                } else {
                    item = rVar.getAdapter().getItem(i10);
                }
                p215w3.r.a(rVar, item);
                AdapterView.OnItemClickListener onItemClickListener = rVar.getOnItemClickListener();
                A0 a11 = rVar.f15631w;
                if (onItemClickListener != null) {
                    if (view == null || i10 < 0) {
                        view = a11.f13918R.isShowing() ? a11.f13921u.getSelectedView() : null;
                        i10 = !a11.f13918R.isShowing() ? -1 : a11.f13921u.getSelectedItemPosition();
                        j = !a11.f13918R.isShowing() ? Long.MIN_VALUE : a11.f13921u.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(a11.f13921u, view, i10, j);
                }
                a11.dismiss();
                break;
        }
    }
}
