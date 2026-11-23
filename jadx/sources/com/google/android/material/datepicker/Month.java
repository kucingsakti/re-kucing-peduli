package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new p(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Calendar f9645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9646t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f9647u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f9650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f9651y;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = x.a(calendar);
        this.f9645s = calendarA;
        this.f9646t = calendarA.get(2);
        this.f9647u = calendarA.get(1);
        this.f9648v = calendarA.getMaximum(7);
        this.f9649w = calendarA.getActualMaximum(5);
        this.f9650x = calendarA.getTimeInMillis();
    }

    public static Month f(int i10, int i11) {
        Calendar calendarC = x.c(null);
        calendarC.set(1, i10);
        calendarC.set(2, i11);
        return new Month(calendarC);
    }

    public static Month g(long j) {
        Calendar calendarC = x.c(null);
        calendarC.setTimeInMillis(j);
        return new Month(calendarC);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f9645s.compareTo(month.f9645s);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f9646t == month.f9646t && this.f9647u == month.f9647u;
    }

    public final String h() {
        String dateTime;
        if (this.f9651y == null) {
            long timeInMillis = this.f9645s.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                Locale locale = Locale.getDefault();
                AtomicReference atomicReference = x.a;
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                DisplayContext unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
                instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
                dateTime = instanceForSkeleton.format(new Date(timeInMillis));
            } else {
                dateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.f9651y = dateTime;
        }
        return this.f9651y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9646t), Integer.valueOf(this.f9647u)});
    }

    public final int i(Month month) {
        if (!(this.f9645s instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f9646t - this.f9646t) + ((month.f9647u - this.f9647u) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9647u);
        parcel.writeInt(this.f9646t);
    }
}
