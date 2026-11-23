package G8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f extends t implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1729f;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Constructor constructor, Object obj, int i10) {
        this.f1728e = i10;
        switch (i10) {
            case 1:
                p210v8.i.f(constructor, "constructor");
                Class declaringClass = constructor.getDeclaringClass();
                p210v8.i.e(declaringClass, "constructor.declaringClass");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                p210v8.i.e(genericParameterTypes, "constructor.genericParameterTypes");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f1729f = obj;
                break;
            default:
                p210v8.i.f(constructor, "constructor");
                Class declaringClass2 = constructor.getDeclaringClass();
                p210v8.i.e(declaringClass2, "constructor.declaringClass");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                p210v8.i.e(genericParameterTypes2, "constructor.genericParameterTypes");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : p086i8.i.s(1, genericParameterTypes2.length - 1, genericParameterTypes2)));
                this.f1729f = obj;
                break;
        }
    }

    @Override // G8.e
    public final Object v(Object[] objArr) {
        switch (this.f1728e) {
            case 0:
                p210v8.i.f(objArr, "args");
                C3.a.b(this, objArr);
                Constructor constructor = (Constructor) this.a;
                Ea.a aVar = new Ea.a(3);
                aVar.a(this.f1729f);
                aVar.b(objArr);
                aVar.a(null);
                ArrayList arrayList = aVar.a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                p210v8.i.f(objArr, "args");
                C3.a.b(this, objArr);
                Constructor constructor2 = (Constructor) this.a;
                Ea.a aVar2 = new Ea.a(2);
                aVar2.a(this.f1729f);
                aVar2.b(objArr);
                ArrayList arrayList2 = aVar2.a;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
