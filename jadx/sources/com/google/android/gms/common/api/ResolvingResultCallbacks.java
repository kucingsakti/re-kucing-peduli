package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    @Override // com.google.android.gms.common.api.ResultCallbacks
    public final void b(Status status) {
        PendingIntent pendingIntent = status.f7882u;
        if (pendingIntent == null) {
            d();
            return;
        }
        if (pendingIntent != null) {
            try {
                Preconditions.i(pendingIntent);
                pendingIntent.getIntentSender();
                throw null;
            } catch (IntentSender.SendIntentException unused) {
                new Status(8, null, null, null);
                d();
            }
        }
    }

    public abstract void d();
}
