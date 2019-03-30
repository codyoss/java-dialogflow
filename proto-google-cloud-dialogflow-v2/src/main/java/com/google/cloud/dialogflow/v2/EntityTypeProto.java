// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/entity_type.proto

package com.google.cloud.dialogflow.v2;

public final class EntityTypeProto {
  private EntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EntityType_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EntityType_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchCreateEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchCreateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchUpdateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/dialogflow/v2/entity_type"
          + ".proto\022\032google.cloud.dialogflow.v2\032\034goog"
          + "le/api/annotations.proto\032\031google/api/res"
          + "ource.proto\032#google/longrunning/operatio"
          + "ns.proto\032\033google/protobuf/empty.proto\032 g"
          + "oogle/protobuf/field_mask.proto\032\034google/"
          + "protobuf/struct.proto\"\304\003\n\nEntityType\022\014\n\004"
          + "name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\0229\n\004kind"
          + "\030\003 \001(\0162+.google.cloud.dialogflow.v2.Enti"
          + "tyType.Kind\022U\n\023auto_expansion_mode\030\004 \001(\016"
          + "28.google.cloud.dialogflow.v2.EntityType"
          + ".AutoExpansionMode\022?\n\010entities\030\006 \003(\0132-.g"
          + "oogle.cloud.dialogflow.v2.EntityType.Ent"
          + "ity\032)\n\006Entity\022\r\n\005value\030\001 \001(\t\022\020\n\010synonyms"
          + "\030\002 \003(\t\"9\n\004Kind\022\024\n\020KIND_UNSPECIFIED\020\000\022\014\n\010"
          + "KIND_MAP\020\001\022\r\n\tKIND_LIST\020\002\"Y\n\021AutoExpansi"
          + "onMode\022#\n\037AUTO_EXPANSION_MODE_UNSPECIFIE"
          + "D\020\000\022\037\n\033AUTO_EXPANSION_MODE_DEFAULT\020\001\"f\n\026"
          + "ListEntityTypesRequest\022\016\n\006parent\030\001 \001(\t\022\025"
          + "\n\rlanguage_code\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005"
          + "\022\022\n\npage_token\030\004 \001(\t\"p\n\027ListEntityTypesR"
          + "esponse\022<\n\014entity_types\030\001 \003(\0132&.google.c"
          + "loud.dialogflow.v2.EntityType\022\027\n\017next_pa"
          + "ge_token\030\002 \001(\t\";\n\024GetEntityTypeRequest\022\014"
          + "\n\004name\030\001 \001(\t\022\025\n\rlanguage_code\030\002 \001(\t\"}\n\027C"
          + "reateEntityTypeRequest\022\016\n\006parent\030\001 \001(\t\022;"
          + "\n\013entity_type\030\002 \001(\0132&.google.cloud.dialo"
          + "gflow.v2.EntityType\022\025\n\rlanguage_code\030\003 \001"
          + "(\t\"\236\001\n\027UpdateEntityTypeRequest\022;\n\013entity"
          + "_type\030\001 \001(\0132&.google.cloud.dialogflow.v2"
          + ".EntityType\022\025\n\rlanguage_code\030\002 \001(\t\022/\n\013up"
          + "date_mask\030\003 \001(\0132\032.google.protobuf.FieldM"
          + "ask\"\'\n\027DeleteEntityTypeRequest\022\014\n\004name\030\001"
          + " \001(\t\"\376\001\n\035BatchUpdateEntityTypesRequest\022\016"
          + "\n\006parent\030\001 \001(\t\022\037\n\025entity_type_batch_uri\030"
          + "\002 \001(\tH\000\022O\n\030entity_type_batch_inline\030\003 \001("
          + "\0132+.google.cloud.dialogflow.v2.EntityTyp"
          + "eBatchH\000\022\025\n\rlanguage_code\030\004 \001(\t\022/\n\013updat"
          + "e_mask\030\005 \001(\0132\032.google.protobuf.FieldMask"
          + "B\023\n\021entity_type_batch\"^\n\036BatchUpdateEnti"
          + "tyTypesResponse\022<\n\014entity_types\030\001 \003(\0132&."
          + "google.cloud.dialogflow.v2.EntityType\"J\n"
          + "\035BatchDeleteEntityTypesRequest\022\016\n\006parent"
          + "\030\001 \001(\t\022\031\n\021entity_type_names\030\002 \003(\t\"\204\001\n\032Ba"
          + "tchCreateEntitiesRequest\022\016\n\006parent\030\001 \001(\t"
          + "\022?\n\010entities\030\002 \003(\0132-.google.cloud.dialog"
          + "flow.v2.EntityType.Entity\022\025\n\rlanguage_co"
          + "de\030\003 \001(\t\"\265\001\n\032BatchUpdateEntitiesRequest\022"
          + "\016\n\006parent\030\001 \001(\t\022?\n\010entities\030\002 \003(\0132-.goog"
          + "le.cloud.dialogflow.v2.EntityType.Entity"
          + "\022\025\n\rlanguage_code\030\003 \001(\t\022/\n\013update_mask\030\004"
          + " \001(\0132\032.google.protobuf.FieldMask\"Z\n\032Batc"
          + "hDeleteEntitiesRequest\022\016\n\006parent\030\001 \001(\t\022\025"
          + "\n\rentity_values\030\002 \003(\t\022\025\n\rlanguage_code\030\003"
          + " \001(\t\"O\n\017EntityTypeBatch\022<\n\014entity_types\030"
          + "\001 \003(\0132&.google.cloud.dialogflow.v2.Entit"
          + "yType2\203\016\n\013EntityTypes\022\255\001\n\017ListEntityType"
          + "s\0222.google.cloud.dialogflow.v2.ListEntit"
          + "yTypesRequest\0323.google.cloud.dialogflow."
          + "v2.ListEntityTypesResponse\"1\202\323\344\223\002+\022)/v2/"
          + "{parent=projects/*/agent}/entityTypes\022\234\001"
          + "\n\rGetEntityType\0220.google.cloud.dialogflo"
          + "w.v2.GetEntityTypeRequest\032&.google.cloud"
          + ".dialogflow.v2.EntityType\"1\202\323\344\223\002+\022)/v2/{"
          + "name=projects/*/agent/entityTypes/*}\022\257\001\n"
          + "\020CreateEntityType\0223.google.cloud.dialogf"
          + "low.v2.CreateEntityTypeRequest\032&.google."
          + "cloud.dialogflow.v2.EntityType\">\202\323\344\223\0028\")"
          + "/v2/{parent=projects/*/agent}/entityType"
          + "s:\013entity_type\022\273\001\n\020UpdateEntityType\0223.go"
          + "ogle.cloud.dialogflow.v2.UpdateEntityTyp"
          + "eRequest\032&.google.cloud.dialogflow.v2.En"
          + "tityType\"J\202\323\344\223\002D25/v2/{entity_type.name="
          + "projects/*/agent/entityTypes/*}:\013entity_"
          + "type\022\222\001\n\020DeleteEntityType\0223.google.cloud"
          + ".dialogflow.v2.DeleteEntityTypeRequest\032\026"
          + ".google.protobuf.Empty\"1\202\323\344\223\002+*)/v2/{nam"
          + "e=projects/*/agent/entityTypes/*}\022\264\001\n\026Ba"
          + "tchUpdateEntityTypes\0229.google.cloud.dial"
          + "ogflow.v2.BatchUpdateEntityTypesRequest\032"
          + "\035.google.longrunning.Operation\"@\202\323\344\223\002:\"5"
          + "/v2/{parent=projects/*/agent}/entityType"
          + "s:batchUpdate:\001*\022\264\001\n\026BatchDeleteEntityTy"
          + "pes\0229.google.cloud.dialogflow.v2.BatchDe"
          + "leteEntityTypesRequest\032\035.google.longrunn"
          + "ing.Operation\"@\202\323\344\223\002:\"5/v2/{parent=proje"
          + "cts/*/agent}/entityTypes:batchDelete:\001*\022"
          + "\271\001\n\023BatchCreateEntities\0226.google.cloud.d"
          + "ialogflow.v2.BatchCreateEntitiesRequest\032"
          + "\035.google.longrunning.Operation\"K\202\323\344\223\002E\"@"
          + "/v2/{parent=projects/*/agent/entityTypes"
          + "/*}/entities:batchCreate:\001*\022\271\001\n\023BatchUpd"
          + "ateEntities\0226.google.cloud.dialogflow.v2"
          + ".BatchUpdateEntitiesRequest\032\035.google.lon"
          + "grunning.Operation\"K\202\323\344\223\002E\"@/v2/{parent="
          + "projects/*/agent/entityTypes/*}/entities"
          + ":batchUpdate:\001*\022\271\001\n\023BatchDeleteEntities\022"
          + "6.google.cloud.dialogflow.v2.BatchDelete"
          + "EntitiesRequest\032\035.google.longrunning.Ope"
          + "ration\"K\202\323\344\223\002E\"@/v2/{parent=projects/*/a"
          + "gent/entityTypes/*}/entities:batchDelete"
          + ":\001*B\236\001\n\036com.google.cloud.dialogflow.v2B\017"
          + "EntityTypeProtoP\001ZDgoogle.golang.org/gen"
          + "proto/googleapis/cloud/dialogflow/v2;dia"
          + "logflow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflo"
          + "w.V2b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2_EntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_EntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EntityType_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Kind", "AutoExpansionMode", "Entities",
            });
    internal_static_google_cloud_dialogflow_v2_EntityType_Entity_descriptor =
        internal_static_google_cloud_dialogflow_v2_EntityType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_EntityType_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EntityType_Entity_descriptor,
            new java.lang.String[] {
              "Value", "Synonyms",
            });
    internal_static_google_cloud_dialogflow_v2_ListEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ListEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_GetEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_GetEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_CreateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_CreateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityType", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_UpdateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "EntityType", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_DeleteEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "EntityTypeBatchUri",
              "EntityTypeBatchInline",
              "LanguageCode",
              "UpdateMask",
              "EntityTypeBatch",
            });
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes",
            });
    internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityTypeNames",
            });
    internal_static_google_cloud_dialogflow_v2_BatchCreateEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_BatchCreateEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchCreateEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Entities", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_BatchUpdateEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchUpdateEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Entities", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_BatchDeleteEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityValues", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_descriptor,
            new java.lang.String[] {
              "EntityTypes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
