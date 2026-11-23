package N6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f3338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b[] f3339t;

    /* JADX INFO: Fake field, exist only in values array */
    b EF6;

    static {
        b bVar = new b("ANTICLOCKSPINTRANSFORMATION", 0);
        b bVar2 = new b("CLOCK_SPINTRANSFORMATION", 1);
        b bVar3 = new b("CUBEINDEPTHTRANSFORMATION", 2);
        b bVar4 = new b("CUBEINROTATIONTRANSFORMATION", 3);
        b bVar5 = new b("CUBEINSCALINGTRANSFORMATION", 4);
        b bVar6 = new b("CUBEOUTDEPTHTRANSFORMATION", 5);
        b bVar7 = new b("CUBEOUTROTATIONTRANSFORMATION", 6);
        b bVar8 = new b("CUBEOUTSCALINGTRANSFORMATION", 7);
        b bVar9 = new b("DEPTHTRANSFORMATION", 8);
        b bVar10 = new b("FADETRANSFORMATION", 9);
        b bVar11 = new b("FANTRANSFORMATION", 10);
        b bVar12 = new b("FIDGETSPINTRANSFORMATION", 11);
        b bVar13 = new b("GATETRANSFORMATION", 12);
        b bVar14 = new b("HINGETRANSFORMATION", 13);
        b bVar15 = new b("HORIZONTALFLIPTRANSFORMATION", 14);
        b bVar16 = new b("POPTRANSFORMATION", 15);
        b bVar17 = new b("SIMPLETRANSFORMATION", 16);
        f3338s = bVar17;
        f3339t = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, new b("SPINNERTRANSFORMATION", 17), new b("TOSSTRANSFORMATION", 18), new b("VERTICALFLIPTRANSFORMATION", 19), new b("VERTICALSHUTTRANSFORMATION", 20), new b("ZOOMOUTTRANSFORMATION", 21)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3339t.clone();
    }
}
