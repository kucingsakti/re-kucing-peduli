package androidx.profileinstaller;

import R0.b;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p204v1.g;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // R0.b
    public final Object create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new g(4);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: H0.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.a.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new g(applicationContext, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new g(4);
    }

    @Override // R0.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
