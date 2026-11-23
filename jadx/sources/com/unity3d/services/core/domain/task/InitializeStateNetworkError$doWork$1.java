package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import p076h8.h;
import p123m8.d;
import p134n8.a;
import p144o8.c;
import p144o8.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError", f = "InitializeStateNetworkError.kt", l = {33}, m = "doWork-gIAlu-s")
public final class InitializeStateNetworkError$doWork$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$1(InitializeStateNetworkError initializeStateNetworkError, d<? super InitializeStateNetworkError$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM61doWorkgIAlus = this.this$0.m61doWorkgIAlus((InitializeStateNetworkError.Params) null, (d<? super h>) this);
        return objM61doWorkgIAlus == a.f13404s ? objM61doWorkgIAlus : new h(objM61doWorkgIAlus);
    }
}
