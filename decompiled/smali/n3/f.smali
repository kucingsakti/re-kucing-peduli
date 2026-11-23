.class public final Ln3/f;
.super Ln3/h;
.source "SourceFile"


# static fields
.field public static final I:Ln3/e;


# instance fields
.field public final D:Ln3/l;

.field public final E:Lk0/e;

.field public final F:Lk0/d;

.field public final G:Ln3/i;

.field public H:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ln3/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln3/f;->I:Ln3/e;

    .line 7
    .line 8
    return-void
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

.method public constructor <init>(Landroid/content/Context;Ln3/p;Ln3/l;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Ln3/h;-><init>(Landroid/content/Context;Ln3/p;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Ln3/f;->H:Z

    .line 6
    .line 7
    iput-object p3, p0, Ln3/f;->D:Ln3/l;

    .line 8
    .line 9
    new-instance p2, Ln3/i;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Ln3/f;->G:Ln3/i;

    .line 15
    .line 16
    new-instance p2, Lk0/e;

    .line 17
    .line 18
    invoke-direct {p2}, Lk0/e;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Ln3/f;->E:Lk0/e;

    .line 22
    .line 23
    const/high16 p3, 0x3f800000    # 1.0f

    .line 24
    .line 25
    float-to-double v0, p3

    .line 26
    iput-wide v0, p2, Lk0/e;->b:D

    .line 27
    .line 28
    iput-boolean p1, p2, Lk0/e;->c:Z

    .line 29
    .line 30
    const/high16 p1, 0x42480000    # 50.0f

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Lk0/e;->a(F)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Lk0/d;

    .line 36
    .line 37
    invoke-direct {p1, p0}, Lk0/d;-><init>(Ln3/f;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Ln3/f;->F:Lk0/d;

    .line 41
    .line 42
    iput-object p2, p1, Lk0/d;->m:Lk0/e;

    .line 43
    .line 44
    iget p1, p0, Ln3/h;->z:F

    .line 45
    .line 46
    cmpl-float p1, p1, p3

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    iput p3, p0, Ln3/h;->z:F

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method


# virtual methods
.method public final d(ZZZ)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Ln3/h;->d(ZZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object p2, p0, Ln3/h;->u:Ln3/a;

    .line 6
    .line 7
    iget-object p3, p0, Ln3/h;->s:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string p2, "animator_duration_scale"

    .line 17
    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-static {p3, p2, v0}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const/4 p3, 0x0

    .line 25
    cmpl-float p3, p2, p3

    .line 26
    .line 27
    if-nez p3, :cond_0

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    iput-boolean p2, p0, Ln3/f;->H:Z

    .line 31
    .line 32
    return p1

    .line 33
    :cond_0
    const/4 p3, 0x0

    .line 34
    iput-boolean p3, p0, Ln3/f;->H:Z

    .line 35
    .line 36
    const/high16 p3, 0x42480000    # 50.0f

    .line 37
    .line 38
    div-float/2addr p3, p2

    .line 39
    iget-object p2, p0, Ln3/f;->E:Lk0/e;

    .line 40
    .line 41
    invoke-virtual {p2, p3}, Lk0/e;->a(F)V

    .line 42
    .line 43
    .line 44
    return p1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_8

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_8

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_8

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Ln3/f;->D:Ln3/l;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {p0}, Ln3/h;->b()F

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    iget-object v0, p0, Ln3/h;->v:Landroid/animation/ObjectAnimator;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v8, 0x1

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move v6, v8

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    move v6, v1

    .line 59
    :goto_1
    iget-object v0, p0, Ln3/h;->w:Landroid/animation/ObjectAnimator;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move v7, v8

    .line 71
    :goto_2
    move-object v3, p1

    .line 72
    goto :goto_4

    .line 73
    :cond_4
    :goto_3
    move v7, v1

    .line 74
    goto :goto_2

    .line 75
    :goto_4
    invoke-virtual/range {v2 .. v7}, Ln3/j;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    .line 76
    .line 77
    .line 78
    iget-object v4, p0, Ln3/h;->A:Landroid/graphics/Paint;

    .line 79
    .line 80
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 81
    .line 82
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 86
    .line 87
    .line 88
    iget-object v10, p0, Ln3/h;->t:Ln3/p;

    .line 89
    .line 90
    iget-object v2, v10, Ln3/p;->c:[I

    .line 91
    .line 92
    aget v2, v2, v1

    .line 93
    .line 94
    iget-object v11, p0, Ln3/f;->G:Ln3/i;

    .line 95
    .line 96
    iput v2, v11, Ln3/i;->c:I

    .line 97
    .line 98
    iget v2, v10, Ln3/p;->g:I

    .line 99
    .line 100
    const/4 v12, 0x0

    .line 101
    if-lez v2, :cond_6

    .line 102
    .line 103
    iget-object v3, p0, Ln3/f;->D:Ln3/l;

    .line 104
    .line 105
    instance-of v3, v3, Ln3/l;

    .line 106
    .line 107
    if-eqz v3, :cond_5

    .line 108
    .line 109
    :goto_5
    move v9, v2

    .line 110
    goto :goto_6

    .line 111
    :cond_5
    int-to-float v2, v2

    .line 112
    iget v3, v11, Ln3/i;->b:F

    .line 113
    .line 114
    const v5, 0x3c23d70a    # 0.01f

    .line 115
    .line 116
    .line 117
    invoke-static {v3, v12, v5}, Ls3/a;->d(FFF)F

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    mul-float/2addr v3, v2

    .line 122
    div-float/2addr v3, v5

    .line 123
    float-to-int v2, v3

    .line 124
    goto :goto_5

    .line 125
    :goto_6
    iget-object v2, p0, Ln3/f;->D:Ln3/l;

    .line 126
    .line 127
    iget v5, v11, Ln3/i;->b:F

    .line 128
    .line 129
    iget v7, v10, Ln3/p;->d:I

    .line 130
    .line 131
    iget v8, p0, Ln3/h;->B:I

    .line 132
    .line 133
    const/high16 v6, 0x3f800000    # 1.0f

    .line 134
    .line 135
    move-object v3, p1

    .line 136
    invoke-virtual/range {v2 .. v9}, Ln3/l;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 137
    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_6
    iget-object v2, p0, Ln3/f;->D:Ln3/l;

    .line 141
    .line 142
    iget v7, v10, Ln3/p;->d:I

    .line 143
    .line 144
    iget v8, p0, Ln3/h;->B:I

    .line 145
    .line 146
    const/4 v5, 0x0

    .line 147
    const/high16 v6, 0x3f800000    # 1.0f

    .line 148
    .line 149
    const/4 v9, 0x0

    .line 150
    move-object v3, p1

    .line 151
    invoke-virtual/range {v2 .. v9}, Ln3/l;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 152
    .line 153
    .line 154
    :goto_7
    iget-object v2, p0, Ln3/f;->D:Ln3/l;

    .line 155
    .line 156
    iget v3, p0, Ln3/h;->B:I

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget v5, v11, Ln3/i;->c:I

    .line 162
    .line 163
    invoke-static {v5, v3}, LJ7/a;->c(II)I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    iget v5, v11, Ln3/i;->a:F

    .line 168
    .line 169
    iget v6, v11, Ln3/i;->b:F

    .line 170
    .line 171
    iget v8, v11, Ln3/i;->d:I

    .line 172
    .line 173
    move v9, v8

    .line 174
    move-object v3, p1

    .line 175
    invoke-virtual/range {v2 .. v9}, Ln3/l;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 176
    .line 177
    .line 178
    iget-object v2, p0, Ln3/f;->D:Ln3/l;

    .line 179
    .line 180
    iget-object v3, v10, Ln3/p;->c:[I

    .line 181
    .line 182
    aget v1, v3, v1

    .line 183
    .line 184
    iget v3, p0, Ln3/h;->B:I

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {v1, v3}, LJ7/a;->c(II)I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    iget-object v3, v2, Ln3/j;->a:Ln3/p;

    .line 194
    .line 195
    iget v5, v3, Ln3/p;->k:I

    .line 196
    .line 197
    if-lez v5, :cond_7

    .line 198
    .line 199
    if-eqz v1, :cond_7

    .line 200
    .line 201
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 205
    .line 206
    .line 207
    new-instance v5, Landroid/graphics/PointF;

    .line 208
    .line 209
    iget v0, v2, Ln3/l;->b:F

    .line 210
    .line 211
    const/high16 v1, 0x40000000    # 2.0f

    .line 212
    .line 213
    div-float/2addr v0, v1

    .line 214
    iget v6, v2, Ln3/l;->c:F

    .line 215
    .line 216
    div-float/2addr v6, v1

    .line 217
    sub-float/2addr v0, v6

    .line 218
    invoke-direct {v5, v0, v12}, Landroid/graphics/PointF;-><init>(FF)V

    .line 219
    .line 220
    .line 221
    iget v0, v3, Ln3/p;->k:I

    .line 222
    .line 223
    int-to-float v7, v0

    .line 224
    const/4 v6, 0x0

    .line 225
    move v8, v7

    .line 226
    move-object v3, p1

    .line 227
    invoke-virtual/range {v2 .. v8}, Ln3/l;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/PointF;Landroid/graphics/PointF;FF)V

    .line 228
    .line 229
    .line 230
    :cond_7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 231
    .line 232
    .line 233
    :cond_8
    :goto_8
    return-void
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln3/f;->D:Ln3/l;

    .line 2
    .line 3
    iget-object v0, v0, Ln3/j;->a:Ln3/p;

    .line 4
    .line 5
    iget v0, v0, Ln3/p;->a:I

    .line 6
    .line 7
    return v0
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

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln3/f;->D:Ln3/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    return v0
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

.method public final jumpToCurrentState()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln3/f;->F:Lk0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/d;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    int-to-float v0, v0

    .line 11
    const v1, 0x461c4000    # 10000.0f

    .line 12
    .line 13
    .line 14
    div-float/2addr v0, v1

    .line 15
    iget-object v1, p0, Ln3/f;->G:Ln3/i;

    .line 16
    .line 17
    iput v0, v1, Ln3/i;->b:F

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final onLevelChange(I)Z
    .locals 9

    .line 1
    iget-boolean v0, p0, Ln3/f;->H:Z

    .line 2
    .line 3
    iget-object v1, p0, Ln3/f;->G:Ln3/i;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const v3, 0x461c4000    # 10000.0f

    .line 7
    .line 8
    .line 9
    iget-object v4, p0, Ln3/f;->F:Lk0/d;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v4}, Lk0/d;->b()V

    .line 14
    .line 15
    .line 16
    int-to-float p1, p1

    .line 17
    div-float/2addr p1, v3

    .line 18
    iput p1, v1, Ln3/i;->b:F

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_0
    iget v0, v1, Ln3/i;->b:F

    .line 26
    .line 27
    mul-float/2addr v0, v3

    .line 28
    iput v0, v4, Lk0/d;->b:F

    .line 29
    .line 30
    iput-boolean v2, v4, Lk0/d;->c:Z

    .line 31
    .line 32
    int-to-float p1, p1

    .line 33
    iget-boolean v0, v4, Lk0/d;->f:Z

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iput p1, v4, Lk0/d;->n:F

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_1
    iget-object v0, v4, Lk0/d;->m:Lk0/e;

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    new-instance v0, Lk0/e;

    .line 46
    .line 47
    invoke-direct {v0, p1}, Lk0/e;-><init>(F)V

    .line 48
    .line 49
    .line 50
    iput-object v0, v4, Lk0/d;->m:Lk0/e;

    .line 51
    .line 52
    :cond_2
    iget-object v0, v4, Lk0/d;->m:Lk0/e;

    .line 53
    .line 54
    float-to-double v5, p1

    .line 55
    iput-wide v5, v0, Lk0/e;->i:D

    .line 56
    .line 57
    double-to-float p1, v5

    .line 58
    float-to-double v5, p1

    .line 59
    iget p1, v4, Lk0/d;->g:F

    .line 60
    .line 61
    float-to-double v7, p1

    .line 62
    cmpl-double p1, v5, v7

    .line 63
    .line 64
    if-gtz p1, :cond_b

    .line 65
    .line 66
    iget p1, v4, Lk0/d;->h:F

    .line 67
    .line 68
    float-to-double v7, p1

    .line 69
    cmpg-double p1, v5, v7

    .line 70
    .line 71
    if-ltz p1, :cond_a

    .line 72
    .line 73
    iget p1, v4, Lk0/d;->j:F

    .line 74
    .line 75
    const/high16 v1, 0x3f400000    # 0.75f

    .line 76
    .line 77
    mul-float/2addr p1, v1

    .line 78
    float-to-double v5, p1

    .line 79
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    iput-wide v5, v0, Lk0/e;->d:D

    .line 84
    .line 85
    const-wide v7, 0x404f400000000000L    # 62.5

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    mul-double/2addr v5, v7

    .line 91
    iput-wide v5, v0, Lk0/e;->e:D

    .line 92
    .line 93
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-ne p1, v0, :cond_9

    .line 102
    .line 103
    iget-boolean p1, v4, Lk0/d;->f:Z

    .line 104
    .line 105
    if-nez p1, :cond_8

    .line 106
    .line 107
    if-nez p1, :cond_8

    .line 108
    .line 109
    iput-boolean v2, v4, Lk0/d;->f:Z

    .line 110
    .line 111
    iget-boolean p1, v4, Lk0/d;->c:Z

    .line 112
    .line 113
    if-nez p1, :cond_3

    .line 114
    .line 115
    iget-object p1, v4, Lk0/d;->e:Lt1/Y;

    .line 116
    .line 117
    iget-object v0, v4, Lk0/d;->d:Ln3/f;

    .line 118
    .line 119
    invoke-virtual {p1, v0}, Lt1/Y;->p(Ln3/f;)F

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    iput p1, v4, Lk0/d;->b:F

    .line 124
    .line 125
    :cond_3
    iget p1, v4, Lk0/d;->b:F

    .line 126
    .line 127
    iget v0, v4, Lk0/d;->g:F

    .line 128
    .line 129
    cmpl-float v0, p1, v0

    .line 130
    .line 131
    if-gtz v0, :cond_7

    .line 132
    .line 133
    iget v0, v4, Lk0/d;->h:F

    .line 134
    .line 135
    cmpg-float p1, p1, v0

    .line 136
    .line 137
    if-ltz p1, :cond_7

    .line 138
    .line 139
    sget-object p1, Lk0/b;->f:Ljava/lang/ThreadLocal;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-nez v0, :cond_4

    .line 146
    .line 147
    new-instance v0, Lk0/b;

    .line 148
    .line 149
    invoke-direct {v0}, Lk0/b;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, Lk0/b;

    .line 160
    .line 161
    iget-object v0, p1, Lk0/b;->b:Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-nez v1, :cond_6

    .line 168
    .line 169
    iget-object v1, p1, Lk0/b;->d:LY1/c;

    .line 170
    .line 171
    if-nez v1, :cond_5

    .line 172
    .line 173
    new-instance v1, LY1/c;

    .line 174
    .line 175
    iget-object v3, p1, Lk0/b;->c:Li3/b;

    .line 176
    .line 177
    invoke-direct {v1, v3}, LY1/c;-><init>(Li3/b;)V

    .line 178
    .line 179
    .line 180
    iput-object v1, p1, Lk0/b;->d:LY1/c;

    .line 181
    .line 182
    :cond_5
    iget-object p1, p1, Lk0/b;->d:LY1/c;

    .line 183
    .line 184
    iget-object v1, p1, LY1/c;->v:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, Lk0/a;

    .line 187
    .line 188
    iget-object p1, p1, LY1/c;->u:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p1, Landroid/view/Choreographer;

    .line 191
    .line 192
    invoke-virtual {p1, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 193
    .line 194
    .line 195
    :cond_6
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-nez p1, :cond_8

    .line 200
    .line 201
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 206
    .line 207
    const-string v0, "Starting value need to be in between min value and max value"

    .line 208
    .line 209
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p1

    .line 213
    :cond_8
    :goto_0
    return v2

    .line 214
    :cond_9
    new-instance p1, Landroid/util/AndroidRuntimeException;

    .line 215
    .line 216
    const-string v0, "Animations may only be started on the main thread"

    .line 217
    .line 218
    invoke-direct {p1, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw p1

    .line 222
    :cond_a
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 223
    .line 224
    const-string v0, "Final position of the spring cannot be less than the min value."

    .line 225
    .line 226
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw p1

    .line 230
    :cond_b
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 231
    .line 232
    const-string v0, "Final position of the spring cannot be greater than the max value."

    .line 233
    .line 234
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw p1
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
.end method
