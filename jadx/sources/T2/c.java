package T2;

import C8.E;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.badge.BadgeState$State;
import com.kcstream.cing.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p091j3.C;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final BadgeState$State a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BadgeState$State f4640b = new BadgeState$State();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4647i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4648k;

    public c(Context context, BadgeState$State badgeState$State) {
        AttributeSet attributeSet;
        int styleAttribute;
        Locale locale;
        int next;
        BadgeState$State badgeState$State2 = badgeState$State == null ? new BadgeState$State() : badgeState$State;
        int i10 = badgeState$State2.f9464s;
        if (i10 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayI = C.i(context, attributeSet, Q2.a.f4009c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f4641c = typedArrayI.getDimensionPixelSize(4, -1);
        this.f4647i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f4642d = typedArrayI.getDimensionPixelSize(14, -1);
        this.f4643e = typedArrayI.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f4645g = typedArrayI.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f4644f = typedArrayI.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f4646h = typedArrayI.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f4648k = typedArrayI.getInt(24, 1);
        BadgeState$State badgeState$State3 = this.f4640b;
        int i11 = badgeState$State2.f9443A;
        badgeState$State3.f9443A = i11 == -2 ? 255 : i11;
        int i12 = badgeState$State2.f9445C;
        if (i12 != -2) {
            badgeState$State3.f9445C = i12;
        } else if (typedArrayI.hasValue(23)) {
            this.f4640b.f9445C = typedArrayI.getInt(23, 0);
        } else {
            this.f4640b.f9445C = -1;
        }
        String str = badgeState$State2.f9444B;
        if (str != null) {
            this.f4640b.f9444B = str;
        } else if (typedArrayI.hasValue(7)) {
            this.f4640b.f9444B = typedArrayI.getString(7);
        }
        BadgeState$State badgeState$State4 = this.f4640b;
        badgeState$State4.f9449G = badgeState$State2.f9449G;
        CharSequence charSequence = badgeState$State2.f9450H;
        badgeState$State4.f9450H = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        BadgeState$State badgeState$State5 = this.f4640b;
        int i13 = badgeState$State2.f9451I;
        badgeState$State5.f9451I = i13 == 0 ? R.plurals.mtrl_badge_content_description : i13;
        int i14 = badgeState$State2.f9452J;
        badgeState$State5.f9452J = i14 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i14;
        Boolean bool = badgeState$State2.f9454L;
        badgeState$State5.f9454L = Boolean.valueOf(bool == null || bool.booleanValue());
        BadgeState$State badgeState$State6 = this.f4640b;
        int i15 = badgeState$State2.f9446D;
        badgeState$State6.f9446D = i15 == -2 ? typedArrayI.getInt(21, -2) : i15;
        BadgeState$State badgeState$State7 = this.f4640b;
        int i16 = badgeState$State2.f9447E;
        badgeState$State7.f9447E = i16 == -2 ? typedArrayI.getInt(22, -2) : i16;
        BadgeState$State badgeState$State8 = this.f4640b;
        Integer num = badgeState$State2.f9468w;
        badgeState$State8.f9468w = Integer.valueOf(num == null ? typedArrayI.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        BadgeState$State badgeState$State9 = this.f4640b;
        Integer num2 = badgeState$State2.f9469x;
        badgeState$State9.f9469x = Integer.valueOf(num2 == null ? typedArrayI.getResourceId(6, 0) : num2.intValue());
        BadgeState$State badgeState$State10 = this.f4640b;
        Integer num3 = badgeState$State2.f9470y;
        badgeState$State10.f9470y = Integer.valueOf(num3 == null ? typedArrayI.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        BadgeState$State badgeState$State11 = this.f4640b;
        Integer num4 = badgeState$State2.f9471z;
        badgeState$State11.f9471z = Integer.valueOf(num4 == null ? typedArrayI.getResourceId(16, 0) : num4.intValue());
        BadgeState$State badgeState$State12 = this.f4640b;
        Integer num5 = badgeState$State2.f9465t;
        badgeState$State12.f9465t = Integer.valueOf(num5 == null ? E.n(context, typedArrayI, 1).getDefaultColor() : num5.intValue());
        BadgeState$State badgeState$State13 = this.f4640b;
        Integer num6 = badgeState$State2.f9467v;
        badgeState$State13.f9467v = Integer.valueOf(num6 == null ? typedArrayI.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = badgeState$State2.f9466u;
        if (num7 != null) {
            this.f4640b.f9466u = num7;
        } else if (typedArrayI.hasValue(9)) {
            this.f4640b.f9466u = Integer.valueOf(E.n(context, typedArrayI, 9).getDefaultColor());
        } else {
            int iIntValue = this.f4640b.f9467v.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, Q2.a.P);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListN = E.n(context, typedArrayObtainStyledAttributes, 3);
            E.n(context, typedArrayObtainStyledAttributes, 4);
            E.n(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i17 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i17, 0);
            typedArrayObtainStyledAttributes.getString(i17);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            E.n(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, Q2.a.f3992C);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f4640b.f9466u = Integer.valueOf(colorStateListN.getDefaultColor());
        }
        BadgeState$State badgeState$State14 = this.f4640b;
        Integer num8 = badgeState$State2.f9453K;
        badgeState$State14.f9453K = Integer.valueOf(num8 == null ? typedArrayI.getInt(2, 8388661) : num8.intValue());
        BadgeState$State badgeState$State15 = this.f4640b;
        Integer num9 = badgeState$State2.f9455M;
        badgeState$State15.f9455M = Integer.valueOf(num9 == null ? typedArrayI.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        BadgeState$State badgeState$State16 = this.f4640b;
        Integer num10 = badgeState$State2.f9456N;
        badgeState$State16.f9456N = Integer.valueOf(num10 == null ? typedArrayI.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        BadgeState$State badgeState$State17 = this.f4640b;
        Integer num11 = badgeState$State2.f9457O;
        badgeState$State17.f9457O = Integer.valueOf(num11 == null ? typedArrayI.getDimensionPixelOffset(18, 0) : num11.intValue());
        BadgeState$State badgeState$State18 = this.f4640b;
        Integer num12 = badgeState$State2.P;
        badgeState$State18.P = Integer.valueOf(num12 == null ? typedArrayI.getDimensionPixelOffset(25, 0) : num12.intValue());
        BadgeState$State badgeState$State19 = this.f4640b;
        Integer num13 = badgeState$State2.f9458Q;
        badgeState$State19.f9458Q = Integer.valueOf(num13 == null ? typedArrayI.getDimensionPixelOffset(19, badgeState$State19.f9457O.intValue()) : num13.intValue());
        BadgeState$State badgeState$State20 = this.f4640b;
        Integer num14 = badgeState$State2.f9459R;
        badgeState$State20.f9459R = Integer.valueOf(num14 == null ? typedArrayI.getDimensionPixelOffset(26, badgeState$State20.P.intValue()) : num14.intValue());
        BadgeState$State badgeState$State21 = this.f4640b;
        Integer num15 = badgeState$State2.f9462U;
        badgeState$State21.f9462U = Integer.valueOf(num15 == null ? typedArrayI.getDimensionPixelOffset(20, 0) : num15.intValue());
        BadgeState$State badgeState$State22 = this.f4640b;
        Integer num16 = badgeState$State2.f9460S;
        badgeState$State22.f9460S = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        BadgeState$State badgeState$State23 = this.f4640b;
        Integer num17 = badgeState$State2.f9461T;
        badgeState$State23.f9461T = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        BadgeState$State badgeState$State24 = this.f4640b;
        Boolean bool2 = badgeState$State2.f9463V;
        badgeState$State24.f9463V = Boolean.valueOf(bool2 == null ? typedArrayI.getBoolean(0, false) : bool2.booleanValue());
        typedArrayI.recycle();
        Locale locale2 = badgeState$State2.f9448F;
        if (locale2 == null) {
            BadgeState$State badgeState$State25 = this.f4640b;
            if (Build.VERSION.SDK_INT >= 24) {
                Locale.Category unused = Locale.Category.FORMAT;
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            badgeState$State25.f9448F = locale;
        } else {
            this.f4640b.f9448F = locale2;
        }
        this.a = badgeState$State2;
    }
}
