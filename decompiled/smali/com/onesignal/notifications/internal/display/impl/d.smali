.class public final Lcom/onesignal/notifications/internal/display/impl/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW5/c;


# instance fields
.field private final _applicationService:LX4/f;

.field private final _dataController:LV5/d;

.field private final _notificationDisplayBuilder:LW5/a;


# direct methods
.method public constructor <init>(LX4/f;LV5/d;LW5/a;)V
    .locals 1

    .line 1
    const-string v0, "_applicationService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "_dataController"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "_notificationDisplayBuilder"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/onesignal/notifications/internal/display/impl/d;->_applicationService:LX4/f;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/onesignal/notifications/internal/display/impl/d;->_dataController:LV5/d;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 24
    .line 25
    return-void
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method

.method private final createBaseSummaryIntent(ILcom/onesignal/notifications/internal/display/impl/a;Lorg/json/JSONObject;Ljava/lang/String;)Landroid/content/Intent;
    .locals 0

    .line 1
    invoke-virtual {p2, p1}, Lcom/onesignal/notifications/internal/display/impl/a;->getNewBaseIntent(I)Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "onesignalData"

    .line 6
    .line 7
    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p2, "summary"

    .line 16
    .line 17
    invoke-virtual {p1, p2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "intentGenerator.getNewBa\u2026utExtra(\"summary\", group)"

    .line 22
    .line 23
    invoke-static {p1, p2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p1
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
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
.end method

.method private final getCurrentContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/onesignal/notifications/internal/display/impl/d;->_applicationService:LX4/f;

    .line 2
    .line 3
    invoke-interface {v0}, LX4/f;->getAppContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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


# virtual methods
.method public createGenericPendingIntentsForGroup(LI/s;Lcom/onesignal/notifications/internal/display/impl/a;Lorg/json/JSONObject;Ljava/lang/String;I)V
    .locals 4

    .line 1
    const-string v0, "intentGenerator"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "gcmBundle"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "group"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/security/SecureRandom;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p2, p5}, Lcom/onesignal/notifications/internal/display/impl/a;->getNewBaseIntent(I)Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "onesignalData"

    .line 30
    .line 31
    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-virtual {v2, v3, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    const-string v2, "grp"

    .line 40
    .line 41
    invoke-virtual {p3, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    const-string v3, "intentGenerator.getNewBa\u2026)).putExtra(\"grp\", group)"

    .line 46
    .line 47
    invoke-static {p3, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v1, p3}, Lcom/onesignal/notifications/internal/display/impl/a;->getNewActionPendingIntent(ILandroid/content/Intent;)Landroid/app/PendingIntent;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object p2, p1, LI/s;->g:Landroid/app/PendingIntent;

    .line 58
    .line 59
    iget-object p2, p0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    iget-object v0, p0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 66
    .line 67
    invoke-interface {v0, p5}, LW5/a;->getNewBaseDismissIntent(I)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    move-result-object p5

    .line 71
    invoke-virtual {p5, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    move-result-object p5

    .line 75
    const-string v0, "_notificationDisplayBuil\u2026d).putExtra(\"grp\", group)"

    .line 76
    .line 77
    invoke-static {p5, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p2, p3, p5}, LW5/a;->getNewDismissActionPendingIntent(ILandroid/content/Intent;)Landroid/app/PendingIntent;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    iget-object p3, p1, LI/s;->z:Landroid/app/Notification;

    .line 85
    .line 86
    iput-object p2, p3, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 87
    .line 88
    iput-object p4, p1, LI/s;->p:Ljava/lang/String;

    .line 89
    .line 90
    :try_start_0
    iget-object p2, p0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 91
    .line 92
    invoke-interface {p2}, LW5/a;->getGroupAlertBehavior()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    iput p2, p1, LI/s;->x:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    :catchall_0
    return-void
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
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
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
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
.end method

.method public createGrouplessSummaryNotification(LU5/d;Lcom/onesignal/notifications/internal/display/impl/a;IILm8/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU5/d;",
            "Lcom/onesignal/notifications/internal/display/impl/a;",
            "II",
            "Lm8/d<",
            "-",
            "Lh8/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p5, Lcom/onesignal/notifications/internal/display/impl/d$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lcom/onesignal/notifications/internal/display/impl/d$a;

    .line 7
    .line 8
    iget v1, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/onesignal/notifications/internal/display/impl/d$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lcom/onesignal/notifications/internal/display/impl/d$a;-><init>(Lcom/onesignal/notifications/internal/display/impl/d;Lm8/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Ln8/a;->s:Ln8/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget p1, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->I$2:I

    .line 37
    .line 38
    iget p4, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->I$1:I

    .line 39
    .line 40
    iget p3, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->I$0:I

    .line 41
    .line 42
    iget-object p2, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$6:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$5:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Ljava/lang/String;

    .line 49
    .line 50
    iget-object v2, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$4:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/security/SecureRandom;

    .line 53
    .line 54
    iget-object v4, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$3:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Lorg/json/JSONObject;

    .line 57
    .line 58
    iget-object v5, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$2:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v5, Lcom/onesignal/notifications/internal/display/impl/a;

    .line 61
    .line 62
    iget-object v6, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$1:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v6, LU5/d;

    .line 65
    .line 66
    iget-object v0, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lcom/onesignal/notifications/internal/display/impl/d;

    .line 69
    .line 70
    invoke-static {p5}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object p5, p2

    .line 74
    move-object p2, v5

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_2
    invoke-static {p5}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, LU5/d;->getJsonPayload()Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    new-instance v2, Ljava/security/SecureRandom;

    .line 95
    .line 96
    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    .line 97
    .line 98
    .line 99
    new-instance p5, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v5, " new messages"

    .line 108
    .line 109
    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p5

    .line 116
    iget-object v5, p0, Lcom/onesignal/notifications/internal/display/impl/d;->_dataController:LV5/d;

    .line 117
    .line 118
    iput-object p0, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p1, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$1:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object p2, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$2:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v4, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$3:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v2, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$4:Ljava/lang/Object;

    .line 127
    .line 128
    const-string v6, "os_group_undefined"

    .line 129
    .line 130
    iput-object v6, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$5:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object p5, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->L$6:Ljava/lang/Object;

    .line 133
    .line 134
    iput p3, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->I$0:I

    .line 135
    .line 136
    iput p4, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->I$1:I

    .line 137
    .line 138
    const v7, -0x2ad2e222

    .line 139
    .line 140
    .line 141
    iput v7, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->I$2:I

    .line 142
    .line 143
    iput v3, v0, Lcom/onesignal/notifications/internal/display/impl/d$a;->label:I

    .line 144
    .line 145
    invoke-interface {v5, v7, v6, v0}, LV5/d;->createSummaryNotification(ILjava/lang/String;Lm8/d;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-ne v0, v1, :cond_3

    .line 150
    .line 151
    return-object v1

    .line 152
    :cond_3
    move-object v0, p0

    .line 153
    move-object v1, v6

    .line 154
    move-object v6, p1

    .line 155
    move p1, v7

    .line 156
    :goto_1
    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    invoke-direct {v0, p1, p2, v4, v1}, Lcom/onesignal/notifications/internal/display/impl/d;->createBaseSummaryIntent(ILcom/onesignal/notifications/internal/display/impl/a;Lorg/json/JSONObject;Ljava/lang/String;)Landroid/content/Intent;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-virtual {p2, v5, v4}, Lcom/onesignal/notifications/internal/display/impl/a;->getNewActionPendingIntent(ILandroid/content/Intent;)Landroid/app/PendingIntent;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    iget-object v4, v0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    iget-object v5, v0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 175
    .line 176
    const/4 v7, 0x0

    .line 177
    invoke-interface {v5, v7}, LW5/a;->getNewBaseDismissIntent(I)Landroid/content/Intent;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    const-string v8, "summary"

    .line 182
    .line 183
    invoke-virtual {v5, v8, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    const-string v8, "_notificationDisplayBuil\u2026utExtra(\"summary\", group)"

    .line 188
    .line 189
    invoke-static {v5, v8}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v4, v2, v5}, LW5/a;->getNewDismissActionPendingIntent(ILandroid/content/Intent;)Landroid/app/PendingIntent;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    iget-object v4, v0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 197
    .line 198
    invoke-interface {v4, v6}, LW5/a;->getBaseOneSignalNotificationBuilder(LU5/d;)Lcom/onesignal/notifications/internal/display/impl/b$a;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v4}, Lcom/onesignal/notifications/internal/display/impl/b$a;->getCompatBuilder()LI/s;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v6}, LU5/d;->getOverriddenSound()Landroid/net/Uri;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    if-eqz v5, :cond_4

    .line 211
    .line 212
    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v6}, LU5/d;->getOverriddenSound()Landroid/net/Uri;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v4, v5}, LI/s;->h(Landroid/net/Uri;)V

    .line 220
    .line 221
    .line 222
    :cond_4
    invoke-virtual {v6}, LU5/d;->getOverriddenFlags()Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    if-eqz v5, :cond_5

    .line 227
    .line 228
    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6}, LU5/d;->getOverriddenFlags()Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    invoke-static {v5}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    invoke-virtual {v4, v5}, LI/s;->d(I)V

    .line 243
    .line 244
    .line 245
    :cond_5
    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    iput-object p2, v4, LI/s;->g:Landroid/app/PendingIntent;

    .line 249
    .line 250
    iget-object p2, v4, LI/s;->z:Landroid/app/Notification;

    .line 251
    .line 252
    iput-object v2, p2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 253
    .line 254
    invoke-direct {v0}, Lcom/onesignal/notifications/internal/display/impl/d;->getCurrentContext()Landroid/content/Context;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-static {p2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    invoke-direct {v0}, Lcom/onesignal/notifications/internal/display/impl/d;->getCurrentContext()Landroid/content/Context;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-static {v2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-virtual {p2, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-static {p2}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    iput-object p2, v4, LI/s;->e:Ljava/lang/CharSequence;

    .line 285
    .line 286
    invoke-static {p5}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 287
    .line 288
    .line 289
    move-result-object p2

    .line 290
    iput-object p2, v4, LI/s;->f:Ljava/lang/CharSequence;

    .line 291
    .line 292
    iput p3, v4, LI/s;->i:I

    .line 293
    .line 294
    iget-object p2, v0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 295
    .line 296
    invoke-interface {p2}, LW5/a;->getDefaultSmallIconId()I

    .line 297
    .line 298
    .line 299
    move-result p2

    .line 300
    iget-object p3, v4, LI/s;->z:Landroid/app/Notification;

    .line 301
    .line 302
    iput p2, p3, Landroid/app/Notification;->icon:I

    .line 303
    .line 304
    iget-object p2, v0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 305
    .line 306
    invoke-interface {p2}, LW5/a;->getDefaultLargeIcon()Landroid/graphics/Bitmap;

    .line 307
    .line 308
    .line 309
    move-result-object p2

    .line 310
    invoke-virtual {v4, p2}, LI/s;->f(Landroid/graphics/Bitmap;)V

    .line 311
    .line 312
    .line 313
    const/16 p2, 0x8

    .line 314
    .line 315
    invoke-virtual {v4, p2, v3}, LI/s;->e(IZ)V

    .line 316
    .line 317
    .line 318
    const/16 p2, 0x10

    .line 319
    .line 320
    invoke-virtual {v4, p2, v7}, LI/s;->e(IZ)V

    .line 321
    .line 322
    .line 323
    iput-object v1, v4, LI/s;->p:Ljava/lang/String;

    .line 324
    .line 325
    iput-boolean v3, v4, LI/s;->q:Z

    .line 326
    .line 327
    :try_start_0
    iput p4, v4, LI/s;->x:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 328
    .line 329
    :catchall_0
    new-instance p2, LI/q;

    .line 330
    .line 331
    const/4 p3, 0x1

    .line 332
    invoke-direct {p2, p3}, LI/q;-><init>(I)V

    .line 333
    .line 334
    .line 335
    invoke-static {p5}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 336
    .line 337
    .line 338
    move-result-object p3

    .line 339
    iput-object p3, p2, LI/u;->b:Ljava/lang/CharSequence;

    .line 340
    .line 341
    invoke-virtual {v4, p2}, LI/s;->i(LI/u;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4}, LI/s;->b()Landroid/app/Notification;

    .line 345
    .line 346
    .line 347
    move-result-object p2

    .line 348
    const-string p3, "summaryBuilder.build()"

    .line 349
    .line 350
    invoke-static {p2, p3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-direct {v0}, Lcom/onesignal/notifications/internal/display/impl/d;->getCurrentContext()Landroid/content/Context;

    .line 354
    .line 355
    .line 356
    move-result-object p3

    .line 357
    invoke-static {p3}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    new-instance p4, LI/J;

    .line 361
    .line 362
    invoke-direct {p4, p3}, LI/J;-><init>(Landroid/content/Context;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {p4, p1, p2}, LI/J;->b(ILandroid/app/Notification;)V

    .line 366
    .line 367
    .line 368
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 369
    .line 370
    return-object p1
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
.end method

.method public createSingleNotificationBeforeSummaryBuilder(LU5/d;LI/s;)Landroid/app/Notification;
    .locals 3

    .line 1
    const-string v0, "notificationJob"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x18

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, LU5/d;->isRestoring()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, LU5/d;->getOverriddenSound()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, LU5/d;->getOverriddenSound()Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, LU5/d;->getOrgSound()Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v1, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    invoke-static {p2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {p2, v1}, LI/s;->h(Landroid/net/Uri;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-static {p2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, LI/s;->b()Landroid/app/Notification;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const-string v2, "notifBuilder!!.build()"

    .line 61
    .line 62
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1}, LU5/d;->getOverriddenSound()Landroid/net/Uri;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p2, p1}, LI/s;->h(Landroid/net/Uri;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-object v1
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
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
.end method

.method public createSummaryNotification(LU5/d;Lcom/onesignal/notifications/internal/display/impl/b$a;ILm8/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU5/d;",
            "Lcom/onesignal/notifications/internal/display/impl/b$a;",
            "I",
            "Lm8/d<",
            "-",
            "Lh8/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, Lcom/onesignal/notifications/internal/display/impl/d$b;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/onesignal/notifications/internal/display/impl/d$b;

    .line 11
    .line 12
    iget v3, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/onesignal/notifications/internal/display/impl/d$b;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/onesignal/notifications/internal/display/impl/d$b;-><init>(Lcom/onesignal/notifications/internal/display/impl/d;Lm8/d;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Ln8/a;->s:Ln8/a;

    .line 32
    .line 33
    iget v4, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->label:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x2

    .line 38
    const-string v8, "group"

    .line 39
    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    if-eq v4, v5, :cond_3

    .line 43
    .line 44
    if-eq v4, v7, :cond_2

    .line 45
    .line 46
    if-ne v4, v6, :cond_1

    .line 47
    .line 48
    iget-boolean v3, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->Z$0:Z

    .line 49
    .line 50
    iget v4, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->I$0:I

    .line 51
    .line 52
    iget-object v6, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$8:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Ljava/lang/Integer;

    .line 55
    .line 56
    iget-object v7, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$7:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, Landroid/app/PendingIntent;

    .line 59
    .line 60
    iget-object v11, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$6:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v11, Ljava/security/SecureRandom;

    .line 63
    .line 64
    iget-object v12, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$5:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v12, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v13, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$4:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v13, Lcom/onesignal/notifications/internal/display/impl/a;

    .line 71
    .line 72
    iget-object v14, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$3:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v14, Lorg/json/JSONObject;

    .line 75
    .line 76
    iget-object v15, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$2:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v15, Lcom/onesignal/notifications/internal/display/impl/b$a;

    .line 79
    .line 80
    iget-object v5, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, LU5/d;

    .line 83
    .line 84
    iget-object v2, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Lcom/onesignal/notifications/internal/display/impl/d;

    .line 87
    .line 88
    invoke-static {v1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_5

    .line 92
    .line 93
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 96
    .line 97
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v1

    .line 101
    :cond_2
    iget-boolean v4, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->Z$0:Z

    .line 102
    .line 103
    iget v5, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->I$0:I

    .line 104
    .line 105
    iget-object v7, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$8:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v7, Ljava/lang/Integer;

    .line 108
    .line 109
    iget-object v11, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$7:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v11, Landroid/app/PendingIntent;

    .line 112
    .line 113
    iget-object v12, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$6:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v12, Ljava/security/SecureRandom;

    .line 116
    .line 117
    iget-object v13, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$5:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v13, Ljava/lang/String;

    .line 120
    .line 121
    iget-object v14, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$4:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v14, Lcom/onesignal/notifications/internal/display/impl/a;

    .line 124
    .line 125
    iget-object v15, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$3:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v15, Lorg/json/JSONObject;

    .line 128
    .line 129
    iget-object v6, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$2:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v6, Lcom/onesignal/notifications/internal/display/impl/b$a;

    .line 132
    .line 133
    iget-object v9, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$1:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v9, LU5/d;

    .line 136
    .line 137
    iget-object v10, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$0:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v10, Lcom/onesignal/notifications/internal/display/impl/d;

    .line 140
    .line 141
    invoke-static {v1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_2

    .line 145
    .line 146
    :cond_3
    iget-boolean v4, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->Z$0:Z

    .line 147
    .line 148
    iget v5, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->I$0:I

    .line 149
    .line 150
    iget-object v6, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$7:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v6, Landroid/app/PendingIntent;

    .line 153
    .line 154
    iget-object v9, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$6:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v9, Ljava/security/SecureRandom;

    .line 157
    .line 158
    iget-object v10, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$5:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v10, Ljava/lang/String;

    .line 161
    .line 162
    iget-object v11, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$4:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v11, Lcom/onesignal/notifications/internal/display/impl/a;

    .line 165
    .line 166
    iget-object v12, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$3:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v12, Lorg/json/JSONObject;

    .line 169
    .line 170
    iget-object v13, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$2:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v13, Lcom/onesignal/notifications/internal/display/impl/b$a;

    .line 173
    .line 174
    iget-object v14, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$1:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v14, LU5/d;

    .line 177
    .line 178
    iget-object v15, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$0:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v15, Lcom/onesignal/notifications/internal/display/impl/d;

    .line 181
    .line 182
    invoke-static {v1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    move-object/from16 v23, v15

    .line 186
    .line 187
    move v15, v5

    .line 188
    move-object v5, v11

    .line 189
    move-object v11, v6

    .line 190
    move-object v6, v10

    .line 191
    move-object/from16 v10, v23

    .line 192
    .line 193
    move-object/from16 v23, v12

    .line 194
    .line 195
    move-object v12, v9

    .line 196
    move-object/from16 v9, v23

    .line 197
    .line 198
    move-object/from16 v23, v14

    .line 199
    .line 200
    move-object v14, v13

    .line 201
    move-object/from16 v13, v23

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :cond_4
    invoke-static {v1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {p1 .. p1}, LU5/d;->isRestoring()Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    invoke-virtual/range {p1 .. p1}, LU5/d;->getJsonPayload()Lorg/json/JSONObject;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    new-instance v5, Lcom/onesignal/notifications/internal/display/impl/a;

    .line 220
    .line 221
    invoke-direct {v0}, Lcom/onesignal/notifications/internal/display/impl/d;->getCurrentContext()Landroid/content/Context;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-static {v6}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-direct {v5, v6}, Lcom/onesignal/notifications/internal/display/impl/a;-><init>(Landroid/content/Context;)V

    .line 229
    .line 230
    .line 231
    const-string v6, "grp"

    .line 232
    .line 233
    const/4 v9, 0x0

    .line 234
    invoke-virtual {v4, v6, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    new-instance v10, Ljava/security/SecureRandom;

    .line 239
    .line 240
    invoke-direct {v10}, Ljava/security/SecureRandom;-><init>()V

    .line 241
    .line 242
    .line 243
    iget-object v11, v0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 244
    .line 245
    invoke-virtual {v10}, Ljava/util/Random;->nextInt()I

    .line 246
    .line 247
    .line 248
    move-result v12

    .line 249
    iget-object v13, v0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    invoke-interface {v13, v14}, LW5/a;->getNewBaseDismissIntent(I)Landroid/content/Intent;

    .line 253
    .line 254
    .line 255
    move-result-object v13

    .line 256
    const-string v14, "summary"

    .line 257
    .line 258
    invoke-virtual {v13, v14, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    const-string v14, "_notificationDisplayBuil\u2026utExtra(\"summary\", group)"

    .line 263
    .line 264
    invoke-static {v13, v14}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-interface {v11, v12, v13}, LW5/a;->getNewDismissActionPendingIntent(ILandroid/content/Intent;)Landroid/app/PendingIntent;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    iget-object v12, v0, Lcom/onesignal/notifications/internal/display/impl/d;->_dataController:LV5/d;

    .line 272
    .line 273
    invoke-static {v6, v8}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    iput-object v0, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$0:Ljava/lang/Object;

    .line 277
    .line 278
    move-object/from16 v13, p1

    .line 279
    .line 280
    iput-object v13, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$1:Ljava/lang/Object;

    .line 281
    .line 282
    move-object/from16 v14, p2

    .line 283
    .line 284
    iput-object v14, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$2:Ljava/lang/Object;

    .line 285
    .line 286
    iput-object v4, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$3:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v5, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$4:Ljava/lang/Object;

    .line 289
    .line 290
    iput-object v6, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$5:Ljava/lang/Object;

    .line 291
    .line 292
    iput-object v10, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$6:Ljava/lang/Object;

    .line 293
    .line 294
    iput-object v11, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$7:Ljava/lang/Object;

    .line 295
    .line 296
    move/from16 v15, p3

    .line 297
    .line 298
    iput v15, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->I$0:I

    .line 299
    .line 300
    iput-boolean v1, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->Z$0:Z

    .line 301
    .line 302
    const/4 v9, 0x1

    .line 303
    iput v9, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->label:I

    .line 304
    .line 305
    invoke-interface {v12, v6, v9, v2}, LV5/d;->getAndroidIdForGroup(Ljava/lang/String;ZLm8/d;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v12

    .line 309
    if-ne v12, v3, :cond_5

    .line 310
    .line 311
    goto/16 :goto_4

    .line 312
    .line 313
    :cond_5
    move-object v9, v4

    .line 314
    move v4, v1

    .line 315
    move-object v1, v12

    .line 316
    move-object v12, v10

    .line 317
    move-object v10, v0

    .line 318
    :goto_1
    check-cast v1, Ljava/lang/Integer;

    .line 319
    .line 320
    if-nez v1, :cond_7

    .line 321
    .line 322
    invoke-virtual {v12}, Ljava/util/Random;->nextInt()I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    new-instance v7, Ljava/lang/Integer;

    .line 327
    .line 328
    invoke-direct {v7, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 329
    .line 330
    .line 331
    iget-object v1, v10, Lcom/onesignal/notifications/internal/display/impl/d;->_dataController:LV5/d;

    .line 332
    .line 333
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    invoke-static {v6, v8}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    iput-object v10, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$0:Ljava/lang/Object;

    .line 341
    .line 342
    iput-object v13, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$1:Ljava/lang/Object;

    .line 343
    .line 344
    iput-object v14, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$2:Ljava/lang/Object;

    .line 345
    .line 346
    iput-object v9, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$3:Ljava/lang/Object;

    .line 347
    .line 348
    iput-object v5, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$4:Ljava/lang/Object;

    .line 349
    .line 350
    iput-object v6, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$5:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v12, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$6:Ljava/lang/Object;

    .line 353
    .line 354
    iput-object v11, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$7:Ljava/lang/Object;

    .line 355
    .line 356
    iput-object v7, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$8:Ljava/lang/Object;

    .line 357
    .line 358
    iput v15, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->I$0:I

    .line 359
    .line 360
    iput-boolean v4, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->Z$0:Z

    .line 361
    .line 362
    move/from16 p1, v4

    .line 363
    .line 364
    const/4 v4, 0x2

    .line 365
    iput v4, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->label:I

    .line 366
    .line 367
    invoke-interface {v1, v0, v6, v2}, LV5/d;->createSummaryNotification(ILjava/lang/String;Lm8/d;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    if-ne v0, v3, :cond_6

    .line 372
    .line 373
    goto :goto_4

    .line 374
    :cond_6
    move-object v4, v14

    .line 375
    move-object v14, v5

    .line 376
    move v5, v15

    .line 377
    move-object v15, v9

    .line 378
    move-object v9, v13

    .line 379
    move-object v13, v6

    .line 380
    move-object v6, v4

    .line 381
    move/from16 v4, p1

    .line 382
    .line 383
    :goto_2
    move-object v0, v6

    .line 384
    move-object v6, v7

    .line 385
    move-object v7, v11

    .line 386
    move-object v11, v12

    .line 387
    move-object v12, v13

    .line 388
    move-object v13, v14

    .line 389
    move-object v14, v15

    .line 390
    move v15, v5

    .line 391
    move-object v5, v9

    .line 392
    goto :goto_3

    .line 393
    :cond_7
    move/from16 p1, v4

    .line 394
    .line 395
    move-object v0, v13

    .line 396
    move-object v13, v5

    .line 397
    move-object v5, v0

    .line 398
    move-object v7, v11

    .line 399
    move-object v11, v12

    .line 400
    move-object v0, v14

    .line 401
    move-object v12, v6

    .line 402
    move-object v14, v9

    .line 403
    move-object v6, v1

    .line 404
    :goto_3
    iget-object v1, v10, Lcom/onesignal/notifications/internal/display/impl/d;->_dataController:LV5/d;

    .line 405
    .line 406
    invoke-static {v12, v8}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    iput-object v10, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$0:Ljava/lang/Object;

    .line 410
    .line 411
    iput-object v5, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$1:Ljava/lang/Object;

    .line 412
    .line 413
    iput-object v0, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$2:Ljava/lang/Object;

    .line 414
    .line 415
    iput-object v14, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$3:Ljava/lang/Object;

    .line 416
    .line 417
    iput-object v13, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$4:Ljava/lang/Object;

    .line 418
    .line 419
    iput-object v12, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$5:Ljava/lang/Object;

    .line 420
    .line 421
    iput-object v11, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$6:Ljava/lang/Object;

    .line 422
    .line 423
    iput-object v7, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$7:Ljava/lang/Object;

    .line 424
    .line 425
    iput-object v6, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->L$8:Ljava/lang/Object;

    .line 426
    .line 427
    iput v15, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->I$0:I

    .line 428
    .line 429
    iput-boolean v4, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->Z$0:Z

    .line 430
    .line 431
    const/4 v9, 0x3

    .line 432
    iput v9, v2, Lcom/onesignal/notifications/internal/display/impl/d$b;->label:I

    .line 433
    .line 434
    invoke-interface {v1, v12, v2}, LV5/d;->listNotificationsForGroup(Ljava/lang/String;Lm8/d;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    if-ne v1, v3, :cond_8

    .line 439
    .line 440
    :goto_4
    return-object v3

    .line 441
    :cond_8
    move v3, v4

    .line 442
    move-object v2, v10

    .line 443
    move v4, v15

    .line 444
    move-object v15, v0

    .line 445
    :goto_5
    check-cast v1, Ljava/util/List;

    .line 446
    .line 447
    new-instance v0, Ljava/util/ArrayList;

    .line 448
    .line 449
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 450
    .line 451
    .line 452
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    const/4 v9, 0x0

    .line 457
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v10

    .line 461
    move-object/from16 p1, v1

    .line 462
    .line 463
    const-string v1, " "

    .line 464
    .line 465
    move-object/from16 p2, v6

    .line 466
    .line 467
    const-string v6, ""

    .line 468
    .line 469
    if-eqz v10, :cond_e

    .line 470
    .line 471
    invoke-interface/range {p1 .. p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v10

    .line 475
    check-cast v10, LV5/c;

    .line 476
    .line 477
    move-object/from16 p3, v9

    .line 478
    .line 479
    if-nez v3, :cond_9

    .line 480
    .line 481
    invoke-virtual {v10}, LV5/c;->getAndroidId()I

    .line 482
    .line 483
    .line 484
    move-result v9

    .line 485
    move-object/from16 v16, v10

    .line 486
    .line 487
    invoke-virtual {v5}, LU5/d;->getAndroidId()I

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    if-ne v9, v10, :cond_a

    .line 492
    .line 493
    goto :goto_8

    .line 494
    :cond_9
    move-object/from16 v16, v10

    .line 495
    .line 496
    :cond_a
    invoke-virtual/range {v16 .. v16}, LV5/c;->getTitle()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    if-nez v9, :cond_b

    .line 501
    .line 502
    goto :goto_7

    .line 503
    :cond_b
    invoke-virtual {v9, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v6

    .line 507
    :goto_7
    new-instance v1, Landroid/text/SpannableString;

    .line 508
    .line 509
    invoke-static {v6}, Lz/e;->c(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    move-result-object v9

    .line 513
    invoke-virtual/range {v16 .. v16}, LV5/c;->getMessage()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v10

    .line 517
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v9

    .line 524
    invoke-direct {v1, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 528
    .line 529
    .line 530
    move-result v9

    .line 531
    if-lez v9, :cond_c

    .line 532
    .line 533
    new-instance v9, Landroid/text/style/StyleSpan;

    .line 534
    .line 535
    const/4 v10, 0x1

    .line 536
    invoke-direct {v9, v10}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 540
    .line 541
    .line 542
    move-result v6

    .line 543
    const/4 v10, 0x0

    .line 544
    invoke-virtual {v1, v9, v10, v6, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 545
    .line 546
    .line 547
    :cond_c
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    if-nez p3, :cond_d

    .line 551
    .line 552
    invoke-virtual/range {v16 .. v16}, LV5/c;->getFullData()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v9

    .line 556
    move-object/from16 v1, p1

    .line 557
    .line 558
    move-object/from16 v6, p2

    .line 559
    .line 560
    goto :goto_6

    .line 561
    :cond_d
    :goto_8
    move-object/from16 v1, p1

    .line 562
    .line 563
    move-object/from16 v6, p2

    .line 564
    .line 565
    move-object/from16 v9, p3

    .line 566
    .line 567
    goto :goto_6

    .line 568
    :cond_e
    invoke-virtual {v11}, Ljava/util/Random;->nextInt()I

    .line 569
    .line 570
    .line 571
    move-result v9

    .line 572
    invoke-static/range {p2 .. p2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    .line 576
    .line 577
    .line 578
    move-result v10

    .line 579
    invoke-static {v12, v8}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    invoke-direct {v2, v10, v13, v14, v12}, Lcom/onesignal/notifications/internal/display/impl/d;->createBaseSummaryIntent(ILcom/onesignal/notifications/internal/display/impl/a;Lorg/json/JSONObject;Ljava/lang/String;)Landroid/content/Intent;

    .line 583
    .line 584
    .line 585
    move-result-object v8

    .line 586
    invoke-virtual {v13, v9, v8}, Lcom/onesignal/notifications/internal/display/impl/a;->getNewActionPendingIntent(ILandroid/content/Intent;)Landroid/app/PendingIntent;

    .line 587
    .line 588
    .line 589
    move-result-object v8

    .line 590
    const-string v9, "summaryBuilder.build()"

    .line 591
    .line 592
    if-eqz v3, :cond_f

    .line 593
    .line 594
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 595
    .line 596
    .line 597
    move-result v10

    .line 598
    const/4 v11, 0x1

    .line 599
    if-gt v10, v11, :cond_10

    .line 600
    .line 601
    :cond_f
    if-nez v3, :cond_1e

    .line 602
    .line 603
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 604
    .line 605
    .line 606
    move-result v10

    .line 607
    if-lez v10, :cond_1e

    .line 608
    .line 609
    :cond_10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 610
    .line 611
    .line 612
    move-result v10

    .line 613
    xor-int/lit8 v11, v3, 0x1

    .line 614
    .line 615
    add-int/2addr v10, v11

    .line 616
    const-string v11, "grp_msg"

    .line 617
    .line 618
    invoke-static {v14, v11}, Lcom/onesignal/common/e;->safeString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v11

    .line 622
    if-eqz v11, :cond_11

    .line 623
    .line 624
    new-instance v13, Ljava/lang/StringBuilder;

    .line 625
    .line 626
    invoke-direct {v13, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v13

    .line 636
    const-string v14, "$[notif_count]"

    .line 637
    .line 638
    invoke-static {v11, v14, v13}, LL9/n;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v11

    .line 642
    goto :goto_9

    .line 643
    :cond_11
    new-instance v11, Ljava/lang/StringBuilder;

    .line 644
    .line 645
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    const-string v13, " new messages"

    .line 652
    .line 653
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v11

    .line 660
    :goto_9
    iget-object v13, v2, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 661
    .line 662
    invoke-interface {v13, v5}, LW5/a;->getBaseOneSignalNotificationBuilder(LU5/d;)Lcom/onesignal/notifications/internal/display/impl/b$a;

    .line 663
    .line 664
    .line 665
    move-result-object v13

    .line 666
    invoke-virtual {v13}, Lcom/onesignal/notifications/internal/display/impl/b$a;->getCompatBuilder()LI/s;

    .line 667
    .line 668
    .line 669
    move-result-object v13

    .line 670
    if-eqz v3, :cond_12

    .line 671
    .line 672
    iget-object v14, v2, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 673
    .line 674
    invoke-interface {v14, v13}, LW5/a;->removeNotifyOptions(LI/s;)V

    .line 675
    .line 676
    .line 677
    goto :goto_a

    .line 678
    :cond_12
    invoke-virtual {v5}, LU5/d;->getOverriddenSound()Landroid/net/Uri;

    .line 679
    .line 680
    .line 681
    move-result-object v14

    .line 682
    if-eqz v14, :cond_13

    .line 683
    .line 684
    invoke-static {v13}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v5}, LU5/d;->getOverriddenSound()Landroid/net/Uri;

    .line 688
    .line 689
    .line 690
    move-result-object v14

    .line 691
    invoke-virtual {v13, v14}, LI/s;->h(Landroid/net/Uri;)V

    .line 692
    .line 693
    .line 694
    :cond_13
    invoke-virtual {v5}, LU5/d;->getOverriddenFlags()Ljava/lang/Integer;

    .line 695
    .line 696
    .line 697
    move-result-object v14

    .line 698
    if-eqz v14, :cond_14

    .line 699
    .line 700
    invoke-static {v13}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v5}, LU5/d;->getOverriddenFlags()Ljava/lang/Integer;

    .line 704
    .line 705
    .line 706
    move-result-object v14

    .line 707
    invoke-static {v14}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 711
    .line 712
    .line 713
    move-result v14

    .line 714
    invoke-virtual {v13, v14}, LI/s;->d(I)V

    .line 715
    .line 716
    .line 717
    :cond_14
    :goto_a
    invoke-static {v13}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    iput-object v8, v13, LI/s;->g:Landroid/app/PendingIntent;

    .line 721
    .line 722
    iget-object v8, v13, LI/s;->z:Landroid/app/Notification;

    .line 723
    .line 724
    iput-object v7, v8, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 725
    .line 726
    invoke-direct {v2}, Lcom/onesignal/notifications/internal/display/impl/d;->getCurrentContext()Landroid/content/Context;

    .line 727
    .line 728
    .line 729
    move-result-object v7

    .line 730
    invoke-static {v7}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 734
    .line 735
    .line 736
    move-result-object v7

    .line 737
    invoke-direct {v2}, Lcom/onesignal/notifications/internal/display/impl/d;->getCurrentContext()Landroid/content/Context;

    .line 738
    .line 739
    .line 740
    move-result-object v8

    .line 741
    invoke-static {v8}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 745
    .line 746
    .line 747
    move-result-object v8

    .line 748
    invoke-virtual {v7, v8}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 749
    .line 750
    .line 751
    move-result-object v7

    .line 752
    invoke-static {v7}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 753
    .line 754
    .line 755
    move-result-object v7

    .line 756
    iput-object v7, v13, LI/s;->e:Ljava/lang/CharSequence;

    .line 757
    .line 758
    invoke-static {v11}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 759
    .line 760
    .line 761
    move-result-object v7

    .line 762
    iput-object v7, v13, LI/s;->f:Ljava/lang/CharSequence;

    .line 763
    .line 764
    iput v10, v13, LI/s;->i:I

    .line 765
    .line 766
    iget-object v7, v2, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 767
    .line 768
    invoke-interface {v7}, LW5/a;->getDefaultSmallIconId()I

    .line 769
    .line 770
    .line 771
    move-result v7

    .line 772
    iget-object v8, v13, LI/s;->z:Landroid/app/Notification;

    .line 773
    .line 774
    iput v7, v8, Landroid/app/Notification;->icon:I

    .line 775
    .line 776
    iget-object v7, v2, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 777
    .line 778
    invoke-interface {v7}, LW5/a;->getDefaultLargeIcon()Landroid/graphics/Bitmap;

    .line 779
    .line 780
    .line 781
    move-result-object v7

    .line 782
    invoke-virtual {v13, v7}, LI/s;->f(Landroid/graphics/Bitmap;)V

    .line 783
    .line 784
    .line 785
    const/16 v7, 0x8

    .line 786
    .line 787
    invoke-virtual {v13, v7, v3}, LI/s;->e(IZ)V

    .line 788
    .line 789
    .line 790
    const/16 v7, 0x10

    .line 791
    .line 792
    const/4 v14, 0x0

    .line 793
    invoke-virtual {v13, v7, v14}, LI/s;->e(IZ)V

    .line 794
    .line 795
    .line 796
    iput-object v12, v13, LI/s;->p:Ljava/lang/String;

    .line 797
    .line 798
    const/4 v10, 0x1

    .line 799
    iput-boolean v10, v13, LI/s;->q:Z

    .line 800
    .line 801
    :try_start_0
    iput v4, v13, LI/s;->x:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 802
    .line 803
    :catchall_0
    if-nez v3, :cond_15

    .line 804
    .line 805
    iget-object v4, v13, LI/s;->z:Landroid/app/Notification;

    .line 806
    .line 807
    invoke-static {v11}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 808
    .line 809
    .line 810
    move-result-object v7

    .line 811
    iput-object v7, v4, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 812
    .line 813
    :cond_15
    new-instance v4, LI/q;

    .line 814
    .line 815
    const/4 v7, 0x1

    .line 816
    invoke-direct {v4, v7}, LI/q;-><init>(I)V

    .line 817
    .line 818
    .line 819
    if-nez v3, :cond_1b

    .line 820
    .line 821
    invoke-virtual {v5}, LU5/d;->getTitle()Ljava/lang/CharSequence;

    .line 822
    .line 823
    .line 824
    move-result-object v3

    .line 825
    if-eqz v3, :cond_16

    .line 826
    .line 827
    invoke-virtual {v5}, LU5/d;->getTitle()Ljava/lang/CharSequence;

    .line 828
    .line 829
    .line 830
    move-result-object v3

    .line 831
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v10

    .line 835
    goto :goto_b

    .line 836
    :cond_16
    const/4 v10, 0x0

    .line 837
    :goto_b
    if-nez v10, :cond_17

    .line 838
    .line 839
    move-object v1, v6

    .line 840
    goto :goto_c

    .line 841
    :cond_17
    invoke-virtual {v10, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    :goto_c
    invoke-virtual {v5}, LU5/d;->getBody()Ljava/lang/CharSequence;

    .line 846
    .line 847
    .line 848
    move-result-object v3

    .line 849
    if-eqz v3, :cond_19

    .line 850
    .line 851
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v3

    .line 855
    if-nez v3, :cond_18

    .line 856
    .line 857
    goto :goto_d

    .line 858
    :cond_18
    move-object v6, v3

    .line 859
    :cond_19
    :goto_d
    new-instance v3, Landroid/text/SpannableString;

    .line 860
    .line 861
    invoke-static {v1, v6}, Ly/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v5

    .line 865
    invoke-direct {v3, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 869
    .line 870
    .line 871
    move-result v5

    .line 872
    if-lez v5, :cond_1a

    .line 873
    .line 874
    new-instance v5, Landroid/text/style/StyleSpan;

    .line 875
    .line 876
    const/4 v10, 0x1

    .line 877
    invoke-direct {v5, v10}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 881
    .line 882
    .line 883
    move-result v1

    .line 884
    const/4 v14, 0x0

    .line 885
    invoke-virtual {v3, v5, v14, v1, v14}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 886
    .line 887
    .line 888
    :cond_1a
    iget-object v1, v4, LI/q;->f:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v1, Ljava/util/ArrayList;

    .line 891
    .line 892
    invoke-static {v3}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 893
    .line 894
    .line 895
    move-result-object v3

    .line 896
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    :cond_1b
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    :cond_1c
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 904
    .line 905
    .line 906
    move-result v1

    .line 907
    if-eqz v1, :cond_1d

    .line 908
    .line 909
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    check-cast v1, Landroid/text/SpannableString;

    .line 914
    .line 915
    if-eqz v1, :cond_1c

    .line 916
    .line 917
    iget-object v3, v4, LI/q;->f:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v3, Ljava/util/ArrayList;

    .line 920
    .line 921
    invoke-static {v1}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 922
    .line 923
    .line 924
    move-result-object v1

    .line 925
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 926
    .line 927
    .line 928
    goto :goto_e

    .line 929
    :cond_1d
    invoke-static {v11}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    iput-object v0, v4, LI/u;->b:Ljava/lang/CharSequence;

    .line 934
    .line 935
    invoke-virtual {v13, v4}, LI/s;->i(LI/u;)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v13}, LI/s;->b()Landroid/app/Notification;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    invoke-static {v0, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    goto :goto_f

    .line 946
    :cond_1e
    invoke-static {v15}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v15}, Lcom/onesignal/notifications/internal/display/impl/b$a;->getCompatBuilder()LI/s;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 954
    .line 955
    .line 956
    iget-object v1, v0, LI/s;->b:Ljava/util/ArrayList;

    .line 957
    .line 958
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 959
    .line 960
    .line 961
    iget-object v1, v2, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 962
    .line 963
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    .line 964
    .line 965
    .line 966
    move-result v21

    .line 967
    move-object/from16 v20, v0

    .line 968
    .line 969
    move-object/from16 v17, v1

    .line 970
    .line 971
    move-object/from16 v22, v12

    .line 972
    .line 973
    move-object/from16 v19, v13

    .line 974
    .line 975
    move-object/from16 v18, v14

    .line 976
    .line 977
    invoke-interface/range {v17 .. v22}, LW5/a;->addNotificationActionButtons(Lorg/json/JSONObject;Lcom/onesignal/notifications/internal/display/impl/a;LI/s;ILjava/lang/String;)V

    .line 978
    .line 979
    .line 980
    iput-object v8, v0, LI/s;->g:Landroid/app/PendingIntent;

    .line 981
    .line 982
    iget-object v1, v0, LI/s;->z:Landroid/app/Notification;

    .line 983
    .line 984
    iput-object v7, v1, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 985
    .line 986
    const/16 v7, 0x8

    .line 987
    .line 988
    invoke-virtual {v0, v7, v3}, LI/s;->e(IZ)V

    .line 989
    .line 990
    .line 991
    const/16 v7, 0x10

    .line 992
    .line 993
    const/4 v14, 0x0

    .line 994
    invoke-virtual {v0, v7, v14}, LI/s;->e(IZ)V

    .line 995
    .line 996
    .line 997
    iput-object v12, v0, LI/s;->p:Ljava/lang/String;

    .line 998
    .line 999
    const/4 v10, 0x1

    .line 1000
    iput-boolean v10, v0, LI/s;->q:Z

    .line 1001
    .line 1002
    :try_start_1
    iput v4, v0, LI/s;->x:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1003
    .line 1004
    :catchall_1
    invoke-virtual {v0}, LI/s;->b()Landroid/app/Notification;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    invoke-static {v0, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1009
    .line 1010
    .line 1011
    iget-object v1, v2, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 1012
    .line 1013
    invoke-interface {v1, v15, v0}, LW5/a;->addXiaomiSettings(Lcom/onesignal/notifications/internal/display/impl/b$a;Landroid/app/Notification;)V

    .line 1014
    .line 1015
    .line 1016
    :goto_f
    invoke-direct {v2}, Lcom/onesignal/notifications/internal/display/impl/d;->getCurrentContext()Landroid/content/Context;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v1

    .line 1020
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 1021
    .line 1022
    .line 1023
    new-instance v2, LI/J;

    .line 1024
    .line 1025
    invoke-direct {v2, v1}, LI/J;-><init>(Landroid/content/Context;)V

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    .line 1029
    .line 1030
    .line 1031
    move-result v1

    .line 1032
    invoke-virtual {v2, v1, v0}, LI/J;->b(ILandroid/app/Notification;)V

    .line 1033
    .line 1034
    .line 1035
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 1036
    .line 1037
    return-object v0
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
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
.end method

.method public updateSummaryNotification(LU5/d;Lm8/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU5/d;",
            "Lm8/d<",
            "-",
            "Lh8/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/onesignal/notifications/internal/display/impl/d;->_notificationDisplayBuilder:LW5/a;

    .line 2
    .line 3
    invoke-interface {v0}, LW5/a;->getGroupAlertBehavior()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, p1, v1, v0, p2}, Lcom/onesignal/notifications/internal/display/impl/d;->createSummaryNotification(LU5/d;Lcom/onesignal/notifications/internal/display/impl/b$a;ILm8/d;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object p2, Ln8/a;->s:Ln8/a;

    .line 13
    .line 14
    if-ne p1, p2, :cond_0

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 18
    .line 19
    return-object p1
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
