package com.onesignal.user.internal.operations.impl.executors;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[p132n6.j.values().length];
        iArr[p132n6.j.EMAIL.ordinal()] = 1;
        iArr[p132n6.j.SMS.ordinal()] = 2;
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[com.onesignal.common.g.a.values().length];
        iArr2[com.onesignal.common.g.a.RETRYABLE.ordinal()] = 1;
        iArr2[com.onesignal.common.g.a.UNAUTHORIZED.ordinal()] = 2;
        iArr2[com.onesignal.common.g.a.MISSING.ordinal()] = 3;
        $EnumSwitchMapping$1 = iArr2;
    }
}
