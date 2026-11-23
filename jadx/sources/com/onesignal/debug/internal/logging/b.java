package com.onesignal.debug.internal.logging;

import X4.f;
import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final String TAG = "OneSignal";
    private static f applicationService;
    public static final b INSTANCE = new b();
    private static p131n5.b logLevel = p131n5.b.WARN;
    private static p131n5.b visualLogLevel = p131n5.b.NONE;

    public static final class a extends g implements p200u8.b {
        final /* synthetic */ String $finalFullMessage;
        final /* synthetic */ p131n5.b $level;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p131n5.b bVar, String str, d<? super a> dVar) {
            super(1, dVar);
            this.$level = bVar;
            this.$finalFullMessage = str;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return new a(this.$level, this.$finalFullMessage, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            f applicationService = b.INSTANCE.getApplicationService();
            Activity current = applicationService != null ? applicationService.getCurrent() : null;
            if (current != null) {
                new AlertDialog.Builder(current).setTitle(this.$level.toString()).setMessage(this.$finalFullMessage).show();
            }
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(d<? super m> dVar) {
            return ((a) create(dVar)).invokeSuspend(m.a);
        }
    }

    private b() {
    }

    public static final boolean atLogLevel(p131n5.b bVar) {
        i.f(bVar, "level");
        return bVar.compareTo(visualLogLevel) < 1 || bVar.compareTo(logLevel) < 1;
    }

    public static final void debug(String str, Throwable th) {
        i.f(str, "message");
        log(p131n5.b.DEBUG, str, th);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    public static final void error(String str, Throwable th) {
        i.f(str, "message");
        log(p131n5.b.ERROR, str, th);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    public static final void fatal(String str, Throwable th) {
        i.f(str, "message");
        log(p131n5.b.FATAL, str, th);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        fatal(str, th);
    }

    public static final p131n5.b getLogLevel() {
        return logLevel;
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static final p131n5.b getVisualLogLevel() {
        return visualLogLevel;
    }

    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }

    public static final void info(String str, Throwable th) {
        i.f(str, "message");
        log(p131n5.b.INFO, str, th);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    public static final void log(p131n5.b bVar, String str) {
        i.f(bVar, "level");
        i.f(str, "message");
        log(bVar, str, null);
    }

    public static final void setLogLevel(p131n5.b bVar) {
        i.f(bVar, "<set-?>");
        logLevel = bVar;
    }

    public static final void setVisualLogLevel(p131n5.b bVar) {
        i.f(bVar, "<set-?>");
        visualLogLevel = bVar;
    }

    public static final void verbose(String str, Throwable th) {
        i.f(str, "message");
        log(p131n5.b.VERBOSE, str, th);
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    public static final void warn(String str, Throwable th) {
        i.f(str, "message");
        log(p131n5.b.WARN, str, th);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    public final f getApplicationService() {
        return applicationService;
    }

    public final void setApplicationService(f fVar) {
        applicationService = fVar;
    }

    public static final void log(p131n5.b bVar, String str, Throwable th) {
        i.f(bVar, "level");
        i.f(str, "message");
        String str2 = "[" + Thread.currentThread().getName() + "] " + str;
        if (bVar.compareTo(logLevel) < 1) {
            int i10 = com.onesignal.debug.internal.logging.a.$EnumSwitchMapping$0[bVar.ordinal()];
            if (i10 == 3) {
                Log.i(TAG, str2, th);
            } else if (i10 == 4) {
                Log.w(TAG, str2, th);
            }
        }
        if (bVar.compareTo(visualLogLevel) < 1) {
            f fVar = applicationService;
            if ((fVar != null ? fVar.getCurrent() : null) != null) {
                try {
                    String strX = L9.g.x(str.concat("\n"));
                    if (th != null) {
                        String str3 = strX + th.getMessage();
                        StringWriter stringWriter = new StringWriter();
                        th.printStackTrace(new PrintWriter(stringWriter));
                        strX = str3 + stringWriter;
                    }
                    com.onesignal.common.threading.a.suspendifyOnMain(new a(bVar, strX, null));
                } catch (Throwable unused) {
                }
            }
        }
    }
}
