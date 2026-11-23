package p078i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: i.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0648e implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0652i f12035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0650g f12036t;

    public C0648e(C0650g c0650g, C0652i c0652i) {
        this.f12036t = c0650g;
        this.f12035s = c0652i;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        C0650g c0650g = this.f12036t;
        DialogInterface.OnClickListener onClickListener = c0650g.f12054q;
        C0652i c0652i = this.f12035s;
        onClickListener.onClick(c0652i.f12070b, i10);
        if (c0650g.f12059v) {
            return;
        }
        c0652i.f12070b.dismiss();
    }
}
