package I5;

import p093j5.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements H5.a {
    private final b _prefs;

    public a(b bVar) {
        i.f(bVar, "_prefs");
        this._prefs = bVar;
    }

    @Override // H5.a
    public long getLastLocationTime() {
        Long l4 = this._prefs.getLong("OneSignal", "OS_LAST_LOCATION_TIME", -600000L);
        i.c(l4);
        return l4.longValue();
    }

    @Override // H5.a
    public void setLastLocationTime(long j) {
        this._prefs.saveLong("OneSignal", "OS_LAST_LOCATION_TIME", Long.valueOf(j));
    }
}
