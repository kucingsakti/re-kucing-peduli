.class public final Lo9/r;
.super Lo9/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lj9/b;I)V
    .locals 1

    .line 1
    new-instance v0, Lo9/f;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lo9/f;-><init>(Lj9/b;I)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lo9/p;

    .line 7
    .line 8
    invoke-direct {p1, v0}, Lo9/p;-><init>(Lo9/f;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lo9/g;-><init>(Ljava/lang/Object;)V

    .line 12
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
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
.end method


# virtual methods
.method public final a(LL8/y;)LA9/y;
    .locals 7

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LA9/K;->t:Lo1/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v0, LA9/K;->u:LA9/K;

    .line 12
    .line 13
    invoke-interface {p1}, LL8/y;->s()LI8/i;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v2, LI8/n;->P:Lj9/e;

    .line 21
    .line 22
    invoke-virtual {v2}, Lj9/e;->g()Lj9/c;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, LI8/i;->i(Lj9/c;)LL8/e;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, LA9/T;

    .line 31
    .line 32
    iget-object v3, p0, Lo9/g;->a:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v4, v3

    .line 35
    check-cast v4, Lo9/q;

    .line 36
    .line 37
    instance-of v5, v4, Lo9/o;

    .line 38
    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    check-cast v3, Lo9/o;

    .line 42
    .line 43
    iget-object p1, v3, Lo9/o;->a:LA9/y;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    instance-of v4, v4, Lo9/p;

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    check-cast v3, Lo9/p;

    .line 51
    .line 52
    iget-object v3, v3, Lo9/p;->a:Lo9/f;

    .line 53
    .line 54
    iget-object v4, v3, Lo9/f;->a:Lj9/b;

    .line 55
    .line 56
    invoke-static {p1, v4}, LL8/v;->d(LL8/y;Lj9/b;)LL8/e;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    iget v3, v3, Lo9/f;->b:I

    .line 61
    .line 62
    if-nez v5, :cond_1

    .line 63
    .line 64
    sget-object p1, LC9/h;->v:LC9/h;

    .line 65
    .line 66
    invoke-virtual {v4}, Lj9/b;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const-string v5, "classId.toString()"

    .line 71
    .line 72
    invoke-static {v4, v5}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-static {p1, v3}, LC9/i;->c(LC9/h;[Ljava/lang/String;)LC9/f;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-interface {v5}, LL8/e;->p()LA9/D;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    const-string v5, "descriptor.defaultType"

    .line 93
    .line 94
    invoke-static {v4, v5}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v4}, Lqa/b;->y(LA9/y;)LA9/d0;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    const/4 v5, 0x0

    .line 102
    :goto_0
    if-ge v5, v3, :cond_2

    .line 103
    .line 104
    invoke-interface {p1}, LL8/y;->s()LI8/i;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v6, v4}, LI8/i;->h(LA9/d0;)LA9/D;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    add-int/lit8 v5, v5, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    move-object p1, v4

    .line 116
    :goto_1
    invoke-direct {v2, p1}, LA9/T;-><init>(LA9/y;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v2}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {v0, v1, p1}, LA9/f;->q(LA9/K;LL8/e;Ljava/util/List;)LA9/D;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    return-object p1

    .line 128
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 129
    .line 130
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 131
    .line 132
    .line 133
    throw p1
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
