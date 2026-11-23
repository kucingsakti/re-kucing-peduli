.class public final Lj7/a;
.super LL0/a;
.source "SourceFile"


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    .line 1
    iput p3, p0, Lj7/a;->c:I

    invoke-direct {p0, p1, p2}, LL0/a;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(LP0/c;)V
    .locals 1

    .line 1
    iget v0, p0, Lj7/a;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "ALTER TABLE \'requests\' ADD COLUMN \'_enqueue_action\' INTEGER NOT NULL DEFAULT 0"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, LP0/c;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    const-string v0, "ALTER TABLE \'requests\' ADD COLUMN \'_identifier\' INTEGER NOT NULL DEFAULT 0"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, LP0/c;->h(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    const-string v0, "ALTER TABLE \'requests\' ADD COLUMN \'_auto_retry_max_attempts\' INTEGER NOT NULL DEFAULT \'0\'"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, LP0/c;->h(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "ALTER TABLE \'requests\' ADD COLUMN \'_auto_retry_attempts\' INTEGER NOT NULL DEFAULT \'0\'"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, LP0/c;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_2
    const-string v0, "ALTER TABLE \'requests\' ADD COLUMN \'_tag\' TEXT NULL DEFAULT NULL"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, LP0/c;->h(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_3
    const-string v0, "ALTER TABLE \'requests\' ADD COLUMN \'_download_on_enqueue\' INTEGER NOT NULL DEFAULT 1"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, LP0/c;->h(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_4
    const-string v0, "ALTER TABLE \'requests\' ADD COLUMN \'_extras\' TEXT NOT NULL DEFAULT \'{}\'"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, LP0/c;->h(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
