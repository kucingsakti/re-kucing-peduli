package W0;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Drawable.Callback {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5249s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f5250t;

    public /* synthetic */ c() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f5249s) {
            case 0:
                ((e) this.f5250t).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f5249s) {
            case 0:
                ((e) this.f5250t).scheduleSelf(runnable, j);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f5250t;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f5249s) {
            case 0:
                ((e) this.f5250t).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f5250t;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
        }
    }

    public c(e eVar) {
        this.f5250t = eVar;
    }

    private final void a(Drawable drawable) {
    }
}
