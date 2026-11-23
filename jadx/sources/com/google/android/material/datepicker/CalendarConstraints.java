package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Month f9636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Month f9637t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DateValidator f9638u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Month f9639v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f9641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f9642y;

    public interface DateValidator extends Parcelable {
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f9636s = month;
        this.f9637t = month2;
        this.f9639v = month3;
        this.f9640w = i10;
        this.f9638u = dateValidator;
        if (month3 != null && month.f9645s.compareTo(month3.f9645s) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f9645s.compareTo(month2.f9645s) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > x.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f9642y = month.i(month2) + 1;
        this.f9641x = (month2.f9647u - month.f9647u) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f9636s.equals(calendarConstraints.f9636s) && this.f9637t.equals(calendarConstraints.f9637t) && Objects.equals(this.f9639v, calendarConstraints.f9639v) && this.f9640w == calendarConstraints.f9640w && this.f9638u.equals(calendarConstraints.f9638u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9636s, this.f9637t, this.f9639v, Integer.valueOf(this.f9640w), this.f9638u});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f9636s, 0);
        parcel.writeParcelable(this.f9637t, 0);
        parcel.writeParcelable(this.f9639v, 0);
        parcel.writeParcelable(this.f9638u, 0);
        parcel.writeInt(this.f9640w);
    }
}
