package G8;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class t implements e {
    public final Member a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f1740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f1741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1742d;

    public t(Member member, Type type, Class cls, Type[] typeArr) {
        List listH;
        this.a = member;
        this.f1740b = type;
        this.f1741c = cls;
        if (cls != null) {
            Ea.a aVar = new Ea.a(2);
            aVar.a(cls);
            aVar.b(typeArr);
            ArrayList arrayList = aVar.a;
            listH = p086i8.l.C(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listH = p086i8.i.H(typeArr);
        }
        this.f1742d = listH;
    }

    public void a(Object[] objArr) {
        C3.a.b(this, objArr);
    }

    public final void b(Object obj) {
        if (obj == null || !this.a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // G8.e
    public final Type w() {
        return this.f1740b;
    }

    @Override // G8.e
    public final List x() {
        return this.f1742d;
    }

    @Override // G8.e
    public final Member y() {
        return this.a;
    }
}
