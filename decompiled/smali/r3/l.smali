.class public final Lr3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[Lr3/t;

.field public final b:[Landroid/graphics/Matrix;

.field public final c:[Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/PointF;

.field public final e:Landroid/graphics/Path;

.field public final f:Landroid/graphics/Path;

.field public final g:Lr3/t;

.field public final h:[F

.field public final i:[F

.field public final j:Landroid/graphics/Path;

.field public final k:Landroid/graphics/Path;

.field public final l:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [Lr3/t;

    .line 6
    .line 7
    iput-object v1, p0, Lr3/l;->a:[Lr3/t;

    .line 8
    .line 9
    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 10
    .line 11
    iput-object v1, p0, Lr3/l;->b:[Landroid/graphics/Matrix;

    .line 12
    .line 13
    new-array v1, v0, [Landroid/graphics/Matrix;

    .line 14
    .line 15
    iput-object v1, p0, Lr3/l;->c:[Landroid/graphics/Matrix;

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/PointF;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lr3/l;->d:Landroid/graphics/PointF;

    .line 23
    .line 24
    new-instance v1, Landroid/graphics/Path;

    .line 25
    .line 26
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lr3/l;->e:Landroid/graphics/Path;

    .line 30
    .line 31
    new-instance v1, Landroid/graphics/Path;

    .line 32
    .line 33
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lr3/l;->f:Landroid/graphics/Path;

    .line 37
    .line 38
    new-instance v1, Lr3/t;

    .line 39
    .line 40
    invoke-direct {v1}, Lr3/t;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lr3/l;->g:Lr3/t;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    new-array v2, v1, [F

    .line 47
    .line 48
    iput-object v2, p0, Lr3/l;->h:[F

    .line 49
    .line 50
    new-array v1, v1, [F

    .line 51
    .line 52
    iput-object v1, p0, Lr3/l;->i:[F

    .line 53
    .line 54
    new-instance v1, Landroid/graphics/Path;

    .line 55
    .line 56
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lr3/l;->j:Landroid/graphics/Path;

    .line 60
    .line 61
    new-instance v1, Landroid/graphics/Path;

    .line 62
    .line 63
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, Lr3/l;->k:Landroid/graphics/Path;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    iput-boolean v1, p0, Lr3/l;->l:Z

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    :goto_0
    if-ge v1, v0, :cond_0

    .line 73
    .line 74
    iget-object v2, p0, Lr3/l;->a:[Lr3/t;

    .line 75
    .line 76
    new-instance v3, Lr3/t;

    .line 77
    .line 78
    invoke-direct {v3}, Lr3/t;-><init>()V

    .line 79
    .line 80
    .line 81
    aput-object v3, v2, v1

    .line 82
    .line 83
    iget-object v2, p0, Lr3/l;->b:[Landroid/graphics/Matrix;

    .line 84
    .line 85
    new-instance v3, Landroid/graphics/Matrix;

    .line 86
    .line 87
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 88
    .line 89
    .line 90
    aput-object v3, v2, v1

    .line 91
    .line 92
    iget-object v2, p0, Lr3/l;->c:[Landroid/graphics/Matrix;

    .line 93
    .line 94
    new-instance v3, Landroid/graphics/Matrix;

    .line 95
    .line 96
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 97
    .line 98
    .line 99
    aput-object v3, v2, v1

    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    return-void
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
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
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
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
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
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
.end method


# virtual methods
.method public final a(Lr3/j;FLandroid/graphics/RectF;Lk7/e;Landroid/graphics/Path;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    .line 1
    invoke-virtual {v4}, Landroid/graphics/Path;->rewind()V

    .line 2
    iget-object v5, v0, Lr3/l;->e:Landroid/graphics/Path;

    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 3
    iget-object v6, v0, Lr3/l;->f:Landroid/graphics/Path;

    invoke-virtual {v6}, Landroid/graphics/Path;->rewind()V

    .line 4
    sget-object v7, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v6, v2, v7}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    const/4 v8, 0x0

    .line 5
    :goto_0
    iget-object v9, v0, Lr3/l;->c:[Landroid/graphics/Matrix;

    iget-object v10, v0, Lr3/l;->b:[Landroid/graphics/Matrix;

    iget-object v11, v0, Lr3/l;->a:[Lr3/t;

    const/4 v12, 0x1

    const/4 v13, 0x4

    const/4 v14, 0x2

    const/4 v15, 0x3

    const/16 v16, 0x0

    iget-object v7, v0, Lr3/l;->h:[F

    if-ge v8, v13, :cond_9

    if-eq v8, v12, :cond_2

    if-eq v8, v14, :cond_1

    if-eq v8, v15, :cond_0

    .line 6
    iget-object v13, v1, Lr3/j;->f:Lr3/c;

    goto :goto_1

    .line 7
    :cond_0
    iget-object v13, v1, Lr3/j;->e:Lr3/c;

    goto :goto_1

    .line 8
    :cond_1
    iget-object v13, v1, Lr3/j;->h:Lr3/c;

    goto :goto_1

    .line 9
    :cond_2
    iget-object v13, v1, Lr3/j;->g:Lr3/c;

    :goto_1
    if-eq v8, v12, :cond_5

    if-eq v8, v14, :cond_4

    if-eq v8, v15, :cond_3

    .line 10
    iget-object v15, v1, Lr3/j;->b:LC8/E;

    goto :goto_2

    .line 11
    :cond_3
    iget-object v15, v1, Lr3/j;->a:LC8/E;

    goto :goto_2

    .line 12
    :cond_4
    iget-object v15, v1, Lr3/j;->d:LC8/E;

    goto :goto_2

    .line 13
    :cond_5
    iget-object v15, v1, Lr3/j;->c:LC8/E;

    .line 14
    :goto_2
    aget-object v14, v11, v8

    .line 15
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-interface {v13, v2}, Lr3/c;->a(Landroid/graphics/RectF;)F

    move-result v13

    move/from16 v12, p2

    invoke-virtual {v15, v14, v12, v13}, LC8/E;->o(Lr3/t;FF)V

    add-int/lit8 v13, v8, 0x1

    .line 17
    rem-int/lit8 v14, v13, 0x4

    mul-int/lit8 v14, v14, 0x5a

    int-to-float v14, v14

    .line 18
    aget-object v15, v10, v8

    invoke-virtual {v15}, Landroid/graphics/Matrix;->reset()V

    .line 19
    iget-object v15, v0, Lr3/l;->d:Landroid/graphics/PointF;

    move-object/from16 v19, v9

    const/4 v9, 0x1

    if-eq v8, v9, :cond_8

    const/4 v9, 0x2

    if-eq v8, v9, :cond_7

    const/4 v9, 0x3

    if-eq v8, v9, :cond_6

    .line 20
    iget v9, v2, Landroid/graphics/RectF;->right:F

    move/from16 v17, v8

    iget v8, v2, Landroid/graphics/RectF;->top:F

    invoke-virtual {v15, v9, v8}, Landroid/graphics/PointF;->set(FF)V

    goto :goto_3

    :cond_6
    move/from16 v17, v8

    .line 21
    iget v8, v2, Landroid/graphics/RectF;->left:F

    iget v9, v2, Landroid/graphics/RectF;->top:F

    invoke-virtual {v15, v8, v9}, Landroid/graphics/PointF;->set(FF)V

    goto :goto_3

    :cond_7
    move/from16 v17, v8

    .line 22
    iget v8, v2, Landroid/graphics/RectF;->left:F

    iget v9, v2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v15, v8, v9}, Landroid/graphics/PointF;->set(FF)V

    goto :goto_3

    :cond_8
    move/from16 v17, v8

    .line 23
    iget v8, v2, Landroid/graphics/RectF;->right:F

    iget v9, v2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v15, v8, v9}, Landroid/graphics/PointF;->set(FF)V

    .line 24
    :goto_3
    aget-object v8, v10, v17

    iget v9, v15, Landroid/graphics/PointF;->x:F

    iget v15, v15, Landroid/graphics/PointF;->y:F

    invoke-virtual {v8, v9, v15}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 25
    aget-object v8, v10, v17

    invoke-virtual {v8, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 26
    aget-object v8, v11, v17

    .line 27
    iget v9, v8, Lr3/t;->b:F

    .line 28
    aput v9, v7, v16

    .line 29
    iget v8, v8, Lr3/t;->c:F

    const/16 v18, 0x1

    .line 30
    aput v8, v7, v18

    .line 31
    aget-object v8, v10, v17

    invoke-virtual {v8, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 32
    aget-object v8, v19, v17

    invoke-virtual {v8}, Landroid/graphics/Matrix;->reset()V

    .line 33
    aget-object v8, v19, v17

    aget v9, v7, v16

    aget v7, v7, v18

    invoke-virtual {v8, v9, v7}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 34
    aget-object v7, v19, v17

    invoke-virtual {v7, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    move v8, v13

    goto/16 :goto_0

    :cond_9
    move-object/from16 v19, v9

    move/from16 v8, v16

    :goto_4
    if-ge v8, v13, :cond_13

    .line 35
    aget-object v9, v11, v8

    .line 36
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x0

    .line 37
    aput v12, v7, v16

    .line 38
    iget v9, v9, Lr3/t;->a:F

    const/16 v18, 0x1

    .line 39
    aput v9, v7, v18

    .line 40
    aget-object v9, v10, v8

    invoke-virtual {v9, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    if-nez v8, :cond_a

    .line 41
    aget v9, v7, v16

    aget v14, v7, v18

    invoke-virtual {v4, v9, v14}, Landroid/graphics/Path;->moveTo(FF)V

    goto :goto_5

    .line 42
    :cond_a
    aget v9, v7, v16

    aget v14, v7, v18

    invoke-virtual {v4, v9, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 43
    :goto_5
    aget-object v9, v11, v8

    aget-object v14, v10, v8

    invoke-virtual {v9, v14, v4}, Lr3/t;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    if-eqz v3, :cond_b

    .line 44
    aget-object v9, v11, v8

    aget-object v14, v10, v8

    .line 45
    iget-object v15, v3, Lk7/e;->s:Ljava/lang/Object;

    check-cast v15, Lr3/g;

    iget-object v13, v15, Lr3/g;->v:Ljava/util/BitSet;

    .line 46
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p2, v12

    move/from16 v12, v16

    invoke-virtual {v13, v8, v12}, Ljava/util/BitSet;->set(IZ)V

    .line 47
    iget v12, v9, Lr3/t;->e:F

    .line 48
    invoke-virtual {v9, v12}, Lr3/t;->a(F)V

    .line 49
    new-instance v12, Landroid/graphics/Matrix;

    invoke-direct {v12, v14}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 50
    new-instance v13, Ljava/util/ArrayList;

    iget-object v9, v9, Lr3/t;->g:Ljava/util/ArrayList;

    invoke-direct {v13, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 51
    new-instance v9, Lr3/m;

    invoke-direct {v9, v13, v12}, Lr3/m;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 52
    iget-object v12, v15, Lr3/g;->t:[Lr3/s;

    aput-object v9, v12, v8

    goto :goto_6

    :cond_b
    move/from16 p2, v12

    :goto_6
    add-int/lit8 v12, v8, 0x1

    .line 53
    rem-int/lit8 v9, v12, 0x4

    .line 54
    aget-object v13, v11, v8

    .line 55
    iget v14, v13, Lr3/t;->b:F

    const/16 v16, 0x0

    .line 56
    aput v14, v7, v16

    .line 57
    iget v13, v13, Lr3/t;->c:F

    const/16 v18, 0x1

    .line 58
    aput v13, v7, v18

    .line 59
    aget-object v13, v10, v8

    invoke-virtual {v13, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 60
    aget-object v13, v11, v9

    .line 61
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    iget-object v14, v0, Lr3/l;->i:[F

    const/16 v16, 0x0

    aput p2, v14, v16

    .line 63
    iget v13, v13, Lr3/t;->a:F

    const/16 v18, 0x1

    .line 64
    aput v13, v14, v18

    .line 65
    aget-object v13, v10, v9

    invoke-virtual {v13, v14}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 66
    aget v13, v7, v16

    aget v15, v14, v16

    sub-float/2addr v13, v15

    move-object/from16 v20, v10

    move-object v15, v11

    float-to-double v10, v13

    aget v13, v7, v18

    aget v14, v14, v18

    sub-float/2addr v13, v14

    float-to-double v13, v13

    invoke-static {v10, v11, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v10

    double-to-float v10, v10

    const v11, 0x3a83126f    # 0.001f

    sub-float/2addr v10, v11

    move/from16 v11, p2

    .line 67
    invoke-static {v10, v11}, Ljava/lang/Math;->max(FF)F

    move-result v10

    .line 68
    aget-object v11, v15, v8

    iget v13, v11, Lr3/t;->b:F

    const/16 v16, 0x0

    aput v13, v7, v16

    .line 69
    iget v11, v11, Lr3/t;->c:F

    const/4 v13, 0x1

    aput v11, v7, v13

    .line 70
    aget-object v11, v20, v8

    invoke-virtual {v11, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    if-eq v8, v13, :cond_c

    const/4 v11, 0x3

    if-eq v8, v11, :cond_c

    .line 71
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v11

    aget v14, v7, v13

    sub-float/2addr v11, v14

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    goto :goto_7

    .line 72
    :cond_c
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v11

    const/16 v16, 0x0

    aget v13, v7, v16

    sub-float/2addr v11, v13

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    :goto_7
    const/high16 v11, 0x43870000    # 270.0f

    .line 73
    iget-object v13, v0, Lr3/l;->g:Lr3/t;

    const/4 v14, 0x0

    invoke-virtual {v13, v14, v11, v14}, Lr3/t;->d(FFF)V

    const/4 v11, 0x1

    if-eq v8, v11, :cond_f

    const/4 v11, 0x2

    if-eq v8, v11, :cond_e

    const/4 v14, 0x3

    if-eq v8, v14, :cond_d

    .line 74
    iget-object v11, v1, Lr3/j;->j:Lr3/e;

    goto :goto_8

    .line 75
    :cond_d
    iget-object v11, v1, Lr3/j;->i:Lr3/e;

    goto :goto_8

    :cond_e
    const/4 v14, 0x3

    .line 76
    iget-object v11, v1, Lr3/j;->l:Lr3/e;

    goto :goto_8

    :cond_f
    const/4 v14, 0x3

    .line 77
    iget-object v11, v1, Lr3/j;->k:Lr3/e;

    .line 78
    :goto_8
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    .line 79
    invoke-virtual {v13, v10, v11}, Lr3/t;->c(FF)V

    .line 80
    iget-object v10, v0, Lr3/l;->j:Landroid/graphics/Path;

    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 81
    aget-object v11, v19, v8

    invoke-virtual {v13, v11, v10}, Lr3/t;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 82
    iget-boolean v11, v0, Lr3/l;->l:Z

    if-eqz v11, :cond_10

    .line 83
    invoke-virtual {v0, v10, v8}, Lr3/l;->b(Landroid/graphics/Path;I)Z

    move-result v11

    if-nez v11, :cond_11

    .line 84
    invoke-virtual {v0, v10, v9}, Lr3/l;->b(Landroid/graphics/Path;I)Z

    move-result v9

    if-eqz v9, :cond_10

    goto :goto_9

    :cond_10
    const/16 v18, 0x1

    goto :goto_a

    .line 85
    :cond_11
    :goto_9
    sget-object v9, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    invoke-virtual {v10, v10, v6, v9}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    const/4 v11, 0x0

    const/16 v16, 0x0

    .line 86
    aput v11, v7, v16

    .line 87
    iget v9, v13, Lr3/t;->a:F

    const/16 v18, 0x1

    .line 88
    aput v9, v7, v18

    .line 89
    aget-object v9, v19, v8

    invoke-virtual {v9, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 90
    aget v9, v7, v16

    aget v10, v7, v18

    invoke-virtual {v5, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 91
    aget-object v9, v19, v8

    invoke-virtual {v13, v9, v5}, Lr3/t;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    goto :goto_b

    .line 92
    :goto_a
    aget-object v9, v19, v8

    invoke-virtual {v13, v9, v4}, Lr3/t;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    :goto_b
    if-eqz v3, :cond_12

    .line 93
    aget-object v9, v19, v8

    .line 94
    iget-object v10, v3, Lk7/e;->s:Ljava/lang/Object;

    check-cast v10, Lr3/g;

    iget-object v11, v10, Lr3/g;->v:Ljava/util/BitSet;

    add-int/lit8 v14, v8, 0x4

    const/4 v0, 0x0

    .line 95
    invoke-virtual {v11, v14, v0}, Ljava/util/BitSet;->set(IZ)V

    .line 96
    iget v11, v13, Lr3/t;->e:F

    .line 97
    invoke-virtual {v13, v11}, Lr3/t;->a(F)V

    .line 98
    new-instance v11, Landroid/graphics/Matrix;

    invoke-direct {v11, v9}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 99
    new-instance v9, Ljava/util/ArrayList;

    iget-object v13, v13, Lr3/t;->g:Ljava/util/ArrayList;

    invoke-direct {v9, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 100
    new-instance v13, Lr3/m;

    invoke-direct {v13, v9, v11}, Lr3/m;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 101
    iget-object v9, v10, Lr3/g;->u:[Lr3/s;

    aput-object v13, v9, v8

    goto :goto_c

    :cond_12
    const/4 v0, 0x0

    :goto_c
    move/from16 v16, v0

    move v8, v12

    move-object v11, v15

    move-object/from16 v10, v20

    const/4 v13, 0x4

    move-object/from16 v0, p0

    goto/16 :goto_4

    .line 102
    :cond_13
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 103
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 104
    invoke-virtual {v5}, Landroid/graphics/Path;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_14

    .line 105
    sget-object v0, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    invoke-virtual {v4, v5, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    :cond_14
    return-void
.end method

.method public final b(Landroid/graphics/Path;I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lr3/l;->k:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr3/l;->a:[Lr3/t;

    .line 7
    .line 8
    aget-object v1, v1, p2

    .line 9
    .line 10
    iget-object v2, p0, Lr3/l;->b:[Landroid/graphics/Matrix;

    .line 11
    .line 12
    aget-object p2, v2, p2

    .line 13
    .line 14
    invoke-virtual {v1, p2, v0}, Lr3/t;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 27
    .line 28
    .line 29
    sget-object v2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/high16 v0, 0x3f800000    # 1.0f

    .line 48
    .line 49
    cmpl-float p1, p1, v0

    .line 50
    .line 51
    if-lez p1, :cond_0

    .line 52
    .line 53
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    cmpl-float p1, p1, v0

    .line 58
    .line 59
    if-lez p1, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 p1, 0x0

    .line 63
    return p1

    .line 64
    :cond_1
    :goto_0
    return v1
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
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
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
