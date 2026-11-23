package p074h5;

import com.onesignal.common.modeling.c;
import com.onesignal.common.modeling.d;
import com.onesignal.common.modeling.j;
import java.io.Closeable;
import p064g5.e;
import p064g5.f;
import p064g5.g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d, p100k5.a, Closeable {
    private final f opRepo;
    private final c store;

    public a(c cVar, f fVar) {
        i.f(cVar, "store");
        i.f(fVar, "opRepo");
        this.store = cVar;
        this.opRepo = fVar;
    }

    @Override // p100k5.a
    public void bootstrap() {
        this.store.subscribe(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.store.unsubscribe(this);
    }

    public abstract g getAddOperation(com.onesignal.common.modeling.i iVar);

    public abstract g getRemoveOperation(com.onesignal.common.modeling.i iVar);

    public abstract g getUpdateOperation(com.onesignal.common.modeling.i iVar, String str, String str2, Object obj, Object obj2);

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(com.onesignal.common.modeling.i iVar, String str) {
        g addOperation;
        i.f(iVar, "model");
        i.f(str, "tag");
        if (str.equals("NORMAL") && (addOperation = getAddOperation(iVar)) != null) {
            e.enqueue$default(this.opRepo, addOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(com.onesignal.common.modeling.i iVar, String str) {
        g removeOperation;
        i.f(iVar, "model");
        i.f(str, "tag");
        if (str.equals("NORMAL") && (removeOperation = getRemoveOperation(iVar)) != null) {
            e.enqueue$default(this.opRepo, removeOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j jVar, String str) {
        i.f(jVar, "args");
        i.f(str, "tag");
        if (str.equals("NORMAL")) {
            com.onesignal.common.modeling.i model = jVar.getModel();
            i.d(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.ModelStoreListener");
            g updateOperation = getUpdateOperation(model, jVar.getPath(), jVar.getProperty(), jVar.getOldValue(), jVar.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
