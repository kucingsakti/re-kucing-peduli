.class public final synthetic LY8/l;
.super Lv8/g;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# instance fields
.field public final synthetic A:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LY8/l;->A:I

    invoke-direct {p0, p1, p3}, Lv8/g;-><init>(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final d()LC8/e;
    .locals 2

    .line 1
    iget v0, p0, LY8/l;->A:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lv8/u;->a:Lv8/v;

    .line 7
    .line 8
    const-class v1, Ly9/e;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    sget-object v0, Lv8/u;->a:Lv8/v;

    .line 16
    .line 17
    const-class v1, LY8/p;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :pswitch_1
    sget-object v0, Lv8/u;->a:Lv8/v;

    .line 25
    .line 26
    const-class v1, LY8/p;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LY8/l;->A:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V"

    return-object v0

    :pswitch_0
    const-string v0, "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;"

    return-object v0

    :pswitch_1
    const-string v0, "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LY8/l;->A:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "<init>"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "searchMethodsInSupertypesWithoutBuiltinMagic"

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    const-string v0, "searchMethodsByNameWithoutBuiltinMagic"

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LY8/l;->A:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LB9/f;

    .line 7
    .line 8
    const-string v0, "p0"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ly9/e;

    .line 14
    .line 15
    iget-object v1, p0, Lv8/b;->t:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ly9/g;

    .line 18
    .line 19
    invoke-direct {v0, v1, p1}, Ly9/e;-><init>(Ly9/g;LB9/f;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    check-cast p1, Lj9/f;

    .line 24
    .line 25
    const-string v0, "p0"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lv8/b;->t:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LY8/p;

    .line 33
    .line 34
    invoke-static {v0, p1}, LY8/p;->w(LY8/p;Lj9/f;)Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :pswitch_1
    check-cast p1, Lj9/f;

    .line 40
    .line 41
    const-string v0, "p0"

    .line 42
    .line 43
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lv8/b;->t:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, LY8/p;

    .line 49
    .line 50
    invoke-static {v0, p1}, LY8/p;->v(LY8/p;Lj9/f;)Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
