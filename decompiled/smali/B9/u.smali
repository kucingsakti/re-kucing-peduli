.class public final LB9/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LB9/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LB9/u;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LB9/u;->a:LB9/u;

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

.method public static a(Ljava/util/AbstractCollection;Lu8/c;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v1, "filteredTypes.iterator()"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, LA9/D;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, LA9/D;

    .line 49
    .line 50
    if-eq v3, v1, :cond_2

    .line 51
    .line 52
    const-string v4, "lower"

    .line 53
    .line 54
    invoke-static {v3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v4, "upper"

    .line 58
    .line 59
    invoke-static {v1, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v3, v1}, Lu8/c;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    return-object v0
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


# virtual methods
.method public final b(Ljava/util/ArrayList;)LA9/D;
    .locals 16

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x1

    .line 18
    const/16 v4, 0xa

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, LA9/D;

    .line 27
    .line 28
    invoke-virtual {v2}, LA9/y;->D()LA9/O;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    instance-of v5, v5, LA9/x;

    .line 33
    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2}, LA9/y;->D()LA9/O;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-interface {v5}, LA9/O;->t()Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    const-string v6, "type.constructor.supertypes"

    .line 45
    .line 46
    invoke-static {v5, v6}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    check-cast v5, Ljava/lang/Iterable;

    .line 50
    .line 51
    new-instance v6, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-static {v5, v4}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, LA9/y;

    .line 75
    .line 76
    const-string v7, "it"

    .line 77
    .line 78
    invoke-static {v5, v7}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v5}, LA9/c;->z(LA9/y;)LA9/D;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v2}, LA9/y;->H()Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_0

    .line 90
    .line 91
    invoke-virtual {v5, v3}, LA9/D;->O0(Z)LA9/D;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    :cond_0
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    sget-object v1, LB9/s;->s:LB9/q;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_4

    .line 118
    .line 119
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    check-cast v5, LA9/d0;

    .line 124
    .line 125
    invoke-virtual {v1, v5}, LB9/s;->f(LA9/d0;)LB9/s;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 131
    .line 132
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    const/4 v6, 0x0

    .line 144
    const-string v7, "<this>"

    .line 145
    .line 146
    if-eqz v5, :cond_9

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, LA9/D;

    .line 153
    .line 154
    sget-object v8, LB9/s;->v:LB9/p;

    .line 155
    .line 156
    if-ne v1, v8, :cond_8

    .line 157
    .line 158
    instance-of v8, v5, LB9/h;

    .line 159
    .line 160
    if-eqz v8, :cond_5

    .line 161
    .line 162
    check-cast v5, LB9/h;

    .line 163
    .line 164
    invoke-static {v5, v7}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    new-instance v8, LB9/h;

    .line 168
    .line 169
    iget-object v11, v5, LB9/h;->v:LA9/d0;

    .line 170
    .line 171
    const/4 v14, 0x1

    .line 172
    iget v9, v5, LB9/h;->t:I

    .line 173
    .line 174
    iget-object v10, v5, LB9/h;->u:LB9/j;

    .line 175
    .line 176
    iget-object v12, v5, LB9/h;->w:LA9/K;

    .line 177
    .line 178
    iget-boolean v13, v5, LB9/h;->x:Z

    .line 179
    .line 180
    invoke-direct/range {v8 .. v14}, LB9/h;-><init>(ILB9/j;LA9/d0;LA9/K;ZZ)V

    .line 181
    .line 182
    .line 183
    move-object v5, v8

    .line 184
    :cond_5
    invoke-static {v5, v7}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v5, v6}, LA9/f;->p(LA9/d0;Z)LA9/n;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    if-eqz v7, :cond_7

    .line 192
    .line 193
    :cond_6
    move-object v5, v7

    .line 194
    goto :goto_4

    .line 195
    :cond_7
    invoke-static {v5}, LA9/c;->n(LA9/d0;)LA9/D;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    if-nez v7, :cond_6

    .line 200
    .line 201
    invoke-virtual {v5, v6}, LA9/D;->O0(Z)LA9/D;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    :cond_8
    :goto_4
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 210
    .line 211
    move-object/from16 v1, p1

    .line 212
    .line 213
    invoke-static {v1, v4}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-eqz v4, :cond_a

    .line 229
    .line 230
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    check-cast v4, LA9/D;

    .line 235
    .line 236
    invoke-virtual {v4}, LA9/y;->o()LA9/K;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    const-string v4, "Empty collection can\'t be reduced."

    .line 253
    .line 254
    if-eqz v1, :cond_1c

    .line 255
    .line 256
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    const-string v9, "other"

    .line 265
    .line 266
    if-eqz v5, :cond_10

    .line 267
    .line 268
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    check-cast v5, LA9/K;

    .line 273
    .line 274
    check-cast v1, LA9/K;

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {v5, v9}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1}, LG9/d;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-eqz v9, :cond_b

    .line 287
    .line 288
    invoke-virtual {v5}, LG9/d;->isEmpty()Z

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    if-eqz v9, :cond_b

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_b
    new-instance v9, Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 298
    .line 299
    .line 300
    sget-object v10, LA9/K;->t:Lo1/c;

    .line 301
    .line 302
    iget-object v10, v10, Lo1/c;->t:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v10, Ljava/util/concurrent/ConcurrentHashMap;

    .line 305
    .line 306
    invoke-virtual {v10}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    const-string v11, "idPerType.values"

    .line 311
    .line 312
    invoke-static {v10, v11}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v11

    .line 323
    if-eqz v11, :cond_f

    .line 324
    .line 325
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v11

    .line 329
    check-cast v11, Ljava/lang/Number;

    .line 330
    .line 331
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    iget-object v12, v1, LG9/d;->s:LG9/a;

    .line 336
    .line 337
    invoke-virtual {v12, v11}, LG9/a;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v12

    .line 341
    check-cast v12, LA9/i;

    .line 342
    .line 343
    iget-object v13, v5, LG9/d;->s:LG9/a;

    .line 344
    .line 345
    invoke-virtual {v13, v11}, LG9/a;->get(I)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v11

    .line 349
    check-cast v11, LA9/i;

    .line 350
    .line 351
    if-nez v12, :cond_d

    .line 352
    .line 353
    if-eqz v11, :cond_c

    .line 354
    .line 355
    invoke-static {v12, v11}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v12

    .line 359
    if-eqz v12, :cond_c

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_c
    const/4 v11, 0x0

    .line 363
    goto :goto_9

    .line 364
    :cond_d
    invoke-static {v11, v12}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v11

    .line 368
    if-eqz v11, :cond_e

    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_e
    const/4 v12, 0x0

    .line 372
    :goto_8
    move-object v11, v12

    .line 373
    :goto_9
    invoke-static {v9, v11}, LJ9/l;->b(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_f
    invoke-static {v9}, Lo1/c;->o(Ljava/util/List;)LA9/K;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    goto :goto_6

    .line 382
    :cond_10
    check-cast v1, LA9/K;

    .line 383
    .line 384
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-ne v0, v3, :cond_11

    .line 389
    .line 390
    invoke-static {v2}, Li8/k;->j0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    check-cast v0, LA9/D;

    .line 395
    .line 396
    move-object/from16 v11, p0

    .line 397
    .line 398
    goto/16 :goto_e

    .line 399
    .line 400
    :cond_11
    new-instance v0, LB9/t;

    .line 401
    .line 402
    const/4 v5, 0x2

    .line 403
    const/4 v10, 0x0

    .line 404
    move-object/from16 v11, p0

    .line 405
    .line 406
    invoke-direct {v0, v5, v10, v11}, LB9/t;-><init>(IILjava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    invoke-static {v2, v0}, LB9/u;->a(Ljava/util/AbstractCollection;Lu8/c;)Ljava/util/ArrayList;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 417
    .line 418
    .line 419
    move-result v10

    .line 420
    if-eqz v10, :cond_12

    .line 421
    .line 422
    const/4 v8, 0x0

    .line 423
    goto/16 :goto_d

    .line 424
    .line 425
    :cond_12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 426
    .line 427
    .line 428
    move-result-object v10

    .line 429
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 430
    .line 431
    .line 432
    move-result v12

    .line 433
    if-eqz v12, :cond_1b

    .line 434
    .line 435
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    :goto_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v12

    .line 443
    if-eqz v12, :cond_18

    .line 444
    .line 445
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v12

    .line 449
    check-cast v12, LA9/D;

    .line 450
    .line 451
    check-cast v4, LA9/D;

    .line 452
    .line 453
    if-eqz v4, :cond_17

    .line 454
    .line 455
    if-nez v12, :cond_13

    .line 456
    .line 457
    goto :goto_c

    .line 458
    :cond_13
    invoke-virtual {v4}, LA9/y;->D()LA9/O;

    .line 459
    .line 460
    .line 461
    move-result-object v13

    .line 462
    invoke-virtual {v12}, LA9/y;->D()LA9/O;

    .line 463
    .line 464
    .line 465
    move-result-object v14

    .line 466
    instance-of v15, v13, Lo9/m;

    .line 467
    .line 468
    if-eqz v15, :cond_14

    .line 469
    .line 470
    instance-of v8, v14, Lo9/m;

    .line 471
    .line 472
    if-eqz v8, :cond_14

    .line 473
    .line 474
    check-cast v13, Lo9/m;

    .line 475
    .line 476
    check-cast v14, Lo9/m;

    .line 477
    .line 478
    iget-object v4, v13, Lo9/m;->a:Ljava/util/Set;

    .line 479
    .line 480
    iget-object v8, v14, Lo9/m;->a:Ljava/util/Set;

    .line 481
    .line 482
    invoke-static {v4, v7}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-static {v8, v9}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    invoke-static {v4}, Li8/k;->v0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    invoke-static {v4, v8}, Li8/q;->J(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 493
    .line 494
    .line 495
    new-instance v8, Lo9/m;

    .line 496
    .line 497
    invoke-direct {v8, v4}, Lo9/m;-><init>(Ljava/util/Set;)V

    .line 498
    .line 499
    .line 500
    sget-object v4, LA9/K;->t:Lo1/c;

    .line 501
    .line 502
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    sget-object v4, LA9/K;->u:LA9/K;

    .line 506
    .line 507
    const-string v12, "attributes"

    .line 508
    .line 509
    invoke-static {v4, v12}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    sget-object v12, Li8/s;->s:Li8/s;

    .line 513
    .line 514
    const-string v13, "unknown integer literal type"

    .line 515
    .line 516
    filled-new-array {v13}, [Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v13

    .line 520
    invoke-static {v5, v3, v13}, LC9/i;->a(IZ[Ljava/lang/String;)LC9/e;

    .line 521
    .line 522
    .line 523
    move-result-object v13

    .line 524
    invoke-static {v4, v8, v12, v13, v6}, LA9/f;->s(LA9/K;LA9/O;Ljava/util/List;Lt9/n;Z)LA9/D;

    .line 525
    .line 526
    .line 527
    move-result-object v4

    .line 528
    goto :goto_a

    .line 529
    :cond_14
    if-eqz v15, :cond_16

    .line 530
    .line 531
    check-cast v13, Lo9/m;

    .line 532
    .line 533
    iget-object v4, v13, Lo9/m;->a:Ljava/util/Set;

    .line 534
    .line 535
    invoke-interface {v4, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v4

    .line 539
    if-eqz v4, :cond_15

    .line 540
    .line 541
    goto :goto_b

    .line 542
    :cond_15
    const/4 v12, 0x0

    .line 543
    :goto_b
    move-object v4, v12

    .line 544
    goto :goto_a

    .line 545
    :cond_16
    instance-of v8, v14, Lo9/m;

    .line 546
    .line 547
    if-eqz v8, :cond_17

    .line 548
    .line 549
    check-cast v14, Lo9/m;

    .line 550
    .line 551
    iget-object v8, v14, Lo9/m;->a:Ljava/util/Set;

    .line 552
    .line 553
    invoke-interface {v8, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v8

    .line 557
    if-eqz v8, :cond_17

    .line 558
    .line 559
    goto :goto_a

    .line 560
    :cond_17
    :goto_c
    const/4 v4, 0x0

    .line 561
    goto :goto_a

    .line 562
    :cond_18
    move-object v8, v4

    .line 563
    check-cast v8, LA9/D;

    .line 564
    .line 565
    :goto_d
    if-eqz v8, :cond_19

    .line 566
    .line 567
    move-object v0, v8

    .line 568
    goto :goto_e

    .line 569
    :cond_19
    new-instance v3, LB9/t;

    .line 570
    .line 571
    sget-object v4, LB9/l;->b:LB9/k;

    .line 572
    .line 573
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    sget-object v4, LB9/k;->b:LB9/m;

    .line 577
    .line 578
    const/4 v6, 0x1

    .line 579
    invoke-direct {v3, v5, v6, v4}, LB9/t;-><init>(IILjava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    invoke-static {v0, v3}, LB9/u;->a(Ljava/util/AbstractCollection;Lu8/c;)Ljava/util/ArrayList;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 587
    .line 588
    .line 589
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    if-ge v3, v5, :cond_1a

    .line 594
    .line 595
    invoke-static {v0}, Li8/k;->j0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    check-cast v0, LA9/D;

    .line 600
    .line 601
    goto :goto_e

    .line 602
    :cond_1a
    new-instance v0, LA9/x;

    .line 603
    .line 604
    invoke-direct {v0, v2}, LA9/x;-><init>(Ljava/util/AbstractCollection;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v0}, LA9/x;->b()LA9/D;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    :goto_e
    invoke-virtual {v0, v1}, LA9/D;->P0(LA9/K;)LA9/D;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    return-object v0

    .line 616
    :cond_1b
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 617
    .line 618
    invoke-direct {v0, v4}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    throw v0

    .line 622
    :cond_1c
    move-object/from16 v11, p0

    .line 623
    .line 624
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 625
    .line 626
    invoke-direct {v0, v4}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    throw v0
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
