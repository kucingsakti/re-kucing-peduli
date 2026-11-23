package M6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f3178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f3179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f3180e;

    public a(Throwable th) {
        String name = th.getClass().getName();
        String message = th.getMessage();
        StackTraceElement[] stackTrace = th.getStackTrace();
        a aVar = th.getCause() != null ? new a(th.getCause()) : null;
        this.a = name;
        this.f3177b = message;
        this.f3178c = stackTrace;
        this.f3179d = aVar;
        this.f3180e = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.a;
            String str2 = this.a;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = aVar.f3177b;
            String str4 = this.f3177b;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            if (!Arrays.equals(this.f3178c, aVar.f3178c)) {
                return false;
            }
            a aVar2 = aVar.f3179d;
            a aVar3 = this.f3179d;
            if (aVar3 == null ? aVar2 != null : !aVar3.equals(aVar2)) {
                return false;
            }
            Throwable th = aVar.f3180e;
            Throwable th2 = this.f3180e;
            if (th2 != null) {
                return th2.equals(th);
            }
            if (th == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3177b;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f3178c)) * 31;
        a aVar = this.f3179d;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Throwable th = this.f3180e;
        return iHashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "RollbarThrowableWrapper{className='" + this.a + "', message='" + this.f3177b + "', stackTraceElements=" + Arrays.toString(this.f3178c) + ", cause=" + this.f3179d + ", throwable=" + this.f3180e + '}';
    }
}
