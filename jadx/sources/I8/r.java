package I8;

/* JADX INFO: loaded from: classes.dex */
public enum r {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(p096j9.b.e("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(p096j9.b.e("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(p096j9.b.e("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(p096j9.b.e("kotlin/ULong", false));


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p096j9.b f2210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p096j9.f f2211t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p096j9.b f2212u;

    r(p096j9.b bVar) {
        this.f2210s = bVar;
        p096j9.f fVarI = bVar.i();
        p210v8.i.e(fVarI, "classId.shortClassName");
        this.f2211t = fVarI;
        this.f2212u = new p096j9.b(bVar.g(), p096j9.f.j(fVarI.g() + "Array"));
    }
}
