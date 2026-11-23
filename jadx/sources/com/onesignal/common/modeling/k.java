package com.onesignal.common.modeling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements com.onesignal.common.events.d, com.onesignal.common.modeling.c, com.onesignal.common.modeling.a {
    private final p093j5.b _prefs;
    private final com.onesignal.common.events.b changeSubscription;
    private boolean hasLoadedFromCache;
    private final List<i> models;
    private final String name;

    public static final class a extends p210v8.k implements p200u8.b {
        final /* synthetic */ i $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, String str) {
            super(1);
            this.$model = iVar;
            this.$tag = str;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return p076h8.m.a;
        }

        public final void invoke(com.onesignal.common.modeling.d dVar) {
            p210v8.i.f(dVar, "it");
            dVar.onModelAdded(this.$model, this.$tag);
        }
    }

    public static final class b extends p210v8.k implements p200u8.b {
        final /* synthetic */ i $item;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, String str) {
            super(1);
            this.$item = iVar;
            this.$tag = str;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return p076h8.m.a;
        }

        public final void invoke(com.onesignal.common.modeling.d dVar) {
            p210v8.i.f(dVar, "it");
            dVar.onModelRemoved(this.$item, this.$tag);
        }
    }

    public static final class c extends p210v8.k implements p200u8.b {
        final /* synthetic */ j $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j jVar, String str) {
            super(1);
            this.$args = jVar;
            this.$tag = str;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return p076h8.m.a;
        }

        public final void invoke(com.onesignal.common.modeling.d dVar) {
            p210v8.i.f(dVar, "it");
            dVar.onModelUpdated(this.$args, this.$tag);
        }
    }

    public static final class d extends p210v8.k implements p200u8.b {
        final /* synthetic */ i $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, String str) {
            super(1);
            this.$model = iVar;
            this.$tag = str;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return p076h8.m.a;
        }

        public final void invoke(com.onesignal.common.modeling.d dVar) {
            p210v8.i.f(dVar, "it");
            dVar.onModelRemoved(this.$model, this.$tag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final void addItem(i iVar, String str, Integer num) {
        synchronized (this.models) {
            try {
                if (num != null) {
                    this.models.add(num.intValue(), iVar);
                } else {
                    this.models.add(iVar);
                }
                iVar.subscribe((com.onesignal.common.modeling.a) this);
                persist();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.changeSubscription.fire(new a(iVar, str));
    }

    public static /* synthetic */ void addItem$default(k kVar, i iVar, String str, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        kVar.addItem(iVar, str, num);
    }

    private final void removeItem(i iVar, String str) {
        synchronized (this.models) {
            this.models.remove(iVar);
            iVar.unsubscribe((com.onesignal.common.modeling.a) this);
            persist();
        }
        this.changeSubscription.fire(new d(iVar, str));
    }

    @Override // com.onesignal.common.modeling.c
    public void add(i iVar, String str) {
        Object next;
        p210v8.i.f(iVar, "model");
        p210v8.i.f(str, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p210v8.i.a(((i) next).getId(), iVar.getId()));
                i iVar2 = (i) next;
                if (iVar2 != null) {
                    removeItem(iVar2, str);
                }
                addItem$default(this, iVar, str, null, 4, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.c
    public void clear(String str) {
        p210v8.i.f(str, "tag");
        List<i> listS0 = p086i8.k.s0(this.models);
        synchronized (this.models) {
            this.models.clear();
            persist();
        }
        for (i iVar : listS0) {
            iVar.unsubscribe((com.onesignal.common.modeling.a) this);
            this.changeSubscription.fire(new b(iVar, str));
        }
    }

    @Override // com.onesignal.common.modeling.c
    public abstract /* synthetic */ i create(JSONObject jSONObject);

    @Override // com.onesignal.common.modeling.c
    public i get(String str) {
        Object next;
        p210v8.i.f(str, "id");
        Iterator<T> it = this.models.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p210v8.i.a(((i) next).getId(), str)) {
                return (i) next;
            }
        }
        next = null;
        return (i) next;
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.onesignal.common.modeling.c
    public Collection<i> list() {
        List listS0;
        synchronized (this.models) {
            listS0 = p086i8.k.s0(this.models);
        }
        return listS0;
    }

    public final void load() {
        p093j5.b bVar;
        if (this.name == null || (bVar = this._prefs) == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray(bVar.getString("OneSignal", "MODEL_STORE_" + this.name, "[]"));
        synchronized (this.models) {
            try {
                boolean zIsEmpty = this.models.isEmpty();
                for (int length = jSONArray.length() - 1; -1 < length; length--) {
                    i iVarCreate = create(jSONArray.getJSONObject(length));
                    if (iVarCreate != null) {
                        List<i> list = this.models;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (p210v8.i.a(((i) it.next()).getId(), iVarCreate.getId())) {
                                        com.onesignal.debug.internal.logging.b.debug$default("ModelStore<" + this.name + ">: load - operation.id: " + iVarCreate.getId() + " already exists in the store.", null, 2, null);
                                        break;
                                    }
                                }
                            }
                        }
                        this.models.add(0, iVarCreate);
                        iVarCreate.subscribe((com.onesignal.common.modeling.a) this);
                        break;
                    }
                }
                this.hasLoadedFromCache = true;
                if (!zIsEmpty) {
                    persist();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.a
    public void onChanged(j jVar, String str) {
        p210v8.i.f(jVar, "args");
        p210v8.i.f(str, "tag");
        persist();
        this.changeSubscription.fire(new c(jVar, str));
    }

    public final void persist() {
        if (this.name == null || this._prefs == null || !this.hasLoadedFromCache) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (this.models) {
            Iterator<i> it = this.models.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSON());
            }
        }
        this._prefs.saveString("OneSignal", "MODEL_STORE_" + this.name, jSONArray.toString());
    }

    @Override // com.onesignal.common.modeling.c
    public void remove(String str, String str2) {
        Object next;
        p210v8.i.f(str, "id");
        p210v8.i.f(str2, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p210v8.i.a(((i) next).getId(), str));
                i iVar = (i) next;
                if (iVar == null) {
                    return;
                }
                removeItem(iVar, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.c
    public void replaceAll(List<i> list, String str) {
        p210v8.i.f(list, "models");
        p210v8.i.f(str, "tag");
        synchronized (list) {
            clear(str);
            Iterator<i> it = list.iterator();
            while (it.hasNext()) {
                add(it.next(), str);
            }
        }
    }

    public k(String str, p093j5.b bVar) {
        this.name = str;
        this._prefs = bVar;
        this.changeSubscription = new com.onesignal.common.events.b();
        this.models = new ArrayList();
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.common.modeling.d dVar) {
        p210v8.i.f(dVar, "handler");
        this.changeSubscription.subscribe(dVar);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.common.modeling.d dVar) {
        p210v8.i.f(dVar, "handler");
        this.changeSubscription.unsubscribe(dVar);
    }

    public /* synthetic */ k(String str, p093j5.b bVar, int i10, p210v8.e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bVar);
    }

    @Override // com.onesignal.common.modeling.c
    public void add(int i10, i iVar, String str) {
        Object next;
        p210v8.i.f(iVar, "model");
        p210v8.i.f(str, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p210v8.i.a(((i) next).getId(), iVar.getId()));
                i iVar2 = (i) next;
                if (iVar2 != null) {
                    removeItem(iVar2, str);
                }
                addItem(iVar, str, Integer.valueOf(i10));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
