package E4;

import N9.AbstractC0342z;
import android.content.Intent;
import android.os.Handler;
import com.kcstream.cing.activity.MainActivity;
import com.kcstream.cing.activity.PasscodeActivity;
import com.kcstream.cing.activity.SplashActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1389s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f1390t;

    public /* synthetic */ P(SplashActivity splashActivity, int i10) {
        this.f1389s = i10;
        this.f1390t = splashActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SplashActivity splashActivity = this.f1390t;
        switch (this.f1389s) {
            case 0:
                int i10 = SplashActivity.f10231Z;
                AbstractC0342z.n(splashActivity, null, new U(splashActivity, null), 3);
                break;
            case 1:
                int i11 = SplashActivity.f10231Z;
                if (!splashActivity.y().contains("key_passcode")) {
                    Intent intent = new Intent(splashActivity, (Class<?>) MainActivity.class);
                    if (splashActivity.y().contains("disguise_app") && splashActivity.y().getBoolean("disguise_app", true)) {
                        intent.putExtra("isDisguise", true);
                    } else {
                        intent.putExtra("isDisguise", false);
                    }
                    splashActivity.startActivity(intent);
                    splashActivity.finish();
                } else {
                    new Handler().postDelayed(new P(splashActivity, 2), 1000L);
                }
                break;
            default:
                int i12 = SplashActivity.f10231Z;
                p210v8.i.f(splashActivity, "this$0");
                D3.b.H(splashActivity, PasscodeActivity.class);
                break;
        }
    }
}
