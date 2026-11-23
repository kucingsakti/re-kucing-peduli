package B4;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class z implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
