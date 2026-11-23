package p220w9;

import i9.f;
import p096j9.b;
import p210v8.i;
import p231y.a;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f15662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f15663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f15664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f15666f;

    public l(Object obj, f fVar, f fVar2, f fVar3, String str, b bVar) {
        i.f(str, "filePath");
        this.a = obj;
        this.f15662b = fVar;
        this.f15663c = fVar2;
        this.f15664d = fVar3;
        this.f15665e = str;
        this.f15666f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.a) && i.a(this.f15662b, lVar.f15662b) && i.a(this.f15663c, lVar.f15663c) && this.f15664d.equals(lVar.f15664d) && i.a(this.f15665e, lVar.f15665e) && this.f15666f.equals(lVar.f15666f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        f fVar = this.f15662b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f fVar2 = this.f15663c;
        return this.f15666f.hashCode() + a.a((this.f15664d.hashCode() + ((iHashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31)) * 31, this.f15665e, 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", compilerVersion=" + this.f15662b + ", languageVersion=" + this.f15663c + ", expectedVersion=" + this.f15664d + ", filePath=" + this.f15665e + ", classId=" + this.f15666f + ')';
    }
}
