package com.onesignal.user.internal.subscriptions.impl;

import X4.f;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.h;
import com.onesignal.common.modeling.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import p076h8.m;
import p086i8.s;
import p208v6.e;
import p208v6.g;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p208v6.b, com.onesignal.common.modeling.d, p111l6.a {
    private final f _applicationService;
    private final p111l6.b _sessionService;
    private final e _subscriptionModelStore;
    private final com.onesignal.common.events.b events;
    private p208v6.c subscriptions;

    public static final class a extends k implements p200u8.b {
        final /* synthetic */ p228x6.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p228x6.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p208v6.a) obj);
            return m.a;
        }

        public final void invoke(p208v6.a aVar) {
            i.f(aVar, "it");
            aVar.onSubscriptionAdded(this.$subscription);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.user.internal.subscriptions.impl.b$b, reason: collision with other inner class name */
    public static final class C0086b extends k implements p200u8.b {
        final /* synthetic */ p228x6.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0086b(p228x6.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // p200u8.b
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((p228x6.c) null);
            return m.a;
        }

        public final void invoke(p228x6.c cVar) {
            i.f(cVar, "it");
            new p228x6.f(((com.onesignal.user.internal.b) this.$subscription).getSavedState(), ((com.onesignal.user.internal.b) this.$subscription).refreshState());
            cVar.a();
        }
    }

    public static final class c extends k implements p200u8.b {
        final /* synthetic */ j $args;
        final /* synthetic */ p228x6.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p228x6.e eVar, j jVar) {
            super(1);
            this.$subscription = eVar;
            this.$args = jVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p208v6.a) obj);
            return m.a;
        }

        public final void invoke(p208v6.a aVar) {
            i.f(aVar, "it");
            aVar.onSubscriptionChanged(this.$subscription, this.$args);
        }
    }

    public static final class d extends k implements p200u8.b {
        final /* synthetic */ p228x6.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p228x6.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p208v6.a) obj);
            return m.a;
        }

        public final void invoke(p208v6.a aVar) {
            i.f(aVar, "it");
            aVar.onSubscriptionRemoved(this.$subscription);
        }
    }

    public b(f fVar, p111l6.b bVar, e eVar) {
        i.f(fVar, "_applicationService");
        i.f(bVar, "_sessionService");
        i.f(eVar, "_subscriptionModelStore");
        this._applicationService = fVar;
        this._sessionService = bVar;
        this._subscriptionModelStore = eVar;
        this.events = new com.onesignal.common.events.b();
        this.subscriptions = new p208v6.c(s.f12328s, new com.onesignal.user.internal.e());
        Iterator<com.onesignal.common.modeling.i> it = eVar.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((p208v6.d) it.next());
        }
        this._subscriptionModelStore.subscribe((com.onesignal.common.modeling.d) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(g gVar, String str, p208v6.f fVar) {
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "SubscriptionManager.addSubscription(type: " + gVar + ", address: " + str + ')');
        p208v6.d dVar = new p208v6.d();
        dVar.setId(com.onesignal.common.d.INSTANCE.createLocalId());
        dVar.setOptedIn(true);
        dVar.setType(gVar);
        dVar.setAddress(str);
        if (fVar == null) {
            fVar = p208v6.f.SUBSCRIBED;
        }
        dVar.setStatus(fVar);
        com.onesignal.common.modeling.b.add$default(this._subscriptionModelStore, dVar, null, 2, null);
    }

    public static /* synthetic */ void addSubscriptionToModels$default(b bVar, g gVar, String str, p208v6.f fVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            fVar = null;
        }
        bVar.addSubscriptionToModels(gVar, str, fVar);
    }

    private final void createSubscriptionAndAddToSubscriptionList(p208v6.d dVar) {
        p228x6.e eVarCreateSubscriptionFromModel = createSubscriptionFromModel(dVar);
        ArrayList arrayListT0 = p086i8.k.t0(getSubscriptions().getCollection());
        if (dVar.getType() == g.PUSH) {
            p228x6.b push = getSubscriptions().getPush();
            i.d(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            com.onesignal.user.internal.b bVar = (com.onesignal.user.internal.b) push;
            i.d(eVarCreateSubscriptionFromModel, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            ((com.onesignal.user.internal.b) eVarCreateSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(bVar.getChangeHandlersNotifier());
            arrayListT0.remove(bVar);
        }
        arrayListT0.add(eVarCreateSubscriptionFromModel);
        setSubscriptions(new p208v6.c(arrayListT0, new com.onesignal.user.internal.e()));
        this.events.fire(new a(eVarCreateSubscriptionFromModel));
    }

    private final p228x6.e createSubscriptionFromModel(p208v6.d dVar) {
        int i10 = com.onesignal.user.internal.subscriptions.impl.a.$EnumSwitchMapping$0[dVar.getType().ordinal()];
        if (i10 == 1) {
            return new com.onesignal.user.internal.c(dVar);
        }
        if (i10 == 2) {
            return new com.onesignal.user.internal.a(dVar);
        }
        if (i10 == 3) {
            return new com.onesignal.user.internal.b(dVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void refreshPushSubscriptionState() {
        p228x6.e push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.e) {
            return;
        }
        i.d(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        p208v6.d model = ((com.onesignal.user.internal.d) push).getModel();
        model.setSdk(h.SDK_VERSION);
        String str = Build.VERSION.RELEASE;
        i.e(str, "RELEASE");
        model.setDeviceOS(str);
        String carrierName = com.onesignal.common.c.INSTANCE.getCarrierName(this._applicationService.getAppContext());
        if (carrierName != null) {
            model.setCarrier(carrierName);
        }
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext());
        if (appVersion != null) {
            model.setAppVersion(appVersion);
        }
    }

    private final void removeSubscriptionFromModels(p228x6.e eVar) {
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "SubscriptionManager.removeSubscription(subscription: " + eVar + ')');
        com.onesignal.common.modeling.b.remove$default(this._subscriptionModelStore, eVar.getId(), null, 2, null);
    }

    private final void removeSubscriptionFromSubscriptionList(p228x6.e eVar) {
        ArrayList arrayListT0 = p086i8.k.t0(getSubscriptions().getCollection());
        arrayListT0.remove(eVar);
        setSubscriptions(new p208v6.c(arrayListT0, new com.onesignal.user.internal.e()));
        this.events.fire(new d(eVar));
    }

    @Override // p208v6.b
    public void addEmailSubscription(String str) {
        i.f(str, "email");
        addSubscriptionToModels$default(this, g.EMAIL, str, null, 4, null);
    }

    @Override // p208v6.b
    public void addOrUpdatePushSubscriptionToken(String str, p208v6.f fVar) {
        i.f(fVar, "pushTokenStatus");
        p228x6.e push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.e) {
            g gVar = g.PUSH;
            if (str == null) {
                str = "";
            }
            addSubscriptionToModels(gVar, str, fVar);
            return;
        }
        i.d(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        p208v6.d model = ((com.onesignal.user.internal.d) push).getModel();
        if (str != null) {
            model.setAddress(str);
        }
        model.setStatus(fVar);
    }

    @Override // p208v6.b
    public void addSmsSubscription(String str) {
        i.f(str, "sms");
        addSubscriptionToModels$default(this, g.SMS, str, null, 4, null);
    }

    @Override // p208v6.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // p208v6.b
    public p208v6.d getPushSubscriptionModel() {
        p228x6.b push = getSubscriptions().getPush();
        i.d(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
        return ((com.onesignal.user.internal.b) push).getModel();
    }

    @Override // p208v6.b
    public p208v6.c getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j jVar, String str) {
        Object next;
        p228x6.e eVar;
        com.onesignal.common.modeling.i model;
        i.f(jVar, "args");
        i.f(str, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            eVar = (p228x6.e) next;
            model = jVar.getModel();
            i.d(eVar, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        } while (!i.a(model, ((com.onesignal.user.internal.d) eVar).getModel()));
        p228x6.e eVar2 = (p228x6.e) next;
        if (eVar2 == null) {
            com.onesignal.common.modeling.i model2 = jVar.getModel();
            i.d(model2, "null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionModel");
            createSubscriptionAndAddToSubscriptionList((p208v6.d) model2);
        } else {
            if (eVar2 instanceof com.onesignal.user.internal.b) {
                ((com.onesignal.user.internal.b) eVar2).getChangeHandlersNotifier().fireOnMain(new C0086b(eVar2));
            }
            this.events.fire(new c(eVar2, jVar));
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
        refreshPushSubscriptionState();
    }

    @Override // p208v6.b
    public void removeEmailSubscription(String str) {
        Object next;
        i.f(str, "email");
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            p228x6.a aVar = (p228x6.a) next;
            if ((aVar instanceof com.onesignal.user.internal.a) && i.a(aVar.getEmail(), str)) {
                break;
            }
        }
        p228x6.a aVar2 = (p228x6.a) next;
        if (aVar2 != null) {
            removeSubscriptionFromModels(aVar2);
        }
    }

    @Override // p208v6.b
    public void removeSmsSubscription(String str) {
        Object next;
        i.f(str, "sms");
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            p228x6.d dVar = (p228x6.d) next;
            if ((dVar instanceof com.onesignal.user.internal.c) && i.a(dVar.getNumber(), str)) {
                break;
            }
        }
        p228x6.d dVar2 = (p228x6.d) next;
        if (dVar2 != null) {
            removeSubscriptionFromModels(dVar2);
        }
    }

    @Override // p208v6.b
    public void setSubscriptions(p208v6.c cVar) {
        i.f(cVar, "<set-?>");
        this.subscriptions = cVar;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(p208v6.d dVar, String str) {
        i.f(dVar, "model");
        i.f(str, "tag");
        createSubscriptionAndAddToSubscriptionList(dVar);
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(p208v6.d dVar, String str) {
        Object next;
        i.f(dVar, "model");
        i.f(str, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!i.a(((p228x6.e) next).getId(), dVar.getId()));
        p228x6.e eVar = (p228x6.e) next;
        if (eVar != null) {
            removeSubscriptionFromSubscriptionList(eVar);
        }
    }

    @Override // p208v6.b, com.onesignal.common.events.d
    public void subscribe(p208v6.a aVar) {
        i.f(aVar, "handler");
        this.events.subscribe(aVar);
    }

    @Override // p208v6.b, com.onesignal.common.events.d
    public void unsubscribe(p208v6.a aVar) {
        i.f(aVar, "handler");
        this.events.unsubscribe(aVar);
    }
}
