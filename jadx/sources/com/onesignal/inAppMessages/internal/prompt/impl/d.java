package com.onesignal.inAppMessages.internal.prompt.impl;

import J5.n;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    private final n _notificationsManager;

    public static final class a extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public a(p123m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.handlePrompt(this);
        }
    }

    public d(n nVar) {
        i.f(nVar, "_notificationsManager");
        this._notificationsManager = nVar;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    public String getPromptKey() {
        return "push";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    public Object handlePrompt(p123m8.d<? super b.a> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.label = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objRequestPermission = aVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = aVar.label;
        if (i11 == 0) {
            J7.a.v(objRequestPermission);
            n nVar = this._notificationsManager;
            aVar.label = 1;
            objRequestPermission = nVar.requestPermission(true, aVar);
            if (objRequestPermission == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(objRequestPermission);
        }
        return ((Boolean) objRequestPermission).booleanValue() ? b.a.PERMISSION_GRANTED : b.a.PERMISSION_DENIED;
    }
}
