package C1;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f937c;

    public h(g gVar) {
        Context context = gVar.a;
        ActivityManager activityManager = gVar.f933b;
        int i10 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f937c = i10;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) gVar.f934c.f167t;
        float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f11 = gVar.f935d;
        int iRound2 = Math.round(f10 * f11);
        int iRound3 = Math.round(f10 * 2.0f);
        int i11 = iRound - i10;
        if (iRound3 + iRound2 <= i11) {
            this.f936b = iRound3;
            this.a = iRound2;
        } else {
            float f12 = i11 / (f11 + 2.0f);
            this.f936b = Math.round(2.0f * f12);
            this.a = Math.round(f12 * f11);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.f936b);
            Formatter.formatFileSize(context, this.a);
            Formatter.formatFileSize(context, i10);
            Formatter.formatFileSize(context, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
