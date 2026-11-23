package com.onesignal.user.internal.operations.impl.executors;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[com.onesignal.common.g.a.values().length];
        iArr[com.onesignal.common.g.a.RETRYABLE.ordinal()] = 1;
        iArr[com.onesignal.common.g.a.INVALID.ordinal()] = 2;
        iArr[com.onesignal.common.g.a.CONFLICT.ordinal()] = 3;
        iArr[com.onesignal.common.g.a.UNAUTHORIZED.ordinal()] = 4;
        iArr[com.onesignal.common.g.a.MISSING.ordinal()] = 5;
        $EnumSwitchMapping$0 = iArr;
    }
}
