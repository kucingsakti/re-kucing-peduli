package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {
    @Override // com.onesignal.location.internal.controller.impl.g
    public void cancelLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        i.f(googleApiClient, "googleApiClient");
        i.f(locationListener, "locationListener");
        if (googleApiClient.a()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, locationListener);
        } else {
            com.onesignal.debug.internal.logging.b.warn$default("GoogleApiClient is not connected. Unable to cancel location updates.", null, 2, null);
        }
    }

    @Override // com.onesignal.location.internal.controller.impl.g
    public Location getLastLocation(GoogleApiClient googleApiClient) {
        i.f(googleApiClient, "googleApiClient");
        if (googleApiClient.a()) {
            return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
        }
        return null;
    }

    @Override // com.onesignal.location.internal.controller.impl.g
    public void requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        i.f(googleApiClient, "googleApiClient");
        i.f(locationRequest, "locationRequest");
        i.f(locationListener, "locationListener");
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            if (googleApiClient.a()) {
                LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("FusedLocationApi.requestLocationUpdates failed!", th);
        }
    }
}
