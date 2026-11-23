package s8;

import java.io.File;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f14732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f14734e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, File file) {
        super(file);
        i.f(file, "rootDir");
        this.f14734e = eVar;
    }

    @Override // s8.f
    public final File a() {
        boolean z6 = this.f14731b;
        File file = this.a;
        e eVar = this.f14734e;
        if (!z6) {
            eVar.f14736v.getClass();
            this.f14731b = true;
            return file;
        }
        File[] fileArr = this.f14732c;
        if (fileArr != null && this.f14733d >= fileArr.length) {
            eVar.f14736v.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f14732c = fileArrListFiles;
            if (fileArrListFiles == null) {
                eVar.f14736v.getClass();
            }
            File[] fileArr2 = this.f14732c;
            if (fileArr2 == null || fileArr2.length == 0) {
                eVar.f14736v.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f14732c;
        i.c(fileArr3);
        int i10 = this.f14733d;
        this.f14733d = i10 + 1;
        return fileArr3[i10];
    }
}
