package R8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q extends v implements p009a9.e {
    public final Constructor a;

    public q(Constructor constructor) {
        p210v8.i.f(constructor, "member");
        this.a = constructor;
    }

    @Override // R8.v
    public final Member b() {
        return this.a;
    }

    @Override // p009a9.e
    public final ArrayList z() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        p210v8.i.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new B(typeVariable));
        }
        return arrayList;
    }
}
