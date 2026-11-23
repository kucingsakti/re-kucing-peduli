package p126n0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p106l0.g;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final EditText f13297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h f13298t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13299u = true;

    public i(EditText editText) {
        this.f13297s = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            g gVarA = g.a();
            if (editableText == null) {
                length = 0;
            } else {
                gVarA.getClass();
                length = editableText.length();
            }
            gVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) throws Throwable {
        EditText editText = this.f13297s;
        if (editText.isInEditMode() || !this.f13299u || g.f12850k == null || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = g.a().b();
        if (iB != 0) {
            if (iB == 1) {
                g.a().e((Spannable) charSequence, i10, i12 + i10);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        g gVarA = g.a();
        if (this.f13298t == null) {
            this.f13298t = new h(editText);
        }
        gVarA.f(this.f13298t);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
