.class public final LG9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG9/e;


# static fields
.field public static final b:LG9/l;

.field public static final c:LG9/l;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LG9/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LG9/l;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LG9/l;->b:LG9/l;

    .line 8
    .line 9
    new-instance v0, LG9/l;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, LG9/l;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LG9/l;->c:LG9/l;

    .line 16
    .line 17
    return-void
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

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LG9/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LW8/f;)Z
    .locals 5

    .line 1
    iget v0, p0, LG9/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LO8/w;->H0()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "functionDescriptor.valueParameters"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Iterable;

    .line 16
    .line 17
    instance-of v0, p1, Ljava/util/Collection;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move-object v0, p1

    .line 22
    check-cast v0, Ljava/util/Collection;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, LO8/U;

    .line 46
    .line 47
    const-string v1, "it"

    .line 48
    .line 49
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lq9/d;->a(LO8/U;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    iget-object v0, v0, LO8/U;->B:LA9/y;

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 p1, 0x0

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    :goto_1
    const/4 p1, 0x1

    .line 66
    :goto_2
    return p1

    .line 67
    :pswitch_0
    invoke-virtual {p1}, LO8/w;->H0()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const/4 v0, 0x1

    .line 72
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, LO8/U;

    .line 77
    .line 78
    sget-object v0, LI8/m;->d:Lv1/g;

    .line 79
    .line 80
    const-string v1, "secondParameter"

    .line 81
    .line 82
    invoke-static {p1, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lq9/d;->j(LL8/j;)LL8/y;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v0, LI8/n;->Q:Lj9/b;

    .line 93
    .line 94
    invoke-static {v1, v0}, LL8/v;->d(LL8/y;Lj9/b;)LL8/e;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-nez v0, :cond_3

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    goto :goto_3

    .line 102
    :cond_3
    sget-object v1, LA9/K;->t:Lo1/c;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    sget-object v1, LA9/K;->u:LA9/K;

    .line 108
    .line 109
    new-instance v2, LA9/I;

    .line 110
    .line 111
    invoke-interface {v0}, LL8/g;->I()LA9/O;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-interface {v3}, LA9/O;->u()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    const-string v4, "kPropertyClass.typeConstructor.parameters"

    .line 120
    .line 121
    invoke-static {v3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v3}, Li8/k;->k0(Ljava/util/List;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    const-string v4, "kPropertyClass.typeConstructor.parameters.single()"

    .line 129
    .line 130
    invoke-static {v3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    check-cast v3, LL8/P;

    .line 134
    .line 135
    invoke-direct {v2, v3}, LA9/I;-><init>(LL8/P;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v2}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-static {v1, v0, v2}, LA9/f;->q(LA9/K;LL8/e;Ljava/util/List;)LA9/D;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :goto_3
    const/4 v1, 0x0

    .line 147
    if-eqz v0, :cond_4

    .line 148
    .line 149
    check-cast p1, LO8/V;

    .line 150
    .line 151
    invoke-virtual {p1}, LO8/V;->getType()LA9/y;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const-string v2, "secondParameter.type"

    .line 156
    .line 157
    invoke-static {p1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-static {p1, v1}, LA9/b0;->g(LA9/y;Z)LA9/d0;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    sget-object v1, LB9/d;->a:LB9/m;

    .line 165
    .line 166
    invoke-virtual {v1, v0, p1}, LB9/m;->b(LA9/y;LA9/y;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    :cond_4
    return v1

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final b(LW8/f;)Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LG9/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, LD3/b;->n(LG9/e;LW8/f;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, LD3/b;->n(LG9/e;LW8/f;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LG9/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "should not have varargs or parameters with default values"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "second parameter must be of type KProperty<*> or its supertype"

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
