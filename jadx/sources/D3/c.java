package D3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p073h4.b {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1045c;

    public /* synthetic */ c(Context context, String str) {
        this.a = 2;
        this.f1045c = context;
        this.f1044b = str;
    }

    @Override // p073h4.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.a) {
            case 0:
                g gVar = (g) this.f1044b;
                String strD = gVar.d();
                Context contextA = (Context) this.f1045c;
                p119m4.a aVar = new p119m4.a();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    contextA = i10 >= 24 ? J.c.a(contextA) : null;
                }
                SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + strD, 0);
                boolean z6 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z6 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextA.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z6 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.a = z6;
                return aVar;
            case 1:
                I3.g gVar2 = (I3.g) this.f1044b;
                gVar2.getClass();
                I3.b bVar = (I3.b) this.f1045c;
                return bVar.f2022f.h(new Fa.e(bVar, gVar2));
            default:
                return new p053f4.h((Context) this.f1045c, (String) this.f1044b);
        }
    }

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.a = i10;
        this.f1044b = obj;
        this.f1045c = obj2;
    }
}
