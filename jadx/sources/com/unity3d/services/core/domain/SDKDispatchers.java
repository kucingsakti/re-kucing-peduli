package com.unity3d.services.core.domain;

import N9.AbstractC0337u;
import N9.I;
import S9.n;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/unity3d/services/core/domain/SDKDispatchers;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "<init>", "()V", "LN9/u;", "io", "LN9/u;", "getIo", "()LN9/u;", "default", "getDefault", "main", "getMain", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SDKDispatchers implements ISDKDispatchers {
    private final AbstractC0337u io = I.f3415c;
    private final AbstractC0337u default = I.a;
    private final AbstractC0337u main = n.a;

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public AbstractC0337u getDefault() {
        return this.default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public AbstractC0337u getIo() {
        return this.io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public AbstractC0337u getMain() {
        return this.main;
    }
}
