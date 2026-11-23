package W1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.ferfalk.simplesearchview.SimpleSearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5316b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.f5316b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z6) {
        Object obj = this.f5316b;
        switch (this.a) {
            case 0:
                SimpleSearchView simpleSearchView = (SimpleSearchView) obj;
                if (!z6) {
                    int i10 = SimpleSearchView.f7671O;
                    simpleSearchView.getClass();
                } else {
                    EditText editText = simpleSearchView.f7675D;
                    editText.requestFocus();
                    InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.showSoftInput(editText, 2);
                    }
                }
                break;
            case 1:
                p215w3.c cVar = (p215w3.c) obj;
                cVar.t(cVar.u());
                break;
            default:
                p215w3.i iVar = (p215w3.i) obj;
                iVar.f15562l = z6;
                iVar.q();
                if (!z6) {
                    iVar.t(false);
                    iVar.f15563m = false;
                }
                break;
        }
    }
}
