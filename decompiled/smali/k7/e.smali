.class public Lk7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq7/j;
.implements Lo/j;
.implements Lorg/chromium/net/c;
.implements Lo/w;
.implements Lp/U;
.implements Lp/m;
.implements Lk2/b;
.implements LU/s;
.implements Landroidx/lifecycle/T;
.implements Lcom/google/android/gms/common/api/internal/zabz;
.implements Lya/k;
.implements LJ7/k;


# instance fields
.field public s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/work/impl/WorkDatabase;)V
    .locals 1

    const-string v0, "workDatabase"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/e;->s:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk7/e;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lsa/b;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Lsa/C;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 4
    invoke-direct {p1, v0, v1}, Lsa/C;-><init>(II)V

    .line 5
    iput-object p1, p0, Lk7/e;->s:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public E(Landroid/view/View;LU/B0;)LU/B0;
    .locals 1

    .line 1
    invoke-virtual {p2}, LU/B0;->a()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lt3/f;

    .line 8
    .line 9
    iput p1, v0, Lt3/f;->m:I

    .line 10
    .line 11
    invoke-virtual {p2}, LU/B0;->b()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, v0, Lt3/f;->n:I

    .line 16
    .line 17
    invoke-virtual {p2}, LU/B0;->c()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, v0, Lt3/f;->o:I

    .line 22
    .line 23
    invoke-virtual {v0}, Lt3/f;->e()V

    .line 24
    .line 25
    .line 26
    return-object p2
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

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LJ7/k;

    .line 4
    .line 5
    invoke-interface {v0}, LJ7/k;->a()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
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

.method public b(LL7/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LJ7/k;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LJ7/k;->b(LL7/b;)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
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

.method public c(Lo/l;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Lo/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lo/D;

    .line 7
    .line 8
    iget-object v0, v0, Lo/D;->R:Lo/l;

    .line 9
    .line 10
    invoke-virtual {v0}, Lo/l;->k()Lo/l;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lo/l;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroidx/appcompat/widget/b;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/appcompat/widget/b;->w:Lo/w;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Lo/w;->c(Lo/l;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
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

.method public d(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lya/L;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Lza/c;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p1, v0}, Lza/c;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LJ7/k;

    .line 14
    .line 15
    invoke-interface {v0, p1}, LJ7/k;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 20
    .line 21
    const-string v0, "response == null"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public e(Ljava/lang/Class;)Landroidx/lifecycle/Q;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error."

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
    .line 9
    .line 10
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

.method public f(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/common/api/internal/a;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/a;->m:Ljava/util/concurrent/locks/ReentrantLock;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/a;->m:Ljava/util/concurrent/locks/ReentrantLock;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/a;->i:Landroid/os/Bundle;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iput-object p1, v0, Lcom/google/android/gms/common/api/internal/a;->i:Landroid/os/Bundle;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    sget-object p1, Lcom/google/android/gms/common/ConnectionResult;->w:Lcom/google/android/gms/common/ConnectionResult;

    .line 25
    .line 26
    iput-object p1, v0, Lcom/google/android/gms/common/api/internal/a;->j:Lcom/google/android/gms/common/ConnectionResult;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/a;->i(Lcom/google/android/gms/common/api/internal/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 37
    .line 38
    .line 39
    throw p1
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

.method public g(LC8/c;Lu0/b;)Landroidx/lifecycle/Q;
    .locals 0

    .line 1
    invoke-static {p1}, Lga/d;->o(LC8/c;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lk7/e;->i(Ljava/lang/Class;Lu0/b;)Landroidx/lifecycle/Q;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
    .line 10
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

.method public get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LV/h;

    .line 4
    .line 5
    iget-object v0, v0, LV/h;->t:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 17
    .line 18
    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
    .line 24
    .line 25
    .line 26
.end method

.method public h(I)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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

.method public i(Ljava/lang/Class;Lu0/b;)Landroidx/lifecycle/Q;
    .locals 5

    .line 1
    invoke-static {p1}, Lga/d;->r(Ljava/lang/Class;)LC8/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p2, [Lu0/c;

    .line 8
    .line 9
    array-length v0, p2

    .line 10
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, [Lu0/c;

    .line 15
    .line 16
    const-string v0, "initializers"

    .line 17
    .line 18
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    array-length v0, p2

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    const/4 v2, 0x0

    .line 24
    if-ge v1, v0, :cond_1

    .line 25
    .line 26
    aget-object v3, p2, v1

    .line 27
    .line 28
    iget-object v4, v3, Lu0/c;->a:LC8/c;

    .line 29
    .line 30
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v3, v2

    .line 41
    :goto_1
    if-eqz v3, :cond_2

    .line 42
    .line 43
    new-instance v2, LA0/g$a;

    .line 44
    .line 45
    invoke-direct {v2}, LA0/g$a;-><init>()V

    .line 46
    .line 47
    .line 48
    :cond_2
    if-eqz v2, :cond_3

    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v0, "No initializer set for given class "

    .line 54
    .line 55
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, LC8/c;->s()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p2
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

.method public j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, LX9/O;

    .line 2
    .line 3
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lya/k;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lya/k;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Li/w;->e(Ljava/lang/Object;)Ljava/util/Optional;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public k(Lo/l;Landroid/view/MenuItem;)Z
    .locals 12

    .line 1
    iget-object p1, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/android/material/navigation/d;->x:Lm3/h;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const-string v3, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment"

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Lcom/google/android/material/navigation/d;->getSelectedItemId()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-ne v0, v4, :cond_0

    .line 22
    .line 23
    iget-object p1, p1, Lcom/google/android/material/navigation/d;->x:Lm3/h;

    .line 24
    .line 25
    check-cast p1, LE4/B;

    .line 26
    .line 27
    iget-object v0, p1, LE4/B;->t:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Landroid/util/SparseArray;

    .line 30
    .line 31
    iget-object p1, p1, LE4/B;->u:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lq0/M;

    .line 34
    .line 35
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroidx/fragment/app/e;->E(Ljava/lang/String;)Landroidx/fragment/app/b;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1, v3}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    check-cast p1, LA0/s;

    .line 53
    .line 54
    invoke-virtual {p1}, LA0/s;->g0()Ly0/B;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Ly0/B;->h()Ly0/z;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iget p2, p2, Ly0/z;->D:I

    .line 63
    .line 64
    invoke-virtual {p1, p2, v2}, Ly0/B;->n(IZ)Z

    .line 65
    .line 66
    .line 67
    return v1

    .line 68
    :cond_0
    iget-object p1, p1, Lcom/google/android/material/navigation/d;->w:Lm3/i;

    .line 69
    .line 70
    if-eqz p1, :cond_6

    .line 71
    .line 72
    check-cast p1, LN4/c;

    .line 73
    .line 74
    iget-object v0, p1, LN4/c;->a:Lq0/M;

    .line 75
    .line 76
    iget-object v4, p1, LN4/c;->b:Landroid/util/SparseArray;

    .line 77
    .line 78
    iget-object v5, p1, LN4/c;->c:Lv8/t;

    .line 79
    .line 80
    iget-object v6, p1, LN4/c;->e:Lv8/q;

    .line 81
    .line 82
    iget-object v7, p1, LN4/c;->f:Landroidx/lifecycle/A;

    .line 83
    .line 84
    const-string v8, "item"

    .line 85
    .line 86
    invoke-static {p2, v8}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Landroidx/fragment/app/e;->P()Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v8, :cond_1

    .line 94
    .line 95
    goto/16 :goto_1

    .line 96
    .line 97
    :cond_1
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-virtual {v4, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, Ljava/lang/String;

    .line 106
    .line 107
    iget-object v8, v5, Lv8/t;->s:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-static {v8, p2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-nez v8, :cond_5

    .line 114
    .line 115
    new-instance v8, Lq0/K;

    .line 116
    .line 117
    const/4 v9, -0x1

    .line 118
    iget-object p1, p1, LN4/c;->d:Ljava/lang/String;

    .line 119
    .line 120
    invoke-direct {v8, v0, p1, v9}, Lq0/K;-><init>(Landroidx/fragment/app/e;Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v8, v2}, Landroidx/fragment/app/e;->x(Lq0/J;Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p2}, Landroidx/fragment/app/e;->E(Ljava/lang/String;)Landroidx/fragment/app/b;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-static {v8, v3}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    check-cast v8, LA0/s;

    .line 134
    .line 135
    invoke-static {p1, p2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-nez v3, :cond_4

    .line 140
    .line 141
    new-instance v3, Lq0/a;

    .line 142
    .line 143
    invoke-direct {v3, v0}, Lq0/a;-><init>(Landroidx/fragment/app/e;)V

    .line 144
    .line 145
    .line 146
    new-instance v9, Lq0/P;

    .line 147
    .line 148
    const/4 v10, 0x7

    .line 149
    invoke-direct {v9, v10, v8}, Lq0/P;-><init>(ILandroidx/fragment/app/b;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v9}, Lq0/a;->b(Lq0/P;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v8}, Lq0/a;->o(Landroidx/fragment/app/b;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    move v10, v2

    .line 163
    :goto_0
    if-ge v10, v9, :cond_3

    .line 164
    .line 165
    invoke-virtual {v4, v10}, Landroid/util/SparseArray;->keyAt(I)I

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    check-cast v11, Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {v11, p2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    if-nez v11, :cond_2

    .line 179
    .line 180
    invoke-virtual {v0, p1}, Landroidx/fragment/app/e;->E(Ljava/lang/String;)Landroidx/fragment/app/b;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    invoke-static {v11}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v11}, Lq0/a;->i(Landroidx/fragment/app/b;)V

    .line 188
    .line 189
    .line 190
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_3
    invoke-virtual {v3, p1}, Lq0/a;->c(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    iput-boolean v1, v3, Lq0/a;->p:Z

    .line 197
    .line 198
    invoke-virtual {v3}, Lq0/a;->f()V

    .line 199
    .line 200
    .line 201
    :cond_4
    iput-object p2, v5, Lv8/t;->s:Ljava/lang/Object;

    .line 202
    .line 203
    invoke-static {p2, p1}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    iput-boolean p1, v6, Lv8/q;->s:Z

    .line 208
    .line 209
    invoke-virtual {v8}, LA0/s;->g0()Ly0/B;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {v7, p1}, Landroidx/lifecycle/A;->e(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    return v2

    .line 217
    :cond_5
    :goto_1
    return v1

    .line 218
    :cond_6
    return v2
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

.method public l(Lo/l;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/b;

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/appcompat/widget/b;->u:Lo/l;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move-object v1, p1

    .line 12
    check-cast v1, Lo/D;

    .line 13
    .line 14
    iget-object v1, v1, Lo/D;->S:Lo/n;

    .line 15
    .line 16
    iget v1, v1, Lo/n;->s:I

    .line 17
    .line 18
    iput v1, v0, Landroidx/appcompat/widget/b;->Q:I

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/appcompat/widget/b;->w:Lo/w;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lo/w;->l(Lo/l;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_1
    return v2
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public m(I)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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

.method public n(IF)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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

.method public o(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/common/api/internal/a;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/a;->m:Ljava/util/concurrent/locks/ReentrantLock;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/a;->m:Ljava/util/concurrent/locks/ReentrantLock;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    iput-object p1, v0, Lcom/google/android/gms/common/api/internal/a;->j:Lcom/google/android/gms/common/ConnectionResult;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/a;->i(Lcom/google/android/gms/common/api/internal/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 23
    .line 24
    .line 25
    throw p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    const/4 p1, 0x0

    .line 2
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, LJ7/k;

    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lza/c;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lza/c;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, LJ7/k;->d(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, LJ7/k;->a()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    :try_start_1
    invoke-interface {v0, v1}, LJ7/k;->onError(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_1
    move-exception v0

    .line 24
    invoke-static {v0}, Lga/l;->n(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lio/reactivex/exceptions/CompositeException;

    .line 28
    .line 29
    const/4 v3, 0x2

    .line 30
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 31
    .line 32
    aput-object v1, v3, p1

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    aput-object v0, v3, p1

    .line 36
    .line 37
    invoke-direct {v2, v3}, Lio/reactivex/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, LJ7/j;->y(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void
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

.method public p()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk7/f;

    .line 4
    .line 5
    iget-boolean v0, v0, Lk7/f;->s:Z

    .line 6
    .line 7
    return v0
    .line 8
    .line 9
    .line 10
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

.method public q()Ljava/nio/channels/FileChannel;
    .locals 5

    .line 1
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/ParcelFileDescriptor;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getStatSize()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const-wide/16 v3, -0x1

    .line 10
    .line 11
    cmp-long v1, v1, v3

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v3, "Not a file: "

    .line 33
    .line 34
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1
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

.method public r(Lo/l;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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

.method public varargs s([Ljava/lang/String;)LB6/i;
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-static {p1}, Li8/l;->C([Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    iget-object v3, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Li/l;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    iget v4, v4, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Ljava/lang/String;

    .line 47
    .line 48
    sget-object v6, LA6/a;->a:Ljava/util/Set;

    .line 49
    .line 50
    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_0

    .line 55
    .line 56
    invoke-virtual {v1, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const-string p1, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    const/16 v5, 0x1d

    .line 73
    .line 74
    if-eq v2, v5, :cond_2

    .line 75
    .line 76
    const/16 v5, 0x1e

    .line 77
    .line 78
    if-ne v2, v5, :cond_3

    .line 79
    .line 80
    if-ge v4, v5, :cond_3

    .line 81
    .line 82
    :cond_2
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    :cond_3
    const-string p1, "android.permission.POST_NOTIFICATIONS"

    .line 89
    .line 90
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    const/16 v5, 0x21

    .line 97
    .line 98
    if-lt v2, v5, :cond_4

    .line 99
    .line 100
    if-lt v4, v5, :cond_4

    .line 101
    .line 102
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :cond_4
    new-instance p1, LB6/i;

    .line 109
    .line 110
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    const/4 v2, -0x1

    .line 114
    iput v2, p1, LB6/i;->b:I

    .line 115
    .line 116
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 117
    .line 118
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 119
    .line 120
    .line 121
    iput-object v2, p1, LB6/i;->e:Ljava/util/LinkedHashSet;

    .line 122
    .line 123
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 124
    .line 125
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 126
    .line 127
    .line 128
    iput-object v2, p1, LB6/i;->f:Ljava/util/LinkedHashSet;

    .line 129
    .line 130
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 131
    .line 132
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 133
    .line 134
    .line 135
    iput-object v2, p1, LB6/i;->g:Ljava/util/LinkedHashSet;

    .line 136
    .line 137
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 138
    .line 139
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 140
    .line 141
    .line 142
    iput-object v2, p1, LB6/i;->h:Ljava/util/LinkedHashSet;

    .line 143
    .line 144
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 145
    .line 146
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 147
    .line 148
    .line 149
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 150
    .line 151
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 152
    .line 153
    .line 154
    iput-object v2, p1, LB6/i;->i:Ljava/util/LinkedHashSet;

    .line 155
    .line 156
    iput-object v3, p1, LB6/i;->a:Li/l;

    .line 157
    .line 158
    iput-object v0, p1, LB6/i;->c:Ljava/util/LinkedHashSet;

    .line 159
    .line 160
    iput-object v1, p1, LB6/i;->d:Ljava/util/LinkedHashSet;

    .line 161
    .line 162
    return-object p1
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

.method public t(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk7/e;->s:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/common/api/internal/a;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/a;->m:Ljava/util/concurrent/locks/ReentrantLock;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/a;->m:Ljava/util/concurrent/locks/ReentrantLock;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    iget-boolean v1, v0, Lcom/google/android/gms/common/api/internal/a;->l:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/a;->k:Lcom/google/android/gms/common/ConnectionResult;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->T()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x1

    .line 28
    iput-boolean v1, v0, Lcom/google/android/gms/common/api/internal/a;->l:Z

    .line 29
    .line 30
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/a;->e:Lcom/google/android/gms/common/api/internal/zabi;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/zabi;->onConnectionSuspended(I)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 39
    iput-boolean v1, v0, Lcom/google/android/gms/common/api/internal/a;->l:Z

    .line 40
    .line 41
    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/internal/a;->h(Lcom/google/android/gms/common/api/internal/a;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_2
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 49
    .line 50
    .line 51
    throw p1
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
