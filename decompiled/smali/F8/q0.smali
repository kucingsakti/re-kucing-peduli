.class public abstract LF8/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LF8/q0;->a:Ljava/util/concurrent/ConcurrentHashMap;

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

.method public static final a(Ljava/lang/Class;)LQ8/e;
    .locals 38

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const-string v4, "<this>"

    .line 6
    .line 7
    move-object/from16 v5, p0

    .line 8
    .line 9
    invoke-static {v5, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v5}, LR8/c;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    new-instance v5, LF8/z0;

    .line 17
    .line 18
    invoke-direct {v5, v4}, LF8/z0;-><init>(Ljava/lang/ClassLoader;)V

    .line 19
    .line 20
    .line 21
    sget-object v6, LF8/q0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    check-cast v7, Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    if-eqz v7, :cond_1

    .line 30
    .line 31
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    check-cast v8, LQ8/e;

    .line 36
    .line 37
    if-eqz v8, :cond_0

    .line 38
    .line 39
    return-object v8

    .line 40
    :cond_0
    invoke-virtual {v6, v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    new-instance v12, Le1/j;

    .line 44
    .line 45
    invoke-direct {v12, v4, v0}, Le1/j;-><init>(Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    new-instance v7, Le1/j;

    .line 49
    .line 50
    const-class v8, Lh8/m;

    .line 51
    .line 52
    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    const-string v9, "Unit::class.java.classLoader"

    .line 57
    .line 58
    invoke-static {v8, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v7, v8, v0}, Le1/j;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    new-instance v11, LP0/d;

    .line 65
    .line 66
    invoke-direct {v11, v4, v2}, LP0/d;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v8, "runtime module for "

    .line 72
    .line 73
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v15, LQ8/d;->b:LQ8/d;

    .line 84
    .line 85
    sget-object v18, LQ8/d;->c:LQ8/d;

    .line 86
    .line 87
    const-string v4, "moduleName"

    .line 88
    .line 89
    invoke-static {v0, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    new-instance v10, Lz9/l;

    .line 93
    .line 94
    const-string v4, "DeserializationComponentsForJava.ModuleData"

    .line 95
    .line 96
    invoke-direct {v10, v4}, Lz9/l;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v4, LK8/i;

    .line 100
    .line 101
    invoke-direct {v4, v10}, LK8/i;-><init>(Lz9/l;)V

    .line 102
    .line 103
    .line 104
    new-instance v8, LO8/C;

    .line 105
    .line 106
    new-instance v9, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v13, "<"

    .line 109
    .line 110
    invoke-direct {v9, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const/16 v0, 0x3e

    .line 117
    .line 118
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Lj9/f;->l(Ljava/lang/String;)Lj9/f;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const/16 v9, 0x38

    .line 130
    .line 131
    invoke-direct {v8, v0, v10, v4, v9}, LO8/C;-><init>(Lj9/f;Lz9/l;LI8/i;I)V

    .line 132
    .line 133
    .line 134
    iget-object v9, v10, Lz9/l;->a:Lz9/n;

    .line 135
    .line 136
    invoke-interface {v9}, Lz9/n;->lock()V

    .line 137
    .line 138
    .line 139
    :try_start_0
    iget-object v0, v4, LI8/i;->a:LO8/C;

    .line 140
    .line 141
    if-nez v0, :cond_7

    .line 142
    .line 143
    iput-object v8, v4, LI8/i;->a:LO8/C;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    invoke-interface {v9}, Lz9/n;->unlock()V

    .line 146
    .line 147
    .line 148
    new-instance v0, LI8/l;

    .line 149
    .line 150
    invoke-direct {v0, v8, v3}, LI8/l;-><init>(LO8/C;I)V

    .line 151
    .line 152
    .line 153
    iput-object v0, v4, LK8/i;->f:LI8/l;

    .line 154
    .line 155
    new-instance v13, Lc9/d;

    .line 156
    .line 157
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 158
    .line 159
    .line 160
    new-instance v0, LV/h;

    .line 161
    .line 162
    const/4 v9, 0x3

    .line 163
    invoke-direct {v0, v9}, LV/h;-><init>(I)V

    .line 164
    .line 165
    .line 166
    new-instance v9, Lo4/r;

    .line 167
    .line 168
    invoke-direct {v9, v10, v8}, Lo4/r;-><init>(Lz9/l;LL8/y;)V

    .line 169
    .line 170
    .line 171
    sget-object v20, Lc9/e;->c:Lc9/e;

    .line 172
    .line 173
    new-instance v14, LI4/a;

    .line 174
    .line 175
    move-object/from16 v16, v14

    .line 176
    .line 177
    sget-object v14, LV8/h;->c:LV8/h;

    .line 178
    .line 179
    move-object/from16 v17, v16

    .line 180
    .line 181
    sget-object v16, LV8/h;->a:LV8/h;

    .line 182
    .line 183
    const/16 v36, 0x0

    .line 184
    .line 185
    new-instance v1, Lr3/e;

    .line 186
    .line 187
    sget-object v32, Li8/s;->s:Li8/s;

    .line 188
    .line 189
    invoke-direct {v1, v10}, Lr3/e;-><init>(Lz9/l;)V

    .line 190
    .line 191
    .line 192
    sget-object v21, LL8/N;->u:LL8/N;

    .line 193
    .line 194
    sget-object v22, LT8/a;->a:LT8/a;

    .line 195
    .line 196
    move/from16 v37, v3

    .line 197
    .line 198
    new-instance v3, LI8/m;

    .line 199
    .line 200
    invoke-direct {v3, v8, v9}, LI8/m;-><init>(LO8/C;Lo4/r;)V

    .line 201
    .line 202
    .line 203
    new-instance v2, LU8/c;

    .line 204
    .line 205
    move-object/from16 v19, v0

    .line 206
    .line 207
    sget-object v0, LU8/t;->c:LU8/t;

    .line 208
    .line 209
    invoke-direct {v2, v0}, LU8/c;-><init>(LU8/t;)V

    .line 210
    .line 211
    .line 212
    new-instance v26, Lb9/d;

    .line 213
    .line 214
    sget-object v28, LX8/a;->a:LX8/a;

    .line 215
    .line 216
    invoke-direct/range {v26 .. v26}, Ljava/lang/Object;-><init>()V

    .line 217
    .line 218
    .line 219
    sget-object v27, LU8/m;->a:LU8/m;

    .line 220
    .line 221
    sget-object v23, LB9/l;->b:LB9/k;

    .line 222
    .line 223
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    sget-object v29, LB9/k;->b:LB9/m;

    .line 227
    .line 228
    new-instance v31, Lc9/e;

    .line 229
    .line 230
    invoke-direct/range {v31 .. v31}, Ljava/lang/Object;-><init>()V

    .line 231
    .line 232
    .line 233
    move-object/from16 v30, v0

    .line 234
    .line 235
    move-object/from16 v25, v2

    .line 236
    .line 237
    move-object/from16 v24, v3

    .line 238
    .line 239
    move-object/from16 v23, v8

    .line 240
    .line 241
    move-object v0, v9

    .line 242
    move-object/from16 v9, v17

    .line 243
    .line 244
    move-object/from16 v17, v1

    .line 245
    .line 246
    invoke-direct/range {v9 .. v31}, LI4/a;-><init>(Lz9/l;LP0/d;Le1/j;Lc9/d;LV8/h;LQ8/d;LV8/h;Lr3/e;LQ8/d;LV/h;Lc9/e;LL8/N;LT8/a;LO8/C;LI8/m;LU8/c;Lb9/d;LU8/m;LX8/a;LB9/m;LU8/t;Lc9/e;)V

    .line 247
    .line 248
    .line 249
    move-object v2, v13

    .line 250
    move-object/from16 v3, v19

    .line 251
    .line 252
    move-object/from16 v1, v23

    .line 253
    .line 254
    move-object/from16 v26, v29

    .line 255
    .line 256
    new-instance v8, LX8/c;

    .line 257
    .line 258
    invoke-direct {v8, v9}, LX8/c;-><init>(LI4/a;)V

    .line 259
    .line 260
    .line 261
    sget-object v9, Li9/f;->g:Li9/f;

    .line 262
    .line 263
    const-string v11, "jvmMetadataVersion"

    .line 264
    .line 265
    invoke-static {v9, v11}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    new-instance v11, Lo1/k;

    .line 269
    .line 270
    invoke-direct {v11, v12, v2}, Lo1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    new-instance v13, Lt1/G;

    .line 274
    .line 275
    invoke-direct {v13, v1, v0, v10, v12}, Lt1/G;-><init>(LO8/C;Lo4/r;Lz9/l;Le1/j;)V

    .line 276
    .line 277
    .line 278
    iput-object v9, v13, Lt1/G;->x:Ljava/lang/Object;

    .line 279
    .line 280
    sget-object v9, LA9/m;->a:LA9/m;

    .line 281
    .line 282
    invoke-static {v9}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v28

    .line 286
    iget-object v9, v1, LO8/C;->v:LI8/i;

    .line 287
    .line 288
    instance-of v14, v9, LK8/i;

    .line 289
    .line 290
    if-eqz v14, :cond_2

    .line 291
    .line 292
    check-cast v9, LK8/i;

    .line 293
    .line 294
    :goto_0
    move-object/from16 v17, v13

    .line 295
    .line 296
    goto :goto_1

    .line 297
    :cond_2
    const/4 v9, 0x0

    .line 298
    goto :goto_0

    .line 299
    :goto_1
    new-instance v13, LI4/c;

    .line 300
    .line 301
    sget-object v20, Lc9/e;->b:Lc9/e;

    .line 302
    .line 303
    if-eqz v9, :cond_3

    .line 304
    .line 305
    invoke-virtual {v9}, LK8/i;->J()LK8/n;

    .line 306
    .line 307
    .line 308
    move-result-object v14

    .line 309
    if-eqz v14, :cond_3

    .line 310
    .line 311
    :goto_2
    move-object/from16 v23, v14

    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_3
    sget-object v14, LN8/a;->b:LN8/a;

    .line 315
    .line 316
    goto :goto_2

    .line 317
    :goto_3
    if-eqz v9, :cond_4

    .line 318
    .line 319
    invoke-virtual {v9}, LK8/i;->J()LK8/n;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    if-eqz v9, :cond_4

    .line 324
    .line 325
    :goto_4
    move-object/from16 v24, v9

    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_4
    sget-object v9, LN8/a;->d:LN8/a;

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :goto_5
    sget-object v25, Li9/h;->a:Lk9/g;

    .line 332
    .line 333
    new-instance v9, Lr3/e;

    .line 334
    .line 335
    invoke-direct {v9, v10}, Lr3/e;-><init>(Lz9/l;)V

    .line 336
    .line 337
    .line 338
    const/high16 v29, 0x40000

    .line 339
    .line 340
    move-object/from16 v22, v0

    .line 341
    .line 342
    move-object/from16 v18, v8

    .line 343
    .line 344
    move-object/from16 v27, v9

    .line 345
    .line 346
    move-object v14, v10

    .line 347
    move-object/from16 v16, v11

    .line 348
    .line 349
    move-object/from16 v19, v15

    .line 350
    .line 351
    move-object/from16 v21, v32

    .line 352
    .line 353
    move-object v15, v1

    .line 354
    invoke-direct/range {v13 .. v29}, LI4/c;-><init>(Lz9/l;LL8/y;Lw9/e;Lw9/a;LL8/G;Lw9/j;Lw9/k;Ljava/lang/Iterable;Lo4/r;LN8/b;LN8/d;Lk9/g;LB9/m;Lr3/e;Ljava/util/List;I)V

    .line 355
    .line 356
    .line 357
    move-object/from16 v1, v18

    .line 358
    .line 359
    iput-object v13, v2, Lc9/d;->a:LI4/c;

    .line 360
    .line 361
    new-instance v8, Li3/b;

    .line 362
    .line 363
    const/16 v9, 0x11

    .line 364
    .line 365
    invoke-direct {v8, v1, v9}, Li3/b;-><init>(Ljava/lang/Object;I)V

    .line 366
    .line 367
    .line 368
    iput-object v8, v3, LV/h;->t:Ljava/lang/Object;

    .line 369
    .line 370
    new-instance v3, LK8/o;

    .line 371
    .line 372
    invoke-virtual {v4}, LK8/i;->J()LK8/n;

    .line 373
    .line 374
    .line 375
    move-result-object v8

    .line 376
    invoke-virtual {v4}, LK8/i;->J()LK8/n;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    new-instance v9, Lr3/e;

    .line 381
    .line 382
    invoke-direct {v9, v10}, Lr3/e;-><init>(Lz9/l;)V

    .line 383
    .line 384
    .line 385
    const-string v11, "additionalClassPartsProvider"

    .line 386
    .line 387
    invoke-static {v8, v11}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    const-string v11, "platformDependentDeclarationFilter"

    .line 391
    .line 392
    invoke-static {v4, v11}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-direct {v3, v10, v7, v15}, LK8/o;-><init>(Lz9/l;Le1/j;LO8/C;)V

    .line 396
    .line 397
    .line 398
    new-instance v19, LI4/c;

    .line 399
    .line 400
    new-instance v7, Li3/b;

    .line 401
    .line 402
    const/16 v11, 0x15

    .line 403
    .line 404
    invoke-direct {v7, v3, v11}, Li3/b;-><init>(Ljava/lang/Object;I)V

    .line 405
    .line 406
    .line 407
    new-instance v11, Lo1/e;

    .line 408
    .line 409
    sget-object v14, Lx9/a;->m:Lx9/a;

    .line 410
    .line 411
    invoke-direct {v11, v15, v0, v14}, Lo1/e;-><init>(LL8/y;Lo4/r;Lx9/a;)V

    .line 412
    .line 413
    .line 414
    sget-object v25, Lw9/j;->a:Lw9/i;

    .line 415
    .line 416
    move-object/from16 v32, v26

    .line 417
    .line 418
    sget-object v26, Lw9/i;->c:Lw9/i;

    .line 419
    .line 420
    move-object/from16 v22, v0

    .line 421
    .line 422
    new-instance v0, LJ8/a;

    .line 423
    .line 424
    invoke-direct {v0, v10, v15}, LJ8/a;-><init>(Lz9/l;LO8/C;)V

    .line 425
    .line 426
    .line 427
    move-object/from16 p0, v0

    .line 428
    .line 429
    new-instance v0, LK8/g;

    .line 430
    .line 431
    invoke-direct {v0, v10, v15}, LK8/g;-><init>(Lz9/l;LO8/C;)V

    .line 432
    .line 433
    .line 434
    move-object/from16 v16, v0

    .line 435
    .line 436
    move-object/from16 v18, v1

    .line 437
    .line 438
    const/4 v0, 0x2

    .line 439
    new-array v1, v0, [LN8/c;

    .line 440
    .line 441
    aput-object p0, v1, v36

    .line 442
    .line 443
    aput-object v16, v1, v37

    .line 444
    .line 445
    invoke-static {v1}, Li8/l;->C([Ljava/lang/Object;)Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    move-object/from16 v27, v0

    .line 450
    .line 451
    check-cast v27, Ljava/lang/Iterable;

    .line 452
    .line 453
    iget-object v0, v14, Lv9/a;->a:Lk9/g;

    .line 454
    .line 455
    const/high16 v35, 0xc0000

    .line 456
    .line 457
    const/16 v34, 0x0

    .line 458
    .line 459
    move-object/from16 v31, v0

    .line 460
    .line 461
    move-object/from16 v24, v3

    .line 462
    .line 463
    move-object/from16 v30, v4

    .line 464
    .line 465
    move-object/from16 v29, v8

    .line 466
    .line 467
    move-object/from16 v33, v9

    .line 468
    .line 469
    move-object/from16 v20, v10

    .line 470
    .line 471
    move-object/from16 v23, v11

    .line 472
    .line 473
    move-object/from16 v21, v15

    .line 474
    .line 475
    move-object/from16 v28, v22

    .line 476
    .line 477
    move-object/from16 v22, v7

    .line 478
    .line 479
    invoke-direct/range {v19 .. v35}, LI4/c;-><init>(Lz9/l;LL8/y;Lw9/e;Lw9/a;LL8/G;Lw9/j;Lw9/k;Ljava/lang/Iterable;Lo4/r;LN8/b;LN8/d;Lk9/g;LB9/m;Lr3/e;Ljava/util/List;I)V

    .line 480
    .line 481
    .line 482
    move-object/from16 v1, v19

    .line 483
    .line 484
    move-object/from16 v0, v24

    .line 485
    .line 486
    iput-object v1, v0, LK8/o;->c:LI4/c;

    .line 487
    .line 488
    move/from16 v1, v37

    .line 489
    .line 490
    new-array v3, v1, [LO8/C;

    .line 491
    .line 492
    aput-object v15, v3, v36

    .line 493
    .line 494
    invoke-static {v3}, Li8/i;->H([Ljava/lang/Object;)Ljava/util/List;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    new-instance v3, Le1/j;

    .line 499
    .line 500
    const/16 v4, 0x16

    .line 501
    .line 502
    invoke-direct {v3, v1, v4}, Le1/j;-><init>(Ljava/lang/Object;I)V

    .line 503
    .line 504
    .line 505
    iput-object v3, v15, LO8/C;->y:Le1/j;

    .line 506
    .line 507
    new-instance v1, LO8/n;

    .line 508
    .line 509
    const/4 v3, 0x2

    .line 510
    new-array v3, v3, [LL8/G;

    .line 511
    .line 512
    aput-object v18, v3, v36

    .line 513
    .line 514
    const/16 v37, 0x1

    .line 515
    .line 516
    aput-object v0, v3, v37

    .line 517
    .line 518
    invoke-static {v3}, Li8/l;->C([Ljava/lang/Object;)Ljava/util/List;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    new-instance v3, Ljava/lang/StringBuilder;

    .line 523
    .line 524
    const-string v4, "CompositeProvider@RuntimeModuleData for "

    .line 525
    .line 526
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    invoke-direct {v1, v0, v3}, LO8/n;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    iput-object v1, v15, LO8/C;->z:LL8/G;

    .line 540
    .line 541
    new-instance v0, LQ8/e;

    .line 542
    .line 543
    new-instance v1, LA1/h;

    .line 544
    .line 545
    invoke-direct {v1, v2, v12}, LA1/h;-><init>(Lc9/d;Le1/j;)V

    .line 546
    .line 547
    .line 548
    invoke-direct {v0, v13, v1}, LQ8/e;-><init>(LI4/c;LA1/h;)V

    .line 549
    .line 550
    .line 551
    :goto_6
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 552
    .line 553
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v6, v5, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 561
    .line 562
    if-nez v1, :cond_5

    .line 563
    .line 564
    return-object v0

    .line 565
    :cond_5
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    check-cast v2, LQ8/e;

    .line 570
    .line 571
    if-eqz v2, :cond_6

    .line 572
    .line 573
    return-object v2

    .line 574
    :cond_6
    invoke-virtual {v6, v5, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    goto :goto_6

    .line 578
    :cond_7
    move-object v15, v8

    .line 579
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 580
    .line 581
    new-instance v1, Ljava/lang/StringBuilder;

    .line 582
    .line 583
    const-string v2, "Built-ins module is already set: "

    .line 584
    .line 585
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    iget-object v2, v4, LI8/i;->a:LO8/C;

    .line 589
    .line 590
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    const-string v2, " (attempting to reset to "

    .line 594
    .line 595
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    const-string v2, ")"

    .line 602
    .line 603
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 614
    :catchall_0
    move-exception v0

    .line 615
    :try_start_2
    iget-object v1, v10, Lz9/l;->b:Lz9/a;

    .line 616
    .line 617
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 621
    :catchall_1
    move-exception v0

    .line 622
    invoke-interface {v9}, Lz9/n;->unlock()V

    .line 623
    .line 624
    .line 625
    throw v0
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
.end method
