package p117m1;

import Y1.c;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p050f1.q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13065g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, c cVar, int i10) {
        super(context, cVar);
        this.f13065g = i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // B7.a
    public final Object b() {
        boolean z6 = false;
        Context context = this.a;
        switch (this.f13065g) {
            case 0:
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver != null) {
                    int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                    return Boolean.valueOf(intExtra == 2 || intExtra == 5);
                }
                q qVarA = q.a();
                int i10 = b.a;
                qVarA.getClass();
                return Boolean.FALSE;
            case 1:
                Intent intentRegisterReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 != null) {
                    return Boolean.valueOf(intentRegisterReceiver2.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver2.getIntExtra("level", -1)) / ((float) intentRegisterReceiver2.getIntExtra("scale", -1)) > 0.15f);
                }
                q qVarA2 = q.a();
                int i11 = c.a;
                qVarA2.getClass();
                return Boolean.FALSE;
            default:
                Intent intentRegisterReceiver3 = context.registerReceiver(null, i());
                if (intentRegisterReceiver3 == null || intentRegisterReceiver3.getAction() == null) {
                    z6 = true;
                } else {
                    String action = intentRegisterReceiver3.getAction();
                    if (action != null) {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                            z6 = true;
                        }
                    }
                }
                return Boolean.valueOf(z6);
        }
    }

    @Override // p117m1.d
    public final IntentFilter i() {
        switch (this.f13065g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p117m1.d
    public final void j(Intent intent) {
        switch (this.f13065g) {
            case 0:
                String action = intent.getAction();
                if (action != null) {
                    q qVarA = q.a();
                    int i10 = b.a;
                    qVarA.getClass();
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                f(Boolean.FALSE);
                                break;
                            }
                            break;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                f(Boolean.FALSE);
                                break;
                            }
                            break;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                f(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                f(Boolean.TRUE);
                                break;
                            }
                            break;
                    }
                }
                break;
            case 1:
                if (intent.getAction() != null) {
                    q qVarA2 = q.a();
                    int i11 = c.a;
                    intent.getAction();
                    qVarA2.getClass();
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int iHashCode = action2.hashCode();
                        if (iHashCode != -1980154005) {
                            if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                f(Boolean.FALSE);
                            }
                            break;
                        } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                            f(Boolean.TRUE);
                            break;
                        }
                    }
                }
                break;
            default:
                if (intent.getAction() != null) {
                    q qVarA3 = q.a();
                    int i12 = j.a;
                    intent.getAction();
                    qVarA3.getClass();
                    String action3 = intent.getAction();
                    if (action3 != null) {
                        int iHashCode2 = action3.hashCode();
                        if (iHashCode2 != -1181163412) {
                            if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                f(Boolean.TRUE);
                            }
                            break;
                        } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            f(Boolean.FALSE);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
