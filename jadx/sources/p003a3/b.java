package p003a3;

import J0.x;
import L.a;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x {
    public final Paint a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6001b;

    public b() {
        Paint paint = new Paint();
        this.a = paint;
        this.f6001b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // J0.x
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        Paint paint = this.a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f6001b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = a.a;
            float f10 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f10)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f10)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f10)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f10))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).J0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f9583r.g(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f9583r.c(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f9583r.d(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f9583r.e(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
