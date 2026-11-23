.class public abstract Lv1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt1/Q;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public c:Ljava/util/ArrayList;

.field public final d:Lv1/f;

.field public final e:LFa/d;

.field public final f:Lv1/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "296CB7C00EE0CBB3AA7808"

    .line 2
    .line 3
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

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
.end method

.method public constructor <init>(Lv1/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lv1/d;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lv1/d;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lv1/d;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    iput-object p1, p0, Lv1/d;->d:Lv1/f;

    .line 22
    .line 23
    iget-object p1, p1, Lv1/f;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lt1/G;

    .line 26
    .line 27
    iget-object p1, p1, Lt1/G;->x:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LFa/d;

    .line 30
    .line 31
    iput-object p1, p0, Lv1/d;->e:LFa/d;

    .line 32
    .line 33
    new-instance p1, Lv1/g;

    .line 34
    .line 35
    const/16 v0, 0x1a

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lv1/g;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lv1/d;->f:Lv1/g;

    .line 41
    .line 42
    return-void
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

.method public static b(Lv1/c;)Lt1/F;
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0xf4240

    .line 6
    .line 7
    .line 8
    div-long/2addr v0, v2

    .line 9
    invoke-interface {p0}, Lv1/c;->run()Lt1/F;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    div-long/2addr v4, v2

    .line 18
    sub-long/2addr v4, v0

    .line 19
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lt1/F;->d:Ljava/lang/Long;

    .line 24
    .line 25
    return-object p0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static f(Lt1/r0;I)V
    .locals 3

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lt1/r0;->b:I

    .line 4
    .line 5
    and-int v1, v0, p1

    .line 6
    .line 7
    if-ne v1, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    add-int/2addr v0, p1

    .line 11
    iput v0, p0, Lt1/r0;->b:I

    .line 12
    .line 13
    const-string p1, "2663BDC50FE185B389370E0497427735D7CCEEE246D0341848A2E8746FFD7C0C5134AC"

    .line 14
    .line 15
    invoke-static {p1}, Li8/C;->c(Ljava/lang/String;)[B

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Li8/C;->a([B)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget v0, p0, Lt1/r0;->b:I

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x1

    .line 30
    new-array v1, v1, [Ljava/lang/Object;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    aput-object v0, v1, v2

    .line 34
    .line 35
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    const-string p1, "236EB5C70D"

    .line 39
    .line 40
    invoke-static {p1}, Li8/C;->c(Ljava/lang/String;)[B

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Li8/C;->a([B)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    new-instance p1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v0, "255A91EA4AA885"

    .line 53
    .line 54
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget v0, p0, Lt1/r0;->b:I

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, p1}, Lt1/r0;->a(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_0
    return-void
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
.end method

.method public static g(Ljava/lang/Integer;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x2

    .line 8
    if-le p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
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


# virtual methods
.method public final c(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lv1/d;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, p0, Lv1/d;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    add-int/2addr v4, v2

    .line 16
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lv1/d;->c:Ljava/util/ArrayList;

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    iput-object v0, p0, Lv1/d;->c:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p0, p1, p2}, Lv1/d;->h(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    iget-object v2, p0, Lv1/d;->c:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-interface {v2, v0}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    iput-object v0, p0, Lv1/d;->c:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {p0, p1, p2}, Lv1/d;->h(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
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
.end method

.method public final d(Ljava/lang/String;Ljava/security/cert/X509Certificate;)V
    .locals 2

    .line 1
    const-string v0, "1267B8CC0BF6C0"

    .line 2
    .line 3
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "0467B6DC0D"

    .line 12
    .line 13
    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/g;->s(Ljava/lang/String;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "296CB7C00EE0CBB3AA7808"

    .line 20
    .line 21
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    const-string v0, "236AB1CA01CBC4AA832D4F"

    .line 29
    .line 30
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    const-string v0, "4C22BDC70CEA9FE7"

    .line 38
    .line 39
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v0, p0, Lv1/d;->a:Ljava/util/ArrayList;

    .line 50
    .line 51
    new-instance v1, Lt1/p;

    .line 52
    .line 53
    invoke-direct {v1, p1, p2}, Lt1/p;-><init>(Ljava/lang/String;Ljava/security/cert/X509Certificate;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    return-void
    .line 60
.end method

.method public final e(Ljava/lang/String;Lt1/F;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lt1/F;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lt1/r;->s:Lt1/r;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lt1/r;->t:Lt1/r;

    .line 11
    .line 12
    :goto_0
    iget-object p2, p2, Lt1/F;->d:Ljava/lang/Long;

    .line 13
    .line 14
    iget-object v1, p0, Lv1/d;->e:LFa/d;

    .line 15
    .line 16
    monitor-enter v1

    .line 17
    :try_start_0
    iget-object v2, v1, LFa/d;->a:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lt1/s;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    iput-object v0, v2, Lt1/s;->a:Lt1/r;

    .line 30
    .line 31
    iput-object p2, v2, Lt1/s;->b:Ljava/lang/Long;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iput-object v0, v2, Lt1/s;->a:Lt1/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    :goto_1
    monitor-exit v1

    .line 37
    return-void

    .line 38
    :cond_2
    :try_start_1
    new-instance v2, Lt1/s;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, v2, Lt1/s;->a:Lt1/r;

    .line 44
    .line 45
    iput-object p2, v2, Lt1/s;->b:Ljava/lang/Long;

    .line 46
    .line 47
    iget-object p2, v1, LFa/d;->a:Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-virtual {p2, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit v1

    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method public final h(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 10

    .line 1
    const-string v0, "0263A7C009"

    .line 2
    .line 3
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Li8/C;->a([B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v0, v1}, Landroidx/datastore/preferences/protobuf/g;->s(Ljava/lang/String;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p2}, Lv1/d;->i(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/4 v0, 0x3

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    iget-object v1, p0, Lv1/d;->f:Lv1/g;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ne p1, v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, p2}, Lv1/d;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iget-object p1, p0, Lv1/d;->a:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v1, p0, Lv1/d;->b:Ljava/util/ArrayList;

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    return-void

    .line 62
    :cond_4
    :goto_1
    new-instance v6, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 72
    .line 73
    .line 74
    new-instance v7, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lv1/d;->d:Lv1/f;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v2, Lt1/v;

    .line 92
    .line 93
    iget-object v3, v0, Lv1/f;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, Lt1/G;

    .line 96
    .line 97
    iget-object v4, v3, Lt1/G;->x:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v8, v4

    .line 100
    check-cast v8, LFa/d;

    .line 101
    .line 102
    iget-object v4, v0, Lv1/f;->d:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v4, Lv1/f;

    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object v4, v0, Lv1/f;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v4, Lcom/google/android/gms/internal/measurement/S;

    .line 112
    .line 113
    iget-boolean v9, v0, Lv1/f;->a:Z

    .line 114
    .line 115
    move-object v5, p2

    .line 116
    invoke-direct/range {v2 .. v9}, Lt1/v;-><init>(Lt1/G;Lcom/google/android/gms/internal/measurement/S;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;LFa/d;Z)V

    .line 117
    .line 118
    .line 119
    iget-object p2, v0, Lv1/f;->e:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p2, Lt1/b;

    .line 122
    .line 123
    iget-object p2, p2, Lt1/b;->c:Ljava/util/LinkedList;

    .line 124
    .line 125
    invoke-virtual {p2, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 132
    .line 133
    .line 134
    return-void
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

.method public final i(Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v4, p0, Lv1/d;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v5, p0, Lv1/d;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    iget-object v8, p0, Lv1/d;->d:Lv1/f;

    .line 20
    .line 21
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lt1/v;

    .line 25
    .line 26
    iget-object v1, v8, Lv1/f;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lt1/G;

    .line 29
    .line 30
    iget-object v2, v1, Lt1/G;->x:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v6, v2

    .line 33
    check-cast v6, LFa/d;

    .line 34
    .line 35
    iget-object v2, v8, Lv1/f;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Lv1/f;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v2, v8, Lv1/f;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Lcom/google/android/gms/internal/measurement/S;

    .line 45
    .line 46
    iget-boolean v7, v8, Lv1/f;->a:Z

    .line 47
    .line 48
    move-object v3, p1

    .line 49
    invoke-direct/range {v0 .. v7}, Lt1/v;-><init>(Lt1/G;Lcom/google/android/gms/internal/measurement/S;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;LFa/d;Z)V

    .line 50
    .line 51
    .line 52
    sget p1, Lt1/b;->d:I

    .line 53
    .line 54
    iget-object p1, v8, Lv1/f;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Lt1/b;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Lt1/b;->a(Lt1/h0;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 65
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
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "1267B8CC0BF6C0"

    .line 2
    .line 3
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "0467B6DC0D"

    .line 12
    .line 13
    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/g;->s(Ljava/lang/String;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "296CB7C00EE0CBB3AA7808"

    .line 20
    .line 21
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    const-string v0, "2667B5DD1FF7C0E792721C1C92437374C0C1ABE358F833105FB8E5"

    .line 29
    .line 30
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    const-string v0, "4C22BDC70CEA9FE7"

    .line 38
    .line 39
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Lv1/d;->b:Ljava/util/ArrayList;

    .line 47
    .line 48
    new-instance v1, Lt1/e0;

    .line 49
    .line 50
    invoke-direct {v1, p1, p2}, Lt1/e0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method public final k(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const-string v0, "1267B8CC0BF6C0"

    .line 2
    .line 3
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "0467B6DC0D"

    .line 12
    .line 13
    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/g;->s(Ljava/lang/String;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "296CB7C00EE0CBB3AA7808"

    .line 20
    .line 21
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    const-string v0, "2667B5DD1FF7C0E792721C1C92437374C0C1ABE358F833105FB8E5"

    .line 29
    .line 30
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    const-string v0, "4C22BDC70CEA9FE7"

    .line 38
    .line 39
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v0, p0, Lv1/d;->b:Ljava/util/ArrayList;

    .line 50
    .line 51
    new-instance v1, Lt1/A;

    .line 52
    .line 53
    invoke-direct {v1, p1, p2}, Lt1/A;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    return-void
    .line 60
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "1267B8CC0BF6C0"

    .line 2
    .line 3
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "0467B6DC0D"

    .line 12
    .line 13
    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/g;->s(Ljava/lang/String;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "296CB7C00EE0CBB3AA7808"

    .line 20
    .line 21
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    const-string v0, "236AB1CA01CBC4AA832D4F"

    .line 29
    .line 30
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    const-string v0, "4C22BDC70CEA9FE7"

    .line 38
    .line 39
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Lv1/d;->a:Ljava/util/ArrayList;

    .line 47
    .line 48
    new-instance v1, Lt1/e0;

    .line 49
    .line 50
    invoke-direct {v1, p1, p2}, Lt1/e0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
.end method

.method public final m(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const-string v0, "1267B8CC0BF6C0"

    .line 2
    .line 3
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "0467B6DC0D"

    .line 12
    .line 13
    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/g;->s(Ljava/lang/String;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "296CB7C00EE0CBB3AA7808"

    .line 20
    .line 21
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    const-string v0, "2667B5DD1FF7C0E792721C1C92437374C0C1ABE358F833105FB8E5"

    .line 29
    .line 30
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    const-string v0, "4C22BDC70CEA9FE7"

    .line 38
    .line 39
    invoke-static {v0}, Li8/C;->c(Ljava/lang/String;)[B

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Li8/C;->a([B)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v0, p0, Lv1/d;->b:Ljava/util/ArrayList;

    .line 50
    .line 51
    new-instance v1, Lt1/D;

    .line 52
    .line 53
    invoke-direct {v1, p1, p2}, Lt1/D;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    return-void
    .line 60
.end method
