package androidx.datastore.preferences.protobuf;

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
public class B0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final x0 f6396u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y0 f6397v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final z0 f6398w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ B0[] f6399x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0 f6400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6401t;

    /* JADX INFO: Fake field, exist only in values array */
    B0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    B0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    B0 EF12;

    static {
        B0 b3 = new B0("DOUBLE", 0, C0.DOUBLE, 1);
        B0 b7 = new B0("FLOAT", 1, C0.FLOAT, 5);
        C0 c0 = C0.LONG;
        B0 b10 = new B0("INT64", 2, c0, 0);
        B0 b11 = new B0("UINT64", 3, c0, 0);
        C0 c10 = C0.INT;
        B0 b12 = new B0("INT32", 4, c10, 0);
        B0 b13 = new B0("FIXED64", 5, c0, 1);
        B0 b14 = new B0("FIXED32", 6, c10, 5);
        B0 b15 = new B0("BOOL", 7, C0.BOOLEAN, 0);
        x0 x0Var = new x0("STRING", 8, C0.STRING, 2);
        f6396u = x0Var;
        C0 c11 = C0.MESSAGE;
        y0 y0Var = new y0("GROUP", 9, c11, 3);
        f6397v = y0Var;
        z0 z0Var = new z0("MESSAGE", 10, c11, 2);
        f6398w = z0Var;
        f6399x = new B0[]{b3, b7, b10, b11, b12, b13, b14, b15, x0Var, y0Var, z0Var, new A0("BYTES", 11, C0.BYTE_STRING, 2), new B0("UINT32", 12, c10, 0), new B0("ENUM", 13, C0.ENUM, 0), new B0("SFIXED32", 14, c10, 5), new B0("SFIXED64", 15, c0, 1), new B0("SINT32", 16, c10, 0), new B0("SINT64", 17, c0, 0)};
    }

    public B0(String str, int i10, C0 c0, int i11) {
        super(str, i10);
        this.f6400s = c0;
        this.f6401t = i11;
    }

    public static B0 valueOf(String str) {
        return (B0) Enum.valueOf(B0.class, str);
    }

    public static B0[] values() {
        return (B0[]) f6399x.clone();
    }
}
