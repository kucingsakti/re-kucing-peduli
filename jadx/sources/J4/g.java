package J4;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f2417u;

    public /* synthetic */ g(int i10, KeyEvent.Callback callback, Object obj) {
        this.f2415s = i10;
        this.f2416t = obj;
        this.f2417u = callback;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f2415s) {
            case 0:
                e eVar = (e) this.f2416t;
                p210v8.i.f(eVar, "$item");
                View view = (View) this.f2417u;
                p210v8.i.f(view, "$this_apply");
                new File(eVar.f2410b).delete();
                Toast.makeText(view.getContext(), "File dihapus", 0).show();
                dialogInterface.dismiss();
                break;
            default:
                com.onesignal.notifications.internal.registration.impl.a.access$openPlayStoreToApp((com.onesignal.notifications.internal.registration.impl.a) this.f2416t, (Activity) this.f2417u);
                break;
        }
    }
}
