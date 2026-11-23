package com.google.android.gms.internal.measurement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zzcl {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final zzcl f8550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ zzcl[] f8551t;

    static {
        zzcl zzclVar = new zzcl("READ_AND_WRITE", 0);
        f8550s = zzclVar;
        f8551t = new zzcl[]{zzclVar, new zzcl("READ_ONLY", 1), new zzcl("WRITE_ONLY", 2)};
    }

    public static zzcl[] values() {
        return (zzcl[]) f8551t.clone();
    }
}
