package s8;

import java.io.File;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f14726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f14729f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, File file) {
        super(file);
        i.f(file, "rootDir");
        this.f14729f = eVar;
    }

    @Override // s8.f
    public final File a() {
        boolean z6 = this.f14728e;
        File file = this.a;
        e eVar = this.f14729f;
        if (!z6 && this.f14726c == null) {
            eVar.f14736v.getClass();
            File[] fileArrListFiles = file.listFiles();
            this.f14726c = fileArrListFiles;
            if (fileArrListFiles == null) {
                eVar.f14736v.getClass();
                this.f14728e = true;
            }
        }
        File[] fileArr = this.f14726c;
        if (fileArr != null && this.f14727d < fileArr.length) {
            i.c(fileArr);
            int i10 = this.f14727d;
            this.f14727d = i10 + 1;
            return fileArr[i10];
        }
        if (this.f14725b) {
            eVar.f14736v.getClass();
            return null;
        }
        this.f14725b = true;
        return file;
    }
}
