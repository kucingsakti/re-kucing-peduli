.class public final LN4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/NotificationManager;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Ljava/util/LinkedHashSet;

.field public f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final synthetic h:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    iput-object p1, p0, LN4/e;->h:Landroid/content/Context;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "getApplicationContext(...)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LN4/e;->a:Landroid/content/Context;

    .line 16
    .line 17
    const-string v1, "notification"

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    .line 24
    .line 25
    invoke-static {p1, v1}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Landroid/app/NotificationManager;

    .line 29
    .line 30
    iput-object p1, p0, LN4/e;->b:Landroid/app/NotificationManager;

    .line 31
    .line 32
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, LN4/e;->d:Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, LN4/e;->e:Ljava/util/LinkedHashSet;

    .line 52
    .line 53
    const-string v1, ""

    .line 54
    .line 55
    iput-object v1, p0, LN4/e;->f:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v2, "DEFAULT_FETCH2_NOTIFICATION_MANAGER_ACTION_"

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, p0, LN4/e;->g:Ljava/lang/String;

    .line 76
    .line 77
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 78
    .line 79
    const/16 v3, 0x21

    .line 80
    .line 81
    if-lt v2, v3, :cond_0

    .line 82
    .line 83
    new-instance v3, LJ4/j;

    .line 84
    .line 85
    const/4 v4, 0x1

    .line 86
    invoke-direct {v3, p0, v4}, LJ4/j;-><init>(Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    new-instance v4, Landroid/content/IntentFilter;

    .line 90
    .line 91
    invoke-direct {v4, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v3, v4}, LB1/h;->p(Landroid/content/Context;LJ4/j;Landroid/content/IntentFilter;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    new-instance v3, LJ4/j;

    .line 99
    .line 100
    const/4 v4, 0x1

    .line 101
    invoke-direct {v3, p0, v4}, LJ4/j;-><init>(Ljava/lang/Object;I)V

    .line 102
    .line 103
    .line 104
    new-instance v4, Landroid/content/IntentFilter;

    .line 105
    .line 106
    invoke-direct {v4, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    :goto_0
    const/16 v1, 0x1a

    .line 113
    .line 114
    if-lt v2, v1, :cond_1

    .line 115
    .line 116
    const v1, 0x7f140089

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const-string v2, "getString(...)"

    .line 124
    .line 125
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1, v1}, Lcom/unity3d/services/core/device/reader/a;->d(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    if-nez v3, :cond_1

    .line 133
    .line 134
    const v3, 0x7f14008a

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-static {}, LB1/h;->l()V

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v0}, LB1/h;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {p1, v0}, Lt1/t;->m(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 152
    .line 153
    .line 154
    :cond_1
    return-void
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

.method public static c(Landroid/content/Context;J)Ljava/lang/String;
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/16 v3, 0x3e8

    .line 5
    .line 6
    int-to-long v3, v3

    .line 7
    div-long/2addr p1, v3

    .line 8
    const/16 v3, 0xe10

    .line 9
    .line 10
    int-to-long v3, v3

    .line 11
    div-long v5, p1, v3

    .line 12
    .line 13
    mul-long/2addr v3, v5

    .line 14
    sub-long/2addr p1, v3

    .line 15
    const/16 v3, 0x3c

    .line 16
    .line 17
    int-to-long v3, v3

    .line 18
    div-long v7, p1, v3

    .line 19
    .line 20
    mul-long/2addr v3, v7

    .line 21
    sub-long/2addr p1, v3

    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    cmp-long v9, v5, v3

    .line 25
    .line 26
    const-string v10, "getString(...)"

    .line 27
    .line 28
    if-lez v9, :cond_0

    .line 29
    .line 30
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const/4 p2, 0x3

    .line 43
    new-array p2, p2, [Ljava/lang/Object;

    .line 44
    .line 45
    aput-object v3, p2, v2

    .line 46
    .line 47
    aput-object v4, p2, v1

    .line 48
    .line 49
    aput-object p1, p2, v0

    .line 50
    .line 51
    const p1, 0x7f14008e

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0, v10}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_0
    cmp-long v3, v7, v3

    .line 63
    .line 64
    if-lez v3, :cond_1

    .line 65
    .line 66
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-array p2, v0, [Ljava/lang/Object;

    .line 75
    .line 76
    aput-object v3, p2, v2

    .line 77
    .line 78
    aput-object p1, p2, v1

    .line 79
    .line 80
    const p1, 0x7f14008f

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0, v10}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-array p2, v1, [Ljava/lang/Object;

    .line 96
    .line 97
    aput-object p1, p2, v2

    .line 98
    .line 99
    const p1, 0x7f140090

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0, v10}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object p0
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
.end method

.method public static g(ILI/s;Ljava/util/ArrayList;Landroid/content/Context;)V
    .locals 8

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LI/q;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, LI/q;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    if-eqz v1, :cond_7

    .line 23
    .line 24
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lcom/tonyodev/fetch2/DownloadNotification;

    .line 29
    .line 30
    const-string v4, "downloadNotification"

    .line 31
    .line 32
    invoke-static {v1, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v4, v1, Lcom/tonyodev/fetch2/DownloadNotification;->s:Lh7/f;

    .line 36
    .line 37
    sget-object v5, Lh7/f;->x:Lh7/f;

    .line 38
    .line 39
    if-ne v4, v5, :cond_1

    .line 40
    .line 41
    move v2, v3

    .line 42
    :cond_1
    const-string v3, "getString(...)"

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    const v2, 0x7f14008c

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    sget-object v2, Lh7/f;->z:Lh7/f;

    .line 58
    .line 59
    if-ne v4, v2, :cond_3

    .line 60
    .line 61
    const v2, 0x7f140091

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    sget-object v2, Lh7/f;->w:Lh7/f;

    .line 73
    .line 74
    if-ne v4, v2, :cond_4

    .line 75
    .line 76
    const v2, 0x7f140093

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    sget-object v2, Lh7/f;->u:Lh7/f;

    .line 88
    .line 89
    if-ne v4, v2, :cond_5

    .line 90
    .line 91
    const v2, 0x7f140096

    .line 92
    .line 93
    .line 94
    invoke-virtual {p3, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    iget-wide v4, v1, Lcom/tonyodev/fetch2/DownloadNotification;->w:J

    .line 103
    .line 104
    const-wide/16 v6, 0x0

    .line 105
    .line 106
    cmp-long v2, v4, v6

    .line 107
    .line 108
    if-gez v2, :cond_6

    .line 109
    .line 110
    const v2, 0x7f14008d

    .line 111
    .line 112
    .line 113
    invoke-virtual {p3, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_6
    invoke-static {p3, v4, v5}, LN4/e;->c(Landroid/content/Context;J)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    iget-wide v4, v1, Lcom/tonyodev/fetch2/DownloadNotification;->y:J

    .line 131
    .line 132
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const/16 v1, 0x20

    .line 136
    .line 137
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-eqz v1, :cond_0

    .line 148
    .line 149
    iget-object v2, v0, LI/q;->f:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v2, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-static {v1}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_7
    iput v2, p1, LI/s;->j:I

    .line 163
    .line 164
    iget-object p2, p1, LI/s;->z:Landroid/app/Notification;

    .line 165
    .line 166
    const v1, 0x1080082

    .line 167
    .line 168
    .line 169
    iput v1, p2, Landroid/app/Notification;->icon:I

    .line 170
    .line 171
    const p2, 0x7f14008a

    .line 172
    .line 173
    .line 174
    invoke-virtual {p3, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    invoke-static {p2}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    iput-object p2, p1, LI/s;->e:Ljava/lang/CharSequence;

    .line 183
    .line 184
    const-string p2, ""

    .line 185
    .line 186
    invoke-static {p2}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    iput-object p2, p1, LI/s;->f:Ljava/lang/CharSequence;

    .line 191
    .line 192
    invoke-virtual {p1, v0}, LI/s;->i(LI/u;)V

    .line 193
    .line 194
    .line 195
    const/16 p2, 0x8

    .line 196
    .line 197
    invoke-virtual {p1, p2, v3}, LI/s;->e(IZ)V

    .line 198
    .line 199
    .line 200
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    iput-object p0, p1, LI/s;->p:Ljava/lang/String;

    .line 205
    .line 206
    iput-boolean v3, p1, LI/s;->q:Z

    .line 207
    .line 208
    return-void
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
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/tonyodev/fetch2/DownloadNotification;

    .line 25
    .line 26
    iget-object v3, v2, Lcom/tonyodev/fetch2/DownloadNotification;->s:Lh7/f;

    .line 27
    .line 28
    sget-object v4, Lh7/f;->z:Lh7/f;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x1

    .line 32
    if-ne v3, v4, :cond_1

    .line 33
    .line 34
    move v4, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v4, v5

    .line 37
    :goto_1
    if-nez v4, :cond_0

    .line 38
    .line 39
    sget-object v4, Lh7/f;->x:Lh7/f;

    .line 40
    .line 41
    if-ne v3, v4, :cond_2

    .line 42
    .line 43
    move v5, v6

    .line 44
    :cond_2
    if-nez v5, :cond_0

    .line 45
    .line 46
    iget-object v3, p0, LN4/e;->b:Landroid/app/NotificationManager;

    .line 47
    .line 48
    iget v4, v2, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Landroid/app/NotificationManager;->cancel(I)V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, LN4/e;->d:Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    iget v4, v2, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 56
    .line 57
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    iget-object v3, p0, LN4/e;->e:Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    iget v4, v2, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 67
    .line 68
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-interface {v3, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 76
    .line 77
    .line 78
    iget v2, v2, Lcom/tonyodev/fetch2/DownloadNotification;->v:I

    .line 79
    .line 80
    invoke-virtual {p0, v2}, LN4/e;->e(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception v1

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    monitor-exit v0

    .line 87
    return-void

    .line 88
    :goto_2
    monitor-exit v0

    .line 89
    throw v1
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
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
.end method

.method public final b(Lcom/tonyodev/fetch2/DownloadNotification;I)Landroid/app/PendingIntent;
    .locals 5

    .line 1
    const-string v0, "actionType"

    .line 2
    .line 3
    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/g;->p(ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    .line 10
    .line 11
    iget-object v2, p0, LN4/e;->g:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "com.tonyodev.fetch2.extra.NAMESPACE"

    .line 17
    .line 18
    iget-object v3, p1, Lcom/tonyodev/fetch2/DownloadNotification;->A:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    const-string v2, "com.tonyodev.fetch2.extra.DOWNLOAD_ID"

    .line 24
    .line 25
    iget v3, p1, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 26
    .line 27
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    const-string v2, "com.tonyodev.fetch2.extra.NOTIFICATION_ID"

    .line 31
    .line 32
    iget v3, p1, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    const-string v2, "com.tonyodev.fetch2.extra.GROUP_ACTION"

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    const-string v2, "com.tonyodev.fetch2.extra.NOTIFICATION_GROUP_ID"

    .line 44
    .line 45
    iget v4, p1, Lcom/tonyodev/fetch2/DownloadNotification;->v:I

    .line 46
    .line 47
    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    invoke-static {p2}, Lz/e;->d(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_2

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    if-eq p2, v3, :cond_2

    .line 58
    .line 59
    const/4 v3, 0x4

    .line 60
    const/4 v2, 0x2

    .line 61
    if-eq p2, v2, :cond_2

    .line 62
    .line 63
    const/4 v4, 0x3

    .line 64
    if-eq p2, v4, :cond_1

    .line 65
    .line 66
    if-eq p2, v3, :cond_0

    .line 67
    .line 68
    const/4 v3, -0x1

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/4 v3, 0x5

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    move v3, v2

    .line 73
    :cond_2
    :goto_0
    const-string p2, "com.tonyodev.fetch2.extra.ACTION_TYPE"

    .line 74
    .line 75
    invoke-virtual {v1, p2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    iget-object p2, p0, LN4/e;->a:Landroid/content/Context;

    .line 79
    .line 80
    iget p1, p1, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 81
    .line 82
    add-int/2addr p1, v3

    .line 83
    const/high16 v2, 0xc000000

    .line 84
    .line 85
    invoke-static {p2, p1, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const-string p2, "getBroadcast(...)"

    .line 90
    .line 91
    invoke-static {p1, p2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    .line 94
    monitor-exit v0

    .line 95
    return-object p1

    .line 96
    :catchall_0
    move-exception p1

    .line 97
    monitor-exit v0

    .line 98
    throw p1
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
.end method

.method public final d(II)LI/s;
    .locals 5

    .line 1
    iget-object v0, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LN4/e;->d:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LI/s;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    new-instance v1, LI/s;

    .line 19
    .line 20
    iget-object v2, p0, LN4/e;->a:Landroid/content/Context;

    .line 21
    .line 22
    const-string v3, "context"

    .line 23
    .line 24
    invoke-static {v2, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const v3, 0x7f140089

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v4, "getString(...)"

    .line 35
    .line 36
    invoke-static {v3, v4}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v2, v3}, LI/s;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, p0, LN4/e;->d:Ljava/util/LinkedHashMap;

    .line 50
    .line 51
    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, v1, LI/s;->p:Ljava/lang/String;

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    invoke-virtual {v1, p1}, LI/s;->i(LI/u;)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-virtual {v1, v2, v2, v2}, LI/s;->g(IIZ)V

    .line 66
    .line 67
    .line 68
    iput-object p1, v1, LI/s;->e:Ljava/lang/CharSequence;

    .line 69
    .line 70
    iput-object p1, v1, LI/s;->f:Ljava/lang/CharSequence;

    .line 71
    .line 72
    iput-object p1, v1, LI/s;->g:Landroid/app/PendingIntent;

    .line 73
    .line 74
    iput-boolean v2, v1, LI/s;->q:Z

    .line 75
    .line 76
    const-wide v3, 0x73df16000L

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    iput-wide v3, v1, LI/s;->w:J

    .line 82
    .line 83
    const/4 p1, 0x2

    .line 84
    invoke-virtual {v1, p1, v2}, LI/s;->e(IZ)V

    .line 85
    .line 86
    .line 87
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, v1, LI/s;->p:Ljava/lang/String;

    .line 92
    .line 93
    const/16 p1, 0x8

    .line 94
    .line 95
    const/4 p2, 0x1

    .line 96
    invoke-virtual {v1, p1, p2}, LI/s;->e(IZ)V

    .line 97
    .line 98
    .line 99
    iget-object p1, v1, LI/s;->z:Landroid/app/Notification;

    .line 100
    .line 101
    const p2, 0x1080082

    .line 102
    .line 103
    .line 104
    iput p2, p1, Landroid/app/Notification;->icon:I

    .line 105
    .line 106
    iget-object p1, v1, LI/s;->b:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    monitor-exit v0

    .line 112
    return-object v1

    .line 113
    :goto_1
    monitor-exit v0

    .line 114
    throw p1
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
.end method

.method public final e(I)V
    .locals 9

    .line 1
    iget-object v0, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object v4, v3

    .line 32
    check-cast v4, Lcom/tonyodev/fetch2/DownloadNotification;

    .line 33
    .line 34
    iget v4, v4, Lcom/tonyodev/fetch2/DownloadNotification;->v:I

    .line 35
    .line 36
    if-ne v4, p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0, p1, p1}, LN4/e;->d(II)LI/s;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v3, p0, LN4/e;->a:Landroid/content/Context;

    .line 50
    .line 51
    invoke-static {p1, v1, v2, v3}, LN4/e;->g(ILI/s;Ljava/util/ArrayList;Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_c

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lcom/tonyodev/fetch2/DownloadNotification;

    .line 69
    .line 70
    const-string v3, "downloadNotification"

    .line 71
    .line 72
    invoke-static {v2, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v3, p0, LN4/e;->e:Ljava/util/LinkedHashSet;

    .line 76
    .line 77
    iget v4, v2, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 78
    .line 79
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_2

    .line 88
    .line 89
    iget v3, v2, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 90
    .line 91
    invoke-virtual {p0, v3, p1}, LN4/e;->d(II)LI/s;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    iget-object v5, v2, Lcom/tonyodev/fetch2/DownloadNotification;->s:Lh7/f;

    .line 96
    .line 97
    sget-object v6, Lh7/f;->y:Lh7/f;

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    const/4 v8, 0x1

    .line 101
    if-ne v5, v6, :cond_3

    .line 102
    .line 103
    move v6, v8

    .line 104
    goto :goto_2

    .line 105
    :cond_3
    move v6, v7

    .line 106
    :goto_2
    if-nez v6, :cond_9

    .line 107
    .line 108
    sget-object v6, Lh7/f;->z:Lh7/f;

    .line 109
    .line 110
    if-ne v5, v6, :cond_4

    .line 111
    .line 112
    move v6, v8

    .line 113
    goto :goto_3

    .line 114
    :cond_4
    move v6, v7

    .line 115
    :goto_3
    if-nez v6, :cond_9

    .line 116
    .line 117
    sget-object v6, Lh7/f;->v:Lh7/f;

    .line 118
    .line 119
    if-ne v5, v6, :cond_5

    .line 120
    .line 121
    move v6, v8

    .line 122
    goto :goto_4

    .line 123
    :cond_5
    move v6, v7

    .line 124
    :goto_4
    if-nez v6, :cond_9

    .line 125
    .line 126
    sget-object v6, Lh7/f;->u:Lh7/f;

    .line 127
    .line 128
    if-ne v5, v6, :cond_6

    .line 129
    .line 130
    move v6, v8

    .line 131
    goto :goto_5

    .line 132
    :cond_6
    move v6, v7

    .line 133
    :goto_5
    if-nez v6, :cond_9

    .line 134
    .line 135
    sget-object v6, Lh7/f;->x:Lh7/f;

    .line 136
    .line 137
    if-ne v5, v6, :cond_7

    .line 138
    .line 139
    move v6, v8

    .line 140
    goto :goto_6

    .line 141
    :cond_7
    move v6, v7

    .line 142
    :goto_6
    if-nez v6, :cond_9

    .line 143
    .line 144
    sget-object v6, Lh7/f;->w:Lh7/f;

    .line 145
    .line 146
    if-ne v5, v6, :cond_8

    .line 147
    .line 148
    move v7, v8

    .line 149
    :cond_8
    if-eqz v7, :cond_a

    .line 150
    .line 151
    :cond_9
    iget-object v5, p0, LN4/e;->a:Landroid/content/Context;

    .line 152
    .line 153
    invoke-virtual {p0, v4, v2, v5}, LN4/e;->h(LI/s;Lcom/tonyodev/fetch2/DownloadNotification;Landroid/content/Context;)V

    .line 154
    .line 155
    .line 156
    iget-object v5, p0, LN4/e;->b:Landroid/app/NotificationManager;

    .line 157
    .line 158
    invoke-virtual {v4}, LI/s;->b()Landroid/app/Notification;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v5, v3, v4}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 163
    .line 164
    .line 165
    :cond_a
    iget-object v3, v2, Lcom/tonyodev/fetch2/DownloadNotification;->s:Lh7/f;

    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    const/4 v4, 0x4

    .line 172
    if-eq v3, v4, :cond_b

    .line 173
    .line 174
    const/4 v4, 0x6

    .line 175
    if-eq v3, v4, :cond_b

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_b
    iget-object v3, p0, LN4/e;->e:Ljava/util/LinkedHashSet;

    .line 179
    .line 180
    iget v2, v2, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 181
    .line 182
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    .line 188
    .line 189
    goto/16 :goto_1

    .line 190
    .line 191
    :cond_c
    monitor-exit v0

    .line 192
    return-void

    .line 193
    :goto_7
    monitor-exit v0

    .line 194
    throw p1
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

.method public final f(Lcom/tonyodev/fetch2/Download;)V
    .locals 6

    .line 1
    const-string v0, "download"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0x32

    .line 16
    .line 17
    if-le v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, LN4/e;->d:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :cond_0
    :goto_0
    iget-object v1, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    move-object v2, p1

    .line 36
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 37
    .line 38
    iget v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 39
    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lcom/tonyodev/fetch2/DownloadNotification;

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    new-instance v1, Lcom/tonyodev/fetch2/DownloadNotification;

    .line 53
    .line 54
    invoke-direct {v1}, Lcom/tonyodev/fetch2/DownloadNotification;-><init>()V

    .line 55
    .line 56
    .line 57
    :cond_1
    move-object v2, p1

    .line 58
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 59
    .line 60
    iget-object v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 61
    .line 62
    const-string v3, "<set-?>"

    .line 63
    .line 64
    invoke-static {v2, v3}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iput-object v2, v1, Lcom/tonyodev/fetch2/DownloadNotification;->s:Lh7/f;

    .line 68
    .line 69
    move-object v2, p1

    .line 70
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/tonyodev/fetch2/database/DownloadInfo;->c()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    iput v2, v1, Lcom/tonyodev/fetch2/DownloadNotification;->t:I

    .line 77
    .line 78
    move-object v2, p1

    .line 79
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 80
    .line 81
    iget v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 82
    .line 83
    iput v2, v1, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 84
    .line 85
    move-object v2, p1

    .line 86
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 87
    .line 88
    iget v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->w:I

    .line 89
    .line 90
    iput v2, v1, Lcom/tonyodev/fetch2/DownloadNotification;->v:I

    .line 91
    .line 92
    move-object v2, p1

    .line 93
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 94
    .line 95
    iget-wide v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->M:J

    .line 96
    .line 97
    iput-wide v2, v1, Lcom/tonyodev/fetch2/DownloadNotification;->w:J

    .line 98
    .line 99
    move-object v2, p1

    .line 100
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 101
    .line 102
    iget-wide v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->N:J

    .line 103
    .line 104
    iput-wide v2, v1, Lcom/tonyodev/fetch2/DownloadNotification;->x:J

    .line 105
    .line 106
    move-object v2, p1

    .line 107
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 108
    .line 109
    iget-wide v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 110
    .line 111
    iput-wide v2, v1, Lcom/tonyodev/fetch2/DownloadNotification;->y:J

    .line 112
    .line 113
    move-object v2, p1

    .line 114
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 115
    .line 116
    iget-wide v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 117
    .line 118
    iput-wide v2, v1, Lcom/tonyodev/fetch2/DownloadNotification;->z:J

    .line 119
    .line 120
    move-object v2, p1

    .line 121
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 122
    .line 123
    iget-object v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->t:Ljava/lang/String;

    .line 124
    .line 125
    const-string v3, "<set-?>"

    .line 126
    .line 127
    invoke-static {v2, v3}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iput-object v2, v1, Lcom/tonyodev/fetch2/DownloadNotification;->A:Ljava/lang/String;

    .line 131
    .line 132
    move-object v2, p1

    .line 133
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 134
    .line 135
    iget-object v3, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->v:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v3}, LC3/b;->v(Ljava/lang/String;)Landroid/net/Uri;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    if-nez v3, :cond_2

    .line 146
    .line 147
    iget-object v3, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->u:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v3}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    :cond_2
    if-nez v3, :cond_3

    .line 158
    .line 159
    iget-object v3, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->u:Ljava/lang/String;

    .line 160
    .line 161
    :cond_3
    const-string v2, "<set-?>"

    .line 162
    .line 163
    invoke-static {v3, v2}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iput-object v3, v1, Lcom/tonyodev/fetch2/DownloadNotification;->B:Ljava/lang/String;

    .line 167
    .line 168
    move-object v2, p1

    .line 169
    check-cast v2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 170
    .line 171
    iget-object v2, v2, Lcom/tonyodev/fetch2/database/DownloadInfo;->v:Ljava/lang/String;

    .line 172
    .line 173
    iput-object v2, p0, LN4/e;->f:Ljava/lang/String;

    .line 174
    .line 175
    iget-object v2, p0, LN4/e;->c:Ljava/util/LinkedHashMap;

    .line 176
    .line 177
    move-object v3, p1

    .line 178
    check-cast v3, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 179
    .line 180
    iget v3, v3, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 181
    .line 182
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    iget-object v2, p0, LN4/e;->e:Ljava/util/LinkedHashSet;

    .line 190
    .line 191
    iget v3, v1, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 192
    .line 193
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_6

    .line 202
    .line 203
    iget-object v2, v1, Lcom/tonyodev/fetch2/DownloadNotification;->s:Lh7/f;

    .line 204
    .line 205
    sget-object v3, Lh7/f;->z:Lh7/f;

    .line 206
    .line 207
    const/4 v4, 0x0

    .line 208
    const/4 v5, 0x1

    .line 209
    if-ne v2, v3, :cond_4

    .line 210
    .line 211
    move v3, v5

    .line 212
    goto :goto_1

    .line 213
    :cond_4
    move v3, v4

    .line 214
    :goto_1
    if-nez v3, :cond_6

    .line 215
    .line 216
    sget-object v3, Lh7/f;->x:Lh7/f;

    .line 217
    .line 218
    if-ne v2, v3, :cond_5

    .line 219
    .line 220
    move v4, v5

    .line 221
    :cond_5
    if-nez v4, :cond_6

    .line 222
    .line 223
    iget-object v2, p0, LN4/e;->e:Ljava/util/LinkedHashSet;

    .line 224
    .line 225
    iget v1, v1, Lcom/tonyodev/fetch2/DownloadNotification;->u:I

    .line 226
    .line 227
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    :cond_6
    check-cast p1, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 235
    .line 236
    iget p1, p1, Lcom/tonyodev/fetch2/database/DownloadInfo;->w:I

    .line 237
    .line 238
    invoke-virtual {p0, p1}, LN4/e;->e(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    .line 240
    .line 241
    monitor-exit v0

    .line 242
    return-void

    .line 243
    :goto_2
    monitor-exit v0

    .line 244
    throw p1
    .line 245
    .line 246
    .line 247
.end method

.method public final h(LI/s;Lcom/tonyodev/fetch2/DownloadNotification;Landroid/content/Context;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "context"

    .line 9
    .line 10
    move-object/from16 v5, p3

    .line 11
    .line 12
    invoke-static {v5, v4}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput v3, v1, LI/s;->j:I

    .line 16
    .line 17
    iget-object v4, v2, Lcom/tonyodev/fetch2/DownloadNotification;->B:Ljava/lang/String;

    .line 18
    .line 19
    const-string v5, "..."

    .line 20
    .line 21
    const/16 v6, 0x20

    .line 22
    .line 23
    :try_start_0
    invoke-virtual {v4, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    const-string v7, "substring(...)"

    .line 28
    .line 29
    invoke-static {v6, v7}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    :catch_0
    invoke-static {v4}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iput-object v4, v1, LI/s;->e:Ljava/lang/CharSequence;

    .line 41
    .line 42
    iget-object v4, v2, Lcom/tonyodev/fetch2/DownloadNotification;->s:Lh7/f;

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/4 v5, 0x2

    .line 49
    const/4 v6, 0x1

    .line 50
    if-eq v4, v6, :cond_0

    .line 51
    .line 52
    if-eq v4, v5, :cond_0

    .line 53
    .line 54
    move v4, v3

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v4, v6

    .line 57
    :goto_0
    invoke-virtual {v1, v5, v4}, LI/s;->e(IZ)V

    .line 58
    .line 59
    .line 60
    const-string v4, "downlod_group"

    .line 61
    .line 62
    iput-object v4, v1, LI/s;->p:Ljava/lang/String;

    .line 63
    .line 64
    iput-boolean v6, v1, LI/s;->q:Z

    .line 65
    .line 66
    iget-object v4, v2, Lcom/tonyodev/fetch2/DownloadNotification;->s:Lh7/f;

    .line 67
    .line 68
    sget-object v7, Lh7/f;->y:Lh7/f;

    .line 69
    .line 70
    if-ne v4, v7, :cond_1

    .line 71
    .line 72
    move v7, v6

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move v7, v3

    .line 75
    :goto_1
    const/4 v8, 0x4

    .line 76
    const/4 v9, 0x5

    .line 77
    const-string v10, "Ulangi unduh"

    .line 78
    .line 79
    const v11, 0x7f0800b7

    .line 80
    .line 81
    .line 82
    const/16 v12, 0x8

    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    if-eqz v7, :cond_2

    .line 86
    .line 87
    iget-object v4, v1, LI/s;->z:Landroid/app/Notification;

    .line 88
    .line 89
    iput v11, v4, Landroid/app/Notification;->icon:I

    .line 90
    .line 91
    const-string v4, "Dibatalkan"

    .line 92
    .line 93
    invoke-static {v4}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    iput-object v4, v1, LI/s;->f:Ljava/lang/CharSequence;

    .line 98
    .line 99
    invoke-virtual {v1, v3, v3, v3}, LI/s;->g(IIZ)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v12, v6}, LI/s;->e(IZ)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v13}, LI/s;->i(LI/u;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v5, v3}, LI/s;->e(IZ)V

    .line 109
    .line 110
    .line 111
    new-instance v3, LI/m;

    .line 112
    .line 113
    invoke-virtual {v0, v2, v9}, LN4/e;->b(Lcom/tonyodev/fetch2/DownloadNotification;I)Landroid/app/PendingIntent;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-direct {v3, v13, v10, v4}, LI/m;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/String;Landroid/app/PendingIntent;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v3}, LI/s;->a(LI/m;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v2, v8}, LN4/e;->b(Lcom/tonyodev/fetch2/DownloadNotification;I)Landroid/app/PendingIntent;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object v1, v1, LI/s;->z:Landroid/app/Notification;

    .line 128
    .line 129
    iput-object v2, v1, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 130
    .line 131
    goto/16 :goto_7

    .line 132
    .line 133
    :cond_2
    sget-object v7, Lh7/f;->z:Lh7/f;

    .line 134
    .line 135
    if-ne v4, v7, :cond_3

    .line 136
    .line 137
    iget-object v4, v1, LI/s;->z:Landroid/app/Notification;

    .line 138
    .line 139
    iput v11, v4, Landroid/app/Notification;->icon:I

    .line 140
    .line 141
    const-string v4, "Gagal"

    .line 142
    .line 143
    invoke-static {v4}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    iput-object v4, v1, LI/s;->f:Ljava/lang/CharSequence;

    .line 148
    .line 149
    invoke-virtual {v1, v3, v3, v3}, LI/s;->g(IIZ)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v12, v6}, LI/s;->e(IZ)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v13}, LI/s;->i(LI/u;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v5, v3}, LI/s;->e(IZ)V

    .line 159
    .line 160
    .line 161
    new-instance v3, LI/m;

    .line 162
    .line 163
    invoke-virtual {v0, v2, v9}, LN4/e;->b(Lcom/tonyodev/fetch2/DownloadNotification;I)Landroid/app/PendingIntent;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-direct {v3, v13, v10, v4}, LI/m;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/String;Landroid/app/PendingIntent;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v3}, LI/s;->a(LI/m;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v2, v8}, LN4/e;->b(Lcom/tonyodev/fetch2/DownloadNotification;I)Landroid/app/PendingIntent;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    iget-object v1, v1, LI/s;->z:Landroid/app/Notification;

    .line 178
    .line 179
    iput-object v2, v1, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 180
    .line 181
    goto/16 :goto_7

    .line 182
    .line 183
    :cond_3
    sget-object v7, Lh7/f;->x:Lh7/f;

    .line 184
    .line 185
    if-ne v4, v7, :cond_4

    .line 186
    .line 187
    move v7, v6

    .line 188
    goto :goto_2

    .line 189
    :cond_4
    move v7, v3

    .line 190
    :goto_2
    const/16 v8, 0x64

    .line 191
    .line 192
    if-eqz v7, :cond_7

    .line 193
    .line 194
    sget-object v2, Lzlc/season/claritypotion/ClarityPotion;->s:Landroid/content/Context;

    .line 195
    .line 196
    invoke-static {}, Li8/C;->g()Landroid/app/Activity;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    if-eqz v2, :cond_5

    .line 201
    .line 202
    new-instance v4, Landroid/content/Intent;

    .line 203
    .line 204
    const-string v7, "com.kcstream.cing.broadcast.download.FINISHED"

    .line 205
    .line 206
    invoke-direct {v4, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 210
    .line 211
    .line 212
    :cond_5
    iget-object v2, v1, LI/s;->z:Landroid/app/Notification;

    .line 213
    .line 214
    const v4, 0x7f0800b8

    .line 215
    .line 216
    .line 217
    iput v4, v2, Landroid/app/Notification;->icon:I

    .line 218
    .line 219
    const-string v2, "Selesai"

    .line 220
    .line 221
    invoke-static {v2}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    iput-object v2, v1, LI/s;->f:Ljava/lang/CharSequence;

    .line 226
    .line 227
    const/16 v2, 0x10

    .line 228
    .line 229
    invoke-virtual {v1, v2, v6}, LI/s;->e(IZ)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, v3, v3, v3}, LI/s;->g(IIZ)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v12, v6}, LI/s;->e(IZ)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v13}, LI/s;->i(LI/u;)V

    .line 239
    .line 240
    .line 241
    new-instance v2, LI/m;

    .line 242
    .line 243
    sget-object v4, LK4/o;->a:Ljava/lang/String;

    .line 244
    .line 245
    iget-object v4, v0, LN4/e;->f:Ljava/lang/String;

    .line 246
    .line 247
    const-string v6, "downloadInfo"

    .line 248
    .line 249
    invoke-static {v4, v6}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    sget-object v6, LK4/o;->a:Ljava/lang/String;

    .line 253
    .line 254
    new-instance v7, Landroid/content/Intent;

    .line 255
    .line 256
    invoke-static {}, Li8/C;->h()Landroid/content/Context;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    const-class v10, LK4/p;

    .line 261
    .line 262
    invoke-direct {v7, v9, v10}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v7, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 266
    .line 267
    .line 268
    const-string v6, "download_path"

    .line 269
    .line 270
    invoke-virtual {v7, v6, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 271
    .line 272
    .line 273
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 274
    .line 275
    const/16 v6, 0x1f

    .line 276
    .line 277
    if-lt v4, v6, :cond_6

    .line 278
    .line 279
    invoke-static {}, Li8/C;->h()Landroid/content/Context;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    const/high16 v6, 0x2000000

    .line 284
    .line 285
    invoke-static {v4, v8, v7, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_6
    invoke-static {}, Li8/C;->h()Landroid/content/Context;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    const/high16 v6, 0x8000000

    .line 298
    .line 299
    invoke-static {v4, v8, v7, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-static {v4}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    :goto_3
    const v6, 0x7f0800c1

    .line 307
    .line 308
    .line 309
    const-string v7, "Buka"

    .line 310
    .line 311
    invoke-direct {v2, v6, v7, v4}, LI/m;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v2}, LI/s;->a(LI/m;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v5, v3}, LI/s;->e(IZ)V

    .line 318
    .line 319
    .line 320
    goto/16 :goto_7

    .line 321
    .line 322
    :cond_7
    sget-object v7, Lh7/f;->w:Lh7/f;

    .line 323
    .line 324
    if-ne v4, v7, :cond_8

    .line 325
    .line 326
    move v7, v6

    .line 327
    goto :goto_4

    .line 328
    :cond_8
    move v7, v3

    .line 329
    :goto_4
    const/4 v9, 0x3

    .line 330
    const-string v10, "Batal"

    .line 331
    .line 332
    const v14, 0x7f0800b9

    .line 333
    .line 334
    .line 335
    if-eqz v7, :cond_9

    .line 336
    .line 337
    iget-object v4, v1, LI/s;->z:Landroid/app/Notification;

    .line 338
    .line 339
    iput v14, v4, Landroid/app/Notification;->icon:I

    .line 340
    .line 341
    const-string v4, "Dijeda"

    .line 342
    .line 343
    invoke-static {v4}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    iput-object v4, v1, LI/s;->f:Ljava/lang/CharSequence;

    .line 348
    .line 349
    invoke-virtual {v1, v3, v3, v3}, LI/s;->g(IIZ)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, v12, v6}, LI/s;->e(IZ)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1, v13}, LI/s;->i(LI/u;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, v5, v3}, LI/s;->e(IZ)V

    .line 359
    .line 360
    .line 361
    new-instance v3, LI/m;

    .line 362
    .line 363
    invoke-virtual {v0, v2, v5}, LN4/e;->b(Lcom/tonyodev/fetch2/DownloadNotification;I)Landroid/app/PendingIntent;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    const v5, 0x7f0800ba

    .line 368
    .line 369
    .line 370
    const-string v6, "Lanjutkan"

    .line 371
    .line 372
    invoke-direct {v3, v5, v6, v4}, LI/m;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v3}, LI/s;->a(LI/m;)V

    .line 376
    .line 377
    .line 378
    new-instance v3, LI/m;

    .line 379
    .line 380
    invoke-virtual {v0, v2, v9}, LN4/e;->b(Lcom/tonyodev/fetch2/DownloadNotification;I)Landroid/app/PendingIntent;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-direct {v3, v11, v10, v2}, LI/m;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1, v3}, LI/s;->a(LI/m;)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_7

    .line 391
    .line 392
    :cond_9
    sget-object v7, Lh7/f;->u:Lh7/f;

    .line 393
    .line 394
    if-ne v4, v7, :cond_a

    .line 395
    .line 396
    iget-object v2, v1, LI/s;->z:Landroid/app/Notification;

    .line 397
    .line 398
    iput v14, v2, Landroid/app/Notification;->icon:I

    .line 399
    .line 400
    const-string v2, "Menunggu"

    .line 401
    .line 402
    invoke-static {v2}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    iput-object v2, v1, LI/s;->f:Ljava/lang/CharSequence;

    .line 407
    .line 408
    invoke-virtual {v1, v8, v3, v6}, LI/s;->g(IIZ)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v1, v13}, LI/s;->i(LI/u;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1, v12, v6}, LI/s;->e(IZ)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1, v5, v6}, LI/s;->e(IZ)V

    .line 418
    .line 419
    .line 420
    goto/16 :goto_7

    .line 421
    .line 422
    :cond_a
    sget-object v7, Lh7/f;->v:Lh7/f;

    .line 423
    .line 424
    if-ne v4, v7, :cond_e

    .line 425
    .line 426
    iget-wide v8, v2, Lcom/tonyodev/fetch2/DownloadNotification;->y:J

    .line 427
    .line 428
    const-wide/16 v15, -0x1

    .line 429
    .line 430
    cmp-long v7, v8, v15

    .line 431
    .line 432
    if-nez v7, :cond_b

    .line 433
    .line 434
    move v7, v6

    .line 435
    goto :goto_5

    .line 436
    :cond_b
    move v7, v3

    .line 437
    :goto_5
    cmp-long v8, v8, v15

    .line 438
    .line 439
    if-nez v8, :cond_c

    .line 440
    .line 441
    move v8, v3

    .line 442
    goto :goto_6

    .line 443
    :cond_c
    const/16 v8, 0x64

    .line 444
    .line 445
    :goto_6
    iget v9, v2, Lcom/tonyodev/fetch2/DownloadNotification;->t:I

    .line 446
    .line 447
    if-gez v9, :cond_d

    .line 448
    .line 449
    move v9, v3

    .line 450
    :cond_d
    const-wide/16 v14, 0x2710

    .line 451
    .line 452
    iput-wide v14, v1, LI/s;->w:J

    .line 453
    .line 454
    invoke-virtual {v1, v8, v9, v7}, LI/s;->g(IIZ)V

    .line 455
    .line 456
    .line 457
    iget-object v13, v1, LI/s;->z:Landroid/app/Notification;

    .line 458
    .line 459
    const v14, 0x7f0800bb

    .line 460
    .line 461
    .line 462
    iput v14, v13, Landroid/app/Notification;->icon:I

    .line 463
    .line 464
    sget-object v13, Lzlc/season/claritypotion/ClarityPotion;->s:Landroid/content/Context;

    .line 465
    .line 466
    invoke-static {}, Li8/C;->h()Landroid/content/Context;

    .line 467
    .line 468
    .line 469
    move-result-object v13

    .line 470
    iget-wide v14, v2, Lcom/tonyodev/fetch2/DownloadNotification;->w:J

    .line 471
    .line 472
    invoke-static {v13, v14, v15}, LN4/e;->c(Landroid/content/Context;J)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v13

    .line 476
    invoke-static {v13}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 477
    .line 478
    .line 479
    move-result-object v13

    .line 480
    iput-object v13, v1, LI/s;->f:Ljava/lang/CharSequence;

    .line 481
    .line 482
    new-instance v13, LI/q;

    .line 483
    .line 484
    invoke-direct {v13, v3}, LI/q;-><init>(I)V

    .line 485
    .line 486
    .line 487
    new-instance v3, Ljava/lang/StringBuilder;

    .line 488
    .line 489
    const-string v14, "T: "

    .line 490
    .line 491
    invoke-direct {v3, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    iget-wide v14, v2, Lcom/tonyodev/fetch2/DownloadNotification;->y:J

    .line 495
    .line 496
    invoke-static {v14, v15}, LD3/b;->k(J)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v14

    .line 500
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    const-string v14, " \u2022 D: "

    .line 504
    .line 505
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    iget-wide v14, v2, Lcom/tonyodev/fetch2/DownloadNotification;->z:J

    .line 509
    .line 510
    invoke-static {v14, v15}, LD3/b;->k(J)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v14

    .line 514
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    const-string v14, " \u2022 S: "

    .line 518
    .line 519
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    iget-wide v14, v2, Lcom/tonyodev/fetch2/DownloadNotification;->x:J

    .line 523
    .line 524
    invoke-static {v14, v15}, LD3/b;->k(J)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v14

    .line 528
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    const-string v14, "/s"

    .line 532
    .line 533
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    invoke-static {v3}, LI/s;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    iput-object v3, v13, LI/q;->f:Ljava/lang/Object;

    .line 545
    .line 546
    invoke-virtual {v1, v13}, LI/s;->i(LI/u;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1, v8, v9, v7}, LI/s;->g(IIZ)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v1, v12, v6}, LI/s;->e(IZ)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v1, v5, v6}, LI/s;->e(IZ)V

    .line 556
    .line 557
    .line 558
    new-instance v3, LI/m;

    .line 559
    .line 560
    invoke-virtual {v0, v2, v6}, LN4/e;->b(Lcom/tonyodev/fetch2/DownloadNotification;I)Landroid/app/PendingIntent;

    .line 561
    .line 562
    .line 563
    move-result-object v5

    .line 564
    const-string v6, "Jeda"

    .line 565
    .line 566
    const v7, 0x7f0800b9

    .line 567
    .line 568
    .line 569
    invoke-direct {v3, v7, v6, v5}, LI/m;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1, v3}, LI/s;->a(LI/m;)V

    .line 573
    .line 574
    .line 575
    new-instance v3, LI/m;

    .line 576
    .line 577
    const/4 v4, 0x3

    .line 578
    invoke-virtual {v0, v2, v4}, LN4/e;->b(Lcom/tonyodev/fetch2/DownloadNotification;I)Landroid/app/PendingIntent;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    invoke-direct {v3, v11, v10, v2}, LI/m;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v1, v3}, LI/s;->a(LI/m;)V

    .line 586
    .line 587
    .line 588
    :cond_e
    :goto_7
    return-void
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
.end method
