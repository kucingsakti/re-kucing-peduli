.class public final Lcom/kcstream/cing/library/CircleProgressBar;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\r\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0018\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001b\u0010\u0014J\u0015\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001d\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001e\u0010\u000e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/kcstream/cing/library/CircleProgressBar;",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "getStrokeWidth",
        "()F",
        "strokeWidth",
        "Lh8/m;",
        "setStrokeWidth",
        "(F)V",
        "getProgress",
        "progress",
        "setProgress",
        "",
        "getMin",
        "()I",
        "min",
        "setMin",
        "(I)V",
        "getMax",
        "max",
        "setMax",
        "getColor",
        "color",
        "setColor",
        "setProgressWithAnimation",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final A:Landroid/graphics/Paint;

.field public s:F

.field public t:F

.field public u:I

.field public v:I

.field public final w:I

.field public x:I

.field public final y:Landroid/graphics/RectF;

.field public final z:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "attrs"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    .line 13
    .line 14
    const/high16 v0, 0x40800000    # 4.0f

    .line 15
    .line 16
    iput v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->s:F

    .line 17
    .line 18
    const/16 v0, 0x64

    .line 19
    .line 20
    iput v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->v:I

    .line 21
    .line 22
    const/16 v0, -0x5a

    .line 23
    .line 24
    iput v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->w:I

    .line 25
    .line 26
    const v0, -0xbbbbbc

    .line 27
    .line 28
    .line 29
    iput v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->x:I

    .line 30
    .line 31
    new-instance v0, Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->y:Landroid/graphics/RectF;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object v0, LD4/e;->a:[I

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "obtainStyledAttributes(...)"

    .line 50
    .line 51
    invoke-static {p1, p2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :try_start_0
    iget p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->s:F

    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    iput p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->s:F

    .line 62
    .line 63
    iget p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->t:F

    .line 64
    .line 65
    const/4 v0, 0x2

    .line 66
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    iput p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->t:F

    .line 71
    .line 72
    iget p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->x:I

    .line 73
    .line 74
    const/4 v0, 0x4

    .line 75
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    iput p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->x:I

    .line 80
    .line 81
    iget p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->u:I

    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    iput p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->u:I

    .line 89
    .line 90
    iget p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->v:I

    .line 91
    .line 92
    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    iput p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->v:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 99
    .line 100
    .line 101
    new-instance p1, Landroid/graphics/Paint;

    .line 102
    .line 103
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->z:Landroid/graphics/Paint;

    .line 107
    .line 108
    iget p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->x:I

    .line 109
    .line 110
    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    int-to-float v1, v1

    .line 115
    const v2, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    mul-float/2addr v1, v2

    .line 119
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    invoke-static {v1, v2, v3, p2}, Landroid/graphics/Color;->argb(IIII)I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->z:Landroid/graphics/Paint;

    .line 143
    .line 144
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 148
    .line 149
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->z:Landroid/graphics/Paint;

    .line 153
    .line 154
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget v1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->s:F

    .line 158
    .line 159
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 160
    .line 161
    .line 162
    new-instance p1, Landroid/graphics/Paint;

    .line 163
    .line 164
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 165
    .line 166
    .line 167
    iput-object p1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->A:Landroid/graphics/Paint;

    .line 168
    .line 169
    iget v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->x:I

    .line 170
    .line 171
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 172
    .line 173
    .line 174
    iget-object p1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->A:Landroid/graphics/Paint;

    .line 175
    .line 176
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->A:Landroid/graphics/Paint;

    .line 183
    .line 184
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    iget p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->s:F

    .line 188
    .line 189
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :catchall_0
    move-exception p2

    .line 194
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 195
    .line 196
    .line 197
    throw p2
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
.end method


# virtual methods
.method public final getColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->x:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final getMax()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->v:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final getMin()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->u:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final getProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->t:F

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final getStrokeWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->s:F

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->y:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->z:Landroid/graphics/Paint;

    .line 15
    .line 16
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 20
    .line 21
    .line 22
    const/16 v0, 0x168

    .line 23
    .line 24
    int-to-float v0, v0

    .line 25
    iget v1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->t:F

    .line 26
    .line 27
    mul-float/2addr v0, v1

    .line 28
    iget v1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->v:I

    .line 29
    .line 30
    int-to-float v1, v1

    .line 31
    div-float v5, v0, v1

    .line 32
    .line 33
    iget-object v3, p0, Lcom/kcstream/cing/library/CircleProgressBar;->y:Landroid/graphics/RectF;

    .line 34
    .line 35
    invoke-static {v3}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->w:I

    .line 39
    .line 40
    int-to-float v4, v0

    .line 41
    iget-object v7, p0, Lcom/kcstream/cing/library/CircleProgressBar;->A:Landroid/graphics/Paint;

    .line 42
    .line 43
    invoke-static {v7}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    move-object v2, p1

    .line 48
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 49
    .line 50
    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0, p2}, Landroid/view/View;->getDefaultSize(II)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0, p1}, Landroid/view/View;->getDefaultSize(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lcom/kcstream/cing/library/CircleProgressBar;->y:Landroid/graphics/RectF;

    .line 25
    .line 26
    invoke-static {p2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    int-to-float v0, v0

    .line 31
    iget v1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->s:F

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    int-to-float v2, v2

    .line 35
    div-float v3, v1, v2

    .line 36
    .line 37
    add-float/2addr v3, v0

    .line 38
    div-float v4, v1, v2

    .line 39
    .line 40
    add-float/2addr v4, v0

    .line 41
    int-to-float p1, p1

    .line 42
    div-float v0, v1, v2

    .line 43
    .line 44
    sub-float v0, p1, v0

    .line 45
    .line 46
    div-float/2addr v1, v2

    .line 47
    sub-float/2addr p1, v1

    .line 48
    invoke-virtual {p2, v3, v4, v0, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 49
    .line 50
    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method public final setColor(I)V
    .locals 5

    .line 1
    iput p1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->x:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->z:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    int-to-float v1, v1

    .line 13
    const v2, 0x3e99999a    # 0.3f

    .line 14
    .line 15
    .line 16
    mul-float/2addr v1, v2

    .line 17
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->A:Landroid/graphics/Paint;

    .line 41
    .line 42
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 52
    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final setMax(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->v:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final setMin(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->u:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final setProgress(F)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    iput p1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->t:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final setProgressWithAnimation(F)V
    .locals 3

    .line 1
    const-string v0, "progress"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [F

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput p1, v1, v2

    .line 8
    .line 9
    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-wide/16 v0, 0x320

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 16
    .line 17
    .line 18
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final setStrokeWidth(F)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kcstream/cing/library/CircleProgressBar;->s:F

    .line 2
    .line 3
    iget-object v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->z:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/kcstream/cing/library/CircleProgressBar;->A:Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
