package com.google.gson.internal.bind;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.i;
import com.google.gson.internal.g;
import com.google.gson.internal.h;
import com.google.gson.internal.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final v f10074A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final v f10075B;
    public static final v a = new TypeAdapters$31(Class.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.google.gson.u
        public final Object b(A4.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.u
        public final void c(A4.b bVar, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
        }
    }.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f10076b = new TypeAdapters$31(BitSet.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$2
        @Override // com.google.gson.u
        public final Object b(A4.a aVar) throws IOException {
            boolean zT;
            BitSet bitSet = new BitSet();
            aVar.a();
            int iX = aVar.X();
            int i10 = 0;
            while (iX != 2) {
                int iD = p239z.e.d(iX);
                if (iD == 5 || iD == 6) {
                    int iB = aVar.B();
                    if (iB == 0) {
                        zT = false;
                    } else {
                        if (iB != 1) {
                            StringBuilder sbL = AbstractC0487g.l("Invalid bitset value ", iB, ", expected 0 or 1; at path ");
                            sbL.append(aVar.l(true));
                            throw new JsonSyntaxException(sbL.toString());
                        }
                        zT = true;
                    }
                } else {
                    if (iD != 7) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + E0.a.q(iX) + "; at path " + aVar.l(false));
                    }
                    zT = aVar.t();
                }
                if (zT) {
                    bitSet.set(i10);
                }
                i10++;
                iX = aVar.X();
            }
            aVar.h();
            return bitSet;
        }

        @Override // com.google.gson.u
        public final void c(A4.b bVar, Object obj) throws IOException {
            BitSet bitSet = (BitSet) obj;
            bVar.b();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                bVar.A(bitSet.get(i10) ? 1L : 0L);
            }
            bVar.h();
        }
    }.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f10077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f10078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f10079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f10080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f10081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v f10082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v f10083i;
    public static final v j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u f10084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v f10085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u f10086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f10087n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f10088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v f10089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final v f10090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v f10091r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v f10092s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v f10093t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v f10094u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v f10095v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final v f10096w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final v f10097x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final v f10098y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u f10099z;

    static {
        u uVar = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                int iX = aVar.X();
                if (iX != 9) {
                    return iX == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.T())) : Boolean.valueOf(aVar.t());
                }
                aVar.J();
                return null;
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    bVar.n();
                    return;
                }
                bVar.H();
                bVar.a();
                bVar.f311s.write(bool.booleanValue() ? "true" : "false");
            }
        };
        f10077c = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() != 9) {
                    return Boolean.valueOf(aVar.T());
                }
                aVar.J();
                return null;
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                Boolean bool = (Boolean) obj;
                bVar.E(bool == null ? "null" : bool.toString());
            }
        };
        f10078d = new TypeAdapters$32(Boolean.TYPE, Boolean.class, uVar);
        f10079e = new TypeAdapters$32(Byte.TYPE, Byte.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                try {
                    int iB = aVar.B();
                    if (iB <= 255 && iB >= -128) {
                        return Byte.valueOf((byte) iB);
                    }
                    StringBuilder sbL = AbstractC0487g.l("Lossy conversion from ", iB, " to byte; at path ");
                    sbL.append(aVar.l(true));
                    throw new JsonSyntaxException(sbL.toString());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.n();
                } else {
                    bVar.A(number.byteValue());
                }
            }
        });
        f10080f = new TypeAdapters$32(Short.TYPE, Short.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                try {
                    int iB = aVar.B();
                    if (iB <= 65535 && iB >= -32768) {
                        return Short.valueOf((short) iB);
                    }
                    StringBuilder sbL = AbstractC0487g.l("Lossy conversion from ", iB, " to short; at path ");
                    sbL.append(aVar.l(true));
                    throw new JsonSyntaxException(sbL.toString());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.n();
                } else {
                    bVar.A(number.shortValue());
                }
            }
        });
        f10081g = new TypeAdapters$32(Integer.TYPE, Integer.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.B());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.n();
                } else {
                    bVar.A(number.intValue());
                }
            }
        });
        f10082h = new TypeAdapters$31(AtomicInteger.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) {
                try {
                    return new AtomicInteger(aVar.B());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                bVar.A(((AtomicInteger) obj).get());
            }
        }.a());
        f10083i = new TypeAdapters$31(AtomicBoolean.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) {
                return new AtomicBoolean(aVar.t());
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                bVar.G(((AtomicBoolean) obj).get());
            }
        }.a());
        j = new TypeAdapters$31(AtomicIntegerArray.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.n()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.B()));
                    } catch (NumberFormatException e10) {
                        throw new JsonSyntaxException(e10);
                    }
                }
                aVar.h();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                bVar.b();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    bVar.A(atomicIntegerArray.get(i10));
                }
                bVar.h();
            }
        }.a());
        f10084k = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.E());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    bVar.n();
                } else {
                    bVar.A(number.longValue());
                }
            }
        };
        new u() { // from class: com.google.gson.internal.bind.TypeAdapters$12
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() != 9) {
                    return Float.valueOf((float) aVar.A());
                }
                aVar.J();
                return null;
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    bVar.n();
                    return;
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(numberValueOf.floatValue());
                }
                bVar.B(numberValueOf);
            }
        };
        new u() { // from class: com.google.gson.internal.bind.TypeAdapters$13
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() != 9) {
                    return Double.valueOf(aVar.A());
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
                    bVar.t(number.doubleValue());
                }
            }
        };
        f10085l = new TypeAdapters$32(Character.TYPE, Character.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                String strT = aVar.T();
                if (strT.length() == 1) {
                    return Character.valueOf(strT.charAt(0));
                }
                StringBuilder sbM = AbstractC0487g.m("Expecting character, got: ", strT, "; at ");
                sbM.append(aVar.l(true));
                throw new JsonSyntaxException(sbM.toString());
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                Character ch = (Character) obj;
                bVar.E(ch == null ? null : String.valueOf(ch));
            }
        });
        u uVar2 = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                int iX = aVar.X();
                if (iX != 9) {
                    return iX == 8 ? Boolean.toString(aVar.t()) : aVar.T();
                }
                aVar.J();
                return null;
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                bVar.E((String) obj);
            }
        };
        f10086m = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                String strT = aVar.T();
                try {
                    return new BigDecimal(strT);
                } catch (NumberFormatException e10) {
                    StringBuilder sbM = AbstractC0487g.m("Failed parsing '", strT, "' as BigDecimal; at path ");
                    sbM.append(aVar.l(true));
                    throw new JsonSyntaxException(sbM.toString(), e10);
                }
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                bVar.B((BigDecimal) obj);
            }
        };
        f10087n = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                String strT = aVar.T();
                try {
                    return new BigInteger(strT);
                } catch (NumberFormatException e10) {
                    StringBuilder sbM = AbstractC0487g.m("Failed parsing '", strT, "' as BigInteger; at path ");
                    sbM.append(aVar.l(true));
                    throw new JsonSyntaxException(sbM.toString(), e10);
                }
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                bVar.B((BigInteger) obj);
            }
        };
        f10088o = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() != 9) {
                    return new g(aVar.T());
                }
                aVar.J();
                return null;
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                bVar.B((g) obj);
            }
        };
        f10089p = new TypeAdapters$31(String.class, uVar2);
        f10090q = new TypeAdapters$31(StringBuilder.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() != 9) {
                    return new StringBuilder(aVar.T());
                }
                aVar.J();
                return null;
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                StringBuilder sb = (StringBuilder) obj;
                bVar.E(sb == null ? null : sb.toString());
            }
        });
        f10091r = new TypeAdapters$31(StringBuffer.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() != 9) {
                    return new StringBuffer(aVar.T());
                }
                aVar.J();
                return null;
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                StringBuffer stringBuffer = (StringBuffer) obj;
                bVar.E(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        f10092s = new TypeAdapters$31(URL.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                String strT = aVar.T();
                if ("null".equals(strT)) {
                    return null;
                }
                return new URL(strT);
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                URL url = (URL) obj;
                bVar.E(url == null ? null : url.toExternalForm());
            }
        });
        f10093t = new TypeAdapters$31(URI.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                try {
                    String strT = aVar.T();
                    if ("null".equals(strT)) {
                        return null;
                    }
                    return new URI(strT);
                } catch (URISyntaxException e10) {
                    throw new JsonIOException(e10);
                }
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                URI uri = (URI) obj;
                bVar.E(uri == null ? null : uri.toASCIIString());
            }
        });
        final u uVar3 = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() != 9) {
                    return InetAddress.getByName(aVar.T());
                }
                aVar.J();
                return null;
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                InetAddress inetAddress = (InetAddress) obj;
                bVar.E(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f10094u = new v() { // from class: com.google.gson.internal.bind.TypeAdapters$34
            @Override // com.google.gson.v
            public final u a(i iVar, p243z4.a aVar) {
                final Class<?> cls2 = aVar.a;
                if (cls.isAssignableFrom(cls2)) {
                    return new u() { // from class: com.google.gson.internal.bind.TypeAdapters$34.1
                        @Override // com.google.gson.u
                        public final Object b(A4.a aVar2) {
                            Object objB = uVar3.b(aVar2);
                            if (objB != null) {
                                Class cls3 = cls2;
                                if (!cls3.isInstance(objB)) {
                                    throw new JsonSyntaxException("Expected a " + cls3.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar2.l(true));
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.u
                        public final void c(A4.b bVar, Object obj) {
                            uVar3.c(bVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + uVar3 + "]";
            }
        };
        f10095v = new TypeAdapters$31(UUID.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                String strT = aVar.T();
                try {
                    return UUID.fromString(strT);
                } catch (IllegalArgumentException e10) {
                    StringBuilder sbM = AbstractC0487g.m("Failed parsing '", strT, "' as UUID; at path ");
                    sbM.append(aVar.l(true));
                    throw new JsonSyntaxException(sbM.toString(), e10);
                }
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                UUID uuid = (UUID) obj;
                bVar.E(uuid == null ? null : uuid.toString());
            }
        });
        f10096w = new TypeAdapters$31(Currency.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                String strT = aVar.T();
                try {
                    return Currency.getInstance(strT);
                } catch (IllegalArgumentException e10) {
                    StringBuilder sbM = AbstractC0487g.m("Failed parsing '", strT, "' as Currency; at path ");
                    sbM.append(aVar.l(true));
                    throw new JsonSyntaxException(sbM.toString(), e10);
                }
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                bVar.E(((Currency) obj).getCurrencyCode());
            }
        }.a());
        final u uVar4 = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                aVar.b();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (aVar.X() != 4) {
                    String strG = aVar.G();
                    int iB = aVar.B();
                    if ("year".equals(strG)) {
                        i10 = iB;
                    } else if ("month".equals(strG)) {
                        i11 = iB;
                    } else if ("dayOfMonth".equals(strG)) {
                        i12 = iB;
                    } else if ("hourOfDay".equals(strG)) {
                        i13 = iB;
                    } else if ("minute".equals(strG)) {
                        i14 = iB;
                    } else if ("second".equals(strG)) {
                        i15 = iB;
                    }
                }
                aVar.i();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    bVar.n();
                    return;
                }
                bVar.c();
                bVar.j("year");
                bVar.A(calendar.get(1));
                bVar.j("month");
                bVar.A(calendar.get(2));
                bVar.j("dayOfMonth");
                bVar.A(calendar.get(5));
                bVar.j("hourOfDay");
                bVar.A(calendar.get(11));
                bVar.j("minute");
                bVar.A(calendar.get(12));
                bVar.j("second");
                bVar.A(calendar.get(13));
                bVar.i();
            }
        };
        f10097x = new v() { // from class: com.google.gson.internal.bind.TypeAdapters$33
            @Override // com.google.gson.v
            public final u a(i iVar, p243z4.a aVar) {
                Class cls2 = aVar.a;
                if (cls2 == Calendar.class || cls2 == GregorianCalendar.class) {
                    return uVar4;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + uVar4 + "]";
            }
        };
        f10098y = new TypeAdapters$31(Locale.class, new u() { // from class: com.google.gson.internal.bind.TypeAdapters$27
            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                if (aVar.X() == 9) {
                    aVar.J();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.T(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.u
            public final void c(A4.b bVar, Object obj) throws IOException {
                Locale locale = (Locale) obj;
                bVar.E(locale == null ? null : locale.toString());
            }
        });
        final u uVar5 = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$28
            public static l d(A4.a aVar, int i10) throws IOException {
                int iD = p239z.e.d(i10);
                if (iD == 5) {
                    return new o(aVar.T());
                }
                if (iD == 6) {
                    return new o(new g(aVar.T()));
                }
                if (iD == 7) {
                    return new o(Boolean.valueOf(aVar.t()));
                }
                if (iD != 8) {
                    throw new IllegalStateException("Unexpected token: ".concat(E0.a.q(i10)));
                }
                aVar.J();
                return m.f10157s;
            }

            public static void e(A4.b bVar, l lVar) throws IOException {
                if (lVar == null || (lVar instanceof m)) {
                    bVar.n();
                    return;
                }
                boolean z6 = lVar instanceof o;
                if (z6) {
                    if (!z6) {
                        throw new IllegalStateException("Not a JSON Primitive: " + lVar);
                    }
                    o oVar = (o) lVar;
                    Serializable serializable = oVar.f10159s;
                    if (serializable instanceof Number) {
                        bVar.B(oVar.d());
                        return;
                    } else if (serializable instanceof Boolean) {
                        bVar.G(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(oVar.e()));
                        return;
                    } else {
                        bVar.E(oVar.e());
                        return;
                    }
                }
                boolean z10 = lVar instanceof k;
                if (z10) {
                    bVar.b();
                    if (!z10) {
                        throw new IllegalStateException("Not a JSON Array: " + lVar);
                    }
                    Iterator it = ((k) lVar).f10156s.iterator();
                    while (it.hasNext()) {
                        e(bVar, (l) it.next());
                    }
                    bVar.h();
                    return;
                }
                boolean z11 = lVar instanceof n;
                if (!z11) {
                    throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
                }
                bVar.c();
                if (!z11) {
                    throw new IllegalStateException("Not a JSON Object: " + lVar);
                }
                Iterator it2 = ((com.google.gson.internal.i) ((n) lVar).f10158s.entrySet()).iterator();
                while (((h) it2).hasNext()) {
                    j jVarB = ((h) it2).b();
                    bVar.j((String) jVarB.getKey());
                    e(bVar, (l) jVarB.getValue());
                }
                bVar.i();
            }

            @Override // com.google.gson.u
            public final Object b(A4.a aVar) throws IOException {
                l kVar;
                l kVar2;
                int iX = aVar.X();
                int iD = p239z.e.d(iX);
                if (iD == 0) {
                    aVar.a();
                    kVar = new k();
                } else if (iD != 2) {
                    kVar = null;
                } else {
                    aVar.b();
                    kVar = new n();
                }
                if (kVar == null) {
                    return d(aVar, iX);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.n()) {
                        String strG = kVar instanceof n ? aVar.G() : null;
                        int iX2 = aVar.X();
                        int iD2 = p239z.e.d(iX2);
                        if (iD2 == 0) {
                            aVar.a();
                            kVar2 = new k();
                        } else if (iD2 != 2) {
                            kVar2 = null;
                        } else {
                            aVar.b();
                            kVar2 = new n();
                        }
                        boolean z6 = kVar2 != null;
                        if (kVar2 == null) {
                            kVar2 = d(aVar, iX2);
                        }
                        if (kVar instanceof k) {
                            ((k) kVar).f10156s.add(kVar2);
                        } else {
                            ((n) kVar).f10158s.put(strG, kVar2);
                        }
                        if (z6) {
                            arrayDeque.addLast(kVar);
                            kVar = kVar2;
                        }
                    } else {
                        if (kVar instanceof k) {
                            aVar.h();
                        } else {
                            aVar.i();
                        }
                        if (arrayDeque.isEmpty()) {
                            return kVar;
                        }
                        kVar = (l) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.u
            public final /* bridge */ /* synthetic */ void c(A4.b bVar, Object obj) throws IOException {
                e(bVar, (l) obj);
            }
        };
        f10099z = uVar5;
        final Class<l> cls2 = l.class;
        f10074A = new v() { // from class: com.google.gson.internal.bind.TypeAdapters$34
            @Override // com.google.gson.v
            public final u a(i iVar, p243z4.a aVar) {
                final Class cls3 = aVar.a;
                if (cls2.isAssignableFrom(cls3)) {
                    return new u() { // from class: com.google.gson.internal.bind.TypeAdapters$34.1
                        @Override // com.google.gson.u
                        public final Object b(A4.a aVar2) {
                            Object objB = uVar5.b(aVar2);
                            if (objB != null) {
                                Class cls4 = cls3;
                                if (!cls4.isInstance(objB)) {
                                    throw new JsonSyntaxException("Expected a " + cls4.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar2.l(true));
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.u
                        public final void c(A4.b bVar, Object obj) {
                            uVar5.c(bVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + uVar5 + "]";
            }
        };
        f10075B = new v() { // from class: com.google.gson.internal.bind.TypeAdapters$29
            @Override // com.google.gson.v
            public final u a(i iVar, p243z4.a aVar) {
                final Class superclass = aVar.a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new u(superclass) { // from class: com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter
                    public final HashMap a = new HashMap();

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final HashMap f10061b = new HashMap();

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final HashMap f10062c = new HashMap();

                    {
                        try {
                            for (Field field : (Field[]) AccessController.doPrivileged(new d(superclass))) {
                                Enum r10 = (Enum) field.get(null);
                                String strName = r10.name();
                                String string = r10.toString();
                                w4.b bVar = (w4.b) field.getAnnotation(w4.b.class);
                                if (bVar != null) {
                                    strName = bVar.value();
                                    for (String str : bVar.alternate()) {
                                        this.a.put(str, r10);
                                    }
                                }
                                this.a.put(strName, r10);
                                this.f10061b.put(string, r10);
                                this.f10062c.put(r10, strName);
                            }
                        } catch (IllegalAccessException e10) {
                            throw new AssertionError(e10);
                        }
                    }

                    @Override // com.google.gson.u
                    public final Object b(A4.a aVar2) throws IOException {
                        if (aVar2.X() == 9) {
                            aVar2.J();
                            return null;
                        }
                        String strT = aVar2.T();
                        Enum r10 = (Enum) this.a.get(strT);
                        return r10 == null ? (Enum) this.f10061b.get(strT) : r10;
                    }

                    @Override // com.google.gson.u
                    public final void c(A4.b bVar, Object obj) throws IOException {
                        Enum r10 = (Enum) obj;
                        bVar.E(r10 == null ? null : (String) this.f10062c.get(r10));
                    }
                };
            }
        };
    }

    public static v a(Class cls, u uVar) {
        return new TypeAdapters$31(cls, uVar);
    }

    public static v b(Class cls, Class cls2, u uVar) {
        return new TypeAdapters$32(cls, cls2, uVar);
    }
}
