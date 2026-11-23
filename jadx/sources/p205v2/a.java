package p205v2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a extends zau {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleApiAvailability f15408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f15408b = googleApiAvailability;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = GoogleApiAvailabilityLight.a;
        GoogleApiAvailability googleApiAvailability = this.f15408b;
        Context context = this.a;
        int iB = googleApiAvailability.b(context, i11);
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = googleApiAvailability.a(iB, context, R5.a.PUSH_MINIFIED_BUTTON_TEXT);
            googleApiAvailability.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
