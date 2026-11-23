package com.onesignal.inAppMessages.internal.prompt.impl;

import kotlin.NoWhenBranchMatchedException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    private final B5.a _locationManager;

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.prompt.impl.a$a, reason: collision with other inner class name */
    public static final class C0045a extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public C0045a(p123m8.d<? super C0045a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.handlePrompt(this);
        }
    }

    public a(B5.a aVar) {
        i.f(aVar, "_locationManager");
        this._locationManager = aVar;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    public String getPromptKey() {
        return "location";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    public Object handlePrompt(p123m8.d<? super b.a> dVar) {
        C0045a c0045a;
        if (dVar instanceof C0045a) {
            c0045a = (C0045a) dVar;
            int i10 = c0045a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0045a.label = i10 - Integer.MIN_VALUE;
            } else {
                c0045a = new C0045a(dVar);
            }
        } else {
            c0045a = new C0045a(dVar);
        }
        Object objRequestPermission = c0045a.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = c0045a.label;
        if (i11 == 0) {
            J7.a.v(objRequestPermission);
            B5.a aVar2 = this._locationManager;
            c0045a.label = 1;
            objRequestPermission = aVar2.requestPermission(c0045a);
            if (objRequestPermission == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(objRequestPermission);
        }
        boolean zBooleanValue = ((Boolean) objRequestPermission).booleanValue();
        if (zBooleanValue) {
            return b.a.PERMISSION_GRANTED;
        }
        if (zBooleanValue) {
            throw new NoWhenBranchMatchedException();
        }
        return b.a.PERMISSION_DENIED;
    }
}
