.class public final Ly9/f;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ly9/g;


# direct methods
.method public synthetic constructor <init>(Ly9/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly9/f;->s:I

    iput-object p1, p0, Ly9/f;->t:Ly9/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    const-string v0, "classProto.constructorList"

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const-string v2, "it"

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v7, p0, Ly9/f;->t:Ly9/g;

    .line 13
    .line 14
    iget v8, p0, Ly9/f;->s:I

    .line 15
    .line 16
    packed-switch v8, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v7}, Ly9/g;->u()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v7}, Ly9/g;->h0()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :cond_0
    iget-object v0, v7, Ly9/g;->D:LV3/b;

    .line 34
    .line 35
    iget-object v8, v0, LV3/b;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v8, Lg9/f;

    .line 38
    .line 39
    const-string v9, "<this>"

    .line 40
    .line 41
    iget-object v10, v7, Ly9/g;->w:Le9/j;

    .line 42
    .line 43
    invoke-static {v10, v9}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v9, "nameResolver"

    .line 47
    .line 48
    invoke-static {v8, v9}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v9, v0, LV3/b;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, Lg9/g;

    .line 54
    .line 55
    iget-object v11, v10, Le9/j;->R:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    iget-object v0, v0, LV3/b;->h:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lp/b1;

    .line 64
    .line 65
    if-lez v11, :cond_6

    .line 66
    .line 67
    iget-object v1, v10, Le9/j;->R:Ljava/util/List;

    .line 68
    .line 69
    const-string v11, "multiFieldValueClassUnderlyingNameList"

    .line 70
    .line 71
    invoke-static {v1, v11}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    check-cast v1, Ljava/lang/Iterable;

    .line 75
    .line 76
    new-instance v11, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-static {v1, v3}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 79
    .line 80
    .line 81
    move-result v12

    .line 82
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v12

    .line 93
    if-eqz v12, :cond_1

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    check-cast v12, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-static {v12, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    invoke-static {v8, v12}, LJ7/a;->i(Lg9/f;I)Lj9/f;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    iget-object v1, v10, Le9/j;->U:Ljava/util/List;

    .line 117
    .line 118
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    iget-object v12, v10, Le9/j;->T:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    new-instance v13, Lh8/f;

    .line 137
    .line 138
    invoke-direct {v13, v1, v12}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    new-instance v14, Lh8/f;

    .line 154
    .line 155
    invoke-direct {v14, v1, v12}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v13, v14}, Lh8/f;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_2

    .line 163
    .line 164
    iget-object v1, v10, Le9/j;->U:Ljava/util/List;

    .line 165
    .line 166
    const-string v4, "multiFieldValueClassUnderlyingTypeIdList"

    .line 167
    .line 168
    invoke-static {v1, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    check-cast v1, Ljava/lang/Iterable;

    .line 172
    .line 173
    new-instance v4, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-static {v1, v3}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-eqz v8, :cond_3

    .line 191
    .line 192
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    check-cast v8, Ljava/lang/Integer;

    .line 197
    .line 198
    invoke-static {v8, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v8

    .line 205
    invoke-virtual {v9, v8}, Lg9/g;->a(I)Le9/Q;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    new-instance v4, Lh8/f;

    .line 226
    .line 227
    invoke-direct {v4, v1, v2}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v13, v4}, Lh8/f;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_5

    .line 235
    .line 236
    iget-object v4, v10, Le9/j;->T:Ljava/util/List;

    .line 237
    .line 238
    :cond_3
    const-string v1, "when (typeIdCount to typ\u2026epresentation\")\n        }"

    .line 239
    .line 240
    invoke-static {v4, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    check-cast v4, Ljava/lang/Iterable;

    .line 244
    .line 245
    new-instance v1, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-static {v4, v3}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_4

    .line 263
    .line 264
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    check-cast v3, Le9/Q;

    .line 269
    .line 270
    const-string v4, "p0"

    .line 271
    .line 272
    invoke-static {v3, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v3, v6}, Lp/b1;->e(Le9/Q;Z)LA9/D;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_4
    new-instance v0, LL8/z;

    .line 284
    .line 285
    invoke-static {v11, v1}, Li8/k;->z0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-direct {v0, v1}, LL8/z;-><init>(Ljava/util/ArrayList;)V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_4

    .line 293
    .line 294
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 295
    .line 296
    new-instance v1, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    const-string v2, "class "

    .line 299
    .line 300
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    iget v2, v10, Le9/j;->w:I

    .line 304
    .line 305
    invoke-static {v8, v2}, LJ7/a;->i(Lg9/f;I)Lj9/f;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    const-string v2, " has illegal multi-field value class representation"

    .line 313
    .line 314
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw v0

    .line 329
    :cond_6
    iget v2, v10, Le9/j;->u:I

    .line 330
    .line 331
    const/16 v3, 0x8

    .line 332
    .line 333
    and-int/2addr v2, v3

    .line 334
    if-ne v2, v3, :cond_c

    .line 335
    .line 336
    iget v2, v10, Le9/j;->O:I

    .line 337
    .line 338
    invoke-static {v8, v2}, LJ7/a;->i(Lg9/f;I)Lj9/f;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    iget v3, v10, Le9/j;->u:I

    .line 343
    .line 344
    and-int/lit8 v4, v3, 0x10

    .line 345
    .line 346
    if-ne v4, v1, :cond_7

    .line 347
    .line 348
    iget-object v1, v10, Le9/j;->P:Le9/Q;

    .line 349
    .line 350
    goto :goto_3

    .line 351
    :cond_7
    const/16 v1, 0x20

    .line 352
    .line 353
    and-int/2addr v3, v1

    .line 354
    if-ne v3, v1, :cond_8

    .line 355
    .line 356
    iget v1, v10, Le9/j;->Q:I

    .line 357
    .line 358
    invoke-virtual {v9, v1}, Lg9/g;->a(I)Le9/Q;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    goto :goto_3

    .line 363
    :cond_8
    move-object v1, v5

    .line 364
    :goto_3
    if-eqz v1, :cond_9

    .line 365
    .line 366
    invoke-virtual {v0, v1, v6}, Lp/b1;->e(Le9/Q;Z)LA9/D;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    if-nez v0, :cond_a

    .line 371
    .line 372
    :cond_9
    invoke-virtual {v7, v2}, Ly9/g;->o(Lj9/f;)LA9/D;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    if-eqz v0, :cond_b

    .line 377
    .line 378
    :cond_a
    new-instance v1, LL8/u;

    .line 379
    .line 380
    invoke-direct {v1, v2, v0}, LL8/u;-><init>(Lj9/f;LD9/d;)V

    .line 381
    .line 382
    .line 383
    move-object v0, v1

    .line 384
    goto :goto_4

    .line 385
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 386
    .line 387
    new-instance v1, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    const-string v3, "cannot determine underlying type for value class "

    .line 390
    .line 391
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    iget v3, v10, Le9/j;->w:I

    .line 395
    .line 396
    invoke-static {v8, v3}, LJ7/a;->i(Lg9/f;I)Lj9/f;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    const-string v3, " with property "

    .line 404
    .line 405
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    throw v0

    .line 423
    :cond_c
    move-object v0, v5

    .line 424
    :goto_4
    if-eqz v0, :cond_d

    .line 425
    .line 426
    move-object v5, v0

    .line 427
    goto :goto_5

    .line 428
    :cond_d
    iget-object v0, v7, Ly9/g;->x:Lg9/a;

    .line 429
    .line 430
    const/4 v1, 0x5

    .line 431
    invoke-virtual {v0, v6, v1, v6}, Lg9/a;->a(III)Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-nez v0, :cond_10

    .line 436
    .line 437
    invoke-virtual {v7}, Ly9/g;->u0()LO8/k;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    if-eqz v0, :cond_f

    .line 442
    .line 443
    check-cast v0, LO8/w;

    .line 444
    .line 445
    invoke-virtual {v0}, LO8/w;->H0()Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    const-string v1, "constructor.valueParameters"

    .line 450
    .line 451
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    invoke-static {v0}, Li8/k;->T(Ljava/util/List;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    check-cast v0, LO8/U;

    .line 459
    .line 460
    check-cast v0, LO8/o;

    .line 461
    .line 462
    invoke-virtual {v0}, LO8/o;->getName()Lj9/f;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    const-string v1, "constructor.valueParameters.first().name"

    .line 467
    .line 468
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v7, v0}, Ly9/g;->o(Lj9/f;)LA9/D;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    if-eqz v1, :cond_e

    .line 476
    .line 477
    new-instance v5, LL8/u;

    .line 478
    .line 479
    invoke-direct {v5, v0, v1}, LL8/u;-><init>(Lj9/f;LD9/d;)V

    .line 480
    .line 481
    .line 482
    goto :goto_5

    .line 483
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 484
    .line 485
    new-instance v1, Ljava/lang/StringBuilder;

    .line 486
    .line 487
    const-string v2, "Value class has no underlying property: "

    .line 488
    .line 489
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    throw v0

    .line 507
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 508
    .line 509
    new-instance v1, Ljava/lang/StringBuilder;

    .line 510
    .line 511
    const-string v2, "Inline class has no primary constructor: "

    .line 512
    .line 513
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    throw v0

    .line 531
    :cond_10
    :goto_5
    return-object v5

    .line 532
    :pswitch_0
    sget-object v0, Li8/s;->s:Li8/s;

    .line 533
    .line 534
    iget v1, v7, Ly9/g;->A:I

    .line 535
    .line 536
    const/4 v2, 0x2

    .line 537
    if-eq v1, v2, :cond_11

    .line 538
    .line 539
    goto/16 :goto_7

    .line 540
    .line 541
    :cond_11
    iget-object v1, v7, Ly9/g;->w:Le9/j;

    .line 542
    .line 543
    iget-object v1, v1, Le9/j;->M:Ljava/util/List;

    .line 544
    .line 545
    const-string v3, "fqNames"

    .line 546
    .line 547
    invoke-static {v1, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    move-object v3, v1

    .line 551
    check-cast v3, Ljava/util/Collection;

    .line 552
    .line 553
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    if-nez v3, :cond_13

    .line 558
    .line 559
    check-cast v1, Ljava/lang/Iterable;

    .line 560
    .line 561
    new-instance v0, Ljava/util/ArrayList;

    .line 562
    .line 563
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 564
    .line 565
    .line 566
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    :cond_12
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    if-eqz v2, :cond_16

    .line 575
    .line 576
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    check-cast v2, Ljava/lang/Integer;

    .line 581
    .line 582
    iget-object v3, v7, Ly9/g;->D:LV3/b;

    .line 583
    .line 584
    iget-object v4, v3, LV3/b;->a:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v4, LI4/c;

    .line 587
    .line 588
    const-string v5, "index"

    .line 589
    .line 590
    invoke-static {v2, v5}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    iget-object v3, v3, LV3/b;->b:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v3, Lg9/f;

    .line 600
    .line 601
    invoke-static {v3, v2}, LJ7/a;->e(Lg9/f;I)Lj9/b;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    invoke-virtual {v4, v2}, LI4/c;->b(Lj9/b;)LL8/e;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    if-eqz v2, :cond_12

    .line 610
    .line 611
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    goto :goto_6

    .line 615
    :cond_13
    iget v1, v7, Ly9/g;->A:I

    .line 616
    .line 617
    if-eq v1, v2, :cond_14

    .line 618
    .line 619
    goto :goto_7

    .line 620
    :cond_14
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 621
    .line 622
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 623
    .line 624
    .line 625
    iget-object v1, v7, Ly9/g;->I:LL8/j;

    .line 626
    .line 627
    instance-of v2, v1, LL8/D;

    .line 628
    .line 629
    if-eqz v2, :cond_15

    .line 630
    .line 631
    check-cast v1, LL8/D;

    .line 632
    .line 633
    invoke-interface {v1}, LL8/D;->E0()Lt9/n;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    invoke-static {v7, v0, v1, v4}, Lm9/m;->c(LL8/e;Ljava/util/LinkedHashSet;Lt9/n;Z)V

    .line 638
    .line 639
    .line 640
    :cond_15
    invoke-virtual {v7}, LO8/b;->s0()Lt9/n;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    invoke-static {v7, v0, v1, v6}, Lm9/m;->c(LL8/e;Ljava/util/LinkedHashSet;Lt9/n;Z)V

    .line 645
    .line 646
    .line 647
    new-instance v1, Lm9/h;

    .line 648
    .line 649
    invoke-direct {v1, v6}, Lm9/h;-><init>(I)V

    .line 650
    .line 651
    .line 652
    invoke-static {v0, v1}, Li8/k;->o0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    check-cast v0, Ljava/util/Collection;

    .line 657
    .line 658
    :cond_16
    :goto_7
    return-object v0

    .line 659
    :pswitch_1
    iget-object v7, p0, Ly9/f;->t:Ly9/g;

    .line 660
    .line 661
    iget v1, v7, Ly9/g;->C:I

    .line 662
    .line 663
    invoke-static {v1}, LE0/a;->a(I)Z

    .line 664
    .line 665
    .line 666
    move-result v1

    .line 667
    if-eqz v1, :cond_1f

    .line 668
    .line 669
    sget-object v12, LL8/M;->a:LL8/N;

    .line 670
    .line 671
    new-instance v6, Lm9/d;

    .line 672
    .line 673
    sget-object v9, LM8/g;->a:LM8/f;

    .line 674
    .line 675
    const/4 v8, 0x0

    .line 676
    const/4 v10, 0x1

    .line 677
    const/4 v11, 0x1

    .line 678
    invoke-direct/range {v6 .. v12}, LO8/k;-><init>(LL8/e;LL8/i;LM8/h;ZILL8/M;)V

    .line 679
    .line 680
    .line 681
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 682
    .line 683
    sget v1, Lm9/e;->a:I

    .line 684
    .line 685
    const/4 v1, 0x3

    .line 686
    iget v2, v7, Ly9/g;->C:I

    .line 687
    .line 688
    if-eq v2, v1, :cond_1d

    .line 689
    .line 690
    invoke-static {v2}, LE0/a;->a(I)Z

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    if-eqz v1, :cond_17

    .line 695
    .line 696
    goto :goto_8

    .line 697
    :cond_17
    invoke-static {v7}, Lm9/e;->q(LL8/j;)Z

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    if-eqz v1, :cond_19

    .line 702
    .line 703
    sget-object v1, LL8/o;->a:LL8/n;

    .line 704
    .line 705
    if-eqz v1, :cond_18

    .line 706
    .line 707
    goto :goto_9

    .line 708
    :cond_18
    const/16 v0, 0x33

    .line 709
    .line 710
    invoke-static {v0}, Lm9/e;->a(I)V

    .line 711
    .line 712
    .line 713
    throw v5

    .line 714
    :cond_19
    invoke-static {v7}, Lm9/e;->k(LL8/j;)Z

    .line 715
    .line 716
    .line 717
    move-result v1

    .line 718
    if-eqz v1, :cond_1b

    .line 719
    .line 720
    sget-object v1, LL8/o;->j:LL8/n;

    .line 721
    .line 722
    if-eqz v1, :cond_1a

    .line 723
    .line 724
    goto :goto_9

    .line 725
    :cond_1a
    const/16 v0, 0x34

    .line 726
    .line 727
    invoke-static {v0}, Lm9/e;->a(I)V

    .line 728
    .line 729
    .line 730
    throw v5

    .line 731
    :cond_1b
    sget-object v1, LL8/o;->e:LL8/n;

    .line 732
    .line 733
    if-eqz v1, :cond_1c

    .line 734
    .line 735
    goto :goto_9

    .line 736
    :cond_1c
    const/16 v0, 0x35

    .line 737
    .line 738
    invoke-static {v0}, Lm9/e;->a(I)V

    .line 739
    .line 740
    .line 741
    throw v5

    .line 742
    :cond_1d
    :goto_8
    sget-object v1, LL8/o;->a:LL8/n;

    .line 743
    .line 744
    if-eqz v1, :cond_1e

    .line 745
    .line 746
    :goto_9
    invoke-virtual {v6, v0, v1}, LO8/k;->n1(Ljava/util/List;LL8/n;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v7}, LO8/b;->p()LA9/D;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    iput-object v0, v6, LO8/w;->y:LA9/y;

    .line 754
    .line 755
    move-object v5, v6

    .line 756
    goto :goto_b

    .line 757
    :cond_1e
    const/16 v0, 0x31

    .line 758
    .line 759
    invoke-static {v0}, Lm9/e;->a(I)V

    .line 760
    .line 761
    .line 762
    throw v5

    .line 763
    :cond_1f
    iget-object v1, v7, Ly9/g;->w:Le9/j;

    .line 764
    .line 765
    iget-object v1, v1, Le9/j;->H:Ljava/util/List;

    .line 766
    .line 767
    invoke-static {v1, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    check-cast v1, Ljava/lang/Iterable;

    .line 771
    .line 772
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    :cond_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 777
    .line 778
    .line 779
    move-result v1

    .line 780
    if-eqz v1, :cond_21

    .line 781
    .line 782
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    move-object v2, v1

    .line 787
    check-cast v2, Le9/l;

    .line 788
    .line 789
    sget-object v3, Lg9/e;->m:Lg9/b;

    .line 790
    .line 791
    iget v2, v2, Le9/l;->v:I

    .line 792
    .line 793
    invoke-virtual {v3, v2}, Lg9/b;->c(I)Ljava/lang/Boolean;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 798
    .line 799
    .line 800
    move-result v2

    .line 801
    if-nez v2, :cond_20

    .line 802
    .line 803
    goto :goto_a

    .line 804
    :cond_21
    move-object v1, v5

    .line 805
    :goto_a
    check-cast v1, Le9/l;

    .line 806
    .line 807
    if-eqz v1, :cond_22

    .line 808
    .line 809
    iget-object v0, v7, Ly9/g;->D:LV3/b;

    .line 810
    .line 811
    iget-object v0, v0, LV3/b;->i:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v0, Lw9/q;

    .line 814
    .line 815
    invoke-virtual {v0, v1, v6}, Lw9/q;->d(Le9/l;Z)Ly9/c;

    .line 816
    .line 817
    .line 818
    move-result-object v5

    .line 819
    :cond_22
    :goto_b
    return-object v5

    .line 820
    :pswitch_2
    iget-object v1, v7, Ly9/g;->w:Le9/j;

    .line 821
    .line 822
    iget-object v1, v1, Le9/j;->H:Ljava/util/List;

    .line 823
    .line 824
    invoke-static {v1, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 825
    .line 826
    .line 827
    check-cast v1, Ljava/lang/Iterable;

    .line 828
    .line 829
    new-instance v0, Ljava/util/ArrayList;

    .line 830
    .line 831
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 832
    .line 833
    .line 834
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    :cond_23
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 839
    .line 840
    .line 841
    move-result v5

    .line 842
    if-eqz v5, :cond_24

    .line 843
    .line 844
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v5

    .line 848
    move-object v6, v5

    .line 849
    check-cast v6, Le9/l;

    .line 850
    .line 851
    sget-object v8, Lg9/e;->m:Lg9/b;

    .line 852
    .line 853
    iget v6, v6, Le9/l;->v:I

    .line 854
    .line 855
    invoke-virtual {v8, v6}, Lg9/b;->c(I)Ljava/lang/Boolean;

    .line 856
    .line 857
    .line 858
    move-result-object v6

    .line 859
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 860
    .line 861
    .line 862
    move-result v6

    .line 863
    if-eqz v6, :cond_23

    .line 864
    .line 865
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    goto :goto_c

    .line 869
    :cond_24
    new-instance v1, Ljava/util/ArrayList;

    .line 870
    .line 871
    invoke-static {v0, v3}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 872
    .line 873
    .line 874
    move-result v3

    .line 875
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 883
    .line 884
    .line 885
    move-result v3

    .line 886
    iget-object v5, v7, Ly9/g;->D:LV3/b;

    .line 887
    .line 888
    if-eqz v3, :cond_25

    .line 889
    .line 890
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v3

    .line 894
    check-cast v3, Le9/l;

    .line 895
    .line 896
    iget-object v5, v5, LV3/b;->i:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v5, Lw9/q;

    .line 899
    .line 900
    invoke-static {v3, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v5, v3, v4}, Lw9/q;->d(Le9/l;Z)Ly9/c;

    .line 904
    .line 905
    .line 906
    move-result-object v3

    .line 907
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    goto :goto_d

    .line 911
    :cond_25
    invoke-virtual {v7}, Ly9/g;->u0()LO8/k;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    invoke-static {v0}, Li8/l;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    check-cast v0, Ljava/lang/Iterable;

    .line 920
    .line 921
    invoke-static {v1, v0}, Li8/k;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    iget-object v1, v5, LV3/b;->a:Ljava/lang/Object;

    .line 926
    .line 927
    check-cast v1, LI4/c;

    .line 928
    .line 929
    iget-object v1, v1, LI4/c;->n:Ljava/lang/Object;

    .line 930
    .line 931
    check-cast v1, LN8/b;

    .line 932
    .line 933
    invoke-interface {v1, v7}, LN8/b;->e(LL8/e;)Ljava/util/Collection;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    check-cast v1, Ljava/lang/Iterable;

    .line 938
    .line 939
    invoke-static {v0, v1}, Li8/k;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    return-object v0

    .line 944
    :pswitch_3
    iget-object v0, v7, Ly9/g;->w:Le9/j;

    .line 945
    .line 946
    iget v1, v0, Le9/j;->u:I

    .line 947
    .line 948
    const/4 v2, 0x4

    .line 949
    and-int/2addr v1, v2

    .line 950
    if-ne v1, v2, :cond_26

    .line 951
    .line 952
    iget-object v1, v7, Ly9/g;->D:LV3/b;

    .line 953
    .line 954
    iget-object v1, v1, LV3/b;->b:Ljava/lang/Object;

    .line 955
    .line 956
    check-cast v1, Lg9/f;

    .line 957
    .line 958
    iget v0, v0, Le9/j;->x:I

    .line 959
    .line 960
    invoke-static {v1, v0}, LJ7/a;->i(Lg9/f;I)Lj9/f;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    invoke-virtual {v7}, Ly9/g;->l()Ly9/e;

    .line 965
    .line 966
    .line 967
    move-result-object v1

    .line 968
    sget-object v2, LT8/b;->y:LT8/b;

    .line 969
    .line 970
    invoke-virtual {v1, v0, v2}, Ly9/e;->a(Lj9/f;LT8/b;)LL8/g;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    instance-of v1, v0, LL8/e;

    .line 975
    .line 976
    if-eqz v1, :cond_26

    .line 977
    .line 978
    move-object v5, v0

    .line 979
    check-cast v5, LL8/e;

    .line 980
    .line 981
    :cond_26
    return-object v5

    .line 982
    :pswitch_4
    iget-object v0, v7, Ly9/g;->D:LV3/b;

    .line 983
    .line 984
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 985
    .line 986
    check-cast v0, LI4/c;

    .line 987
    .line 988
    iget-object v0, v0, LI4/c;->e:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v0, Lw9/a;

    .line 991
    .line 992
    iget-object v1, v7, Ly9/g;->N:Lw9/r;

    .line 993
    .line 994
    invoke-interface {v0, v1}, Lw9/c;->N(Lw9/r;)Ljava/util/ArrayList;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    invoke-static {v0}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    return-object v0

    .line 1003
    :pswitch_5
    invoke-static {v7}, LL8/v;->c(LL8/h;)Ljava/util/List;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    return-object v0

    .line 1008
    nop

    .line 1009
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
.end method
