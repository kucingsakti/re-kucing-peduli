package p030ca;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final F2.c a = new F2.c(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f7574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DateFormat[] f7575c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f7574b = strArr;
        f7575c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        i.f(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f7574b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    DateFormat[] dateFormatArr = f7575c;
                    DateFormat simpleDateFormat = dateFormatArr[i10];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f7574b[i10], Locale.US);
                        simpleDateFormat.setTimeZone(Y9.c.f5824e);
                        dateFormatArr[i10] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                    i10 = i11;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
