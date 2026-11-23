package com.google.android.material.datepicker;

import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9652b = 0;
    public Long a;

    static {
        Month monthF = Month.f(1900, 0);
        Calendar calendarC = x.c(null);
        calendarC.setTimeInMillis(monthF.f9650x);
        x.a(calendarC).getTimeInMillis();
        Month monthF2 = Month.f(2100, 11);
        Calendar calendarC2 = x.c(null);
        calendarC2.setTimeInMillis(monthF2.f9650x);
        x.a(calendarC2).getTimeInMillis();
    }
}
