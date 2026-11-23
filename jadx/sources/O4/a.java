package O4;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements MovementMethod {
    public static a a;

    @Override // android.text.method.MovementMethod
    public final boolean canSelectArbitrarily() {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public final void initialize(TextView textView, Spannable spannable) {
        Selection.setSelection(spannable, 0);
    }

    @Override // android.text.method.MovementMethod
    public final boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyDown(TextView textView, Spannable spannable, int i10, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public final boolean onKeyUp(TextView textView, Spannable spannable, int i10, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public final boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.text.method.MovementMethod
    public final void onTakeFocus(TextView textView, Spannable spannable, int i10) {
    }
}
