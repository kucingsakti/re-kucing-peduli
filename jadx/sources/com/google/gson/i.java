package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final ThreadLocal a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N1.t f10006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f10007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f10008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f10011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f10012i;
    public final List j;

    /* JADX WARN: Illegal instructions before constructor call */
    public i() {
        Excluder excluder = Excluder.f10013u;
        a aVar = h.f10003s;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(excluder, aVar, map, true, false, true, 1, list, list, list, t.f10160s, t.f10161t, list);
    }

    public static void a(double d3) {
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            throw new IllegalArgumentException(d3 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(String str, Type type) {
        p243z4.a aVar = new p243z4.a(type);
        Object objB = null;
        if (str == null) {
            return null;
        }
        A4.a aVar2 = new A4.a(new StringReader(str));
        boolean z6 = this.f10010g;
        boolean z10 = true;
        aVar2.f301t = true;
        try {
            try {
                try {
                    aVar2.X();
                    z10 = false;
                    objB = c(aVar).b(aVar2);
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e10.getMessage(), e10);
                } catch (IllegalStateException e11) {
                    throw new JsonSyntaxException(e11);
                }
            } catch (EOFException e12) {
                if (!z10) {
                    throw new JsonSyntaxException(e12);
                }
            } catch (IOException e13) {
                throw new JsonSyntaxException(e13);
            }
            aVar2.f301t = z6;
            if (objB != null) {
                try {
                    if (aVar2.X() != 10) {
                        throw new JsonSyntaxException("JSON document was not fully consumed.");
                    }
                } catch (MalformedJsonException e14) {
                    throw new JsonSyntaxException(e14);
                } catch (IOException e15) {
                    throw new JsonIOException(e15);
                }
            }
            return objB;
        } catch (Throwable th) {
            aVar2.f301t = z6;
            throw th;
        }
    }

    public final u c(p243z4.a aVar) {
        boolean z6;
        ConcurrentHashMap concurrentHashMap = this.f10005b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z6 = true;
        } else {
            u uVar2 = (u) map.get(aVar);
            if (uVar2 != null) {
                return uVar2;
            }
            z6 = false;
        }
        try {
            Gson$FutureTypeAdapter gson$FutureTypeAdapter = new Gson$FutureTypeAdapter();
            map.put(aVar, gson$FutureTypeAdapter);
            Iterator it = this.f10008e.iterator();
            u uVarA = null;
            while (it.hasNext()) {
                uVarA = ((v) it.next()).a(this, aVar);
                if (uVarA != null) {
                    if (gson$FutureTypeAdapter.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    gson$FutureTypeAdapter.a = uVarA;
                    map.put(aVar, uVarA);
                    break;
                }
            }
            if (z6) {
                threadLocal.remove();
            }
            if (uVarA != null) {
                if (z6) {
                    concurrentHashMap.putAll(map);
                }
                return uVarA;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z6) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final u d(v vVar, p243z4.a aVar) {
        List<v> list = this.f10008e;
        if (!list.contains(vVar)) {
            vVar = this.f10007d;
        }
        boolean z6 = false;
        for (v vVar2 : list) {
            if (z6) {
                u uVarA = vVar2.a(this, aVar);
                if (uVarA != null) {
                    return uVarA;
                }
            } else if (vVar2 == vVar) {
                z6 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final A4.b e(Writer writer) {
        A4.b bVar = new A4.b(writer);
        bVar.f316x = this.f10009f;
        bVar.f315w = this.f10010g;
        bVar.f318z = false;
        return bVar;
    }

    public final String f(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            h(obj, cls, e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        }
    }

    public final void g(A4.b bVar) {
        m mVar = m.f10157s;
        boolean z6 = bVar.f315w;
        bVar.f315w = true;
        boolean z10 = bVar.f316x;
        bVar.f316x = this.f10009f;
        boolean z11 = bVar.f318z;
        bVar.f318z = false;
        try {
            try {
                com.google.gson.internal.bind.e.f10099z.c(bVar, mVar);
                bVar.f315w = z6;
                bVar.f316x = z10;
                bVar.f318z = z11;
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } catch (Throwable th) {
            bVar.f315w = z6;
            bVar.f316x = z10;
            bVar.f318z = z11;
            throw th;
        }
    }

    public final void h(Object obj, Class cls, A4.b bVar) {
        u uVarC = c(new p243z4.a(cls));
        boolean z6 = bVar.f315w;
        bVar.f315w = true;
        boolean z10 = bVar.f316x;
        bVar.f316x = this.f10009f;
        boolean z11 = bVar.f318z;
        bVar.f318z = false;
        try {
            try {
                try {
                    uVarC.c(bVar, obj);
                    bVar.f315w = z6;
                    bVar.f316x = z10;
                    bVar.f318z = z11;
                } catch (IOException e10) {
                    throw new JsonIOException(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } catch (Throwable th) {
            bVar.f315w = z6;
            bVar.f316x = z10;
            bVar.f318z = z11;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f10008e + ",instanceCreators:" + this.f10006c + "}";
    }

    public i(Excluder excluder, h hVar, Map map, boolean z6, boolean z10, boolean z11, int i10, List list, List list2, List list3, t tVar, t tVar2, List list4) {
        final u uVar;
        v vVarD;
        this.a = new ThreadLocal();
        this.f10005b = new ConcurrentHashMap();
        N1.t tVar3 = new N1.t(map, z11, list4);
        this.f10006c = tVar3;
        this.f10009f = z6;
        this.f10010g = z10;
        this.f10011h = list;
        this.f10012i = list2;
        this.j = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.e.f10074A);
        arrayList.add(ObjectTypeAdapter.d(tVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.e.f10089p);
        arrayList.add(com.google.gson.internal.bind.e.f10081g);
        arrayList.add(com.google.gson.internal.bind.e.f10078d);
        arrayList.add(com.google.gson.internal.bind.e.f10079e);
        arrayList.add(com.google.gson.internal.bind.e.f10080f);
        if (i10 == 1) {
            uVar = com.google.gson.internal.bind.e.f10084k;
        } else {
            uVar = new u() { // from class: com.google.gson.Gson$3
                @Override // com.google.gson.u
                public final Object b(A4.a aVar) throws IOException {
                    if (aVar.X() != 9) {
                        return Long.valueOf(aVar.E());
                    }
                    aVar.J();
                    return null;
                }

                @Override // com.google.gson.u
                public final void c(A4.b bVar, Object obj) throws IOException {
                    Number number = (Number) obj;
                    if (number == null) {
                        bVar.n();
                    } else {
                        bVar.E(number.toString());
                    }
                }
            };
        }
        arrayList.add(com.google.gson.internal.bind.e.b(Long.TYPE, Long.class, uVar));
        arrayList.add(com.google.gson.internal.bind.e.b(Double.TYPE, Double.class, new Gson$1()));
        arrayList.add(com.google.gson.internal.bind.e.b(Float.TYPE, Float.class, new Gson$2()));
        if (tVar2 == t.f10161t) {
            vVarD = NumberTypeAdapter.f10036b;
        } else {
            vVarD = NumberTypeAdapter.d(tVar2);
        }
        arrayList.add(vVarD);
        arrayList.add(com.google.gson.internal.bind.e.f10082h);
        arrayList.add(com.google.gson.internal.bind.e.f10083i);
        arrayList.add(com.google.gson.internal.bind.e.a(AtomicLong.class, new TypeAdapter$1(new u() { // from class: com.google.gson.Gson$4
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) {
                return new AtomicLong(((Number) uVar.b(aVar)).longValue());
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) {
                uVar.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
            }
        })));
        arrayList.add(com.google.gson.internal.bind.e.a(AtomicLongArray.class, new TypeAdapter$1(new u() { // from class: com.google.gson.Gson$5
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                aVar.a();
                while (aVar.n()) {
                    arrayList2.add(Long.valueOf(((Number) uVar.b(aVar)).longValue()));
                }
                aVar.h();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i11 = 0; i11 < size; i11++) {
                    atomicLongArray.set(i11, ((Long) arrayList2.get(i11)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.b();
                int length = atomicLongArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    uVar.c(bVar, Long.valueOf(atomicLongArray.get(i11)));
                }
                bVar.h();
            }
        })));
        arrayList.add(com.google.gson.internal.bind.e.j);
        arrayList.add(com.google.gson.internal.bind.e.f10085l);
        arrayList.add(com.google.gson.internal.bind.e.f10090q);
        arrayList.add(com.google.gson.internal.bind.e.f10091r);
        arrayList.add(com.google.gson.internal.bind.e.a(BigDecimal.class, com.google.gson.internal.bind.e.f10086m));
        arrayList.add(com.google.gson.internal.bind.e.a(BigInteger.class, com.google.gson.internal.bind.e.f10087n));
        arrayList.add(com.google.gson.internal.bind.e.a(com.google.gson.internal.g.class, com.google.gson.internal.bind.e.f10088o));
        arrayList.add(com.google.gson.internal.bind.e.f10092s);
        arrayList.add(com.google.gson.internal.bind.e.f10093t);
        arrayList.add(com.google.gson.internal.bind.e.f10095v);
        arrayList.add(com.google.gson.internal.bind.e.f10096w);
        arrayList.add(com.google.gson.internal.bind.e.f10098y);
        arrayList.add(com.google.gson.internal.bind.e.f10094u);
        arrayList.add(com.google.gson.internal.bind.e.f10076b);
        arrayList.add(DateTypeAdapter.f10029b);
        arrayList.add(com.google.gson.internal.bind.e.f10097x);
        if (com.google.gson.internal.sql.b.a) {
            arrayList.add(com.google.gson.internal.sql.b.f10142e);
            arrayList.add(com.google.gson.internal.sql.b.f10141d);
            arrayList.add(com.google.gson.internal.sql.b.f10143f);
        }
        arrayList.add(ArrayTypeAdapter.f10025c);
        arrayList.add(com.google.gson.internal.bind.e.a);
        arrayList.add(new CollectionTypeAdapterFactory(tVar3));
        arrayList.add(new MapTypeAdapterFactory(tVar3));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(tVar3);
        this.f10007d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(com.google.gson.internal.bind.e.f10075B);
        arrayList.add(new ReflectiveTypeAdapterFactory(tVar3, hVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f10008e = Collections.unmodifiableList(arrayList);
    }
}
