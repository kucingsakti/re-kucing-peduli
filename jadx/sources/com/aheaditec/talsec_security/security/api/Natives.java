package com.aheaditec.talsec_security.security.api;

import android.content.Context;
import kotlin.Metadata;
import p086i8.C;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/aheaditec/talsec_security/security/api/Natives;", "", "Landroid/content/Context;", "context", "", "mode", "Lh8/m;", "start", "(Landroid/content/Context;Z)V", "TalsecSecurity_v14.0.1_basicRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Natives {
    public static final Natives a = new Natives();

    static {
        System.loadLibrary(C.a(C.c("146FB8C008")));
    }

    public final native void start(Context context, boolean mode);
}
