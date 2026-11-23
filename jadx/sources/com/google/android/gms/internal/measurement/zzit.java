package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzit extends zzhx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f8671b = Logger.getLogger(zzit.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f8672c = J0.f8351e;
    public t0 a;

    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public zzb(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    public /* synthetic */ zzit(int i10) {
        this();
    }

    public static int a(zzkb zzkbVar) {
        int iA = zzkbVar.a();
        return g(iA) + iA;
    }

    public static int b(int i10, zzkt zzktVar, D0 d3) {
        return ((zzhq) zzktVar).g(d3) + (g(i10 << 3) << 1);
    }

    public static int c(String str) {
        int length;
        try {
            length = L0.a(str);
        } catch (M0 unused) {
            length = str.getBytes(zzjm.a).length;
        }
        return g(length) + length;
    }

    public static int d(int i10, zzia zziaVar) {
        int iG = g(i10 << 3);
        int iN = zziaVar.n();
        return AbstractC0487g.t(iN, iN, iG);
    }

    public static int e(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int f(int i10) {
        return g(i10 << 3);
    }

    public static int g(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int h(int i10, int i11) {
        return g(i11) + g(i10 << 3);
    }

    private zzit() {
    }
}
