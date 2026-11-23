.class public final Lca/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX9/z;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LX9/E;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lca/a;->a:I

    const-string v0, "client"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LX9/r;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lca/a;->a:I

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public static d(LX9/L;I)I
    .locals 1

    .line 1
    const-string v0, "Retry-After"

    .line 2
    .line 3
    invoke-static {p0, v0}, LX9/L;->b(LX9/L;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    const-string p1, "\\d+"

    .line 11
    .line 12
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "compile(...)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "valueOf(header)"

    .line 36
    .line 37
    invoke-static {p0, p1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_1
    const p0, 0x7fffffff

    .line 46
    .line 47
    .line 48
    return p0
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


# virtual methods
.method public final a(Lca/f;)LX9/L;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Lca/a;->a:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v2, Lca/f;->e:LX9/G;

    .line 11
    .line 12
    iget-object v3, v2, Lca/f;->a:Lba/i;

    .line 13
    .line 14
    sget-object v4, Li8/s;->s:Li8/s;

    .line 15
    .line 16
    move-object v8, v4

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    move-object v4, v0

    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string v11, "request"

    .line 25
    .line 26
    invoke-static {v4, v11}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v11, v3, Lba/i;->A:Lo4/r;

    .line 30
    .line 31
    if-nez v11, :cond_d

    .line 32
    .line 33
    monitor-enter v3

    .line 34
    :try_start_0
    iget-boolean v11, v3, Lba/i;->C:Z

    .line 35
    .line 36
    if-nez v11, :cond_c

    .line 37
    .line 38
    iget-boolean v11, v3, Lba/i;->B:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    .line 40
    if-nez v11, :cond_b

    .line 41
    .line 42
    monitor-exit v3

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    new-instance v0, Lba/e;

    .line 46
    .line 47
    iget-object v11, v3, Lba/i;->u:Lba/l;

    .line 48
    .line 49
    iget-object v12, v4, LX9/G;->a:LX9/y;

    .line 50
    .line 51
    iget-boolean v13, v12, LX9/y;->j:Z

    .line 52
    .line 53
    iget-object v14, v3, Lba/i;->s:LX9/E;

    .line 54
    .line 55
    if-eqz v13, :cond_1

    .line 56
    .line 57
    iget-object v13, v14, LX9/E;->H:Ljavax/net/ssl/SSLSocketFactory;

    .line 58
    .line 59
    if-eqz v13, :cond_0

    .line 60
    .line 61
    iget-object v15, v14, LX9/E;->L:Lka/c;

    .line 62
    .line 63
    iget-object v5, v14, LX9/E;->M:LX9/l;

    .line 64
    .line 65
    move-object/from16 v24, v5

    .line 66
    .line 67
    move-object/from16 v22, v13

    .line 68
    .line 69
    move-object/from16 v23, v15

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v2, "CLEARTEXT-only client"

    .line 75
    .line 76
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_1
    const/16 v22, 0x0

    .line 81
    .line 82
    const/16 v23, 0x0

    .line 83
    .line 84
    const/16 v24, 0x0

    .line 85
    .line 86
    :goto_2
    new-instance v17, LX9/a;

    .line 87
    .line 88
    iget-object v5, v14, LX9/E;->D:LX9/b;

    .line 89
    .line 90
    iget-object v13, v14, LX9/E;->G:Ljavax/net/SocketFactory;

    .line 91
    .line 92
    iget-object v15, v14, LX9/E;->F:LX9/b;

    .line 93
    .line 94
    iget-object v7, v14, LX9/E;->K:Ljava/util/List;

    .line 95
    .line 96
    iget-object v6, v14, LX9/E;->J:Ljava/util/List;

    .line 97
    .line 98
    iget-object v14, v14, LX9/E;->E:Ljava/net/ProxySelector;

    .line 99
    .line 100
    move-object/from16 v20, v5

    .line 101
    .line 102
    iget-object v5, v12, LX9/y;->d:Ljava/lang/String;

    .line 103
    .line 104
    iget v12, v12, LX9/y;->e:I

    .line 105
    .line 106
    move-object/from16 v18, v5

    .line 107
    .line 108
    move-object/from16 v27, v6

    .line 109
    .line 110
    move-object/from16 v26, v7

    .line 111
    .line 112
    move/from16 v19, v12

    .line 113
    .line 114
    move-object/from16 v21, v13

    .line 115
    .line 116
    move-object/from16 v28, v14

    .line 117
    .line 118
    move-object/from16 v25, v15

    .line 119
    .line 120
    invoke-direct/range {v17 .. v28}, LX9/a;-><init>(Ljava/lang/String;ILX9/b;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;LX9/l;LX9/b;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 121
    .line 122
    .line 123
    move-object/from16 v5, v17

    .line 124
    .line 125
    invoke-direct {v0, v11, v5, v3}, Lba/e;-><init>(Lba/l;LX9/a;Lba/i;)V

    .line 126
    .line 127
    .line 128
    iput-object v0, v3, Lba/i;->y:Lba/e;

    .line 129
    .line 130
    :cond_2
    :try_start_1
    iget-boolean v0, v3, Lba/i;->E:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    .line 132
    if-nez v0, :cond_a

    .line 133
    .line 134
    :try_start_2
    invoke-virtual {v2, v4}, Lca/f;->b(LX9/G;)LX9/L;

    .line 135
    .line 136
    .line 137
    move-result-object v0
    :try_end_2
    .catch Lokhttp3/internal/connection/RouteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    if-eqz v9, :cond_4

    .line 139
    .line 140
    :try_start_3
    invoke-virtual {v0}, LX9/L;->g()LX9/K;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v9}, LX9/L;->g()LX9/K;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    const/4 v5, 0x0

    .line 149
    iput-object v5, v4, LX9/K;->g:LX9/O;

    .line 150
    .line 151
    invoke-virtual {v4}, LX9/K;->a()LX9/L;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    iget-object v6, v4, LX9/L;->y:LX9/O;

    .line 156
    .line 157
    if-nez v6, :cond_3

    .line 158
    .line 159
    iput-object v4, v0, LX9/K;->j:LX9/L;

    .line 160
    .line 161
    invoke-virtual {v0}, LX9/K;->a()LX9/L;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    :goto_3
    move-object v9, v0

    .line 166
    goto :goto_4

    .line 167
    :catchall_0
    move-exception v0

    .line 168
    const/4 v6, 0x1

    .line 169
    goto/16 :goto_6

    .line 170
    .line 171
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 172
    .line 173
    const-string v2, "priorResponse.body != null"

    .line 174
    .line 175
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v0

    .line 179
    :cond_4
    const/4 v5, 0x0

    .line 180
    goto :goto_3

    .line 181
    :goto_4
    iget-object v0, v3, Lba/i;->A:Lo4/r;

    .line 182
    .line 183
    invoke-virtual {v1, v9, v0}, Lca/a;->b(LX9/L;Lo4/r;)LX9/G;

    .line 184
    .line 185
    .line 186
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 187
    if-nez v4, :cond_5

    .line 188
    .line 189
    const/4 v6, 0x0

    .line 190
    invoke-virtual {v3, v6}, Lba/i;->h(Z)V

    .line 191
    .line 192
    .line 193
    return-object v9

    .line 194
    :cond_5
    :try_start_4
    iget-object v0, v9, LX9/L;->y:LX9/O;

    .line 195
    .line 196
    if-nez v0, :cond_6

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_6
    invoke-static {v0}, LY9/c;->d(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 200
    .line 201
    .line 202
    :goto_5
    add-int/lit8 v10, v10, 0x1

    .line 203
    .line 204
    const/16 v0, 0x14

    .line 205
    .line 206
    if-gt v10, v0, :cond_7

    .line 207
    .line 208
    const/4 v6, 0x1

    .line 209
    invoke-virtual {v3, v6}, Lba/i;->h(Z)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_7
    :try_start_5
    new-instance v0, Ljava/net/ProtocolException;

    .line 215
    .line 216
    const-string v2, "Too many follow-up requests: "

    .line 217
    .line 218
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-static {v4, v2}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v0

    .line 230
    :catch_0
    move-exception v0

    .line 231
    const/4 v5, 0x0

    .line 232
    instance-of v6, v0, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 233
    .line 234
    const/4 v7, 0x1

    .line 235
    xor-int/2addr v6, v7

    .line 236
    invoke-virtual {v1, v0, v3, v4, v6}, Lca/a;->c(Ljava/io/IOException;Lba/i;LX9/G;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    if-eqz v6, :cond_8

    .line 241
    .line 242
    check-cast v8, Ljava/util/Collection;

    .line 243
    .line 244
    invoke-static {v8, v0}, Li8/k;->h0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 245
    .line 246
    .line 247
    move-result-object v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 248
    invoke-virtual {v3, v7}, Lba/i;->h(Z)V

    .line 249
    .line 250
    .line 251
    const/4 v0, 0x0

    .line 252
    goto/16 :goto_1

    .line 253
    .line 254
    :cond_8
    :try_start_6
    invoke-static {v0, v8}, LY9/c;->A(Ljava/io/IOException;Ljava/util/List;)V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :catch_1
    move-exception v0

    .line 259
    const/4 v5, 0x0

    .line 260
    iget-object v6, v0, Lokhttp3/internal/connection/RouteException;->t:Ljava/io/IOException;

    .line 261
    .line 262
    const/4 v7, 0x0

    .line 263
    invoke-virtual {v1, v6, v3, v4, v7}, Lca/a;->c(Ljava/io/IOException;Lba/i;LX9/G;Z)Z

    .line 264
    .line 265
    .line 266
    move-result v6

    .line 267
    if-eqz v6, :cond_9

    .line 268
    .line 269
    check-cast v8, Ljava/util/Collection;

    .line 270
    .line 271
    iget-object v0, v0, Lokhttp3/internal/connection/RouteException;->s:Ljava/io/IOException;

    .line 272
    .line 273
    invoke-static {v8, v0}, Li8/k;->h0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 274
    .line 275
    .line 276
    move-result-object v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 277
    const/4 v6, 0x1

    .line 278
    invoke-virtual {v3, v6}, Lba/i;->h(Z)V

    .line 279
    .line 280
    .line 281
    move v0, v7

    .line 282
    goto/16 :goto_1

    .line 283
    .line 284
    :cond_9
    :try_start_7
    iget-object v0, v0, Lokhttp3/internal/connection/RouteException;->s:Ljava/io/IOException;

    .line 285
    .line 286
    invoke-static {v0, v8}, LY9/c;->A(Ljava/io/IOException;Ljava/util/List;)V

    .line 287
    .line 288
    .line 289
    throw v0

    .line 290
    :cond_a
    new-instance v0, Ljava/io/IOException;

    .line 291
    .line 292
    const-string v2, "Canceled"

    .line 293
    .line 294
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 298
    :goto_6
    invoke-virtual {v3, v6}, Lba/i;->h(Z)V

    .line 299
    .line 300
    .line 301
    throw v0

    .line 302
    :cond_b
    :try_start_8
    const-string v0, "Check failed."

    .line 303
    .line 304
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 305
    .line 306
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw v2

    .line 310
    :catchall_1
    move-exception v0

    .line 311
    goto :goto_7

    .line 312
    :cond_c
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 313
    .line 314
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 315
    .line 316
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 320
    :goto_7
    monitor-exit v3

    .line 321
    throw v0

    .line 322
    :cond_d
    const-string v0, "Check failed."

    .line 323
    .line 324
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 325
    .line 326
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw v2

    .line 330
    :pswitch_0
    iget-object v0, v2, Lca/f;->e:LX9/G;

    .line 331
    .line 332
    invoke-virtual {v0}, LX9/G;->a()LFa/e;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    const-wide/16 v6, -0x1

    .line 337
    .line 338
    const-string v4, "Content-Type"

    .line 339
    .line 340
    const-string v5, "Content-Length"

    .line 341
    .line 342
    iget-object v8, v0, LX9/G;->d:LX9/J;

    .line 343
    .line 344
    if-eqz v8, :cond_10

    .line 345
    .line 346
    invoke-virtual {v8}, LX9/J;->b()LX9/A;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    if-eqz v9, :cond_e

    .line 351
    .line 352
    iget-object v9, v9, LX9/A;->a:Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual {v3, v4, v9}, LFa/e;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    :cond_e
    invoke-virtual {v8}, LX9/J;->a()J

    .line 358
    .line 359
    .line 360
    move-result-wide v8

    .line 361
    cmp-long v10, v8, v6

    .line 362
    .line 363
    const-string v11, "Transfer-Encoding"

    .line 364
    .line 365
    if-eqz v10, :cond_f

    .line 366
    .line 367
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v8

    .line 371
    invoke-virtual {v3, v5, v8}, LFa/e;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    iget-object v8, v3, LFa/e;->v:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v8, LM1/c;

    .line 377
    .line 378
    invoke-virtual {v8, v11}, LM1/c;->i(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_f
    const-string v8, "chunked"

    .line 383
    .line 384
    invoke-virtual {v3, v11, v8}, LFa/e;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    iget-object v8, v3, LFa/e;->v:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v8, LM1/c;

    .line 390
    .line 391
    invoke-virtual {v8, v5}, LM1/c;->i(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    :cond_10
    :goto_8
    iget-object v8, v0, LX9/G;->c:LX9/w;

    .line 395
    .line 396
    const-string v9, "Host"

    .line 397
    .line 398
    invoke-virtual {v8, v9}, LX9/w;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    const/4 v11, 0x0

    .line 403
    iget-object v12, v0, LX9/G;->a:LX9/y;

    .line 404
    .line 405
    if-nez v10, :cond_11

    .line 406
    .line 407
    invoke-static {v12, v11}, LY9/c;->w(LX9/y;Z)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    invoke-virtual {v3, v9, v10}, LFa/e;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    :cond_11
    const-string v9, "Connection"

    .line 415
    .line 416
    invoke-virtual {v8, v9}, LX9/w;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v10

    .line 420
    if-nez v10, :cond_12

    .line 421
    .line 422
    const-string v10, "Keep-Alive"

    .line 423
    .line 424
    invoke-virtual {v3, v9, v10}, LFa/e;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    :cond_12
    const-string v9, "Accept-Encoding"

    .line 428
    .line 429
    invoke-virtual {v8, v9}, LX9/w;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v10

    .line 433
    const-string v13, "gzip"

    .line 434
    .line 435
    if-nez v10, :cond_13

    .line 436
    .line 437
    const-string v10, "Range"

    .line 438
    .line 439
    invoke-virtual {v8, v10}, LX9/w;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v10

    .line 443
    if-nez v10, :cond_13

    .line 444
    .line 445
    invoke-virtual {v3, v9, v13}, LFa/e;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    const/4 v9, 0x1

    .line 449
    goto :goto_9

    .line 450
    :cond_13
    move v9, v11

    .line 451
    :goto_9
    iget-object v10, v1, Lca/a;->b:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v10, LX9/r;

    .line 454
    .line 455
    invoke-interface {v10, v12}, LX9/r;->n(LX9/y;)Ljava/util/List;

    .line 456
    .line 457
    .line 458
    move-result-object v14

    .line 459
    move-object v15, v14

    .line 460
    check-cast v15, Ljava/util/Collection;

    .line 461
    .line 462
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    .line 463
    .line 464
    .line 465
    move-result v15

    .line 466
    if-nez v15, :cond_17

    .line 467
    .line 468
    new-instance v15, Ljava/lang/StringBuilder;

    .line 469
    .line 470
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 471
    .line 472
    .line 473
    check-cast v14, Ljava/lang/Iterable;

    .line 474
    .line 475
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v14

    .line 479
    :goto_a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v16

    .line 483
    if-eqz v16, :cond_16

    .line 484
    .line 485
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v16

    .line 489
    add-int/lit8 v17, v11, 0x1

    .line 490
    .line 491
    if-ltz v11, :cond_15

    .line 492
    .line 493
    move-object/from16 v6, v16

    .line 494
    .line 495
    check-cast v6, LX9/q;

    .line 496
    .line 497
    if-lez v11, :cond_14

    .line 498
    .line 499
    const-string v7, "; "

    .line 500
    .line 501
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    :cond_14
    iget-object v7, v6, LX9/q;->a:Ljava/lang/String;

    .line 505
    .line 506
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    const/16 v7, 0x3d

    .line 510
    .line 511
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    iget-object v6, v6, LX9/q;->b:Ljava/lang/String;

    .line 515
    .line 516
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    move/from16 v11, v17

    .line 520
    .line 521
    const-wide/16 v6, -0x1

    .line 522
    .line 523
    goto :goto_a

    .line 524
    :cond_15
    invoke-static {}, Li8/l;->G()V

    .line 525
    .line 526
    .line 527
    const/4 v0, 0x0

    .line 528
    throw v0

    .line 529
    :cond_16
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v6

    .line 533
    const-string v7, "StringBuilder().apply(builderAction).toString()"

    .line 534
    .line 535
    invoke-static {v6, v7}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    const-string v7, "Cookie"

    .line 539
    .line 540
    invoke-virtual {v3, v7, v6}, LFa/e;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    :cond_17
    const-string v6, "User-Agent"

    .line 544
    .line 545
    invoke-virtual {v8, v6}, LX9/w;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v7

    .line 549
    if-nez v7, :cond_18

    .line 550
    .line 551
    const-string v7, "okhttp/4.10.0"

    .line 552
    .line 553
    invoke-virtual {v3, v6, v7}, LFa/e;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    :cond_18
    invoke-virtual {v3}, LFa/e;->j()LX9/G;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    invoke-virtual {v2, v3}, Lca/f;->b(LX9/G;)LX9/L;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    iget-object v3, v2, LX9/L;->x:LX9/w;

    .line 565
    .line 566
    invoke-static {v10, v12, v3}, Lca/e;->b(LX9/r;LX9/y;LX9/w;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v2}, LX9/L;->g()LX9/K;

    .line 570
    .line 571
    .line 572
    move-result-object v10

    .line 573
    iput-object v0, v10, LX9/K;->a:LX9/G;

    .line 574
    .line 575
    if-eqz v9, :cond_19

    .line 576
    .line 577
    const-string v0, "Content-Encoding"

    .line 578
    .line 579
    invoke-static {v2, v0}, LX9/L;->b(LX9/L;Ljava/lang/String;)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    invoke-virtual {v13, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    if-eqz v6, :cond_19

    .line 588
    .line 589
    invoke-static {v2}, Lca/e;->a(LX9/L;)Z

    .line 590
    .line 591
    .line 592
    move-result v6

    .line 593
    if-eqz v6, :cond_19

    .line 594
    .line 595
    iget-object v6, v2, LX9/L;->y:LX9/O;

    .line 596
    .line 597
    if-eqz v6, :cond_19

    .line 598
    .line 599
    new-instance v7, Lma/m;

    .line 600
    .line 601
    invoke-virtual {v6}, LX9/O;->c()Lma/h;

    .line 602
    .line 603
    .line 604
    move-result-object v6

    .line 605
    invoke-direct {v7, v6}, Lma/m;-><init>(Lma/w;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v3}, LX9/w;->g()LM1/c;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    invoke-virtual {v3, v0}, LM1/c;->i(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v3, v5}, LM1/c;->i(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v3}, LM1/c;->d()LX9/w;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v10, v0}, LX9/K;->c(LX9/w;)V

    .line 623
    .line 624
    .line 625
    invoke-static {v2, v4}, LX9/L;->b(LX9/L;Ljava/lang/String;)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v5

    .line 629
    new-instance v4, LX9/N;

    .line 630
    .line 631
    invoke-static {v7}, Lga/d;->d(Lma/w;)Lma/r;

    .line 632
    .line 633
    .line 634
    move-result-object v8

    .line 635
    const/4 v9, 0x1

    .line 636
    const-wide/16 v6, -0x1

    .line 637
    .line 638
    invoke-direct/range {v4 .. v9}, LX9/N;-><init>(Ljava/lang/Object;JLma/h;I)V

    .line 639
    .line 640
    .line 641
    iput-object v4, v10, LX9/K;->g:LX9/O;

    .line 642
    .line 643
    :cond_19
    invoke-virtual {v10}, LX9/K;->a()LX9/L;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    return-object v0

    .line 648
    nop

    .line 649
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public b(LX9/L;Lo4/r;)LX9/G;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    :goto_0
    move-object v1, v0

    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v1, p2, Lo4/r;->w:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lba/k;

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget-object v1, v1, Lba/k;->b:LX9/P;

    .line 14
    .line 15
    :goto_1
    iget v2, p1, LX9/L;->v:I

    .line 16
    .line 17
    iget-object v3, p1, LX9/L;->s:LX9/G;

    .line 18
    .line 19
    iget-object v3, v3, LX9/G;->b:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x1

    .line 23
    const/16 v6, 0x134

    .line 24
    .line 25
    const/16 v7, 0x133

    .line 26
    .line 27
    if-eq v2, v7, :cond_d

    .line 28
    .line 29
    if-eq v2, v6, :cond_d

    .line 30
    .line 31
    const/16 v8, 0x191

    .line 32
    .line 33
    if-eq v2, v8, :cond_c

    .line 34
    .line 35
    const/16 v8, 0x1a5

    .line 36
    .line 37
    if-eq v2, v8, :cond_a

    .line 38
    .line 39
    const/16 p2, 0x1f7

    .line 40
    .line 41
    if-eq v2, p2, :cond_8

    .line 42
    .line 43
    const/16 p2, 0x197

    .line 44
    .line 45
    if-eq v2, p2, :cond_6

    .line 46
    .line 47
    const/16 p2, 0x198

    .line 48
    .line 49
    if-eq v2, p2, :cond_2

    .line 50
    .line 51
    packed-switch v2, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_2
    iget-object v1, p0, Lca/a;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, LX9/E;

    .line 59
    .line 60
    iget-boolean v1, v1, LX9/E;->x:Z

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :cond_3
    iget-object v1, p1, LX9/L;->B:LX9/L;

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    iget v1, v1, LX9/L;->v:I

    .line 71
    .line 72
    if-ne v1, p2, :cond_4

    .line 73
    .line 74
    goto/16 :goto_2

    .line 75
    .line 76
    :cond_4
    invoke-static {p1, v4}, Lca/a;->d(LX9/L;I)I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-lez p2, :cond_5

    .line 81
    .line 82
    goto/16 :goto_2

    .line 83
    .line 84
    :cond_5
    iget-object p1, p1, LX9/L;->s:LX9/G;

    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_6
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, v1, LX9/P;->b:Ljava/net/Proxy;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 97
    .line 98
    if-ne p1, p2, :cond_7

    .line 99
    .line 100
    iget-object p1, p0, Lca/a;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, LX9/E;

    .line 103
    .line 104
    iget-object p1, p1, LX9/E;->F:LX9/b;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_7
    new-instance p1, Ljava/net/ProtocolException;

    .line 111
    .line 112
    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 113
    .line 114
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_8
    iget-object v1, p1, LX9/L;->B:LX9/L;

    .line 119
    .line 120
    if-eqz v1, :cond_9

    .line 121
    .line 122
    iget v1, v1, LX9/L;->v:I

    .line 123
    .line 124
    if-ne v1, p2, :cond_9

    .line 125
    .line 126
    goto/16 :goto_2

    .line 127
    .line 128
    :cond_9
    const p2, 0x7fffffff

    .line 129
    .line 130
    .line 131
    invoke-static {p1, p2}, Lca/a;->d(LX9/L;I)I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    if-nez p2, :cond_11

    .line 136
    .line 137
    iget-object p1, p1, LX9/L;->s:LX9/G;

    .line 138
    .line 139
    return-object p1

    .line 140
    :cond_a
    if-eqz p2, :cond_11

    .line 141
    .line 142
    iget-object v1, p2, Lo4/r;->u:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, Lba/e;

    .line 145
    .line 146
    iget-object v1, v1, Lba/e;->b:LX9/a;

    .line 147
    .line 148
    iget-object v1, v1, LX9/a;->h:LX9/y;

    .line 149
    .line 150
    iget-object v1, v1, LX9/y;->d:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v2, p2, Lo4/r;->w:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v2, Lba/k;

    .line 155
    .line 156
    iget-object v2, v2, Lba/k;->b:LX9/P;

    .line 157
    .line 158
    iget-object v2, v2, LX9/P;->a:LX9/a;

    .line 159
    .line 160
    iget-object v2, v2, LX9/a;->h:LX9/y;

    .line 161
    .line 162
    iget-object v2, v2, LX9/y;->d:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v1, v2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_b

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_b
    iget-object p2, p2, Lo4/r;->w:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p2, Lba/k;

    .line 174
    .line 175
    monitor-enter p2

    .line 176
    :try_start_0
    iput-boolean v5, p2, Lba/k;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .line 178
    monitor-exit p2

    .line 179
    iget-object p1, p1, LX9/L;->s:LX9/G;

    .line 180
    .line 181
    return-object p1

    .line 182
    :catchall_0
    move-exception p1

    .line 183
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 184
    throw p1

    .line 185
    :cond_c
    iget-object p1, p0, Lca/a;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, LX9/E;

    .line 188
    .line 189
    iget-object p1, p1, LX9/E;->y:LX9/b;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    return-object v0

    .line 195
    :cond_d
    :pswitch_0
    iget-object p2, p0, Lca/a;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p2, LX9/E;

    .line 198
    .line 199
    iget-boolean v1, p2, LX9/E;->z:Z

    .line 200
    .line 201
    if-nez v1, :cond_e

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_e
    const-string v1, "Location"

    .line 205
    .line 206
    invoke-static {p1, v1}, LX9/L;->b(LX9/L;Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    if-nez v1, :cond_f

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_f
    iget-object v2, p1, LX9/L;->s:LX9/G;

    .line 214
    .line 215
    iget-object v8, v2, LX9/G;->a:LX9/y;

    .line 216
    .line 217
    invoke-virtual {v8, v1}, LX9/y;->h(Ljava/lang/String;)LX9/y;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    if-nez v1, :cond_10

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_10
    iget-object v8, v2, LX9/G;->a:LX9/y;

    .line 225
    .line 226
    iget-object v8, v8, LX9/y;->a:Ljava/lang/String;

    .line 227
    .line 228
    iget-object v9, v1, LX9/y;->a:Ljava/lang/String;

    .line 229
    .line 230
    invoke-static {v9, v8}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v8

    .line 234
    if-nez v8, :cond_12

    .line 235
    .line 236
    iget-boolean p2, p2, LX9/E;->A:Z

    .line 237
    .line 238
    if-nez p2, :cond_12

    .line 239
    .line 240
    :cond_11
    :goto_2
    return-object v0

    .line 241
    :cond_12
    invoke-virtual {v2}, LX9/G;->a()LFa/e;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    invoke-static {v3}, Lxa/d;->s(Ljava/lang/String;)Z

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-eqz v8, :cond_17

    .line 250
    .line 251
    const-string v8, "PROPFIND"

    .line 252
    .line 253
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    iget p1, p1, LX9/L;->v:I

    .line 258
    .line 259
    if-nez v9, :cond_13

    .line 260
    .line 261
    if-eq p1, v6, :cond_13

    .line 262
    .line 263
    if-ne p1, v7, :cond_14

    .line 264
    .line 265
    :cond_13
    move v4, v5

    .line 266
    :cond_14
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    if-nez v5, :cond_15

    .line 271
    .line 272
    if-eq p1, v6, :cond_15

    .line 273
    .line 274
    if-eq p1, v7, :cond_15

    .line 275
    .line 276
    const-string p1, "GET"

    .line 277
    .line 278
    invoke-virtual {p2, p1, v0}, LFa/e;->v(Ljava/lang/String;LX9/J;)V

    .line 279
    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_15
    if-eqz v4, :cond_16

    .line 283
    .line 284
    iget-object v0, v2, LX9/G;->d:LX9/J;

    .line 285
    .line 286
    :cond_16
    invoke-virtual {p2, v3, v0}, LFa/e;->v(Ljava/lang/String;LX9/J;)V

    .line 287
    .line 288
    .line 289
    :goto_3
    if-nez v4, :cond_17

    .line 290
    .line 291
    const-string p1, "Transfer-Encoding"

    .line 292
    .line 293
    iget-object v0, p2, LFa/e;->v:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, LM1/c;

    .line 296
    .line 297
    invoke-virtual {v0, p1}, LM1/c;->i(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    const-string p1, "Content-Length"

    .line 301
    .line 302
    iget-object v0, p2, LFa/e;->v:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, LM1/c;

    .line 305
    .line 306
    invoke-virtual {v0, p1}, LM1/c;->i(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    const-string p1, "Content-Type"

    .line 310
    .line 311
    iget-object v0, p2, LFa/e;->v:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v0, LM1/c;

    .line 314
    .line 315
    invoke-virtual {v0, p1}, LM1/c;->i(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    :cond_17
    iget-object p1, v2, LX9/G;->a:LX9/y;

    .line 319
    .line 320
    invoke-static {p1, v1}, LY9/c;->a(LX9/y;LX9/y;)Z

    .line 321
    .line 322
    .line 323
    move-result p1

    .line 324
    if-nez p1, :cond_18

    .line 325
    .line 326
    const-string p1, "Authorization"

    .line 327
    .line 328
    iget-object v0, p2, LFa/e;->v:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, LM1/c;

    .line 331
    .line 332
    invoke-virtual {v0, p1}, LM1/c;->i(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    :cond_18
    iput-object v1, p2, LFa/e;->t:Ljava/lang/Object;

    .line 336
    .line 337
    invoke-virtual {p2}, LFa/e;->j()LX9/G;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    return-object p1

    .line 342
    nop

    .line 343
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
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

.method public c(Ljava/io/IOException;Lba/i;LX9/G;Z)Z
    .locals 3

    .line 1
    iget-object p3, p0, Lca/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, LX9/E;

    .line 4
    .line 5
    iget-boolean p3, p3, LX9/E;->x:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    if-eqz p4, :cond_1

    .line 13
    .line 14
    instance-of p3, p1, Ljava/io/FileNotFoundException;

    .line 15
    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    instance-of p3, p1, Ljava/net/ProtocolException;

    .line 20
    .line 21
    if-eqz p3, :cond_2

    .line 22
    .line 23
    return v0

    .line 24
    :cond_2
    instance-of p3, p1, Ljava/io/InterruptedIOException;

    .line 25
    .line 26
    if-eqz p3, :cond_3

    .line 27
    .line 28
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 29
    .line 30
    if-eqz p1, :cond_11

    .line 31
    .line 32
    if-nez p4, :cond_11

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 36
    .line 37
    if-eqz p3, :cond_4

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    instance-of p3, p3, Ljava/security/cert/CertificateException;

    .line 44
    .line 45
    if-eqz p3, :cond_4

    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_4
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 50
    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    return v0

    .line 54
    :cond_5
    :goto_0
    iget-object p1, p2, Lba/i;->y:Lba/e;

    .line 55
    .line 56
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget p2, p1, Lba/e;->f:I

    .line 60
    .line 61
    const/4 p3, 0x1

    .line 62
    if-nez p2, :cond_6

    .line 63
    .line 64
    iget p4, p1, Lba/e;->g:I

    .line 65
    .line 66
    if-nez p4, :cond_6

    .line 67
    .line 68
    iget p4, p1, Lba/e;->h:I

    .line 69
    .line 70
    if-nez p4, :cond_6

    .line 71
    .line 72
    move p1, v0

    .line 73
    goto :goto_5

    .line 74
    :cond_6
    iget-object p4, p1, Lba/e;->i:LX9/P;

    .line 75
    .line 76
    if-eqz p4, :cond_7

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_7
    const/4 p4, 0x0

    .line 80
    if-gt p2, p3, :cond_c

    .line 81
    .line 82
    iget p2, p1, Lba/e;->g:I

    .line 83
    .line 84
    if-gt p2, p3, :cond_c

    .line 85
    .line 86
    iget p2, p1, Lba/e;->h:I

    .line 87
    .line 88
    if-lez p2, :cond_8

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_8
    iget-object p2, p1, Lba/e;->c:Lba/i;

    .line 92
    .line 93
    iget-object p2, p2, Lba/i;->z:Lba/k;

    .line 94
    .line 95
    if-nez p2, :cond_9

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_9
    monitor-enter p2

    .line 99
    :try_start_0
    iget v1, p2, Lba/k;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    if-eqz v1, :cond_a

    .line 102
    .line 103
    monitor-exit p2

    .line 104
    goto :goto_1

    .line 105
    :cond_a
    :try_start_1
    iget-object v1, p2, Lba/k;->b:LX9/P;

    .line 106
    .line 107
    iget-object v1, v1, LX9/P;->a:LX9/a;

    .line 108
    .line 109
    iget-object v1, v1, LX9/a;->h:LX9/y;

    .line 110
    .line 111
    iget-object v2, p1, Lba/e;->b:LX9/a;

    .line 112
    .line 113
    iget-object v2, v2, LX9/a;->h:LX9/y;

    .line 114
    .line 115
    invoke-static {v1, v2}, LY9/c;->a(LX9/y;LX9/y;)Z

    .line 116
    .line 117
    .line 118
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    if-nez v1, :cond_b

    .line 120
    .line 121
    monitor-exit p2

    .line 122
    goto :goto_1

    .line 123
    :cond_b
    :try_start_2
    iget-object p4, p2, Lba/k;->b:LX9/P;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .line 125
    monitor-exit p2

    .line 126
    goto :goto_1

    .line 127
    :catchall_0
    move-exception p1

    .line 128
    monitor-exit p2

    .line 129
    throw p1

    .line 130
    :cond_c
    :goto_1
    if-eqz p4, :cond_d

    .line 131
    .line 132
    iput-object p4, p1, Lba/e;->i:LX9/P;

    .line 133
    .line 134
    :goto_2
    move p1, p3

    .line 135
    goto :goto_5

    .line 136
    :cond_d
    iget-object p2, p1, Lba/e;->d:LP3/n;

    .line 137
    .line 138
    if-nez p2, :cond_e

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_e
    invoke-virtual {p2}, LP3/n;->b()Z

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    if-ne p2, p3, :cond_f

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_f
    :goto_3
    iget-object p1, p1, Lba/e;->e:LB4/e;

    .line 149
    .line 150
    if-nez p1, :cond_10

    .line 151
    .line 152
    :goto_4
    goto :goto_2

    .line 153
    :cond_10
    invoke-virtual {p1}, LB4/e;->j()Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    :goto_5
    if-nez p1, :cond_12

    .line 158
    .line 159
    :cond_11
    :goto_6
    return v0

    .line 160
    :cond_12
    return p3
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
.end method
