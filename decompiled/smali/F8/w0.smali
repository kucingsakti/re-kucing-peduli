.class public abstract LF8/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj9/c;

    .line 2
    .line 3
    const-string v1, "java.lang.Void"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lj9/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lj9/b;->j(Lj9/c;)Lj9/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, LF8/w0;->a:Lj9/b;

    .line 13
    .line 14
    return-void
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

.method public static a(LL8/t;)LF8/k;
    .locals 4

    .line 1
    new-instance v0, LF8/k;

    .line 2
    .line 3
    new-instance v1, Li9/e;

    .line 4
    .line 5
    invoke-static {p0}, Li8/C;->k(LL8/t;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_2

    .line 10
    .line 11
    instance-of v2, p0, LO8/L;

    .line 12
    .line 13
    const-string v3, "descriptor.propertyIfAccessor.name.asString()"

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Lq9/d;->k(LL8/c;)LL8/c;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, LL8/j;->getName()Lj9/f;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Lj9/f;->g()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, LU8/w;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    instance-of v2, p0, LO8/M;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-static {p0}, Lq9/d;->k(LL8/c;)LL8/c;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, LL8/j;->getName()Lj9/f;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Lj9/f;->g()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, LU8/w;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move-object v2, p0

    .line 62
    check-cast v2, LO8/o;

    .line 63
    .line 64
    invoke-virtual {v2}, LO8/o;->getName()Lj9/f;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Lj9/f;->g()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const-string v3, "descriptor.name.asString()"

    .line 73
    .line 74
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_0
    const/4 v3, 0x1

    .line 78
    invoke-static {p0, v3}, Lqa/b;->c(LL8/t;I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-direct {v1, v2, p0}, Li9/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-direct {v0, v1}, LF8/k;-><init>(Li9/e;)V

    .line 86
    .line 87
    .line 88
    return-object v0
    .line 89
    .line 90
.end method

.method public static b(LL8/K;)LF8/t0;
    .locals 6

    .line 1
    const-string v0, "possiblyOverriddenProperty"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lm9/e;->t(LL8/c;)LL8/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, LL8/K;

    .line 11
    .line 12
    invoke-interface {p0}, LL8/K;->c()LL8/K;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string p0, "unwrapFakeOverride(possi\u2026rriddenProperty).original"

    .line 17
    .line 18
    invoke-static {v1, p0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    instance-of p0, v1, Ly9/o;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    move-object p0, v1

    .line 27
    check-cast p0, Ly9/o;

    .line 28
    .line 29
    sget-object v2, Lh9/k;->d:Lk9/m;

    .line 30
    .line 31
    const-string v3, "propertySignature"

    .line 32
    .line 33
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v3, v2

    .line 37
    iget-object v2, p0, Ly9/o;->S:Le9/G;

    .line 38
    .line 39
    invoke-static {v2, v3}, Lxa/d;->m(Lk9/k;Lk9/m;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lh9/e;

    .line 44
    .line 45
    if-eqz v3, :cond_a

    .line 46
    .line 47
    new-instance v0, LF8/n;

    .line 48
    .line 49
    iget-object v4, p0, Ly9/o;->T:Lg9/f;

    .line 50
    .line 51
    iget-object v5, p0, Ly9/o;->U:Lg9/g;

    .line 52
    .line 53
    invoke-direct/range {v0 .. v5}, LF8/n;-><init>(LL8/K;Le9/G;Lh9/e;Lg9/f;Lg9/g;)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_0
    instance-of p0, v1, LW8/g;

    .line 58
    .line 59
    if-eqz p0, :cond_a

    .line 60
    .line 61
    move-object p0, v1

    .line 62
    check-cast p0, LW8/g;

    .line 63
    .line 64
    invoke-virtual {p0}, LO8/p;->g()LL8/M;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    instance-of v2, p0, LQ8/f;

    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    check-cast p0, LQ8/f;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object p0, v0

    .line 76
    :goto_0
    if-eqz p0, :cond_2

    .line 77
    .line 78
    iget-object p0, p0, LQ8/f;->s:LR8/r;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move-object p0, v0

    .line 82
    :goto_1
    instance-of v2, p0, LR8/t;

    .line 83
    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    new-instance v0, LF8/l;

    .line 87
    .line 88
    check-cast p0, LR8/t;

    .line 89
    .line 90
    iget-object p0, p0, LR8/t;->a:Ljava/lang/reflect/Field;

    .line 91
    .line 92
    invoke-direct {v0, p0}, LF8/l;-><init>(Ljava/lang/reflect/Field;)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_3
    instance-of v2, p0, LR8/w;

    .line 97
    .line 98
    if-eqz v2, :cond_9

    .line 99
    .line 100
    new-instance v2, LF8/m;

    .line 101
    .line 102
    check-cast p0, LR8/w;

    .line 103
    .line 104
    iget-object p0, p0, LR8/w;->a:Ljava/lang/reflect/Method;

    .line 105
    .line 106
    invoke-interface {v1}, LL8/K;->h()LO8/M;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-eqz v1, :cond_4

    .line 111
    .line 112
    check-cast v1, LO8/p;

    .line 113
    .line 114
    invoke-virtual {v1}, LO8/p;->g()LL8/M;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    goto :goto_2

    .line 119
    :cond_4
    move-object v1, v0

    .line 120
    :goto_2
    instance-of v3, v1, LQ8/f;

    .line 121
    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    check-cast v1, LQ8/f;

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    move-object v1, v0

    .line 128
    :goto_3
    if-eqz v1, :cond_6

    .line 129
    .line 130
    iget-object v1, v1, LQ8/f;->s:LR8/r;

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_6
    move-object v1, v0

    .line 134
    :goto_4
    instance-of v3, v1, LR8/w;

    .line 135
    .line 136
    if-eqz v3, :cond_7

    .line 137
    .line 138
    check-cast v1, LR8/w;

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_7
    move-object v1, v0

    .line 142
    :goto_5
    if-eqz v1, :cond_8

    .line 143
    .line 144
    iget-object v0, v1, LR8/w;->a:Ljava/lang/reflect/Method;

    .line 145
    .line 146
    :cond_8
    invoke-direct {v2, p0, v0}, LF8/m;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 147
    .line 148
    .line 149
    return-object v2

    .line 150
    :cond_9
    new-instance v0, LF8/p0;

    .line 151
    .line 152
    new-instance v2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v3, "Incorrect resolution sequence for Java field "

    .line 155
    .line 156
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v1, " (source = "

    .line 163
    .line 164
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const/16 p0, 0x29

    .line 171
    .line 172
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    const/4 v1, 0x0

    .line 180
    invoke-direct {v0, p0, v1}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    :cond_a
    invoke-interface {v1}, LL8/K;->e()LO8/L;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-static {p0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-static {p0}, LF8/w0;->a(LL8/t;)LF8/k;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-interface {v1}, LL8/K;->h()LO8/M;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    if-eqz v1, :cond_b

    .line 200
    .line 201
    invoke-static {v1}, LF8/w0;->a(LL8/t;)LF8/k;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    :cond_b
    new-instance v1, LF8/o;

    .line 206
    .line 207
    invoke-direct {v1, p0, v0}, LF8/o;-><init>(LF8/k;LF8/k;)V

    .line 208
    .line 209
    .line 210
    return-object v1
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

.method public static c(LL8/t;)LF8/t0;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "possiblySubstitutedFunction"

    .line 3
    .line 4
    invoke-static {p0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lm9/e;->t(LL8/c;)LL8/c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, LL8/t;

    .line 12
    .line 13
    invoke-interface {v1}, LL8/t;->c()LL8/t;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "unwrapFakeOverride(possi\u2026titutedFunction).original"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    instance-of v2, v1, Ly9/b;

    .line 23
    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    check-cast v0, Ly9/b;

    .line 28
    .line 29
    invoke-interface {v0}, Ly9/i;->W()Lk9/a;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    instance-of v3, v2, Le9/y;

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    sget-object v3, Li9/h;->a:Lk9/g;

    .line 38
    .line 39
    move-object v3, v2

    .line 40
    check-cast v3, Le9/y;

    .line 41
    .line 42
    invoke-interface {v0}, Ly9/i;->J0()Lg9/f;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-interface {v0}, Ly9/i;->w0()Lg9/g;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {v3, v4, v5}, Li9/h;->c(Le9/y;Lg9/f;Lg9/g;)Li9/e;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    new-instance p0, LF8/k;

    .line 57
    .line 58
    invoke-direct {p0, v3}, LF8/k;-><init>(Li9/e;)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_0
    instance-of v3, v2, Le9/l;

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    sget-object v3, Li9/h;->a:Lk9/g;

    .line 67
    .line 68
    check-cast v2, Le9/l;

    .line 69
    .line 70
    invoke-interface {v0}, Ly9/i;->J0()Lg9/f;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-interface {v0}, Ly9/i;->w0()Lg9/g;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v2, v3, v0}, Li9/h;->a(Le9/l;Lg9/f;Lg9/g;)Li9/e;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-interface {p0}, LL8/j;->v()LL8/j;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-string v1, "possiblySubstitutedFunction.containingDeclaration"

    .line 89
    .line 90
    invoke-static {p0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0}, Lm9/g;->b(LL8/j;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_1

    .line 98
    .line 99
    new-instance p0, LF8/k;

    .line 100
    .line 101
    invoke-direct {p0, v0}, LF8/k;-><init>(Li9/e;)V

    .line 102
    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_1
    new-instance p0, LF8/j;

    .line 106
    .line 107
    invoke-direct {p0, v0}, LF8/j;-><init>(Li9/e;)V

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_2
    invoke-static {v1}, LF8/w0;->a(LL8/t;)LF8/k;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :cond_3
    instance-of p0, v1, LW8/f;

    .line 117
    .line 118
    const/4 v2, 0x0

    .line 119
    if-eqz p0, :cond_8

    .line 120
    .line 121
    move-object p0, v1

    .line 122
    check-cast p0, LW8/f;

    .line 123
    .line 124
    invoke-virtual {p0}, LO8/p;->g()LL8/M;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    instance-of v3, p0, LQ8/f;

    .line 129
    .line 130
    if-eqz v3, :cond_4

    .line 131
    .line 132
    check-cast p0, LQ8/f;

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_4
    move-object p0, v2

    .line 136
    :goto_0
    if-eqz p0, :cond_5

    .line 137
    .line 138
    iget-object p0, p0, LQ8/f;->s:LR8/r;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_5
    move-object p0, v2

    .line 142
    :goto_1
    instance-of v3, p0, LR8/w;

    .line 143
    .line 144
    if-eqz v3, :cond_6

    .line 145
    .line 146
    move-object v2, p0

    .line 147
    check-cast v2, LR8/w;

    .line 148
    .line 149
    :cond_6
    if-eqz v2, :cond_7

    .line 150
    .line 151
    iget-object p0, v2, LR8/w;->a:Ljava/lang/reflect/Method;

    .line 152
    .line 153
    if-eqz p0, :cond_7

    .line 154
    .line 155
    new-instance v0, LF8/i;

    .line 156
    .line 157
    invoke-direct {v0, p0}, LF8/i;-><init>(Ljava/lang/reflect/Method;)V

    .line 158
    .line 159
    .line 160
    return-object v0

    .line 161
    :cond_7
    new-instance p0, LF8/p0;

    .line 162
    .line 163
    new-instance v2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    const-string v3, "Incorrect resolution sequence for Java method "

    .line 166
    .line 167
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-direct {p0, v1, v0}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 178
    .line 179
    .line 180
    throw p0

    .line 181
    :cond_8
    instance-of p0, v1, LW8/b;

    .line 182
    .line 183
    const/16 v3, 0x29

    .line 184
    .line 185
    const-string v4, " ("

    .line 186
    .line 187
    if-eqz p0, :cond_d

    .line 188
    .line 189
    move-object p0, v1

    .line 190
    check-cast p0, LW8/b;

    .line 191
    .line 192
    invoke-virtual {p0}, LO8/p;->g()LL8/M;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    instance-of v5, p0, LQ8/f;

    .line 197
    .line 198
    if-eqz v5, :cond_9

    .line 199
    .line 200
    check-cast p0, LQ8/f;

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_9
    move-object p0, v2

    .line 204
    :goto_2
    if-eqz p0, :cond_a

    .line 205
    .line 206
    iget-object v2, p0, LQ8/f;->s:LR8/r;

    .line 207
    .line 208
    :cond_a
    instance-of p0, v2, LR8/q;

    .line 209
    .line 210
    if-eqz p0, :cond_b

    .line 211
    .line 212
    new-instance p0, LF8/h;

    .line 213
    .line 214
    check-cast v2, LR8/q;

    .line 215
    .line 216
    iget-object v0, v2, LR8/q;->a:Ljava/lang/reflect/Constructor;

    .line 217
    .line 218
    invoke-direct {p0, v0}, LF8/h;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 219
    .line 220
    .line 221
    return-object p0

    .line 222
    :cond_b
    instance-of p0, v2, LR8/n;

    .line 223
    .line 224
    if-eqz p0, :cond_c

    .line 225
    .line 226
    move-object p0, v2

    .line 227
    check-cast p0, LR8/n;

    .line 228
    .line 229
    iget-object v5, p0, LR8/n;->a:Ljava/lang/Class;

    .line 230
    .line 231
    invoke-virtual {v5}, Ljava/lang/Class;->isAnnotation()Z

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    if-eqz v5, :cond_c

    .line 236
    .line 237
    new-instance v0, LF8/g;

    .line 238
    .line 239
    iget-object p0, p0, LR8/n;->a:Ljava/lang/Class;

    .line 240
    .line 241
    invoke-direct {v0, p0}, LF8/g;-><init>(Ljava/lang/Class;)V

    .line 242
    .line 243
    .line 244
    return-object v0

    .line 245
    :cond_c
    new-instance p0, LF8/p0;

    .line 246
    .line 247
    new-instance v5, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    const-string v6, "Incorrect resolution sequence for Java constructor "

    .line 250
    .line 251
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-direct {p0, v1, v0}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 271
    .line 272
    .line 273
    throw p0

    .line 274
    :cond_d
    move-object p0, v1

    .line 275
    check-cast p0, LO8/o;

    .line 276
    .line 277
    invoke-virtual {p0}, LO8/o;->getName()Lj9/f;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    sget-object v5, LI8/o;->c:Lj9/f;

    .line 282
    .line 283
    invoke-virtual {v2, v5}, Lj9/f;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_e

    .line 288
    .line 289
    invoke-static {v1}, Lm9/m;->n(LL8/t;)Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-eqz v2, :cond_e

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_e
    invoke-virtual {p0}, LO8/o;->getName()Lj9/f;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    sget-object v5, LI8/o;->a:Lj9/f;

    .line 301
    .line 302
    invoke-virtual {v2, v5}, Lj9/f;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-eqz v2, :cond_f

    .line 307
    .line 308
    invoke-static {v1}, Lm9/m;->n(LL8/t;)Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-eqz v2, :cond_f

    .line 313
    .line 314
    goto :goto_3

    .line 315
    :cond_f
    invoke-virtual {p0}, LO8/o;->getName()Lj9/f;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    sget-object v2, LK8/a;->e:Lj9/f;

    .line 320
    .line 321
    invoke-static {p0, v2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result p0

    .line 325
    if-eqz p0, :cond_10

    .line 326
    .line 327
    invoke-interface {v1}, LL8/b;->H0()Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 332
    .line 333
    .line 334
    move-result p0

    .line 335
    if-eqz p0, :cond_10

    .line 336
    .line 337
    :goto_3
    invoke-static {v1}, LF8/w0;->a(LL8/t;)LF8/k;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    return-object p0

    .line 342
    :cond_10
    new-instance p0, LF8/p0;

    .line 343
    .line 344
    new-instance v2, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    const-string v5, "Unknown origin of "

    .line 347
    .line 348
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-direct {p0, v1, v0}, LF8/p0;-><init>(Ljava/lang/String;I)V

    .line 372
    .line 373
    .line 374
    throw p0
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
