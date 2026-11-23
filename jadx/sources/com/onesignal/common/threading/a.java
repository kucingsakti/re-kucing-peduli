package com.onesignal.common.threading;

import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import Q3.u0;
import S9.n;
import com.unity3d.ads.metadata.MediationMetaData;
import p076h8.m;
import p123m8.j;
import p144o8.g;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.onesignal.common.threading.a$a, reason: collision with other inner class name */
    public static final class C0014a extends g implements p200u8.c {
        final /* synthetic */ p200u8.b $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0014a(p200u8.b bVar, p123m8.d<? super C0014a> dVar) {
            super(2, dVar);
            this.$block = bVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return new C0014a(this.$block, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((C0014a) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                p200u8.b bVar = this.$block;
                this.label = 1;
                if (bVar.invoke(this) == aVar) {
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

    public static final class b extends k implements p200u8.a {
        final /* synthetic */ p200u8.b $block;

        /* JADX INFO: renamed from: com.onesignal.common.threading.a$b$a, reason: collision with other inner class name */
        public static final class C0015a extends g implements p200u8.c {
            final /* synthetic */ p200u8.b $block;
            int label;

            /* JADX INFO: renamed from: com.onesignal.common.threading.a$b$a$a, reason: collision with other inner class name */
            public static final class C0016a extends g implements p200u8.c {
                final /* synthetic */ p200u8.b $block;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0016a(p200u8.b bVar, p123m8.d<? super C0016a> dVar) {
                    super(2, dVar);
                    this.$block = bVar;
                }

                @Override // p144o8.a
                public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
                    return new C0016a(this.$block, dVar);
                }

                @Override // p200u8.c
                public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
                    return ((C0016a) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
                }

                @Override // p144o8.a
                public final Object invokeSuspend(Object obj) {
                    p134n8.a aVar = p134n8.a.f13404s;
                    int i10 = this.label;
                    if (i10 == 0) {
                        J7.a.v(obj);
                        p200u8.b bVar = this.$block;
                        this.label = 1;
                        if (bVar.invoke(this) == aVar) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0015a(p200u8.b bVar, p123m8.d<? super C0015a> dVar) {
                super(2, dVar);
                this.$block = bVar;
            }

            @Override // p144o8.a
            public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
                return new C0015a(this.$block, dVar);
            }

            @Override // p200u8.c
            public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
                return ((C0015a) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                p134n8.a aVar = p134n8.a.f13404s;
                int i10 = this.label;
                if (i10 == 0) {
                    J7.a.v(obj);
                    U9.d dVar = I.a;
                    O9.d dVar2 = n.a;
                    C0016a c0016a = new C0016a(this.$block, null);
                    this.label = 1;
                    if (AbstractC0342z.w(dVar2, c0016a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p200u8.b bVar) {
            super(0);
            this.$block = bVar;
        }

        @Override // p200u8.a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m6invoke();
            return m.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() throws Throwable {
            try {
                AbstractC0342z.q(j.f13164s, new C0015a(this.$block, null));
            } catch (Exception e10) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread with switch to main", e10);
            }
        }
    }

    public static final class c extends k implements p200u8.a {
        final /* synthetic */ p200u8.b $block;

        /* JADX INFO: renamed from: com.onesignal.common.threading.a$c$a, reason: collision with other inner class name */
        public static final class C0017a extends g implements p200u8.c {
            final /* synthetic */ p200u8.b $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0017a(p200u8.b bVar, p123m8.d<? super C0017a> dVar) {
                super(2, dVar);
                this.$block = bVar;
            }

            @Override // p144o8.a
            public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
                return new C0017a(this.$block, dVar);
            }

            @Override // p200u8.c
            public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
                return ((C0017a) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                p134n8.a aVar = p134n8.a.f13404s;
                int i10 = this.label;
                if (i10 == 0) {
                    J7.a.v(obj);
                    p200u8.b bVar = this.$block;
                    this.label = 1;
                    if (bVar.invoke(this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p200u8.b bVar) {
            super(0);
            this.$block = bVar;
        }

        @Override // p200u8.a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m7invoke();
            return m.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() throws Throwable {
            try {
                AbstractC0342z.q(j.f13164s, new C0017a(this.$block, null));
            } catch (Exception e10) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread", e10);
            }
        }
    }

    public static final class d extends k implements p200u8.a {
        final /* synthetic */ p200u8.b $block;
        final /* synthetic */ String $name;

        /* JADX INFO: renamed from: com.onesignal.common.threading.a$d$a, reason: collision with other inner class name */
        public static final class C0018a extends g implements p200u8.c {
            final /* synthetic */ p200u8.b $block;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0018a(p200u8.b bVar, p123m8.d<? super C0018a> dVar) {
                super(2, dVar);
                this.$block = bVar;
            }

            @Override // p144o8.a
            public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
                return new C0018a(this.$block, dVar);
            }

            @Override // p200u8.c
            public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
                return ((C0018a) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
            }

            @Override // p144o8.a
            public final Object invokeSuspend(Object obj) {
                p134n8.a aVar = p134n8.a.f13404s;
                int i10 = this.label;
                if (i10 == 0) {
                    J7.a.v(obj);
                    p200u8.b bVar = this.$block;
                    this.label = 1;
                    if (bVar.invoke(this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, p200u8.b bVar) {
            super(0);
            this.$name = str;
            this.$block = bVar;
        }

        @Override // p200u8.a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m8invoke();
            return m.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m8invoke() throws Throwable {
            try {
                AbstractC0342z.q(j.f13164s, new C0018a(this.$block, null));
            } catch (Exception e10) {
                com.onesignal.debug.internal.logging.b.error("Exception on thread '" + this.$name + '\'', e10);
            }
        }
    }

    public static final void suspendifyBlocking(p200u8.b bVar) throws Throwable {
        i.f(bVar, "block");
        AbstractC0342z.q(j.f13164s, new C0014a(bVar, null));
    }

    public static final void suspendifyOnMain(p200u8.b bVar) {
        i.f(bVar, "block");
        u0.m(null, 0, new b(bVar), 31);
    }

    public static final void suspendifyOnThread(int i10, p200u8.b bVar) {
        i.f(bVar, "block");
        u0.m(null, i10, new c(bVar), 15);
    }

    public static /* synthetic */ void suspendifyOnThread$default(int i10, p200u8.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        suspendifyOnThread(i10, bVar);
    }

    public static final void suspendifyOnThread(String str, int i10, p200u8.b bVar) {
        i.f(str, MediationMetaData.KEY_NAME);
        i.f(bVar, "block");
        u0.m(str, i10, new d(str, bVar), 7);
    }

    public static /* synthetic */ void suspendifyOnThread$default(String str, int i10, p200u8.b bVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = -1;
        }
        suspendifyOnThread(str, i10, bVar);
    }
}
