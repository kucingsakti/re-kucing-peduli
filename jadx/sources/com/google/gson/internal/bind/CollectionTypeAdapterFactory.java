package com.google.gson.internal.bind;

import N1.t;
import com.google.gson.i;
import com.google.gson.internal.l;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f10027s;

    public static final class Adapter<E> extends u {
        public final u a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f10028b;

        public Adapter(i iVar, Type type, u uVar, l lVar) {
            this.a = new TypeAdapterRuntimeTypeWrapper(iVar, uVar, type);
            this.f10028b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.u
        public final Object b(A4.a aVar) throws IOException {
            if (aVar.X() == 9) {
                aVar.J();
                return null;
            }
            Collection collection = (Collection) this.f10028b.n();
            aVar.a();
            while (aVar.n()) {
                collection.add(((TypeAdapterRuntimeTypeWrapper) this.a).f10050b.b(aVar));
            }
            aVar.h();
            return collection;
        }

        @Override // com.google.gson.u
        public final void c(A4.b bVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                bVar.n();
                return;
            }
            bVar.b();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.a.c(bVar, it.next());
            }
            bVar.h();
        }
    }

    public CollectionTypeAdapterFactory(t tVar) {
        this.f10027s = tVar;
    }

    @Override // com.google.gson.v
    public final u a(i iVar, p243z4.a aVar) {
        Type type = aVar.f16313b;
        Class cls = aVar.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.google.gson.internal.d.b(Collection.class.isAssignableFrom(cls));
        Type typeI = com.google.gson.internal.d.i(type, cls, com.google.gson.internal.d.f(type, cls, Collection.class), new HashMap());
        Type type2 = typeI instanceof ParameterizedType ? ((ParameterizedType) typeI).getActualTypeArguments()[0] : Object.class;
        return new Adapter(iVar, type2, iVar.c(new p243z4.a(type2)), this.f10027s.d(aVar));
    }
}
