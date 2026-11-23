package com.onesignal.user.internal.migrations;

import N9.AbstractC0317a;
import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import N9.p0;
import p064g5.e;
import p064g5.f;
import p076h8.m;
import p100k5.b;
import p123m8.d;
import p123m8.j;
import p144o8.g;
import p200u8.c;
import p210v8.i;
import p210v8.u;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p162q6.b _identityModelStore;
    private final f _operationRepo;

    /* JADX INFO: renamed from: com.onesignal.user.internal.migrations.a$a, reason: collision with other inner class name */
    public static final class C0083a extends g implements c {
        int label;

        public C0083a(d<? super C0083a> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final d<m> create(Object obj, d<?> dVar) {
            return a.this.new C0083a(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super m> dVar) {
            return ((C0083a) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 == 0) {
                J7.a.v(obj);
                f fVar = a.this._operationRepo;
                this.label = 1;
                if (fVar.awaitInitialized(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
            if (a.this.isInBadState()) {
                com.onesignal.debug.internal.logging.b.warn$default("User with externalId:" + ((p162q6.a) a.this._identityModelStore.getModel()).getExternalId() + " was in a bad state, causing it to not update on OneSignal's backend! We are recovering and replaying all unsent operations now.", null, 2, null);
                a.this.recoverByAddingBackDroppedLoginOperation();
            }
            return m.a;
        }
    }

    public a(f fVar, p162q6.b bVar, com.onesignal.core.internal.config.b bVar2) {
        i.f(fVar, "_operationRepo");
        i.f(bVar, "_identityModelStore");
        i.f(bVar2, "_configModelStore");
        this._operationRepo = fVar;
        this._identityModelStore = bVar;
        this._configModelStore = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInBadState() {
        return (((p162q6.a) this._identityModelStore.getModel()).getExternalId() == null || !com.onesignal.common.d.INSTANCE.isLocalId(((p162q6.a) this._identityModelStore.getModel()).getOnesignalId()) || this._operationRepo.containsInstanceOf(u.a.b(p173r6.f.class))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recoverByAddingBackDroppedLoginOperation() {
        e.enqueue$default(this._operationRepo, new p173r6.f(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((p162q6.a) this._identityModelStore.getModel()).getOnesignalId(), ((p162q6.a) this._identityModelStore.getModel()).getExternalId(), null), false, 2, null);
    }

    @Override // p100k5.b
    public void start() {
        p123m8.i iVar = I.f3415c;
        C0083a c0083a = new C0083a(null);
        int i10 = 2 & 1;
        j jVar = j.f13164s;
        if (i10 != 0) {
            iVar = jVar;
        }
        p123m8.i iVarG = AbstractC0342z.g(jVar, iVar, true);
        U9.d dVar = I.a;
        if (iVarG != dVar && iVarG.get(p123m8.e.f13163s) == null) {
            iVarG = iVarG.plus(dVar);
        }
        AbstractC0317a p0Var = new p0(iVarG, true);
        p0Var.Q(1, p0Var, c0083a);
    }
}
