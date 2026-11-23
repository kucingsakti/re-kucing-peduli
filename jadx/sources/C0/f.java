package C0;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class f implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i10, boolean z6) {
        g gVar = this.a;
        if (z6) {
            gVar.f859S0 = gVar.f858R0.add(gVar.U0[i10].toString()) | gVar.f859S0;
        } else {
            gVar.f859S0 = gVar.f858R0.remove(gVar.U0[i10].toString()) | gVar.f859S0;
        }
    }
}
