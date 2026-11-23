package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import p076h8.h;
import p123m8.d;
import p134n8.a;
import p144o8.c;
import p144o8.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", l = {31}, m = "doWork-gIAlu-s$suspendImpl")
public final class InitializeStateReset$doWork$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, d<? super InitializeStateReset$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateReset;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM62doWorkgIAlus$suspendImpl = InitializeStateReset.m62doWorkgIAlus$suspendImpl(this.this$0, null, this);
        return objM62doWorkgIAlus$suspendImpl == a.f13404s ? objM62doWorkgIAlus$suspendImpl : new h(objM62doWorkgIAlus$suspendImpl);
    }
}
