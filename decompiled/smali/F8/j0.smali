.class public final LF8/j0;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LF8/k0;


# direct methods
.method public synthetic constructor <init>(LF8/k0;I)V
    .locals 0

    .line 1
    iput p2, p0, LF8/j0;->s:I

    iput-object p1, p0, LF8/j0;->t:LF8/k0;

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
    const/4 v1, 0x3

    .line 4
    iget-object v2, v0, LF8/j0;->t:LF8/k0;

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    iget v7, v0, LF8/j0;->s:I

    .line 11
    .line 12
    packed-switch v7, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v7, LF8/w0;->a:Lj9/b;

    .line 16
    .line 17
    invoke-virtual {v2}, LF8/k0;->l()LL8/K;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    invoke-static {v7}, LF8/w0;->b(LL8/K;)LF8/t0;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    instance-of v8, v7, LF8/n;

    .line 26
    .line 27
    if-eqz v8, :cond_b

    .line 28
    .line 29
    check-cast v7, LF8/n;

    .line 30
    .line 31
    sget-object v8, Li9/h;->a:Lk9/g;

    .line 32
    .line 33
    iget-object v8, v7, LF8/n;->u:Le9/G;

    .line 34
    .line 35
    iget-object v9, v7, LF8/n;->w:Lg9/f;

    .line 36
    .line 37
    iget-object v10, v7, LF8/n;->x:Lg9/g;

    .line 38
    .line 39
    invoke-static {v8, v9, v10, v5}, Li9/h;->b(Le9/G;Lg9/f;Lg9/g;Z)Li9/d;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    if-eqz v9, :cond_e

    .line 44
    .line 45
    iget-object v7, v7, LF8/n;->t:LL8/K;

    .line 46
    .line 47
    invoke-interface {v7}, LL8/c;->V()I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-ne v10, v3, :cond_1

    .line 52
    .line 53
    :cond_0
    move v5, v6

    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_1
    invoke-interface {v7}, LL8/j;->v()LL8/j;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    if-eqz v10, :cond_a

    .line 61
    .line 62
    invoke-static {v10}, Lm9/e;->l(LL8/j;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_5

    .line 67
    .line 68
    invoke-interface {v10}, LL8/j;->v()LL8/j;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v3, v5}, Lm9/e;->n(LL8/j;I)Z

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    if-nez v11, :cond_2

    .line 77
    .line 78
    invoke-static {v3, v1}, Lm9/e;->n(LL8/j;I)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    :cond_2
    check-cast v10, LL8/e;

    .line 85
    .line 86
    sget-object v1, LI8/d;->a:Ljava/util/LinkedHashSet;

    .line 87
    .line 88
    sget-object v1, LI8/d;->a:Ljava/util/LinkedHashSet;

    .line 89
    .line 90
    invoke-static {v10}, Lm9/e;->l(LL8/j;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    sget-object v1, LI8/d;->a:Ljava/util/LinkedHashSet;

    .line 97
    .line 98
    invoke-static {v10}, Lq9/d;->f(LL8/g;)Lj9/b;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    if-eqz v3, :cond_3

    .line 103
    .line 104
    invoke-virtual {v3}, Lj9/b;->f()Lj9/b;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    goto :goto_0

    .line 109
    :cond_3
    move-object v3, v4

    .line 110
    :goto_0
    invoke-static {v1, v3}, Li8/k;->O(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    move v1, v5

    .line 117
    goto :goto_1

    .line 118
    :cond_4
    move v1, v6

    .line 119
    :goto_1
    if-nez v1, :cond_5

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    invoke-interface {v7}, LL8/j;->v()LL8/j;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-static {v1}, Lm9/e;->l(LL8/j;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_0

    .line 131
    .line 132
    invoke-interface {v7}, LL8/K;->a0()LO8/u;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_6

    .line 137
    .line 138
    invoke-virtual {v1}, LB1/a;->q()LM8/h;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    sget-object v3, LU8/w;->a:Lj9/c;

    .line 143
    .line 144
    invoke-interface {v1, v3}, LM8/h;->E(Lj9/c;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    move v1, v5

    .line 151
    goto :goto_2

    .line 152
    :cond_6
    invoke-interface {v7}, LM8/a;->q()LM8/h;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    sget-object v3, LU8/w;->a:Lj9/c;

    .line 157
    .line 158
    invoke-interface {v1, v3}, LM8/h;->E(Lj9/c;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    :goto_2
    if-eqz v1, :cond_0

    .line 163
    .line 164
    :goto_3
    iget-object v1, v2, LF8/k0;->t:LF8/D;

    .line 165
    .line 166
    if-nez v5, :cond_9

    .line 167
    .line 168
    invoke-static {v8}, Li9/h;->d(Le9/G;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_7

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_7
    invoke-interface {v7}, LL8/j;->v()LL8/j;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    instance-of v3, v2, LL8/e;

    .line 180
    .line 181
    if-eqz v3, :cond_8

    .line 182
    .line 183
    check-cast v2, LL8/e;

    .line 184
    .line 185
    invoke-static {v2}, LF8/y0;->j(LL8/e;)Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    goto :goto_5

    .line 190
    :cond_8
    invoke-interface {v1}, Lv8/c;->a()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    goto :goto_5

    .line 195
    :cond_9
    :goto_4
    invoke-interface {v1}, Lv8/c;->a()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    :goto_5
    if-eqz v1, :cond_e

    .line 204
    .line 205
    :try_start_0
    iget-object v2, v9, Li9/d;->b:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 208
    .line 209
    .line 210
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    goto :goto_6

    .line 212
    :cond_a
    new-array v1, v1, [Ljava/lang/Object;

    .line 213
    .line 214
    const-string v2, "companionObject"

    .line 215
    .line 216
    aput-object v2, v1, v6

    .line 217
    .line 218
    const-string v2, "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil"

    .line 219
    .line 220
    aput-object v2, v1, v5

    .line 221
    .line 222
    const-string v2, "isClassCompanionObjectWithBackingFieldsInOuter"

    .line 223
    .line 224
    aput-object v2, v1, v3

    .line 225
    .line 226
    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 227
    .line 228
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 233
    .line 234
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v2

    .line 238
    :cond_b
    instance-of v1, v7, LF8/l;

    .line 239
    .line 240
    if-eqz v1, :cond_c

    .line 241
    .line 242
    check-cast v7, LF8/l;

    .line 243
    .line 244
    iget-object v4, v7, LF8/l;->t:Ljava/lang/reflect/Field;

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_c
    instance-of v1, v7, LF8/m;

    .line 248
    .line 249
    if-eqz v1, :cond_d

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_d
    instance-of v1, v7, LF8/o;

    .line 253
    .line 254
    if-eqz v1, :cond_f

    .line 255
    .line 256
    :catch_0
    :cond_e
    :goto_6
    return-object v4

    .line 257
    :cond_f
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 258
    .line 259
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 260
    .line 261
    .line 262
    throw v1

    .line 263
    :pswitch_0
    iget-object v1, v2, LF8/k0;->t:LF8/D;

    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    iget-object v7, v2, LF8/k0;->u:Ljava/lang/String;

    .line 269
    .line 270
    const-string v8, "name"

    .line 271
    .line 272
    invoke-static {v7, v8}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    iget-object v2, v2, LF8/k0;->v:Ljava/lang/String;

    .line 276
    .line 277
    const-string v8, "signature"

    .line 278
    .line 279
    invoke-static {v2, v8}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    sget-object v8, LF8/D;->s:LL9/e;

    .line 283
    .line 284
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-object v8, v8, LL9/e;->s:Ljava/util/regex/Pattern;

    .line 288
    .line 289
    invoke-virtual {v8, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    const-string v9, "matcher(...)"

    .line 294
    .line 295
    invoke-static {v8, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    if-nez v9, :cond_10

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_10
    new-instance v4, Lo1/k;

    .line 306
    .line 307
    const-string v9, "input"

    .line 308
    .line 309
    invoke-static {v2, v9}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 313
    .line 314
    .line 315
    iput-object v8, v4, Lo1/k;->s:Ljava/lang/Object;

    .line 316
    .line 317
    :goto_7
    if-eqz v4, :cond_13

    .line 318
    .line 319
    iget-object v2, v4, Lo1/k;->t:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v2, LL9/d;

    .line 322
    .line 323
    if-nez v2, :cond_11

    .line 324
    .line 325
    new-instance v2, LL9/d;

    .line 326
    .line 327
    invoke-direct {v2, v4, v6}, LL9/d;-><init>(Ljava/lang/Object;I)V

    .line 328
    .line 329
    .line 330
    iput-object v2, v4, Lo1/k;->t:Ljava/lang/Object;

    .line 331
    .line 332
    :cond_11
    iget-object v2, v4, Lo1/k;->t:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v2, LL9/d;

    .line 335
    .line 336
    invoke-static {v2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v5}, LL9/d;->get(I)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    check-cast v2, Ljava/lang/String;

    .line 344
    .line 345
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    invoke-virtual {v1, v3}, LF8/D;->f(I)LL8/K;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    if-eqz v3, :cond_12

    .line 354
    .line 355
    goto/16 :goto_b

    .line 356
    .line 357
    :cond_12
    new-instance v3, LF8/p0;

    .line 358
    .line 359
    const-string v4, "Local property #"

    .line 360
    .line 361
    const-string v5, " not found in "

    .line 362
    .line 363
    invoke-static {v4, v2, v5}, Landroidx/datastore/preferences/protobuf/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-interface {v1}, Lv8/c;->a()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-direct {v3, v1, v6}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 379
    .line 380
    .line 381
    throw v3

    .line 382
    :cond_13
    invoke-static {v7}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    invoke-virtual {v1, v4}, LF8/D;->i(Lj9/f;)Ljava/util/Collection;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    check-cast v4, Ljava/lang/Iterable;

    .line 391
    .line 392
    new-instance v8, Ljava/util/ArrayList;

    .line 393
    .line 394
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    :cond_14
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 402
    .line 403
    .line 404
    move-result v9

    .line 405
    if-eqz v9, :cond_15

    .line 406
    .line 407
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    move-object v10, v9

    .line 412
    check-cast v10, LL8/K;

    .line 413
    .line 414
    invoke-static {v10}, LF8/w0;->b(LL8/K;)LF8/t0;

    .line 415
    .line 416
    .line 417
    move-result-object v10

    .line 418
    invoke-virtual {v10}, LF8/t0;->d()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v10

    .line 422
    invoke-static {v10, v2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v10

    .line 426
    if-eqz v10, :cond_14

    .line 427
    .line 428
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    goto :goto_8

    .line 432
    :cond_15
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    const-string v9, ") not resolved in "

    .line 437
    .line 438
    const-string v10, "\' (JVM signature: "

    .line 439
    .line 440
    const-string v11, "Property \'"

    .line 441
    .line 442
    if-nez v4, :cond_1b

    .line 443
    .line 444
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 445
    .line 446
    .line 447
    move-result v4

    .line 448
    if-eq v4, v5, :cond_1a

    .line 449
    .line 450
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 451
    .line 452
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 456
    .line 457
    .line 458
    move-result-object v8

    .line 459
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v12

    .line 463
    if-eqz v12, :cond_17

    .line 464
    .line 465
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v12

    .line 469
    move-object v13, v12

    .line 470
    check-cast v13, LL8/K;

    .line 471
    .line 472
    invoke-interface {v13}, LL8/w;->f()LL8/n;

    .line 473
    .line 474
    .line 475
    move-result-object v13

    .line 476
    invoke-virtual {v4, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v14

    .line 480
    if-nez v14, :cond_16

    .line 481
    .line 482
    new-instance v14, Ljava/util/ArrayList;

    .line 483
    .line 484
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 485
    .line 486
    .line 487
    invoke-interface {v4, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    :cond_16
    check-cast v14, Ljava/util/List;

    .line 491
    .line 492
    invoke-interface {v14, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    goto :goto_9

    .line 496
    :cond_17
    new-instance v8, LF8/f;

    .line 497
    .line 498
    invoke-direct {v8, v3}, LF8/f;-><init>(I)V

    .line 499
    .line 500
    .line 501
    new-instance v3, Ljava/util/TreeMap;

    .line 502
    .line 503
    invoke-direct {v3, v8}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v3, v4}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v3}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    const-string v4, "properties\n             \u2026\n                }.values"

    .line 514
    .line 515
    invoke-static {v3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    check-cast v3, Ljava/lang/Iterable;

    .line 519
    .line 520
    invoke-static {v3}, Li8/k;->a0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    check-cast v3, Ljava/util/List;

    .line 525
    .line 526
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 527
    .line 528
    .line 529
    move-result v4

    .line 530
    if-ne v4, v5, :cond_18

    .line 531
    .line 532
    invoke-static {v3}, Li8/k;->T(Ljava/util/List;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    move-object v3, v1

    .line 537
    check-cast v3, LL8/K;

    .line 538
    .line 539
    goto :goto_b

    .line 540
    :cond_18
    invoke-static {v7}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    invoke-virtual {v1, v3}, LF8/D;->i(Lj9/f;)Ljava/util/Collection;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    move-object v12, v3

    .line 549
    check-cast v12, Ljava/lang/Iterable;

    .line 550
    .line 551
    sget-object v16, LF8/b;->y:LF8/b;

    .line 552
    .line 553
    const/4 v14, 0x0

    .line 554
    const/4 v15, 0x0

    .line 555
    const-string v13, "\n"

    .line 556
    .line 557
    const/16 v17, 0x1e

    .line 558
    .line 559
    invoke-static/range {v12 .. v17}, Li8/k;->Z(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu8/b;I)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    new-instance v4, LF8/p0;

    .line 564
    .line 565
    new-instance v5, Ljava/lang/StringBuilder;

    .line 566
    .line 567
    invoke-direct {v5, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    const/16 v1, 0x3a

    .line 586
    .line 587
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    if-nez v1, :cond_19

    .line 595
    .line 596
    const-string v1, " no members found"

    .line 597
    .line 598
    goto :goto_a

    .line 599
    :cond_19
    const-string v1, "\n"

    .line 600
    .line 601
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    :goto_a
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-direct {v4, v1, v6}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 613
    .line 614
    .line 615
    throw v4

    .line 616
    :cond_1a
    invoke-static {v8}, Li8/k;->k0(Ljava/util/List;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    move-object v3, v1

    .line 621
    check-cast v3, LL8/K;

    .line 622
    .line 623
    :goto_b
    return-object v3

    .line 624
    :cond_1b
    new-instance v3, LF8/p0;

    .line 625
    .line 626
    new-instance v4, Ljava/lang/StringBuilder;

    .line 627
    .line 628
    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    invoke-direct {v3, v1, v6}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 651
    .line 652
    .line 653
    throw v3

    .line 654
    nop

    .line 655
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
