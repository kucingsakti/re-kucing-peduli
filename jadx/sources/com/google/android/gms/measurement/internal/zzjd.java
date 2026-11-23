package com.google.android.gms.measurement.internal;

import M2.Q;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzjd implements SharedPreferences.OnSharedPreferenceChangeListener {
    public /* synthetic */ zziv a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zziv zzivVar = this.a;
        zzivVar.getClass();
        if ("IABTCF_TCString".equals(str)) {
            zzivVar.i().f9052F.b("IABTCF_TCString change picked up in listener.");
            Q q10 = zzivVar.f9202L;
            Preconditions.i(q10);
            q10.b(500L);
        }
    }
}
