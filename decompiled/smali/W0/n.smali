.class public final LW0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final p:Landroid/graphics/Matrix;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Matrix;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/PathMeasure;

.field public final g:LW0/k;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/Boolean;

.field public final o:Lw/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LW0/n;->p:Landroid/graphics/Matrix;

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

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LW0/n;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, LW0/n;->h:F

    .line 4
    iput v0, p0, LW0/n;->i:F

    .line 5
    iput v0, p0, LW0/n;->j:F

    .line 6
    iput v0, p0, LW0/n;->k:F

    const/16 v0, 0xff

    .line 7
    iput v0, p0, LW0/n;->l:I

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, LW0/n;->m:Ljava/lang/String;

    .line 9
    iput-object v0, p0, LW0/n;->n:Ljava/lang/Boolean;

    .line 10
    new-instance v0, Lw/e;

    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lw/i;-><init>(I)V

    .line 12
    iput-object v0, p0, LW0/n;->o:Lw/e;

    .line 13
    new-instance v0, LW0/k;

    invoke-direct {v0}, LW0/k;-><init>()V

    iput-object v0, p0, LW0/n;->g:LW0/k;

    .line 14
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LW0/n;->a:Landroid/graphics/Path;

    .line 15
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LW0/n;->b:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(LW0/n;)V
    .locals 3

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LW0/n;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 18
    iput v0, p0, LW0/n;->h:F

    .line 19
    iput v0, p0, LW0/n;->i:F

    .line 20
    iput v0, p0, LW0/n;->j:F

    .line 21
    iput v0, p0, LW0/n;->k:F

    const/16 v0, 0xff

    .line 22
    iput v0, p0, LW0/n;->l:I

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, LW0/n;->m:Ljava/lang/String;

    .line 24
    iput-object v0, p0, LW0/n;->n:Ljava/lang/Boolean;

    .line 25
    new-instance v0, Lw/e;

    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, v1}, Lw/i;-><init>(I)V

    .line 27
    iput-object v0, p0, LW0/n;->o:Lw/e;

    .line 28
    new-instance v1, LW0/k;

    iget-object v2, p1, LW0/n;->g:LW0/k;

    invoke-direct {v1, v2, v0}, LW0/k;-><init>(LW0/k;Lw/e;)V

    iput-object v1, p0, LW0/n;->g:LW0/k;

    .line 29
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, LW0/n;->a:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, LW0/n;->a:Landroid/graphics/Path;

    .line 30
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, LW0/n;->b:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, LW0/n;->b:Landroid/graphics/Path;

    .line 31
    iget v1, p1, LW0/n;->h:F

    iput v1, p0, LW0/n;->h:F

    .line 32
    iget v1, p1, LW0/n;->i:F

    iput v1, p0, LW0/n;->i:F

    .line 33
    iget v1, p1, LW0/n;->j:F

    iput v1, p0, LW0/n;->j:F

    .line 34
    iget v1, p1, LW0/n;->k:F

    iput v1, p0, LW0/n;->k:F

    .line 35
    iget v1, p1, LW0/n;->l:I

    iput v1, p0, LW0/n;->l:I

    .line 36
    iget-object v1, p1, LW0/n;->m:Ljava/lang/String;

    iput-object v1, p0, LW0/n;->m:Ljava/lang/String;

    .line 37
    iget-object v1, p1, LW0/n;->m:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 38
    invoke-virtual {v0, v1, p0}, Lw/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :cond_0
    iget-object p1, p1, LW0/n;->n:Ljava/lang/Boolean;

    iput-object p1, p0, LW0/n;->n:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a(LW0/k;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V
    .locals 21

    move-object/from16 v6, p1

    const/4 v7, 0x1

    .line 1
    iget-object v0, v6, LW0/k;->a:Landroid/graphics/Matrix;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 2
    iget-object v0, v6, LW0/k;->j:Landroid/graphics/Matrix;

    iget-object v2, v6, LW0/k;->a:Landroid/graphics/Matrix;

    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 3
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    const/4 v8, 0x0

    move v9, v8

    .line 4
    :goto_0
    iget-object v0, v6, LW0/k;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v9, v1, :cond_17

    .line 5
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW0/l;

    .line 6
    instance-of v1, v0, LW0/k;

    if-eqz v1, :cond_0

    .line 7
    move-object v1, v0

    check-cast v1, LW0/k;

    move-object/from16 v0, p0

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    .line 8
    invoke-virtual/range {v0 .. v5}, LW0/n;->a(LW0/k;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    move-object v1, v0

    :goto_1
    move/from16 v10, p5

    move/from16 v19, v7

    goto/16 :goto_e

    :cond_0
    move-object/from16 v1, p0

    move-object/from16 v3, p3

    .line 9
    instance-of v4, v0, LW0/m;

    if-eqz v4, :cond_16

    .line 10
    check-cast v0, LW0/m;

    move/from16 v4, p4

    int-to-float v5, v4

    .line 11
    iget v10, v1, LW0/n;->j:F

    div-float/2addr v5, v10

    move/from16 v10, p5

    int-to-float v11, v10

    .line 12
    iget v12, v1, LW0/n;->k:F

    div-float/2addr v11, v12

    .line 13
    invoke-static {v5, v11}, Ljava/lang/Math;->min(FF)F

    move-result v12

    .line 14
    iget-object v13, v1, LW0/n;->c:Landroid/graphics/Matrix;

    invoke-virtual {v13, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 15
    invoke-virtual {v13, v5, v11}, Landroid/graphics/Matrix;->postScale(FF)Z

    const/4 v14, 0x4

    .line 16
    new-array v14, v14, [F

    fill-array-data v14, :array_0

    .line 17
    invoke-virtual {v2, v14}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 18
    aget v15, v14, v8

    move/from16 p2, v12

    const/high16 v16, 0x3f800000    # 1.0f

    float-to-double v11, v15

    aget v15, v14, v7

    const/16 v17, 0x0

    float-to-double v5, v15

    invoke-static {v11, v12, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    double-to-float v5, v5

    const/4 v6, 0x2

    .line 19
    aget v11, v14, v6

    float-to-double v11, v11

    const/4 v15, 0x3

    move/from16 v18, v6

    aget v6, v14, v15

    move/from16 v19, v7

    move/from16 v20, v8

    float-to-double v7, v6

    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v6

    double-to-float v6, v6

    .line 20
    aget v7, v14, v20

    aget v8, v14, v19

    aget v11, v14, v18

    aget v12, v14, v15

    mul-float/2addr v7, v12

    mul-float/2addr v8, v11

    sub-float/2addr v7, v8

    .line 21
    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    move-result v5

    cmpl-float v6, v5, v17

    if-lez v6, :cond_1

    .line 22
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v6

    div-float/2addr v6, v5

    goto :goto_2

    :cond_1
    move/from16 v6, v17

    :goto_2
    cmpl-float v5, v6, v17

    if-nez v5, :cond_2

    goto/16 :goto_d

    .line 23
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    iget-object v5, v1, LW0/n;->a:Landroid/graphics/Path;

    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    .line 25
    iget-object v7, v0, LW0/m;->a:[LL/f;

    if-eqz v7, :cond_3

    .line 26
    invoke-static {v7, v5}, LL/f;->b([LL/f;Landroid/graphics/Path;)V

    .line 27
    :cond_3
    iget-object v7, v1, LW0/n;->b:Landroid/graphics/Path;

    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 28
    instance-of v8, v0, LW0/i;

    if-eqz v8, :cond_5

    .line 29
    iget v0, v0, LW0/m;->c:I

    if-nez v0, :cond_4

    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_3

    :cond_4
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    :goto_3
    invoke-virtual {v7, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 30
    invoke-virtual {v7, v5, v13}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 31
    invoke-virtual {v3, v7}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    goto/16 :goto_d

    .line 32
    :cond_5
    check-cast v0, LW0/j;

    .line 33
    iget v8, v0, LW0/j;->i:F

    cmpl-float v11, v8, v17

    if-nez v11, :cond_6

    iget v11, v0, LW0/j;->j:F

    cmpl-float v11, v11, v16

    if-eqz v11, :cond_9

    .line 34
    :cond_6
    iget v11, v0, LW0/j;->k:F

    add-float/2addr v8, v11

    rem-float v8, v8, v16

    .line 35
    iget v12, v0, LW0/j;->j:F

    add-float/2addr v12, v11

    rem-float v12, v12, v16

    .line 36
    iget-object v11, v1, LW0/n;->f:Landroid/graphics/PathMeasure;

    if-nez v11, :cond_7

    .line 37
    new-instance v11, Landroid/graphics/PathMeasure;

    invoke-direct {v11}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object v11, v1, LW0/n;->f:Landroid/graphics/PathMeasure;

    .line 38
    :cond_7
    iget-object v11, v1, LW0/n;->f:Landroid/graphics/PathMeasure;

    move/from16 v14, v20

    invoke-virtual {v11, v5, v14}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 39
    iget-object v11, v1, LW0/n;->f:Landroid/graphics/PathMeasure;

    invoke-virtual {v11}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v11

    mul-float/2addr v8, v11

    mul-float/2addr v12, v11

    .line 40
    invoke-virtual {v5}, Landroid/graphics/Path;->reset()V

    cmpl-float v15, v8, v12

    if-lez v15, :cond_8

    .line 41
    iget-object v15, v1, LW0/n;->f:Landroid/graphics/PathMeasure;

    move/from16 v14, v19

    invoke-virtual {v15, v8, v11, v5, v14}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 42
    iget-object v8, v1, LW0/n;->f:Landroid/graphics/PathMeasure;

    move/from16 v11, v17

    invoke-virtual {v8, v11, v12, v5, v14}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    goto :goto_4

    :cond_8
    move/from16 v11, v17

    move/from16 v14, v19

    .line 43
    iget-object v15, v1, LW0/n;->f:Landroid/graphics/PathMeasure;

    invoke-virtual {v15, v8, v12, v5, v14}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 44
    :goto_4
    invoke-virtual {v5, v11, v11}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 45
    :cond_9
    invoke-virtual {v7, v5, v13}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 46
    iget-object v5, v0, LW0/j;->f:LA1/q;

    .line 47
    iget-object v8, v5, LA1/q;->c:Ljava/lang/Object;

    check-cast v8, Landroid/graphics/Shader;

    if-eqz v8, :cond_a

    goto :goto_5

    .line 48
    :cond_a
    iget v8, v5, LA1/q;->b:I

    if-eqz v8, :cond_b

    :goto_5
    const/4 v8, 0x1

    goto :goto_6

    :cond_b
    const/4 v8, 0x0

    :goto_6
    const/4 v12, 0x0

    const/16 v14, 0xff

    const/high16 v15, 0x437f0000    # 255.0f

    if-eqz v8, :cond_f

    .line 49
    iget-object v8, v1, LW0/n;->e:Landroid/graphics/Paint;

    if-nez v8, :cond_c

    .line 50
    new-instance v8, Landroid/graphics/Paint;

    const/4 v11, 0x1

    const v16, 0xffffff

    invoke-direct {v8, v11}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v8, v1, LW0/n;->e:Landroid/graphics/Paint;

    .line 51
    sget-object v11, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_7

    :cond_c
    const v16, 0xffffff

    .line 52
    :goto_7
    iget-object v8, v1, LW0/n;->e:Landroid/graphics/Paint;

    .line 53
    iget-object v11, v5, LA1/q;->c:Ljava/lang/Object;

    check-cast v11, Landroid/graphics/Shader;

    if-eqz v11, :cond_d

    .line 54
    invoke-virtual {v11, v13}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 55
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 56
    iget v5, v0, LW0/j;->h:F

    mul-float/2addr v5, v15

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v8, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    move/from16 v17, v15

    goto :goto_8

    .line 57
    :cond_d
    invoke-virtual {v8, v12}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 58
    invoke-virtual {v8, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 59
    iget v5, v5, LA1/q;->b:I

    .line 60
    iget v11, v0, LW0/j;->h:F

    sget-object v17, LW0/q;->B:Landroid/graphics/PorterDuff$Mode;

    move/from16 v17, v15

    .line 61
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v15

    and-int v5, v5, v16

    int-to-float v15, v15

    mul-float/2addr v15, v11

    float-to-int v11, v15

    shl-int/lit8 v11, v11, 0x18

    or-int/2addr v5, v11

    .line 62
    invoke-virtual {v8, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 63
    :goto_8
    invoke-virtual {v8, v12}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 64
    iget v5, v0, LW0/m;->c:I

    if-nez v5, :cond_e

    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_9

    :cond_e
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    :goto_9
    invoke-virtual {v7, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 65
    invoke-virtual {v3, v7, v8}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_a

    :cond_f
    move/from16 v17, v15

    const v16, 0xffffff

    .line 66
    :goto_a
    iget-object v5, v0, LW0/j;->d:LA1/q;

    .line 67
    iget-object v8, v5, LA1/q;->c:Ljava/lang/Object;

    check-cast v8, Landroid/graphics/Shader;

    if-eqz v8, :cond_10

    goto :goto_b

    .line 68
    :cond_10
    iget v8, v5, LA1/q;->b:I

    if-eqz v8, :cond_15

    .line 69
    :goto_b
    iget-object v8, v1, LW0/n;->d:Landroid/graphics/Paint;

    if-nez v8, :cond_11

    .line 70
    new-instance v8, Landroid/graphics/Paint;

    const/4 v11, 0x1

    invoke-direct {v8, v11}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v8, v1, LW0/n;->d:Landroid/graphics/Paint;

    .line 71
    sget-object v11, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 72
    :cond_11
    iget-object v8, v1, LW0/n;->d:Landroid/graphics/Paint;

    .line 73
    iget-object v11, v0, LW0/j;->m:Landroid/graphics/Paint$Join;

    if-eqz v11, :cond_12

    .line 74
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 75
    :cond_12
    iget-object v11, v0, LW0/j;->l:Landroid/graphics/Paint$Cap;

    if-eqz v11, :cond_13

    .line 76
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 77
    :cond_13
    iget v11, v0, LW0/j;->n:F

    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 78
    iget-object v11, v5, LA1/q;->c:Ljava/lang/Object;

    check-cast v11, Landroid/graphics/Shader;

    if-eqz v11, :cond_14

    .line 79
    invoke-virtual {v11, v13}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 80
    invoke-virtual {v8, v11}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 81
    iget v5, v0, LW0/j;->g:F

    mul-float v5, v5, v17

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v8, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_c

    .line 82
    :cond_14
    invoke-virtual {v8, v12}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 83
    invoke-virtual {v8, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 84
    iget v5, v5, LA1/q;->b:I

    .line 85
    iget v11, v0, LW0/j;->g:F

    sget-object v13, LW0/q;->B:Landroid/graphics/PorterDuff$Mode;

    .line 86
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v13

    and-int v5, v5, v16

    int-to-float v13, v13

    mul-float/2addr v13, v11

    float-to-int v11, v13

    shl-int/lit8 v11, v11, 0x18

    or-int/2addr v5, v11

    .line 87
    invoke-virtual {v8, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 88
    :goto_c
    invoke-virtual {v8, v12}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    mul-float v12, p2, v6

    .line 89
    iget v0, v0, LW0/j;->e:F

    mul-float/2addr v0, v12

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 90
    invoke-virtual {v3, v7, v8}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_15
    :goto_d
    const/16 v19, 0x1

    goto :goto_e

    :cond_16
    move/from16 v4, p4

    goto/16 :goto_1

    :goto_e
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v6, p1

    move/from16 v7, v19

    const/4 v8, 0x0

    goto/16 :goto_0

    :cond_17
    move-object/from16 v1, p0

    move-object/from16 v3, p3

    .line 91
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public getAlpha()F
    .locals 2

    .line 1
    invoke-virtual {p0}, LW0/n;->getRootAlpha()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/high16 v1, 0x437f0000    # 255.0f

    .line 7
    .line 8
    div-float/2addr v0, v1

    .line 9
    return v0
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

.method public getRootAlpha()I
    .locals 1

    .line 1
    iget v0, p0, LW0/n;->l:I

    .line 2
    .line 3
    return v0
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

.method public setAlpha(F)V
    .locals 1

    .line 1
    const/high16 v0, 0x437f0000    # 255.0f

    .line 2
    .line 3
    mul-float/2addr p1, v0

    .line 4
    float-to-int p1, p1

    .line 5
    invoke-virtual {p0, p1}, LW0/n;->setRootAlpha(I)V

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

.method public setRootAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, LW0/n;->l:I

    .line 2
    .line 3
    return-void
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
