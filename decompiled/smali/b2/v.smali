.class public final Lb2/v;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lb2/x;


# direct methods
.method public synthetic constructor <init>(Lb2/x;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb2/v;->s:I

    iput-object p1, p0, Lb2/v;->t:Lb2/x;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lb2/v;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb2/E;

    .line 7
    .line 8
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 9
    .line 10
    iget-object v1, v1, Lb2/x;->h:Lx9/d;

    .line 11
    .line 12
    :try_start_0
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 13
    .line 14
    const-string v2, "MODEL"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    const-string v1, ""

    .line 23
    .line 24
    :goto_0
    invoke-direct {v0, v1}, Lb2/E;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    new-instance v0, Lb2/D;

    .line 29
    .line 30
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 31
    .line 32
    iget-object v1, v1, Lb2/x;->h:Lx9/d;

    .line 33
    .line 34
    :try_start_1
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 35
    .line 36
    const-string v2, "MANUFACTURER"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catch_1
    const-string v1, ""

    .line 45
    .line 46
    :goto_1
    invoke-direct {v0, v1}, Lb2/D;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_1
    const-string v0, ""

    .line 51
    .line 52
    new-instance v1, Lb2/C;

    .line 53
    .line 54
    iget-object v2, p0, Lb2/v;->t:Lb2/x;

    .line 55
    .line 56
    iget-object v2, v2, Lb2/x;->h:Lx9/d;

    .line 57
    .line 58
    :try_start_2
    const-string v2, "os.version"

    .line 59
    .line 60
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 64
    if-nez v2, :cond_0

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_0
    move-object v0, v2

    .line 68
    :catch_2
    :goto_2
    invoke-direct {v1, v0}, Lb2/C;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v1

    .line 72
    :pswitch_2
    new-instance v0, Lb2/B;

    .line 73
    .line 74
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 75
    .line 76
    iget-object v1, v1, Lb2/x;->j:Lcom/google/android/gms/internal/measurement/S;

    .line 77
    .line 78
    new-instance v2, Lc2/e;

    .line 79
    .line 80
    const/4 v3, 0x1

    .line 81
    invoke-direct {v2, v1, v3}, Lc2/e;-><init>(Lcom/google/android/gms/internal/measurement/S;I)V

    .line 82
    .line 83
    .line 84
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 85
    .line 86
    :try_start_3
    invoke-virtual {v2}, Lc2/e;->invoke()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 90
    :catch_3
    check-cast v1, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-direct {v0, v1}, Lb2/B;-><init>(Z)V

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    :pswitch_3
    new-instance v0, Lb2/f;

    .line 101
    .line 102
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 103
    .line 104
    iget-object v1, v1, Lb2/x;->d:LP0/d;

    .line 105
    .line 106
    new-instance v2, Lc2/a;

    .line 107
    .line 108
    const/4 v3, 0x4

    .line 109
    invoke-direct {v2, v1, v3}, Lc2/a;-><init>(Ljava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    sget-object v1, Li8/s;->s:Li8/s;

    .line 113
    .line 114
    :try_start_4
    invoke-virtual {v2}, Lc2/a;->invoke()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 118
    :catch_4
    check-cast v1, Ljava/util/List;

    .line 119
    .line 120
    const/4 v2, 0x1

    .line 121
    invoke-direct {v0, v1, v2}, Lb2/f;-><init>(Ljava/util/List;I)V

    .line 122
    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_4
    new-instance v0, Lb2/A;

    .line 126
    .line 127
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 128
    .line 129
    iget-object v1, v1, Lb2/x;->d:LP0/d;

    .line 130
    .line 131
    new-instance v2, Lc2/a;

    .line 132
    .line 133
    const/4 v3, 0x4

    .line 134
    invoke-direct {v2, v1, v3}, Lc2/a;-><init>(Ljava/lang/Object;I)V

    .line 135
    .line 136
    .line 137
    sget-object v1, Li8/s;->s:Li8/s;

    .line 138
    .line 139
    :try_start_5
    invoke-virtual {v2}, Lc2/a;->invoke()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 143
    :catch_5
    check-cast v1, Ljava/util/List;

    .line 144
    .line 145
    invoke-direct {v0, v1}, Lb2/A;-><init>(Ljava/util/List;)V

    .line 146
    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_5
    new-instance v0, Lb2/m;

    .line 150
    .line 151
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 152
    .line 153
    iget-object v1, v1, Lb2/x;->l:LE1/D;

    .line 154
    .line 155
    const-string v2, "http_proxy"

    .line 156
    .line 157
    invoke-virtual {v1, v2}, LE1/D;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    const/4 v2, 0x2

    .line 162
    invoke-direct {v0, v1, v2}, Lb2/m;-><init>(Ljava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_6
    new-instance v0, Lb2/z;

    .line 167
    .line 168
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 169
    .line 170
    iget-object v1, v1, Lb2/x;->g:LV/h;

    .line 171
    .line 172
    new-instance v2, Lc2/a;

    .line 173
    .line 174
    const/4 v3, 0x3

    .line 175
    invoke-direct {v2, v1, v3}, Lc2/a;-><init>(Ljava/lang/Object;I)V

    .line 176
    .line 177
    .line 178
    :try_start_6
    invoke-virtual {v2}, Lc2/a;->invoke()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 182
    goto :goto_3

    .line 183
    :catch_6
    const-string v1, ""

    .line 184
    .line 185
    :goto_3
    check-cast v1, Ljava/lang/String;

    .line 186
    .line 187
    invoke-direct {v0, v1}, Lb2/z;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    return-object v0

    .line 191
    :pswitch_7
    new-instance v0, Lb2/y;

    .line 192
    .line 193
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 194
    .line 195
    iget-object v1, v1, Lb2/x;->l:LE1/D;

    .line 196
    .line 197
    const-string v2, "font_scale"

    .line 198
    .line 199
    invoke-virtual {v1, v2}, LE1/D;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-direct {v0, v1}, Lb2/y;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_8
    new-instance v0, Lb2/m;

    .line 208
    .line 209
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 210
    .line 211
    iget-object v1, v1, Lb2/x;->h:Lx9/d;

    .line 212
    .line 213
    :try_start_7
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 214
    .line 215
    const-string v2, "FINGERPRINT"

    .line 216
    .line 217
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :catch_7
    const-string v1, ""

    .line 224
    .line 225
    :goto_4
    const/4 v2, 0x1

    .line 226
    invoke-direct {v0, v1, v2}, Lb2/m;-><init>(Ljava/lang/String;I)V

    .line 227
    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_9
    new-instance v0, Lb2/t;

    .line 231
    .line 232
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 233
    .line 234
    iget-object v1, v1, Lb2/x;->n:Lc2/f;

    .line 235
    .line 236
    new-instance v2, Lc2/a;

    .line 237
    .line 238
    const/4 v3, 0x2

    .line 239
    invoke-direct {v2, v1, v3}, Lc2/a;-><init>(Ljava/lang/Object;I)V

    .line 240
    .line 241
    .line 242
    sget-object v1, Lc2/g;->w:Lc2/g;

    .line 243
    .line 244
    :try_start_8
    invoke-virtual {v2}, Lc2/a;->invoke()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    .line 248
    :catch_8
    check-cast v1, Lc2/g;

    .line 249
    .line 250
    iget-object v1, v1, Lc2/g;->s:Ljava/lang/String;

    .line 251
    .line 252
    invoke-direct {v0, v1}, Lb2/t;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_a
    new-instance v0, Lb2/s;

    .line 257
    .line 258
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 259
    .line 260
    iget-object v1, v1, Lb2/x;->l:LE1/D;

    .line 261
    .line 262
    const-string v2, "end_button_behavior"

    .line 263
    .line 264
    invoke-virtual {v1, v2}, LE1/D;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-direct {v0, v1}, Lb2/s;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_b
    new-instance v0, Lb2/r;

    .line 273
    .line 274
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 275
    .line 276
    iget-object v1, v1, Lb2/x;->j:Lcom/google/android/gms/internal/measurement/S;

    .line 277
    .line 278
    new-instance v2, Lc2/e;

    .line 279
    .line 280
    const/4 v3, 0x0

    .line 281
    invoke-direct {v2, v1, v3}, Lc2/e;-><init>(Lcom/google/android/gms/internal/measurement/S;I)V

    .line 282
    .line 283
    .line 284
    :try_start_9
    invoke-virtual {v2}, Lc2/e;->invoke()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    .line 288
    goto :goto_5

    .line 289
    :catch_9
    const-string v1, ""

    .line 290
    .line 291
    :goto_5
    check-cast v1, Ljava/lang/String;

    .line 292
    .line 293
    invoke-direct {v0, v1}, Lb2/r;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    return-object v0

    .line 297
    :pswitch_c
    new-instance v0, Lb2/q;

    .line 298
    .line 299
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 300
    .line 301
    iget-object v1, v1, Lb2/x;->l:LE1/D;

    .line 302
    .line 303
    const-string v2, "development_settings_enabled"

    .line 304
    .line 305
    invoke-virtual {v1, v2}, LE1/D;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-direct {v0, v1}, Lb2/q;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_d
    new-instance v0, Lb2/p;

    .line 314
    .line 315
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 316
    .line 317
    iget-object v1, v1, Lb2/x;->m:LY1/c;

    .line 318
    .line 319
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    const-string v2, "getDefault().language"

    .line 328
    .line 329
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-direct {v0, v1}, Lb2/p;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    return-object v0

    .line 336
    :pswitch_e
    new-instance v0, Lb2/o;

    .line 337
    .line 338
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 339
    .line 340
    iget-object v1, v1, Lb2/x;->l:LE1/D;

    .line 341
    .line 342
    const-string v2, "default_input_method"

    .line 343
    .line 344
    invoke-virtual {v1, v2}, LE1/D;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-direct {v0, v1}, Lb2/o;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    return-object v0

    .line 352
    :pswitch_f
    new-instance v0, Lb2/n;

    .line 353
    .line 354
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 355
    .line 356
    iget-object v1, v1, Lb2/x;->l:LE1/D;

    .line 357
    .line 358
    const-string v2, "date_format"

    .line 359
    .line 360
    invoke-virtual {v1, v2}, LE1/D;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-direct {v0, v1}, Lb2/n;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    return-object v0

    .line 368
    :pswitch_10
    new-instance v0, Lb2/m;

    .line 369
    .line 370
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 371
    .line 372
    iget-object v1, v1, Lb2/x;->l:LE1/D;

    .line 373
    .line 374
    const-string v2, "data_roaming"

    .line 375
    .line 376
    invoke-virtual {v1, v2}, LE1/D;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    const/4 v2, 0x0

    .line 381
    invoke-direct {v0, v1, v2}, Lb2/m;-><init>(Ljava/lang/String;I)V

    .line 382
    .line 383
    .line 384
    return-object v0

    .line 385
    :pswitch_11
    new-instance v0, Lb2/l;

    .line 386
    .line 387
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 388
    .line 389
    iget-object v1, v1, Lb2/x;->a:Lv1/g;

    .line 390
    .line 391
    const/4 v1, 0x0

    .line 392
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    :try_start_a
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v1
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    .line 408
    :catch_a
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    invoke-direct {v0, v1}, Lb2/l;-><init>(I)V

    .line 413
    .line 414
    .line 415
    return-object v0

    .line 416
    :pswitch_12
    new-instance v0, Lb2/k;

    .line 417
    .line 418
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 419
    .line 420
    iget-object v1, v1, Lb2/x;->i:LV/h;

    .line 421
    .line 422
    sget-object v2, Li8/s;->s:Li8/s;

    .line 423
    .line 424
    new-instance v3, Lc2/a;

    .line 425
    .line 426
    const/4 v4, 0x1

    .line 427
    invoke-direct {v3, v1, v4}, Lc2/a;-><init>(Ljava/lang/Object;I)V

    .line 428
    .line 429
    .line 430
    :try_start_b
    invoke-virtual {v3}, Lc2/a;->invoke()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v2
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    .line 434
    :catch_b
    check-cast v2, Ljava/util/List;

    .line 435
    .line 436
    invoke-direct {v0, v2}, Lb2/k;-><init>(Ljava/util/List;)V

    .line 437
    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_13
    new-instance v0, Lb2/j;

    .line 441
    .line 442
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 443
    .line 444
    iget-object v1, v1, Lb2/x;->f:Lr3/e;

    .line 445
    .line 446
    new-instance v2, LZ1/a;

    .line 447
    .line 448
    const/4 v3, 0x1

    .line 449
    invoke-direct {v2, v1, v3}, LZ1/a;-><init>(Ljava/lang/Object;I)V

    .line 450
    .line 451
    .line 452
    sget-object v1, Li8/s;->s:Li8/s;

    .line 453
    .line 454
    :try_start_c
    invoke-virtual {v2}, LZ1/a;->invoke()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v1
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    .line 458
    :catch_c
    check-cast v1, Ljava/util/List;

    .line 459
    .line 460
    invoke-direct {v0, v1}, Lb2/j;-><init>(Ljava/util/List;)V

    .line 461
    .line 462
    .line 463
    return-object v0

    .line 464
    :pswitch_14
    new-instance v0, Lb2/i;

    .line 465
    .line 466
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 467
    .line 468
    iget-object v1, v1, Lb2/x;->e:LP0/d;

    .line 469
    .line 470
    new-instance v2, Landroid/content/IntentFilter;

    .line 471
    .line 472
    const-string v3, "android.intent.action.BATTERY_CHANGED"

    .line 473
    .line 474
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    iget-object v1, v1, LP0/d;->t:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v1, Lcom/kcstream/cing/MainApp;

    .line 480
    .line 481
    const/4 v3, 0x0

    .line 482
    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    const-string v2, ""

    .line 487
    .line 488
    if-nez v1, :cond_1

    .line 489
    .line 490
    goto :goto_6

    .line 491
    :cond_1
    const-string v3, "health"

    .line 492
    .line 493
    const/4 v4, -0x1

    .line 494
    invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    if-eq v1, v4, :cond_2

    .line 499
    .line 500
    packed-switch v1, :pswitch_data_1

    .line 501
    .line 502
    .line 503
    const-string v2, "unknown"

    .line 504
    .line 505
    goto :goto_6

    .line 506
    :pswitch_15
    const-string v2, "cold"

    .line 507
    .line 508
    goto :goto_6

    .line 509
    :pswitch_16
    const-string v2, "unspecified failure"

    .line 510
    .line 511
    goto :goto_6

    .line 512
    :pswitch_17
    const-string v2, "over voltage"

    .line 513
    .line 514
    goto :goto_6

    .line 515
    :pswitch_18
    const-string v2, "dead"

    .line 516
    .line 517
    goto :goto_6

    .line 518
    :pswitch_19
    const-string v2, "overheat"

    .line 519
    .line 520
    goto :goto_6

    .line 521
    :pswitch_1a
    const-string v2, "good"

    .line 522
    .line 523
    :cond_2
    :goto_6
    invoke-direct {v0, v2}, Lb2/i;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    return-object v0

    .line 527
    :pswitch_1b
    new-instance v0, Lb2/h;

    .line 528
    .line 529
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 530
    .line 531
    iget-object v1, v1, Lb2/x;->e:LP0/d;

    .line 532
    .line 533
    new-instance v2, Lc2/a;

    .line 534
    .line 535
    const/4 v3, 0x0

    .line 536
    invoke-direct {v2, v1, v3}, Lc2/a;-><init>(Ljava/lang/Object;I)V

    .line 537
    .line 538
    .line 539
    :try_start_d
    invoke-virtual {v2}, Lc2/a;->invoke()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    .line 543
    goto :goto_7

    .line 544
    :catch_d
    const-string v1, ""

    .line 545
    .line 546
    :goto_7
    check-cast v1, Ljava/lang/String;

    .line 547
    .line 548
    invoke-direct {v0, v1}, Lb2/h;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    return-object v0

    .line 552
    :pswitch_1c
    new-instance v0, Lb2/g;

    .line 553
    .line 554
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 555
    .line 556
    iget-object v1, v1, Lb2/x;->m:LY1/c;

    .line 557
    .line 558
    new-instance v2, Lc2/d;

    .line 559
    .line 560
    const/4 v3, 0x0

    .line 561
    invoke-direct {v2, v1, v3}, Lc2/d;-><init>(LY1/c;I)V

    .line 562
    .line 563
    .line 564
    const/4 v1, 0x0

    .line 565
    new-array v1, v1, [Ljava/lang/String;

    .line 566
    .line 567
    :try_start_e
    invoke-virtual {v2}, Lc2/d;->invoke()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v1
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    .line 571
    :catch_e
    check-cast v1, [Ljava/lang/String;

    .line 572
    .line 573
    invoke-static {v1}, Li8/i;->H([Ljava/lang/Object;)Ljava/util/List;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    invoke-direct {v0, v1}, Lb2/g;-><init>(Ljava/util/List;)V

    .line 578
    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_1d
    new-instance v0, Lb2/f;

    .line 582
    .line 583
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 584
    .line 585
    iget-object v1, v1, Lb2/x;->k:LV/h;

    .line 586
    .line 587
    new-instance v2, Lc2/l;

    .line 588
    .line 589
    const/4 v3, 0x0

    .line 590
    invoke-direct {v2, v1, v3}, Lc2/l;-><init>(LV/h;I)V

    .line 591
    .line 592
    .line 593
    sget-object v1, Li8/s;->s:Li8/s;

    .line 594
    .line 595
    :try_start_f
    invoke-virtual {v2}, Lc2/l;->invoke()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v1
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_f

    .line 599
    :catch_f
    check-cast v1, Ljava/util/List;

    .line 600
    .line 601
    const/4 v2, 0x0

    .line 602
    invoke-direct {v0, v1, v2}, Lb2/f;-><init>(Ljava/util/List;I)V

    .line 603
    .line 604
    .line 605
    return-object v0

    .line 606
    :pswitch_1e
    new-instance v0, Lb2/e;

    .line 607
    .line 608
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 609
    .line 610
    iget-object v1, v1, Lb2/x;->h:Lx9/d;

    .line 611
    .line 612
    :try_start_10
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 613
    .line 614
    const-string v2, "RELEASE"

    .line 615
    .line 616
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_10

    .line 620
    .line 621
    goto :goto_8

    .line 622
    :catch_10
    const-string v1, ""

    .line 623
    .line 624
    :goto_8
    invoke-direct {v0, v1}, Lb2/e;-><init>(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    return-object v0

    .line 628
    :pswitch_1f
    new-instance v0, Lb2/d;

    .line 629
    .line 630
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 631
    .line 632
    iget-object v1, v1, Lb2/x;->l:LE1/D;

    .line 633
    .line 634
    const-string v2, "alarm_alert"

    .line 635
    .line 636
    invoke-virtual {v1, v2}, LE1/D;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    invoke-direct {v0, v1}, Lb2/d;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    return-object v0

    .line 644
    :pswitch_20
    new-instance v0, Lb2/c;

    .line 645
    .line 646
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 647
    .line 648
    iget-object v1, v1, Lb2/x;->l:LE1/D;

    .line 649
    .line 650
    const-string v2, "adb_enabled"

    .line 651
    .line 652
    invoke-virtual {v1, v2}, LE1/D;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    invoke-direct {v0, v1}, Lb2/c;-><init>(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    return-object v0

    .line 660
    :pswitch_21
    new-instance v0, Lb2/b;

    .line 661
    .line 662
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 663
    .line 664
    iget-object v1, v1, Lb2/x;->l:LE1/D;

    .line 665
    .line 666
    const-string v2, "accessibility_enabled"

    .line 667
    .line 668
    invoke-virtual {v1, v2}, LE1/D;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    invoke-direct {v0, v1}, Lb2/b;-><init>(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    return-object v0

    .line 676
    :pswitch_22
    new-instance v0, Lb2/a;

    .line 677
    .line 678
    iget-object v1, p0, Lb2/v;->t:Lb2/x;

    .line 679
    .line 680
    iget-object v1, v1, Lb2/x;->a:Lv1/g;

    .line 681
    .line 682
    :try_start_11
    sget-object v1, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 683
    .line 684
    const/4 v2, 0x0

    .line 685
    aget-object v1, v1, v2

    .line 686
    .line 687
    const-string v2, "Build.SUPPORTED_ABIS[0]"

    .line 688
    .line 689
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_11

    .line 690
    .line 691
    .line 692
    goto :goto_9

    .line 693
    :catch_11
    const-string v1, ""

    .line 694
    .line 695
    :goto_9
    invoke-direct {v0, v1}, Lb2/a;-><init>(Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    return-object v0

    .line 699
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
    .end packed-switch
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
