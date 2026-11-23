.class public final Lh7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq7/d;


# instance fields
.field public final s:Ljava/util/Map;

.field public final t:Lq7/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lq7/b;->s:Lq7/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lh7/d;->t:Lq7/b;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "Collections.synchronized\u2026leResourceTransporter>())"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lh7/d;->s:Ljava/util/Map;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
.end method


# virtual methods
.method public final L(LFa/e;)V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final P(LFa/e;Lq7/j;)Lq7/c;
    .locals 33

    .line 1
    move-object/from16 v6, p1

    .line 2
    .line 3
    const-string v0, "interruptMonitor"

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    invoke-static {v1, v0}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v11, Lr7/a;

    .line 11
    .line 12
    invoke-direct {v11}, Lr7/a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 16
    .line 17
    .line 18
    const-string v0, "Range"

    .line 19
    .line 20
    iget-object v2, v6, LFa/e;->u:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string v0, "bytes=0-"

    .line 34
    .line 35
    :goto_0
    const-string v3, "="

    .line 36
    .line 37
    const/4 v4, 0x6

    .line 38
    invoke-static {v0, v4, v3}, LL9/f;->S(Ljava/lang/String;ILjava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const-string v5, "-"

    .line 43
    .line 44
    invoke-static {v0, v4, v5}, LL9/f;->S(Ljava/lang/String;ILjava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/4 v5, 0x1

    .line 49
    add-int/2addr v3, v5

    .line 50
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v7, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    .line 55
    .line 56
    invoke-static {v3, v7}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v15

    .line 63
    add-int/2addr v4, v5

    .line 64
    const-wide/16 v8, -0x1

    .line 65
    .line 66
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0, v7}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    move-wide/from16 v17, v3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catch_0
    move-wide/from16 v17, v8

    .line 85
    .line 86
    :goto_1
    const-string v0, "Authorization"

    .line 87
    .line 88
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Ljava/lang/String;

    .line 93
    .line 94
    if-eqz v0, :cond_1

    .line 95
    .line 96
    :goto_2
    move-object/from16 v19, v0

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_1
    const-string v0, ""

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :goto_3
    iget-object v0, v6, LFa/e;->t:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v0}, LC3/b;->s(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-static {v0}, LC3/b;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    new-instance v7, Lcom/tonyodev/fetch2core/MutableExtras;

    .line 115
    .line 116
    iget-object v10, v6, LFa/e;->x:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v10, Lcom/tonyodev/fetch2core/Extras;

    .line 119
    .line 120
    iget-object v10, v10, Lcom/tonyodev/fetch2core/Extras;->s:Ljava/util/Map;

    .line 121
    .line 122
    invoke-static {v10}, Li8/y;->C(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-direct {v7, v10}, Lcom/tonyodev/fetch2core/MutableExtras;-><init>(Ljava/util/LinkedHashMap;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    if-eqz v12, :cond_2

    .line 142
    .line 143
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    check-cast v12, Ljava/util/Map$Entry;

    .line 148
    .line 149
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    check-cast v13, Ljava/lang/String;

    .line 154
    .line 155
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    check-cast v12, Ljava/lang/String;

    .line 160
    .line 161
    const-string v14, "key"

    .line 162
    .line 163
    invoke-static {v13, v14}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const-string v14, "value"

    .line 167
    .line 168
    invoke-static {v12, v14}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iget-object v14, v7, Lcom/tonyodev/fetch2core/MutableExtras;->u:Ljava/util/LinkedHashMap;

    .line 172
    .line 173
    invoke-interface {v14, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_2
    new-instance v10, Ljava/net/InetSocketAddress;

    .line 178
    .line 179
    const/4 v12, 0x0

    .line 180
    invoke-direct {v10, v12}, Ljava/net/InetSocketAddress;-><init>(I)V

    .line 181
    .line 182
    .line 183
    new-instance v20, Lcom/tonyodev/fetch2core/server/FileRequest;

    .line 184
    .line 185
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v22

    .line 189
    sget-object v8, Lcom/tonyodev/fetch2core/Extras;->CREATOR:Lq7/e;

    .line 190
    .line 191
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    sget-object v29, Lcom/tonyodev/fetch2core/Extras;->t:Lcom/tonyodev/fetch2core/Extras;

    .line 195
    .line 196
    const-string v27, ""

    .line 197
    .line 198
    const/16 v30, 0x0

    .line 199
    .line 200
    const/16 v31, 0x0

    .line 201
    .line 202
    const/16 v21, -0x1

    .line 203
    .line 204
    const-wide/16 v23, 0x0

    .line 205
    .line 206
    const-wide/16 v25, -0x1

    .line 207
    .line 208
    const/16 v32, 0x1

    .line 209
    .line 210
    move-object/from16 v28, v27

    .line 211
    .line 212
    invoke-direct/range {v20 .. v32}, Lcom/tonyodev/fetch2core/server/FileRequest;-><init>(ILjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/tonyodev/fetch2core/Extras;IIZ)V

    .line 213
    .line 214
    .line 215
    new-instance v8, Ljava/net/InetSocketAddress;

    .line 216
    .line 217
    invoke-direct {v8, v4, v3}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 218
    .line 219
    .line 220
    move v3, v12

    .line 221
    new-instance v12, Lcom/tonyodev/fetch2core/server/FileRequest;

    .line 222
    .line 223
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    const-string v4, "Uri.parse(url)"

    .line 228
    .line 229
    invoke-static {v0, v4}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-eqz v0, :cond_3

    .line 237
    .line 238
    :goto_5
    move-object v14, v0

    .line 239
    goto :goto_6

    .line 240
    :cond_3
    const-string v0, "-1"

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :goto_6
    const-string v0, "Client"

    .line 244
    .line 245
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    check-cast v0, Ljava/lang/String;

    .line 250
    .line 251
    if-eqz v0, :cond_4

    .line 252
    .line 253
    :goto_7
    move-object/from16 v20, v0

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    const-string v4, "UUID.randomUUID().toString()"

    .line 265
    .line 266
    invoke-static {v0, v4}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    goto :goto_7

    .line 270
    :goto_8
    const-string v0, "Page"

    .line 271
    .line 272
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    check-cast v0, Ljava/lang/String;

    .line 277
    .line 278
    if-eqz v0, :cond_5

    .line 279
    .line 280
    invoke-static {v0}, LL9/m;->z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-eqz v0, :cond_5

    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    move/from16 v22, v0

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_5
    move/from16 v22, v3

    .line 294
    .line 295
    :goto_9
    const-string v0, "Size"

    .line 296
    .line 297
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    check-cast v0, Ljava/lang/String;

    .line 302
    .line 303
    if-eqz v0, :cond_6

    .line 304
    .line 305
    invoke-static {v0}, LL9/m;->z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-eqz v0, :cond_6

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    move/from16 v23, v0

    .line 316
    .line 317
    goto :goto_a

    .line 318
    :cond_6
    move/from16 v23, v3

    .line 319
    .line 320
    :goto_a
    const/16 v24, 0x0

    .line 321
    .line 322
    const/4 v13, 0x1

    .line 323
    move-object/from16 v21, v7

    .line 324
    .line 325
    invoke-direct/range {v12 .. v24}, Lcom/tonyodev/fetch2core/server/FileRequest;-><init>(ILjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/tonyodev/fetch2core/Extras;IIZ)V

    .line 326
    .line 327
    .line 328
    iget-object v2, v11, Lr7/a;->c:Ljava/lang/Object;

    .line 329
    .line 330
    monitor-enter v2

    .line 331
    :try_start_1
    invoke-virtual {v11}, Lr7/a;->e()V

    .line 332
    .line 333
    .line 334
    iget-object v0, v11, Lr7/a;->e:Ljava/net/Socket;

    .line 335
    .line 336
    invoke-virtual {v0, v8}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;)V

    .line 337
    .line 338
    .line 339
    new-instance v0, Ljava/io/DataInputStream;

    .line 340
    .line 341
    iget-object v4, v11, Lr7/a;->e:Ljava/net/Socket;

    .line 342
    .line 343
    invoke-virtual {v4}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    invoke-direct {v0, v4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 348
    .line 349
    .line 350
    iput-object v0, v11, Lr7/a;->a:Ljava/io/DataInputStream;

    .line 351
    .line 352
    new-instance v0, Ljava/io/DataOutputStream;

    .line 353
    .line 354
    iget-object v4, v11, Lr7/a;->e:Ljava/net/Socket;

    .line 355
    .line 356
    invoke-virtual {v4}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    invoke-direct {v0, v4}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 361
    .line 362
    .line 363
    iput-object v0, v11, Lr7/a;->b:Ljava/io/DataOutputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 364
    .line 365
    monitor-exit v2

    .line 366
    invoke-virtual {v11, v12}, Lr7/a;->d(Lcom/tonyodev/fetch2core/server/FileRequest;)V

    .line 367
    .line 368
    .line 369
    invoke-interface {v1}, Lq7/j;->p()Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    const/4 v1, 0x0

    .line 374
    if-nez v0, :cond_f

    .line 375
    .line 376
    invoke-virtual {v11}, Lr7/a;->c()Lcom/tonyodev/fetch2core/server/FileResponse;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    move-object v2, v1

    .line 381
    iget v1, v0, Lcom/tonyodev/fetch2core/server/FileResponse;->s:I

    .line 382
    .line 383
    iget v4, v0, Lcom/tonyodev/fetch2core/server/FileResponse;->u:I

    .line 384
    .line 385
    const/16 v7, 0xce

    .line 386
    .line 387
    if-ne v4, v5, :cond_7

    .line 388
    .line 389
    iget v4, v0, Lcom/tonyodev/fetch2core/server/FileResponse;->t:I

    .line 390
    .line 391
    if-ne v4, v5, :cond_7

    .line 392
    .line 393
    if-ne v1, v7, :cond_7

    .line 394
    .line 395
    move v8, v3

    .line 396
    move v12, v5

    .line 397
    goto :goto_b

    .line 398
    :cond_7
    move v8, v3

    .line 399
    move v12, v8

    .line 400
    :goto_b
    iget-wide v3, v0, Lcom/tonyodev/fetch2core/server/FileResponse;->w:J

    .line 401
    .line 402
    move v9, v5

    .line 403
    invoke-virtual {v11}, Lr7/a;->b()Ljava/io/DataInputStream;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    if-nez v12, :cond_8

    .line 408
    .line 409
    invoke-static {v5}, LC3/b;->g(Ljava/io/InputStream;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v10

    .line 413
    :goto_c
    move v13, v8

    .line 414
    goto :goto_d

    .line 415
    :cond_8
    move-object v10, v2

    .line 416
    goto :goto_c

    .line 417
    :goto_d
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 418
    .line 419
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 420
    .line 421
    .line 422
    :try_start_2
    new-instance v14, Lorg/json/JSONObject;

    .line 423
    .line 424
    invoke-virtual {v0}, Lcom/tonyodev/fetch2core/server/FileResponse;->a()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v15

    .line 428
    invoke-direct {v14, v15}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v14}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v15
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 435
    move-object/from16 p2, v2

    .line 436
    .line 437
    :try_start_3
    const-string v2, "json.keys()"

    .line 438
    .line 439
    invoke-static {v15, v2}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    :goto_e
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    if-eqz v2, :cond_9

    .line 447
    .line 448
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    check-cast v2, Ljava/lang/String;

    .line 453
    .line 454
    const-string v9, "it"

    .line 455
    .line 456
    invoke-static {v2, v9}, Lv8/i;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v14, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v9

    .line 463
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    invoke-static {v9}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v9

    .line 471
    invoke-interface {v8, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 472
    .line 473
    .line 474
    const/4 v9, 0x1

    .line 475
    goto :goto_e

    .line 476
    :catch_1
    move-object/from16 p2, v2

    .line 477
    .line 478
    :catch_2
    :cond_9
    const-string v2, "Content-MD5"

    .line 479
    .line 480
    invoke-interface {v8, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    if-nez v2, :cond_a

    .line 485
    .line 486
    const-string v2, "Content-MD5"

    .line 487
    .line 488
    iget-object v0, v0, Lcom/tonyodev/fetch2core/server/FileResponse;->x:Ljava/lang/String;

    .line 489
    .line 490
    invoke-static {v0}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-interface {v8, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    :cond_a
    const-string v0, "Content-MD5"

    .line 498
    .line 499
    invoke-virtual {v8, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    check-cast v0, Ljava/util/List;

    .line 504
    .line 505
    if-eqz v0, :cond_b

    .line 506
    .line 507
    invoke-static {v0}, Li8/k;->V(Ljava/util/List;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    check-cast v0, Ljava/lang/String;

    .line 512
    .line 513
    if-eqz v0, :cond_b

    .line 514
    .line 515
    goto :goto_f

    .line 516
    :cond_b
    const-string v0, ""

    .line 517
    .line 518
    :goto_f
    if-eq v1, v7, :cond_e

    .line 519
    .line 520
    const-string v2, "Accept-Ranges"

    .line 521
    .line 522
    invoke-virtual {v8, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    check-cast v2, Ljava/util/List;

    .line 527
    .line 528
    if-eqz v2, :cond_c

    .line 529
    .line 530
    invoke-static {v2}, Li8/k;->V(Ljava/util/List;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    check-cast v2, Ljava/lang/String;

    .line 535
    .line 536
    goto :goto_10

    .line 537
    :cond_c
    move-object/from16 v2, p2

    .line 538
    .line 539
    :goto_10
    const-string v7, "bytes"

    .line 540
    .line 541
    invoke-static {v2, v7}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    move-result v2

    .line 545
    if-eqz v2, :cond_d

    .line 546
    .line 547
    goto :goto_12

    .line 548
    :cond_d
    move v9, v13

    .line 549
    :goto_11
    move-object v7, v0

    .line 550
    goto :goto_13

    .line 551
    :cond_e
    :goto_12
    const/4 v9, 0x1

    .line 552
    goto :goto_11

    .line 553
    :goto_13
    new-instance v0, Lq7/c;

    .line 554
    .line 555
    move v2, v12

    .line 556
    invoke-direct/range {v0 .. v10}, Lq7/c;-><init>(IZJLjava/io/InputStream;LFa/e;Ljava/lang/String;Ljava/util/AbstractMap;ZLjava/lang/String;)V

    .line 557
    .line 558
    .line 559
    move-object/from16 v1, p0

    .line 560
    .line 561
    iget-object v2, v1, Lh7/d;->s:Ljava/util/Map;

    .line 562
    .line 563
    invoke-interface {v2, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    return-object v0

    .line 567
    :cond_f
    move-object/from16 p2, v1

    .line 568
    .line 569
    move-object/from16 v1, p0

    .line 570
    .line 571
    return-object p2

    .line 572
    :catchall_0
    move-exception v0

    .line 573
    move-object/from16 v1, p0

    .line 574
    .line 575
    monitor-exit v2

    .line 576
    throw v0
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

.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh7/d;->s:Ljava/util/Map;

    .line 2
    .line 3
    :try_start_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lr7/a;

    .line 28
    .line 29
    invoke-virtual {v2}, Lr7/a;->a()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    :catch_0
    return-void
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

.method public final k(Lq7/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh7/d;->s:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lr7/a;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Lr7/a;->a()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
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

.method public final q(LFa/e;)V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final r(LFa/e;)Ljava/util/Set;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p1, p0}, LC3/b;->A(LFa/e;Lq7/d;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p1

    .line 6
    :catch_0
    iget-object p1, p0, Lh7/d;->t:Lq7/b;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    new-array v0, v0, [Lq7/b;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aput-object p1, v0, v1

    .line 13
    .line 14
    invoke-static {v0}, Li8/C;->s([Ljava/lang/Object;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
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

.method public final s(LFa/e;Ljava/util/Set;)Lq7/b;
    .locals 0

    .line 1
    const-string p1, "supportedFileDownloaderTypes"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lh7/d;->t:Lq7/b;

    .line 7
    .line 8
    return-object p1
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
    .line 27
    .line 28
    .line 29
    .line 30
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
.end method

.method public final y(LFa/e;)V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
