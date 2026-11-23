.class public abstract Ln3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ln3/p;


# virtual methods
.method public final a(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V
    .locals 10

    .line 1
    iget-object v0, p0, Ln3/j;->a:Ln3/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln3/p;->a()V

    .line 4
    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Ln3/l;

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-float v1, v1

    .line 14
    iput v1, v0, Ln3/l;->b:F

    .line 15
    .line 16
    iget-object v1, v0, Ln3/j;->a:Ln3/p;

    .line 17
    .line 18
    iget v2, v1, Ln3/p;->a:I

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    iget v3, p2, Landroid/graphics/Rect;->left:I

    .line 22
    .line 23
    int-to-float v3, v3

    .line 24
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    int-to-float v4, v4

    .line 29
    const/high16 v5, 0x40000000    # 2.0f

    .line 30
    .line 31
    div-float/2addr v4, v5

    .line 32
    add-float/2addr v4, v3

    .line 33
    iget v3, p2, Landroid/graphics/Rect;->top:I

    .line 34
    .line 35
    int-to-float v3, v3

    .line 36
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    int-to-float v6, v6

    .line 41
    div-float/2addr v6, v5

    .line 42
    add-float/2addr v6, v3

    .line 43
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    int-to-float p2, p2

    .line 48
    sub-float/2addr p2, v2

    .line 49
    div-float/2addr p2, v5

    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-static {v3, p2}, Ljava/lang/Math;->max(FF)F

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    add-float/2addr p2, v6

    .line 56
    invoke-virtual {p1, v4, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 57
    .line 58
    .line 59
    iget-boolean p2, v1, Ln3/p;->j:Z

    .line 60
    .line 61
    const/high16 v4, -0x40800000    # -1.0f

    .line 62
    .line 63
    const/high16 v6, 0x3f800000    # 1.0f

    .line 64
    .line 65
    if-eqz p2, :cond_0

    .line 66
    .line 67
    invoke-virtual {p1, v4, v6}, Landroid/graphics/Canvas;->scale(FF)V

    .line 68
    .line 69
    .line 70
    :cond_0
    iget p2, v0, Ln3/l;->b:F

    .line 71
    .line 72
    div-float/2addr p2, v5

    .line 73
    div-float/2addr v2, v5

    .line 74
    neg-float v7, p2

    .line 75
    neg-float v8, v2

    .line 76
    invoke-virtual {p1, v7, v8, p2, v2}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 77
    .line 78
    .line 79
    iget p2, v1, Ln3/p;->a:I

    .line 80
    .line 81
    div-int/lit8 v2, p2, 0x2

    .line 82
    .line 83
    iget v7, v1, Ln3/p;->b:I

    .line 84
    .line 85
    const/4 v8, 0x1

    .line 86
    if-ne v2, v7, :cond_1

    .line 87
    .line 88
    move v9, v8

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    const/4 v9, 0x0

    .line 91
    :goto_0
    iput-boolean v9, v0, Ln3/l;->e:Z

    .line 92
    .line 93
    int-to-float p2, p2

    .line 94
    mul-float/2addr p2, p3

    .line 95
    iput p2, v0, Ln3/l;->c:F

    .line 96
    .line 97
    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    int-to-float p2, p2

    .line 102
    mul-float/2addr p2, p3

    .line 103
    iput p2, v0, Ln3/l;->d:F

    .line 104
    .line 105
    const/4 p2, 0x3

    .line 106
    if-nez p4, :cond_2

    .line 107
    .line 108
    if-eqz p5, :cond_7

    .line 109
    .line 110
    :cond_2
    if-eqz p4, :cond_3

    .line 111
    .line 112
    iget v2, v1, Ln3/p;->e:I

    .line 113
    .line 114
    const/4 v7, 0x2

    .line 115
    if-eq v2, v7, :cond_4

    .line 116
    .line 117
    :cond_3
    if-eqz p5, :cond_5

    .line 118
    .line 119
    iget v2, v1, Ln3/p;->f:I

    .line 120
    .line 121
    if-ne v2, v8, :cond_5

    .line 122
    .line 123
    :cond_4
    invoke-virtual {p1, v6, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 124
    .line 125
    .line 126
    :cond_5
    if-nez p4, :cond_6

    .line 127
    .line 128
    if-eqz p5, :cond_7

    .line 129
    .line 130
    iget p4, v1, Ln3/p;->f:I

    .line 131
    .line 132
    if-eq p4, p2, :cond_7

    .line 133
    .line 134
    :cond_6
    iget p4, v1, Ln3/p;->a:I

    .line 135
    .line 136
    int-to-float p4, p4

    .line 137
    sub-float v2, v6, p3

    .line 138
    .line 139
    mul-float/2addr v2, p4

    .line 140
    div-float/2addr v2, v5

    .line 141
    invoke-virtual {p1, v3, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 142
    .line 143
    .line 144
    :cond_7
    if-eqz p5, :cond_8

    .line 145
    .line 146
    iget p1, v1, Ln3/p;->f:I

    .line 147
    .line 148
    if-ne p1, p2, :cond_8

    .line 149
    .line 150
    iput p3, v0, Ln3/l;->f:F

    .line 151
    .line 152
    return-void

    .line 153
    :cond_8
    iput v6, v0, Ln3/l;->f:F

    .line 154
    .line 155
    return-void
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
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
.end method
