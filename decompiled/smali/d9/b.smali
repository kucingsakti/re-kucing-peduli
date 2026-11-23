.class public final Ld9/b;
.super LB1/a;
.source "SourceFile"


# instance fields
.field public final synthetic t:I

.field public final synthetic u:Lc9/k;


# direct methods
.method public synthetic constructor <init>(Lc9/k;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld9/b;->t:I

    iput-object p1, p0, Ld9/b;->u:Lc9/k;

    const/4 p1, 0x5

    invoke-direct {p0, p1}, LB1/a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final T0([Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Ld9/b;->t:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ld9/b;->u:Lc9/k;

    .line 9
    .line 10
    check-cast v0, LV/h;

    .line 11
    .line 12
    iget-object v0, v0, LV/h;->t:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ld9/e;

    .line 15
    .line 16
    iput-object p1, v0, Ld9/e;->h:[Ljava/lang/String;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string v0, "Argument for @NotNull parameter \'result\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :pswitch_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Ld9/b;->u:Lc9/k;

    .line 30
    .line 31
    check-cast v0, Ld9/c;

    .line 32
    .line 33
    iget-object v0, v0, Ld9/c;->t:Ld9/e;

    .line 34
    .line 35
    iput-object p1, v0, Ld9/e;->e:[Ljava/lang/String;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string v0, "Argument for @NotNull parameter \'result\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :pswitch_1
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Ld9/b;->u:Lc9/k;

    .line 49
    .line 50
    check-cast v0, Ld9/c;

    .line 51
    .line 52
    iget-object v0, v0, Ld9/c;->t:Ld9/e;

    .line 53
    .line 54
    iput-object p1, v0, Ld9/e;->d:[Ljava/lang/String;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    const-string v0, "Argument for @NotNull parameter \'result\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null"

    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
