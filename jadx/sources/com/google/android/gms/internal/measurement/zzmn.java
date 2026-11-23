package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'v' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class zzmn {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final zzmn f8707A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final N0 f8708B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final O0 f8709C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final P0 f8710D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Q0 f8711E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final zzmn f8712F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final zzmn f8713G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final zzmn f8714H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final zzmn f8715I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final zzmn f8716J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final zzmn f8717K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ zzmn[] f8718L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final zzmn f8719t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final zzmn f8720u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final zzmn f8721v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final zzmn f8722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final zzmn f8723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final zzmn f8724y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final zzmn f8725z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zzmx f8726s;

    static {
        zzmn zzmnVar = new zzmn("DOUBLE", 0, zzmx.f8732v, 1);
        f8719t = zzmnVar;
        zzmn zzmnVar2 = new zzmn("FLOAT", 1, zzmx.f8731u, 5);
        f8720u = zzmnVar2;
        zzmx zzmxVar = zzmx.f8730t;
        zzmn zzmnVar3 = new zzmn("INT64", 2, zzmxVar, 0);
        f8721v = zzmnVar3;
        zzmn zzmnVar4 = new zzmn("UINT64", 3, zzmxVar, 0);
        f8722w = zzmnVar4;
        zzmx zzmxVar2 = zzmx.f8729s;
        zzmn zzmnVar5 = new zzmn("INT32", 4, zzmxVar2, 0);
        f8723x = zzmnVar5;
        zzmn zzmnVar6 = new zzmn("FIXED64", 5, zzmxVar, 1);
        f8724y = zzmnVar6;
        zzmn zzmnVar7 = new zzmn("FIXED32", 6, zzmxVar2, 5);
        f8725z = zzmnVar7;
        zzmn zzmnVar8 = new zzmn("BOOL", 7, zzmx.f8733w, 0);
        f8707A = zzmnVar8;
        N0 n10 = new N0("STRING", 8, zzmx.f8734x, 2);
        f8708B = n10;
        zzmx zzmxVar3 = zzmx.f8727A;
        O0 o10 = new O0("GROUP", 9, zzmxVar3, 3);
        f8709C = o10;
        P0 p10 = new P0("MESSAGE", 10, zzmxVar3, 2);
        f8710D = p10;
        Q0 q10 = new Q0("BYTES", 11, zzmx.f8735y, 2);
        f8711E = q10;
        zzmn zzmnVar9 = new zzmn("UINT32", 12, zzmxVar2, 0);
        f8712F = zzmnVar9;
        zzmn zzmnVar10 = new zzmn("ENUM", 13, zzmx.f8736z, 0);
        f8713G = zzmnVar10;
        zzmn zzmnVar11 = new zzmn("SFIXED32", 14, zzmxVar2, 5);
        f8714H = zzmnVar11;
        zzmn zzmnVar12 = new zzmn("SFIXED64", 15, zzmxVar, 1);
        f8715I = zzmnVar12;
        zzmn zzmnVar13 = new zzmn("SINT32", 16, zzmxVar2, 0);
        f8716J = zzmnVar13;
        zzmn zzmnVar14 = new zzmn("SINT64", 17, zzmxVar, 0);
        f8717K = zzmnVar14;
        f8718L = new zzmn[]{zzmnVar, zzmnVar2, zzmnVar3, zzmnVar4, zzmnVar5, zzmnVar6, zzmnVar7, zzmnVar8, n10, o10, p10, q10, zzmnVar9, zzmnVar10, zzmnVar11, zzmnVar12, zzmnVar13, zzmnVar14};
    }

    public zzmn(String str, int i10, zzmx zzmxVar, int i11) {
        super(str, i10);
        this.f8726s = zzmxVar;
    }

    public static zzmn[] values() {
        return (zzmn[]) f8718L.clone();
    }
}
