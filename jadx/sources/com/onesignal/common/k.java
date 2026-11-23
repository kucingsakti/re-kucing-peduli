package com.onesignal.common;

import android.os.Build;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final k INSTANCE = new k();

    private k() {
    }

    public final String getTimeZoneId() {
        if (Build.VERSION.SDK_INT >= 26) {
            String id = ZoneId.systemDefault().getId();
            p210v8.i.e(id, "{\n            ZoneId.systemDefault().id\n        }");
            return id;
        }
        String id2 = TimeZone.getDefault().getID();
        p210v8.i.e(id2, "{\n            TimeZone.getDefault().id\n        }");
        return id2;
    }

    public final int getTimeZoneOffset() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }
}
