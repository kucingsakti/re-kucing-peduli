package p106l0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import o1.h;
import p116m0.a;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
public final class s extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f12885b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextPaint f12888e;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f12886c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f12887d = 1.0f;

    public s(r rVar) {
        d.d(rVar, "rasterizer cannot be null");
        this.f12885b = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f12888e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f12888e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f10, i12, f10 + this.f12886c, i14, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        g.a().getClass();
        float f11 = i13;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        r rVar = this.f12885b;
        h hVar = rVar.f12883b;
        Typeface typeface = (Typeface) hVar.f13635v;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) hVar.f13633t, rVar.a * 2, 2, f10, f11, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        r rVar = this.f12885b;
        a aVarB = rVar.b();
        int iA = aVarB.a(14);
        this.f12887d = fAbs / (iA != 0 ? ((ByteBuffer) aVarB.f4778v).getShort(iA + aVarB.f4775s) : (short) 0);
        a aVarB2 = rVar.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarB2.f4778v).getShort(iA2 + aVarB2.f4775s);
        }
        a aVarB3 = rVar.b();
        int iA3 = aVarB3.a(12);
        short s9 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarB3.f4778v).getShort(iA3 + aVarB3.f4775s) : (short) 0) * this.f12887d);
        this.f12886c = s9;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s9;
    }
}
