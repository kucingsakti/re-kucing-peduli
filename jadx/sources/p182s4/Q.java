package p182s4;

import N9.InterfaceC0341y;
import O3.k;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import o1.h;
import p076h8.m;
import p086i8.l;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f14648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14649u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(h hVar, ArrayList arrayList, d dVar) {
        super(2, dVar);
        this.f14648t = hVar;
        this.f14649u = arrayList;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        return new Q(this.f14648t, this.f14649u, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((InterfaceC0341y) obj, (d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.f14647s;
        if (i10 == 0) {
            J7.a.v(obj);
            p191t4.c cVar = p191t4.c.a;
            this.f14647s = 1;
            obj = cVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
        }
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            Collection collectionValues = map.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).a.u()) {
                        ArrayList arrayList = this.f14649u;
                        h hVar = this.f14648t;
                        for (Message message : p086i8.k.o0(p086i8.k.R(l.E(h.a(hVar, arrayList, 2), h.a(hVar, arrayList, 1))), new P())) {
                            Messenger messenger = (Messenger) hVar.f13633t;
                            LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) hVar.f13634u;
                            if (messenger != null) {
                                try {
                                    int i11 = message.what;
                                    messenger.send(message);
                                } catch (RemoteException e10) {
                                    Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e10);
                                    if (linkedBlockingDeque.offer(message)) {
                                        linkedBlockingDeque.size();
                                    }
                                }
                            } else if (linkedBlockingDeque.offer(message)) {
                                int i12 = message.what;
                                linkedBlockingDeque.size();
                            } else {
                                int i13 = message.what;
                            }
                        }
                        break;
                    }
                }
            }
        }
        return m.a;
    }
}
