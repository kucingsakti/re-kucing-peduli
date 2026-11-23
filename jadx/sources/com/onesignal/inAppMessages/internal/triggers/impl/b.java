package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.inAppMessages.internal.l;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[l.a.values().length];
        iArr[l.a.SESSION_TIME.ordinal()] = 1;
        iArr[l.a.TIME_SINCE_LAST_IN_APP.ordinal()] = 2;
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[l.b.values().length];
        iArr2[l.b.LESS_THAN.ordinal()] = 1;
        iArr2[l.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 2;
        iArr2[l.b.GREATER_THAN.ordinal()] = 3;
        iArr2[l.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 4;
        iArr2[l.b.EQUAL_TO.ordinal()] = 5;
        iArr2[l.b.NOT_EQUAL_TO.ordinal()] = 6;
        $EnumSwitchMapping$1 = iArr2;
    }
}
