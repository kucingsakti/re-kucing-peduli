package p019b9;

import A0.i;
import java.util.LinkedHashMap;
import o1.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final e a = new e(h.f7334t, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f7341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f7342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f7343d;

    static {
        h hVar = h.f7335u;
        f7341b = new e(hVar, false);
        f7342c = new e(hVar, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        o oVar = new o(0);
        new r(oVar, "java/util/".concat("Iterator")).l("forEachRemaining", new i(strConcat4, 2));
        new r(oVar, "java/lang/".concat("Iterable")).l("spliterator", new m(1, 4));
        r rVar = new r(oVar, "java/util/".concat("Collection"));
        rVar.l("removeIf", new i(strConcat2, 8));
        rVar.l("stream", new i(strConcat8, 9));
        rVar.l("parallelStream", new i(strConcat8, 10));
        new r(oVar, "java/util/".concat("List")).l("replaceAll", new i(strConcat7, 11));
        r rVar2 = new r(oVar, "java/util/".concat("Map"));
        rVar2.l("forEach", new i(strConcat6, 12));
        rVar2.l("putIfAbsent", new i(strConcat, 13));
        rVar2.l("replace", new i(strConcat, 14));
        rVar2.l("replace", new i(strConcat, 15));
        rVar2.l("replaceAll", new i(strConcat5, 16));
        rVar2.l("compute", new j(strConcat, 0, strConcat5));
        rVar2.l("computeIfAbsent", new j(strConcat, 1, strConcat3));
        rVar2.l("computeIfPresent", new j(strConcat, 2, strConcat5));
        rVar2.l("merge", new j(strConcat, 3, strConcat5));
        r rVar3 = new r(oVar, strConcat9);
        rVar3.l("empty", new i(strConcat9, 17));
        rVar3.l("of", new j(strConcat, 4, strConcat9));
        rVar3.l("ofNullable", new j(strConcat, 5, strConcat9));
        rVar3.l("get", new i(strConcat, 18));
        rVar3.l("ifPresent", new i(strConcat4, 19));
        new r(oVar, "java/lang/".concat("ref/Reference")).l("get", new i(strConcat, 20));
        new r(oVar, strConcat2).l("test", new i(strConcat, 21));
        new r(oVar, "java/util/function/".concat("BiPredicate")).l("test", new i(strConcat, 22));
        new r(oVar, strConcat4).l("accept", new i(strConcat, 3));
        new r(oVar, strConcat6).l("accept", new i(strConcat, 4));
        new r(oVar, strConcat3).l("apply", new i(strConcat, 5));
        new r(oVar, strConcat5).l("apply", new i(strConcat, 6));
        new r(oVar, "java/util/function/".concat("Supplier")).l("get", new i(strConcat, 7));
        f7343d = oVar.a;
    }
}
