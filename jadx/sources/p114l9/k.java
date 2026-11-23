package p114l9;

import C8.u;
import java.util.LinkedHashSet;
import java.util.Set;
import p210v8.i;
import p210v8.l;
import p210v8.v;

/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ u[] f13005W;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final j f13006A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final j f13007B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final j f13008C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final j f13009D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final j f13010E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final j f13011F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final j f13012G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final j f13013H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final j f13014I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final j f13015J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final j f13016K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final j f13017L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final j f13018M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final j f13019N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final j f13020O;
    public final j P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final j f13021Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final j f13022R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final j f13023S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final j f13024T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final j f13025U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final j f13026V;
    public boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f13027b = new j(b.f12974d, this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f13028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f13029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f13030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f13031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f13032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f13033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f13034i;
    public final j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f13035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f13036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f13037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f13038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f13039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f13040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f13041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f13042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f13043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f13044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j f13045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f13046v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f13047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j f13048x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f13049y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j f13050z;

    static {
        v vVar = p210v8.u.a;
        f13005W = new u[]{vVar.d(new l(vVar.b(k.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), vVar.d(new l(vVar.b(k.class), "withDefinedIn", "getWithDefinedIn()Z")), vVar.d(new l(vVar.b(k.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), vVar.d(new l(vVar.b(k.class), "modifiers", "getModifiers()Ljava/util/Set;")), vVar.d(new l(vVar.b(k.class), "startFromName", "getStartFromName()Z")), vVar.d(new l(vVar.b(k.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), vVar.d(new l(vVar.b(k.class), "debugMode", "getDebugMode()Z")), vVar.d(new l(vVar.b(k.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), vVar.d(new l(vVar.b(k.class), "verbose", "getVerbose()Z")), vVar.d(new l(vVar.b(k.class), "unitReturnType", "getUnitReturnType()Z")), vVar.d(new l(vVar.b(k.class), "withoutReturnType", "getWithoutReturnType()Z")), vVar.d(new l(vVar.b(k.class), "enhancedTypes", "getEnhancedTypes()Z")), vVar.d(new l(vVar.b(k.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), vVar.d(new l(vVar.b(k.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), vVar.d(new l(vVar.b(k.class), "renderDefaultModality", "getRenderDefaultModality()Z")), vVar.d(new l(vVar.b(k.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), vVar.d(new l(vVar.b(k.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), vVar.d(new l(vVar.b(k.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), vVar.d(new l(vVar.b(k.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), vVar.d(new l(vVar.b(k.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), vVar.d(new l(vVar.b(k.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), vVar.d(new l(vVar.b(k.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), vVar.d(new l(vVar.b(k.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), vVar.d(new l(vVar.b(k.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), vVar.d(new l(vVar.b(k.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), vVar.d(new l(vVar.b(k.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), vVar.d(new l(vVar.b(k.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), vVar.d(new l(vVar.b(k.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), vVar.d(new l(vVar.b(k.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), vVar.d(new l(vVar.b(k.class), "receiverAfterName", "getReceiverAfterName()Z")), vVar.d(new l(vVar.b(k.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), vVar.d(new l(vVar.b(k.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), vVar.d(new l(vVar.b(k.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), vVar.d(new l(vVar.b(k.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), vVar.d(new l(vVar.b(k.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), vVar.d(new l(vVar.b(k.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), vVar.d(new l(vVar.b(k.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), vVar.d(new l(vVar.b(k.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), vVar.d(new l(vVar.b(k.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), vVar.d(new l(vVar.b(k.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), vVar.d(new l(vVar.b(k.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), vVar.d(new l(vVar.b(k.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), vVar.d(new l(vVar.b(k.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), vVar.d(new l(vVar.b(k.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), vVar.d(new l(vVar.b(k.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), vVar.d(new l(vVar.b(k.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), vVar.d(new l(vVar.b(k.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), vVar.d(new l(vVar.b(k.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public k() {
        Boolean bool = Boolean.TRUE;
        this.f13028c = new j(bool, this);
        this.f13029d = new j(bool, this);
        this.f13030e = new j(h.f12996t, this);
        Boolean bool2 = Boolean.FALSE;
        this.f13031f = new j(bool2, this);
        this.f13032g = new j(bool2, this);
        this.f13033h = new j(bool2, this);
        this.f13034i = new j(bool2, this);
        this.j = new j(bool2, this);
        this.f13035k = new j(bool, this);
        this.f13036l = new j(bool2, this);
        this.f13037m = new j(bool2, this);
        this.f13038n = new j(bool2, this);
        this.f13039o = new j(bool, this);
        this.f13040p = new j(bool, this);
        this.f13041q = new j(bool2, this);
        this.f13042r = new j(bool2, this);
        this.f13043s = new j(bool2, this);
        this.f13044t = new j(bool2, this);
        this.f13045u = new j(bool2, this);
        this.f13046v = new j(bool2, this);
        this.f13047w = new j(bool2, this);
        this.f13048x = new j(f.f12980w, this);
        this.f13049y = new j(f.f12979v, this);
        this.f13050z = new j(bool, this);
        this.f13006A = new j(n.f13052t, this);
        this.f13007B = new j(d.a, this);
        this.f13008C = new j(s.f13061s, this);
        this.f13009D = new j(o.f13054s, this);
        this.f13010E = new j(bool2, this);
        this.f13011F = new j(bool2, this);
        this.f13012G = new j(p.f13058s, this);
        this.f13013H = new j(bool2, this);
        this.f13014I = new j(bool2, this);
        this.f13015J = new j(p086i8.u.f12330s, this);
        this.f13016K = new j(l.a, this);
        this.f13017L = new j(null, this);
        this.f13018M = new j(a.NO_ARGUMENTS, this);
        this.f13019N = new j(bool2, this);
        this.f13020O = new j(bool, this);
        this.P = new j(bool, this);
        this.f13021Q = new j(bool2, this);
        this.f13022R = new j(bool, this);
        this.f13023S = new j(bool, this);
        this.f13024T = new j(bool2, this);
        this.f13025U = new j(bool2, this);
        this.f13026V = new j(bool, this);
    }

    @Override // p114l9.i
    public final void a() {
        this.f13010E.b(f13005W[29], Boolean.TRUE);
    }

    @Override // p114l9.i
    public final void b() {
        this.f13033h.b(f13005W[6], Boolean.TRUE);
    }

    @Override // p114l9.i
    public final void c() {
        this.f13011F.b(f13005W[30], Boolean.TRUE);
    }

    @Override // p114l9.i
    public final void d(Set set) {
        i.f(set, "<set-?>");
        this.f13030e.b(f13005W[3], set);
    }

    @Override // p114l9.i
    public final void e(c cVar) {
        this.f13027b.b(f13005W[0], cVar);
    }

    @Override // p114l9.i
    public final void f() {
        this.f13031f.b(f13005W[4], Boolean.TRUE);
    }

    @Override // p114l9.i
    public final void g() {
        this.f13028c.b(f13005W[1], Boolean.FALSE);
    }

    @Override // p114l9.i
    public final void h(o oVar) {
        this.f13009D.b(f13005W[28], oVar);
    }

    @Override // p114l9.i
    public final Set i() {
        return (Set) this.f13016K.a(f13005W[35], this);
    }

    @Override // p114l9.i
    public final void j(LinkedHashSet linkedHashSet) {
        this.f13016K.b(f13005W[35], linkedHashSet);
    }

    @Override // p114l9.i
    public final void k() {
        this.f13046v.b(f13005W[20], Boolean.TRUE);
    }

    @Override // p114l9.i
    public final void l() {
        q qVar = s.f13062t;
        this.f13008C.b(f13005W[27], qVar);
    }

    @Override // p114l9.i
    public final void m() {
        this.f13047w.b(f13005W[21], Boolean.TRUE);
    }

    public final boolean n() {
        return ((Boolean) this.f13033h.a(f13005W[6], this)).booleanValue();
    }
}
