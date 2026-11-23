.class public final LX9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/util/ArrayList;

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, LX9/x;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, LX9/x;->c:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, LX9/x;->e:I

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, LX9/x;->f:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
.end method


# virtual methods
.method public final a()LX9/y;
    .locals 13

    .line 1
    iget-object v1, p0, LX9/x;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v1, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, LX9/x;->b:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x7

    .line 9
    invoke-static {v0, v2, v2, v3}, LX9/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v4, p0, LX9/x;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v4, v2, v2, v3}, LX9/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    move v5, v3

    .line 20
    move-object v3, v4

    .line 21
    iget-object v4, p0, LX9/x;->d:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v4, :cond_5

    .line 24
    .line 25
    move v6, v5

    .line 26
    invoke-virtual {p0}, LX9/x;->b()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    iget-object v7, p0, LX9/x;->f:Ljava/util/ArrayList;

    .line 31
    .line 32
    move v8, v6

    .line 33
    new-instance v6, Ljava/util/ArrayList;

    .line 34
    .line 35
    const/16 v9, 0xa

    .line 36
    .line 37
    invoke-static {v7, v9}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    if-eqz v10, :cond_0

    .line 53
    .line 54
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    check-cast v10, Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v10, v2, v2, v8}, LX9/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v7, p0, LX9/x;->g:Ljava/util/ArrayList;

    .line 69
    .line 70
    const/4 v10, 0x0

    .line 71
    if-nez v7, :cond_1

    .line 72
    .line 73
    move-object v7, v10

    .line 74
    goto :goto_3

    .line 75
    :cond_1
    new-instance v11, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-static {v7, v9}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    invoke-direct {v11, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_3

    .line 93
    .line 94
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    check-cast v9, Ljava/lang/String;

    .line 99
    .line 100
    if-nez v9, :cond_2

    .line 101
    .line 102
    move-object v9, v10

    .line 103
    goto :goto_2

    .line 104
    :cond_2
    const/4 v12, 0x3

    .line 105
    invoke-static {v9, v2, v2, v12}, LX9/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    :goto_2
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    move-object v7, v11

    .line 114
    :goto_3
    iget-object v9, p0, LX9/x;->h:Ljava/lang/String;

    .line 115
    .line 116
    if-nez v9, :cond_4

    .line 117
    .line 118
    :goto_4
    move-object v8, v10

    .line 119
    goto :goto_5

    .line 120
    :cond_4
    invoke-static {v9, v2, v2, v8}, LX9/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    goto :goto_4

    .line 125
    :goto_5
    invoke-virtual {p0}, LX9/x;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    move-object v2, v0

    .line 130
    new-instance v0, LX9/y;

    .line 131
    .line 132
    invoke-direct/range {v0 .. v9}, LX9/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    const-string v1, "host == null"

    .line 139
    .line 140
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    const-string v1, "scheme == null"

    .line 147
    .line 148
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v0
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

.method public final b()I
    .locals 3

    .line 1
    iget v0, p0, LX9/x;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v0, p0, LX9/x;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "http"

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    const/16 v1, 0x50

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string v2, "https"

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const/16 v1, 0x1bb

    .line 32
    .line 33
    :cond_2
    :goto_0
    return v1
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

.method public final c(LX9/y;Ljava/lang/String;)V
    .locals 18

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
    const/4 v4, 0x1

    .line 8
    const-string v5, "input"

    .line 9
    .line 10
    invoke-static {v2, v5}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v5, LY9/c;->a:[B

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const/4 v6, 0x0

    .line 20
    invoke-static {v6, v2, v5}, LY9/c;->n(ILjava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    invoke-static {v5, v2, v7}, LY9/c;->o(ILjava/lang/String;I)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    sub-int v8, v7, v5

    .line 33
    .line 34
    const/4 v9, -0x1

    .line 35
    const/16 v10, 0x5b

    .line 36
    .line 37
    const/4 v11, 0x2

    .line 38
    const/16 v12, 0x3a

    .line 39
    .line 40
    if-ge v8, v11, :cond_1

    .line 41
    .line 42
    :cond_0
    :goto_0
    const/16 v16, 0x6

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    const/16 v13, 0x61

    .line 50
    .line 51
    invoke-static {v8, v13}, Lv8/i;->h(II)I

    .line 52
    .line 53
    .line 54
    move-result v14

    .line 55
    const/16 v15, 0x41

    .line 56
    .line 57
    if-ltz v14, :cond_2

    .line 58
    .line 59
    const/16 v14, 0x7a

    .line 60
    .line 61
    invoke-static {v8, v14}, Lv8/i;->h(II)I

    .line 62
    .line 63
    .line 64
    move-result v14

    .line 65
    if-lez v14, :cond_3

    .line 66
    .line 67
    :cond_2
    invoke-static {v8, v15}, Lv8/i;->h(II)I

    .line 68
    .line 69
    .line 70
    move-result v14

    .line 71
    if-ltz v14, :cond_0

    .line 72
    .line 73
    const/16 v14, 0x5a

    .line 74
    .line 75
    invoke-static {v8, v14}, Lv8/i;->h(II)I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-lez v8, :cond_3

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    add-int/lit8 v8, v5, 0x1

    .line 83
    .line 84
    :goto_1
    if-ge v8, v7, :cond_0

    .line 85
    .line 86
    add-int/lit8 v14, v8, 0x1

    .line 87
    .line 88
    const/16 v16, 0x6

    .line 89
    .line 90
    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-gt v13, v3, :cond_4

    .line 95
    .line 96
    const/16 v13, 0x7b

    .line 97
    .line 98
    if-ge v3, v13, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    if-gt v15, v3, :cond_5

    .line 102
    .line 103
    if-ge v3, v10, :cond_5

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    const/16 v13, 0x30

    .line 107
    .line 108
    if-gt v13, v3, :cond_6

    .line 109
    .line 110
    if-ge v3, v12, :cond_6

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_6
    const/16 v13, 0x2b

    .line 114
    .line 115
    if-ne v3, v13, :cond_7

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_7
    const/16 v13, 0x2d

    .line 119
    .line 120
    if-ne v3, v13, :cond_8

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_8
    const/16 v13, 0x2e

    .line 124
    .line 125
    if-ne v3, v13, :cond_9

    .line 126
    .line 127
    :goto_2
    move v8, v14

    .line 128
    const/16 v13, 0x61

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_9
    if-ne v3, v12, :cond_a

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_a
    :goto_3
    move v8, v9

    .line 135
    :goto_4
    const-string v3, "http"

    .line 136
    .line 137
    const-string v13, "https"

    .line 138
    .line 139
    const-string v14, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 140
    .line 141
    if-eq v8, v9, :cond_d

    .line 142
    .line 143
    const-string v15, "https:"

    .line 144
    .line 145
    invoke-static {v2, v5, v15, v4}, LL9/n;->H(Ljava/lang/String;ILjava/lang/String;Z)Z

    .line 146
    .line 147
    .line 148
    move-result v15

    .line 149
    if-eqz v15, :cond_b

    .line 150
    .line 151
    iput-object v13, v0, LX9/x;->a:Ljava/lang/String;

    .line 152
    .line 153
    add-int/lit8 v5, v5, 0x6

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_b
    const-string v15, "http:"

    .line 157
    .line 158
    invoke-static {v2, v5, v15, v4}, LL9/n;->H(Ljava/lang/String;ILjava/lang/String;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v15

    .line 162
    if-eqz v15, :cond_c

    .line 163
    .line 164
    iput-object v3, v0, LX9/x;->a:Ljava/lang/String;

    .line 165
    .line 166
    add-int/lit8 v5, v5, 0x5

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 170
    .line 171
    new-instance v3, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    const-string v4, "Expected URL scheme \'http\' or \'https\' but was \'"

    .line 174
    .line 175
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-static {v2, v14}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const/16 v2, 0x27

    .line 189
    .line 190
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v1

    .line 201
    :cond_d
    if-eqz v1, :cond_34

    .line 202
    .line 203
    iget-object v8, v1, LX9/y;->a:Ljava/lang/String;

    .line 204
    .line 205
    iput-object v8, v0, LX9/x;->a:Ljava/lang/String;

    .line 206
    .line 207
    :goto_5
    move/from16 v17, v4

    .line 208
    .line 209
    move v8, v5

    .line 210
    move v15, v6

    .line 211
    :goto_6
    const/16 v4, 0x2f

    .line 212
    .line 213
    const/16 v10, 0x5c

    .line 214
    .line 215
    if-ge v8, v7, :cond_f

    .line 216
    .line 217
    add-int/lit8 v16, v8, 0x1

    .line 218
    .line 219
    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    if-eq v8, v10, :cond_e

    .line 224
    .line 225
    if-ne v8, v4, :cond_f

    .line 226
    .line 227
    :cond_e
    add-int/lit8 v15, v15, 0x1

    .line 228
    .line 229
    move/from16 v8, v16

    .line 230
    .line 231
    const/16 v10, 0x5b

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_f
    iget-object v8, v0, LX9/x;->f:Ljava/util/ArrayList;

    .line 235
    .line 236
    const-string v12, " \"\'<>#"

    .line 237
    .line 238
    const-string v10, ""

    .line 239
    .line 240
    const/16 v4, 0x23

    .line 241
    .line 242
    if-ge v15, v11, :cond_13

    .line 243
    .line 244
    if-eqz v1, :cond_13

    .line 245
    .line 246
    iget-object v11, v0, LX9/x;->a:Ljava/lang/String;

    .line 247
    .line 248
    iget-object v9, v1, LX9/y;->a:Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {v9, v11}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    if-nez v9, :cond_10

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_10
    invoke-virtual {v1}, LX9/y;->e()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    iput-object v3, v0, LX9/x;->b:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v1}, LX9/y;->a()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    iput-object v3, v0, LX9/x;->c:Ljava/lang/String;

    .line 268
    .line 269
    iget-object v3, v1, LX9/y;->d:Ljava/lang/String;

    .line 270
    .line 271
    iput-object v3, v0, LX9/x;->d:Ljava/lang/String;

    .line 272
    .line 273
    iget v3, v1, LX9/y;->e:I

    .line 274
    .line 275
    iput v3, v0, LX9/x;->e:I

    .line 276
    .line 277
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, LX9/y;->c()Ljava/util/ArrayList;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 285
    .line 286
    .line 287
    if-eq v5, v7, :cond_11

    .line 288
    .line 289
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    if-ne v3, v4, :cond_24

    .line 294
    .line 295
    :cond_11
    invoke-virtual {v1}, LX9/y;->d()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    if-nez v1, :cond_12

    .line 300
    .line 301
    const/4 v1, 0x0

    .line 302
    goto :goto_7

    .line 303
    :cond_12
    const/16 v3, 0xd3

    .line 304
    .line 305
    invoke-static {v1, v6, v6, v12, v3}, LX9/b;->b(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-static {v1}, LX9/b;->f(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    :goto_7
    iput-object v1, v0, LX9/x;->g:Ljava/util/ArrayList;

    .line 314
    .line 315
    goto/16 :goto_15

    .line 316
    .line 317
    :cond_13
    :goto_8
    add-int/2addr v5, v15

    .line 318
    move v1, v6

    .line 319
    move v9, v1

    .line 320
    :goto_9
    const-string v11, "@/\\?#"

    .line 321
    .line 322
    invoke-static {v2, v5, v11, v7}, LY9/c;->g(Ljava/lang/String;ILjava/lang/String;I)I

    .line 323
    .line 324
    .line 325
    move-result v11

    .line 326
    if-eq v11, v7, :cond_14

    .line 327
    .line 328
    invoke-virtual {v2, v11}, Ljava/lang/String;->charAt(I)C

    .line 329
    .line 330
    .line 331
    move-result v15

    .line 332
    :goto_a
    const/4 v6, -0x1

    .line 333
    goto :goto_b

    .line 334
    :cond_14
    const/4 v15, -0x1

    .line 335
    goto :goto_a

    .line 336
    :goto_b
    if-eq v15, v6, :cond_19

    .line 337
    .line 338
    if-eq v15, v4, :cond_19

    .line 339
    .line 340
    const/16 v6, 0x2f

    .line 341
    .line 342
    if-eq v15, v6, :cond_19

    .line 343
    .line 344
    const/16 v6, 0x5c

    .line 345
    .line 346
    if-eq v15, v6, :cond_19

    .line 347
    .line 348
    const/16 v6, 0x3f

    .line 349
    .line 350
    if-eq v15, v6, :cond_19

    .line 351
    .line 352
    const/16 v6, 0x40

    .line 353
    .line 354
    if-eq v15, v6, :cond_15

    .line 355
    .line 356
    :goto_c
    const/4 v6, 0x0

    .line 357
    goto :goto_9

    .line 358
    :cond_15
    const-string v6, " \"\':;<=>@[]^`{}|/\\?#"

    .line 359
    .line 360
    const-string v15, "%40"

    .line 361
    .line 362
    if-nez v1, :cond_18

    .line 363
    .line 364
    move/from16 p1, v1

    .line 365
    .line 366
    const/16 v4, 0x3a

    .line 367
    .line 368
    invoke-static {v2, v4, v5, v11}, LY9/c;->f(Ljava/lang/String;CII)I

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    const/16 v4, 0xf0

    .line 373
    .line 374
    invoke-static {v2, v5, v1, v6, v4}, LX9/b;->b(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    if-eqz v9, :cond_16

    .line 379
    .line 380
    new-instance v4, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 383
    .line 384
    .line 385
    iget-object v9, v0, LX9/x;->b:Ljava/lang/String;

    .line 386
    .line 387
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    :cond_16
    iput-object v5, v0, LX9/x;->b:Ljava/lang/String;

    .line 401
    .line 402
    if-eq v1, v11, :cond_17

    .line 403
    .line 404
    add-int/lit8 v1, v1, 0x1

    .line 405
    .line 406
    const/16 v4, 0xf0

    .line 407
    .line 408
    invoke-static {v2, v1, v11, v6, v4}, LX9/b;->b(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    iput-object v1, v0, LX9/x;->c:Ljava/lang/String;

    .line 413
    .line 414
    move/from16 v1, v17

    .line 415
    .line 416
    goto :goto_d

    .line 417
    :cond_17
    const/16 v4, 0xf0

    .line 418
    .line 419
    move/from16 v1, p1

    .line 420
    .line 421
    :goto_d
    move/from16 v9, v17

    .line 422
    .line 423
    goto :goto_e

    .line 424
    :cond_18
    move/from16 p1, v1

    .line 425
    .line 426
    const/16 v4, 0xf0

    .line 427
    .line 428
    new-instance v1, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    iget-object v4, v0, LX9/x;->c:Ljava/lang/String;

    .line 434
    .line 435
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    const/16 v4, 0xf0

    .line 442
    .line 443
    invoke-static {v2, v5, v11, v6, v4}, LX9/b;->b(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    iput-object v1, v0, LX9/x;->c:Ljava/lang/String;

    .line 455
    .line 456
    move/from16 v1, p1

    .line 457
    .line 458
    :goto_e
    add-int/lit8 v5, v11, 0x1

    .line 459
    .line 460
    const/16 v4, 0x23

    .line 461
    .line 462
    goto :goto_c

    .line 463
    :cond_19
    move v1, v5

    .line 464
    :goto_f
    if-ge v1, v11, :cond_1e

    .line 465
    .line 466
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    const/16 v6, 0x5b

    .line 471
    .line 472
    if-ne v4, v6, :cond_1c

    .line 473
    .line 474
    :cond_1a
    add-int/lit8 v1, v1, 0x1

    .line 475
    .line 476
    if-ge v1, v11, :cond_1b

    .line 477
    .line 478
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 479
    .line 480
    .line 481
    move-result v4

    .line 482
    const/16 v9, 0x5d

    .line 483
    .line 484
    if-ne v4, v9, :cond_1a

    .line 485
    .line 486
    :cond_1b
    const/16 v9, 0x3a

    .line 487
    .line 488
    goto :goto_10

    .line 489
    :cond_1c
    const/16 v9, 0x3a

    .line 490
    .line 491
    if-ne v4, v9, :cond_1d

    .line 492
    .line 493
    goto :goto_11

    .line 494
    :cond_1d
    :goto_10
    add-int/lit8 v1, v1, 0x1

    .line 495
    .line 496
    goto :goto_f

    .line 497
    :cond_1e
    move v1, v11

    .line 498
    :goto_11
    add-int/lit8 v4, v1, 0x1

    .line 499
    .line 500
    const/4 v6, 0x4

    .line 501
    const/16 v9, 0x22

    .line 502
    .line 503
    if-ge v4, v11, :cond_21

    .line 504
    .line 505
    invoke-static {v2, v5, v1, v6}, LX9/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    invoke-static {v3}, LC3/a;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    iput-object v3, v0, LX9/x;->d:Ljava/lang/String;

    .line 514
    .line 515
    const/16 v3, 0xf8

    .line 516
    .line 517
    :try_start_0
    invoke-static {v2, v4, v11, v10, v3}, LX9/b;->b(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 522
    .line 523
    .line 524
    move-result v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 525
    move/from16 v3, v17

    .line 526
    .line 527
    if-gt v3, v6, :cond_1f

    .line 528
    .line 529
    const/high16 v3, 0x10000

    .line 530
    .line 531
    if-ge v6, v3, :cond_1f

    .line 532
    .line 533
    goto :goto_12

    .line 534
    :catch_0
    :cond_1f
    const/4 v6, -0x1

    .line 535
    :goto_12
    iput v6, v0, LX9/x;->e:I

    .line 536
    .line 537
    const/4 v15, -0x1

    .line 538
    if-eq v6, v15, :cond_20

    .line 539
    .line 540
    goto :goto_14

    .line 541
    :cond_20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 542
    .line 543
    const-string v3, "Invalid URL port: \""

    .line 544
    .line 545
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2, v4, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    invoke-static {v2, v14}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 566
    .line 567
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    throw v2

    .line 575
    :cond_21
    const/4 v15, -0x1

    .line 576
    invoke-static {v2, v5, v1, v6}, LX9/b;->e(Ljava/lang/String;III)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v4

    .line 580
    invoke-static {v4}, LC3/a;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    iput-object v4, v0, LX9/x;->d:Ljava/lang/String;

    .line 585
    .line 586
    iget-object v4, v0, LX9/x;->a:Ljava/lang/String;

    .line 587
    .line 588
    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    if-eqz v3, :cond_22

    .line 596
    .line 597
    const/16 v3, 0x50

    .line 598
    .line 599
    goto :goto_13

    .line 600
    :cond_22
    invoke-virtual {v4, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v3

    .line 604
    if-eqz v3, :cond_23

    .line 605
    .line 606
    const/16 v3, 0x1bb

    .line 607
    .line 608
    goto :goto_13

    .line 609
    :cond_23
    move v3, v15

    .line 610
    :goto_13
    iput v3, v0, LX9/x;->e:I

    .line 611
    .line 612
    :goto_14
    iget-object v3, v0, LX9/x;->d:Ljava/lang/String;

    .line 613
    .line 614
    if-eqz v3, :cond_33

    .line 615
    .line 616
    move v5, v11

    .line 617
    :cond_24
    :goto_15
    const-string v1, "?#"

    .line 618
    .line 619
    invoke-static {v2, v5, v1, v7}, LY9/c;->g(Ljava/lang/String;ILjava/lang/String;I)I

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-ne v5, v1, :cond_26

    .line 624
    .line 625
    :cond_25
    const/16 v17, 0x1

    .line 626
    .line 627
    goto/16 :goto_1d

    .line 628
    .line 629
    :cond_26
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    const/16 v6, 0x2f

    .line 634
    .line 635
    if-eq v3, v6, :cond_27

    .line 636
    .line 637
    const/16 v6, 0x5c

    .line 638
    .line 639
    if-ne v3, v6, :cond_28

    .line 640
    .line 641
    :cond_27
    const/16 v17, 0x1

    .line 642
    .line 643
    goto :goto_16

    .line 644
    :cond_28
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 645
    .line 646
    .line 647
    move-result v3

    .line 648
    const/16 v17, 0x1

    .line 649
    .line 650
    add-int/lit8 v3, v3, -0x1

    .line 651
    .line 652
    invoke-virtual {v8, v3, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    goto :goto_17

    .line 656
    :goto_16
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    add-int/lit8 v5, v5, 0x1

    .line 663
    .line 664
    :goto_17
    if-ge v5, v1, :cond_25

    .line 665
    .line 666
    const-string v3, "/\\"

    .line 667
    .line 668
    invoke-static {v2, v5, v3, v1}, LY9/c;->g(Ljava/lang/String;ILjava/lang/String;I)I

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    if-ge v3, v1, :cond_29

    .line 673
    .line 674
    const/4 v4, 0x1

    .line 675
    goto :goto_18

    .line 676
    :cond_29
    const/4 v4, 0x0

    .line 677
    :goto_18
    const-string v6, " \"<>^`{}|/\\?#"

    .line 678
    .line 679
    const/16 v9, 0xf0

    .line 680
    .line 681
    invoke-static {v2, v5, v3, v6, v9}, LX9/b;->b(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v5

    .line 685
    const-string v6, "."

    .line 686
    .line 687
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move-result v6

    .line 691
    if-nez v6, :cond_2d

    .line 692
    .line 693
    const-string v6, "%2e"

    .line 694
    .line 695
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 696
    .line 697
    .line 698
    move-result v6

    .line 699
    if-eqz v6, :cond_2a

    .line 700
    .line 701
    goto :goto_1a

    .line 702
    :cond_2a
    const-string v6, ".."

    .line 703
    .line 704
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-result v6

    .line 708
    if-nez v6, :cond_2e

    .line 709
    .line 710
    const-string v6, "%2e."

    .line 711
    .line 712
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 713
    .line 714
    .line 715
    move-result v6

    .line 716
    if-nez v6, :cond_2e

    .line 717
    .line 718
    const-string v6, ".%2e"

    .line 719
    .line 720
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 721
    .line 722
    .line 723
    move-result v6

    .line 724
    if-nez v6, :cond_2e

    .line 725
    .line 726
    const-string v6, "%2e%2e"

    .line 727
    .line 728
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 729
    .line 730
    .line 731
    move-result v6

    .line 732
    if-eqz v6, :cond_2b

    .line 733
    .line 734
    goto :goto_1b

    .line 735
    :cond_2b
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 736
    .line 737
    .line 738
    move-result v6

    .line 739
    const/16 v17, 0x1

    .line 740
    .line 741
    add-int/lit8 v6, v6, -0x1

    .line 742
    .line 743
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v6

    .line 747
    check-cast v6, Ljava/lang/CharSequence;

    .line 748
    .line 749
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 750
    .line 751
    .line 752
    move-result v6

    .line 753
    if-nez v6, :cond_2c

    .line 754
    .line 755
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 756
    .line 757
    .line 758
    move-result v6

    .line 759
    add-int/lit8 v6, v6, -0x1

    .line 760
    .line 761
    invoke-virtual {v8, v6, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    goto :goto_19

    .line 765
    :cond_2c
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    :goto_19
    if-eqz v4, :cond_2d

    .line 769
    .line 770
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    :cond_2d
    :goto_1a
    const/16 v17, 0x1

    .line 774
    .line 775
    goto :goto_1c

    .line 776
    :cond_2e
    :goto_1b
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 777
    .line 778
    .line 779
    move-result v5

    .line 780
    const/16 v17, 0x1

    .line 781
    .line 782
    add-int/lit8 v5, v5, -0x1

    .line 783
    .line 784
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v5

    .line 788
    check-cast v5, Ljava/lang/String;

    .line 789
    .line 790
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 791
    .line 792
    .line 793
    move-result v5

    .line 794
    if-nez v5, :cond_2f

    .line 795
    .line 796
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 797
    .line 798
    .line 799
    move-result v5

    .line 800
    if-nez v5, :cond_2f

    .line 801
    .line 802
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 803
    .line 804
    .line 805
    move-result v5

    .line 806
    add-int/lit8 v5, v5, -0x1

    .line 807
    .line 808
    invoke-virtual {v8, v5, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    goto :goto_1c

    .line 812
    :cond_2f
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    :goto_1c
    if-eqz v4, :cond_30

    .line 816
    .line 817
    add-int/lit8 v5, v3, 0x1

    .line 818
    .line 819
    goto/16 :goto_17

    .line 820
    .line 821
    :cond_30
    move v5, v3

    .line 822
    goto/16 :goto_17

    .line 823
    .line 824
    :goto_1d
    if-ge v1, v7, :cond_31

    .line 825
    .line 826
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 827
    .line 828
    .line 829
    move-result v3

    .line 830
    const/16 v6, 0x3f

    .line 831
    .line 832
    if-ne v3, v6, :cond_31

    .line 833
    .line 834
    const/16 v3, 0x23

    .line 835
    .line 836
    invoke-static {v2, v3, v1, v7}, LY9/c;->f(Ljava/lang/String;CII)I

    .line 837
    .line 838
    .line 839
    move-result v4

    .line 840
    add-int/lit8 v1, v1, 0x1

    .line 841
    .line 842
    const/16 v3, 0xd0

    .line 843
    .line 844
    invoke-static {v2, v1, v4, v12, v3}, LX9/b;->b(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v1

    .line 848
    invoke-static {v1}, LX9/b;->f(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 849
    .line 850
    .line 851
    move-result-object v1

    .line 852
    iput-object v1, v0, LX9/x;->g:Ljava/util/ArrayList;

    .line 853
    .line 854
    move v1, v4

    .line 855
    :cond_31
    if-ge v1, v7, :cond_32

    .line 856
    .line 857
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 858
    .line 859
    .line 860
    move-result v3

    .line 861
    const/16 v4, 0x23

    .line 862
    .line 863
    if-ne v3, v4, :cond_32

    .line 864
    .line 865
    const/16 v17, 0x1

    .line 866
    .line 867
    add-int/lit8 v1, v1, 0x1

    .line 868
    .line 869
    const/16 v3, 0xb0

    .line 870
    .line 871
    invoke-static {v2, v1, v7, v10, v3}, LX9/b;->b(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v1

    .line 875
    iput-object v1, v0, LX9/x;->h:Ljava/lang/String;

    .line 876
    .line 877
    :cond_32
    return-void

    .line 878
    :cond_33
    new-instance v3, Ljava/lang/StringBuilder;

    .line 879
    .line 880
    const-string v4, "Invalid URL host: \""

    .line 881
    .line 882
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v2, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v1

    .line 889
    invoke-static {v1, v14}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 896
    .line 897
    .line 898
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v1

    .line 902
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 903
    .line 904
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 905
    .line 906
    .line 907
    move-result-object v1

    .line 908
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 909
    .line 910
    .line 911
    throw v2

    .line 912
    :cond_34
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 913
    .line 914
    .line 915
    move-result v1

    .line 916
    move/from16 v3, v16

    .line 917
    .line 918
    if-le v1, v3, :cond_35

    .line 919
    .line 920
    invoke-static {v3, v2}, LL9/f;->i0(ILjava/lang/String;)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    const-string v2, "..."

    .line 925
    .line 926
    invoke-static {v2, v1}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    goto :goto_1e

    .line 931
    :cond_35
    move-object v1, v2

    .line 932
    :goto_1e
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 933
    .line 934
    const-string v3, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    .line 935
    .line 936
    invoke-static {v1, v3}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    throw v2
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

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LX9/x;->a:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "://"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v1, "//"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v1, p0, LX9/x;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v2, 0x3a

    .line 31
    .line 32
    if-lez v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v1, p0, LX9/x;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-lez v1, :cond_3

    .line 42
    .line 43
    :goto_1
    iget-object v1, p0, LX9/x;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, LX9/x;->c:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-lez v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, LX9/x;->c:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_2
    const/16 v1, 0x40

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v1, p0, LX9/x;->d:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-static {v1, v2}, LL9/f;->K(Ljava/lang/CharSequence;C)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    const/16 v1, 0x5b

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, LX9/x;->d:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 v1, 0x5d

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    iget-object v1, p0, LX9/x;->d:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_2
    iget v1, p0, LX9/x;->e:I

    .line 101
    .line 102
    const/4 v3, -0x1

    .line 103
    if-ne v1, v3, :cond_6

    .line 104
    .line 105
    iget-object v1, p0, LX9/x;->a:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v1, :cond_a

    .line 108
    .line 109
    :cond_6
    invoke-virtual {p0}, LX9/x;->b()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    iget-object v4, p0, LX9/x;->a:Ljava/lang/String;

    .line 114
    .line 115
    if-eqz v4, :cond_9

    .line 116
    .line 117
    const-string v5, "http"

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    const/16 v3, 0x50

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_7
    const-string v5, "https"

    .line 129
    .line 130
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_8

    .line 135
    .line 136
    const/16 v3, 0x1bb

    .line 137
    .line 138
    :cond_8
    :goto_3
    if-eq v1, v3, :cond_a

    .line 139
    .line 140
    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    :cond_a
    iget-object v1, p0, LX9/x;->f:Ljava/util/ArrayList;

    .line 147
    .line 148
    const-string v2, "<this>"

    .line 149
    .line 150
    invoke-static {v1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    const/4 v3, 0x0

    .line 158
    :goto_4
    if-ge v3, v2, :cond_b

    .line 159
    .line 160
    add-int/lit8 v4, v3, 0x1

    .line 161
    .line 162
    const/16 v5, 0x2f

    .line 163
    .line 164
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    move v3, v4

    .line 177
    goto :goto_4

    .line 178
    :cond_b
    iget-object v1, p0, LX9/x;->g:Ljava/util/ArrayList;

    .line 179
    .line 180
    if-eqz v1, :cond_c

    .line 181
    .line 182
    const/16 v1, 0x3f

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    iget-object v1, p0, LX9/x;->g:Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v1, v0}, LX9/b;->g(Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    .line 193
    .line 194
    .line 195
    :cond_c
    iget-object v1, p0, LX9/x;->h:Ljava/lang/String;

    .line 196
    .line 197
    if-eqz v1, :cond_d

    .line 198
    .line 199
    const/16 v1, 0x23

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    iget-object v1, p0, LX9/x;->h:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    :cond_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 214
    .line 215
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-object v0
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
