.class public final LV0/b;
.super Landroid/util/Property;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, LV0/b;->a:I

    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LV0/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 7
    .line 8
    iget p1, p1, Landroidx/appcompat/widget/SwitchCompat;->R:F

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    check-cast p1, Ln3/o;

    .line 16
    .line 17
    iget p1, p1, Ln3/o;->A:F

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :pswitch_1
    check-cast p1, Ln3/m;

    .line 25
    .line 26
    iget p1, p1, Ln3/m;->z:F

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :pswitch_2
    check-cast p1, Ln3/h;

    .line 34
    .line 35
    invoke-virtual {p1}, Ln3/h;->b()F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 52
    .line 53
    sget-object v0, LV0/z;->a:LV0/E;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lqa/b;->o(Landroid/view/View;)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    return-object p1

    .line 68
    :pswitch_6
    check-cast p1, Landroid/view/View;

    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    return-object p1

    .line 72
    :pswitch_7
    check-cast p1, Landroid/view/View;

    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    return-object p1

    .line 76
    :pswitch_8
    check-cast p1, LV0/e;

    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    return-object p1

    .line 80
    :pswitch_9
    check-cast p1, LV0/e;

    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    return-object p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget v0, p0, LV0/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Float;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/SwitchCompat;->setThumbPosition(F)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p1, Ln3/o;

    .line 19
    .line 20
    check-cast p2, Ljava/lang/Float;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iput p2, p1, Ln3/o;->A:F

    .line 27
    .line 28
    const/high16 v0, 0x44e10000    # 1800.0f

    .line 29
    .line 30
    mul-float/2addr p2, v0

    .line 31
    float-to-int p2, p2

    .line 32
    const/4 v0, 0x0

    .line 33
    move v1, v0

    .line 34
    :goto_0
    iget-object v2, p1, LB6/b;->t:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ge v1, v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ln3/i;

    .line 49
    .line 50
    sget-object v3, Ln3/o;->D:[I

    .line 51
    .line 52
    mul-int/lit8 v4, v1, 0x2

    .line 53
    .line 54
    aget v5, v3, v4

    .line 55
    .line 56
    sget-object v6, Ln3/o;->C:[I

    .line 57
    .line 58
    aget v7, v6, v4

    .line 59
    .line 60
    sub-int v5, p2, v5

    .line 61
    .line 62
    int-to-float v5, v5

    .line 63
    int-to-float v7, v7

    .line 64
    div-float/2addr v5, v7

    .line 65
    iget-object v7, p1, Ln3/o;->w:[Landroid/view/animation/Interpolator;

    .line 66
    .line 67
    aget-object v8, v7, v4

    .line 68
    .line 69
    invoke-interface {v8, v5}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    const/4 v8, 0x0

    .line 74
    const/high16 v9, 0x3f800000    # 1.0f

    .line 75
    .line 76
    invoke-static {v5, v8, v9}, Ls3/a;->d(FFF)F

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    iput v5, v2, Ln3/i;->a:F

    .line 81
    .line 82
    add-int/lit8 v4, v4, 0x1

    .line 83
    .line 84
    aget v3, v3, v4

    .line 85
    .line 86
    aget v5, v6, v4

    .line 87
    .line 88
    sub-int v3, p2, v3

    .line 89
    .line 90
    int-to-float v3, v3

    .line 91
    int-to-float v5, v5

    .line 92
    div-float/2addr v3, v5

    .line 93
    aget-object v4, v7, v4

    .line 94
    .line 95
    invoke-interface {v4, v3}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    invoke-static {v3, v8, v9}, Ls3/a;->d(FFF)F

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    iput v3, v2, Ln3/i;->b:F

    .line 104
    .line 105
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    iget-boolean p2, p1, Ln3/o;->z:Z

    .line 109
    .line 110
    if-eqz p2, :cond_2

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_1

    .line 121
    .line 122
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ln3/i;

    .line 127
    .line 128
    iget-object v2, p1, Ln3/o;->x:Ln3/p;

    .line 129
    .line 130
    iget-object v2, v2, Ln3/p;->c:[I

    .line 131
    .line 132
    iget v3, p1, Ln3/o;->y:I

    .line 133
    .line 134
    aget v2, v2, v3

    .line 135
    .line 136
    iput v2, v1, Ln3/i;->c:I

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_1
    iput-boolean v0, p1, Ln3/o;->z:Z

    .line 140
    .line 141
    :cond_2
    iget-object p1, p1, LB6/b;->s:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p1, Ln3/k;

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_1
    check-cast p1, Ln3/m;

    .line 150
    .line 151
    check-cast p2, Ljava/lang/Float;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    iput p2, p1, Ln3/m;->z:F

    .line 158
    .line 159
    const v0, 0x43a68000    # 333.0f

    .line 160
    .line 161
    .line 162
    mul-float/2addr p2, v0

    .line 163
    float-to-int p2, p2

    .line 164
    iget-object v0, p1, LB6/b;->t:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Ljava/util/ArrayList;

    .line 167
    .line 168
    const/4 v1, 0x0

    .line 169
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, Ln3/i;

    .line 174
    .line 175
    const/4 v3, 0x0

    .line 176
    iput v3, v2, Ln3/i;->a:F

    .line 177
    .line 178
    int-to-float p2, p2

    .line 179
    const/16 v2, 0x29b

    .line 180
    .line 181
    int-to-float v2, v2

    .line 182
    div-float/2addr p2, v2

    .line 183
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, Ln3/i;

    .line 188
    .line 189
    const/4 v3, 0x1

    .line 190
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    check-cast v4, Ln3/i;

    .line 195
    .line 196
    iget-object v5, p1, Ln3/m;->v:Ls0/a;

    .line 197
    .line 198
    invoke-virtual {v5, p2}, Ls0/b;->getInterpolation(F)F

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    iput v6, v4, Ln3/i;->a:F

    .line 203
    .line 204
    iput v6, v2, Ln3/i;->b:F

    .line 205
    .line 206
    const v2, 0x3eff9dbf

    .line 207
    .line 208
    .line 209
    add-float/2addr p2, v2

    .line 210
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    check-cast v2, Ln3/i;

    .line 215
    .line 216
    const/4 v4, 0x2

    .line 217
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    check-cast v6, Ln3/i;

    .line 222
    .line 223
    invoke-virtual {v5, p2}, Ls0/b;->getInterpolation(F)F

    .line 224
    .line 225
    .line 226
    move-result p2

    .line 227
    iput p2, v6, Ln3/i;->a:F

    .line 228
    .line 229
    iput p2, v2, Ln3/i;->b:F

    .line 230
    .line 231
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    check-cast p2, Ln3/i;

    .line 236
    .line 237
    const/high16 v2, 0x3f800000    # 1.0f

    .line 238
    .line 239
    iput v2, p2, Ln3/i;->b:F

    .line 240
    .line 241
    iget-boolean p2, p1, Ln3/m;->y:Z

    .line 242
    .line 243
    if-eqz p2, :cond_3

    .line 244
    .line 245
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    check-cast p2, Ln3/i;

    .line 250
    .line 251
    iget p2, p2, Ln3/i;->b:F

    .line 252
    .line 253
    cmpg-float p2, p2, v2

    .line 254
    .line 255
    if-gez p2, :cond_3

    .line 256
    .line 257
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    check-cast p2, Ln3/i;

    .line 262
    .line 263
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    check-cast v2, Ln3/i;

    .line 268
    .line 269
    iget v2, v2, Ln3/i;->c:I

    .line 270
    .line 271
    iput v2, p2, Ln3/i;->c:I

    .line 272
    .line 273
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    check-cast p2, Ln3/i;

    .line 278
    .line 279
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    check-cast v2, Ln3/i;

    .line 284
    .line 285
    iget v2, v2, Ln3/i;->c:I

    .line 286
    .line 287
    iput v2, p2, Ln3/i;->c:I

    .line 288
    .line 289
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    check-cast p2, Ln3/i;

    .line 294
    .line 295
    iget-object v0, p1, Ln3/m;->w:Ln3/p;

    .line 296
    .line 297
    iget-object v0, v0, Ln3/p;->c:[I

    .line 298
    .line 299
    iget v2, p1, Ln3/m;->x:I

    .line 300
    .line 301
    aget v0, v0, v2

    .line 302
    .line 303
    iput v0, p2, Ln3/i;->c:I

    .line 304
    .line 305
    iput-boolean v1, p1, Ln3/m;->y:Z

    .line 306
    .line 307
    :cond_3
    iget-object p1, p1, LB6/b;->s:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast p1, Ln3/k;

    .line 310
    .line 311
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :pswitch_2
    check-cast p1, Ln3/h;

    .line 316
    .line 317
    check-cast p2, Ljava/lang/Float;

    .line 318
    .line 319
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 320
    .line 321
    .line 322
    move-result p2

    .line 323
    iget v0, p1, Ln3/h;->z:F

    .line 324
    .line 325
    cmpl-float v0, v0, p2

    .line 326
    .line 327
    if-eqz v0, :cond_4

    .line 328
    .line 329
    iput p2, p1, Ln3/h;->z:F

    .line 330
    .line 331
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 332
    .line 333
    .line 334
    :cond_4
    return-void

    .line 335
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 336
    .line 337
    check-cast p2, Landroid/graphics/Rect;

    .line 338
    .line 339
    invoke-virtual {p1, p2}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :pswitch_4
    check-cast p1, Landroid/view/View;

    .line 344
    .line 345
    check-cast p2, Ljava/lang/Float;

    .line 346
    .line 347
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 348
    .line 349
    .line 350
    move-result p2

    .line 351
    sget-object v0, LV0/z;->a:LV0/E;

    .line 352
    .line 353
    invoke-virtual {v0, p1, p2}, Lqa/b;->A(Landroid/view/View;F)V

    .line 354
    .line 355
    .line 356
    return-void

    .line 357
    :pswitch_5
    check-cast p1, Landroid/view/View;

    .line 358
    .line 359
    check-cast p2, Landroid/graphics/PointF;

    .line 360
    .line 361
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 362
    .line 363
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 368
    .line 369
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 370
    .line 371
    .line 372
    move-result p2

    .line 373
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    add-int/2addr v1, v0

    .line 378
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    add-int/2addr v2, p2

    .line 383
    invoke-static {p1, v0, p2, v1, v2}, LV0/z;->a(Landroid/view/View;IIII)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :pswitch_6
    check-cast p1, Landroid/view/View;

    .line 388
    .line 389
    check-cast p2, Landroid/graphics/PointF;

    .line 390
    .line 391
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 392
    .line 393
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 398
    .line 399
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 400
    .line 401
    .line 402
    move-result p2

    .line 403
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    invoke-static {p1, v0, p2, v1, v2}, LV0/z;->a(Landroid/view/View;IIII)V

    .line 412
    .line 413
    .line 414
    return-void

    .line 415
    :pswitch_7
    check-cast p1, Landroid/view/View;

    .line 416
    .line 417
    check-cast p2, Landroid/graphics/PointF;

    .line 418
    .line 419
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    iget v2, p2, Landroid/graphics/PointF;->x:F

    .line 428
    .line 429
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 434
    .line 435
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 436
    .line 437
    .line 438
    move-result p2

    .line 439
    invoke-static {p1, v0, v1, v2, p2}, LV0/z;->a(Landroid/view/View;IIII)V

    .line 440
    .line 441
    .line 442
    return-void

    .line 443
    :pswitch_8
    check-cast p1, LV0/e;

    .line 444
    .line 445
    check-cast p2, Landroid/graphics/PointF;

    .line 446
    .line 447
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 451
    .line 452
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    iput v0, p1, LV0/e;->c:I

    .line 457
    .line 458
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 459
    .line 460
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 461
    .line 462
    .line 463
    move-result p2

    .line 464
    iput p2, p1, LV0/e;->d:I

    .line 465
    .line 466
    iget v0, p1, LV0/e;->g:I

    .line 467
    .line 468
    add-int/lit8 v0, v0, 0x1

    .line 469
    .line 470
    iput v0, p1, LV0/e;->g:I

    .line 471
    .line 472
    iget v1, p1, LV0/e;->f:I

    .line 473
    .line 474
    if-ne v1, v0, :cond_5

    .line 475
    .line 476
    iget v0, p1, LV0/e;->a:I

    .line 477
    .line 478
    iget v1, p1, LV0/e;->b:I

    .line 479
    .line 480
    iget v2, p1, LV0/e;->c:I

    .line 481
    .line 482
    iget-object v3, p1, LV0/e;->e:Landroid/view/View;

    .line 483
    .line 484
    invoke-static {v3, v0, v1, v2, p2}, LV0/z;->a(Landroid/view/View;IIII)V

    .line 485
    .line 486
    .line 487
    const/4 p2, 0x0

    .line 488
    iput p2, p1, LV0/e;->f:I

    .line 489
    .line 490
    iput p2, p1, LV0/e;->g:I

    .line 491
    .line 492
    :cond_5
    return-void

    .line 493
    :pswitch_9
    check-cast p1, LV0/e;

    .line 494
    .line 495
    check-cast p2, Landroid/graphics/PointF;

    .line 496
    .line 497
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    iget v0, p2, Landroid/graphics/PointF;->x:F

    .line 501
    .line 502
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    iput v0, p1, LV0/e;->a:I

    .line 507
    .line 508
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 509
    .line 510
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 511
    .line 512
    .line 513
    move-result p2

    .line 514
    iput p2, p1, LV0/e;->b:I

    .line 515
    .line 516
    iget v0, p1, LV0/e;->f:I

    .line 517
    .line 518
    add-int/lit8 v0, v0, 0x1

    .line 519
    .line 520
    iput v0, p1, LV0/e;->f:I

    .line 521
    .line 522
    iget v1, p1, LV0/e;->g:I

    .line 523
    .line 524
    if-ne v0, v1, :cond_6

    .line 525
    .line 526
    iget v0, p1, LV0/e;->a:I

    .line 527
    .line 528
    iget v1, p1, LV0/e;->c:I

    .line 529
    .line 530
    iget v2, p1, LV0/e;->d:I

    .line 531
    .line 532
    iget-object v3, p1, LV0/e;->e:Landroid/view/View;

    .line 533
    .line 534
    invoke-static {v3, v0, p2, v1, v2}, LV0/z;->a(Landroid/view/View;IIII)V

    .line 535
    .line 536
    .line 537
    const/4 p2, 0x0

    .line 538
    iput p2, p1, LV0/e;->f:I

    .line 539
    .line 540
    iput p2, p1, LV0/e;->g:I

    .line 541
    .line 542
    :cond_6
    return-void

    .line 543
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
.end method
