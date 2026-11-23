package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class ErrorDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AlertDialog f7825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DialogInterface.OnCancelListener f7826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AlertDialog f7827u;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7826t;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f7825s;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f7827u == null) {
            Activity activity = getActivity();
            Preconditions.i(activity);
            this.f7827u = new AlertDialog.Builder(activity).create();
        }
        return this.f7827u;
    }
}
