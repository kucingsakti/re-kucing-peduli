package E4;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.activity.SeriesActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1380t;

    public /* synthetic */ L(Object obj, int i10) {
        this.f1379s = i10;
        this.f1380t = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [u8.a, v8.k] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f1380t;
        switch (this.f1379s) {
            case 0:
                SeriesActivity seriesActivity = (SeriesActivity) obj;
                ((MaterialTextView) seriesActivity.z().f2088l).setMaxLines(Integer.MAX_VALUE);
                ((MaterialTextView) seriesActivity.z().f2088l).setEllipsize(null);
                ((RelativeLayout) seriesActivity.z().f2081d).setVisibility(8);
                return;
            case 1:
                int i10 = J4.h.f2418M;
                p210v8.i.f((J4.h) obj, "this$0");
                p210v8.i.n("viewEventListener");
                throw null;
            case 2:
                ((p210v8.k) obj).invoke();
                return;
            case 3:
                ((com.google.android.material.datepicker.n) obj).o0();
                throw null;
            case 4:
                p215w3.c cVar = (p215w3.c) obj;
                EditText editText = cVar.f15547i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                cVar.q();
                return;
            case 5:
                ((p215w3.i) obj).u();
                return;
            default:
                p215w3.s sVar = (p215w3.s) obj;
                EditText editText2 = sVar.f15636f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = sVar.f15636f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    sVar.f15636f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    sVar.f15636f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    sVar.f15636f.setSelection(selectionEnd);
                }
                sVar.q();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ L(p200u8.a aVar) {
        this.f1379s = 2;
        this.f1380t = (p210v8.k) aVar;
    }
}
