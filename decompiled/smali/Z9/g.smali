.class public final LZ9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final J:LL9/e;

.field public static final K:Ljava/lang/String;

.field public static final L:Ljava/lang/String;

.field public static final M:Ljava/lang/String;

.field public static final N:Ljava/lang/String;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:J

.field public final H:Laa/b;

.field public final I:LZ9/f;

.field public final s:Ljava/io/File;

.field public final t:Ljava/io/File;

.field public final u:Ljava/io/File;

.field public final v:Ljava/io/File;

.field public w:J

.field public x:Lma/q;

.field public final y:Ljava/util/LinkedHashMap;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LL9/e;

    .line 2
    .line 3
    const-string v1, "[a-z0-9_-]{1,120}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LL9/e;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LZ9/g;->J:LL9/e;

    .line 9
    .line 10
    const-string v0, "CLEAN"

    .line 11
    .line 12
    sput-object v0, LZ9/g;->K:Ljava/lang/String;

    .line 13
    .line 14
    const-string v0, "DIRTY"

    .line 15
    .line 16
    sput-object v0, LZ9/g;->L:Ljava/lang/String;

    .line 17
    .line 18
    const-string v0, "REMOVE"

    .line 19
    .line 20
    sput-object v0, LZ9/g;->M:Ljava/lang/String;

    .line 21
    .line 22
    const-string v0, "READ"

    .line 23
    .line 24
    sput-object v0, LZ9/g;->N:Ljava/lang/String;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Laa/c;)V
    .locals 4

    .line 1
    const-string v0, "taskRunner"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LZ9/g;->s:Ljava/io/File;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/high16 v3, 0x3f400000    # 0.75f

    .line 16
    .line 17
    invoke-direct {v0, v2, v3, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {p2}, Laa/c;->e()Laa/b;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, LZ9/g;->H:Laa/b;

    .line 27
    .line 28
    sget-object p2, LY9/c;->g:Ljava/lang/String;

    .line 29
    .line 30
    const-string v0, " Cache"

    .line 31
    .line 32
    invoke-static {v0, p2}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    new-instance v0, LZ9/f;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v0, p0, p2, v1}, LZ9/f;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, LZ9/g;->I:LZ9/f;

    .line 43
    .line 44
    new-instance p2, Ljava/io/File;

    .line 45
    .line 46
    const-string v0, "journal"

    .line 47
    .line 48
    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, LZ9/g;->t:Ljava/io/File;

    .line 52
    .line 53
    new-instance p2, Ljava/io/File;

    .line 54
    .line 55
    const-string v0, "journal.tmp"

    .line 56
    .line 57
    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, LZ9/g;->u:Ljava/io/File;

    .line 61
    .line 62
    new-instance p2, Ljava/io/File;

    .line 63
    .line 64
    const-string v0, "journal.bkp"

    .line 65
    .line 66
    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object p2, p0, LZ9/g;->v:Ljava/io/File;

    .line 70
    .line 71
    return-void
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

.method public static B(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, LZ9/g;->J:LL9/e;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LL9/e;->a(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "keys must match regex [a-z0-9_-]{1,120}: \""

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 p0, 0x22

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
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


# virtual methods
.method public final A()V
    .locals 4

    .line 1
    :goto_0
    iget-wide v0, p0, LZ9/g;->w:J

    .line 2
    .line 3
    const-wide/32 v2, 0xa00000

    .line 4
    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-lez v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, LZ9/d;

    .line 31
    .line 32
    iget-boolean v2, v1, LZ9/d;->f:Z

    .line 33
    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0, v1}, LZ9/g;->t(LZ9/d;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-void

    .line 41
    :cond_2
    const/4 v0, 0x0

    .line 42
    iput-boolean v0, p0, LZ9/g;->E:Z

    .line 43
    .line 44
    return-void
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
.end method

.method public final declared-synchronized a()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LZ9/g;->D:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    const-string v0, "cache is closed"

    .line 9
    .line 10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v1

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final declared-synchronized b(LK0/g;Z)V
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "editor"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, LK0/g;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LZ9/d;

    .line 10
    .line 11
    iget-object v1, v0, LZ9/d;->g:LK0/g;

    .line 12
    .line 13
    invoke-static {v1, p1}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_e

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    iget-boolean v3, v0, LZ9/d;->e:Z

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    move v3, v2

    .line 28
    :goto_0
    if-ge v3, v1, :cond_2

    .line 29
    .line 30
    add-int/lit8 v4, v3, 0x1

    .line 31
    .line 32
    iget-object v5, p1, LK0/g;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v5, [Z

    .line 35
    .line 36
    invoke-static {v5}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    aget-boolean v5, v5, v3

    .line 40
    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    iget-object v5, v0, LZ9/d;->d:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Ljava/io/File;

    .line 50
    .line 51
    const-string v5, "file"

    .line 52
    .line 53
    invoke-static {v3, v5}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_0

    .line 61
    .line 62
    invoke-virtual {p1}, LK0/g;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    monitor-exit p0

    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :cond_0
    move v3, v4

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    :try_start_1
    invoke-virtual {p1}, LK0/g;->c()V

    .line 73
    .line 74
    .line 75
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string p2, "Newly created entry didn\'t create value for index "

    .line 78
    .line 79
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0, p2}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_2
    move p1, v2

    .line 92
    :goto_1
    if-ge p1, v1, :cond_6

    .line 93
    .line 94
    add-int/lit8 v3, p1, 0x1

    .line 95
    .line 96
    iget-object v4, v0, LZ9/d;->d:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    check-cast v4, Ljava/io/File;

    .line 103
    .line 104
    if-eqz p2, :cond_3

    .line 105
    .line 106
    iget-boolean v5, v0, LZ9/d;->f:Z

    .line 107
    .line 108
    if-nez v5, :cond_3

    .line 109
    .line 110
    sget-object v5, Lfa/a;->a:Lfa/a;

    .line 111
    .line 112
    invoke-virtual {v5, v4}, Lfa/a;->c(Ljava/io/File;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_5

    .line 117
    .line 118
    iget-object v6, v0, LZ9/d;->c:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    check-cast v6, Ljava/io/File;

    .line 125
    .line 126
    invoke-virtual {v5, v4, v6}, Lfa/a;->d(Ljava/io/File;Ljava/io/File;)V

    .line 127
    .line 128
    .line 129
    iget-object v4, v0, LZ9/d;->b:[J

    .line 130
    .line 131
    aget-wide v7, v4, p1

    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 134
    .line 135
    .line 136
    move-result-wide v4

    .line 137
    iget-object v6, v0, LZ9/d;->b:[J

    .line 138
    .line 139
    aput-wide v4, v6, p1

    .line 140
    .line 141
    iget-wide v9, p0, LZ9/g;->w:J

    .line 142
    .line 143
    sub-long/2addr v9, v7

    .line 144
    add-long/2addr v9, v4

    .line 145
    iput-wide v9, p0, LZ9/g;->w:J

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_3
    const-string p1, "file"

    .line 149
    .line 150
    invoke-static {v4, p1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-nez p1, :cond_5

    .line 158
    .line 159
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-nez p1, :cond_4

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 167
    .line 168
    const-string p2, "failed to delete "

    .line 169
    .line 170
    invoke-static {v4, p2}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p1

    .line 178
    :cond_5
    :goto_2
    move p1, v3

    .line 179
    goto :goto_1

    .line 180
    :cond_6
    const/4 p1, 0x0

    .line 181
    iput-object p1, v0, LZ9/d;->g:LK0/g;

    .line 182
    .line 183
    iget-boolean p1, v0, LZ9/d;->f:Z

    .line 184
    .line 185
    if-eqz p1, :cond_7

    .line 186
    .line 187
    invoke-virtual {p0, v0}, LZ9/g;->t(LZ9/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 188
    .line 189
    .line 190
    monitor-exit p0

    .line 191
    return-void

    .line 192
    :cond_7
    :try_start_2
    iget p1, p0, LZ9/g;->z:I

    .line 193
    .line 194
    const/4 v1, 0x1

    .line 195
    add-int/2addr p1, v1

    .line 196
    iput p1, p0, LZ9/g;->z:I

    .line 197
    .line 198
    iget-object p1, p0, LZ9/g;->x:Lma/q;

    .line 199
    .line 200
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-boolean v3, v0, LZ9/d;->e:Z

    .line 204
    .line 205
    const/16 v4, 0x20

    .line 206
    .line 207
    const/16 v5, 0xa

    .line 208
    .line 209
    if-nez v3, :cond_9

    .line 210
    .line 211
    if-eqz p2, :cond_8

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_8
    iget-object p2, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 215
    .line 216
    iget-object v1, v0, LZ9/d;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {p2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    sget-object p2, LZ9/g;->M:Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {p1, p2}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, v4}, Lma/q;->z(I)Lma/g;

    .line 227
    .line 228
    .line 229
    iget-object p2, v0, LZ9/d;->a:Ljava/lang/String;

    .line 230
    .line 231
    invoke-virtual {p1, p2}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, v5}, Lma/q;->z(I)Lma/g;

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_9
    :goto_3
    iput-boolean v1, v0, LZ9/d;->e:Z

    .line 239
    .line 240
    sget-object v1, LZ9/g;->K:Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {p1, v1}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v4}, Lma/q;->z(I)Lma/g;

    .line 246
    .line 247
    .line 248
    iget-object v1, v0, LZ9/d;->a:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {p1, v1}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 251
    .line 252
    .line 253
    iget-object v1, v0, LZ9/d;->b:[J

    .line 254
    .line 255
    array-length v3, v1

    .line 256
    :goto_4
    if-ge v2, v3, :cond_a

    .line 257
    .line 258
    aget-wide v6, v1, v2

    .line 259
    .line 260
    add-int/lit8 v2, v2, 0x1

    .line 261
    .line 262
    invoke-virtual {p1, v4}, Lma/q;->z(I)Lma/g;

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, v6, v7}, Lma/q;->R(J)Lma/g;

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_a
    invoke-virtual {p1, v5}, Lma/q;->z(I)Lma/g;

    .line 270
    .line 271
    .line 272
    if-eqz p2, :cond_b

    .line 273
    .line 274
    iget-wide v1, p0, LZ9/g;->G:J

    .line 275
    .line 276
    const-wide/16 v3, 0x1

    .line 277
    .line 278
    add-long/2addr v3, v1

    .line 279
    iput-wide v3, p0, LZ9/g;->G:J

    .line 280
    .line 281
    iput-wide v1, v0, LZ9/d;->i:J

    .line 282
    .line 283
    :cond_b
    :goto_5
    invoke-virtual {p1}, Lma/q;->flush()V

    .line 284
    .line 285
    .line 286
    iget-wide p1, p0, LZ9/g;->w:J

    .line 287
    .line 288
    const-wide/32 v0, 0xa00000

    .line 289
    .line 290
    .line 291
    cmp-long p1, p1, v0

    .line 292
    .line 293
    if-gtz p1, :cond_c

    .line 294
    .line 295
    invoke-virtual {p0}, LZ9/g;->i()Z

    .line 296
    .line 297
    .line 298
    move-result p1

    .line 299
    if-eqz p1, :cond_d

    .line 300
    .line 301
    :cond_c
    iget-object p1, p0, LZ9/g;->H:Laa/b;

    .line 302
    .line 303
    iget-object p2, p0, LZ9/g;->I:LZ9/f;

    .line 304
    .line 305
    invoke-static {p1, p2}, Laa/b;->d(Laa/b;Laa/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 306
    .line 307
    .line 308
    :cond_d
    monitor-exit p0

    .line 309
    return-void

    .line 310
    :cond_e
    :try_start_3
    const-string p1, "Check failed."

    .line 311
    .line 312
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 313
    .line 314
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    throw p2

    .line 318
    :goto_6
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 319
    throw p1
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
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
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
.end method

.method public final declared-synchronized c(Ljava/lang/String;J)LK0/g;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "key"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LZ9/g;->h()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LZ9/g;->a()V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, LZ9/g;->B(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, LZ9/d;

    .line 23
    .line 24
    const-wide/16 v1, -0x1

    .line 25
    .line 26
    cmp-long v1, p2, v1

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-wide v3, v0, LZ9/d;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    cmp-long p2, v3, p2

    .line 36
    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    :cond_0
    monitor-exit p0

    .line 40
    return-object v2

    .line 41
    :cond_1
    if-nez v0, :cond_2

    .line 42
    .line 43
    move-object p2, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :try_start_1
    iget-object p2, v0, LZ9/d;->g:LK0/g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    :goto_0
    if-eqz p2, :cond_3

    .line 48
    .line 49
    monitor-exit p0

    .line 50
    return-object v2

    .line 51
    :cond_3
    if-eqz v0, :cond_4

    .line 52
    .line 53
    :try_start_2
    iget p2, v0, LZ9/d;->h:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    if-eqz p2, :cond_4

    .line 56
    .line 57
    monitor-exit p0

    .line 58
    return-object v2

    .line 59
    :cond_4
    :try_start_3
    iget-boolean p2, p0, LZ9/g;->E:Z

    .line 60
    .line 61
    if-nez p2, :cond_8

    .line 62
    .line 63
    iget-boolean p2, p0, LZ9/g;->F:Z

    .line 64
    .line 65
    if-eqz p2, :cond_5

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_5
    iget-object p2, p0, LZ9/g;->x:Lma/q;

    .line 69
    .line 70
    invoke-static {p2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget-object p3, LZ9/g;->L:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p2, p3}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 76
    .line 77
    .line 78
    const/16 p3, 0x20

    .line 79
    .line 80
    invoke-virtual {p2, p3}, Lma/q;->z(I)Lma/g;

    .line 81
    .line 82
    .line 83
    invoke-interface {p2, p1}, Lma/g;->Q(Ljava/lang/String;)Lma/g;

    .line 84
    .line 85
    .line 86
    const/16 p3, 0xa

    .line 87
    .line 88
    invoke-interface {p2, p3}, Lma/g;->z(I)Lma/g;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lma/q;->flush()V

    .line 92
    .line 93
    .line 94
    iget-boolean p2, p0, LZ9/g;->A:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 95
    .line 96
    if-eqz p2, :cond_6

    .line 97
    .line 98
    monitor-exit p0

    .line 99
    return-object v2

    .line 100
    :cond_6
    if-nez v0, :cond_7

    .line 101
    .line 102
    :try_start_4
    new-instance v0, LZ9/d;

    .line 103
    .line 104
    invoke-direct {v0, p0, p1}, LZ9/d;-><init>(LZ9/g;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object p2, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 108
    .line 109
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    goto :goto_3

    .line 115
    :cond_7
    :goto_1
    new-instance p1, LK0/g;

    .line 116
    .line 117
    invoke-direct {p1, p0, v0}, LK0/g;-><init>(LZ9/g;LZ9/d;)V

    .line 118
    .line 119
    .line 120
    iput-object p1, v0, LZ9/d;->g:LK0/g;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return-object p1

    .line 124
    :cond_8
    :goto_2
    :try_start_5
    iget-object p1, p0, LZ9/g;->H:Laa/b;

    .line 125
    .line 126
    iget-object p2, p0, LZ9/g;->I:LZ9/f;

    .line 127
    .line 128
    invoke-static {p1, p2}, Laa/b;->d(Laa/b;Laa/a;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 129
    .line 130
    .line 131
    monitor-exit p0

    .line 132
    return-object v2

    .line 133
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 134
    throw p1
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

.method public final declared-synchronized close()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LZ9/g;->C:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-boolean v0, p0, LZ9/g;->D:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "lruEntries.values"

    .line 19
    .line 20
    invoke-static {v0, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    new-array v3, v2, [LZ9/d;

    .line 25
    .line 26
    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    check-cast v0, [LZ9/d;

    .line 33
    .line 34
    array-length v3, v0

    .line 35
    :cond_1
    :goto_0
    if-ge v2, v3, :cond_2

    .line 36
    .line 37
    aget-object v4, v0, v2

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    iget-object v4, v4, LZ9/d;->g:LK0/g;

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4}, LK0/g;->e()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-virtual {p0}, LZ9/g;->A()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, LZ9/g;->x:Lma/q;

    .line 55
    .line 56
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lma/q;->close()V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, LZ9/g;->x:Lma/q;

    .line 64
    .line 65
    iput-boolean v1, p0, LZ9/g;->D:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :cond_3
    :try_start_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 70
    .line 71
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_4
    :goto_1
    iput-boolean v1, p0, LZ9/g;->D:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    monitor-exit p0

    .line 80
    return-void

    .line 81
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    throw v0
    .line 83
    .line 84
    .line 85
    .line 86
.end method

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LZ9/g;->C:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0}, LZ9/g;->a()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LZ9/g;->A()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LZ9/g;->x:Lma/q;

    .line 15
    .line 16
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lma/q;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    throw v0
.end method

.method public final declared-synchronized g(Ljava/lang/String;)LZ9/e;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "key"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LZ9/g;->h()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LZ9/g;->a()V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, LZ9/g;->B(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, LZ9/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-object v1

    .line 29
    :cond_0
    :try_start_1
    invoke-virtual {v0}, LZ9/d;->a()LZ9/e;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-object v1

    .line 37
    :cond_1
    :try_start_2
    iget v1, p0, LZ9/g;->z:I

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    iput v1, p0, LZ9/g;->z:I

    .line 42
    .line 43
    iget-object v1, p0, LZ9/g;->x:Lma/q;

    .line 44
    .line 45
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v2, LZ9/g;->N:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 51
    .line 52
    .line 53
    const/16 v2, 0x20

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Lma/q;->z(I)Lma/g;

    .line 56
    .line 57
    .line 58
    invoke-interface {v1, p1}, Lma/g;->Q(Ljava/lang/String;)Lma/g;

    .line 59
    .line 60
    .line 61
    const/16 p1, 0xa

    .line 62
    .line 63
    invoke-interface {v1, p1}, Lma/g;->z(I)Lma/g;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, LZ9/g;->i()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object p1, p0, LZ9/g;->H:Laa/b;

    .line 73
    .line 74
    iget-object v1, p0, LZ9/g;->I:LZ9/f;

    .line 75
    .line 76
    invoke-static {p1, v1}, Laa/b;->d(Laa/b;Laa/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    :goto_0
    monitor-exit p0

    .line 83
    return-object v0

    .line 84
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 85
    throw p1
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final declared-synchronized h()V
    .locals 6

    .line 1
    const-string v0, "DiskLruCache "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    sget-object v1, LY9/c;->a:[B

    .line 5
    .line 6
    iget-boolean v1, p0, LZ9/g;->C:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    sget-object v1, Lfa/a;->a:Lfa/a;

    .line 13
    .line 14
    iget-object v2, p0, LZ9/g;->v:Ljava/io/File;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lfa/a;->c(Ljava/io/File;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v2, p0, LZ9/g;->t:Ljava/io/File;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lfa/a;->c(Ljava/io/File;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v2, p0, LZ9/g;->v:Ljava/io/File;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lfa/a;->a(Ljava/io/File;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_1
    iget-object v2, p0, LZ9/g;->v:Ljava/io/File;

    .line 40
    .line 41
    iget-object v3, p0, LZ9/g;->t:Ljava/io/File;

    .line 42
    .line 43
    invoke-virtual {v1, v2, v3}, Lfa/a;->d(Ljava/io/File;Ljava/io/File;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    iget-object v2, p0, LZ9/g;->v:Ljava/io/File;

    .line 47
    .line 48
    const-string v3, "file"

    .line 49
    .line 50
    invoke-static {v2, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const-string v3, "file"

    .line 57
    .line 58
    invoke-static {v2, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    :try_start_2
    invoke-static {v2}, Lga/d;->C(Ljava/io/File;)Lma/a;

    .line 62
    .line 63
    .line 64
    move-result-object v3
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    goto :goto_1

    .line 66
    :catch_0
    :try_start_3
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 71
    .line 72
    .line 73
    invoke-static {v2}, Lga/d;->C(Ljava/io/File;)Lma/a;

    .line 74
    .line 75
    .line 76
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 77
    :goto_1
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x1

    .line 79
    :try_start_4
    invoke-virtual {v1, v2}, Lfa/a;->a(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 80
    .line 81
    .line 82
    :try_start_5
    invoke-virtual {v3}, Lma/a;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 83
    .line 84
    .line 85
    move v1, v5

    .line 86
    goto :goto_2

    .line 87
    :catchall_1
    move-exception v0

    .line 88
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 89
    :catchall_2
    move-exception v1

    .line 90
    :try_start_7
    invoke-static {v3, v0}, Lcom/bumptech/glide/c;->c(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    throw v1

    .line 94
    :catch_1
    invoke-virtual {v3}, Lma/a;->close()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Lfa/a;->a(Ljava/io/File;)V

    .line 98
    .line 99
    .line 100
    move v1, v4

    .line 101
    :goto_2
    iput-boolean v1, p0, LZ9/g;->B:Z

    .line 102
    .line 103
    iget-object v1, p0, LZ9/g;->t:Ljava/io/File;

    .line 104
    .line 105
    const-string v2, "file"

    .line 106
    .line 107
    invoke-static {v1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 111
    .line 112
    .line 113
    move-result v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 114
    if-eqz v1, :cond_3

    .line 115
    .line 116
    :try_start_8
    invoke-virtual {p0}, LZ9/g;->n()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, LZ9/g;->l()V

    .line 120
    .line 121
    .line 122
    iput-boolean v5, p0, LZ9/g;->C:Z
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 123
    .line 124
    monitor-exit p0

    .line 125
    return-void

    .line 126
    :catch_2
    move-exception v1

    .line 127
    :try_start_9
    sget-object v2, Lga/n;->a:Lga/n;

    .line 128
    .line 129
    sget-object v2, Lga/n;->a:Lga/n;

    .line 130
    .line 131
    new-instance v3, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, LZ9/g;->s:Ljava/io/File;

    .line 137
    .line 138
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v0, " is corrupt: "

    .line 142
    .line 143
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v0, ", removing"

    .line 154
    .line 155
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    const/4 v2, 0x5

    .line 166
    invoke-static {v0, v2, v1}, Lga/n;->i(Ljava/lang/String;ILjava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 167
    .line 168
    .line 169
    :try_start_a
    invoke-virtual {p0}, LZ9/g;->close()V

    .line 170
    .line 171
    .line 172
    iget-object v0, p0, LZ9/g;->s:Ljava/io/File;

    .line 173
    .line 174
    sget-object v1, Lfa/a;->a:Lfa/a;

    .line 175
    .line 176
    invoke-virtual {v1, v0}, Lfa/a;->b(Ljava/io/File;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 177
    .line 178
    .line 179
    :try_start_b
    iput-boolean v4, p0, LZ9/g;->D:Z

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :catchall_3
    move-exception v0

    .line 183
    iput-boolean v4, p0, LZ9/g;->D:Z

    .line 184
    .line 185
    throw v0

    .line 186
    :cond_3
    :goto_3
    invoke-virtual {p0}, LZ9/g;->p()V

    .line 187
    .line 188
    .line 189
    iput-boolean v5, p0, LZ9/g;->C:Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 190
    .line 191
    monitor-exit p0

    .line 192
    return-void

    .line 193
    :goto_4
    :try_start_c
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 194
    throw v0
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

.method public final i()Z
    .locals 2

    .line 1
    iget v0, p0, LZ9/g;->z:I

    .line 2
    .line 3
    const/16 v1, 0x7d0

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final j()Lma/q;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LZ9/g;->t:Ljava/io/File;

    .line 3
    .line 4
    const-string v2, "file"

    .line 5
    .line 6
    invoke-static {v1, v2}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    :try_start_0
    sget-object v2, Lma/o;->a:Ljava/util/logging/Logger;

    .line 10
    .line 11
    new-instance v2, Ljava/io/FileOutputStream;

    .line 12
    .line 13
    invoke-direct {v2, v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 14
    .line 15
    .line 16
    new-instance v3, Lma/a;

    .line 17
    .line 18
    new-instance v4, Lma/y;

    .line 19
    .line 20
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-direct {v3, v2, v0, v4}, Lma/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 32
    .line 33
    .line 34
    sget-object v2, Lma/o;->a:Ljava/util/logging/Logger;

    .line 35
    .line 36
    new-instance v2, Ljava/io/FileOutputStream;

    .line 37
    .line 38
    invoke-direct {v2, v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 39
    .line 40
    .line 41
    new-instance v3, Lma/a;

    .line 42
    .line 43
    new-instance v1, Lma/y;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-direct {v3, v2, v0, v1}, Lma/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    new-instance v0, LZ9/h;

    .line 52
    .line 53
    new-instance v1, LA0/m;

    .line 54
    .line 55
    const/16 v2, 0x19

    .line 56
    .line 57
    invoke-direct {v1, p0, v2}, LA0/m;-><init>(Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, v3, v1}, LZ9/h;-><init>(Lma/a;Lu8/b;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lga/d;->c(Lma/v;)Lma/q;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0
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

.method public final l()V
    .locals 11

    .line 1
    iget-object v0, p0, LZ9/g;->u:Ljava/io/File;

    .line 2
    .line 3
    sget-object v1, Lfa/a;->a:Lfa/a;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lfa/a;->a(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "i.next()"

    .line 29
    .line 30
    invoke-static {v2, v3}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast v2, LZ9/d;

    .line 34
    .line 35
    iget-object v3, v2, LZ9/d;->g:LK0/g;

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    const/4 v5, 0x0

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    :goto_1
    if-ge v5, v4, :cond_0

    .line 42
    .line 43
    add-int/lit8 v3, v5, 0x1

    .line 44
    .line 45
    iget-wide v6, p0, LZ9/g;->w:J

    .line 46
    .line 47
    iget-object v8, v2, LZ9/d;->b:[J

    .line 48
    .line 49
    aget-wide v9, v8, v5

    .line 50
    .line 51
    add-long/2addr v6, v9

    .line 52
    iput-wide v6, p0, LZ9/g;->w:J

    .line 53
    .line 54
    move v5, v3

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v3, 0x0

    .line 57
    iput-object v3, v2, LZ9/d;->g:LK0/g;

    .line 58
    .line 59
    :goto_2
    if-ge v5, v4, :cond_2

    .line 60
    .line 61
    add-int/lit8 v3, v5, 0x1

    .line 62
    .line 63
    iget-object v6, v2, LZ9/d;->c:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, Ljava/io/File;

    .line 70
    .line 71
    invoke-virtual {v1, v6}, Lfa/a;->a(Ljava/io/File;)V

    .line 72
    .line 73
    .line 74
    iget-object v6, v2, LZ9/d;->d:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Ljava/io/File;

    .line 81
    .line 82
    invoke-virtual {v1, v5}, Lfa/a;->a(Ljava/io/File;)V

    .line 83
    .line 84
    .line 85
    move v5, v3

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    return-void
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

.method public final n()V
    .locals 11

    .line 1
    const-string v0, ", "

    .line 2
    .line 3
    const-string v1, "unexpected journal header: ["

    .line 4
    .line 5
    iget-object v2, p0, LZ9/g;->t:Ljava/io/File;

    .line 6
    .line 7
    const-string v3, "file"

    .line 8
    .line 9
    invoke-static {v2, v3}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Lga/d;->D(Ljava/io/File;)Lma/b;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Lga/d;->d(Lma/w;)Lma/r;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-wide v3, 0x7fffffffffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    :try_start_0
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    const-string v10, "libcore.io.DiskLruCache"

    .line 46
    .line 47
    invoke-virtual {v10, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-eqz v10, :cond_1

    .line 52
    .line 53
    const-string v10, "1"

    .line 54
    .line 55
    invoke-virtual {v10, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    if-eqz v10, :cond_1

    .line 60
    .line 61
    const v10, 0x31191

    .line 62
    .line 63
    .line 64
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    invoke-static {v10, v7}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_1

    .line 73
    .line 74
    const/4 v7, 0x2

    .line 75
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-static {v7, v8}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-eqz v7, :cond_1

    .line 84
    .line 85
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    if-gtz v7, :cond_1

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    :goto_0
    :try_start_1
    invoke-virtual {v2, v3, v4}, Lma/r;->o(J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p0, v1}, LZ9/g;->o(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    add-int/lit8 v0, v0, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    goto :goto_2

    .line 104
    :catch_0
    :try_start_2
    iget-object v1, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    sub-int/2addr v0, v1

    .line 111
    iput v0, p0, LZ9/g;->z:I

    .line 112
    .line 113
    invoke-virtual {v2}, Lma/r;->a()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_0

    .line 118
    .line 119
    invoke-virtual {p0}, LZ9/g;->p()V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_0
    invoke-virtual {p0}, LZ9/g;->j()Lma/q;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iput-object v0, p0, LZ9/g;->x:Lma/q;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    .line 129
    :goto_1
    invoke-virtual {v2}, Lma/r;->close()V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_1
    :try_start_3
    new-instance v3, Ljava/io/IOException;

    .line 134
    .line 135
    new-instance v4, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const/16 v0, 0x5d

    .line 162
    .line 163
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 174
    :goto_2
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 175
    :catchall_1
    move-exception v1

    .line 176
    invoke-static {v2, v0}, Lcom/bumptech/glide/c;->c(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    throw v1
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

.method public final o(Ljava/lang/String;)V
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/16 v1, 0x20

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x6

    .line 6
    invoke-static {p1, v1, v2, v3}, LL9/f;->O(Ljava/lang/CharSequence;CII)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const-string v4, "unexpected journal line: "

    .line 11
    .line 12
    const/4 v5, -0x1

    .line 13
    if-eq v3, v5, :cond_8

    .line 14
    .line 15
    add-int/lit8 v6, v3, 0x1

    .line 16
    .line 17
    const/4 v7, 0x4

    .line 18
    invoke-static {p1, v1, v6, v7}, LL9/f;->O(Ljava/lang/CharSequence;CII)I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    iget-object v8, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    const-string v9, "this as java.lang.String).substring(startIndex)"

    .line 25
    .line 26
    if-ne v7, v5, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-static {v6, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object v10, LZ9/g;->M:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    if-ne v3, v11, :cond_1

    .line 42
    .line 43
    invoke-static {p1, v10, v2}, LL9/n;->I(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-eqz v10, :cond_1

    .line 48
    .line 49
    invoke-virtual {v8, v6}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    invoke-virtual {p1, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    const-string v10, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 58
    .line 59
    invoke-static {v6, v10}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {v8, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    check-cast v10, LZ9/d;

    .line 67
    .line 68
    if-nez v10, :cond_2

    .line 69
    .line 70
    new-instance v10, LZ9/d;

    .line 71
    .line 72
    invoke-direct {v10, p0, v6}, LZ9/d;-><init>(LZ9/g;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v8, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :cond_2
    if-eq v7, v5, :cond_4

    .line 79
    .line 80
    sget-object v6, LZ9/g;->K:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-ne v3, v8, :cond_4

    .line 87
    .line 88
    invoke-static {p1, v6, v2}, LL9/n;->I(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_4

    .line 93
    .line 94
    add-int/2addr v7, v0

    .line 95
    invoke-virtual {p1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p1, v9}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-array v3, v0, [C

    .line 103
    .line 104
    aput-char v1, v3, v2

    .line 105
    .line 106
    invoke-static {p1, v3}, LL9/f;->b0(Ljava/lang/String;[C)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-boolean v0, v10, LZ9/d;->e:Z

    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    iput-object v1, v10, LZ9/d;->g:LK0/g;

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    iget-object v3, v10, LZ9/d;->j:LZ9/g;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    const/4 v3, 0x2

    .line 125
    if-ne v1, v3, :cond_3

    .line 126
    .line 127
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    :goto_0
    if-ge v2, v1, :cond_6

    .line 132
    .line 133
    add-int/lit8 v3, v2, 0x1

    .line 134
    .line 135
    iget-object v5, v10, LZ9/d;->b:[J

    .line 136
    .line 137
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    check-cast v6, Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 144
    .line 145
    .line 146
    move-result-wide v6

    .line 147
    aput-wide v6, v5, v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    .line 149
    move v2, v3

    .line 150
    goto :goto_0

    .line 151
    :catch_0
    new-instance v0, Ljava/io/IOException;

    .line 152
    .line 153
    invoke-static {p1, v4}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v0

    .line 161
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 162
    .line 163
    invoke-static {p1, v4}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_4
    if-ne v7, v5, :cond_5

    .line 172
    .line 173
    sget-object v0, LZ9/g;->L:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-ne v3, v1, :cond_5

    .line 180
    .line 181
    invoke-static {p1, v0, v2}, LL9/n;->I(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_5

    .line 186
    .line 187
    new-instance p1, LK0/g;

    .line 188
    .line 189
    invoke-direct {p1, p0, v10}, LK0/g;-><init>(LZ9/g;LZ9/d;)V

    .line 190
    .line 191
    .line 192
    iput-object p1, v10, LZ9/d;->g:LK0/g;

    .line 193
    .line 194
    return-void

    .line 195
    :cond_5
    if-ne v7, v5, :cond_7

    .line 196
    .line 197
    sget-object v0, LZ9/g;->N:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-ne v3, v1, :cond_7

    .line 204
    .line 205
    invoke-static {p1, v0, v2}, LL9/n;->I(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_7

    .line 210
    .line 211
    :cond_6
    return-void

    .line 212
    :cond_7
    new-instance v0, Ljava/io/IOException;

    .line 213
    .line 214
    invoke-static {p1, v4}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v0

    .line 222
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 223
    .line 224
    invoke-static {p1, v4}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v0
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

.method public final declared-synchronized p()V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LZ9/g;->x:Lma/q;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lma/q;->close()V

    .line 8
    .line 9
    .line 10
    :goto_0
    iget-object v0, p0, LZ9/g;->u:Ljava/io/File;

    .line 11
    .line 12
    const-string v1, "file"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-static {v0}, Lga/d;->C(Ljava/io/File;)Lma/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    goto :goto_1

    .line 22
    :catch_0
    :try_start_2
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lga/d;->C(Ljava/io/File;)Lma/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_1
    invoke-static {v0}, Lga/d;->c(Lma/v;)Lma/q;

    .line 34
    .line 35
    .line 36
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    :try_start_3
    const-string v1, "libcore.io.DiskLruCache"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 40
    .line 41
    .line 42
    const/16 v1, 0xa

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lma/q;->z(I)Lma/g;

    .line 45
    .line 46
    .line 47
    const-string v2, "1"

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lma/q;->z(I)Lma/g;

    .line 53
    .line 54
    .line 55
    const v2, 0x31191

    .line 56
    .line 57
    .line 58
    int-to-long v2, v2

    .line 59
    invoke-virtual {v0, v2, v3}, Lma/q;->R(J)Lma/g;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lma/q;->z(I)Lma/g;

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x2

    .line 66
    int-to-long v2, v2

    .line 67
    invoke-virtual {v0, v2, v3}, Lma/q;->R(J)Lma/g;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lma/q;->z(I)Lma/g;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lma/q;->z(I)Lma/g;

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    const/4 v4, 0x0

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, LZ9/d;

    .line 98
    .line 99
    iget-object v5, v3, LZ9/d;->g:LK0/g;

    .line 100
    .line 101
    const/16 v6, 0x20

    .line 102
    .line 103
    if-eqz v5, :cond_1

    .line 104
    .line 105
    sget-object v4, LZ9/g;->L:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v4}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v6}, Lma/q;->z(I)Lma/g;

    .line 111
    .line 112
    .line 113
    iget-object v3, v3, LZ9/d;->a:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v3}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Lma/q;->z(I)Lma/g;

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :catchall_0
    move-exception v1

    .line 123
    goto :goto_5

    .line 124
    :cond_1
    sget-object v5, LZ9/g;->K:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v0, v5}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v6}, Lma/q;->z(I)Lma/g;

    .line 130
    .line 131
    .line 132
    iget-object v5, v3, LZ9/d;->a:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v0, v5}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 135
    .line 136
    .line 137
    iget-object v3, v3, LZ9/d;->b:[J

    .line 138
    .line 139
    array-length v5, v3

    .line 140
    :goto_3
    if-ge v4, v5, :cond_2

    .line 141
    .line 142
    aget-wide v7, v3, v4

    .line 143
    .line 144
    add-int/lit8 v4, v4, 0x1

    .line 145
    .line 146
    invoke-virtual {v0, v6}, Lma/q;->z(I)Lma/g;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v7, v8}, Lma/q;->R(J)Lma/g;

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_2
    invoke-virtual {v0, v1}, Lma/q;->z(I)Lma/g;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_3
    :try_start_4
    invoke-virtual {v0}, Lma/q;->close()V

    .line 158
    .line 159
    .line 160
    sget-object v0, Lfa/a;->a:Lfa/a;

    .line 161
    .line 162
    iget-object v1, p0, LZ9/g;->t:Ljava/io/File;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Lfa/a;->c(Ljava/io/File;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_4

    .line 169
    .line 170
    iget-object v1, p0, LZ9/g;->t:Ljava/io/File;

    .line 171
    .line 172
    iget-object v2, p0, LZ9/g;->v:Ljava/io/File;

    .line 173
    .line 174
    invoke-virtual {v0, v1, v2}, Lfa/a;->d(Ljava/io/File;Ljava/io/File;)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :catchall_1
    move-exception v0

    .line 179
    goto :goto_6

    .line 180
    :cond_4
    :goto_4
    iget-object v1, p0, LZ9/g;->u:Ljava/io/File;

    .line 181
    .line 182
    iget-object v2, p0, LZ9/g;->t:Ljava/io/File;

    .line 183
    .line 184
    invoke-virtual {v0, v1, v2}, Lfa/a;->d(Ljava/io/File;Ljava/io/File;)V

    .line 185
    .line 186
    .line 187
    iget-object v1, p0, LZ9/g;->v:Ljava/io/File;

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lfa/a;->a(Ljava/io/File;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, LZ9/g;->j()Lma/q;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iput-object v0, p0, LZ9/g;->x:Lma/q;

    .line 197
    .line 198
    iput-boolean v4, p0, LZ9/g;->A:Z

    .line 199
    .line 200
    iput-boolean v4, p0, LZ9/g;->F:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 201
    .line 202
    monitor-exit p0

    .line 203
    return-void

    .line 204
    :goto_5
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 205
    :catchall_2
    move-exception v2

    .line 206
    :try_start_6
    invoke-static {v0, v1}, Lcom/bumptech/glide/c;->c(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    throw v2

    .line 210
    :goto_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 211
    throw v0
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

.method public final t(LZ9/d;)V
    .locals 11

    .line 1
    const-string v0, "entry"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LZ9/g;->B:Z

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    const/16 v2, 0x20

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    iget-object v4, p1, LZ9/d;->a:Ljava/lang/String;

    .line 14
    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    iget v0, p1, LZ9/d;->h:I

    .line 18
    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, LZ9/g;->x:Lma/q;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v5, LZ9/g;->L:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v5}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lma/q;->z(I)Lma/g;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v4}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lma/q;->z(I)Lma/g;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lma/q;->flush()V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    iget v0, p1, LZ9/d;->h:I

    .line 44
    .line 45
    if-gtz v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p1, LZ9/d;->g:LK0/g;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    :cond_2
    iput-boolean v3, p1, LZ9/d;->f:Z

    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    iget-object v0, p1, LZ9/d;->g:LK0/g;

    .line 55
    .line 56
    if-nez v0, :cond_4

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    invoke-virtual {v0}, LK0/g;->e()V

    .line 60
    .line 61
    .line 62
    :goto_1
    const/4 v0, 0x0

    .line 63
    :goto_2
    const/4 v5, 0x2

    .line 64
    if-ge v0, v5, :cond_7

    .line 65
    .line 66
    add-int/lit8 v5, v0, 0x1

    .line 67
    .line 68
    iget-object v6, p1, LZ9/d;->c:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    check-cast v6, Ljava/io/File;

    .line 75
    .line 76
    const-string v7, "file"

    .line 77
    .line 78
    invoke-static {v6, v7}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-nez v7, :cond_6

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-nez v7, :cond_5

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 95
    .line 96
    const-string v0, "failed to delete "

    .line 97
    .line 98
    invoke-static {v6, v0}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1

    .line 106
    :cond_6
    :goto_3
    iget-wide v6, p0, LZ9/g;->w:J

    .line 107
    .line 108
    iget-object v8, p1, LZ9/d;->b:[J

    .line 109
    .line 110
    aget-wide v9, v8, v0

    .line 111
    .line 112
    sub-long/2addr v6, v9

    .line 113
    iput-wide v6, p0, LZ9/g;->w:J

    .line 114
    .line 115
    const-wide/16 v6, 0x0

    .line 116
    .line 117
    aput-wide v6, v8, v0

    .line 118
    .line 119
    move v0, v5

    .line 120
    goto :goto_2

    .line 121
    :cond_7
    iget p1, p0, LZ9/g;->z:I

    .line 122
    .line 123
    add-int/2addr p1, v3

    .line 124
    iput p1, p0, LZ9/g;->z:I

    .line 125
    .line 126
    iget-object p1, p0, LZ9/g;->x:Lma/q;

    .line 127
    .line 128
    if-nez p1, :cond_8

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_8
    sget-object v0, LZ9/g;->M:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {p1, v0}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v2}, Lma/q;->z(I)Lma/g;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v4}, Lma/q;->Q(Ljava/lang/String;)Lma/g;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v1}, Lma/q;->z(I)Lma/g;

    .line 143
    .line 144
    .line 145
    :goto_4
    iget-object p1, p0, LZ9/g;->y:Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    invoke-virtual {p1, v4}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, LZ9/g;->i()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_9

    .line 155
    .line 156
    iget-object p1, p0, LZ9/g;->H:Laa/b;

    .line 157
    .line 158
    iget-object v0, p0, LZ9/g;->I:LZ9/f;

    .line 159
    .line 160
    invoke-static {p1, v0}, Laa/b;->d(Laa/b;Laa/a;)V

    .line 161
    .line 162
    .line 163
    :cond_9
    return-void
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
