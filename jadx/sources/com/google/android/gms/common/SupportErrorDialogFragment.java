package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.common.internal.Preconditions;
import p156q0.DialogInterfaceOnCancelListenerC0756o;

/* JADX INFO: loaded from: classes.dex */
public class SupportErrorDialogFragment extends DialogInterfaceOnCancelListenerC0756o {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public AlertDialog f7844J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f7845K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public AlertDialog f7846L0;

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o
    public final Dialog k0() {
        AlertDialog alertDialog = this.f7844J0;
        if (alertDialog != null) {
            return alertDialog;
        }
        this.f14337A0 = false;
        if (this.f7846L0 == null) {
            Context contextM = m();
            Preconditions.i(contextM);
            this.f7846L0 = new AlertDialog.Builder(contextM).create();
        }
        return this.f7846L0;
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7845K0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
