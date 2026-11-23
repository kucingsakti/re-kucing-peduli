package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes.dex */
public final class zaz extends RemoteCreator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zaz f8164b = new zaz();

    private zaz() {
    }

    public static View c(Context context, int i10, int i11) throws RemoteCreator.RemoteCreatorException {
        zaz zazVar = f8164b;
        try {
            zax zaxVar = new zax(1, i10, i11, null);
            return (View) ObjectWrapper.i0(((zam) zazVar.b(context)).i0(new ObjectWrapper(context), zaxVar));
        } catch (Exception e10) {
            throw new RemoteCreator.RemoteCreatorException(AbstractC0487g.h("Could not get button with size ", i10, " and color ", i11), e10);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final zam a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zam ? (zam) iInterfaceQueryLocalInterface : new zam(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }
}
