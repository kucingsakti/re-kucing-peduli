package p077ha;

import L9.f;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Handler {
    public static final d a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i10;
        int iMin;
        i.f(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.a;
        String loggerName = logRecord.getLoggerName();
        i.e(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i10 = 5;
        } else {
            i10 = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        i.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strI0 = (String) c.f11891b.get(loggerName);
        if (strI0 == null) {
            strI0 = f.i0(23, loggerName);
        }
        if (Log.isLoggable(strI0, i10)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int iO = f.O(message, '\n', i11, 4);
                if (iO == -1) {
                    iO = length;
                }
                while (true) {
                    iMin = Math.min(iO, i11 + 4000);
                    String strSubstring = message.substring(i11, iMin);
                    i.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strI0, strSubstring);
                    if (iMin >= iO) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
