package com.onesignal.inAppMessages.internal.lifecycle.impl;

import p076h8.m;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.onesignal.common.events.b implements p198u5.b {

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0043a extends k implements p200u8.b {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0043a(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p198u5.a) obj);
            return m.a;
        }

        public final void invoke(p198u5.a aVar) {
            i.f(aVar, "it");
            aVar.onMessageActionOccurredOnMessage(this.$message, this.$action);
        }
    }

    public static final class b extends k implements p200u8.b {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
            super(1);
            this.$message = aVar;
            this.$action = cVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p198u5.a) obj);
            return m.a;
        }

        public final void invoke(p198u5.a aVar) {
            i.f(aVar, "it");
            aVar.onMessageActionOccurredOnPreview(this.$message, this.$action);
        }
    }

    public static final class c extends k implements p200u8.b {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
            super(1);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p198u5.a) obj);
            return m.a;
        }

        public final void invoke(p198u5.a aVar) {
            i.f(aVar, "it");
            aVar.onMessagePageChanged(this.$message, this.$page);
        }
    }

    public static final class d extends k implements p200u8.b {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p198u5.a) obj);
            return m.a;
        }

        public final void invoke(p198u5.a aVar) {
            i.f(aVar, "it");
            aVar.onMessageWasDismissed(this.$message);
        }
    }

    public static final class e extends k implements p200u8.b {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p198u5.a) obj);
            return m.a;
        }

        public final void invoke(p198u5.a aVar) {
            i.f(aVar, "it");
            aVar.onMessageWasDisplayed(this.$message);
        }
    }

    public static final class f extends k implements p200u8.b {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p198u5.a) obj);
            return m.a;
        }

        public final void invoke(p198u5.a aVar) {
            i.f(aVar, "it");
            aVar.onMessageWillDismiss(this.$message);
        }
    }

    public static final class g extends k implements p200u8.b {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p198u5.a) obj);
            return m.a;
        }

        public final void invoke(p198u5.a aVar) {
            i.f(aVar, "it");
            aVar.onMessageWillDisplay(this.$message);
        }
    }

    @Override // p198u5.b
    public void messageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        i.f(aVar, "message");
        i.f(cVar, "action");
        fire(new C0043a(aVar, cVar));
    }

    @Override // p198u5.b
    public void messageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        i.f(aVar, "message");
        i.f(cVar, "action");
        fire(new b(aVar, cVar));
    }

    @Override // p198u5.b
    public void messagePageChanged(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
        i.f(aVar, "message");
        i.f(gVar, "page");
        fire(new c(aVar, gVar));
    }

    @Override // p198u5.b
    public void messageWasDismissed(com.onesignal.inAppMessages.internal.a aVar) {
        i.f(aVar, "message");
        fire(new d(aVar));
    }

    @Override // p198u5.b
    public void messageWasDisplayed(com.onesignal.inAppMessages.internal.a aVar) {
        i.f(aVar, "message");
        fire(new e(aVar));
    }

    @Override // p198u5.b
    public void messageWillDismiss(com.onesignal.inAppMessages.internal.a aVar) {
        i.f(aVar, "message");
        fire(new f(aVar));
    }

    @Override // p198u5.b
    public void messageWillDisplay(com.onesignal.inAppMessages.internal.a aVar) {
        i.f(aVar, "message");
        fire(new g(aVar));
    }
}
