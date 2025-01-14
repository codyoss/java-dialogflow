/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/entity_type.proto

package com.google.cloud.dialogflow.v2beta1;

public final class EntityTypeProto {
  private EntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/dialogflow/v2beta1/entity"
          + "_type.proto\022\037google.cloud.dialogflow.v2b"
          + "eta1\032\034google/api/annotations.proto\032\037goog"
          + "le/api/field_behavior.proto\032\031google/api/"
          + "resource.proto\032#google/longrunning/opera"
          + "tions.proto\032\033google/protobuf/empty.proto"
          + "\032 google/protobuf/field_mask.proto\032\027goog"
          + "le/api/client.proto\"\205\004\n\nEntityType\022\014\n\004na"
          + "me\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022>\n\004kind\030\003"
          + " \001(\01620.google.cloud.dialogflow.v2beta1.E"
          + "ntityType.Kind\022Z\n\023auto_expansion_mode\030\004 "
          + "\001(\0162=.google.cloud.dialogflow.v2beta1.En"
          + "tityType.AutoExpansionMode\022D\n\010entities\030\006"
          + " \003(\01322.google.cloud.dialogflow.v2beta1.E"
          + "ntityType.Entity\022\037\n\027enable_fuzzy_extract"
          + "ion\030\007 \001(\010\032)\n\006Entity\022\r\n\005value\030\001 \001(\t\022\020\n\010sy"
          + "nonyms\030\002 \003(\t\"J\n\004Kind\022\024\n\020KIND_UNSPECIFIED"
          + "\020\000\022\014\n\010KIND_MAP\020\001\022\r\n\tKIND_LIST\020\002\022\017\n\013KIND_"
          + "REGEXP\020\003\"Y\n\021AutoExpansionMode\022#\n\037AUTO_EX"
          + "PANSION_MODE_UNSPECIFIED\020\000\022\037\n\033AUTO_EXPAN"
          + "SION_MODE_DEFAULT\020\001\"f\n\026ListEntityTypesRe"
          + "quest\022\016\n\006parent\030\001 \001(\t\022\025\n\rlanguage_code\030\002"
          + " \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 "
          + "\001(\t\"u\n\027ListEntityTypesResponse\022A\n\014entity"
          + "_types\030\001 \003(\0132+.google.cloud.dialogflow.v"
          + "2beta1.EntityType\022\027\n\017next_page_token\030\002 \001"
          + "(\t\";\n\024GetEntityTypeRequest\022\014\n\004name\030\001 \001(\t"
          + "\022\025\n\rlanguage_code\030\002 \001(\t\"\202\001\n\027CreateEntity"
          + "TypeRequest\022\016\n\006parent\030\001 \001(\t\022@\n\013entity_ty"
          + "pe\030\002 \001(\0132+.google.cloud.dialogflow.v2bet"
          + "a1.EntityType\022\025\n\rlanguage_code\030\003 \001(\t\"\243\001\n"
          + "\027UpdateEntityTypeRequest\022@\n\013entity_type\030"
          + "\001 \001(\0132+.google.cloud.dialogflow.v2beta1."
          + "EntityType\022\025\n\rlanguage_code\030\002 \001(\t\022/\n\013upd"
          + "ate_mask\030\003 \001(\0132\032.google.protobuf.FieldMa"
          + "sk\"\'\n\027DeleteEntityTypeRequest\022\014\n\004name\030\001 "
          + "\001(\t\"\203\002\n\035BatchUpdateEntityTypesRequest\022\016\n"
          + "\006parent\030\001 \001(\t\022\037\n\025entity_type_batch_uri\030\002"
          + " \001(\tH\000\022T\n\030entity_type_batch_inline\030\003 \001(\013"
          + "20.google.cloud.dialogflow.v2beta1.Entit"
          + "yTypeBatchH\000\022\025\n\rlanguage_code\030\004 \001(\t\022/\n\013u"
          + "pdate_mask\030\005 \001(\0132\032.google.protobuf.Field"
          + "MaskB\023\n\021entity_type_batch\"c\n\036BatchUpdate"
          + "EntityTypesResponse\022A\n\014entity_types\030\001 \003("
          + "\0132+.google.cloud.dialogflow.v2beta1.Enti"
          + "tyType\"J\n\035BatchDeleteEntityTypesRequest\022"
          + "\016\n\006parent\030\001 \001(\t\022\031\n\021entity_type_names\030\002 \003"
          + "(\t\"\211\001\n\032BatchCreateEntitiesRequest\022\016\n\006par"
          + "ent\030\001 \001(\t\022D\n\010entities\030\002 \003(\01322.google.clo"
          + "ud.dialogflow.v2beta1.EntityType.Entity\022"
          + "\025\n\rlanguage_code\030\003 \001(\t\"\272\001\n\032BatchUpdateEn"
          + "titiesRequest\022\016\n\006parent\030\001 \001(\t\022D\n\010entitie"
          + "s\030\002 \003(\01322.google.cloud.dialogflow.v2beta"
          + "1.EntityType.Entity\022\025\n\rlanguage_code\030\003 \001"
          + "(\t\022/\n\013update_mask\030\004 \001(\0132\032.google.protobu"
          + "f.FieldMask\"Z\n\032BatchDeleteEntitiesReques"
          + "t\022\016\n\006parent\030\001 \001(\t\022\025\n\rentity_values\030\002 \003(\t"
          + "\022\025\n\rlanguage_code\030\003 \001(\t\"T\n\017EntityTypeBat"
          + "ch\022A\n\014entity_types\030\001 \003(\0132+.google.cloud."
          + "dialogflow.v2beta1.EntityType2\201\026\n\013Entity"
          + "Types\022\372\001\n\017ListEntityTypes\0227.google.cloud"
          + ".dialogflow.v2beta1.ListEntityTypesReque"
          + "st\0328.google.cloud.dialogflow.v2beta1.Lis"
          + "tEntityTypesResponse\"t\202\323\344\223\002n\022./v2beta1/{"
          + "parent=projects/*/agent}/entityTypesZ<\022:"
          + "/v2beta1/{parent=projects/*/locations/*/"
          + "agent}/entityTypes\022\351\001\n\rGetEntityType\0225.g"
          + "oogle.cloud.dialogflow.v2beta1.GetEntity"
          + "TypeRequest\032+.google.cloud.dialogflow.v2"
          + "beta1.EntityType\"t\202\323\344\223\002n\022./v2beta1/{name"
          + "=projects/*/agent/entityTypes/*}Z<\022:/v2b"
          + "eta1/{name=projects/*/locations/*/agent/"
          + "entityTypes/*}\022\213\002\n\020CreateEntityType\0228.go"
          + "ogle.cloud.dialogflow.v2beta1.CreateEnti"
          + "tyTypeRequest\032+.google.cloud.dialogflow."
          + "v2beta1.EntityType\"\217\001\202\323\344\223\002\210\001\"./v2beta1/{"
          + "parent=projects/*/agent}/entityTypes:\013en"
          + "tity_typeZI\":/v2beta1/{parent=projects/*"
          + "/locations/*/agent}/entityTypes:\013entity_"
          + "type\022\243\002\n\020UpdateEntityType\0228.google.cloud"
          + ".dialogflow.v2beta1.UpdateEntityTypeRequ"
          + "est\032+.google.cloud.dialogflow.v2beta1.En"
          + "tityType\"\247\001\202\323\344\223\002\240\0012:/v2beta1/{entity_typ"
          + "e.name=projects/*/agent/entityTypes/*}:\013"
          + "entity_typeZU2F/v2beta1/{entity_type.nam"
          + "e=projects/*/locations/*/agent/entityTyp"
          + "es/*}:\013entity_type\022\332\001\n\020DeleteEntityType\022"
          + "8.google.cloud.dialogflow.v2beta1.Delete"
          + "EntityTypeRequest\032\026.google.protobuf.Empt"
          + "y\"t\202\323\344\223\002n*./v2beta1/{name=projects/*/age"
          + "nt/entityTypes/*}Z<*:/v2beta1/{name=proj"
          + "ects/*/locations/*/agent/entityTypes/*}\022"
          + "\215\002\n\026BatchUpdateEntityTypes\022>.google.clou"
          + "d.dialogflow.v2beta1.BatchUpdateEntityTy"
          + "pesRequest\032\035.google.longrunning.Operatio"
          + "n\"\223\001\202\323\344\223\002\214\001\":/v2beta1/{parent=projects/*"
          + "/agent}/entityTypes:batchUpdate:\001*ZK\"F/v"
          + "2beta1/{parent=projects/*/locations/*/ag"
          + "ent}/entityTypes:batchUpdate:\001*\022\215\002\n\026Batc"
          + "hDeleteEntityTypes\022>.google.cloud.dialog"
          + "flow.v2beta1.BatchDeleteEntityTypesReque"
          + "st\032\035.google.longrunning.Operation\"\223\001\202\323\344\223"
          + "\002\214\001\":/v2beta1/{parent=projects/*/agent}/"
          + "entityTypes:batchDelete:\001*ZK\"F/v2beta1/{"
          + "parent=projects/*/locations/*/agent}/ent"
          + "ityTypes:batchDelete:\001*\022\235\002\n\023BatchCreateE"
          + "ntities\022;.google.cloud.dialogflow.v2beta"
          + "1.BatchCreateEntitiesRequest\032\035.google.lo"
          + "ngrunning.Operation\"\251\001\202\323\344\223\002\242\001\"E/v2beta1/"
          + "{parent=projects/*/agent/entityTypes/*}/"
          + "entities:batchCreate:\001*ZV\"Q/v2beta1/{par"
          + "ent=projects/*/locations/*/agent/entityT"
          + "ypes/*}/entities:batchCreate:\001*\022\235\002\n\023Batc"
          + "hUpdateEntities\022;.google.cloud.dialogflo"
          + "w.v2beta1.BatchUpdateEntitiesRequest\032\035.g"
          + "oogle.longrunning.Operation\"\251\001\202\323\344\223\002\242\001\"E/"
          + "v2beta1/{parent=projects/*/agent/entityT"
          + "ypes/*}/entities:batchUpdate:\001*ZV\"Q/v2be"
          + "ta1/{parent=projects/*/locations/*/agent"
          + "/entityTypes/*}/entities:batchUpdate:\001*\022"
          + "\235\002\n\023BatchDeleteEntities\022;.google.cloud.d"
          + "ialogflow.v2beta1.BatchDeleteEntitiesReq"
          + "uest\032\035.google.longrunning.Operation\"\251\001\202\323"
          + "\344\223\002\242\001\"E/v2beta1/{parent=projects/*/agent"
          + "/entityTypes/*}/entities:batchDelete:\001*Z"
          + "V\"Q/v2beta1/{parent=projects/*/locations"
          + "/*/agent/entityTypes/*}/entities:batchDe"
          + "lete:\001*\032x\312A\031dialogflow.googleapis.com\322AY"
          + "https://www.googleapis.com/auth/cloud-pl"
          + "atform,https://www.googleapis.com/auth/d"
          + "ialogflowB\255\001\n#com.google.cloud.dialogflo"
          + "w.v2beta1B\017EntityTypeProtoP\001ZIgoogle.gol"
          + "ang.org/genproto/googleapis/cloud/dialog"
          + "flow/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google"
          + ".Cloud.Dialogflow.V2beta1b\006proto3"
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
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Kind",
              "AutoExpansionMode",
              "Entities",
              "EnableFuzzyExtraction",
            });
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_EntityType_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EntityType_Entity_descriptor,
            new java.lang.String[] {
              "Value", "Synonyms",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_CreateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityType", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_UpdateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "EntityType", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DeleteEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "EntityTypeBatchUri",
              "EntityTypeBatchInline",
              "LanguageCode",
              "UpdateMask",
              "EntityTypeBatch",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityTypeNames",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchCreateEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Entities", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchUpdateEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Entities", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_BatchDeleteEntitiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityValues", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EntityTypeBatch_descriptor,
            new java.lang.String[] {
              "EntityTypes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
