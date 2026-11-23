package com.onesignal.notifications.internal.open.impl;

import U5.e;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076h8.m;
import p123m8.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p006a6.b {
    private final Y5.c _lifecycleService;

    public static final class a extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.handleProcessJsonOpenData(null, null, this);
        }
    }

    public c(Y5.c cVar) {
        i.f(cVar, "_lifecycleService");
        this._lifecycleService = cVar;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!U5.c.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        i.c(intent);
        Bundle extras = intent.getExtras();
        f fVar = f.INSTANCE;
        i.c(extras);
        JSONObject jSONObjectBundleAsJSONObject = fVar.bundleAsJSONObject(extras);
        reformatButtonClickAction(jSONObjectBundleAsJSONObject);
        return jSONObjectBundleAsJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object handleProcessJsonOpenData(Activity activity, JSONObject jSONObject, d<? super m> dVar) {
        a aVar;
        c cVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.label = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objCanOpenNotification = aVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = aVar.label;
        m mVar = m.a;
        if (i11 != 0) {
            if (i11 == 1) {
                jSONObject = (JSONObject) aVar.L$2;
                activity = (Activity) aVar.L$1;
                cVar = (c) aVar.L$0;
                J7.a.v(objCanOpenNotification);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(objCanOpenNotification);
            }
        }
        J7.a.v(objCanOpenNotification);
        Y5.c cVar2 = this._lifecycleService;
        aVar.L$0 = this;
        aVar.L$1 = activity;
        aVar.L$2 = jSONObject;
        aVar.label = 1;
        objCanOpenNotification = cVar2.canOpenNotification(activity, jSONObject, aVar);
        if (objCanOpenNotification != aVar2) {
            cVar = this;
        }
        if (!((Boolean) objCanOpenNotification).booleanValue()) {
            return mVar;
        }
        Y5.c cVar3 = cVar._lifecycleService;
        JSONArray jSONArrayWrapInJsonArray = f.INSTANCE.wrapInJsonArray(jSONObject);
        aVar.L$0 = null;
        aVar.L$1 = null;
        aVar.L$2 = null;
        aVar.label = 2;
        return cVar3.notificationOpened(activity, jSONArrayWrapInJsonArray, aVar) == aVar2 ? aVar2 : mVar;
    }

    private final void reformatButtonClickAction(JSONObject jSONObject) {
        try {
            String str = (String) e.INSTANCE.getCustomJSONObject(jSONObject).remove("actionId");
            if (str == null) {
                return;
            }
            jSONObject.put("actionId", str);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // p006a6.b
    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, d<? super m> dVar) {
        JSONObject jSONObjectCovertHMSOpenIntentToJson;
        Object objHandleProcessJsonOpenData;
        m mVar = m.a;
        return (intent == null || (jSONObjectCovertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent)) == null || (objHandleProcessJsonOpenData = handleProcessJsonOpenData(activity, jSONObjectCovertHMSOpenIntentToJson, dVar)) != p134n8.a.f13404s) ? mVar : objHandleProcessJsonOpenData;
    }
}
