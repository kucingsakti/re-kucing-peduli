.class public final Lcom/google/android/gms/internal/measurement/zzb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/zzf;

.field public b:Lcom/google/android/gms/internal/measurement/zzh;

.field public final c:Lcom/google/android/gms/internal/measurement/zzac;

.field public final d:Lcom/google/android/gms/internal/measurement/zzaa;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzf;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzf;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzb;->a:Lcom/google/android/gms/internal/measurement/zzf;

    .line 10
    .line 11
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/zzf;->b:Lcom/google/android/gms/internal/measurement/zzh;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzh;->d()Lcom/google/android/gms/internal/measurement/zzh;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzb;->b:Lcom/google/android/gms/internal/measurement/zzh;

    .line 18
    .line 19
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzac;

    .line 20
    .line 21
    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzac;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzb;->c:Lcom/google/android/gms/internal/measurement/zzac;

    .line 25
    .line 26
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzaa;

    .line 27
    .line 28
    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzaa;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzb;->d:Lcom/google/android/gms/internal/measurement/zzaa;

    .line 32
    .line 33
    new-instance v1, Lcom/google/android/gms/internal/measurement/zza;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p0, v1, Lcom/google/android/gms/internal/measurement/zza;->s:Lcom/google/android/gms/internal/measurement/zzb;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzf;->d:Lcom/google/android/gms/internal/measurement/zzl;

    .line 41
    .line 42
    iget-object v2, v0, Lcom/google/android/gms/internal/measurement/zzl;->a:Ljava/util/HashMap;

    .line 43
    .line 44
    const-string v3, "internal.registerCallback"

    .line 45
    .line 46
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzd;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p0, v1, Lcom/google/android/gms/internal/measurement/zzd;->s:Lcom/google/android/gms/internal/measurement/zzb;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzl;->a:Ljava/util/HashMap;

    .line 57
    .line 58
    const-string v2, "internal.eventLogger"

    .line 59
    .line 60
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    return-void
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


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/zzft$zzc;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzb;->a:Lcom/google/android/gms/internal/measurement/zzf;

    .line 3
    .line 4
    :try_start_0
    iget-object v2, v1, Lcom/google/android/gms/internal/measurement/zzf;->b:Lcom/google/android/gms/internal/measurement/zzh;

    .line 5
    .line 6
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzh;->d()Lcom/google/android/gms/internal/measurement/zzh;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iput-object v2, p0, Lcom/google/android/gms/internal/measurement/zzb;->b:Lcom/google/android/gms/internal/measurement/zzh;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzft$zzc;->B()Lcom/google/android/gms/internal/measurement/zzjt;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzb;->b:Lcom/google/android/gms/internal/measurement/zzh;

    .line 17
    .line 18
    new-array v4, v0, [Lcom/google/android/gms/internal/measurement/zzft$zzd;

    .line 19
    .line 20
    invoke-interface {v2, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, [Lcom/google/android/gms/internal/measurement/zzft$zzd;

    .line 25
    .line 26
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzf;->a(Lcom/google/android/gms/internal/measurement/zzh;[Lcom/google/android/gms/internal/measurement/zzft$zzd;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    instance-of v2, v2, Lcom/google/android/gms/internal/measurement/zzaj;

    .line 31
    .line 32
    if-nez v2, :cond_6

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzft$zzc;->z()Lcom/google/android/gms/internal/measurement/zzft$zza;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzft$zza;->C()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_5

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzft$zzb;

    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzft$zzb;->B()Lcom/google/android/gms/internal/measurement/zzjt;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzft$zzb;->A()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_0

    .line 75
    .line 76
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzft$zzd;

    .line 81
    .line 82
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzb;->b:Lcom/google/android/gms/internal/measurement/zzh;

    .line 83
    .line 84
    const/4 v6, 0x1

    .line 85
    new-array v6, v6, [Lcom/google/android/gms/internal/measurement/zzft$zzd;

    .line 86
    .line 87
    aput-object v4, v6, v0

    .line 88
    .line 89
    invoke-virtual {v1, v5, v6}, Lcom/google/android/gms/internal/measurement/zzf;->a(Lcom/google/android/gms/internal/measurement/zzh;[Lcom/google/android/gms/internal/measurement/zzft$zzd;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    instance-of v5, v4, Lcom/google/android/gms/internal/measurement/zzap;

    .line 94
    .line 95
    if-eqz v5, :cond_4

    .line 96
    .line 97
    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzb;->b:Lcom/google/android/gms/internal/measurement/zzh;

    .line 98
    .line 99
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/measurement/zzh;->f(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-nez v6, :cond_1

    .line 104
    .line 105
    const/4 v5, 0x0

    .line 106
    goto :goto_1

    .line 107
    :cond_1
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/measurement/zzh;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    instance-of v6, v5, Lcom/google/android/gms/internal/measurement/zzal;

    .line 112
    .line 113
    if-eqz v6, :cond_3

    .line 114
    .line 115
    check-cast v5, Lcom/google/android/gms/internal/measurement/zzal;

    .line 116
    .line 117
    :goto_1
    if-eqz v5, :cond_2

    .line 118
    .line 119
    iget-object v6, p0, Lcom/google/android/gms/internal/measurement/zzb;->b:Lcom/google/android/gms/internal/measurement/zzh;

    .line 120
    .line 121
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/internal/measurement/zzal;->a(Lcom/google/android/gms/internal/measurement/zzh;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/zzaq;

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :catchall_0
    move-exception p1

    .line 130
    goto :goto_2

    .line 131
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v1, "Rule function is undefined: "

    .line 136
    .line 137
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v1, "Invalid function name: "

    .line 156
    .line 157
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p1

    .line 171
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 172
    .line 173
    const-string v0, "Invalid rule definition"

    .line 174
    .line 175
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p1

    .line 179
    :cond_5
    return-void

    .line 180
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 181
    .line 182
    const-string v0, "Program loading failed"

    .line 183
    .line 184
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzc;

    .line 189
    .line 190
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    throw v0
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

.method public final b(Lcom/google/android/gms/internal/measurement/zzad;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzb;->c:Lcom/google/android/gms/internal/measurement/zzac;

    .line 2
    .line 3
    :try_start_0
    iput-object p1, v0, Lcom/google/android/gms/internal/measurement/zzac;->a:Lcom/google/android/gms/internal/measurement/zzad;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzad;->clone()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzad;

    .line 10
    .line 11
    iput-object p1, v0, Lcom/google/android/gms/internal/measurement/zzac;->b:Lcom/google/android/gms/internal/measurement/zzad;

    .line 12
    .line 13
    iget-object p1, v0, Lcom/google/android/gms/internal/measurement/zzac;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzb;->a:Lcom/google/android/gms/internal/measurement/zzf;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzf;->c:Lcom/google/android/gms/internal/measurement/zzh;

    .line 21
    .line 22
    const-string v1, "runtime.counter"

    .line 23
    .line 24
    new-instance v2, Lcom/google/android/gms/internal/measurement/zzai;

    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/measurement/zzai;-><init>(Ljava/lang/Double;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/measurement/zzh;->g(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzaq;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzb;->d:Lcom/google/android/gms/internal/measurement/zzaa;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzb;->b:Lcom/google/android/gms/internal/measurement/zzh;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzh;->d()Lcom/google/android/gms/internal/measurement/zzh;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaa;->a(Lcom/google/android/gms/internal/measurement/zzh;Lcom/google/android/gms/internal/measurement/zzac;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzb;->c:Lcom/google/android/gms/internal/measurement/zzac;

    .line 50
    .line 51
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzac;->b:Lcom/google/android/gms/internal/measurement/zzad;

    .line 52
    .line 53
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzac;->a:Lcom/google/android/gms/internal/measurement/zzad;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzad;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzb;->c:Lcom/google/android/gms/internal/measurement/zzac;

    .line 62
    .line 63
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzac;->c:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    if-nez p1, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const/4 p1, 0x0

    .line 73
    return p1

    .line 74
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 75
    return p1

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzc;

    .line 78
    .line 79
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    throw v0
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
