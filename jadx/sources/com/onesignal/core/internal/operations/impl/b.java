package com.onesignal.core.internal.operations.impl;

import C8.InterfaceC0175c;
import N9.AbstractC0342z;
import N9.C0330m;
import N9.InterfaceC0329l;
import N9.InterfaceC0341y;
import N9.V;
import N9.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import p076h8.m;
import p086i8.k;
import p086i8.l;
import p210v8.i;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p064g5.f, p100k5.b {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p162q6.b _identityModelStore;
    private final p193t6.a _newRecordState;
    private final com.onesignal.core.internal.operations.impl.a _operationModelStore;
    private final p110l5.a _time;
    private InterfaceC0341y coroutineScope;
    private int enqueueIntoBucket;
    private final Map<String, p064g5.d> executorsMap;
    private final InterfaceC0329l initialized;
    private boolean paused;
    private final List<C0030b> queue;
    private final com.onesignal.common.threading.c retryWaiter;
    private final com.onesignal.common.threading.c waiter;

    public static final class c extends p144o8.g implements p200u8.c {
        int label;

        public c(p123m8.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super a> dVar) {
            return ((c) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
                return obj;
            }
            J7.a.v(obj);
            com.onesignal.common.threading.c cVar = b.this.retryWaiter;
            this.label = 1;
            Object objWaitForWake = cVar.waitForWake(this);
            return objWaitForWake == aVar ? aVar : objWaitForWake;
        }
    }

    public static final class d extends p144o8.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public d(p123m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.executeOperations$com_onesignal_core(null, this);
        }
    }

    public static final class e extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(p123m8.d<? super e> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.processQueueForever(this);
        }
    }

    public static final class f extends p144o8.g implements p200u8.c {
        int label;

        public f(p123m8.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return b.this.new f(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((f) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                b.this.loadSavedOperations$com_onesignal_core();
                b bVar = b.this;
                this.label = 1;
                if (bVar.processQueueForever(this) == aVar) {
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

    public static final class g extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public g(p123m8.d<? super g> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.waitForNewOperationAndExecutionInterval(this);
        }
    }

    public static final class h extends p144o8.g implements p200u8.c {
        final /* synthetic */ t $wakeMessage;
        Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(t tVar, b bVar, p123m8.d<? super h> dVar) {
            super(2, dVar);
            this.$wakeMessage = tVar;
            this.this$0 = bVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return new h(this.$wakeMessage, this.this$0, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((h) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                t tVar2 = this.$wakeMessage;
                com.onesignal.common.threading.c cVar = this.this$0.waiter;
                this.L$0 = tVar2;
                this.label = 1;
                Object objWaitForWake = cVar.waitForWake(this);
                if (objWaitForWake == aVar) {
                    return aVar;
                }
                tVar = tVar2;
                obj = objWaitForWake;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (t) this.L$0;
                J7.a.v(obj);
            }
            tVar.f15466s = obj;
            return m.a;
        }
    }

    public b(List<? extends p064g5.d> list, com.onesignal.core.internal.operations.impl.a aVar, com.onesignal.core.internal.config.b bVar, p162q6.b bVar2, p110l5.a aVar2, p193t6.a aVar3) {
        i.f(list, "executors");
        i.f(aVar, "_operationModelStore");
        i.f(bVar, "_configModelStore");
        i.f(bVar2, "_identityModelStore");
        i.f(aVar2, "_time");
        i.f(aVar3, "_newRecordState");
        this._operationModelStore = aVar;
        this._configModelStore = bVar;
        this._identityModelStore = bVar2;
        this._time = aVar2;
        this._newRecordState = aVar3;
        this.queue = new ArrayList();
        this.waiter = new com.onesignal.common.threading.c();
        this.retryWaiter = new com.onesignal.common.threading.c();
        this.coroutineScope = AbstractC0342z.b(new V(Executors.newScheduledThreadPool(1, new t0("OpRepo", new AtomicInteger()))));
        this.initialized = AbstractC0342z.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (p064g5.d dVar : list) {
            Iterator<String> it = dVar.getOperations().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), dVar);
            }
        }
        this.executorsMap = linkedHashMap;
    }

    private final int getExecuteBucket() {
        int i10 = this.enqueueIntoBucket;
        if (i10 == 0) {
            return 0;
        }
        return i10 - 1;
    }

    private final List<C0030b> getGroupableOperations(C0030b c0030b) throws Exception {
        ArrayList arrayListE = l.E(c0030b);
        if (c0030b.getOperation().getGroupComparisonType() != p064g5.c.NONE) {
            String createComparisonKey = c0030b.getOperation().getGroupComparisonType() == p064g5.c.CREATE ? c0030b.getOperation().getCreateComparisonKey() : c0030b.getOperation().getModifyComparisonKey();
            for (C0030b c0030b2 : k.s0(this.queue)) {
                String createComparisonKey2 = c0030b.getOperation().getGroupComparisonType() == p064g5.c.CREATE ? c0030b2.getOperation().getCreateComparisonKey() : c0030b2.getOperation().getModifyComparisonKey();
                if (i.a(createComparisonKey2, "") && i.a(createComparisonKey, "")) {
                    throw new Exception("Both comparison keys can not be blank!");
                }
                if (this._newRecordState.canAccess(c0030b2.getOperation().getApplyToRecordId()) && i.a(createComparisonKey2, createComparisonKey)) {
                    this.queue.remove(c0030b2);
                    arrayListE.add(c0030b2);
                }
            }
        }
        return arrayListE;
    }

    private final void internalEnqueue(C0030b c0030b, boolean z6, boolean z10, Integer num) {
        synchronized (this.queue) {
            try {
                List<C0030b> list = this.queue;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (i.a(((C0030b) it.next()).getOperation().getId(), c0030b.getOperation().getId())) {
                            com.onesignal.debug.internal.logging.b.debug$default("OperationRepo: internalEnqueue - operation.id: " + c0030b.getOperation().getId() + " already exists in the queue.", null, 2, null);
                            return;
                        }
                    }
                }
                if (num != null) {
                    this.queue.add(num.intValue(), c0030b);
                } else {
                    this.queue.add(c0030b);
                }
                if (z10) {
                    com.onesignal.common.modeling.b.add$default(this._operationModelStore, c0030b.getOperation(), null, 2, null);
                }
                this.waiter.wake(new a(z6, 0L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void internalEnqueue$default(b bVar, C0030b c0030b, boolean z6, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            num = null;
        }
        bVar.internalEnqueue(c0030b, z6, z10, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[PHI: r2
      0x0069: PHI (r2v4 com.onesignal.core.internal.operations.impl.b) = 
      (r2v2 com.onesignal.core.internal.operations.impl.b)
      (r2v3 com.onesignal.core.internal.operations.impl.b)
      (r2v5 com.onesignal.core.internal.operations.impl.b)
      (r2v11 com.onesignal.core.internal.operations.impl.b)
     binds: [B:24:0x0064, B:35:0x00b0, B:40:0x00be, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c A[PHI: r2
      0x009c: PHI (r2v3 com.onesignal.core.internal.operations.impl.b) = (r2v4 com.onesignal.core.internal.operations.impl.b), (r2v9 com.onesignal.core.internal.operations.impl.b) binds: [B:32:0x0099, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b0 -> B:25:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bb -> B:40:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object processQueueForever(p123m8.d<? super p076h8.m> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.onesignal.core.internal.operations.impl.b.e
            if (r0 == 0) goto L13
            r0 = r11
            com.onesignal.core.internal.operations.impl.b$e r0 = (com.onesignal.core.internal.operations.impl.b.e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onesignal.core.internal.operations.impl.b$e r0 = new com.onesignal.core.internal.operations.impl.b$e
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L55
            if (r2 == r6) goto L4d
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r2 = r0.L$0
            com.onesignal.core.internal.operations.impl.b r2 = (com.onesignal.core.internal.operations.impl.b) r2
            J7.a.v(r11)
            goto Lbe
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3d:
            java.lang.Object r2 = r0.L$0
            com.onesignal.core.internal.operations.impl.b r2 = (com.onesignal.core.internal.operations.impl.b) r2
            J7.a.v(r11)
            goto L69
        L45:
            java.lang.Object r2 = r0.L$0
            com.onesignal.core.internal.operations.impl.b r2 = (com.onesignal.core.internal.operations.impl.b) r2
            J7.a.v(r11)
            goto L9c
        L4d:
            java.lang.Object r2 = r0.L$0
            com.onesignal.core.internal.operations.impl.b r2 = (com.onesignal.core.internal.operations.impl.b) r2
            J7.a.v(r11)
            goto L64
        L55:
            J7.a.v(r11)
            r0.L$0 = r10
            r0.label = r6
            java.lang.Object r11 = r10.waitForNewOperationAndExecutionInterval(r0)
            if (r11 != r1) goto L63
            goto Lbd
        L63:
            r2 = r10
        L64:
            int r11 = r2.enqueueIntoBucket
            int r11 = r11 + r6
            r2.enqueueIntoBucket = r11
        L69:
            boolean r11 = r2.paused
            r7 = 0
            if (r11 == 0) goto L76
            java.lang.String r11 = "OperationRepo is paused"
            com.onesignal.debug.internal.logging.b.debug$default(r11, r7, r5, r7)
            h8.m r11 = p076h8.m.a
            return r11
        L76:
            int r11 = r2.getExecuteBucket()
            java.util.List r11 = r2.getNextOps$com_onesignal_core(r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "processQueueForever:ops:\n"
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            com.onesignal.debug.internal.logging.b.debug$default(r8, r7, r5, r7)
            if (r11 == 0) goto Lb3
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r11 = r2.executeOperations$com_onesignal_core(r11, r0)
            if (r11 != r1) goto L9c
            goto Lbd
        L9c:
            com.onesignal.core.internal.config.b r11 = r2._configModelStore
            com.onesignal.common.modeling.i r11 = r11.getModel()
            com.onesignal.core.internal.config.a r11 = (com.onesignal.core.internal.config.a) r11
            long r7 = r11.getOpRepoPostWakeDelay()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r11 = N9.AbstractC0342z.e(r7, r0)
            if (r11 != r1) goto L69
            goto Lbd
        Lb3:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r11 = r2.waitForNewOperationAndExecutionInterval(r0)
            if (r11 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            int r11 = r2.enqueueIntoBucket
            int r11 = r11 + r6
            r2.enqueueIntoBucket = r11
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.operations.impl.b.processQueueForever(m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009a -> B:26:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForNewOperationAndExecutionInterval(p123m8.d<? super p076h8.m> r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.onesignal.core.internal.operations.impl.b.g
            if (r0 == 0) goto L13
            r0 = r11
            com.onesignal.core.internal.operations.impl.b$g r0 = (com.onesignal.core.internal.operations.impl.b.g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onesignal.core.internal.operations.impl.b$g r0 = new com.onesignal.core.internal.operations.impl.b$g
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r2 = r0.L$1
            v8.t r2 = (p210v8.t) r2
            java.lang.Object r4 = r0.L$0
            com.onesignal.core.internal.operations.impl.b r4 = (com.onesignal.core.internal.operations.impl.b) r4
            J7.a.v(r11)
            goto L9d
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            java.lang.Object r2 = r0.L$2
            v8.t r2 = (p210v8.t) r2
            java.lang.Object r4 = r0.L$1
            v8.t r4 = (p210v8.t) r4
            java.lang.Object r5 = r0.L$0
            com.onesignal.core.internal.operations.impl.b r5 = (com.onesignal.core.internal.operations.impl.b) r5
            J7.a.v(r11)
            goto L65
        L4a:
            J7.a.v(r11)
            v8.t r2 = new v8.t
            r2.<init>()
            com.onesignal.common.threading.c r11 = r10.waiter
            r0.L$0 = r10
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r4
            java.lang.Object r11 = r11.waitForWake(r0)
            if (r11 != r1) goto L63
            goto L9c
        L63:
            r5 = r10
            r4 = r2
        L65:
            r2.f15466s = r11
            com.onesignal.core.internal.config.b r11 = r5._configModelStore
            com.onesignal.common.modeling.i r11 = r11.getModel()
            com.onesignal.core.internal.config.a r11 = (com.onesignal.core.internal.config.a) r11
            long r6 = r11.getOpRepoExecutionInterval()
            java.lang.Object r11 = r4.f15466s
            com.onesignal.core.internal.operations.impl.b$a r11 = (com.onesignal.core.internal.operations.impl.b.a) r11
            long r8 = r11.getPreviousWaitedTime()
            long r6 = r6 - r8
            r2 = r4
            r4 = r5
        L7e:
            java.lang.Object r11 = r2.f15466s
            com.onesignal.core.internal.operations.impl.b$a r11 = (com.onesignal.core.internal.operations.impl.b.a) r11
            boolean r11 = r11.getForce()
            if (r11 != 0) goto Lad
            com.onesignal.core.internal.operations.impl.b$h r11 = new com.onesignal.core.internal.operations.impl.b$h
            r5 = 0
            r11.<init>(r2, r4, r5)
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r11 = N9.AbstractC0342z.y(r6, r11, r0)
            if (r11 != r1) goto L9d
        L9c:
            return r1
        L9d:
            if (r11 != 0) goto La0
            goto Lad
        La0:
            com.onesignal.core.internal.config.b r11 = r4._configModelStore
            com.onesignal.common.modeling.i r11 = r11.getModel()
            com.onesignal.core.internal.config.a r11 = (com.onesignal.core.internal.config.a) r11
            long r6 = r11.getOpRepoExecutionInterval()
            goto L7e
        Lad:
            h8.m r11 = p076h8.m.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.operations.impl.b.waitForNewOperationAndExecutionInterval(m8.d):java.lang.Object");
    }

    @Override // p064g5.f
    public Object awaitInitialized(p123m8.d<? super m> dVar) throws Throwable {
        Object objQ = ((C0330m) this.initialized).Q(dVar);
        return objQ == p134n8.a.f13404s ? objQ : m.a;
    }

    @Override // p064g5.f
    public <T extends p064g5.g> boolean containsInstanceOf(InterfaceC0175c interfaceC0175c) {
        boolean z6;
        i.f(interfaceC0175c, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        synchronized (this.queue) {
            try {
                List<C0030b> list = this.queue;
                z6 = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (interfaceC0175c.u(((C0030b) it.next()).getOperation())) {
                            z6 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    public final Object delayBeforeNextExecution(int i10, Integer num, p123m8.d<? super m> dVar) throws Throwable {
        com.onesignal.debug.internal.logging.b.debug$default("retryAfterSeconds: " + num, null, 2, null);
        long jMax = Math.max(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getOpRepoDefaultFailRetryBackoff() * ((long) i10), (num != null ? num.intValue() : 0L) * ((long) 1000));
        m mVar = m.a;
        if (jMax < 1) {
            return mVar;
        }
        com.onesignal.debug.internal.logging.b.error$default("Operations being delay for: " + jMax + " ms", null, 2, null);
        Object objY = AbstractC0342z.y(jMax, new c(null), dVar);
        return objY == p134n8.a.f13404s ? objY : mVar;
    }

    @Override // p064g5.f
    public void enqueue(p064g5.g gVar, boolean z6) {
        i.f(gVar, "operation");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "OperationRepo.enqueue(operation: " + gVar + ", flush: " + z6 + ')');
        String string = UUID.randomUUID().toString();
        i.e(string, "randomUUID().toString()");
        gVar.setId(string);
        internalEnqueue$default(this, new C0030b(gVar, null, this.enqueueIntoBucket, 0, 10, null), z6, true, null, 8, null);
    }

    @Override // p064g5.f
    public Object enqueueAndWait(p064g5.g gVar, boolean z6, p123m8.d<? super Boolean> dVar) {
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "OperationRepo.enqueueAndWait(operation: " + gVar + ", force: " + z6 + ')');
        String string = UUID.randomUUID().toString();
        i.e(string, "randomUUID().toString()");
        gVar.setId(string);
        com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
        internalEnqueue$default(this, new C0030b(gVar, cVar, this.enqueueIntoBucket, 0, 8, null), z6, true, null, 8, null);
        return cVar.waitForWake(dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0207 A[Catch: all -> 0x0202, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0232 A[Catch: all -> 0x024e, TryCatch #10 {all -> 0x024e, blocks: (B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250), top: B:219:0x021e, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0249 A[Catch: all -> 0x024e, TryCatch #10 {all -> 0x024e, blocks: (B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250), top: B:219:0x021e, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x025b A[Catch: all -> 0x0202, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x026e A[Catch: all -> 0x0202, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0288 A[Catch: all -> 0x0299, TryCatch #7 {all -> 0x0299, blocks: (B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab), top: B:213:0x0276, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02ab A[Catch: all -> 0x0299, LOOP:4: B:130:0x02a5->B:132:0x02ab, LOOP_END, TRY_LEAVE, TryCatch #7 {all -> 0x0299, blocks: (B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab), top: B:213:0x0276, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x02bc A[Catch: all -> 0x0202, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x02dd A[Catch: all -> 0x0202, LOOP:5: B:139:0x02d7->B:141:0x02dd, LOOP_END, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02fe A[Catch: all -> 0x0202, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0310 A[Catch: all -> 0x0202, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0330 A[Catch: all -> 0x033c, TRY_LEAVE, TryCatch #9 {, blocks: (B:150:0x031d, B:151:0x032a, B:153:0x0330), top: B:217:0x031d, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0343 A[Catch: all -> 0x0202, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0350 A[Catch: all -> 0x0202, LOOP:8: B:162:0x034a->B:164:0x0350, LOOP_END, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0371 A[Catch: all -> 0x0202, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0389 A[Catch: all -> 0x0202, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x03a0 A[Catch: all -> 0x03e0, TRY_LEAVE, TryCatch #0 {, blocks: (B:175:0x038c, B:176:0x039a, B:178:0x03a0), top: B:203:0x038c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0437 A[LOOP:10: B:192:0x0431->B:194:0x0437, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x0455  */
    /* JADX WARN: Code duplicated, block: B:203:0x038c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x031d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x037d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0461 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x044f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x019e A[Catch: all -> 0x01a9, TRY_LEAVE, TryCatch #8 {, blocks: (B:69:0x0194, B:71:0x019e), top: B:215:0x0194, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c5 A[Catch: all -> 0x0202, TryCatch #2 {all -> 0x0202, blocks: (B:82:0x01b3, B:83:0x01bf, B:171:0x0383, B:173:0x0389, B:174:0x038b, B:182:0x03e2, B:184:0x03e4, B:185:0x03e5, B:186:0x03e6, B:85:0x01c5, B:86:0x01de, B:94:0x0200, B:98:0x0205, B:99:0x0206, B:100:0x0207, B:101:0x021d, B:112:0x0256, B:114:0x0259, B:115:0x025a, B:116:0x025b, B:118:0x026e, B:119:0x0273, B:120:0x0275, B:134:0x02b7, B:136:0x02ba, B:137:0x02bb, B:138:0x02bc, B:139:0x02d7, B:141:0x02dd, B:142:0x02f1, B:143:0x02f8, B:145:0x02fe, B:147:0x030a, B:148:0x0310, B:149:0x031c, B:157:0x033e, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:162:0x034a, B:164:0x0350, B:165:0x0364, B:166:0x036b, B:168:0x0371, B:170:0x037d, B:175:0x038c, B:176:0x039a, B:178:0x03a0, B:121:0x0276, B:122:0x0282, B:124:0x0288, B:126:0x0295, B:129:0x029b, B:130:0x02a5, B:132:0x02ab, B:150:0x031d, B:151:0x032a, B:153:0x0330, B:102:0x021e, B:103:0x022c, B:105:0x0232, B:107:0x0249, B:110:0x0250, B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:206:0x01b3, inners: #0, #7, #9, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f2 A[Catch: all -> 0x01fe, TRY_LEAVE, TryCatch #11 {, blocks: (B:87:0x01df, B:88:0x01ec, B:90:0x01f2), top: B:221:0x01df, outer: #2 }] */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03fb, code lost:
    
        if (r3.delayBeforeNextExecution(r7, r0, r4) == r5) goto L188;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x0207, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:138:0x02bc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x01c5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.onesignal.core.internal.operations.impl.b] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.onesignal.core.internal.operations.impl.b] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.onesignal.core.internal.operations.impl.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.onesignal.core.internal.operations.impl.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.onesignal.core.internal.operations.impl.b] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeOperations$com_onesignal_core(java.util.List<com.onesignal.core.internal.operations.impl.b.C0030b> r25, p123m8.d<? super p076h8.m> r26) {
        /*
            Method dump skipped, instruction units count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.operations.impl.b.executeOperations$com_onesignal_core(java.util.List, m8.d):java.lang.Object");
    }

    @Override // p064g5.f
    public void forceExecuteOperations() {
        int i10 = 2;
        p210v8.e eVar = null;
        long j = 0;
        this.retryWaiter.wake(new a(true, j, i10, eVar));
        this.waiter.wake(new a(false, j, i10, eVar));
    }

    public final List<C0030b> getNextOps$com_onesignal_core(int i10) {
        Object next;
        synchronized (this.queue) {
            List<C0030b> groupableOperations = null;
            if (((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getUseIdentityVerification() && ((p162q6.a) this._identityModelStore.getModel()).getJwtToken() == null) {
                return null;
            }
            Iterator<T> it = this.queue.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C0030b c0030b = (C0030b) next;
                if (c0030b.getOperation().getCanStartExecute() && this._newRecordState.canAccess(c0030b.getOperation().getApplyToRecordId()) && c0030b.getBucket() <= i10) {
                    break;
                }
            }
            C0030b c0030b2 = (C0030b) next;
            if (c0030b2 != null) {
                this.queue.remove(c0030b2);
                groupableOperations = getGroupableOperations(c0030b2);
            }
            return groupableOperations;
        }
    }

    public final List<C0030b> getQueue$com_onesignal_core() {
        return this.queue;
    }

    public final void loadSavedOperations$com_onesignal_core() {
        this._operationModelStore.loadOperations();
        Iterator it = k.i0(this._operationModelStore.list()).iterator();
        while (it.hasNext()) {
            internalEnqueue(new C0030b((p064g5.g) it.next(), null, this.enqueueIntoBucket, 0, 10, null), false, false, 0);
        }
        ((C0330m) this.initialized).F(m.a);
    }

    @Override // p100k5.b
    public void start() {
        AbstractC0342z.n(this.coroutineScope, null, new f(null), 3);
    }

    public static final class a {
        private final boolean force;
        private final long previousWaitedTime;

        public a(boolean z6, long j) {
            this.force = z6;
            this.previousWaitedTime = j;
        }

        public final boolean getForce() {
            return this.force;
        }

        public final long getPreviousWaitedTime() {
            return this.previousWaitedTime;
        }

        public /* synthetic */ a(boolean z6, long j, int i10, p210v8.e eVar) {
            this(z6, (i10 & 2) != 0 ? 0L : j);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.core.internal.operations.impl.b$b, reason: collision with other inner class name */
    public static final class C0030b {
        private final int bucket;
        private final p064g5.g operation;
        private int retries;
        private final com.onesignal.common.threading.c waiter;

        public C0030b(p064g5.g gVar, com.onesignal.common.threading.c cVar, int i10, int i11) {
            i.f(gVar, "operation");
            this.operation = gVar;
            this.waiter = cVar;
            this.bucket = i10;
            this.retries = i11;
        }

        public final int getBucket() {
            return this.bucket;
        }

        public final p064g5.g getOperation() {
            return this.operation;
        }

        public final int getRetries() {
            return this.retries;
        }

        public final com.onesignal.common.threading.c getWaiter() {
            return this.waiter;
        }

        public final void setRetries(int i10) {
            this.retries = i10;
        }

        public String toString() {
            return "bucket:" + this.bucket + ", retries:" + this.retries + ", operation:" + this.operation + '\n';
        }

        public /* synthetic */ C0030b(p064g5.g gVar, com.onesignal.common.threading.c cVar, int i10, int i11, int i12, p210v8.e eVar) {
            this(gVar, (i12 & 2) != 0 ? null : cVar, i10, (i12 & 8) != 0 ? 0 : i11);
        }
    }
}
