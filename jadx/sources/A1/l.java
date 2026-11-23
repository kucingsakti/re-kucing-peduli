package A1;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import p078i.C0647d;
import p078i.C0648e;
import p078i.C0649f;
import p078i.C0650g;
import p078i.C0651h;
import p078i.C0652i;
import p078i.DialogInterfaceC0653j;

/* JADX INFO: loaded from: classes.dex */
public class l implements M1.a, V.t {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f123t;

    public /* synthetic */ l(Object obj, int i10) {
        this.f123t = obj;
        this.f122s = i10;
    }

    @Override // M1.a
    public F a(F f10, p232y1.h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) f10.get()).compress((Bitmap.CompressFormat) this.f123t, this.f122s, byteArrayOutputStream);
        f10.c();
        return new H1.z(byteArrayOutputStream.toByteArray());
    }

    @Override // V.t
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f123t).I(this.f122s);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.widget.ListAdapter] */
    public DialogInterfaceC0653j c() {
        ?? c0651h;
        C0650g c0650g = (C0650g) this.f123t;
        DialogInterfaceC0653j dialogInterfaceC0653j = new DialogInterfaceC0653j(c0650g.a, this.f122s);
        View view = c0650g.f12043e;
        C0652i c0652i = dialogInterfaceC0653j.f12094x;
        if (view != null) {
            c0652i.f12091x = view;
        } else {
            CharSequence charSequence = c0650g.f12042d;
            if (charSequence != null) {
                c0652i.f12072d = charSequence;
                TextView textView = c0652i.f12089v;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0650g.f12041c;
            if (drawable != null) {
                c0652i.f12087t = drawable;
                ImageView imageView = c0652i.f12088u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0652i.f12088u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c0650g.f12044f;
        if (charSequence2 != null) {
            c0652i.f12073e = charSequence2;
            TextView textView2 = c0652i.f12090w;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0650g.f12045g;
        if (charSequence3 != null) {
            c0652i.c(-1, charSequence3, c0650g.f12046h);
        }
        CharSequence charSequence4 = c0650g.f12047i;
        if (charSequence4 != null) {
            c0652i.c(-2, charSequence4, c0650g.j);
        }
        String str = c0650g.f12048k;
        if (str != null) {
            c0652i.c(-3, str, c0650g.f12049l);
        }
        if (c0650g.f12052o != null || c0650g.f12053p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0650g.f12040b.inflate(c0652i.f12063B, (ViewGroup) null);
            boolean z6 = c0650g.f12058u;
            ContextThemeWrapper contextThemeWrapper = c0650g.a;
            if (z6) {
                c0651h = new C0647d(c0650g, contextThemeWrapper, c0652i.f12064C, c0650g.f12052o, alertController$RecycleListView);
            } else {
                int i10 = c0650g.f12059v ? c0652i.f12065D : c0652i.f12066E;
                Object obj = c0650g.f12053p;
                c0651h = obj;
                if (obj == null) {
                    c0651h = new C0651h(contextThemeWrapper, i10, R.id.text1, c0650g.f12052o);
                }
            }
            c0652i.f12092y = c0651h;
            c0652i.f12093z = c0650g.f12060w;
            if (c0650g.f12054q != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0648e(c0650g, c0652i));
            } else if (c0650g.f12061x != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0649f(c0650g, alertController$RecycleListView, c0652i));
            }
            if (c0650g.f12059v) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (c0650g.f12058u) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            c0652i.f12074f = alertController$RecycleListView;
        }
        View view2 = c0650g.f12056s;
        if (view2 != null) {
            c0652i.f12075g = view2;
            c0652i.f12076h = 0;
            c0652i.f12077i = false;
        } else {
            int i11 = c0650g.f12055r;
            if (i11 != 0) {
                c0652i.f12075g = null;
                c0652i.f12076h = i11;
                c0652i.f12077i = false;
            }
        }
        dialogInterfaceC0653j.setCancelable(true);
        dialogInterfaceC0653j.setCanceledOnTouchOutside(true);
        dialogInterfaceC0653j.setOnCancelListener(c0650g.f12050m);
        dialogInterfaceC0653j.setOnDismissListener(null);
        p136o.m mVar = c0650g.f12051n;
        if (mVar != null) {
            dialogInterfaceC0653j.setOnKeyListener(mVar);
        }
        return dialogInterfaceC0653j;
    }

    public synchronized void d() {
        this.f122s++;
    }

    public l e(int i10, DialogInterface.OnClickListener onClickListener) {
        C0650g c0650g = (C0650g) this.f123t;
        c0650g.f12047i = c0650g.a.getText(i10);
        c0650g.j = onClickListener;
        return this;
    }

    public void f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C0650g c0650g = (C0650g) this.f123t;
        c0650g.f12045g = charSequence;
        c0650g.f12046h = onClickListener;
    }

    public void g() {
        c().show();
    }

    public l(int i10) {
        switch (i10) {
            case 6:
                this.f122s = 0;
                break;
            default:
                this.f123t = Bitmap.CompressFormat.JPEG;
                this.f122s = 100;
                break;
        }
    }

    public l(Context context) {
        this(context, DialogInterfaceC0653j.h(context, 0));
    }

    public l(Context context, int i10) {
        this.f123t = new C0650g(new ContextThemeWrapper(context, DialogInterfaceC0653j.h(context, i10)));
        this.f122s = i10;
    }

    public l(int i10, R.h[] hVarArr) {
        this.f122s = i10;
        this.f123t = hVarArr;
    }
}
