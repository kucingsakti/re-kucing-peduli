package androidx.appcompat.view.menu;

import Y1.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.kcstream.cing.R;
import p069h.a;
import p136o.l;
import p136o.n;
import p136o.y;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LinearLayout f6052A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Drawable f6053B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f6054C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Context f6055D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f6056E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Drawable f6057F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f6058G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public LayoutInflater f6059H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f6060I;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n f6061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f6062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RadioButton f6063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f6064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CheckBox f6065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f6066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView f6067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f6068z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVarE = c.E(getContext(), attributeSet, a.f11626s, R.attr.listMenuViewStyle);
        this.f6053B = cVarE.v(5);
        TypedArray typedArray = (TypedArray) cVarE.f5671u;
        this.f6054C = typedArray.getResourceId(1, -1);
        this.f6056E = typedArray.getBoolean(7, false);
        this.f6055D = context;
        this.f6057F = cVarE.v(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f6058G = typedArrayObtainStyledAttributes.hasValue(0);
        cVarE.J();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f6059H == null) {
            this.f6059H = LayoutInflater.from(getContext());
        }
        return this.f6059H;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f6067y;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    @Override // p136o.y
    public final void a(n nVar) {
        boolean z6;
        int i10;
        String string;
        boolean z10;
        this.f6061s = nVar;
        setVisibility(nVar.isVisible() ? 0 : 8);
        setTitle(nVar.f13542w);
        setCheckable(nVar.isCheckable());
        if (nVar.f13523F.o()) {
            if ((nVar.f13523F.n() ? nVar.f13519B : nVar.f13545z) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        nVar.f13523F.n();
        if (z6) {
            n nVar2 = this.f6061s;
            if (nVar2.f13523F.o()) {
                if ((nVar2.f13523F.n() ? nVar2.f13519B : nVar2.f13545z) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            i10 = z10 ? 0 : 8;
        }
        if (i10 == 0) {
            TextView textView = this.f6066x;
            n nVar3 = this.f6061s;
            char c10 = nVar3.f13523F.n() ? nVar3.f13519B : nVar3.f13545z;
            if (c10 == 0) {
                string = "";
            } else {
                l lVar = nVar3.f13523F;
                Resources resources = lVar.f13507s.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(lVar.f13507s).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i11 = lVar.n() ? nVar3.f13520C : nVar3.f13518A;
                n.c(i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                n.c(i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                n.c(i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                n.c(i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                n.c(i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                n.c(i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c10 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c10 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c10 != ' ') {
                    sb.append(c10);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f6066x.getVisibility() != i10) {
            this.f6066x.setVisibility(i10);
        }
        setIcon(nVar.getIcon());
        setEnabled(nVar.isEnabled());
        setSubMenuArrowVisible(nVar.hasSubMenu());
        setContentDescription(nVar.f13526I);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f6068z;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6068z.getLayoutParams();
        rect.top = this.f6068z.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p136o.y
    public n getItemData() {
        return this.f6061s;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f6053B);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f6064v = textView;
        int i10 = this.f6054C;
        if (i10 != -1) {
            textView.setTextAppearance(this.f6055D, i10);
        }
        this.f6066x = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f6067y = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f6057F);
        }
        this.f6068z = (ImageView) findViewById(R.id.group_divider);
        this.f6052A = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f6062t != null && this.f6056E) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f6062t.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f6063u == null && this.f6065w == null) {
            return;
        }
        if ((this.f6061s.P & 4) != 0) {
            if (this.f6063u == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f6063u = radioButton;
                LinearLayout linearLayout = this.f6052A;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f6063u;
            view = this.f6065w;
        } else {
            if (this.f6065w == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f6065w = checkBox;
                LinearLayout linearLayout2 = this.f6052A;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f6065w;
            view = this.f6063u;
        }
        if (z6) {
            compoundButton.setChecked(this.f6061s.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f6065w;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f6063u;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if ((this.f6061s.P & 4) != 0) {
            if (this.f6063u == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f6063u = radioButton;
                LinearLayout linearLayout = this.f6052A;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f6063u;
        } else {
            if (this.f6065w == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f6065w = checkBox;
                LinearLayout linearLayout2 = this.f6052A;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f6065w;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f6060I = z6;
        this.f6056E = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f6068z;
        if (imageView != null) {
            imageView.setVisibility((this.f6058G || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f6061s.f13523F.getClass();
        boolean z6 = this.f6060I;
        if (z6 || this.f6056E) {
            ImageView imageView = this.f6062t;
            if (imageView == null && drawable == null && !this.f6056E) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f6062t = imageView2;
                LinearLayout linearLayout = this.f6052A;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f6056E) {
                this.f6062t.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f6062t;
            if (!z6) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f6062t.getVisibility() != 0) {
                this.f6062t.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f6064v.getVisibility() != 8) {
                this.f6064v.setVisibility(8);
            }
        } else {
            this.f6064v.setText(charSequence);
            if (this.f6064v.getVisibility() != 0) {
                this.f6064v.setVisibility(0);
            }
        }
    }
}
