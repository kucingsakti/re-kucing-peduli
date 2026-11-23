.class public final LX9/C;
.super LX9/J;
.source "SourceFile"


# static fields
.field public static final e:LX9/A;

.field public static final f:LX9/A;

.field public static final g:[B

.field public static final h:[B

.field public static final i:[B


# instance fields
.field public final a:Lma/i;

.field public final b:Ljava/util/List;

.field public final c:LX9/A;

.field public d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    sget-object v1, LX9/A;->d:Ljava/util/regex/Pattern;

    .line 3
    .line 4
    const-string v1, "multipart/mixed"

    .line 5
    .line 6
    invoke-static {v1}, Lga/d;->k(Ljava/lang/String;)LX9/A;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sput-object v1, LX9/C;->e:LX9/A;

    .line 11
    .line 12
    const-string v1, "multipart/alternative"

    .line 13
    .line 14
    invoke-static {v1}, Lga/d;->k(Ljava/lang/String;)LX9/A;

    .line 15
    .line 16
    .line 17
    const-string v1, "multipart/digest"

    .line 18
    .line 19
    invoke-static {v1}, Lga/d;->k(Ljava/lang/String;)LX9/A;

    .line 20
    .line 21
    .line 22
    const-string v1, "multipart/parallel"

    .line 23
    .line 24
    invoke-static {v1}, Lga/d;->k(Ljava/lang/String;)LX9/A;

    .line 25
    .line 26
    .line 27
    const-string v1, "multipart/form-data"

    .line 28
    .line 29
    invoke-static {v1}, Lga/d;->k(Ljava/lang/String;)LX9/A;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sput-object v1, LX9/C;->f:LX9/A;

    .line 34
    .line 35
    new-array v1, v0, [B

    .line 36
    .line 37
    fill-array-data v1, :array_0

    .line 38
    .line 39
    .line 40
    sput-object v1, LX9/C;->g:[B

    .line 41
    .line 42
    new-array v1, v0, [B

    .line 43
    .line 44
    fill-array-data v1, :array_1

    .line 45
    .line 46
    .line 47
    sput-object v1, LX9/C;->h:[B

    .line 48
    .line 49
    new-array v0, v0, [B

    .line 50
    .line 51
    fill-array-data v0, :array_2

    .line 52
    .line 53
    .line 54
    sput-object v0, LX9/C;->i:[B

    .line 55
    .line 56
    return-void

    .line 57
    :array_0
    .array-data 1
        0x3at
        0x20t
    .end array-data

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    nop

    .line 63
    :array_1
    .array-data 1
        0xdt
        0xat
    .end array-data

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    nop

    .line 69
    :array_2
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
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

.method public constructor <init>(Lma/i;LX9/A;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "boundaryByteString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "type"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LX9/C;->a:Lma/i;

    .line 15
    .line 16
    iput-object p3, p0, LX9/C;->b:Ljava/util/List;

    .line 17
    .line 18
    sget-object p3, LX9/A;->d:Ljava/util/regex/Pattern;

    .line 19
    .line 20
    new-instance p3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p2, "; boundary="

    .line 29
    .line 30
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lma/i;->o()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lga/d;->k(Ljava/lang/String;)LX9/A;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, LX9/C;->c:LX9/A;

    .line 49
    .line 50
    const-wide/16 p1, -0x1

    .line 51
    .line 52
    iput-wide p1, p0, LX9/C;->d:J

    .line 53
    .line 54
    return-void
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


# virtual methods
.method public final a()J
    .locals 4

    .line 1
    iget-wide v0, p0, LX9/C;->d:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p0, v0, v1}, LX9/C;->e(Lma/g;Z)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, LX9/C;->d:J

    .line 16
    .line 17
    :cond_0
    return-wide v0
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

.method public final b()LX9/A;
    .locals 1

    .line 1
    iget-object v0, p0, LX9/C;->c:LX9/A;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
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
.end method

.method public final d(Lma/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, LX9/C;->e(Lma/g;Z)J

    .line 3
    .line 4
    .line 5
    return-void
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
.end method

.method public final e(Lma/g;Z)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance v1, Lma/f;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    move-object v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    move-object v2, v1

    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    :goto_0
    iget-object v3, v0, LX9/C;->b:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const-wide/16 v6, 0x0

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    :goto_1
    iget-object v9, v0, LX9/C;->a:Lma/i;

    .line 26
    .line 27
    sget-object v10, LX9/C;->i:[B

    .line 28
    .line 29
    sget-object v11, LX9/C;->h:[B

    .line 30
    .line 31
    if-ge v8, v4, :cond_6

    .line 32
    .line 33
    add-int/lit8 v12, v8, 0x1

    .line 34
    .line 35
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, LX9/B;

    .line 40
    .line 41
    iget-object v13, v8, LX9/B;->a:LX9/w;

    .line 42
    .line 43
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, v10}, Lma/g;->F([B)Lma/g;

    .line 47
    .line 48
    .line 49
    invoke-interface {v1, v9}, Lma/g;->O(Lma/i;)Lma/g;

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, v11}, Lma/g;->F([B)Lma/g;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v13}, LX9/w;->size()I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    const/4 v10, 0x0

    .line 60
    :goto_2
    if-ge v10, v9, :cond_1

    .line 61
    .line 62
    add-int/lit8 v14, v10, 0x1

    .line 63
    .line 64
    invoke-virtual {v13, v10}, LX9/w;->f(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v15

    .line 68
    invoke-interface {v1, v15}, Lma/g;->Q(Ljava/lang/String;)Lma/g;

    .line 69
    .line 70
    .line 71
    move-result-object v15

    .line 72
    sget-object v5, LX9/C;->g:[B

    .line 73
    .line 74
    invoke-interface {v15, v5}, Lma/g;->F([B)Lma/g;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v13, v10}, LX9/w;->m(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    invoke-interface {v5, v10}, Lma/g;->Q(Ljava/lang/String;)Lma/g;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {v5, v11}, Lma/g;->F([B)Lma/g;

    .line 87
    .line 88
    .line 89
    move v10, v14

    .line 90
    goto :goto_2

    .line 91
    :cond_1
    iget-object v5, v8, LX9/B;->b:LX9/J;

    .line 92
    .line 93
    invoke-virtual {v5}, LX9/J;->b()LX9/A;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    if-eqz v8, :cond_2

    .line 98
    .line 99
    const-string v9, "Content-Type: "

    .line 100
    .line 101
    invoke-interface {v1, v9}, Lma/g;->Q(Ljava/lang/String;)Lma/g;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    iget-object v8, v8, LX9/A;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v9, v8}, Lma/g;->Q(Ljava/lang/String;)Lma/g;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-interface {v8, v11}, Lma/g;->F([B)Lma/g;

    .line 112
    .line 113
    .line 114
    :cond_2
    invoke-virtual {v5}, LX9/J;->a()J

    .line 115
    .line 116
    .line 117
    move-result-wide v8

    .line 118
    const-wide/16 v13, -0x1

    .line 119
    .line 120
    cmp-long v10, v8, v13

    .line 121
    .line 122
    if-eqz v10, :cond_3

    .line 123
    .line 124
    const-string v10, "Content-Length: "

    .line 125
    .line 126
    invoke-interface {v1, v10}, Lma/g;->Q(Ljava/lang/String;)Lma/g;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-interface {v10, v8, v9}, Lma/g;->R(J)Lma/g;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    invoke-interface {v10, v11}, Lma/g;->F([B)Lma/g;

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    if-eqz p2, :cond_4

    .line 139
    .line 140
    invoke-static {v2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Lma/f;->a()V

    .line 144
    .line 145
    .line 146
    return-wide v13

    .line 147
    :cond_4
    :goto_3
    invoke-interface {v1, v11}, Lma/g;->F([B)Lma/g;

    .line 148
    .line 149
    .line 150
    if-eqz p2, :cond_5

    .line 151
    .line 152
    add-long/2addr v6, v8

    .line 153
    goto :goto_4

    .line 154
    :cond_5
    invoke-virtual {v5, v1}, LX9/J;->d(Lma/g;)V

    .line 155
    .line 156
    .line 157
    :goto_4
    invoke-interface {v1, v11}, Lma/g;->F([B)Lma/g;

    .line 158
    .line 159
    .line 160
    move v8, v12

    .line 161
    goto/16 :goto_1

    .line 162
    .line 163
    :cond_6
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v1, v10}, Lma/g;->F([B)Lma/g;

    .line 167
    .line 168
    .line 169
    invoke-interface {v1, v9}, Lma/g;->O(Lma/i;)Lma/g;

    .line 170
    .line 171
    .line 172
    invoke-interface {v1, v10}, Lma/g;->F([B)Lma/g;

    .line 173
    .line 174
    .line 175
    invoke-interface {v1, v11}, Lma/g;->F([B)Lma/g;

    .line 176
    .line 177
    .line 178
    if-eqz p2, :cond_7

    .line 179
    .line 180
    invoke-static {v2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-wide v3, v2, Lma/f;->t:J

    .line 184
    .line 185
    add-long/2addr v6, v3

    .line 186
    invoke-virtual {v2}, Lma/f;->a()V

    .line 187
    .line 188
    .line 189
    :cond_7
    return-wide v6
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
