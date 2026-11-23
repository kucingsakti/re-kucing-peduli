package K0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Binder implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2540b;

    public j(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2540b = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // K0.f
    public final void L(e eVar, int i10) {
        p210v8.i.f(eVar, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2540b;
        synchronized (multiInstanceInvalidationService.f7146u) {
            multiInstanceInvalidationService.f7146u.unregister(eVar);
        }
    }

    public final int g0(e eVar, String str) {
        p210v8.i.f(eVar, "callback");
        int i10 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2540b;
        synchronized (multiInstanceInvalidationService.f7146u) {
            try {
                int i11 = multiInstanceInvalidationService.f7144s + 1;
                multiInstanceInvalidationService.f7144s = i11;
                if (multiInstanceInvalidationService.f7146u.register(eVar, Integer.valueOf(i11))) {
                    multiInstanceInvalidationService.f7145t.put(Integer.valueOf(i11), str);
                    i10 = i11;
                } else {
                    multiInstanceInvalidationService.f7144s--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        e eVar = null;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) {
                    eVar = new e();
                    eVar.f2524b = strongBinder;
                } else {
                    eVar = (e) iInterfaceQueryLocalInterface;
                }
            }
            int iG0 = g0(eVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iG0);
            return true;
        }
        if (i10 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof e)) {
                    eVar = new e();
                    eVar.f2524b = strongBinder2;
                } else {
                    eVar = (e) iInterfaceQueryLocalInterface2;
                }
            }
            L(eVar, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 3) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        int i12 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        p210v8.i.f(strArrCreateStringArray, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2540b;
        synchronized (multiInstanceInvalidationService.f7146u) {
            try {
                String str = (String) multiInstanceInvalidationService.f7145t.get(Integer.valueOf(i12));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = multiInstanceInvalidationService.f7146u.beginBroadcast();
                    for (int i13 = 0; i13 < iBeginBroadcast; i13++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.f7146u.getBroadcastCookie(i13);
                            p210v8.i.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str2 = (String) multiInstanceInvalidationService.f7145t.get(num);
                            if (i12 != iIntValue && str.equals(str2)) {
                                try {
                                    ((e) multiInstanceInvalidationService.f7146u.getBroadcastItem(i13)).g0(strArrCreateStringArray);
                                } catch (RemoteException e10) {
                                    Log.w("ROOM", "Error invoking a remote callback", e10);
                                }
                            }
                        } catch (Throwable th) {
                            multiInstanceInvalidationService.f7146u.finishBroadcast();
                            throw th;
                        }
                    }
                    multiInstanceInvalidationService.f7146u.finishBroadcast();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
