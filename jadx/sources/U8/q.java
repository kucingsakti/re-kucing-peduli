package U8;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final p096j9.c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p096j9.c[] f4981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1.k f4982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f4983d;

    static {
        p096j9.c cVar = new p096j9.c("org.jspecify.nullness");
        p096j9.c cVar2 = new p096j9.c("org.jspecify.annotations");
        a = cVar2;
        p096j9.c cVar3 = new p096j9.c("io.reactivex.rxjava3.annotations");
        p096j9.c cVar4 = new p096j9.c("org.checkerframework.checker.nullness.compatqual");
        String strB = cVar3.b();
        f4981b = new p096j9.c[]{new p096j9.c(strB.concat(".Nullable")), new p096j9.c(strB.concat(".NonNull"))};
        p096j9.c cVar5 = new p096j9.c("org.jetbrains.annotations");
        r rVar = r.f4984d;
        p076h8.f fVar = new p076h8.f(cVar5, rVar);
        p076h8.f fVar2 = new p076h8.f(new p096j9.c("androidx.annotation"), rVar);
        p076h8.f fVar3 = new p076h8.f(new p096j9.c("android.support.annotation"), rVar);
        p076h8.f fVar4 = new p076h8.f(new p096j9.c("android.annotation"), rVar);
        p076h8.f fVar5 = new p076h8.f(new p096j9.c("com.android.annotations"), rVar);
        p076h8.f fVar6 = new p076h8.f(new p096j9.c("org.eclipse.jdt.annotation"), rVar);
        p076h8.f fVar7 = new p076h8.f(new p096j9.c("org.checkerframework.checker.nullness.qual"), rVar);
        p076h8.f fVar8 = new p076h8.f(cVar4, rVar);
        p076h8.f fVar9 = new p076h8.f(new p096j9.c("javax.annotation"), rVar);
        p076h8.f fVar10 = new p076h8.f(new p096j9.c("edu.umd.cs.findbugs.annotations"), rVar);
        p076h8.f fVar11 = new p076h8.f(new p096j9.c("io.reactivex.annotations"), rVar);
        p096j9.c cVar6 = new p096j9.c("androidx.annotation.RecentlyNullable");
        B b3 = B.WARN;
        p076h8.f fVar12 = new p076h8.f(cVar6, new r(b3, 4));
        p076h8.f fVar13 = new p076h8.f(new p096j9.c("androidx.annotation.RecentlyNonNull"), new r(b3, 4));
        p076h8.f fVar14 = new p076h8.f(new p096j9.c("lombok"), rVar);
        p076h8.c cVar7 = new p076h8.c(9, 0);
        B b7 = B.STRICT;
        f4982c = new o1.k(p086i8.y.w(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, new p076h8.f(cVar, new r(b3, cVar7, b7)), new p076h8.f(cVar2, new r(b3, new p076h8.c(9, 0), b7)), new p076h8.f(cVar3, new r(b3, new p076h8.c(8, 0), b7))));
        f4983d = new r(b3, 4);
    }
}
