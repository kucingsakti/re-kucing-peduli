package p126n0;

import K3.d;
import Y1.c;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e implements KeyListener {
    public final KeyListener a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f13291b;

    public e(KeyListener keyListener) {
        d dVar = new d(25);
        this.a = keyListener;
        this.f13291b = dVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean zR;
        boolean z6;
        this.f13291b.getClass();
        if (i10 != 67) {
            zR = i10 != 112 ? false : c.r(editable, keyEvent, true);
        } else {
            zR = c.r(editable, keyEvent, false);
        }
        if (zR) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6 || this.a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i10, keyEvent);
    }
}
