package com.google.gson.internal.sql;

import com.google.gson.v;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f10141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f10142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f10143f;

    static {
        boolean z6;
        try {
            Class.forName("java.sql.Date");
            z6 = true;
        } catch (ClassNotFoundException unused) {
            z6 = false;
        }
        a = z6;
        if (z6) {
            f10139b = new a(0, Date.class);
            f10140c = new a(1, Timestamp.class);
            f10141d = SqlDateTypeAdapter.f10135b;
            f10142e = SqlTimeTypeAdapter.f10136b;
            f10143f = SqlTimestampTypeAdapter.f10137b;
            return;
        }
        f10139b = null;
        f10140c = null;
        f10141d = null;
        f10142e = null;
        f10143f = null;
    }
}
