package M8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p086i8.y;

/* JADX INFO: loaded from: classes.dex */
public enum n {
    CLASS(0),
    ANNOTATION_CLASS(1),
    TYPE_PARAMETER(2),
    PROPERTY(3),
    FIELD(4),
    LOCAL_VARIABLE(5),
    VALUE_PARAMETER(6),
    CONSTRUCTOR(7),
    FUNCTION(8),
    PROPERTY_GETTER(9),
    PROPERTY_SETTER(10),
    TYPE(11),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(12),
    FILE(13),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(14),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(15),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(16),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(17),
    CLASS_ONLY(18),
    OBJECT(19),
    STANDALONE_OBJECT(20),
    COMPANION_OBJECT(21),
    INTERFACE(22),
    ENUM_CLASS(23),
    ENUM_ENTRY(24),
    LOCAL_CLASS(25),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(26),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(27),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(28),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(29),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(30),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(31),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(32),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(33),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(34),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(35),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(36),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(37),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(38),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(39),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(40),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(41),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(42);


    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final List f3212A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final List f3213B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final List f3214C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final List f3215D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final List f3216E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final List f3217F;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final HashMap f3239t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final List f3240u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final List f3241v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final List f3242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f3243x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List f3244y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final List f3245z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f3246s;

    static {
        for (n nVar : values()) {
            f3239t.put(nVar.name(), nVar);
        }
        n[] nVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (n nVar2 : nVarArrValues) {
            if (nVar2.f3246s) {
                arrayList.add(nVar2);
            }
        }
        p086i8.k.w0(arrayList);
        p086i8.i.K(values());
        n nVar3 = CLASS;
        f3240u = p086i8.l.C(ANNOTATION_CLASS, nVar3);
        f3241v = p086i8.l.C(LOCAL_CLASS, nVar3);
        f3242w = p086i8.l.C(CLASS_ONLY, nVar3);
        n nVar4 = OBJECT;
        f3243x = p086i8.l.C(COMPANION_OBJECT, nVar4, nVar3);
        f3244y = p086i8.l.C(STANDALONE_OBJECT, nVar4, nVar3);
        f3245z = p086i8.l.C(INTERFACE, nVar3);
        f3212A = p086i8.l.C(ENUM_CLASS, nVar3);
        n nVar5 = PROPERTY;
        n nVar6 = FIELD;
        f3213B = p086i8.l.C(ENUM_ENTRY, nVar5, nVar6);
        n nVar7 = PROPERTY_SETTER;
        f3214C = com.bumptech.glide.d.u(nVar7);
        n nVar8 = PROPERTY_GETTER;
        f3215D = com.bumptech.glide.d.u(nVar8);
        f3216E = com.bumptech.glide.d.u(FUNCTION);
        n nVar9 = FILE;
        f3217F = com.bumptech.glide.d.u(nVar9);
        d dVar = d.CONSTRUCTOR_PARAMETER;
        n nVar10 = VALUE_PARAMETER;
        y.w(new p076h8.f(dVar, nVar10), new p076h8.f(d.FIELD, nVar6), new p076h8.f(d.PROPERTY, nVar5), new p076h8.f(d.FILE, nVar9), new p076h8.f(d.PROPERTY_GETTER, nVar8), new p076h8.f(d.PROPERTY_SETTER, nVar7), new p076h8.f(d.RECEIVER, nVar10), new p076h8.f(d.SETTER_PARAMETER, nVar10), new p076h8.f(d.PROPERTY_DELEGATE_FIELD, nVar6));
    }

    n(int i10) {
        this.f3246s = z;
    }
}
