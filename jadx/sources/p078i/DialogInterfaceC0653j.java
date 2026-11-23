package p078i;

import U.I;
import U.U;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.kcstream.cing.R;
import java.util.WeakHashMap;
import p.C0729t0;

/* JADX INFO: renamed from: i.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0653j extends F implements DialogInterface {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0652i f12094x;

    public DialogInterfaceC0653j(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, h(contextThemeWrapper, i10));
        this.f12094x = new C0652i(getContext(), this, getWindow());
    }

    public static int h(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p078i.F, p031d.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        char c10;
        int i10;
        int i11;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        C0652i c0652i = this.f12094x;
        c0652i.f12070b.setContentView(c0652i.f12062A);
        Window window = c0652i.f12071c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View viewInflate = c0652i.f12075g;
        Context context = c0652i.a;
        if (viewInflate == null) {
            viewInflate = c0652i.f12076h != 0 ? LayoutInflater.from(context).inflate(c0652i.f12076h, viewGroup, false) : null;
        }
        boolean z6 = viewInflate != null;
        if (z6 && C0652i.a(viewInflate)) {
            c10 = 4;
        } else {
            c10 = 4;
            window.setFlags(131072, 131072);
        }
        if (z6) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (c0652i.f12077i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c0652i.f12074f != null) {
                ((LinearLayout.LayoutParams) ((C0729t0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = C0652i.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = C0652i.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = C0652i.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0652i.f12086s = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0652i.f12086s.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        c0652i.f12090w = textView;
        if (textView != null) {
            CharSequence charSequence = c0652i.f12073e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c0652i.f12086s.removeView(c0652i.f12090w);
                if (c0652i.f12074f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0652i.f12086s.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c0652i.f12086s);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c0652i.f12074f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        c0652i.j = button;
        ViewOnClickListenerC0646c viewOnClickListenerC0646c = c0652i.f12069H;
        button.setOnClickListener(viewOnClickListenerC0646c);
        if (TextUtils.isEmpty(c0652i.f12078k)) {
            c0652i.j.setVisibility(8);
            i10 = 0;
        } else {
            c0652i.j.setText(c0652i.f12078k);
            c0652i.j.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        c0652i.f12080m = button2;
        button2.setOnClickListener(viewOnClickListenerC0646c);
        if (TextUtils.isEmpty(c0652i.f12081n)) {
            c0652i.f12080m.setVisibility(8);
        } else {
            c0652i.f12080m.setText(c0652i.f12081n);
            c0652i.f12080m.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        c0652i.f12083p = button3;
        button3.setOnClickListener(viewOnClickListenerC0646c);
        if (TextUtils.isEmpty(c0652i.f12084q)) {
            c0652i.f12083p.setVisibility(8);
        } else {
            c0652i.f12083p.setText(c0652i.f12084q);
            c0652i.f12083p.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i11 = 2;
        } else if (i10 == 1) {
            Button button4 = c0652i.j;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button4.setLayoutParams(layoutParams);
            i11 = 2;
        } else {
            i11 = 2;
            if (i10 == 2) {
                Button button5 = c0652i.f12080m;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == c10) {
                Button button6 = c0652i.f12083p;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (c0652i.f12091x != null) {
            viewGroupB.addView(c0652i.f12091x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0652i.f12088u = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0652i.f12072d) || !c0652i.f12067F) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0652i.f12088u.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0652i.f12089v = textView2;
                textView2.setText(c0652i.f12072d);
                Drawable drawable = c0652i.f12087t;
                if (drawable != null) {
                    c0652i.f12088u.setImageDrawable(drawable);
                } else {
                    c0652i.f12089v.setPadding(c0652i.f12088u.getPaddingLeft(), c0652i.f12088u.getPaddingTop(), c0652i.f12088u.getPaddingRight(), c0652i.f12088u.getPaddingBottom());
                    c0652i.f12088u.setVisibility(8);
                }
            }
        }
        boolean z10 = viewGroup.getVisibility() != 8;
        int i12 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z11 = viewGroupB3.getVisibility() != 8;
        if (!z11 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i12 != 0) {
            NestedScrollView nestedScrollView2 = c0652i.f12086s;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c0652i.f12073e == null && c0652i.f12074f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0652i.f12074f;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z11 || i12 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i12 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f6037s, alertController$RecycleListView.getPaddingRight(), z11 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f6038t);
            }
        }
        if (!z10) {
            View view = c0652i.f12074f;
            if (view == null) {
                view = c0652i.f12086s;
            }
            if (view != null) {
                int i13 = (z11 ? i11 : 0) | i12;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = U.a;
                I.d(view, i13, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0652i.f12074f;
        if (alertController$RecycleListView2 == null || (listAdapter = c0652i.f12092y) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i14 = c0652i.f12093z;
        if (i14 > -1) {
            alertController$RecycleListView2.setItemChecked(i14, true);
            alertController$RecycleListView2.setSelection(i14);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12094x.f12086s;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12094x.f12086s;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override // p078i.F, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0652i c0652i = this.f12094x;
        c0652i.f12072d = charSequence;
        TextView textView = c0652i.f12089v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
