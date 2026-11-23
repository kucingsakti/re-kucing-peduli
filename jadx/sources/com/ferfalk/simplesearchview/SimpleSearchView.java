package com.ferfalk.simplesearchview;

import A1.r;
import C8.u;
import E4.F;
import G4.m;
import K4.l;
import N9.AbstractC0342z;
import W1.c;
import W1.f;
import W1.g;
import W1.h;
import W1.i;
import X1.b;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.google.android.material.tabs.TabLayout;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.SearchActivity;
import com.kcstream.cing.model.SearchResult;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p040e1.j;
import p086i8.C;
import p086i8.k;
import p188t1.G;
import p210v8.v;
import p210v8.x;

/* JADX INFO: loaded from: classes.dex */
public class SimpleSearchView extends FrameLayout {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f7671O = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f7672A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f7673B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ViewGroup f7674C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final EditText f7675D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ImageButton f7676E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ImageButton f7677F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ImageButton f7678G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final View f7679H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public TabLayout f7680I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f7681J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public h f7682K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public i f7683L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f7684M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f7685N;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f7686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7687t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Point f7688u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f7689v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f7690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f7691x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7692y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7693z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f7694s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f7695t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f7696u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public String f7697v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f7698w;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f7694s);
            parcel.writeInt(this.f7695t ? 1 : 0);
            parcel.writeInt(this.f7696u);
            parcel.writeString(this.f7697v);
            parcel.writeInt(this.f7698w ? 1 : 0);
        }
    }

    public SimpleSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7687t = 250;
        this.f7691x = false;
        this.f7692y = false;
        this.f7693z = false;
        this.f7672A = "";
        this.f7673B = 0;
        this.f7684M = false;
        this.f7685N = false;
        this.f7686s = context;
        LayoutInflater.from(context).inflate(R.layout.search_view, (ViewGroup) this, true);
        this.f7674C = (ViewGroup) findViewById(R.id.searchContainer);
        this.f7675D = (EditText) findViewById(R.id.searchEditText);
        this.f7676E = (ImageButton) findViewById(R.id.buttonBack);
        this.f7677F = (ImageButton) findViewById(R.id.buttonClear);
        this.f7678G = (ImageButton) findViewById(R.id.buttonVoice);
        this.f7679H = findViewById(R.id.bottomLine);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, W1.a.a, 0, 0);
        if (typedArrayObtainStyledAttributes == null) {
            setCardStyle(this.f7673B);
        } else {
            if (typedArrayObtainStyledAttributes.hasValue(13)) {
                setCardStyle(typedArrayObtainStyledAttributes.getInt(13, this.f7673B));
            }
            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                setBackIconAlpha(typedArrayObtainStyledAttributes.getFloat(3, 0.87f));
            }
            if (typedArrayObtainStyledAttributes.hasValue(7)) {
                setIconsAlpha(typedArrayObtainStyledAttributes.getFloat(7, 0.54f));
            }
            if (typedArrayObtainStyledAttributes.hasValue(4)) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                setBackIconColor(typedArrayObtainStyledAttributes.getColor(4, typedValue.data));
            }
            if (typedArrayObtainStyledAttributes.hasValue(8)) {
                setIconsColor(typedArrayObtainStyledAttributes.getColor(8, -16777216));
            }
            if (typedArrayObtainStyledAttributes.hasValue(5)) {
                TypedValue typedValue2 = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue2, true);
                setCursorColor(typedArrayObtainStyledAttributes.getColor(5, typedValue2.data));
            }
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                setHintTextColor(typedArrayObtainStyledAttributes.getColor(6, getResources().getColor(R.color.default_textColorHint)));
            }
            if (typedArrayObtainStyledAttributes.hasValue(10)) {
                setSearchBackground(typedArrayObtainStyledAttributes.getDrawable(10));
            }
            if (typedArrayObtainStyledAttributes.hasValue(9)) {
                setBackIconDrawable(typedArrayObtainStyledAttributes.getDrawable(9));
            }
            if (typedArrayObtainStyledAttributes.hasValue(11)) {
                setClearIconDrawable(typedArrayObtainStyledAttributes.getDrawable(11));
            }
            if (typedArrayObtainStyledAttributes.hasValue(12)) {
                setVoiceIconDrawable(typedArrayObtainStyledAttributes.getDrawable(12));
            }
            if (typedArrayObtainStyledAttributes.hasValue(14)) {
                this.f7691x = typedArrayObtainStyledAttributes.getBoolean(14, this.f7691x);
            }
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                setVoiceSearchPrompt(typedArrayObtainStyledAttributes.getString(15));
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                setHint(typedArrayObtainStyledAttributes.getString(1));
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                setInputType(typedArrayObtainStyledAttributes.getInt(2, 524288));
            }
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                setTextColor(typedArrayObtainStyledAttributes.getColor(0, getResources().getColor(R.color.default_textColor)));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f7675D.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: W1.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                int i11 = 1;
                int i12 = SimpleSearchView.f7671O;
                SimpleSearchView simpleSearchView = this.a;
                Editable text = simpleSearchView.f7675D.getText();
                if (text != null && TextUtils.getTrimmedLength(text) > 0) {
                    h hVar = simpleSearchView.f7682K;
                    if (hVar != null) {
                        String string = text.toString();
                        p210v8.i.f(string, "query");
                        SearchActivity searchActivity = (SearchActivity) ((r) hVar).f167t;
                        if (!searchActivity.c0.contains(string)) {
                            if (searchActivity.c0.size() == 8) {
                                searchActivity.c0.clear();
                            }
                            searchActivity.c0.add(string);
                            String strF = searchActivity.f10214b0.f(searchActivity.c0);
                            SharedPreferences.Editor editorEdit = searchActivity.y().edit();
                            editorEdit.putString("saved_search", strF);
                            editorEdit.apply();
                        }
                        u[] uVarArr = SearchActivity.f0;
                        u uVar = uVarArr[0];
                        p081i3.b bVar = searchActivity.f10210X;
                        bVar.getClass();
                        p210v8.i.f(uVar, "property");
                        bVar.f12212t = 1;
                        u uVar2 = uVarArr[1];
                        p081i3.b bVar2 = searchActivity.f10212Z;
                        bVar2.getClass();
                        p210v8.i.f(uVar2, "property");
                        bVar2.f12212t = 0;
                        ((RecyclerView) searchActivity.A().j).setVisibility(8);
                        ((ProgressBar) searchActivity.A().f2075h).setVisibility(0);
                        ((LinearLayout) searchActivity.A().f2074g).setVisibility(8);
                        ArrayList arrayListT0 = searchActivity.f10211Y;
                        if (!arrayListT0.isEmpty()) {
                            arrayListT0.clear();
                        }
                        ((RelativeLayout) searchActivity.A().f2070c).setVisibility(8);
                        AbstractC0342z.n(searchActivity, null, new F(searchActivity, string, null), 3);
                        if (!C.q(arrayListT0)) {
                            arrayListT0 = k.t0(arrayListT0);
                        }
                        G g8 = new G(new Ca.b(x.b(arrayListT0)));
                        v vVar = p210v8.u.a;
                        g8.x(vVar.b(SearchResult.class), vVar.b(m.class));
                        Ca.b bVar3 = (Ca.b) g8.r((RecyclerView) searchActivity.A().j);
                        bVar3.f1025n = R.layout.layout_load_more;
                        bVar3.f1023l = true;
                        bVar3.f1024m = new E0.b(searchActivity, i11, string);
                        searchActivity.f10216e0 = bVar3;
                        Object systemService = searchActivity.getSystemService("input_method");
                        p210v8.i.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService).toggleSoftInput(2, 0);
                    } else {
                        simpleSearchView.a();
                        simpleSearchView.f7684M = true;
                        simpleSearchView.f7675D.setText((CharSequence) null);
                        simpleSearchView.f7684M = false;
                    }
                }
                return true;
            }
        });
        this.f7675D.addTextChangedListener(new l(this, 1));
        this.f7675D.setOnFocusChangeListener(new c(this, 0));
        final int i10 = 0;
        this.f7676E.setOnClickListener(new View.OnClickListener(this) { // from class: W1.d

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ SimpleSearchView f5318t;

            {
                this.f5318t = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleSearchView simpleSearchView = this.f5318t;
                switch (i10) {
                    case 0:
                        int i11 = SimpleSearchView.f7671O;
                        simpleSearchView.a();
                        break;
                    case 1:
                        simpleSearchView.f7675D.setText((CharSequence) null);
                        h hVar = simpleSearchView.f7682K;
                        if (hVar != null) {
                            SearchActivity searchActivity = (SearchActivity) ((r) hVar).f167t;
                            ((ProgressBar) searchActivity.A().f2075h).setVisibility(8);
                            ((LinearLayout) searchActivity.A().f2074g).setVisibility(0);
                            ((RelativeLayout) searchActivity.A().f2070c).setVisibility(8);
                        }
                        break;
                    default:
                        Activity activityL = C3.b.L(simpleSearchView.f7686s);
                        if (activityL != null) {
                            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                            String str = simpleSearchView.f7672A;
                            if (str != null && !str.isEmpty()) {
                                intent.putExtra("android.speech.extra.PROMPT", simpleSearchView.f7672A);
                            }
                            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
                            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
                            activityL.startActivityForResult(intent, 735);
                            break;
                        }
                        break;
                }
            }
        });
        final int i11 = 1;
        this.f7677F.setOnClickListener(new View.OnClickListener(this) { // from class: W1.d

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ SimpleSearchView f5318t;

            {
                this.f5318t = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleSearchView simpleSearchView = this.f5318t;
                switch (i11) {
                    case 0:
                        int i12 = SimpleSearchView.f7671O;
                        simpleSearchView.a();
                        break;
                    case 1:
                        simpleSearchView.f7675D.setText((CharSequence) null);
                        h hVar = simpleSearchView.f7682K;
                        if (hVar != null) {
                            SearchActivity searchActivity = (SearchActivity) ((r) hVar).f167t;
                            ((ProgressBar) searchActivity.A().f2075h).setVisibility(8);
                            ((LinearLayout) searchActivity.A().f2074g).setVisibility(0);
                            ((RelativeLayout) searchActivity.A().f2070c).setVisibility(8);
                        }
                        break;
                    default:
                        Activity activityL = C3.b.L(simpleSearchView.f7686s);
                        if (activityL != null) {
                            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                            String str = simpleSearchView.f7672A;
                            if (str != null && !str.isEmpty()) {
                                intent.putExtra("android.speech.extra.PROMPT", simpleSearchView.f7672A);
                            }
                            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
                            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
                            activityL.startActivityForResult(intent, 735);
                            break;
                        }
                        break;
                }
            }
        });
        final int i12 = 2;
        this.f7678G.setOnClickListener(new View.OnClickListener(this) { // from class: W1.d

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ SimpleSearchView f5318t;

            {
                this.f5318t = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleSearchView simpleSearchView = this.f5318t;
                switch (i12) {
                    case 0:
                        int i13 = SimpleSearchView.f7671O;
                        simpleSearchView.a();
                        break;
                    case 1:
                        simpleSearchView.f7675D.setText((CharSequence) null);
                        h hVar = simpleSearchView.f7682K;
                        if (hVar != null) {
                            SearchActivity searchActivity = (SearchActivity) ((r) hVar).f167t;
                            ((ProgressBar) searchActivity.A().f2075h).setVisibility(8);
                            ((LinearLayout) searchActivity.A().f2074g).setVisibility(0);
                            ((RelativeLayout) searchActivity.A().f2070c).setVisibility(8);
                        }
                        break;
                    default:
                        Activity activityL = C3.b.L(simpleSearchView.f7686s);
                        if (activityL != null) {
                            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                            String str = simpleSearchView.f7672A;
                            if (str != null && !str.isEmpty()) {
                                intent.putExtra("android.speech.extra.PROMPT", simpleSearchView.f7672A);
                            }
                            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
                            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
                            activityL.startActivityForResult(intent, 735);
                            break;
                        }
                        break;
                }
            }
        });
        c(true);
        if (isInEditMode()) {
            return;
        }
        setVisibility(4);
    }

    private GradientDrawable getCardStyleBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(C4.a.g(this.f7686s, 4));
        return gradientDrawable;
    }

    public final void a() {
        if (this.f7692y) {
            this.f7684M = true;
            this.f7675D.setText((CharSequence) null);
            this.f7684M = false;
            clearFocus();
            f fVar = new f(this, 1);
            int i10 = this.f7687t;
            Point revealAnimationCenter = getRevealAnimationCenter();
            if (revealAnimationCenter == null) {
                revealAnimationCenter = new Point(getWidth() / 2, getHeight() / 2);
            }
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(this, revealAnimationCenter.x, revealAnimationCenter.y, J7.a.j(revealAnimationCenter, this), 0.0f);
            animatorCreateCircularReveal.addListener(new b(this, fVar, 1));
            animatorCreateCircularReveal.setDuration(i10);
            animatorCreateCircularReveal.setInterpolator(new p178s0.a(1));
            animatorCreateCircularReveal.start();
            TabLayout tabLayout = this.f7680I;
            if (tabLayout != null) {
                J7.a.w(0, this.f7681J, this.f7687t, tabLayout).start();
            }
            this.f7692y = false;
            i iVar = this.f7683L;
            if (iVar != null) {
                SearchActivity searchActivity = (SearchActivity) ((j) iVar).f10697t;
                ((RecyclerView) searchActivity.A().j).setVisibility(8);
                ((ProgressBar) searchActivity.A().f2075h).setVisibility(8);
                ((LinearLayout) searchActivity.A().f2074g).setVisibility(8);
                ((LinearLayout) searchActivity.A().f2074g).setVisibility(0);
                ((RelativeLayout) searchActivity.A().f2070c).setVisibility(8);
            }
        }
    }

    public final void b(boolean z6) {
        if (this.f7692y) {
            return;
        }
        this.f7675D.setText(this.f7685N ? this.f7689v : null);
        this.f7675D.requestFocus();
        if (z6) {
            f fVar = new f(this, 0);
            int i10 = this.f7687t;
            Point revealAnimationCenter = getRevealAnimationCenter();
            if (revealAnimationCenter == null) {
                revealAnimationCenter = new Point(getWidth() / 2, getHeight() / 2);
            }
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(this, revealAnimationCenter.x, revealAnimationCenter.y, 0.0f, J7.a.j(revealAnimationCenter, this));
            animatorCreateCircularReveal.addListener(new b(this, fVar, 0));
            animatorCreateCircularReveal.setDuration(i10);
            animatorCreateCircularReveal.setInterpolator(new p178s0.a(1));
            animatorCreateCircularReveal.start();
        } else {
            setVisibility(0);
        }
        TabLayout tabLayout = this.f7680I;
        if (tabLayout != null) {
            if (z6) {
                J7.a.w(tabLayout.getHeight(), 0, this.f7687t, tabLayout).start();
            } else {
                tabLayout.setVisibility(8);
            }
        }
        this.f7692y = true;
        i iVar = this.f7683L;
        if (iVar != null) {
            SearchActivity searchActivity = (SearchActivity) ((j) iVar).f10697t;
            ((LinearLayout) searchActivity.A().f2074g).setVisibility(0);
            ((NestedScrollView) searchActivity.A().f2073f).setVisibility(8);
        }
    }

    public final void c(boolean z6) {
        if (z6) {
            if ((isInEditMode() ? true : true ^ getContext().getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).isEmpty()) && this.f7691x) {
                this.f7678G.setVisibility(0);
                return;
            }
        }
        this.f7678G.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f7693z = true;
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        super.clearFocus();
        this.f7675D.clearFocus();
        this.f7693z = false;
    }

    public int getAnimationDuration() {
        return this.f7687t;
    }

    public int getCardStyle() {
        return this.f7673B;
    }

    public Point getRevealAnimationCenter() {
        Point point = this.f7688u;
        if (point != null) {
            return point;
        }
        Point point2 = new Point(getWidth() - C4.a.g(this.f7686s, 26), getHeight() / 2);
        this.f7688u = point2;
        return point2;
    }

    public EditText getSearchEditText() {
        return this.f7675D;
    }

    public TabLayout getTabLayout() {
        return this.f7680I;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f7689v = savedState.f7694s;
        this.f7687t = savedState.f7696u;
        this.f7672A = savedState.f7697v;
        this.f7685N = savedState.f7698w;
        if (savedState.f7695t) {
            b(false);
            String str = savedState.f7694s;
            this.f7675D.setText(str);
            if (str != null) {
                EditText editText = this.f7675D;
                editText.setSelection(editText.length());
                this.f7689v = str;
            }
        }
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence charSequence = this.f7689v;
        savedState.f7694s = charSequence != null ? charSequence.toString() : null;
        savedState.f7695t = this.f7692y;
        savedState.f7696u = this.f7687t;
        savedState.f7698w = this.f7685N;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (!this.f7693z && isFocusable()) {
            return this.f7675D.requestFocus(i10, rect);
        }
        return false;
    }

    public void setAnimationDuration(int i10) {
        this.f7687t = i10;
    }

    public void setBackIconAlpha(float f10) {
        this.f7676E.setAlpha(f10);
    }

    public void setBackIconColor(int i10) {
        p000a0.f.c(this.f7676E, ColorStateList.valueOf(i10));
    }

    public void setBackIconDrawable(Drawable drawable) {
        this.f7676E.setImageDrawable(drawable);
    }

    public void setCardStyle(int i10) {
        float fG;
        this.f7673B = i10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (i10 != 1) {
            this.f7674C.setBackgroundColor(-1);
            this.f7679H.setVisibility(0);
            fG = 0.0f;
        } else {
            this.f7674C.setBackground(getCardStyleBackground());
            this.f7679H.setVisibility(8);
            Context context = this.f7686s;
            int iG = C4.a.g(context, 6);
            layoutParams.setMargins(iG, iG, iG, iG);
            fG = C4.a.g(context, 2);
        }
        this.f7674C.setLayoutParams(layoutParams);
        this.f7674C.setElevation(fG);
    }

    public void setClearIconDrawable(Drawable drawable) {
        this.f7677F.setImageDrawable(drawable);
    }

    public void setCursorColor(int i10) {
        EditText editText = this.f7675D;
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Drawable drawableB = J.a.b(editText.getContext(), i11);
            drawableB.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            Drawable[] drawableArr = {drawableB, drawableB};
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableArr);
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public void setCursorDrawable(int i10) {
        EditText editText = this.f7675D;
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(editText, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f7675D.setHint(charSequence);
    }

    public void setHintTextColor(int i10) {
        this.f7675D.setHintTextColor(i10);
    }

    public void setIconsAlpha(float f10) {
        this.f7677F.setAlpha(f10);
        this.f7678G.setAlpha(f10);
    }

    public void setIconsColor(int i10) {
        p000a0.f.c(this.f7677F, ColorStateList.valueOf(i10));
        p000a0.f.c(this.f7678G, ColorStateList.valueOf(i10));
    }

    public void setInputType(int i10) {
        this.f7675D.setInputType(i10);
    }

    public void setKeepQuery(boolean z6) {
        this.f7685N = z6;
    }

    public void setMenuItem(MenuItem menuItem) {
        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: W1.e
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem2) {
                int i10 = SimpleSearchView.f7671O;
                this.f5319s.b(true);
                return true;
            }
        });
    }

    public void setOnQueryTextListener(h hVar) {
        this.f7682K = hVar;
    }

    public void setOnSearchViewListener(i iVar) {
        this.f7683L = iVar;
    }

    public void setRevealAnimationCenter(Point point) {
        this.f7688u = point;
    }

    public void setSearchBackground(Drawable drawable) {
        this.f7674C.setBackground(drawable);
    }

    public void setTabLayout(TabLayout tabLayout) {
        this.f7680I = tabLayout;
        tabLayout.getViewTreeObserver().addOnPreDrawListener(new g(this, tabLayout));
        this.f7680I.a(new J4.m(this, 1));
    }

    public void setTextColor(int i10) {
        this.f7675D.setTextColor(i10);
    }

    public void setVoiceIconDrawable(Drawable drawable) {
        this.f7678G.setImageDrawable(drawable);
    }

    public void setVoiceSearchPrompt(String str) {
        this.f7672A = str;
    }
}
