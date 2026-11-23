package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import p076h8.h;
import p123m8.d;
import p134n8.a;
import p144o8.c;
import p144o8.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {36}, m = "doWork-gIAlu-s")
public final class InitializeSDK$doWork$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$1(InitializeSDK initializeSDK, d<? super InitializeSDK$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeSDK;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM51doWorkgIAlus = this.this$0.m51doWorkgIAlus((EmptyParams) null, (d<? super h>) this);
        return objM51doWorkgIAlus == a.f13404s ? objM51doWorkgIAlus : new h(objM51doWorkgIAlus);
    }
}
