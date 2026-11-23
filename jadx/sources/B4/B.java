package B4;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p078i.C0650g;
import p078i.C0652i;
import p078i.DialogInterfaceC0653j;

/* JADX INFO: loaded from: classes.dex */
public class B extends AbstractC0153a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DialogInterfaceC0653j f606d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Activity f610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public P f611i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JsPromptResult f607e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public JsResult f608f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DialogInterfaceC0653j f609g = null;
    public DialogInterfaceC0653j j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Resources f612k = null;

    public static void n(JsResult jsResult) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    @Override // B4.AbstractC0153a
    public void a(P p10, Activity activity) {
        this.f610h = activity;
        this.f611i = p10;
        this.f612k = activity.getResources();
    }

    @Override // B4.AbstractC0153a
    public void c(String str, r rVar) {
        Activity activity = this.f610h;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        A1.l lVar = new A1.l(activity);
        String string = this.f612k.getString(R.string.agentweb_tips);
        C0650g c0650g = (C0650g) lVar.f123t;
        c0650g.f12042d = string;
        c0650g.f12044f = this.f612k.getString(R.string.agentweb_honeycomblow);
        String string2 = this.f612k.getString(R.string.agentweb_download);
        A a = new A(rVar, 0);
        c0650g.f12047i = string2;
        c0650g.j = a;
        lVar.f(this.f612k.getString(R.string.agentweb_cancel), new z());
        lVar.c().show();
    }

    @Override // B4.AbstractC0153a
    public void d(WebView webView, String str, String str2) {
        Context applicationContext = webView.getContext().getApplicationContext();
        Toast toast = AbstractC0158f.f673c;
        if (toast == null) {
            AbstractC0158f.f673c = Toast.makeText(applicationContext.getApplicationContext(), str2, 0);
        } else {
            toast.setText(str2);
        }
        AbstractC0158f.f673c.show();
    }

    @Override // B4.AbstractC0153a
    public void e(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = 1;
        this.f610h.hashCode();
        String str3 = AbstractC0162j.a;
        Activity activity = this.f610h;
        if (activity == null || activity.isFinishing()) {
            n(jsResult);
            return;
        }
        if (activity.isDestroyed()) {
            n(jsResult);
            return;
        }
        if (this.f606d == null) {
            A1.l lVar = new A1.l(activity);
            C0650g c0650g = (C0650g) lVar.f123t;
            c0650g.f12044f = str2;
            lVar.e(android.R.string.cancel, new w(this, 2));
            w wVar = new w(this, i10);
            c0650g.f12045g = c0650g.a.getText(android.R.string.ok);
            c0650g.f12046h = wVar;
            c0650g.f12050m = new u(this, 1);
            this.f606d = lVar.c();
        }
        C0652i c0652i = this.f606d.f12094x;
        c0652i.f12073e = str2;
        TextView textView = c0652i.f12090w;
        if (textView != null) {
            textView.setText(str2);
        }
        this.f608f = jsResult;
        this.f606d.show();
    }

    @Override // B4.AbstractC0153a
    public void f(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Activity activity = this.f610h;
        if (activity == null || activity.isFinishing()) {
            jsPromptResult.cancel();
            return;
        }
        if (activity.isDestroyed()) {
            jsPromptResult.cancel();
            return;
        }
        if (this.f609g == null) {
            EditText editText = new EditText(activity);
            editText.setText(str3);
            A1.l lVar = new A1.l(activity);
            C0650g c0650g = (C0650g) lVar.f123t;
            c0650g.f12056s = editText;
            c0650g.f12055r = 0;
            c0650g.f12042d = str2;
            lVar.e(android.R.string.cancel, new w(this, 0));
            v vVar = new v(this, editText);
            c0650g.f12045g = c0650g.a.getText(android.R.string.ok);
            c0650g.f12046h = vVar;
            c0650g.f12050m = new u(this, 0);
            this.f609g = lVar.c();
        }
        this.f607e = jsPromptResult;
        this.f609g.show();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // B4.AbstractC0153a
    public final void g(WebView webView, int i10, String str, String str2) {
        View viewFindViewById;
        View viewFindViewById2;
        Objects.toString(this.f611i);
        String str3 = AbstractC0162j.a;
        P p10 = this.f611i;
        if (p10 != null) {
            FrameLayout frameLayout = p10.f657x;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            } else {
                FrameLayout frameLayout2 = new FrameLayout(p10.getContext());
                frameLayout2.setBackgroundColor(-1);
                frameLayout2.setId(R.id.mainframe_error_container_id);
                View view = p10.f655v;
                if (view == null) {
                    LayoutInflater.from(p10.getContext()).inflate(p10.f653t, (ViewGroup) frameLayout2, true);
                } else {
                    frameLayout2.addView(view);
                }
                ViewStub viewStub = (ViewStub) p10.findViewById(R.id.mainframe_error_viewsub_id);
                int iIndexOfChild = p10.indexOfChild(viewStub);
                p10.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = p10.getLayoutParams();
                p10.f657x = frameLayout2;
                if (layoutParams != null) {
                    p10.addView(frameLayout2, iIndexOfChild, layoutParams);
                } else {
                    p10.addView(frameLayout2, iIndexOfChild);
                }
                frameLayout2.setVisibility(0);
                int i11 = p10.f654u;
                if (i11 == -1 || (viewFindViewById = frameLayout2.findViewById(i11)) == null) {
                    frameLayout2.setOnClickListener(new O(p10, frameLayout2));
                } else {
                    viewFindViewById.setOnClickListener(new N(p10, viewFindViewById));
                }
                frameLayout = p10.f657x;
            }
            int i12 = p10.f654u;
            if (i12 == -1 || (viewFindViewById2 = frameLayout.findViewById(i12)) == null) {
                frameLayout.setClickable(true);
            } else {
                viewFindViewById2.setClickable(true);
            }
        }
    }

    @Override // B4.AbstractC0153a
    public final void h(WebView webView, String str, r rVar) {
        PackageManager packageManager;
        String str2 = AbstractC0162j.a;
        Activity activity = this.f610h;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (this.j == null) {
            A1.l lVar = new A1.l(activity);
            Resources resources = this.f612k;
            ApplicationInfo applicationInfo = null;
            try {
                packageManager = activity.getApplicationContext().getPackageManager();
                try {
                    applicationInfo = packageManager.getApplicationInfo(activity.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                packageManager = null;
            }
            String string = resources.getString(R.string.agentweb_leave_app_and_go_other_page, (String) packageManager.getApplicationLabel(applicationInfo));
            C0650g c0650g = (C0650g) lVar.f123t;
            c0650g.f12044f = string;
            c0650g.f12042d = this.f612k.getString(R.string.agentweb_tips);
            lVar.e(android.R.string.cancel, new y(rVar, 1));
            lVar.f(this.f612k.getString(R.string.agentweb_leave), new y(rVar, 0));
            this.j = lVar.c();
        }
        this.j.show();
    }

    @Override // B4.AbstractC0153a
    public final void i(PermissionRequest permissionRequest) {
        String[] resources = permissionRequest.getResources();
        HashSet hashSet = new HashSet(Arrays.asList(resources));
        ArrayList arrayList = new ArrayList(hashSet.size());
        if (hashSet.contains("android.webkit.resource.VIDEO_CAPTURE")) {
            arrayList.add("android.permission.CAMERA");
        }
        if (hashSet.contains("android.webkit.resource.AUDIO_CAPTURE")) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant(resources);
            return;
        }
        List listD = AbstractC0158f.d(this.f610h, (String[]) arrayList.toArray(new String[0]));
        if (listD.isEmpty()) {
            permissionRequest.grant(resources);
            return;
        }
        String[] strArr = (String[]) listD.toArray(new String[0]);
        C0154b c0154b = new C0154b();
        c0154b.f661c = new ArrayList();
        c0154b.a = 1;
        c0154b.f661c = new ArrayList(Arrays.asList(strArr));
        c0154b.f662d = new p140o4.r(this, listD, permissionRequest, resources);
        C0156d.h0(this.f610h, c0154b);
    }

    @Override // B4.AbstractC0153a
    public final void k() {
        View viewFindViewById;
        P p10 = this.f611i;
        if (p10 == null || (viewFindViewById = p10.findViewById(R.id.mainframe_error_container_id)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    @Override // B4.AbstractC0153a
    public void l(String str) {
        TextUtils.isEmpty("preDownload");
        Context applicationContext = this.f610h.getApplicationContext();
        Toast toast = AbstractC0158f.f673c;
        if (toast == null) {
            AbstractC0158f.f673c = Toast.makeText(applicationContext.getApplicationContext(), str, 0);
        } else {
            toast.setText(str);
        }
        AbstractC0158f.f673c.show();
    }

    @Override // B4.AbstractC0153a
    public final void m(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Activity activity;
        int i10;
        A1.l lVar = new A1.l(this.f610h);
        int primaryError = sslError.getPrimaryError();
        if (primaryError == 0) {
            activity = this.f610h;
            i10 = R.string.agentweb_message_show_ssl_not_yet_valid;
        } else if (primaryError == 1) {
            activity = this.f610h;
            i10 = R.string.agentweb_message_show_ssl_expired;
        } else if (primaryError == 2) {
            activity = this.f610h;
            i10 = R.string.agentweb_message_show_ssl_hostname_mismatch;
        } else if (primaryError != 3) {
            activity = this.f610h;
            i10 = R.string.agentweb_message_show_ssl_error;
        } else {
            activity = this.f610h;
            i10 = R.string.agentweb_message_show_ssl_untrusted;
        }
        StringBuilder sbC = p239z.e.c(activity.getString(i10));
        sbC.append(this.f610h.getString(R.string.agentweb_message_show_continue));
        String string = sbC.toString();
        String string2 = this.f610h.getString(R.string.agentweb_title_ssl_error);
        C0650g c0650g = (C0650g) lVar.f123t;
        c0650g.f12042d = string2;
        c0650g.f12044f = string;
        x xVar = new x(sslErrorHandler, 0);
        c0650g.f12045g = c0650g.a.getText(R.string.agentweb_continue);
        c0650g.f12046h = xVar;
        lVar.e(R.string.agentweb_cancel, new x(sslErrorHandler, 1));
        lVar.g();
    }

    @Override // B4.AbstractC0153a
    public final void j(String[] strArr) {
    }
}
