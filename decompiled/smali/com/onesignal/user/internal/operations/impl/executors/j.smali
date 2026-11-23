.class public final Lcom/onesignal/user/internal/operations/impl/executors/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/onesignal/user/internal/operations/impl/executors/j$a;
    }
.end annotation


# static fields
.field public static final CREATE_SUBSCRIPTION:Ljava/lang/String; = "create-subscription"

.field public static final Companion:Lcom/onesignal/user/internal/operations/impl/executors/j$a;

.field public static final DELETE_SUBSCRIPTION:Ljava/lang/String; = "delete-subscription"

.field public static final TRANSFER_SUBSCRIPTION:Ljava/lang/String; = "transfer-subscription"

.field public static final UPDATE_SUBSCRIPTION:Ljava/lang/String; = "update-subscription"


# instance fields
.field private final _applicationService:LX4/f;

.field private final _buildUserService:Lo6/a;

.field private final _configModelStore:Lcom/onesignal/core/internal/config/b;

.field private final _consistencyManager:LS4/c;

.field private final _deviceService:Lc5/c;

.field private final _identityModelStore:Lq6/b;

.field private final _newRecordState:Lt6/a;

.field private final _subscriptionBackend:Ln6/c;

.field private final _subscriptionModelStore:Lv6/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/onesignal/user/internal/operations/impl/executors/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/onesignal/user/internal/operations/impl/executors/j$a;-><init>(Lv8/e;)V

    sput-object v0, Lcom/onesignal/user/internal/operations/impl/executors/j;->Companion:Lcom/onesignal/user/internal/operations/impl/executors/j$a;

    return-void
.end method

.method public constructor <init>(Ln6/c;Lc5/c;LX4/f;Lq6/b;Lv6/e;Lcom/onesignal/core/internal/config/b;Lo6/a;Lt6/a;LS4/c;)V
    .locals 1

    .line 1
    const-string v0, "_subscriptionBackend"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "_deviceService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "_applicationService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "_identityModelStore"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "_subscriptionModelStore"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "_configModelStore"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "_buildUserService"

    .line 32
    .line 33
    invoke-static {p7, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "_newRecordState"

    .line 37
    .line 38
    invoke-static {p8, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "_consistencyManager"

    .line 42
    .line 43
    invoke-static {p9, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_subscriptionBackend:Ln6/c;

    .line 50
    .line 51
    iput-object p2, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_deviceService:Lc5/c;

    .line 52
    .line 53
    iput-object p3, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_applicationService:LX4/f;

    .line 54
    .line 55
    iput-object p4, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_identityModelStore:Lq6/b;

    .line 56
    .line 57
    iput-object p5, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_subscriptionModelStore:Lv6/e;

    .line 58
    .line 59
    iput-object p6, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    .line 60
    .line 61
    iput-object p7, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_buildUserService:Lo6/a;

    .line 62
    .line 63
    iput-object p8, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_newRecordState:Lt6/a;

    .line 64
    .line 65
    iput-object p9, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_consistencyManager:LS4/c;

    .line 66
    .line 67
    return-void
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
.end method

.method public static final synthetic access$createSubscription(Lcom/onesignal/user/internal/operations/impl/executors/j;Lr6/a;Ljava/util/List;Lm8/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/onesignal/user/internal/operations/impl/executors/j;->createSubscription(Lr6/a;Ljava/util/List;Lm8/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final synthetic access$deleteSubscription(Lcom/onesignal/user/internal/operations/impl/executors/j;Lr6/c;Lm8/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/onesignal/user/internal/operations/impl/executors/j;->deleteSubscription(Lr6/c;Lm8/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final synthetic access$transferSubscription(Lcom/onesignal/user/internal/operations/impl/executors/j;Lr6/o;Lm8/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/onesignal/user/internal/operations/impl/executors/j;->transferSubscription(Lr6/o;Lm8/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static final synthetic access$updateSubscription(Lcom/onesignal/user/internal/operations/impl/executors/j;Lr6/p;Ljava/util/List;Lm8/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/onesignal/user/internal/operations/impl/executors/j;->updateSubscription(Lr6/p;Ljava/util/List;Lm8/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private final convert(Lv6/g;)Ln6/j;
    .locals 1

    .line 1
    sget-object v0, Lcom/onesignal/user/internal/operations/impl/executors/k;->$EnumSwitchMapping$1:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    sget-object p1, Ln6/j;->Companion:Ln6/j$a;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_deviceService:Lc5/c;

    .line 18
    .line 19
    invoke-interface {v0}, Lc5/c;->getDeviceType()Lc5/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1, v0}, Ln6/j$a;->fromDeviceType(Lc5/a;)Ln6/j;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, Ln6/j;->EMAIL:Ln6/j;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    sget-object p1, Ln6/j;->SMS:Ln6/j;

    .line 32
    .line 33
    return-object p1
.end method

.method private final createSubscription(Lr6/a;Ljava/util/List;Lm8/d;)Ljava/lang/Object;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            "Ljava/util/List<",
            "+",
            "Lg5/g;",
            ">;",
            "Lm8/d<",
            "-",
            "Lg5/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$b;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/onesignal/user/internal/operations/impl/executors/j$b;

    .line 13
    .line 14
    iget v4, v3, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->label:I

    .line 24
    .line 25
    :goto_0
    move-object v10, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lcom/onesignal/user/internal/operations/impl/executors/j$b;

    .line 28
    .line 29
    invoke-direct {v3, v1, v2}, Lcom/onesignal/user/internal/operations/impl/executors/j$b;-><init>(Lcom/onesignal/user/internal/operations/impl/executors/j;Lm8/d;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->result:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v3, Ln8/a;->s:Ln8/a;

    .line 36
    .line 37
    iget v4, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->label:I

    .line 38
    .line 39
    const/4 v11, 0x3

    .line 40
    const/4 v12, 0x2

    .line 41
    const/4 v13, 0x1

    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    if-eq v4, v13, :cond_3

    .line 45
    .line 46
    if-eq v4, v12, :cond_2

    .line 47
    .line 48
    if-ne v4, v11, :cond_1

    .line 49
    .line 50
    iget-object v0, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$2:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v3, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$1:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, Lr6/a;

    .line 57
    .line 58
    iget-object v4, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Lcom/onesignal/user/internal/operations/impl/executors/j;

    .line 61
    .line 62
    :goto_2
    :try_start_0
    invoke-static {v2}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    goto/16 :goto_b

    .line 66
    .line 67
    :catch_0
    move-exception v0

    .line 68
    :goto_3
    move-object v2, v3

    .line 69
    goto/16 :goto_10

    .line 70
    .line 71
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_2
    iget-object v0, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$2:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ljava/lang/String;

    .line 82
    .line 83
    iget-object v3, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$1:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Lr6/a;

    .line 86
    .line 87
    iget-object v4, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v4, Lcom/onesignal/user/internal/operations/impl/executors/j;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    iget-object v0, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$1:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v4, v0

    .line 95
    check-cast v4, Lr6/a;

    .line 96
    .line 97
    iget-object v0, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$0:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v5, v0

    .line 100
    check-cast v5, Lcom/onesignal/user/internal/operations/impl/executors/j;

    .line 101
    .line 102
    :try_start_1
    invoke-static {v2}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_1 .. :try_end_1} :catch_1

    .line 103
    .line 104
    .line 105
    move-object v0, v2

    .line 106
    move-object v2, v4

    .line 107
    move-object v4, v5

    .line 108
    goto/16 :goto_a

    .line 109
    .line 110
    :catch_1
    move-exception v0

    .line 111
    move-object v2, v4

    .line 112
    move-object v4, v5

    .line 113
    goto/16 :goto_10

    .line 114
    .line 115
    :cond_4
    invoke-static {v2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-object v2, v0

    .line 119
    check-cast v2, Ljava/lang/Iterable;

    .line 120
    .line 121
    instance-of v4, v2, Ljava/util/Collection;

    .line 122
    .line 123
    if-eqz v4, :cond_5

    .line 124
    .line 125
    move-object v4, v2

    .line 126
    check-cast v4, Ljava/util/Collection;

    .line 127
    .line 128
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_5

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_5
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_7

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    check-cast v4, Lg5/g;

    .line 150
    .line 151
    instance-of v4, v4, Lr6/c;

    .line 152
    .line 153
    if-eqz v4, :cond_6

    .line 154
    .line 155
    new-instance v14, Lg5/a;

    .line 156
    .line 157
    sget-object v15, Lg5/b;->SUCCESS:Lg5/b;

    .line 158
    .line 159
    const/16 v19, 0xe

    .line 160
    .line 161
    const/16 v20, 0x0

    .line 162
    .line 163
    const/16 v16, 0x0

    .line 164
    .line 165
    const/16 v17, 0x0

    .line 166
    .line 167
    const/16 v18, 0x0

    .line 168
    .line 169
    invoke-direct/range {v14 .. v20}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 170
    .line 171
    .line 172
    return-object v14

    .line 173
    :cond_7
    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    :cond_8
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_9

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    move-object v4, v2

    .line 192
    check-cast v4, Lg5/g;

    .line 193
    .line 194
    instance-of v4, v4, Lr6/p;

    .line 195
    .line 196
    if-eqz v4, :cond_8

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_9
    const/4 v2, 0x0

    .line 200
    :goto_5
    check-cast v2, Lr6/p;

    .line 201
    .line 202
    if-eqz v2, :cond_a

    .line 203
    .line 204
    invoke-virtual {v2}, Lr6/p;->getEnabled()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    goto :goto_6

    .line 209
    :cond_a
    invoke-virtual/range {p1 .. p1}, Lr6/a;->getEnabled()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    :goto_6
    if-eqz v2, :cond_c

    .line 214
    .line 215
    invoke-virtual {v2}, Lr6/p;->getAddress()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    if-nez v4, :cond_b

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_b
    :goto_7
    move-object/from16 v17, v4

    .line 223
    .line 224
    goto :goto_9

    .line 225
    :cond_c
    :goto_8
    invoke-virtual/range {p1 .. p1}, Lr6/a;->getAddress()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    goto :goto_7

    .line 230
    :goto_9
    if-eqz v2, :cond_d

    .line 231
    .line 232
    invoke-virtual {v2}, Lr6/p;->getStatus()Lv6/f;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    if-nez v2, :cond_e

    .line 237
    .line 238
    :cond_d
    invoke-virtual/range {p1 .. p1}, Lr6/a;->getStatus()Lv6/f;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    :cond_e
    :try_start_2
    new-instance v14, Ln6/h;

    .line 243
    .line 244
    invoke-virtual/range {p1 .. p1}, Lr6/a;->getType()Lv6/g;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-direct {v1, v4}, Lcom/onesignal/user/internal/operations/impl/executors/j;->convert(Lv6/g;)Ln6/j;

    .line 249
    .line 250
    .line 251
    move-result-object v16

    .line 252
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 253
    .line 254
    .line 255
    move-result-object v18

    .line 256
    invoke-virtual {v2}, Lv6/f;->getValue()I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    new-instance v2, Ljava/lang/Integer;

    .line 261
    .line 262
    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 263
    .line 264
    .line 265
    const-string v20, "050200"

    .line 266
    .line 267
    sget-object v21, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 268
    .line 269
    sget-object v22, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 270
    .line 271
    sget-object v0, Lcom/onesignal/common/j;->INSTANCE:Lcom/onesignal/common/j;

    .line 272
    .line 273
    invoke-virtual {v0}, Lcom/onesignal/common/j;->isRooted()Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 278
    .line 279
    .line 280
    move-result-object v23

    .line 281
    sget-object v0, Lcom/onesignal/common/c;->INSTANCE:Lcom/onesignal/common/c;

    .line 282
    .line 283
    iget-object v4, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_applicationService:LX4/f;

    .line 284
    .line 285
    invoke-interface {v4}, LX4/f;->getAppContext()Landroid/content/Context;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v0, v4}, Lcom/onesignal/common/c;->getNetType(Landroid/content/Context;)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v24

    .line 293
    iget-object v4, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_applicationService:LX4/f;

    .line 294
    .line 295
    invoke-interface {v4}, LX4/f;->getAppContext()Landroid/content/Context;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-virtual {v0, v4}, Lcom/onesignal/common/c;->getCarrierName(Landroid/content/Context;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v25

    .line 303
    sget-object v0, Lcom/onesignal/common/AndroidUtils;->INSTANCE:Lcom/onesignal/common/AndroidUtils;

    .line 304
    .line 305
    iget-object v4, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_applicationService:LX4/f;

    .line 306
    .line 307
    invoke-interface {v4}, LX4/f;->getAppContext()Landroid/content/Context;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-virtual {v0, v4}, Lcom/onesignal/common/AndroidUtils;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v26

    .line 315
    const/4 v15, 0x0

    .line 316
    move-object/from16 v19, v2

    .line 317
    .line 318
    invoke-direct/range {v14 .. v26}, Ln6/h;-><init>(Ljava/lang/String;Ln6/j;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    iget-object v0, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_identityModelStore:Lq6/b;

    .line 322
    .line 323
    invoke-virtual {v0}, Lq6/b;->getIdentityAlias()Lh8/f;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    iget-object v4, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_subscriptionBackend:Ln6/c;

    .line 328
    .line 329
    invoke-virtual/range {p1 .. p1}, Lr6/a;->getAppId()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    iget-object v2, v0, Lh8/f;->s:Ljava/lang/Object;

    .line 334
    .line 335
    move-object v6, v2

    .line 336
    check-cast v6, Ljava/lang/String;

    .line 337
    .line 338
    iget-object v0, v0, Lh8/f;->t:Ljava/lang/Object;

    .line 339
    .line 340
    move-object v7, v0

    .line 341
    check-cast v7, Ljava/lang/String;

    .line 342
    .line 343
    iget-object v0, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_identityModelStore:Lq6/b;

    .line 344
    .line 345
    invoke-virtual {v0}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    check-cast v0, Lq6/a;

    .line 350
    .line 351
    invoke-virtual {v0}, Lq6/a;->getJwtToken()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    iput-object v1, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$0:Ljava/lang/Object;
    :try_end_2
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_2 .. :try_end_2} :catch_5

    .line 356
    .line 357
    move-object/from16 v2, p1

    .line 358
    .line 359
    :try_start_3
    iput-object v2, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$1:Ljava/lang/Object;

    .line 360
    .line 361
    iput v13, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->label:I

    .line 362
    .line 363
    move-object v8, v14

    .line 364
    invoke-interface/range {v4 .. v10}, Ln6/c;->createSubscription(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln6/h;Ljava/lang/String;Lm8/d;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0
    :try_end_3
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_3 .. :try_end_3} :catch_4

    .line 368
    if-ne v0, v3, :cond_f

    .line 369
    .line 370
    goto :goto_c

    .line 371
    :cond_f
    move-object v4, v1

    .line 372
    :goto_a
    :try_start_4
    check-cast v0, Lh8/f;

    .line 373
    .line 374
    if-nez v0, :cond_10

    .line 375
    .line 376
    new-instance v14, Lg5/a;

    .line 377
    .line 378
    sget-object v15, Lg5/b;->SUCCESS:Lg5/b;

    .line 379
    .line 380
    const/16 v19, 0xe

    .line 381
    .line 382
    const/16 v20, 0x0

    .line 383
    .line 384
    const/16 v16, 0x0

    .line 385
    .line 386
    const/16 v17, 0x0

    .line 387
    .line 388
    const/16 v18, 0x0

    .line 389
    .line 390
    invoke-direct/range {v14 .. v20}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 391
    .line 392
    .line 393
    return-object v14

    .line 394
    :catch_2
    move-exception v0

    .line 395
    goto/16 :goto_10

    .line 396
    .line 397
    :cond_10
    iget-object v5, v0, Lh8/f;->s:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v5, Ljava/lang/String;

    .line 400
    .line 401
    iget-object v0, v0, Lh8/f;->t:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v0, LQ4/b;

    .line 404
    .line 405
    if-eqz v0, :cond_12

    .line 406
    .line 407
    iget-object v6, v4, Lcom/onesignal/user/internal/operations/impl/executors/j;->_consistencyManager:LS4/c;

    .line 408
    .line 409
    invoke-virtual {v2}, Lr6/a;->getOnesignalId()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    sget-object v8, LR4/a;->SUBSCRIPTION:LR4/a;

    .line 414
    .line 415
    iput-object v4, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$0:Ljava/lang/Object;

    .line 416
    .line 417
    iput-object v2, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$1:Ljava/lang/Object;

    .line 418
    .line 419
    iput-object v5, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$2:Ljava/lang/Object;

    .line 420
    .line 421
    iput v12, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->label:I

    .line 422
    .line 423
    invoke-interface {v6, v7, v8, v0, v10}, LS4/c;->setRywData(Ljava/lang/String;LS4/b;LQ4/b;Lm8/d;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    if-ne v0, v3, :cond_11

    .line 428
    .line 429
    goto :goto_c

    .line 430
    :cond_11
    move-object v3, v2

    .line 431
    move-object v0, v5

    .line 432
    :goto_b
    move-object v6, v0

    .line 433
    move-object v2, v4

    .line 434
    goto :goto_d

    .line 435
    :cond_12
    iget-object v0, v4, Lcom/onesignal/user/internal/operations/impl/executors/j;->_consistencyManager:LS4/c;

    .line 436
    .line 437
    const-string v6, "IamFetchReadyCondition"

    .line 438
    .line 439
    iput-object v4, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$0:Ljava/lang/Object;

    .line 440
    .line 441
    iput-object v2, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$1:Ljava/lang/Object;

    .line 442
    .line 443
    iput-object v5, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->L$2:Ljava/lang/Object;

    .line 444
    .line 445
    iput v11, v10, Lcom/onesignal/user/internal/operations/impl/executors/j$b;->label:I

    .line 446
    .line 447
    invoke-interface {v0, v6, v10}, LS4/c;->resolveConditionsWithID(Ljava/lang/String;Lm8/d;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v0
    :try_end_4
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_4 .. :try_end_4} :catch_2

    .line 451
    if-ne v0, v3, :cond_11

    .line 452
    .line 453
    :goto_c
    return-object v3

    .line 454
    :goto_d
    :try_start_5
    iget-object v0, v2, Lcom/onesignal/user/internal/operations/impl/executors/j;->_subscriptionModelStore:Lv6/e;

    .line 455
    .line 456
    invoke-virtual {v3}, Lr6/a;->getSubscriptionId()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    invoke-virtual {v0, v4}, Lcom/onesignal/common/modeling/k;->get(Ljava/lang/String;)Lcom/onesignal/common/modeling/i;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    move-object v4, v0

    .line 465
    check-cast v4, Lv6/d;

    .line 466
    .line 467
    if-eqz v4, :cond_13

    .line 468
    .line 469
    const-string v5, "id"

    .line 470
    .line 471
    const-string v7, "HYDRATE"

    .line 472
    .line 473
    const/16 v9, 0x8

    .line 474
    .line 475
    const/4 v10, 0x0

    .line 476
    const/4 v8, 0x0

    .line 477
    invoke-static/range {v4 .. v10}, Lcom/onesignal/common/modeling/i;->setStringProperty$default(Lcom/onesignal/common/modeling/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    goto :goto_e

    .line 481
    :catch_3
    move-exception v0

    .line 482
    move-object v4, v2

    .line 483
    goto/16 :goto_3

    .line 484
    .line 485
    :cond_13
    :goto_e
    iget-object v0, v2, Lcom/onesignal/user/internal/operations/impl/executors/j;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    .line 486
    .line 487
    invoke-virtual {v0}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    check-cast v0, Lcom/onesignal/core/internal/config/a;

    .line 492
    .line 493
    invoke-virtual {v0}, Lcom/onesignal/core/internal/config/a;->getPushSubscriptionId()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v3}, Lr6/a;->getSubscriptionId()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v4

    .line 501
    invoke-static {v0, v4}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    if-eqz v0, :cond_14

    .line 506
    .line 507
    iget-object v0, v2, Lcom/onesignal/user/internal/operations/impl/executors/j;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    .line 508
    .line 509
    invoke-virtual {v0}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    check-cast v0, Lcom/onesignal/core/internal/config/a;

    .line 514
    .line 515
    invoke-virtual {v0, v6}, Lcom/onesignal/core/internal/config/a;->setPushSubscriptionId(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    :cond_14
    new-instance v4, Lg5/a;

    .line 519
    .line 520
    sget-object v5, Lg5/b;->SUCCESS:Lg5/b;

    .line 521
    .line 522
    invoke-virtual {v3}, Lr6/a;->getSubscriptionId()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    new-instance v7, Lh8/f;

    .line 527
    .line 528
    invoke-direct {v7, v0, v6}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    invoke-static {v7}, Li8/z;->t(Lh8/f;)Ljava/util/Map;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    const/16 v9, 0xc

    .line 536
    .line 537
    const/4 v10, 0x0

    .line 538
    const/4 v7, 0x0

    .line 539
    const/4 v8, 0x0

    .line 540
    invoke-direct/range {v4 .. v10}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V
    :try_end_5
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_5 .. :try_end_5} :catch_3

    .line 541
    .line 542
    .line 543
    return-object v4

    .line 544
    :catch_4
    move-exception v0

    .line 545
    :goto_f
    move-object v4, v1

    .line 546
    goto :goto_10

    .line 547
    :catch_5
    move-exception v0

    .line 548
    move-object/from16 v2, p1

    .line 549
    .line 550
    goto :goto_f

    .line 551
    :goto_10
    sget-object v3, Lcom/onesignal/common/g;->INSTANCE:Lcom/onesignal/common/g;

    .line 552
    .line 553
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 554
    .line 555
    .line 556
    move-result v5

    .line 557
    invoke-virtual {v3, v5}, Lcom/onesignal/common/g;->getResponseStatusType(I)Lcom/onesignal/common/g$a;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    sget-object v5, Lcom/onesignal/user/internal/operations/impl/executors/k;->$EnumSwitchMapping$0:[I

    .line 562
    .line 563
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 564
    .line 565
    .line 566
    move-result v3

    .line 567
    aget v3, v5, v3

    .line 568
    .line 569
    if-eq v3, v13, :cond_1a

    .line 570
    .line 571
    if-eq v3, v12, :cond_19

    .line 572
    .line 573
    if-eq v3, v11, :cond_19

    .line 574
    .line 575
    const/4 v5, 0x4

    .line 576
    if-eq v3, v5, :cond_18

    .line 577
    .line 578
    const/4 v5, 0x5

    .line 579
    if-ne v3, v5, :cond_17

    .line 580
    .line 581
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 582
    .line 583
    .line 584
    move-result v3

    .line 585
    const/16 v5, 0x194

    .line 586
    .line 587
    if-ne v3, v5, :cond_15

    .line 588
    .line 589
    iget-object v3, v4, Lcom/onesignal/user/internal/operations/impl/executors/j;->_newRecordState:Lt6/a;

    .line 590
    .line 591
    invoke-virtual {v2}, Lr6/a;->getOnesignalId()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v5

    .line 595
    invoke-virtual {v3, v5}, Lt6/a;->isInMissingRetryWindow(Ljava/lang/String;)Z

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    if-eqz v3, :cond_15

    .line 600
    .line 601
    new-instance v5, Lg5/a;

    .line 602
    .line 603
    sget-object v6, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 604
    .line 605
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 606
    .line 607
    .line 608
    move-result-object v9

    .line 609
    const/4 v10, 0x6

    .line 610
    const/4 v11, 0x0

    .line 611
    const/4 v7, 0x0

    .line 612
    const/4 v8, 0x0

    .line 613
    invoke-direct/range {v5 .. v11}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 614
    .line 615
    .line 616
    return-object v5

    .line 617
    :cond_15
    iget-object v3, v4, Lcom/onesignal/user/internal/operations/impl/executors/j;->_buildUserService:Lo6/a;

    .line 618
    .line 619
    invoke-virtual {v2}, Lr6/a;->getAppId()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v4

    .line 623
    invoke-virtual {v2}, Lr6/a;->getOnesignalId()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    invoke-interface {v3, v4, v2}, Lo6/a;->getRebuildOperationsIfCurrentUser(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v8

    .line 631
    if-nez v8, :cond_16

    .line 632
    .line 633
    new-instance v9, Lg5/a;

    .line 634
    .line 635
    sget-object v10, Lg5/b;->FAIL_NORETRY:Lg5/b;

    .line 636
    .line 637
    const/16 v14, 0xe

    .line 638
    .line 639
    const/4 v15, 0x0

    .line 640
    const/4 v11, 0x0

    .line 641
    const/4 v12, 0x0

    .line 642
    const/4 v13, 0x0

    .line 643
    invoke-direct/range {v9 .. v15}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 644
    .line 645
    .line 646
    return-object v9

    .line 647
    :cond_16
    new-instance v5, Lg5/a;

    .line 648
    .line 649
    sget-object v6, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 650
    .line 651
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 652
    .line 653
    .line 654
    move-result-object v9

    .line 655
    const/4 v10, 0x2

    .line 656
    const/4 v11, 0x0

    .line 657
    const/4 v7, 0x0

    .line 658
    invoke-direct/range {v5 .. v11}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 659
    .line 660
    .line 661
    return-object v5

    .line 662
    :cond_17
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 663
    .line 664
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 665
    .line 666
    .line 667
    throw v0

    .line 668
    :cond_18
    new-instance v2, Lg5/a;

    .line 669
    .line 670
    sget-object v3, Lg5/b;->FAIL_UNAUTHORIZED:Lg5/b;

    .line 671
    .line 672
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 673
    .line 674
    .line 675
    move-result-object v6

    .line 676
    const/4 v7, 0x6

    .line 677
    const/4 v8, 0x0

    .line 678
    const/4 v4, 0x0

    .line 679
    const/4 v5, 0x0

    .line 680
    invoke-direct/range {v2 .. v8}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 681
    .line 682
    .line 683
    goto :goto_11

    .line 684
    :cond_19
    new-instance v3, Lg5/a;

    .line 685
    .line 686
    sget-object v4, Lg5/b;->FAIL_NORETRY:Lg5/b;

    .line 687
    .line 688
    const/16 v8, 0xe

    .line 689
    .line 690
    const/4 v9, 0x0

    .line 691
    const/4 v5, 0x0

    .line 692
    const/4 v6, 0x0

    .line 693
    const/4 v7, 0x0

    .line 694
    invoke-direct/range {v3 .. v9}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 695
    .line 696
    .line 697
    move-object v2, v3

    .line 698
    goto :goto_11

    .line 699
    :cond_1a
    new-instance v4, Lg5/a;

    .line 700
    .line 701
    sget-object v5, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 702
    .line 703
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 704
    .line 705
    .line 706
    move-result-object v8

    .line 707
    const/4 v9, 0x6

    .line 708
    const/4 v10, 0x0

    .line 709
    const/4 v6, 0x0

    .line 710
    const/4 v7, 0x0

    .line 711
    invoke-direct/range {v4 .. v10}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 712
    .line 713
    .line 714
    move-object v2, v4

    .line 715
    :goto_11
    return-object v2
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
.end method

.method private final deleteSubscription(Lr6/c;Lm8/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            "Lm8/d<",
            "-",
            "Lg5/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/onesignal/user/internal/operations/impl/executors/j$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/onesignal/user/internal/operations/impl/executors/j$c;

    .line 7
    .line 8
    iget v1, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$c;->label:I

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
    iput v1, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$c;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/onesignal/user/internal/operations/impl/executors/j$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/onesignal/user/internal/operations/impl/executors/j$c;-><init>(Lcom/onesignal/user/internal/operations/impl/executors/j;Lm8/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$c;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Ln8/a;->s:Ln8/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$c;->label:I

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
    iget-object p1, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$c;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lr6/c;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$c;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v1, v0

    .line 43
    check-cast v1, Lcom/onesignal/user/internal/operations/impl/executors/j;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catch_0
    move-exception v0

    .line 50
    move-object p2, v0

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :try_start_1
    iget-object p2, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_subscriptionBackend:Ln6/c;

    .line 64
    .line 65
    invoke-virtual {p1}, Lr6/c;->getAppId()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {p1}, Lr6/c;->getSubscriptionId()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    iget-object v5, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_identityModelStore:Lq6/b;

    .line 74
    .line 75
    invoke-virtual {v5}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Lq6/a;

    .line 80
    .line 81
    invoke-virtual {v5}, Lq6/a;->getJwtToken()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    iput-object p0, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$c;->L$0:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object p1, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$c;->L$1:Ljava/lang/Object;

    .line 88
    .line 89
    iput v3, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$c;->label:I

    .line 90
    .line 91
    invoke-interface {p2, v2, v4, v5, v0}, Ln6/c;->deleteSubscription(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm8/d;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2
    :try_end_1
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_1 .. :try_end_1} :catch_1

    .line 95
    if-ne p2, v1, :cond_3

    .line 96
    .line 97
    return-object v1

    .line 98
    :cond_3
    move-object v1, p0

    .line 99
    :goto_1
    :try_start_2
    iget-object p2, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_subscriptionModelStore:Lv6/e;

    .line 100
    .line 101
    invoke-virtual {p1}, Lr6/c;->getSubscriptionId()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v2, "HYDRATE"

    .line 106
    .line 107
    invoke-virtual {p2, v0, v2}, Lcom/onesignal/common/modeling/k;->remove(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_2 .. :try_end_2} :catch_0

    .line 108
    .line 109
    .line 110
    new-instance v4, Lg5/a;

    .line 111
    .line 112
    sget-object v5, Lg5/b;->SUCCESS:Lg5/b;

    .line 113
    .line 114
    const/16 v9, 0xe

    .line 115
    .line 116
    const/4 v10, 0x0

    .line 117
    const/4 v6, 0x0

    .line 118
    const/4 v7, 0x0

    .line 119
    const/4 v8, 0x0

    .line 120
    invoke-direct/range {v4 .. v10}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 121
    .line 122
    .line 123
    return-object v4

    .line 124
    :catch_1
    move-exception v0

    .line 125
    move-object p2, v0

    .line 126
    move-object v1, p0

    .line 127
    :goto_2
    sget-object v0, Lcom/onesignal/common/g;->INSTANCE:Lcom/onesignal/common/g;

    .line 128
    .line 129
    invoke-virtual {p2}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    invoke-virtual {v0, v2}, Lcom/onesignal/common/g;->getResponseStatusType(I)Lcom/onesignal/common/g$a;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    sget-object v2, Lcom/onesignal/user/internal/operations/impl/executors/k;->$EnumSwitchMapping$0:[I

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    aget v0, v2, v0

    .line 144
    .line 145
    if-eq v0, v3, :cond_8

    .line 146
    .line 147
    const/4 v2, 0x5

    .line 148
    if-eq v0, v2, :cond_4

    .line 149
    .line 150
    new-instance v3, Lg5/a;

    .line 151
    .line 152
    sget-object v4, Lg5/b;->FAIL_NORETRY:Lg5/b;

    .line 153
    .line 154
    const/16 v8, 0xe

    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    const/4 v5, 0x0

    .line 158
    const/4 v6, 0x0

    .line 159
    const/4 v7, 0x0

    .line 160
    invoke-direct/range {v3 .. v9}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_4

    .line 164
    .line 165
    :cond_4
    invoke-virtual {p2}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    const/16 v2, 0x194

    .line 170
    .line 171
    if-ne v0, v2, :cond_7

    .line 172
    .line 173
    invoke-virtual {p1}, Lr6/c;->getOnesignalId()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {p1}, Lr6/c;->getSubscriptionId()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p1}, Li8/l;->C([Ljava/lang/Object;)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Ljava/lang/Iterable;

    .line 190
    .line 191
    instance-of v0, p1, Ljava/util/Collection;

    .line 192
    .line 193
    if-eqz v0, :cond_5

    .line 194
    .line 195
    move-object v0, p1

    .line 196
    check-cast v0, Ljava/util/Collection;

    .line 197
    .line 198
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_5

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_7

    .line 214
    .line 215
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, Ljava/lang/String;

    .line 220
    .line 221
    iget-object v2, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_newRecordState:Lt6/a;

    .line 222
    .line 223
    invoke-virtual {v2, v0}, Lt6/a;->isInMissingRetryWindow(Ljava/lang/String;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_6

    .line 228
    .line 229
    new-instance v2, Lg5/a;

    .line 230
    .line 231
    sget-object v3, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 232
    .line 233
    invoke-virtual {p2}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    const/4 v7, 0x6

    .line 238
    const/4 v8, 0x0

    .line 239
    const/4 v4, 0x0

    .line 240
    const/4 v5, 0x0

    .line 241
    invoke-direct/range {v2 .. v8}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 242
    .line 243
    .line 244
    move-object v3, v2

    .line 245
    goto :goto_4

    .line 246
    :cond_7
    :goto_3
    new-instance v3, Lg5/a;

    .line 247
    .line 248
    sget-object v4, Lg5/b;->SUCCESS:Lg5/b;

    .line 249
    .line 250
    const/16 v8, 0xe

    .line 251
    .line 252
    const/4 v9, 0x0

    .line 253
    const/4 v5, 0x0

    .line 254
    const/4 v6, 0x0

    .line 255
    const/4 v7, 0x0

    .line 256
    invoke-direct/range {v3 .. v9}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_8
    new-instance v4, Lg5/a;

    .line 261
    .line 262
    sget-object v5, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 263
    .line 264
    invoke-virtual {p2}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    const/4 v9, 0x6

    .line 269
    const/4 v10, 0x0

    .line 270
    const/4 v6, 0x0

    .line 271
    const/4 v7, 0x0

    .line 272
    invoke-direct/range {v4 .. v10}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 273
    .line 274
    .line 275
    move-object v3, v4

    .line 276
    :goto_4
    return-object v3
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

.method private final transferSubscription(Lr6/o;Lm8/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/o;",
            "Lm8/d<",
            "-",
            "Lg5/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/onesignal/user/internal/operations/impl/executors/j$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/onesignal/user/internal/operations/impl/executors/j$d;

    .line 7
    .line 8
    iget v1, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$d;->label:I

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
    iput v1, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$d;->label:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/onesignal/user/internal/operations/impl/executors/j$d;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/onesignal/user/internal/operations/impl/executors/j$d;-><init>(Lcom/onesignal/user/internal/operations/impl/executors/j;Lm8/d;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v7, Lcom/onesignal/user/internal/operations/impl/executors/j$d;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, Ln8/a;->s:Ln8/a;

    .line 30
    .line 31
    iget v1, v7, Lcom/onesignal/user/internal/operations/impl/executors/j$d;->label:I

    .line 32
    .line 33
    const/4 v8, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v8, :cond_1

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catch_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :try_start_1
    iget-object v1, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_subscriptionBackend:Ln6/c;

    .line 57
    .line 58
    invoke-virtual {p1}, Lr6/o;->getAppId()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const-string v4, "onesignal_id"

    .line 67
    .line 68
    invoke-virtual {p1}, Lr6/o;->getOnesignalId()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    iget-object p1, p0, Lcom/onesignal/user/internal/operations/impl/executors/j;->_identityModelStore:Lq6/b;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Lq6/a;

    .line 79
    .line 80
    invoke-virtual {p1}, Lq6/a;->getJwtToken()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    iput v8, v7, Lcom/onesignal/user/internal/operations/impl/executors/j$d;->label:I

    .line 85
    .line 86
    invoke-interface/range {v1 .. v7}, Ln6/c;->transferSubscription(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm8/d;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1
    :try_end_1
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_1 .. :try_end_1} :catch_0

    .line 90
    if-ne p1, v0, :cond_3

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_3
    :goto_2
    new-instance v1, Lg5/a;

    .line 94
    .line 95
    sget-object v2, Lg5/b;->SUCCESS:Lg5/b;

    .line 96
    .line 97
    const/16 v6, 0xe

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    const/4 v3, 0x0

    .line 101
    const/4 v4, 0x0

    .line 102
    const/4 v5, 0x0

    .line 103
    invoke-direct/range {v1 .. v7}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 104
    .line 105
    .line 106
    return-object v1

    .line 107
    :goto_3
    sget-object p2, Lcom/onesignal/common/g;->INSTANCE:Lcom/onesignal/common/g;

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p2, v0}, Lcom/onesignal/common/g;->getResponseStatusType(I)Lcom/onesignal/common/g$a;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    sget-object v0, Lcom/onesignal/user/internal/operations/impl/executors/k;->$EnumSwitchMapping$0:[I

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    aget p2, v0, p2

    .line 124
    .line 125
    if-ne p2, v8, :cond_4

    .line 126
    .line 127
    new-instance v0, Lg5/a;

    .line 128
    .line 129
    sget-object v1, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    const/4 v5, 0x6

    .line 136
    const/4 v6, 0x0

    .line 137
    const/4 v2, 0x0

    .line 138
    const/4 v3, 0x0

    .line 139
    invoke-direct/range {v0 .. v6}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_4
    new-instance v1, Lg5/a;

    .line 144
    .line 145
    sget-object v2, Lg5/b;->FAIL_NORETRY:Lg5/b;

    .line 146
    .line 147
    const/16 v6, 0xe

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v3, 0x0

    .line 151
    const/4 v4, 0x0

    .line 152
    const/4 v5, 0x0

    .line 153
    invoke-direct/range {v1 .. v7}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 154
    .line 155
    .line 156
    move-object v0, v1

    .line 157
    :goto_4
    return-object v0
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

.method private final updateSubscription(Lr6/p;Ljava/util/List;Lm8/d;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/p;",
            "Ljava/util/List<",
            "+",
            "Lg5/g;",
            ">;",
            "Lm8/d<",
            "-",
            "Lg5/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, Lcom/onesignal/user/internal/operations/impl/executors/j$e;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;

    .line 11
    .line 12
    iget v3, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->label:I

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
    iput v3, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/onesignal/user/internal/operations/impl/executors/j$e;-><init>(Lcom/onesignal/user/internal/operations/impl/executors/j;Lm8/d;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Ln8/a;->s:Ln8/a;

    .line 32
    .line 33
    iget v4, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->label:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v7, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget-object v3, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Lr6/p;

    .line 49
    .line 50
    iget-object v2, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lcom/onesignal/user/internal/operations/impl/executors/j;

    .line 53
    .line 54
    :goto_1
    :try_start_0
    invoke-static {v0}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :catch_0
    move-exception v0

    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_2
    iget-object v3, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$1:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v3, Lr6/p;

    .line 73
    .line 74
    iget-object v2, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lcom/onesignal/user/internal/operations/impl/executors/j;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    iget-object v4, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$2:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v4, Lr6/p;

    .line 82
    .line 83
    iget-object v8, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$1:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v8, Lr6/p;

    .line 86
    .line 87
    iget-object v9, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$0:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v9, Lcom/onesignal/user/internal/operations/impl/executors/j;

    .line 90
    .line 91
    :try_start_1
    invoke-static {v0}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_1 .. :try_end_1} :catch_1

    .line 92
    .line 93
    .line 94
    goto/16 :goto_2

    .line 95
    .line 96
    :catch_1
    move-exception v0

    .line 97
    move-object v3, v4

    .line 98
    move-object v2, v9

    .line 99
    goto/16 :goto_5

    .line 100
    .line 101
    :cond_4
    invoke-static {v0}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-static/range {p2 .. p2}, Li8/k;->b0(Ljava/util/List;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v4, "null cannot be cast to non-null type com.onesignal.user.internal.operations.UpdateSubscriptionOperation"

    .line 109
    .line 110
    invoke-static {v0, v4}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    move-object v4, v0

    .line 114
    check-cast v4, Lr6/p;

    .line 115
    .line 116
    :try_start_2
    new-instance v8, Ln6/h;

    .line 117
    .line 118
    invoke-virtual {v4}, Lr6/p;->getType()Lv6/g;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {v1, v0}, Lcom/onesignal/user/internal/operations/impl/executors/j;->convert(Lv6/g;)Ln6/j;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-virtual {v4}, Lr6/p;->getAddress()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    invoke-virtual {v4}, Lr6/p;->getEnabled()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    invoke-virtual {v4}, Lr6/p;->getStatus()Lv6/f;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Lv6/f;->getValue()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    new-instance v13, Ljava/lang/Integer;

    .line 147
    .line 148
    invoke-direct {v13, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 149
    .line 150
    .line 151
    const-string v14, "050200"

    .line 152
    .line 153
    sget-object v15, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 154
    .line 155
    sget-object v16, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 156
    .line 157
    sget-object v0, Lcom/onesignal/common/j;->INSTANCE:Lcom/onesignal/common/j;

    .line 158
    .line 159
    invoke-virtual {v0}, Lcom/onesignal/common/j;->isRooted()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object v17

    .line 167
    sget-object v0, Lcom/onesignal/common/c;->INSTANCE:Lcom/onesignal/common/c;

    .line 168
    .line 169
    iget-object v9, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_applicationService:LX4/f;

    .line 170
    .line 171
    invoke-interface {v9}, LX4/f;->getAppContext()Landroid/content/Context;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    invoke-virtual {v0, v9}, Lcom/onesignal/common/c;->getNetType(Landroid/content/Context;)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v18

    .line 179
    iget-object v9, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_applicationService:LX4/f;

    .line 180
    .line 181
    invoke-interface {v9}, LX4/f;->getAppContext()Landroid/content/Context;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    invoke-virtual {v0, v9}, Lcom/onesignal/common/c;->getCarrierName(Landroid/content/Context;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v19

    .line 189
    sget-object v0, Lcom/onesignal/common/AndroidUtils;->INSTANCE:Lcom/onesignal/common/AndroidUtils;

    .line 190
    .line 191
    iget-object v9, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_applicationService:LX4/f;

    .line 192
    .line 193
    invoke-interface {v9}, LX4/f;->getAppContext()Landroid/content/Context;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    invoke-virtual {v0, v9}, Lcom/onesignal/common/AndroidUtils;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v20

    .line 201
    const/4 v9, 0x0

    .line 202
    invoke-direct/range {v8 .. v20}, Ln6/h;-><init>(Ljava/lang/String;Ln6/j;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget-object v0, v1, Lcom/onesignal/user/internal/operations/impl/executors/j;->_subscriptionBackend:Ln6/c;

    .line 206
    .line 207
    invoke-virtual {v4}, Lr6/p;->getAppId()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    invoke-virtual {v4}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    iput-object v1, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$0:Ljava/lang/Object;

    .line 216
    .line 217
    move-object/from16 v11, p1

    .line 218
    .line 219
    iput-object v11, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$1:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v4, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$2:Ljava/lang/Object;

    .line 222
    .line 223
    iput v7, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->label:I

    .line 224
    .line 225
    invoke-interface {v0, v9, v10, v8, v2}, Ln6/c;->updateSubscription(Ljava/lang/String;Ljava/lang/String;Ln6/h;Lm8/d;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0
    :try_end_2
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_2 .. :try_end_2} :catch_2

    .line 229
    if-ne v0, v3, :cond_5

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_5
    move-object v9, v1

    .line 233
    move-object v8, v11

    .line 234
    :goto_2
    :try_start_3
    check-cast v0, LQ4/b;

    .line 235
    .line 236
    const/4 v10, 0x0

    .line 237
    if-eqz v0, :cond_6

    .line 238
    .line 239
    iget-object v5, v9, Lcom/onesignal/user/internal/operations/impl/executors/j;->_consistencyManager:LS4/c;

    .line 240
    .line 241
    invoke-virtual {v8}, Lr6/p;->getOnesignalId()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    sget-object v11, LR4/a;->SUBSCRIPTION:LR4/a;

    .line 246
    .line 247
    iput-object v9, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$0:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v4, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$1:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object v10, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$2:Ljava/lang/Object;

    .line 252
    .line 253
    iput v6, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->label:I

    .line 254
    .line 255
    invoke-interface {v5, v8, v11, v0, v2}, LS4/c;->setRywData(Ljava/lang/String;LS4/b;LQ4/b;Lm8/d;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-ne v0, v3, :cond_7

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_6
    iget-object v0, v9, Lcom/onesignal/user/internal/operations/impl/executors/j;->_consistencyManager:LS4/c;

    .line 263
    .line 264
    const-string v6, "IamFetchReadyCondition"

    .line 265
    .line 266
    iput-object v9, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$0:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object v4, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$1:Ljava/lang/Object;

    .line 269
    .line 270
    iput-object v10, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->L$2:Ljava/lang/Object;

    .line 271
    .line 272
    iput v5, v2, Lcom/onesignal/user/internal/operations/impl/executors/j$e;->label:I

    .line 273
    .line 274
    invoke-interface {v0, v6, v2}, LS4/c;->resolveConditionsWithID(Ljava/lang/String;Lm8/d;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0
    :try_end_3
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_3 .. :try_end_3} :catch_1

    .line 278
    if-ne v0, v3, :cond_7

    .line 279
    .line 280
    :goto_3
    return-object v3

    .line 281
    :cond_7
    :goto_4
    new-instance v4, Lg5/a;

    .line 282
    .line 283
    sget-object v5, Lg5/b;->SUCCESS:Lg5/b;

    .line 284
    .line 285
    const/16 v9, 0xe

    .line 286
    .line 287
    const/4 v10, 0x0

    .line 288
    const/4 v6, 0x0

    .line 289
    const/4 v7, 0x0

    .line 290
    const/4 v8, 0x0

    .line 291
    invoke-direct/range {v4 .. v10}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 292
    .line 293
    .line 294
    return-object v4

    .line 295
    :catch_2
    move-exception v0

    .line 296
    move-object v2, v1

    .line 297
    move-object v3, v4

    .line 298
    :goto_5
    sget-object v4, Lcom/onesignal/common/g;->INSTANCE:Lcom/onesignal/common/g;

    .line 299
    .line 300
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    invoke-virtual {v4, v5}, Lcom/onesignal/common/g;->getResponseStatusType(I)Lcom/onesignal/common/g$a;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    sget-object v5, Lcom/onesignal/user/internal/operations/impl/executors/k;->$EnumSwitchMapping$0:[I

    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    aget v4, v5, v4

    .line 315
    .line 316
    if-eq v4, v7, :cond_c

    .line 317
    .line 318
    const/4 v5, 0x5

    .line 319
    if-eq v4, v5, :cond_8

    .line 320
    .line 321
    new-instance v6, Lg5/a;

    .line 322
    .line 323
    sget-object v7, Lg5/b;->FAIL_NORETRY:Lg5/b;

    .line 324
    .line 325
    const/16 v11, 0xe

    .line 326
    .line 327
    const/4 v12, 0x0

    .line 328
    const/4 v8, 0x0

    .line 329
    const/4 v9, 0x0

    .line 330
    const/4 v10, 0x0

    .line 331
    invoke-direct/range {v6 .. v12}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 332
    .line 333
    .line 334
    goto/16 :goto_7

    .line 335
    .line 336
    :cond_8
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    const/16 v5, 0x194

    .line 341
    .line 342
    if-ne v4, v5, :cond_b

    .line 343
    .line 344
    invoke-virtual {v3}, Lr6/p;->getOnesignalId()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-virtual {v3}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    invoke-static {v4}, Li8/l;->C([Ljava/lang/Object;)Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    check-cast v4, Ljava/lang/Iterable;

    .line 361
    .line 362
    instance-of v5, v4, Ljava/util/Collection;

    .line 363
    .line 364
    if-eqz v5, :cond_9

    .line 365
    .line 366
    move-object v5, v4

    .line 367
    check-cast v5, Ljava/util/Collection;

    .line 368
    .line 369
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-eqz v5, :cond_9

    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_9
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    if-eqz v5, :cond_b

    .line 385
    .line 386
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    check-cast v5, Ljava/lang/String;

    .line 391
    .line 392
    iget-object v6, v2, Lcom/onesignal/user/internal/operations/impl/executors/j;->_newRecordState:Lt6/a;

    .line 393
    .line 394
    invoke-virtual {v6, v5}, Lt6/a;->isInMissingRetryWindow(Ljava/lang/String;)Z

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    if-eqz v5, :cond_a

    .line 399
    .line 400
    new-instance v6, Lg5/a;

    .line 401
    .line 402
    sget-object v7, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 403
    .line 404
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v10

    .line 408
    const/4 v11, 0x6

    .line 409
    const/4 v12, 0x0

    .line 410
    const/4 v8, 0x0

    .line 411
    const/4 v9, 0x0

    .line 412
    invoke-direct/range {v6 .. v12}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 413
    .line 414
    .line 415
    return-object v6

    .line 416
    :cond_b
    :goto_6
    new-instance v7, Lg5/a;

    .line 417
    .line 418
    sget-object v8, Lg5/b;->FAIL_NORETRY:Lg5/b;

    .line 419
    .line 420
    new-instance v9, Lr6/a;

    .line 421
    .line 422
    invoke-virtual {v3}, Lr6/p;->getAppId()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v10

    .line 426
    invoke-virtual {v3}, Lr6/p;->getOnesignalId()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v11

    .line 430
    invoke-virtual {v3}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v12

    .line 434
    invoke-virtual {v3}, Lr6/p;->getType()Lv6/g;

    .line 435
    .line 436
    .line 437
    move-result-object v13

    .line 438
    invoke-virtual {v3}, Lr6/p;->getEnabled()Z

    .line 439
    .line 440
    .line 441
    move-result v14

    .line 442
    invoke-virtual {v3}, Lr6/p;->getAddress()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v15

    .line 446
    invoke-virtual {v3}, Lr6/p;->getStatus()Lv6/f;

    .line 447
    .line 448
    .line 449
    move-result-object v16

    .line 450
    invoke-direct/range {v9 .. v16}, Lr6/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv6/g;ZLjava/lang/String;Lv6/f;)V

    .line 451
    .line 452
    .line 453
    invoke-static {v9}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v10

    .line 457
    const/16 v12, 0xa

    .line 458
    .line 459
    const/4 v13, 0x0

    .line 460
    const/4 v9, 0x0

    .line 461
    const/4 v11, 0x0

    .line 462
    invoke-direct/range {v7 .. v13}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 463
    .line 464
    .line 465
    move-object v6, v7

    .line 466
    goto :goto_7

    .line 467
    :cond_c
    new-instance v8, Lg5/a;

    .line 468
    .line 469
    sget-object v9, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 470
    .line 471
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 472
    .line 473
    .line 474
    move-result-object v12

    .line 475
    const/4 v13, 0x6

    .line 476
    const/4 v14, 0x0

    .line 477
    const/4 v10, 0x0

    .line 478
    const/4 v11, 0x0

    .line 479
    invoke-direct/range {v8 .. v14}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 480
    .line 481
    .line 482
    move-object v6, v8

    .line 483
    :goto_7
    return-object v6
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
.end method


# virtual methods
.method public execute(Ljava/util/List;Lm8/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lg5/g;",
            ">;",
            "Lm8/d<",
            "-",
            "Lg5/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ln5/b;->DEBUG:Ln5/b;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "SubscriptionOperationExecutor(operations: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x29

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, Lcom/onesignal/debug/internal/logging/b;->log(Ln5/b;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Li8/k;->T(Ljava/util/List;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lg5/g;

    .line 30
    .line 31
    instance-of v1, v0, Lr6/a;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    check-cast v0, Lr6/a;

    .line 36
    .line 37
    invoke-direct {p0, v0, p1, p2}, Lcom/onesignal/user/internal/operations/impl/executors/j;->createSubscription(Lr6/a;Ljava/util/List;Lm8/d;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_0
    move-object v1, p1

    .line 43
    check-cast v1, Ljava/lang/Iterable;

    .line 44
    .line 45
    instance-of v2, v1, Ljava/util/Collection;

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    move-object v2, v1

    .line 51
    check-cast v2, Ljava/util/Collection;

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_6

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Lg5/g;

    .line 75
    .line 76
    instance-of v4, v4, Lr6/c;

    .line 77
    .line 78
    if-eqz v4, :cond_2

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-gt v0, v3, :cond_5

    .line 85
    .line 86
    new-instance p1, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    instance-of v2, v1, Lr6/c;

    .line 106
    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    invoke-static {p1}, Li8/k;->T(Ljava/util/List;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Lr6/c;

    .line 118
    .line 119
    invoke-direct {p0, p1, p2}, Lcom/onesignal/user/internal/operations/impl/executors/j;->deleteSubscription(Lr6/c;Lm8/d;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    :cond_5
    new-instance p2, Ljava/lang/Exception;

    .line 125
    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v1, "Only supports one operation! Attempted operations:\n"

    .line 129
    .line 130
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p2

    .line 144
    :cond_6
    :goto_1
    instance-of v1, v0, Lr6/p;

    .line 145
    .line 146
    if-eqz v1, :cond_7

    .line 147
    .line 148
    check-cast v0, Lr6/p;

    .line 149
    .line 150
    invoke-direct {p0, v0, p1, p2}, Lcom/onesignal/user/internal/operations/impl/executors/j;->updateSubscription(Lr6/p;Ljava/util/List;Lm8/d;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    return-object p1

    .line 155
    :cond_7
    instance-of v1, v0, Lr6/o;

    .line 156
    .line 157
    if-eqz v1, :cond_9

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-gt v1, v3, :cond_8

    .line 164
    .line 165
    check-cast v0, Lr6/o;

    .line 166
    .line 167
    invoke-direct {p0, v0, p2}, Lcom/onesignal/user/internal/operations/impl/executors/j;->transferSubscription(Lr6/o;Lm8/d;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    return-object p1

    .line 172
    :cond_8
    new-instance p2, Ljava/lang/Exception;

    .line 173
    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v1, "TransferSubscriptionOperation only supports one operation! Attempted operations:\n"

    .line 177
    .line 178
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw p2

    .line 192
    :cond_9
    new-instance p1, Ljava/lang/Exception;

    .line 193
    .line 194
    new-instance p2, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    const-string v1, "Unrecognized operation: "

    .line 197
    .line 198
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw p1
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

.method public getOperations()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "delete-subscription"

    .line 2
    .line 3
    const-string v1, "transfer-subscription"

    .line 4
    .line 5
    const-string v2, "create-subscription"

    .line 6
    .line 7
    const-string v3, "update-subscription"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Li8/l;->C([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
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
