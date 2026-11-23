package com.google.android.gms.measurement.internal;

import M2.L;
import android.accounts.AccountManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzax extends L {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f8909u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f8910v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AccountManager f8911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f8912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f8913y;

    @Override // M2.L
    public final boolean Z0() {
        Calendar calendar = Calendar.getInstance();
        this.f8909u = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f8910v = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    public final long a1() {
        X0();
        return this.f8909u;
    }

    public final String b1() {
        X0();
        return this.f8910v;
    }
}
