package com.google.firebase.iid;

import Q3.u0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.concurrent.ExecutionException;
import p140o4.j;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.a(new j(context).b(cloudMessage.f7772s))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void b(Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (u0.l(intentPutExtras)) {
            u0.i("_nd", intentPutExtras.getExtras());
        }
    }
}
