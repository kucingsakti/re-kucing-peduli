package com.unity3d.services.core.di;

import kotlin.Metadata;
import p076h8.d;
import p200u8.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/core/di/Factory;", "T", "Lh8/d;", "Lkotlin/Function0;", "initializer", "<init>", "(Lu8/a;)V", "", "isInitialized", "()Z", "Lu8/a;", "getValue", "()Ljava/lang/Object;", "value", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Factory<T> implements d {
    private final a initializer;

    public Factory(a aVar) {
        i.f(aVar, "initializer");
        this.initializer = aVar;
    }

    @Override // p076h8.d
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    public boolean isInitialized() {
        return false;
    }
}
