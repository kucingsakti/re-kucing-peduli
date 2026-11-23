package S9;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final /* synthetic */ int a = 0;

    static {
        Object objD;
        Object objD2;
        Exception exc = new Exception();
        String simpleName = p181s3.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objD = p144o8.a.class.getCanonicalName();
        } catch (Throwable th) {
            objD = J7.a.d(th);
        }
        if (p076h8.h.a(objD) != null) {
            objD = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objD2 = t.class.getCanonicalName();
        } catch (Throwable th2) {
            objD2 = J7.a.d(th2);
        }
        if (p076h8.h.a(objD2) != null) {
            objD2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
