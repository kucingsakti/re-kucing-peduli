.class public final LF8/E;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LF8/F;


# direct methods
.method public synthetic constructor <init>(LF8/F;I)V
    .locals 0

    .line 1
    iput p2, p0, LF8/E;->s:I

    iput-object p1, p0, LF8/E;->t:LF8/F;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0xa

    .line 5
    .line 6
    const/16 v3, 0x29

    .line 7
    .line 8
    const-string v4, "desc"

    .line 9
    .line 10
    iget-object v5, v0, LF8/E;->t:LF8/F;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    iget v8, v0, LF8/E;->s:I

    .line 15
    .line 16
    packed-switch v8, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object v8, LF8/w0;->a:Lj9/b;

    .line 20
    .line 21
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    invoke-static {v8}, LF8/w0;->c(LL8/t;)LF8/t0;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    instance-of v9, v8, LF8/k;

    .line 30
    .line 31
    iget-object v10, v5, LF8/F;->t:LF8/D;

    .line 32
    .line 33
    const/4 v11, 0x0

    .line 34
    if-eqz v9, :cond_2

    .line 35
    .line 36
    check-cast v8, LF8/k;

    .line 37
    .line 38
    iget-object v2, v8, LF8/k;->t:Li9/e;

    .line 39
    .line 40
    invoke-virtual {v5}, LF8/F;->c()LG8/e;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-interface {v8}, LG8/e;->y()Ljava/lang/reflect/Member;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-static {v8}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v8}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    xor-int/lit8 v9, v8, 0x1

    .line 60
    .line 61
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const-string v12, "name"

    .line 65
    .line 66
    iget-object v13, v2, Li9/e;->b:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v13, v12}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object v2, v2, Li9/e;->c:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v2, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v4, "<init>"

    .line 77
    .line 78
    invoke-virtual {v13, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_0

    .line 83
    .line 84
    goto/16 :goto_2

    .line 85
    .line 86
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    if-nez v8, :cond_1

    .line 92
    .line 93
    invoke-interface {v10}, Lv8/c;->a()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_1
    invoke-virtual {v10, v4, v2, v6}, LF8/D;->b(Ljava/util/ArrayList;Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v10}, LF8/D;->h()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    const-string v12, "$default"

    .line 108
    .line 109
    invoke-virtual {v13, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    new-array v13, v6, [Ljava/lang/Class;

    .line 114
    .line 115
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, [Ljava/lang/Class;

    .line 120
    .line 121
    const/4 v13, 0x6

    .line 122
    invoke-static {v2, v3, v6, v13}, LL9/f;->O(Ljava/lang/CharSequence;CII)I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    add-int/2addr v3, v7

    .line 127
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-virtual {v10, v3, v2, v6}, LF8/D;->l(ILjava/lang/String;I)Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {v8, v12, v4, v2, v9}, LF8/D;->k(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    goto/16 :goto_3

    .line 140
    .line 141
    :cond_2
    instance-of v3, v8, LF8/j;

    .line 142
    .line 143
    const/4 v15, 0x1

    .line 144
    if-eqz v3, :cond_5

    .line 145
    .line 146
    invoke-virtual {v5}, LF8/s;->i()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_4

    .line 151
    .line 152
    invoke-interface {v10}, Lv8/c;->a()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v5}, LF8/s;->u()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Ljava/lang/Iterable;

    .line 161
    .line 162
    new-instance v4, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-static {v3, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_3

    .line 180
    .line 181
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, LC8/l;

    .line 186
    .line 187
    check-cast v3, LF8/U;

    .line 188
    .line 189
    invoke-virtual {v3}, LF8/U;->b()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-static {v3}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_3
    new-instance v11, LG8/a;

    .line 201
    .line 202
    invoke-direct {v11, v1, v4, v15}, LG8/a;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;I)V

    .line 203
    .line 204
    .line 205
    goto/16 :goto_5

    .line 206
    .line 207
    :cond_4
    check-cast v8, LF8/j;

    .line 208
    .line 209
    iget-object v2, v8, LF8/j;->t:Li9/e;

    .line 210
    .line 211
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object v2, v2, Li9/e;->c:Ljava/lang/String;

    .line 215
    .line 216
    invoke-static {v2, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v10}, Lv8/c;->a()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    new-instance v4, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10, v4, v2, v7}, LF8/D;->b(Ljava/util/ArrayList;Ljava/lang/String;Z)V

    .line 229
    .line 230
    .line 231
    invoke-static {v3, v4}, LF8/D;->m(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/reflect/Constructor;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    goto :goto_3

    .line 236
    :cond_5
    instance-of v3, v8, LF8/g;

    .line 237
    .line 238
    if-eqz v3, :cond_7

    .line 239
    .line 240
    check-cast v8, LF8/g;

    .line 241
    .line 242
    invoke-interface {v10}, Lv8/c;->a()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object v13

    .line 246
    iget-object v1, v8, LF8/g;->t:Ljava/util/List;

    .line 247
    .line 248
    move-object v3, v1

    .line 249
    check-cast v3, Ljava/lang/Iterable;

    .line 250
    .line 251
    new-instance v14, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-static {v3, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    invoke-direct {v14, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-eqz v3, :cond_6

    .line 269
    .line 270
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    check-cast v3, Ljava/lang/reflect/Method;

    .line 275
    .line 276
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    goto :goto_1

    .line 284
    :cond_6
    new-instance v12, LG8/a;

    .line 285
    .line 286
    const/16 v16, 0x1

    .line 287
    .line 288
    move-object/from16 v17, v1

    .line 289
    .line 290
    invoke-direct/range {v12 .. v17}, LG8/a;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;IILjava/util/List;)V

    .line 291
    .line 292
    .line 293
    move-object v11, v12

    .line 294
    goto/16 :goto_5

    .line 295
    .line 296
    :cond_7
    :goto_2
    move-object v2, v11

    .line 297
    :goto_3
    instance-of v3, v2, Ljava/lang/reflect/Constructor;

    .line 298
    .line 299
    if-eqz v3, :cond_8

    .line 300
    .line 301
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 302
    .line 303
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-static {v5, v2, v1, v7}, LF8/F;->k(LF8/F;Ljava/lang/reflect/Constructor;LL8/t;Z)LG8/t;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    goto :goto_4

    .line 312
    :cond_8
    instance-of v3, v2, Ljava/lang/reflect/Method;

    .line 313
    .line 314
    if-eqz v3, :cond_c

    .line 315
    .line 316
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    check-cast v3, LB1/a;

    .line 321
    .line 322
    invoke-virtual {v3}, LB1/a;->q()LM8/h;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    sget-object v4, LF8/y0;->a:Lj9/c;

    .line 327
    .line 328
    invoke-interface {v3, v4}, LM8/h;->H(Lj9/c;)LM8/b;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    if-eqz v3, :cond_a

    .line 333
    .line 334
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-interface {v3}, LL8/j;->v()LL8/j;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    const-string v4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 343
    .line 344
    invoke-static {v3, v4}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    check-cast v3, LL8/e;

    .line 348
    .line 349
    invoke-interface {v3}, LL8/e;->N()Z

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    if-nez v3, :cond_a

    .line 354
    .line 355
    check-cast v2, Ljava/lang/reflect/Method;

    .line 356
    .line 357
    invoke-virtual {v5}, LF8/F;->j()Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    if-eqz v1, :cond_9

    .line 362
    .line 363
    new-instance v1, LG8/q;

    .line 364
    .line 365
    invoke-direct {v1, v2}, LG8/q;-><init>(Ljava/lang/reflect/Method;)V

    .line 366
    .line 367
    .line 368
    goto :goto_4

    .line 369
    :cond_9
    new-instance v1, LG8/s;

    .line 370
    .line 371
    invoke-direct {v1, v7, v2}, LG8/s;-><init>(ILjava/lang/reflect/Method;)V

    .line 372
    .line 373
    .line 374
    goto :goto_4

    .line 375
    :cond_a
    check-cast v2, Ljava/lang/reflect/Method;

    .line 376
    .line 377
    invoke-virtual {v5}, LF8/F;->j()Z

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    if-eqz v3, :cond_b

    .line 382
    .line 383
    new-instance v1, LG8/r;

    .line 384
    .line 385
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    iget-object v4, v5, LF8/F;->v:Ljava/lang/Object;

    .line 390
    .line 391
    invoke-static {v4, v3}, LC4/a;->f(Ljava/lang/Object;LL8/c;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    invoke-direct {v1, v2, v3}, LG8/r;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    goto :goto_4

    .line 399
    :cond_b
    new-instance v3, LG8/s;

    .line 400
    .line 401
    invoke-direct {v3, v1, v2}, LG8/s;-><init>(ILjava/lang/reflect/Method;)V

    .line 402
    .line 403
    .line 404
    move-object v1, v3

    .line 405
    goto :goto_4

    .line 406
    :cond_c
    move-object v1, v11

    .line 407
    :goto_4
    if-eqz v1, :cond_d

    .line 408
    .line 409
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-static {v1, v2, v7}, LC4/a;->m(LG8/e;LL8/t;Z)LG8/e;

    .line 414
    .line 415
    .line 416
    move-result-object v11

    .line 417
    :cond_d
    :goto_5
    return-object v11

    .line 418
    :pswitch_0
    sget-object v8, LF8/w0;->a:Lj9/b;

    .line 419
    .line 420
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    invoke-static {v8}, LF8/w0;->c(LL8/t;)LF8/t0;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    instance-of v9, v8, LF8/j;

    .line 429
    .line 430
    const/4 v13, 0x2

    .line 431
    iget-object v10, v5, LF8/F;->t:LF8/D;

    .line 432
    .line 433
    if-eqz v9, :cond_10

    .line 434
    .line 435
    invoke-virtual {v5}, LF8/s;->i()Z

    .line 436
    .line 437
    .line 438
    move-result v9

    .line 439
    if-eqz v9, :cond_f

    .line 440
    .line 441
    invoke-interface {v10}, Lv8/c;->a()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-virtual {v5}, LF8/s;->u()Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object v3

    .line 449
    check-cast v3, Ljava/lang/Iterable;

    .line 450
    .line 451
    new-instance v4, Ljava/util/ArrayList;

    .line 452
    .line 453
    invoke-static {v3, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 454
    .line 455
    .line 456
    move-result v2

    .line 457
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 458
    .line 459
    .line 460
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    if-eqz v3, :cond_e

    .line 469
    .line 470
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    check-cast v3, LC8/l;

    .line 475
    .line 476
    check-cast v3, LF8/U;

    .line 477
    .line 478
    invoke-virtual {v3}, LF8/U;->b()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v3

    .line 482
    invoke-static {v3}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    goto :goto_6

    .line 489
    :cond_e
    new-instance v2, LG8/a;

    .line 490
    .line 491
    invoke-direct {v2, v1, v4, v13}, LG8/a;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;I)V

    .line 492
    .line 493
    .line 494
    goto/16 :goto_a

    .line 495
    .line 496
    :cond_f
    check-cast v8, LF8/j;

    .line 497
    .line 498
    iget-object v2, v8, LF8/j;->t:Li9/e;

    .line 499
    .line 500
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    iget-object v2, v2, Li9/e;->c:Ljava/lang/String;

    .line 504
    .line 505
    invoke-static {v2, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    invoke-interface {v10}, Lv8/c;->a()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    move-result-object v4

    .line 512
    invoke-virtual {v10, v2}, LF8/D;->j(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    invoke-static {v4, v2}, LF8/D;->m(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/reflect/Constructor;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    goto :goto_7

    .line 521
    :cond_10
    instance-of v4, v8, LF8/k;

    .line 522
    .line 523
    if-eqz v4, :cond_11

    .line 524
    .line 525
    check-cast v8, LF8/k;

    .line 526
    .line 527
    iget-object v2, v8, LF8/k;->t:Li9/e;

    .line 528
    .line 529
    iget-object v4, v2, Li9/e;->c:Ljava/lang/String;

    .line 530
    .line 531
    iget-object v2, v2, Li9/e;->b:Ljava/lang/String;

    .line 532
    .line 533
    invoke-virtual {v10, v2, v4}, LF8/D;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    goto :goto_7

    .line 538
    :cond_11
    instance-of v4, v8, LF8/i;

    .line 539
    .line 540
    if-eqz v4, :cond_12

    .line 541
    .line 542
    check-cast v8, LF8/i;

    .line 543
    .line 544
    iget-object v2, v8, LF8/i;->t:Ljava/lang/reflect/Method;

    .line 545
    .line 546
    goto :goto_7

    .line 547
    :cond_12
    instance-of v4, v8, LF8/h;

    .line 548
    .line 549
    if-eqz v4, :cond_1a

    .line 550
    .line 551
    check-cast v8, LF8/h;

    .line 552
    .line 553
    iget-object v2, v8, LF8/h;->t:Ljava/lang/reflect/Constructor;

    .line 554
    .line 555
    :goto_7
    instance-of v4, v2, Ljava/lang/reflect/Constructor;

    .line 556
    .line 557
    if-eqz v4, :cond_13

    .line 558
    .line 559
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 560
    .line 561
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    invoke-static {v5, v2, v1, v6}, LF8/F;->k(LF8/F;Ljava/lang/reflect/Constructor;LL8/t;Z)LG8/t;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    goto :goto_8

    .line 570
    :cond_13
    instance-of v4, v2, Ljava/lang/reflect/Method;

    .line 571
    .line 572
    if-eqz v4, :cond_19

    .line 573
    .line 574
    check-cast v2, Ljava/lang/reflect/Method;

    .line 575
    .line 576
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 577
    .line 578
    .line 579
    move-result v3

    .line 580
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 581
    .line 582
    .line 583
    move-result v3

    .line 584
    iget-object v4, v5, LF8/F;->v:Ljava/lang/Object;

    .line 585
    .line 586
    if-nez v3, :cond_15

    .line 587
    .line 588
    invoke-virtual {v5}, LF8/F;->j()Z

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    if-eqz v1, :cond_14

    .line 593
    .line 594
    new-instance v1, LG8/p;

    .line 595
    .line 596
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    invoke-static {v4, v3}, LC4/a;->f(Ljava/lang/Object;LL8/c;)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    invoke-direct {v1, v2, v3}, LG8/p;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    goto :goto_8

    .line 608
    :cond_14
    new-instance v1, LG8/s;

    .line 609
    .line 610
    invoke-direct {v1, v6, v2}, LG8/s;-><init>(ILjava/lang/reflect/Method;)V

    .line 611
    .line 612
    .line 613
    goto :goto_8

    .line 614
    :cond_15
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 615
    .line 616
    .line 617
    move-result-object v3

    .line 618
    check-cast v3, LB1/a;

    .line 619
    .line 620
    invoke-virtual {v3}, LB1/a;->q()LM8/h;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    sget-object v8, LF8/y0;->a:Lj9/c;

    .line 625
    .line 626
    invoke-interface {v3, v8}, LM8/h;->H(Lj9/c;)LM8/b;

    .line 627
    .line 628
    .line 629
    move-result-object v3

    .line 630
    if-eqz v3, :cond_17

    .line 631
    .line 632
    invoke-virtual {v5}, LF8/F;->j()Z

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    if-eqz v1, :cond_16

    .line 637
    .line 638
    new-instance v1, LG8/q;

    .line 639
    .line 640
    invoke-direct {v1, v2}, LG8/q;-><init>(Ljava/lang/reflect/Method;)V

    .line 641
    .line 642
    .line 643
    goto :goto_8

    .line 644
    :cond_16
    new-instance v1, LG8/s;

    .line 645
    .line 646
    invoke-direct {v1, v7, v2}, LG8/s;-><init>(ILjava/lang/reflect/Method;)V

    .line 647
    .line 648
    .line 649
    goto :goto_8

    .line 650
    :cond_17
    invoke-virtual {v5}, LF8/F;->j()Z

    .line 651
    .line 652
    .line 653
    move-result v3

    .line 654
    if-eqz v3, :cond_18

    .line 655
    .line 656
    new-instance v1, LG8/r;

    .line 657
    .line 658
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    invoke-static {v4, v3}, LC4/a;->f(Ljava/lang/Object;LL8/c;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    invoke-direct {v1, v2, v3}, LG8/r;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    goto :goto_8

    .line 670
    :cond_18
    new-instance v3, LG8/s;

    .line 671
    .line 672
    invoke-direct {v3, v1, v2}, LG8/s;-><init>(ILjava/lang/reflect/Method;)V

    .line 673
    .line 674
    .line 675
    move-object v1, v3

    .line 676
    :goto_8
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    invoke-static {v1, v2, v6}, LC4/a;->m(LG8/e;LL8/t;Z)LG8/e;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    goto :goto_a

    .line 685
    :cond_19
    new-instance v1, LF8/p0;

    .line 686
    .line 687
    new-instance v4, Ljava/lang/StringBuilder;

    .line 688
    .line 689
    const-string v7, "Could not compute caller for function: "

    .line 690
    .line 691
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v5}, LF8/F;->l()LL8/t;

    .line 695
    .line 696
    .line 697
    move-result-object v5

    .line 698
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 699
    .line 700
    .line 701
    const-string v5, " (member = "

    .line 702
    .line 703
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    invoke-direct {v1, v2, v6}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 717
    .line 718
    .line 719
    throw v1

    .line 720
    :cond_1a
    instance-of v1, v8, LF8/g;

    .line 721
    .line 722
    if-eqz v1, :cond_1c

    .line 723
    .line 724
    check-cast v8, LF8/g;

    .line 725
    .line 726
    invoke-interface {v10}, Lv8/c;->a()Ljava/lang/Class;

    .line 727
    .line 728
    .line 729
    move-result-object v11

    .line 730
    iget-object v15, v8, LF8/g;->t:Ljava/util/List;

    .line 731
    .line 732
    move-object v1, v15

    .line 733
    check-cast v1, Ljava/lang/Iterable;

    .line 734
    .line 735
    new-instance v12, Ljava/util/ArrayList;

    .line 736
    .line 737
    invoke-static {v1, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 738
    .line 739
    .line 740
    move-result v2

    .line 741
    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 742
    .line 743
    .line 744
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 749
    .line 750
    .line 751
    move-result v2

    .line 752
    if-eqz v2, :cond_1b

    .line 753
    .line 754
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    check-cast v2, Ljava/lang/reflect/Method;

    .line 759
    .line 760
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    goto :goto_9

    .line 768
    :cond_1b
    new-instance v10, LG8/a;

    .line 769
    .line 770
    const/4 v14, 0x1

    .line 771
    invoke-direct/range {v10 .. v15}, LG8/a;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;IILjava/util/List;)V

    .line 772
    .line 773
    .line 774
    move-object v2, v10

    .line 775
    :goto_a
    return-object v2

    .line 776
    :cond_1c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 777
    .line 778
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 779
    .line 780
    .line 781
    throw v1

    .line 782
    nop

    .line 783
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
