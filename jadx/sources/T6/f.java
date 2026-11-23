package T6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final f f4678A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final f f4679B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ f[] f4680C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f4681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f4682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f4683u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f4684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f4685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final f f4686x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f f4687y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final f f4688z;

    static {
        f fVar = new f("NONE", 0);
        f4681s = fVar;
        f fVar2 = new f("COLOR", 1);
        f4682t = fVar2;
        f fVar3 = new f("SCALE", 2);
        f4683u = fVar3;
        f fVar4 = new f("WORM", 3);
        f4684v = fVar4;
        f fVar5 = new f("SLIDE", 4);
        f4685w = fVar5;
        f fVar6 = new f("FILL", 5);
        f4686x = fVar6;
        f fVar7 = new f("THIN_WORM", 6);
        f4687y = fVar7;
        f fVar8 = new f("DROP", 7);
        f4688z = fVar8;
        f fVar9 = new f("SWAP", 8);
        f4678A = fVar9;
        f fVar10 = new f("SCALE_DOWN", 9);
        f4679B = fVar10;
        f4680C = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f4680C.clone();
    }
}
