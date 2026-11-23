package p118m3;

import W2.b;
import android.view.View;
import p136o.n;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f13106s;

    public f(b bVar) {
        this.f13106s = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        n itemData = ((d) view).getItemData();
        b bVar = this.f13106s;
        if (bVar.f13130W.q(itemData, bVar.f13129V, 0)) {
            return;
        }
        itemData.setChecked(true);
    }
}
