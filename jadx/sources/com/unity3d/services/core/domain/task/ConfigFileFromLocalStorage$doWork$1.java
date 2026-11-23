package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import p076h8.h;
import p123m8.d;
import p134n8.a;
import p144o8.c;
import p144o8.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage", f = "ConfigFileFromLocalStorage.kt", l = {25}, m = "doWork-gIAlu-s")
public final class ConfigFileFromLocalStorage$doWork$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigFileFromLocalStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$1(ConfigFileFromLocalStorage configFileFromLocalStorage, d<? super ConfigFileFromLocalStorage$doWork$1> dVar) {
        super(dVar);
        this.this$0 = configFileFromLocalStorage;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM48doWorkgIAlus = this.this$0.m48doWorkgIAlus((ConfigFileFromLocalStorage.Params) null, (d<? super h>) this);
        return objM48doWorkgIAlus == a.f13404s ? objM48doWorkgIAlus : new h(objM48doWorkgIAlus);
    }
}
