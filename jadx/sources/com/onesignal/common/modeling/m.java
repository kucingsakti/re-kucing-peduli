package com.onesignal.common.modeling;

/* JADX INFO: loaded from: classes.dex */
public class m implements f, d {
    private final com.onesignal.common.events.b changeSubscription;
    private final Object replaceLock;
    private final String singletonId;
    private final k store;

    public static final class a extends p210v8.k implements p200u8.b {
        final /* synthetic */ j $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(1);
            this.$args = jVar;
            this.$tag = str;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return p076h8.m.a;
        }

        public final void invoke(g gVar) {
            p210v8.i.f(gVar, "it");
            gVar.onModelUpdated(this.$args, this.$tag);
        }
    }

    public static final class b extends p210v8.k implements p200u8.b {
        final /* synthetic */ i $existingModel;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, String str) {
            super(1);
            this.$existingModel = iVar;
            this.$tag = str;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return p076h8.m.a;
        }

        public final void invoke(g gVar) {
            p210v8.i.f(gVar, "it");
            gVar.onModelReplaced(this.$existingModel, this.$tag);
        }
    }

    public m(k kVar) {
        p210v8.i.f(kVar, "store");
        this.store = kVar;
        this.changeSubscription = new com.onesignal.common.events.b();
        this.singletonId = "-singleton-";
        this.replaceLock = new Object();
        kVar.subscribe((d) this);
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    @Override // com.onesignal.common.modeling.f
    public i getModel() {
        synchronized (this) {
            i iVar = this.store.get(this.singletonId);
            if (iVar != null) {
                return iVar;
            }
            i iVarCreate$default = com.onesignal.common.modeling.b.create$default(this.store, null, 1, null);
            if (iVarCreate$default != null) {
                iVarCreate$default.setId(this.singletonId);
                com.onesignal.common.modeling.b.add$default(this.store, iVarCreate$default, null, 2, null);
                return iVarCreate$default;
            }
            throw new Exception("Unable to initialize model from store " + this.store);
        }
    }

    public final k getStore() {
        return this.store;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(i iVar, String str) {
        p210v8.i.f(iVar, "model");
        p210v8.i.f(str, "tag");
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(i iVar, String str) {
        p210v8.i.f(iVar, "model");
        p210v8.i.f(str, "tag");
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j jVar, String str) {
        p210v8.i.f(jVar, "args");
        p210v8.i.f(str, "tag");
        this.changeSubscription.fire(new a(jVar, str));
    }

    @Override // com.onesignal.common.modeling.f
    public void replace(i iVar, String str) {
        p210v8.i.f(iVar, "model");
        p210v8.i.f(str, "tag");
        synchronized (this.replaceLock) {
            i model = getModel();
            model.initializeFromModel(this.singletonId, iVar);
            this.store.persist();
            this.changeSubscription.fire(new b(model, str));
        }
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public void subscribe(g gVar) {
        p210v8.i.f(gVar, "handler");
        this.changeSubscription.subscribe(gVar);
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public void unsubscribe(g gVar) {
        p210v8.i.f(gVar, "handler");
        this.changeSubscription.unsubscribe(gVar);
    }
}
