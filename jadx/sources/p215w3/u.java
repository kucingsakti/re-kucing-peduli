package p215w3;

import U.U;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u implements TextWatcher {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ EditText f15649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f15650u;

    public u(TextInputLayout textInputLayout, EditText editText) {
        this.f15650u = textInputLayout;
        this.f15649t = editText;
        this.f15648s = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f15650u;
        textInputLayout.u(!textInputLayout.f9891S0, false);
        if (textInputLayout.f9859C) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f9875K) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f15649t;
        int lineCount = editText.getLineCount();
        int i10 = this.f15648s;
        if (lineCount != i10) {
            if (lineCount < i10) {
                WeakHashMap weakHashMap = U.a;
                int minimumHeight = editText.getMinimumHeight();
                int i11 = textInputLayout.f9878L0;
                if (minimumHeight != i11) {
                    editText.setMinimumHeight(i11);
                }
            }
            this.f15648s = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
