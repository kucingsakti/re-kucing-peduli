package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0576j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[zzbv.values().length];
        a = iArr;
        try {
            iArr[zzbv.FOR_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[zzbv.FOR_IN_CONST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[zzbv.FOR_IN_LET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[zzbv.FOR_LET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[zzbv.FOR_OF.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[zzbv.FOR_OF_CONST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[zzbv.FOR_OF_LET.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[zzbv.WHILE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
