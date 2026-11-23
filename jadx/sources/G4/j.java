package G4;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends N6.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f1698e;

    @Override // Z0.a
    public final int c() {
        List list = this.f1698e;
        if (list != null) {
            return list.size();
        }
        p210v8.i.n(JsonStorageKeyNames.DATA_KEY);
        throw null;
    }
}
