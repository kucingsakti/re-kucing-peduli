package com.onesignal.common.events;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import S9.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p076h8.m;
import p086i8.k;
import p144o8.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public class b implements d {
    private final List<Object> subscribers;

    public static final class a extends g implements p200u8.b {
        final /* synthetic */ p200u8.b $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p200u8.b bVar, p123m8.d<? super a> dVar) {
            super(1, dVar);
            this.$callback = bVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return b.this.new a(this.$callback, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            List listS0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            List list = b.this.subscribers;
            b bVar = b.this;
            synchronized (list) {
                listS0 = k.s0(bVar.subscribers);
            }
            Iterator it = listS0.iterator();
            while (it.hasNext()) {
                this.$callback.invoke(it.next());
            }
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super m> dVar) {
            return ((a) create(dVar)).invokeSuspend(m.a);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.common.events.b$b, reason: collision with other inner class name */
    public static final class C0013b extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0013b(p123m8.d<? super C0013b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.suspendingFire(null, this);
        }
    }

    public static final class c extends g implements p200u8.c {
        final /* synthetic */ p200u8.c $callback;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p200u8.c cVar, p123m8.d<? super c> dVar) {
            super(2, dVar);
            this.$callback = cVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new c(this.$callback, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((c) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            List listS0;
            Iterator it;
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                List list = b.this.subscribers;
                b bVar = b.this;
                synchronized (list) {
                    listS0 = k.s0(bVar.subscribers);
                }
                it = listS0.iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                J7.a.v(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                p200u8.c cVar = this.$callback;
                this.L$0 = it;
                this.label = 1;
                if (cVar.invoke(next, this) == aVar) {
                    return aVar;
                }
            }
            return m.a;
        }
    }

    public b() {
        List<Object> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        i.e(listSynchronizedList, "synchronizedList(mutableListOf())");
        this.subscribers = listSynchronizedList;
    }

    public final void fire(p200u8.b bVar) {
        List listS0;
        i.f(bVar, "callback");
        synchronized (this.subscribers) {
            listS0 = k.s0(this.subscribers);
        }
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            bVar.invoke(it.next());
        }
    }

    public final void fireOnMain(p200u8.b bVar) {
        i.f(bVar, "callback");
        com.onesignal.common.threading.a.suspendifyOnMain(new a(bVar, null));
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        List<Object> list = this.subscribers;
        i.f(list, "<this>");
        return list instanceof Collection ? !list.isEmpty() : list.iterator().hasNext();
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.add(obj);
        }
    }

    public final void subscribeAll(b bVar) {
        i.f(bVar, "from");
        synchronized (this.subscribers) {
            Iterator<Object> it = bVar.subscribers.iterator();
            while (it.hasNext()) {
                subscribe(it.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object suspendingFire(p200u8.c cVar, p123m8.d<? super m> dVar) {
        C0013b c0013b;
        List listS0;
        p200u8.c cVar2;
        Iterator it;
        if (dVar instanceof C0013b) {
            c0013b = (C0013b) dVar;
            int i10 = c0013b.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0013b.label = i10 - Integer.MIN_VALUE;
            } else {
                c0013b = new C0013b(dVar);
            }
        } else {
            c0013b = new C0013b(dVar);
        }
        Object obj = c0013b.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = c0013b.label;
        if (i11 == 0) {
            J7.a.v(obj);
            synchronized (this.subscribers) {
                listS0 = k.s0(this.subscribers);
            }
            cVar2 = cVar;
            it = listS0.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c0013b.L$1;
            p200u8.c cVar3 = (p200u8.c) c0013b.L$0;
            J7.a.v(obj);
            cVar2 = cVar3;
        }
        while (it.hasNext()) {
            Object next = it.next();
            c0013b.L$0 = cVar2;
            c0013b.L$1 = it;
            c0013b.label = 1;
            if (cVar2.invoke(next, c0013b) == aVar) {
                return aVar;
            }
        }
        return m.a;
    }

    public final Object suspendingFireOnMain(p200u8.c cVar, p123m8.d<? super m> dVar) throws Throwable {
        U9.d dVar2 = I.a;
        Object objW = AbstractC0342z.w(n.a, new c(cVar, null), dVar);
        return objW == p134n8.a.f13404s ? objW : m.a;
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(Object obj) {
        synchronized (this.subscribers) {
            this.subscribers.remove(obj);
        }
    }
}
