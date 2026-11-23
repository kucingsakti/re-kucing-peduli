package p129n3;

import B6.b;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class k extends h {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public l f13363D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public b f13364E;

    @Override // p129n3.h
    public final boolean d(boolean z6, boolean z10, boolean z11) {
        boolean zD = super.d(z6, z10, z11);
        if (this.f13354u != null) {
            Settings.Global.getFloat(this.f13352s.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        if (!isRunning()) {
            this.f13364E.c();
        }
        if (z6 && z11) {
            this.f13364E.t();
        }
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x0116  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p129n3.k.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13363D.a.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.f13363D.getClass();
        return -1;
    }
}
