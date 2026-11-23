.class public final LM2/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Lcom/google/android/gms/internal/measurement/zzfn$zzm;

.field public final d:Ljava/util/BitSet;

.field public final e:Ljava/util/BitSet;

.field public final f:Lw/e;

.field public final g:Lw/e;

.field public final synthetic h:LM2/v0;


# direct methods
.method public constructor <init>(LM2/v0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM2/w0;->h:LM2/v0;

    .line 2
    iput-object p2, p0, LM2/w0;->a:Ljava/lang/String;

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, LM2/w0;->b:Z

    .line 4
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    iput-object p1, p0, LM2/w0;->d:Ljava/util/BitSet;

    .line 5
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    iput-object p1, p0, LM2/w0;->e:Ljava/util/BitSet;

    .line 6
    new-instance p1, Lw/e;

    const/4 p2, 0x0

    .line 7
    invoke-direct {p1, p2}, Lw/i;-><init>(I)V

    .line 8
    iput-object p1, p0, LM2/w0;->f:Lw/e;

    .line 9
    new-instance p1, Lw/e;

    .line 10
    invoke-direct {p1, p2}, Lw/i;-><init>(I)V

    .line 11
    iput-object p1, p0, LM2/w0;->g:Lw/e;

    return-void
.end method

.method public constructor <init>(LM2/v0;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfn$zzm;Ljava/util/BitSet;Ljava/util/BitSet;Lw/e;Lw/e;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM2/w0;->h:LM2/v0;

    .line 13
    iput-object p2, p0, LM2/w0;->a:Ljava/lang/String;

    .line 14
    iput-object p4, p0, LM2/w0;->d:Ljava/util/BitSet;

    .line 15
    iput-object p5, p0, LM2/w0;->e:Ljava/util/BitSet;

    .line 16
    iput-object p6, p0, LM2/w0;->f:Lw/e;

    .line 17
    new-instance p1, Lw/e;

    const/4 p2, 0x0

    .line 18
    invoke-direct {p1, p2}, Lw/i;-><init>(I)V

    .line 19
    iput-object p1, p0, LM2/w0;->g:Lw/e;

    .line 20
    invoke-virtual {p7}, Lw/e;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Lw/b;

    invoke-virtual {p1}, Lw/b;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    .line 21
    new-instance p5, Ljava/util/ArrayList;

    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    .line 22
    invoke-virtual {p7, p4}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ljava/lang/Long;

    invoke-virtual {p5, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    iget-object p6, p0, LM2/w0;->g:Lw/e;

    invoke-virtual {p6, p4, p5}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 24
    :cond_0
    iput-boolean p2, p0, LM2/w0;->b:Z

    .line 25
    iput-object p3, p0, LM2/w0;->c:Lcom/google/android/gms/internal/measurement/zzfn$zzm;

    return-void
.end method


# virtual methods
.method public final a(LM2/x0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, LM2/x0;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p1, LM2/x0;->a:Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, LM2/w0;->e:Ljava/util/BitSet;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v2, v0, v1}, Ljava/util/BitSet;->set(IZ)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v1, p1, LM2/x0;->b:Ljava/lang/Boolean;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, LM2/w0;->d:Ljava/util/BitSet;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v2, v0, v1}, Ljava/util/BitSet;->set(IZ)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v1, p1, LM2/x0;->c:Ljava/lang/Long;

    .line 32
    .line 33
    const-wide/16 v2, 0x3e8

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, p0, LM2/w0;->f:Lw/e;

    .line 42
    .line 43
    invoke-virtual {v4, v1}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/lang/Long;

    .line 48
    .line 49
    iget-object v5, p1, LM2/x0;->c:Ljava/lang/Long;

    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    div-long/2addr v5, v2

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 59
    .line 60
    .line 61
    move-result-wide v7

    .line 62
    cmp-long v1, v5, v7

    .line 63
    .line 64
    if-lez v1, :cond_3

    .line 65
    .line 66
    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v4, v1, v5}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object v1, p1, LM2/x0;->d:Ljava/lang/Long;

    .line 78
    .line 79
    if-eqz v1, :cond_8

    .line 80
    .line 81
    iget-object v1, p0, LM2/w0;->g:Lw/e;

    .line 82
    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v1, v4}, Lw/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, Ljava/util/List;

    .line 92
    .line 93
    if-nez v4, :cond_4

    .line 94
    .line 95
    new-instance v4, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v1, v0, v4}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    :cond_4
    invoke-virtual {p1}, LM2/x0;->g()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 114
    .line 115
    .line 116
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoc;->a()Z

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, LM2/w0;->a:Ljava/lang/String;

    .line 120
    .line 121
    iget-object v1, p0, LM2/w0;->h:LM2/v0;

    .line 122
    .line 123
    iget-object v5, v1, LB1/a;->s:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v5, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 126
    .line 127
    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/zzhj;->y:Lcom/google/android/gms/measurement/internal/zzag;

    .line 128
    .line 129
    sget-object v6, Lcom/google/android/gms/measurement/internal/zzbf;->k0:Lcom/google/android/gms/measurement/internal/zzfj;

    .line 130
    .line 131
    invoke-virtual {v5, v0, v6}, Lcom/google/android/gms/measurement/internal/zzag;->h1(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfj;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_6

    .line 136
    .line 137
    invoke-virtual {p1}, LM2/x0;->f()Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_6

    .line 142
    .line 143
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 144
    .line 145
    .line 146
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoc;->a()Z

    .line 147
    .line 148
    .line 149
    iget-object v1, v1, LB1/a;->s:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzhj;

    .line 152
    .line 153
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzhj;->y:Lcom/google/android/gms/measurement/internal/zzag;

    .line 154
    .line 155
    invoke-virtual {v1, v0, v6}, Lcom/google/android/gms/measurement/internal/zzag;->h1(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfj;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_7

    .line 160
    .line 161
    iget-object p1, p1, LM2/x0;->d:Ljava/lang/Long;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 164
    .line 165
    .line 166
    move-result-wide v0

    .line 167
    div-long/2addr v0, v2

    .line 168
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-interface {v4, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-nez p1, :cond_8

    .line 177
    .line 178
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-interface {v4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_7
    iget-object p1, p1, LM2/x0;->d:Ljava/lang/Long;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 189
    .line 190
    .line 191
    move-result-wide v0

    .line 192
    div-long/2addr v0, v2

    .line 193
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-interface {v4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    :cond_8
    return-void
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
