package com.onesignal.inAppMessages.internal;

import N9.AbstractC0317a;
import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import N9.p0;
import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.exceptions.BackendException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p151p5.j, p100k5.b, p208v6.a, com.onesignal.common.modeling.g, p198u5.a, A5.b, p111l6.a, X4.e {
    private final X4.f _applicationService;
    private final p161q5.b _backend;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final S4.c _consistencyManager;
    private final p183s5.a _displayer;
    private final p162q6.b _identityModelStore;
    private final p075h6.a _influenceManager;
    private final p043e5.a _languageContext;
    private final p198u5.b _lifecycle;
    private final j6.b _outcomeEventsController;
    private final p207v5.a _prefs;
    private final p236y5.a _repository;
    private final p111l6.b _sessionService;
    private final p244z5.a _state;
    private final p208v6.b _subscriptionManager;
    private final p110l5.a _time;
    private final A5.a _triggerController;
    private final A5.d _triggerModelStore;
    private final p121m6.a _userManager;
    private final Set<String> clickedClickIds;
    private final Set<String> dismissedMessages;
    private final V9.a fetchIAMMutex;
    private final Set<String> impressionedMessages;
    private Long lastTimeFetchedIAMs;
    private final com.onesignal.common.events.b lifecycleCallback;
    private final com.onesignal.common.events.b messageClickCallback;
    private final List<a> messageDisplayQueue;
    private final V9.a messageDisplayQueueMutex;
    private List<a> messages;
    private final List<a> redisplayedInAppMessages;
    private final Set<String> viewedPageIds;

    public static final class A extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public A(p123m8.d<? super A> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.showMultiplePrompts(null, null, this);
        }
    }

    public static final class B extends p144o8.g implements p200u8.b {
        Object L$0;
        int label;

        public B(p123m8.d<? super B> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return j.this.new B(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0077 A[LOOP:0: B:23:0x0071->B:25:0x0077, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[PHI: r8
          0x00a3: PHI (r8v18 java.lang.Object) = (r8v17 java.lang.Object), (r8v0 java.lang.Object) binds: [B:27:0x00a0, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x00b0 A[PHI: r8
          0x00b0: PHI (r8v22 java.lang.Object) = (r8v21 java.lang.Object), (r8v0 java.lang.Object) binds: [B:30:0x00ad, B:12:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
        
            if (r1.fetchMessages(r8, r7) == r0) goto L36;
         */
        @Override // p144o8.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                n8.a r0 = p134n8.a.f13404s
                int r1 = r7.label
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L38
                if (r1 == r6) goto L34
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L27
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                J7.a.v(r8)
                goto Lbf
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                J7.a.v(r8)
                goto Lb0
            L27:
                J7.a.v(r8)
                goto La3
            L2c:
                java.lang.Object r1 = r7.L$0
                java.util.List r1 = (java.util.List) r1
                J7.a.v(r8)
                goto L62
            L34:
                J7.a.v(r8)
                goto L4b
            L38:
                J7.a.v(r8)
                com.onesignal.inAppMessages.internal.j r8 = com.onesignal.inAppMessages.internal.j.this
                y5.a r8 = com.onesignal.inAppMessages.internal.j.access$get_repository$p(r8)
                r7.label = r6
                java.lang.Object r8 = r8.cleanCachedInAppMessages(r7)
                if (r8 != r0) goto L4b
                goto Lbe
            L4b:
                com.onesignal.inAppMessages.internal.j r8 = com.onesignal.inAppMessages.internal.j.this
                java.util.List r1 = com.onesignal.inAppMessages.internal.j.access$getRedisplayedInAppMessages$p(r8)
                com.onesignal.inAppMessages.internal.j r8 = com.onesignal.inAppMessages.internal.j.this
                y5.a r8 = com.onesignal.inAppMessages.internal.j.access$get_repository$p(r8)
                r7.L$0 = r1
                r7.label = r5
                java.lang.Object r8 = r8.listInAppMessages(r7)
                if (r8 != r0) goto L62
                goto Lbe
            L62:
                java.util.Collection r8 = (java.util.Collection) r8
                r1.addAll(r8)
                com.onesignal.inAppMessages.internal.j r8 = com.onesignal.inAppMessages.internal.j.this
                java.util.List r8 = com.onesignal.inAppMessages.internal.j.access$getRedisplayedInAppMessages$p(r8)
                java.util.Iterator r8 = r8.iterator()
            L71:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L82
                java.lang.Object r1 = r8.next()
                com.onesignal.inAppMessages.internal.a r1 = (com.onesignal.inAppMessages.internal.a) r1
                r5 = 0
                r1.setDisplayedInSession(r5)
                goto L71
            L82:
                com.onesignal.inAppMessages.internal.j r8 = com.onesignal.inAppMessages.internal.j.this
                m6.a r8 = com.onesignal.inAppMessages.internal.j.access$get_userManager$p(r8)
                java.lang.String r8 = r8.getOnesignalId()
                com.onesignal.inAppMessages.internal.j r1 = com.onesignal.inAppMessages.internal.j.this
                S4.c r1 = com.onesignal.inAppMessages.internal.j.access$get_consistencyManager$p(r1)
                Q4.a r5 = new Q4.a
                r5.<init>(r8)
                r8 = 0
                r7.L$0 = r8
                r7.label = r4
                java.lang.Object r8 = r1.getRywDataFromAwaitableCondition(r5, r7)
                if (r8 != r0) goto La3
                goto Lbe
            La3:
                N9.l r8 = (N9.InterfaceC0329l) r8
                r7.label = r3
                N9.m r8 = (N9.C0330m) r8
                java.lang.Object r8 = r8.Q(r7)
                if (r8 != r0) goto Lb0
                goto Lbe
            Lb0:
                Q4.b r8 = (Q4.b) r8
                if (r8 == 0) goto Lbf
                com.onesignal.inAppMessages.internal.j r1 = com.onesignal.inAppMessages.internal.j.this
                r7.label = r2
                java.lang.Object r8 = com.onesignal.inAppMessages.internal.j.access$fetchMessages(r1, r8, r7)
                if (r8 != r0) goto Lbf
            Lbe:
                return r0
            Lbf:
                h8.m r8 = p076h8.m.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.j.B.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((B) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.j$a, reason: case insensitive filesystem */
    public static final class C0602a extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0602a(p123m8.d<? super C0602a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.attemptToShowInAppMessage(this);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.j$b, reason: case insensitive filesystem */
    public static final class C0603b extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0603b(p123m8.d<? super C0603b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.evaluateInAppMessages(this);
        }
    }

    public static final class c extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public c(p123m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.fetchMessages(null, this);
        }
    }

    public static final class d extends p210v8.k implements p200u8.a {
        public d() {
            super(0);
        }

        @Override // p200u8.a
        public final Long invoke() {
            return Long.valueOf(j.this._time.getCurrentTimeMillis() - j.this._sessionService.getStartTime());
        }
    }

    public static final class e extends p144o8.g implements p200u8.b {
        int label;

        public e(p123m8.d<? super e> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return j.this.new e(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0055  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r1.fetchMessages(r7, r6) == r0) goto L22;
         */
        @Override // p144o8.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                n8.a r0 = p134n8.a.f13404s
                int r1 = r6.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                J7.a.v(r7)
                goto L60
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                J7.a.v(r7)
                goto L51
            L1f:
                J7.a.v(r7)
                goto L44
            L23:
                J7.a.v(r7)
                com.onesignal.inAppMessages.internal.j r7 = com.onesignal.inAppMessages.internal.j.this
                m6.a r7 = com.onesignal.inAppMessages.internal.j.access$get_userManager$p(r7)
                java.lang.String r7 = r7.getOnesignalId()
                com.onesignal.inAppMessages.internal.j r1 = com.onesignal.inAppMessages.internal.j.this
                S4.c r1 = com.onesignal.inAppMessages.internal.j.access$get_consistencyManager$p(r1)
                Q4.a r5 = new Q4.a
                r5.<init>(r7)
                r6.label = r4
                java.lang.Object r7 = r1.getRywDataFromAwaitableCondition(r5, r6)
                if (r7 != r0) goto L44
                goto L5f
            L44:
                N9.l r7 = (N9.InterfaceC0329l) r7
                r6.label = r3
                N9.m r7 = (N9.C0330m) r7
                java.lang.Object r7 = r7.Q(r6)
                if (r7 != r0) goto L51
                goto L5f
            L51:
                Q4.b r7 = (Q4.b) r7
                if (r7 == 0) goto L60
                com.onesignal.inAppMessages.internal.j r1 = com.onesignal.inAppMessages.internal.j.this
                r6.label = r2
                java.lang.Object r7 = com.onesignal.inAppMessages.internal.j.access$fetchMessages(r1, r7, r6)
                if (r7 != r0) goto L60
            L5f:
                return r0
            L60:
                h8.m r7 = p076h8.m.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.j.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((e) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public static final class f extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(p123m8.d<? super f> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.fireOutcomesForClick(null, null, this);
        }
    }

    public static final class g extends p144o8.g implements p200u8.c {
        final /* synthetic */ b $result;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar, p123m8.d<? super g> dVar) {
            super(2, dVar);
            this.$result = bVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            g gVar = new g(this.$result, dVar);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // p200u8.c
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return invoke((p151p5.c) null, (p123m8.d<? super p076h8.m>) obj2);
            }
            throw new ClassCastException();
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            this.L$0.getClass();
            throw new ClassCastException();
        }

        public final Object invoke(p151p5.c cVar, p123m8.d<? super p076h8.m> dVar) {
            return ((g) create(cVar, dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public static final class h extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public h(p123m8.d<? super h> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.fireRESTCallForClick(null, null, this);
        }
    }

    public static final class i extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public i(p123m8.d<? super i> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.fireRESTCallForPageChange(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.j$j, reason: collision with other inner class name */
    public static final class C0041j extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0041j(p123m8.d<? super C0041j> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.messageWasDismissed(null, false, this);
        }
    }

    public static final class k extends p210v8.k implements p200u8.b {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // p200u8.b
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((p151p5.g) null);
            return p076h8.m.a;
        }

        public final void invoke(p151p5.g gVar) {
            p210v8.i.f(gVar, "it");
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.c();
        }
    }

    public static final class l extends p144o8.g implements p200u8.b {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ a $message;
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.onesignal.inAppMessages.internal.c cVar, a aVar, j jVar, p123m8.d<? super l> dVar) {
            super(1, dVar);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = jVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return new l(this.$action, this.$message, this.this$0, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0071  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        
            if (r8.fireOutcomesForClick(r1, r3, r7) == r0) goto L25;
         */
        @Override // p144o8.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                n8.a r0 = p134n8.a.f13404s
                int r1 = r7.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2b
                if (r1 == r5) goto L27
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                J7.a.v(r8)
                goto L8f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                J7.a.v(r8)
                goto L71
            L23:
                J7.a.v(r8)
                goto L5b
            L27:
                J7.a.v(r8)
                goto L48
            L2b:
                J7.a.v(r8)
                com.onesignal.inAppMessages.internal.c r8 = r7.$action
                com.onesignal.inAppMessages.internal.a r1 = r7.$message
                boolean r1 = r1.takeActionAsUnique()
                r8.setFirstClick(r1)
                com.onesignal.inAppMessages.internal.j r8 = r7.this$0
                com.onesignal.inAppMessages.internal.a r1 = r7.$message
                com.onesignal.inAppMessages.internal.c r6 = r7.$action
                r7.label = r5
                java.lang.Object r8 = com.onesignal.inAppMessages.internal.j.access$firePublicClickHandler(r8, r1, r6, r7)
                if (r8 != r0) goto L48
                goto L8e
            L48:
                com.onesignal.inAppMessages.internal.j r8 = r7.this$0
                com.onesignal.inAppMessages.internal.a r1 = r7.$message
                com.onesignal.inAppMessages.internal.c r5 = r7.$action
                java.util.List r5 = r5.getPrompts()
                r7.label = r4
                java.lang.Object r8 = com.onesignal.inAppMessages.internal.j.access$beginProcessingPrompts(r8, r1, r5, r7)
                if (r8 != r0) goto L5b
                goto L8e
            L5b:
                com.onesignal.inAppMessages.internal.j r8 = r7.this$0
                com.onesignal.inAppMessages.internal.c r1 = r7.$action
                com.onesignal.inAppMessages.internal.j.access$fireClickAction(r8, r1)
                com.onesignal.inAppMessages.internal.j r8 = r7.this$0
                com.onesignal.inAppMessages.internal.a r1 = r7.$message
                com.onesignal.inAppMessages.internal.c r4 = r7.$action
                r7.label = r3
                java.lang.Object r8 = com.onesignal.inAppMessages.internal.j.access$fireRESTCallForClick(r8, r1, r4, r7)
                if (r8 != r0) goto L71
                goto L8e
            L71:
                com.onesignal.inAppMessages.internal.j r8 = r7.this$0
                com.onesignal.inAppMessages.internal.c r1 = r7.$action
                com.onesignal.inAppMessages.internal.j.access$fireTagCallForClick(r8, r1)
                com.onesignal.inAppMessages.internal.j r8 = r7.this$0
                com.onesignal.inAppMessages.internal.a r1 = r7.$message
                java.lang.String r1 = r1.getMessageId()
                com.onesignal.inAppMessages.internal.c r3 = r7.$action
                java.util.List r3 = r3.getOutcomes()
                r7.label = r2
                java.lang.Object r8 = com.onesignal.inAppMessages.internal.j.access$fireOutcomesForClick(r8, r1, r3, r7)
                if (r8 != r0) goto L8f
            L8e:
                return r0
            L8f:
                h8.m r8 = p076h8.m.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.j.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((l) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public static final class m extends p144o8.g implements p200u8.b {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ a $message;
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.onesignal.inAppMessages.internal.c cVar, a aVar, j jVar, p123m8.d<? super m> dVar) {
            super(1, dVar);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = jVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return new m(this.$action, this.$message, this.this$0, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r6.beginProcessingPrompts(r1, r3, r5) == r0) goto L15;
         */
        @Override // p144o8.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                n8.a r0 = p134n8.a.f13404s
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                J7.a.v(r6)
                goto L4c
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                J7.a.v(r6)
                goto L39
            L1c:
                J7.a.v(r6)
                com.onesignal.inAppMessages.internal.c r6 = r5.$action
                com.onesignal.inAppMessages.internal.a r1 = r5.$message
                boolean r1 = r1.takeActionAsUnique()
                r6.setFirstClick(r1)
                com.onesignal.inAppMessages.internal.j r6 = r5.this$0
                com.onesignal.inAppMessages.internal.a r1 = r5.$message
                com.onesignal.inAppMessages.internal.c r4 = r5.$action
                r5.label = r3
                java.lang.Object r6 = com.onesignal.inAppMessages.internal.j.access$firePublicClickHandler(r6, r1, r4, r5)
                if (r6 != r0) goto L39
                goto L4b
            L39:
                com.onesignal.inAppMessages.internal.j r6 = r5.this$0
                com.onesignal.inAppMessages.internal.a r1 = r5.$message
                com.onesignal.inAppMessages.internal.c r3 = r5.$action
                java.util.List r3 = r3.getPrompts()
                r5.label = r2
                java.lang.Object r6 = com.onesignal.inAppMessages.internal.j.access$beginProcessingPrompts(r6, r1, r3, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                com.onesignal.inAppMessages.internal.j r6 = r5.this$0
                com.onesignal.inAppMessages.internal.c r0 = r5.$action
                com.onesignal.inAppMessages.internal.j.access$fireClickAction(r6, r0)
                com.onesignal.inAppMessages.internal.j r6 = r5.this$0
                com.onesignal.inAppMessages.internal.c r0 = r5.$action
                com.onesignal.inAppMessages.internal.j.access$logInAppMessagePreviewActions(r6, r0)
                h8.m r6 = p076h8.m.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.j.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((m) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public static final class n extends p144o8.g implements p200u8.b {
        final /* synthetic */ a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(a aVar, com.onesignal.inAppMessages.internal.g gVar, p123m8.d<? super n> dVar) {
            super(1, dVar);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return j.this.new n(this.$message, this.$page, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                j jVar = j.this;
                a aVar2 = this.$message;
                com.onesignal.inAppMessages.internal.g gVar = this.$page;
                this.label = 1;
                if (jVar.fireRESTCallForPageChange(aVar2, gVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return p076h8.m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((n) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public static final class o extends p144o8.g implements p200u8.b {
        final /* synthetic */ a $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(a aVar, p123m8.d<? super o> dVar) {
            super(1, dVar);
            this.$message = aVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return j.this.new o(this.$message, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                j jVar = j.this;
                a aVar2 = this.$message;
                this.label = 1;
                if (j.messageWasDismissed$default(jVar, aVar2, false, this, 2, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return p076h8.m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((o) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public static final class p extends p210v8.k implements p200u8.b {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // p200u8.b
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((p151p5.g) null);
            return p076h8.m.a;
        }

        public final void invoke(p151p5.g gVar) {
            p210v8.i.f(gVar, "it");
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.d();
        }
    }

    public static final class q extends p144o8.g implements p200u8.b {
        final /* synthetic */ a $message;
        final /* synthetic */ String $variantId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, a aVar, p123m8.d<? super q> dVar) {
            super(1, dVar);
            this.$variantId = str;
            this.$message = aVar;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return j.this.new q(this.$variantId, this.$message, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            q qVar;
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    J7.a.v(obj);
                    p161q5.b bVar = j.this._backend;
                    String appId = ((com.onesignal.core.internal.config.a) j.this._configModelStore.getModel()).getAppId();
                    String id = j.this._subscriptionManager.getSubscriptions().getPush().getId();
                    String str = this.$variantId;
                    String messageId = this.$message.getMessageId();
                    this.label = 1;
                    qVar = this;
                    try {
                        if (bVar.sendIAMImpression(appId, id, str, messageId, qVar) == aVar) {
                            return aVar;
                        }
                    } catch (BackendException unused) {
                        j.this.impressionedMessages.remove(qVar.$message.getMessageId());
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    J7.a.v(obj);
                    qVar = this;
                }
                j.this._prefs.setImpressionesMessagesId(j.this.impressionedMessages);
            } catch (BackendException unused2) {
                qVar = this;
            }
            return p076h8.m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((q) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public static final class r extends p210v8.k implements p200u8.b {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // p200u8.b
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((p151p5.g) null);
            return p076h8.m.a;
        }

        public final void invoke(p151p5.g gVar) {
            p210v8.i.f(gVar, "it");
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.b();
        }
    }

    public static final class s extends p210v8.k implements p200u8.b {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // p200u8.b
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((p151p5.g) null);
            return p076h8.m.a;
        }

        public final void invoke(p151p5.g gVar) {
            p210v8.i.f(gVar, "it");
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.a();
        }
    }

    public static final class t extends p144o8.g implements p200u8.b {
        int label;

        public t(p123m8.d<? super t> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return j.this.new t(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                j jVar = j.this;
                this.label = 1;
                if (jVar.evaluateInAppMessages(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return p076h8.m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((t) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public static final class u extends p144o8.g implements p200u8.b {
        int label;

        public u(p123m8.d<? super u> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return j.this.new u(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                j jVar = j.this;
                this.label = 1;
                if (jVar.evaluateInAppMessages(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return p076h8.m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((u) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public static final class v extends p144o8.g implements p200u8.c {
        int label;

        public v(p123m8.d<? super v> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(Object obj, p123m8.d<?> dVar) {
            return j.this.new v(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p076h8.m> dVar) {
            return ((v) create(interfaceC0341y, dVar)).invokeSuspend(p076h8.m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            j.this._displayer.dismissCurrentInAppMessage();
            return p076h8.m.a;
        }
    }

    public static final class w extends p144o8.g implements p200u8.b {
        int label;

        public w(p123m8.d<? super w> dVar) {
            super(1, dVar);
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return j.this.new w(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                j jVar = j.this;
                this.label = 1;
                if (jVar.evaluateInAppMessages(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return p076h8.m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((w) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public static final class x extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public x(p123m8.d<? super x> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.persistInAppMessage(null, this);
        }
    }

    public static final class y extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public y(p123m8.d<? super y> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return j.this.queueMessageForDisplay(null, this);
        }
    }

    public static final class z extends p144o8.g implements p200u8.b {
        final /* synthetic */ a $inAppMessage;
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.prompt.impl.b> $prompts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public z(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, p123m8.d<? super z> dVar) {
            super(1, dVar);
            this.$inAppMessage = aVar;
            this.$prompts = list;
        }

        @Override // p144o8.a
        public final p123m8.d<p076h8.m> create(p123m8.d<?> dVar) {
            return j.this.new z(this.$inAppMessage, this.$prompts, dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                j jVar = j.this;
                a aVar2 = this.$inAppMessage;
                List<com.onesignal.inAppMessages.internal.prompt.impl.b> list = this.$prompts;
                this.label = 1;
                if (jVar.showMultiplePrompts(aVar2, list, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            return p076h8.m.a;
        }

        @Override // p200u8.b
        public final Object invoke(p123m8.d<? super p076h8.m> dVar) {
            return ((z) create(dVar)).invokeSuspend(p076h8.m.a);
        }
    }

    public j(X4.f fVar, p111l6.b bVar, p075h6.a aVar, com.onesignal.core.internal.config.b bVar2, p121m6.a aVar2, p162q6.b bVar3, p208v6.b bVar4, j6.b bVar5, p244z5.a aVar3, p207v5.a aVar4, p236y5.a aVar5, p161q5.b bVar6, A5.a aVar6, A5.d dVar, p183s5.a aVar7, p198u5.b bVar7, p043e5.a aVar8, p110l5.a aVar9, S4.c cVar) {
        p210v8.i.f(fVar, "_applicationService");
        p210v8.i.f(bVar, "_sessionService");
        p210v8.i.f(aVar, "_influenceManager");
        p210v8.i.f(bVar2, "_configModelStore");
        p210v8.i.f(aVar2, "_userManager");
        p210v8.i.f(bVar3, "_identityModelStore");
        p210v8.i.f(bVar4, "_subscriptionManager");
        p210v8.i.f(bVar5, "_outcomeEventsController");
        p210v8.i.f(aVar3, "_state");
        p210v8.i.f(aVar4, "_prefs");
        p210v8.i.f(aVar5, "_repository");
        p210v8.i.f(bVar6, "_backend");
        p210v8.i.f(aVar6, "_triggerController");
        p210v8.i.f(dVar, "_triggerModelStore");
        p210v8.i.f(aVar7, "_displayer");
        p210v8.i.f(bVar7, "_lifecycle");
        p210v8.i.f(aVar8, "_languageContext");
        p210v8.i.f(aVar9, "_time");
        p210v8.i.f(cVar, "_consistencyManager");
        this._applicationService = fVar;
        this._sessionService = bVar;
        this._influenceManager = aVar;
        this._configModelStore = bVar2;
        this._userManager = aVar2;
        this._identityModelStore = bVar3;
        this._subscriptionManager = bVar4;
        this._outcomeEventsController = bVar5;
        this._state = aVar3;
        this._prefs = aVar4;
        this._repository = aVar5;
        this._backend = bVar6;
        this._triggerController = aVar6;
        this._triggerModelStore = dVar;
        this._displayer = aVar7;
        this._lifecycle = bVar7;
        this._languageContext = aVar8;
        this._time = aVar9;
        this._consistencyManager = cVar;
        this.lifecycleCallback = new com.onesignal.common.events.b();
        this.messageClickCallback = new com.onesignal.common.events.b();
        this.messages = new ArrayList();
        this.dismissedMessages = new LinkedHashSet();
        this.impressionedMessages = new LinkedHashSet();
        this.viewedPageIds = new LinkedHashSet();
        this.clickedClickIds = new LinkedHashSet();
        this.messageDisplayQueue = new ArrayList();
        this.messageDisplayQueueMutex = V9.e.a();
        this.redisplayedInAppMessages = new ArrayList();
        this.fetchIAMMutex = V9.e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:35:0x00a5, B:37:0x00bc, B:40:0x00c5, B:42:0x00cd, B:43:0x00d3, B:45:0x00db, B:46:0x00e1), top: B:66:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:35:0x00a5, B:37:0x00bc, B:40:0x00c5, B:42:0x00cd, B:43:0x00d3, B:45:0x00db, B:46:0x00e1), top: B:66:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:35:0x00a5, B:37:0x00bc, B:40:0x00c5, B:42:0x00cd, B:43:0x00d3, B:45:0x00db, B:46:0x00e1), top: B:66:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:35:0x00a5, B:37:0x00bc, B:40:0x00c5, B:42:0x00cd, B:43:0x00d3, B:45:0x00db, B:46:0x00e1), top: B:66:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00db A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:35:0x00a5, B:37:0x00bc, B:40:0x00c5, B:42:0x00cd, B:43:0x00d3, B:45:0x00db, B:46:0x00e1), top: B:66:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:35:0x00a5, B:37:0x00bc, B:40:0x00c5, B:42:0x00cd, B:43:0x00d3, B:45:0x00db, B:46:0x00e1), top: B:66:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    /* JADX WARN: Code duplicated, block: B:60:0x0141  */
    /* JADX WARN: Code duplicated, block: B:62:0x0168 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object attemptToShowInAppMessage(p123m8.d<? super p076h8.m> dVar) {
        C0602a c0602a;
        j jVar;
        p210v8.t tVar;
        V9.d dVar2;
        V9.a aVar;
        Object obj;
        Object objDisplayMessage;
        p210v8.t tVar2;
        Boolean bool;
        Object obj2;
        Object obj3;
        if (dVar instanceof C0602a) {
            c0602a = (C0602a) dVar;
            int i10 = c0602a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0602a.label = i10 - Integer.MIN_VALUE;
            } else {
                c0602a = new C0602a(dVar);
            }
        } else {
            c0602a = new C0602a(dVar);
        }
        Object objWaitUntilSystemConditionsAvailable = c0602a.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = c0602a.label;
        p076h8.m mVar = p076h8.m.a;
        if (i11 == 0) {
            J7.a.v(objWaitUntilSystemConditionsAvailable);
            X4.f fVar = this._applicationService;
            c0602a.L$0 = this;
            c0602a.label = 1;
            objWaitUntilSystemConditionsAvailable = fVar.waitUntilSystemConditionsAvailable(c0602a);
            if (objWaitUntilSystemConditionsAvailable != aVar2) {
                jVar = this;
            }
            aVar = dVar2;
            return aVar2;
        }
        if (i11 == 1) {
            jVar = (j) c0602a.L$0;
            J7.a.v(objWaitUntilSystemConditionsAvailable);
        } else {
            if (i11 == 2) {
                V9.a aVar3 = (V9.a) c0602a.L$2;
                p210v8.t tVar3 = (p210v8.t) c0602a.L$1;
                j jVar2 = (j) c0602a.L$0;
                J7.a.v(objWaitUntilSystemConditionsAvailable);
                tVar = tVar3;
                aVar = aVar3;
                jVar = jVar2;
                try {
                    aVar = dVar2;
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + jVar.messageDisplayQueue, null, 2, null);
                    if (jVar.getPaused()) {
                        com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!", null, 2, null);
                    } else if (jVar.messageDisplayQueue.isEmpty()) {
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!", null, 2, null);
                    } else if (jVar._state.getInAppMessageIdShowing() != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!", null, 2, null);
                    } else {
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!", null, 2, null);
                        a aVarRemove = jVar.messageDisplayQueue.remove(0);
                        tVar.f15466s = aVarRemove;
                        p244z5.a aVar4 = jVar._state;
                        p210v8.i.c(aVarRemove);
                        aVar4.setInAppMessageIdShowing(aVarRemove.getMessageId());
                    }
                    ((V9.d) aVar).e(null);
                    obj = tVar.f15466s;
                    if (obj != null) {
                        c0602a.L$0 = jVar;
                        c0602a.L$1 = tVar;
                        c0602a.L$2 = null;
                        c0602a.label = 3;
                        objDisplayMessage = jVar._displayer.displayMessage((a) obj, c0602a);
                        if (objDisplayMessage != aVar2) {
                            tVar2 = tVar;
                            objWaitUntilSystemConditionsAvailable = objDisplayMessage;
                        }
                        aVar = dVar2;
                        return aVar2;
                    }
                    return mVar;
                } catch (Throwable th) {
                    ((V9.d) aVar).e(null);
                    throw th;
                }
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    J7.a.v(objWaitUntilSystemConditionsAvailable);
                    return mVar;
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(objWaitUntilSystemConditionsAvailable);
                return mVar;
            }
            tVar2 = (p210v8.t) c0602a.L$1;
            jVar = (j) c0602a.L$0;
            J7.a.v(objWaitUntilSystemConditionsAvailable);
        }
        bool = (Boolean) objWaitUntilSystemConditionsAvailable;
        if (bool == null) {
            jVar._state.setInAppMessageIdShowing(null);
            obj3 = tVar2.f15466s;
            p210v8.i.c(obj3);
            c0602a.L$0 = null;
            c0602a.L$1 = null;
            c0602a.label = 4;
            if (jVar.queueMessageForDisplay((a) obj3, c0602a) != aVar2) {
                return mVar;
            }
            aVar = dVar2;
            return aVar2;
        }
        if (bool.equals(Boolean.FALSE)) {
            jVar._state.setInAppMessageIdShowing(null);
            p210v8.x.a(jVar.messages).remove(tVar2.f15466s);
            obj2 = tVar2.f15466s;
            p210v8.i.c(obj2);
            c0602a.L$0 = null;
            c0602a.L$1 = null;
            c0602a.label = 5;
            if (jVar.messageWasDismissed((a) obj2, true, c0602a) == aVar2) {
                aVar = dVar2;
                return aVar2;
            }
        }
        return mVar;
        if (!((Boolean) objWaitUntilSystemConditionsAvailable).booleanValue()) {
            com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app message not showing due to system condition not correct", null, 2, null);
            return mVar;
        }
        tVar = new p210v8.t();
        V9.a aVar5 = jVar.messageDisplayQueueMutex;
        c0602a.L$0 = jVar;
        c0602a.L$1 = tVar;
        c0602a.L$2 = aVar5;
        c0602a.label = 2;
        dVar2 = (V9.d) aVar5;
        if (dVar2.d(c0602a) != aVar2) {
            aVar = dVar2;
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + jVar.messageDisplayQueue, null, 2, null);
            if (jVar.getPaused()) {
                com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!", null, 2, null);
            } else if (jVar.messageDisplayQueue.isEmpty()) {
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!", null, 2, null);
            } else if (jVar._state.getInAppMessageIdShowing() != null) {
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!", null, 2, null);
            } else {
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!", null, 2, null);
                a aVarRemove2 = jVar.messageDisplayQueue.remove(0);
                tVar.f15466s = aVarRemove2;
                p244z5.a aVar6 = jVar._state;
                p210v8.i.c(aVarRemove2);
                aVar6.setInAppMessageIdShowing(aVarRemove2.getMessageId());
            }
            ((V9.d) aVar).e(null);
            obj = tVar.f15466s;
            if (obj != null) {
                c0602a.L$0 = jVar;
                c0602a.L$1 = tVar;
                c0602a.L$2 = null;
                c0602a.label = 3;
                objDisplayMessage = jVar._displayer.displayMessage((a) obj, c0602a);
                if (objDisplayMessage != aVar2) {
                    tVar2 = tVar;
                    objWaitUntilSystemConditionsAvailable = objDisplayMessage;
                    bool = (Boolean) objWaitUntilSystemConditionsAvailable;
                    if (bool == null) {
                        jVar._state.setInAppMessageIdShowing(null);
                        obj3 = tVar2.f15466s;
                        p210v8.i.c(obj3);
                        c0602a.L$0 = null;
                        c0602a.L$1 = null;
                        c0602a.label = 4;
                        if (jVar.queueMessageForDisplay((a) obj3, c0602a) != aVar2) {
                        }
                    } else if (bool.equals(Boolean.FALSE)) {
                        jVar._state.setInAppMessageIdShowing(null);
                        p210v8.x.a(jVar.messages).remove(tVar2.f15466s);
                        obj2 = tVar2.f15466s;
                        p210v8.i.c(obj2);
                        c0602a.L$0 = null;
                        c0602a.L$1 = null;
                        c0602a.label = 5;
                        if (jVar.messageWasDismissed((a) obj2, true, c0602a) == aVar2) {
                        }
                    }
                }
            }
            return mVar;
        }
        aVar = dVar2;
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginProcessingPrompts(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, p123m8.d<? super p076h8.m> dVar) {
        boolean zIsEmpty = list.isEmpty();
        p076h8.m mVar = p076h8.m.a;
        if (!zIsEmpty) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + aVar, null, 2, null);
            this._displayer.dismissCurrentInAppMessage();
            Object objShowMultiplePrompts = showMultiplePrompts(aVar, list, dVar);
            if (objShowMultiplePrompts == p134n8.a.f13404s) {
                return objShowMultiplePrompts;
            }
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object evaluateInAppMessages(p123m8.d<? super p076h8.m> dVar) {
        C0603b c0603b;
        j jVar;
        Iterator it;
        if (dVar instanceof C0603b) {
            c0603b = (C0603b) dVar;
            int i10 = c0603b.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0603b.label = i10 - Integer.MIN_VALUE;
            } else {
                c0603b = new C0603b(dVar);
            }
        } else {
            c0603b = new C0603b(dVar);
        }
        Object obj = c0603b.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = c0603b.label;
        if (i11 == 0) {
            J7.a.v(obj);
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.evaluateInAppMessages()", null, 2, null);
            ArrayList arrayList = new ArrayList();
            synchronized (this.messages) {
                for (a aVar2 : this.messages) {
                    if (this._triggerController.evaluateMessageTriggers(aVar2)) {
                        setDataForRedisplay(aVar2);
                        if (!this.dismissedMessages.contains(aVar2.getMessageId()) && !aVar2.isFinished()) {
                            arrayList.add(aVar2);
                        }
                    }
                }
            }
            jVar = this;
            it = arrayList.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c0603b.L$1;
            jVar = (j) c0603b.L$0;
            J7.a.v(obj);
        }
        while (it.hasNext()) {
            a aVar3 = (a) it.next();
            c0603b.L$0 = jVar;
            c0603b.L$1 = it;
            c0603b.label = 1;
            if (jVar.queueMessageForDisplay(aVar3, c0603b) == aVar) {
                return aVar;
            }
        }
        return p076h8.m.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object fetchMessages(Q4.b bVar, p123m8.d<? super p076h8.m> dVar) {
        c cVar;
        String str;
        Q4.b bVar2;
        String str2;
        j jVar;
        V9.a aVar;
        j jVar2;
        List list;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = cVar2.label;
        p076h8.m mVar = p076h8.m.a;
        try {
            if (i11 == 0) {
                J7.a.v(obj);
                if (this._applicationService.isInForeground()) {
                    String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                    String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                    if (id.length() != 0 && !com.onesignal.common.d.INSTANCE.isLocalId(id) && appId.length() != 0) {
                        V9.a aVar3 = this.fetchIAMMutex;
                        cVar2.L$0 = this;
                        cVar2.L$1 = bVar;
                        cVar2.L$2 = appId;
                        cVar2.L$3 = id;
                        cVar2.L$4 = aVar3;
                        cVar2.label = 1;
                        V9.d dVar2 = (V9.d) aVar3;
                        if (dVar2.d(cVar2) != aVar2) {
                            str = appId;
                            bVar2 = bVar;
                            str2 = id;
                            jVar = this;
                            aVar = dVar2;
                        }
                        return aVar2;
                    }
                }
                return mVar;
            }
            if (i11 == 1) {
                V9.a aVar4 = (V9.a) cVar2.L$4;
                str2 = (String) cVar2.L$3;
                String str3 = (String) cVar2.L$2;
                Q4.b bVar3 = (Q4.b) cVar2.L$1;
                j jVar3 = (j) cVar2.L$0;
                J7.a.v(obj);
                str = str3;
                bVar2 = bVar3;
                jVar = jVar3;
                aVar = aVar4;
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    J7.a.v(obj);
                    return mVar;
                }
                jVar2 = (j) cVar2.L$0;
                J7.a.v(obj);
            }
            list = (List) obj;
            if (list != null) {
                jVar2.messages = p210v8.x.b(list);
                cVar2.L$0 = null;
                cVar2.label = 3;
                if (jVar2.evaluateInAppMessages(cVar2) == aVar2) {
                    return aVar2;
                }
            }
            return mVar;
            long currentTimeMillis = jVar._time.getCurrentTimeMillis();
            Long l4 = jVar.lastTimeFetchedIAMs;
            if (l4 != null && currentTimeMillis - l4.longValue() < ((com.onesignal.core.internal.config.a) jVar._configModelStore.getModel()).getFetchIAMMinInterval()) {
                ((V9.d) aVar).e(null);
                return mVar;
            }
            jVar.lastTimeFetchedIAMs = new Long(currentTimeMillis);
            ((V9.d) aVar).e(null);
            String str4 = str;
            d dVar3 = jVar.new d();
            p161q5.b bVar4 = jVar._backend;
            String jwtToken = ((p162q6.a) jVar._identityModelStore.getModel()).getJwtToken();
            p076h8.f identityAlias = jVar._identityModelStore.getIdentityAlias();
            cVar2.L$0 = jVar;
            cVar2.L$1 = null;
            cVar2.L$2 = null;
            cVar2.L$3 = null;
            cVar2.L$4 = null;
            cVar2.label = 2;
            Object objListInAppMessages = bVar4.listInAppMessages(str4, str2, bVar2, dVar3, jwtToken, identityAlias, cVar2);
            if (objListInAppMessages != aVar2) {
                jVar2 = jVar;
                obj = objListInAppMessages;
                list = (List) obj;
                if (list != null) {
                    jVar2.messages = p210v8.x.b(list);
                    cVar2.L$0 = null;
                    cVar2.label = 3;
                    if (jVar2.evaluateInAppMessages(cVar2) == aVar2) {
                    }
                }
                return mVar;
            }
            return aVar2;
        } catch (Throwable th) {
            ((V9.d) aVar).e(null);
            throw th;
        }
    }

    private final void fetchMessagesWhenConditionIsMet() {
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new e(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireClickAction(com.onesignal.inAppMessages.internal.c cVar) {
        if (cVar.getUrl() == null || cVar.getUrl().length() <= 0) {
            return;
        }
        if (cVar.getUrlTarget() == p151p5.k.BROWSER) {
            AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), cVar.getUrl());
        } else if (cVar.getUrlTarget() == p151p5.k.IN_APP_WEBVIEW) {
            p172r5.b.INSTANCE.open$com_onesignal_inAppMessages(cVar.getUrl(), true, this._applicationService.getAppContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fireOutcomesForClick(String str, List<com.onesignal.inAppMessages.internal.f> list, p123m8.d<? super p076h8.m> dVar) {
        f fVar;
        Iterator<com.onesignal.inAppMessages.internal.f> it;
        j jVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.label = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = fVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            this._influenceManager.onDirectInfluenceFromIAM(str);
            it = list.iterator();
            jVar = this;
        } else {
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) fVar.L$1;
            jVar = (j) fVar.L$0;
            J7.a.v(obj);
        }
        while (it.hasNext()) {
            com.onesignal.inAppMessages.internal.f next = it.next();
            String name = next.getName();
            if (next.isUnique()) {
                j6.b bVar = jVar._outcomeEventsController;
                fVar.L$0 = jVar;
                fVar.L$1 = it;
                fVar.label = 1;
                if (bVar.sendUniqueOutcomeEvent(name, fVar) == aVar) {
                    return aVar;
                }
            } else if (next.getWeight() > 0.0f) {
                j6.b bVar2 = jVar._outcomeEventsController;
                float weight = next.getWeight();
                fVar.L$0 = jVar;
                fVar.L$1 = it;
                fVar.label = 2;
                if (bVar2.sendOutcomeEventWithValue(name, weight, fVar) == aVar) {
                    return aVar;
                }
            } else {
                j6.b bVar3 = jVar._outcomeEventsController;
                fVar.L$0 = jVar;
                fVar.L$1 = it;
                fVar.label = 3;
                if (bVar3.sendOutcomeEvent(name, fVar) == aVar) {
                    return aVar;
                }
            }
        }
        return p076h8.m.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object firePublicClickHandler(a aVar, com.onesignal.inAppMessages.internal.c cVar, p123m8.d<? super p076h8.m> dVar) throws Throwable {
        boolean hasSubscribers = this.messageClickCallback.getHasSubscribers();
        p076h8.m mVar = p076h8.m.a;
        if (!hasSubscribers) {
            return mVar;
        }
        this._influenceManager.onDirectInfluenceFromIAM(aVar.getMessageId());
        Object objSuspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new g(new b(aVar, cVar), null), dVar);
        return objSuspendingFireOnMain == p134n8.a.f13404s ? objSuspendingFireOnMain : mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object fireRESTCallForClick(a aVar, com.onesignal.inAppMessages.internal.c cVar, p123m8.d<? super p076h8.m> dVar) {
        h hVar;
        String clickId;
        j jVar;
        a aVar2;
        String str;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        h hVar2 = hVar;
        Object obj = hVar2.result;
        p134n8.a aVar3 = p134n8.a.f13404s;
        int i11 = hVar2.label;
        p076h8.m mVar = p076h8.m.a;
        if (i11 == 0) {
            J7.a.v(obj);
            String strVariantIdForMessage = p172r5.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
            if (strVariantIdForMessage != null) {
                clickId = cVar.getClickId();
                if ((aVar.getRedisplayStats().isRedisplayEnabled() && clickId != null && aVar.isClickAvailable(clickId)) || !p086i8.k.O(this.clickedClickIds, clickId)) {
                    if (clickId != null) {
                        this.clickedClickIds.add(clickId);
                        aVar.addClickId(clickId);
                    }
                    try {
                        p161q5.b bVar = this._backend;
                        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        String messageId = aVar.getMessageId();
                        boolean zIsFirstClick = cVar.isFirstClick();
                        hVar2.L$0 = this;
                        hVar2.L$1 = aVar;
                        hVar2.L$2 = clickId;
                        hVar2.label = 1;
                        if (bVar.sendIAMClick(appId, id, strVariantIdForMessage, messageId, clickId, zIsFirstClick, hVar2) == aVar3) {
                            return aVar3;
                        }
                        jVar = this;
                    } catch (BackendException unused) {
                        jVar = this;
                        aVar2 = aVar;
                        str = clickId;
                        p210v8.x.a(jVar.clickedClickIds).remove(str);
                        if (str != null) {
                            aVar2.removeClickId(str);
                        }
                        return mVar;
                    }
                }
            }
            return mVar;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) hVar2.L$2;
        aVar2 = (a) hVar2.L$1;
        jVar = (j) hVar2.L$0;
        try {
            J7.a.v(obj);
            clickId = str;
            aVar = aVar2;
        } catch (BackendException unused2) {
            p210v8.x.a(jVar.clickedClickIds).remove(str);
            if (str != null) {
                aVar2.removeClickId(str);
            }
            return mVar;
        }
        try {
            jVar._prefs.setClickedMessagesId(jVar.clickedClickIds);
            return mVar;
        } catch (BackendException unused3) {
            aVar2 = aVar;
            str = clickId;
            p210v8.x.a(jVar.clickedClickIds).remove(str);
            if (str != null) {
                aVar2.removeClickId(str);
            }
            return mVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object fireRESTCallForPageChange(a aVar, com.onesignal.inAppMessages.internal.g gVar, p123m8.d<? super p076h8.m> dVar) {
        i iVar;
        String str;
        j jVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.label = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        i iVar2 = iVar;
        Object obj = iVar2.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = iVar2.label;
        p076h8.m mVar = p076h8.m.a;
        if (i11 == 0) {
            J7.a.v(obj);
            String strVariantIdForMessage = p172r5.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
            if (strVariantIdForMessage == null) {
                return mVar;
            }
            String pageId = gVar.getPageId();
            String str2 = aVar.getMessageId() + pageId;
            if (this.viewedPageIds.contains(str2)) {
                com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Already sent page impression for id: " + pageId, null, 2, null);
                return mVar;
            }
            this.viewedPageIds.add(str2);
            try {
                p161q5.b bVar = this._backend;
                String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                String messageId = aVar.getMessageId();
                iVar2.L$0 = this;
                iVar2.L$1 = str2;
                iVar2.label = 1;
                if (bVar.sendIAMPageImpression(appId, id, strVariantIdForMessage, messageId, pageId, iVar2) == aVar2) {
                    return aVar2;
                }
                str = str2;
                jVar = this;
            } catch (BackendException unused) {
                str = str2;
                jVar = this;
                jVar.viewedPageIds.remove(str);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) iVar2.L$1;
            jVar = (j) iVar2.L$0;
            try {
                J7.a.v(obj);
            } catch (BackendException unused2) {
                jVar.viewedPageIds.remove(str);
            }
        }
        jVar._prefs.setViewPageImpressionedIds(jVar.viewedPageIds);
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireTagCallForClick(com.onesignal.inAppMessages.internal.c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.inAppMessages.internal.i tags = cVar.getTags();
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                com.onesignal.common.f fVar = com.onesignal.common.f.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                p210v8.i.c(tagsToAdd);
                this._userManager.addTags(fVar.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                com.onesignal.common.f fVar2 = com.onesignal.common.f.INSTANCE;
                JSONArray tagsToRemove = tags != null ? tags.getTagsToRemove() : null;
                p210v8.i.c(tagsToRemove);
                this._userManager.removeTags(fVar2.newStringSetFromJSONArray(tagsToRemove));
            }
        }
    }

    private final boolean hasMessageTriggerChanged(a aVar) {
        if (this._triggerController.messageHasOnlyDynamicTriggers(aVar)) {
            return !aVar.isDisplayedInSession();
        }
        return aVar.isTriggerChanged() || (!aVar.isDisplayedInSession() && aVar.getTriggers().isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInAppMessagePreviewActions(com.onesignal.inAppMessages.internal.c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + cVar.getTags(), null, 2, null);
        }
        if (cVar.getOutcomes().size() > 0) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + cVar.getOutcomes(), null, 2, null);
        }
    }

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection, boolean z6) {
        synchronized (this.messages) {
            for (a aVar : this.messages) {
                boolean zContains = this.redisplayedInAppMessages.contains(aVar);
                boolean zIsTriggerOnMessage = this._triggerController.isTriggerOnMessage(aVar, collection);
                boolean zMessageHasOnlyDynamicTriggers = this._triggerController.messageHasOnlyDynamicTriggers(aVar);
                if (!aVar.isTriggerChanged() && zContains && (zIsTriggerOnMessage || (z6 && zMessageHasOnlyDynamicTriggers))) {
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + aVar, null, 2, null);
                    aVar.setTriggerChanged(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (persistInAppMessage(r11, r0) == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object messageWasDismissed(com.onesignal.inAppMessages.internal.a r11, boolean r12, p123m8.d<? super p076h8.m> r13) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.j.messageWasDismissed(com.onesignal.inAppMessages.internal.a, boolean, m8.d):java.lang.Object");
    }

    public static /* synthetic */ Object messageWasDismissed$default(j jVar, a aVar, boolean z6, p123m8.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return jVar.messageWasDismissed(aVar, z6, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object persistInAppMessage(a aVar, p123m8.d<? super p076h8.m> dVar) {
        x xVar;
        j jVar;
        if (dVar instanceof x) {
            xVar = (x) dVar;
            int i10 = xVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.label = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(dVar);
            }
        } else {
            xVar = new x(dVar);
        }
        Object obj = xVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = xVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            aVar.getRedisplayStats().setLastDisplayTime(this._time.getCurrentTimeMillis() / ((long) 1000));
            aVar.getRedisplayStats().incrementDisplayQuantity();
            aVar.setTriggerChanged(false);
            aVar.setDisplayedInSession(true);
            p236y5.a aVar3 = this._repository;
            xVar.L$0 = this;
            xVar.L$1 = aVar;
            xVar.label = 1;
            if (aVar3.saveInAppMessage(aVar, xVar) == aVar2) {
                return aVar2;
            }
            jVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) xVar.L$1;
            jVar = (j) xVar.L$0;
            J7.a.v(obj);
        }
        jVar._prefs.setLastTimeInAppDismissed(jVar._state.getLastTimeInAppDismissed());
        int iIndexOf = jVar.redisplayedInAppMessages.indexOf(aVar);
        if (iIndexOf != -1) {
            jVar.redisplayedInAppMessages.set(iIndexOf, aVar);
        } else {
            jVar.redisplayedInAppMessages.add(aVar);
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + jVar.redisplayedInAppMessages, null, 2, null);
        return p076h8.m.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r4.attemptToShowInAppMessage(r1) == r2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object queueMessageForDisplay(com.onesignal.inAppMessages.internal.a r9, p123m8.d<? super p076h8.m> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "InAppMessagesManager.queueMessageForDisplay: In app message with id: "
            boolean r1 = r10 instanceof com.onesignal.inAppMessages.internal.j.y
            if (r1 == 0) goto L15
            r1 = r10
            com.onesignal.inAppMessages.internal.j$y r1 = (com.onesignal.inAppMessages.internal.j.y) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.onesignal.inAppMessages.internal.j$y r1 = new com.onesignal.inAppMessages.internal.j$y
            r1.<init>(r10)
        L1a:
            java.lang.Object r10 = r1.result
            n8.a r2 = p134n8.a.f13404s
            int r3 = r1.label
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L47
            if (r3 == r4) goto L35
            if (r3 != r5) goto L2d
            J7.a.v(r10)
            goto Lab
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r1.L$2
            V9.a r9 = (V9.a) r9
            java.lang.Object r3 = r1.L$1
            com.onesignal.inAppMessages.internal.a r3 = (com.onesignal.inAppMessages.internal.a) r3
            java.lang.Object r4 = r1.L$0
            com.onesignal.inAppMessages.internal.j r4 = (com.onesignal.inAppMessages.internal.j) r4
            J7.a.v(r10)
            r10 = r9
            r9 = r3
            goto L5e
        L47:
            J7.a.v(r10)
            V9.a r10 = r8.messageDisplayQueueMutex
            r1.L$0 = r8
            r1.L$1 = r9
            r1.L$2 = r10
            r1.label = r4
            V9.d r10 = (V9.d) r10
            java.lang.Object r3 = r10.d(r1)
            if (r3 != r2) goto L5d
            goto Laa
        L5d:
            r4 = r8
        L5e:
            r3 = 0
            java.util.List<com.onesignal.inAppMessages.internal.a> r6 = r4.messageDisplayQueue     // Catch: java.lang.Throwable -> L95
            boolean r6 = r6.contains(r9)     // Catch: java.lang.Throwable -> L95
            if (r6 != 0) goto L97
            z5.a r6 = r4._state     // Catch: java.lang.Throwable -> L95
            java.lang.String r6 = r6.getInAppMessageIdShowing()     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = r9.getMessageId()     // Catch: java.lang.Throwable -> L95
            boolean r6 = p210v8.i.a(r6, r7)     // Catch: java.lang.Throwable -> L95
            if (r6 != 0) goto L97
            java.util.List<com.onesignal.inAppMessages.internal.a> r6 = r4.messageDisplayQueue     // Catch: java.lang.Throwable -> L95
            r6.add(r9)     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r9 = r9.getMessageId()     // Catch: java.lang.Throwable -> L95
            r6.append(r9)     // Catch: java.lang.Throwable -> L95
            java.lang.String r9 = ", added to the queue"
            r6.append(r9)     // Catch: java.lang.Throwable -> L95
            java.lang.String r9 = r6.toString()     // Catch: java.lang.Throwable -> L95
            com.onesignal.debug.internal.logging.b.debug$default(r9, r3, r5, r3)     // Catch: java.lang.Throwable -> L95
            goto L97
        L95:
            r9 = move-exception
            goto Lae
        L97:
            V9.d r10 = (V9.d) r10
            r10.e(r3)
            r1.L$0 = r3
            r1.L$1 = r3
            r1.L$2 = r3
            r1.label = r5
            java.lang.Object r9 = r4.attemptToShowInAppMessage(r1)
            if (r9 != r2) goto Lab
        Laa:
            return r2
        Lab:
            h8.m r9 = p076h8.m.a
            return r9
        Lae:
            V9.d r10 = (V9.d) r10
            r10.e(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.j.queueMessageForDisplay(com.onesignal.inAppMessages.internal.a, m8.d):java.lang.Object");
    }

    private final void setDataForRedisplay(a aVar) {
        boolean zContains = this.dismissedMessages.contains(aVar.getMessageId());
        int iIndexOf = this.redisplayedInAppMessages.indexOf(aVar);
        if (!zContains || iIndexOf == -1) {
            return;
        }
        a aVar2 = this.redisplayedInAppMessages.get(iIndexOf);
        aVar.getRedisplayStats().setDisplayStats(aVar2.getRedisplayStats());
        aVar.setDisplayedInSession(aVar2.isDisplayedInSession());
        boolean zHasMessageTriggerChanged = hasMessageTriggerChanged(aVar);
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setDataForRedisplay: " + aVar + " triggerHasChanged: " + zHasMessageTriggerChanged, null, 2, null);
        if (zHasMessageTriggerChanged && aVar.getRedisplayStats().isDelayTimeSatisfied() && aVar.getRedisplayStats().shouldDisplayAgain()) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setDataForRedisplay message available for redisplay: " + aVar.getMessageId(), null, 2, null);
            this.dismissedMessages.remove(aVar.getMessageId());
            this.impressionedMessages.remove(aVar.getMessageId());
            this.viewedPageIds.clear();
            this._prefs.setViewPageImpressionedIds(this.viewedPageIds);
            aVar.clearClickIds();
        }
    }

    private final void showAlertDialogMessage(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list) {
        String string = this._applicationService.getAppContext().getString(p151p5.l.location_permission_missing_title);
        p210v8.i.e(string, "_applicationService.appC…permission_missing_title)");
        String string2 = this._applicationService.getAppContext().getString(p151p5.l.location_permission_missing_message);
        p210v8.i.e(string2, "_applicationService.appC…rmission_missing_message)");
        new AlertDialog.Builder(this._applicationService.getCurrent()).setTitle(string).setMessage(string2).setPositiveButton(R.string.ok, new F4.d(this, aVar, list, 1)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showAlertDialogMessage$lambda-7, reason: not valid java name */
    public static final void m15showAlertDialogMessage$lambda7(j jVar, a aVar, List list, DialogInterface dialogInterface, int i10) {
        p210v8.i.f(jVar, "this$0");
        p210v8.i.f(aVar, "$inAppMessage");
        p210v8.i.f(list, "$prompts");
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, jVar.new z(aVar, list, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:0: B:17:0x0064->B:42:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b8 -> B:25:0x00bd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object showMultiplePrompts(com.onesignal.inAppMessages.internal.a r21, java.util.List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> r22, p123m8.d<? super p076h8.m> r23) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.j.showMultiplePrompts(com.onesignal.inAppMessages.internal.a, java.util.List, m8.d):java.lang.Object");
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: addClickListener */
    public void mo16addClickListener(p151p5.c cVar) {
        p210v8.i.f(cVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addClickListener(listener: " + cVar + ')', null, 2, null);
        this.messageClickCallback.subscribe(cVar);
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: addLifecycleListener */
    public void mo17addLifecycleListener(p151p5.g gVar) {
        p210v8.i.f(gVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + gVar + ')', null, 2, null);
        this.lifecycleCallback.subscribe(gVar);
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: addTrigger */
    public void mo18addTrigger(String str, String str2) {
        p210v8.i.f(str, "key");
        p210v8.i.f(str2, "value");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addTrigger(key: " + str + ", value: " + str2 + ')', null, 2, null);
        A5.c cVar = (A5.c) this._triggerModelStore.get(str);
        if (cVar != null) {
            cVar.setValue(str2);
            return;
        }
        A5.c cVar2 = new A5.c();
        cVar2.setId(str);
        cVar2.setKey(str);
        cVar2.setValue(str2);
        com.onesignal.common.modeling.b.add$default(this._triggerModelStore, cVar2, null, 2, null);
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: addTriggers */
    public void mo19addTriggers(Map<String, String> map) {
        p210v8.i.f(map, "triggers");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addTriggers(triggers: " + map + ')', null, 2, null);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            mo18addTrigger(entry.getKey(), entry.getValue());
        }
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: clearTriggers */
    public void mo20clearTriggers() {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.clearTriggers()", null, 2, null);
        com.onesignal.common.modeling.b.clear$default(this._triggerModelStore, null, 1, null);
    }

    @Override // p151p5.j
    public boolean getPaused() {
        return this._state.getPaused();
    }

    @Override // X4.e
    public void onFocus(boolean z6) {
    }

    @Override // p198u5.a
    public void onMessageActionOccurredOnMessage(a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        p210v8.i.f(aVar, "message");
        p210v8.i.f(cVar, "action");
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new l(cVar, aVar, this, null), 1, null);
    }

    @Override // p198u5.a
    public void onMessageActionOccurredOnPreview(a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        p210v8.i.f(aVar, "message");
        p210v8.i.f(cVar, "action");
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new m(cVar, aVar, this, null), 1, null);
    }

    @Override // p198u5.a
    public void onMessagePageChanged(a aVar, com.onesignal.inAppMessages.internal.g gVar) {
        p210v8.i.f(aVar, "message");
        p210v8.i.f(gVar, "page");
        if (aVar.isPreview()) {
            return;
        }
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new n(aVar, gVar, null), 1, null);
    }

    @Override // p198u5.a
    public void onMessageWasDismissed(a aVar) {
        p210v8.i.f(aVar, "message");
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new o(aVar, null), 1, null);
    }

    @Override // p198u5.a
    public void onMessageWasDisplayed(a aVar) {
        p210v8.i.f(aVar, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new p(aVar));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", null, 2, null);
        }
        if (aVar.isPreview() || this.impressionedMessages.contains(aVar.getMessageId())) {
            return;
        }
        this.impressionedMessages.add(aVar.getMessageId());
        String strVariantIdForMessage = p172r5.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
        if (strVariantIdForMessage == null) {
            return;
        }
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new q(strVariantIdForMessage, aVar, null), 1, null);
    }

    @Override // p198u5.a
    public void onMessageWillDismiss(a aVar) {
        p210v8.i.f(aVar, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new r(aVar));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // p198u5.a
    public void onMessageWillDisplay(a aVar) {
        p210v8.i.f(aVar, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new s(aVar));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
        p210v8.i.f(jVar, "args");
        p210v8.i.f(str, "tag");
        if (p210v8.i.a(jVar.getProperty(), "appId")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // p111l6.a
    public void onSessionActive() {
    }

    @Override // p111l6.a
    public void onSessionEnded(long j) {
    }

    @Override // p111l6.a
    public void onSessionStarted() {
        Iterator<a> it = this.redisplayedInAppMessages.iterator();
        while (it.hasNext()) {
            it.next().setDisplayedInSession(false);
        }
        fetchMessagesWhenConditionIsMet();
    }

    @Override // p208v6.a
    public void onSubscriptionAdded(p228x6.e eVar) {
        p210v8.i.f(eVar, "subscription");
    }

    @Override // p208v6.a
    public void onSubscriptionChanged(p228x6.e eVar, com.onesignal.common.modeling.j jVar) {
        p210v8.i.f(eVar, "subscription");
        p210v8.i.f(jVar, "args");
        if ((eVar instanceof p228x6.b) && p210v8.i.a(jVar.getPath(), "id")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // p208v6.a
    public void onSubscriptionRemoved(p228x6.e eVar) {
        p210v8.i.f(eVar, "subscription");
    }

    @Override // A5.b
    public void onTriggerChanged(String str) {
        p210v8.i.f(str, "newTriggerKey");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + str + ')', null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(com.bumptech.glide.d.u(str), true);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new t(null), 1, null);
    }

    @Override // A5.b
    public void onTriggerCompleted(String str) {
        p210v8.i.f(str, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: ".concat(str), null, 2, null);
        new HashSet().add(str);
    }

    @Override // A5.b
    public void onTriggerConditionChanged(String str) {
        p210v8.i.f(str, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerConditionChanged()", null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(com.bumptech.glide.d.u(str), false);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new u(null), 1, null);
    }

    @Override // X4.e
    public void onUnfocused() {
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: removeClickListener */
    public void mo21removeClickListener(p151p5.c cVar) {
        p210v8.i.f(cVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeClickListener(listener: " + cVar + ')', null, 2, null);
        this.messageClickCallback.unsubscribe(cVar);
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: removeLifecycleListener */
    public void mo22removeLifecycleListener(p151p5.g gVar) {
        p210v8.i.f(gVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + gVar + ')', null, 2, null);
        this.lifecycleCallback.unsubscribe(gVar);
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: removeTrigger */
    public void mo23removeTrigger(String str) {
        p210v8.i.f(str, "key");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTrigger(key: " + str + ')', null, 2, null);
        com.onesignal.common.modeling.b.remove$default(this._triggerModelStore, str, null, 2, null);
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: removeTriggers */
    public void mo24removeTriggers(Collection<String> collection) {
        p210v8.i.f(collection, "keys");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTriggers(keys: " + collection + ')', null, 2, null);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            mo23removeTrigger((String) it.next());
        }
    }

    @Override // p151p5.j
    public void setPaused(boolean z6) {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setPaused(value: " + z6 + ')', null, 2, null);
        this._state.setPaused(z6);
        if (z6 && this._state.getInAppMessageIdShowing() != null) {
            U9.d dVar = I.a;
            p123m8.i iVar = S9.n.a;
            v vVar = new v(null);
            int i10 = 2 & 1;
            p123m8.j jVar = p123m8.j.f13164s;
            if (i10 != 0) {
                iVar = jVar;
            }
            p123m8.i iVarG = AbstractC0342z.g(jVar, iVar, true);
            U9.d dVar2 = I.a;
            if (iVarG != dVar2 && iVarG.get(p123m8.e.f13163s) == null) {
                iVarG = iVarG.plus(dVar2);
            }
            AbstractC0317a p0Var = new p0(iVarG, true);
            p0Var.Q(1, p0Var, vVar);
        }
        if (z6) {
            return;
        }
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new w(null), 1, null);
    }

    @Override // p100k5.b
    public void start() {
        Set<String> dismissedMessagesId = this._prefs.getDismissedMessagesId();
        if (dismissedMessagesId != null) {
            this.dismissedMessages.addAll(dismissedMessagesId);
        }
        Long lastTimeInAppDismissed = this._prefs.getLastTimeInAppDismissed();
        if (lastTimeInAppDismissed != null) {
            this._state.setLastTimeInAppDismissed(lastTimeInAppDismissed);
        }
        this._subscriptionManager.subscribe(this);
        this._configModelStore.subscribe((com.onesignal.common.modeling.g) this);
        this._lifecycle.subscribe(this);
        this._triggerController.subscribe(this);
        this._sessionService.subscribe(this);
        this._applicationService.addApplicationLifecycleHandler(this);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new B(null), 1, null);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.a aVar, String str) {
        p210v8.i.f(aVar, "model");
        p210v8.i.f(str, "tag");
        fetchMessagesWhenConditionIsMet();
    }
}
