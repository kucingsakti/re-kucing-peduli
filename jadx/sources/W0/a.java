package W0;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f5240b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f5241c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f5242d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f5243e = {R.attr.drawable};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f5244f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f5245g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f5246h = {R.attr.ordering};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f5247i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f5248k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code duplicated, block: B:205:0x0392  */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10) throws XmlPullParserException, IOException {
        int i11;
        ArrayList arrayList;
        PropertyValuesHolder[] propertyValuesHolderArr;
        int i12;
        int i13;
        ArrayList arrayList2;
        int i14;
        int i15;
        PropertyValuesHolder propertyValuesHolderB;
        int size;
        int i16;
        Keyframe keyframeOfFloat;
        Animator animator;
        Animator animatorD;
        int depth = xmlResourceParser.getDepth();
        Animator animator2 = null;
        ArrayList arrayList3 = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i17 = 0;
            int i18 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i19 = 1;
            if (next == 1) {
                break;
            }
            int i20 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    animatorD = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        animatorD = d(context, resources, theme, attributeSet, null, xmlResourceParser);
                    } else {
                        Resources resources2 = resources;
                        Resources.Theme theme2 = theme;
                        if (name.equals("set")) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray typedArrayH = K.b.h(resources2, theme2, attributeSet, f5246h);
                            a(context, resources2, theme2, r12, attributeSet, animatorSet2, xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null ? typedArrayH.getInt(0, 0) : 0);
                            animator = animatorSet2;
                            typedArrayH.recycle();
                            i11 = depth;
                            arrayList = arrayList3;
                            animator2 = animator;
                        } else {
                            if (!name.equals("propertyValuesHolder")) {
                                throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                            }
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                            ArrayList arrayList4 = null;
                            while (true) {
                                int eventType = xmlResourceParser.getEventType();
                                if (eventType == i18 || eventType == i19) {
                                    break;
                                }
                                if (eventType != i20) {
                                    xmlResourceParser.next();
                                } else {
                                    if (xmlResourceParser.getName().equals("propertyValuesHolder")) {
                                        TypedArray typedArrayH2 = K.b.h(resources2, theme2, attributeSetAsAttributeSet, f5247i);
                                        String strD = K.b.d(typedArrayH2, xmlResourceParser, "propertyName", i18);
                                        int i21 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : typedArrayH2.getInt(i20, 4);
                                        int i22 = i21;
                                        ArrayList arrayList5 = null;
                                        while (true) {
                                            int next2 = xmlResourceParser.next();
                                            i13 = depth;
                                            if (next2 == 3 || next2 == 1) {
                                                break;
                                            }
                                            if (xmlResourceParser.getName().equals("keyframe")) {
                                                int[] iArr = j;
                                                if (i22 == 4) {
                                                    TypedArray typedArrayH3 = K.b.h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                    TypedValue typedValuePeekValue = !K.b.e(xmlResourceParser, "value") ? null : typedArrayH3.peekValue(0);
                                                    int i23 = (typedValuePeekValue == null || !c(typedValuePeekValue.type)) ? 0 : 3;
                                                    typedArrayH3.recycle();
                                                    i22 = i23;
                                                }
                                                TypedArray typedArrayH4 = K.b.h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                float f10 = K.b.e(xmlResourceParser, "fraction") ? typedArrayH4.getFloat(3, -1.0f) : -1.0f;
                                                TypedValue typedValuePeekValue2 = !K.b.e(xmlResourceParser, "value") ? null : typedArrayH4.peekValue(0);
                                                boolean z6 = typedValuePeekValue2 != null;
                                                int i24 = i22 == 4 ? (z6 && c(typedValuePeekValue2.type)) ? 3 : 0 : i22;
                                                if (!z6) {
                                                    keyframeOfFloat = i24 == 0 ? Keyframe.ofFloat(f10) : Keyframe.ofInt(f10);
                                                } else if (i24 == 0) {
                                                    keyframeOfFloat = Keyframe.ofFloat(f10, xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayH4.getFloat(0, 0.0f) : 0.0f);
                                                } else if (i24 == 1 || i24 == 3) {
                                                    keyframeOfFloat = Keyframe.ofInt(f10, xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayH4.getInt(0, 0) : 0);
                                                } else {
                                                    keyframeOfFloat = null;
                                                }
                                                int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayH4.getResourceId(1, 0) : 0;
                                                if (resourceId > 0) {
                                                    keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                                }
                                                typedArrayH4.recycle();
                                                if (keyframeOfFloat != null) {
                                                    if (arrayList5 == null) {
                                                        arrayList5 = new ArrayList();
                                                    }
                                                    arrayList5.add(keyframeOfFloat);
                                                }
                                                xmlResourceParser.next();
                                            }
                                            resources2 = resources;
                                            theme2 = theme;
                                            depth = i13;
                                            arrayList3 = arrayList3;
                                        }
                                        arrayList2 = arrayList3;
                                        if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                                            i15 = 3;
                                            propertyValuesHolderB = null;
                                        } else {
                                            Keyframe keyframe = (Keyframe) arrayList5.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList5.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            int i25 = size;
                                            Class cls = Integer.TYPE;
                                            Class cls2 = Float.TYPE;
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe2.setFraction(1.0f);
                                                } else {
                                                    arrayList5.add(arrayList5.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                    i25++;
                                                }
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList5.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                    i25++;
                                                }
                                            }
                                            int i26 = i25;
                                            Keyframe[] keyframeArr = new Keyframe[i26];
                                            arrayList5.toArray(keyframeArr);
                                            int i27 = 0;
                                            while (i27 < i26) {
                                                Keyframe keyframe3 = keyframeArr[i27];
                                                if (keyframe3.getFraction() >= 0.0f) {
                                                    i16 = i26;
                                                } else if (i27 == 0) {
                                                    keyframe3.setFraction(0.0f);
                                                    i16 = i26;
                                                } else {
                                                    int i28 = i26 - 1;
                                                    if (i27 == i28) {
                                                        keyframe3.setFraction(1.0f);
                                                        i16 = i26;
                                                    } else {
                                                        int i29 = i27;
                                                        for (int i30 = i27 + 1; i30 < i28 && keyframeArr[i30].getFraction() < 0.0f; i30++) {
                                                            i29 = i30;
                                                        }
                                                        float fraction3 = (keyframeArr[i29 + 1].getFraction() - keyframeArr[i27 - 1].getFraction()) / ((i29 - i27) + 2);
                                                        int i31 = i27;
                                                        while (i31 <= i29) {
                                                            float f11 = fraction3;
                                                            keyframeArr[i31].setFraction(keyframeArr[i31 - 1].getFraction() + f11);
                                                            i31++;
                                                            i26 = i26;
                                                            fraction3 = f11;
                                                        }
                                                        i16 = i26;
                                                    }
                                                }
                                                i27++;
                                                i26 = i16;
                                            }
                                            propertyValuesHolderB = PropertyValuesHolder.ofKeyframe(strD, keyframeArr);
                                            i15 = 3;
                                            if (i22 == 3) {
                                                propertyValuesHolderB.setEvaluator(g.a);
                                            }
                                        }
                                        i14 = 0;
                                        i12 = 1;
                                        if (propertyValuesHolderB == null) {
                                            propertyValuesHolderB = b(typedArrayH2, i21, 0, 1, strD);
                                        }
                                        if (propertyValuesHolderB != null) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(propertyValuesHolderB);
                                        }
                                        typedArrayH2.recycle();
                                    } else {
                                        i12 = i19;
                                        i13 = depth;
                                        arrayList2 = arrayList3;
                                        i14 = i17;
                                        i15 = i18;
                                    }
                                    xmlResourceParser.next();
                                    resources2 = resources;
                                    i17 = i14;
                                    i19 = i12;
                                    i18 = i15;
                                    i20 = i20;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth = i13;
                                    arrayList3 = arrayList2;
                                    theme2 = theme;
                                }
                            }
                            int i32 = i19;
                            i11 = depth;
                            arrayList = arrayList3;
                            int i33 = i17;
                            if (arrayList4 != null) {
                                int size2 = arrayList4.size();
                                propertyValuesHolderArr = new PropertyValuesHolder[size2];
                                for (int i34 = i33; i34 < size2; i34++) {
                                    propertyValuesHolderArr[i34] = (PropertyValuesHolder) arrayList4.get(i34);
                                }
                            } else {
                                propertyValuesHolderArr = null;
                            }
                            if (propertyValuesHolderArr != null && (animator2 instanceof ValueAnimator)) {
                                ((ValueAnimator) animator2).setValues(propertyValuesHolderArr);
                            }
                            i17 = i32;
                            animator2 = animator2;
                        }
                    }
                    if (animatorSet == null && i17 == 0) {
                        arrayList3 = arrayList == null ? new ArrayList() : arrayList;
                        arrayList3.add(animator2);
                    } else {
                        arrayList3 = arrayList;
                    }
                    depth = i11;
                }
                animator = animatorD;
                i11 = depth;
                arrayList = arrayList3;
                animator2 = animator;
                if (animatorSet == null) {
                    arrayList3 = arrayList;
                } else {
                    arrayList3 = arrayList;
                }
                depth = i11;
            }
        }
        ArrayList arrayList6 = arrayList3;
        if (animatorSet != null && arrayList6 != null) {
            Animator[] animatorArr = new Animator[arrayList6.size()];
            Iterator it = arrayList6.iterator();
            int i35 = 0;
            while (it.hasNext()) {
                animatorArr[i35] = (Animator) it.next();
                i35++;
            }
            if (i10 == 0) {
                animatorSet.playTogether(animatorArr);
                return animator2;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return animator2;
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i10, int i11, int i12, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        int i13 = 0;
        boolean z6 = typedValuePeekValue != null;
        int i14 = z6 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z10 = typedValuePeekValue2 != null;
        int i15 = z10 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z6 && c(i14)) || (z10 && c(i15))) ? 3 : 0;
        }
        boolean z11 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            L.f[] fVarArrK = C3.b.k(string);
            L.f[] fVarArrK2 = C3.b.k(string2);
            if (fVarArrK != null || fVarArrK2 != null) {
                if (fVarArrK != null) {
                    f fVar = new f(i13);
                    if (fVarArrK2 == null) {
                        return PropertyValuesHolder.ofObject(str, fVar, fVarArrK);
                    }
                    if (C3.b.d(fVarArrK, fVarArrK2)) {
                        return PropertyValuesHolder.ofObject(str, fVar, fVarArrK, fVarArrK2);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (fVarArrK2 != null) {
                    return PropertyValuesHolder.ofObject(str, new f(i13), fVarArrK2);
                }
            }
            return null;
        }
        g gVar = i10 == 3 ? g.a : null;
        if (z11) {
            if (z6) {
                float dimension = i14 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z10) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i15 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i15 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z6) {
            if (i14 == 5) {
                color2 = (int) typedArray.getDimension(i11, 0.0f);
            } else {
                color2 = c(i14) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            }
            if (z10) {
                if (i15 == 5) {
                    color3 = (int) typedArray.getDimension(i12, 0.0f);
                } else {
                    color3 = c(i15) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z10) {
            if (i15 == 5) {
                color = (int) typedArray.getDimension(i12, 0.0f);
            } else {
                color = c(i15) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt != null && gVar != null) {
            propertyValuesHolderOfInt.setEvaluator(gVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        int resourceId = 0;
        TypedArray typedArrayH = K.b.h(resources, theme, attributeSet, f5245g);
        TypedArray typedArrayH2 = K.b.h(resources, theme, attributeSet, f5248k);
        ValueAnimator valueAnimator2 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j10 = K.b.e(xmlResourceParser, "duration") ? typedArrayH.getInt(1, 300) : 300;
        long j11 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) ? 0 : typedArrayH.getInt(2, 0);
        int i10 = !(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) ? 4 : typedArrayH.getInt(7, 4);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i10 == 4) {
                TypedValue typedValuePeekValue = typedArrayH.peekValue(5);
                boolean z6 = typedValuePeekValue != null;
                int i11 = z6 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayH.peekValue(6);
                boolean z10 = typedValuePeekValue2 != null;
                i10 = ((z6 && c(i11)) || (z10 && c(z10 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayH, i10, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator2.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator2.setDuration(j10);
        valueAnimator2.setStartDelay(j11);
        valueAnimator2.setRepeatCount(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayH.getInt(3, 0) : 0);
        valueAnimator2.setRepeatMode(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayH.getInt(4, 1) : 1);
        if (typedArrayH2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator2;
            String strD = K.b.d(typedArrayH2, xmlResourceParser, "pathData", 1);
            if (strD != null) {
                String strD2 = K.b.d(typedArrayH2, xmlResourceParser, "propertyXName", 2);
                String strD3 = K.b.d(typedArrayH2, xmlResourceParser, "propertyYName", 3);
                if (i10 != 2) {
                }
                if (strD2 == null && strD3 == null) {
                    throw new InflateException(typedArrayH2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathL = C3.b.l(strD);
                PathMeasure pathMeasure = new PathMeasure(pathL, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathL, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f10 = length / (iMin - 1);
                int i12 = 0;
                int i13 = 0;
                float f11 = 0.0f;
                while (true) {
                    if (i12 >= iMin) {
                        break;
                    }
                    int i14 = i12;
                    pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i13)).floatValue(), fArr3, null);
                    fArr[i14] = fArr3[0];
                    fArr2[i14] = fArr3[1];
                    int i15 = i13 + 1;
                    f11 += f10;
                    if (i15 < arrayList.size() && f11 > ((Float) arrayList.get(i15)).floatValue()) {
                        pathMeasure2.nextContour();
                        i13 = i15;
                    }
                    i12 = i14 + 1;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strD2 != null ? PropertyValuesHolder.ofFloat(strD2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strD3 != null ? PropertyValuesHolder.ofFloat(strD3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat);
                } else {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                }
                resourceId = 0;
            } else {
                objectAnimator2.setPropertyName(K.b.d(typedArrayH2, xmlResourceParser, "propertyName", 0));
            }
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            resourceId = typedArrayH.getResourceId(resourceId, resourceId);
        }
        if (resourceId > 0) {
            valueAnimator = valueAnimator2;
            valueAnimator.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator = valueAnimator2;
        }
        typedArrayH.recycle();
        if (typedArrayH2 != null) {
            typedArrayH2.recycle();
        }
        return valueAnimator;
    }
}
