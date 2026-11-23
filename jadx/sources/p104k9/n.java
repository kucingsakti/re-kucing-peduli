package p104k9;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends AbstractC0672a implements Serializable {
    public static m f(AbstractC0682k abstractC0682k, n nVar, int i10, H h10, Class cls) {
        return new m(abstractC0682k, Collections.EMPTY_LIST, nVar, new l(i10, h10, true), cls);
    }

    public static m g(AbstractC0682k abstractC0682k, Serializable serializable, n nVar, int i10, J j, Class cls) {
        return new m(abstractC0682k, serializable, nVar, new l(i10, j, false), cls);
    }
}
