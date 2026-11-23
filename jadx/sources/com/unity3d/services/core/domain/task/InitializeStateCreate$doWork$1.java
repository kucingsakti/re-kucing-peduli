package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import p076h8.h;
import p123m8.d;
import p134n8.a;
import p144o8.c;
import p144o8.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateCreate", f = "InitializeStateCreate.kt", l = {26}, m = "doWork-gIAlu-s")
public final class InitializeStateCreate$doWork$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateCreate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateCreate$doWork$1(InitializeStateCreate initializeStateCreate, d<? super InitializeStateCreate$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateCreate;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM56doWorkgIAlus = this.this$0.m56doWorkgIAlus((InitializeStateCreate.Params) null, (d<? super h>) this);
        return objM56doWorkgIAlus == a.f13404s ? objM56doWorkgIAlus : new h(objM56doWorkgIAlus);
    }
}
