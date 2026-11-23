package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import kotlin.Metadata;
import p076h8.h;
import p123m8.d;
import p134n8.a;
import p144o8.c;
import p144o8.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
public final class BaseTask$invoke$1<P extends BaseParams, R> extends c {
    int label;
    /* synthetic */ Object result;

    public BaseTask$invoke$1(d<? super BaseTask$invoke$1> dVar) {
        super(dVar);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM47invokegIAlus = BaseTask.DefaultImpls.m47invokegIAlus(null, null, this);
        return objM47invokegIAlus == a.f13404s ? objM47invokegIAlus : new h(objM47invokegIAlus);
    }
}
