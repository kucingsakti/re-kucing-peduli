package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import E4.w;
import Y1.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import i2.i;
import i2.p;
import p138o2.e;
import p138o2.h;
import p180s2.a;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        p.b(context);
        c cVarA = i.a();
        cVarA.M(queryParameter);
        cVarA.f5672v = a.b(iIntValue);
        if (queryParameter2 != null) {
            cVarA.f5671u = Base64.decode(queryParameter2, 0);
        }
        h hVar = p.a().f12196d;
        i iVarL = cVarA.l();
        w wVar = new w(1);
        hVar.getClass();
        hVar.f13699e.execute(new e(hVar, iVarL, i10, wVar));
    }
}
