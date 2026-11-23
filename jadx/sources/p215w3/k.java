package p215w3;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        l lVar = this.a;
        if (lVar.f15580K == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = lVar.f15580K;
        j jVar = lVar.f15583N;
        if (editText != null) {
            editText.removeTextChangedListener(jVar);
            if (lVar.f15580K.getOnFocusChangeListener() == lVar.b().e()) {
                lVar.f15580K.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        lVar.f15580K = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(jVar);
        }
        lVar.b().m(lVar.f15580K);
        lVar.j(lVar.b());
    }
}
