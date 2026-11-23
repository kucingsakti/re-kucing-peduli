.class public final Lcom/onesignal/user/internal/operations/impl/executors/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/onesignal/user/internal/operations/impl/executors/a$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/onesignal/user/internal/operations/impl/executors/a$a;

.field public static final DELETE_ALIAS:Ljava/lang/String; = "delete-alias"

.field public static final SET_ALIAS:Ljava/lang/String; = "set-alias"


# instance fields
.field private final _buildUserService:Lo6/a;

.field private final _identityBackend:Ln6/b;

.field private final _identityModelStore:Lq6/b;

.field private final _newRecordState:Lt6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/onesignal/user/internal/operations/impl/executors/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/onesignal/user/internal/operations/impl/executors/a$a;-><init>(Lv8/e;)V

    sput-object v0, Lcom/onesignal/user/internal/operations/impl/executors/a;->Companion:Lcom/onesignal/user/internal/operations/impl/executors/a$a;

    return-void
.end method

.method public constructor <init>(Ln6/b;Lq6/b;Lo6/a;Lt6/a;)V
    .locals 1

    .line 1
    const-string v0, "_identityBackend"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "_identityModelStore"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "_buildUserService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "_newRecordState"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/onesignal/user/internal/operations/impl/executors/a;->_identityBackend:Ln6/b;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/onesignal/user/internal/operations/impl/executors/a;->_identityModelStore:Lq6/b;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/onesignal/user/internal/operations/impl/executors/a;->_buildUserService:Lo6/a;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/onesignal/user/internal/operations/impl/executors/a;->_newRecordState:Lt6/a;

    .line 31
    .line 32
    return-void
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


# virtual methods
.method public execute(Ljava/util/List;Lm8/d;)Ljava/lang/Object;
    .locals 23
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
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Lcom/onesignal/user/internal/operations/impl/executors/a$b;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/onesignal/user/internal/operations/impl/executors/a$b;

    .line 13
    .line 14
    iget v4, v3, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->label:I

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
    iput v4, v3, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->label:I

    .line 24
    .line 25
    :goto_0
    move-object v10, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lcom/onesignal/user/internal/operations/impl/executors/a$b;

    .line 28
    .line 29
    invoke-direct {v3, v1, v2}, Lcom/onesignal/user/internal/operations/impl/executors/a$b;-><init>(Lcom/onesignal/user/internal/operations/impl/executors/a;Lm8/d;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->result:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v3, Ln8/a;->s:Ln8/a;

    .line 36
    .line 37
    iget v4, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->label:I

    .line 38
    .line 39
    const/4 v12, 0x5

    .line 40
    const/4 v13, 0x4

    .line 41
    const/4 v14, 0x3

    .line 42
    const/4 v15, 0x1

    .line 43
    const/4 v5, 0x2

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    if-eq v4, v15, :cond_2

    .line 47
    .line 48
    if-ne v4, v5, :cond_1

    .line 49
    .line 50
    iget-object v0, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v3, v0

    .line 53
    check-cast v3, Lg5/g;

    .line 54
    .line 55
    iget-object v0, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v4, v0

    .line 58
    check-cast v4, Lcom/onesignal/user/internal/operations/impl/executors/a;

    .line 59
    .line 60
    :try_start_0
    invoke-static {v2}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    move v11, v5

    .line 64
    goto/16 :goto_b

    .line 65
    .line 66
    :catch_0
    move-exception v0

    .line 67
    move v11, v5

    .line 68
    goto/16 :goto_c

    .line 69
    .line 70
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_2
    iget-object v0, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v3, v0

    .line 81
    check-cast v3, Lg5/g;

    .line 82
    .line 83
    iget-object v0, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v4, v0

    .line 86
    check-cast v4, Lcom/onesignal/user/internal/operations/impl/executors/a;

    .line 87
    .line 88
    :try_start_1
    invoke-static {v2}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_1 .. :try_end_1} :catch_1

    .line 89
    .line 90
    .line 91
    move v11, v5

    .line 92
    goto/16 :goto_6

    .line 93
    .line 94
    :catch_1
    move-exception v0

    .line 95
    move v11, v5

    .line 96
    goto/16 :goto_8

    .line 97
    .line 98
    :cond_3
    invoke-static {v2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v2, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v4, "IdentityOperationExecutor(operations: "

    .line 104
    .line 105
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const/16 v4, 0x29

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    const/4 v4, 0x0

    .line 121
    invoke-static {v2, v4, v5, v4}, Lcom/onesignal/debug/internal/logging/b;->debug$default(Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v2, v0

    .line 125
    check-cast v2, Ljava/lang/Iterable;

    .line 126
    .line 127
    instance-of v4, v2, Ljava/util/Collection;

    .line 128
    .line 129
    if-eqz v4, :cond_4

    .line 130
    .line 131
    move-object v6, v2

    .line 132
    check-cast v6, Ljava/util/Collection;

    .line 133
    .line 134
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-eqz v6, :cond_4

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    :cond_5
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    if-eqz v7, :cond_7

    .line 150
    .line 151
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    check-cast v7, Lg5/g;

    .line 156
    .line 157
    instance-of v8, v7, Lr6/i;

    .line 158
    .line 159
    if-nez v8, :cond_5

    .line 160
    .line 161
    instance-of v7, v7, Lr6/b;

    .line 162
    .line 163
    if-eqz v7, :cond_6

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_6
    new-instance v2, Ljava/lang/Exception;

    .line 167
    .line 168
    new-instance v3, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    const-string v4, "Unrecognized operation(s)! Attempted operations:\n"

    .line 171
    .line 172
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v2

    .line 186
    :cond_7
    :goto_3
    if-eqz v4, :cond_8

    .line 187
    .line 188
    move-object v6, v2

    .line 189
    check-cast v6, Ljava/util/Collection;

    .line 190
    .line 191
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-eqz v6, :cond_8

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    :cond_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    if-eqz v7, :cond_c

    .line 207
    .line 208
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    check-cast v7, Lg5/g;

    .line 213
    .line 214
    instance-of v7, v7, Lr6/i;

    .line 215
    .line 216
    if-eqz v7, :cond_9

    .line 217
    .line 218
    if-eqz v4, :cond_a

    .line 219
    .line 220
    move-object v4, v2

    .line 221
    check-cast v4, Ljava/util/Collection;

    .line 222
    .line 223
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    if-eqz v4, :cond_a

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_a
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eqz v4, :cond_c

    .line 239
    .line 240
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    check-cast v4, Lg5/g;

    .line 245
    .line 246
    instance-of v4, v4, Lr6/b;

    .line 247
    .line 248
    if-nez v4, :cond_b

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_b
    new-instance v0, Ljava/lang/Exception;

    .line 252
    .line 253
    const-string v2, "Can\'t process SetAliasOperation and DeleteAliasOperation at the same time."

    .line 254
    .line 255
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v0

    .line 259
    :cond_c
    :goto_5
    invoke-static {v0}, Li8/k;->b0(Ljava/util/List;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    move-object v2, v0

    .line 264
    check-cast v2, Lg5/g;

    .line 265
    .line 266
    instance-of v0, v2, Lr6/i;

    .line 267
    .line 268
    if-eqz v0, :cond_15

    .line 269
    .line 270
    :try_start_2
    iget-object v0, v1, Lcom/onesignal/user/internal/operations/impl/executors/a;->_identityModelStore:Lq6/b;

    .line 271
    .line 272
    invoke-virtual {v0}, Lq6/b;->getIdentityAlias()Lh8/f;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    iget-object v4, v1, Lcom/onesignal/user/internal/operations/impl/executors/a;->_identityBackend:Ln6/b;

    .line 277
    .line 278
    move-object v6, v2

    .line 279
    check-cast v6, Lr6/i;

    .line 280
    .line 281
    invoke-virtual {v6}, Lr6/i;->getAppId()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    iget-object v7, v0, Lh8/f;->s:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v7, Ljava/lang/String;

    .line 288
    .line 289
    iget-object v0, v0, Lh8/f;->t:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v0, Ljava/lang/String;

    .line 292
    .line 293
    move-object v8, v2

    .line 294
    check-cast v8, Lr6/i;

    .line 295
    .line 296
    invoke-virtual {v8}, Lr6/i;->getLabel()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    move-object v9, v2

    .line 301
    check-cast v9, Lr6/i;

    .line 302
    .line 303
    invoke-virtual {v9}, Lr6/i;->getValue()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v9
    :try_end_2
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_2 .. :try_end_2} :catch_5

    .line 307
    :try_start_3
    new-instance v5, Lh8/f;

    .line 308
    .line 309
    invoke-direct {v5, v8, v9}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-static {v5}, Li8/z;->t(Lh8/f;)Ljava/util/Map;

    .line 313
    .line 314
    .line 315
    move-result-object v8

    .line 316
    iget-object v5, v1, Lcom/onesignal/user/internal/operations/impl/executors/a;->_identityModelStore:Lq6/b;

    .line 317
    .line 318
    invoke-virtual {v5}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    check-cast v5, Lq6/a;

    .line 323
    .line 324
    invoke-virtual {v5}, Lq6/a;->getJwtToken()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    iput-object v1, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->L$0:Ljava/lang/Object;

    .line 329
    .line 330
    iput-object v2, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->L$1:Ljava/lang/Object;

    .line 331
    .line 332
    iput v15, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->label:I
    :try_end_3
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_3 .. :try_end_3} :catch_4

    .line 333
    .line 334
    move-object v5, v6

    .line 335
    move-object v6, v7

    .line 336
    const/4 v11, 0x2

    .line 337
    move-object v7, v0

    .line 338
    :try_start_4
    invoke-interface/range {v4 .. v10}, Ln6/b;->setAlias(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lm8/d;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0
    :try_end_4
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_4 .. :try_end_4} :catch_3

    .line 342
    if-ne v0, v3, :cond_d

    .line 343
    .line 344
    goto/16 :goto_a

    .line 345
    .line 346
    :cond_d
    move-object v4, v1

    .line 347
    move-object v3, v2

    .line 348
    :goto_6
    :try_start_5
    iget-object v0, v4, Lcom/onesignal/user/internal/operations/impl/executors/a;->_identityModelStore:Lq6/b;

    .line 349
    .line 350
    invoke-virtual {v0}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    check-cast v0, Lq6/a;

    .line 355
    .line 356
    invoke-virtual {v0}, Lq6/a;->getOnesignalId()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    move-object v2, v3

    .line 361
    check-cast v2, Lr6/i;

    .line 362
    .line 363
    invoke-virtual {v2}, Lr6/i;->getOnesignalId()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-static {v0, v2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-eqz v0, :cond_1d

    .line 372
    .line 373
    iget-object v0, v4, Lcom/onesignal/user/internal/operations/impl/executors/a;->_identityModelStore:Lq6/b;

    .line 374
    .line 375
    invoke-virtual {v0}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 376
    .line 377
    .line 378
    move-result-object v16

    .line 379
    move-object v0, v3

    .line 380
    check-cast v0, Lr6/i;

    .line 381
    .line 382
    invoke-virtual {v0}, Lr6/i;->getLabel()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v17

    .line 386
    move-object v0, v3

    .line 387
    check-cast v0, Lr6/i;

    .line 388
    .line 389
    invoke-virtual {v0}, Lr6/i;->getValue()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v18

    .line 393
    const-string v19, "HYDRATE"

    .line 394
    .line 395
    const/16 v21, 0x8

    .line 396
    .line 397
    const/16 v22, 0x0

    .line 398
    .line 399
    const/16 v20, 0x0

    .line 400
    .line 401
    invoke-static/range {v16 .. v22}, Lcom/onesignal/common/modeling/i;->setStringProperty$default(Lcom/onesignal/common/modeling/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_5
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_5 .. :try_end_5} :catch_2

    .line 402
    .line 403
    .line 404
    goto/16 :goto_f

    .line 405
    .line 406
    :catch_2
    move-exception v0

    .line 407
    goto :goto_8

    .line 408
    :catch_3
    move-exception v0

    .line 409
    :goto_7
    move-object v4, v1

    .line 410
    move-object v3, v2

    .line 411
    goto :goto_8

    .line 412
    :catch_4
    move-exception v0

    .line 413
    const/4 v11, 0x2

    .line 414
    goto :goto_7

    .line 415
    :catch_5
    move-exception v0

    .line 416
    move v11, v5

    .line 417
    goto :goto_7

    .line 418
    :goto_8
    sget-object v2, Lcom/onesignal/common/g;->INSTANCE:Lcom/onesignal/common/g;

    .line 419
    .line 420
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 421
    .line 422
    .line 423
    move-result v5

    .line 424
    invoke-virtual {v2, v5}, Lcom/onesignal/common/g;->getResponseStatusType(I)Lcom/onesignal/common/g$a;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    sget-object v5, Lcom/onesignal/user/internal/operations/impl/executors/b;->$EnumSwitchMapping$0:[I

    .line 429
    .line 430
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    aget v2, v5, v2

    .line 435
    .line 436
    if-eq v2, v15, :cond_14

    .line 437
    .line 438
    if-eq v2, v11, :cond_13

    .line 439
    .line 440
    if-eq v2, v14, :cond_12

    .line 441
    .line 442
    if-eq v2, v13, :cond_11

    .line 443
    .line 444
    if-ne v2, v12, :cond_10

    .line 445
    .line 446
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    const/16 v5, 0x194

    .line 451
    .line 452
    if-ne v2, v5, :cond_e

    .line 453
    .line 454
    iget-object v2, v4, Lcom/onesignal/user/internal/operations/impl/executors/a;->_newRecordState:Lt6/a;

    .line 455
    .line 456
    move-object v5, v3

    .line 457
    check-cast v5, Lr6/i;

    .line 458
    .line 459
    invoke-virtual {v5}, Lr6/i;->getOnesignalId()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    invoke-virtual {v2, v5}, Lt6/a;->isInMissingRetryWindow(Ljava/lang/String;)Z

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    if-eqz v2, :cond_e

    .line 468
    .line 469
    new-instance v5, Lg5/a;

    .line 470
    .line 471
    sget-object v6, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 472
    .line 473
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object v9

    .line 477
    const/4 v10, 0x6

    .line 478
    const/4 v11, 0x0

    .line 479
    const/4 v7, 0x0

    .line 480
    const/4 v8, 0x0

    .line 481
    invoke-direct/range {v5 .. v11}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 482
    .line 483
    .line 484
    return-object v5

    .line 485
    :cond_e
    iget-object v2, v4, Lcom/onesignal/user/internal/operations/impl/executors/a;->_buildUserService:Lo6/a;

    .line 486
    .line 487
    check-cast v3, Lr6/i;

    .line 488
    .line 489
    invoke-virtual {v3}, Lr6/i;->getAppId()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    invoke-virtual {v3}, Lr6/i;->getOnesignalId()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    invoke-interface {v2, v4, v3}, Lo6/a;->getRebuildOperationsIfCurrentUser(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 498
    .line 499
    .line 500
    move-result-object v8

    .line 501
    if-nez v8, :cond_f

    .line 502
    .line 503
    new-instance v9, Lg5/a;

    .line 504
    .line 505
    sget-object v10, Lg5/b;->FAIL_NORETRY:Lg5/b;

    .line 506
    .line 507
    const/16 v14, 0xe

    .line 508
    .line 509
    const/4 v15, 0x0

    .line 510
    const/4 v11, 0x0

    .line 511
    const/4 v12, 0x0

    .line 512
    const/4 v13, 0x0

    .line 513
    invoke-direct/range {v9 .. v15}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 514
    .line 515
    .line 516
    return-object v9

    .line 517
    :cond_f
    new-instance v5, Lg5/a;

    .line 518
    .line 519
    sget-object v6, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 520
    .line 521
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object v9

    .line 525
    const/4 v10, 0x2

    .line 526
    const/4 v11, 0x0

    .line 527
    const/4 v7, 0x0

    .line 528
    invoke-direct/range {v5 .. v11}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 529
    .line 530
    .line 531
    return-object v5

    .line 532
    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 533
    .line 534
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 535
    .line 536
    .line 537
    throw v0

    .line 538
    :cond_11
    new-instance v2, Lg5/a;

    .line 539
    .line 540
    sget-object v3, Lg5/b;->FAIL_UNAUTHORIZED:Lg5/b;

    .line 541
    .line 542
    const/16 v7, 0xe

    .line 543
    .line 544
    const/4 v8, 0x0

    .line 545
    const/4 v4, 0x0

    .line 546
    const/4 v5, 0x0

    .line 547
    const/4 v6, 0x0

    .line 548
    invoke-direct/range {v2 .. v8}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 549
    .line 550
    .line 551
    return-object v2

    .line 552
    :cond_12
    new-instance v3, Lg5/a;

    .line 553
    .line 554
    sget-object v4, Lg5/b;->FAIL_CONFLICT:Lg5/b;

    .line 555
    .line 556
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 557
    .line 558
    .line 559
    move-result-object v7

    .line 560
    const/4 v8, 0x6

    .line 561
    const/4 v9, 0x0

    .line 562
    const/4 v5, 0x0

    .line 563
    const/4 v6, 0x0

    .line 564
    invoke-direct/range {v3 .. v9}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 565
    .line 566
    .line 567
    goto :goto_9

    .line 568
    :cond_13
    new-instance v4, Lg5/a;

    .line 569
    .line 570
    sget-object v5, Lg5/b;->FAIL_NORETRY:Lg5/b;

    .line 571
    .line 572
    const/16 v9, 0xe

    .line 573
    .line 574
    const/4 v10, 0x0

    .line 575
    const/4 v6, 0x0

    .line 576
    const/4 v7, 0x0

    .line 577
    const/4 v8, 0x0

    .line 578
    invoke-direct/range {v4 .. v10}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 579
    .line 580
    .line 581
    move-object v3, v4

    .line 582
    goto :goto_9

    .line 583
    :cond_14
    new-instance v5, Lg5/a;

    .line 584
    .line 585
    sget-object v6, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 586
    .line 587
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 588
    .line 589
    .line 590
    move-result-object v9

    .line 591
    const/4 v10, 0x6

    .line 592
    const/4 v11, 0x0

    .line 593
    const/4 v7, 0x0

    .line 594
    const/4 v8, 0x0

    .line 595
    invoke-direct/range {v5 .. v11}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 596
    .line 597
    .line 598
    move-object v3, v5

    .line 599
    :goto_9
    return-object v3

    .line 600
    :cond_15
    move v11, v5

    .line 601
    instance-of v0, v2, Lr6/b;

    .line 602
    .line 603
    if-eqz v0, :cond_1d

    .line 604
    .line 605
    :try_start_6
    iget-object v4, v1, Lcom/onesignal/user/internal/operations/impl/executors/a;->_identityBackend:Ln6/b;

    .line 606
    .line 607
    move-object v0, v2

    .line 608
    check-cast v0, Lr6/b;

    .line 609
    .line 610
    invoke-virtual {v0}, Lr6/b;->getAppId()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    const-string v6, "onesignal_id"

    .line 615
    .line 616
    move-object v0, v2

    .line 617
    check-cast v0, Lr6/b;

    .line 618
    .line 619
    invoke-virtual {v0}, Lr6/b;->getOnesignalId()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v7

    .line 623
    move-object v0, v2

    .line 624
    check-cast v0, Lr6/b;

    .line 625
    .line 626
    invoke-virtual {v0}, Lr6/b;->getLabel()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v8

    .line 630
    iget-object v0, v1, Lcom/onesignal/user/internal/operations/impl/executors/a;->_identityModelStore:Lq6/b;

    .line 631
    .line 632
    invoke-virtual {v0}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    check-cast v0, Lq6/a;

    .line 637
    .line 638
    invoke-virtual {v0}, Lq6/a;->getJwtToken()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v9

    .line 642
    iput-object v1, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->L$0:Ljava/lang/Object;

    .line 643
    .line 644
    iput-object v2, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->L$1:Ljava/lang/Object;

    .line 645
    .line 646
    iput v11, v10, Lcom/onesignal/user/internal/operations/impl/executors/a$b;->label:I

    .line 647
    .line 648
    invoke-interface/range {v4 .. v10}, Ln6/b;->deleteAlias(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm8/d;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v0
    :try_end_6
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_6 .. :try_end_6} :catch_7

    .line 652
    if-ne v0, v3, :cond_16

    .line 653
    .line 654
    :goto_a
    return-object v3

    .line 655
    :cond_16
    move-object v4, v1

    .line 656
    move-object v3, v2

    .line 657
    :goto_b
    :try_start_7
    iget-object v0, v4, Lcom/onesignal/user/internal/operations/impl/executors/a;->_identityModelStore:Lq6/b;

    .line 658
    .line 659
    invoke-virtual {v0}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    check-cast v0, Lq6/a;

    .line 664
    .line 665
    invoke-virtual {v0}, Lq6/a;->getOnesignalId()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    move-object v2, v3

    .line 670
    check-cast v2, Lr6/b;

    .line 671
    .line 672
    invoke-virtual {v2}, Lr6/b;->getOnesignalId()Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    invoke-static {v0, v2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-eqz v0, :cond_1d

    .line 681
    .line 682
    iget-object v0, v4, Lcom/onesignal/user/internal/operations/impl/executors/a;->_identityModelStore:Lq6/b;

    .line 683
    .line 684
    invoke-virtual {v0}, Lcom/onesignal/common/modeling/m;->getModel()Lcom/onesignal/common/modeling/i;

    .line 685
    .line 686
    .line 687
    move-result-object v16

    .line 688
    move-object v0, v3

    .line 689
    check-cast v0, Lr6/b;

    .line 690
    .line 691
    invoke-virtual {v0}, Lr6/b;->getLabel()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v17

    .line 695
    const-string v19, "HYDRATE"

    .line 696
    .line 697
    const/16 v21, 0x8

    .line 698
    .line 699
    const/16 v22, 0x0

    .line 700
    .line 701
    const/16 v18, 0x0

    .line 702
    .line 703
    const/16 v20, 0x0

    .line 704
    .line 705
    invoke-static/range {v16 .. v22}, Lcom/onesignal/common/modeling/i;->setOptStringProperty$default(Lcom/onesignal/common/modeling/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_7
    .catch Lcom/onesignal/common/exceptions/BackendException; {:try_start_7 .. :try_end_7} :catch_6

    .line 706
    .line 707
    .line 708
    goto/16 :goto_f

    .line 709
    .line 710
    :catch_6
    move-exception v0

    .line 711
    goto :goto_c

    .line 712
    :catch_7
    move-exception v0

    .line 713
    move-object v4, v1

    .line 714
    move-object v3, v2

    .line 715
    :goto_c
    sget-object v2, Lcom/onesignal/common/g;->INSTANCE:Lcom/onesignal/common/g;

    .line 716
    .line 717
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 718
    .line 719
    .line 720
    move-result v5

    .line 721
    invoke-virtual {v2, v5}, Lcom/onesignal/common/g;->getResponseStatusType(I)Lcom/onesignal/common/g$a;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    sget-object v5, Lcom/onesignal/user/internal/operations/impl/executors/b;->$EnumSwitchMapping$0:[I

    .line 726
    .line 727
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    aget v2, v5, v2

    .line 732
    .line 733
    if-eq v2, v15, :cond_1c

    .line 734
    .line 735
    if-eq v2, v11, :cond_1b

    .line 736
    .line 737
    if-eq v2, v14, :cond_1a

    .line 738
    .line 739
    if-eq v2, v13, :cond_19

    .line 740
    .line 741
    if-ne v2, v12, :cond_18

    .line 742
    .line 743
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getStatusCode()I

    .line 744
    .line 745
    .line 746
    move-result v2

    .line 747
    const/16 v5, 0x194

    .line 748
    .line 749
    if-ne v2, v5, :cond_17

    .line 750
    .line 751
    iget-object v2, v4, Lcom/onesignal/user/internal/operations/impl/executors/a;->_newRecordState:Lt6/a;

    .line 752
    .line 753
    check-cast v3, Lr6/b;

    .line 754
    .line 755
    invoke-virtual {v3}, Lr6/b;->getOnesignalId()Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v3

    .line 759
    invoke-virtual {v2, v3}, Lt6/a;->isInMissingRetryWindow(Ljava/lang/String;)Z

    .line 760
    .line 761
    .line 762
    move-result v2

    .line 763
    if-eqz v2, :cond_17

    .line 764
    .line 765
    new-instance v3, Lg5/a;

    .line 766
    .line 767
    sget-object v4, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 768
    .line 769
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 770
    .line 771
    .line 772
    move-result-object v7

    .line 773
    const/4 v8, 0x6

    .line 774
    const/4 v9, 0x0

    .line 775
    const/4 v5, 0x0

    .line 776
    const/4 v6, 0x0

    .line 777
    invoke-direct/range {v3 .. v9}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 778
    .line 779
    .line 780
    goto :goto_d

    .line 781
    :cond_17
    new-instance v4, Lg5/a;

    .line 782
    .line 783
    sget-object v5, Lg5/b;->SUCCESS:Lg5/b;

    .line 784
    .line 785
    const/16 v9, 0xe

    .line 786
    .line 787
    const/4 v10, 0x0

    .line 788
    const/4 v6, 0x0

    .line 789
    const/4 v7, 0x0

    .line 790
    const/4 v8, 0x0

    .line 791
    invoke-direct/range {v4 .. v10}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 792
    .line 793
    .line 794
    move-object v3, v4

    .line 795
    :goto_d
    return-object v3

    .line 796
    :cond_18
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 797
    .line 798
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 799
    .line 800
    .line 801
    throw v0

    .line 802
    :cond_19
    new-instance v2, Lg5/a;

    .line 803
    .line 804
    sget-object v3, Lg5/b;->FAIL_UNAUTHORIZED:Lg5/b;

    .line 805
    .line 806
    const/16 v7, 0xe

    .line 807
    .line 808
    const/4 v8, 0x0

    .line 809
    const/4 v4, 0x0

    .line 810
    const/4 v5, 0x0

    .line 811
    const/4 v6, 0x0

    .line 812
    invoke-direct/range {v2 .. v8}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 813
    .line 814
    .line 815
    return-object v2

    .line 816
    :cond_1a
    new-instance v3, Lg5/a;

    .line 817
    .line 818
    sget-object v4, Lg5/b;->SUCCESS:Lg5/b;

    .line 819
    .line 820
    const/16 v8, 0xe

    .line 821
    .line 822
    const/4 v9, 0x0

    .line 823
    const/4 v5, 0x0

    .line 824
    const/4 v6, 0x0

    .line 825
    const/4 v7, 0x0

    .line 826
    invoke-direct/range {v3 .. v9}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 827
    .line 828
    .line 829
    goto :goto_e

    .line 830
    :cond_1b
    new-instance v4, Lg5/a;

    .line 831
    .line 832
    sget-object v5, Lg5/b;->FAIL_NORETRY:Lg5/b;

    .line 833
    .line 834
    const/16 v9, 0xe

    .line 835
    .line 836
    const/4 v10, 0x0

    .line 837
    const/4 v6, 0x0

    .line 838
    const/4 v7, 0x0

    .line 839
    const/4 v8, 0x0

    .line 840
    invoke-direct/range {v4 .. v10}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 841
    .line 842
    .line 843
    move-object v3, v4

    .line 844
    goto :goto_e

    .line 845
    :cond_1c
    new-instance v5, Lg5/a;

    .line 846
    .line 847
    sget-object v6, Lg5/b;->FAIL_RETRY:Lg5/b;

    .line 848
    .line 849
    invoke-virtual {v0}, Lcom/onesignal/common/exceptions/BackendException;->getRetryAfterSeconds()Ljava/lang/Integer;

    .line 850
    .line 851
    .line 852
    move-result-object v9

    .line 853
    const/4 v10, 0x6

    .line 854
    const/4 v11, 0x0

    .line 855
    const/4 v7, 0x0

    .line 856
    const/4 v8, 0x0

    .line 857
    invoke-direct/range {v5 .. v11}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 858
    .line 859
    .line 860
    move-object v3, v5

    .line 861
    :goto_e
    return-object v3

    .line 862
    :cond_1d
    :goto_f
    new-instance v4, Lg5/a;

    .line 863
    .line 864
    sget-object v5, Lg5/b;->SUCCESS:Lg5/b;

    .line 865
    .line 866
    const/16 v9, 0xe

    .line 867
    .line 868
    const/4 v10, 0x0

    .line 869
    const/4 v6, 0x0

    .line 870
    const/4 v7, 0x0

    .line 871
    const/4 v8, 0x0

    .line 872
    invoke-direct/range {v4 .. v10}, Lg5/a;-><init>(Lg5/b;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;ILv8/e;)V

    .line 873
    .line 874
    .line 875
    return-object v4
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

.method public getOperations()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "set-alias"

    .line 2
    .line 3
    const-string v1, "delete-alias"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Li8/l;->C([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
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
