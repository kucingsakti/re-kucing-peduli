package com.kcstream.cing.library;

import A0.m;
import Ha.a;
import K4.f;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Calendar;
import kotlin.Metadata;
import p210v8.i;
import za.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kcstream/cing/library/AdController;", "LK4/f;", "", "ssEwx7TtXGi0X9K7r6VY", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AdController extends f {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public SharedPreferences f10264V;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f10268Z;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final String f10265W = "adClickCount";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final String f10266X = "adClickTimestamp";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f10267Y = 5;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final long f10269a0 = System.currentTimeMillis();

    /* JADX INFO: Access modifiers changed from: private */
    public final native String ssEwx7TtXGi0X9K7r6VY();

    public final void A(m mVar) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        SharedPreferences sharedPreferencesB = B();
        String str = this.f10266X;
        long j = sharedPreferencesB.getLong(str, 0L);
        int i10 = Calendar.getInstance().get(5);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i11 = calendar.get(5);
        SharedPreferences sharedPreferencesB2 = B();
        String str2 = this.f10265W;
        int i12 = sharedPreferencesB2.getInt(str2, 0);
        if (i10 == i11 && i12 >= this.f10267Y) {
            mVar.invoke(Boolean.FALSE);
            return;
        }
        if (i10 != i11) {
            SharedPreferences.Editor editorEdit = B().edit();
            editorEdit.putInt(str2, 1).putLong(str, timeInMillis);
            editorEdit.apply();
        } else {
            SharedPreferences.Editor editorEdit2 = B().edit();
            editorEdit2.putInt(str2, i12 + 1).putLong(str, timeInMillis);
            editorEdit2.apply();
        }
        mVar.invoke(Boolean.TRUE);
    }

    public final SharedPreferences B() {
        SharedPreferences sharedPreferences = this.f10264V;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        i.n("sharedPrefs");
        throw null;
    }

    @Override // K4.f, p078i.AbstractActivityC0655l, p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences("AdController", 0);
        try {
            i.c(sharedPreferences);
            this.f10264V = sharedPreferences;
            this.f10267Y = y().getInt("oneLi", 5);
            this.f10268Z = y().getBoolean("isReady", false);
            B().getInt(this.f10265W, 0);
            long j = B().getLong("last_ad_time", 0L);
            long j10 = this.f10269a0;
            if (j10 >= j) {
                A(new m(this, 8));
                return;
            }
            long j11 = j - j10;
            long j12 = 1000;
            long j13 = 60;
            long j14 = (j11 / j12) / j13;
            long j15 = (j11 / j12) % j13;
            a.a.getClass();
            c.h(new Object[0]);
        } catch (Exception unused) {
        }
    }
}
