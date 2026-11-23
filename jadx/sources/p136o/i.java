package p136o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends BaseAdapter {
    public final l a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13486b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f13489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13490f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z6, int i10) {
        this.f13488d = z6;
        this.f13489e = layoutInflater;
        this.a = lVar;
        this.f13490f = i10;
        a();
    }

    public final void a() {
        l lVar = this.a;
        n nVar = lVar.f13505N;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f13493B;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.f13486b = i10;
                    return;
                }
            }
        }
        this.f13486b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i10) {
        ArrayList arrayListL;
        l lVar = this.a;
        if (this.f13488d) {
            lVar.i();
            arrayListL = lVar.f13493B;
        } else {
            arrayListL = lVar.l();
        }
        int i11 = this.f13486b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayListL.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        l lVar = this.a;
        if (this.f13488d) {
            lVar.i();
            arrayListL = lVar.f13493B;
        } else {
            arrayListL = lVar.l();
        }
        return this.f13486b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z6 = false;
        if (view == null) {
            view = this.f13489e.inflate(this.f13490f, viewGroup, false);
        }
        int i11 = getItem(i10).f13539t;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f13539t : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i11 != i13) {
            z6 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z6);
        y yVar = (y) view;
        if (this.f13487c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.a(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
