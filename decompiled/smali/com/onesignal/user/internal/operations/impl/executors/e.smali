.class public final Lcom/onesignal/user/internal/operations/impl/executors/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/onesignal/user/internal/operations/impl/executors/e$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/onesignal/user/internal/operations/impl/executors/e$a;

.field public static final LOGIN_USER:Ljava/lang/String; = "login-user"


# instance fields
.field private final _application:LX4/f;

.field private final _configModelStore:Lcom/onesignal/core/internal/config/b;

.field private final _deviceService:Lc5/c;

.field private final _identityModelStore:Lq6/b;

.field private final _identityOperationExecutor:Lcom/onesignal/user/internal/operations/impl/executors/a;

.field private final _languageContext:Le5/a;

.field private final _propertiesModelStore:Lcom/onesignal/user/internal/properties/b;

.field private final _subscriptionsModelStore:Lv6/e;

.field private final _userBackend:Ln6/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/onesignal/user/internal/operations/impl/executors/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/onesignal/user/internal/operations/impl/executors/e$a;-><init>(Lv8/e;)V

    sput-object v0, Lcom/onesignal/user/internal/operations/impl/executors/e;->Companion:Lcom/onesignal/user/internal/operations/impl/executors/e$a;

    return-void
.end method

.method public constructor <init>(Lcom/onesignal/user/internal/operations/impl/executors/a;LX4/f;Lc5/c;Ln6/d;Lq6/b;Lcom/onesignal/user/internal/properties/b;Lv6/e;Lcom/onesignal/core/internal/config/b;Le5/a;)V
    .locals 1

    .line 1
    const-string v0, "_identityOperationExecutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "_application"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "_deviceService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "_userBackend"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "_identityModelStore"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "_propertiesModelStore"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "_subscriptionsModelStore"

    .line 32
    .line 33
    invoke-static {p7, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "_configModelStore"

    .line 37
    .line 38
    invoke-static {p8, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "_languageContext"

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
    iput-object p1, p0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_identityOperationExecutor:Lcom/onesignal/user/internal/operations/impl/executors/a;

    .line 50
    .line 51
    iput-object p2, p0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_application:LX4/f;

    .line 52
    .line 53
    iput-object p3, p0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_deviceService:Lc5/c;

    .line 54
    .line 55
    iput-object p4, p0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_userBackend:Ln6/d;

    .line 56
    .line 57
    iput-object p5, p0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_identityModelStore:Lq6/b;

    .line 58
    .line 59
    iput-object p6, p0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_propertiesModelStore:Lcom/onesignal/user/internal/properties/b;

    .line 60
    .line 61
    iput-object p7, p0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_subscriptionsModelStore:Lv6/e;

    .line 62
    .line 63
    iput-object p8, p0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    .line 64
    .line 65
    iput-object p9, p0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_languageContext:Le5/a;

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

.method public static final synthetic access$createUser(Lcom/onesignal/user/internal/operations/impl/executors/e;Lr6/f;Ljava/util/List;Lm8/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/onesignal/user/internal/operations/impl/executors/e;->createUser(Lr6/f;Ljava/util/List;Lm8/d;)Ljava/lang/Object;

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

.method public static final synthetic access$loginUser(Lcom/onesignal/user/internal/operations/impl/executors/e;Lr6/f;Ljava/util/List;Lm8/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/onesignal/user/internal/operations/impl/executors/e;->loginUser(Lr6/f;Ljava/util/List;Lm8/d;)Ljava/lang/Object;

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

.method private final createSubscriptionsFromOperation(Lr6/a;Ljava/util/Map;)Ljava/util/Map;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln6/h;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln6/h;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 19
    invoke-static/range {p2 .. p2}, Li8/y;->C(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 20
    invoke-virtual/range {p1 .. p1}, Lr6/a;->getType()Lv6/g;

    move-result-object v2

    sget-object v3, Lcom/onesignal/user/internal/operations/impl/executors/f;->$EnumSwitchMapping$2:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    .line 21
    sget-object v2, Ln6/j;->Companion:Ln6/j$a;

    iget-object v3, v0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_deviceService:Lc5/c;

    invoke-interface {v3}, Lc5/c;->getDeviceType()Lc5/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln6/j$a;->fromDeviceType(Lc5/a;)Ln6/j;

    move-result-object v2

    :goto_0
    move-object v5, v2

    goto :goto_1

    .line 22
    :cond_0
    sget-object v2, Ln6/j;->EMAIL:Ln6/j;

    goto :goto_0

    .line 23
    :cond_1
    sget-object v2, Ln6/j;->SMS:Ln6/j;

    goto :goto_0

    .line 24
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lr6/a;->getSubscriptionId()Ljava/lang/String;

    move-result-object v2

    .line 25
    new-instance v3, Ln6/h;

    .line 26
    invoke-virtual/range {p1 .. p1}, Lr6/a;->getAddress()Ljava/lang/String;

    move-result-object v6

    .line 27
    invoke-virtual/range {p1 .. p1}, Lr6/a;->getEnabled()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 28
    invoke-virtual/range {p1 .. p1}, Lr6/a;->getStatus()Lv6/f;

    move-result-object v4

    invoke-virtual {v4}, Lv6/f;->getValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 29
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 30
    sget-object v11, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 31
    sget-object v4, Lcom/onesignal/common/j;->INSTANCE:Lcom/onesignal/common/j;

    invoke-virtual {v4}, Lcom/onesignal/common/j;->isRooted()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    .line 32
    sget-object v4, Lcom/onesignal/common/c;->INSTANCE:Lcom/onesignal/common/c;

    iget-object v9, v0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_application:LX4/f;

    invoke-interface {v9}, LX4/f;->getAppContext()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/onesignal/common/c;->getNetType(Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object v13

    .line 33
    iget-object v9, v0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_application:LX4/f;

    invoke-interface {v9}, LX4/f;->getAppContext()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/onesignal/common/c;->getCarrierName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v14

    .line 34
    sget-object v4, Lcom/onesignal/common/AndroidUtils;->INSTANCE:Lcom/onesignal/common/AndroidUtils;

    iget-object v9, v0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_application:LX4/f;

    invoke-interface {v9}, LX4/f;->getAppContext()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/onesignal/common/AndroidUtils;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v15

    const/4 v4, 0x0

    .line 35
    const-string v9, "050200"

    invoke-direct/range {v3 .. v15}, Ln6/h;-><init>(Ljava/lang/String;Ln6/j;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method private final createSubscriptionsFromOperation(Lr6/c;Ljava/util/Map;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln6/h;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln6/h;",
            ">;"
        }
    .end annotation

    .line 53
    invoke-static {p2}, Li8/y;->C(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    .line 54
    invoke-virtual {p1}, Lr6/c;->getSubscriptionId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method private final createSubscriptionsFromOperation(Lr6/o;Ljava/util/Map;)Ljava/util/Map;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/o;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln6/h;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln6/h;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    .line 1
    invoke-static {v0}, Li8/y;->C(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 2
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v2

    .line 4
    new-instance v3, Ln6/h;

    .line 5
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v5, Ln6/h;

    invoke-virtual {v5}, Ln6/h;->getType()Ln6/j;

    move-result-object v5

    .line 7
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v6, Ln6/h;

    invoke-virtual {v6}, Ln6/h;->getToken()Ljava/lang/String;

    move-result-object v6

    .line 8
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v7, Ln6/h;

    invoke-virtual {v7}, Ln6/h;->getEnabled()Ljava/lang/Boolean;

    move-result-object v7

    .line 9
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v8, Ln6/h;

    invoke-virtual {v8}, Ln6/h;->getNotificationTypes()Ljava/lang/Integer;

    move-result-object v8

    .line 10
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v9, Ln6/h;

    invoke-virtual {v9}, Ln6/h;->getSdk()Ljava/lang/String;

    move-result-object v9

    .line 11
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v10, Ln6/h;

    invoke-virtual {v10}, Ln6/h;->getDeviceModel()Ljava/lang/String;

    move-result-object v10

    .line 12
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v11, Ln6/h;

    invoke-virtual {v11}, Ln6/h;->getDeviceOS()Ljava/lang/String;

    move-result-object v11

    .line 13
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v12, Ln6/h;

    invoke-virtual {v12}, Ln6/h;->getRooted()Ljava/lang/Boolean;

    move-result-object v12

    .line 14
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v13, Ln6/h;

    invoke-virtual {v13}, Ln6/h;->getNetType()Ljava/lang/Integer;

    move-result-object v13

    .line 15
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v14}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v14, Ln6/h;

    invoke-virtual {v14}, Ln6/h;->getCarrier()Ljava/lang/String;

    move-result-object v14

    .line 16
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v0, Ln6/h;

    invoke-virtual {v0}, Ln6/h;->getAppVersion()Ljava/lang/String;

    move-result-object v15

    .line 17
    invoke-direct/range {v3 .. v15}, Ln6/h;-><init>(Ljava/lang/String;Ln6/j;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    .line 18
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ln6/h;

    invoke-virtual/range {p1 .. p1}, Lr6/o;->getSubscriptionId()Ljava/lang/String;

    move-result-object v3

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v15, 0xffe

    const/16 v16, 0x0

    invoke-direct/range {v2 .. v16}, Ln6/h;-><init>(Ljava/lang/String;Ln6/j;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILv8/e;)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method private final createSubscriptionsFromOperation(Lr6/p;Ljava/util/Map;)Ljava/util/Map;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/p;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln6/h;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln6/h;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    .line 36
    invoke-static {v0}, Li8/y;->C(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 37
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 38
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    move-result-object v2

    .line 39
    new-instance v3, Ln6/h;

    .line 40
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v4, Ln6/h;

    invoke-virtual {v4}, Ln6/h;->getId()Ljava/lang/String;

    move-result-object v4

    .line 41
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v5, Ln6/h;

    invoke-virtual {v5}, Ln6/h;->getType()Ln6/j;

    move-result-object v5

    .line 42
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getAddress()Ljava/lang/String;

    move-result-object v6

    .line 43
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getEnabled()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 44
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getStatus()Lv6/f;

    move-result-object v8

    invoke-virtual {v8}, Lv6/f;->getValue()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 45
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v9, Ln6/h;

    invoke-virtual {v9}, Ln6/h;->getSdk()Ljava/lang/String;

    move-result-object v9

    .line 46
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v10, Ln6/h;

    invoke-virtual {v10}, Ln6/h;->getDeviceModel()Ljava/lang/String;

    move-result-object v10

    .line 47
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v11, Ln6/h;

    invoke-virtual {v11}, Ln6/h;->getDeviceOS()Ljava/lang/String;

    move-result-object v11

    .line 48
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v12, Ln6/h;

    invoke-virtual {v12}, Ln6/h;->getRooted()Ljava/lang/Boolean;

    move-result-object v12

    .line 49
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v13, Ln6/h;

    invoke-virtual {v13}, Ln6/h;->getNetType()Ljava/lang/Integer;

    move-result-object v13

    .line 50
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v14}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v14, Ln6/h;

    invoke-virtual {v14}, Ln6/h;->getCarrier()Ljava/lang/String;

    move-result-object v14

    .line 51
    invoke-virtual/range {p1 .. p1}, Lr6/p;->getSubscriptionId()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    check-cast v0, Ln6/h;

    invoke-virtual {v0}, Ln6/h;->getAppVersion()Ljava/lang/String;

    move-result-object v15

    .line 52
    invoke-direct/range {v3 .. v15}, Ln6/h;-><init>(Ljava/lang/String;Ln6/j;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method private final createUser(Lr6/f;Ljava/util/List;Lm8/d;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/f;",
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
    instance-of v2, v0, Lcom/onesignal/user/internal/operations/impl/executors/e$b;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/onesignal/user/internal/operations/impl/executors/e$b;

    .line 11
    .line 12
    iget v3, v2, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->label:I

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
    iput v3, v2, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->label:I

    .line 22
    .line 23
    :goto_0
    move-object v9, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/onesignal/user/internal/operations/impl/executors/e$b;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lcom/onesignal/user/internal/operations/impl/executors/e$b;-><init>(Lcom/onesignal/user/internal/operations/impl/executors/e;Lm8/d;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v9, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, Ln8/a;->s:Ln8/a;

    .line 34
    .line 35
    iget v3, v9, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->label:I

    .line 36
    .line 37
    const/4 v10, 0x1

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    if-ne v3, v10, :cond_1

    .line 41
    .line 42
    iget-object v2, v9, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->L$3:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/util/List;

    .line 45
    .line 46
    iget-object v3, v9, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->L$2:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Ljava/util/Map;

    .line 49
    .line 50
    iget-object v4, v9, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, Lr6/f;

    .line 53
    .line 54
    iget-object v5, v9, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, Lcom/onesignal/user/internal/operations/impl/executors/e;

    .line 57
    .line 58
    :try_start_0
    invoke-static {v0}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :catch_0
    move-exception v0

    .line 64
    goto/16 :goto_c

    .line 65
    .line 66
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_2
    invoke-static {v0}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Li8/t;->s:Li8/t;

    .line 78
    .line 79
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    sget-object v3, Lcom/onesignal/common/k;->INSTANCE:Lcom/onesignal/common/k;

    .line 85
    .line 86
    invoke-virtual {v3}, Lcom/onesignal/common/k;->getTimeZoneId()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-static {v3}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    const-string v4, "timezone_id"

    .line 94
    .line 95
    invoke-interface {v7, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget-object v3, v1, Lcom/onesignal/user/internal/operations/impl/executors/e;->_languageContext:Le5/a;

    .line 99
    .line 100
    invoke-interface {v3}, Le5/a;->getLanguage()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const-string v4, "language"

    .line 105
    .line 106
    invoke-interface {v7, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {p1 .. p1}, Lr6/f;->getExternalId()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    if-eqz v3, :cond_3

    .line 114
    .line 115
    invoke-static {v0}, Li8/y;->C(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual/range {p1 .. p1}, Lr6/f;->getExternalId()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const-string v5, "external_id"

    .line 127
    .line 128
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-object v5, v3

    .line 132
    goto :goto_2

    .line 133
    :cond_3
    move-object v5, v0

    .line 134
    :goto_2
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_8

    .line 143
    .line 144
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, Lg5/g;

    .line 149
    .line 150
    instance-of v6, v4, Lr6/a;

    .line 151
    .line 152
    if-eqz v6, :cond_4

    .line 153
    .line 154
    check-cast v4, Lr6/a;

    .line 155
    .line 156
    invoke-direct {v1, v4, v0}, Lcom/onesignal/user/internal/operations/impl/executors/e;->createSubscriptionsFromOperation(Lr6/a;Ljava/util/Map;)Ljava/util/Map;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    goto :goto_3

    .line 161
    :cond_4
    instance-of v6, v4, Lr6/o;

    .line 162
    .line 163
    if-eqz v6, :cond_5

    .line 164
    .line 165
    check-cast v4, Lr6/o;

    .line 166
    .line 167
    invoke-direct {v1, v4, v0}, Lcom/onesignal/user/internal/operations/impl/executors/e;->createSubscriptionsFromOperation(Lr6/o;Ljava/util/Map;)Ljava/util/Map;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    goto :goto_3

    .line 172
    :cond_5
    instance-of v6, v4, Lr6/p;

    .line 173
    .line 174
    if-eqz v6, :cond_6

    .line 175
    .line 176
    check-cast v4, Lr6/p;

    .line 177
    .line 178
    invoke-direct {v1, v4, v0}, Lcom/onesignal/user/internal/operations/impl/executors/e;->createSubscriptionsFromOperation(Lr6/p;Ljava/util/Map;)Ljava/util/Map;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    goto :goto_3

    .line 183
    :cond_6
    instance-of v6, v4, Lr6/c;

    .line 184
    .line 185
    if-eqz v6, :cond_7

    .line 186
    .line 187
    check-cast v4, Lr6/c;

    .line 188
    .line 189
    invoke-direct {v1, v4, v0}, Lcom/onesignal/user/internal/operations/impl/executors/e;->createSubscriptionsFromOperation(Lr6/c;Ljava/util/Map;)Ljava/util/Map;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    goto :goto_3

    .line 194
    :cond_7
    new-instance v0, Ljava/lang/Exception;

    .line 195
    .line 196
    new-instance v2, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string v3, "Unrecognized operation: "

    .line 199
    .line 200
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v0

    .line 214
    :cond_8
    :try_start_1
    invoke-static {v0}, Li8/y;->y(Ljava/util/Map;)Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    iget-object v3, v1, Lcom/onesignal/user/internal/operations/impl/executors/e;->_userBackend:Ln6/d;

    .line 219
    .line 220
    invoke-virtual/range {p1 .. p1}, Lr6/f;->getAppId()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    move-object v6, v0

    .line 225
    check-cast v6, Ljava/lang/Iterable;

    .line 226
    .line 227
    new-instance v8, Ljava/util/ArrayList;

    .line 228
    .line 229
    const/16 v11, 0xa

    .line 230
    .line 231
    invoke-static {v6, v11}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    if-eqz v11, :cond_9

    .line 247
    .line 248
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v11

    .line 252
    check-cast v11, Lh8/f;

    .line 253
    .line 254
    iget-object v11, v11, Lh8/f;->t:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v11, Ln6/h;

    .line 257
    .line 258
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_9
    iget-object v6, v1, Lcom/onesignal/user/internal/operations/impl/executors/e;->_identityModelStore:Lq6/b;

    .line 263
    .line 264
    invoke-virtual {v6}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    check-cast v6, Lq6/a;

    .line 269
    .line 270
    invoke-virtual {v6}, Lq6/a;->getJwtToken()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    iput-object v1, v9, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->L$0:Ljava/lang/Object;

    .line 275
    .line 276
    move-object/from16 v11, p1

    .line 277
    .line 278
    iput-object v11, v9, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->L$1:Ljava/lang/Object;

    .line 279
    .line 280
    iput-object v5, v9, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->L$2:Ljava/lang/Object;

    .line 281
    .line 282
    iput-object v0, v9, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->L$3:Ljava/lang/Object;

    .line 283
    .line 284
    iput v10, v9, Lcom/onesignal/user/internal/operations/impl/executors/e$b;->label:I

    .line 285
    .line 286
    move-object/from16 v21, v8

    .line 287
    .line 288
    move-object v8, v6

    .line 289
    move-object/from16 v6, v21

    .line 290
    .line 291
    invoke-interface/range {v3 .. v9}, Ln6/d;->createUser(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lm8/d;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    if-ne v3, v2, :cond_a

    .line 296
    .line 297
    return-object v2

    .line 298
    :cond_a
    move-object v2, v0

    .line 299
    move-object v0, v3

    .line 300
    move-object v3, v5

    .line 301
    move-object v4, v11

    .line 302
    move-object v5, v1

    .line 303
    :goto_5
    check-cast v0, Ln6/a;

    .line 304
    .line 305
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 306
    .line 307
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Ln6/a;->getIdentities()Ljava/util/Map;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    const-string v7, "onesignal_id"

    .line 315
    .line 316
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    invoke-static {v6}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    check-cast v6, Ljava/lang/String;

    .line 324
    .line 325
    invoke-virtual {v4}, Lr6/f;->getOnesignalId()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    invoke-interface {v13, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    iget-object v7, v5, Lcom/onesignal/user/internal/operations/impl/executors/e;->_identityModelStore:Lq6/b;

    .line 333
    .line 334
    invoke-virtual {v7}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    move-object v14, v7

    .line 339
    check-cast v14, Lq6/a;

    .line 340
    .line 341
    iget-object v7, v5, Lcom/onesignal/user/internal/operations/impl/executors/e;->_propertiesModelStore:Lcom/onesignal/user/internal/properties/b;

    .line 342
    .line 343
    invoke-virtual {v7}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    check-cast v7, Lcom/onesignal/user/internal/properties/a;

    .line 348
    .line 349
    invoke-virtual {v14}, Lq6/a;->getOnesignalId()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    invoke-virtual {v4}, Lr6/f;->getOnesignalId()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v9

    .line 357
    invoke-static {v8, v9}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v8

    .line 361
    if-eqz v8, :cond_b

    .line 362
    .line 363
    const-string v15, "onesignal_id"

    .line 364
    .line 365
    const-string v17, "HYDRATE"

    .line 366
    .line 367
    const/16 v20, 0x0

    .line 368
    .line 369
    const/16 v18, 0x0

    .line 370
    .line 371
    const/16 v19, 0x8

    .line 372
    .line 373
    move-object/from16 v16, v6

    .line 374
    .line 375
    invoke-static/range {v14 .. v20}, Lcom/onesignal/common/modeling/i;->setStringProperty$default(Lcom/onesignal/common/modeling/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_b
    move-object/from16 v16, v6

    .line 380
    .line 381
    :goto_6
    invoke-virtual {v7}, Lcom/onesignal/user/internal/properties/a;->getOnesignalId()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    invoke-virtual {v4}, Lr6/f;->getOnesignalId()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v8

    .line 389
    invoke-static {v6, v8}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v6

    .line 393
    if-eqz v6, :cond_c

    .line 394
    .line 395
    const-string v15, "onesignalId"

    .line 396
    .line 397
    const-string v17, "HYDRATE"

    .line 398
    .line 399
    const/16 v20, 0x0

    .line 400
    .line 401
    const/16 v18, 0x0

    .line 402
    .line 403
    const/16 v19, 0x8

    .line 404
    .line 405
    move-object v14, v7

    .line 406
    invoke-static/range {v14 .. v20}, Lcom/onesignal/common/modeling/i;->setStringProperty$default(Lcom/onesignal/common/modeling/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    move-object/from16 v6, v16

    .line 410
    .line 411
    goto :goto_7

    .line 412
    :cond_c
    move-object/from16 v6, v16

    .line 413
    .line 414
    :goto_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 415
    .line 416
    .line 417
    move-result v7

    .line 418
    const/4 v8, 0x0

    .line 419
    :goto_8
    if-ge v8, v7, :cond_10

    .line 420
    .line 421
    invoke-virtual {v0}, Ln6/a;->getSubscriptions()Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v9

    .line 425
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 426
    .line 427
    .line 428
    move-result v9

    .line 429
    if-lt v8, v9, :cond_d

    .line 430
    .line 431
    goto :goto_9

    .line 432
    :cond_d
    invoke-virtual {v0}, Ln6/a;->getSubscriptions()Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object v9

    .line 436
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v9

    .line 440
    check-cast v9, Ln6/h;

    .line 441
    .line 442
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v11

    .line 446
    check-cast v11, Lh8/f;

    .line 447
    .line 448
    iget-object v11, v11, Lh8/f;->s:Ljava/lang/Object;

    .line 449
    .line 450
    invoke-virtual {v9}, Ln6/h;->getId()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v12

    .line 454
    invoke-static {v12}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    invoke-interface {v13, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    iget-object v11, v5, Lcom/onesignal/user/internal/operations/impl/executors/e;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    .line 461
    .line 462
    invoke-virtual {v11}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 463
    .line 464
    .line 465
    move-result-object v11

    .line 466
    check-cast v11, Lcom/onesignal/core/internal/config/a;

    .line 467
    .line 468
    invoke-virtual {v11}, Lcom/onesignal/core/internal/config/a;->getPushSubscriptionId()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v11

    .line 472
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v12

    .line 476
    check-cast v12, Lh8/f;

    .line 477
    .line 478
    iget-object v12, v12, Lh8/f;->s:Ljava/lang/Object;

    .line 479
    .line 480
    invoke-static {v11, v12}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v11

    .line 484
    if-eqz v11, :cond_e

    .line 485
    .line 486
    iget-object v11, v5, Lcom/onesignal/user/internal/operations/impl/executors/e;->_configModelStore:Lcom/onesignal/core/internal/config/b;

    .line 487
    .line 488
    invoke-virtual {v11}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 489
    .line 490
    .line 491
    move-result-object v11

    .line 492
    check-cast v11, Lcom/onesignal/core/internal/config/a;

    .line 493
    .line 494
    invoke-virtual {v9}, Ln6/h;->getId()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v12

    .line 498
    invoke-virtual {v11, v12}, Lcom/onesignal/core/internal/config/a;->setPushSubscriptionId(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    :cond_e
    iget-object v11, v5, Lcom/onesignal/user/internal/operations/impl/executors/e;->_subscriptionsModelStore:Lv6/e;

    .line 502
    .line 503
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v12

    .line 507
    check-cast v12, Lh8/f;

    .line 508
    .line 509
    iget-object v12, v12, Lh8/f;->s:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v12, Ljava/lang/String;

    .line 512
    .line 513
    invoke-virtual {v11, v12}, Lcom/onesignal/common/modeling/k;->get(Ljava/lang/String;)Lcom/onesignal/common/modeling/i;

    .line 514
    .line 515
    .line 516
    move-result-object v11

    .line 517
    move-object v14, v11

    .line 518
    check-cast v14, Lv6/d;

    .line 519
    .line 520
    if-eqz v14, :cond_f

    .line 521
    .line 522
    const-string v15, "id"

    .line 523
    .line 524
    invoke-virtual {v9}, Ln6/h;->getId()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v16

    .line 528
    const-string v17, "HYDRATE"

    .line 529
    .line 530
    const/16 v20, 0x0

    .line 531
    .line 532
    const/16 v18, 0x0

    .line 533
    .line 534
    const/16 v19, 0x8

    .line 535
    .line 536
    invoke-static/range {v14 .. v20}, Lcom/onesignal/common/modeling/i;->setStringProperty$default(Lcom/onesignal/common/modeling/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 540
    .line 541
    goto :goto_8

    .line 542
    :cond_10
    :goto_9
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    if-nez v0, :cond_11

    .line 547
    .line 548
    new-instance v0, Lr6/h;

    .line 549
    .line 550
    invoke-virtual {v4}, Lr6/f;->getAppId()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    invoke-direct {v0, v2, v6}, Lr6/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-static {v0}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    :goto_a
    move-object v14, v0

    .line 562
    goto :goto_b

    .line 563
    :cond_11
    const/4 v0, 0x0

    .line 564
    goto :goto_a

    .line 565
    :goto_b
    new-instance v11, Lg5/a;

    .line 566
    .line 567
    sget-object v12, Lg5/b;->SUCCESS:Lg5/b;

    .line 568
    .line 569
    const/16 v17, 0x0

    .line 570
    .line 571
    const/4 v15, 0x0

    .line 572
    const/16 v16, 0x8

    .line 573
    .line 574
    invoke-direct/range {v11 .. v17}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V
    :try_end_1
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_1 .. :try_end_1} :catch_0

    .line 575
    .line 576
    .line 577
    return-object v11

    .line 578
    :goto_c
    sget-object v2, Lcom/onesignal/common/g;->INSTANCE:Lcom/onesignal/common/g;

    .line 579
    .line 580
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 581
    .line 582
    .line 583
    move-result v3

    .line 584
    invoke-virtual {v2, v3}, Lcom/onesignal/common/g;->getResponseStatusType(I)Lcom/onesignal/common/g$a;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    sget-object v3, Lcom/onesignal/user/internal/operations/impl/executors/f;->$EnumSwitchMapping$1:[I

    .line 589
    .line 590
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    aget v2, v3, v2

    .line 595
    .line 596
    if-eq v2, v10, :cond_13

    .line 597
    .line 598
    const/4 v0, 0x2

    .line 599
    if-eq v2, v0, :cond_12

    .line 600
    .line 601
    new-instance v3, Lg5/a;

    .line 602
    .line 603
    sget-object v4, Lg5/b;->FAIL_PAUSE_OPREPO:Lg5/b;

    .line 604
    .line 605
    const/4 v6, 0x0

    .line 606
    const/4 v7, 0x0

    .line 607
    const/4 v5, 0x0

    .line 608
    const/16 v8, 0xe

    .line 609
    .line 610
    const/4 v9, 0x0

    .line 611
    invoke-direct/range {v3 .. v9}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 612
    .line 613
    .line 614
    goto :goto_d

    .line 615
    :cond_12
    new-instance v4, Lg5/a;

    .line 616
    .line 617
    sget-object v5, Lg5/b;->FAIL_UNAUTHORIZED:Lg5/b;

    .line 618
    .line 619
    const/4 v7, 0x0

    .line 620
    const/4 v8, 0x0

    .line 621
    const/4 v6, 0x0

    .line 622
    const/16 v9, 0xe

    .line 623
    .line 624
    const/4 v10, 0x0

    .line 625
    invoke-direct/range {v4 .. v10}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 626
    .line 627
    .line 628
    move-object v3, v4

    .line 629
    goto :goto_d

    .line 630
    :cond_13
    new-instance v5, Lg5/a;

    .line 631
    .line 632
    sget-object v6, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 633
    .line 634
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 635
    .line 636
    .line 637
    move-result-object v9

    .line 638
    const/4 v7, 0x0

    .line 639
    const/4 v8, 0x0

    .line 640
    const/4 v10, 0x6

    .line 641
    const/4 v11, 0x0

    .line 642
    invoke-direct/range {v5 .. v11}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 643
    .line 644
    .line 645
    move-object v3, v5

    .line 646
    :goto_d
    return-object v3
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

.method private final loginUser(Lr6/f;Ljava/util/List;Lm8/d;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/f;",
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
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, Lcom/onesignal/user/internal/operations/impl/executors/e$c;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;

    .line 15
    .line 16
    iget v5, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->label:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->label:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, Lcom/onesignal/user/internal/operations/impl/executors/e$c;-><init>(Lcom/onesignal/user/internal/operations/impl/executors/e;Lm8/d;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->result:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, Ln8/a;->s:Ln8/a;

    .line 36
    .line 37
    iget v6, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->label:I

    .line 38
    .line 39
    const/4 v7, 0x4

    .line 40
    const/4 v8, 0x3

    .line 41
    const/4 v9, 0x1

    .line 42
    const/4 v10, 0x2

    .line 43
    if-eqz v6, :cond_5

    .line 44
    .line 45
    if-eq v6, v9, :cond_4

    .line 46
    .line 47
    if-eq v6, v10, :cond_3

    .line 48
    .line 49
    if-eq v6, v8, :cond_2

    .line 50
    .line 51
    if-ne v6, v7, :cond_1

    .line 52
    .line 53
    invoke-static {v3}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object v3

    .line 57
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_2
    invoke-static {v3}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v3

    .line 69
    :cond_3
    iget-object v1, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$2:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Ljava/util/List;

    .line 72
    .line 73
    iget-object v2, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$1:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Lr6/f;

    .line 76
    .line 77
    iget-object v6, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v6, Lcom/onesignal/user/internal/operations/impl/executors/e;

    .line 80
    .line 81
    invoke-static {v3}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move-object/from16 v20, v2

    .line 85
    .line 86
    move-object v2, v1

    .line 87
    move-object/from16 v1, v20

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    invoke-static {v3}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-object v3

    .line 94
    :cond_5
    invoke-static {v3}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Lr6/f;->getExistingOnesignalId()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-eqz v3, :cond_10

    .line 102
    .line 103
    invoke-virtual {v1}, Lr6/f;->getExternalId()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    if-nez v3, :cond_6

    .line 108
    .line 109
    goto/16 :goto_3

    .line 110
    .line 111
    :cond_6
    iget-object v3, v0, Lcom/onesignal/user/internal/operations/impl/executors/e;->_identityOperationExecutor:Lcom/onesignal/user/internal/operations/impl/executors/a;

    .line 112
    .line 113
    new-instance v6, Lr6/i;

    .line 114
    .line 115
    invoke-virtual {v1}, Lr6/f;->getAppId()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    invoke-virtual {v1}, Lr6/f;->getExistingOnesignalId()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    invoke-static {v12}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Lr6/f;->getExternalId()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    invoke-static {v13}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    const-string v14, "external_id"

    .line 134
    .line 135
    invoke-direct {v6, v11, v12, v14, v13}, Lr6/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v6}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    iput-object v0, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$0:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object v1, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$1:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object v2, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$2:Ljava/lang/Object;

    .line 147
    .line 148
    iput v10, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->label:I

    .line 149
    .line 150
    invoke-virtual {v3, v6, v4}, Lcom/onesignal/user/internal/operations/impl/executors/a;->execute(Ljava/util/List;Lm8/d;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    if-ne v3, v5, :cond_7

    .line 155
    .line 156
    goto/16 :goto_4

    .line 157
    .line 158
    :cond_7
    move-object v6, v0

    .line 159
    :goto_1
    check-cast v3, Lg5/a;

    .line 160
    .line 161
    invoke-virtual {v3}, Lg5/a;->getResult()Lg5/b;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    sget-object v12, Lcom/onesignal/user/internal/operations/impl/executors/f;->$EnumSwitchMapping$0:[I

    .line 166
    .line 167
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    aget v11, v12, v11

    .line 172
    .line 173
    if-eq v11, v9, :cond_d

    .line 174
    .line 175
    const/16 v9, 0x22

    .line 176
    .line 177
    const/4 v12, 0x0

    .line 178
    if-eq v11, v10, :cond_b

    .line 179
    .line 180
    if-eq v11, v8, :cond_9

    .line 181
    .line 182
    if-eq v11, v7, :cond_8

    .line 183
    .line 184
    new-instance v13, Lg5/a;

    .line 185
    .line 186
    invoke-virtual {v3}, Lg5/a;->getResult()Lg5/b;

    .line 187
    .line 188
    .line 189
    move-result-object v14

    .line 190
    const/16 v18, 0xe

    .line 191
    .line 192
    const/16 v19, 0x0

    .line 193
    .line 194
    const/4 v15, 0x0

    .line 195
    const/16 v16, 0x0

    .line 196
    .line 197
    const/16 v17, 0x0

    .line 198
    .line 199
    invoke-direct/range {v13 .. v19}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 200
    .line 201
    .line 202
    return-object v13

    .line 203
    :cond_8
    new-instance v1, Lg5/a;

    .line 204
    .line 205
    invoke-virtual {v3}, Lg5/a;->getResult()Lg5/b;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    const/16 v6, 0xe

    .line 210
    .line 211
    const/4 v7, 0x0

    .line 212
    const/4 v3, 0x0

    .line 213
    const/4 v4, 0x0

    .line 214
    const/4 v5, 0x0

    .line 215
    invoke-direct/range {v1 .. v7}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 216
    .line 217
    .line 218
    return-object v1

    .line 219
    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    const-string v8, "LoginUserOperationExecutor encountered error. Attempt to recover by switching to user with \"external_id\": \""

    .line 222
    .line 223
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1}, Lr6/f;->getExternalId()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-static {v3, v12, v10, v12}, Lcom/onesignal/debug/internal/logging/b;->error$default(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    iput-object v12, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$0:Ljava/lang/Object;

    .line 244
    .line 245
    iput-object v12, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$1:Ljava/lang/Object;

    .line 246
    .line 247
    iput-object v12, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$2:Ljava/lang/Object;

    .line 248
    .line 249
    iput v7, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->label:I

    .line 250
    .line 251
    invoke-direct {v6, v1, v2, v4}, Lcom/onesignal/user/internal/operations/impl/executors/e;->createUser(Lr6/f;Ljava/util/List;Lm8/d;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    if-ne v1, v5, :cond_a

    .line 256
    .line 257
    goto/16 :goto_4

    .line 258
    .line 259
    :cond_a
    return-object v1

    .line 260
    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    const-string v7, "LoginUserOperationExecutor now handling 409 response with \"code\": \"user-2\" by switching to user with \"external_id\": \""

    .line 263
    .line 264
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Lr6/f;->getExternalId()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-static {v3, v12, v10, v12}, Lcom/onesignal/debug/internal/logging/b;->debug$default(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    iput-object v12, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$0:Ljava/lang/Object;

    .line 285
    .line 286
    iput-object v12, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$1:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v12, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->L$2:Ljava/lang/Object;

    .line 289
    .line 290
    iput v8, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->label:I

    .line 291
    .line 292
    invoke-direct {v6, v1, v2, v4}, Lcom/onesignal/user/internal/operations/impl/executors/e;->createUser(Lr6/f;Ljava/util/List;Lm8/d;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    if-ne v1, v5, :cond_c

    .line 297
    .line 298
    goto/16 :goto_4

    .line 299
    .line 300
    :cond_c
    return-object v1

    .line 301
    :cond_d
    invoke-virtual {v1}, Lr6/f;->getExistingOnesignalId()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    invoke-static {v8}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    iget-object v2, v6, Lcom/onesignal/user/internal/operations/impl/executors/e;->_identityModelStore:Lq6/b;

    .line 309
    .line 310
    invoke-virtual {v2}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    check-cast v2, Lq6/a;

    .line 315
    .line 316
    invoke-virtual {v2}, Lq6/a;->getOnesignalId()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-virtual {v1}, Lr6/f;->getOnesignalId()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-static {v2, v3}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-eqz v2, :cond_e

    .line 329
    .line 330
    iget-object v2, v6, Lcom/onesignal/user/internal/operations/impl/executors/e;->_identityModelStore:Lq6/b;

    .line 331
    .line 332
    invoke-virtual {v2}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    const/16 v12, 0x8

    .line 337
    .line 338
    const/4 v13, 0x0

    .line 339
    move-object v9, v8

    .line 340
    const-string v8, "onesignal_id"

    .line 341
    .line 342
    const-string v10, "HYDRATE"

    .line 343
    .line 344
    const/4 v11, 0x0

    .line 345
    invoke-static/range {v7 .. v13}, Lcom/onesignal/common/modeling/i;->setStringProperty$default(Lcom/onesignal/common/modeling/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    goto :goto_2

    .line 349
    :cond_e
    move-object v9, v8

    .line 350
    :goto_2
    iget-object v2, v6, Lcom/onesignal/user/internal/operations/impl/executors/e;->_propertiesModelStore:Lcom/onesignal/user/internal/properties/b;

    .line 351
    .line 352
    invoke-virtual {v2}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    check-cast v2, Lcom/onesignal/user/internal/properties/a;

    .line 357
    .line 358
    invoke-virtual {v2}, Lcom/onesignal/user/internal/properties/a;->getOnesignalId()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v1}, Lr6/f;->getOnesignalId()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    invoke-static {v2, v3}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-eqz v2, :cond_f

    .line 371
    .line 372
    iget-object v2, v6, Lcom/onesignal/user/internal/operations/impl/executors/e;->_propertiesModelStore:Lcom/onesignal/user/internal/properties/b;

    .line 373
    .line 374
    invoke-virtual {v2}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    const/16 v11, 0x8

    .line 379
    .line 380
    const/4 v12, 0x0

    .line 381
    const-string v7, "onesignalId"

    .line 382
    .line 383
    move-object v8, v9

    .line 384
    const-string v9, "HYDRATE"

    .line 385
    .line 386
    const/4 v10, 0x0

    .line 387
    invoke-static/range {v6 .. v12}, Lcom/onesignal/common/modeling/i;->setStringProperty$default(Lcom/onesignal/common/modeling/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    move-object v9, v8

    .line 391
    :cond_f
    new-instance v2, Lg5/a;

    .line 392
    .line 393
    sget-object v3, Lg5/b;->SUCCESS_STARTING_ONLY:Lg5/b;

    .line 394
    .line 395
    invoke-virtual {v1}, Lr6/f;->getOnesignalId()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    new-instance v4, Lh8/f;

    .line 400
    .line 401
    invoke-direct {v4, v1, v9}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v4}, Li8/z;->t(Lh8/f;)Ljava/util/Map;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    const/16 v7, 0xc

    .line 409
    .line 410
    const/4 v8, 0x0

    .line 411
    const/4 v5, 0x0

    .line 412
    const/4 v6, 0x0

    .line 413
    invoke-direct/range {v2 .. v8}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 414
    .line 415
    .line 416
    return-object v2

    .line 417
    :cond_10
    :goto_3
    iput v9, v4, Lcom/onesignal/user/internal/operations/impl/executors/e$c;->label:I

    .line 418
    .line 419
    invoke-direct {v0, v1, v2, v4}, Lcom/onesignal/user/internal/operations/impl/executors/e;->createUser(Lr6/f;Ljava/util/List;Lm8/d;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    if-ne v1, v5, :cond_11

    .line 424
    .line 425
    :goto_4
    return-object v5

    .line 426
    :cond_11
    return-object v1
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
.end method


# virtual methods
.method public execute(Ljava/util/List;Lm8/d;)Ljava/lang/Object;
    .locals 3
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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LoginUserOperationExecutor(operation: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x29

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-static {v0, v1, v2, v1}, Lcom/onesignal/debug/internal/logging/b;->debug$default(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

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
    instance-of v1, v0, Lr6/f;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    check-cast v0, Lr6/f;

    .line 36
    .line 37
    check-cast p1, Ljava/lang/Iterable;

    .line 38
    .line 39
    invoke-static {p1}, Li8/k;->P(Ljava/lang/Iterable;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, v0, p1, p2}, Lcom/onesignal/user/internal/operations/impl/executors/e;->loginUser(Lr6/f;Ljava/util/List;Lm8/d;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 49
    .line 50
    new-instance p2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v1, "Unrecognized operation: "

    .line 53
    .line 54
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
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
.end method

.method public getOperations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "login-user"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

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
