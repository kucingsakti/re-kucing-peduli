package B4;

import android.content.DialogInterface;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class A implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f604s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f605t;

    public /* synthetic */ A(Object obj, int i10) {
        this.f604s = i10;
        this.f605t = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f604s) {
            case 0:
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                ((r) this.f605t).handleMessage(Message.obtain());
                break;
            default:
                C0.e eVar = (C0.e) this.f605t;
                eVar.f855R0 = i10;
                eVar.f870Q0 = -1;
                dialogInterface.dismiss();
                break;
        }
    }
}
