/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 15 16:22:01 GMT 2023
 */

package alfio.controller.api.v2.model;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class User_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "alfio.controller.api.v2.model.User"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    System.setProperties((java.util.Properties) defaultProperties.clone());
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    System.setProperties((java.util.Properties) defaultProperties.clone());
    System.setProperty("user.dir", "/Users/amirdeljouyi/Software Development/Web Development/Clonned Projects/alf.io-2.0.4");
    System.setProperty("java.io.tmpdir", "/var/folders/yc/kykqf2wd0tgdw_85fbvlyj680000gn/T/");
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(User_ESTest_scaffolding.class.getClassLoader() ,
      "alfio.model.user.User$Type",
      "alfio.model.user.PublicUserProfile$1",
      "alfio.controller.api.v2.model.User",
      "alfio.model.user.PublicUserProfile",
      "alfio.model.user.User",
      "alfio.model.BillingDetails",
      "com.fasterxml.jackson.core.type.TypeReference"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(User_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "alfio.controller.api.v2.model.User",
      "alfio.model.user.User$Type",
      "alfio.model.TicketReservationInvoicingAdditionalInfo$ItalianEInvoicing",
      "alfio.model.TicketReservationInvoicingAdditionalInfo",
      "alfio.model.user.PublicUserProfile",
      "alfio.model.BillingDetails",
      "com.fasterxml.jackson.core.type.TypeReference",
      "alfio.model.user.PublicUserProfile$1",
      "com.google.gson.GsonBuilder",
      "com.google.gson.internal.Excluder",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.FieldNamingPolicy",
      "com.google.gson.ToNumberPolicy",
      "com.google.gson.reflect.TypeToken",
      "com.google.gson.internal.$Gson$Preconditions",
      "com.google.gson.internal.$Gson$Types",
      "com.google.gson.Gson",
      "com.fatboyindustrial.gsonjavatime.Converters$1",
      "com.fatboyindustrial.gsonjavatime.Converters$2",
      "com.fatboyindustrial.gsonjavatime.Converters$3",
      "com.fatboyindustrial.gsonjavatime.Converters$4",
      "com.fatboyindustrial.gsonjavatime.Converters$5",
      "com.fatboyindustrial.gsonjavatime.Converters$6",
      "com.fatboyindustrial.gsonjavatime.Converters$7",
      "com.fatboyindustrial.gsonjavatime.Converters",
      "com.fatboyindustrial.gsonjavatime.LocalDateConverter",
      "com.google.gson.TypeAdapter",
      "com.google.gson.internal.bind.TreeTypeAdapter",
      "com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory",
      "com.fatboyindustrial.gsonjavatime.LocalDateTimeConverter",
      "com.fatboyindustrial.gsonjavatime.LocalTimeConverter",
      "com.fatboyindustrial.gsonjavatime.OffsetDateTimeConverter",
      "com.fatboyindustrial.gsonjavatime.OffsetTimeConverter",
      "com.fatboyindustrial.gsonjavatime.ZonedDateTimeConverter",
      "com.fatboyindustrial.gsonjavatime.InstantConverter",
      "com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType$1",
      "com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType",
      "com.google.gson.internal.sql.SqlTypesSupport$1",
      "com.google.gson.internal.sql.SqlTypesSupport$2",
      "com.google.gson.internal.sql.SqlDateTypeAdapter$1",
      "com.google.gson.internal.sql.SqlDateTypeAdapter",
      "com.google.gson.internal.sql.SqlTimeTypeAdapter$1",
      "com.google.gson.internal.sql.SqlTimeTypeAdapter",
      "com.google.gson.internal.sql.SqlTimestampTypeAdapter$1",
      "com.google.gson.internal.sql.SqlTimestampTypeAdapter",
      "com.google.gson.internal.sql.SqlTypesSupport",
      "com.google.gson.internal.ConstructorConstructor",
      "com.google.gson.internal.bind.TypeAdapters$1",
      "com.google.gson.TypeAdapter$1",
      "com.google.gson.internal.bind.TypeAdapters$31",
      "com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.gson.internal.bind.TypeAdapters$32",
      "com.google.gson.internal.bind.TypeAdapters$5",
      "com.google.gson.internal.bind.TypeAdapters$6",
      "com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.gson.internal.bind.TypeAdapters$12",
      "com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.gson.internal.bind.TypeAdapters$19",
      "com.google.gson.internal.bind.TypeAdapters$20",
      "com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.gson.internal.bind.TypeAdapters$22",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters$34",
      "com.google.gson.internal.bind.TypeAdapters$24",
      "com.google.gson.internal.bind.TypeAdapters$25",
      "com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.gson.internal.bind.TypeAdapters$33",
      "com.google.gson.internal.bind.TypeAdapters$27",
      "com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.gson.internal.bind.TypeAdapters$29",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.google.gson.internal.bind.ObjectTypeAdapter$1",
      "com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.google.gson.Gson$1",
      "com.google.gson.Gson$2",
      "com.google.gson.internal.bind.NumberTypeAdapter$1",
      "com.google.gson.internal.bind.NumberTypeAdapter",
      "com.google.gson.Gson$4",
      "com.google.gson.Gson$5",
      "com.google.gson.internal.bind.DateTypeAdapter$1",
      "com.google.gson.internal.bind.DateTypeAdapter",
      "com.google.gson.internal.bind.ArrayTypeAdapter$1",
      "com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory",
      "com.google.gson.internal.bind.MapTypeAdapterFactory",
      "com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory",
      "com.fasterxml.jackson.core.TreeCodec",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.ext.Java7SupportImpl",
      "com.fasterxml.jackson.databind.util.ClassUtil",
      "com.fasterxml.jackson.databind.ext.Java7Support",
      "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector",
      "com.fasterxml.jackson.databind.util.LRUMap",
      "com.fasterxml.jackson.databind.cfg.BaseSettings",
      "com.fasterxml.jackson.databind.type.TypeParser",
      "com.fasterxml.jackson.databind.type.TypeBindings",
      "com.fasterxml.jackson.core.type.ResolvedType",
      "com.fasterxml.jackson.databind.JavaType",
      "com.fasterxml.jackson.databind.type.TypeBase",
      "com.fasterxml.jackson.databind.type.SimpleType",
      "com.fasterxml.jackson.databind.type.TypeFactory",
      "com.fasterxml.jackson.databind.util.StdDateFormat",
      "com.fasterxml.jackson.core.Base64Variant",
      "com.fasterxml.jackson.core.Base64Variant$PaddingReadBehaviour",
      "com.fasterxml.jackson.core.Base64Variants",
      "com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator",
      "com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator$Base",
      "com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator",
      "com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy$Provider",
      "com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy$Provider",
      "com.fasterxml.jackson.databind.ObjectMapper",
      "com.fasterxml.jackson.core.TokenStreamFactory",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
      "com.fasterxml.jackson.core.io.CharTypes",
      "com.fasterxml.jackson.core.io.JsonStringEncoder",
      "com.fasterxml.jackson.core.io.SerializedString",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter",
      "com.fasterxml.jackson.core.JsonFactory",
      "com.fasterxml.jackson.databind.MappingJsonFactory",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$TableInfo",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer",
      "com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo",
      "com.fasterxml.jackson.databind.jsontype.SubtypeResolver",
      "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver",
      "com.fasterxml.jackson.databind.util.RootNameLookup",
      "com.fasterxml.jackson.databind.introspect.SimpleMixInResolver",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector",
      "com.fasterxml.jackson.databind.introspect.AnnotationCollector$NoAnnotations",
      "com.fasterxml.jackson.databind.introspect.AnnotationCollector",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver",
      "com.fasterxml.jackson.databind.introspect.Annotated",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass$Creators",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass",
      "com.fasterxml.jackson.databind.BeanDescription",
      "com.fasterxml.jackson.databind.introspect.BasicBeanDescription",
      "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector",
      "com.fasterxml.jackson.databind.cfg.ConfigOverrides",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.annotation.JsonInclude$Value",
      "com.fasterxml.jackson.annotation.Nulls",
      "com.fasterxml.jackson.annotation.JsonSetter$Value",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "com.fasterxml.jackson.databind.type.LogicalType",
      "com.fasterxml.jackson.databind.cfg.CoercionConfigs",
      "com.fasterxml.jackson.databind.cfg.CoercionAction",
      "com.fasterxml.jackson.databind.cfg.CoercionInputShape",
      "com.fasterxml.jackson.databind.cfg.CoercionConfig",
      "com.fasterxml.jackson.databind.cfg.MutableCoercionConfig",
      "com.fasterxml.jackson.annotation.JsonFormat$Shape",
      "com.fasterxml.jackson.annotation.JsonFormat$Features",
      "com.fasterxml.jackson.annotation.JsonFormat$Value",
      "com.fasterxml.jackson.databind.cfg.MapperConfig",
      "com.fasterxml.jackson.databind.cfg.ConfigOverride",
      "com.fasterxml.jackson.databind.cfg.ConfigOverride$Empty",
      "com.fasterxml.jackson.databind.MapperFeature",
      "com.fasterxml.jackson.databind.cfg.MapperConfigBase",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter",
      "com.fasterxml.jackson.core.util.DefaultIndenter",
      "com.fasterxml.jackson.core.util.Separators",
      "com.fasterxml.jackson.core.PrettyPrinter",
      "com.fasterxml.jackson.databind.SerializationFeature",
      "com.fasterxml.jackson.databind.SerializationConfig",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl",
      "com.fasterxml.jackson.databind.DeserializationFeature",
      "com.fasterxml.jackson.databind.DeserializationConfig",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.DatabindContext",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "com.fasterxml.jackson.databind.ser.impl.FailingSerializer",
      "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl",
      "com.fasterxml.jackson.databind.ser.std.NullSerializer",
      "com.fasterxml.jackson.databind.ser.SerializerCache",
      "com.fasterxml.jackson.databind.DeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl",
      "com.fasterxml.jackson.databind.deser.DeserializerFactory",
      "com.fasterxml.jackson.databind.PropertyName",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers",
      "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.DeserializerCache",
      "com.fasterxml.jackson.databind.ser.SerializerFactory",
      "com.fasterxml.jackson.databind.ser.std.StdScalarSerializer",
      "com.fasterxml.jackson.databind.ser.std.StringSerializer",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer",
      "com.fasterxml.jackson.core.JsonParser$NumberType",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer",
      "com.fasterxml.jackson.databind.ser.std.BooleanSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.CalendarSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers",
      "com.fasterxml.jackson.databind.ser.std.UUIDSerializer",
      "com.fasterxml.jackson.databind.ser.BasicSerializerFactory",
      "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig",
      "com.fasterxml.jackson.databind.ser.BeanSerializerFactory",
      "com.fasterxml.jackson.databind.Module",
      "com.fasterxml.jackson.databind.module.SimpleModule",
      "com.fasterxml.jackson.datatype.jsr310.JavaTimeModule",
      "com.fasterxml.jackson.core.util.VersionUtil",
      "com.fasterxml.jackson.core.Version",
      "com.fasterxml.jackson.datatype.jsr310.PackageVersion",
      "com.fasterxml.jackson.databind.JsonDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StdDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.JSR310DeserializerBase",
      "com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase",
      "com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer",
      "com.fasterxml.jackson.databind.deser.Deserializers$Base",
      "com.fasterxml.jackson.databind.module.SimpleDeserializers",
      "com.fasterxml.jackson.databind.type.ClassKey",
      "com.fasterxml.jackson.datatype.jsr310.deser.DurationDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.MonthDayDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.OffsetTimeDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.JSR310StringParsableDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.YearDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.YearMonthDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.JSR310SerializerBase",
      "com.fasterxml.jackson.datatype.jsr310.ser.JSR310FormattedSerializerBase",
      "com.fasterxml.jackson.datatype.jsr310.ser.DurationSerializer",
      "com.fasterxml.jackson.databind.ser.Serializers$Base",
      "com.fasterxml.jackson.databind.module.SimpleSerializers",
      "com.fasterxml.jackson.datatype.jsr310.ser.InstantSerializerBase",
      "com.fasterxml.jackson.datatype.jsr310.ser.InstantSerializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.MonthDaySerializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.OffsetTimeSerializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.YearSerializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.YearMonthSerializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.ZoneIdSerializer",
      "com.fasterxml.jackson.datatype.jsr310.ser.key.ZonedDateTimeKeySerializer",
      "com.fasterxml.jackson.databind.KeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.Jsr310KeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.DurationKeyDeserializer",
      "com.fasterxml.jackson.databind.module.SimpleKeyDeserializers",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.InstantKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.LocalDateTimeKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.LocalDateKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.LocalTimeKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.MonthDayKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.OffsetDateTimeKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.OffsetTimeKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.PeriodKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.YearKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.YearMonthKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.ZonedDateTimeKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.ZoneIdKeyDeserializer",
      "com.fasterxml.jackson.datatype.jsr310.deser.key.ZoneOffsetKeyDeserializer",
      "com.fasterxml.jackson.databind.ObjectMapper$1",
      "com.fasterxml.jackson.databind.util.ArrayBuilders",
      "com.fasterxml.jackson.databind.deser.ValueInstantiators$Base",
      "com.fasterxml.jackson.datatype.jsr310.JavaTimeModule$1",
      "alfio.util.Json",
      "com.fasterxml.jackson.databind.type.ClassStack",
      "com.fasterxml.jackson.databind.type.TypeBindings$TypeParamStash",
      "com.fasterxml.jackson.databind.type.TypeBindings$AsKey",
      "com.fasterxml.jackson.databind.type.MapLikeType",
      "com.fasterxml.jackson.databind.type.MapType",
      "com.fasterxml.jackson.core.io.IOContext",
      "com.fasterxml.jackson.core.util.BufferRecyclers",
      "com.fasterxml.jackson.core.util.BufferRecycler",
      "com.fasterxml.jackson.core.StreamReadCapability",
      "com.fasterxml.jackson.core.util.JacksonFeatureSet",
      "com.fasterxml.jackson.core.JsonParser",
      "com.fasterxml.jackson.core.base.ParserMinimalBase",
      "com.fasterxml.jackson.core.base.ParserBase",
      "com.fasterxml.jackson.core.json.ReaderBasedJsonParser",
      "com.fasterxml.jackson.core.util.TextBuffer",
      "com.fasterxml.jackson.core.JsonStreamContext",
      "com.fasterxml.jackson.core.json.JsonReadContext",
      "com.fasterxml.jackson.core.JsonToken",
      "com.fasterxml.jackson.core.JacksonException",
      "com.fasterxml.jackson.core.JsonProcessingException",
      "com.fasterxml.jackson.core.exc.StreamReadException",
      "com.fasterxml.jackson.core.JsonParseException",
      "com.fasterxml.jackson.core.JsonLocation",
      "com.fasterxml.jackson.databind.introspect.AnnotationCollector$EmptyCollector",
      "com.fasterxml.jackson.databind.util.ArrayIterator",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$ContainerDefaultMappings",
      "com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators",
      "com.fasterxml.jackson.databind.deser.ValueInstantiator",
      "com.fasterxml.jackson.databind.deser.ValueInstantiator$Base",
      "com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$LinkedHashMapInstantiator",
      "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase",
      "com.fasterxml.jackson.databind.deser.std.MapDeserializer",
      "com.fasterxml.jackson.databind.util.AccessPattern",
      "com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider",
      "com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value",
      "com.fasterxml.jackson.databind.util.IgnorePropertiesUtil",
      "com.fasterxml.jackson.annotation.JsonIncludeProperties$Value",
      "com.fasterxml.jackson.databind.util.LinkedNode",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD",
      "com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy",
      "com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy",
      "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector",
      "com.fasterxml.jackson.databind.ext.Java7HandlersImpl",
      "com.fasterxml.jackson.databind.ext.Java7Handlers",
      "com.fasterxml.jackson.databind.ext.OptionalHandlerFactory",
      "com.fasterxml.jackson.databind.deser.std.FromStringDeserializer",
      "com.fasterxml.jackson.databind.deser.std.JdkDeserializers",
      "com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator",
      "com.fasterxml.jackson.databind.util.BeanUtil",
      "com.fasterxml.jackson.databind.cfg.ConstructorDetector$SingleArgConstructor",
      "com.fasterxml.jackson.databind.cfg.ConstructorDetector",
      "com.fasterxml.jackson.databind.deser.impl.CreatorCollector",
      "com.fasterxml.jackson.databind.introspect.CollectorBase",
      "com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector",
      "com.fasterxml.jackson.databind.introspect.TypeResolutionContext$Basic",
      "com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector$FieldBuilder",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMember",
      "com.fasterxml.jackson.databind.introspect.AnnotatedField",
      "com.fasterxml.jackson.databind.introspect.AnnotationMap",
      "com.fasterxml.jackson.core.util.InternCache",
      "com.fasterxml.jackson.annotation.PropertyAccessor",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$1",
      "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition",
      "com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty",
      "com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty$Type",
      "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder",
      "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector",
      "com.fasterxml.jackson.databind.introspect.MemberKey",
      "com.fasterxml.jackson.databind.introspect.AnnotationCollector$OneCollector",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector$MethodBuilder",
      "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMethod",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap",
      "com.fasterxml.jackson.databind.introspect.AnnotatedCreatorCollector",
      "com.fasterxml.jackson.databind.util.ClassUtil$Ctor",
      "com.fasterxml.jackson.annotation.JsonProperty$Access",
      "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor",
      "com.fasterxml.jackson.annotation.JsonCreator$Mode",
      "com.fasterxml.jackson.databind.introspect.AnnotatedParameter",
      "com.fasterxml.jackson.databind.type.CollectionLikeType",
      "com.fasterxml.jackson.databind.type.CollectionType",
      "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$5",
      "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$6",
      "com.fasterxml.jackson.databind.PropertyMetadata",
      "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$MemberIterator",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$CreatorCollectionState",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$1",
      "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate",
      "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate$Param",
      "com.fasterxml.jackson.databind.BeanProperty$Std",
      "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase",
      "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer",
      "com.fasterxml.jackson.databind.deser.SettableBeanProperty",
      "com.fasterxml.jackson.databind.deser.CreatorProperty",
      "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder",
      "com.fasterxml.jackson.databind.deser.impl.FieldProperty",
      "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$2",
      "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$4",
      "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$1",
      "com.fasterxml.jackson.annotation.JsonFormat$Feature",
      "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerBase",
      "com.fasterxml.jackson.databind.deser.BeanDeserializer",
      "com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators$ArrayListInstantiator",
      "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StringDeserializer",
      "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator",
      "com.fasterxml.jackson.databind.cfg.CoercionConfigs$1",
      "com.fasterxml.jackson.databind.DeserializationContext$1",
      "com.fasterxml.jackson.databind.JsonMappingException",
      "com.fasterxml.jackson.databind.exc.MismatchedInputException",
      "com.fasterxml.jackson.core.json.JsonReadFeature",
      "com.fasterxml.jackson.core.io.JsonEOFException",
      "com.fasterxml.jackson.databind.deser.std.StdDeserializer$1",
      "com.fasterxml.jackson.databind.exc.InvalidFormatException"
    );
  }
}
