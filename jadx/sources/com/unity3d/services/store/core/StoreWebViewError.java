package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.g;
import com.unity3d.services.core.webview.WebViewEventCategory;

/* JADX INFO: loaded from: classes.dex */
public class StoreWebViewError extends g {
    public StoreWebViewError(Enum<?> r10, String str, Object... objArr) {
        super(r10, str, objArr);
    }

    @Override // com.unity3d.scar.adapter.common.g
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
