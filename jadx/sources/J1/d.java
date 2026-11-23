package J1;

import A1.F;
import U1.f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.List;
import p068ga.l;
import p232y1.g;
import p232y1.h;
import p232y1.j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f2359b = new g("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, g.f16014e);
    public final Context a;

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // p232y1.j
    public final /* bridge */ /* synthetic */ F a(Object obj, int i10, int i11, h hVar) {
        return c((Uri) obj, hVar);
    }

    @Override // p232y1.j
    public final boolean b(Object obj, h hVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public final F c(Uri uri, h hVar) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        Context context = this.a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
            }
        }
        Resources.Theme theme = (Resources.Theme) hVar.c(f2359b);
        f.a("Can't get a theme from another package", contextCreatePackageContext.getPackageName().equals(authority) || theme == null);
        Drawable drawableH = theme == null ? l.h(context, contextCreatePackageContext, identifier, null) : l.h(context, context, identifier, theme);
        if (drawableH != null) {
            return new c(drawableH, 0);
        }
        return null;
    }
}
