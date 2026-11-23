package com.onesignal.common.modeling;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l extends k {
    private final p200u8.a _create;

    public /* synthetic */ l(p200u8.a aVar, String str, p093j5.b bVar, int i10, p210v8.e eVar) {
        this(aVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bVar);
    }

    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public i create(JSONObject jSONObject) {
        i iVar = (i) this._create.invoke();
        if (jSONObject != null) {
            iVar.initializeFromJson(jSONObject);
        }
        return iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p200u8.a aVar, String str, p093j5.b bVar) {
        super(str, bVar);
        p210v8.i.f(aVar, "_create");
        this._create = aVar;
        load();
    }
}
