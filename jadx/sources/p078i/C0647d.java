package p078i;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: i.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0647d extends ArrayAdapter {
    public final /* synthetic */ AlertController$RecycleListView a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0650g f12034b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0647d(C0650g c0650g, ContextThemeWrapper contextThemeWrapper, int i10, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i10, R.id.text1, charSequenceArr);
        this.f12034b = c0650g;
        this.a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        boolean[] zArr = this.f12034b.f12057t;
        if (zArr != null && zArr[i10]) {
            this.a.setItemChecked(i10, true);
        }
        return view2;
    }
}
