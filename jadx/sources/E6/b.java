package E6;

import android.content.pm.PackageManager;
import com.kcstream.cing.MainApp;
import com.rollbar.api.payload.data.Notifier;

/* JADX INFO: loaded from: classes.dex */
public final class b implements I6.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Notifier f1454s;

    public b(MainApp mainApp) {
        String string;
        try {
            string = mainApp.getPackageManager().getApplicationInfo(mainApp.getPackageName(), 128).metaData.getString("com.rollbar.android._notifier.version");
        } catch (PackageManager.NameNotFoundException unused) {
            string = "unknown";
        }
        this.f1454s = new Notifier.Builder().name("rollbar-android").version(string).build();
    }

    @Override // I6.a
    public final Object b() {
        return this.f1454s;
    }
}
