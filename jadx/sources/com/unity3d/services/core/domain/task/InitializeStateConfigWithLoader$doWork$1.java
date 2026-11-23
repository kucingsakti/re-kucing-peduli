package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import p076h8.h;
import p123m8.d;
import p134n8.a;
import p144o8.c;
import p144o8.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader", f = "InitializeStateConfigWithLoader.kt", l = {31}, m = "doWork-gIAlu-s")
public final class InitializeStateConfigWithLoader$doWork$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, d<? super InitializeStateConfigWithLoader$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateConfigWithLoader;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM54doWorkgIAlus = this.this$0.m54doWorkgIAlus((InitializeStateConfigWithLoader.Params) null, (d<? super h>) this);
        return objM54doWorkgIAlus == a.f13404s ? objM54doWorkgIAlus : new h(objM54doWorkgIAlus);
    }
}
