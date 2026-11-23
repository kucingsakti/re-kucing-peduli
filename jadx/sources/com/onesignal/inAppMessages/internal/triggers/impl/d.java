package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.inAppMessages.internal.l;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[l.b.values().length];
        iArr[l.b.EQUAL_TO.ordinal()] = 1;
        iArr[l.b.NOT_EQUAL_TO.ordinal()] = 2;
        iArr[l.b.EXISTS.ordinal()] = 3;
        iArr[l.b.CONTAINS.ordinal()] = 4;
        iArr[l.b.NOT_EXISTS.ordinal()] = 5;
        iArr[l.b.LESS_THAN.ordinal()] = 6;
        iArr[l.b.GREATER_THAN.ordinal()] = 7;
        iArr[l.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 8;
        iArr[l.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 9;
        $EnumSwitchMapping$0 = iArr;
    }
}
