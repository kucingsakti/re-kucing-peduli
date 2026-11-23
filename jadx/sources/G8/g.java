package G8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Member member, Type type, Class cls, Type[] typeArr, int i10) {
        super(member, type, cls, typeArr);
        this.f1730e = i10;
    }

    @Override // G8.e
    public final Object v(Object[] objArr) {
        switch (this.f1730e) {
            case 0:
                p210v8.i.f(objArr, "args");
                C3.a.b(this, objArr);
                Constructor constructor = (Constructor) this.a;
                Ea.a aVar = new Ea.a(2);
                aVar.b(objArr);
                aVar.a(null);
                ArrayList arrayList = aVar.a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                p210v8.i.f(objArr, "args");
                C3.a.b(this, objArr);
                return ((Constructor) this.a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
