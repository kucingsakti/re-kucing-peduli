package p078i;

import B6.b;
import J.f;
import Y1.c;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class A extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11900u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D f11901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f11902w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d3, c cVar) {
        super(d3);
        this.f11901v = d3;
        this.f11902w = cVar;
    }

    @Override // B6.b
    public final IntentFilter e() {
        switch (this.f11900u) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    @Override // B6.b
    public final int g() {
        Location lastKnownLocation;
        boolean z6;
        long j;
        switch (this.f11900u) {
            case 0:
                return v.a((PowerManager) this.f11902w) ? 2 : 1;
            default:
                c cVar = (c) this.f11902w;
                O o10 = (O) cVar.f5672v;
                if (o10.f11994b > System.currentTimeMillis()) {
                    z6 = o10.a;
                } else {
                    Context context = (Context) cVar.f5670t;
                    int iB = f.b(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation2 = null;
                    LocationManager locationManager = (LocationManager) cVar.f5671u;
                    if (iB == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("network");
                            } else {
                                lastKnownLocation = null;
                            }
                            break;
                        } catch (Exception unused) {
                        }
                    } else {
                        lastKnownLocation = null;
                    }
                    if (f.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                        lastKnownLocation = lastKnownLocation2;
                    }
                    z6 = false;
                    if (lastKnownLocation != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (N.f11991d == null) {
                            N.f11991d = new N();
                        }
                        N n10 = N.f11991d;
                        n10.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
                        n10.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
                        z6 = n10.f11993c == 1;
                        long j10 = n10.f11992b;
                        long j11 = n10.a;
                        n10.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j12 = n10.f11992b;
                        if (j10 == -1 || j11 == -1) {
                            j = 43200000 + jCurrentTimeMillis;
                        } else {
                            if (jCurrentTimeMillis > j11) {
                                j10 = j12;
                            } else if (jCurrentTimeMillis > j10) {
                                j10 = j11;
                            }
                            j = j10 + 60000;
                        }
                        o10.a = z6;
                        o10.f11994b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i10 = Calendar.getInstance().get(11);
                        if (i10 < 6 || i10 >= 22) {
                            z6 = true;
                        }
                    }
                }
                return z6 ? 2 : 1;
        }
    }

    @Override // B6.b
    public final void n() {
        switch (this.f11900u) {
            case 0:
                this.f11901v.m(true, true);
                break;
            default:
                this.f11901v.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d3, Context context) {
        super(d3);
        this.f11901v = d3;
        this.f11902w = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
