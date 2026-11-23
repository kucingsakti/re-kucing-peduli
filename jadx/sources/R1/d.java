package R1;

import G.f;
import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Integer f4438d;
    public final ImageView a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4439b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f4440c;

    public d(ImageView imageView) {
        this.a = imageView;
    }

    public final int a(int i10, int i11, int i12) {
        int i13 = i11 - i12;
        if (i13 > 0) {
            return i13;
        }
        int i14 = i10 - i12;
        if (i14 > 0) {
            return i14;
        }
        ImageView imageView = this.a;
        if (imageView.isLayoutRequested() || i11 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = imageView.getContext();
        if (f4438d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            U1.f.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f4438d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f4438d.intValue();
    }
}
