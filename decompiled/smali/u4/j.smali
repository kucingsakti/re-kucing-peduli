.class public final Lu4/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lu4/h;

.field public static final d:Lg0/b;


# instance fields
.field public final a:Lo4/n;

.field public final b:Lu4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lu4/h;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu4/j;->c:Lu4/h;

    .line 7
    .line 8
    sget-object v0, Ls4/t;->b:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v1, LV/h;

    .line 11
    .line 12
    sget-object v2, Lu4/g;->s:Lu4/g;

    .line 13
    .line 14
    invoke-direct {v1, v2}, LV/h;-><init>(Lu8/b;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lo1/f;->m(Ljava/lang/String;LV/h;)Lg0/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lu4/j;->d:Lg0/b;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
.end method

.method public constructor <init>(LD3/g;Lm8/i;Lm8/i;Li4/d;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, LD3/g;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LD3/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-string v1, "firebaseApp.applicationContext"

    .line 7
    .line 8
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Ls4/G;->a:Ls4/G;

    .line 12
    .line 13
    invoke-static {p1}, Ls4/G;->a(LD3/g;)Ls4/b;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    new-instance p1, Lo4/n;

    .line 18
    .line 19
    invoke-direct {p1, v0}, Lo4/n;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lu4/d;

    .line 23
    .line 24
    new-instance v6, LY1/c;

    .line 25
    .line 26
    invoke-direct {v6, v5, p2}, LY1/c;-><init>(Ls4/b;Lm8/i;)V

    .line 27
    .line 28
    .line 29
    sget-object p2, Lu4/j;->c:Lu4/h;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget-object p2, Lu4/h;->a:[LC8/u;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    aget-object p2, p2, v1

    .line 38
    .line 39
    sget-object v1, Lu4/j;->d:Lg0/b;

    .line 40
    .line 41
    invoke-virtual {v1, p2, v0}, Lg0/b;->a(LC8/u;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    move-object v7, p2

    .line 46
    check-cast v7, Le0/f;

    .line 47
    .line 48
    move-object v3, p3

    .line 49
    move-object v4, p4

    .line 50
    invoke-direct/range {v2 .. v7}, Lu4/d;-><init>(Lm8/i;Li4/d;Ls4/b;LY1/c;Le0/f;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lu4/j;->a:Lo4/n;

    .line 57
    .line 58
    iput-object v2, p0, Lu4/j;->b:Lu4/d;

    .line 59
    .line 60
    return-void
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
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
.end method


# virtual methods
.method public final a()D
    .locals 7

    .line 1
    iget-object v0, p0, Lu4/j;->a:Lo4/n;

    .line 2
    .line 3
    iget-object v0, v0, Lo4/n;->a:Landroid/os/Bundle;

    .line 4
    .line 5
    const-string v1, "firebase_sessions_sampling_rate"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    const-wide/16 v1, 0x0

    .line 24
    .line 25
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    cmpg-double v0, v1, v5

    .line 34
    .line 35
    if-gtz v0, :cond_1

    .line 36
    .line 37
    cmpg-double v0, v5, v3

    .line 38
    .line 39
    if-gtz v0, :cond_1

    .line 40
    .line 41
    return-wide v5

    .line 42
    :cond_1
    iget-object v0, p0, Lu4/j;->b:Lu4/d;

    .line 43
    .line 44
    invoke-virtual {v0}, Lu4/d;->b()Lu4/n;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v0, v0, Lu4/n;->b:Lu4/f;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-object v0, v0, Lu4/f;->b:Ljava/lang/Double;

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    cmpg-double v0, v1, v5

    .line 61
    .line 62
    if-gtz v0, :cond_2

    .line 63
    .line 64
    cmpg-double v0, v5, v3

    .line 65
    .line 66
    if-gtz v0, :cond_2

    .line 67
    .line 68
    return-wide v5

    .line 69
    :cond_2
    return-wide v3

    .line 70
    :cond_3
    const-string v0, "sessionConfigs"

    .line 71
    .line 72
    invoke-static {v0}, Lv8/i;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    throw v0
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

.method public final b(Lo8/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lu4/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lu4/i;

    .line 7
    .line 8
    iget v1, v0, Lu4/i;->v:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lu4/i;->v:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lu4/i;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lu4/i;-><init>(Lu4/j;Lo8/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lu4/i;->t:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Ln8/a;->s:Ln8/a;

    .line 28
    .line 29
    iget v2, v0, Lu4/i;->v:I

    .line 30
    .line 31
    sget-object v3, Lh8/m;->a:Lh8/m;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v5, :cond_2

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget-object v2, v0, Lu4/i;->s:Lu4/j;

    .line 54
    .line 55
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {p1}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput-object p0, v0, Lu4/i;->s:Lu4/j;

    .line 63
    .line 64
    iput v5, v0, Lu4/i;->v:I

    .line 65
    .line 66
    iget-object p1, p0, Lu4/j;->a:Lo4/n;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    if-ne v3, v1, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    move-object v2, p0

    .line 75
    :goto_1
    iget-object p1, v2, Lu4/j;->b:Lu4/d;

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    iput-object v2, v0, Lu4/i;->s:Lu4/j;

    .line 79
    .line 80
    iput v4, v0, Lu4/i;->v:I

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Lu4/d;->d(Lm8/d;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v1, :cond_5

    .line 87
    .line 88
    :goto_2
    return-object v1

    .line 89
    :cond_5
    :goto_3
    return-object v3
    .line 90
.end method
