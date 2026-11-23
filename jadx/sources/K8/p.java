package K8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p086i8.C;
import p086i8.q;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final LinkedHashSet a = C.v(p029c9.e.g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f2669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f2670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f2671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f2672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LinkedHashSet f2673f;

    static {
        List<p176r9.c> listC = p086i8.l.C(p176r9.c.BOOLEAN, p176r9.c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (p176r9.c cVar : listC) {
            String strG = cVar.j().f().g();
            p210v8.i.e(strG, "it.wrapperFqName.shortName().asString()");
            q.J(linkedHashSet, p029c9.e.f(strG, cVar.f14576t + "Value()" + cVar.h()));
        }
        f2669b = C.u(C.u(C.u(C.u(C.u(C.u(linkedHashSet, p029c9.e.g("List", "sort(Ljava/util/Comparator;)V")), p029c9.e.f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), p029c9.e.f("Double", "isInfinite()Z", "isNaN()Z")), p029c9.e.f("Float", "isInfinite()Z", "isNaN()Z")), p029c9.e.f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), p029c9.e.f("CharSequence", "isEmpty()Z"));
        f2670c = C.u(C.u(C.u(C.u(C.u(C.u(p029c9.e.f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), p029c9.e.g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), p029c9.e.f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), p029c9.e.f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), p029c9.e.g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), p029c9.e.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), p029c9.e.g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f2671d = C.u(C.u(p029c9.e.g("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), p029c9.e.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), p029c9.e.g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        p176r9.c cVar2 = p176r9.c.BYTE;
        List listC2 = p086i8.l.C(p176r9.c.BOOLEAN, cVar2, p176r9.c.DOUBLE, p176r9.c.FLOAT, cVar2, p176r9.c.INT, p176r9.c.LONG, p176r9.c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listC2.iterator();
        while (it.hasNext()) {
            String strG2 = ((p176r9.c) it.next()).j().f().g();
            p210v8.i.e(strG2, "it.wrapperFqName.shortName().asString()");
            String[] strArrB = p029c9.e.b("Ljava/lang/String;");
            q.J(linkedHashSet2, p029c9.e.f(strG2, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        String[] strArrB2 = p029c9.e.b("D");
        LinkedHashSet linkedHashSetU = C.u(linkedHashSet2, p029c9.e.f("Float", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = p029c9.e.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f2672e = C.u(linkedHashSetU, p029c9.e.f("String", (String[]) Arrays.copyOf(strArrB3, strArrB3.length)));
        String[] strArrB4 = p029c9.e.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f2673f = p029c9.e.f("Throwable", (String[]) Arrays.copyOf(strArrB4, strArrB4.length));
    }
}
