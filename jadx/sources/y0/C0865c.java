package y0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: renamed from: y0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ly0/c;", "Ly0/O;", "Ly0/a;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@N("activity")
public class C0865c extends O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f15913d;

    public C0865c(Context context) {
        this.f15912c = context;
        for (Object obj : K9.n.x(context, C0864b.f15904t)) {
            if (((Context) obj) instanceof Activity) {
                this.f15913d = (Activity) obj;
            }
        }
        obj = null;
        this.f15913d = (Activity) obj;
    }

    @Override // y0.O
    public final x a() {
        return new C0863a(this);
    }

    @Override // y0.O
    public final x c(x xVar, Bundle bundle, D d3) {
        Intent intent;
        int intExtra;
        C0863a c0863a = (C0863a) xVar;
        if (c0863a.f15898C == null) {
            throw new IllegalStateException(E0.a.j(new StringBuilder("Destination "), c0863a.f16002z, " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(c0863a.f15898C);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = c0863a.f15899D;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    Map mapA = p086i8.y.A(c0863a.f16001y);
                    p210v8.i.c(strGroup);
                    C0868f c0868f = (C0868f) mapA.get(strGroup);
                    M m2 = c0868f != null ? c0868f.a : null;
                    stringBuffer.append(m2 != null ? m2.f(m2.a(strGroup, bundle)) : Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f15913d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (d3 != null && d3.a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c0863a.f16002z);
        Context context = this.f15912c;
        Resources resources = context.getResources();
        if (d3 != null) {
            int i10 = d3.f15866h;
            int i11 = d3.f15867i;
            if ((i10 <= 0 || !p210v8.i.a(resources.getResourceTypeName(i10), "animator")) && (i11 <= 0 || !p210v8.i.a(resources.getResourceTypeName(i11), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i10);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i11);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i10) + " and popExit resource " + resources.getResourceName(i11) + " when launching " + c0863a);
            }
        }
        context.startActivity(intent2);
        if (d3 != null && activity != null) {
            int i12 = d3.f15864f;
            int i13 = d3.f15865g;
            if ((i12 > 0 && p210v8.i.a(resources.getResourceTypeName(i12), "animator")) || (i13 > 0 && p210v8.i.a(resources.getResourceTypeName(i13), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i12) + " and exit resource " + resources.getResourceName(i13) + "when launching " + c0863a);
                return null;
            }
            if (i12 >= 0 || i13 >= 0) {
                if (i12 < 0) {
                    i12 = 0;
                }
                activity.overridePendingTransition(i12, i13 >= 0 ? i13 : 0);
            }
        }
        return null;
    }

    @Override // y0.O
    public final boolean j() {
        Activity activity = this.f15913d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
