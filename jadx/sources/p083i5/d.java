package p083i5;

import V4.c;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.WindowManager;
import com.onesignal.debug.internal.logging.b;
import java.util.Arrays;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d INSTANCE = new d();

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: show$lambda-0, reason: not valid java name */
    public static final void m67show$lambda0(c cVar, DialogInterface dialogInterface, int i10) {
        i.f(cVar, "$callback");
        cVar.onAccept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: show$lambda-1, reason: not valid java name */
    public static final void m68show$lambda1(c cVar, DialogInterface dialogInterface, int i10) {
        i.f(cVar, "$callback");
        cVar.onDecline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: show$lambda-2, reason: not valid java name */
    public static final void m69show$lambda2(c cVar, DialogInterface dialogInterface) {
        i.f(cVar, "$callback");
        cVar.onDecline();
    }

    public final void show(Activity activity, String str, String str2, final c cVar) {
        i.f(activity, "activity");
        i.f(str, "titlePrefix");
        i.f(str2, "previouslyDeniedPostfix");
        i.f(cVar, "callback");
        String string = activity.getString(c.permission_not_available_title);
        i.e(string, "activity.getString(R.str…sion_not_available_title)");
        final int i10 = 1;
        final int i11 = 0;
        String str3 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        String string2 = activity.getString(c.permission_not_available_message);
        i.e(string2, "activity.getString(R.str…on_not_available_message)");
        try {
            new AlertDialog.Builder(activity).setTitle(str3).setMessage(String.format(string2, Arrays.copyOf(new Object[]{str2}, 1))).setPositiveButton(c.permission_not_available_open_settings_option, new DialogInterface.OnClickListener() { // from class: i5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    switch (i11) {
                        case 0:
                            d.m67show$lambda0(cVar, dialogInterface, i12);
                            break;
                        default:
                            d.m68show$lambda1(cVar, dialogInterface, i12);
                            break;
                    }
                }
            }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: i5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    switch (i10) {
                        case 0:
                            d.m67show$lambda0(cVar, dialogInterface, i12);
                            break;
                        default:
                            d.m68show$lambda1(cVar, dialogInterface, i12);
                            break;
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: i5.b
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    d.m69show$lambda2(cVar, dialogInterface);
                }
            }).show();
        } catch (WindowManager.BadTokenException unused) {
            b.log(p131n5.b.ERROR, "Alert dialog for Android settings was skipped because the activity was unavailable to display it.");
            cVar.onDecline();
        }
    }
}
