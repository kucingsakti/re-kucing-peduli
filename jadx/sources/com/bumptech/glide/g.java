package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f7603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f7604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g f7605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f7606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ g[] f7607w;

    static {
        g gVar = new g("IMMEDIATE", 0);
        f7603s = gVar;
        g gVar2 = new g("HIGH", 1);
        f7604t = gVar2;
        g gVar3 = new g("NORMAL", 2);
        f7605u = gVar3;
        g gVar4 = new g("LOW", 3);
        f7606v = gVar4;
        f7607w = new g[]{gVar, gVar2, gVar3, gVar4};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f7607w.clone();
    }
}
