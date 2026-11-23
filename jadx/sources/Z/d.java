package Z;

import E4.C0187a;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d extends InputConnectionWrapper {
    public final /* synthetic */ C0187a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, C0187a c0187a) {
        super(inputConnection, false);
        this.a = c0187a;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        P0.d dVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            dVar = new P0.d(new f(inputContentInfo), 13);
        }
        if (this.a.j(dVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
