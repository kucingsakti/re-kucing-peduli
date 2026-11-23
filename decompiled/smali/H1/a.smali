.class public final LH1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/j;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Ly1/j;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LH1/a;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LH1/a;->c:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LH1/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LH1/a;->a:I

    iput-object p1, p0, LH1/a;->b:Ljava/lang/Object;

    iput-object p3, p0, LH1/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILy1/h;)LA1/F;
    .locals 9

    .line 1
    iget v0, p0, LH1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/io/InputStream;

    .line 7
    .line 8
    instance-of v0, p1, LH1/w;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, LH1/w;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    move v1, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, LH1/w;

    .line 18
    .line 19
    iget-object v1, p0, LH1/a;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, LB1/g;

    .line 22
    .line 23
    invoke-direct {v0, p1, v1}, LH1/w;-><init>(Ljava/io/InputStream;LB1/g;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    move v1, p1

    .line 28
    move-object p1, v0

    .line 29
    :goto_0
    sget-object v2, LU1/e;->u:Ljava/util/ArrayDeque;

    .line 30
    .line 31
    monitor-enter v2

    .line 32
    :try_start_0
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, LU1/e;

    .line 37
    .line 38
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    new-instance v0, LU1/e;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/io/InputStream;-><init>()V

    .line 44
    .line 45
    .line 46
    :cond_1
    move-object v2, v0

    .line 47
    iput-object p1, v2, LU1/e;->s:LH1/w;

    .line 48
    .line 49
    new-instance v0, LU1/k;

    .line 50
    .line 51
    invoke-direct {v0, v2}, LU1/k;-><init>(LU1/e;)V

    .line 52
    .line 53
    .line 54
    new-instance v8, Lcom/google/android/gms/internal/measurement/S;

    .line 55
    .line 56
    const/4 v3, 0x4

    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v8, p1, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/S;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 59
    .line 60
    .line 61
    :try_start_1
    iget-object v3, p0, LH1/a;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v3, LH1/o;

    .line 64
    .line 65
    new-instance v4, LA1/h;

    .line 66
    .line 67
    iget-object v5, v3, LH1/o;->d:Ljava/util/ArrayList;

    .line 68
    .line 69
    iget-object v6, v3, LH1/o;->c:LB1/g;

    .line 70
    .line 71
    invoke-direct {v4, v0, v5, v6}, LA1/h;-><init>(LU1/k;Ljava/util/ArrayList;LB1/g;)V

    .line 72
    .line 73
    .line 74
    move v5, p2

    .line 75
    move v6, p3

    .line 76
    move-object v7, p4

    .line 77
    invoke-virtual/range {v3 .. v8}, LH1/o;->a(LA1/h;IILy1/h;LH1/n;)LH1/d;

    .line 78
    .line 79
    .line 80
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    invoke-virtual {v2}, LU1/e;->a()V

    .line 82
    .line 83
    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    invoke-virtual {p1}, LH1/w;->b()V

    .line 87
    .line 88
    .line 89
    :cond_2
    return-object p2

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    move-object p2, v0

    .line 92
    invoke-virtual {v2}, LU1/e;->a()V

    .line 93
    .line 94
    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    invoke-virtual {p1}, LH1/w;->b()V

    .line 98
    .line 99
    .line 100
    :cond_3
    throw p2

    .line 101
    :catchall_1
    move-exception v0

    .line 102
    move-object p1, v0

    .line 103
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 104
    throw p1

    .line 105
    :pswitch_0
    move v5, p2

    .line 106
    move v6, p3

    .line 107
    move-object v7, p4

    .line 108
    check-cast p1, Landroid/net/Uri;

    .line 109
    .line 110
    iget-object p2, p0, LH1/a;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p2, LJ1/d;

    .line 113
    .line 114
    invoke-virtual {p2, p1, v7}, LJ1/d;->c(Landroid/net/Uri;Ly1/h;)LA1/F;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-nez p1, :cond_4

    .line 119
    .line 120
    const/4 p1, 0x0

    .line 121
    goto :goto_1

    .line 122
    :cond_4
    check-cast p1, LJ1/c;

    .line 123
    .line 124
    invoke-virtual {p1}, LJ1/c;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 129
    .line 130
    iget-object p2, p0, LH1/a;->c:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p2, LB1/b;

    .line 133
    .line 134
    invoke-static {p2, p1, v5, v6}, LH1/q;->a(LB1/b;Landroid/graphics/drawable/Drawable;II)LH1/d;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    :goto_1
    return-object p1

    .line 139
    :pswitch_1
    move v5, p2

    .line 140
    move v6, p3

    .line 141
    move-object v7, p4

    .line 142
    iget-object p2, p0, LH1/a;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p2, Ly1/j;

    .line 145
    .line 146
    invoke-interface {p2, p1, v5, v6, v7}, Ly1/j;->a(Ljava/lang/Object;IILy1/h;)LA1/F;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-nez p1, :cond_5

    .line 151
    .line 152
    const/4 p1, 0x0

    .line 153
    goto :goto_2

    .line 154
    :cond_5
    new-instance p2, LH1/d;

    .line 155
    .line 156
    iget-object p3, p0, LH1/a;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p3, Landroid/content/res/Resources;

    .line 159
    .line 160
    invoke-direct {p2, p3, p1}, LH1/d;-><init>(Landroid/content/res/Resources;LA1/F;)V

    .line 161
    .line 162
    .line 163
    move-object p1, p2

    .line 164
    :goto_2
    return-object p1

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final b(Ljava/lang/Object;Ly1/h;)Z
    .locals 1

    .line 1
    iget v0, p0, LH1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/io/InputStream;

    .line 7
    .line 8
    iget-object p1, p0, LH1/a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, LH1/o;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    .line 18
    .line 19
    const-string p2, "android.resource"

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :pswitch_1
    iget-object v0, p0, LH1/a;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ly1/j;

    .line 33
    .line 34
    invoke-interface {v0, p1, p2}, Ly1/j;->b(Ljava/lang/Object;Ly1/h;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
