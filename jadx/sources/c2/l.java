package c2;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V.h f7453t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(V.h hVar, int i10) {
        super(0);
        this.f7452s = i10;
        this.f7453t = hVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f7452s) {
            case 0:
                List<ApplicationInfo> installedApplications = ((PackageManager) this.f7453t.f5078t).getInstalledApplications(128);
                p210v8.i.e(installedApplications, "packageManager\n         …ageManager.GET_META_DATA)");
                List<ApplicationInfo> list = installedApplications;
                ArrayList arrayList = new ArrayList(p086i8.m.H(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String str = ((ApplicationInfo) it.next()).packageName;
                    p210v8.i.e(str, "it.packageName");
                    arrayList.add(new k(str));
                }
                return arrayList;
            default:
                List<ApplicationInfo> installedApplications2 = ((PackageManager) this.f7453t.f5078t).getInstalledApplications(128);
                p210v8.i.e(installedApplications2, "packageManager\n         …ageManager.GET_META_DATA)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : installedApplications2) {
                    String str2 = ((ApplicationInfo) obj).sourceDir;
                    p210v8.i.e(str2, "it.sourceDir");
                    if (L9.f.J(str2, "/system/", false)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(p086i8.m.H(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str3 = ((ApplicationInfo) it2.next()).packageName;
                    p210v8.i.e(str3, "it.packageName");
                    arrayList3.add(new k(str3));
                }
                return arrayList3;
        }
    }
}
