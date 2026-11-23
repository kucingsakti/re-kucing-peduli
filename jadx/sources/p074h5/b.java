package p074h5;

import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import java.io.Closeable;
import p064g5.e;
import p064g5.f;
import p100k5.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements g, a, Closeable {
    private final f opRepo;
    private final com.onesignal.common.modeling.f store;

    public b(com.onesignal.common.modeling.f fVar, f fVar2) {
        i.f(fVar, "store");
        i.f(fVar2, "opRepo");
        this.store = fVar;
        this.opRepo = fVar2;
    }

    @Override // p100k5.a
    public void bootstrap() {
        this.store.subscribe(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.store.unsubscribe(this);
    }

    public abstract p064g5.g getReplaceOperation(com.onesignal.common.modeling.i iVar);

    public abstract p064g5.g getUpdateOperation(com.onesignal.common.modeling.i iVar, String str, String str2, Object obj, Object obj2);

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.common.modeling.i iVar, String str) {
        p064g5.g replaceOperation;
        i.f(iVar, "model");
        i.f(str, "tag");
        if (str.equals("NORMAL") && (replaceOperation = getReplaceOperation(iVar)) != null) {
            e.enqueue$default(this.opRepo, replaceOperation, false, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j jVar, String str) {
        i.f(jVar, "args");
        i.f(str, "tag");
        if (str.equals("NORMAL")) {
            com.onesignal.common.modeling.i model = jVar.getModel();
            i.d(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener");
            p064g5.g updateOperation = getUpdateOperation(model, jVar.getPath(), jVar.getProperty(), jVar.getOldValue(), jVar.getNewValue());
            if (updateOperation != null) {
                e.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
