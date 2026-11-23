package com.onesignal.user.internal;

import com.onesignal.common.h;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p076h8.m;
import p086i8.y;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public class f implements p121m6.a, g {
    private final p162q6.b _identityModelStore;
    private final p043e5.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final p208v6.b _subscriptionManager;
    private final com.onesignal.common.events.b changeHandlersNotifier;
    private final com.onesignal.common.events.b jwtInvalidatedCallback;
    private String jwtTokenInvalidated;

    public static final class a extends k implements p200u8.b {
        final /* synthetic */ p217w6.c $newUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p217w6.c cVar) {
            super(1);
            this.$newUserState = cVar;
        }

        @Override // p200u8.b
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((p217w6.a) null);
            return m.a;
        }

        public final void invoke(p217w6.a aVar) {
            i.f(aVar, "it");
            new p217w6.b(this.$newUserState);
            aVar.a();
        }
    }

    public static final class b extends k implements p200u8.b {
        public b() {
            super(1);
        }

        @Override // p200u8.b
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((P4.b) null);
            return m.a;
        }

        public final void invoke(P4.b bVar) {
            i.f(bVar, "it");
            i.f(f.this.getExternalId(), "externalId");
            bVar.a();
        }
    }

    public f(p208v6.b bVar, p162q6.b bVar2, com.onesignal.user.internal.properties.b bVar3, p043e5.a aVar) {
        i.f(bVar, "_subscriptionManager");
        i.f(bVar2, "_identityModelStore");
        i.f(bVar3, "_propertiesModelStore");
        i.f(aVar, "_languageContext");
        this._subscriptionManager = bVar;
        this._identityModelStore = bVar2;
        this._propertiesModelStore = bVar3;
        this._languageContext = aVar;
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        this.jwtInvalidatedCallback = new com.onesignal.common.events.b();
        bVar2.subscribe((g) this);
    }

    private final p162q6.a get_identityModel() {
        return (p162q6.a) this._identityModelStore.getModel();
    }

    private final com.onesignal.user.internal.properties.a get_propertiesModel() {
        return (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
    }

    @Override // p121m6.a
    public void addAlias(String str, String str2) {
        i.f(str, "label");
        i.f(str2, "id");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "setAlias(label: " + str + ", id: " + str2 + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot add empty alias");
        } else if (str.equals("onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put(str, str2);
        }
    }

    @Override // p121m6.a
    public void addAliases(Map<String, String> map) {
        i.f(map, "aliases");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "addAliases(aliases: " + map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot add empty alias");
                return;
            } else if (i.a(entry.getKey(), "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot add 'onesignal_id' alias");
                return;
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            get_identityModel().put(entry2.getKey(), entry2.getValue());
        }
    }

    @Override // p121m6.a
    public void addEmail(String str) {
        i.f(str, "email");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "addEmail(email: " + str + ')');
        if (h.INSTANCE.isValidEmail(str)) {
            this._subscriptionManager.addEmailSubscription(str);
        } else {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot add invalid email address as subscription: ".concat(str));
        }
    }

    @Override // p121m6.a
    public void addObserver(p217w6.a aVar) {
        i.f(aVar, "observer");
        this.changeHandlersNotifier.subscribe(aVar);
    }

    @Override // p121m6.a
    public void addSms(String str) {
        i.f(str, "sms");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "addSms(sms: " + str + ')');
        if (h.INSTANCE.isValidPhoneNumber(str)) {
            this._subscriptionManager.addSmsSubscription(str);
        } else {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot add invalid sms number as subscription: ".concat(str));
        }
    }

    @Override // p121m6.a
    public void addTag(String str, String str2) {
        i.f(str, "key");
        i.f(str2, "value");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "setTag(key: " + str + ", value: " + str2 + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put(str, str2);
        }
    }

    @Override // p121m6.a
    public void addTags(Map<String, String> map) {
        i.f(map, "tags");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "setTags(tags: " + map + ')');
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            get_propertiesModel().getTags().put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p121m6.a
    public void addUserJwtInvalidatedListener(P4.b bVar) {
        i.f(bVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal.addUserJwtInvalidatedListener(listener: " + bVar + ')', null, 2, null);
        this.jwtInvalidatedCallback.subscribe(bVar);
    }

    public final Map<String, String> getAliases() {
        p162q6.a aVar = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : aVar.entrySet()) {
            if (!i.a(entry.getKey(), "id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return y.A(linkedHashMap);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // p121m6.a
    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    public final com.onesignal.common.events.b getJwtInvalidatedCallback() {
        return this.jwtInvalidatedCallback;
    }

    @Override // p121m6.a
    public String getOnesignalId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    @Override // p121m6.a
    public p228x6.b getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    public final p208v6.c getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    @Override // p121m6.a
    public Map<String, String> getTags() {
        return y.A(get_propertiesModel().getTags());
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(p162q6.a aVar, String str) {
        i.f(aVar, "model");
        i.f(str, "tag");
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j jVar, String str) {
        i.f(jVar, "args");
        i.f(str, "tag");
        String property = jVar.getProperty();
        if (i.a(property, "onesignal_id")) {
            this.changeHandlersNotifier.fire(new a(new p217w6.c(String.valueOf(jVar.getNewValue()), getExternalId())));
        } else if (i.a(property, "jwt_token")) {
            Object oldValue = jVar.getOldValue();
            Object newValue = jVar.getNewValue();
            if (!i.a(this.jwtTokenInvalidated, oldValue) && newValue == null) {
                this.jwtInvalidatedCallback.fire(new b());
            }
            this.jwtTokenInvalidated = (String) oldValue;
        }
    }

    @Override // p121m6.a
    public void removeAlias(String str) {
        i.f(str, "label");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "removeAlias(label: " + str + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot remove empty alias");
        } else if (str.equals("onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) str);
        }
    }

    @Override // p121m6.a
    public void removeAliases(Collection<String> collection) {
        i.f(collection, "labels");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "removeAliases(labels: " + collection + ')');
        Collection<String> collection2 = collection;
        for (String str : collection2) {
            if (str.length() == 0) {
                com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot remove empty alias");
                return;
            } else if (i.a(str, "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot remove 'onesignal_id' alias");
                return;
            }
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            get_identityModel().remove(it.next());
        }
    }

    @Override // p121m6.a
    public void removeEmail(String str) {
        i.f(str, "email");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "removeEmail(email: " + str + ')');
        if (h.INSTANCE.isValidEmail(str)) {
            this._subscriptionManager.removeEmailSubscription(str);
        } else {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot remove invalid email address as subscription: ".concat(str));
        }
    }

    @Override // p121m6.a
    public void removeObserver(p217w6.a aVar) {
        i.f(aVar, "observer");
        this.changeHandlersNotifier.unsubscribe(aVar);
    }

    @Override // p121m6.a
    public void removeSms(String str) {
        i.f(str, "sms");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "removeSms(sms: " + str + ')');
        if (h.INSTANCE.isValidPhoneNumber(str)) {
            this._subscriptionManager.removeSmsSubscription(str);
        } else {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot remove invalid sms number as subscription: ".concat(str));
        }
    }

    @Override // p121m6.a
    public void removeTag(String str) {
        i.f(str, "key");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "removeTag(key: " + str + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) str);
        }
    }

    @Override // p121m6.a
    public void removeTags(Collection<String> collection) {
        i.f(collection, "keys");
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "removeTags(keys: " + collection + ')');
        Collection<String> collection2 = collection;
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() == 0) {
                com.onesignal.debug.internal.logging.b.log(p131n5.b.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            get_propertiesModel().getTags().remove(it2.next());
        }
    }

    @Override // p121m6.a
    public void removeUserJwtInvalidatedListener(P4.b bVar) {
        i.f(bVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal.removeUserJwtInvalidatedListener(listener: " + bVar + ')', null, 2, null);
        this.jwtInvalidatedCallback.unsubscribe(bVar);
    }

    @Override // p121m6.a
    public void setLanguage(String str) {
        i.f(str, "value");
        this._languageContext.setLanguage(str);
    }
}
