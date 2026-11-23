package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public final class zal {
    public final SparseIntArray a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f8150b;

    public zal() {
        this(GoogleApiAvailability.f7832d);
    }

    public final int a(Context context, Api.Client client) {
        Preconditions.i(context);
        Preconditions.i(client);
        int iB = 0;
        if (!client.g()) {
            return 0;
        }
        int i10 = client.i();
        SparseIntArray sparseIntArray = this.a;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= sparseIntArray.size()) {
                iB = -1;
                break;
            }
            int iKeyAt = sparseIntArray.keyAt(i12);
            if (iKeyAt > i10 && sparseIntArray.get(iKeyAt) == 0) {
                break;
            }
            i12++;
        }
        if (iB == -1) {
            iB = this.f8150b.b(context, i10);
        }
        sparseIntArray.put(i10, iB);
        return iB;
    }

    public zal(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.a = new SparseIntArray();
        Preconditions.i(googleApiAvailabilityLight);
        this.f8150b = googleApiAvailabilityLight;
    }
}
