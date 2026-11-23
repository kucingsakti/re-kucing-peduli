package G6;

import A1.C0099h;
import com.rollbar.api.payload.Payload;
import com.rollbar.api.payload.data.Client;
import com.rollbar.api.payload.data.Data;
import com.rollbar.api.payload.data.Level;
import com.rollbar.api.payload.data.Notifier;
import com.rollbar.api.payload.data.body.Body;
import com.rollbar.api.payload.data.body.Message;
import com.rollbar.api.payload.data.body.TraceChain;
import com.rollbar.notifier.sender.BufferedSender;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import za.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final va.a f1700d = va.b.e(b.class);
    public final L6.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H6.a f1701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f1702c;

    public b(H6.a aVar, L6.a aVar2) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1702c = reentrantReadWriteLock.readLock();
        reentrantReadWriteLock.writeLock();
        this.f1701b = aVar;
        this.a = aVar2;
    }

    public final void a(M6.a aVar) {
        Level level;
        Body bodyBuild;
        Lock lock = this.f1702c;
        lock.lock();
        try {
            H6.a aVar2 = this.f1701b;
            lock.unlock();
            boolean z6 = aVar2.f1921l;
            va.a aVar3 = f1700d;
            if (!z6) {
                aVar3.e("Notifier disabled.");
                return;
            }
            aVar3.e("Gathering information to build the payload.");
            Data.Builder builderFramework = new Data.Builder().environment(aVar2.f1912b).codeVersion(null).platform(aVar2.f1913c).language(aVar2.f1914d).framework(aVar2.f1915e);
            Throwable th = aVar == null ? null : aVar.f3180e;
            C0099h c0099h = aVar2.f1922m;
            if (th == null) {
                level = (Level) c0099h.f103t;
            } else {
                level = th instanceof Error ? (Level) c0099h.f104u : (Level) c0099h.f105v;
            }
            Data.Builder builderLevel = builderFramework.level(level);
            this.a.getClass();
            Body.Builder builder = new Body.Builder();
            if (aVar == null) {
                bodyBuild = builder.bodyContent(new Message.Builder().body(null).build()).build();
            } else if (aVar.f3179d == null) {
                bodyBuild = builder.bodyContent(L6.a.a(aVar)).build();
            } else {
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(L6.a.a(aVar));
                    aVar = aVar.f3179d;
                } while (aVar != null);
                bodyBuild = builder.bodyContent(new TraceChain.Builder().traces(arrayList).build()).build();
            }
            Data.Builder builderIsUncaught = builderLevel.body(bodyBuild).isUncaught(true);
            E6.a aVar4 = aVar2.f1916f;
            if (aVar4 != null) {
                aVar3.e("Gathering client info.");
                builderIsUncaught.client((Client) aVar4.b());
            }
            HashMap map = new HashMap();
            if (map.size() > 0) {
                builderIsUncaught.custom(map);
            }
            I6.a aVar5 = aVar2.f1917g;
            if (aVar5 != null) {
                aVar3.e("Gathering notifier info.");
                builderIsUncaught.notifier((Notifier) aVar5.b());
            }
            c cVar = aVar2.f1918h;
            if (cVar != null) {
                aVar3.e("Gathering timestamp info.");
                builderIsUncaught.timestamp((Long) cVar.b());
            }
            Payload payloadBuild = new Payload.Builder().accessToken(aVar2.a).data(builderIsUncaught.build()).build();
            aVar3.d(payloadBuild, "Payload built: {}");
            BufferedSender bufferedSender = aVar2.f1919i;
            if (bufferedSender != null) {
                a.f1699e.e("Sending payload.");
                bufferedSender.send(payloadBuild);
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
