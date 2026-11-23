package C0;

import A1.RunnableC0094c;
import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* JADX INFO: loaded from: classes.dex */
public class c extends o {

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public EditText f852R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public CharSequence f853S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final RunnableC0094c f854T0 = new RunnableC0094c(this, 1);
    public long U0 = -1;

    @Override // C0.o, p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void C(Bundle bundle) {
        super.C(bundle);
        if (bundle == null) {
            this.f853S0 = ((EditTextPreference) o0()).f6791l0;
        } else {
            this.f853S0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // C0.o, p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f853S0);
    }

    @Override // C0.o
    public final void p0(View view) {
        super.p0(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f852R0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f852R0.setText(this.f853S0);
        EditText editText2 = this.f852R0;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) o0()).getClass();
    }

    @Override // C0.o
    public final void q0(boolean z6) {
        if (z6) {
            String string = this.f852R0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) o0();
            editTextPreference.f(string);
            editTextPreference.C(string);
        }
    }

    public final void s0() {
        long j = this.U0;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f852R0;
        if (editText == null || !editText.isFocused()) {
            this.U0 = -1L;
            return;
        }
        if (((InputMethodManager) this.f852R0.getContext().getSystemService("input_method")).showSoftInput(this.f852R0, 0)) {
            this.U0 = -1L;
            return;
        }
        EditText editText2 = this.f852R0;
        RunnableC0094c runnableC0094c = this.f854T0;
        editText2.removeCallbacks(runnableC0094c);
        this.f852R0.postDelayed(runnableC0094c, 50L);
    }
}
