.class public final LY8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM8/b;
.implements LW8/h;


# static fields
.field public static final synthetic h:[LC8/u;


# instance fields
.field public final a:LFa/e;

.field public final b:LR8/d;

.field public final c:Lz9/h;

.field public final d:Lz9/i;

.field public final e:LQ8/f;

.field public final f:Lz9/i;

.field public final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lv8/n;

    .line 2
    .line 3
    sget-object v1, Lv8/u;->a:Lv8/v;

    .line 4
    .line 5
    const-class v2, LY8/f;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-string v4, "fqName"

    .line 12
    .line 13
    const-string v5, "getFqName()Lorg/jetbrains/kotlin/name/FqName;"

    .line 14
    .line 15
    invoke-direct {v0, v3, v4, v5}, Lv8/n;-><init>(LC8/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lv8/v;->f(Lv8/n;)LC8/r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v3, Lv8/n;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-string v5, "type"

    .line 29
    .line 30
    const-string v6, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    .line 31
    .line 32
    invoke-direct {v3, v4, v5, v6}, Lv8/n;-><init>(LC8/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Lv8/v;->f(Lv8/n;)LC8/r;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-instance v4, Lv8/n;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v5, "allValueArguments"

    .line 46
    .line 47
    const-string v6, "getAllValueArguments()Ljava/util/Map;"

    .line 48
    .line 49
    invoke-direct {v4, v2, v5, v6}, Lv8/n;-><init>(LC8/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v4}, Lv8/v;->f(Lv8/n;)LC8/r;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v2, 0x3

    .line 57
    new-array v2, v2, [LC8/u;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    aput-object v0, v2, v4

    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    aput-object v3, v2, v0

    .line 64
    .line 65
    const/4 v0, 0x2

    .line 66
    aput-object v1, v2, v0

    .line 67
    .line 68
    sput-object v2, LY8/f;->h:[LC8/u;

    .line 69
    .line 70
    return-void
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

.method public constructor <init>(LFa/e;LR8/d;Z)V
    .locals 3

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "javaAnnotation"

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
    iput-object p1, p0, LY8/f;->a:LFa/e;

    .line 15
    .line 16
    iput-object p2, p0, LY8/f;->b:LR8/d;

    .line 17
    .line 18
    iget-object p1, p1, LFa/e;->t:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, LI4/a;

    .line 21
    .line 22
    iget-object v0, p1, LI4/a;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lz9/l;

    .line 25
    .line 26
    new-instance v1, LY8/e;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, p0, v2}, LY8/e;-><init>(LY8/f;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v2, Lz9/h;

    .line 36
    .line 37
    invoke-direct {v2, v0, v1}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, LY8/f;->c:Lz9/h;

    .line 41
    .line 42
    new-instance v1, LY8/e;

    .line 43
    .line 44
    const/4 v2, 0x2

    .line 45
    invoke-direct {v1, p0, v2}, LY8/e;-><init>(LY8/f;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v2, Lz9/i;

    .line 52
    .line 53
    invoke-direct {v2, v0, v1}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, LY8/f;->d:Lz9/i;

    .line 57
    .line 58
    iget-object p1, p1, LI4/a;->j:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, LQ8/d;

    .line 61
    .line 62
    invoke-virtual {p1, p2}, LQ8/d;->a(La9/c;)LQ8/f;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, LY8/f;->e:LQ8/f;

    .line 67
    .line 68
    new-instance p1, LY8/e;

    .line 69
    .line 70
    const/4 p2, 0x0

    .line 71
    invoke-direct {p1, p0, p2}, LY8/e;-><init>(LY8/f;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance p2, Lz9/i;

    .line 78
    .line 79
    invoke-direct {p2, v0, p1}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 80
    .line 81
    .line 82
    iput-object p2, p0, LY8/f;->f:Lz9/i;

    .line 83
    .line 84
    iput-boolean p3, p0, LY8/f;->g:Z

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
.end method


# virtual methods
.method public final a()Lj9/c;
    .locals 3

    .line 1
    iget-object v0, p0, LY8/f;->c:Lz9/h;

    .line 2
    .line 3
    sget-object v1, LY8/f;->h:[LC8/u;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    const-string v2, "<this>"

    .line 9
    .line 10
    invoke-static {v0, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v2, "p"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lz9/h;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lj9/c;

    .line 23
    .line 24
    return-object v0
    .line 25
    .line 26
.end method

.method public final b()Ljava/util/Map;
    .locals 3

    .line 1
    iget-object v0, p0, LY8/f;->f:Lz9/i;

    .line 2
    .line 3
    sget-object v1, LY8/f;->h:[LC8/u;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, v1}, LJ7/j;->o(Lz9/m;LC8/u;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Map;

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
.end method

.method public final c(La9/a;)Lo9/g;
    .locals 7

    .line 1
    instance-of v0, p1, LR8/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lo9/h;->a:Lo9/h;

    .line 7
    .line 8
    check-cast p1, LR8/u;

    .line 9
    .line 10
    iget-object p1, p1, LR8/u;->b:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Lo9/h;->b(LO8/C;Ljava/lang/Object;)Lo9/g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    instance-of v0, p1, LR8/s;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    check-cast p1, LR8/s;

    .line 22
    .line 23
    iget-object v0, p1, LR8/s;->b:Ljava/lang/Enum;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    const-string v1, "enumClass"

    .line 41
    .line 42
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, LR8/c;->a(Ljava/lang/Class;)Lj9/b;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object p1, p1, LR8/s;->b:Ljava/lang/Enum;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v1, Lo9/i;

    .line 60
    .line 61
    invoke-direct {v1, v0, p1}, Lo9/i;-><init>(Lj9/b;Lj9/f;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_2
    instance-of v0, p1, LR8/g;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    iget-object v3, p0, LY8/f;->a:LFa/e;

    .line 69
    .line 70
    if-eqz v0, :cond_9

    .line 71
    .line 72
    check-cast p1, LR8/g;

    .line 73
    .line 74
    move-object v0, p1

    .line 75
    check-cast v0, LR8/e;

    .line 76
    .line 77
    iget-object v0, v0, LR8/e;->a:Lj9/f;

    .line 78
    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    sget-object v0, LU8/x;->b:Lj9/f;

    .line 82
    .line 83
    :cond_3
    const-string v4, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME"

    .line 84
    .line 85
    invoke-static {v0, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, LR8/g;->a()Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object v4, p0, LY8/f;->d:Lz9/i;

    .line 93
    .line 94
    sget-object v5, LY8/f;->h:[LC8/u;

    .line 95
    .line 96
    const/4 v6, 0x1

    .line 97
    aget-object v5, v5, v6

    .line 98
    .line 99
    invoke-static {v4, v5}, LJ7/j;->o(Lz9/m;LC8/u;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, LA9/D;

    .line 104
    .line 105
    const-string v5, "type"

    .line 106
    .line 107
    invoke-static {v4, v5}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v4}, LA9/c;->j(LA9/y;)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_4

    .line 115
    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_4
    invoke-static {p0}, Lq9/d;->d(LM8/b;)LL8/e;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v0, v4}, Lt1/Y;->l(Lj9/f;LL8/e;)LO8/U;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_5

    .line 130
    .line 131
    check-cast v0, LO8/V;

    .line 132
    .line 133
    invoke-virtual {v0}, LO8/V;->getType()LA9/y;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-nez v0, :cond_6

    .line 138
    .line 139
    :cond_5
    iget-object v0, v3, LFa/e;->t:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, LI4/a;

    .line 142
    .line 143
    iget-object v0, v0, LI4/a;->o:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, LO8/C;

    .line 146
    .line 147
    iget-object v0, v0, LO8/C;->v:LI8/i;

    .line 148
    .line 149
    sget-object v3, LC9/h;->V:LC9/h;

    .line 150
    .line 151
    new-array v2, v2, [Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v3, v2}, LC9/i;->c(LC9/h;[Ljava/lang/String;)LC9/f;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v0, v2}, LI8/i;->h(LA9/d0;)LA9/D;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :cond_6
    new-instance v2, Ljava/util/ArrayList;

    .line 162
    .line 163
    const/16 v3, 0xa

    .line 164
    .line 165
    invoke-static {p1, v3}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_8

    .line 181
    .line 182
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    check-cast v3, La9/a;

    .line 187
    .line 188
    invoke-virtual {p0, v3}, LY8/f;->c(La9/a;)Lo9/g;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    if-nez v3, :cond_7

    .line 193
    .line 194
    new-instance v3, Lo9/t;

    .line 195
    .line 196
    invoke-direct {v3, v1}, Lo9/g;-><init>(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_7
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_8
    new-instance p1, Lo9/w;

    .line 204
    .line 205
    invoke-direct {p1, v2, v0}, Lo9/w;-><init>(Ljava/util/List;LA9/y;)V

    .line 206
    .line 207
    .line 208
    return-object p1

    .line 209
    :cond_9
    instance-of v0, p1, LR8/f;

    .line 210
    .line 211
    if-eqz v0, :cond_a

    .line 212
    .line 213
    check-cast p1, LR8/f;

    .line 214
    .line 215
    new-instance v0, LR8/d;

    .line 216
    .line 217
    iget-object p1, p1, LR8/f;->b:Ljava/lang/annotation/Annotation;

    .line 218
    .line 219
    invoke-direct {v0, p1}, LR8/d;-><init>(Ljava/lang/annotation/Annotation;)V

    .line 220
    .line 221
    .line 222
    new-instance p1, Lo9/a;

    .line 223
    .line 224
    new-instance v1, LY8/f;

    .line 225
    .line 226
    invoke-direct {v1, v3, v0, v2}, LY8/f;-><init>(LFa/e;LR8/d;Z)V

    .line 227
    .line 228
    .line 229
    invoke-direct {p1, v1}, Lo9/g;-><init>(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    return-object p1

    .line 233
    :cond_a
    instance-of v0, p1, LR8/o;

    .line 234
    .line 235
    if-eqz v0, :cond_13

    .line 236
    .line 237
    check-cast p1, LR8/o;

    .line 238
    .line 239
    iget-object p1, p1, LR8/o;->b:Ljava/lang/Class;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-eqz v0, :cond_b

    .line 246
    .line 247
    new-instance v0, LR8/y;

    .line 248
    .line 249
    invoke-direct {v0, p1}, LR8/y;-><init>(Ljava/lang/Class;)V

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_b
    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    .line 254
    .line 255
    if-nez v0, :cond_e

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_c

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_c
    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    .line 265
    .line 266
    if-eqz v0, :cond_d

    .line 267
    .line 268
    new-instance v0, LR8/D;

    .line 269
    .line 270
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .line 271
    .line 272
    invoke-direct {v0, p1}, LR8/D;-><init>(Ljava/lang/reflect/WildcardType;)V

    .line 273
    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_d
    new-instance v0, LR8/p;

    .line 277
    .line 278
    invoke-direct {v0, p1}, LR8/p;-><init>(Ljava/lang/reflect/Type;)V

    .line 279
    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_e
    :goto_2
    new-instance v0, LR8/h;

    .line 283
    .line 284
    invoke-direct {v0, p1}, LR8/h;-><init>(Ljava/lang/reflect/Type;)V

    .line 285
    .line 286
    .line 287
    :goto_3
    iget-object p1, v3, LFa/e;->x:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast p1, LY1/c;

    .line 290
    .line 291
    const/4 v3, 0x2

    .line 292
    const/4 v4, 0x7

    .line 293
    invoke-static {v3, v2, v1, v4}, LC8/E;->A(IZLY8/F;I)LZ8/a;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-virtual {p1, v0, v3}, LY1/c;->P(La9/d;LZ8/a;)LA9/y;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-static {p1}, LA9/c;->j(LA9/y;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_f

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_f
    move-object v0, p1

    .line 309
    move v3, v2

    .line 310
    :goto_4
    invoke-static {v0}, LI8/i;->y(LA9/y;)Z

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-eqz v4, :cond_10

    .line 315
    .line 316
    invoke-virtual {v0}, LA9/y;->l()Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-static {v0}, Li8/k;->k0(Ljava/util/List;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    check-cast v0, LA9/S;

    .line 325
    .line 326
    invoke-virtual {v0}, LA9/S;->b()LA9/y;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    const-string v4, "type.arguments.single().type"

    .line 331
    .line 332
    invoke-static {v0, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    add-int/lit8 v3, v3, 0x1

    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_10
    invoke-virtual {v0}, LA9/y;->D()LA9/O;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-interface {v0}, LA9/O;->w()LL8/g;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    instance-of v4, v0, LL8/e;

    .line 347
    .line 348
    if-eqz v4, :cond_12

    .line 349
    .line 350
    invoke-static {v0}, Lq9/d;->f(LL8/g;)Lj9/b;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    if-nez v0, :cond_11

    .line 355
    .line 356
    new-instance v0, Lo9/r;

    .line 357
    .line 358
    new-instance v1, Lo9/o;

    .line 359
    .line 360
    invoke-direct {v1, p1}, Lo9/o;-><init>(LA9/y;)V

    .line 361
    .line 362
    .line 363
    invoke-direct {v0, v1}, Lo9/g;-><init>(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    return-object v0

    .line 367
    :cond_11
    new-instance p1, Lo9/r;

    .line 368
    .line 369
    invoke-direct {p1, v0, v3}, Lo9/r;-><init>(Lj9/b;I)V

    .line 370
    .line 371
    .line 372
    return-object p1

    .line 373
    :cond_12
    instance-of p1, v0, LL8/P;

    .line 374
    .line 375
    if-eqz p1, :cond_13

    .line 376
    .line 377
    new-instance p1, Lo9/r;

    .line 378
    .line 379
    sget-object v0, LI8/n;->a:Lj9/e;

    .line 380
    .line 381
    invoke-virtual {v0}, Lj9/e;->g()Lj9/c;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-static {v0}, Lj9/b;->j(Lj9/c;)Lj9/b;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-direct {p1, v0, v2}, Lo9/r;-><init>(Lj9/b;I)V

    .line 390
    .line 391
    .line 392
    return-object p1

    .line 393
    :cond_13
    :goto_5
    return-object v1
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
.end method

.method public final g()LL8/M;
    .locals 1

    .line 1
    iget-object v0, p0, LY8/f;->e:LQ8/f;

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

.method public final getType()LA9/y;
    .locals 3

    .line 1
    iget-object v0, p0, LY8/f;->d:Lz9/i;

    .line 2
    .line 3
    sget-object v1, LY8/f;->h:[LC8/u;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, v1}, LJ7/j;->o(Lz9/m;LC8/u;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LA9/D;

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
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Ll9/g;->c:Ll9/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p0, v1}, Ll9/g;->x(LM8/b;LM8/d;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
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
