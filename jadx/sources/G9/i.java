package G9;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final p096j9.f a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L9.e f1765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f1766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p200u8.b f1767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e[] f1768e;

    public i(p096j9.f fVar, L9.e eVar, Collection collection, p200u8.b bVar, e... eVarArr) {
        this.a = fVar;
        this.f1765b = eVar;
        this.f1766c = collection;
        this.f1767d = bVar;
        this.f1768e = eVarArr;
    }

    public /* synthetic */ i(p096j9.f fVar, e[] eVarArr) {
        this(fVar, eVarArr, h.f1757t);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(p096j9.f fVar, e[] eVarArr, p200u8.b bVar) {
        this(fVar, null, null, bVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
    }

    public /* synthetic */ i(Set set, e[] eVarArr) {
        this(set, eVarArr, h.f1759v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Collection collection, e[] eVarArr, p200u8.b bVar) {
        this(null, null, collection, bVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        p210v8.i.f(collection, "nameList");
    }
}
