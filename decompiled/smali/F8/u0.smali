.class public LF8/u0;
.super Lv8/v;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static j(Lv8/b;)LF8/D;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv8/b;->d()LC8/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, LF8/D;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, LF8/D;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, LF8/d;->t:LF8/d;

    .line 13
    .line 14
    return-object p0
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


# virtual methods
.method public final a(Lv8/g;)LC8/f;
    .locals 6

    .line 1
    new-instance v0, LF8/F;

    .line 2
    .line 3
    invoke-static {p1}, LF8/u0;->j(Lv8/b;)LF8/D;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lv8/b;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p1}, Lv8/b;->g()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-string v4, "container"

    .line 16
    .line 17
    invoke-static {v1, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v4, "name"

    .line 21
    .line 22
    invoke-static {v2, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v4, "signature"

    .line 26
    .line 27
    invoke-static {v3, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    iget-object v5, p1, Lv8/b;->t:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-direct/range {v0 .. v5}, LF8/F;-><init>(LF8/D;Ljava/lang/String;Ljava/lang/String;LL8/t;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v0
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

.method public final b(Ljava/lang/Class;)LC8/c;
    .locals 0

    .line 1
    invoke-static {p1}, LF8/c;->a(Ljava/lang/Class;)LF8/A;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public final c(Ljava/lang/String;Ljava/lang/Class;)LC8/e;
    .locals 2

    .line 1
    sget-object p1, LF8/c;->a:Lo1/e;

    .line 2
    .line 3
    const-string p1, "jClass"

    .line 4
    .line 5
    invoke-static {p2, p1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LF8/c;->b:Lo1/e;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p1, Lo1/e;->u:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    iget-object p1, p1, Lo1/e;->t:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lv8/k;

    .line 26
    .line 27
    invoke-interface {p1, p2}, Lu8/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, p2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v1, p1

    .line 39
    :cond_1
    :goto_0
    check-cast v1, LC8/e;

    .line 40
    .line 41
    return-object v1
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

.method public final d(Lv8/l;)LC8/i;
    .locals 4

    .line 1
    new-instance v0, LF8/J;

    .line 2
    .line 3
    invoke-static {p1}, LF8/u0;->j(Lv8/b;)LF8/D;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Lv8/b;->w:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p1, Lv8/b;->t:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p1, p1, Lv8/b;->v:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v1, p1, v2, v3}, LF8/J;-><init>(LF8/D;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public final e(LS9/i;)LC8/p;
    .locals 4

    .line 1
    new-instance v0, LF8/X;

    .line 2
    .line 3
    invoke-static {p1}, LF8/u0;->j(Lv8/b;)LF8/D;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Lv8/b;->w:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p1, Lv8/b;->t:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p1, p1, Lv8/b;->v:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v1, p1, v2, v3}, LF8/X;-><init>(LF8/D;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public final f(Lv8/n;)LC8/r;
    .locals 4

    .line 1
    new-instance v0, LF8/a0;

    .line 2
    .line 3
    invoke-static {p1}, LF8/u0;->j(Lv8/b;)LF8/D;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Lv8/b;->v:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p1, Lv8/b;->w:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, p1, Lv8/b;->t:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, p1}, LF8/a0;-><init>(LF8/D;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public final g(Lv8/o;)LC8/t;
    .locals 3

    .line 1
    new-instance v0, LF8/d0;

    .line 2
    .line 3
    invoke-static {p1}, LF8/u0;->j(Lv8/b;)LF8/D;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Lv8/b;->v:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p1, p1, Lv8/b;->w:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p1}, LF8/d0;-><init>(LF8/D;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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

.method public final h(Lv8/f;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lkotlin/Metadata;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lkotlin/Metadata;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    :cond_0
    invoke-interface {v0}, Lkotlin/Metadata;->d1()[Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    array-length v3, v2

    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    move-object v2, v1

    .line 26
    :cond_1
    if-nez v2, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    invoke-interface {v0}, Lkotlin/Metadata;->d2()[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v3, Li9/h;->a:Lk9/g;

    .line 34
    .line 35
    const-string v3, "strings"

    .line 36
    .line 37
    invoke-static {v1, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 41
    .line 42
    invoke-static {v2}, Li9/a;->a([Ljava/lang/String;)[B

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-direct {v3, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 47
    .line 48
    .line 49
    sget-object v2, Li9/h;->a:Lk9/g;

    .line 50
    .line 51
    invoke-static {v3, v1}, Li9/h;->g(Ljava/io/ByteArrayInputStream;[Ljava/lang/String;)Li9/g;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    sget-object v1, Le9/y;->N:Le9/a;

    .line 56
    .line 57
    sget-object v2, Li9/h;->a:Lk9/g;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v4, Lk9/e;

    .line 63
    .line 64
    invoke-direct {v4, v3}, Lk9/e;-><init>(Ljava/io/InputStream;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, v4, v2}, Lk9/u;->a(Lk9/e;Lk9/g;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lk9/a;

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    :try_start_0
    invoke-virtual {v4, v2}, Lk9/e;->a(I)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    invoke-interface {v1}, Lk9/t;->isInitialized()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    move-object v5, v1

    .line 84
    check-cast v5, Le9/y;

    .line 85
    .line 86
    new-instance v8, Li9/f;

    .line 87
    .line 88
    invoke-interface {v0}, Lkotlin/Metadata;->mv()[I

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-interface {v0}, Lkotlin/Metadata;->xi()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    and-int/lit8 v0, v0, 0x8

    .line 97
    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    const/4 v2, 0x1

    .line 101
    :cond_3
    invoke-direct {v8, v1, v2}, Li9/f;-><init>([IZ)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    new-instance v7, Lg9/g;

    .line 109
    .line 110
    iget-object v0, v5, Le9/y;->H:Le9/X;

    .line 111
    .line 112
    const-string v1, "proto.typeTable"

    .line 113
    .line 114
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v7, v0}, Lg9/g;-><init>(Le9/X;)V

    .line 118
    .line 119
    .line 120
    sget-object v9, LE8/a;->A:LE8/a;

    .line 121
    .line 122
    invoke-static/range {v4 .. v9}, LF8/y0;->f(Ljava/lang/Class;Lk9/k;Lg9/f;Lg9/g;Lg9/a;Lu8/c;)LL8/b;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, LO8/N;

    .line 127
    .line 128
    new-instance v1, LF8/F;

    .line 129
    .line 130
    sget-object v2, LF8/d;->t:LF8/d;

    .line 131
    .line 132
    invoke-direct {v1, v2, v0}, LF8/F;-><init>(LF8/D;LL8/t;)V

    .line 133
    .line 134
    .line 135
    :goto_0
    if-eqz v1, :cond_4

    .line 136
    .line 137
    invoke-static {v1}, LF8/y0;->b(Ljava/lang/Object;)LF8/F;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_4

    .line 142
    .line 143
    sget-object p1, LF8/v0;->a:Ll9/g;

    .line 144
    .line 145
    invoke-virtual {v0}, LF8/F;->l()LL8/t;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    new-instance v1, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-static {p1, v1}, LF8/v0;->a(LL8/c;Ljava/lang/StringBuilder;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {p1}, LL8/b;->H0()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const-string v2, "invoke.valueParameters"

    .line 162
    .line 163
    invoke-static {v0, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    check-cast v0, Ljava/lang/Iterable;

    .line 167
    .line 168
    sget-object v5, LF8/b;->A:LF8/b;

    .line 169
    .line 170
    const-string v4, ")"

    .line 171
    .line 172
    const/16 v6, 0x30

    .line 173
    .line 174
    const-string v2, ", "

    .line 175
    .line 176
    const-string v3, "("

    .line 177
    .line 178
    invoke-static/range {v0 .. v6}, Li8/k;->Y(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu8/b;I)V

    .line 179
    .line 180
    .line 181
    const-string v0, " -> "

    .line 182
    .line 183
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-interface {p1}, LL8/b;->w()LA9/y;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-static {p1}, LF8/v0;->d(LA9/y;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    const-string v0, "StringBuilder().apply(builderAction).toString()"

    .line 205
    .line 206
    invoke-static {p1, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-object p1

    .line 210
    :cond_4
    invoke-super {p0, p1}, Lv8/v;->h(Lv8/f;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    return-object p1

    .line 215
    :cond_5
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    .line 216
    .line 217
    invoke-direct {p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>()V

    .line 218
    .line 219
    .line 220
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 230
    .line 231
    throw v0

    .line 232
    :catch_0
    move-exception v0

    .line 233
    move-object p1, v0

    .line 234
    iput-object v1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->s:Lk9/a;

    .line 235
    .line 236
    throw p1
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

.method public final i(Lv8/k;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LF8/u0;->h(Lv8/f;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
