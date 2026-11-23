package com.onesignal.user.internal.operations.impl.executors;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[p064g5.b.values().length];
        iArr[p064g5.b.SUCCESS.ordinal()] = 1;
        iArr[p064g5.b.FAIL_CONFLICT.ordinal()] = 2;
        iArr[p064g5.b.FAIL_NORETRY.ordinal()] = 3;
        iArr[p064g5.b.FAIL_UNAUTHORIZED.ordinal()] = 4;
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[com.onesignal.common.g.a.values().length];
        iArr2[com.onesignal.common.g.a.RETRYABLE.ordinal()] = 1;
        iArr2[com.onesignal.common.g.a.UNAUTHORIZED.ordinal()] = 2;
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[p208v6.g.values().length];
        iArr3[p208v6.g.SMS.ordinal()] = 1;
        iArr3[p208v6.g.EMAIL.ordinal()] = 2;
        $EnumSwitchMapping$2 = iArr3;
    }
}
