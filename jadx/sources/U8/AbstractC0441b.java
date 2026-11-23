package U8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: U8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0441b {
    public static final p096j9.c a = new p096j9.c("javax.annotation.meta.TypeQualifierNickname");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p096j9.c f4953b = new p096j9.c("javax.annotation.meta.TypeQualifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p096j9.c f4954c = new p096j9.c("javax.annotation.meta.TypeQualifierDefault");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p096j9.c f4955d = new p096j9.c("kotlin.annotations.jvm.UnderMigration");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f4956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f4957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashMap f4958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f4959h;

    static {
        EnumC0440a enumC0440a = EnumC0440a.VALUE_PARAMETER;
        List listC = p086i8.l.C(EnumC0440a.FIELD, EnumC0440a.METHOD_RETURN_TYPE, enumC0440a, EnumC0440a.TYPE_PARAMETER_BOUNDS, EnumC0440a.TYPE_USE);
        f4956e = listC;
        p096j9.c cVar = y.f5010c;
        p019b9.h hVar = p019b9.h.f7335u;
        List list = listC;
        Map mapW = p086i8.y.w(new p076h8.f(cVar, new n(new p019b9.i(hVar), list, false)), new p076h8.f(y.f5013f, new n(new p019b9.i(hVar), list, false)));
        f4957f = mapW;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p086i8.y.w(new p076h8.f(new p096j9.c("javax.annotation.ParametersAreNullableByDefault"), new n(new p019b9.i(p019b9.h.f7334t), com.bumptech.glide.d.u(enumC0440a))), new p076h8.f(new p096j9.c("javax.annotation.ParametersAreNonnullByDefault"), new n(new p019b9.i(hVar), com.bumptech.glide.d.u(enumC0440a)))));
        linkedHashMap.putAll(mapW);
        f4958g = linkedHashMap;
        f4959h = p086i8.i.K(new p096j9.c[]{y.f5015h, y.f5016i});
    }
}
