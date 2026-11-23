package C5;

import X4.f;
import Z4.b;
import p076h8.m;
import p123m8.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    private final f _applicationService;
    private final D5.a _capturer;
    private final B5.a _locationManager;
    private final H5.a _prefs;
    private final p110l5.a _time;

    public a(f fVar, B5.a aVar, H5.a aVar2, D5.a aVar3, p110l5.a aVar4) {
        i.f(fVar, "_applicationService");
        i.f(aVar, "_locationManager");
        i.f(aVar2, "_prefs");
        i.f(aVar3, "_capturer");
        i.f(aVar4, "_time");
        this._applicationService = fVar;
        this._locationManager = aVar;
        this._prefs = aVar2;
        this._capturer = aVar3;
        this._time = aVar4;
    }

    @Override // Z4.b
    public Object backgroundRun(d<? super m> dVar) {
        this._capturer.captureLastLocation();
        return m.a;
    }

    @Override // Z4.b
    public Long getScheduleBackgroundRunIn() {
        if (!this._locationManager.isShared()) {
            com.onesignal.debug.internal.logging.b.debug$default("LocationController scheduleUpdate not possible, location shared not enabled", null, 2, null);
            return null;
        }
        if (F5.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            return Long.valueOf(600000 - (this._time.getCurrentTimeMillis() - this._prefs.getLastLocationTime()));
        }
        com.onesignal.debug.internal.logging.b.debug$default("LocationController scheduleUpdate not possible, location permission not enabled", null, 2, null);
        return null;
    }
}
