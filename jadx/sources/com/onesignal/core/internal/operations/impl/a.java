package com.onesignal.core.internal.operations.impl;

import com.onesignal.common.modeling.k;
import com.onesignal.user.internal.operations.impl.executors.e;
import com.onesignal.user.internal.operations.impl.executors.h;
import com.onesignal.user.internal.operations.impl.executors.l;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p064g5.g;
import p086i8.C;
import p173r6.d;
import p173r6.f;
import p173r6.j;
import p173r6.m;
import p173r6.n;
import p173r6.o;
import p173r6.p;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p093j5.b bVar) {
        super("operations", bVar);
        i.f(bVar, "prefs");
    }

    private final boolean isValidOperation(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(MediationMetaData.KEY_NAME)) {
            com.onesignal.debug.internal.logging.b.error$default("jsonObject must have 'name' attribute", null, 2, null);
            return false;
        }
        String string = jSONObject.getString(MediationMetaData.KEY_NAME);
        Set setX = C.x(e.LOGIN_USER, com.onesignal.user.internal.operations.impl.executors.c.LOGIN_USER_FROM_SUBSCRIPTION_USER);
        if (jSONObject.has("onesignalId") || setX.contains(string)) {
            return true;
        }
        com.onesignal.debug.internal.logging.b.error$default(string + " jsonObject must have 'onesignalId' attribute", null, 2, null);
        return false;
    }

    public final void loadOperations() {
        load();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public g create(JSONObject jSONObject) throws Exception {
        g bVar;
        if (jSONObject == null) {
            com.onesignal.debug.internal.logging.b.error$default("null jsonObject sent to OperationModelStore.create", null, 2, null);
            return null;
        }
        if (!isValidOperation(jSONObject)) {
            return null;
        }
        String string = jSONObject.getString(MediationMetaData.KEY_NAME);
        if (string != null) {
            switch (string.hashCode()) {
                case -1865677906:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.a.DELETE_ALIAS)) {
                        bVar = new p173r6.b();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1793763409:
                    if (string.equals(e.LOGIN_USER)) {
                        bVar = new f();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1606689981:
                    if (string.equals(l.TRACK_PURCHASE)) {
                        bVar = new p173r6.l();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1188793632:
                    if (string.equals(l.SET_PROPERTY)) {
                        bVar = new j();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1080179201:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.j.DELETE_SUBSCRIPTION)) {
                        bVar = new p173r6.c();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -828599391:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.j.UPDATE_SUBSCRIPTION)) {
                        bVar = new p();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -516221659:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.a.SET_ALIAS)) {
                        bVar = new p173r6.i();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -92337283:
                    if (string.equals(h.REFRESH_USER)) {
                        bVar = new p173r6.h();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 532599746:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.c.LOGIN_USER_FROM_SUBSCRIPTION_USER)) {
                        bVar = new p173r6.e();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 846157390:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.j.CREATE_SUBSCRIPTION)) {
                        bVar = new p173r6.a();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1707031487:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.j.TRANSFER_SUBSCRIPTION)) {
                        bVar = new o();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1763437688:
                    if (string.equals(l.DELETE_TAG)) {
                        bVar = new d();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1852485538:
                    if (string.equals(l.TRACK_SESSION_END)) {
                        bVar = new m();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1983836079:
                    if (string.equals(l.SET_TAG)) {
                        bVar = new p173r6.k();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 2135250281:
                    if (string.equals(l.TRACK_SESSION_START)) {
                        bVar = new n();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
            }
        }
        throw new Exception(E0.a.h("Unrecognized operation: ", string));
    }
}
