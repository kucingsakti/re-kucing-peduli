.class public final Li7/a;
.super LK0/d;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lo4/r;


# direct methods
.method public constructor <init>(Lo4/r;Lcom/tonyodev/fetch2/database/DownloadDatabase_Impl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li7/a;->e:Lo4/r;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LK0/q;-><init>(LK0/m;)V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR ABORT INTO `requests` (`_id`,`_namespace`,`_url`,`_file`,`_group`,`_priority`,`_headers`,`_written_bytes`,`_total_bytes`,`_status`,`_error`,`_network_type`,`_created`,`_tag`,`_enqueue_action`,`_identifier`,`_download_on_enqueue`,`_extras`,`_auto_retry_max_attempts`,`_auto_retry_attempts`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 2
    .line 3
    return-object v0
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
.end method

.method public final f(LP0/j;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lcom/tonyodev/fetch2/database/DownloadInfo;

    .line 2
    .line 3
    iget v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->s:I

    .line 4
    .line 5
    int-to-long v0, v0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-interface {p1, v2, v0, v1}, LO0/d;->I(IJ)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->t:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1, v1}, LO0/d;->v(I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {p1, v1, v0}, LO0/d;->m(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->u:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p1, v1}, LO0/d;->v(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-interface {p1, v1, v0}, LO0/d;->m(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :goto_1
    iget-object v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->v:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-interface {p1, v1}, LO0/d;->v(I)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    invoke-interface {p1, v1, v0}, LO0/d;->m(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_2
    iget v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->w:I

    .line 47
    .line 48
    int-to-long v0, v0

    .line 49
    const/4 v2, 0x5

    .line 50
    invoke-interface {p1, v2, v0, v1}, LO0/d;->I(IJ)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Li7/a;->e:Lo4/r;

    .line 54
    .line 55
    iget-object v0, v0, Lo4/r;->u:Ljava/lang/Object;

    .line 56
    .line 57
    iget v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->x:I

    .line 58
    .line 59
    const-string v1, "priority"

    .line 60
    .line 61
    invoke-static {v0, v1}, Landroidx/datastore/preferences/protobuf/g;->v(ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/g;->d(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/4 v1, 0x6

    .line 69
    int-to-long v2, v0

    .line 70
    invoke-interface {p1, v1, v2, v3}, LO0/d;->I(IJ)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->y:Ljava/util/Map;

    .line 74
    .line 75
    invoke-static {v0}, LK3/d;->w(Ljava/util/Map;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const/4 v1, 0x7

    .line 80
    invoke-interface {p1, v1, v0}, LO0/d;->m(ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-wide v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->z:J

    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    invoke-interface {p1, v2, v0, v1}, LO0/d;->I(IJ)V

    .line 88
    .line 89
    .line 90
    iget-wide v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->A:J

    .line 91
    .line 92
    const/16 v2, 0x9

    .line 93
    .line 94
    invoke-interface {p1, v2, v0, v1}, LO0/d;->I(IJ)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->B:Lh7/f;

    .line 98
    .line 99
    const-string v1, "status"

    .line 100
    .line 101
    invoke-static {v0, v1}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/16 v1, 0xa

    .line 105
    .line 106
    iget v0, v0, Lh7/f;->s:I

    .line 107
    .line 108
    int-to-long v2, v0

    .line 109
    invoke-interface {p1, v1, v2, v3}, LO0/d;->I(IJ)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->C:Lh7/b;

    .line 113
    .line 114
    const-string v1, "error"

    .line 115
    .line 116
    invoke-static {v0, v1}, Lv8/i;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const/16 v1, 0xb

    .line 120
    .line 121
    iget v0, v0, Lh7/b;->s:I

    .line 122
    .line 123
    int-to-long v2, v0

    .line 124
    invoke-interface {p1, v1, v2, v3}, LO0/d;->I(IJ)V

    .line 125
    .line 126
    .line 127
    iget v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->D:I

    .line 128
    .line 129
    const-string v1, "networkType"

    .line 130
    .line 131
    invoke-static {v0, v1}, Landroidx/datastore/preferences/protobuf/g;->v(ILjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/g;->c(I)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    const/16 v1, 0xc

    .line 139
    .line 140
    int-to-long v2, v0

    .line 141
    invoke-interface {p1, v1, v2, v3}, LO0/d;->I(IJ)V

    .line 142
    .line 143
    .line 144
    iget-wide v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->E:J

    .line 145
    .line 146
    const/16 v2, 0xd

    .line 147
    .line 148
    invoke-interface {p1, v2, v0, v1}, LO0/d;->I(IJ)V

    .line 149
    .line 150
    .line 151
    iget-object v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->F:Ljava/lang/String;

    .line 152
    .line 153
    const/16 v1, 0xe

    .line 154
    .line 155
    if-nez v0, :cond_3

    .line 156
    .line 157
    invoke-interface {p1, v1}, LO0/d;->v(I)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_3
    invoke-interface {p1, v1, v0}, LO0/d;->m(ILjava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :goto_3
    iget v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->G:I

    .line 165
    .line 166
    const-string v1, "enqueueAction"

    .line 167
    .line 168
    invoke-static {v0, v1}, Landroidx/datastore/preferences/protobuf/g;->v(ILjava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v0}, Lz/e;->d(I)I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    const/16 v1, 0xf

    .line 176
    .line 177
    int-to-long v2, v0

    .line 178
    invoke-interface {p1, v1, v2, v3}, LO0/d;->I(IJ)V

    .line 179
    .line 180
    .line 181
    iget-wide v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->H:J

    .line 182
    .line 183
    const/16 v2, 0x10

    .line 184
    .line 185
    invoke-interface {p1, v2, v0, v1}, LO0/d;->I(IJ)V

    .line 186
    .line 187
    .line 188
    iget-boolean v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->I:Z

    .line 189
    .line 190
    const/16 v1, 0x11

    .line 191
    .line 192
    int-to-long v2, v0

    .line 193
    invoke-interface {p1, v1, v2, v3}, LO0/d;->I(IJ)V

    .line 194
    .line 195
    .line 196
    iget-object v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->J:Lcom/tonyodev/fetch2core/Extras;

    .line 197
    .line 198
    invoke-static {v0}, LK3/d;->p(Lcom/tonyodev/fetch2core/Extras;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    const/16 v1, 0x12

    .line 203
    .line 204
    invoke-interface {p1, v1, v0}, LO0/d;->m(ILjava/lang/String;)V

    .line 205
    .line 206
    .line 207
    iget v0, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->K:I

    .line 208
    .line 209
    int-to-long v0, v0

    .line 210
    const/16 v2, 0x13

    .line 211
    .line 212
    invoke-interface {p1, v2, v0, v1}, LO0/d;->I(IJ)V

    .line 213
    .line 214
    .line 215
    iget p2, p2, Lcom/tonyodev/fetch2/database/DownloadInfo;->L:I

    .line 216
    .line 217
    int-to-long v0, p2

    .line 218
    const/16 p2, 0x14

    .line 219
    .line 220
    invoke-interface {p1, p2, v0, v1}, LO0/d;->I(IJ)V

    .line 221
    .line 222
    .line 223
    return-void
    .line 224
    .line 225
    .line 226
    .line 227
.end method
