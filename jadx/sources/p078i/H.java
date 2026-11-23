package p078i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class H implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f11971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f11972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Method f11973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Context f11974v;

    public H(View view, String str) {
        this.f11971s = view;
        this.f11972t = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        Method method;
        if (this.f11973u != null) {
            break;
        }
        View view2 = this.f11971s;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f11972t;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbM = AbstractC0487g.m("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbM.append(view2.getClass());
                sbM.append(str);
                throw new IllegalStateException(sbM.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f11973u = method;
                    this.f11974v = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f11973u.invoke(this.f11974v, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
