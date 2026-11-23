package p020ba;

import Z9.f;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import ma.c;
import p048ea.a;
import p048ea.o;
import p048ea.v;
import p068ga.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f7379l;

    public /* synthetic */ h(Object obj, int i10) {
        this.f7378k = i10;
        this.f7379l = obj;
    }

    @Override // ma.c
    public final void j() {
        switch (this.f7378k) {
            case 0:
                ((i) this.f7379l).cancel();
                return;
            case 1:
                ((v) this.f7379l).e(a.CANCEL);
                o oVar = ((v) this.f7379l).f11356b;
                synchronized (oVar) {
                    long j = oVar.f11310F;
                    long j10 = oVar.f11309E;
                    if (j < j10) {
                        return;
                    }
                    oVar.f11309E = j10 + 1;
                    oVar.f11311G = System.nanoTime() + ((long) 1000000000);
                    oVar.f11328z.c(new f(i.k(" ping", oVar.f11323u), oVar, 3), 0L);
                    return;
                }
            default:
                Socket socket = (Socket) this.f7379l;
                try {
                    socket.close();
                    return;
                } catch (AssertionError e10) {
                    if (!d.v(e10)) {
                        throw e10;
                    }
                    ma.o.a.log(Level.WARNING, i.k(socket, "Failed to close timed out socket "), (Throwable) e10);
                    return;
                } catch (Exception e11) {
                    ma.o.a.log(Level.WARNING, i.k(socket, "Failed to close timed out socket "), (Throwable) e11);
                    return;
                }
        }
    }

    public void k() throws IOException {
        if (i()) {
            throw l(null);
        }
    }

    public IOException l(IOException iOException) {
        switch (this.f7378k) {
            case 1:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            default:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }

    public h(v vVar) {
        this.f7378k = 1;
        i.f(vVar, "this$0");
        this.f7379l = vVar;
    }
}
