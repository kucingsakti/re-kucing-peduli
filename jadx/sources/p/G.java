package p;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p078i.C0650g;
import p078i.DialogInterfaceC0653j;

/* JADX INFO: loaded from: classes.dex */
public final class G implements L, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DialogInterfaceC0653j f13941s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public H f13942t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f13943u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.c f13944v;

    public G(androidx.appcompat.widget.c cVar) {
        this.f13944v = cVar;
    }

    @Override // p.L
    public final boolean b() {
        DialogInterfaceC0653j dialogInterfaceC0653j = this.f13941s;
        if (dialogInterfaceC0653j != null) {
            return dialogInterfaceC0653j.isShowing();
        }
        return false;
    }

    @Override // p.L
    public final int c() {
        return 0;
    }

    @Override // p.L
    public final void dismiss() {
        DialogInterfaceC0653j dialogInterfaceC0653j = this.f13941s;
        if (dialogInterfaceC0653j != null) {
            dialogInterfaceC0653j.dismiss();
            this.f13941s = null;
        }
    }

    @Override // p.L
    public final Drawable e() {
        return null;
    }

    @Override // p.L
    public final void g(CharSequence charSequence) {
        this.f13943u = charSequence;
    }

    @Override // p.L
    public final void l(int i10, int i11) {
        if (this.f13942t == null) {
            return;
        }
        androidx.appcompat.widget.c cVar = this.f13944v;
        A1.l lVar = new A1.l(cVar.getPopupContext());
        CharSequence charSequence = this.f13943u;
        C0650g c0650g = (C0650g) lVar.f123t;
        if (charSequence != null) {
            c0650g.f12042d = charSequence;
        }
        H h10 = this.f13942t;
        int selectedItemPosition = cVar.getSelectedItemPosition();
        c0650g.f12053p = h10;
        c0650g.f12054q = this;
        c0650g.f12060w = selectedItemPosition;
        c0650g.f12059v = true;
        DialogInterfaceC0653j dialogInterfaceC0653jC = lVar.c();
        this.f13941s = dialogInterfaceC0653jC;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0653jC.f12094x.f12074f;
        alertController$RecycleListView.setTextDirection(i10);
        alertController$RecycleListView.setTextAlignment(i11);
        this.f13941s.show();
    }

    @Override // p.L
    public final int m() {
        return 0;
    }

    @Override // p.L
    public final CharSequence o() {
        return this.f13943u;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        androidx.appcompat.widget.c cVar = this.f13944v;
        cVar.setSelection(i10);
        if (cVar.getOnItemClickListener() != null) {
            cVar.performItemClick(null, i10, this.f13942t.getItemId(i10));
        }
        dismiss();
    }

    @Override // p.L
    public final void p(ListAdapter listAdapter) {
        this.f13942t = (H) listAdapter;
    }

    @Override // p.L
    public final void h(Drawable drawable) {
    }

    @Override // p.L
    public final void i(int i10) {
    }

    @Override // p.L
    public final void j(int i10) {
    }

    @Override // p.L
    public final void k(int i10) {
    }
}
