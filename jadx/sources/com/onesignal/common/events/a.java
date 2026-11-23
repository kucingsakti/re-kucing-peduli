package com.onesignal.common.events;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import S9.n;
import p076h8.m;
import p144o8.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public class a implements c {
    private Object callback;

    /* JADX INFO: renamed from: com.onesignal.common.events.a$a, reason: collision with other inner class name */
    public static final class C0012a extends g implements p200u8.b {
        final /* synthetic */ p200u8.b $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0012a(p200u8.b bVar, p123m8.d<? super C0012a> dVar) {
            super(1, dVar);
            this.$callback = bVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(p123m8.d<?> dVar) {
            return a.this.new C0012a(this.$callback, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            if (a.this.callback != null) {
                p200u8.b bVar = this.$callback;
                Object obj2 = a.this.callback;
                i.c(obj2);
                bVar.invoke(obj2);
            }
            return m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super m> dVar) {
            return ((C0012a) create(dVar)).invokeSuspend(m.a);
        }
    }

    public static final class b extends g implements p200u8.c {
        final /* synthetic */ p200u8.c $callback;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p200u8.c cVar, a aVar, p123m8.d<? super b> dVar) {
            super(2, dVar);
            this.$callback = cVar;
            this.this$0 = aVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return new b(this.$callback, this.this$0, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((b) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                p200u8.c cVar = this.$callback;
                Object obj2 = this.this$0.callback;
                i.c(obj2);
                this.label = 1;
                if (cVar.invoke(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return m.a;
        }
    }

    public final void fire(p200u8.b bVar) {
        i.f(bVar, "callback");
        Object obj = this.callback;
        if (obj != null) {
            i.c(obj);
            bVar.invoke(obj);
        }
    }

    public final void fireOnMain(p200u8.b bVar) {
        i.f(bVar, "callback");
        com.onesignal.common.threading.a.suspendifyOnMain(new C0012a(bVar, null));
    }

    @Override // com.onesignal.common.events.c
    public boolean getHasCallback() {
        return this.callback != null;
    }

    @Override // com.onesignal.common.events.c
    public void set(Object obj) {
        this.callback = obj;
    }

    public final Object suspendingFire(p200u8.c cVar, p123m8.d<? super m> dVar) {
        Object obj = this.callback;
        m mVar = m.a;
        if (obj != null) {
            i.c(obj);
            Object objInvoke = cVar.invoke(obj, dVar);
            if (objInvoke == p134n8.a.f13404s) {
                return objInvoke;
            }
        }
        return mVar;
    }

    public final Object suspendingFireOnMain(p200u8.c cVar, p123m8.d<? super m> dVar) throws Throwable {
        Object obj = this.callback;
        m mVar = m.a;
        if (obj != null) {
            U9.d dVar2 = I.a;
            Object objW = AbstractC0342z.w(n.a, new b(cVar, this, null), dVar);
            if (objW == p134n8.a.f13404s) {
                return objW;
            }
        }
        return mVar;
    }
}
