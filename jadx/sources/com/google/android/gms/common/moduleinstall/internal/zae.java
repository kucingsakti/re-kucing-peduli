package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: loaded from: classes.dex */
public interface zae extends IInterface {
    void S(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse);

    void V(Status status);

    void u(Status status, ModuleInstallResponse moduleInstallResponse);

    void x(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse);
}
