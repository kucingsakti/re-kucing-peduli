.class public final LY8/z;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LY8/A;


# direct methods
.method public synthetic constructor <init>(LY8/A;I)V
    .locals 0

    .line 1
    iput p2, p0, LY8/z;->s:I

    iput-object p1, p0, LY8/z;->t:LY8/A;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-object v3, v0, LY8/z;->t:LY8/A;

    .line 6
    .line 7
    const-string v4, "name"

    .line 8
    .line 9
    iget v5, v0, LY8/z;->s:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Lj9/f;

    .line 17
    .line 18
    invoke-static {v1, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v4, v3, LY8/A;->g:Lz9/j;

    .line 27
    .line 28
    invoke-virtual {v4, v1}, Lz9/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-static {v2, v4}, LJ9/l;->b(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v1, v2}, LY8/A;->n(Lj9/f;Ljava/util/ArrayList;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, LY8/A;->q()LL8/j;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v4, 0x5

    .line 43
    invoke-static {v1, v4}, Lm9/e;->n(LL8/j;I)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-static {v2}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object v1, v3, LY8/A;->b:LFa/e;

    .line 55
    .line 56
    iget-object v3, v1, LFa/e;->t:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, LI4/a;

    .line 59
    .line 60
    iget-object v3, v3, LI4/a;->r:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, Lb9/d;

    .line 63
    .line 64
    invoke-virtual {v3, v1, v2}, Lb9/d;->e(LFa/e;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :goto_0
    return-object v1

    .line 73
    :pswitch_0
    move-object/from16 v5, p1

    .line 74
    .line 75
    check-cast v5, Lj9/f;

    .line 76
    .line 77
    invoke-static {v5, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 81
    .line 82
    iget-object v6, v3, LY8/A;->f:Lz9/e;

    .line 83
    .line 84
    invoke-virtual {v6, v5}, Lz9/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    check-cast v6, Ljava/util/Collection;

    .line 89
    .line 90
    invoke-direct {v4, v6}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 91
    .line 92
    .line 93
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_2

    .line 107
    .line 108
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    move-object v9, v8

    .line 113
    check-cast v9, LO8/N;

    .line 114
    .line 115
    invoke-static {v9, v2}, Lqa/b;->c(LL8/t;I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    if-nez v10, :cond_1

    .line 124
    .line 125
    new-instance v10, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-interface {v6, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    :cond_1
    check-cast v10, Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_4

    .line 152
    .line 153
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    check-cast v6, Ljava/util/List;

    .line 158
    .line 159
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    if-eq v7, v1, :cond_3

    .line 164
    .line 165
    check-cast v6, Ljava/util/Collection;

    .line 166
    .line 167
    sget-object v7, LY8/k;->u:LY8/k;

    .line 168
    .line 169
    invoke-static {v6, v7}, Lm9/m;->o(Ljava/util/Collection;Lu8/b;)Ljava/util/Collection;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-interface {v4, v6}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 174
    .line 175
    .line 176
    invoke-interface {v4, v7}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_4
    invoke-virtual {v3, v4, v5}, LY8/A;->m(Ljava/util/LinkedHashSet;Lj9/f;)V

    .line 181
    .line 182
    .line 183
    iget-object v1, v3, LY8/A;->b:LFa/e;

    .line 184
    .line 185
    iget-object v2, v1, LFa/e;->t:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v2, LI4/a;

    .line 188
    .line 189
    iget-object v2, v2, LI4/a;->r:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v2, Lb9/d;

    .line 192
    .line 193
    invoke-virtual {v2, v1, v4}, Lb9/d;->e(LFa/e;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-static {v1}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Ljava/util/Collection;

    .line 202
    .line 203
    return-object v1

    .line 204
    :pswitch_1
    move-object/from16 v1, p1

    .line 205
    .line 206
    check-cast v1, Lj9/f;

    .line 207
    .line 208
    invoke-static {v1, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    iget-object v2, v3, LY8/A;->c:LY8/p;

    .line 212
    .line 213
    if-eqz v2, :cond_5

    .line 214
    .line 215
    iget-object v2, v2, LY8/A;->f:Lz9/e;

    .line 216
    .line 217
    invoke-virtual {v2, v1}, Lz9/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    check-cast v1, Ljava/util/Collection;

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 227
    .line 228
    .line 229
    iget-object v4, v3, LY8/A;->e:Lz9/i;

    .line 230
    .line 231
    invoke-virtual {v4}, Lz9/i;->invoke()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    check-cast v4, LY8/c;

    .line 236
    .line 237
    invoke-interface {v4, v1}, LY8/c;->e(Lj9/f;)Ljava/util/Collection;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    :cond_6
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    if-eqz v5, :cond_7

    .line 250
    .line 251
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    check-cast v5, LR8/w;

    .line 256
    .line 257
    invoke-virtual {v3, v5}, LY8/A;->t(LR8/w;)LW8/f;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-virtual {v3, v5}, LY8/A;->r(LW8/f;)Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    if-eqz v6, :cond_6

    .line 266
    .line 267
    iget-object v6, v3, LY8/A;->b:LFa/e;

    .line 268
    .line 269
    iget-object v6, v6, LFa/e;->t:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v6, LI4/a;

    .line 272
    .line 273
    iget-object v6, v6, LI4/a;->g:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v6, LV8/h;

    .line 276
    .line 277
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_7
    invoke-virtual {v3, v1, v2}, LY8/A;->j(Lj9/f;Ljava/util/ArrayList;)V

    .line 285
    .line 286
    .line 287
    move-object v1, v2

    .line 288
    :goto_4
    return-object v1

    .line 289
    :pswitch_2
    move-object/from16 v5, p1

    .line 290
    .line 291
    check-cast v5, Lj9/f;

    .line 292
    .line 293
    invoke-static {v5, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    iget-object v4, v3, LY8/A;->c:LY8/p;

    .line 297
    .line 298
    if-eqz v4, :cond_8

    .line 299
    .line 300
    iget-object v1, v4, LY8/A;->g:Lz9/j;

    .line 301
    .line 302
    invoke-virtual {v1, v5}, Lz9/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, LL8/K;

    .line 307
    .line 308
    goto/16 :goto_b

    .line 309
    .line 310
    :cond_8
    iget-object v4, v3, LY8/A;->e:Lz9/i;

    .line 311
    .line 312
    invoke-virtual {v4}, Lz9/i;->invoke()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    check-cast v4, LY8/c;

    .line 317
    .line 318
    invoke-interface {v4, v5}, LY8/c;->d(Lj9/f;)LR8/t;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    const/4 v5, 0x0

    .line 323
    if-eqz v4, :cond_15

    .line 324
    .line 325
    iget-object v6, v4, LR8/t;->a:Ljava/lang/reflect/Field;

    .line 326
    .line 327
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    if-nez v7, :cond_15

    .line 332
    .line 333
    invoke-virtual {v4}, LR8/t;->b()Ljava/lang/reflect/Member;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    check-cast v7, Ljava/lang/reflect/Field;

    .line 338
    .line 339
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    xor-int/lit8 v11, v7, 0x1

    .line 348
    .line 349
    iget-object v7, v3, LY8/A;->b:LFa/e;

    .line 350
    .line 351
    invoke-static {v7, v4}, LQ3/u0;->k(LFa/e;La9/b;)LX8/b;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    invoke-virtual {v3}, LY8/A;->q()LL8/j;

    .line 356
    .line 357
    .line 358
    move-result-object v8

    .line 359
    invoke-virtual {v4}, LR8/v;->e()LL8/e0;

    .line 360
    .line 361
    .line 362
    move-result-object v10

    .line 363
    invoke-static {v10}, Lga/d;->F(LL8/e0;)LL8/n;

    .line 364
    .line 365
    .line 366
    move-result-object v10

    .line 367
    invoke-virtual {v4}, LR8/v;->c()Lj9/f;

    .line 368
    .line 369
    .line 370
    move-result-object v12

    .line 371
    iget-object v13, v7, LFa/e;->t:Ljava/lang/Object;

    .line 372
    .line 373
    move-object v15, v13

    .line 374
    check-cast v15, LI4/a;

    .line 375
    .line 376
    iget-object v13, v15, LI4/a;->j:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v13, LQ8/d;

    .line 379
    .line 380
    invoke-virtual {v13, v4}, LQ8/d;->a(La9/c;)LQ8/f;

    .line 381
    .line 382
    .line 383
    move-result-object v13

    .line 384
    invoke-virtual {v4}, LR8/t;->b()Ljava/lang/reflect/Member;

    .line 385
    .line 386
    .line 387
    move-result-object v14

    .line 388
    check-cast v14, Ljava/lang/reflect/Field;

    .line 389
    .line 390
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 391
    .line 392
    .line 393
    move-result v14

    .line 394
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 395
    .line 396
    .line 397
    move-result v14

    .line 398
    const/4 v1, 0x0

    .line 399
    if-eqz v14, :cond_9

    .line 400
    .line 401
    invoke-virtual {v4}, LR8/t;->b()Ljava/lang/reflect/Member;

    .line 402
    .line 403
    .line 404
    move-result-object v14

    .line 405
    check-cast v14, Ljava/lang/reflect/Field;

    .line 406
    .line 407
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 408
    .line 409
    .line 410
    move-result v14

    .line 411
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 412
    .line 413
    .line 414
    move-result v14

    .line 415
    if-eqz v14, :cond_9

    .line 416
    .line 417
    const/4 v14, 0x1

    .line 418
    goto :goto_5

    .line 419
    :cond_9
    move v14, v1

    .line 420
    :goto_5
    invoke-static/range {v8 .. v14}, LW8/g;->h1(LL8/j;LX8/b;LL8/n;ZLj9/f;LQ8/f;Z)LW8/g;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    invoke-virtual {v8, v5, v5, v5, v5}, LO8/K;->d1(LO8/L;LO8/M;LO8/u;LO8/u;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    const-string v9, "member.genericType"

    .line 432
    .line 433
    invoke-static {v6, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    instance-of v9, v6, Ljava/lang/Class;

    .line 437
    .line 438
    if-eqz v9, :cond_a

    .line 439
    .line 440
    move-object v10, v6

    .line 441
    check-cast v10, Ljava/lang/Class;

    .line 442
    .line 443
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    if-eqz v11, :cond_a

    .line 448
    .line 449
    new-instance v6, LR8/y;

    .line 450
    .line 451
    invoke-direct {v6, v10}, LR8/y;-><init>(Ljava/lang/Class;)V

    .line 452
    .line 453
    .line 454
    goto :goto_8

    .line 455
    :cond_a
    instance-of v10, v6, Ljava/lang/reflect/GenericArrayType;

    .line 456
    .line 457
    if-nez v10, :cond_d

    .line 458
    .line 459
    if-eqz v9, :cond_b

    .line 460
    .line 461
    move-object v9, v6

    .line 462
    check-cast v9, Ljava/lang/Class;

    .line 463
    .line 464
    invoke-virtual {v9}, Ljava/lang/Class;->isArray()Z

    .line 465
    .line 466
    .line 467
    move-result v9

    .line 468
    if-eqz v9, :cond_b

    .line 469
    .line 470
    goto :goto_7

    .line 471
    :cond_b
    instance-of v9, v6, Ljava/lang/reflect/WildcardType;

    .line 472
    .line 473
    if-eqz v9, :cond_c

    .line 474
    .line 475
    new-instance v9, LR8/D;

    .line 476
    .line 477
    check-cast v6, Ljava/lang/reflect/WildcardType;

    .line 478
    .line 479
    invoke-direct {v9, v6}, LR8/D;-><init>(Ljava/lang/reflect/WildcardType;)V

    .line 480
    .line 481
    .line 482
    :goto_6
    move-object v6, v9

    .line 483
    goto :goto_8

    .line 484
    :cond_c
    new-instance v9, LR8/p;

    .line 485
    .line 486
    invoke-direct {v9, v6}, LR8/p;-><init>(Ljava/lang/reflect/Type;)V

    .line 487
    .line 488
    .line 489
    goto :goto_6

    .line 490
    :cond_d
    :goto_7
    new-instance v9, LR8/h;

    .line 491
    .line 492
    invoke-direct {v9, v6}, LR8/h;-><init>(Ljava/lang/reflect/Type;)V

    .line 493
    .line 494
    .line 495
    goto :goto_6

    .line 496
    :goto_8
    const/4 v9, 0x7

    .line 497
    invoke-static {v2, v1, v5, v9}, LC8/E;->A(IZLY8/F;I)LZ8/a;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    iget-object v2, v7, LFa/e;->x:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v2, LY1/c;

    .line 504
    .line 505
    invoke-virtual {v2, v6, v1}, LY1/c;->P(La9/d;LZ8/a;)LA9/y;

    .line 506
    .line 507
    .line 508
    move-result-object v17

    .line 509
    invoke-static/range {v17 .. v17}, LI8/i;->F(LA9/y;)Z

    .line 510
    .line 511
    .line 512
    move-result v1

    .line 513
    if-nez v1, :cond_e

    .line 514
    .line 515
    invoke-static/range {v17 .. v17}, LI8/i;->G(LA9/y;)Z

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    if-eqz v1, :cond_f

    .line 520
    .line 521
    :cond_e
    invoke-virtual {v4}, LR8/t;->b()Ljava/lang/reflect/Member;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    check-cast v1, Ljava/lang/reflect/Field;

    .line 526
    .line 527
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    if-eqz v1, :cond_f

    .line 536
    .line 537
    invoke-virtual {v4}, LR8/t;->b()Ljava/lang/reflect/Member;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    check-cast v1, Ljava/lang/reflect/Field;

    .line 542
    .line 543
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    :cond_f
    sget-object v18, Li8/s;->s:Li8/s;

    .line 552
    .line 553
    invoke-virtual {v3}, LY8/A;->p()LO8/x;

    .line 554
    .line 555
    .line 556
    move-result-object v19

    .line 557
    const/16 v20, 0x0

    .line 558
    .line 559
    move-object/from16 v21, v18

    .line 560
    .line 561
    move-object/from16 v16, v8

    .line 562
    .line 563
    invoke-virtual/range {v16 .. v21}, LO8/K;->g1(LA9/y;Ljava/util/List;LO8/x;LO8/x;Ljava/util/List;)V

    .line 564
    .line 565
    .line 566
    move-object/from16 v1, v16

    .line 567
    .line 568
    invoke-virtual {v1}, LO8/V;->getType()LA9/y;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    if-eqz v2, :cond_14

    .line 573
    .line 574
    sget v6, Lm9/e;->a:I

    .line 575
    .line 576
    iget-boolean v6, v1, LO8/K;->x:Z

    .line 577
    .line 578
    if-nez v6, :cond_13

    .line 579
    .line 580
    invoke-static {v2}, LA9/c;->j(LA9/y;)Z

    .line 581
    .line 582
    .line 583
    move-result v6

    .line 584
    if-eqz v6, :cond_10

    .line 585
    .line 586
    goto :goto_a

    .line 587
    :cond_10
    invoke-static {v2}, LA9/b0;->b(LA9/y;)Z

    .line 588
    .line 589
    .line 590
    move-result v6

    .line 591
    if-eqz v6, :cond_11

    .line 592
    .line 593
    goto :goto_9

    .line 594
    :cond_11
    invoke-static {v1}, Lq9/d;->e(LL8/j;)LI8/i;

    .line 595
    .line 596
    .line 597
    move-result-object v6

    .line 598
    invoke-static {v2}, LI8/i;->F(LA9/y;)Z

    .line 599
    .line 600
    .line 601
    move-result v7

    .line 602
    if-nez v7, :cond_12

    .line 603
    .line 604
    sget-object v7, LB9/d;->a:LB9/m;

    .line 605
    .line 606
    invoke-virtual {v6}, LI8/i;->u()LA9/D;

    .line 607
    .line 608
    .line 609
    move-result-object v8

    .line 610
    invoke-virtual {v7, v8, v2}, LB9/m;->a(LA9/y;LA9/y;)Z

    .line 611
    .line 612
    .line 613
    move-result v8

    .line 614
    if-nez v8, :cond_12

    .line 615
    .line 616
    const-string v8, "Number"

    .line 617
    .line 618
    invoke-virtual {v6, v8}, LI8/i;->j(Ljava/lang/String;)LL8/e;

    .line 619
    .line 620
    .line 621
    move-result-object v8

    .line 622
    invoke-interface {v8}, LL8/e;->p()LA9/D;

    .line 623
    .line 624
    .line 625
    move-result-object v8

    .line 626
    invoke-virtual {v7, v8, v2}, LB9/m;->a(LA9/y;LA9/y;)Z

    .line 627
    .line 628
    .line 629
    move-result v8

    .line 630
    if-nez v8, :cond_12

    .line 631
    .line 632
    invoke-virtual {v6}, LI8/i;->e()LA9/D;

    .line 633
    .line 634
    .line 635
    move-result-object v6

    .line 636
    invoke-virtual {v7, v6, v2}, LB9/m;->a(LA9/y;LA9/y;)Z

    .line 637
    .line 638
    .line 639
    move-result v6

    .line 640
    if-nez v6, :cond_12

    .line 641
    .line 642
    invoke-static {v2}, LI8/s;->a(LA9/y;)Z

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    if-eqz v2, :cond_13

    .line 647
    .line 648
    :cond_12
    :goto_9
    new-instance v2, LA0/j;

    .line 649
    .line 650
    const/4 v6, 0x6

    .line 651
    invoke-direct {v2, v3, v4, v1, v6}, LA0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v1, v5, v2}, LO8/K;->e1(Lz9/h;Lu8/a;)V

    .line 655
    .line 656
    .line 657
    :cond_13
    :goto_a
    iget-object v2, v15, LI4/a;->g:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast v2, LV8/h;

    .line 660
    .line 661
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    goto :goto_b

    .line 665
    :cond_14
    const/16 v1, 0x43

    .line 666
    .line 667
    invoke-static {v1}, Lm9/e;->a(I)V

    .line 668
    .line 669
    .line 670
    throw v5

    .line 671
    :cond_15
    move-object v1, v5

    .line 672
    :goto_b
    return-object v1

    .line 673
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
