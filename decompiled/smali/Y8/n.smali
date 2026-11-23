.class public final LY8/n;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LFa/e;

.field public final synthetic u:LY8/p;


# direct methods
.method public constructor <init>(LFa/e;LY8/p;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LY8/n;->s:I

    .line 1
    iput-object p1, p0, LY8/n;->t:LFa/e;

    iput-object p2, p0, LY8/n;->u:LY8/p;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LY8/p;LFa/e;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LY8/n;->s:I

    .line 2
    iput-object p1, p0, LY8/n;->u:LY8/p;

    iput-object p2, p0, LY8/n;->t:LFa/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LY8/n;->s:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LY8/n;->t:LFa/e;

    .line 9
    .line 10
    iget-object v2, v1, LFa/e;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, LI4/a;

    .line 13
    .line 14
    iget-object v3, v0, LY8/n;->u:LY8/p;

    .line 15
    .line 16
    iget-object v3, v3, LY8/p;->n:LL8/e;

    .line 17
    .line 18
    iget-object v2, v2, LI4/a;->x:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lr9/e;

    .line 21
    .line 22
    check-cast v2, Lr9/a;

    .line 23
    .line 24
    invoke-virtual {v2, v1, v3}, Lr9/a;->f(LFa/e;LL8/e;)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Li8/k;->w0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    return-object v1

    .line 33
    :pswitch_0
    iget-object v2, v0, LY8/n;->u:LY8/p;

    .line 34
    .line 35
    iget-object v1, v2, LY8/p;->o:LR8/n;

    .line 36
    .line 37
    iget-object v1, v1, LR8/n;->a:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v3, "klass.declaredConstructors"

    .line 44
    .line 45
    invoke-static {v1, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Li8/i;->m([Ljava/lang/Object;)LK9/l;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    sget-object v3, LR8/i;->A:LR8/i;

    .line 53
    .line 54
    new-instance v4, LK9/g;

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    invoke-direct {v4, v1, v9, v3}, LK9/g;-><init>(LK9/l;ZLu8/b;)V

    .line 58
    .line 59
    .line 60
    sget-object v1, LR8/j;->A:LR8/j;

    .line 61
    .line 62
    invoke-static {v4, v1}, LK9/n;->z(LK9/l;Lu8/b;)LK9/u;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1}, LK9/n;->B(LK9/l;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/util/Collection;

    .line 71
    .line 72
    new-instance v3, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    const/4 v10, 0x1

    .line 90
    iget-object v11, v2, LY8/A;->b:LFa/e;

    .line 91
    .line 92
    iget-object v12, v2, LY8/p;->n:LL8/e;

    .line 93
    .line 94
    if-eqz v4, :cond_5

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    check-cast v4, LR8/q;

    .line 101
    .line 102
    invoke-static {v11, v4}, LQ3/u0;->k(LFa/e;La9/b;)LX8/b;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    iget-object v6, v11, LFa/e;->t:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v6, LI4/a;

    .line 109
    .line 110
    iget-object v7, v6, LI4/a;->j:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v7, LQ8/d;

    .line 113
    .line 114
    invoke-virtual {v7, v4}, LQ8/d;->a(La9/c;)LQ8/f;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-static {v12, v5, v9, v7}, LW8/b;->q1(LL8/e;LM8/h;ZLQ8/f;)LW8/b;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-interface {v12}, LL8/e;->y()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    iget-object v8, v11, LFa/e;->v:Ljava/lang/Object;

    .line 131
    .line 132
    new-instance v13, LI/D;

    .line 133
    .line 134
    invoke-direct {v13, v11, v5, v4, v7}, LI/D;-><init>(LFa/e;LL8/k;La9/e;I)V

    .line 135
    .line 136
    .line 137
    new-instance v7, LFa/e;

    .line 138
    .line 139
    invoke-direct {v7, v6, v13, v8}, LFa/e;-><init>(LI4/a;LX8/d;Lh8/d;)V

    .line 140
    .line 141
    .line 142
    iget-object v6, v4, LR8/q;->a:Ljava/lang/reflect/Constructor;

    .line 143
    .line 144
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    const-string v11, "types"

    .line 149
    .line 150
    invoke-static {v8, v11}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    array-length v11, v8

    .line 154
    if-nez v11, :cond_0

    .line 155
    .line 156
    sget-object v6, Li8/s;->s:Li8/s;

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_0
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    if-eqz v13, :cond_1

    .line 168
    .line 169
    invoke-virtual {v11}, Ljava/lang/Class;->getModifiers()I

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 174
    .line 175
    .line 176
    move-result v11

    .line 177
    if-nez v11, :cond_1

    .line 178
    .line 179
    array-length v11, v8

    .line 180
    invoke-static {v10, v11, v8}, Li8/i;->s(II[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    check-cast v8, [Ljava/lang/reflect/Type;

    .line 185
    .line 186
    :cond_1
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    array-length v11, v10

    .line 191
    array-length v13, v8

    .line 192
    if-lt v11, v13, :cond_4

    .line 193
    .line 194
    array-length v11, v10

    .line 195
    array-length v13, v8

    .line 196
    if-le v11, v13, :cond_2

    .line 197
    .line 198
    array-length v11, v10

    .line 199
    array-length v13, v8

    .line 200
    sub-int/2addr v11, v13

    .line 201
    array-length v13, v10

    .line 202
    invoke-static {v11, v13, v10}, Li8/i;->s(II[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    check-cast v10, [[Ljava/lang/annotation/Annotation;

    .line 207
    .line 208
    :cond_2
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->isVarArgs()Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    invoke-virtual {v4, v8, v10, v6}, LR8/v;->d([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/ArrayList;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    :goto_1
    invoke-static {v7, v5, v6}, LY8/A;->u(LFa/e;LO8/w;Ljava/util/List;)LA1/J;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-interface {v12}, LL8/e;->y()Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    const-string v10, "classDescriptor.declaredTypeParameters"

    .line 225
    .line 226
    invoke-static {v8, v10}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    check-cast v8, Ljava/util/Collection;

    .line 230
    .line 231
    invoke-virtual {v4}, LR8/q;->z()Ljava/util/ArrayList;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    new-instance v11, Ljava/util/ArrayList;

    .line 236
    .line 237
    const/16 v13, 0xa

    .line 238
    .line 239
    invoke-static {v10, v13}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 240
    .line 241
    .line 242
    move-result v13

    .line 243
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v13

    .line 254
    if-eqz v13, :cond_3

    .line 255
    .line 256
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v13

    .line 260
    check-cast v13, LR8/B;

    .line 261
    .line 262
    iget-object v14, v7, LFa/e;->u:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v14, LX8/d;

    .line 265
    .line 266
    invoke-interface {v14, v13}, LX8/d;->a(LR8/B;)LL8/P;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    invoke-static {v13}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_3
    invoke-static {v8, v11}, Li8/k;->g0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    invoke-virtual {v4}, LR8/v;->e()LL8/e0;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-static {v4}, Lga/d;->F(LL8/e0;)LL8/n;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    iget-object v10, v6, LA1/J;->u:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v10, Ljava/util/List;

    .line 292
    .line 293
    invoke-virtual {v5, v10, v4, v8}, LO8/k;->o1(Ljava/util/List;LL8/n;Ljava/util/List;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v5, v9}, LW8/b;->h1(Z)V

    .line 297
    .line 298
    .line 299
    iget-boolean v4, v6, LA1/J;->t:Z

    .line 300
    .line 301
    invoke-virtual {v5, v4}, LW8/b;->i1(Z)V

    .line 302
    .line 303
    .line 304
    invoke-interface {v12}, LL8/e;->p()LA9/D;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    invoke-virtual {v5, v4}, LO8/w;->j1(LA9/D;)V

    .line 309
    .line 310
    .line 311
    iget-object v4, v7, LFa/e;->t:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v4, LI4/a;

    .line 314
    .line 315
    iget-object v4, v4, LI4/a;->g:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v4, LV8/h;

    .line 318
    .line 319
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    goto/16 :goto_0

    .line 326
    .line 327
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 328
    .line 329
    new-instance v2, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v3, "Illegal generic signature: "

    .line 332
    .line 333
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw v1

    .line 347
    :cond_5
    iget-object v1, v2, LY8/p;->o:LR8/n;

    .line 348
    .line 349
    invoke-virtual {v1}, LR8/n;->f()Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    sget-object v5, LM8/g;->a:LM8/f;

    .line 354
    .line 355
    const-string v6, "PROTECTED_AND_PACKAGE"

    .line 356
    .line 357
    const-string v7, "classDescriptor.visibility"

    .line 358
    .line 359
    const/4 v8, 0x6

    .line 360
    const/4 v13, 0x2

    .line 361
    const/4 v14, 0x0

    .line 362
    iget-object v15, v0, LY8/n;->t:LFa/e;

    .line 363
    .line 364
    if-eqz v4, :cond_b

    .line 365
    .line 366
    iget-object v4, v11, LFa/e;->t:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v4, LI4/a;

    .line 369
    .line 370
    iget-object v4, v4, LI4/a;->j:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v4, LQ8/d;

    .line 373
    .line 374
    invoke-virtual {v4, v1}, LQ8/d;->a(La9/c;)LQ8/f;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-static {v12, v5, v10, v4}, LW8/b;->q1(LL8/e;LM8/h;ZLQ8/f;)LW8/b;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    invoke-virtual {v1}, LR8/n;->e()Ljava/util/ArrayList;

    .line 383
    .line 384
    .line 385
    move-result-object v16

    .line 386
    new-instance v10, Ljava/util/ArrayList;

    .line 387
    .line 388
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 393
    .line 394
    .line 395
    invoke-static {v13, v9, v14, v8}, LC8/E;->A(IZLY8/F;I)LZ8/a;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object v25

    .line 403
    move/from16 v16, v9

    .line 404
    .line 405
    :goto_3
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    .line 406
    .line 407
    .line 408
    move-result v17

    .line 409
    if-eqz v17, :cond_6

    .line 410
    .line 411
    add-int/lit8 v26, v16, 0x1

    .line 412
    .line 413
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v17

    .line 417
    move-object/from16 v13, v17

    .line 418
    .line 419
    check-cast v13, LR8/z;

    .line 420
    .line 421
    invoke-virtual {v13}, LR8/z;->f()La9/d;

    .line 422
    .line 423
    .line 424
    move-result-object v14

    .line 425
    iget-object v8, v11, LFa/e;->x:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v8, LY1/c;

    .line 428
    .line 429
    invoke-virtual {v8, v14, v0}, LY1/c;->P(La9/d;LZ8/a;)LA9/y;

    .line 430
    .line 431
    .line 432
    move-result-object v19

    .line 433
    new-instance v8, LO8/U;

    .line 434
    .line 435
    const/4 v14, 0x2

    .line 436
    invoke-virtual {v13}, LR8/v;->c()Lj9/f;

    .line 437
    .line 438
    .line 439
    move-result-object v18

    .line 440
    iget-object v14, v11, LFa/e;->t:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v14, LI4/a;

    .line 443
    .line 444
    iget-object v14, v14, LI4/a;->j:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v14, LQ8/d;

    .line 447
    .line 448
    invoke-virtual {v14, v13}, LQ8/d;->a(La9/c;)LQ8/f;

    .line 449
    .line 450
    .line 451
    move-result-object v24

    .line 452
    const/16 v22, 0x0

    .line 453
    .line 454
    const/16 v23, 0x0

    .line 455
    .line 456
    move-object v13, v15

    .line 457
    const/4 v15, 0x0

    .line 458
    const/4 v14, 0x2

    .line 459
    const/16 v20, 0x0

    .line 460
    .line 461
    const/16 v21, 0x0

    .line 462
    .line 463
    move-object/from16 v17, v13

    .line 464
    .line 465
    move-object v13, v8

    .line 466
    move-object/from16 v8, v17

    .line 467
    .line 468
    move-object/from16 v17, v5

    .line 469
    .line 470
    move v5, v14

    .line 471
    move-object v14, v4

    .line 472
    const/4 v4, 0x0

    .line 473
    invoke-direct/range {v13 .. v24}, LO8/U;-><init>(LL8/b;LO8/U;ILM8/h;Lj9/f;LA9/y;ZZZLA9/y;LL8/M;)V

    .line 474
    .line 475
    .line 476
    move-object v15, v13

    .line 477
    move-object/from16 v13, v17

    .line 478
    .line 479
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-object v15, v14

    .line 483
    move-object v14, v4

    .line 484
    move-object v4, v15

    .line 485
    move-object v15, v13

    .line 486
    move v13, v5

    .line 487
    move-object v5, v15

    .line 488
    move-object v15, v8

    .line 489
    move/from16 v16, v26

    .line 490
    .line 491
    const/4 v8, 0x6

    .line 492
    goto :goto_3

    .line 493
    :cond_6
    move-object v8, v14

    .line 494
    move-object v14, v4

    .line 495
    move-object v4, v8

    .line 496
    move v8, v13

    .line 497
    move-object v13, v5

    .line 498
    move v5, v8

    .line 499
    move-object v8, v15

    .line 500
    invoke-virtual {v14, v9}, LW8/b;->i1(Z)V

    .line 501
    .line 502
    .line 503
    invoke-interface {v12}, LL8/e;->f()LL8/n;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-static {v0, v7}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    sget-object v15, LU8/o;->b:LL8/n;

    .line 511
    .line 512
    invoke-virtual {v0, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    move-result v15

    .line 516
    if-eqz v15, :cond_7

    .line 517
    .line 518
    sget-object v0, LU8/o;->c:LL8/n;

    .line 519
    .line 520
    invoke-static {v0, v6}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    :cond_7
    invoke-virtual {v14, v10, v0}, LO8/k;->n1(Ljava/util/List;LL8/n;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v14, v9}, LW8/b;->h1(Z)V

    .line 527
    .line 528
    .line 529
    invoke-interface {v12}, LL8/e;->p()LA9/D;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-virtual {v14, v0}, LO8/w;->j1(LA9/D;)V

    .line 534
    .line 535
    .line 536
    invoke-static {v14, v5}, Lqa/b;->c(LL8/t;I)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 541
    .line 542
    .line 543
    move-result v10

    .line 544
    if-eqz v10, :cond_8

    .line 545
    .line 546
    goto :goto_4

    .line 547
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 548
    .line 549
    .line 550
    move-result-object v10

    .line 551
    :cond_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 552
    .line 553
    .line 554
    move-result v15

    .line 555
    if-eqz v15, :cond_a

    .line 556
    .line 557
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v15

    .line 561
    check-cast v15, LO8/k;

    .line 562
    .line 563
    invoke-static {v15, v5}, Lqa/b;->c(LL8/t;I)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v15

    .line 567
    invoke-virtual {v15, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v15

    .line 571
    if-eqz v15, :cond_9

    .line 572
    .line 573
    goto :goto_5

    .line 574
    :cond_a
    :goto_4
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    iget-object v0, v8, LFa/e;->t:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v0, LI4/a;

    .line 580
    .line 581
    iget-object v0, v0, LI4/a;->g:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v0, LV8/h;

    .line 584
    .line 585
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    goto :goto_5

    .line 589
    :cond_b
    move v4, v13

    .line 590
    move-object v13, v5

    .line 591
    move v5, v4

    .line 592
    move-object v4, v14

    .line 593
    move-object v8, v15

    .line 594
    :goto_5
    iget-object v0, v8, LFa/e;->t:Ljava/lang/Object;

    .line 595
    .line 596
    check-cast v0, LI4/a;

    .line 597
    .line 598
    iget-object v0, v0, LI4/a;->x:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast v0, Lr9/e;

    .line 601
    .line 602
    check-cast v0, Lr9/a;

    .line 603
    .line 604
    invoke-virtual {v0, v8, v12, v3}, Lr9/a;->a(LFa/e;LL8/e;Ljava/util/ArrayList;)V

    .line 605
    .line 606
    .line 607
    iget-object v0, v8, LFa/e;->t:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v0, LI4/a;

    .line 610
    .line 611
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 612
    .line 613
    .line 614
    move-result v10

    .line 615
    if-eqz v10, :cond_15

    .line 616
    .line 617
    iget-object v3, v1, LR8/n;->a:Ljava/lang/Class;

    .line 618
    .line 619
    invoke-virtual {v3}, Ljava/lang/Class;->isAnnotation()Z

    .line 620
    .line 621
    .line 622
    move-result v10

    .line 623
    invoke-virtual {v3}, Ljava/lang/Class;->isInterface()Z

    .line 624
    .line 625
    .line 626
    if-nez v10, :cond_c

    .line 627
    .line 628
    move-object v15, v8

    .line 629
    :goto_6
    move-object v14, v4

    .line 630
    goto/16 :goto_f

    .line 631
    .line 632
    :cond_c
    iget-object v3, v11, LFa/e;->t:Ljava/lang/Object;

    .line 633
    .line 634
    check-cast v3, LI4/a;

    .line 635
    .line 636
    iget-object v3, v3, LI4/a;->j:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v3, LQ8/d;

    .line 639
    .line 640
    invoke-virtual {v3, v1}, LQ8/d;->a(La9/c;)LQ8/f;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    const/4 v14, 0x1

    .line 645
    invoke-static {v12, v13, v14, v3}, LW8/b;->q1(LL8/e;LM8/h;ZLQ8/f;)LW8/b;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    if-eqz v10, :cond_13

    .line 650
    .line 651
    invoke-virtual {v1}, LR8/n;->d()Ljava/util/Collection;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    move-object v10, v3

    .line 656
    new-instance v3, Ljava/util/ArrayList;

    .line 657
    .line 658
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 659
    .line 660
    .line 661
    move-result v13

    .line 662
    invoke-direct {v3, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 663
    .line 664
    .line 665
    const/4 v13, 0x6

    .line 666
    invoke-static {v5, v14, v4, v13}, LC8/E;->A(IZLY8/F;I)LZ8/a;

    .line 667
    .line 668
    .line 669
    move-result-object v13

    .line 670
    check-cast v1, Ljava/lang/Iterable;

    .line 671
    .line 672
    new-instance v5, Ljava/util/ArrayList;

    .line 673
    .line 674
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 675
    .line 676
    .line 677
    new-instance v14, Ljava/util/ArrayList;

    .line 678
    .line 679
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 680
    .line 681
    .line 682
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 687
    .line 688
    .line 689
    move-result v15

    .line 690
    if-eqz v15, :cond_e

    .line 691
    .line 692
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v15

    .line 696
    move-object/from16 v16, v15

    .line 697
    .line 698
    check-cast v16, LR8/w;

    .line 699
    .line 700
    invoke-virtual/range {v16 .. v16}, LR8/v;->c()Lj9/f;

    .line 701
    .line 702
    .line 703
    move-result-object v9

    .line 704
    sget-object v4, LU8/x;->b:Lj9/f;

    .line 705
    .line 706
    invoke-static {v9, v4}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    move-result v4

    .line 710
    if-eqz v4, :cond_d

    .line 711
    .line 712
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    :goto_8
    const/4 v4, 0x0

    .line 716
    const/4 v9, 0x0

    .line 717
    goto :goto_7

    .line 718
    :cond_d
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    goto :goto_8

    .line 722
    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 723
    .line 724
    .line 725
    invoke-static {v5}, Li8/k;->V(Ljava/util/List;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v1

    .line 729
    check-cast v1, LR8/w;

    .line 730
    .line 731
    iget-object v4, v11, LFa/e;->x:Ljava/lang/Object;

    .line 732
    .line 733
    move-object v9, v4

    .line 734
    check-cast v9, LY1/c;

    .line 735
    .line 736
    if-eqz v1, :cond_10

    .line 737
    .line 738
    invoke-virtual {v1}, LR8/w;->f()LR8/A;

    .line 739
    .line 740
    .line 741
    move-result-object v4

    .line 742
    instance-of v5, v4, LR8/h;

    .line 743
    .line 744
    if-eqz v5, :cond_f

    .line 745
    .line 746
    new-instance v5, Lh8/f;

    .line 747
    .line 748
    check-cast v4, LR8/h;

    .line 749
    .line 750
    move-object/from16 v18, v1

    .line 751
    .line 752
    const/4 v15, 0x1

    .line 753
    invoke-virtual {v9, v4, v13, v15}, LY1/c;->O(LR8/h;LZ8/a;Z)LA9/d0;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    iget-object v4, v4, LR8/h;->b:LR8/A;

    .line 758
    .line 759
    invoke-virtual {v9, v4, v13}, LY1/c;->P(La9/d;LZ8/a;)LA9/y;

    .line 760
    .line 761
    .line 762
    move-result-object v4

    .line 763
    invoke-direct {v5, v1, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 764
    .line 765
    .line 766
    goto :goto_9

    .line 767
    :cond_f
    move-object/from16 v18, v1

    .line 768
    .line 769
    new-instance v5, Lh8/f;

    .line 770
    .line 771
    invoke-virtual {v9, v4, v13}, LY1/c;->P(La9/d;LZ8/a;)LA9/y;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    const/4 v4, 0x0

    .line 776
    invoke-direct {v5, v1, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    :goto_9
    iget-object v1, v5, Lh8/f;->s:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v1, LA9/y;

    .line 782
    .line 783
    iget-object v4, v5, Lh8/f;->t:Ljava/lang/Object;

    .line 784
    .line 785
    check-cast v4, LA9/y;

    .line 786
    .line 787
    const/4 v5, 0x0

    .line 788
    move-object v15, v8

    .line 789
    move-object v8, v4

    .line 790
    move-object v4, v10

    .line 791
    move-object v10, v7

    .line 792
    move-object v7, v1

    .line 793
    move-object v1, v6

    .line 794
    move-object/from16 v6, v18

    .line 795
    .line 796
    invoke-virtual/range {v2 .. v8}, LY8/p;->x(Ljava/util/ArrayList;LW8/b;ILR8/w;LA9/y;LA9/y;)V

    .line 797
    .line 798
    .line 799
    goto :goto_a

    .line 800
    :cond_10
    move-object/from16 v18, v1

    .line 801
    .line 802
    move-object v1, v6

    .line 803
    move-object v15, v8

    .line 804
    move-object v4, v10

    .line 805
    move-object v10, v7

    .line 806
    :goto_a
    if-eqz v18, :cond_11

    .line 807
    .line 808
    const/16 v16, 0x1

    .line 809
    .line 810
    goto :goto_b

    .line 811
    :cond_11
    const/16 v16, 0x0

    .line 812
    .line 813
    :goto_b
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 814
    .line 815
    .line 816
    move-result-object v14

    .line 817
    const/4 v5, 0x0

    .line 818
    :goto_c
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 819
    .line 820
    .line 821
    move-result v6

    .line 822
    if-eqz v6, :cond_12

    .line 823
    .line 824
    add-int/lit8 v18, v5, 0x1

    .line 825
    .line 826
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v6

    .line 830
    check-cast v6, LR8/w;

    .line 831
    .line 832
    invoke-virtual {v6}, LR8/w;->f()LR8/A;

    .line 833
    .line 834
    .line 835
    move-result-object v7

    .line 836
    invoke-virtual {v9, v7, v13}, LY1/c;->P(La9/d;LZ8/a;)LA9/y;

    .line 837
    .line 838
    .line 839
    move-result-object v7

    .line 840
    add-int v5, v5, v16

    .line 841
    .line 842
    const/4 v8, 0x0

    .line 843
    invoke-virtual/range {v2 .. v8}, LY8/p;->x(Ljava/util/ArrayList;LW8/b;ILR8/w;LA9/y;LA9/y;)V

    .line 844
    .line 845
    .line 846
    move/from16 v5, v18

    .line 847
    .line 848
    goto :goto_c

    .line 849
    :cond_12
    :goto_d
    const/4 v2, 0x0

    .line 850
    goto :goto_e

    .line 851
    :cond_13
    move-object v4, v3

    .line 852
    move-object v1, v6

    .line 853
    move-object v10, v7

    .line 854
    move-object v15, v8

    .line 855
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 856
    .line 857
    goto :goto_d

    .line 858
    :goto_e
    invoke-virtual {v4, v2}, LW8/b;->i1(Z)V

    .line 859
    .line 860
    .line 861
    invoke-interface {v12}, LL8/e;->f()LL8/n;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    invoke-static {v2, v10}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    sget-object v5, LU8/o;->b:LL8/n;

    .line 869
    .line 870
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    move-result v5

    .line 874
    if-eqz v5, :cond_14

    .line 875
    .line 876
    sget-object v2, LU8/o;->c:LL8/n;

    .line 877
    .line 878
    invoke-static {v2, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    :cond_14
    invoke-virtual {v4, v3, v2}, LO8/k;->n1(Ljava/util/List;LL8/n;)V

    .line 882
    .line 883
    .line 884
    const/4 v14, 0x1

    .line 885
    invoke-virtual {v4, v14}, LW8/b;->h1(Z)V

    .line 886
    .line 887
    .line 888
    invoke-interface {v12}, LL8/e;->p()LA9/D;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-virtual {v4, v1}, LO8/w;->j1(LA9/D;)V

    .line 893
    .line 894
    .line 895
    iget-object v1, v11, LFa/e;->t:Ljava/lang/Object;

    .line 896
    .line 897
    check-cast v1, LI4/a;

    .line 898
    .line 899
    iget-object v1, v1, LI4/a;->g:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v1, LV8/h;

    .line 902
    .line 903
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 904
    .line 905
    .line 906
    goto/16 :goto_6

    .line 907
    .line 908
    :goto_f
    invoke-static {v14}, Li8/l;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 909
    .line 910
    .line 911
    move-result-object v1

    .line 912
    move-object v3, v1

    .line 913
    check-cast v3, Ljava/util/Collection;

    .line 914
    .line 915
    goto :goto_10

    .line 916
    :cond_15
    move-object v15, v8

    .line 917
    :goto_10
    iget-object v0, v0, LI4/a;->r:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v0, Lb9/d;

    .line 920
    .line 921
    invoke-virtual {v0, v15, v3}, Lb9/d;->e(LFa/e;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    invoke-static {v0}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    return-object v0

    .line 930
    nop

    .line 931
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
