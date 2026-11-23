package J4;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import p086i8.C;
import zlc.season.claritypotion.ClarityPotion;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2414t;

    public /* synthetic */ f(Object obj, int i10) {
        this.f2413s = i10;
        this.f2414t = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Object obj = this.f2414t;
        switch (this.f2413s) {
            case 0:
                e eVar = (e) obj;
                p210v8.i.f(eVar, "$item");
                String str = eVar.f2410b;
                try {
                    Context context = ClarityPotion.f16351s;
                    Uri uriD = FileProvider.d(C.h(), "com.kcstream.cing.provider", new File(str));
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (L9.f.J(str, ".doc", false) || L9.f.J(str, ".docx", false)) {
                        intent.setDataAndType(uriD, "application/msword");
                    } else if (L9.f.J(str, ".pdf", false)) {
                        intent.setDataAndType(uriD, "application/pdf");
                    } else if (L9.f.J(str, ".ppt", false) || L9.f.J(str, ".pptx", false)) {
                        intent.setDataAndType(uriD, "application/vnd.ms-powerpoint");
                    } else if (L9.f.J(str, ".xls", false) || L9.f.J(str, ".xlsx", false)) {
                        intent.setDataAndType(uriD, "application/vnd.ms-excel");
                    } else if (L9.f.J(str, ".zip", false) || L9.f.J(str, ".rar", false)) {
                        intent.setDataAndType(uriD, "application/zip");
                    } else if (L9.f.J(str, ".rtf", false)) {
                        intent.setDataAndType(uriD, "application/rtf");
                    } else if (L9.f.J(str, ".wav", false) || L9.f.J(str, ".mp3", false)) {
                        intent.setDataAndType(uriD, "audio/x-wav");
                    } else if (L9.f.J(str, ".gif", false)) {
                        intent.setDataAndType(uriD, "image/gif");
                    } else if (L9.f.J(str, ".jpg", false) || L9.f.J(str, ".jpeg", false) || L9.f.J(str, ".png", false)) {
                        intent.setDataAndType(uriD, "image/jpeg");
                    } else if (L9.f.J(str, ".txt", false)) {
                        intent.setDataAndType(uriD, "text/plain");
                    } else if (L9.f.J(str, ".3gp", false) || L9.f.J(str, ".mpg", false) || L9.f.J(str, ".mpeg", false) || L9.f.J(str, ".mpe", false) || L9.f.J(str, ".mp4", false) || L9.f.J(str, ".avi", false)) {
                        intent.setDataAndType(uriD, "video/*");
                    } else {
                        intent.setDataAndType(uriD, "*/*");
                    }
                    intent.addFlags(1);
                    intent.addFlags(268435456);
                    C.h().startActivity(intent);
                } catch (Exception unused) {
                }
                dialogInterface.dismiss();
                break;
            default:
                com.onesignal.notifications.internal.registration.impl.a.b.m41invokeSuspend$lambda1((com.onesignal.notifications.internal.registration.impl.a) obj, dialogInterface, i10);
                break;
        }
    }
}
