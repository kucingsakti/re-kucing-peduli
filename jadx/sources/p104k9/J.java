package p104k9;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class J {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final J f12770u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final J f12771v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final G f12772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final H f12773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final J f12774y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ J[] f12775z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final K f12776s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12777t;

    /* JADX INFO: Fake field, exist only in values array */
    J EF10;

    /* JADX INFO: Fake field, exist only in values array */
    J EF11;

    /* JADX INFO: Fake field, exist only in values array */
    J EF12;

    static {
        J j = new J("DOUBLE", 0, K.f12784w, 1);
        J j10 = new J("FLOAT", 1, K.f12783v, 5);
        K k3 = K.f12782u;
        J j11 = new J("INT64", 2, k3, 0);
        J j12 = new J("UINT64", 3, k3, 0);
        K k10 = K.f12781t;
        J j13 = new J("INT32", 4, k10, 0);
        f12770u = j13;
        J j14 = new J("FIXED64", 5, k3, 1);
        J j15 = new J("FIXED32", 6, k10, 5);
        J j16 = new J("BOOL", 7, K.f12785x, 0);
        f12771v = j16;
        F f10 = new F("STRING", 8, K.f12786y, 2);
        K k11 = K.f12779B;
        G g8 = new G("GROUP", 9, k11, 3);
        f12772w = g8;
        H h10 = new H("MESSAGE", 10, k11, 2);
        f12773x = h10;
        I i10 = new I("BYTES", 11, K.f12787z, 2);
        J j17 = new J("UINT32", 12, k10, 0);
        J j18 = new J("ENUM", 13, K.f12778A, 0);
        f12774y = j18;
        f12775z = new J[]{j, j10, j11, j12, j13, j14, j15, j16, f10, g8, h10, i10, j17, j18, new J("SFIXED32", 14, k10, 5), new J("SFIXED64", 15, k3, 1), new J("SINT32", 16, k10, 0), new J("SINT64", 17, k3, 0)};
    }

    public J(String str, int i10, K k3, int i11) {
        super(str, i10);
        this.f12776s = k3;
        this.f12777t = i11;
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f12775z.clone();
    }

    public boolean f() {
        return !(this instanceof F);
    }
}
