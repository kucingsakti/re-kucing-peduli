.class public final Lc9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/Set;

.field public static final c:Ljava/util/Set;

.field public static final d:Li9/f;

.field public static final e:Li9/f;


# instance fields
.field public a:LI4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    sget-object v3, Ld9/a;->v:Ld9/a;

    .line 5
    .line 6
    invoke-static {v3}, Li8/C;->w(Ljava/lang/Object;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    sput-object v3, Lc9/d;->b:Ljava/util/Set;

    .line 11
    .line 12
    new-array v3, v2, [Ld9/a;

    .line 13
    .line 14
    sget-object v4, Ld9/a;->w:Ld9/a;

    .line 15
    .line 16
    aput-object v4, v3, v1

    .line 17
    .line 18
    sget-object v4, Ld9/a;->z:Ld9/a;

    .line 19
    .line 20
    aput-object v4, v3, v0

    .line 21
    .line 22
    invoke-static {v3}, Li8/i;->K([Ljava/lang/Object;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    sput-object v3, Lc9/d;->c:Ljava/util/Set;

    .line 27
    .line 28
    new-instance v3, Li9/f;

    .line 29
    .line 30
    filled-new-array {v0, v0, v2}, [I

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v3, v2, v1}, Li9/f;-><init>([IZ)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Li9/f;

    .line 38
    .line 39
    const/16 v3, 0xb

    .line 40
    .line 41
    filled-new-array {v0, v0, v3}, [I

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-direct {v2, v3, v1}, Li9/f;-><init>([IZ)V

    .line 46
    .line 47
    .line 48
    sput-object v2, Lc9/d;->d:Li9/f;

    .line 49
    .line 50
    new-instance v2, Li9/f;

    .line 51
    .line 52
    const/16 v3, 0xd

    .line 53
    .line 54
    filled-new-array {v0, v0, v3}, [I

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {v2, v0, v1}, Li9/f;-><init>([IZ)V

    .line 59
    .line 60
    .line 61
    sput-object v2, Lc9/d;->e:Li9/f;

    .line 62
    .line 63
    return-void
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


# virtual methods
.method public final a(LL8/D;LQ8/b;)Ly9/n;
    .locals 10

    .line 1
    const-string v3, "Could not read data from "

    .line 2
    .line 3
    const-string v0, "descriptor"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "kotlinClass"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p2, LQ8/b;->b:LB4/e;

    .line 14
    .line 15
    iget-object v4, v0, LB4/e;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, [Ljava/lang/String;

    .line 18
    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    iget-object v4, v0, LB4/e;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, [Ljava/lang/String;

    .line 24
    .line 25
    :cond_0
    const/4 v5, 0x0

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    iget-object v6, v0, LB4/e;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v6, Ld9/a;

    .line 31
    .line 32
    sget-object v7, Lc9/d;->c:Ljava/util/Set;

    .line 33
    .line 34
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v4, v5

    .line 42
    :goto_0
    if-nez v4, :cond_2

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_2
    iget-object v6, v0, LB4/e;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v6, Li9/f;

    .line 48
    .line 49
    iget-object v0, v0, LB4/e;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, [Ljava/lang/String;

    .line 52
    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    :try_start_0
    invoke-static {v4, v0}, Li9/h;->h([Ljava/lang/String;[Ljava/lang/String;)Lh8/f;

    .line 57
    .line 58
    .line 59
    move-result-object v0
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    goto :goto_2

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto :goto_1

    .line 63
    :catch_0
    move-exception v0

    .line 64
    :try_start_1
    new-instance v4, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    new-instance v7, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, LQ8/b;->a()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-direct {v4, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    :goto_1
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    iget-object v3, v3, LI4/c;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Lw9/i;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    const-string v4, "<this>"

    .line 102
    .line 103
    iget-object v3, v3, LI4/c;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v3, Lw9/i;

    .line 106
    .line 107
    invoke-static {v3, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    sget-object v3, Li9/f;->g:Li9/f;

    .line 111
    .line 112
    invoke-virtual {v6, v3}, Li9/f;->b(Li9/f;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-nez v3, :cond_5

    .line 117
    .line 118
    move-object v0, v5

    .line 119
    :goto_2
    if-nez v0, :cond_4

    .line 120
    .line 121
    :goto_3
    return-object v5

    .line 122
    :cond_4
    iget-object v3, v0, Lh8/f;->s:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v4, v3

    .line 125
    check-cast v4, Li9/g;

    .line 126
    .line 127
    iget-object v0, v0, Lh8/f;->t:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v3, v0

    .line 130
    check-cast v3, Le9/C;

    .line 131
    .line 132
    move-object v5, v6

    .line 133
    new-instance v6, Lc9/f;

    .line 134
    .line 135
    invoke-virtual {p0, p2}, Lc9/d;->d(LQ8/b;)Lw9/l;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, p2}, Lc9/d;->e(LQ8/b;)Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p2}, Lc9/d;->b(LQ8/b;)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-direct {v6, p2, v3, v4, v0}, Lc9/f;-><init>(LQ8/b;Le9/C;Li9/g;I)V

    .line 146
    .line 147
    .line 148
    new-instance v1, Ly9/n;

    .line 149
    .line 150
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v8, "scope for "

    .line 157
    .line 158
    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v8, " in "

    .line 165
    .line 166
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    sget-object v9, Lc9/c;->s:Lc9/c;

    .line 177
    .line 178
    move-object v2, p1

    .line 179
    invoke-direct/range {v1 .. v9}, Ly9/n;-><init>(LL8/D;Le9/C;Lg9/f;Lg9/a;Lc9/f;LI4/c;Ljava/lang/String;Lu8/a;)V

    .line 180
    .line 181
    .line 182
    return-object v1

    .line 183
    :cond_5
    throw v0
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

.method public final b(LQ8/b;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LI4/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lw9/i;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, LQ8/b;->b:LB4/e;

    .line 13
    .line 14
    iget p1, p1, LB4/e;->c:I

    .line 15
    .line 16
    and-int/lit8 v0, p1, 0x40

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move v0, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz v0, :cond_2

    .line 25
    .line 26
    and-int/lit8 v0, p1, 0x20

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 p1, 0x2

    .line 32
    return p1

    .line 33
    :cond_2
    :goto_1
    and-int/lit8 v0, p1, 0x10

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    and-int/lit8 p1, p1, 0x20

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    const/4 p1, 0x3

    .line 43
    return p1

    .line 44
    :cond_4
    :goto_2
    return v1
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

.method public final c()LI4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/d;->a:LI4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "components"

    .line 7
    .line 8
    invoke-static {v0}, Lv8/i;->n(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
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

.method public final d(LQ8/b;)Lw9/l;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LI4/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lw9/i;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, LQ8/b;->b:LB4/e;

    .line 13
    .line 14
    iget-object v0, v0, LB4/e;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Li9/f;

    .line 17
    .line 18
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, LI4/c;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lw9/i;

    .line 25
    .line 26
    const-string v2, "<this>"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v5, Li9/f;->g:Li9/f;

    .line 32
    .line 33
    invoke-virtual {v0, v5}, Li9/f;->b(Li9/f;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    return-object p1

    .line 41
    :cond_0
    new-instance v3, Lw9/l;

    .line 42
    .line 43
    iget-object v0, p1, LQ8/b;->b:LB4/e;

    .line 44
    .line 45
    iget-object v0, v0, LB4/e;->d:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v4, v0

    .line 48
    check-cast v4, Li9/f;

    .line 49
    .line 50
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v0, v0, LI4/c;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lw9/i;

    .line 57
    .line 58
    invoke-static {v0, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v0, v0, LI4/c;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lw9/i;

    .line 68
    .line 69
    invoke-static {v0, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-boolean v0, v4, Li9/f;->f:Z

    .line 76
    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    move-object v0, v5

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    sget-object v0, Li9/f;->h:Li9/f;

    .line 82
    .line 83
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget v1, v5, Lg9/a;->b:I

    .line 87
    .line 88
    iget v2, v0, Lg9/a;->b:I

    .line 89
    .line 90
    if-le v2, v1, :cond_2

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    if-ge v2, v1, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    iget v1, v0, Lg9/a;->c:I

    .line 97
    .line 98
    iget v2, v5, Lg9/a;->c:I

    .line 99
    .line 100
    if-le v1, v2, :cond_4

    .line 101
    .line 102
    :goto_1
    move-object v7, v0

    .line 103
    goto :goto_3

    .line 104
    :cond_4
    :goto_2
    move-object v7, v5

    .line 105
    :goto_3
    invoke-virtual {p1}, LQ8/b;->a()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    iget-object p1, p1, LQ8/b;->a:Ljava/lang/Class;

    .line 110
    .line 111
    invoke-static {p1}, LR8/c;->a(Ljava/lang/Class;)Lj9/b;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    move-object v6, v5

    .line 116
    invoke-direct/range {v3 .. v9}, Lw9/l;-><init>(Ljava/lang/Object;Li9/f;Li9/f;Li9/f;Ljava/lang/String;Lj9/b;)V

    .line 117
    .line 118
    .line 119
    return-object v3
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
.end method

.method public final e(LQ8/b;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LI4/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lw9/i;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, LI4/c;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lw9/i;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, LQ8/b;->b:LB4/e;

    .line 24
    .line 25
    iget v0, p1, LB4/e;->c:I

    .line 26
    .line 27
    and-int/lit8 v0, v0, 0x2

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    move v0, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v0, v1

    .line 36
    :goto_0
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object p1, p1, LB4/e;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Li9/f;

    .line 41
    .line 42
    sget-object v0, Lc9/d;->d:Li9/f;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lg9/a;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    return v2

    .line 51
    :cond_1
    return v1
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

.method public final f(LQ8/b;)Lw9/d;
    .locals 6

    .line 1
    const-string v0, "Could not read data from "

    .line 2
    .line 3
    iget-object v1, p1, LQ8/b;->b:LB4/e;

    .line 4
    .line 5
    iget-object v2, v1, LB4/e;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, [Ljava/lang/String;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iget-object v2, v1, LB4/e;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, [Ljava/lang/String;

    .line 14
    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v4, v1, LB4/e;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Ld9/a;

    .line 21
    .line 22
    sget-object v5, Lc9/d;->b:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v2, v3

    .line 32
    :goto_0
    if-nez v2, :cond_2

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    iget-object v4, v1, LB4/e;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, Li9/f;

    .line 38
    .line 39
    iget-object v1, v1, LB4/e;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, [Ljava/lang/String;

    .line 42
    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    :try_start_0
    invoke-static {v2, v1}, Li9/h;->f([Ljava/lang/String;[Ljava/lang/String;)Lh8/f;

    .line 47
    .line 48
    .line 49
    move-result-object v0
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    goto :goto_2

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception v1

    .line 54
    :try_start_1
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    new-instance v5, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, LQ8/b;->a()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {v2, v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    :goto_1
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-object v1, v1, LI4/c;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Lw9/i;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lc9/d;->c()LI4/c;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v2, "<this>"

    .line 92
    .line 93
    iget-object v1, v1, LI4/c;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Lw9/i;

    .line 96
    .line 97
    invoke-static {v1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    sget-object v1, Li9/f;->g:Li9/f;

    .line 101
    .line 102
    invoke-virtual {v4, v1}, Li9/f;->b(Li9/f;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_5

    .line 107
    .line 108
    move-object v0, v3

    .line 109
    :goto_2
    if-nez v0, :cond_4

    .line 110
    .line 111
    :goto_3
    return-object v3

    .line 112
    :cond_4
    iget-object v1, v0, Lh8/f;->s:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Li9/g;

    .line 115
    .line 116
    iget-object v0, v0, Lh8/f;->t:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Le9/j;

    .line 119
    .line 120
    new-instance v2, Lc9/m;

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Lc9/d;->d(LQ8/b;)Lw9/l;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1}, Lc9/d;->e(LQ8/b;)Z

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1}, Lc9/d;->b(LQ8/b;)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-direct {v2, p1, v3}, Lc9/m;-><init>(LQ8/b;I)V

    .line 133
    .line 134
    .line 135
    new-instance p1, Lw9/d;

    .line 136
    .line 137
    invoke-direct {p1, v1, v0, v4, v2}, Lw9/d;-><init>(Lg9/f;Le9/j;Lg9/a;LL8/M;)V

    .line 138
    .line 139
    .line 140
    return-object p1

    .line 141
    :cond_5
    throw v0
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
.end method
