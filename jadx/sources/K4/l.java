package K4;

import A1.r;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.kcstream.cing.activity.SearchActivity;

/* JADX INFO: loaded from: classes.dex */
public final class l implements TextWatcher {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2606t;

    public /* synthetic */ l(Object obj, int i10) {
        this.f2605s = i10;
        this.f2606t = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f2605s) {
            case 0:
                ((m) this.f2606t).j = D3.b.G(String.valueOf(editable));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f2605s;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f2605s) {
            case 0:
                break;
            default:
                SimpleSearchView simpleSearchView = (SimpleSearchView) this.f2606t;
                if (!simpleSearchView.f7684M) {
                    simpleSearchView.f7689v = charSequence;
                    if (TextUtils.isEmpty(charSequence)) {
                        simpleSearchView.f7677F.setVisibility(8);
                        simpleSearchView.c(true);
                    } else {
                        simpleSearchView.f7677F.setVisibility(0);
                        simpleSearchView.c(false);
                    }
                    if (simpleSearchView.f7682K != null && !TextUtils.equals(charSequence, simpleSearchView.f7690w)) {
                        W1.h hVar = simpleSearchView.f7682K;
                        String string = charSequence.toString();
                        r rVar = (r) hVar;
                        rVar.getClass();
                        p210v8.i.f(string, "query");
                        if (string.equals("")) {
                            SearchActivity searchActivity = (SearchActivity) rVar.f167t;
                            ((ProgressBar) searchActivity.A().f2075h).setVisibility(8);
                            ((LinearLayout) searchActivity.A().f2074g).setVisibility(0);
                        }
                    }
                    simpleSearchView.f7690w = charSequence.toString();
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
