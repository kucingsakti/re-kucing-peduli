.class public final Ly9/g;
.super LO8/b;
.source "SourceFile"

# interfaces
.implements LL8/j;


# instance fields
.field public final A:I

.field public final B:LL8/n;

.field public final C:I

.field public final D:LV3/b;

.field public final E:Lt9/o;

.field public final F:LY8/h;

.field public final G:LL8/L;

.field public final H:Lo1/h;

.field public final I:LL8/j;

.field public final J:Lz9/h;

.field public final K:Lz9/i;

.field public final L:Lz9/i;

.field public final M:Lz9/h;

.field public final N:Lw9/r;

.field public final O:LM8/h;

.field public final w:Le9/j;

.field public final x:Lg9/a;

.field public final y:LL8/M;

.field public final z:Lj9/b;


# direct methods
.method public constructor <init>(LV3/b;Le9/j;Lg9/f;Lg9/a;LL8/M;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v8, p5

    .line 10
    .line 11
    const/4 v9, 0x4

    .line 12
    const/4 v10, 0x5

    .line 13
    const/4 v12, 0x3

    .line 14
    const/4 v13, 0x1

    .line 15
    const/4 v14, 0x2

    .line 16
    const-string v2, "outerContext"

    .line 17
    .line 18
    invoke-static {v0, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v2, "classProto"

    .line 22
    .line 23
    invoke-static {v7, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "nameResolver"

    .line 27
    .line 28
    invoke-static {v3, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v2, "sourceElement"

    .line 32
    .line 33
    invoke-static {v8, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, LV3/b;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, LI4/c;

    .line 39
    .line 40
    iget-object v2, v2, LI4/c;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lz9/l;

    .line 43
    .line 44
    iget v4, v7, Le9/j;->w:I

    .line 45
    .line 46
    invoke-static {v3, v4}, LJ7/a;->e(Lg9/f;I)Lj9/b;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Lj9/b;->i()Lj9/f;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-direct {v1, v2, v4}, LO8/b;-><init>(Lz9/l;Lj9/f;)V

    .line 55
    .line 56
    .line 57
    iput-object v7, v1, Ly9/g;->w:Le9/j;

    .line 58
    .line 59
    move-object/from16 v6, p4

    .line 60
    .line 61
    iput-object v6, v1, Ly9/g;->x:Lg9/a;

    .line 62
    .line 63
    iput-object v8, v1, Ly9/g;->y:LL8/M;

    .line 64
    .line 65
    iget v2, v7, Le9/j;->w:I

    .line 66
    .line 67
    invoke-static {v3, v2}, LJ7/a;->e(Lg9/f;I)Lj9/b;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iput-object v2, v1, Ly9/g;->z:Lj9/b;

    .line 72
    .line 73
    sget-object v2, Lg9/e;->e:Lg9/c;

    .line 74
    .line 75
    iget v4, v7, Le9/j;->v:I

    .line 76
    .line 77
    invoke-virtual {v2, v4}, Lg9/c;->c(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Le9/A;

    .line 82
    .line 83
    invoke-static {v2}, Lw9/i;->e(Le9/A;)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    iput v2, v1, Ly9/g;->A:I

    .line 88
    .line 89
    sget-object v2, Lg9/e;->d:Lg9/c;

    .line 90
    .line 91
    iget v4, v7, Le9/j;->v:I

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Lg9/c;->c(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Le9/f0;

    .line 98
    .line 99
    invoke-static {v2}, LJ7/j;->i(Le9/f0;)LL8/n;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iput-object v2, v1, Ly9/g;->B:LL8/n;

    .line 104
    .line 105
    sget-object v2, Lg9/e;->f:Lg9/c;

    .line 106
    .line 107
    iget v4, v7, Le9/j;->v:I

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Lg9/c;->c(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Le9/i;

    .line 114
    .line 115
    if-nez v2, :cond_0

    .line 116
    .line 117
    const/4 v2, -0x1

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    sget-object v4, Lw9/t;->b:[I

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    aget v2, v4, v2

    .line 126
    .line 127
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 128
    .line 129
    .line 130
    move v15, v13

    .line 131
    goto :goto_1

    .line 132
    :pswitch_0
    const/4 v15, 0x6

    .line 133
    goto :goto_1

    .line 134
    :pswitch_1
    move v15, v10

    .line 135
    goto :goto_1

    .line 136
    :pswitch_2
    move v15, v9

    .line 137
    goto :goto_1

    .line 138
    :pswitch_3
    move v15, v12

    .line 139
    goto :goto_1

    .line 140
    :pswitch_4
    move v15, v14

    .line 141
    :goto_1
    iput v15, v1, Ly9/g;->C:I

    .line 142
    .line 143
    iget-object v2, v7, Le9/j;->y:Ljava/util/List;

    .line 144
    .line 145
    const-string v4, "classProto.typeParameterList"

    .line 146
    .line 147
    invoke-static {v2, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    new-instance v4, Lg9/g;

    .line 151
    .line 152
    iget-object v5, v7, Le9/j;->W:Le9/X;

    .line 153
    .line 154
    const-string v11, "classProto.typeTable"

    .line 155
    .line 156
    invoke-static {v5, v11}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-direct {v4, v5}, Lg9/g;-><init>(Le9/X;)V

    .line 160
    .line 161
    .line 162
    sget-object v5, Lg9/h;->b:Lg9/h;

    .line 163
    .line 164
    iget-object v5, v7, Le9/j;->Y:Le9/e0;

    .line 165
    .line 166
    const-string v11, "classProto.versionRequirementTable"

    .line 167
    .line 168
    invoke-static {v5, v11}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v5}, LC3/b;->h(Le9/e0;)Lg9/h;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-virtual/range {v0 .. v6}, LV3/b;->c(LL8/j;Ljava/util/List;Lg9/f;Lg9/g;Lg9/h;Lg9/a;)LV3/b;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    move-object v6, v1

    .line 180
    iput-object v2, v6, Ly9/g;->D:LV3/b;

    .line 181
    .line 182
    iget-object v1, v2, LV3/b;->a:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v1, LI4/c;

    .line 185
    .line 186
    if-ne v15, v12, :cond_1

    .line 187
    .line 188
    new-instance v3, Lt9/r;

    .line 189
    .line 190
    iget-object v4, v1, LI4/c;->a:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v4, Lz9/l;

    .line 193
    .line 194
    invoke-direct {v3, v4, v6}, Lt9/r;-><init>(Lz9/l;Ly9/g;)V

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_1
    sget-object v3, Lt9/m;->b:Lt9/m;

    .line 199
    .line 200
    :goto_2
    iput-object v3, v6, Ly9/g;->E:Lt9/o;

    .line 201
    .line 202
    new-instance v3, LY8/h;

    .line 203
    .line 204
    invoke-direct {v3, v6}, LY8/h;-><init>(Ly9/g;)V

    .line 205
    .line 206
    .line 207
    iput-object v3, v6, Ly9/g;->F:LY8/h;

    .line 208
    .line 209
    sget-object v3, LL8/L;->d:LL8/N;

    .line 210
    .line 211
    iget-object v4, v1, LI4/c;->a:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v4, Lz9/l;

    .line 214
    .line 215
    iget-object v5, v1, LI4/c;->q:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v5, LB9/l;

    .line 218
    .line 219
    check-cast v5, LB9/m;

    .line 220
    .line 221
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    new-instance v5, LY8/l;

    .line 225
    .line 226
    invoke-direct {v5, v13, v14, v6}, LY8/l;-><init>(IILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    const-string v3, "storageManager"

    .line 233
    .line 234
    invoke-static {v4, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    new-instance v3, LL8/L;

    .line 238
    .line 239
    invoke-direct {v3, v6, v4, v5}, LL8/L;-><init>(LO8/b;Lz9/l;Lu8/b;)V

    .line 240
    .line 241
    .line 242
    iput-object v3, v6, Ly9/g;->G:LL8/L;

    .line 243
    .line 244
    const/4 v3, 0x0

    .line 245
    if-ne v15, v12, :cond_2

    .line 246
    .line 247
    new-instance v4, Lo1/h;

    .line 248
    .line 249
    invoke-direct {v4, v6}, Lo1/h;-><init>(Ly9/g;)V

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_2
    move-object v4, v3

    .line 254
    :goto_3
    iput-object v4, v6, Ly9/g;->H:Lo1/h;

    .line 255
    .line 256
    iget-object v0, v0, LV3/b;->c:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, LL8/j;

    .line 259
    .line 260
    iput-object v0, v6, Ly9/g;->I:LL8/j;

    .line 261
    .line 262
    iget-object v1, v1, LI4/c;->a:Ljava/lang/Object;

    .line 263
    .line 264
    move-object v11, v1

    .line 265
    check-cast v11, Lz9/l;

    .line 266
    .line 267
    new-instance v1, Ly9/f;

    .line 268
    .line 269
    invoke-direct {v1, v6, v9}, Ly9/f;-><init>(Ly9/g;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    new-instance v4, Lz9/h;

    .line 276
    .line 277
    invoke-direct {v4, v11, v1}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 278
    .line 279
    .line 280
    iput-object v4, v6, Ly9/g;->J:Lz9/h;

    .line 281
    .line 282
    new-instance v1, Ly9/f;

    .line 283
    .line 284
    invoke-direct {v1, v6, v12}, Ly9/f;-><init>(Ly9/g;I)V

    .line 285
    .line 286
    .line 287
    new-instance v4, Lz9/i;

    .line 288
    .line 289
    invoke-direct {v4, v11, v1}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 290
    .line 291
    .line 292
    iput-object v4, v6, Ly9/g;->K:Lz9/i;

    .line 293
    .line 294
    new-instance v1, Ly9/f;

    .line 295
    .line 296
    invoke-direct {v1, v6, v14}, Ly9/f;-><init>(Ly9/g;I)V

    .line 297
    .line 298
    .line 299
    new-instance v4, Lz9/h;

    .line 300
    .line 301
    invoke-direct {v4, v11, v1}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 302
    .line 303
    .line 304
    new-instance v1, Ly9/f;

    .line 305
    .line 306
    invoke-direct {v1, v6, v10}, Ly9/f;-><init>(Ly9/g;I)V

    .line 307
    .line 308
    .line 309
    new-instance v4, Lz9/i;

    .line 310
    .line 311
    invoke-direct {v4, v11, v1}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 312
    .line 313
    .line 314
    iput-object v4, v6, Ly9/g;->L:Lz9/i;

    .line 315
    .line 316
    new-instance v1, Ly9/f;

    .line 317
    .line 318
    const/4 v4, 0x6

    .line 319
    invoke-direct {v1, v6, v4}, Ly9/f;-><init>(Ly9/g;I)V

    .line 320
    .line 321
    .line 322
    new-instance v4, Lz9/h;

    .line 323
    .line 324
    invoke-direct {v4, v11, v1}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 325
    .line 326
    .line 327
    iput-object v4, v6, Ly9/g;->M:Lz9/h;

    .line 328
    .line 329
    new-instance v1, Lw9/r;

    .line 330
    .line 331
    instance-of v4, v0, Ly9/g;

    .line 332
    .line 333
    if-eqz v4, :cond_3

    .line 334
    .line 335
    check-cast v0, Ly9/g;

    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_3
    move-object v0, v3

    .line 339
    :goto_4
    if-eqz v0, :cond_4

    .line 340
    .line 341
    iget-object v3, v0, Ly9/g;->N:Lw9/r;

    .line 342
    .line 343
    :cond_4
    move-object v5, v3

    .line 344
    iget-object v0, v2, LV3/b;->d:Ljava/lang/Object;

    .line 345
    .line 346
    move-object v3, v0

    .line 347
    check-cast v3, Lg9/g;

    .line 348
    .line 349
    iget-object v0, v2, LV3/b;->b:Ljava/lang/Object;

    .line 350
    .line 351
    move-object v2, v0

    .line 352
    check-cast v2, Lg9/f;

    .line 353
    .line 354
    move-object v0, v1

    .line 355
    move-object v1, v7

    .line 356
    move-object v4, v8

    .line 357
    invoke-direct/range {v0 .. v5}, Lw9/r;-><init>(Le9/j;Lg9/f;Lg9/g;LL8/M;Lw9/r;)V

    .line 358
    .line 359
    .line 360
    iput-object v0, v6, Ly9/g;->N:Lw9/r;

    .line 361
    .line 362
    sget-object v0, Lg9/e;->c:Lg9/b;

    .line 363
    .line 364
    iget v1, v1, Le9/j;->v:I

    .line 365
    .line 366
    invoke-virtual {v0, v1}, Lg9/b;->c(I)Ljava/lang/Boolean;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-nez v0, :cond_5

    .line 375
    .line 376
    sget-object v0, LM8/g;->a:LM8/f;

    .line 377
    .line 378
    goto :goto_5

    .line 379
    :cond_5
    new-instance v0, Ly9/s;

    .line 380
    .line 381
    new-instance v1, Ly9/f;

    .line 382
    .line 383
    invoke-direct {v1, v6, v13}, Ly9/f;-><init>(Ly9/g;I)V

    .line 384
    .line 385
    .line 386
    invoke-direct {v0, v11, v1}, Ly9/s;-><init>(Lz9/l;Lu8/a;)V

    .line 387
    .line 388
    .line 389
    :goto_5
    iput-object v0, v6, Ly9/g;->O:LM8/h;

    .line 390
    .line 391
    return-void

    .line 392
    nop

    .line 393
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public final C0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final F()Z
    .locals 2

    .line 1
    sget-object v0, Lg9/e;->i:Lg9/b;

    .line 2
    .line 3
    iget-object v1, p0, Ly9/g;->w:Le9/j;

    .line 4
    .line 5
    iget v1, v1, Le9/j;->v:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg9/b;->c(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
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

.method public final F0()Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, Ly9/g;->D:LV3/b;

    .line 2
    .line 3
    iget-object v1, v0, LV3/b;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lg9/g;

    .line 6
    .line 7
    iget-object v2, p0, Ly9/g;->w:Le9/j;

    .line 8
    .line 9
    const-string v3, "<this>"

    .line 10
    .line 11
    invoke-static {v2, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v3, v2, Le9/j;->E:Ljava/util/List;

    .line 15
    .line 16
    move-object v4, v3

    .line 17
    check-cast v4, Ljava/util/Collection;

    .line 18
    .line 19
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v5, 0x0

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v3, v5

    .line 28
    :goto_0
    const/16 v4, 0xa

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    iget-object v2, v2, Le9/j;->F:Ljava/util/List;

    .line 33
    .line 34
    const-string v3, "contextReceiverTypeIdList"

    .line 35
    .line 36
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    check-cast v2, Ljava/lang/Iterable;

    .line 40
    .line 41
    new-instance v3, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-static {v2, v4}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_1

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, Ljava/lang/Integer;

    .line 65
    .line 66
    const-string v7, "it"

    .line 67
    .line 68
    invoke-static {v6, v7}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    invoke-virtual {v1, v6}, Lg9/g;->a(I)Le9/Q;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    check-cast v3, Ljava/lang/Iterable;

    .line 84
    .line 85
    new-instance v1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-static {v3, v4}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_2

    .line 103
    .line 104
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Le9/Q;

    .line 109
    .line 110
    iget-object v4, v0, LV3/b;->h:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v4, Lp/b1;

    .line 113
    .line 114
    invoke-virtual {v4, v3}, Lp/b1;->h(Le9/Q;)LA9/y;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    new-instance v4, LO8/x;

    .line 119
    .line 120
    invoke-virtual {p0}, LO8/b;->M0()LO8/x;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    new-instance v7, Lu9/a;

    .line 125
    .line 126
    invoke-direct {v7, p0, v3, v5}, Lu9/a;-><init>(LL8/e;LA9/y;Lj9/f;)V

    .line 127
    .line 128
    .line 129
    sget-object v3, LM8/g;->a:LM8/f;

    .line 130
    .line 131
    invoke-direct {v4, v6, v7, v3}, LO8/x;-><init>(LL8/j;LB1/a;LM8/h;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_2
    return-object v1
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

.method public final I()LA9/O;
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/g;->F:LY8/h;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final L0()Z
    .locals 2

    .line 1
    sget-object v0, Lg9/e;->h:Lg9/b;

    .line 2
    .line 3
    iget-object v1, p0, Ly9/g;->w:Le9/j;

    .line 4
    .line 5
    iget v1, v1, Le9/j;->v:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg9/b;->c(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
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

.method public final M()I
    .locals 1

    .line 1
    iget v0, p0, Ly9/g;->C:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final N()Z
    .locals 2

    .line 1
    sget-object v0, Lg9/e;->f:Lg9/c;

    .line 2
    .line 3
    iget-object v1, p0, Ly9/g;->w:Le9/j;

    .line 4
    .line 5
    iget v1, v1, Le9/j;->v:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg9/c;->c(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Le9/i;->x:Le9/i;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final T()Z
    .locals 2

    .line 1
    sget-object v0, Lg9/e;->l:Lg9/b;

    .line 2
    .line 3
    iget-object v1, p0, Ly9/g;->w:Le9/j;

    .line 4
    .line 5
    iget v1, v1, Le9/j;->v:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg9/b;->c(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
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

.method public final b(LB9/f;)Lt9/n;
    .locals 2

    .line 1
    iget-object p1, p0, Ly9/g;->G:LL8/L;

    .line 2
    .line 3
    iget-object v0, p1, LL8/L;->a:LO8/b;

    .line 4
    .line 5
    invoke-static {v0}, Lq9/d;->j(LL8/j;)LL8/y;

    .line 6
    .line 7
    .line 8
    iget-object p1, p1, LL8/L;->c:Lz9/i;

    .line 9
    .line 10
    sget-object v0, LL8/L;->e:[LC8/u;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aget-object v0, v0, v1

    .line 14
    .line 15
    invoke-static {p1, v0}, LJ7/j;->o(Lz9/m;LC8/u;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lt9/n;

    .line 20
    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final e0()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/g;->L:Lz9/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz9/i;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Collection;

    .line 8
    .line 9
    return-object v0
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

.method public final f()LL8/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/g;->B:LL8/n;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final g()LL8/M;
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/g;->y:LL8/M;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final h0()Z
    .locals 4

    .line 1
    sget-object v0, Lg9/e;->k:Lg9/b;

    .line 2
    .line 3
    iget-object v1, p0, Ly9/g;->w:Le9/j;

    .line 4
    .line 5
    iget v1, v1, Le9/j;->v:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg9/b;->c(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    const/4 v1, 0x2

    .line 19
    iget-object v2, p0, Ly9/g;->x:Lg9/a;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, v3, v0, v1}, Lg9/a;->a(III)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    return v3

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
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
.end method

.method public final i0()Z
    .locals 2

    .line 1
    sget-object v0, Lg9/e;->j:Lg9/b;

    .line 2
    .line 3
    iget-object v1, p0, Ly9/g;->w:Le9/j;

    .line 4
    .line 5
    iget v1, v1, Le9/j;->v:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg9/b;->c(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
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

.method public final l()Ly9/e;
    .locals 3

    .line 1
    iget-object v0, p0, Ly9/g;->D:LV3/b;

    .line 2
    .line 3
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LI4/c;

    .line 6
    .line 7
    iget-object v0, v0, LI4/c;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LB9/l;

    .line 10
    .line 11
    check-cast v0, LB9/m;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Ly9/g;->G:LL8/L;

    .line 17
    .line 18
    iget-object v1, v0, LL8/L;->a:LO8/b;

    .line 19
    .line 20
    invoke-static {v1}, Lq9/d;->j(LL8/j;)LL8/y;

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, LL8/L;->c:Lz9/i;

    .line 24
    .line 25
    sget-object v1, LL8/L;->e:[LC8/u;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    aget-object v1, v1, v2

    .line 29
    .line 30
    invoke-static {v0, v1}, LJ7/j;->o(Lz9/m;LC8/u;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lt9/n;

    .line 35
    .line 36
    check-cast v0, Ly9/e;

    .line 37
    .line 38
    return-object v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
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
.end method

.method public final m()I
    .locals 1

    .line 1
    iget v0, p0, Ly9/g;->A:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final n()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/g;->K:Lz9/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz9/i;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Collection;

    .line 8
    .line 9
    return-object v0
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

.method public final o(Lj9/f;)LA9/D;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ly9/g;->l()Ly9/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LT8/b;->y:LT8/b;

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Ly9/e;->b(Lj9/f;LT8/b;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    const/4 v1, 0x0

    .line 19
    move-object v2, v0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    move-object v4, v3

    .line 31
    check-cast v4, LL8/K;

    .line 32
    .line 33
    invoke-interface {v4}, LL8/b;->R()LO8/x;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    :goto_1
    move-object v2, v0

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const/4 v1, 0x1

    .line 44
    move-object v2, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    if-nez v1, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_2
    check-cast v2, LL8/K;

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    invoke-interface {v2}, LL8/S;->getType()LA9/y;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_4
    check-cast v0, LA9/D;

    .line 58
    .line 59
    return-object v0
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
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
.end method

.method public final q()LM8/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/g;->O:LM8/h;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final r()Z
    .locals 2

    .line 1
    sget-object v0, Lg9/e;->g:Lg9/b;

    .line 2
    .line 3
    iget-object v1, p0, Ly9/g;->w:Le9/j;

    .line 4
    .line 5
    iget v1, v1, Le9/j;->v:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg9/b;->c(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
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

.method public final t0()LL8/Q;
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/g;->M:Lz9/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz9/h;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LL8/Q;

    .line 8
    .line 9
    return-object v0
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "deserialized "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ly9/g;->i0()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string v1, "expect "

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v1, ""

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "class "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, LO8/b;->getName()Lj9/f;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
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
.end method

.method public final u()Z
    .locals 4

    .line 1
    sget-object v0, Lg9/e;->k:Lg9/b;

    .line 2
    .line 3
    iget-object v1, p0, Ly9/g;->w:Le9/j;

    .line 4
    .line 5
    iget v1, v1, Le9/j;->v:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg9/b;->c(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    iget-object v0, p0, Ly9/g;->x:Lg9/a;

    .line 18
    .line 19
    iget v1, v0, Lg9/a;->b:I

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-ge v1, v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-le v1, v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 v1, 0x4

    .line 29
    iget v3, v0, Lg9/a;->c:I

    .line 30
    .line 31
    if-ge v3, v1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    if-le v3, v1, :cond_3

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    iget v0, v0, Lg9/a;->d:I

    .line 38
    .line 39
    if-gt v0, v2, :cond_4

    .line 40
    .line 41
    :goto_0
    return v2

    .line 42
    :cond_4
    :goto_1
    const/4 v0, 0x0

    .line 43
    return v0
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
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
.end method

.method public final u0()LO8/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/g;->J:Lz9/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz9/h;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LO8/k;

    .line 8
    .line 9
    return-object v0
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

.method public final v()LL8/j;
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/g;->I:LL8/j;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final v0()Lt9/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/g;->E:Lt9/o;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final y()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/g;->D:LV3/b;

    .line 2
    .line 3
    iget-object v0, v0, LV3/b;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lp/b1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lp/b1;->b()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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
