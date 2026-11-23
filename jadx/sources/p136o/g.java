package p136o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.kcstream.cing.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends BaseAdapter {
    public int a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f13479b;

    public g(h hVar) {
        this.f13479b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f13479b.f13482u;
        n nVar = lVar.f13505N;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f13493B;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.a = i10;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i10) {
        h hVar = this.f13479b;
        l lVar = hVar.f13482u;
        lVar.i();
        ArrayList arrayList = lVar.f13493B;
        hVar.getClass();
        int i11 = this.a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h hVar = this.f13479b;
        l lVar = hVar.f13482u;
        lVar.i();
        int size = lVar.f13493B.size();
        hVar.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f13479b.f13481t.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).a(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
