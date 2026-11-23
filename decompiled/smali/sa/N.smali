.class public final Lsa/N;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final t:[C

.field public static final u:[I


# instance fields
.field public final a:Lsa/a;

.field public final b:Lsa/C;

.field public c:Lsa/e1;

.field public d:LK0/n;

.field public e:Z

.field public f:Ljava/lang/String;

.field public final g:Ljava/lang/StringBuilder;

.field public final h:Ljava/lang/StringBuilder;

.field public final i:Lsa/L;

.field public final j:Lsa/K;

.field public k:Lsa/M;

.field public final l:Lsa/G;

.field public final m:Lsa/I;

.field public final n:Lsa/H;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:I

.field public final r:[I

.field public final s:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    new-array v1, v1, [C

    .line 5
    .line 6
    fill-array-data v1, :array_0

    .line 7
    .line 8
    .line 9
    sput-object v1, Lsa/N;->t:[C

    .line 10
    .line 11
    new-array v0, v0, [I

    .line 12
    .line 13
    fill-array-data v0, :array_1

    .line 14
    .line 15
    .line 16
    sput-object v0, Lsa/N;->u:[I

    .line 17
    .line 18
    invoke-static {v1}, Ljava/util/Arrays;->sort([C)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :array_0
    .array-data 2
        0x9s
        0xas
        0xds
        0xcs
        0x20s
        0x3cs
        0x26s
    .end array-data

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
    nop

    .line 35
    :array_1
    .array-data 4
        0x20ac
        0x81
        0x201a
        0x192
        0x201e
        0x2026
        0x2020
        0x2021
        0x2c6
        0x2030
        0x160
        0x2039
        0x152
        0x8d
        0x17d
        0x8f
        0x90
        0x2018
        0x2019
        0x201c
        0x201d
        0x2022
        0x2013
        0x2014
        0x2dc
        0x2122
        0x161
        0x203a
        0x153
        0x9d
        0x17e
        0x178
    .end array-data
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

.method public constructor <init>(Lsa/a;Lsa/C;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lsa/e1;->s:Lsa/Z;

    .line 5
    .line 6
    iput-object v0, p0, Lsa/N;->c:Lsa/e1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lsa/N;->d:LK0/n;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-boolean v1, p0, Lsa/N;->e:Z

    .line 13
    .line 14
    iput-object v0, p0, Lsa/N;->f:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const/16 v1, 0x400

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lsa/N;->g:Ljava/lang/StringBuilder;

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lsa/N;->h:Ljava/lang/StringBuilder;

    .line 31
    .line 32
    new-instance v0, Lsa/L;

    .line 33
    .line 34
    invoke-direct {v0}, Lsa/L;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lsa/N;->i:Lsa/L;

    .line 38
    .line 39
    new-instance v1, Lsa/K;

    .line 40
    .line 41
    invoke-direct {v1}, Lsa/K;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lsa/N;->j:Lsa/K;

    .line 45
    .line 46
    iput-object v0, p0, Lsa/N;->k:Lsa/M;

    .line 47
    .line 48
    new-instance v0, Lsa/G;

    .line 49
    .line 50
    invoke-direct {v0}, Lsa/G;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lsa/N;->l:Lsa/G;

    .line 54
    .line 55
    new-instance v0, Lsa/I;

    .line 56
    .line 57
    invoke-direct {v0}, Lsa/I;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lsa/N;->m:Lsa/I;

    .line 61
    .line 62
    new-instance v0, Lsa/H;

    .line 63
    .line 64
    invoke-direct {v0}, Lsa/H;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lsa/N;->n:Lsa/H;

    .line 68
    .line 69
    const/4 v0, -0x1

    .line 70
    iput v0, p0, Lsa/N;->q:I

    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    new-array v0, v0, [I

    .line 74
    .line 75
    iput-object v0, p0, Lsa/N;->r:[I

    .line 76
    .line 77
    const/4 v0, 0x2

    .line 78
    new-array v0, v0, [I

    .line 79
    .line 80
    iput-object v0, p0, Lsa/N;->s:[I

    .line 81
    .line 82
    iput-object p1, p0, Lsa/N;->a:Lsa/a;

    .line 83
    .line 84
    iput-object p2, p0, Lsa/N;->b:Lsa/C;

    .line 85
    .line 86
    return-void
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
.method public final varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsa/N;->b:Lsa/C;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsa/C;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lo1/r;

    .line 10
    .line 11
    const-string v2, "Invalid character reference: "

    .line 12
    .line 13
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/16 p2, 0x11

    .line 22
    .line 23
    invoke-direct {v1, p2}, Lo1/r;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lsa/N;->a:Lsa/a;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lsa/a;->m()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iput-object p2, v1, Lo1/r;->t:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object p1, v1, Lo1/r;->u:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
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

.method public final b(Ljava/lang/Character;Z)[I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, Lsa/N;->a:Lsa/a;

    .line 8
    .line 9
    invoke-virtual {v4}, Lsa/a;->n()Z

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    :goto_0
    const/16 v16, 0x0

    .line 16
    .line 17
    goto/16 :goto_12

    .line 18
    .line 19
    :cond_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Character;->charValue()C

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {v4}, Lsa/a;->l()C

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-ne v5, v7, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    sget-object v5, Lsa/N;->t:[C

    .line 33
    .line 34
    invoke-virtual {v4}, Lsa/a;->b()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lsa/a;->n()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-nez v7, :cond_2

    .line 42
    .line 43
    iget-object v7, v4, Lsa/a;->a:[C

    .line 44
    .line 45
    iget v8, v4, Lsa/a;->e:I

    .line 46
    .line 47
    aget-char v7, v7, v8

    .line 48
    .line 49
    invoke-static {v5, v7}, Ljava/util/Arrays;->binarySearch([CC)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-ltz v5, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget v5, v4, Lsa/a;->c:I

    .line 57
    .line 58
    iget v7, v4, Lsa/a;->e:I

    .line 59
    .line 60
    sub-int/2addr v5, v7

    .line 61
    const/16 v7, 0x400

    .line 62
    .line 63
    if-ge v5, v7, :cond_3

    .line 64
    .line 65
    iput v2, v4, Lsa/a;->d:I

    .line 66
    .line 67
    :cond_3
    invoke-virtual {v4}, Lsa/a;->b()V

    .line 68
    .line 69
    .line 70
    iget v5, v4, Lsa/a;->e:I

    .line 71
    .line 72
    iput v5, v4, Lsa/a;->g:I

    .line 73
    .line 74
    const-string v5, "#"

    .line 75
    .line 76
    invoke-virtual {v4, v5}, Lsa/a;->p(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    const/4 v7, -0x1

    .line 81
    const-string v8, ";"

    .line 82
    .line 83
    const/16 v9, 0x61

    .line 84
    .line 85
    const/16 v10, 0x41

    .line 86
    .line 87
    const/16 v11, 0x39

    .line 88
    .line 89
    const/16 v12, 0x30

    .line 90
    .line 91
    iget-object v13, v0, Lsa/N;->r:[I

    .line 92
    .line 93
    if-eqz v5, :cond_11

    .line 94
    .line 95
    const-string v5, "X"

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Lsa/a;->q(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_8

    .line 102
    .line 103
    invoke-virtual {v4}, Lsa/a;->b()V

    .line 104
    .line 105
    .line 106
    iget v14, v4, Lsa/a;->e:I

    .line 107
    .line 108
    :goto_1
    iget v15, v4, Lsa/a;->e:I

    .line 109
    .line 110
    const/16 v16, 0x0

    .line 111
    .line 112
    iget v6, v4, Lsa/a;->c:I

    .line 113
    .line 114
    if-ge v15, v6, :cond_7

    .line 115
    .line 116
    iget-object v6, v4, Lsa/a;->a:[C

    .line 117
    .line 118
    aget-char v6, v6, v15

    .line 119
    .line 120
    if-lt v6, v12, :cond_4

    .line 121
    .line 122
    if-le v6, v11, :cond_6

    .line 123
    .line 124
    :cond_4
    if-lt v6, v10, :cond_5

    .line 125
    .line 126
    const/16 v10, 0x46

    .line 127
    .line 128
    if-le v6, v10, :cond_6

    .line 129
    .line 130
    :cond_5
    if-lt v6, v9, :cond_7

    .line 131
    .line 132
    const/16 v10, 0x66

    .line 133
    .line 134
    if-gt v6, v10, :cond_7

    .line 135
    .line 136
    :cond_6
    add-int/2addr v15, v3

    .line 137
    iput v15, v4, Lsa/a;->e:I

    .line 138
    .line 139
    const/16 v10, 0x41

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_7
    iget-object v6, v4, Lsa/a;->a:[C

    .line 143
    .line 144
    iget-object v9, v4, Lsa/a;->h:[Ljava/lang/String;

    .line 145
    .line 146
    sub-int/2addr v15, v14

    .line 147
    invoke-static {v6, v9, v14, v15}, Lsa/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    goto :goto_3

    .line 152
    :cond_8
    const/16 v16, 0x0

    .line 153
    .line 154
    invoke-virtual {v4}, Lsa/a;->b()V

    .line 155
    .line 156
    .line 157
    iget v6, v4, Lsa/a;->e:I

    .line 158
    .line 159
    :goto_2
    iget v9, v4, Lsa/a;->e:I

    .line 160
    .line 161
    iget v10, v4, Lsa/a;->c:I

    .line 162
    .line 163
    if-ge v9, v10, :cond_9

    .line 164
    .line 165
    iget-object v10, v4, Lsa/a;->a:[C

    .line 166
    .line 167
    aget-char v10, v10, v9

    .line 168
    .line 169
    if-lt v10, v12, :cond_9

    .line 170
    .line 171
    if-gt v10, v11, :cond_9

    .line 172
    .line 173
    add-int/2addr v9, v3

    .line 174
    iput v9, v4, Lsa/a;->e:I

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_9
    iget-object v10, v4, Lsa/a;->a:[C

    .line 178
    .line 179
    iget-object v11, v4, Lsa/a;->h:[Ljava/lang/String;

    .line 180
    .line 181
    sub-int/2addr v9, v6

    .line 182
    invoke-static {v10, v11, v6, v9}, Lsa/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    :goto_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    if-nez v9, :cond_a

    .line 191
    .line 192
    const-string v1, "numeric reference with no numerals"

    .line 193
    .line 194
    new-array v2, v2, [Ljava/lang/Object;

    .line 195
    .line 196
    invoke-virtual {v0, v1, v2}, Lsa/N;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4}, Lsa/a;->x()V

    .line 200
    .line 201
    .line 202
    return-object v16

    .line 203
    :cond_a
    iput v7, v4, Lsa/a;->g:I

    .line 204
    .line 205
    invoke-virtual {v4, v8}, Lsa/a;->p(Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-nez v4, :cond_b

    .line 210
    .line 211
    const-string v4, "missing semicolon on [&#%s]"

    .line 212
    .line 213
    new-array v8, v3, [Ljava/lang/Object;

    .line 214
    .line 215
    aput-object v6, v8, v2

    .line 216
    .line 217
    invoke-virtual {v0, v4, v8}, Lsa/N;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_b
    if-eqz v5, :cond_c

    .line 221
    .line 222
    const/16 v4, 0x10

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_c
    const/16 v4, 0xa

    .line 226
    .line 227
    :goto_4
    :try_start_0
    invoke-static {v6, v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    goto :goto_5

    .line 236
    :catch_0
    move v4, v7

    .line 237
    :goto_5
    if-eq v4, v7, :cond_10

    .line 238
    .line 239
    const v5, 0xd800

    .line 240
    .line 241
    .line 242
    if-lt v4, v5, :cond_d

    .line 243
    .line 244
    const v5, 0xdfff

    .line 245
    .line 246
    .line 247
    if-le v4, v5, :cond_10

    .line 248
    .line 249
    :cond_d
    const v5, 0x10ffff

    .line 250
    .line 251
    .line 252
    if-le v4, v5, :cond_e

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_e
    if-lt v4, v1, :cond_f

    .line 256
    .line 257
    const/16 v5, 0xa0

    .line 258
    .line 259
    if-ge v4, v5, :cond_f

    .line 260
    .line 261
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    new-array v3, v3, [Ljava/lang/Object;

    .line 266
    .line 267
    aput-object v5, v3, v2

    .line 268
    .line 269
    const-string v5, "character [%s] is not a valid unicode code point"

    .line 270
    .line 271
    invoke-virtual {v0, v5, v3}, Lsa/N;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    sget-object v3, Lsa/N;->u:[I

    .line 275
    .line 276
    sub-int/2addr v4, v1

    .line 277
    aget v4, v3, v4

    .line 278
    .line 279
    :cond_f
    aput v4, v13, v2

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_10
    :goto_6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    new-array v3, v3, [Ljava/lang/Object;

    .line 287
    .line 288
    aput-object v1, v3, v2

    .line 289
    .line 290
    const-string v1, "character [%s] outside of valid range"

    .line 291
    .line 292
    invoke-virtual {v0, v1, v3}, Lsa/N;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    const v1, 0xfffd

    .line 296
    .line 297
    .line 298
    aput v1, v13, v2

    .line 299
    .line 300
    :goto_7
    return-object v13

    .line 301
    :cond_11
    const/16 v16, 0x0

    .line 302
    .line 303
    invoke-virtual {v4}, Lsa/a;->b()V

    .line 304
    .line 305
    .line 306
    iget v1, v4, Lsa/a;->e:I

    .line 307
    .line 308
    :goto_8
    iget v5, v4, Lsa/a;->e:I

    .line 309
    .line 310
    iget v6, v4, Lsa/a;->c:I

    .line 311
    .line 312
    if-ge v5, v6, :cond_15

    .line 313
    .line 314
    iget-object v6, v4, Lsa/a;->a:[C

    .line 315
    .line 316
    aget-char v5, v6, v5

    .line 317
    .line 318
    const/16 v6, 0x41

    .line 319
    .line 320
    if-lt v5, v6, :cond_12

    .line 321
    .line 322
    const/16 v10, 0x5a

    .line 323
    .line 324
    if-le v5, v10, :cond_14

    .line 325
    .line 326
    :cond_12
    if-lt v5, v9, :cond_13

    .line 327
    .line 328
    const/16 v10, 0x7a

    .line 329
    .line 330
    if-le v5, v10, :cond_14

    .line 331
    .line 332
    :cond_13
    invoke-static {v5}, Ljava/lang/Character;->isLetter(C)Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-eqz v5, :cond_15

    .line 337
    .line 338
    :cond_14
    iget v5, v4, Lsa/a;->e:I

    .line 339
    .line 340
    add-int/2addr v5, v3

    .line 341
    iput v5, v4, Lsa/a;->e:I

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_15
    :goto_9
    iget v5, v4, Lsa/a;->e:I

    .line 345
    .line 346
    iget v6, v4, Lsa/a;->c:I

    .line 347
    .line 348
    if-lt v5, v6, :cond_16

    .line 349
    .line 350
    goto :goto_a

    .line 351
    :cond_16
    iget-object v6, v4, Lsa/a;->a:[C

    .line 352
    .line 353
    aget-char v6, v6, v5

    .line 354
    .line 355
    if-lt v6, v12, :cond_17

    .line 356
    .line 357
    if-gt v6, v11, :cond_17

    .line 358
    .line 359
    add-int/2addr v5, v3

    .line 360
    iput v5, v4, Lsa/a;->e:I

    .line 361
    .line 362
    goto :goto_9

    .line 363
    :cond_17
    :goto_a
    iget-object v6, v4, Lsa/a;->a:[C

    .line 364
    .line 365
    iget-object v9, v4, Lsa/a;->h:[Ljava/lang/String;

    .line 366
    .line 367
    sub-int/2addr v5, v1

    .line 368
    invoke-static {v6, v9, v1, v5}, Lsa/a;->c([C[Ljava/lang/String;II)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    const/16 v5, 0x3b

    .line 373
    .line 374
    invoke-virtual {v4, v5}, Lsa/a;->r(C)Z

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    sget-object v6, Lorg/jsoup/nodes/m;->a:[C

    .line 379
    .line 380
    sget-object v6, Lorg/jsoup/nodes/l;->x:Lorg/jsoup/nodes/l;

    .line 381
    .line 382
    iget-object v9, v6, Lorg/jsoup/nodes/l;->s:[Ljava/lang/String;

    .line 383
    .line 384
    invoke-static {v9, v1}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 385
    .line 386
    .line 387
    move-result v9

    .line 388
    if-ltz v9, :cond_18

    .line 389
    .line 390
    iget-object v6, v6, Lorg/jsoup/nodes/l;->t:[I

    .line 391
    .line 392
    aget v6, v6, v9

    .line 393
    .line 394
    goto :goto_b

    .line 395
    :cond_18
    move v6, v7

    .line 396
    :goto_b
    if-eq v6, v7, :cond_19

    .line 397
    .line 398
    goto :goto_d

    .line 399
    :cond_19
    sget-object v6, Lorg/jsoup/nodes/l;->y:Lorg/jsoup/nodes/l;

    .line 400
    .line 401
    iget-object v9, v6, Lorg/jsoup/nodes/l;->s:[Ljava/lang/String;

    .line 402
    .line 403
    invoke-static {v9, v1}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 404
    .line 405
    .line 406
    move-result v9

    .line 407
    if-ltz v9, :cond_1a

    .line 408
    .line 409
    iget-object v6, v6, Lorg/jsoup/nodes/l;->t:[I

    .line 410
    .line 411
    aget v6, v6, v9

    .line 412
    .line 413
    goto :goto_c

    .line 414
    :cond_1a
    move v6, v7

    .line 415
    :goto_c
    if-eq v6, v7, :cond_25

    .line 416
    .line 417
    if-eqz v5, :cond_25

    .line 418
    .line 419
    :goto_d
    if-eqz p2, :cond_1e

    .line 420
    .line 421
    invoke-virtual {v4}, Lsa/a;->u()Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-nez v5, :cond_1d

    .line 426
    .line 427
    invoke-virtual {v4}, Lsa/a;->n()Z

    .line 428
    .line 429
    .line 430
    move-result v5

    .line 431
    if-eqz v5, :cond_1b

    .line 432
    .line 433
    goto :goto_e

    .line 434
    :cond_1b
    iget-object v5, v4, Lsa/a;->a:[C

    .line 435
    .line 436
    iget v6, v4, Lsa/a;->e:I

    .line 437
    .line 438
    aget-char v5, v5, v6

    .line 439
    .line 440
    if-lt v5, v12, :cond_1c

    .line 441
    .line 442
    if-gt v5, v11, :cond_1c

    .line 443
    .line 444
    goto :goto_f

    .line 445
    :cond_1c
    :goto_e
    const/4 v5, 0x3

    .line 446
    new-array v5, v5, [C

    .line 447
    .line 448
    fill-array-data v5, :array_0

    .line 449
    .line 450
    .line 451
    invoke-virtual {v4, v5}, Lsa/a;->s([C)Z

    .line 452
    .line 453
    .line 454
    move-result v5

    .line 455
    if-eqz v5, :cond_1e

    .line 456
    .line 457
    :cond_1d
    :goto_f
    invoke-virtual {v4}, Lsa/a;->x()V

    .line 458
    .line 459
    .line 460
    return-object v16

    .line 461
    :cond_1e
    iput v7, v4, Lsa/a;->g:I

    .line 462
    .line 463
    invoke-virtual {v4, v8}, Lsa/a;->p(Ljava/lang/String;)Z

    .line 464
    .line 465
    .line 466
    move-result v4

    .line 467
    if-nez v4, :cond_1f

    .line 468
    .line 469
    const-string v4, "missing semicolon on [&%s]"

    .line 470
    .line 471
    new-array v5, v3, [Ljava/lang/Object;

    .line 472
    .line 473
    aput-object v1, v5, v2

    .line 474
    .line 475
    invoke-virtual {v0, v4, v5}, Lsa/N;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    :cond_1f
    sget-object v4, Lorg/jsoup/nodes/m;->b:Ljava/util/HashMap;

    .line 479
    .line 480
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    check-cast v4, Ljava/lang/String;

    .line 485
    .line 486
    const/4 v5, 0x2

    .line 487
    iget-object v6, v0, Lsa/N;->s:[I

    .line 488
    .line 489
    if-eqz v4, :cond_20

    .line 490
    .line 491
    invoke-virtual {v4, v2}, Ljava/lang/String;->codePointAt(I)I

    .line 492
    .line 493
    .line 494
    move-result v7

    .line 495
    aput v7, v6, v2

    .line 496
    .line 497
    invoke-virtual {v4, v3}, Ljava/lang/String;->codePointAt(I)I

    .line 498
    .line 499
    .line 500
    move-result v4

    .line 501
    aput v4, v6, v3

    .line 502
    .line 503
    move v4, v5

    .line 504
    goto :goto_11

    .line 505
    :cond_20
    sget-object v4, Lorg/jsoup/nodes/l;->y:Lorg/jsoup/nodes/l;

    .line 506
    .line 507
    iget-object v8, v4, Lorg/jsoup/nodes/l;->s:[Ljava/lang/String;

    .line 508
    .line 509
    invoke-static {v8, v1}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 510
    .line 511
    .line 512
    move-result v8

    .line 513
    if-ltz v8, :cond_21

    .line 514
    .line 515
    iget-object v4, v4, Lorg/jsoup/nodes/l;->t:[I

    .line 516
    .line 517
    aget v4, v4, v8

    .line 518
    .line 519
    goto :goto_10

    .line 520
    :cond_21
    move v4, v7

    .line 521
    :goto_10
    if-eq v4, v7, :cond_22

    .line 522
    .line 523
    aput v4, v6, v2

    .line 524
    .line 525
    move v4, v3

    .line 526
    goto :goto_11

    .line 527
    :cond_22
    move v4, v2

    .line 528
    :goto_11
    if-ne v4, v3, :cond_23

    .line 529
    .line 530
    aget v1, v6, v2

    .line 531
    .line 532
    aput v1, v13, v2

    .line 533
    .line 534
    return-object v13

    .line 535
    :cond_23
    if-ne v4, v5, :cond_24

    .line 536
    .line 537
    return-object v6

    .line 538
    :cond_24
    const-string v2, "Unexpected characters returned for "

    .line 539
    .line 540
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    new-instance v2, Lorg/jsoup/helper/ValidationException;

    .line 545
    .line 546
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    throw v2

    .line 550
    :cond_25
    invoke-virtual {v4}, Lsa/a;->x()V

    .line 551
    .line 552
    .line 553
    if-eqz v5, :cond_26

    .line 554
    .line 555
    const-string v4, "invalid named reference [%s]"

    .line 556
    .line 557
    new-array v3, v3, [Ljava/lang/Object;

    .line 558
    .line 559
    aput-object v1, v3, v2

    .line 560
    .line 561
    invoke-virtual {v0, v4, v3}, Lsa/N;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    :cond_26
    :goto_12
    return-object v16

    .line 565
    :array_0
    .array-data 2
        0x3ds
        0x2ds
        0x5fs
    .end array-data
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

.method public final c(Z)Lsa/M;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lsa/N;->i:Lsa/L;

    .line 4
    .line 5
    invoke-virtual {p1}, Lsa/L;->A()Lsa/M;

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Lsa/N;->j:Lsa/K;

    .line 10
    .line 11
    invoke-virtual {p1}, Lsa/M;->A()Lsa/M;

    .line 12
    .line 13
    .line 14
    :goto_0
    iput-object p1, p0, Lsa/N;->k:Lsa/M;

    .line 15
    .line 16
    return-object p1
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

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsa/N;->h:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-static {v0}, LK0/n;->r(Ljava/lang/StringBuilder;)V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method public final e(C)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsa/N;->f:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lsa/N;->f:Ljava/lang/String;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lsa/N;->g:Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lsa/N;->f:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p1, p0, Lsa/N;->l:Lsa/G;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lsa/N;->a:Lsa/a;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    return-void
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
.end method

.method public final f(LK0/n;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-boolean v1, p0, Lsa/N;->e:Z

    .line 3
    .line 4
    if-nez v1, :cond_2

    .line 5
    .line 6
    iput-object p1, p0, Lsa/N;->d:LK0/n;

    .line 7
    .line 8
    iput-boolean v0, p0, Lsa/N;->e:Z

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lsa/N;->a:Lsa/a;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v2, -0x1

    .line 19
    iput v2, p0, Lsa/N;->q:I

    .line 20
    .line 21
    iget v2, p1, LK0/n;->a:I

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    if-ne v2, v3, :cond_0

    .line 25
    .line 26
    check-cast p1, Lsa/L;

    .line 27
    .line 28
    iget-object p1, p1, Lsa/M;->b:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p1, p0, Lsa/N;->o:Ljava/lang/String;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput-object p1, p0, Lsa/N;->p:Ljava/lang/String;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const/4 v3, 0x3

    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    check-cast p1, Lsa/K;

    .line 40
    .line 41
    invoke-virtual {p1}, Lsa/M;->w()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget-object p1, p1, Lsa/M;->c:Ljava/lang/String;

    .line 48
    .line 49
    new-array v0, v0, [Ljava/lang/Object;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    aput-object p1, v0, v2

    .line 53
    .line 54
    iget-object p1, p0, Lsa/N;->b:Lsa/C;

    .line 55
    .line 56
    invoke-virtual {p1}, Lsa/C;->d()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    new-instance v2, Lo1/r;

    .line 63
    .line 64
    const-string v3, "Attributes incorrectly present on end tag [/%s]"

    .line 65
    .line 66
    invoke-direct {v2, v1, v3, v0}, Lo1/r;-><init>(Lsa/a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void

    .line 73
    :cond_2
    new-instance p1, Lorg/jsoup/helper/ValidationException;

    .line 74
    .line 75
    const-string v0, "Must be false"

    .line 76
    .line 77
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1
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

.method public final g(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsa/N;->f:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lsa/N;->f:Ljava/lang/String;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lsa/N;->g:Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lsa/N;->f:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object p1, p0, Lsa/N;->l:Lsa/G;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lsa/N;->a:Lsa/a;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    return-void
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
.end method

.method public final h(Ljava/lang/StringBuilder;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsa/N;->f:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lsa/N;->f:Ljava/lang/String;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lsa/N;->g:Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lsa/N;->f:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p1, p0, Lsa/N;->l:Lsa/G;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lsa/N;->a:Lsa/a;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    return-void
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
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsa/N;->n:Lsa/H;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lsa/N;->f(LK0/n;)V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsa/N;->m:Lsa/I;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lsa/N;->f(LK0/n;)V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lsa/N;->k:Lsa/M;

    .line 2
    .line 3
    iget-boolean v1, v0, Lsa/M;->f:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lsa/M;->z()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lsa/N;->k:Lsa/M;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lsa/N;->f(LK0/n;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public final l(Lsa/e1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lsa/N;->b:Lsa/C;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsa/C;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lo1/r;

    .line 10
    .line 11
    const-string v2, "Unexpectedly reached end of file (EOF) in input state [%s]"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    new-array v3, v3, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    aput-object p1, v3, v4

    .line 18
    .line 19
    iget-object p1, p0, Lsa/N;->a:Lsa/a;

    .line 20
    .line 21
    invoke-direct {v1, p1, v2, v3}, Lo1/r;-><init>(Lsa/a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final m(Lsa/e1;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lsa/N;->b:Lsa/C;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsa/C;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lo1/r;

    .line 10
    .line 11
    iget-object v2, p0, Lsa/N;->a:Lsa/a;

    .line 12
    .line 13
    invoke-virtual {v2}, Lsa/a;->l()C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x2

    .line 22
    new-array v4, v4, [Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    aput-object v3, v4, v5

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    aput-object p1, v4, v3

    .line 29
    .line 30
    const-string p1, "Unexpected character \'%s\' in input state [%s]"

    .line 31
    .line 32
    invoke-direct {v1, v2, p1, v4}, Lo1/r;-><init>(Lsa/a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
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
.end method

.method public final n()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lsa/N;->o:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lsa/N;->k:Lsa/M;

    .line 6
    .line 7
    invoke-virtual {v0}, Lsa/M;->x()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lsa/N;->o:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final o(Lsa/e1;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lsa/N;->a:Lsa/a;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x7

    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v1}, Lsa/a;->w()I

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget v0, p0, Lsa/N;->q:I

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    if-ne v0, v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {v1}, Lsa/a;->w()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Lsa/N;->q:I

    .line 27
    .line 28
    :cond_2
    :goto_0
    iput-object p1, p0, Lsa/N;->c:Lsa/e1;

    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
.end method
