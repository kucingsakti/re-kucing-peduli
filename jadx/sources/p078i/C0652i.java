package p078i;

import C0.p;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;
import p069h.a;

/* JADX INFO: renamed from: i.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0652i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f12062A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f12063B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f12064C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f12065D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f12066E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f12067F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final p f12068G;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0653j f12070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f12071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f12072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f12073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f12074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f12075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12076h;
    public Button j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f12078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Message f12079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f12080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f12081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Message f12082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Button f12083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f12084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Message f12085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public NestedScrollView f12086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f12087t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f12088u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f12089v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f12090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f12091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ListAdapter f12092y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12077i = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12093z = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ViewOnClickListenerC0646c f12069H = new ViewOnClickListenerC0646c(this);

    public C0652i(Context context, DialogInterfaceC0653j dialogInterfaceC0653j, Window window) {
        this.a = context;
        this.f12070b = dialogInterfaceC0653j;
        this.f12071c = window;
        p pVar = new p();
        pVar.f871b = new WeakReference(dialogInterfaceC0653j);
        this.f12068G = pVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a.f11613e, R.attr.alertDialogStyle, 0);
        this.f12062A = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f12063B = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f12064C = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f12065D = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f12066E = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f12067F = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0653j.d().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f12068G.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f12084q = charSequence;
            this.f12085r = messageObtainMessage;
        } else if (i10 == -2) {
            this.f12081n = charSequence;
            this.f12082o = messageObtainMessage;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f12078k = charSequence;
            this.f12079l = messageObtainMessage;
        }
    }
}
