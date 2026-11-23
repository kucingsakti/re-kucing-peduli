package C0;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import p.A0;
import p.C0722p0;

/* JADX INFO: renamed from: C0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0172b implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f851t;

    public /* synthetic */ C0172b(Object obj, int i10) {
        this.f850s = i10;
        this.f851t = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j) {
        C0722p0 c0722p0;
        switch (this.f850s) {
            case 0:
                if (i10 >= 0) {
                    DropDownPreference dropDownPreference = (DropDownPreference) this.f851t;
                    String string = dropDownPreference.f6794m0[i10].toString();
                    if (!string.equals(dropDownPreference.f6795n0)) {
                        dropDownPreference.f(string);
                        dropDownPreference.D(string);
                    }
                }
                break;
            default:
                if (i10 != -1 && (c0722p0 = ((A0) this.f851t).f13921u) != null) {
                    c0722p0.setListSelectionHidden(false);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i10 = this.f850s;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
