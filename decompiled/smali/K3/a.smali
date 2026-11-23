.class public final synthetic LK3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN3/a;
.implements LM3/a;
.implements Lh4/a;


# instance fields
.field public final synthetic s:LK3/b;


# direct methods
.method public synthetic constructor <init>(LK3/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK3/a;->s:LK3/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lh4/b;)V
    .locals 7

    .line 1
    iget-object v0, p0, LK3/a;->s:LK3/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "FirebaseCrashlytics"

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Lh4/b;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, LF3/a;

    .line 17
    .line 18
    new-instance v1, Le1/j;

    .line 19
    .line 20
    const/16 v3, 0x14

    .line 21
    .line 22
    invoke-direct {v1, p1, v3}, Le1/j;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lo1/k;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    check-cast p1, LF3/b;

    .line 31
    .line 32
    const-string v4, "clx"

    .line 33
    .line 34
    invoke-virtual {p1, v4, v3}, LF3/b;->b(Ljava/lang/String;Lo1/k;)Lr3/e;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v5, 0x0

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    const-string v4, "FirebaseCrashlytics"

    .line 42
    .line 43
    invoke-static {v4, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 44
    .line 45
    .line 46
    const-string v6, "crash"

    .line 47
    .line 48
    invoke-virtual {p1, v6, v3}, LF3/b;->b(Ljava/lang/String;Lo1/k;)Lr3/e;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    const-string v6, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    .line 55
    .line 56
    invoke-static {v4, v6, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 57
    .line 58
    .line 59
    :cond_0
    move-object v4, p1

    .line 60
    :cond_1
    if-eqz v4, :cond_3

    .line 61
    .line 62
    const-string p1, "FirebaseCrashlytics"

    .line 63
    .line 64
    invoke-static {p1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 65
    .line 66
    .line 67
    new-instance p1, LA1/r;

    .line 68
    .line 69
    const/16 v2, 0x19

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-direct {p1, v2, v4}, LA1/r;-><init>(IZ)V

    .line 73
    .line 74
    .line 75
    new-instance v2, LA1/h;

    .line 76
    .line 77
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 78
    .line 79
    invoke-direct {v2, v1}, LA1/h;-><init>(Le1/j;)V

    .line 80
    .line 81
    .line 82
    monitor-enter v0

    .line 83
    :try_start_0
    iget-object v1, v0, LK3/b;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_2

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, LO3/p;

    .line 102
    .line 103
    invoke-virtual {p1, v4}, LA1/r;->e(LO3/p;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    goto :goto_1

    .line 109
    :cond_2
    iput-object p1, v3, Lo1/k;->t:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v2, v3, Lo1/k;->s:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object p1, v0, LK3/b;->c:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v2, v0, LK3/b;->b:Ljava/lang/Object;

    .line 116
    .line 117
    monitor-exit v0

    .line 118
    return-void

    .line 119
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    throw p1

    .line 121
    :cond_3
    const-string p1, "Could not register Firebase Analytics listener; a listener is already registered."

    .line 122
    .line 123
    const-string v0, "FirebaseCrashlytics"

    .line 124
    .line 125
    invoke-static {v0, p1, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 126
    .line 127
    .line 128
    return-void
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

.method public e(LO3/p;)V
    .locals 2

    .line 1
    iget-object v0, p0, LK3/a;->s:LK3/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, LK3/b;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, LN3/a;

    .line 7
    .line 8
    instance-of v1, v1, LN3/b;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v0, LK3/b;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, v0, LK3/b;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, LN3/a;

    .line 22
    .line 23
    invoke-interface {v1, p1}, LN3/a;->e(LO3/p;)V

    .line 24
    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1
    .line 31
    .line 32
    .line 33
.end method

.method public z(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK3/a;->s:LK3/b;

    .line 2
    .line 3
    iget-object v0, v0, LK3/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LM3/a;

    .line 6
    .line 7
    invoke-interface {v0, p1}, LM3/a;->z(Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
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
