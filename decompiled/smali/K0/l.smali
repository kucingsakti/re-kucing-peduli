.class public final LK0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Class;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Ljava/util/concurrent/Executor;

.field public i:LE4/a;

.field public j:Z

.field public final k:I

.field public l:Z

.field public m:Z

.field public final n:J

.field public final o:LA1/r;

.field public final p:Ljava/util/LinkedHashSet;

.field public q:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LK0/l;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, LK0/l;->b:Ljava/lang/Class;

    .line 12
    .line 13
    iput-object p3, p0, LK0/l;->c:Ljava/lang/String;

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LK0/l;->d:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LK0/l;->e:Ljava/util/ArrayList;

    .line 28
    .line 29
    new-instance p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LK0/l;->f:Ljava/util/ArrayList;

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    iput p1, p0, LK0/l;->k:I

    .line 38
    .line 39
    iput-boolean p1, p0, LK0/l;->l:Z

    .line 40
    .line 41
    const-wide/16 p1, -0x1

    .line 42
    .line 43
    iput-wide p1, p0, LK0/l;->n:J

    .line 44
    .line 45
    new-instance p1, LA1/r;

    .line 46
    .line 47
    const/16 p2, 0x12

    .line 48
    .line 49
    invoke-direct {p1, p2}, LA1/r;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, LK0/l;->o:LA1/r;

    .line 53
    .line 54
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, LK0/l;->p:Ljava/util/LinkedHashSet;

    .line 60
    .line 61
    return-void
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


# virtual methods
.method public final varargs a([LL0/a;)V
    .locals 5

    .line 1
    const-string v0, "migrations"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK0/l;->q:Ljava/util/HashSet;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LK0/l;->q:Ljava/util/HashSet;

    .line 16
    .line 17
    :cond_0
    array-length v0, p1

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    aget-object v2, p1, v1

    .line 22
    .line 23
    iget-object v3, p0, LK0/l;->q:Ljava/util/HashSet;

    .line 24
    .line 25
    invoke-static {v3}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget v4, v2, LL0/a;->a:I

    .line 29
    .line 30
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object v3, p0, LK0/l;->q:Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-static {v3}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget v2, v2, LL0/a;->b:I

    .line 43
    .line 44
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    array-length v0, p1

    .line 55
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, [LL0/a;

    .line 60
    .line 61
    iget-object v0, p0, LK0/l;->o:LA1/r;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, LA1/r;->H([LL0/a;)V

    .line 64
    .line 65
    .line 66
    return-void
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

.method public final b()LK0/m;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, -0x1

    .line 5
    iget-object v4, v0, LK0/l;->g:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    if-nez v4, :cond_0

    .line 8
    .line 9
    iget-object v5, v0, LK0/l;->h:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    if-nez v5, :cond_0

    .line 12
    .line 13
    sget-object v4, Lq/a;->e:LG0/b;

    .line 14
    .line 15
    iput-object v4, v0, LK0/l;->h:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    iput-object v4, v0, LK0/l;->g:Ljava/util/concurrent/Executor;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-eqz v4, :cond_1

    .line 21
    .line 22
    iget-object v5, v0, LK0/l;->h:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    if-nez v5, :cond_1

    .line 25
    .line 26
    iput-object v4, v0, LK0/l;->h:Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    if-nez v4, :cond_2

    .line 30
    .line 31
    iget-object v4, v0, LK0/l;->h:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    iput-object v4, v0, LK0/l;->g:Ljava/util/concurrent/Executor;

    .line 34
    .line 35
    :cond_2
    :goto_0
    iget-object v4, v0, LK0/l;->q:Ljava/util/HashSet;

    .line 36
    .line 37
    iget-object v5, v0, LK0/l;->p:Ljava/util/LinkedHashSet;

    .line 38
    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_4

    .line 50
    .line 51
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-nez v7, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const-string v1, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "

    .line 73
    .line 74
    invoke-static {v6, v1}, Landroidx/datastore/preferences/protobuf/g;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v2

    .line 88
    :cond_4
    iget-object v4, v0, LK0/l;->i:LE4/a;

    .line 89
    .line 90
    if-nez v4, :cond_5

    .line 91
    .line 92
    new-instance v4, LK3/d;

    .line 93
    .line 94
    const/16 v6, 0xa

    .line 95
    .line 96
    invoke-direct {v4, v6}, LK3/d;-><init>(I)V

    .line 97
    .line 98
    .line 99
    :cond_5
    move-object v8, v4

    .line 100
    iget-wide v6, v0, LK0/l;->n:J

    .line 101
    .line 102
    const-wide/16 v9, 0x0

    .line 103
    .line 104
    cmp-long v4, v6, v9

    .line 105
    .line 106
    const-string v6, "Required value was null."

    .line 107
    .line 108
    if-lez v4, :cond_7

    .line 109
    .line 110
    iget-object v1, v0, LK0/l;->c:Ljava/lang/String;

    .line 111
    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 115
    .line 116
    invoke-direct {v1, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v1

    .line 120
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    const-string v2, "Cannot create auto-closing database for an in-memory database."

    .line 123
    .line 124
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v1

    .line 128
    :cond_7
    move-object/from16 v17, v5

    .line 129
    .line 130
    new-instance v5, LK0/b;

    .line 131
    .line 132
    iget-object v10, v0, LK0/l;->d:Ljava/util/ArrayList;

    .line 133
    .line 134
    iget-boolean v11, v0, LK0/l;->j:Z

    .line 135
    .line 136
    iget v4, v0, LK0/l;->k:I

    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    if-eqz v4, :cond_25

    .line 140
    .line 141
    const-string v7, "context"

    .line 142
    .line 143
    move-object v9, v6

    .line 144
    iget-object v6, v0, LK0/l;->a:Landroid/content/Context;

    .line 145
    .line 146
    invoke-static {v6, v7}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    const/4 v7, 0x3

    .line 150
    if-eq v4, v2, :cond_8

    .line 151
    .line 152
    :goto_2
    move v12, v4

    .line 153
    goto :goto_3

    .line 154
    :cond_8
    const-string v4, "activity"

    .line 155
    .line 156
    invoke-virtual {v6, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    const-string v12, "null cannot be cast to non-null type android.app.ActivityManager"

    .line 161
    .line 162
    invoke-static {v4, v12}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    check-cast v4, Landroid/app/ActivityManager;

    .line 166
    .line 167
    invoke-virtual {v4}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-nez v4, :cond_9

    .line 172
    .line 173
    move v12, v7

    .line 174
    goto :goto_3

    .line 175
    :cond_9
    const/4 v4, 0x2

    .line 176
    goto :goto_2

    .line 177
    :goto_3
    iget-object v13, v0, LK0/l;->g:Ljava/util/concurrent/Executor;

    .line 178
    .line 179
    if-eqz v13, :cond_24

    .line 180
    .line 181
    iget-object v14, v0, LK0/l;->h:Ljava/util/concurrent/Executor;

    .line 182
    .line 183
    if-eqz v14, :cond_23

    .line 184
    .line 185
    iget-boolean v15, v0, LK0/l;->l:Z

    .line 186
    .line 187
    iget-boolean v4, v0, LK0/l;->m:Z

    .line 188
    .line 189
    iget-object v9, v0, LK0/l;->e:Ljava/util/ArrayList;

    .line 190
    .line 191
    const/16 v20, 0x0

    .line 192
    .line 193
    iget-object v1, v0, LK0/l;->f:Ljava/util/ArrayList;

    .line 194
    .line 195
    move/from16 v16, v7

    .line 196
    .line 197
    iget-object v7, v0, LK0/l;->c:Ljava/lang/String;

    .line 198
    .line 199
    move-object/from16 v18, v9

    .line 200
    .line 201
    iget-object v9, v0, LK0/l;->o:LA1/r;

    .line 202
    .line 203
    move-object/from16 v19, v1

    .line 204
    .line 205
    move/from16 v1, v16

    .line 206
    .line 207
    move/from16 v16, v4

    .line 208
    .line 209
    invoke-direct/range {v5 .. v19}, LK0/b;-><init>(Landroid/content/Context;Ljava/lang/String;LO0/b;LA1/r;Ljava/util/ArrayList;ZILjava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLjava/util/LinkedHashSet;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 210
    .line 211
    .line 212
    const-string v4, ".canonicalName"

    .line 213
    .line 214
    iget-object v6, v0, LK0/l;->b:Ljava/lang/Class;

    .line 215
    .line 216
    invoke-virtual {v6}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-static {v7}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v7}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    invoke-static {v8}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    const-string v9, "fullPackage"

    .line 235
    .line 236
    invoke-static {v7, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    if-nez v9, :cond_a

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_a
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    add-int/2addr v9, v2

    .line 251
    invoke-virtual {v8, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    const-string v9, "this as java.lang.String).substring(startIndex)"

    .line 256
    .line 257
    invoke-static {v8, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :goto_4
    const/16 v9, 0x5f

    .line 261
    .line 262
    const/16 v10, 0x2e

    .line 263
    .line 264
    invoke-static {v8, v10, v9}, LL9/n;->F(Ljava/lang/String;CC)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    const-string v9, "_Impl"

    .line 269
    .line 270
    invoke-virtual {v8, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    if-nez v9, :cond_b

    .line 279
    .line 280
    move-object v7, v8

    .line 281
    goto :goto_5

    .line 282
    :cond_b
    new-instance v9, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    :goto_5
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    invoke-static {v7, v2, v9}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    const-string v9, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>"

    .line 309
    .line 310
    invoke-static {v7, v9}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v7}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 317
    check-cast v4, LK0/m;

    .line 318
    .line 319
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v4, v5}, LK0/m;->e(LK0/b;)LO0/c;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    iput-object v6, v4, LK0/m;->c:LO0/c;

    .line 327
    .line 328
    invoke-virtual {v4}, LK0/m;->h()Ljava/util/Set;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    new-instance v7, Ljava/util/BitSet;

    .line 333
    .line 334
    invoke-direct {v7}, Ljava/util/BitSet;-><init>()V

    .line 335
    .line 336
    .line 337
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    iget-object v9, v4, LK0/m;->g:Ljava/util/LinkedHashMap;

    .line 346
    .line 347
    iget-object v10, v5, LK0/b;->n:Ljava/util/ArrayList;

    .line 348
    .line 349
    if-eqz v8, :cond_10

    .line 350
    .line 351
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v8

    .line 355
    check-cast v8, Ljava/lang/Class;

    .line 356
    .line 357
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 358
    .line 359
    .line 360
    move-result v11

    .line 361
    add-int/2addr v11, v3

    .line 362
    if-ltz v11, :cond_e

    .line 363
    .line 364
    :goto_7
    add-int/lit8 v12, v11, -0x1

    .line 365
    .line 366
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v13

    .line 370
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    move-result-object v13

    .line 374
    invoke-virtual {v8, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 375
    .line 376
    .line 377
    move-result v13

    .line 378
    if-eqz v13, :cond_c

    .line 379
    .line 380
    invoke-virtual {v7, v11}, Ljava/util/BitSet;->set(I)V

    .line 381
    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_c
    if-gez v12, :cond_d

    .line 385
    .line 386
    goto :goto_8

    .line 387
    :cond_d
    move v11, v12

    .line 388
    goto :goto_7

    .line 389
    :cond_e
    :goto_8
    move v11, v3

    .line 390
    :goto_9
    if-ltz v11, :cond_f

    .line 391
    .line 392
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v10

    .line 396
    invoke-interface {v9, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    goto :goto_6

    .line 400
    :cond_f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 401
    .line 402
    const-string v2, "A required auto migration spec ("

    .line 403
    .line 404
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    const-string v2, ") is missing in the database configuration."

    .line 415
    .line 416
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    throw v2

    .line 433
    :cond_10
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    add-int/2addr v6, v3

    .line 438
    if-ltz v6, :cond_13

    .line 439
    .line 440
    :goto_a
    add-int/lit8 v8, v6, -0x1

    .line 441
    .line 442
    invoke-virtual {v7, v6}, Ljava/util/BitSet;->get(I)Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    if-eqz v6, :cond_12

    .line 447
    .line 448
    if-gez v8, :cond_11

    .line 449
    .line 450
    goto :goto_b

    .line 451
    :cond_11
    move v6, v8

    .line 452
    goto :goto_a

    .line 453
    :cond_12
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 454
    .line 455
    const-string v2, "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."

    .line 456
    .line 457
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw v1

    .line 461
    :cond_13
    :goto_b
    invoke-virtual {v4, v9}, LK0/m;->f(Ljava/util/LinkedHashMap;)Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v6

    .line 465
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    :cond_14
    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 470
    .line 471
    .line 472
    move-result v7

    .line 473
    if-eqz v7, :cond_17

    .line 474
    .line 475
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v7

    .line 479
    check-cast v7, LL0/a;

    .line 480
    .line 481
    iget v8, v7, LL0/a;->a:I

    .line 482
    .line 483
    iget-object v9, v5, LK0/b;->d:LA1/r;

    .line 484
    .line 485
    iget-object v10, v9, LA1/r;->t:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v10, Ljava/util/LinkedHashMap;

    .line 488
    .line 489
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 490
    .line 491
    .line 492
    move-result-object v11

    .line 493
    invoke-interface {v10, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v11

    .line 497
    if-eqz v11, :cond_16

    .line 498
    .line 499
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    invoke-virtual {v10, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v8

    .line 507
    check-cast v8, Ljava/util/Map;

    .line 508
    .line 509
    if-nez v8, :cond_15

    .line 510
    .line 511
    sget-object v8, Li8/t;->s:Li8/t;

    .line 512
    .line 513
    :cond_15
    iget v10, v7, LL0/a;->b:I

    .line 514
    .line 515
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 516
    .line 517
    .line 518
    move-result-object v10

    .line 519
    invoke-interface {v8, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v8

    .line 523
    goto :goto_d

    .line 524
    :cond_16
    move/from16 v8, v20

    .line 525
    .line 526
    :goto_d
    if-nez v8, :cond_14

    .line 527
    .line 528
    new-array v8, v2, [LL0/a;

    .line 529
    .line 530
    aput-object v7, v8, v20

    .line 531
    .line 532
    invoke-virtual {v9, v8}, LA1/r;->H([LL0/a;)V

    .line 533
    .line 534
    .line 535
    goto :goto_c

    .line 536
    :cond_17
    invoke-virtual {v4}, LK0/m;->g()LO0/c;

    .line 537
    .line 538
    .line 539
    move-result-object v6

    .line 540
    const-class v7, LK0/p;

    .line 541
    .line 542
    invoke-static {v7, v6}, LK0/m;->p(Ljava/lang/Class;LO0/c;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v6

    .line 546
    check-cast v6, LK0/p;

    .line 547
    .line 548
    invoke-virtual {v4}, LK0/m;->g()LO0/c;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    const-class v7, LK0/a;

    .line 553
    .line 554
    invoke-static {v7, v6}, LK0/m;->p(Ljava/lang/Class;LO0/c;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v6

    .line 558
    check-cast v6, LK0/a;

    .line 559
    .line 560
    iget v6, v5, LK0/b;->g:I

    .line 561
    .line 562
    if-ne v6, v1, :cond_18

    .line 563
    .line 564
    move v1, v2

    .line 565
    goto :goto_e

    .line 566
    :cond_18
    move/from16 v1, v20

    .line 567
    .line 568
    :goto_e
    invoke-virtual {v4}, LK0/m;->g()LO0/c;

    .line 569
    .line 570
    .line 571
    move-result-object v6

    .line 572
    invoke-interface {v6, v1}, LO0/c;->setWriteAheadLoggingEnabled(Z)V

    .line 573
    .line 574
    .line 575
    iget-object v1, v5, LK0/b;->e:Ljava/util/ArrayList;

    .line 576
    .line 577
    iput-object v1, v4, LK0/m;->f:Ljava/util/ArrayList;

    .line 578
    .line 579
    iget-object v1, v5, LK0/b;->h:Ljava/util/concurrent/Executor;

    .line 580
    .line 581
    iput-object v1, v4, LK0/m;->b:Ljava/util/concurrent/Executor;

    .line 582
    .line 583
    const-string v1, "executor"

    .line 584
    .line 585
    iget-object v6, v5, LK0/b;->i:Ljava/util/concurrent/Executor;

    .line 586
    .line 587
    invoke-static {v6, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    new-instance v1, Ljava/util/ArrayDeque;

    .line 591
    .line 592
    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 593
    .line 594
    .line 595
    iget-boolean v1, v5, LK0/b;->f:Z

    .line 596
    .line 597
    iput-boolean v1, v4, LK0/m;->e:Z

    .line 598
    .line 599
    invoke-virtual {v4}, LK0/m;->i()Ljava/util/Map;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    new-instance v6, Ljava/util/BitSet;

    .line 604
    .line 605
    invoke-direct {v6}, Ljava/util/BitSet;-><init>()V

    .line 606
    .line 607
    .line 608
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    :cond_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 617
    .line 618
    .line 619
    move-result v7

    .line 620
    iget-object v8, v5, LK0/b;->m:Ljava/util/ArrayList;

    .line 621
    .line 622
    if-eqz v7, :cond_1f

    .line 623
    .line 624
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v7

    .line 628
    check-cast v7, Ljava/util/Map$Entry;

    .line 629
    .line 630
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v9

    .line 634
    check-cast v9, Ljava/lang/Class;

    .line 635
    .line 636
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v7

    .line 640
    check-cast v7, Ljava/util/List;

    .line 641
    .line 642
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 643
    .line 644
    .line 645
    move-result-object v7

    .line 646
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 647
    .line 648
    .line 649
    move-result v10

    .line 650
    if-eqz v10, :cond_19

    .line 651
    .line 652
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v10

    .line 656
    check-cast v10, Ljava/lang/Class;

    .line 657
    .line 658
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 659
    .line 660
    .line 661
    move-result v11

    .line 662
    add-int/2addr v11, v3

    .line 663
    if-ltz v11, :cond_1c

    .line 664
    .line 665
    :goto_10
    add-int/lit8 v12, v11, -0x1

    .line 666
    .line 667
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v13

    .line 671
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    move-result-object v13

    .line 675
    invoke-virtual {v10, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 676
    .line 677
    .line 678
    move-result v13

    .line 679
    if-eqz v13, :cond_1a

    .line 680
    .line 681
    invoke-virtual {v6, v11}, Ljava/util/BitSet;->set(I)V

    .line 682
    .line 683
    .line 684
    goto :goto_12

    .line 685
    :cond_1a
    if-gez v12, :cond_1b

    .line 686
    .line 687
    goto :goto_11

    .line 688
    :cond_1b
    move v11, v12

    .line 689
    goto :goto_10

    .line 690
    :cond_1c
    :goto_11
    move v11, v3

    .line 691
    :goto_12
    if-ltz v11, :cond_1d

    .line 692
    .line 693
    move v12, v2

    .line 694
    goto :goto_13

    .line 695
    :cond_1d
    move/from16 v12, v20

    .line 696
    .line 697
    :goto_13
    if-eqz v12, :cond_1e

    .line 698
    .line 699
    iget-object v12, v4, LK0/m;->j:Ljava/util/LinkedHashMap;

    .line 700
    .line 701
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v11

    .line 705
    invoke-interface {v12, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    goto :goto_f

    .line 709
    :cond_1e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 710
    .line 711
    const-string v2, "A required type converter ("

    .line 712
    .line 713
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 717
    .line 718
    .line 719
    const-string v2, ") for "

    .line 720
    .line 721
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v9}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    const-string v2, " is missing in the database configuration."

    .line 732
    .line 733
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 741
    .line 742
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    throw v2

    .line 750
    :cond_1f
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 751
    .line 752
    .line 753
    move-result v1

    .line 754
    add-int/2addr v1, v3

    .line 755
    if-ltz v1, :cond_22

    .line 756
    .line 757
    :goto_14
    add-int/lit8 v2, v1, -0x1

    .line 758
    .line 759
    invoke-virtual {v6, v1}, Ljava/util/BitSet;->get(I)Z

    .line 760
    .line 761
    .line 762
    move-result v5

    .line 763
    if-eqz v5, :cond_21

    .line 764
    .line 765
    if-gez v2, :cond_20

    .line 766
    .line 767
    goto :goto_15

    .line 768
    :cond_20
    move v1, v2

    .line 769
    goto :goto_14

    .line 770
    :cond_21
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 775
    .line 776
    new-instance v3, Ljava/lang/StringBuilder;

    .line 777
    .line 778
    const-string v4, "Unexpected type converter "

    .line 779
    .line 780
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    const-string v1, ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."

    .line 787
    .line 788
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    throw v2

    .line 799
    :cond_22
    :goto_15
    return-object v4

    .line 800
    :catch_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 801
    .line 802
    new-instance v2, Ljava/lang/StringBuilder;

    .line 803
    .line 804
    const-string v3, "Failed to create an instance of "

    .line 805
    .line 806
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v2

    .line 819
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    throw v1

    .line 823
    :catch_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 824
    .line 825
    new-instance v2, Ljava/lang/StringBuilder;

    .line 826
    .line 827
    const-string v3, "Cannot access the constructor "

    .line 828
    .line 829
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    .line 838
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    throw v1

    .line 846
    :catch_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 847
    .line 848
    new-instance v2, Ljava/lang/StringBuilder;

    .line 849
    .line 850
    const-string v3, "Cannot find implementation for "

    .line 851
    .line 852
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v3

    .line 859
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 860
    .line 861
    .line 862
    const-string v3, ". "

    .line 863
    .line 864
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 868
    .line 869
    .line 870
    const-string v3, " does not exist"

    .line 871
    .line 872
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    throw v1

    .line 883
    :cond_23
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 884
    .line 885
    invoke-direct {v1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    throw v1

    .line 889
    :cond_24
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 890
    .line 891
    invoke-direct {v1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    throw v1

    .line 895
    :cond_25
    throw v7
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
