package E5;

import G5.b;
import X4.f;
import android.location.Location;
import java.math.BigDecimal;
import java.math.RoundingMode;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, D5.a {
    private final f _applicationService;
    private final G5.a _controller;
    private final H5.a _prefs;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final p110l5.a _time;
    private boolean locationCoarse;

    public a(f fVar, p110l5.a aVar, H5.a aVar2, com.onesignal.user.internal.properties.b bVar, G5.a aVar3) {
        i.f(fVar, "_applicationService");
        i.f(aVar, "_time");
        i.f(aVar2, "_prefs");
        i.f(bVar, "_propertiesModelStore");
        i.f(aVar3, "_controller");
        this._applicationService = fVar;
        this._time = aVar;
        this._prefs = aVar2;
        this._propertiesModelStore = bVar;
        this._controller = aVar3;
        aVar3.subscribe(this);
    }

    private final void capture(Location location) {
        F5.a aVar = new F5.a();
        aVar.setAccuracy(Float.valueOf(location.getAccuracy()));
        aVar.setBg(Boolean.valueOf(!this._applicationService.isInForeground()));
        aVar.setType(getLocationCoarse() ? 0 : 1);
        aVar.setTimeStamp(Long.valueOf(location.getTime()));
        if (getLocationCoarse()) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            aVar.setLat(Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue()));
            aVar.setLog(Double.valueOf(new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue()));
        } else {
            aVar.setLat(Double.valueOf(location.getLatitude()));
            aVar.setLog(Double.valueOf(location.getLongitude()));
        }
        com.onesignal.user.internal.properties.a aVar2 = (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
        aVar2.setLocationLongitude(aVar.getLog());
        aVar2.setLocationLatitude(aVar.getLat());
        aVar2.setLocationAccuracy(aVar.getAccuracy());
        aVar2.setLocationBackground(aVar.getBg());
        aVar2.setLocationType(aVar.getType());
        aVar2.setLocationTimestamp(aVar.getTimeStamp());
        this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
    }

    @Override // D5.a
    public void captureLastLocation() {
        Location lastLocation = this._controller.getLastLocation();
        if (lastLocation != null) {
            capture(lastLocation);
        } else {
            this._prefs.setLastLocationTime(this._time.getCurrentTimeMillis());
        }
    }

    @Override // D5.a
    public boolean getLocationCoarse() {
        return this.locationCoarse;
    }

    @Override // G5.b
    public void onLocationChanged(Location location) {
        i.f(location, "location");
        com.onesignal.debug.internal.logging.b.debug$default("LocationController fireCompleteForLocation with location: " + location, null, 2, null);
        capture(location);
    }

    @Override // D5.a
    public void setLocationCoarse(boolean z6) {
        this.locationCoarse = z6;
    }
}
