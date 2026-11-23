.class public final LA9/V;
.super LA9/W;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:LA9/W;


# direct methods
.method public synthetic constructor <init>(LA9/W;I)V
    .locals 0

    .line 1
    iput p2, p0, LA9/V;->b:I

    iput-object p1, p0, LA9/V;->c:LA9/W;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget v0, p0, LA9/V;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, LA9/W;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LA9/V;->c:LA9/W;

    .line 12
    .line 13
    invoke-virtual {v0}, LA9/W;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public b()Z
    .locals 1

    .line 1
    iget v0, p0, LA9/V;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, LA9/W;->b()Z

    move-result v0

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(LM8/h;)LM8/h;
    .locals 1

    .line 1
    iget v0, p0, LA9/V;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "annotations"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LA9/V;->c:LA9/W;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, LA9/W;->c(LM8/h;)LM8/h;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :pswitch_0
    const-string v0, "annotations"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, LA9/V;->c:LA9/W;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, LA9/W;->c(LM8/h;)LM8/h;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 32
    .line 33
.end method

.method public final d(LA9/y;)LA9/S;
    .locals 3

    .line 1
    iget v0, p0, LA9/V;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA9/V;->c:LA9/W;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LA9/W;->d(LA9/y;)LA9/S;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, LA9/y;->D()LA9/O;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, LA9/O;->w()LL8/g;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    instance-of v2, p1, LL8/P;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    move-object v1, p1

    .line 28
    check-cast v1, LL8/P;

    .line 29
    .line 30
    :cond_0
    invoke-static {v0, v1}, Lt1/Y;->j(LA9/S;LL8/P;)LA9/S;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :cond_1
    return-object v1

    .line 35
    :pswitch_0
    iget-object v0, p0, LA9/V;->c:LA9/W;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, LA9/W;->d(LA9/y;)LA9/S;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final e()Z
    .locals 1

    .line 1
    iget v0, p0, LA9/V;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA9/V;->c:LA9/W;

    .line 7
    .line 8
    invoke-virtual {v0}, LA9/W;->e()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0

    .line 13
    :pswitch_0
    iget-object v0, p0, LA9/V;->c:LA9/W;

    .line 14
    .line 15
    invoke-virtual {v0}, LA9/W;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final f(ILA9/y;)LA9/y;
    .locals 1

    .line 1
    iget v0, p0, LA9/V;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "topLevelType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "position"

    .line 12
    .line 13
    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/g;->p(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LA9/V;->c:LA9/W;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, LA9/W;->f(ILA9/y;)LA9/y;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    const-string v0, "topLevelType"

    .line 24
    .line 25
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "position"

    .line 29
    .line 30
    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/g;->p(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, LA9/V;->c:LA9/W;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, LA9/W;->f(ILA9/y;)LA9/y;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
