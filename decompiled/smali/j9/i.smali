.class public final Lj9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj9/c;

.field public static final b:Lj9/c;

.field public static final c:Lj9/c;

.field public static final d:Lj9/c;

.field public static final e:Lj9/c;

.field public static final f:Lj9/c;

.field public static final g:Lj9/c;

.field public static final h:Lj9/b;

.field public static final i:Lj9/b;

.field public static final j:Lj9/b;

.field public static final k:Lj9/b;

.field public static final l:Lj9/b;

.field public static final m:Lj9/b;

.field public static final n:Lj9/b;

.field public static final o:Ljava/util/Set;

.field public static final p:Ljava/util/Set;

.field public static final q:Lj9/b;

.field public static final r:Lj9/b;

.field public static final s:Lj9/b;

.field public static final t:Lj9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x5

    .line 3
    const/4 v2, 0x7

    .line 4
    const/4 v3, 0x4

    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x1

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x3

    .line 9
    new-instance v8, Lj9/c;

    .line 10
    .line 11
    const-string v9, "kotlin"

    .line 12
    .line 13
    invoke-direct {v8, v9}, Lj9/c;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v8, Lj9/i;->a:Lj9/c;

    .line 17
    .line 18
    const-string v9, "reflect"

    .line 19
    .line 20
    invoke-static {v9}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 21
    .line 22
    .line 23
    move-result-object v9

    .line 24
    invoke-virtual {v8, v9}, Lj9/c;->c(Lj9/f;)Lj9/c;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    sput-object v9, Lj9/i;->b:Lj9/c;

    .line 29
    .line 30
    const-string v10, "collections"

    .line 31
    .line 32
    invoke-static {v10}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    invoke-virtual {v8, v10}, Lj9/c;->c(Lj9/f;)Lj9/c;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    sput-object v10, Lj9/i;->c:Lj9/c;

    .line 41
    .line 42
    const-string v11, "ranges"

    .line 43
    .line 44
    invoke-static {v11}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    invoke-virtual {v8, v11}, Lj9/c;->c(Lj9/f;)Lj9/c;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    sput-object v11, Lj9/i;->d:Lj9/c;

    .line 53
    .line 54
    const-string v12, "jvm"

    .line 55
    .line 56
    invoke-static {v12}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    invoke-virtual {v8, v12}, Lj9/c;->c(Lj9/f;)Lj9/c;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    const-string v13, "internal"

    .line 65
    .line 66
    invoke-static {v13}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 67
    .line 68
    .line 69
    move-result-object v14

    .line 70
    invoke-virtual {v12, v14}, Lj9/c;->c(Lj9/f;)Lj9/c;

    .line 71
    .line 72
    .line 73
    const-string v12, "annotation"

    .line 74
    .line 75
    invoke-static {v12}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    invoke-virtual {v8, v12}, Lj9/c;->c(Lj9/f;)Lj9/c;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    sput-object v12, Lj9/i;->e:Lj9/c;

    .line 84
    .line 85
    invoke-static {v13}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 86
    .line 87
    .line 88
    move-result-object v13

    .line 89
    invoke-virtual {v8, v13}, Lj9/c;->c(Lj9/f;)Lj9/c;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    const-string v14, "ir"

    .line 94
    .line 95
    invoke-static {v14}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    invoke-virtual {v13, v14}, Lj9/c;->c(Lj9/f;)Lj9/c;

    .line 100
    .line 101
    .line 102
    const-string v14, "coroutines"

    .line 103
    .line 104
    invoke-static {v14}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 105
    .line 106
    .line 107
    move-result-object v14

    .line 108
    invoke-virtual {v8, v14}, Lj9/c;->c(Lj9/f;)Lj9/c;

    .line 109
    .line 110
    .line 111
    move-result-object v14

    .line 112
    sput-object v14, Lj9/i;->f:Lj9/c;

    .line 113
    .line 114
    const-string v15, "enums"

    .line 115
    .line 116
    invoke-static {v15}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 117
    .line 118
    .line 119
    move-result-object v15

    .line 120
    invoke-virtual {v8, v15}, Lj9/c;->c(Lj9/f;)Lj9/c;

    .line 121
    .line 122
    .line 123
    move-result-object v15

    .line 124
    sput-object v15, Lj9/i;->g:Lj9/c;

    .line 125
    .line 126
    new-array v15, v2, [Lj9/c;

    .line 127
    .line 128
    aput-object v8, v15, v6

    .line 129
    .line 130
    aput-object v10, v15, v5

    .line 131
    .line 132
    aput-object v11, v15, v4

    .line 133
    .line 134
    aput-object v12, v15, v7

    .line 135
    .line 136
    aput-object v9, v15, v3

    .line 137
    .line 138
    aput-object v13, v15, v1

    .line 139
    .line 140
    aput-object v14, v15, v0

    .line 141
    .line 142
    invoke-static {v15}, Li8/C;->x([Ljava/lang/Object;)Ljava/util/Set;

    .line 143
    .line 144
    .line 145
    const-string v8, "Nothing"

    .line 146
    .line 147
    invoke-static {v8}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 148
    .line 149
    .line 150
    const-string v8, "Unit"

    .line 151
    .line 152
    invoke-static {v8}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 153
    .line 154
    .line 155
    const-string v8, "Any"

    .line 156
    .line 157
    invoke-static {v8}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 158
    .line 159
    .line 160
    const-string v8, "Enum"

    .line 161
    .line 162
    invoke-static {v8}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 163
    .line 164
    .line 165
    const-string v8, "Annotation"

    .line 166
    .line 167
    invoke-static {v8}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 168
    .line 169
    .line 170
    const-string v8, "Array"

    .line 171
    .line 172
    invoke-static {v8}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    sput-object v8, Lj9/i;->h:Lj9/b;

    .line 177
    .line 178
    const-string v8, "Boolean"

    .line 179
    .line 180
    invoke-static {v8}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    const-string v9, "Char"

    .line 185
    .line 186
    invoke-static {v9}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    const-string v10, "Byte"

    .line 191
    .line 192
    invoke-static {v10}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    const-string v11, "Short"

    .line 197
    .line 198
    invoke-static {v11}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 199
    .line 200
    .line 201
    move-result-object v11

    .line 202
    const-string v12, "Int"

    .line 203
    .line 204
    invoke-static {v12}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    const-string v13, "Long"

    .line 209
    .line 210
    invoke-static {v13}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    const-string v14, "Float"

    .line 215
    .line 216
    invoke-static {v14}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 217
    .line 218
    .line 219
    move-result-object v14

    .line 220
    const-string v15, "Double"

    .line 221
    .line 222
    invoke-static {v15}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 223
    .line 224
    .line 225
    move-result-object v15

    .line 226
    invoke-static {v10}, Lj9/j;->f(Lj9/b;)Lj9/b;

    .line 227
    .line 228
    .line 229
    move-result-object v16

    .line 230
    sput-object v16, Lj9/i;->i:Lj9/b;

    .line 231
    .line 232
    invoke-static {v11}, Lj9/j;->f(Lj9/b;)Lj9/b;

    .line 233
    .line 234
    .line 235
    move-result-object v16

    .line 236
    sput-object v16, Lj9/i;->j:Lj9/b;

    .line 237
    .line 238
    invoke-static {v12}, Lj9/j;->f(Lj9/b;)Lj9/b;

    .line 239
    .line 240
    .line 241
    move-result-object v16

    .line 242
    sput-object v16, Lj9/i;->k:Lj9/b;

    .line 243
    .line 244
    invoke-static {v13}, Lj9/j;->f(Lj9/b;)Lj9/b;

    .line 245
    .line 246
    .line 247
    move-result-object v16

    .line 248
    sput-object v16, Lj9/i;->l:Lj9/b;

    .line 249
    .line 250
    const-string v16, "CharSequence"

    .line 251
    .line 252
    invoke-static/range {v16 .. v16}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 253
    .line 254
    .line 255
    const-string v16, "String"

    .line 256
    .line 257
    invoke-static/range {v16 .. v16}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 258
    .line 259
    .line 260
    move-result-object v16

    .line 261
    sput-object v16, Lj9/i;->m:Lj9/b;

    .line 262
    .line 263
    const-string v16, "Throwable"

    .line 264
    .line 265
    invoke-static/range {v16 .. v16}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 266
    .line 267
    .line 268
    const-string v16, "Cloneable"

    .line 269
    .line 270
    invoke-static/range {v16 .. v16}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 271
    .line 272
    .line 273
    const-string v16, "KProperty"

    .line 274
    .line 275
    invoke-static/range {v16 .. v16}, Lj9/j;->e(Ljava/lang/String;)Lj9/b;

    .line 276
    .line 277
    .line 278
    const-string v16, "KMutableProperty"

    .line 279
    .line 280
    invoke-static/range {v16 .. v16}, Lj9/j;->e(Ljava/lang/String;)Lj9/b;

    .line 281
    .line 282
    .line 283
    const-string v16, "KProperty0"

    .line 284
    .line 285
    invoke-static/range {v16 .. v16}, Lj9/j;->e(Ljava/lang/String;)Lj9/b;

    .line 286
    .line 287
    .line 288
    const-string v16, "KMutableProperty0"

    .line 289
    .line 290
    invoke-static/range {v16 .. v16}, Lj9/j;->e(Ljava/lang/String;)Lj9/b;

    .line 291
    .line 292
    .line 293
    const-string v16, "KProperty1"

    .line 294
    .line 295
    invoke-static/range {v16 .. v16}, Lj9/j;->e(Ljava/lang/String;)Lj9/b;

    .line 296
    .line 297
    .line 298
    const-string v16, "KMutableProperty1"

    .line 299
    .line 300
    invoke-static/range {v16 .. v16}, Lj9/j;->e(Ljava/lang/String;)Lj9/b;

    .line 301
    .line 302
    .line 303
    const-string v16, "KProperty2"

    .line 304
    .line 305
    invoke-static/range {v16 .. v16}, Lj9/j;->e(Ljava/lang/String;)Lj9/b;

    .line 306
    .line 307
    .line 308
    const-string v16, "KMutableProperty2"

    .line 309
    .line 310
    invoke-static/range {v16 .. v16}, Lj9/j;->e(Ljava/lang/String;)Lj9/b;

    .line 311
    .line 312
    .line 313
    const-string v16, "KFunction"

    .line 314
    .line 315
    invoke-static/range {v16 .. v16}, Lj9/j;->e(Ljava/lang/String;)Lj9/b;

    .line 316
    .line 317
    .line 318
    move-result-object v16

    .line 319
    sput-object v16, Lj9/i;->n:Lj9/b;

    .line 320
    .line 321
    const-string v16, "KClass"

    .line 322
    .line 323
    invoke-static/range {v16 .. v16}, Lj9/j;->e(Ljava/lang/String;)Lj9/b;

    .line 324
    .line 325
    .line 326
    const-string v16, "KCallable"

    .line 327
    .line 328
    invoke-static/range {v16 .. v16}, Lj9/j;->e(Ljava/lang/String;)Lj9/b;

    .line 329
    .line 330
    .line 331
    const-string v16, "Comparable"

    .line 332
    .line 333
    invoke-static/range {v16 .. v16}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 334
    .line 335
    .line 336
    const-string v16, "Number"

    .line 337
    .line 338
    invoke-static/range {v16 .. v16}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 339
    .line 340
    .line 341
    const-string v16, "Function"

    .line 342
    .line 343
    invoke-static/range {v16 .. v16}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 344
    .line 345
    .line 346
    move/from16 v16, v0

    .line 347
    .line 348
    const/16 v0, 0x8

    .line 349
    .line 350
    new-array v0, v0, [Lj9/b;

    .line 351
    .line 352
    aput-object v8, v0, v6

    .line 353
    .line 354
    aput-object v9, v0, v5

    .line 355
    .line 356
    aput-object v10, v0, v4

    .line 357
    .line 358
    aput-object v11, v0, v7

    .line 359
    .line 360
    aput-object v12, v0, v3

    .line 361
    .line 362
    aput-object v13, v0, v1

    .line 363
    .line 364
    aput-object v14, v0, v16

    .line 365
    .line 366
    aput-object v15, v0, v2

    .line 367
    .line 368
    invoke-static {v0}, Li8/i;->K([Ljava/lang/Object;)Ljava/util/Set;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    sput-object v0, Lj9/i;->o:Ljava/util/Set;

    .line 373
    .line 374
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 375
    .line 376
    const/16 v2, 0xa

    .line 377
    .line 378
    invoke-static {v0, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 379
    .line 380
    .line 381
    move-result v8

    .line 382
    invoke-static {v8}, Li8/z;->s(I)I

    .line 383
    .line 384
    .line 385
    move-result v8

    .line 386
    const/16 v9, 0x10

    .line 387
    .line 388
    if-ge v8, v9, :cond_0

    .line 389
    .line 390
    move v8, v9

    .line 391
    :cond_0
    invoke-direct {v1, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 392
    .line 393
    .line 394
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v8

    .line 402
    const-string v10, "id.shortClassName"

    .line 403
    .line 404
    if-eqz v8, :cond_1

    .line 405
    .line 406
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v8

    .line 410
    move-object v11, v8

    .line 411
    check-cast v11, Lj9/b;

    .line 412
    .line 413
    invoke-virtual {v11}, Lj9/b;->i()Lj9/f;

    .line 414
    .line 415
    .line 416
    move-result-object v11

    .line 417
    invoke-static {v11, v10}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    invoke-static {v11}, Lj9/j;->d(Lj9/f;)Lj9/b;

    .line 421
    .line 422
    .line 423
    move-result-object v10

    .line 424
    invoke-interface {v1, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    goto :goto_0

    .line 428
    :cond_1
    invoke-static {v1}, Lj9/j;->c(Ljava/util/LinkedHashMap;)V

    .line 429
    .line 430
    .line 431
    new-array v0, v3, [Lj9/b;

    .line 432
    .line 433
    sget-object v1, Lj9/i;->i:Lj9/b;

    .line 434
    .line 435
    aput-object v1, v0, v6

    .line 436
    .line 437
    sget-object v1, Lj9/i;->j:Lj9/b;

    .line 438
    .line 439
    aput-object v1, v0, v5

    .line 440
    .line 441
    sget-object v1, Lj9/i;->k:Lj9/b;

    .line 442
    .line 443
    aput-object v1, v0, v4

    .line 444
    .line 445
    sget-object v1, Lj9/i;->l:Lj9/b;

    .line 446
    .line 447
    aput-object v1, v0, v7

    .line 448
    .line 449
    invoke-static {v0}, Li8/i;->K([Ljava/lang/Object;)Ljava/util/Set;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    sput-object v0, Lj9/i;->p:Ljava/util/Set;

    .line 454
    .line 455
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 456
    .line 457
    invoke-static {v0, v2}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    invoke-static {v2}, Li8/z;->s(I)I

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    if-ge v2, v9, :cond_2

    .line 466
    .line 467
    goto :goto_1

    .line 468
    :cond_2
    move v9, v2

    .line 469
    :goto_1
    invoke-direct {v1, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 470
    .line 471
    .line 472
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    if-eqz v2, :cond_3

    .line 481
    .line 482
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    move-object v3, v2

    .line 487
    check-cast v3, Lj9/b;

    .line 488
    .line 489
    invoke-virtual {v3}, Lj9/b;->i()Lj9/f;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-static {v3, v10}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    invoke-static {v3}, Lj9/j;->d(Lj9/f;)Lj9/b;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    goto :goto_2

    .line 504
    :cond_3
    invoke-static {v1}, Lj9/j;->c(Ljava/util/LinkedHashMap;)V

    .line 505
    .line 506
    .line 507
    sget-object v0, Lj9/i;->o:Ljava/util/Set;

    .line 508
    .line 509
    sget-object v1, Lj9/i;->p:Ljava/util/Set;

    .line 510
    .line 511
    invoke-static {v0, v1}, Li8/C;->u(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    sget-object v1, Lj9/i;->m:Lj9/b;

    .line 516
    .line 517
    invoke-static {v0, v1}, Li8/C;->v(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 518
    .line 519
    .line 520
    sget-object v0, Lj9/i;->f:Lj9/c;

    .line 521
    .line 522
    const-string v1, "Continuation"

    .line 523
    .line 524
    invoke-static {v1}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    const/4 v2, 0x0

    .line 529
    if-eqz v0, :cond_6

    .line 530
    .line 531
    invoke-static {v1}, Lj9/c;->j(Lj9/f;)Lj9/c;

    .line 532
    .line 533
    .line 534
    const-string v0, "Iterator"

    .line 535
    .line 536
    invoke-static {v0}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 537
    .line 538
    .line 539
    const-string v0, "Iterable"

    .line 540
    .line 541
    invoke-static {v0}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 542
    .line 543
    .line 544
    const-string v0, "Collection"

    .line 545
    .line 546
    invoke-static {v0}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 547
    .line 548
    .line 549
    const-string v0, "List"

    .line 550
    .line 551
    invoke-static {v0}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 552
    .line 553
    .line 554
    const-string v0, "ListIterator"

    .line 555
    .line 556
    invoke-static {v0}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 557
    .line 558
    .line 559
    const-string v0, "Set"

    .line 560
    .line 561
    invoke-static {v0}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 562
    .line 563
    .line 564
    const-string v0, "Map"

    .line 565
    .line 566
    invoke-static {v0}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    const-string v1, "MutableIterator"

    .line 571
    .line 572
    invoke-static {v1}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 573
    .line 574
    .line 575
    const-string v1, "CharIterator"

    .line 576
    .line 577
    invoke-static {v1}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 578
    .line 579
    .line 580
    const-string v1, "MutableIterable"

    .line 581
    .line 582
    invoke-static {v1}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 583
    .line 584
    .line 585
    const-string v1, "MutableCollection"

    .line 586
    .line 587
    invoke-static {v1}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 588
    .line 589
    .line 590
    const-string v1, "MutableList"

    .line 591
    .line 592
    invoke-static {v1}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    sput-object v1, Lj9/i;->q:Lj9/b;

    .line 597
    .line 598
    const-string v1, "MutableListIterator"

    .line 599
    .line 600
    invoke-static {v1}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 601
    .line 602
    .line 603
    const-string v1, "MutableSet"

    .line 604
    .line 605
    invoke-static {v1}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    sput-object v1, Lj9/i;->r:Lj9/b;

    .line 610
    .line 611
    const-string v1, "MutableMap"

    .line 612
    .line 613
    invoke-static {v1}, Lj9/j;->b(Ljava/lang/String;)Lj9/b;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    sput-object v1, Lj9/i;->s:Lj9/b;

    .line 618
    .line 619
    const-string v3, "Entry"

    .line 620
    .line 621
    invoke-static {v3}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    invoke-virtual {v0, v3}, Lj9/b;->d(Lj9/f;)Lj9/b;

    .line 626
    .line 627
    .line 628
    const-string v0, "MutableEntry"

    .line 629
    .line 630
    invoke-static {v0}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-virtual {v1, v0}, Lj9/b;->d(Lj9/f;)Lj9/b;

    .line 635
    .line 636
    .line 637
    const-string v0, "Result"

    .line 638
    .line 639
    invoke-static {v0}, Lj9/j;->a(Ljava/lang/String;)Lj9/b;

    .line 640
    .line 641
    .line 642
    sget-object v0, Lj9/i;->d:Lj9/c;

    .line 643
    .line 644
    const-string v1, "IntRange"

    .line 645
    .line 646
    invoke-static {v1}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    if-eqz v0, :cond_5

    .line 651
    .line 652
    invoke-static {v1}, Lj9/c;->j(Lj9/f;)Lj9/c;

    .line 653
    .line 654
    .line 655
    const-string v0, "LongRange"

    .line 656
    .line 657
    invoke-static {v0}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-static {v0}, Lj9/c;->j(Lj9/f;)Lj9/c;

    .line 662
    .line 663
    .line 664
    const-string v0, "CharRange"

    .line 665
    .line 666
    invoke-static {v0}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-static {v0}, Lj9/c;->j(Lj9/f;)Lj9/c;

    .line 671
    .line 672
    .line 673
    sget-object v0, Lj9/i;->e:Lj9/c;

    .line 674
    .line 675
    const-string v1, "AnnotationRetention"

    .line 676
    .line 677
    invoke-static {v1}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    if-eqz v0, :cond_4

    .line 682
    .line 683
    invoke-static {v1}, Lj9/c;->j(Lj9/f;)Lj9/c;

    .line 684
    .line 685
    .line 686
    const-string v0, "AnnotationTarget"

    .line 687
    .line 688
    invoke-static {v0}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-static {v0}, Lj9/c;->j(Lj9/f;)Lj9/c;

    .line 693
    .line 694
    .line 695
    new-instance v0, Lj9/b;

    .line 696
    .line 697
    sget-object v1, Lj9/i;->g:Lj9/c;

    .line 698
    .line 699
    const-string v2, "EnumEntries"

    .line 700
    .line 701
    invoke-static {v2}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    invoke-direct {v0, v1, v2}, Lj9/b;-><init>(Lj9/c;Lj9/f;)V

    .line 706
    .line 707
    .line 708
    sput-object v0, Lj9/i;->t:Lj9/b;

    .line 709
    .line 710
    return-void

    .line 711
    :cond_4
    invoke-static {v7}, Lj9/b;->a(I)V

    .line 712
    .line 713
    .line 714
    throw v2

    .line 715
    :cond_5
    invoke-static {v7}, Lj9/b;->a(I)V

    .line 716
    .line 717
    .line 718
    throw v2

    .line 719
    :cond_6
    invoke-static {v7}, Lj9/b;->a(I)V

    .line 720
    .line 721
    .line 722
    throw v2
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
