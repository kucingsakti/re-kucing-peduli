package C0;

import N9.AbstractC0342z;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.preference.PreferenceScreen;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p182s4.O;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Handler {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f871b;

    public /* synthetic */ p() {
        this.a = 1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String string;
        int size;
        o1.r[] rVarArr;
        switch (this.a) {
            case 0:
                if (message.what != 1) {
                    return;
                }
                r rVar = (r) this.f871b;
                PreferenceScreen preferenceScreen = rVar.f877u0.f901g;
                if (preferenceScreen != null) {
                    rVar.f878v0.setAdapter(new t(preferenceScreen));
                    preferenceScreen.o();
                    return;
                }
                return;
            case 1:
                int i10 = message.what;
                if (i10 == -3 || i10 == -2 || i10 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f871b).get(), message.what);
                    return;
                } else {
                    if (i10 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 2:
                p210v8.i.f(message, "msg");
                if (message.what != 3) {
                    Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
                    super.handleMessage(message);
                    return;
                }
                Bundle data = message.getData();
                if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                    string = "";
                }
                AbstractC0342z.n(AbstractC0342z.b((p123m8.i) this.f871b), null, new O(string, null), 3);
                return;
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                p222x0.b bVar = (p222x0.b) this.f871b;
                while (true) {
                    synchronized (bVar.f15707b) {
                        try {
                            size = bVar.f15709d.size();
                            if (size <= 0) {
                                return;
                            }
                            rVarArr = new o1.r[size];
                            bVar.f15709d.toArray(rVarArr);
                            bVar.f15709d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        o1.r rVar2 = rVarArr[i11];
                        int size2 = ((ArrayList) rVar2.f13676u).size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            p222x0.a aVar = (p222x0.a) ((ArrayList) rVar2.f13676u).get(i12);
                            aVar.getClass();
                            aVar.f15703b.onReceive(bVar.a, (Intent) rVar2.f13675t);
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Looper looper, int i10) {
        super(looper);
        this.a = i10;
        this.f871b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p123m8.i iVar) {
        super(Looper.getMainLooper());
        this.a = 2;
        this.f871b = iVar;
    }
}
