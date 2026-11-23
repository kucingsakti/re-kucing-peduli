.class public final Ls4/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls4/G;

.field public static final b:LP0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ls4/G;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls4/G;->a:Ls4/G;

    .line 7
    .line 8
    new-instance v0, Lc4/d;

    .line 9
    .line 10
    invoke-direct {v0}, Lc4/d;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ls4/g;->a:Ls4/g;

    .line 14
    .line 15
    const-class v2, Ls4/F;

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Lc4/d;->a(Ljava/lang/Class;La4/c;)Lb4/a;

    .line 18
    .line 19
    .line 20
    sget-object v1, Ls4/h;->a:Ls4/h;

    .line 21
    .line 22
    const-class v2, Ls4/N;

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1}, Lc4/d;->a(Ljava/lang/Class;La4/c;)Lb4/a;

    .line 25
    .line 26
    .line 27
    sget-object v1, Ls4/e;->a:Ls4/e;

    .line 28
    .line 29
    const-class v2, Ls4/j;

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Lc4/d;->a(Ljava/lang/Class;La4/c;)Lb4/a;

    .line 32
    .line 33
    .line 34
    sget-object v1, Ls4/d;->a:Ls4/d;

    .line 35
    .line 36
    const-class v2, Ls4/b;

    .line 37
    .line 38
    invoke-virtual {v0, v2, v1}, Lc4/d;->a(Ljava/lang/Class;La4/c;)Lb4/a;

    .line 39
    .line 40
    .line 41
    sget-object v1, Ls4/c;->a:Ls4/c;

    .line 42
    .line 43
    const-class v2, Ls4/a;

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Lc4/d;->a(Ljava/lang/Class;La4/c;)Lb4/a;

    .line 46
    .line 47
    .line 48
    sget-object v1, Ls4/f;->a:Ls4/f;

    .line 49
    .line 50
    const-class v2, Ls4/s;

    .line 51
    .line 52
    invoke-virtual {v0, v2, v1}, Lc4/d;->a(Ljava/lang/Class;La4/c;)Lb4/a;

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    iput-boolean v1, v0, Lc4/d;->d:Z

    .line 57
    .line 58
    new-instance v1, LP0/d;

    .line 59
    .line 60
    const/16 v2, 0x16

    .line 61
    .line 62
    invoke-direct {v1, v0, v2}, LP0/d;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    sput-object v1, Ls4/G;->b:LP0/d;

    .line 66
    .line 67
    return-void
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

.method public static a(LD3/g;)Ls4/b;
    .locals 13

    .line 1
    invoke-virtual {p0}, LD3/g;->a()V

    .line 2
    .line 3
    .line 4
    const-string v0, "firebaseApp.applicationContext"

    .line 5
    .line 6
    iget-object v1, p0, LD3/g;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v1, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v3, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v5, 0x1c

    .line 27
    .line 28
    if-lt v4, v5, :cond_0

    .line 29
    .line 30
    invoke-static {v0}, LC0/m;->c(Landroid/content/pm/PackageInfo;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v6

    .line 34
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget v4, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 40
    .line 41
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :goto_0
    new-instance v8, Ls4/b;

    .line 46
    .line 47
    invoke-virtual {p0}, LD3/g;->a()V

    .line 48
    .line 49
    .line 50
    iget-object v6, p0, LD3/g;->c:LD3/j;

    .line 51
    .line 52
    iget-object v9, v6, LD3/j;->b:Ljava/lang/String;

    .line 53
    .line 54
    const-string v6, "firebaseApp.options.applicationId"

    .line 55
    .line 56
    invoke-static {v9, v6}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 60
    .line 61
    const-string v7, "MODEL"

    .line 62
    .line 63
    invoke-static {v6, v7}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 67
    .line 68
    const-string v7, "RELEASE"

    .line 69
    .line 70
    invoke-static {v6, v7}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    move v6, v2

    .line 74
    new-instance v2, Ls4/a;

    .line 75
    .line 76
    const-string v7, "packageName"

    .line 77
    .line 78
    invoke-static {v3, v7}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 82
    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    move-object v0, v4

    .line 86
    :cond_1
    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 87
    .line 88
    const-string v10, "MANUFACTURER"

    .line 89
    .line 90
    invoke-static {v7, v10}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, LD3/g;->a()V

    .line 94
    .line 95
    .line 96
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    invoke-static {v1}, Ls4/y;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    :cond_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    if-eqz v11, :cond_3

    .line 113
    .line 114
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    move-object v12, v11

    .line 119
    check-cast v12, Ls4/s;

    .line 120
    .line 121
    iget v12, v12, Ls4/s;->b:I

    .line 122
    .line 123
    if-ne v12, v7, :cond_2

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    const/4 v11, 0x0

    .line 127
    :goto_1
    check-cast v11, Ls4/s;

    .line 128
    .line 129
    if-nez v11, :cond_7

    .line 130
    .line 131
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 132
    .line 133
    const/16 v11, 0x21

    .line 134
    .line 135
    if-lt v10, v11, :cond_4

    .line 136
    .line 137
    invoke-static {}, LL3/c;->j()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    const-string v10, "myProcessName()"

    .line 142
    .line 143
    invoke-static {v5, v10}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    if-lt v10, v5, :cond_5

    .line 148
    .line 149
    invoke-static {}, LC0/m;->p()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    if-eqz v5, :cond_5

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    invoke-static {}, Lcom/google/android/gms/common/util/ProcessUtils;->a()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    if-eqz v5, :cond_6

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_6
    const-string v5, ""

    .line 164
    .line 165
    :goto_2
    new-instance v11, Ls4/s;

    .line 166
    .line 167
    invoke-direct {v11, v7, v6, v5, v6}, Ls4/s;-><init>(IILjava/lang/String;Z)V

    .line 168
    .line 169
    .line 170
    :cond_7
    move-object v6, v11

    .line 171
    invoke-virtual {p0}, LD3/g;->a()V

    .line 172
    .line 173
    .line 174
    invoke-static {v1}, Ls4/y;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    move-object v5, v4

    .line 179
    move-object v4, v0

    .line 180
    invoke-direct/range {v2 .. v7}, Ls4/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls4/s;Ljava/util/ArrayList;)V

    .line 181
    .line 182
    .line 183
    invoke-direct {v8, v9, v2}, Ls4/b;-><init>(Ljava/lang/String;Ls4/a;)V

    .line 184
    .line 185
    .line 186
    return-object v8
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
