package p136o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p078i.DialogInterfaceC0653j;

/* JADX INFO: loaded from: classes.dex */
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D f13515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DialogInterfaceC0653j f13516t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h f13517u;

    @Override // p136o.w
    public final void c(l lVar, boolean z6) {
        DialogInterfaceC0653j dialogInterfaceC0653j;
        if ((z6 || lVar == this.f13515s) && (dialogInterfaceC0653j = this.f13516t) != null) {
            dialogInterfaceC0653j.dismiss();
        }
    }

    @Override // p136o.w
    public final boolean l(l lVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        h hVar = this.f13517u;
        if (hVar.f13485x == null) {
            hVar.f13485x = new g(hVar);
        }
        this.f13515s.q(hVar.f13485x.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f13517u.c(this.f13515s, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        D d3 = this.f13515s;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f13516t.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f13516t.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d3.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d3.performShortcut(i10, keyEvent, 0);
    }
}
