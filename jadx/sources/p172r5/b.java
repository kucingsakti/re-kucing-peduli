package p172r5;

import Y1.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import p186t.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    public static final class a extends d {
        private final Context context;
        private final boolean openActivity;
        private final String url;

        public a(String str, boolean z6, Context context) {
            i.f(str, "url");
            i.f(context, "context");
            this.url = str;
            this.openActivity = z6;
            this.context = context;
        }

        @Override // p186t.d
        public void onCustomTabsServiceConnected(ComponentName componentName, p186t.b bVar) {
            c cVar;
            i.f(componentName, "componentName");
            i.f(bVar, "customTabsClient");
            p011b.c cVar2 = bVar.a;
            try {
                ((p011b.a) cVar2).i0();
            } catch (RemoteException unused) {
            }
            p186t.a aVar = new p186t.a();
            aVar.attachInterface(aVar, "android.support.customtabs.ICustomTabsCallback");
            new Handler(Looper.getMainLooper());
            try {
                cVar = !((p011b.a) cVar2).h0(aVar) ? null : new c(cVar2, aVar, bVar.f14964b, 25);
            } catch (RemoteException unused2) {
            }
            if (cVar == null) {
                return;
            }
            p186t.a aVar2 = (p186t.a) cVar.f5671u;
            Uri uri = Uri.parse(this.url);
            try {
                ((p011b.a) ((p011b.c) cVar.f5670t)).g0(aVar2, uri, new Bundle());
            } catch (RemoteException unused3) {
            }
            if (this.openActivity) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(((ComponentName) cVar.f5672v).getPackageName());
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", aVar2);
                intent.putExtras(bundle);
                if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
                    intent.putExtras(bundle2);
                }
                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent.putExtras(new Bundle());
                intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                intent.setData(uri);
                intent.addFlags(268435456);
                this.context.startActivity(intent, null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            i.f(componentName, MediationMetaData.KEY_NAME);
        }
    }

    private b() {
    }

    private final boolean hasChromeTabLibrary() {
        return true;
    }

    public final boolean open$com_onesignal_inAppMessages(String str, boolean z6, Context context) {
        i.f(str, "url");
        i.f(context, "context");
        if (!hasChromeTabLibrary()) {
            return false;
        }
        a aVar = new a(str, z6, context);
        aVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty("com.android.chrome")) {
            intent.setPackage("com.android.chrome");
        }
        return context.bindService(intent, aVar, 33);
    }
}
