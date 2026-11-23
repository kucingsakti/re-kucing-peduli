package p182s4;

import D3.g;
import M9.a;
import M9.c;
import N9.AbstractC0342z;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Objects;
import p197u4.f;
import p197u4.j;
import p210v8.i;
import qa.b;

/* JADX INFO: loaded from: classes.dex */
public final class T extends Handler {
    public boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14652c;

    public T(Looper looper) {
        super(looper);
        this.f14652c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        if (this.a) {
            Object objB = g.c().b(M.class);
            i.e(objB, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((M) objB).b().a);
            return;
        }
        Object objB2 = g.c().b(InterfaceC0783u.class);
        i.e(objB2, "Firebase.app[SessionDatastore::class.java]");
        C0777n c0777n = (C0777n) ((D) ((InterfaceC0783u) objB2)).f14608c.get();
        String str = c0777n != null ? c0777n.a : null;
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        Object objB = g.c().b(M.class);
        i.e(objB, "Firebase.app[SessionGenerator::class.java]");
        M m2 = (M) objB;
        int i10 = m2.f14637d + 1;
        m2.f14637d = i10;
        String strA = i10 == 0 ? m2.f14636c : m2.a();
        int i11 = m2.f14637d;
        m2.a.getClass();
        m2.f14638e = new E(strA, m2.f14636c, i11, System.currentTimeMillis() * 1000);
        m2.b();
        Object objB2 = g.c().b(M.class);
        i.e(objB2, "Firebase.app[SessionGenerator::class.java]");
        ((M) objB2).b();
        Object objB3 = g.c().b(M.class);
        i.e(objB3, "Firebase.app[SessionGenerator::class.java]");
        ((M) objB3).b().toString();
        Object objB4 = g.c().b(H.class);
        i.e(objB4, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object objB5 = g.c().b(M.class);
        i.e(objB5, "Firebase.app[SessionGenerator::class.java]");
        K k3 = (K) ((H) objB4);
        AbstractC0342z.n(AbstractC0342z.b(k3.f14633e), null, new I(k3, ((M) objB5).b(), null), 3);
        for (Messenger messenger : new ArrayList(this.f14652c)) {
            i.e(messenger, "it");
            a(messenger);
        }
        Object objB6 = g.c().b(InterfaceC0783u.class);
        i.e(objB6, "Firebase.app[SessionDatastore::class.java]");
        Object objB7 = g.c().b(M.class);
        i.e(objB7, "Firebase.app[SessionGenerator::class.java]");
        D d3 = (D) ((InterfaceC0783u) objB6);
        String str = ((M) objB7).b().a;
        i.f(str, JsonStorageKeyNames.SESSION_ID_KEY);
        AbstractC0342z.n(AbstractC0342z.b(d3.f14607b), null, new C(d3, str, null), 3);
    }

    public final void c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            Objects.toString(messenger);
            this.f14652c.remove(messenger);
        } catch (Exception e10) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f fVar;
        Integer num;
        long jF;
        a aVar = null;
        i.f(message, "msg");
        if (this.f14651b > message.getWhen()) {
            message.getWhen();
            return;
        }
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 == 2) {
                message.getWhen();
                this.f14651b = message.getWhen();
                return;
            }
            if (i10 != 4) {
                Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
                super.handleMessage(message);
                return;
            }
            ArrayList arrayList = this.f14652c;
            arrayList.add(message.replyTo);
            Messenger messenger = message.replyTo;
            i.e(messenger, "msg.replyTo");
            a(messenger);
            Objects.toString(message.replyTo);
            message.getWhen();
            arrayList.size();
            return;
        }
        message.getWhen();
        if (this.a) {
            long when = message.getWhen() - this.f14651b;
            j.f15330c.getClass();
            Object objB = g.c().b(j.class);
            i.e(objB, "Firebase.app[SessionsSettings::class.java]");
            j jVar = (j) objB;
            Bundle bundle = jVar.a.a;
            a aVar2 = bundle.containsKey("firebase_sessions_sessions_restart_timeout") ? new a(b.F(bundle.getInt("firebase_sessions_sessions_restart_timeout"), c.SECONDS)) : null;
            if (aVar2 != null) {
                int i11 = a.f3249v;
                jF = aVar2.f3250s;
                if (jF <= 0 || a.g(jF)) {
                    fVar = jVar.f15332b.b().f15348b;
                    if (fVar != null) {
                        i.n("sessionConfigs");
                        throw null;
                    }
                    num = fVar.f15322c;
                    if (num != null) {
                        int i12 = a.f3249v;
                        aVar = new a(b.F(num.intValue(), c.SECONDS));
                    }
                    if (aVar != null) {
                        int i13 = a.f3249v;
                        jF = aVar.f3250s;
                        if (jF > 0 || a.g(jF)) {
                            int i14 = a.f3249v;
                            jF = b.F(30, c.MINUTES);
                        }
                    } else {
                        int i15 = a.f3249v;
                        jF = b.F(30, c.MINUTES);
                    }
                }
            } else {
                fVar = jVar.f15332b.b().f15348b;
                if (fVar != null) {
                    i.n("sessionConfigs");
                    throw null;
                }
                num = fVar.f15322c;
                if (num != null) {
                    int i16 = a.f3249v;
                    aVar = new a(b.F(num.intValue(), c.SECONDS));
                }
                if (aVar != null) {
                    int i17 = a.f3249v;
                    jF = aVar.f3250s;
                    if (jF > 0) {
                        int i18 = a.f3249v;
                        jF = b.F(30, c.MINUTES);
                    } else {
                        int i19 = a.f3249v;
                        jF = b.F(30, c.MINUTES);
                    }
                } else {
                    int i110 = a.f3249v;
                    jF = b.F(30, c.MINUTES);
                }
            }
            if (when > (((((int) jF) & 1) != 1 || a.g(jF)) ? a.h(jF, c.MILLISECONDS) : jF >> 1)) {
                b();
            }
        } else {
            this.a = true;
            b();
        }
        this.f14651b = message.getWhen();
    }
}
