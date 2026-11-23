package R8;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e implements p009a9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f4466b;

    public g(p096j9.f fVar, Object[] objArr) {
        super(fVar);
        this.f4466b = objArr;
    }

    public final ArrayList a() {
        p009a9.a oVar;
        Object[] objArr = this.f4466b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            p210v8.i.c(obj);
            Class<?> cls = obj.getClass();
            List list = AbstractC0408c.a;
            if (Enum.class.isAssignableFrom(cls)) {
                oVar = new s(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                oVar = new f(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                oVar = new g(null, (Object[]) obj);
            } else {
                oVar = obj instanceof Class ? new o(null, (Class) obj) : new u(null, obj);
            }
            arrayList.add(oVar);
        }
        return arrayList;
    }
}
