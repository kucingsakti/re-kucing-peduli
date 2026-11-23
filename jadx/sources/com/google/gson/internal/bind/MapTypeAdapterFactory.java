package com.google.gson.internal.bind;

import N1.t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.i;
import com.google.gson.internal.l;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p204v1.g;

/* JADX INFO: loaded from: classes.dex */
public final class MapTypeAdapterFactory implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f10032s;

    public final class Adapter<K, V> extends u {
        public final u a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f10033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f10034c;

        public Adapter(i iVar, Type type, u uVar, Type type2, u uVar2, l lVar) {
            this.a = new TypeAdapterRuntimeTypeWrapper(iVar, uVar, type);
            this.f10033b = new TypeAdapterRuntimeTypeWrapper(iVar, uVar2, type2);
            this.f10034c = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.u
        public final Object b(A4.a aVar) throws IOException {
            int iX = aVar.X();
            if (iX == 9) {
                aVar.J();
                return null;
            }
            Map map = (Map) this.f10034c.n();
            u uVar = this.f10033b;
            u uVar2 = this.a;
            if (iX == 1) {
                aVar.a();
                while (aVar.n()) {
                    aVar.a();
                    Object objB = ((TypeAdapterRuntimeTypeWrapper) uVar2).f10050b.b(aVar);
                    if (map.put(objB, ((TypeAdapterRuntimeTypeWrapper) uVar).f10050b.b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + objB);
                    }
                    aVar.h();
                }
                aVar.h();
                return map;
            }
            aVar.b();
            while (aVar.n()) {
                g.f15398u.getClass();
                int iG = aVar.f307z;
                if (iG == 0) {
                    iG = aVar.g();
                }
                if (iG == 13) {
                    aVar.f307z = 9;
                } else if (iG == 12) {
                    aVar.f307z = 8;
                } else {
                    if (iG != 14) {
                        throw new IllegalStateException("Expected a name but was " + E0.a.q(aVar.X()) + aVar.p());
                    }
                    aVar.f307z = 10;
                }
                Object objB2 = ((TypeAdapterRuntimeTypeWrapper) uVar2).f10050b.b(aVar);
                if (map.put(objB2, ((TypeAdapterRuntimeTypeWrapper) uVar).f10050b.b(aVar)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + objB2);
                }
            }
            aVar.i();
            return map;
        }

        @Override // com.google.gson.u
        public final void c(A4.b bVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                bVar.n();
                return;
            }
            MapTypeAdapterFactory.this.getClass();
            u uVar = this.f10033b;
            bVar.c();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                bVar.j(String.valueOf(entry.getKey()));
                uVar.c(bVar, entry.getValue());
            }
            bVar.i();
        }
    }

    public MapTypeAdapterFactory(t tVar) {
        this.f10032s = tVar;
    }

    @Override // com.google.gson.v
    public final u a(i iVar, p243z4.a aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.f16313b;
        Class cls = aVar.a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            com.google.gson.internal.d.b(Map.class.isAssignableFrom(cls));
            Type typeI = com.google.gson.internal.d.i(type, cls, com.google.gson.internal.d.f(type, cls, Map.class), new HashMap());
            actualTypeArguments = typeI instanceof ParameterizedType ? ((ParameterizedType) typeI).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new Adapter(iVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? e.f10077c : iVar.c(new p243z4.a(type2)), actualTypeArguments[1], iVar.c(new p243z4.a(actualTypeArguments[1])), this.f10032s.d(aVar));
    }
}
