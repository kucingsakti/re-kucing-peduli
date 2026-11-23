package U5;

import android.content.Context;
import android.content.Intent;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private final Context context;
    private final Intent intent;
    private final boolean startApp;

    public a(Context context, Intent intent, boolean z6) {
        i.f(context, "context");
        this.context = context;
        this.intent = intent;
        this.startApp = z6;
    }

    private final Intent getIntentAppOpen() {
        Intent launchIntentForPackage;
        if (!this.startApp || (launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName())) == null) {
            return null;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.setFlags(270532608);
        return launchIntentForPackage;
    }

    public final Intent getIntentVisible() {
        Intent intent = this.intent;
        return intent != null ? intent : getIntentAppOpen();
    }
}
