package p;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: p.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0738y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f14157d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14159c;

    public /* synthetic */ C0738y() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((o1.k) ((p081i3.b) this.f14159c).f12212t).getClass();
        if (keyListener instanceof p126n0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new p126n0.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i10) {
        switch (this.a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f14158b;
                Y1.c cVarE = Y1.c.E(absSeekBar.getContext(), attributeSet, f14157d, i10);
                Drawable drawableW = cVarE.w(0);
                if (drawableW != null) {
                    if (drawableW instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableW;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i11), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableW = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableW);
                }
                Drawable drawableW2 = cVarE.w(1);
                if (drawableW2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableW2, false));
                }
                cVarE.J();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f14158b).getContext().obtainStyledAttributes(attributeSet, p069h.a.f11617i, i10, 0);
                try {
                    boolean z6 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z6 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z6);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public p126n0.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        p081i3.b bVar = (p081i3.b) this.f14159c;
        if (inputConnection == null) {
            bVar.getClass();
            inputConnection = null;
        } else {
            o1.k kVar = (o1.k) bVar.f12212t;
            kVar.getClass();
            if (!(inputConnection instanceof p126n0.b)) {
                inputConnection = new p126n0.b((EditText) kVar.f13638s, inputConnection, editorInfo);
            }
        }
        return (p126n0.b) inputConnection;
    }

    public void d(boolean z6) {
        p126n0.i iVar = (p126n0.i) ((o1.k) ((p081i3.b) this.f14159c).f12212t).f13639t;
        if (iVar.f13299u != z6) {
            if (iVar.f13298t != null) {
                p106l0.g gVarA = p106l0.g.a();
                p126n0.h hVar = iVar.f13298t;
                gVarA.getClass();
                xa.d.d(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = gVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    gVarA.f12851b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            iVar.f13299u = z6;
            if (z6) {
                p126n0.i.a(iVar.f13297s, p106l0.g.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z6) {
        if (drawable instanceof M.g) {
            ((M.h) ((M.g) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id = layerDrawable.getId(i10);
                    drawableArr[i10] = e(layerDrawable.getDrawable(i10), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
                    layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
                    layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
                    layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
                    layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
                    layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
                    layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
                    layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
                    layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f14159c) == null) {
                    this.f14159c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z6 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0738y(AbsSeekBar absSeekBar) {
        this.f14158b = absSeekBar;
    }

    public C0738y(EditText editText) {
        this.f14158b = editText;
        this.f14159c = new p081i3.b(editText);
    }
}
