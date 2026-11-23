package com.google.gson.internal.bind;

import N1.t;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.l;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f10041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f10042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Excluder f10043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f10044v;

    public static abstract class Adapter<T, A> extends u {
        public final LinkedHashMap a;

        public Adapter(LinkedHashMap linkedHashMap) {
            this.a = linkedHashMap;
        }

        @Override // com.google.gson.u
        public final Object b(A4.a aVar) throws IOException {
            if (aVar.X() == 9) {
                aVar.J();
                return null;
            }
            Object objD = d();
            try {
                aVar.b();
                while (aVar.n()) {
                    c cVar = (c) this.a.get(aVar.G());
                    if (cVar == null || !cVar.f10067e) {
                        aVar.d0();
                    } else {
                        f(objD, aVar, cVar);
                    }
                }
                aVar.i();
                return e(objD);
            } catch (IllegalAccessException e10) {
                xa.d dVar = p235y4.c.a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.u
        public final void c(A4.b bVar, Object obj) throws IOException {
            if (obj == null) {
                bVar.n();
                return;
            }
            bVar.c();
            try {
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(bVar, obj);
                }
                bVar.i();
            } catch (IllegalAccessException e10) {
                xa.d dVar = p235y4.c.a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            }
        }

        public abstract Object d();

        public abstract Object e(Object obj);

        public abstract void f(Object obj, A4.a aVar, c cVar);
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f10045b;

        public FieldReflectionAdapter(l lVar, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.f10045b = lVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return this.f10045b.n();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, A4.a aVar, c cVar) throws IllegalAccessException {
            Object objB = cVar.f10070h.b(aVar);
            if (objB == null && cVar.f10072k) {
                return;
            }
            Field field = cVar.f10064b;
            if (cVar.f10073l) {
                throw new JsonIOException(E0.a.h("Cannot set value of 'static final' ", p235y4.c.d(field, false)));
            }
            field.set(obj, objB);
        }
    }

    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final HashMap f10046e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Constructor f10047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f10048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap f10049d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            f10046e = map;
        }

        public RecordAdapter(Class cls, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.f10049d = new HashMap();
            xa.d dVar = p235y4.c.a;
            Constructor constructorL = dVar.l(cls);
            this.f10047b = constructorL;
            p235y4.c.e(constructorL);
            String[] strArrP = dVar.p(cls);
            for (int i10 = 0; i10 < strArrP.length; i10++) {
                this.f10049d.put(strArrP[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f10047b.getParameterTypes();
            this.f10048c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f10048c[i11] = f10046e.get(parameterTypes[i11]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return (Object[]) this.f10048c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.f10047b;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                xa.d dVar = p235y4.c.a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + p235y4.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + p235y4.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + p235y4.c.b(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, A4.a aVar, c cVar) {
            Object[] objArr = (Object[]) obj;
            HashMap map = this.f10049d;
            String str = cVar.f10065c;
            Integer num = (Integer) map.get(str);
            if (num == null) {
                throw new IllegalStateException("Could not find the index in the constructor '" + p235y4.c.b(this.f10047b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            }
            int iIntValue = num.intValue();
            Object objB = cVar.f10070h.b(aVar);
            if (objB != null || !cVar.f10072k) {
                objArr[iIntValue] = objB;
            } else {
                StringBuilder sbM = AbstractC0487g.m("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                sbM.append(aVar.l(false));
                throw new JsonParseException(sbM.toString());
            }
        }
    }

    public ReflectiveTypeAdapterFactory(t tVar, h hVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f10041s = tVar;
        this.f10042t = hVar;
        this.f10043u = excluder;
        this.f10044v = list;
    }

    @Override // com.google.gson.v
    public final u a(i iVar, p243z4.a aVar) {
        Class cls = aVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        com.google.gson.internal.d.e(this.f10044v);
        return p235y4.c.a.q(cls) ? new RecordAdapter(cls, b(iVar, aVar, cls, true)) : new FieldReflectionAdapter(this.f10041s.d(aVar), b(iVar, aVar, cls, false));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Code duplicated, block: B:63:0x012d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0132  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    /* JADX WARN: Code duplicated, block: B:73:0x015b  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x015c A[SYNTHETIC] */
    public final LinkedHashMap b(i iVar, p243z4.a aVar, Class cls, boolean z6) {
        Method methodK;
        List list;
        List listSingletonList;
        int size;
        c cVar;
        int i10;
        int i11;
        int i12;
        c cVar2;
        boolean z10;
        p243z4.a aVar2;
        Class cls2;
        boolean z11;
        int modifiers;
        boolean z12;
        c cVar3;
        w4.a aVar3;
        u uVarC;
        boolean z13;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            p243z4.a aVar4 = aVar;
            Class cls3 = cls;
            while (cls3 != Object.class) {
                Field[] declaredFields = cls3.getDeclaredFields();
                if (cls3 != cls && declaredFields.length > 0) {
                    com.google.gson.internal.d.e(this.f10044v);
                }
                int length = declaredFields.length;
                boolean z14 = false;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = length;
                    Field field = declaredFields[i13];
                    boolean zC = this.c(field, true);
                    boolean zC2 = this.c(field, z14);
                    if (zC || zC2) {
                        if (!z6) {
                            methodK = null;
                        } else if (Modifier.isStatic(field.getModifiers())) {
                            zC2 = z14;
                            methodK = null;
                        } else {
                            methodK = p235y4.c.a.k(cls3, field);
                            p235y4.c.e(methodK);
                            if (methodK.getAnnotation(w4.b.class) != null && field.getAnnotation(w4.b.class) == null) {
                                throw new JsonIOException(E0.a.i("@SerializedName on ", p235y4.c.d(methodK, z14), " is not supported"));
                            }
                        }
                        if (methodK == null) {
                            p235y4.c.e(field);
                        }
                        boolean z15 = true;
                        Type typeI = com.google.gson.internal.d.i(aVar4.f16313b, cls3, field.getGenericType(), new HashMap());
                        w4.b bVar = (w4.b) field.getAnnotation(w4.b.class);
                        if (bVar == null) {
                            listSingletonList = Collections.singletonList(this.f10042t.g(field));
                        } else {
                            String strValue = bVar.value();
                            String[] strArrAlternate = bVar.alternate();
                            if (strArrAlternate.length == 0) {
                                listSingletonList = Collections.singletonList(strValue);
                            } else {
                                ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                                arrayList.add(strValue);
                                Collections.addAll(arrayList, strArrAlternate);
                                list = arrayList;
                            }
                            size = list.size();
                            cVar = null;
                            i10 = 0;
                            while (i10 < size) {
                                String str = (String) list.get(i10);
                                if (i10 != 0) {
                                    zC = false;
                                }
                                int i15 = i13;
                                boolean z16 = zC2;
                                aVar2 = new p243z4.a(typeI);
                                Type type = typeI;
                                cls2 = aVar2.a;
                                List list2 = list;
                                if ((cls2 instanceof Class) || !cls2.isPrimitive()) {
                                    z11 = false;
                                } else {
                                    z11 = z15;
                                }
                                modifiers = field.getModifiers();
                                if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                                    z12 = false;
                                } else {
                                    z12 = z15;
                                }
                                cVar3 = cVar;
                                aVar3 = (w4.a) field.getAnnotation(w4.a.class);
                                int i16 = i14;
                                if (aVar3 != null) {
                                    uVarC = JsonAdapterAnnotationTypeAdapterFactory.b(this.f10041s, iVar, aVar2, aVar3);
                                } else {
                                    uVarC = null;
                                }
                                int i17 = i10;
                                if (uVarC != null) {
                                    z13 = z15;
                                } else {
                                    z13 = false;
                                }
                                if (uVarC == null) {
                                    uVarC = iVar.c(aVar2);
                                }
                                int i18 = size;
                                boolean z17 = zC;
                                boolean z18 = z15;
                                cVar = (c) linkedHashMap.put(str, new c(str, field, z17, z16, methodK, z13, uVarC, iVar, aVar2, z11, z12));
                                if (cVar3 == null) {
                                    cVar = cVar3;
                                }
                                i10 = i17 + 1;
                                this = this;
                                iVar = iVar;
                                zC = z17;
                                zC2 = z16;
                                methodK = methodK;
                                z15 = z18;
                                i13 = i15;
                                typeI = type;
                                list = list2;
                                size = i18;
                                i14 = i16;
                            }
                            i11 = i13;
                            i12 = i14;
                            cVar2 = cVar;
                            z10 = false;
                            if (cVar2 == null) {
                                throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + cVar2.a + "'; conflict is caused by fields " + p235y4.c.c(cVar2.f10064b) + " and " + p235y4.c.c(field));
                            }
                        }
                        list = listSingletonList;
                        size = list.size();
                        cVar = null;
                        i10 = 0;
                        while (i10 < size) {
                            String str2 = (String) list.get(i10);
                            if (i10 != 0) {
                                zC = false;
                            }
                            int i19 = i13;
                            boolean z19 = zC2;
                            aVar2 = new p243z4.a(typeI);
                            Type type2 = typeI;
                            cls2 = aVar2.a;
                            List list3 = list;
                            if (cls2 instanceof Class) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            modifiers = field.getModifiers();
                            if (Modifier.isStatic(modifiers)) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            cVar3 = cVar;
                            aVar3 = (w4.a) field.getAnnotation(w4.a.class);
                            int i110 = i14;
                            if (aVar3 != null) {
                                uVarC = JsonAdapterAnnotationTypeAdapterFactory.b(this.f10041s, iVar, aVar2, aVar3);
                            } else {
                                uVarC = null;
                            }
                            int i111 = i10;
                            if (uVarC != null) {
                                z13 = z15;
                            } else {
                                z13 = false;
                            }
                            if (uVarC == null) {
                                uVarC = iVar.c(aVar2);
                            }
                            int i112 = size;
                            boolean z110 = zC;
                            boolean z111 = z15;
                            cVar = (c) linkedHashMap.put(str2, new c(str2, field, z110, z19, methodK, z13, uVarC, iVar, aVar2, z11, z12));
                            if (cVar3 == null) {
                                cVar = cVar3;
                            }
                            i10 = i111 + 1;
                            this = this;
                            iVar = iVar;
                            zC = z110;
                            zC2 = z19;
                            methodK = methodK;
                            z15 = z111;
                            i13 = i19;
                            typeI = type2;
                            list = list3;
                            size = i112;
                            i14 = i110;
                        }
                        i11 = i13;
                        i12 = i14;
                        cVar2 = cVar;
                        z10 = false;
                        if (cVar2 == null) {
                            throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + cVar2.a + "'; conflict is caused by fields " + p235y4.c.c(cVar2.f10064b) + " and " + p235y4.c.c(field));
                        }
                    } else {
                        z10 = z14;
                        i11 = i13;
                        i12 = i14;
                    }
                    i13 = i11 + 1;
                    this = this;
                    iVar = iVar;
                    z14 = z10;
                    declaredFields = declaredFields;
                    length = i12;
                }
                aVar4 = new p243z4.a(com.google.gson.internal.d.i(aVar4.f16313b, cls3, cls3.getGenericSuperclass(), new HashMap()));
                cls3 = aVar4.a;
            }
        }
        return linkedHashMap;
    }

    public final boolean c(Field field, boolean z6) {
        Class<?> type = field.getType();
        Excluder excluder = this.f10043u;
        excluder.getClass();
        if (Excluder.d(type)) {
            return false;
        }
        excluder.c(z6);
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || Excluder.d(field.getType())) {
            return false;
        }
        List list = z6 ? excluder.f10014s : excluder.f10015t;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
        return true;
    }
}
